import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class794 extends class770 {
   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11606 = new String[]{method5725(method5724("u}pJa*")), method5725(method5724("u}pJf*")), method5725(method5724("y:?JX")), method5725(method5724("la}\b")), method5725(method5724("u}pJ`*")), method5725(method5724("u}pJd*")), method5725(method5724("u}pJg*"))};
   @OriginalMember(
      owner = "client!wia",
      name = "n",
      descriptor = "Lbga;"
   )
   public static class378 field11598 = new class378(46, -1);
   @OriginalMember(
      owner = "client!wia",
      name = "l",
      descriptor = "I"
   )
   public static int field11595;
   @OriginalMember(
      owner = "client!wia",
      name = "i",
      descriptor = "I"
   )
   public static int field11596;
   @OriginalMember(
      owner = "client!wia",
      name = "m",
      descriptor = "I"
   )
   public static int field11602;
   @OriginalMember(
      owner = "client!wia",
      name = "o",
      descriptor = "I"
   )
   public static int field11603;
   @OriginalMember(
      owner = "client!wia",
      name = "p",
      descriptor = "I"
   )
   public static int field11604;
   @OriginalMember(
      owner = "client!wia",
      name = "k",
      descriptor = "I"
   )
   public static int field11605;
   @OriginalMember(
      owner = "client!wia",
      name = "f",
      descriptor = "Lu;"
   )
   public class80 field11600;
   @OriginalMember(
      owner = "client!wia",
      name = "g",
      descriptor = "Z"
   )
   public boolean field11599;
   @OriginalMember(
      owner = "client!wia",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field11597;
   @OriginalMember(
      owner = "client!wia",
      name = "j",
      descriptor = "[Lgp;"
   )
   public class52[] field11601;

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(IILha;B)Z"
   )
   public final boolean method5719(int arg0, int arg1, class65 arg2, byte arg3) {
      boolean var5 = client.field4273;

      try {
         ++field11604;
         if (arg3 != 72) {
            return true;
         } else {
            int var6 = this.field11600.method772(true);
            if (this.field11601 != null) {
               int var7 = 0;
               if (var5 || ~var7 > ~this.field11601.length) {
                  do {
                     this.field11601[var7].field575 <<= var6;
                     if (this.field11601[var7].method418(arg1, arg0) && this.field11600.method774(arg1, arg0, arg3 + -159, arg2)) {
                        this.field11601[var7].field575 >>= var6;
                        return true;
                     }

                     this.field11601[var7].field575 >>= var6;
                     ++var7;
                  } while(~var7 > ~this.field11601.length);
               }
            }

            return false;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field11606[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11606[2] : field11606[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(BLjava/awt/Canvas;Ld;I)Lha;"
   )
   public static final class65 method5720(byte arg0, Canvas arg1, class160 arg2, int arg3) {
      try {
         ++field11596;
         return arg0 > -35 ? null : new class670(arg1, arg2, arg3);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11606[4] + arg0 + ',' + (arg1 != null ? field11606[2] : field11606[3]) + ',' + (arg2 != null ? field11606[2] : field11606[3]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5721(byte arg0) {
      try {
         field11598 = null;
         int var1 = 111 / ((arg0 - 31) / 32);
         field11597 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11606[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "([BII[BIIIII)V"
   )
   public static final void method5722(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field4273;

      try {
         ++field11605;
         int var10 = -(arg7 >> 2);
         int var17 = -(arg7 & 3);
         int var11 = -97 % ((arg1 - -35) / 34);
         int var12 = -arg2;
         if (var9 || var12 < 0) {
            label84:
            do {
               int var13 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg6++;
                  arg3[var10001] += arg0[arg4++];
                  int var18 = arg6++;
                  arg3[var18] += arg0[arg4++];
                  int var19 = arg6++;
                  arg3[var19] += arg0[arg4++];
                  int var20 = arg6++;
                  arg3[var20] += arg0[arg4++];
                  var13 = var10 + 1;
               }

               while(true) {
                  while(~var13 > -1) {
                     var10001 = arg6++;
                     arg3[var10001] += arg0[arg4++];
                     var10001 = arg6++;
                     arg3[var10001] += arg0[arg4++];
                     var10001 = arg6++;
                     arg3[var10001] += arg0[arg4++];
                     var10001 = arg6++;
                     arg3[var10001] += arg0[arg4++];
                     ++var13;
                  }

                  int var14 = var17;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg6++;
                        arg3[var10001] += arg0[arg4++];
                        var14 = var17 + 1;
                     }

                     while(true) {
                        while(var14 < 0) {
                           var10001 = arg6++;
                           arg3[var10001] += arg0[arg4++];
                           ++var14;
                        }

                        arg4 += arg5;
                        arg6 += arg8;
                        if (!var9) {
                           ++var12;
                           continue label84;
                        }

                        ++var14;
                     }
                  }

                  ++var13;
               }
            } while(var12 < 0);

         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field11606[6] + (arg0 != null ? field11606[2] : field11606[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11606[2] : field11606[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(ILqh;)V"
   )
   public static final void method5723(int arg0, class74 arg1) {
      try {
         class412.field5796 = arg1;
         if (arg0 == -1) {
            ++field11595;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11606[5] + arg0 + ',' + (arg1 != null ? field11606[2] : field11606[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5724(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5725(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
