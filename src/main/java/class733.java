import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class733 extends class213 {
   @OriginalMember(
      owner = "client!no",
      name = "G",
      descriptor = "I"
   )
   private int field10721 = 4096;
   @OriginalMember(
      owner = "client!no",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10723 = new String[]{method5322(method5321("O\u000f`\u0006\u0000")), method5322(method5321("ZT\"D")), method5322(method5321("ZN`oU")), method5322(method5321("ZN`jU")), method5322(method5321("ZN`iU"))};
   @OriginalMember(
      owner = "client!no",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field10720 = new int[8];
   @OriginalMember(
      owner = "client!no",
      name = "H",
      descriptor = "I"
   )
   public static int field10719;
   @OriginalMember(
      owner = "client!no",
      name = "E",
      descriptor = "I"
   )
   public static int field10722;

   @OriginalMember(
      owner = "client!no",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method5320(boolean arg0) {
      try {
         if (!arg0) {
            field10720 = null;
         }

         field10720 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10723[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         int var4 = -73 / ((68 - arg1) / 48);
         ++field10722;
         if (arg2 == 0) {
            this.field10721 = arg0.method4280(-19104);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10723[2] + (arg0 != null ? field10723[0] : field10723[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field10719;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int[] var5 = this.method1619((byte)45, class40.field468 & arg0 + -1, 0);
            int[] var6 = this.method1619((byte)98, arg0, 0);
            int[] var7 = this.method1619((byte)94, arg0 + 1 & class40.field468, 0);
            int var8 = 0;
            if (var3 || ~class576.field7916 < ~var8) {
               do {
                  int var9 = (var7[var8] + -var5[var8]) * this.field10721;
                  int var10 = (var6[var8 + 1 & class676.field9924] + -var6[class676.field9924 & var8 + -1]) * this.field10721;
                  int var11 = var10 >> 12;
                  int var12 = var9 >> 12;
                  int var13 = var11 * var11 >> 12;
                  int var14 = var12 * var12 >> 12;
                  int var15 = (int)(4096.0D * Math.sqrt((double)((float)(var13 + var14 + 4096) / 4096.0F)));
                  int var16 = var15 == 0 ? 0 : 16777216 / var15;
                  var4[var8] = -var16 + 4096;
                  ++var8;
               } while(~class576.field7916 < ~var8);
            }
         }

         return arg1 != 2064866508 ? null : var4;
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field10723[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!no",
      name = "<init>",
      descriptor = "()V"
   )
   public class733() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5321(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!no",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5322(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
