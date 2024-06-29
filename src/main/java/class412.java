import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class412 extends class96 {
   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6051 = method3222(method3221("ur\"."));
   @OriginalMember(
      owner = "client!r",
      name = "t",
      descriptor = "I"
   )
   public static int field6047 = 0;
   @OriginalMember(
      owner = "client!r",
      name = "q",
      descriptor = "I"
   )
   public static int field6049 = 1;
   @OriginalMember(
      owner = "client!r",
      name = "s",
      descriptor = "I"
   )
   public static int field6048;
   @OriginalMember(
      owner = "client!r",
      name = "r",
      descriptor = "I"
   )
   public static int field6050;

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V"
   )
   public static final void method3219(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
      class174.field2594 = true;
      class572.field8100 = class720.field10315.method203() > 0;
      class343.field5048 = arg15;
      class507.field7207 = arg1 >> class313.field4707;
      class477.field6876 = arg3 >> class313.field4707;
      class386.field5636 = arg1;
      class297.field4416 = arg3;
      class647.field9137 = arg2;
      class583.field8194 = class507.field7207 - class15.field214;
      if (class583.field8194 < 0) {
         class612.field8702 = -class583.field8194;
         class583.field8194 = 0;
      } else {
         class612.field8702 = 0;
      }

      class340.field5008 = class477.field6876 - class15.field214;
      if (class340.field5008 < 0) {
         class183.field2692 = -class340.field5008;
         class340.field5008 = 0;
      } else {
         class183.field2692 = 0;
      }

      class714.field10249 = class507.field7207 + class15.field214;
      if (class714.field10249 > class155.field2381) {
         class714.field10249 = class155.field2381;
      }

      class521.field7328 = class477.field6876 + class15.field214;
      if (class521.field7328 > class25.field360) {
         class521.field7328 = class25.field360;
      }

      boolean[][] var19 = class232.field3602;
      boolean[][] var20 = class719.field10306;
      if (class343.field5048) {
         for(int var21 = 0; var21 < class15.field214 + class15.field214 + 2; ++var21) {
            int var22 = 0;
            int var23 = 0;

            for(int var24 = 0; var24 < class15.field214 + class15.field214 + 2; ++var24) {
               if (var24 > 1) {
                  class84.field1302[var24 - 2] = var22;
               }

               var22 = var23;
               int var25 = class507.field7207 - class15.field214 + var21;
               int var26 = class477.field6876 - class15.field214 + var24;
               if (var25 >= 0 && var26 >= 0 && var25 < class155.field2381 && var26 < class25.field360) {
                  int var27 = var25 << class313.field4707;
                  int var28 = var26 << class313.field4707;
                  int var29 = class558.field7922[class558.field7922.length - 1].method5400(-1, var26, var25) - (1000 << class313.field4707 - 7);
                  int var30 = (class634.field8989 != null ? class634.field8989[0].method5400(-1, var26, var25) + class44.field655 : class558.field7922[0].method5400(-1, var26, var25) + class44.field655) + (1000 << class313.field4707 - 7);
                  var23 = arg16 >= 0 ? class720.field10315.method259(var27, var29, var28, var27, var30, var28, arg16) : class720.field10315.method234(var27, var29, var28, var27, var30, var28);
                  class719.field10306[var21][var24] = var23 == 0;
               } else {
                  var23 = -1;
                  class719.field10306[var21][var24] = false;
               }

               if (var21 > 0 && var24 > 0) {
                  int var31 = class84.field1302[var24 - 1] & class84.field1302[var24] & var22 & var23;
                  class232.field3602[var21 - 1][var24 - 1] = var31 == 0;
               }
            }

            class84.field1302[class15.field214 + class15.field214] = var22;
            class84.field1302[class15.field214 + class15.field214 + 1] = var23;
         }

         if (arg16 >= 0) {
            class174.field2594 = false;
         } else {
            class582.field8183 = arg5;
            class761.field10865 = arg6;
            class462.field6722 = arg7;
            class210.field2996 = arg8;
            class208.field2970 = arg9;
            class573.method4243(arg10, true, class720.field10315);
         }
      } else {
         if (class597.field8400 == null) {
            class597.field8400 = new boolean[class155.field2381 + class155.field2381 + 1][class25.field360 + class155.field2381 + 1];
         }

         for(int var32 = 0; var32 < class597.field8400.length; ++var32) {
            for(int var42 = 0; var42 < class597.field8400[0].length; ++var42) {
               class597.field8400[var32][var42] = true;
            }
         }

         class719.field10306 = class597.field8400;
         class232.field3602 = class597.field8400;
         class583.field8194 = 0;
         class340.field5008 = 0;
         class714.field10249 = class155.field2381;
         class521.field7328 = class25.field360;
         class174.field2594 = false;
      }

      class243.method2123((byte)-127, class720.field10315);
      if (!class416.field6098.field2516) {
         class424 var33 = class416.field6098.field2513;

         for(class731 var34 = (class731)var33.method3307(16976); var34 != null; var34 = (class731)var33.method3309(true)) {
            var34.method4994((byte)-102);
            class267.method2282(var34, -7073);
         }
      }

      if (class572.field8100) {
         for(int var35 = 0; var35 < class160.field2452; ++var35) {
            class274.field4176[var35].method3315(arg14, (byte)122, arg0);
         }
      }

      if (class684.field9885) {
         class674.field9449 = class720.field10315.method147();
         class720.field10315.method211(class435.field6376);
         int var36 = (class435.field6376[2] - class435.field6376[0]) / class14.field198;

         for(int var37 = 0; var37 < class14.field198 - 1; ++var37) {
            class320.field4779[var37] = (var37 + 1) * var36 + class364.field5373[var37];
         }

         for(int var38 = 0; var38 < class468.field6786.length; ++var38) {
            class468.field6786[var38].method976();
         }
      }

      if (class506.field7196 != null) {
         if (class684.field9885) {
            class13.method107(0);
         }

         class662.method4802(true);
         class720.field10315.method232(-1, 1583160, 40, 127);
         class589.method4326(true, arg4, arg10, arg11, arg16, arg17, arg18);
         if (class684.field9885) {
            class9.method75();
         }

         class720.field10315.method192();
         class662.method4802(false);
      }

      class589.method4326(false, arg4, arg10, arg11, arg16, arg17, arg18);
      if (class684.field9885) {
         for(int var39 = 0; var39 < class522.field7337; ++var39) {
            class627.field8951[var39] = class279.field4226[var39];
         }

         class13.method107(0);

         for(int var40 = 0; var40 < class468.field6786.length; ++var40) {
            class468.field6786[var40].method976();
         }
      }

      if (class684.field9885) {
         class9.method75();

         for(int var41 = 0; var41 < class522.field7337; ++var41) {
            class279.field4226[var41] = class627.field8951[var41];
         }

         if (class734.field10434 == 2) {
            int var10002;
            if (class768.field11023[0] < class768.field11023[1]) {
               if (class364.field5373[0] + class320.field4779[0] > class435.field6376[0]) {
                  var10002 = class364.field5373[0]++;
               }
            } else if (class768.field11023[0] > class768.field11023[1] && class364.field5373[0] + class320.field4779[0] < class435.field6376[2]) {
               var10002 = class364.field5373[0]--;
            }
         }
      }

      if (!class343.field5048) {
         class232.field3602 = var19;
         class719.field10306 = var20;
      }

      class101.method997();
   }

   @OriginalMember(
      owner = "client!r",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3220(int arg0) {
      try {
         ++field6050;
         class712.field10231.method255(class110.field1710);
         class712.field10231.method256(class573.field8109, class236.field3652, class524.field7419, class616.field8761);
         if (arg0 <= 23) {
            field6049 = 13;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6051 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3221(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!r",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3222(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
