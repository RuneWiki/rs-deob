import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class275 {
   @OriginalMember(
      owner = "client!mda",
      name = "j",
      descriptor = "B"
   )
   private byte field3840;
   @OriginalMember(
      owner = "client!mda",
      name = "g",
      descriptor = "I"
   )
   public int field3838;
   @OriginalMember(
      owner = "client!mda",
      name = "e",
      descriptor = "I"
   )
   public int field3833;
   @OriginalMember(
      owner = "client!mda",
      name = "h",
      descriptor = "I"
   )
   public int field3839;
   @OriginalMember(
      owner = "client!mda",
      name = "i",
      descriptor = "I"
   )
   public int field3841;
   @OriginalMember(
      owner = "client!mda",
      name = "c",
      descriptor = "I"
   )
   public int field3831;
   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3843 = new String[]{method2123(method2122("ruu8u7")), method2123(method2122("ruu8r7")), method2123(method2122("ruu8v7")), method2123(method2122("ruu8p7")), method2123(method2122("ruu8\u000fv\u007f}b\r7")), method2123(method2122("qdxz")), method2123(method2122("d?:8N")), method2123(method2122("ruu8q7"))};
   @OriginalMember(
      owner = "client!mda",
      name = "k",
      descriptor = "[Z"
   )
   public static boolean[] field3835 = new boolean[100];
   @OriginalMember(
      owner = "client!mda",
      name = "f",
      descriptor = "I"
   )
   public static int field3832;
   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "I"
   )
   public static int field3834;
   @OriginalMember(
      owner = "client!mda",
      name = "d",
      descriptor = "I"
   )
   public static int field3836;
   @OriginalMember(
      owner = "client!mda",
      name = "b",
      descriptor = "I"
   )
   public static int field3837;
   @OriginalMember(
      owner = "client!mda",
      name = "l",
      descriptor = "I"
   )
   public static int field3842;

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(Lvs;III)V"
   )
   public static final void method2116(class616 arg0, int arg1, int arg2, int arg3) {
      if (arg2 < class239.field3036) {
         class72 var4 = class353.field5360[arg1][arg2 + 1][arg3];
         if (var4 != null && var4.field919 != null && var4.field919.method19((byte)70)) {
            arg0.method18(class768.field11264, class261.field3550, 0, true, 0, (byte)108, var4.field919);
         }
      }

      if (arg3 < class239.field3036) {
         class72 var5 = class353.field5360[arg1][arg2][arg3 + 1];
         if (var5 != null && var5.field919 != null && var5.field919.method19((byte)70)) {
            arg0.method18(0, class261.field3550, 0, true, class768.field11264, (byte)100, var5.field919);
         }
      }

      if (arg2 < class239.field3036 && arg3 < class220.field2796) {
         class72 var6 = class353.field5360[arg1][arg2 + 1][arg3 + 1];
         if (var6 != null && var6.field919 != null && var6.field919.method19((byte)70)) {
            arg0.method18(class768.field11264, class261.field3550, 0, true, class768.field11264, (byte)120, var6.field919);
         }
      }

      if (arg2 < class239.field3036 && arg3 > 0) {
         class72 var7 = class353.field5360[arg1][arg2 + 1][arg3 - 1];
         if (var7 != null && var7.field919 != null && var7.field919.method19((byte)70)) {
            arg0.method18(class768.field11264, class261.field3550, 0, true, -class768.field11264, (byte)103, var7.field919);
         }
      }

   }

   @OriginalMember(
      owner = "client!mda",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2117(int arg0) {
      try {
         if (arg0 != 35) {
            this.field3841 = 44;
         }

         ++field3832;
         return ~(8 & this.field3840) != -9 ? 0 : 1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3843[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2118(int arg0) {
      try {
         field3835 = null;
         if (arg0 != -8) {
            method2118(-63);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3843[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method2119(int arg0) {
      try {
         ++field3834;
         return arg0 != 0 ? 88 : this.field3840 & 7;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3843[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method2120(int arg0, byte arg1) {
      try {
         ++field3836;
         class448.field6805 = 2;
         class149.field1859 = arg0;
         String var2 = null;
         if (class402.field6179 != null) {
            class128 var3 = new class128(class402.field6179);
            var2 = class240.method1790(37, var3.method1063(109));
            class256.field3450 = var3.method1063(103);
         }

         if (arg1 <= 125) {
            method2118(9);
         }

         if (var2 == null) {
            class553.method4089((byte)-81, 35);
         } else {
            class18.method127(false, var2, true, 0, "");
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3843[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method2121(int arg0, byte arg1, int arg2) {
      try {
         ++field3842;
         class403 var3 = class453.method3410((long)arg2 << 32 | (long)arg0, true, 19);
         var3.method3096((byte)-93);
         int var4 = -34 % ((arg1 - -50) / 62);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3843[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "<init>",
      descriptor = "()V"
   )
   public class275() {
   }

   @OriginalMember(
      owner = "client!mda",
      name = "<init>",
      descriptor = "(Ljj;)V"
   )
   public class275(class128 arg0) {
      try {
         this.field3840 = arg0.method1047((byte)30);
         this.field3838 = arg0.method1038((byte)-117);
         this.field3833 = arg0.method1041(4758);
         this.field3839 = arg0.method1041(4758);
         this.field3841 = arg0.method1041(4758);
         this.field3831 = arg0.method1041(4758);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3843[4] + (arg0 != null ? field3843[6] : field3843[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2122(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2123(char[] arg0) {
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
            var10005 = 17;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
