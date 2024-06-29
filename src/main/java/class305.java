import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class305 extends class307 {
   @OriginalMember(
      owner = "client!mw",
      name = "s",
      descriptor = "Lsb;"
   )
   public class261 field4623 = new class261();
   @OriginalMember(
      owner = "client!mw",
      name = "q",
      descriptor = "Lnq;"
   )
   public class52 field4631 = new class52();
   @OriginalMember(
      owner = "client!mw",
      name = "w",
      descriptor = "Lqaa;"
   )
   private class119 field4629;
   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4632 = new String[]{method2515(method2514("kp`|")), method2515(method2514("~+\">K")), method2515(method2514("hr\",_klx.\u001e")), method2515(method2514("hr\"D\u001e")), method2515(method2514("hr\"Y\u001e")), method2515(method2514("hr\"B\u001e")), method2515(method2514("hr\"Q\u001e")), method2515(method2514("hr\"_\u001e")), method2515(method2514("hr\"R\u001e")), method2515(method2514("hr\"Rw-"))};
   @OriginalMember(
      owner = "client!mw",
      name = "p",
      descriptor = "I"
   )
   public static int field4622;
   @OriginalMember(
      owner = "client!mw",
      name = "n",
      descriptor = "I"
   )
   public static int field4624;
   @OriginalMember(
      owner = "client!mw",
      name = "o",
      descriptor = "I"
   )
   public static int field4625;
   @OriginalMember(
      owner = "client!mw",
      name = "r",
      descriptor = "I"
   )
   public static int field4626;
   @OriginalMember(
      owner = "client!mw",
      name = "u",
      descriptor = "I"
   )
   public static int field4627;
   @OriginalMember(
      owner = "client!mw",
      name = "t",
      descriptor = "I"
   )
   public static int field4628;
   @OriginalMember(
      owner = "client!mw",
      name = "v",
      descriptor = "I"
   )
   public static int field4630;

   @OriginalMember(
      owner = "client!mw",
      name = "d",
      descriptor = "()I"
   )
   public final int method563() {
      try {
         ++field4624;
         return 0;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4632[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(I[IILhea;II)V"
   )
   private final void method2512(int arg0, int[] arg1, int arg2, class317 arg3, int arg4, int arg5) {
      boolean var7 = client.field10022;

      try {
         ++field4628;
         if (arg5 == 262144) {
            if (~(4 & this.field4629.field1922[arg3.field4752]) != -1 && arg3.field4749 < 0) {
               int var8 = this.field4629.field1895[arg3.field4752] / class358.field5291;

               while(true) {
                  int var9 = (-arg3.field4753 + 1048575 + var8) / var8;
                  if (~var9 < ~arg4) {
                     break;
                  }

                  arg3.field4739.method564(arg1, arg2, var9);
                  arg4 -= var9;
                  arg3.field4753 += var8 * var9 + -1048576;
                  arg2 += var9;
                  int var10 = class358.field5291 / 100;
                  int var11 = 262144 / var8;
                  if (var10 > var11) {
                     var10 = var11;
                  }

                  class291 var12;
                  label62: {
                     var12 = arg3.field4739;
                     if (~this.field4629.field1903[arg3.field4752] != -1) {
                        arg3.field4739 = class291.method2420(arg3.field4736, var12.method2437(), 0, var12.method2444());
                        this.field4629.method1161(~arg3.field4740.field338[arg3.field4745] > -1, 4204, arg3);
                        arg3.field4739.method2421(var10, var12.method2443());
                        if (!var7) {
                           break label62;
                        }
                     }

                     arg3.field4739 = class291.method2420(arg3.field4736, var12.method2437(), var12.method2443(), var12.method2444());
                  }

                  if (arg3.field4740.field338[arg3.field4745] < 0) {
                     arg3.field4739.method2423(-1);
                  }

                  var12.method2438(var10);
                  var12.method564(arg1, arg2, arg0 - arg2);
                  if (var12.method2411()) {
                     this.field4631.method568(var12);
                     if (var7) {
                        return;
                     }

                     if (var7) {
                        break;
                     }
                  }
               }

               arg3.field4753 += arg4 * var8;
            }

            arg3.field4739.method564(arg1, arg2, arg4);
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field4632[8] + arg0 + ',' + (arg1 != null ? field4632[1] : field4632[0]) + ',' + arg2 + ',' + (arg3 != null ? field4632[1] : field4632[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method561(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "()Lnj;"
   )
   public final class307 method566() {
      boolean var1 = client.field10022;

      try {
         ++field4627;

         while(true) {
            class317 var2 = (class317)this.field4623.method2239((byte)127);
            if (var2 == null) {
               return null;
            }

            class291 var10000 = var2.field4739;

            while(var10000 != null) {
               var10000 = var2.field4739;
               if (!var1) {
                  return var10000;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field4632[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "c",
      descriptor = "()Lnj;"
   )
   public final class307 method558() {
      try {
         ++field4622;
         class317 var1 = (class317)this.field4623.method2245((byte)-94);
         if (var1 == null) {
            return null;
         } else {
            return var1.field4739 != null ? var1.field4739 : this.method566();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4632[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(IILhea;)V"
   )
   private final void method2513(int arg0, int arg1, class317 arg2) {
      try {
         ++field4625;
         if ((this.field4629.field1922[arg2.field4752] & 4) != 0 && ~arg2.field4749 > -1) {
            int var4 = this.field4629.field1895[arg2.field4752] / class358.field5291;
            int var5 = (-arg2.field4753 + 1048575 + var4) / var4;
            arg2.field4753 = 1048575 & arg0 * var4 + arg2.field4753;
            if (~arg0 <= ~var5) {
               label52: {
                  if (this.field4629.field1903[arg2.field4752] == 0) {
                     arg2.field4739 = class291.method2420(arg2.field4736, arg2.field4739.method2437(), arg2.field4739.method2443(), arg2.field4739.method2444());
                     if (!client.field10022) {
                        break label52;
                     }
                  }

                  arg2.field4739 = class291.method2420(arg2.field4736, arg2.field4739.method2437(), 0, arg2.field4739.method2444());
                  this.field4629.method1161(~arg2.field4740.field338[arg2.field4745] > -1, 4204, arg2);
               }

               if (arg2.field4740.field338[arg2.field4745] < 0) {
                  arg2.field4739.method2423(-1);
               }

               arg0 = arg2.field4753 / var4;
            }
         }

         arg2.field4739.method561(arg0);
         if (arg1 != -10601) {
            this.method558();
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4632[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4632[1] : field4632[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "b",
      descriptor = "([III)V"
   )
   public final void method564(int[] param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mw",
      name = "<init>",
      descriptor = "(Lqaa;)V"
   )
   public class305(class119 arg0) {
      try {
         this.field4629 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4632[2] + (arg0 != null ? field4632[1] : field4632[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2514(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2515(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
