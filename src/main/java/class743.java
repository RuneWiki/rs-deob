import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class743 extends class785 {
   @OriginalMember(
      owner = "client!bca",
      name = "J",
      descriptor = "Z"
   )
   private boolean field10573 = false;
   @OriginalMember(
      owner = "client!bca",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10579 = new String[]{method5356(method5355("Ln\u0006\u0019d\b|\u001f\rrB!\u0003\u0019qVc\u0015\u001c2u`\u0005\n\u007fCK\u0011\f}jf\u001e\u001d")), method5356(method5355("U`\u0005\u0016xKn\b"))};
   @OriginalMember(
      owner = "client!bca",
      name = "L",
      descriptor = "I"
   )
   private int field10576;
   @OriginalMember(
      owner = "client!bca",
      name = "M",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field10578;
   @OriginalMember(
      owner = "client!bca",
      name = "H",
      descriptor = "Ljavax/sound/sampled/AudioFormat;"
   )
   private AudioFormat field10577;
   @OriginalMember(
      owner = "client!bca",
      name = "I",
      descriptor = "Ljavax/sound/sampled/SourceDataLine;"
   )
   private SourceDataLine field10575;
   @OriginalMember(
      owner = "client!bca",
      name = "K",
      descriptor = "[B"
   )
   private byte[] field10574;

   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "()V"
   )
   public final void method3278() throws LineUnavailableException {
      this.field10575.flush();
      if (this.field10573) {
         this.field10575.close();
         this.field10575 = null;
         Info var1 = new Info(field10578 == null ? (field10578 = method5354(field10579[0])) : field10578, this.field10577, this.field10576 << (!class235.field3645 ? 1 : 2));
         this.field10575 = (SourceDataLine)AudioSystem.getLine(var1);
         this.field10575.open();
         this.field10575.start();
      }

   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method3281(Component arg0) {
      javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         javax.sound.sampled.Mixer.Info[] var3 = var2;

         for(int var4 = 0; ~var4 > ~var3.length; ++var4) {
            javax.sound.sampled.Mixer.Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && -1 >= ~var6.toLowerCase().indexOf(field10579[1])) {
                  this.field10573 = true;
               }
            }
         }
      }

      this.field10577 = new AudioFormat((float)class358.field5291, 16, !class235.field3645 ? 1 : 2, true, false);
      this.field10574 = new byte[256 << (class235.field3645 ? 2 : 1)];
   }

   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "()V"
   )
   public final void method3275() {
      int var1 = 256;
      if (class235.field3645) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field11434[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field10574[var2 * 2] = (byte)(var3 >> 8);
         this.field10574[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field10575.write(this.field10574, 0, var1 << 1);
   }

   @OriginalMember(
      owner = "client!bca",
      name = "d",
      descriptor = "()V"
   )
   public final void method3276() {
      if (this.field10575 != null) {
         this.field10575.close();
         this.field10575 = null;
      }

   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3277(int arg0) throws LineUnavailableException {
      try {
         Info var2 = new Info(field10578 == null ? (field10578 = method5354(field10579[0])) : field10578, this.field10577, arg0 << (!class235.field3645 ? 1 : 2));
         this.field10575 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field10575.open();
         this.field10575.start();
         this.field10576 = arg0;
      } catch (LineUnavailableException var4) {
         if (-2 != ~class767.method5526(arg0, false)) {
            this.method3277(class645.method4694(arg0, (byte)-128));
         } else {
            this.field10575 = null;
            throw var4;
         }
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "()I"
   )
   public final int method3279() {
      return this.field10576 - (this.field10575.available() >> (!class235.field3645 ? 1 : 2));
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5354(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5355(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5356(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
