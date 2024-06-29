import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class679 extends class67 {
   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10135 = new String[]{method5034(method5033("\bh\\*1")), method5034(method5033("\bh\\ 1")), method5034(method5033("\bh\\/1")), method5034(method5033("\bh\\)1")), method5034(method5033("\bh\\+1")), method5034(method5033("\bh\\-1"))};
   @OriginalMember(
      owner = "client!be",
      name = "p",
      descriptor = "I"
   )
   public static int field10129;
   @OriginalMember(
      owner = "client!be",
      name = "m",
      descriptor = "I"
   )
   public static int field10130;
   @OriginalMember(
      owner = "client!be",
      name = "l",
      descriptor = "I"
   )
   public static int field10131;
   @OriginalMember(
      owner = "client!be",
      name = "o",
      descriptor = "I"
   )
   public static int field10132;
   @OriginalMember(
      owner = "client!be",
      name = "k",
      descriptor = "I"
   )
   public static int field10133;
   @OriginalMember(
      owner = "client!be",
      name = "n",
      descriptor = "I"
   )
   public static int field10134;

   @OriginalMember(
      owner = "client!be",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method5030(int arg0) {
      try {
         ++field10130;
         return arg0 != 480102311 ? 62 : super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10135[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class679(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class679(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!be",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         ++field10132;
         return arg0 != 0 ? 122 : 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10135[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 > -74) {
            return 86;
         } else {
            ++field10134;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10135[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         if (!arg1) {
            this.method161(-59, 9);
         }

         ++field10129;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10135[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (arg0 == -69) {
            if (super.field877 != 1 && ~super.field877 != -1) {
               super.field877 = this.method162(arg0 ^ -69);
            }

            ++field10131;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10135[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(IIIIBIIIZ)Z"
   )
   public static final boolean method5031(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, boolean arg8) {
      try {
         ++field10133;
         int var9 = class476.field7251.field1683[0];
         int var10 = class476.field7251.field1685[0];
         if (var9 >= 0 && var9 < class513.field7828 && ~var10 <= -1 && class475.field7230 > var10) {
            if (arg4 != -38) {
               method5032();
            }

            if (~arg2 <= -1 && arg2 < class513.field7828 && ~arg6 <= -1 && class475.field7230 > arg6) {
               int var11 = class243.method2069(arg1, arg6, 10, arg7, var9, arg3, arg5, class1.field5, class221.field3326[class476.field7251.field1506], class476.field7251.method61((byte)70), var10, arg2, class284.field4489, arg8, arg0);
               if (var11 < 1) {
                  return false;
               } else {
                  class745.field11066 = class1.field5[var11 + -1];
                  class581.field8579 = class284.field4489[var11 + -1];
                  class227.field3443 = false;
                  class218.method1882(true);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10135[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "b",
      descriptor = "()V"
   )
   public static final void method5032() {
      for(int var0 = class684.field10177; var0 < class461.field7016; ++var0) {
         for(int var1 = 0; var1 < class247.field3734; ++var1) {
            for(int var2 = 0; var2 < class365.field5634; ++var2) {
               class190 var3 = class711.field10694[var0][var1][var2];
               if (var3 != null) {
                  class269 var4 = var3.field2960;
                  class269 var5 = var3.field2955;
                  if (var4 != null && var4.method45((byte)-126)) {
                     class195.method1729(var4, var0, var1, var2, 1, 1);
                     if (var5 != null && var5.method45((byte)-117)) {
                        class195.method1729(var5, var0, var1, var2, 1, 1);
                        var5.method44(0, 0, 0, class546.field8193, false, 0, var4);
                        var5.method57(-115);
                     }

                     var4.method57(83);
                  }

                  for(class605 var6 = var3.field2962; var6 != null; var6 = var6.field8840) {
                     class78 var8 = var6.field8839;
                     if (var8 != null && var8.method45((byte)-121)) {
                        class195.method1729(var8, var0, var1, var2, var8.field1042 - var8.field1040 + 1, var8.field1049 - var8.field1044 + 1);
                        var8.method57(-124);
                     }
                  }

                  class462 var7 = var3.field2952;
                  if (var7 != null && var7.method45((byte)-124)) {
                     class416.method3320(var7, var0, var1, var2);
                     var7.method57(-124);
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5033(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5034(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
