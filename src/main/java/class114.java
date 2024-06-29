import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class114 extends class128 {
   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1806 = new String[]{method1118(method1117("wFw`O")), method1118(method1117("j\f8`q$")), method1118(method1117("b\u001d5\"")), method1118(method1117("j\f8`w$")), method1118(method1117("j\f8`p$")), method1118(method1117("j\f8`s$")), method1118(method1117("j\f8`v$"))};
   @OriginalMember(
      owner = "client!fda",
      name = "p",
      descriptor = "Lhha;"
   )
   public static class724 field1796 = new class724(115, -2);
   @OriginalMember(
      owner = "client!fda",
      name = "w",
      descriptor = "B"
   )
   private byte field1799;
   @OriginalMember(
      owner = "client!fda",
      name = "n",
      descriptor = "B"
   )
   private byte field1801;
   @OriginalMember(
      owner = "client!fda",
      name = "o",
      descriptor = "I"
   )
   public static int field1797;
   @OriginalMember(
      owner = "client!fda",
      name = "s",
      descriptor = "I"
   )
   public static int field1800;
   @OriginalMember(
      owner = "client!fda",
      name = "q",
      descriptor = "I"
   )
   public static int field1802;
   @OriginalMember(
      owner = "client!fda",
      name = "r",
      descriptor = "I"
   )
   public static int field1803;
   @OriginalMember(
      owner = "client!fda",
      name = "v",
      descriptor = "I"
   )
   public static int field1805;
   @OriginalMember(
      owner = "client!fda",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field1798;
   @OriginalMember(
      owner = "client!fda",
      name = "t",
      descriptor = "[Lip;"
   )
   public static class662[] field1804;

   @OriginalMember(
      owner = "client!fda",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1114(int arg0) {
      try {
         field1804 = null;
         if (arg0 == -21033) {
            field1796 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1806[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(Lhka;B)V"
   )
   public final void method606(class360 arg0, byte arg1) {
      try {
         ++field1800;
         if (this.field1798 != null) {
            arg0.field5312 = this.field1799;
            arg0.field5316 = this.field1801;
         }

         arg0.field5322 = this.field1798;
         int var3 = 30 / ((arg1 - 50) / 53);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1806[1] + (arg0 != null ? field1806[0] : field1806[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(Lsa;Lsa;Lnd;Lsa;ILqaa;)Z"
   )
   public static final boolean method1115(class39 arg0, class39 arg1, class785 arg2, class39 arg3, int arg4, class119 arg5) {
      boolean var6 = client.field10022;

      try {
         class691.field9950 = arg5;
         class790.field11508 = arg3;
         int var7 = 11 / ((arg4 - 17) / 50);
         ++field1802;
         class211.field3022 = arg1;
         class167.field2511 = new int[16];
         class387.field5644 = arg0;
         class695.field10039 = arg2;
         int var8 = 0;
         if (var6) {
            class167.field2511[var8] = 255;
            ++var8;
         }

         while(true) {
            while(~var8 > -17) {
               class167.field2511[var8] = 255;
               ++var8;
            }

            if (!var6) {
               return true;
            }

            ++var8;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field1806[6] + (arg0 != null ? field1806[0] : field1806[2]) + ',' + (arg1 != null ? field1806[0] : field1806[2]) + ',' + (arg2 != null ? field1806[0] : field1806[2]) + ',' + (arg3 != null ? field1806[0] : field1806[2]) + ',' + arg4 + ',' + (arg5 != null ? field1806[0] : field1806[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method608(class65 arg0, int arg1) {
      try {
         this.field1798 = arg0.method641((byte)67);
         ++field1797;
         if (arg1 != 4206) {
            this.method606((class360)null, (byte)108);
         }

         if (this.field1798 != null) {
            arg0.method665(false);
            this.field1801 = arg0.method638(true);
            this.field1799 = arg0.method638(true);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1806[4] + (arg0 != null ? field1806[0] : field1806[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1116(int arg0) {
      try {
         ++field1803;
         class324.field4821 = 0;
         int var1 = (class117.field1849.field6832 >> 9) + class115.field1824;
         int var2 = (class117.field1849.field6833 >> 9) + class480.field6903;
         if (~var1 <= -3054 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class324.field4821 = 1;
         }

         if (~var1 <= -3073 && var1 <= 3118 && ~var2 <= -9493 && ~var2 >= -9536) {
            class324.field4821 = 1;
         }

         if (arg0 >= -105) {
            field1796 = null;
         }

         if (~class324.field4821 == -2 && var1 >= 3139 && ~var1 >= -3200 && var2 >= 3008 && ~var2 >= -3063) {
            class324.field4821 = 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1806[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1117(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1118(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
