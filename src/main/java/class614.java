import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class614 extends class166 {
   @OriginalMember(
      owner = "client!eba",
      name = "v",
      descriptor = "Lum;"
   )
   public class550 field8981 = new class550();
   @OriginalMember(
      owner = "client!eba",
      name = "q",
      descriptor = "Lwo;"
   )
   public class775 field8984 = new class775();
   @OriginalMember(
      owner = "client!eba",
      name = "s",
      descriptor = "Lwba;"
   )
   private class55 field8979;
   @OriginalMember(
      owner = "client!eba",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8991 = new String[]{method4468(method4467("q cx")), method4468(method4467("d{!:/")), method4468(method4467("z7n:\u00147")), method4468(method4467("z7n:\u00167")), method4468(method4467("z7n:\u00107")), method4468(method4467("z7n:nv;f`l7")), method4468(method4467("z7n:\u00137")), method4468(method4467("z7n:\u00117")), method4468(method4467("z7n:\u001c^}")), method4468(method4467("z7n:\u0002^}")), method4468(method4467("z7n:\u00027")), method4468(method4467("z7n:\u00177"))};
   @OriginalMember(
      owner = "client!eba",
      name = "n",
      descriptor = "[Llja;"
   )
   public static class744[] field8989 = new class744[8];
   @OriginalMember(
      owner = "client!eba",
      name = "y",
      descriptor = "Lii;"
   )
   public static class579 field8987 = new class579(1);
   @OriginalMember(
      owner = "client!eba",
      name = "x",
      descriptor = "I"
   )
   public static int field8977;
   @OriginalMember(
      owner = "client!eba",
      name = "t",
      descriptor = "I"
   )
   public static int field8978;
   @OriginalMember(
      owner = "client!eba",
      name = "w",
      descriptor = "I"
   )
   public static int field8982;
   @OriginalMember(
      owner = "client!eba",
      name = "r",
      descriptor = "I"
   )
   public static int field8983;
   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "I"
   )
   public static int field8985;
   @OriginalMember(
      owner = "client!eba",
      name = "u",
      descriptor = "I"
   )
   public static int field8986;
   @OriginalMember(
      owner = "client!eba",
      name = "m",
      descriptor = "I"
   )
   public static int field8988;
   @OriginalMember(
      owner = "client!eba",
      name = "p",
      descriptor = "I"
   )
   public static int field8990;
   @OriginalMember(
      owner = "client!eba",
      name = "o",
      descriptor = "Leaa;"
   )
   public static class526 field8980;

   @OriginalMember(
      owner = "client!eba",
      name = "b",
      descriptor = "()I"
   )
   public final int method184() {
      try {
         ++field8985;
         return 0;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8991[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(Lb;BI)V"
   )
   private final void method4463(class351 arg0, byte arg1, int arg2) {
      try {
         if (~(this.field8979.field680[arg0.field5333] & 4) != -1 && ~arg0.field5329 > -1) {
            int var4 = this.field8979.field689[arg0.field5333] / class335.field4787;
            int var5 = (var4 + 1048575 + -arg0.field5315) / var4;
            arg0.field5315 = 1048575 & arg2 * var4 + arg0.field5315;
            if (var5 <= arg2) {
               label38: {
                  if (~this.field8979.field670[arg0.field5333] != -1) {
                     arg0.field5322 = class727.method5291(arg0.field5335, arg0.field5322.method5275(), 0, arg0.field5322.method5283());
                     this.field8979.method466(arg0.field5331.field5425[arg0.field5337] < 0, arg0, 32116);
                     if (client.field4530 == 0) {
                        break label38;
                     }
                  }

                  arg0.field5322 = class727.method5291(arg0.field5335, arg0.field5322.method5275(), arg0.field5322.method5302(), arg0.field5322.method5283());
               }

               if (arg0.field5331.field5425[arg0.field5337] < 0) {
                  arg0.field5322.method5266(-1);
               }

               arg2 = arg0.field5315 / var4;
            }
         }

         int var6 = -47 % ((74 - arg1) / 41);
         ++field8986;
         arg0.field5322.method179(arg2);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field8991[2] + (arg0 != null ? field8991[1] : field8991[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method179(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method4464(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8990;
         int var4 = arg0 / arg3;
         int var5 = arg0 & arg3 + -1;
         int var6 = arg1 / arg3;
         int var7 = arg1 & arg2 + arg3;
         int var8 = class705.method5127(var4, 57, var6);
         int var9 = class705.method5127(var4 + 1, arg2 + 78, var6);
         int var10 = class705.method5127(var4, arg2 ^ 67, var6 + 1);
         int var11 = class705.method5127(var4 + 1, 76, var6 - -1);
         int var12 = class634.method4564(var5, var9, var8, arg3, (byte)53);
         int var13 = class634.method4564(var5, var11, var10, arg3, (byte)53);
         return class634.method4564(var7, var13, var12, arg3, (byte)53);
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field8991[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "b",
      descriptor = "([III)V"
   )
   public final void method187(int[] param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eba",
      name = "a",
      descriptor = "(Lb;IIII[I)V"
   )
   private final void method4465(class351 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      int var7 = client.field4530;

      try {
         if ((4 & this.field8979.field680[arg0.field5333]) != 0 && arg0.field5329 < 0) {
            int var8 = this.field8979.field689[arg0.field5333] / class335.field4787;

            while(true) {
               int var9 = (1048575 - arg0.field5315 + var8) / var8;
               if (arg2 < var9) {
                  break;
               }

               arg0.field5322.method187(arg5, arg1, var9);
               arg2 -= var9;
               arg0.field5315 += var8 * var9 + -1048576;
               arg1 += var9;
               int var10 = class335.field4787 / 100;
               int var11 = 262144 / var8;
               if (~var11 > ~var10) {
                  var10 = var11;
               }

               class727 var12;
               label74: {
                  var12 = arg0.field5322;
                  if (~this.field8979.field670[arg0.field5333] == -1) {
                     arg0.field5322 = class727.method5291(arg0.field5335, var12.method5275(), var12.method5302(), var12.method5283());
                     if (var7 == 0) {
                        break label74;
                     }
                  }

                  arg0.field5322 = class727.method5291(arg0.field5335, var12.method5275(), 0, var12.method5283());
                  this.field8979.method466(arg0.field5331.field5425[arg0.field5337] < 0, arg0, 32116);
                  arg0.field5322.method5268(var10, var12.method5302());
               }

               if (~arg0.field5331.field5425[arg0.field5337] > -1) {
                  arg0.field5322.method5266(-1);
               }

               var12.method5290(var10);
               var12.method187(arg5, arg1, -arg1 + arg3);
               if (var12.method5296()) {
                  this.field8984.method5589(var12);
                  if (var7 != 0) {
                     return;
                  }

                  if (var7 != 0) {
                     break;
                  }
               }
            }

            arg0.field5315 += arg2 * var8;
         }

         ++field8988;
         int var13 = -77 / ((-35 - arg4) / 49);
         arg0.field5322.method187(arg5, arg1, arg2);
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field8991[11] + (arg0 != null ? field8991[1] : field8991[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8991[1] : field8991[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "<init>",
      descriptor = "(Lwba;)V"
   )
   public class614(class55 arg0) {
      try {
         this.field8979 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8991[5] + (arg0 != null ? field8991[1] : field8991[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4466(int arg0) {
      try {
         field8987 = null;
         field8989 = null;
         if (arg0 < -28) {
            field8980 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8991[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "d",
      descriptor = "()Lwea;"
   )
   public final class166 method176() {
      int var1 = client.field4530;

      try {
         ++field8982;

         while(true) {
            class351 var2 = (class351)this.field8981.method4059((byte)-105);
            if (var2 == null) {
               return null;
            }

            class727 var10000 = var2.field5322;

            while(var10000 != null) {
               var10000 = var2.field5322;
               if (var1 == 0) {
                  return var10000;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8991[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "c",
      descriptor = "()Lwea;"
   )
   public final class166 method182() {
      try {
         ++field8978;
         class351 var1 = (class351)this.field8981.method4071((byte)127);
         if (var1 == null) {
            return null;
         } else {
            return var1.field5322 != null ? var1.field5322 : this.method176();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8991[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4467(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4468(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
