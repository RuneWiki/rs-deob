import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class252 implements class579 {
   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3835 = new String[]{method2167(method2166("x\u0017\u001d\u001a")), method2167(method2166("d\b_7P")), method2167(method2166("mL_X\u0005")), method2167(method2166("d\b_5P")), method2167(method2166("d\b_4P")), method2167(method2166("|\u000e"))};
   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field3832 = new class164(11, 16);
   @OriginalMember(
      owner = "client!rj",
      name = "d",
      descriptor = "I"
   )
   public static int field3831;
   @OriginalMember(
      owner = "client!rj",
      name = "b",
      descriptor = "I"
   )
   public static int field3833;
   @OriginalMember(
      owner = "client!rj",
      name = "c",
      descriptor = "I"
   )
   public static int field3834;

   @OriginalMember(
      owner = "client!rj",
      name = "b",
      descriptor = "(I)Lso;"
   )
   public static final class316 method2163(int arg0) {
      try {
         ++field3834;

         try {
            return arg0 != 11 ? null : (class316)Class.forName(field3835[5]).newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3835[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2164(int arg0) {
      try {
         field3832 = null;
         if (arg0 != 0) {
            method2163(2);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3835[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "a",
      descriptor = "(I[IJLbu;)Ljava/lang/String;"
   )
   public final String method2165(int arg0, int[] arg1, long arg2, class234 arg3) {
      try {
         ++field3831;
         int var6 = -38 / ((arg0 - -43) / 55);
         if (class539.field7570 == arg3) {
            class623 var7 = class505.field7189.method5248((byte)45, arg1[0]);
            return var7.method4582((byte)76, (int)arg2);
         } else if (class34.field494 != arg3 && class73.field1173 != arg3) {
            return class619.field8872 != arg3 && class356.field5269 != arg3 && class596.field8393 != arg3 ? null : class505.field7189.method5248((byte)45, arg1[0]).method4582((byte)76, (int)arg2);
         } else {
            class618 var8 = class201.field2882.method5591((int)arg2, (byte)-84);
            return var8.field8781;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field3835[1] + arg0 + ',' + (arg1 != null ? field3835[2] : field3835[0]) + ',' + arg2 + ',' + (arg3 != null ? field3835[2] : field3835[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2166(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2167(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
