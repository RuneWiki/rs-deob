import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class62 {
   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field794 = new String[]{method560(method559(";Zw+")), method560(method559("3Dzi\u0018}")), method560(method559(".\u00015i&")), method560(method559("3Dzi\u001f}")), method560(method559("3Dzi\u0019}")), method560(method559("3Dzi\u001a}"))};
   @OriginalMember(
      owner = "client!fka",
      name = "g",
      descriptor = "S"
   )
   public static short field793 = 256;
   @OriginalMember(
      owner = "client!fka",
      name = "d",
      descriptor = "I"
   )
   public static int field787;
   @OriginalMember(
      owner = "client!fka",
      name = "f",
      descriptor = "I"
   )
   public static int field788;
   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "I"
   )
   public static int field789;
   @OriginalMember(
      owner = "client!fka",
      name = "e",
      descriptor = "I"
   )
   public static int field790;
   @OriginalMember(
      owner = "client!fka",
      name = "c",
      descriptor = "I"
   )
   public static int field791;
   @OriginalMember(
      owner = "client!fka",
      name = "b",
      descriptor = "[B"
   )
   public static byte[] field792;

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(IIZI)I"
   )
   public static final int method555(int arg0, int arg1, boolean arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field787;
         class657 var5 = class733.method5295(arg1, arg2, (byte)58);
         if (var5 == null) {
            return 0;
         } else if (arg3 == -1) {
            return 0;
         } else {
            int var6 = 0;
            int var7 = arg0;
            int var10000;
            if (var4) {
               var10000 = ~arg3;
            } else if (var5.field9799.length <= arg0) {
               var10000 = var6;
               if (!var4) {
                  return var6;
               }
            } else {
               var10000 = ~arg3;
            }

            while(true) {
               if (var10000 == ~var5.field9798[var7]) {
                  var6 += var5.field9799[var7];
               }

               ++var7;
               if (var5.field9799.length <= var7) {
                  var10000 = var6;
                  if (!var4) {
                     return var6;
                  }
               } else {
                  var10000 = ~arg3;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field794[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(IIILha;III)Lka;"
   )
   public static final class232 method556(int arg0, int arg1, int arg2, class479 arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg5 != 16270) {
            field791 = -62;
         }

         ++field790;
         long var7 = (long)arg6;
         class232 var9 = (class232)class254.field3204.method3192(var7, (byte)-112);
         short var10 = 2055;
         if (var9 == null) {
            class167 var11 = class745.method5399(64, class559.field8185, arg6, 0);
            if (var11 == null) {
               return null;
            }

            if (var11.field2153 < 13) {
               var11.method1454(2, -96);
            }

            var9 = arg3.method494(var11, var10, class563.field8274, 64, 768);
            class254.field3204.method3190(var9, var7, 8);
         }

         class232 var12 = var9.method1256((byte)2, var10, true);
         if (~arg4 != -1) {
            var12.method1260(arg4);
         }

         if (~arg1 != -1) {
            var12.method1224(arg1);
         }

         if (~arg2 != -1) {
            var12.method1289(arg2);
         }

         if (~arg0 != -1) {
            var12.method1279(0, arg0, 0);
         }

         return var12;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field794[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field794[2] : field794[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method557(int arg0) {
      try {
         if (arg0 >= -14) {
            field792 = null;
         }

         field792 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field794[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method558(int arg0, int arg1) {
      try {
         ++field789;
         if (arg1 > -118) {
            field792 = null;
         }

         return arg0 == 0 || arg0 == 2;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field794[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method559(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method560(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
