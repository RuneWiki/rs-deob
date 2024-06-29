import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class578 extends class67 {
   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8552 = new String[]{method4335(method4334("\t\u0002:|\u0000I")), method4335(method4334("\t\u0002:|\nI")), method4335(method4334("\t\u0002:|\u0001I")), method4335(method4334("\t\u0002:|\u0002I")), method4335(method4334("\t\u0002:|\u000bI")), method4335(method4334("\t\u0002:|\u0006I")), method4335(method4334("\t\u0002:|\u0007I")), method4335(method4334("\t\u0002:|\u0004I"))};
   @OriginalMember(
      owner = "client!hda",
      name = "l",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field8544 = new String[][]{{method4335(method4334("+\u00075")), method4335(method4334("'\u00039")), method4335(method4334(",\u0007)")), method4335(method4334(" \u0016)")), method4335(method4334(",\u0007\"")), method4335(method4334("+\u00135")), method4335(method4334("+\u00137")), method4335(method4334(" \u0013<")), method4335(method4334("2\u0003+")), method4335(method4334(".\u0005/")), method4335(method4334("/\t-")), method4335(method4334("%\u00038"))}, {method4335(method4334("+\u00075")), method4335(method4334("'\u00039")), method4335(method4334(",\u0082)")), method4335(method4334(" \u0016)")), method4335(method4334(",\u00072")), method4335(method4334("+\u00135")), method4335(method4334("+\u00137")), method4335(method4334(" \u0013<")), method4335(method4334("2\u0003+")), method4335(method4334(".\r/")), method4335(method4334("/\t-")), method4335(method4334("%\u0003!"))}, {method4335(method4334("\u000b\u00075")), method4335(method4334("\u0007\u008f-")), method4335(method4334("\f\u0007)!")), method4335(method4334("\u0000\u0010)")), method4335(method4334("\f\u00072")), method4335(method4334("\u000b\u00132<")), method4335(method4334("\u000b\u00132>")), method4335(method4334("\u0000\t &")), method4335(method4334("\u0012\u0003+&")), method4335(method4334("\u000e\u0005/")), method4335(method4334("\u000f\t-")), method4335(method4334("\u0005\u008f8"))}, {method4335(method4334("\u000b\u00075")), method4335(method4334("\u0007\u0003-")), method4335(method4334("\f\u0007)")), method4335(method4334("\u0000\u0004)")), method4335(method4334("\f\u00072")), method4335(method4334("\u000b\u00135")), method4335(method4334("\u000b\u00137")), method4335(method4334("\u0000\u00014")), method4335(method4334("\u0012\u0003/")), method4335(method4334("\u000e\u0013/")), method4335(method4334("\u000f\t-")), method4335(method4334("\u0005\u0003!"))}, {method4335(method4334("\u000b\u00075")), method4335(method4334("\u0007\u00039")), method4335(method4334("\f\u0014/")), method4335(method4334("\u0000\u0016)")), method4335(method4334("\f\u00032")), method4335(method4334("\u000b\u00135")), method4335(method4334("\u000b\u00137")), method4335(method4334("\u0000\u0013<")), method4335(method4334("\u0012\u0003+")), method4335(method4334("\u000e\r/")), method4335(method4334("\u000f\t-")), method4335(method4334("\u0005\u00038"))}};
   @OriginalMember(
      owner = "client!hda",
      name = "n",
      descriptor = "I"
   )
   public static int field8543;
   @OriginalMember(
      owner = "client!hda",
      name = "m",
      descriptor = "I"
   )
   public static int field8545;
   @OriginalMember(
      owner = "client!hda",
      name = "s",
      descriptor = "I"
   )
   public static int field8546;
   @OriginalMember(
      owner = "client!hda",
      name = "o",
      descriptor = "I"
   )
   public static int field8547;
   @OriginalMember(
      owner = "client!hda",
      name = "k",
      descriptor = "I"
   )
   public static int field8548;
   @OriginalMember(
      owner = "client!hda",
      name = "p",
      descriptor = "I"
   )
   public static int field8549;
   @OriginalMember(
      owner = "client!hda",
      name = "q",
      descriptor = "I"
   )
   public static int field8550;
   @OriginalMember(
      owner = "client!hda",
      name = "r",
      descriptor = "I"
   )
   public static int field8551;

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method158(byte arg0) {
      try {
         if (super.field881.field507.method3434(0) && !class290.method2450(super.field881.field507.method3440(480102311), (byte)93)) {
            super.field877 = 0;
         }

         if (arg0 != -69) {
            method4333(-108);
         }

         ++field8549;
         if (super.field877 < 0 || ~super.field877 < -2) {
            super.field877 = this.method162(0);
         }

      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8552[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            return -71;
         } else {
            ++field8551;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8552[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field8550;
         super.field877 = arg0;
         if (!arg1) {
            field8544 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8552[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method4330(int arg0) {
      try {
         if (arg0 != 3343) {
            this.method162(102);
         }

         ++field8546;
         return class290.method2450(super.field881.field507.method3440(480102311), (byte)124);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8552[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 > -74) {
            this.method165(52, false);
         }

         ++field8545;
         return !class290.method2450(super.field881.field507.method3440(480102311), (byte)98) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8552[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method4331(int arg0) {
      try {
         ++field8543;
         if (arg0 != 480102311) {
            method4333(-4);
         }

         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8552[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "<init>",
      descriptor = "(Lmp;)V"
   )
   public class578(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hda",
      name = "b",
      descriptor = "(B)Lgb;"
   )
   public static final class29 method4332(byte arg0) {
      try {
         ++field8548;
         if (class303.method2535(class342.field5204, 77)) {
            return class510.field7800;
         } else {
            return arg0 != -32 ? null : class510.field7801;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8552[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "<init>",
      descriptor = "(ILmp;)V"
   )
   public class578(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hda",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4333(int arg0) {
      try {
         if (arg0 >= -77) {
            method4333(-29);
         }

         field8544 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8552[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4334(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4335(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
