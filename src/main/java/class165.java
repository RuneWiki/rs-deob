import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class165 extends class347 {
   @OriginalMember(
      owner = "client!g",
      name = "q",
      descriptor = "J"
   )
   public long field2068;
   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2079 = new String[]{method1346(method1345("'_{\u000e")), method1346(method1345("'_}\u000e")), method1346(method1345("'_z\u000e")), method1346(method1345("'_y\u000e")), method1346(method1345("'_\u0004Oo)\u0005\u0006\u000e")), method1346(method1345("'_|\u000e"))};
   @OriginalMember(
      owner = "client!g",
      name = "l",
      descriptor = "Lsda;"
   )
   public static class269 field2071 = new class269(77, 18);
   @OriginalMember(
      owner = "client!g",
      name = "j",
      descriptor = "Ldw;"
   )
   public static class748 field2073 = new class748(4);
   @OriginalMember(
      owner = "client!g",
      name = "k",
      descriptor = "I"
   )
   public static int field2078 = 0;
   @OriginalMember(
      owner = "client!g",
      name = "r",
      descriptor = "D"
   )
   public static double field2072;
   @OriginalMember(
      owner = "client!g",
      name = "m",
      descriptor = "F"
   )
   public static float field2077;
   @OriginalMember(
      owner = "client!g",
      name = "i",
      descriptor = "I"
   )
   public static int field2069;
   @OriginalMember(
      owner = "client!g",
      name = "s",
      descriptor = "I"
   )
   public static int field2070;
   @OriginalMember(
      owner = "client!g",
      name = "n",
      descriptor = "I"
   )
   public static int field2074;
   @OriginalMember(
      owner = "client!g",
      name = "p",
      descriptor = "I"
   )
   public static int field2076;
   @OriginalMember(
      owner = "client!g",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field2075;

   @OriginalMember(
      owner = "client!g",
      name = "<init>",
      descriptor = "()V",
      line = 5
   )
   public class165() {
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(Z)V",
      line = 9
   )
   public static void method1340(boolean arg0) {
      try {
         field2071 = null;
         if (arg0) {
            field2073 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2079[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "b",
      descriptor = "(Z)V",
      line = 20
   )
   public static final void method1341(boolean arg0) {
      try {
         if (class336.field4807 != null) {
            class336.field4807.method1662((byte)-91);
         }

         ++field2069;
         if (arg0) {
            if (class240.field3050 != null) {
               class240.field3050.method1662((byte)-91);
            }
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2079[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "<init>",
      descriptor = "(J)V",
      line = 37
   )
   public class165(long arg0) {
      try {
         this.field2068 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2079[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(IIIII)I",
      line = 45
   )
   public static final int method1342(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2076;
         if (arg2 != 1) {
            method1343(-111, 95, -126);
         }

         int var5 = arg0 & 15;
         int var6 = var5 >= 8 ? arg1 : arg4;
         int var7 = ~var5 <= -5 ? (~var5 != -13 && ~var5 != -15 ? arg3 : arg4) : arg1;
         return ((2 & var5) == 0 ? var7 : -var7) + ((1 & var5) != 0 ? -var6 : var6);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field2079[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "b",
      descriptor = "(III)Z",
      line = 65
   )
   public static final boolean method1343(int arg0, int arg1, int arg2) {
      try {
         ++field2070;
         int var3 = 80 / ((-28 - arg2) / 49);
         return class207.method1580(arg1, -6421, arg0) | (458752 & arg0) != 0 || class401.method3081(false, arg1, arg0);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2079[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(II)Lsaa;",
      line = 79
   )
   public static final class344 method1344(int arg0, int arg1) {
      try {
         ++field2074;
         class344 var2 = (class344)class788.field11462.method5454((long)arg0, 18261);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class260.field3547.method3899(-83, arg0, arg1);
            class344 var4 = new class344();
            if (var3 != null) {
               var4.method2698(new class128(var3), (byte)-77);
            }

            var4.method2702(801638252);
            class788.field11462.method5455(-2049, var4, (long)arg0);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2079[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1345(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1346(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 113;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
