import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class497 extends class588 {
   @OriginalMember(
      owner = "client!oga",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   private String field7273 = null;
   @OriginalMember(
      owner = "client!oga",
      name = "q",
      descriptor = "J"
   )
   private long field7274 = -1L;
   @OriginalMember(
      owner = "client!oga",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7277 = new String[]{method3750(method3749("\u0003\u0004%`2D")), method3750(method3749("\u0017Mj`\u000e")), method3750(method3749("\u0003\u0004%`;D")), method3750(method3749("\u0002\u0016(\"")), method3750(method3749("\u0003\u0004%`0D")), method3750(method3749("\u0003\u0004%`1D"))};
   @OriginalMember(
      owner = "client!oga",
      name = "s",
      descriptor = "Lhm;"
   )
   public static class230 field7267 = new class230(6, 0, 4, 2);
   @OriginalMember(
      owner = "client!oga",
      name = "p",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7272 = new String[100];
   @OriginalMember(
      owner = "client!oga",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field7271 = new int[5];
   @OriginalMember(
      owner = "client!oga",
      name = "w",
      descriptor = "I"
   )
   public static int field7266;
   @OriginalMember(
      owner = "client!oga",
      name = "v",
      descriptor = "I"
   )
   public static int field7268;
   @OriginalMember(
      owner = "client!oga",
      name = "u",
      descriptor = "I"
   )
   public static int field7270;
   @OriginalMember(
      owner = "client!oga",
      name = "y",
      descriptor = "I"
   )
   public static int field7275;
   @OriginalMember(
      owner = "client!oga",
      name = "t",
      descriptor = "I"
   )
   public static int field7276;
   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "Ltd;"
   )
   public static class476 field7269;

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(Lwga;I)V"
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         arg0.method5610(-128, this.field7274, this.field7273);
         if (arg1 <= -120) {
            ++field7266;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7277[5] + (arg0 != null ? field7277[1] : field7277[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3747(int arg0) {
      try {
         field7267 = null;
         field7269 = null;
         field7272 = null;
         field7271 = null;
         int var1 = -62 % ((41 - arg0) / 38);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7277[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         ++field7276;
         int var3 = -21 % ((arg0 - -26) / 33);
         if (arg1.method3564((byte)-53) != 255) {
            --arg1.field6907;
            this.field7274 = arg1.method3523(48);
         }

         this.field7273 = arg1.method3529(false);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7277[2] + arg0 + ',' + (arg1 != null ? field7277[1] : field7277[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(BIII)I"
   )
   public static final int method3748(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7270;
         if (arg0 <= 85) {
            field7269 = null;
         }

         int var6 = arg2 & 3;
         if (var6 == 0) {
            return arg1;
         } else if (var6 == 1) {
            return -arg3 + 4095;
         } else {
            return var6 == 2 ? -arg1 + 4095 : arg3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7277[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3749(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3750(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
