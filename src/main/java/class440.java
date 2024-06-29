import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class440 extends class439 {
   @OriginalMember(
      owner = "client!im",
      name = "p",
      descriptor = "I"
   )
   public int field5988;
   @OriginalMember(
      owner = "client!im",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   public String field5984;
   @OriginalMember(
      owner = "client!im",
      name = "s",
      descriptor = "S"
   )
   public short field5987;
   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5989 = new String[]{method3396(method3395("c@\u000f\u0003W")), method3396(method3395("dXM-")), method3396(method3395("q\u0003\u000fo\u0002")), method3396(method3395("c@\u000f}\u0016dDU\u007fW")), method3396(method3395("c@\u000f\u0000W"))};
   @OriginalMember(
      owner = "client!im",
      name = "q",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field5983 = new String[][]{{method3396(method3395("@LO")), method3396(method3395("LHC")), method3396(method3395("GLS")), method3396(method3395("K]S")), method3396(method3395("GLX")), method3396(method3395("@XO")), method3396(method3395("@XM")), method3396(method3395("KXF")), method3396(method3395("YHQ")), method3396(method3395("ENU")), method3396(method3395("DBW")), method3396(method3395("NHB"))}, {method3396(method3395("@LO")), method3396(method3395("LHC")), method3396(method3395("GÉS")), method3396(method3395("K]S")), method3396(method3395("GLH")), method3396(method3395("@XO")), method3396(method3395("@XM")), method3396(method3395("KXF")), method3396(method3395("YHQ")), method3396(method3395("EFU")), method3396(method3395("DBW")), method3396(method3395("NH["))}, {method3396(method3395("`LO")), method3396(method3395("lÄW")), method3396(method3395("gLS2")), method3396(method3395("k[S")), method3396(method3395("gLH")), method3396(method3395("`XH/")), method3396(method3395("`XH-")), method3396(method3395("kBÚ5")), method3396(method3395("yHQ5")), method3396(method3395("eNU")), method3396(method3395("dBW")), method3396(method3395("nÄB"))}, {method3396(method3395("`LO")), method3396(method3395("lHW")), method3396(method3395("gLS")), method3396(method3395("kOS")), method3396(method3395("gLH")), method3396(method3395("`XO")), method3396(method3395("`XM")), method3396(method3395("kJN")), method3396(method3395("yHU")), method3396(method3395("eXU")), method3396(method3395("dBW")), method3396(method3395("nH["))}, {method3396(method3395("`LO")), method3396(method3395("lHC")), method3396(method3395("g_U")), method3396(method3395("k]S")), method3396(method3395("gHH")), method3396(method3395("`XO")), method3396(method3395("`XM")), method3396(method3395("kXF")), method3396(method3395("yHQ")), method3396(method3395("eFU")), method3396(method3395("dBW")), method3396(method3395("nHB"))}};
   @OriginalMember(
      owner = "client!im",
      name = "t",
      descriptor = "[C"
   )
   public static char[] field5986 = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @OriginalMember(
      owner = "client!im",
      name = "r",
      descriptor = "I"
   )
   public static int field5985;

   @OriginalMember(
      owner = "client!im",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3393(int arg0) {
      try {
         field5983 = null;
         field5986 = null;
         if (arg0 != -2278) {
            field5986 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5989[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "a",
      descriptor = "(ILbu;IIIIIIILiba;II)V"
   )
   public static final void method3394(int arg0, class596 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class237 arg9, int arg10, int arg11) {
      try {
         class137.field1744 = arg10;
         class7.field92 = arg0;
         class120.field1580 = arg6;
         class302.field4232 = arg8;
         class417.field5703 = arg11;
         class227.field2848 = arg5;
         class335.field4601 = arg2;
         class549.field8091 = null;
         if (arg7 != 105) {
            field5983 = null;
         }

         class267.field3377 = arg3;
         class78.field1048 = arg1;
         ++field5985;
         class686.field10106 = null;
         class123.field1613 = arg4;
         class418.field5716 = arg9;
         class214.field2720 = null;
         class245.method1945(0);
         class465.field6404 = true;
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field5989[4] + arg0 + ',' + (arg1 != null ? field5989[2] : field5989[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field5989[2] : field5989[1]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class440(String arg0, int arg1) {
      try {
         this.field5988 = (int)(class163.method1353(-123) / 1000L);
         this.field5984 = arg0;
         this.field5987 = (short)arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5989[3] + (arg0 != null ? field5989[2] : field5989[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3395(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!im",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3396(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
