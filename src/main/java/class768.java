import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class768 extends class128 {
   @OriginalMember(
      owner = "client!hp",
      name = "u",
      descriptor = "I"
   )
   private int field11017 = -1;
   @OriginalMember(
      owner = "client!hp",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11028 = new String[]{method5535(method5534("\u001em!\u001e")), method5535(method5534("\u000b6c\\\u000b")), method5535(method5534("\u0018hc1^")), method5535(method5534("\u0018hc0^")), method5535(method5534("\u0018hc7^")), method5535(method5534("\u0018hc:^")), method5535(method5534("\u0018hc3^")), method5535(method5534("\u0003p\"\u0005 \u0019|(\u001d7\u0014")), method5535(method5534("\u0018hc6^"))};
   @OriginalMember(
      owner = "client!hp",
      name = "y",
      descriptor = "Lfm;"
   )
   public static class164 field11020 = new class164(90, -1);
   @OriginalMember(
      owner = "client!hp",
      name = "r",
      descriptor = "[J"
   )
   public static long[] field11023 = new long[10];
   @OriginalMember(
      owner = "client!hp",
      name = "o",
      descriptor = "B"
   )
   private byte field11019;
   @OriginalMember(
      owner = "client!hp",
      name = "x",
      descriptor = "I"
   )
   private int field11016;
   @OriginalMember(
      owner = "client!hp",
      name = "n",
      descriptor = "I"
   )
   public static int field11018;
   @OriginalMember(
      owner = "client!hp",
      name = "w",
      descriptor = "I"
   )
   public static int field11021;
   @OriginalMember(
      owner = "client!hp",
      name = "v",
      descriptor = "I"
   )
   public static int field11022;
   @OriginalMember(
      owner = "client!hp",
      name = "p",
      descriptor = "I"
   )
   public static int field11024;
   @OriginalMember(
      owner = "client!hp",
      name = "t",
      descriptor = "I"
   )
   public static int field11025;
   @OriginalMember(
      owner = "client!hp",
      name = "s",
      descriptor = "I"
   )
   public static int field11026;
   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "Lua;"
   )
   public static class569 field11027;
   @OriginalMember(
      owner = "client!hp",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   private String field11015;

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method5530(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = arg2 & 3;
         ++field11024;
         if (~var6 == -1) {
            return arg1;
         } else if (~var6 == -2) {
            return -arg0 + 7;
         } else {
            return ~var6 == arg3 ? -arg1 + 7 : arg0;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11028[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method5531(int arg0) {
      try {
         ++field11022;
         if (class202.field2887) {
            try {
               class726.method5254(arg0 + 80, class289.field4303, field11028[7]);
               return true;
            } catch (Throwable var2) {
            }
         }

         if (arg0 != 3) {
            method5532((byte)127);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11028[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method608(class65 arg0, int arg1) {
      try {
         ++field11026;
         this.field11017 = arg0.method685(arg1 + -4208);
         this.field11019 = arg0.method638(true);
         if (arg1 != 4206) {
            this.field11019 = -62;
         }

         this.field11016 = arg0.method685(-2);
         arg0.method680(-129);
         this.field11015 = arg0.method640((byte)51);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11028[3] + (arg0 != null ? field11028[1] : field11028[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5532(byte arg0) {
      try {
         int var1 = -56 / ((58 - arg0) / 44);
         field11020 = null;
         field11027 = null;
         field11023 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11028[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(Lhka;B)V"
   )
   public final void method606(class360 arg0, byte arg1) {
      try {
         ++field11018;
         int var3 = 119 % ((50 - arg1) / 53);
         class622 var4 = arg0.field5311[this.field11017];
         var4.field8890 = this.field11016;
         var4.field8883 = this.field11019;
         var4.field8891 = this.field11015;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11028[2] + (arg0 != null ? field11028[1] : field11028[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "a",
      descriptor = "(IBZI)Lsa;"
   )
   public static final class39 method5533(int arg0, byte arg1, boolean arg2, int arg3) {
      try {
         ++field11021;
         if (arg1 != -126) {
            field11023 = null;
         }

         class717 var4 = null;
         if (class762.field10868 != null) {
            var4 = new class717(arg3, class762.field10868, class251.field3821[arg3], 1000000);
         }

         class398.field5898[arg3] = class378.field5526.method2263(arg3, (byte)-22, class249.field3817, var4);
         class398.field5898[arg3].method4172(arg1 ^ 124);
         return new class39(class398.field5898[arg3], arg2, arg0);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11028[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5534(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5535(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
