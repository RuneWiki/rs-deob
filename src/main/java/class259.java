import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class259 extends class228 {
   @OriginalMember(
      owner = "client!ru",
      name = "o",
      descriptor = "I"
   )
   public int field3295;
   @OriginalMember(
      owner = "client!ru",
      name = "t",
      descriptor = "I"
   )
   public int field3296;
   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3301 = new String[]{method2091(method2090("zo!T\u0010")), method2091(method2090("zo!U\u0010")), method2091(method2090("zo!*Qfs{(\u0010")), method2091(method2090("s4!8E")), method2091(method2090("focz")), method2091(method2090("zo!W\u0010"))};
   @OriginalMember(
      owner = "client!ru",
      name = "n",
      descriptor = "Lse;"
   )
   public static class6 field3297 = new class6(84, 7);
   @OriginalMember(
      owner = "client!ru",
      name = "p",
      descriptor = "Lsia;"
   )
   public static class407 field3299 = new class407(30);
   @OriginalMember(
      owner = "client!ru",
      name = "s",
      descriptor = "[Lfv;"
   )
   public static class702[] field3300 = new class702[300];
   @OriginalMember(
      owner = "client!ru",
      name = "r",
      descriptor = "F"
   )
   public static float field3292;
   @OriginalMember(
      owner = "client!ru",
      name = "q",
      descriptor = "I"
   )
   public static int field3293;
   @OriginalMember(
      owner = "client!ru",
      name = "v",
      descriptor = "I"
   )
   public static int field3294;
   @OriginalMember(
      owner = "client!ru",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field3298;

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(IZILoca;B)V"
   )
   public static final void method2087(int arg0, boolean arg1, int arg2, class642 arg3, byte arg4) {
      boolean var5 = client.field1481;

      try {
         int var6;
         label124: {
            ++field3294;
            var6 = arg3.field9629;
            if (~arg3.field9614 == -1) {
               arg3.field9629 = arg3.field9504;
               if (!var5) {
                  break label124;
               }
            }

            if (arg3.field9614 != 1) {
               if (arg3.field9614 != 2) {
                  break label124;
               }

               arg3.field9629 = arg3.field9504 * arg0 >> 14;
               if (!var5) {
                  break label124;
               }
            }

            arg3.field9629 = -arg3.field9504 + arg0;
         }

         if (arg4 != -127) {
            field3292 = -2.0385551F;
         }

         int var7;
         label125: {
            var7 = arg3.field9572;
            if (arg3.field9588 == 0) {
               arg3.field9572 = arg3.field9500;
               if (!var5) {
                  break label125;
               }
            }

            if (~arg3.field9588 != -2) {
               if (~arg3.field9588 != -3) {
                  break label125;
               }

               arg3.field9572 = arg3.field9500 * arg2 >> 14;
               if (!var5) {
                  break label125;
               }
            }

            arg3.field9572 = -arg3.field9500 + arg2;
         }

         if (~arg3.field9614 == -5) {
            arg3.field9629 = arg3.field9618 * arg3.field9572 / arg3.field9641;
         }

         if (~arg3.field9588 == -5) {
            arg3.field9572 = arg3.field9641 * arg3.field9629 / arg3.field9618;
         }

         if (class497.field6955 && (~client.method999(arg3).field10630 != -1 || ~arg3.field9493 == -1)) {
            label130: {
               if (~arg3.field9572 > -6 && arg3.field9629 < 5) {
                  arg3.field9572 = 5;
                  arg3.field9629 = 5;
                  if (!var5) {
                     break label130;
                  }
               }

               if (~arg3.field9572 >= -1) {
                  arg3.field9572 = 5;
               }

               if (arg3.field9629 <= 0) {
                  arg3.field9629 = 5;
               }
            }
         }

         if (class157.field2024 == arg3.field9558) {
            class438.field5963 = arg3;
         }

         if (arg1 && arg3.field9550 != null) {
            if (~arg3.field9629 != ~var6 || ~arg3.field9572 != ~var7) {
               class586 var8 = new class586();
               var8.field8648 = arg3.field9550;
               var8.field8655 = arg3;
               class452.field6201.method279(false, var8);
            }

         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field3301[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3301[3] : field3301[4]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "<init>",
      descriptor = "(Liba;Lbu;IIIIIIIII)V"
   )
   public class259(class237 arg0, class596 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field3295 = arg9;
         this.field3296 = arg10;
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field3301[2] + (arg0 != null ? field3301[3] : field3301[4]) + ',' + (arg1 != null ? field3301[3] : field3301[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public final class499 method842(byte arg0) {
      try {
         ++field3293;
         int var2 = 12 % ((4 - arg0) / 37);
         return class763.field11167;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3301[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2088(int arg0) {
      class645.field9669 = arg0;
   }

   @OriginalMember(
      owner = "client!ru",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2089(int arg0) {
      try {
         field3297 = null;
         field3299 = null;
         field3298 = null;
         field3300 = null;
         if (arg0 <= 82) {
            method2087(122, false, -59, (class642)null, (byte)107);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3301[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2090(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ru",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2091(char[] arg0) {
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
            var10005 = 26;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
