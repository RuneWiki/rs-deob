import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class141 implements class678 {
   @OriginalMember(
      owner = "client!hu",
      name = "e",
      descriptor = "I"
   )
   public int field1889;
   @OriginalMember(
      owner = "client!hu",
      name = "b",
      descriptor = "I"
   )
   public int field1888;
   @OriginalMember(
      owner = "client!hu",
      name = "g",
      descriptor = "Lsq;"
   )
   public class190 field1883;
   @OriginalMember(
      owner = "client!hu",
      name = "j",
      descriptor = "I"
   )
   public int field1877;
   @OriginalMember(
      owner = "client!hu",
      name = "p",
      descriptor = "I"
   )
   public int field1880;
   @OriginalMember(
      owner = "client!hu",
      name = "k",
      descriptor = "Ljh;"
   )
   public class169 field1882;
   @OriginalMember(
      owner = "client!hu",
      name = "d",
      descriptor = "I"
   )
   public int field1879;
   @OriginalMember(
      owner = "client!hu",
      name = "o",
      descriptor = "I"
   )
   public int field1891;
   @OriginalMember(
      owner = "client!hu",
      name = "c",
      descriptor = "I"
   )
   public int field1884;
   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public String field1875;
   @OriginalMember(
      owner = "client!hu",
      name = "m",
      descriptor = "I"
   )
   public int field1876;
   @OriginalMember(
      owner = "client!hu",
      name = "f",
      descriptor = "I"
   )
   public int field1881;
   @OriginalMember(
      owner = "client!hu",
      name = "n",
      descriptor = "I"
   )
   public int field1885;
   @OriginalMember(
      owner = "client!hu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1892 = new String[]{method1209(method1208("nh\u001a\t\u0015")), method1209(method1208("nh\u001a\n\u0015")), method1209(method1208("hhX'")), method1209(method1208("}3\u001ae@")), method1209(method1208("nh\u001a\b\u0015")), method1209(method1208("nh\u001awTht@u\u0015")), method1209(method1208("nh\u001a\u000f\u0015")), method1209(method1208("nh\u001a\u000e\u0015"))};
   @OriginalMember(
      owner = "client!hu",
      name = "q",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field1886 = new BigInteger(method1209(method1208("dx\u0004{\b0~\u0006}Xb+\u0000s\u000e6{\u0007-\r2.\r([d*W\u007f\u000ee,U|\b2\u007fU/\u000f5xQ|\u000b4%\u0007r\t5,U|\rc.Q-\u00054,V}\re{\r)Xe)\u0003}\u000e6%\u0000}\u000b>(Pr\u000f?*Ry\u000ed~W.X5(R{\u000fb\u007fU-\t6~P\u007f_d%\u0002s\u00041-Q*\tb-\u0006}_`$\u0003")), 16);
   @OriginalMember(
      owner = "client!hu",
      name = "l",
      descriptor = "I"
   )
   public static int field1874;
   @OriginalMember(
      owner = "client!hu",
      name = "i",
      descriptor = "I"
   )
   public static int field1878;
   @OriginalMember(
      owner = "client!hu",
      name = "h",
      descriptor = "I"
   )
   public static int field1887;
   @OriginalMember(
      owner = "client!hu",
      name = "r",
      descriptor = "I"
   )
   public static int field1890;

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(Lqh;[IZLqh;)V"
   )
   public static final void method1204(class74 arg0, int[] arg1, boolean arg2, class74 arg3) {
      try {
         if (arg1 != null) {
            class671.field9873 = arg1;
         }

         class240.field2987 = arg0;
         class14.field185 = arg3;
         ++field1878;
         if (arg2) {
            field1886 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1892[6] + (arg0 != null ? field1892[3] : field1892[2]) + ',' + (arg1 != null ? field1892[3] : field1892[2]) + ',' + arg2 + ',' + (arg3 != null ? field1892[3] : field1892[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public final class365 method19(int arg0) {
      try {
         int var2 = -52 % ((arg0 - 1) / 55);
         ++field1887;
         return class480.field6638;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1892[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1205(int arg0, int arg1) {
      try {
         if (arg0 != -6140) {
            return false;
         } else {
            ++field1890;
            return ~arg1 == -4 || ~arg1 == -8 || arg1 == 9 || arg1 == 11;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1892[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1206(int arg0) {
      try {
         if (arg0 != 16) {
            method1207((String)null, (String)null, (String)null, (String)null, true);
         }

         field1886 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1892[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z"
   )
   public static final boolean method1207(String arg0, String arg1, String arg2, String arg3, boolean arg4) {
      try {
         ++field1874;
         if (!arg4) {
            field1886 = null;
         }

         if (arg3 != null && arg2 != null) {
            return !arg3.startsWith("#") && !arg2.startsWith("#") ? arg0.equals(arg1) : arg3.equals(arg2);
         } else {
            return false;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1892[4] + (arg0 != null ? field1892[3] : field1892[2]) + ',' + (arg1 != null ? field1892[3] : field1892[2]) + ',' + (arg2 != null ? field1892[3] : field1892[2]) + ',' + (arg3 != null ? field1892[3] : field1892[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Lsq;Ljh;IIIIIIIIII)V"
   )
   public class141(String arg0, class190 arg1, class169 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         this.field1889 = arg11;
         this.field1888 = arg10;
         this.field1883 = arg1;
         this.field1877 = arg8;
         this.field1880 = arg3;
         this.field1882 = arg2;
         this.field1879 = arg5;
         this.field1891 = arg7;
         this.field1884 = arg9;
         this.field1875 = arg0;
         this.field1876 = arg12;
         this.field1881 = arg6;
         this.field1885 = arg4;
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field1892[5] + (arg0 != null ? field1892[3] : field1892[2]) + ',' + (arg1 != null ? field1892[3] : field1892[2]) + ',' + (arg2 != null ? field1892[3] : field1892[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1208(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1209(char[] arg0) {
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
            var10005 = 29;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
