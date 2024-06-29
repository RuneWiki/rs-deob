import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class17 {
   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "I"
   )
   public int field287;
   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field292 = new String[]{method138(method137("_r\u001b7\u0013DH\u000ek\u000eE|R")), method138(method137("_r\u001b7#\u0003")), method138(method137("En\u0016u")), method138(method137("P5T7\u001a")), method138(method137("_r\u001b7$\u0003")), method138(method137("_r\u001b7[Bu\u0013mY\u0003")), method138(method137("_r\u001b7&\u0003")), method138(method137("_r\u001b7%\u0003"))};
   @OriginalMember(
      owner = "client!tia",
      name = "e",
      descriptor = "Lrca;"
   )
   public static class37 field291 = new class37();
   @OriginalMember(
      owner = "client!tia",
      name = "d",
      descriptor = "I"
   )
   public static int field285;
   @OriginalMember(
      owner = "client!tia",
      name = "b",
      descriptor = "I"
   )
   public static int field286;
   @OriginalMember(
      owner = "client!tia",
      name = "g",
      descriptor = "I"
   )
   public static int field288;
   @OriginalMember(
      owner = "client!tia",
      name = "c",
      descriptor = "I"
   )
   public static int field289;
   @OriginalMember(
      owner = "client!tia",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field290;

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method133(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var7 = arg2 << 3;
         int var6 = arg1 << 3;
         if (arg0 != -48) {
            field290 = null;
         }

         int var8 = arg3 << 3;
         ++field289;
         class623.field9202 = (float)var6;
         class250.field3162 = (float)var7;
         if (~class784.field11454 == -3) {
            class242.field3054 = var6;
            class653.field9755 = var7;
            class673.field9969 = var8;
         }

         class223.method1783((byte)-128);
         class193.field2447 = true;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field292[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(BLiu;)V"
   )
   public static final void method134(byte arg0, class530 arg1) {
      try {
         ++field288;
         if (arg0 != 90) {
            method135(65);
         }

         if (class75.field991 == null) {
            class47 var2 = new class47();
            byte[] var3 = var2.method352(6743, 16, 128, 128);
            class75.field991 = class176.method1506(var3, false, -67);
         }

         if (class550.field8110 == null) {
            class466 var4 = new class466();
            byte[] var5 = var4.method3546(128, 16, (byte)4, 128);
            class550.field8110 = class176.method1506(var5, false, -20);
         }

         class740 var6 = arg1.field7642;
         if (var6.method5371(35632) && class398.field5478 == null) {
            byte[] var7 = class203.method1682(128, 16, 8, 0.5F, 16.0F, 0.6F, new class663(419684), 4.0F, 118, 4.0F, 128);
            class398.field5478 = class176.method1506(var7, false, -37);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field292[4] + arg0 + ',' + (arg1 != null ? field292[3] : field292[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method135(int arg0) {
      try {
         ++field285;
         if (arg0 != 128) {
            method134((byte)-7, (class530)null);
         }

         if (class226.field2825 != null) {
            class739.method5366(-1);
         } else if (class428.field5822 == -1) {
            class225.method1795(class76.field1009, (byte)57, class130.field1666);
         } else {
            class684.method4976((byte)81);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field292[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class17(int arg0) {
      try {
         this.field287 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field292[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field286;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field292[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method136(int arg0) {
      try {
         if (arg0 != 8) {
            field290 = null;
         }

         field291 = null;
         field290 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field292[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method137(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method138(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
