import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class247 extends Canvas {
   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "Ljava/awt/Component;"
   )
   private Component field3402;
   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3410 = new String[]{method1877(method1876("\u0007\u0002\u0003{6\u000f\nYyw")), method1877(method1876("\u001aM\u0003i\"")), method1877(method1876("\u000f\u0016A+")), method1877(method1876("\u0007\u0002\u0003\u0004w")), method1877(method1876("\u0007\u0002\u00032/\u0005\u0002Y\"w")), method1877(method1876("\u0007\u0002\u00037>\b\rYo")), method1877(method1876("\u0007\u0002\u0003\u0006w")), method1877(method1876("\u0007\u0002\u0003\u0005w"))};
   @OriginalMember(
      owner = "client!fa",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field3406 = new class118(99, -1);
   @OriginalMember(
      owner = "client!fa",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field3408 = false;
   @OriginalMember(
      owner = "client!fa",
      name = "i",
      descriptor = "I"
   )
   public static int field3401;
   @OriginalMember(
      owner = "client!fa",
      name = "g",
      descriptor = "I"
   )
   public static int field3403;
   @OriginalMember(
      owner = "client!fa",
      name = "f",
      descriptor = "I"
   )
   public static int field3404;
   @OriginalMember(
      owner = "client!fa",
      name = "h",
      descriptor = "I"
   )
   public static int field3405;
   @OriginalMember(
      owner = "client!fa",
      name = "d",
      descriptor = "I"
   )
   public static int field3407;
   @OriginalMember(
      owner = "client!fa",
      name = "e",
      descriptor = "Lqha;"
   )
   public static class112 field3409;

   @OriginalMember(
      owner = "client!fa",
      name = "update",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void update(Graphics arg0) {
      try {
         this.field3402.update(arg0);
         ++field3403;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3410[4] + (arg0 != null ? field3410[1] : field3410[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(IIIIIIIZII)Z"
   )
   public static final boolean method1873(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
      try {
         ++field3404;
         if (!class663.method4846(arg0, arg4, arg7, arg9)) {
            return false;
         } else {
            int var20 = class165.field2336[2];
            int var16 = class165.field2336[1];
            int var12 = class165.field2336[0];
            if (!class663.method4846(arg1, arg3, arg7, arg5)) {
               return false;
            } else {
               int var15 = class165.field2336[1];
               int var17 = class165.field2336[2];
               int var13 = class165.field2336[0];
               if (!class663.method4846(arg8, arg2, false, arg6)) {
                  return false;
               } else {
                  int var19 = class165.field2336[0];
                  int var14 = class165.field2336[1];
                  int var18 = class165.field2336[2];
                  return class172.method1397((byte)-94, var12, var14, var17, var20, var19, var13, var15, var18, var16);
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field3410[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1874(int arg0) {
      try {
         field3409 = null;
         field3406 = null;
         if (arg0 != -1) {
            method1874(-99);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3410[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(IIIZ[BII[BI)V"
   )
   public static final void method1875(int arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5, int arg6, byte[] arg7, int arg8) {
      boolean var9 = client.field4360;

      try {
         ++field3407;
         int var10 = -(arg6 >> 2);
         int var16 = -(arg6 & 3);
         int var11 = -arg8;
         if (arg3) {
            field3406 = null;
            if (!var9 && ~var11 <= -1) {
               return;
            }
         } else if (~var11 <= -1) {
            return;
         }

         label92:
         do {
            int var12 = var10;
            int var10001;
            if (var9) {
               var10001 = arg0++;
               arg7[var10001] = (byte)(arg7[var10001] + -arg4[arg1++]);
               int var17 = arg0++;
               arg7[var17] = (byte)(arg7[var17] + -arg4[arg1++]);
               int var18 = arg0++;
               arg7[var18] = (byte)(arg7[var18] + -arg4[arg1++]);
               int var19 = arg0++;
               arg7[var19] = (byte)(arg7[var19] + -arg4[arg1++]);
               var12 = var10 + 1;
            }

            while(true) {
               while(~var12 > -1) {
                  var10001 = arg0++;
                  arg7[var10001] = (byte)(arg7[var10001] + -arg4[arg1++]);
                  var10001 = arg0++;
                  arg7[var10001] = (byte)(arg7[var10001] + -arg4[arg1++]);
                  var10001 = arg0++;
                  arg7[var10001] = (byte)(arg7[var10001] + -arg4[arg1++]);
                  var10001 = arg0++;
                  arg7[var10001] = (byte)(arg7[var10001] + -arg4[arg1++]);
                  ++var12;
               }

               int var13 = var16;
               if (!var9) {
                  if (var9) {
                     var10001 = arg0++;
                     arg7[var10001] = (byte)(arg7[var10001] + -arg4[arg1++]);
                     var13 = var16 + 1;
                  }

                  while(true) {
                     while(~var13 > -1) {
                        var10001 = arg0++;
                        arg7[var10001] = (byte)(arg7[var10001] + -arg4[arg1++]);
                        ++var13;
                     }

                     arg0 += arg2;
                     arg1 += arg5;
                     if (!var9) {
                        ++var11;
                        continue label92;
                     }

                     ++var13;
                  }
               }

               ++var12;
            }
         } while(~var11 > -1);

      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field3410[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3410[1] : field3410[2]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field3410[1] : field3410[2]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "paint",
      descriptor = "(Ljava/awt/Graphics;)V"
   )
   public final void paint(Graphics arg0) {
      try {
         this.field3402.paint(arg0);
         ++field3401;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3410[5] + (arg0 != null ? field3410[1] : field3410[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "<init>",
      descriptor = "(Ljava/awt/Component;)V"
   )
   public class247(Component arg0) {
      try {
         this.field3402 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3410[0] + (arg0 != null ? field3410[1] : field3410[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1876(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1877(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
