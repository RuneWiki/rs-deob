import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class643 extends class557 {
   @OriginalMember(
      owner = "client!im",
      name = "n",
      descriptor = "Z"
   )
   private boolean field9043 = true;
   @OriginalMember(
      owner = "client!im",
      name = "k",
      descriptor = "Z"
   )
   public boolean field9049 = false;
   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9055 = new String[]{method4683(method4682("h,P5*")), method4683(method4682("h,P0*")), method4683(method4682("h,P3*")), method4683(method4682("h,P1*")), method4683(method4682("h,P6*")), method4683(method4682("h,P4*")), method4683(method4682("h,P8*")), method4683(method4682("k \u0019\u0016z")), method4683(method4682("h,P;*")), method4683(method4682("h,P:*")), method4683(method4682("o4\u0012\u001e")), method4683(method4682("zoP\\\u007f")), method4683(method4682("h,P7*"))};
   @OriginalMember(
      owner = "client!im",
      name = "r",
      descriptor = "I"
   )
   public static int field9042;
   @OriginalMember(
      owner = "client!im",
      name = "i",
      descriptor = "I"
   )
   public static int field9044;
   @OriginalMember(
      owner = "client!im",
      name = "h",
      descriptor = "I"
   )
   public static int field9045;
   @OriginalMember(
      owner = "client!im",
      name = "s",
      descriptor = "I"
   )
   public static int field9046;
   @OriginalMember(
      owner = "client!im",
      name = "o",
      descriptor = "I"
   )
   public static int field9047;
   @OriginalMember(
      owner = "client!im",
      name = "t",
      descriptor = "I"
   )
   public static int field9048;
   @OriginalMember(
      owner = "client!im",
      name = "l",
      descriptor = "I"
   )
   public static int field9051;
   @OriginalMember(
      owner = "client!im",
      name = "p",
      descriptor = "I"
   )
   public static int field9052;
   @OriginalMember(
      owner = "client!im",
      name = "u",
      descriptor = "I"
   )
   public static int field9053;
   @OriginalMember(
      owner = "client!im",
      name = "j",
      descriptor = "I"
   )
   public static int field9054;
   @OriginalMember(
      owner = "client!im",
      name = "q",
      descriptor = "[Lma;"
   )
   public static class148[] field9041;
   @OriginalMember(
      owner = "client!im",
      name = "m",
      descriptor = "[[[B"
   )
   public static byte[][][] field9050;

   @OriginalMember(
      owner = "client!im",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4676(int arg0) {
      try {
         if (arg0 > -52) {
            this.method98((byte)-6);
         }

         ++field9054;
         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9055[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4677(int arg0) {
      try {
         if (arg0 == 25431) {
            field9041 = null;
            field9050 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9055[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(IIIZJLjava/lang/String;IZILjava/lang/String;JIZ)V"
   )
   public static final void method4678(int arg0, int arg1, int arg2, boolean arg3, long arg4, String arg5, int arg6, boolean arg7, int arg8, String arg9, long arg10, int arg11, boolean arg12) {
      try {
         ++field9045;
         if (!class678.field9669 && class687.field9909 < 500) {
            int var18 = ~arg11 == arg1 ? class357.field5276 : arg11;
            class272 var15 = new class272(arg9, arg5, var18, arg2, arg6, arg10, arg0, arg8, arg3, arg12, arg4, arg7);
            class11.method96(false, var15);
         }
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field9055[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field9055[11] : field9055[10]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field9055[11] : field9055[10]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (!super.field7906.method4714((byte)-40).method5257((byte)5)) {
            super.field7905 = 0;
         }

         ++field9044;
         if (~super.field7905 > -1 || ~super.field7905 < -6) {
            super.field7905 = this.method97(0);
         }

         if (arg0 != -22) {
            this.method4680(true, -32);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9055[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field9047;
         if (!super.field7906.method4714((byte)-40).method5257((byte)26)) {
            return 3;
         } else if (arg1 == 3 && !class230.method2049(25243, field9055[7])) {
            return 3;
         } else {
            return arg0 != 1 ? 84 : 2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9055[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method4679(boolean arg0) {
      try {
         ++field9042;
         if (!arg0) {
            this.method4679(true);
         }

         return this.field9043;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9055[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class643(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method4680(boolean arg0, int arg1) {
      try {
         this.field9043 = arg0;
         ++field9053;
         if (arg1 != 3) {
            field9041 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9055[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field9051;
         if (arg0 != 0) {
            this.field9049 = false;
         }

         this.field9049 = true;
         return !super.field7906.method4714((byte)-40).method5257((byte)81) ? 0 : 2;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9055[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         this.field9049 = false;
         if (arg1) {
            ++field9048;
            super.field7905 = arg0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9055[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class643(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!im",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method4681(byte arg0) {
      try {
         ++field9052;
         if (!super.field7906.method4714((byte)-40).method5257((byte)23)) {
            return false;
         } else {
            return arg0 != 108 ? true : true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9055[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4682(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4683(char[] arg0) {
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
            var10005 = 65;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
