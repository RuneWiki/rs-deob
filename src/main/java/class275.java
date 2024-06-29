import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class275 {
   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3899 = new String[]{method2166(method2165("5v\u0016\u001dap")), method2166(method2165("5v\u0016\u001dbp")), method2166(method2165("5v\u0016\u001dcp"))};
   @OriginalMember(
      owner = "client!mda",
      name = "b",
      descriptor = "[J"
   )
   public static long[] field3894 = new long[256];
   @OriginalMember(
      owner = "client!mda",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field3895;
   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "D"
   )
   public static double field3898;
   @OriginalMember(
      owner = "client!mda",
      name = "e",
      descriptor = "F"
   )
   public static float field3897;
   @OriginalMember(
      owner = "client!mda",
      name = "f",
      descriptor = "I"
   )
   public static int field3893;
   @OriginalMember(
      owner = "client!mda",
      name = "c",
      descriptor = "I"
   )
   public static int field3896;

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2162(boolean arg0) {
      try {
         field3894 = null;
         field3895 = null;
         if (arg0) {
            field3895 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3899[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method2163(int arg0, byte arg1, int arg2) {
      try {
         ++field3893;
         class531 var3 = class448.field6548[arg2][arg0];
         if (var3 != null) {
            class149.field2394 = var3.field7730;
            class646.field9391 = var3.field7733;
            class656.field9581 = var3.field7739;
         }

         if (arg1 > -110) {
            method2162(false);
         }

         class570.method4236((byte)122);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3899[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(I)Luda;"
   )
   public static final class473 method2164(int arg0) {
      try {
         ++field3896;
         class473 var1 = new class473(518);
         class85.field1395 = new int[4];
         class85.field1395[0] = (int)(9.9999999E7D * Math.random());
         class85.field1395[1] = (int)(9.9999999E7D * Math.random());
         class85.field1395[3] = (int)(Math.random() * 9.9999999E7D);
         class85.field1395[2] = (int)(9.9999999E7D * Math.random());
         var1.method3571(255, 10);
         var1.method3540(class85.field1395[0], 898075920);
         var1.method3540(class85.field1395[1], 898075920);
         int var2 = 75 / ((arg0 - -8) / 46);
         var1.method3540(class85.field1395[2], 898075920);
         var1.method3540(class85.field1395[3], 898075920);
         return var1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3899[0] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -257; ++var0) {
         long var1 = (long)var0;

         for(int var3 = 0; ~var3 > -9; ++var3) {
            if ((1L & var1) != 1L) {
               var1 >>>= 1;
            } else {
               var1 = var1 >>> 1 ^ -3932672073523589310L;
            }
         }

         field3894[var0] = var1;
      }

      field3895 = new int[13];
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2165(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2166(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
