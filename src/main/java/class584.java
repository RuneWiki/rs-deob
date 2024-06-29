import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class584 extends class761 {
   @OriginalMember(
      owner = "client!dk",
      name = "J",
      descriptor = "Z"
   )
   private boolean field8638 = false;
   @OriginalMember(
      owner = "client!dk",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8641 = new String[]{method4370(method4369("_g\u0004WwAi\t")), method4370(method4369("Fi\u0007Xk\u0002{\u001eL}H&\u0002X~\\d\u0014]=\u007fg\u0004KpIL\u0010Mr`a\u001f\\"))};
   @OriginalMember(
      owner = "client!dk",
      name = "L",
      descriptor = "I"
   )
   private int field8637;
   @OriginalMember(
      owner = "client!dk",
      name = "M",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8640;
   @OriginalMember(
      owner = "client!dk",
      name = "H",
      descriptor = "Ljavax/sound/sampled/AudioFormat;"
   )
   private AudioFormat field8636;
   @OriginalMember(
      owner = "client!dk",
      name = "K",
      descriptor = "Ljavax/sound/sampled/SourceDataLine;"
   )
   private SourceDataLine field8635;
   @OriginalMember(
      owner = "client!dk",
      name = "I",
      descriptor = "[B"
   )
   private byte[] field8639;

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method2814(Component arg0) {
      Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         Info[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && ~var6.toLowerCase().indexOf(field8641[0]) <= -1) {
                  this.field8638 = true;
               }
            }
         }
      }

      this.field8636 = new AudioFormat((float)class752.field11155, 16, !class262.field4308 ? 1 : 2, true, false);
      this.field8639 = new byte[256 << (class262.field4308 ? 2 : 1)];
   }

   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "()V"
   )
   public final void method2816() throws LineUnavailableException {
      this.field8635.flush();
      if (this.field8638) {
         this.field8635.close();
         this.field8635 = null;
         javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field8640 == null ? (field8640 = method4368(field8641[1])) : field8640, this.field8636, this.field8637 << (!class262.field4308 ? 1 : 2));
         this.field8635 = (SourceDataLine)AudioSystem.getLine(var1);
         this.field8635.open();
         this.field8635.start();
      }

   }

   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "()V"
   )
   public final void method2812() {
      int var1 = 256;
      if (class262.field4308) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field11250[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field8639[var2 * 2] = (byte)(var3 >> 8);
         this.field8639[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field8635.write(this.field8639, 0, var1 << 1);
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "()I"
   )
   public final int method2818() {
      return this.field8637 - (this.field8635.available() >> (!class262.field4308 ? 1 : 2));
   }

   @OriginalMember(
      owner = "client!dk",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method2817(int arg0) throws LineUnavailableException {
      try {
         javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field8640 == null ? (field8640 = method4368(field8641[1])) : field8640, this.field8636, arg0 << (class262.field4308 ? 2 : 1));
         this.field8635 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field8635.open();
         this.field8635.start();
         this.field8637 = arg0;
      } catch (LineUnavailableException var4) {
         if (~class84.method814(-1, arg0) == -2) {
            this.field8635 = null;
            throw var4;
         } else {
            this.method2817(class510.method3964(arg0, (byte)110));
         }
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "d",
      descriptor = "()V"
   )
   public final void method2813() {
      if (this.field8635 != null) {
         this.field8635.close();
         this.field8635 = null;
      }

   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4368(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
