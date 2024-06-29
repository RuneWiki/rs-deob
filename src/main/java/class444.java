import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class444 extends class575 {
   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6489 = new String[]{method3450(method3449("7\fJ%\u007f")), method3450(method3449("7\fJ \u007f")), method3450(method3449("7\fJ0\u007f")), method3450(method3449("*\u0013\b\b")), method3450(method3449("?HJJ*")), method3450(method3449("7\fJ6\u007f")), method3450(method3449("7\fJ7\u007f")), method3450(method3449("7\fJ!\u007f")), method3450(method3449("7\fJ\"\u007f")), method3450(method3449("7\fJ'\u007f")), method3450(method3449("7\fJ&\u007f"))};
   @OriginalMember(
      owner = "client!sj",
      name = "n",
      descriptor = "I"
   )
   public static int field6480 = 0;
   @OriginalMember(
      owner = "client!sj",
      name = "l",
      descriptor = "I"
   )
   public static int field6482 = -1;
   @OriginalMember(
      owner = "client!sj",
      name = "o",
      descriptor = "Lhha;"
   )
   public static class724 field6483 = new class724(141, 3);
   @OriginalMember(
      owner = "client!sj",
      name = "u",
      descriptor = "I"
   )
   public static int field6477;
   @OriginalMember(
      owner = "client!sj",
      name = "s",
      descriptor = "I"
   )
   public static int field6478;
   @OriginalMember(
      owner = "client!sj",
      name = "q",
      descriptor = "I"
   )
   public static int field6479;
   @OriginalMember(
      owner = "client!sj",
      name = "w",
      descriptor = "I"
   )
   public static int field6481;
   @OriginalMember(
      owner = "client!sj",
      name = "m",
      descriptor = "I"
   )
   public static int field6484;
   @OriginalMember(
      owner = "client!sj",
      name = "r",
      descriptor = "I"
   )
   public static int field6485;
   @OriginalMember(
      owner = "client!sj",
      name = "p",
      descriptor = "I"
   )
   public static int field6486;
   @OriginalMember(
      owner = "client!sj",
      name = "v",
      descriptor = "I"
   )
   public static int field6488;
   @OriginalMember(
      owner = "client!sj",
      name = "t",
      descriptor = "Ltea;"
   )
   public static class272 field6487;

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(Lda;)V"
   )
   public static final void method3445(class216 arg0) {
      class319.field4764 = arg0;
   }

   @OriginalMember(
      owner = "client!sj",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      try {
         ++field6478;
         return arg0 != 15385 ? true : true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6489[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "<init>",
      descriptor = "(Ldaa;)V"
   )
   public class444(class226 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 > 61) {
            ++field6479;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6489[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      try {
         if (arg1 != 23) {
            field6482 = 47;
         }

         ++field6484;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6489[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method3446(int arg0) {
      try {
         class513.field7285.method197((0.1F * (float)class476.field6870.field9143.method2615(-112) + 0.7F) * class218.field3126);
         if (arg0 != -1370) {
            field6487 = null;
         }

         ++field6488;
         class513.field7285.method154(class244.field3751, class31.field441, class572.field8102, (float)(class653.field9253 << 2), (float)(class337.field4992 << 2), (float)(class186.field2759 << 2));
         class513.field7285.method166(class413.field6064);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6489[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(ILcu;)Lfa;"
   )
   public static final class587 method3447(int arg0, class65 arg1) {
      try {
         if (arg0 > -55) {
            field6483 = null;
         }

         ++field6485;
         return new class587(arg1.method655((byte)126), arg1.method655((byte)96), arg1.method655((byte)59), arg1.method655((byte)103), arg1.method655((byte)118), arg1.method655((byte)81), arg1.method655((byte)82), arg1.method655((byte)95), arg1.method691((byte)-128), arg1.method665(false));
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6489[5] + arg0 + ',' + (arg1 != null ? field6489[4] : field6489[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3448(int arg0) {
      try {
         field6483 = null;
         field6487 = null;
         if (arg0 != 11627) {
            method3446(32);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6489[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      try {
         ++field6486;
         super.field8129.method2002(arg0, -25791);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6489[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      try {
         ++field6481;
         super.field8129.method1943(0, arg2);
         if (arg1) {
            super.field8129.method1966(arg0, -5);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6489[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6489[4] : field6489[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      try {
         ++field6477;
         super.field8129.method2002(arg1, -25791);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6489[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3449(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3450(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
