import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class119 extends class334 implements class758 {
   @OriginalMember(
      owner = "client!rv",
      name = "t",
      descriptor = "I"
   )
   private int field1447;
   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1456 = new String[]{method1001(method1000("}!\u0007\u001d5")), method1001(method1000("}!\u0007\u00155")), method1001(method1000("}!\u0007\u001b5")), method1001(method1000("}!\u0007\u001f5")), method1001(method1000("}!\u0007\u001e5")), method1001(method1000("a\"E;")), method1001(method1000("ty\u0007y`")), method1001(method1000("}!\u0007\u00115")), method1001(method1000("}!\u0007\u001c5")), method1001(method1000("}!\u0007kta>]i5")), method1001(method1000("}!\u0007\u00105")), method1001(method1000("}!\u0007\u00125"))};
   @OriginalMember(
      owner = "client!rv",
      name = "r",
      descriptor = "Lsd;"
   )
   public static class101 field1450 = new class101(32, 3);
   @OriginalMember(
      owner = "client!rv",
      name = "m",
      descriptor = "I"
   )
   public static int field1446;
   @OriginalMember(
      owner = "client!rv",
      name = "q",
      descriptor = "I"
   )
   public static int field1448;
   @OriginalMember(
      owner = "client!rv",
      name = "l",
      descriptor = "I"
   )
   public static int field1449;
   @OriginalMember(
      owner = "client!rv",
      name = "o",
      descriptor = "I"
   )
   public static int field1451;
   @OriginalMember(
      owner = "client!rv",
      name = "u",
      descriptor = "I"
   )
   public static int field1452;
   @OriginalMember(
      owner = "client!rv",
      name = "p",
      descriptor = "I"
   )
   public static int field1453;
   @OriginalMember(
      owner = "client!rv",
      name = "s",
      descriptor = "I"
   )
   public static int field1454;
   @OriginalMember(
      owner = "client!rv",
      name = "n",
      descriptor = "I"
   )
   public static int field1455;

   @OriginalMember(
      owner = "client!rv",
      name = "c",
      descriptor = "(I)I",
      line = 4
   )
   public final int method991(int arg0) {
      try {
         if (arg0 != 1330) {
            field1450 = null;
         }

         ++field1448;
         return super.field4785;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1456[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "b",
      descriptor = "(I)J",
      line = 16
   )
   public final long method992(int arg0) {
      try {
         ++field1455;
         if (arg0 != 30662) {
            method999(-111);
         }

         return 0L;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1456[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "<init>",
      descriptor = "(Lck;I[BIZ)V",
      line = 29
   )
   public class119(class667 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34963, arg2, arg3, arg4);

      try {
         this.field1447 = arg1;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1456[9] + (arg0 != null ? field1456[6] : field1456[5]) + ',' + arg1 + ',' + (arg2 != null ? field1456[6] : field1456[5]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(B)V",
      line = 38
   )
   public static void method993(byte arg0) {
      try {
         if (arg0 > -92) {
            field1450 = null;
         }

         field1450 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1456[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(III)Z",
      line = 49
   )
   public static final boolean method994(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 0) {
            return true;
         } else {
            ++field1452;
            return (arg2 & 1024) != 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1456[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "d",
      descriptor = "(I)V",
      line = 60
   )
   public final void method995(int arg0) {
      try {
         ++field1451;
         if (arg0 != -18582) {
            field1450 = null;
         }

         super.field4783.method4853(-4081, this);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1456[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(I)I",
      line = 76
   )
   public final int method996(int arg0) {
      try {
         ++field1454;
         if (arg0 != 15234) {
            method994(-45, 14, -96);
         }

         return this.field1447;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1456[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "f",
      descriptor = "(I)Z",
      line = 89
   )
   public static final boolean method997(int arg0) {
      try {
         ++field1446;
         if (arg0 != 32) {
            return true;
         } else {
            return class672.field10112 >= 1;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1456[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "a",
      descriptor = "(I[BBI)V",
      line = 104
   )
   public final void method998(int arg0, byte[] arg1, byte arg2, int arg3) {
      try {
         ++field1453;
         if (arg2 >= -81) {
            this.method996(-99);
         }

         this.method2532(arg0, arg1, 3);
         this.field1447 = arg3;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1456[7] + arg0 + ',' + (arg1 != null ? field1456[6] : field1456[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "e",
      descriptor = "(I)V",
      line = 119
   )
   public static final void method999(int arg0) {
      try {
         ++field1449;
         if (method997(32)) {
            if (class784.field11421 == null) {
               class600.method4388(500);
            }

            class248.field3326 = 0;
            class792.field11511 = true;
         }

         if (arg0 >= -100) {
            field1450 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1456[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1000(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1001(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
