import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class130 extends class55 {
   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1666 = new String[]{method1036(method1035("\u0018Tv ,")), method1036(method1035("\u0018Tv#,")), method1036(method1035("\u0018Tv$,")), method1036(method1035("\u0018Tv),")), method1036(method1035("\u0018Tv*,")), method1036(method1035("\u001cK4\r")), method1036(method1035("\t\u0010vOy")), method1036(method1035("\u0018Tv&,")), method1036(method1035("\u0018Tv%,")), method1036(method1035("\u0018Tv\",")), method1036(method1035("\u0018Tv+,")), method1036(method1035("\u0018Tv(,")), method1036(method1035("\u0018Tv',"))};
   @OriginalMember(
      owner = "client!jj",
      name = "j",
      descriptor = "I"
   )
   public static int field1661 = 0;
   @OriginalMember(
      owner = "client!jj",
      name = "l",
      descriptor = "[[I"
   )
   public static int[][] field1657 = new int[][]{{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!jj",
      name = "i",
      descriptor = "Llea;"
   )
   public static class639 field1663 = new class639(4, 16);
   @OriginalMember(
      owner = "client!jj",
      name = "p",
      descriptor = "I"
   )
   public static int field1652;
   @OriginalMember(
      owner = "client!jj",
      name = "g",
      descriptor = "I"
   )
   public static int field1653;
   @OriginalMember(
      owner = "client!jj",
      name = "f",
      descriptor = "I"
   )
   public static int field1654;
   @OriginalMember(
      owner = "client!jj",
      name = "o",
      descriptor = "I"
   )
   public static int field1655;
   @OriginalMember(
      owner = "client!jj",
      name = "k",
      descriptor = "I"
   )
   public static int field1656;
   @OriginalMember(
      owner = "client!jj",
      name = "h",
      descriptor = "I"
   )
   public static int field1658;
   @OriginalMember(
      owner = "client!jj",
      name = "e",
      descriptor = "I"
   )
   public static int field1659;
   @OriginalMember(
      owner = "client!jj",
      name = "n",
      descriptor = "I"
   )
   public static int field1660;
   @OriginalMember(
      owner = "client!jj",
      name = "m",
      descriptor = "I"
   )
   public static int field1662;
   @OriginalMember(
      owner = "client!jj",
      name = "r",
      descriptor = "I"
   )
   public static int field1664;
   @OriginalMember(
      owner = "client!jj",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field1665;

   @OriginalMember(
      owner = "client!jj",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 6
   )
   public class130(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jj",
      name = "c",
      descriptor = "(I)I",
      line = 9
   )
   public final int method1028(int arg0) {
      try {
         int var2 = -62 % ((36 - arg0) / 41);
         ++field1655;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1666[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "c",
      descriptor = "(B)V",
      line = 19
   )
   public static void method1029(byte arg0) {
      try {
         if (arg0 > 3) {
            field1663 = null;
            field1665 = null;
            field1657 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1666[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 31
   )
   public class130(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jj",
      name = "b",
      descriptor = "(I)I",
      line = 36
   )
   public final int method101(int arg0) {
      try {
         if (arg0 >= -116) {
            return -83;
         } else {
            ++field1656;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1666[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(B)Z",
      line = 51
   )
   public final boolean method1030(byte arg0) {
      try {
         if (arg0 != 120) {
            this.method1028(39);
         }

         ++field1664;
         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1666[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(I)V",
      line = 64
   )
   public final void method98(int arg0) {
      try {
         if (this.method1033((byte)-97)) {
            if (super.field683.field6419.method386(3) && !class754.method5472(super.field683.field6419.method391(111), (byte)-115)) {
               super.field680 = 1;
            }

            if (~super.field683.field6410.method2725(arg0 ^ 110) == -2) {
               super.field680 = 1;
            }
         }

         if (arg0 != 0) {
            field1663 = null;
         }

         ++field1653;
         if (super.field680 == 3) {
            super.field680 = 2;
         }

         if (~super.field680 > -1 || super.field680 > 3) {
            super.field680 = this.method101(-122);
         }

      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1666[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(ILbl;)Lbl;",
      line = 94
   )
   public static final class678 method1031(int arg0, class678 arg1) {
      boolean var2 = client.field4360;

      try {
         ++field1659;
         if (~arg1.field9892 != 0) {
            return class602.method4379((byte)-124, arg1.field9892);
         } else {
            if (arg0 <= 92) {
               method1029((byte)33);
            }

            int var3 = arg1.field9854 >>> 16;
            class607 var4 = new class607(class191.field2708);
            class561 var5 = (class561)var4.method4422((byte)21);
            if (var2) {
               if (~var5.field8021 == ~var3) {
                  return class602.method4379((byte)-124, (int)var5.field6137);
               }

               var5 = (class561)var4.method4423((byte)-125);
            }

            while(true) {
               while(var5 != null) {
                  if (~var5.field8021 == ~var3) {
                     return class602.method4379((byte)-124, (int)var5.field6137);
                  }

                  var5 = (class561)var4.method4423((byte)-125);
               }

               if (!var2) {
                  return null;
               }

               var5 = (class561)var4.method4423((byte)-125);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1666[4] + arg0 + ',' + (arg1 != null ? field1666[6] : field1666[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(IZI)Z",
      line = 124
   )
   public static final boolean method1032(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            method1032(111, false, 86);
         }

         ++field1652;
         if (!(class583.method4252(arg2, arg0, (byte)-102) | (65536 & arg2) != 0) && !class403.method3041(arg2, arg0, 0)) {
            return (arg0 & 55) == 0 && class326.method2410(false, arg2, arg0);
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1666[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "b",
      descriptor = "(B)Z",
      line = 138
   )
   public final boolean method1033(byte arg0) {
      try {
         ++field1658;
         int var2 = -20 % ((-13 - arg0) / 37);
         return class699.method5081(super.field680, (byte)127);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1666[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(IB)I",
      line = 148
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field1654;
         if (arg1 != 105) {
            this.method96(-118, (byte)-8);
         }

         if (class699.method5081(arg0, (byte)127)) {
            if (super.field683.field6419.method386(3) && !class754.method5472(super.field683.field6419.method391(78), (byte)-101)) {
               return 3;
            }

            if (super.field683.field6410.method2725(85) == 1) {
               return 3;
            }
         }

         if (arg0 == 3) {
            return 3;
         } else {
            return class699.method5081(arg0, (byte)127) ? 2 : 1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1666[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "b",
      descriptor = "(IB)V",
      line = 184
   )
   public final void method96(int arg0, byte arg1) {
      try {
         ++field1660;
         int var3 = -2 % ((47 - arg1) / 46);
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1666[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 195
   )
   public static final void method1034(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg4 == -11987) {
            ++field1662;
            if (~class457.field6528 >= ~arg0 && ~class348.field4702 <= ~arg5 && arg2 >= class245.field3374 && ~class699.field10237 <= ~arg1) {
               class156.method1311((byte)-104, arg2, arg1, arg5, arg0, arg3);
            } else {
               class185.method1475(arg1, arg5, arg2, -107, arg3, arg0);
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1666[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1035(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1036(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
