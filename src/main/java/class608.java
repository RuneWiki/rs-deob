import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class608 extends class67 {
   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8866 = new String[]{method4485(method4484("kh\u000e\u00006")), method4485(method4484("kh\u000e\u00056")), method4485(method4484("kh\u000e\u00036")), method4485(method4484("kh\u000e\u00066")), method4485(method4484("kh\u000e\n6")), method4485(method4484("kh\u000e\u00046")), method4485(method4484("kh\u000e\u00076")), method4485(method4484("kh\u000e\u000b6")), method4485(method4484("kh\u000e\u00016"))};
   @OriginalMember(
      owner = "client!bi",
      name = "p",
      descriptor = "[Lkc;"
   )
   public static class132[] field8857 = new class132[128];
   @OriginalMember(
      owner = "client!bi",
      name = "k",
      descriptor = "I"
   )
   public static int field8858;
   @OriginalMember(
      owner = "client!bi",
      name = "l",
      descriptor = "I"
   )
   public static int field8859;
   @OriginalMember(
      owner = "client!bi",
      name = "r",
      descriptor = "I"
   )
   public static int field8860;
   @OriginalMember(
      owner = "client!bi",
      name = "n",
      descriptor = "I"
   )
   public static int field8861;
   @OriginalMember(
      owner = "client!bi",
      name = "s",
      descriptor = "I"
   )
   public static int field8862;
   @OriginalMember(
      owner = "client!bi",
      name = "q",
      descriptor = "I"
   )
   public static int field8863;
   @OriginalMember(
      owner = "client!bi",
      name = "o",
      descriptor = "I"
   )
   public static int field8864;
   @OriginalMember(
      owner = "client!bi",
      name = "m",
      descriptor = "I"
   )
   public static int field8865;

   @OriginalMember(
      owner = "client!bi",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method4479(int arg0) {
      try {
         ++field8860;
         if (arg0 != 3343) {
            field8857 = null;
         }

         int var2 = super.field881.method295(false).method2508(arg0 ^ -5082);
         return ~var2 <= -97;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8866[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4480(byte arg0) {
      try {
         class455.field6963 = "";
         class722.field10813 = "";
         if (arg0 == -31) {
            ++field8859;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8866[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field8864;
         if (!arg1) {
            method4482(53, false, 70, 93);
         }

         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8866[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field8861;
         int var3 = super.field881.method295(false).method2508(-7895);
         if (arg1 > -74) {
            this.method158((byte)91);
         }

         if (var3 < 96) {
            return 3;
         } else if (arg0 > 1 && var3 < 128) {
            return 3;
         } else {
            return ~arg0 < -4 && ~var3 > -193 ? 3 : 1;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8866[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         ++field8863;
         int var2 = super.field881.method295(false).method2508(-7895);
         if (var2 < 96) {
            super.field877 = 0;
         }

         if (super.field877 > 1 && ~var2 > -129) {
            super.field877 = 1;
         }

         if (arg0 == -69) {
            if (~super.field877 < -3 && var2 < 192) {
               super.field877 = 2;
            }

            if (super.field877 < 0 || super.field877 > 3) {
               super.field877 = this.method162(0);
            }

         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8866[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class608(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            field8857 = null;
         }

         ++field8862;
         return 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8866[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4481(byte arg0) {
      try {
         field8857 = null;
         if (arg0 != 124) {
            method4482(-50, false, -118, 87);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8866[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(IZII)I"
   )
   public static final int method4482(int arg0, boolean arg1, int arg2, int arg3) {
      boolean var4 = client.field1786;

      try {
         if (arg3 != -15572) {
            method4482(-128, true, -30, -61);
         }

         ++field8858;
         class503 var5 = class291.method2454(arg1, (byte)-26, arg0);
         if (var5 == null) {
            return 0;
         } else if (arg2 == -1) {
            return 0;
         } else {
            int var6 = 0;
            int var7 = 0;
            int var10000;
            if (var4) {
               var10000 = ~arg2;
            } else if (var7 >= var5.field7681.length) {
               var10000 = var6;
               if (!var4) {
                  return var6;
               }
            } else {
               var10000 = ~arg2;
            }

            while(true) {
               if (var10000 == ~var5.field7680[var7]) {
                  var6 += var5.field7681[var7];
               }

               ++var7;
               if (var7 >= var5.field7681.length) {
                  var10000 = var6;
                  if (!var4) {
                     return var6;
                  }
               } else {
                  var10000 = ~arg2;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8866[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4483(int arg0) {
      try {
         if (arg0 != 480102311) {
            field8857 = null;
         }

         ++field8865;
         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8866[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class608(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
