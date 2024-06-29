import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class272 extends class591 {
   @OriginalMember(
      owner = "client!rm",
      name = "L",
      descriptor = "Z"
   )
   private boolean field3482 = false;
   @OriginalMember(
      owner = "client!rm",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3484 = new String[]{method2160(method2159("\u0017\u0006A_@S\u0014XKV\u0019ID_U\r\u000bRZ\u0016.\bBL[\u0018#VJY1\u000eY[")), method2160(method2159("\u000e\bBP\\\u0010\u0006O"))};
   @OriginalMember(
      owner = "client!rm",
      name = "H",
      descriptor = "I"
   )
   private int field3479;
   @OriginalMember(
      owner = "client!rm",
      name = "K",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field3483;
   @OriginalMember(
      owner = "client!rm",
      name = "M",
      descriptor = "Ljavax/sound/sampled/AudioFormat;"
   )
   private AudioFormat field3481;
   @OriginalMember(
      owner = "client!rm",
      name = "I",
      descriptor = "Ljavax/sound/sampled/SourceDataLine;"
   )
   private SourceDataLine field3480;
   @OriginalMember(
      owner = "client!rm",
      name = "J",
      descriptor = "[B"
   )
   private byte[] field3478;

   @OriginalMember(
      owner = "client!rm",
      name = "c",
      descriptor = "()V"
   )
   public final void method891() {
      int var1 = 256;
      if (class243.field3061) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field8712[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field3478[var2 * 2] = (byte)(var3 >> 8);
         this.field3478[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field3480.write(this.field3478, 0, var1 << 1);
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method895(Component arg0) {
      Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         Info[] var3 = var2;

         for(int var4 = 0; ~var4 > ~var3.length; ++var4) {
            Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && ~var6.toLowerCase().indexOf(field3484[1]) <= -1) {
                  this.field3482 = true;
               }
            }
         }
      }

      this.field3481 = new AudioFormat((float)class36.field514, 16, class243.field3061 ? 2 : 1, true, false);
      this.field3478 = new byte[256 << (class243.field3061 ? 2 : 1)];
   }

   @OriginalMember(
      owner = "client!rm",
      name = "d",
      descriptor = "()V"
   )
   public final void method893() {
      if (this.field3480 != null) {
         this.field3480.close();
         this.field3480 = null;
      }

   }

   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method894(int arg0) throws LineUnavailableException {
      try {
         javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field3483 == null ? (field3483 = method2158(field3484[0])) : field3483, this.field3481, arg0 << (!class243.field3061 ? 1 : 2));
         this.field3480 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field3480.open();
         this.field3480.start();
         this.field3479 = arg0;
      } catch (LineUnavailableException var4) {
         if (1 != class789.method5682((byte)-72, arg0)) {
            this.method894(class109.method978(-1, arg0));
         } else {
            this.field3480 = null;
            throw var4;
         }
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "b",
      descriptor = "()I"
   )
   public final int method889() {
      return this.field3479 - (this.field3480.available() >> (!class243.field3061 ? 1 : 2));
   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "()V"
   )
   public final void method890() throws LineUnavailableException {
      this.field3480.flush();
      if (this.field3482) {
         this.field3480.close();
         this.field3480 = null;
         javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field3483 == null ? (field3483 = method2158(field3484[0])) : field3483, this.field3481, this.field3479 << (class243.field3061 ? 2 : 1));
         this.field3480 = (SourceDataLine)AudioSystem.getLine(var1);
         this.field3480.open();
         this.field3480.start();
      }

   }

   @OriginalMember(
      owner = "client!rm",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2158(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2159(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2160(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
