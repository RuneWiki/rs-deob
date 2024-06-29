import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class437 {
   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6256 = new String[]{method3226(method3225("AU_T\u001c")), method3226(method3225("AU_U\u001c")), method3226(method3225("AU_c[~F\u0003~ZJ\u001a")), method3226(method3225("AU_V\u001c")), method3226(method3225("AU_S\u001c"))};
   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "Lek;"
   )
   public static class536 field6249 = new class536(80, -1);
   @OriginalMember(
      owner = "client!lg",
      name = "d",
      descriptor = "Leg;"
   )
   public static class118 field6253 = new class118(126, 7);
   @OriginalMember(
      owner = "client!lg",
      name = "e",
      descriptor = "F"
   )
   public static float field6255;
   @OriginalMember(
      owner = "client!lg",
      name = "g",
      descriptor = "I"
   )
   public static int field6250;
   @OriginalMember(
      owner = "client!lg",
      name = "f",
      descriptor = "I"
   )
   public static int field6251;
   @OriginalMember(
      owner = "client!lg",
      name = "c",
      descriptor = "I"
   )
   public static int field6252;
   @OriginalMember(
      owner = "client!lg",
      name = "b",
      descriptor = "I"
   )
   public static int field6254;

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(II)[I"
   )
   public static final int[] method3221(int arg0, int arg1) {
      try {
         if (arg0 < 89) {
            method3221(78, -93);
         }

         ++field6251;
         int[] var2 = new int[3];
         class111.method907((byte)-82, class228.method1774(false, arg1));
         var2[0] = class176.field2442.get(5);
         var2[1] = class176.field2442.get(2);
         var2[2] = class176.field2442.get(1);
         return var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6256[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3222(int arg0) {
      try {
         field6249 = null;
         field6253 = null;
         if (arg0 != -20205) {
            method3223(false, -24, -107, 42, 1, -83);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6256[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(ZIIIII)V"
   )
   public static final void method3223(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field4360;

      try {
         if (~arg1 > -2) {
            arg1 = 1;
         }

         ++field6250;
         if (~arg4 > -2) {
            arg4 = 1;
         }

         int var7 = arg4 - 334;
         if (arg5 <= 24) {
            method3224(-95, true, -94);
         }

         label62: {
            if (var7 < 0) {
               var7 = 0;
               if (!var6) {
                  break label62;
               }
            }

            if (~var7 < -101) {
               var7 = 100;
            }
         }

         int var8;
         label57: {
            var8 = (class500.field7255 - class418.field6004) * var7 / 100 + class418.field6004;
            if (~var8 > ~class500.field7254) {
               var8 = class500.field7254;
               if (!var6) {
                  break label57;
               }
            }

            if (var8 > class144.field1832) {
               var8 = class144.field1832;
            }
         }

         label52: {
            int var9 = arg4 * var8 * 512 / (arg1 * 334);
            if (var9 < class228.field3218) {
               var9 = class228.field3218;
               var8 = arg1 * var9 * 334 / (arg4 * 512);
               if (~var8 >= ~class144.field1832) {
                  break label52;
               }

               var8 = class144.field1832;
               int var10 = arg4 * var8 * 512 / (var9 * 334);
               int var11 = (-var10 + arg1) / 2;
               if (arg0) {
                  class383.field5543.method574();
                  class383.field5543.method533(-16777216, arg2, arg3, var11, (byte)71, arg4);
                  class383.field5543.method533(-16777216, arg1 + arg2 - var11, arg3, var11, (byte)124, arg4);
               }

               arg2 += var11;
               arg1 -= var11 * 2;
               if (!var6) {
                  break label52;
               }
            }

            if (class525.field7530 < var9) {
               short var12 = class525.field7530;
               var8 = var12 * 334 * arg1 / (arg4 * 512);
               if (~class500.field7254 < ~var8) {
                  var8 = class500.field7254;
                  int var13 = arg1 * var12 * 334 / (var8 * 512);
                  int var14 = (-var13 + arg4) / 2;
                  if (arg0) {
                     class383.field5543.method574();
                     class383.field5543.method533(-16777216, arg2, arg3, arg1, (byte)55, var14);
                     class383.field5543.method533(-16777216, arg2, arg3 - -arg4 + -var14, arg1, (byte)75, var14);
                  }

                  arg3 += var14;
                  arg4 -= var14 * 2;
               }
            }
         }

         class711.field10373 = (short)arg1;
         class301.field4124 = arg4 * var8 / 334;
         class338.field4603 = arg3;
         class101.field1297 = arg2;
         class571.field8123 = (short)arg4;
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field6256[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6254;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6256[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method3224(int arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            method3222(-63);
         }

         ++field6252;
         if (~arg2 <= -1 && arg0 >= 0 && class613.field9016[1].length > arg2 && arg0 < class613.field9016[1][arg2].length) {
            return ~(2 & class613.field9016[1][arg2][arg0]) != -1;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field6256[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3225(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3226(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
