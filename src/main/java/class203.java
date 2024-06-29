import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class203 implements class680 {
   @OriginalMember(
      owner = "client!gi",
      name = "h",
      descriptor = "Lsa;"
   )
   private class39 field2898;
   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2906 = new String[]{method1767(method1766("\u001aZDD\u001e")), method1767(method1766("\u001aZDG\u001e")), method1767(method1766("\u001aZD@\u001e")), method1767(method1766("\u001aZDC\u001e")), method1767(method1766("\u001aZDA\u001e")), method1767(method1766("\u0013F\u0006n")), method1767(method1766("\u0006\u001dD,K")), method1767(method1766("\u001aZD>_\u0013Z\u001e<\u001e")), method1767(method1766("\u001aZDF\u001e"))};
   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "Lhha;"
   )
   public static class724 field2900 = new class724(109, 3);
   @OriginalMember(
      owner = "client!gi",
      name = "b",
      descriptor = "Lbu;"
   )
   public static class234 field2902 = new class234(14, 0, 4, 1);
   @OriginalMember(
      owner = "client!gi",
      name = "d",
      descriptor = "I"
   )
   public static int field2897;
   @OriginalMember(
      owner = "client!gi",
      name = "c",
      descriptor = "I"
   )
   public static int field2899;
   @OriginalMember(
      owner = "client!gi",
      name = "i",
      descriptor = "I"
   )
   public static int field2901;
   @OriginalMember(
      owner = "client!gi",
      name = "g",
      descriptor = "I"
   )
   public static int field2903;
   @OriginalMember(
      owner = "client!gi",
      name = "f",
      descriptor = "I"
   )
   public static int field2905;
   @OriginalMember(
      owner = "client!gi",
      name = "e",
      descriptor = "Leh;"
   )
   public static class543 field2904;

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(B)Leo;"
   )
   public final class344 method1760(byte arg0) {
      try {
         ++field2901;
         if (arg0 != 54) {
            field2902 = null;
         }

         return class344.field5062;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2906[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(Lbt;B)V"
   )
   public static final void method1761(class395 arg0, byte arg1) {
      try {
         ++field2903;
         if (arg1 == -116) {
            if (!(arg0 instanceof class799)) {
               if (arg0 instanceof class158) {
                  class158 var2 = (class158)arg0;
                  class41.method481(var2, (byte)-113, ~class117.field1849.field6824 != ~var2.field6824);
                  return;
               }
            } else {
               class799 var3 = (class799)arg0;
               if (var3.field11618 == null) {
                  return;
               }

               class757.method5468(var3, ~class117.field1849.field6824 != ~var3.field6824, (byte)41);
            }

         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2906[8] + (arg0 != null ? field2906[6] : field2906[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method1762(byte arg0) {
      try {
         field2902 = null;
         field2900 = null;
         if (arg0 != -17) {
            field2902 = null;
         }

         field2904 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2906[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method1763(byte arg0) {
      try {
         ++field2897;
         if (arg0 >= -66) {
            method1761((class395)null, (byte)105);
         }

         return this.field2898.method455(99) ? 100 : this.field2898.method436((byte)-111);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2906[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(IBLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V"
   )
   public static final void method1764(int arg0, byte arg1, String arg2, String arg3, int arg4, String arg5, String arg6) {
      try {
         class722.method5226((String)null, arg4, arg2, arg0, 24778, -1, arg5, arg3, arg6);
         ++field2899;
         if (arg1 != -7) {
            field2902 = null;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field2906[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2906[6] : field2906[5]) + ',' + (arg3 != null ? field2906[6] : field2906[5]) + ',' + arg4 + ',' + (arg5 != null ? field2906[6] : field2906[5]) + ',' + (arg6 != null ? field2906[6] : field2906[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "<init>",
      descriptor = "(Lsa;)V"
   )
   public class203(class39 arg0) {
      try {
         this.field2898 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2906[7] + (arg0 != null ? field2906[6] : field2906[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1765(int arg0) {
      try {
         if (class528.field7463 != arg0) {
            class527.field7461.method2114(0);
            class127.method1303(0);
            class547.method4097(arg0 ^ 7);
         }

         ++field2905;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2906[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1766(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1767(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
