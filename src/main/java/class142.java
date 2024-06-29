import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class142 {
   @OriginalMember(
      owner = "client!ig",
      name = "q",
      descriptor = "I"
   )
   public int field1794;
   @OriginalMember(
      owner = "client!ig",
      name = "d",
      descriptor = "I"
   )
   public int field1799;
   @OriginalMember(
      owner = "client!ig",
      name = "i",
      descriptor = "I"
   )
   public int field1784;
   @OriginalMember(
      owner = "client!ig",
      name = "f",
      descriptor = "I"
   )
   public int field1789;
   @OriginalMember(
      owner = "client!ig",
      name = "e",
      descriptor = "B"
   )
   public byte field1797;
   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "I"
   )
   public int field1796;
   @OriginalMember(
      owner = "client!ig",
      name = "r",
      descriptor = "I"
   )
   public int field1785;
   @OriginalMember(
      owner = "client!ig",
      name = "h",
      descriptor = "Lnl;"
   )
   public class713 field1793;
   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1802 = new String[]{method1170(method1169("5\u001bhU{")), method1170(method1169("5\u001bh*:2\u00152({")), method1170(method1169("'Rh8.")), method1170(method1169("2\t*z")), method1170(method1169("5\u001bhW{")), method1170(method1169("5\u001bhT{")), method1170(method1169("5\u001bhR{")), method1170(method1169("5\u001bhS{"))};
   @OriginalMember(
      owner = "client!ig",
      name = "o",
      descriptor = "I"
   )
   public static int field1788 = 0;
   @OriginalMember(
      owner = "client!ig",
      name = "m",
      descriptor = "I"
   )
   public static int field1787;
   @OriginalMember(
      owner = "client!ig",
      name = "p",
      descriptor = "I"
   )
   public static int field1790;
   @OriginalMember(
      owner = "client!ig",
      name = "g",
      descriptor = "I"
   )
   public static int field1795;
   @OriginalMember(
      owner = "client!ig",
      name = "l",
      descriptor = "I"
   )
   public static int field1800;
   @OriginalMember(
      owner = "client!ig",
      name = "k",
      descriptor = "I"
   )
   public static int field1801;
   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "Lbja;"
   )
   public class251 field1792;
   @OriginalMember(
      owner = "client!ig",
      name = "j",
      descriptor = "Lgb;"
   )
   public class521 field1798;
   @OriginalMember(
      owner = "client!ig",
      name = "n",
      descriptor = "Lnja;"
   )
   public class525 field1786;
   @OriginalMember(
      owner = "client!ig",
      name = "c",
      descriptor = "Lii;"
   )
   public class672 field1791;

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(ZIII)Lfv;"
   )
   public static final class702 method1164(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         ++field1790;
         class702 var4 = null;
         if (~arg2 == -1) {
            ++class786.field11475;
            var4 = class19.method142(class387.field5365.field8765, class151.field1888, (byte)-116);
         }

         if (~arg2 == -2) {
            var4 = class19.method142(class387.field5365.field8765, class119.field1571, (byte)-96);
            ++class629.field9289;
         }

         var4.field10264.method611(class353.field4940 + arg1, -1344798296);
         var4.field10264.method614((byte)89, class15.field273.method2538(true, 82) ? 1 : 0);
         var4.field10264.method643(arg0, class539.field7889 + arg3);
         class549.field8103 = arg1;
         class104.field1351 = false;
         class607.field8981 = arg3;
         class121.method1066(34);
         return var4;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1802[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(ILgea;)Ljava/lang/String;"
   )
   public static final String method1165(int arg0, class66 arg1) {
      try {
         ++field1801;
         if (arg0 != 15923) {
            method1166(62, (Object[])null, (long[])null);
         }

         return class28.method218(-126, 32767, arg1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1802[4] + arg0 + ',' + (arg1 != null ? field1802[2] : field1802[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(I[Ljava/lang/Object;[J)V"
   )
   public static final void method1166(int arg0, Object[] arg1, long[] arg2) {
      try {
         class80.method775(0, arg2, arg2.length + arg0, -10963, arg1);
         ++field1787;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1802[6] + arg0 + ',' + (arg1 != null ? field1802[2] : field1802[3]) + ',' + (arg2 != null ? field1802[2] : field1802[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method1167(byte arg0) {
      try {
         if (arg0 != -42) {
            this.field1785 = 75;
         }

         ++field1795;
         return this.field1797 == 2 || ~this.field1797 == -4;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1802[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(IIIIIIIIIIILko;)Z"
   )
   public static final boolean method1168(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, class327 param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ig",
      name = "<init>",
      descriptor = "(BIIIIIILnl;)V"
   )
   public class142(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class713 arg7) {
      try {
         this.field1794 = arg3;
         this.field1799 = arg1;
         this.field1784 = arg6;
         this.field1789 = arg5;
         this.field1797 = arg0;
         this.field1796 = arg4;
         this.field1785 = arg2;
         this.field1793 = arg7;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1802[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field1802[2] : field1802[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1169(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1170(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
