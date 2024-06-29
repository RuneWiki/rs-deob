import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class534 extends class147 {
   @OriginalMember(
      owner = "client!bda",
      name = "cc",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7620 = new String[]{method3853(method3852("YRPz>\u0013")), method3853(method3852("UC]8")), method3853(method3852("@\u0018\u001fz\b")), method3853(method3852("YRPz7\u0013")), method3853(method3852("YRPz2\u0013")), method3853(method3852("YRPz=\u0013")), method3853(method3852("YRPz?\u0013")), method3853(method3852("YRPz4\u0013")), method3853(method3852("YRPz3\u0013")), method3853(method3852("YRPz1\u0013")), method3853(method3852("YRPz0\u0013")), method3853(method3852("YRPz<\u0013")), method3853(method3852("YRPz6\u0013"))};
   @OriginalMember(
      owner = "client!bda",
      name = "bc",
      descriptor = "[Lue;"
   )
   public static class245[] field7614 = new class245[50];
   @OriginalMember(
      owner = "client!bda",
      name = "Yb",
      descriptor = "I"
   )
   public static int field7616 = -1;
   @OriginalMember(
      owner = "client!bda",
      name = "Ob",
      descriptor = "Lek;"
   )
   public static class536 field7605 = new class536(19, 4);
   @OriginalMember(
      owner = "client!bda",
      name = "Tb",
      descriptor = "I"
   )
   public static int field7604;
   @OriginalMember(
      owner = "client!bda",
      name = "Pb",
      descriptor = "I"
   )
   public static int field7606;
   @OriginalMember(
      owner = "client!bda",
      name = "Nb",
      descriptor = "I"
   )
   public static int field7607;
   @OriginalMember(
      owner = "client!bda",
      name = "Wb",
      descriptor = "I"
   )
   public static int field7608;
   @OriginalMember(
      owner = "client!bda",
      name = "Vb",
      descriptor = "I"
   )
   public static int field7609;
   @OriginalMember(
      owner = "client!bda",
      name = "Xb",
      descriptor = "I"
   )
   private int field7610;
   @OriginalMember(
      owner = "client!bda",
      name = "Rb",
      descriptor = "I"
   )
   public static int field7611;
   @OriginalMember(
      owner = "client!bda",
      name = "Sb",
      descriptor = "I"
   )
   public static int field7612;
   @OriginalMember(
      owner = "client!bda",
      name = "ac",
      descriptor = "I"
   )
   public static int field7615;
   @OriginalMember(
      owner = "client!bda",
      name = "Ub",
      descriptor = "I"
   )
   public static int field7617;
   @OriginalMember(
      owner = "client!bda",
      name = "Zb",
      descriptor = "I"
   )
   public static int field7619;
   @OriginalMember(
      owner = "client!bda",
      name = "Mb",
      descriptor = "Lqi;"
   )
   private class594 field7613;
   @OriginalMember(
      owner = "client!bda",
      name = "Qb",
      descriptor = "[Lbg;"
   )
   public static class492[] field7618;

   @OriginalMember(
      owner = "client!bda",
      name = "v",
      descriptor = "(I)V"
   )
   public final void method3841(int arg0) {
      try {
         ++field7619;
         this.field7610 = super.field1856 * arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7620[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "([IB)V"
   )
   public final void method3842(int[] arg0, byte arg1) {
      try {
         ++field7615;
         if (arg1 != 0) {
            this.method3849(-5);
         }

         this.field7613 = new class594(arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7620[5] + (arg0 != null ? field7620[2] : field7620[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class534(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "(I)V"
   )
   public final void method3843(int arg0) {
      try {
         if (arg0 < 27) {
            field7616 = 109;
         }

         ++field7604;
         super.field1856 = (this.field7610 + 7) / 8;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7620[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "s",
      descriptor = "(II)I"
   )
   public final int method3844(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field7617;
         int var4 = this.field7610 >> 3;
         int var5 = 8 - (7 & this.field7610);
         int var6 = arg1;
         this.field7610 += arg0;
         if (var3) {
            var6 = arg1 + ((super.field1889[var4++] & class623.field9163[var5]) << -var5 + arg0);
            arg0 -= var5;
            var5 = 8;
         }

         while(true) {
            while(~var5 > ~arg0) {
               var6 += (super.field1889[var4++] & class623.field9163[var5]) << -var5 + arg0;
               arg0 -= var5;
               var5 = 8;
            }

            if (!var3) {
               if (var5 == arg0) {
                  var6 += class623.field9163[var5] & super.field1889[var4];
                  if (!var3) {
                     return var6;
                  }
               }

               var6 += super.field1889[var4] >> var5 - arg0 & class623.field9163[arg0];
               return var6;
            }

            arg0 = var5 - arg0;
            var5 = 8;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7620[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "x",
      descriptor = "(I)V"
   )
   public static void method3845(int arg0) {
      try {
         field7605 = null;
         field7618 = null;
         field7614 = null;
         if (arg0 != 8) {
            method3845(-63);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7620[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "q",
      descriptor = "(II)V"
   )
   public final void method3846(int arg0, int arg1) {
      try {
         int var3 = -8 % ((arg1 - 18) / 35);
         ++field7611;
         super.field1889[super.field1856++] = (byte)(arg0 + this.field7613.method4314((byte)57));
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7620[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "a",
      descriptor = "(BLqi;)V"
   )
   public final void method3847(byte arg0, class594 arg1) {
      try {
         if (arg0 == 99) {
            this.field7613 = arg1;
            ++field7607;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7620[0] + arg0 + ',' + (arg1 != null ? field7620[2] : field7620[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "r",
      descriptor = "(II)I"
   )
   public final int method3848(int arg0, int arg1) {
      try {
         if (arg1 >= -61) {
            this.method3848(70, 46);
         }

         ++field7608;
         return arg0 * 8 + -this.field7610;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7620[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "y",
      descriptor = "(I)I"
   )
   public final int method3849(int arg0) {
      try {
         ++field7606;
         int var2 = 255 & super.field1889[super.field1856++] - this.field7613.method4314((byte)57);
         if (arg0 > -117) {
            return 15;
         } else {
            return var2 < 128 ? var2 : (super.field1889[super.field1856++] - this.field7613.method4314((byte)57) & 255) + (var2 - 128 << 8);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7620[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "b",
      descriptor = "(II[BI)V"
   )
   public final void method3850(int arg0, int arg1, byte[] arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         int var6 = 0;
         if (var5) {
            arg2[var6 - -arg3] = (byte)(super.field1889[super.field1856++] + -this.field7613.method4314((byte)57));
            ++var6;
         }

         while(true) {
            while(arg1 > var6) {
               arg2[var6 - -arg3] = (byte)(super.field1889[super.field1856++] + -this.field7613.method4314((byte)57));
               ++var6;
            }

            if (!var5) {
               if (arg0 > -101) {
                  field7616 = 1;
               }

               ++field7612;
               return;
            }

            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7620[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7620[2] : field7620[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "w",
      descriptor = "(I)Z"
   )
   public final boolean method3851(int arg0) {
      try {
         ++field7609;
         int var2 = 255 & super.field1889[super.field1856] - this.field7613.method4311(true);
         if (var2 < 128) {
            return false;
         } else {
            return arg0 == 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7620[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3852(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3853(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
