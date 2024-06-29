import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class550 extends class557 {
   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7868 = new String[]{method4129(method4128("<< M\u001cq")), method4129(method4128("7\"-\u000f")), method4129(method4128("<< M\u001fq")), method4129(method4128("\"yoM'")), method4129(method4128("<< M\u001eq")), method4129(method4128("<< M\u0019q")), method4129(method4128("<< M\u0012q")), method4129(method4128("<< M\u0018q")), method4129(method4128("<< M\u0010q")), method4129(method4128("<< M\u001bq")), method4129(method4128("<< M\u0013q")), method4129(method4128("<< M\u001dq"))};
   @OriginalMember(
      owner = "client!eka",
      name = "p",
      descriptor = "[B"
   )
   public static byte[] field7858;
   @OriginalMember(
      owner = "client!eka",
      name = "l",
      descriptor = "Lhn;"
   )
   public static class357 field7866;
   @OriginalMember(
      owner = "client!eka",
      name = "i",
      descriptor = "I"
   )
   public static int field7856;
   @OriginalMember(
      owner = "client!eka",
      name = "h",
      descriptor = "I"
   )
   public static int field7857;
   @OriginalMember(
      owner = "client!eka",
      name = "k",
      descriptor = "I"
   )
   public static int field7859;
   @OriginalMember(
      owner = "client!eka",
      name = "m",
      descriptor = "I"
   )
   public static int field7860;
   @OriginalMember(
      owner = "client!eka",
      name = "j",
      descriptor = "I"
   )
   public static int field7861;
   @OriginalMember(
      owner = "client!eka",
      name = "o",
      descriptor = "I"
   )
   public static int field7862;
   @OriginalMember(
      owner = "client!eka",
      name = "s",
      descriptor = "I"
   )
   public static int field7863;
   @OriginalMember(
      owner = "client!eka",
      name = "r",
      descriptor = "I"
   )
   public static int field7864;
   @OriginalMember(
      owner = "client!eka",
      name = "n",
      descriptor = "I"
   )
   public static int field7865;
   @OriginalMember(
      owner = "client!eka",
      name = "q",
      descriptor = "I"
   )
   public static int field7867;

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field7857;
         if (arg0 != 1) {
            this.method4125((byte)-117);
         }

         if (class167.method1566(arg1, 0)) {
            if (super.field7906.field9109.method4679(true) && !class483.method3687(super.field7906.field9109.method4676(-64), (byte)73)) {
               return 3;
            }

            if (super.field7906.field9135.method1905(arg0 ^ -70) == 1) {
               return 3;
            }
         }

         if (arg1 == 3) {
            return 3;
         } else {
            return class167.method1566(arg1, arg0 + -1) ? 2 : 1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7868[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4122(int arg0) {
      try {
         field7866 = null;
         if (arg0 == 2) {
            field7858 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7868[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(Ltea;B)V"
   )
   public static final void method4123(class272 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!eka",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method4124(int arg0) {
      try {
         ++field7863;
         if (arg0 > -52) {
            this.method98((byte)-7);
         }

         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7868[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method4125(byte arg0) {
      try {
         ++field7865;
         return arg0 < 78 ? true : class167.method1566(super.field7905, 0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7868[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "b",
      descriptor = "(IZ)V"
   )
   public static final void method4126(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field7867 = -59;
         }

         ++field7859;
         if (class132.method1345(-106, arg0)) {
            class438.method3411(-1, -31762, class315.field4719[arg0]);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7868[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method92(4, -109);
         }

         super.field7905 = arg0;
         ++field7856;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7868[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method4127(byte arg0) {
      try {
         ++field7860;
         if (arg0 != 108) {
            this.method4125((byte)83);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7868[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class550(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!eka",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            return -60;
         } else {
            ++field7861;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7868[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class550(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field7862;
         if (arg0 == -22) {
            if (this.method4125((byte)113)) {
               if (super.field7906.field9109.method4679(true) && !class483.method3687(super.field7906.field9109.method4676(arg0 + -46), (byte)73)) {
                  super.field7905 = 1;
               }

               if (~super.field7906.field9135.method1905(-67) == -2) {
                  super.field7905 = 1;
               }
            }

            if (super.field7905 == 3) {
               super.field7905 = 2;
            }

            if (~super.field7905 > -1 || super.field7905 > 3) {
               super.field7905 = this.method97(arg0 + 22);
            }

         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7868[0] + arg0 + ')');
      }
   }

   static {
      int var0 = 0;
      field7858 = new byte[32896];

      for(int var1 = 0; var1 < 256; ++var1) {
         for(int var2 = 0; ~var1 <= ~var2; ++var2) {
            field7858[var0++] = (byte)((int)(255.0D / Math.sqrt((double)((float)(var1 * var1 + (var2 * var2 - -65535)) / 65535.0F))));
         }
      }

      field7866 = new class357(method4129(method4128("\u000e\u0003\u0010\"")), method4129(method4128("61'\n9<")), method4129(method4128("\u0006& ")), 2);
   }

   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4128(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4129(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
