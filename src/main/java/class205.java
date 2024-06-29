import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class205 extends class557 {
   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2922 = new String[]{method1779(method1778("Djm4S\b")), method1779(method1778("Djm4T\b")), method1779(method1778("Djm4X\b")), method1779(method1778("Djm4U\b")), method1779(method1778("Djm4Q\b")), method1779(method1778("Djm4Z\b")), method1779(method1778("Djm4P\b")), method1779(method1778("\u001cmcv/\u0014>j|\"\u00100")), method1779(method1778("\u001cmcv/Fh?*\"\u00100")), method1779(method1778("\u001cmcv/Fhn*\"\u00100")), method1779(method1778("\u001cmcv/Fh<*\"\u00100")), method1779(method1778("\u001cmcv/Fh;*\"\u00100")), method1779(method1778("\u001cmcv/\u0018>j|\"\u00100")), method1779(method1778("\u001cmcv/Fhj|\"\u00100")), method1779(method1778("\u001cmcv/\u0010>j|\"\u00100")), method1779(method1778("\u001cmcv/C>j|\"\u00100")), method1779(method1778("Djm4V\b"))};
   @OriginalMember(
      owner = "client!dda",
      name = "j",
      descriptor = "I"
   )
   public static int field2913;
   @OriginalMember(
      owner = "client!dda",
      name = "p",
      descriptor = "I"
   )
   public static int field2914;
   @OriginalMember(
      owner = "client!dda",
      name = "h",
      descriptor = "I"
   )
   public static int field2915;
   @OriginalMember(
      owner = "client!dda",
      name = "k",
      descriptor = "I"
   )
   public static int field2916;
   @OriginalMember(
      owner = "client!dda",
      name = "m",
      descriptor = "I"
   )
   public static int field2918;
   @OriginalMember(
      owner = "client!dda",
      name = "n",
      descriptor = "I"
   )
   public static int field2919;
   @OriginalMember(
      owner = "client!dda",
      name = "o",
      descriptor = "I"
   )
   public static int field2920;
   @OriginalMember(
      owner = "client!dda",
      name = "i",
      descriptor = "I"
   )
   public static int field2921;
   @OriginalMember(
      owner = "client!dda",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2917;

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field2921;
         int var2 = super.field7906.method4714((byte)-40).method5258((byte)121);
         if (arg0 != -22) {
            field2915 = -11;
         }

         if (~var2 > -97) {
            super.field7905 = 0;
         }

         if (~super.field7905 < -2 && var2 < 128) {
            super.field7905 = 1;
         }

         if (super.field7905 > 2 && ~var2 > -193) {
            super.field7905 = 2;
         }

         if (super.field7905 < 0 || ~super.field7905 < -4) {
            super.field7905 = this.method97(arg0 + 22);
         }

      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2922[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1774(byte arg0) {
      try {
         ++field2916;
         int var2 = super.field7906.method4714((byte)-40).method5258((byte)110);
         if (arg0 != 108) {
            field2917 = null;
         }

         return var2 >= 96;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2922[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(III)Ljava/lang/String;"
   )
   public static final String method1775(int arg0, int arg1, int arg2) {
      try {
         ++field2914;
         int var3 = -arg1 + arg2;
         if (~var3 > 8) {
            return field2922[10];
         } else if (~var3 > 5) {
            return field2922[8];
         } else if (~var3 > 2) {
            return field2922[11];
         } else if (arg0 > var3) {
            return field2922[9];
         } else if (~var3 < -10) {
            return field2922[14];
         } else if (~var3 < -7) {
            return field2922[7];
         } else if (var3 > 3) {
            return field2922[12];
         } else {
            return ~var3 < -1 ? field2922[15] : field2922[13];
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2922[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method1776(int arg0) {
      try {
         if (arg0 >= -52) {
            this.method1774((byte)96);
         }

         ++field2918;
         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2922[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1777(int arg0) {
      try {
         field2917 = null;
         if (arg0 != -6419) {
            method1775(22, -98, 31);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2922[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class205(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!dda",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class205(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dda",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field2919;
         if (arg0 != 0) {
            field2917 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2922[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field2920;
         super.field7905 = arg0;
         if (!arg1) {
            this.method98((byte)-85);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2922[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field2913;
         if (arg0 != 1) {
            return -42;
         } else {
            int var3 = super.field7906.method4714((byte)-40).method5258((byte)103);
            if (~var3 > -97) {
               return 3;
            } else if (~arg1 < -2 && var3 < 128) {
               return 3;
            } else {
               return ~arg1 < -4 && ~var3 > -193 ? 3 : 1;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2922[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1778(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1779(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
