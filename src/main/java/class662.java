import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class662 extends class550 {
   @OriginalMember(
      owner = "client!cd",
      name = "p",
      descriptor = "Z"
   )
   private boolean field9925 = false;
   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9932 = new String[]{method4902(method4901("XDFQ]")), method4902(method4901("XDFS]")), method4902(method4901("XDFY]")), method4902(method4901("UU\u0004|")), method4902(method4901("@\u000eF>\b")), method4902(method4901("XDFR]")), method4902(method4901("XDFV]")), method4902(method4901("XDFU]"))};
   @OriginalMember(
      owner = "client!cd",
      name = "l",
      descriptor = "I"
   )
   public static int field9923 = 0;
   @OriginalMember(
      owner = "client!cd",
      name = "k",
      descriptor = "I"
   )
   public static int field9929 = -1;
   @OriginalMember(
      owner = "client!cd",
      name = "m",
      descriptor = "I"
   )
   public static int field9924;
   @OriginalMember(
      owner = "client!cd",
      name = "q",
      descriptor = "I"
   )
   public static int field9926;
   @OriginalMember(
      owner = "client!cd",
      name = "o",
      descriptor = "I"
   )
   public static int field9927;
   @OriginalMember(
      owner = "client!cd",
      name = "n",
      descriptor = "I"
   )
   public static int field9928;
   @OriginalMember(
      owner = "client!cd",
      name = "j",
      descriptor = "I"
   )
   public static int field9930;
   @OriginalMember(
      owner = "client!cd",
      name = "r",
      descriptor = "I"
   )
   public static int field9931;

   @OriginalMember(
      owner = "client!cd",
      name = "<init>",
      descriptor = "(Lmu;)V"
   )
   public class662(class258 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method67(byte arg0, int arg1, int arg2) {
      try {
         ++field9931;
         if (arg0 != 90) {
            field9929 = -33;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9932[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(IBLwm;)V"
   )
   public final void method71(int arg0, byte arg1, class428 arg2) {
      try {
         super.field8234.method2193(arg2, (byte)-19);
         ++field9927;
         super.field8234.method2255(arg0, (byte)90);
         int var4 = -41 % ((18 - arg1) / 60);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9932[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9932[4] : field9932[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method72(int arg0) {
      try {
         label20: {
            ++field9928;
            if (!this.field9925) {
               super.field8234.method2221(0, (byte)51, class751.field11122);
               if (!client.field1786) {
                  break label20;
               }
            }

            super.field8234.method2220(1, 14);
            super.field8234.method1475(class525.field7998, -27302);
            super.field8234.method2212((byte)119, class716.field10733, class716.field10733);
            super.field8234.method2185((byte)-97, 2, class700.field10441);
            super.field8234.method2221(0, (byte)51, class751.field11122);
            super.field8234.method2233((byte)-73);
            super.field8234.method2193((class428)null, (byte)-19);
            super.field8234.method2220(0, 14);
            this.field9925 = false;
         }

         super.field8234.method2212((byte)119, class716.field10733, class716.field10733);
         if (arg0 != -2) {
            this.method71(87, (byte)-120, (class428)null);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9932[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method78(byte arg0, boolean arg1) {
      try {
         super.field8234.method2212((byte)119, class716.field10733, class453.field6943);
         ++field9926;
         if (arg0 <= 82) {
            field9929 = 91;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9932[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method73(boolean arg0, byte arg1) {
      try {
         label22: {
            ++field9924;
            class496 var3 = super.field8234.method2223(16);
            if (var3 != null && arg0) {
               super.field8234.method2220(1, 14);
               super.field8234.method2193(var3, (byte)-19);
               super.field8234.method1475(class598.field8768, -27302);
               super.field8234.method2220(1, 14);
               super.field8234.method2212((byte)119, class582.field8586, class453.field6943);
               super.field8234.method1494(0, true, 2, class36.field435, false);
               super.field8234.method2221(0, (byte)51, class53.field655);
               class504 var4 = super.field8234.method2188(0);
               var4.method3914(super.field8234.method2215(true), (byte)-125);
               super.field8234.method2247(11901, class443.field6802);
               super.field8234.method2220(0, 14);
               this.field9925 = true;
               if (!client.field1786) {
                  break label22;
               }
            }

            super.field8234.method2221(0, (byte)51, class53.field655);
         }

         if (arg1 > -44) {
            this.method78((byte)-127, true);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field9932[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method69(byte arg0) {
      try {
         ++field9930;
         return arg0 == 120;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9932[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4901(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4902(char[] arg0) {
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
            var10005 = 32;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
