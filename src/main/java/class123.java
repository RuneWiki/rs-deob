import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class123 extends class213 {
   @OriginalMember(
      owner = "client!bm",
      name = "G",
      descriptor = "Z"
   )
   private boolean field1536 = true;
   @OriginalMember(
      owner = "client!bm",
      name = "F",
      descriptor = "I"
   )
   private int field1537 = 4096;
   @OriginalMember(
      owner = "client!bm",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1538 = new String[]{method1036(method1035("^n-\u000eB")), method1036(method1035("^n-\u0003B")), method1036(method1035("Rvo(")), method1036(method1035("G--j\u0017"))};
   @OriginalMember(
      owner = "client!bm",
      name = "E",
      descriptor = "I"
   )
   public static int field1533;
   @OriginalMember(
      owner = "client!bm",
      name = "H",
      descriptor = "I"
   )
   public static int field1534;
   @OriginalMember(
      owner = "client!bm",
      name = "D",
      descriptor = "I"
   )
   public static int field1535;

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label43: {
            label38: {
               if (~arg2 != -1) {
                  if (~arg2 != -2) {
                     break label43;
                  }

                  if (!var4) {
                     break label38;
                  }
               }

               this.field1537 = arg0.method4280(-19104);
               if (!var4) {
                  break label43;
               }
            }

            this.field1536 = arg0.method4288((byte)75) == 1;
         }

         int var6 = 71 / ((arg1 - 68) / 48);
         ++field1535;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1538[1] + (arg0 != null ? field1538[3] : field1538[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "<init>",
      descriptor = "()V"
   )
   public class123() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field1533;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 <= 26) {
            return null;
         } else {
            if (super.field2644.field6719) {
               int[] var5 = this.method1619((byte)113, arg0 - 1 & class40.field468, 0);
               int[] var6 = this.method1619((byte)125, arg0, 0);
               int[] var7 = this.method1619((byte)103, arg0 - -1 & class40.field468, 0);
               int[] var8 = var4[0];
               int[] var9 = var4[1];
               int[] var10 = var4[2];
               int var11 = 0;
               if (var3 || ~class576.field7916 < ~var11) {
                  do {
                     int var12 = (var7[var11] + -var5[var11]) * this.field1537;
                     int var13 = (var6[class676.field9924 & var11 + 1] + -var6[var11 + -1 & class676.field9924]) * this.field1537;
                     int var14 = var13 >> 12;
                     int var15 = var12 >> 12;
                     int var16 = var14 * var14 >> 12;
                     int var17 = var15 * var15 >> 12;
                     int var18 = (int)(4096.0D * Math.sqrt((double)((float)(var17 + 4096 + var16) / 4096.0F)));
                     int var19;
                     int var20;
                     int var21;
                     if (var18 != 0) {
                        var19 = 16777216 / var18;
                        var20 = var13 / var18;
                        var21 = var12 / var18;
                        if (var3) {
                           var20 = 0;
                           var19 = 0;
                           var21 = 0;
                        }
                     } else {
                        var20 = 0;
                        var19 = 0;
                        var21 = 0;
                     }

                     if (this.field1536) {
                        var20 = (var20 >> 1) + 2048;
                        var19 = (var19 >> 1) + 2048;
                        var21 = (var21 >> 1) + 2048;
                     }

                     var8[var11] = var20;
                     var9[var11] = var21;
                     var10[var11] = var19;
                     ++var11;
                  } while(~class576.field7916 < ~var11);
               }
            }

            return var4;
         }
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field1538[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1035(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1036(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
