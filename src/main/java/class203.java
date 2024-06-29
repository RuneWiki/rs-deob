import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class203 {
   @OriginalMember(
      owner = "client!m",
      name = "d",
      descriptor = "Ltv;"
   )
   public class590 field2491 = new class590(20);
   @OriginalMember(
      owner = "client!m",
      name = "f",
      descriptor = "Ltv;"
   )
   private class590 field2497 = new class590(64);
   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "Lqh;"
   )
   public class74 field2488;
   @OriginalMember(
      owner = "client!m",
      name = "k",
      descriptor = "Lqh;"
   )
   private class74 field2494;
   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2499 = new String[]{method1534(method1533("uf\u0005.")), method1534(method1533("cfi(.")), method1534(method1533("v=+j")), method1534(method1533("uf\u0001.")), method1534(method1533("uf\u0000.")), method1534(method1533("uf\u0004.")), method1534(method1533("uf\u0006.")), method1534(method1533("uf{o=q<y.")), method1534(method1533("uf\u0002.")), method1534(method1533("uf\u0003."))};
   @OriginalMember(
      owner = "client!m",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2495 = "";
   @OriginalMember(
      owner = "client!m",
      name = "j",
      descriptor = "I"
   )
   public static int field2487;
   @OriginalMember(
      owner = "client!m",
      name = "b",
      descriptor = "I"
   )
   public static int field2489;
   @OriginalMember(
      owner = "client!m",
      name = "h",
      descriptor = "I"
   )
   public static int field2490;
   @OriginalMember(
      owner = "client!m",
      name = "l",
      descriptor = "I"
   )
   public static int field2492;
   @OriginalMember(
      owner = "client!m",
      name = "i",
      descriptor = "I"
   )
   public static int field2493;
   @OriginalMember(
      owner = "client!m",
      name = "c",
      descriptor = "I"
   )
   public static int field2496;
   @OriginalMember(
      owner = "client!m",
      name = "g",
      descriptor = "I"
   )
   public static int field2498;

   @OriginalMember(
      owner = "client!m",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1526(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1527(int arg0) {
      try {
         class590 var2 = this.field2497;
         synchronized(this.field2497) {
            this.field2497.method4245(true);
         }

         ++field2493;
         class590 var3 = this.field2491;
         synchronized(this.field2491) {
            this.field2491.method4245(true);
            if (arg0 != 0) {
               this.field2497 = null;
            }

         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2499[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1528(byte arg0) {
      try {
         if (arg0 != 16) {
            method1528((byte)42);
         }

         field2495 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2499[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(ZI)Liv;"
   )
   public final class106 method1529(boolean arg0, int arg1) {
      try {
         ++field2498;
         class590 var3 = this.field2497;
         class106 var4;
         synchronized(this.field2497) {
            if (!arg0) {
               this.field2491 = null;
            }

            var4 = (class106)this.field2497.method4239((long)arg1, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field2494;
            byte[] var6;
            synchronized(this.field2494) {
               var6 = this.field2494.method732(arg1, 46, (byte)100);
            }

            class106 var7 = new class106();
            var7.field1353 = this;
            if (var6 != null) {
               var7.method944(5, new class594(var6));
            }

            class590 var8 = this.field2497;
            synchronized(this.field2497) {
               this.field2497.method4238(42, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2499[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method1530(byte arg0) {
      try {
         ++field2487;
         class590 var2 = this.field2497;
         synchronized(this.field2497) {
            this.field2497.method4244(true);
            if (arg0 < 45) {
               this.method1527(23);
            }
         }

         class590 var3 = this.field2491;
         synchronized(this.field2491) {
            this.field2491.method4244(true);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2499[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(IIIII[[[BILha;IIIIZ)V"
   )
   public static final void method1531(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int arg6, class65 arg7, int arg8, int arg9, int arg10, int arg11, boolean arg12) {
      try {
         ++field2490;
         if (arg6 != 0 && arg3 != 0) {
            if (arg6 == 9) {
               arg6 = 1;
               arg4 = arg4 + 1 & 3;
            }

            if (arg12) {
               field2495 = null;
            }

            if (~arg6 == -11) {
               arg4 = arg4 + 3 & 3;
               arg6 = 1;
            }

            if (~arg6 == -12) {
               arg6 = 8;
               arg4 = arg4 + 3 & 3;
            }

            arg7.method515(arg2, arg10, arg0, arg8, arg1, arg9, arg5[arg6 - 1][arg4], arg3, arg11);
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field2499[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2499[1] : field2499[2]) + ',' + arg6 + ',' + (arg7 != null ? field2499[1] : field2499[2]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1532(int arg0, int arg1) {
      try {
         ++field2489;
         class590 var3 = this.field2497;
         synchronized(this.field2497) {
            this.field2497.method4234(2, arg0);
         }

         class590 var4 = this.field2491;
         synchronized(this.field2491) {
            if (arg1 != 0) {
               this.method1527(66);
            }

            this.field2491.method4234(2, arg0);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2499[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "<init>",
      descriptor = "(Lnc;ILqh;Lqh;)V"
   )
   public class203(class26 arg0, int arg1, class74 arg2, class74 arg3) {
      try {
         this.field2488 = arg3;
         this.field2494 = arg2;
         this.field2494.method727(46, -32767);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2499[7] + (arg0 != null ? field2499[1] : field2499[2]) + ',' + arg1 + ',' + (arg2 != null ? field2499[1] : field2499[2]) + ',' + (arg3 != null ? field2499[1] : field2499[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1533(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!m",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1534(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
