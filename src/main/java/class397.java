import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class397 extends class606 {
   @OriginalMember(
      owner = "client!me",
      name = "E",
      descriptor = "Z"
   )
   private boolean field5877 = true;
   @OriginalMember(
      owner = "client!me",
      name = "I",
      descriptor = "I"
   )
   private int field5879 = 4096;
   @OriginalMember(
      owner = "client!me",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5884 = new String[]{method3092(method3091("]Z_\u0016J")), method3092(method3091("]Z_\u0017J")), method3092(method3091("]Z_\u0015J")), method3092(method3091("K\u0011_z\u001f")), method3092(method3091("^J\u001d8")), method3092(method3091("]Z_\u0011J"))};
   @OriginalMember(
      owner = "client!me",
      name = "D",
      descriptor = "Ljga;"
   )
   public static class91 field5880 = null;
   @OriginalMember(
      owner = "client!me",
      name = "L",
      descriptor = "I"
   )
   public static int field5876;
   @OriginalMember(
      owner = "client!me",
      name = "G",
      descriptor = "I"
   )
   public static int field5881;
   @OriginalMember(
      owner = "client!me",
      name = "J",
      descriptor = "I"
   )
   public static int field5882;
   @OriginalMember(
      owner = "client!me",
      name = "H",
      descriptor = "I"
   )
   public static int field5883;
   @OriginalMember(
      owner = "client!me",
      name = "K",
      descriptor = "J"
   )
   public static long field5878;

   @OriginalMember(
      owner = "client!me",
      name = "<init>",
      descriptor = "()V"
   )
   public class397() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label48: {
            label42: {
               ++field5883;
               if (arg1 != 0) {
                  if (~arg1 != -2) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field5879 = arg0.method685(-2);
               if (!var4) {
                  break label48;
               }
            }

            this.field5877 = arg0.method665(false) == 1;
         }

         if (arg2 > -6) {
            method3089(78);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5884[2] + (arg0 != null ? field5884[3] : field5884[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3089(int arg0) {
      try {
         field5880 = null;
         int var1 = 126 / ((arg0 - -9) / 61);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5884[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field5876;
         if (arg0 != 373) {
            this.field5877 = false;
         }

         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (super.field8649.field11043) {
            int[] var5 = this.method4463(class801.field11660 & arg1 + -1, 13064, 0);
            int[] var6 = this.method4463(arg1, 13064, 0);
            int[] var7 = this.method4463(arg1 - -1 & class801.field11660, 13064, 0);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int var11 = 0;
            if (var3 || class563.field8014 > var11) {
               do {
                  int var19;
                  int var20;
                  int var21;
                  label33: {
                     int var12 = (var7[var11] + -var5[var11]) * this.field5879;
                     int var13 = (var6[class358.field5293 & var11 + 1] + -var6[class358.field5293 & var11 + -1]) * this.field5879;
                     int var14 = var13 >> 12;
                     int var15 = var12 >> 12;
                     int var16 = var14 * var14 >> 12;
                     int var17 = var15 * var15 >> 12;
                     int var18 = (int)(4096.0D * Math.sqrt((double)((float)(var16 + var17 + 4096) / 4096.0F)));
                     if (var18 != 0) {
                        var19 = var12 / var18;
                        var20 = 16777216 / var18;
                        var21 = var13 / var18;
                        if (!var3) {
                           break label33;
                        }
                     }

                     var19 = 0;
                     var21 = 0;
                     var20 = 0;
                  }

                  if (this.field5877) {
                     var21 = 2048 - -(var21 >> 1);
                     var19 = (var19 >> 1) + 2048;
                     var20 = 2048 - -(var20 >> 1);
                  }

                  var8[var11] = var21;
                  var9[var11] = var19;
                  var10[var11] = var20;
                  ++var11;
               } while(class563.field8014 > var11);
            }
         }

         return var4;
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field5884[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method3090(byte arg0, int arg1) {
      try {
         ++field5882;
         if (arg0 > -107) {
            return 43;
         } else {
            int var2 = arg1 >>> 1;
            int var3 = var2 | var2 >>> 1;
            int var4 = var3 | var3 >>> 2;
            int var5 = var4 | var4 >>> 4;
            int var6 = var5 | var5 >>> 8;
            int var7 = var6 | var6 >>> 16;
            return arg1 & ~var7;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field5884[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3091(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3092(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
