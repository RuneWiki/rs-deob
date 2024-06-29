import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class67 extends class176 {
   @OriginalMember(
      owner = "client!bd",
      name = "K",
      descriptor = "Z"
   )
   private boolean field1228 = false;
   @OriginalMember(
      owner = "client!bd",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1234 = new String[]{method735(method734("b560$&'/$2lz301x8%5r[;5#?m\u0010!%=D=.4")), method735(method734("{;5?8e58"))};
   @OriginalMember(
      owner = "client!bd",
      name = "H",
      descriptor = "I"
   )
   private int field1232;
   @OriginalMember(
      owner = "client!bd",
      name = "F",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1233;
   @OriginalMember(
      owner = "client!bd",
      name = "J",
      descriptor = "Ljavax/sound/sampled/AudioFormat;"
   )
   private AudioFormat field1231;
   @OriginalMember(
      owner = "client!bd",
      name = "I",
      descriptor = "Ljavax/sound/sampled/SourceDataLine;"
   )
   private SourceDataLine field1229;
   @OriginalMember(
      owner = "client!bd",
      name = "G",
      descriptor = "[B"
   )
   private byte[] field1230;

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "()V"
   )
   public final void method727() {
      if (this.field1229 != null) {
         this.field1229.close();
         this.field1229 = null;
      }

   }

   @OriginalMember(
      owner = "client!bd",
      name = "b",
      descriptor = "()V"
   )
   public final void method728() throws LineUnavailableException {
      this.field1229.flush();
      if (this.field1228) {
         this.field1229.close();
         this.field1229 = null;
         Info var1 = new Info(field1233 == null ? (field1233 = method733(field1234[0])) : field1233, this.field1231, this.field1232 << (class483.field7024 ? 2 : 1));
         this.field1229 = (SourceDataLine)AudioSystem.getLine(var1);
         this.field1229.open();
         this.field1229.start();
      }

   }

   @OriginalMember(
      owner = "client!bd",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method729(int arg0) throws LineUnavailableException {
      try {
         Info var2 = new Info(field1233 == null ? (field1233 = method733(field1234[0])) : field1233, this.field1231, arg0 << (!class483.field7024 ? 1 : 2));
         this.field1229 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field1229.open();
         this.field1229.start();
         this.field1232 = arg0;
      } catch (LineUnavailableException var4) {
         if (1 != class208.method1770(arg0, 102)) {
            this.method729(class71.method752(arg0, true));
         } else {
            this.field1229 = null;
            throw var4;
         }
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "d",
      descriptor = "()I"
   )
   public final int method730() {
      return this.field1232 - (this.field1229.available() >> (!class483.field7024 ? 1 : 2));
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public final void method731(Component arg0) {
      javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         javax.sound.sampled.Mixer.Info[] var3 = var2;

         for(int var4 = 0; ~var4 > ~var3.length; ++var4) {
            javax.sound.sampled.Mixer.Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && ~var6.toLowerCase().indexOf(field1234[1]) <= -1) {
                  this.field1228 = true;
               }
            }
         }
      }

      this.field1231 = new AudioFormat((float)class755.field10967, 16, class483.field7024 ? 2 : 1, true, false);
      this.field1230 = new byte[256 << (class483.field7024 ? 2 : 1)];
   }

   @OriginalMember(
      owner = "client!bd",
      name = "c",
      descriptor = "()V"
   )
   public final void method732() {
      int var1 = 256;
      if (class483.field7024) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field2702[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field1230[var2 * 2] = (byte)(var3 >> 8);
         this.field1230[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field1229.write(this.field1230, 0, var1 << 1);
   }

   @OriginalMember(
      owner = "client!bd",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method733(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method734(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method735(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
