import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class690 {
   @OriginalMember(
      owner = "client!ft",
      name = "n",
      descriptor = "J"
   )
   private long field22 = -1L;
   @OriginalMember(
      owner = "client!ft",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   private String field28 = null;
   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field29 = new String[]{method31(method30("\bn6A\u0018")), method31(method30("\u001d5t\u0003")), method31(method30("\u001546(M")), method31(method30("\u001b7+\u000b")), method31(method30("\u001546*M")), method31(method30("\u0019!{\u0003\f\u0011")), method31(method30("\u001546)M")), method31(method30("\u001546,M")), method31(method30("\u001546-M")), method31(method30("S-}\u0002\u0007\u00162v\u000e\b\u0016z")), method31(method30("\u001e%u\r\u0000\u0001(y\u001c\rI")), method31(method30("\u001546+M")), method31(method30("\u001546.M"))};
   @OriginalMember(
      owner = "client!ft",
      name = "t",
      descriptor = "Lnc;"
   )
   public static class26 field20 = new class26(method31(method30("\u0014!u\nQ")), method31(method30("4!u\nEG")), 3);
   @OriginalMember(
      owner = "client!ft",
      name = "q",
      descriptor = "I"
   )
   public static int field19;
   @OriginalMember(
      owner = "client!ft",
      name = "v",
      descriptor = "I"
   )
   public static int field21;
   @OriginalMember(
      owner = "client!ft",
      name = "r",
      descriptor = "I"
   )
   public static int field23;
   @OriginalMember(
      owner = "client!ft",
      name = "s",
      descriptor = "I"
   )
   public static int field24;
   @OriginalMember(
      owner = "client!ft",
      name = "m",
      descriptor = "I"
   )
   public static int field25;
   @OriginalMember(
      owner = "client!ft",
      name = "u",
      descriptor = "I"
   )
   public static int field26;
   @OriginalMember(
      owner = "client!ft",
      name = "p",
      descriptor = "I"
   )
   public static int field27;

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(Leb;Leb;I)V"
   )
   public static final void method23(class657 arg0, class657 arg1, int arg2) {
      try {
         ++field24;
         if (arg2 != 0) {
            method29(-125);
         }

         ++class175.field2178;
         class471 var3 = class133.method1118(class605.field8474.field2787, arg2 ^ 2, class511.field7071);
         var3.field6527.method4337(arg1.field9220, 1184007664);
         var3.field6527.method4314(arg2 + -53, arg1.field9345);
         var3.field6527.method4308(true, arg0.field9285);
         var3.field6527.method4284(arg1.field9285, arg2 + -31429);
         var3.field6527.method4284(arg0.field9345, arg2 ^ -31429);
         var3.field6527.method4337(arg0.field9220, 1184007664);
         class605.field8474.method1702((byte)-91, var3);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field29[6] + (arg0 != null ? field29[0] : field29[1]) + ',' + (arg1 != null ? field29[0] : field29[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method24(int arg0) {
      try {
         field20 = null;
         int var1 = -7 / ((-14 - arg0) / 54);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field29[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(ILqf;)Z"
   )
   public static final boolean method25(int arg0, class712 arg1) {
      try {
         ++field23;
         if (arg0 != -5958) {
            return true;
         } else {
            class774 var2 = class472.field6533.method3586(64, arg1.method2281((byte)-127));
            if (~var2.field11161 == 0) {
               return true;
            } else {
               class146 var3 = class599.field8358.method2386(var2.field11161, true);
               return ~var3.field1924 == 0 ? true : var3.method1238(false);
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field29[2] + arg0 + ',' + (arg1 != null ? field29[0] : field29[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         if (arg1 >= -19) {
            method23((class657)null, (class657)null, -105);
         }

         ++field25;
         if (arg0.method4288((byte)112) != 255) {
            --arg0.field8243;
            this.field22 = arg0.method4304((byte)-86);
         }

         this.field28 = arg0.method4334(4794);
         if (class461.field6317) {
            System.out.println(field29[10] + this.field22 + field29[9] + this.field28);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field29[11] + (arg0 != null ? field29[0] : field29[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         if (arg0) {
            method25(-54, (class712)null);
         }

         ++field19;
         arg1.method1180(this.field28, this.field22, arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field29[7] + arg0 + ',' + (arg1 != null ? field29[0] : field29[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method28(int arg0, boolean arg1) {
      try {
         class347.field4992.method4234(2, arg0);
         ++field21;
         if (!arg1) {
            method29(-101);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field29[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method29(int arg0) {
      try {
         if (arg0 != 255) {
            field20 = null;
         }

         ++field26;
         return !class280.method2139(arg0 ^ 132, field29[5]) ? false : class280.method2139(118, field29[3]);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field29[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method30(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method31(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
