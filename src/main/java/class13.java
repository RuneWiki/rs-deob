import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class13 extends class142 {
   @OriginalMember(
      owner = "client!dka",
      name = "y",
      descriptor = "Liw;"
   )
   public class332 field182 = new class332();
   @OriginalMember(
      owner = "client!dka",
      name = "o",
      descriptor = "Ltca;"
   )
   public class181 field193 = new class181();
   @OriginalMember(
      owner = "client!dka",
      name = "x",
      descriptor = "Lpo;"
   )
   private class582 field184;
   @OriginalMember(
      owner = "client!dka",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field195 = new String[]{method93(method92("\n\u001b[MqF")), method93(method92("\u0000\u0005V\u000f")), method93(method92("\u0015^\u0014MC")), method93(method92("\n\u001b[MlF")), method93(method92("\n\u001b[M\u0002\u0007\u001eS\u0017\u0000F")), method93(method92("\n\u001b[M|F")), method93(method92("\n\u001b[M\u007fF")), method93(method92("\n\u001b[MyF")), method93(method92("\n\u001b[MxF")), method93(method92("\n\u001b[M}F")), method93(method92("\n\u001b[MwF"))};
   @OriginalMember(
      owner = "client!dka",
      name = "s",
      descriptor = "I"
   )
   public static int field181 = 0;
   @OriginalMember(
      owner = "client!dka",
      name = "t",
      descriptor = "I"
   )
   public static int field183;
   @OriginalMember(
      owner = "client!dka",
      name = "w",
      descriptor = "I"
   )
   public static int field185;
   @OriginalMember(
      owner = "client!dka",
      name = "u",
      descriptor = "I"
   )
   public static int field186;
   @OriginalMember(
      owner = "client!dka",
      name = "r",
      descriptor = "I"
   )
   public static int field187;
   @OriginalMember(
      owner = "client!dka",
      name = "A",
      descriptor = "I"
   )
   public static int field188;
   @OriginalMember(
      owner = "client!dka",
      name = "q",
      descriptor = "I"
   )
   public static int field189;
   @OriginalMember(
      owner = "client!dka",
      name = "p",
      descriptor = "I"
   )
   public static int field190;
   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "I"
   )
   public static int field191;
   @OriginalMember(
      owner = "client!dka",
      name = "n",
      descriptor = "I"
   )
   public static int field192;
   @OriginalMember(
      owner = "client!dka",
      name = "v",
      descriptor = "I"
   )
   public static int field194;

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(IBLvs;)V",
      line = 4
   )
   private final void method84(int arg0, byte arg1, class615 arg2) {
      try {
         if (~(4 & this.field184.field8412[arg2.field8924]) != -1 && arg2.field8946 < 0) {
            int var4 = this.field184.field8400[arg2.field8924] / class755.field10967;
            int var5 = (1048575 - (-var4 + arg2.field8932)) / var4;
            arg2.field8932 = arg0 * var4 + arg2.field8932 & 1048575;
            if (var5 <= arg0) {
               label52: {
                  if (~this.field184.field8376[arg2.field8924] == -1) {
                     arg2.field8943 = class742.method5362(arg2.field8938, arg2.field8943.method5375(), arg2.field8943.method5363(), arg2.field8943.method5360());
                     if (!client.field4564) {
                        break label52;
                     }
                  }

                  arg2.field8943 = class742.method5362(arg2.field8938, arg2.field8943.method5375(), 0, arg2.field8943.method5360());
                  this.field184.method4319(arg2, false, ~arg2.field8931.field10807[arg2.field8930] > -1);
               }

               if (~arg2.field8931.field10807[arg2.field8930] > -1) {
                  arg2.field8943.method5385(-1);
               }

               arg0 = arg2.field8932 / var4;
            }
         }

         ++field194;
         if (arg1 != 17) {
            this.method87();
         }

         arg2.field8943.method86(arg0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field195[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field195[2] : field195[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "([III)V",
      line = 46
   )
   public final void method85(int[] param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(I)V",
      line = 88
   )
   public final void method86(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dka",
      name = "d",
      descriptor = "()Lhu;",
      line = 123
   )
   public final class142 method87() {
      boolean var1 = client.field4564;

      try {
         ++field189;

         while(true) {
            class615 var2 = (class615)this.field182.method2583(1);
            if (var2 == null) {
               return null;
            }

            class742 var10000 = var2.field8943;

            while(var10000 != null) {
               var10000 = var2.field8943;
               if (!var1) {
                  return var10000;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field195[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "c",
      descriptor = "()I",
      line = 142
   )
   public final int method88() {
      try {
         ++field190;
         return 0;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field195[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(IIB)V",
      line = 153
   )
   public static final void method89(int arg0, int arg1, byte arg2) {
      try {
         class528.method3957(arg0, arg1, 0);
         if (arg2 > -30) {
            field192 = 79;
         }

         ++field188;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field195[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "b",
      descriptor = "()Lhu;",
      line = 164
   )
   public final class142 method90() {
      try {
         ++field187;
         class615 var1 = (class615)this.field182.method2579(-801);
         if (var1 == null) {
            return null;
         } else {
            return var1.field8943 != null ? var1.field8943 : this.method87();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field195[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "a",
      descriptor = "(IILvs;[III)V",
      line = 183
   )
   private final void method91(int arg0, int arg1, class615 arg2, int[] arg3, int arg4, int arg5) {
      boolean var7 = client.field4564;

      try {
         int var8 = -125 % ((-5 - arg0) / 53);
         if ((4 & this.field184.field8412[arg2.field8924]) != 0 && arg2.field8946 < 0) {
            int var9 = this.field184.field8400[arg2.field8924] / class755.field10967;

            while(true) {
               int var10 = (var9 + 1048575 + -arg2.field8932) / var9;
               if (~arg4 > ~var10) {
                  break;
               }

               arg2.field8943.method85(arg3, arg5, var10);
               arg4 -= var10;
               arg5 += var10;
               arg2.field8932 += var9 * var10 + -1048576;
               int var11 = class755.field10967 / 100;
               int var12 = 262144 / var9;
               if (var11 > var12) {
                  var11 = var12;
               }

               class742 var13;
               label59: {
                  var13 = arg2.field8943;
                  if (~this.field184.field8376[arg2.field8924] != -1) {
                     arg2.field8943 = class742.method5362(arg2.field8938, var13.method5375(), 0, var13.method5360());
                     this.field184.method4319(arg2, false, ~arg2.field8931.field10807[arg2.field8930] > -1);
                     arg2.field8943.method5352(var11, var13.method5363());
                     if (!var7) {
                        break label59;
                     }
                  }

                  arg2.field8943 = class742.method5362(arg2.field8938, var13.method5375(), var13.method5363(), var13.method5360());
               }

               if (arg2.field8931.field10807[arg2.field8930] < 0) {
                  arg2.field8943.method5385(-1);
               }

               var13.method5364(var11);
               var13.method85(arg3, arg5, arg1 - arg5);
               if (var13.method5357()) {
                  this.field193.method1603(var13);
                  if (var7) {
                     return;
                  }

                  if (var7) {
                     break;
                  }
               }
            }

            arg2.field8932 += arg4 * var9;
         }

         ++field183;
         arg2.field8943.method85(arg3, arg5, arg4);
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field195[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field195[2] : field195[1]) + ',' + (arg3 != null ? field195[2] : field195[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "<init>",
      descriptor = "(Lpo;)V",
      line = 256
   )
   public class13(class582 arg0) {
      try {
         this.field184 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field195[4] + (arg0 != null ? field195[2] : field195[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method92(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method93(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
