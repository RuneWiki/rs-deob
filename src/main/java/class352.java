import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class352 extends class555 {
   @OriginalMember(
      owner = "client!pba",
      name = "q",
      descriptor = "Z"
   )
   public boolean field5029 = false;
   @OriginalMember(
      owner = "client!pba",
      name = "h",
      descriptor = "Z"
   )
   private boolean field5032 = true;
   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5037 = new String[]{method2775(method2774("q4r},)")), method2775(method2774("q4r}\")")), method2775(method2774("q4r}$)")), method2775(method2774("k7t7\u001f")), method2775(method2774("q4r}!)")), method2775(method2774("q4r} )")), method2775(method2774("q4r}.)")), method2775(method2774("q4r}%)")), method2775(method2774("q4r}#)")), method2775(method2774("q4r}/)")), method2775(method2774("q4r}-)")), method2775(method2774("q4r}&)"))};
   @OriginalMember(
      owner = "client!pba",
      name = "n",
      descriptor = "Lnw;"
   )
   public static class616 field5031 = new class616(65, -1);
   @OriginalMember(
      owner = "client!pba",
      name = "f",
      descriptor = "F"
   )
   public static float field5024;
   @OriginalMember(
      owner = "client!pba",
      name = "l",
      descriptor = "I"
   )
   public static int field5023;
   @OriginalMember(
      owner = "client!pba",
      name = "o",
      descriptor = "I"
   )
   public static int field5025;
   @OriginalMember(
      owner = "client!pba",
      name = "g",
      descriptor = "I"
   )
   public static int field5026;
   @OriginalMember(
      owner = "client!pba",
      name = "j",
      descriptor = "I"
   )
   public static int field5027;
   @OriginalMember(
      owner = "client!pba",
      name = "r",
      descriptor = "I"
   )
   public static int field5028;
   @OriginalMember(
      owner = "client!pba",
      name = "i",
      descriptor = "I"
   )
   public static int field5030;
   @OriginalMember(
      owner = "client!pba",
      name = "k",
      descriptor = "I"
   )
   public static int field5033;
   @OriginalMember(
      owner = "client!pba",
      name = "s",
      descriptor = "I"
   )
   public static int field5034;
   @OriginalMember(
      owner = "client!pba",
      name = "m",
      descriptor = "I"
   )
   public static int field5035;
   @OriginalMember(
      owner = "client!pba",
      name = "p",
      descriptor = "I"
   )
   public static int field5036;

   @OriginalMember(
      owner = "client!pba",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class352(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pba",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class352(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field5036;
         if (arg1 <= 36) {
            this.field5029 = true;
         }

         if (!super.field7633.method4408(-113).method1277(true)) {
            return 3;
         } else {
            return arg0 == 3 && !class675.method4948(field5037[3], -113) ? 3 : 2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5037[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         this.field5029 = true;
         ++field5023;
         if (arg0 < 124) {
            return 112;
         } else {
            return !super.field7633.method4408(-126).method1277(true) ? 0 : 2;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5037[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "d",
      descriptor = "(B)V"
   )
   public static final void method2767(byte arg0) {
      try {
         if (arg0 >= -51) {
            method2772(-68);
         }

         ++field5028;
         class737.method5340(true);
         class736.method5336((byte)96);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5037[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "a",
      descriptor = "(IIIIIBI)V"
   )
   public static final void method2768(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
      try {
         if (class674.field9907.field8453.method5190((byte)-96) != 0 && arg6 != 0 && ~class56.field610 > -51 && arg2 != -1) {
            class701.field10206[class56.field610++] = new class693((byte)1, arg2, arg6, arg0, arg4, arg3, arg1, (class80)null);
         }

         int var7 = 96 % ((-6 - arg5) / 58);
         ++field5026;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field5037[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         ++field5033;
         this.field5029 = false;
         int var3 = 95 / ((12 - arg1) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5037[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method2769(byte arg0) {
      try {
         if (arg0 != -107) {
            return false;
         } else {
            ++field5027;
            return super.field7633.method4408(-118).method1277(true);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5037[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method2770(byte arg0) {
      try {
         ++field5035;
         if (arg0 >= -61) {
            this.method635(75);
         }

         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5037[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         if (!super.field7633.method4408(arg0 ^ 13815).method1277(true)) {
            super.field7632 = 0;
         }

         if (arg0 != -13712) {
            field5031 = null;
         }

         ++field5034;
         if (~super.field7632 > -1 || ~super.field7632 < -6) {
            super.field7632 = this.method635(arg0 ^ -13811);
         }

      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5037[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method2771(int arg0) {
      try {
         ++field5025;
         if (arg0 != 3) {
            field5031 = null;
         }

         return this.field5032;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5037[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2772(int arg0) {
      try {
         field5031 = null;
         if (arg0 != 3) {
            field5024 = -0.4954454F;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5037[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method2773(boolean arg0, int arg1) {
      try {
         this.field5032 = arg0;
         int var3 = -95 / ((arg1 - 87) / 39);
         ++field5030;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5037[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2774(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2775(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
