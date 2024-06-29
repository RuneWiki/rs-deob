import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class676 extends class213 {
   @OriginalMember(
      owner = "client!it",
      name = "G",
      descriptor = "I"
   )
   private int field9922 = 585;
   @OriginalMember(
      owner = "client!it",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9925 = new String[]{method4955(method4954("d^X0\"")), method4955(method4954("q\u0005\u001ar")), method4955(method4954("v\u0004XYw")), method4955(method4954("v\u0004X_w")), method4955(method4954("v\u0004XZw")), method4955(method4954("v\u0004X\\w")), method4955(method4954("v\u0004X]w"))};
   @OriginalMember(
      owner = "client!it",
      name = "E",
      descriptor = "F"
   )
   public static float field9918 = 1024.0F;
   @OriginalMember(
      owner = "client!it",
      name = "H",
      descriptor = "Lbga;"
   )
   public static class378 field9916 = new class378(65, -2);
   @OriginalMember(
      owner = "client!it",
      name = "K",
      descriptor = "I"
   )
   public static int field9915;
   @OriginalMember(
      owner = "client!it",
      name = "M",
      descriptor = "I"
   )
   public static int field9917;
   @OriginalMember(
      owner = "client!it",
      name = "F",
      descriptor = "I"
   )
   public static int field9919;
   @OriginalMember(
      owner = "client!it",
      name = "L",
      descriptor = "I"
   )
   public static int field9920;
   @OriginalMember(
      owner = "client!it",
      name = "I",
      descriptor = "I"
   )
   public static int field9921;
   @OriginalMember(
      owner = "client!it",
      name = "N",
      descriptor = "I"
   )
   public static int field9923;
   @OriginalMember(
      owner = "client!it",
      name = "O",
      descriptor = "I"
   )
   public static int field9924;

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method4951(byte arg0, int arg1) {
      try {
         ++field9917;
         if (arg0 <= 83) {
            method4953(-122);
         }

         return arg1 >= 12 && ~arg1 >= -18;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9925[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field9923;
         int[] var4 = super.field2650.method3769(arg0, arg1 + -2064866512);
         if (arg1 != 2064866508) {
            return null;
         } else {
            if (super.field2650.field7140) {
               int var5 = class551.field7586[arg0];
               int var6 = 0;
               if (var3 || var6 < class576.field7916) {
                  do {
                     label114: {
                        int var7 = class534.field7301[var6];
                        if (var7 > this.field9922 && 4096 - this.field9922 > var7 && ~(-this.field9922 + 2048) > ~var5 && this.field9922 + 2048 > var5) {
                           int var8 = 2048 - var7;
                           int var9 = var8 < 0 ? -var8 : var8;
                           int var10 = var9 << 12;
                           int var11 = var10 / (2048 - this.field9922);
                           var4[var6] = -var11 + 4096;
                           if (!var3) {
                              break label114;
                           }
                        }

                        if (~var7 < ~(-this.field9922 + 2048) && ~(this.field9922 + 2048) < ~var7) {
                           int var12 = var5 + -2048;
                           int var13 = var12 >= 0 ? var12 : -var12;
                           int var14 = var13 - this.field9922;
                           int var15 = var14 << 12;
                           var4[var6] = var15 / (-this.field9922 + 2048);
                           if (!var3) {
                              break label114;
                           }
                        }

                        if (this.field9922 > var5 || ~var5 < ~(-this.field9922 + 4096)) {
                           int var16 = var7 + -2048;
                           int var17 = var16 >= 0 ? var16 : -var16;
                           int var18 = var17 - this.field9922;
                           int var19 = var18 << 12;
                           var4[var6] = var19 / (-this.field9922 + 2048);
                           if (!var3) {
                              break label114;
                           }
                        }

                        if (var7 < this.field9922 || var7 > 4096 - this.field9922) {
                           int var20 = -var5 + 2048;
                           int var21 = ~var20 <= -1 ? var20 : -var20;
                           int var22 = var21 << 12;
                           int var23 = var22 / (-this.field9922 + 2048);
                           var4[var6] = -var23 + 4096;
                           if (!var3) {
                              break label114;
                           }
                        }

                        var4[var6] = 0;
                     }

                     ++var6;
                  } while(var6 < class576.field7916);
               }
            }

            return var4;
         }
      } catch (RuntimeException var25) {
         throw class534.method3846(var25, field9925[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         int var4 = 122 / ((68 - arg1) / 48);
         if (~arg2 == -1) {
            this.field9922 = arg0.method4280(-19104);
         }

         ++field9915;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9925[2] + (arg0 != null ? field9925[0] : field9925[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4952(int arg0) {
      try {
         if (arg0 < -116) {
            field9916 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9925[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "<init>",
      descriptor = "()V"
   )
   public class676() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!it",
      name = "h",
      descriptor = "(I)V"
   )
   public static final void method4953(int arg0) {
      try {
         class616.field8591 = "";
         class631.field8834 = "";
         ++field9920;
         if (arg0 > -116) {
            method4952(8);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9925[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!it",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4954(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!it",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4955(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
