import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class202 extends class197 {
   @OriginalMember(
      owner = "client!vp",
      name = "I",
      descriptor = "Z"
   )
   private boolean field2878 = false;
   @OriginalMember(
      owner = "client!vp",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2880 = new String[]{method1600(method1599("h\u0005)A7v\u000b$")), method1600(method1599("q\u000b*N+5\u00193Z=\u007fD/N>k\u00069K}H\u0005)]0~.=[2W\u00032J"))};
   @OriginalMember(
      owner = "client!vp",
      name = "K",
      descriptor = "I"
   )
   private int field2874;
   @OriginalMember(
      owner = "client!vp",
      name = "J",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field2879;
   @OriginalMember(
      owner = "client!vp",
      name = "H",
      descriptor = "Ljavax/sound/sampled/AudioFormat;"
   )
   private AudioFormat field2876;
   @OriginalMember(
      owner = "client!vp",
      name = "F",
      descriptor = "Ljavax/sound/sampled/SourceDataLine;"
   )
   private SourceDataLine field2875;
   @OriginalMember(
      owner = "client!vp",
      name = "G",
      descriptor = "[B"
   )
   private byte[] field2877;

   @OriginalMember(
      owner = "client!vp",
      name = "c",
      descriptor = "()I"
   )
   public final int method1552() {
      return this.field2874 - (this.field2875.available() >> (!class65.field790 ? 1 : 2));
   }

   @OriginalMember(
      owner = "client!vp",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1550(int arg0) throws LineUnavailableException {
      try {
         Info var2 = new Info(field2879 == null ? (field2879 = method1598(field2880[1])) : field2879, this.field2876, arg0 << (class65.field790 ? 2 : 1));
         this.field2875 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field2875.open();
         this.field2875.start();
         this.field2874 = arg0;
      } catch (LineUnavailableException var4) {
         if (class547.method3926(2, arg0) == 1) {
            this.field2875 = null;
            throw var4;
         } else {
            this.method1550(class350.method2552(false, arg0));
         }
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "b",
      descriptor = "()V"
   )
   public final void method1543() {
      int var1 = 256;
      if (class65.field790) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field2778[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field2877[var2 * 2] = (byte)(var3 >> 8);
         this.field2877[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field2875.write(this.field2877, 0, var1 << 1);
   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method1540(Component arg0) {
      javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         javax.sound.sampled.Mixer.Info[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            javax.sound.sampled.Mixer.Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && -1 >= ~var6.toLowerCase().indexOf(field2880[0])) {
                  this.field2878 = true;
               }
            }
         }
      }

      this.field2876 = new AudioFormat((float)class83.field1082, 16, class65.field790 ? 2 : 1, true, false);
      this.field2877 = new byte[256 << (class65.field790 ? 2 : 1)];
   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "()V"
   )
   public final void method1545() {
      if (this.field2875 != null) {
         this.field2875.close();
         this.field2875 = null;
      }

   }

   @OriginalMember(
      owner = "client!vp",
      name = "d",
      descriptor = "()V"
   )
   public final void method1549() throws LineUnavailableException {
      this.field2875.flush();
      if (this.field2878) {
         this.field2875.close();
         this.field2875 = null;
         Info var1 = new Info(field2879 == null ? (field2879 = method1598(field2880[1])) : field2879, this.field2876, this.field2874 << (!class65.field790 ? 1 : 2));
         this.field2875 = (SourceDataLine)AudioSystem.getLine(var1);
         this.field2875.open();
         this.field2875.start();
      }

   }

   @OriginalMember(
      owner = "client!vp",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1598(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1599(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1600(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
