import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class203 extends class593 {
   @OriginalMember(
      owner = "client!op",
      name = "q",
      descriptor = "Lll;"
   )
   public class387 field2889 = new class387();
   @OriginalMember(
      owner = "client!op",
      name = "x",
      descriptor = "Lpda;"
   )
   public class658 field2892 = new class658();
   @OriginalMember(
      owner = "client!op",
      name = "u",
      descriptor = "Lfs;"
   )
   private class582 field2886;
   @OriginalMember(
      owner = "client!op",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2893 = new String[]{method1609(method1608("i;:1;")), method1609(method1608("h>x\u001a")), method1609(method1608("i;:9R.")), method1609(method1608("}e:Xn")), method1609(method1608("i;: ;")), method1609(method1608("i;:4;")), method1609(method1608("i;:?R.")), method1609(method1608("i;:1R.")), method1609(method1608("i;:7;")), method1609(method1608("i;:Jzh\"`H;"))};
   @OriginalMember(
      owner = "client!op",
      name = "y",
      descriptor = "I"
   )
   public static int field2883 = -1;
   @OriginalMember(
      owner = "client!op",
      name = "t",
      descriptor = "I"
   )
   public static int field2881;
   @OriginalMember(
      owner = "client!op",
      name = "A",
      descriptor = "I"
   )
   public static int field2882;
   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "I"
   )
   public static int field2884;
   @OriginalMember(
      owner = "client!op",
      name = "s",
      descriptor = "I"
   )
   public static int field2885;
   @OriginalMember(
      owner = "client!op",
      name = "w",
      descriptor = "I"
   )
   public static int field2887;
   @OriginalMember(
      owner = "client!op",
      name = "B",
      descriptor = "I"
   )
   public static int field2888;
   @OriginalMember(
      owner = "client!op",
      name = "r",
      descriptor = "I"
   )
   public static int field2890;
   @OriginalMember(
      owner = "client!op",
      name = "v",
      descriptor = "I"
   )
   public static int field2891;

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(ILnw;I)V",
      line = 3
   )
   private final void method1601(int arg0, class613 arg1, int arg2) {
      try {
         ++field2887;
         if (~(4 & this.field2886.field8587[arg1.field9009]) != -1 && ~arg1.field8987 > -1) {
            int var4 = this.field2886.field8569[arg1.field9009] / class83.field1082;
            int var5 = (1048575 - arg1.field9012 + var4) / var4;
            arg1.field9012 = arg1.field9012 - -(arg2 * var4) & 1048575;
            if (arg2 >= var5) {
               label52: {
                  if (this.field2886.field8577[arg1.field9009] == 0) {
                     arg1.field9007 = class248.method1886(arg1.field9008, arg1.field9007.method1917(), arg1.field9007.method1901(), arg1.field9007.method1880());
                     if (!client.field4360) {
                        break label52;
                     }
                  }

                  arg1.field9007 = class248.method1886(arg1.field9008, arg1.field9007.method1917(), 0, arg1.field9007.method1880());
                  this.field2886.method4245(arg1.field9005.field2261[arg1.field8992] < 0, arg1, 7574);
               }

               if (~arg1.field9005.field2261[arg1.field8992] > -1) {
                  arg1.field9007.method1898(-1);
               }

               arg2 = arg1.field9012 / var4;
            }
         }

         if (arg0 != 1048575) {
            field2883 = -127;
         }

         arg1.field9007.method1606(arg2);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2893[5] + arg0 + ',' + (arg1 != null ? field2893[3] : field2893[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "()I",
      line = 44
   )
   public final int method1602() {
      try {
         ++field2884;
         return 0;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2893[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "b",
      descriptor = "()Lkj;",
      line = 56
   )
   public final class593 method1603() {
      try {
         ++field2882;
         class613 var1 = (class613)this.field2889.method2933(2);
         if (var1 == null) {
            return null;
         } else {
            return var1.field9007 != null ? var1.field9007 : this.method1605();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2893[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(IIILnw;[II)V",
      line = 75
   )
   private final void method1604(int arg0, int arg1, int arg2, class613 arg3, int[] arg4, int arg5) {
      boolean var7 = client.field4360;

      try {
         if (arg2 != -1) {
            this.field2889 = null;
         }

         if ((4 & this.field2886.field8587[arg3.field9009]) != 0 && ~arg3.field8987 > -1) {
            int var8 = this.field2886.field8569[arg3.field9009] / class83.field1082;

            while(true) {
               int var9 = (-arg3.field9012 + 1048575 + var8) / var8;
               if (var9 > arg5) {
                  break;
               }

               arg3.field9007.method1607(arg4, arg1, var9);
               arg5 -= var9;
               arg1 += var9;
               arg3.field9012 += var8 * var9 + -1048576;
               int var10 = class83.field1082 / 100;
               int var11 = 262144 / var8;
               if (~var10 < ~var11) {
                  var10 = var11;
               }

               class248 var12;
               label79: {
                  var12 = arg3.field9007;
                  if (~this.field2886.field8577[arg3.field9009] == -1) {
                     arg3.field9007 = class248.method1886(arg3.field9008, var12.method1917(), var12.method1901(), var12.method1880());
                     if (!var7) {
                        break label79;
                     }
                  }

                  arg3.field9007 = class248.method1886(arg3.field9008, var12.method1917(), 0, var12.method1880());
                  this.field2886.method4245(arg3.field9005.field2261[arg3.field8992] < 0, arg3, 7574);
                  arg3.field9007.method1913(var10, var12.method1901());
               }

               if (~arg3.field9005.field2261[arg3.field8992] > -1) {
                  arg3.field9007.method1898(-1);
               }

               var12.method1905(var10);
               var12.method1607(arg4, arg1, -arg1 + arg0);
               if (var12.method1883()) {
                  this.field2892.method4814(var12);
                  if (var7) {
                     return;
                  }

                  if (var7) {
                     break;
                  }
               }
            }

            arg3.field9012 += arg5 * var8;
         }

         ++field2881;
         arg3.field9007.method1607(arg4, arg1, arg5);
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field2893[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2893[3] : field2893[1]) + ',' + (arg4 != null ? field2893[3] : field2893[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "c",
      descriptor = "()Lkj;",
      line = 137
   )
   public final class593 method1605() {
      boolean var1 = client.field4360;

      try {
         ++field2885;

         while(true) {
            class613 var2 = (class613)this.field2889.method2940(false);
            if (var2 == null) {
               return null;
            }

            class248 var10000 = var2.field9007;

            while(var10000 != null) {
               var10000 = var2.field9007;
               if (!var1) {
                  return var10000;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2893[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "(I)V",
      line = 160
   )
   public final void method1606(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!op",
      name = "a",
      descriptor = "([III)V",
      line = 194
   )
   public final void method1607(int[] param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!op",
      name = "<init>",
      descriptor = "(Lfs;)V",
      line = 246
   )
   public class203(class582 arg0) {
      try {
         this.field2886 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2893[9] + (arg0 != null ? field2893[3] : field2893[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1608(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 19);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!op",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1609(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 19;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
