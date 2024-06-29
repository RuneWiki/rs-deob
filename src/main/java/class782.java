import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class782 extends class7 {
   @OriginalMember(
      owner = "client!wga",
      name = "M",
      descriptor = "Z"
   )
   private boolean field11437 = false;
   @OriginalMember(
      owner = "client!wga",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11440 = new String[]{method5605(method5604("\u00155q0V\u000b;|")), method5605(method5604("\f;r?JH)k+\\\u0002tw?_\u00166a:\u001c55q,Q\u0003\u001ee*S*3j;"))};
   @OriginalMember(
      owner = "client!wga",
      name = "I",
      descriptor = "I"
   )
   private int field11435;
   @OriginalMember(
      owner = "client!wga",
      name = "K",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11439;
   @OriginalMember(
      owner = "client!wga",
      name = "H",
      descriptor = "Ljavax/sound/sampled/AudioFormat;"
   )
   private AudioFormat field11434;
   @OriginalMember(
      owner = "client!wga",
      name = "L",
      descriptor = "Ljavax/sound/sampled/SourceDataLine;"
   )
   private SourceDataLine field11438;
   @OriginalMember(
      owner = "client!wga",
      name = "J",
      descriptor = "[B"
   )
   private byte[] field11436;

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "()V"
   )
   public final void method48() {
      if (this.field11438 != null) {
         this.field11438.close();
         this.field11438 = null;
      }

   }

   @OriginalMember(
      owner = "client!wga",
      name = "b",
      descriptor = "()I"
   )
   public final int method54() {
      return this.field11435 - (this.field11438.available() >> (!class614.field8578 ? 1 : 2));
   }

   @OriginalMember(
      owner = "client!wga",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method52(int arg0) throws LineUnavailableException {
      try {
         Info var2 = new Info(field11439 == null ? (field11439 = method5603(field11440[1])) : field11439, this.field11434, arg0 << (class614.field8578 ? 2 : 1));
         this.field11438 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field11438.open();
         this.field11438.start();
         this.field11435 = arg0;
      } catch (LineUnavailableException var4) {
         if (class779.method5585((byte)-46, arg0) == 1) {
            this.field11438 = null;
            throw var4;
         } else {
            this.method52(class546.method3944(10, arg0));
         }
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method51(Component arg0) {
      javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         javax.sound.sampled.Mixer.Info[] var3 = var2;

         for(int var4 = 0; ~var3.length < ~var4; ++var4) {
            javax.sound.sampled.Mixer.Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && -1 >= ~var6.toLowerCase().indexOf(field11440[0])) {
                  this.field11437 = true;
               }
            }
         }
      }

      this.field11434 = new AudioFormat((float)class556.field7644, 16, class614.field8578 ? 2 : 1, true, false);
      this.field11436 = new byte[256 << (!class614.field8578 ? 1 : 2)];
   }

   @OriginalMember(
      owner = "client!wga",
      name = "c",
      descriptor = "()V"
   )
   public final void method49() throws LineUnavailableException {
      this.field11438.flush();
      if (this.field11437) {
         this.field11438.close();
         this.field11438 = null;
         Info var1 = new Info(field11439 == null ? (field11439 = method5603(field11440[1])) : field11439, this.field11434, this.field11435 << (!class614.field8578 ? 1 : 2));
         this.field11438 = (SourceDataLine)AudioSystem.getLine(var1);
         this.field11438.open();
         this.field11438.start();
      }

   }

   @OriginalMember(
      owner = "client!wga",
      name = "d",
      descriptor = "()V"
   )
   public final void method57() {
      int var1 = 256;
      if (class614.field8578) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field47[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field11436[var2 * 2] = (byte)(var3 >> 8);
         this.field11436[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field11438.write(this.field11436, 0, var1 << 1);
   }

   @OriginalMember(
      owner = "client!wga",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5603(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5604(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5605(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
