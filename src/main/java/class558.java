import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class558 extends class690 {
   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7655 = new String[]{method4019(method4018(";d%HF")), method4019(method4018(";d%LF")), method4019(method4018("=}gf")), method4019(method4018("(&%$\u0013")), method4019(method4018(";d%NF")), method4019(method4018(";d%KF")), method4019(method4018(";d%IF")), method4019(method4018(";d%OF"))};
   @OriginalMember(
      owner = "client!hl",
      name = "r",
      descriptor = "[Lkda;"
   )
   public static class411[] field7652 = new class411[5];
   @OriginalMember(
      owner = "client!hl",
      name = "q",
      descriptor = "Ltv;"
   )
   public static class590 field7654;
   @OriginalMember(
      owner = "client!hl",
      name = "t",
      descriptor = "I"
   )
   public static int field7646;
   @OriginalMember(
      owner = "client!hl",
      name = "n",
      descriptor = "I"
   )
   public static int field7647;
   @OriginalMember(
      owner = "client!hl",
      name = "s",
      descriptor = "I"
   )
   public static int field7648;
   @OriginalMember(
      owner = "client!hl",
      name = "u",
      descriptor = "I"
   )
   private int field7649;
   @OriginalMember(
      owner = "client!hl",
      name = "p",
      descriptor = "I"
   )
   private int field7650;
   @OriginalMember(
      owner = "client!hl",
      name = "m",
      descriptor = "I"
   )
   public static int field7651;
   @OriginalMember(
      owner = "client!hl",
      name = "o",
      descriptor = "I"
   )
   public static int field7653;

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(IC)I"
   )
   public static final int method4014(int arg0, char arg1) {
      try {
         ++field7646;
         if (~arg1 <= -1 && class102.field1314.length > arg1) {
            return class102.field1314[arg1];
         } else {
            if (arg0 != -891902748) {
               method4017((byte)-97);
            }

            return -1;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7655[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method4015(int arg0, boolean arg1) {
      try {
         ++field7651;
         if (arg1) {
            field7654 = null;
         }

         int var2 = arg0 >>> 1;
         int var3 = var2 | var2 >>> 1;
         int var4 = var3 | var3 >>> 2;
         int var5 = var4 | var4 >>> 4;
         int var6 = var5 | var5 >>> 8;
         int var7 = var6 | var6 >>> 16;
         return ~var7 & arg0;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field7655[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         if (arg1 >= -19) {
            field7652 = null;
         }

         this.field7649 = arg0.method4302(true);
         ++field7648;
         this.field7650 = arg0.method4302(true);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7655[4] + (arg0 != null ? field7655[3] : field7655[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method4016(boolean arg0) {
      try {
         field7652 = null;
         if (!arg0) {
            field7654 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7655[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         if (!arg0) {
            arg1.method1172(this.field7650, (byte)-39, this.field7649);
            ++field7653;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7655[6] + arg0 + ',' + (arg1 != null ? field7655[3] : field7655[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method4017(byte arg0) {
      try {
         ++field7647;
         return arg0 != -32 ? -95 : class25.method216(-127, false);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7655[7] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < field7652.length; ++var0) {
         field7652[var0] = new class411();
      }

      field7654 = new class590(8);
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4018(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4019(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
