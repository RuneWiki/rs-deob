import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class546 extends class220 {
   @OriginalMember(
      owner = "client!cb",
      name = "J",
      descriptor = "Z"
   )
   private boolean field8106 = false;
   @OriginalMember(
      owner = "client!cb",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8112 = new String[]{method4047(method4046("} \u0018`R92\u0001tDso\u001d`Gg-\u000be\u0004D.\u001bsIr\u0005\u000fuK[(\u0000d")), method4047(method4046("d.\u001boNz \u0016"))};
   @OriginalMember(
      owner = "client!cb",
      name = "L",
      descriptor = "I"
   )
   private int field8107;
   @OriginalMember(
      owner = "client!cb",
      name = "M",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8111;
   @OriginalMember(
      owner = "client!cb",
      name = "I",
      descriptor = "Ljavax/sound/sampled/AudioFormat;"
   )
   private AudioFormat field8109;
   @OriginalMember(
      owner = "client!cb",
      name = "K",
      descriptor = "Ljavax/sound/sampled/SourceDataLine;"
   )
   private SourceDataLine field8110;
   @OriginalMember(
      owner = "client!cb",
      name = "H",
      descriptor = "[B"
   )
   private byte[] field8108;

   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "()V",
      line = 12
   )
   public final void method1676() {
      int var1 = 256;
      if (class532.field7780) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field2800[var2];
         if ((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field8108[var2 * 2] = (byte)(var3 >> 8);
         this.field8108[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field8110.write(this.field8108, 0, var1 << 1);
   }

   @OriginalMember(
      owner = "client!cb",
      name = "d",
      descriptor = "()I",
      line = 50
   )
   public final int method1667() {
      return this.field8107 - (this.field8110.available() >> (class532.field7780 ? 2 : 1));
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(Ljava/awt/Component;)V",
      line = 58
   )
   public final void method1669(Component arg0) {
      Info[] var2 = AudioSystem.getMixerInfo();
      if (var2 != null) {
         Info[] var3 = var2;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            Info var5 = var3[var4];
            if (var5 != null) {
               String var6 = var5.getName();
               if (var6 != null && var6.toLowerCase().indexOf(field8112[1]) >= 0) {
                  this.field8106 = true;
               }
            }
         }
      }

      this.field8109 = new AudioFormat((float)class335.field4787, 16, !class532.field7780 ? 1 : 2, true, false);
      this.field8108 = new byte[256 << (!class532.field7780 ? 1 : 2)];
   }

   @OriginalMember(
      owner = "client!cb",
      name = "b",
      descriptor = "(I)V",
      line = 100
   )
   public final void method1668(int arg0) throws LineUnavailableException {
      try {
         javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field8111 == null ? (field8111 = method4045(field8112[0])) : field8111, this.field8109, arg0 << (class532.field7780 ? 2 : 1));
         this.field8110 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field8110.open();
         this.field8110.start();
         this.field8107 = arg0;
      } catch (LineUnavailableException var4) {
         if (1 != class108.method931(arg0, false)) {
            this.method1668(class7.method63(arg0, false));
         } else {
            this.field8110 = null;
            throw var4;
         }
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 100
   )
   public static Class method4045(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!cb",
      name = "c",
      descriptor = "()V",
      line = 121
   )
   public final void method1674() throws LineUnavailableException {
      this.field8110.flush();
      if (this.field8106) {
         this.field8110.close();
         this.field8110 = null;
         javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field8111 == null ? (field8111 = method4045(field8112[0])) : field8111, this.field8109, this.field8107 << (!class532.field7780 ? 1 : 2));
         this.field8110 = (SourceDataLine)AudioSystem.getLine(var1);
         this.field8110.open();
         this.field8110.start();
      }

   }

   @OriginalMember(
      owner = "client!cb",
      name = "a",
      descriptor = "()V",
      line = 143
   )
   public final void method1661() {
      if (this.field8110 != null) {
         this.field8110.close();
         this.field8110 = null;
      }

   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4046(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4047(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
