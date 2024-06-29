import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class642 extends class606 {
   @OriginalMember(
      owner = "client!tr",
      name = "D",
      descriptor = "I"
   )
   private int field9038 = 585;
   @OriginalMember(
      owner = "client!tr",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9040 = new String[]{method4675(method4674("lI\u0007`\u007f")), method4675(method4674("vNED")), method4675(method4674("c\u0015\u0007\u0006*")), method4675(method4674("lI\u0007i\u007f")), method4675(method4674("lI\u0007m\u007f")), method4675(method4674("lI\u0007o\u007f")), method4675(method4674("lI\u0007k\u007f"))};
   @OriginalMember(
      owner = "client!tr",
      name = "J",
      descriptor = "[I"
   )
   public static int[] field9032 = new int[2];
   @OriginalMember(
      owner = "client!tr",
      name = "G",
      descriptor = "I"
   )
   public static int field9035 = -1;
   @OriginalMember(
      owner = "client!tr",
      name = "F",
      descriptor = "I"
   )
   public static int field9034 = 2;
   @OriginalMember(
      owner = "client!tr",
      name = "I",
      descriptor = "I"
   )
   public static int field9033;
   @OriginalMember(
      owner = "client!tr",
      name = "K",
      descriptor = "I"
   )
   public static int field9036;
   @OriginalMember(
      owner = "client!tr",
      name = "E",
      descriptor = "I"
   )
   public static int field9037;
   @OriginalMember(
      owner = "client!tr",
      name = "H",
      descriptor = "I"
   )
   public static int field9039;

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method4671(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         class286.field4289 = arg4;
         class542.field7636 = arg2;
         class205.field2915 = arg1;
         ++field9039;
         if (arg5 != 19855) {
            field9034 = 109;
         }

         class508.field7211 = arg3;
         class782.field11394 = arg0;
         class341.field5018 = arg6;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field9040[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field9036;
         if (arg1 == 0) {
            this.field9038 = arg0.method685(-2);
         }

         if (arg2 >= -6) {
            field9032 = null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9040[3] + (arg0 != null ? field9040[2] : field9040[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "<init>",
      descriptor = "()V"
   )
   public class642() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!tr",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method4672(int arg0, int arg1, int arg2) {
      try {
         ++field9033;
         if (arg2 != -1416) {
            method4671(-53, -108, -43, 35, -95, 84, -53);
         }

         return ~(arg1 & 256) != -1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9040[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4673(int arg0) {
      try {
         if (arg0 != 585) {
            method4673(70);
         }

         field9032 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9040[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field9037;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (arg0 != 0) {
            this.method8((class65)null, -106, -106);
         }

         if (super.field8645.field4884) {
            int var5 = class693.field10001[arg1];
            int var6 = 0;
            if (var3 || ~class563.field8014 < ~var6) {
               do {
                  int var7 = class387.field5650[var6];
                  if (~var7 < ~this.field9038 && ~(4096 - this.field9038) < ~var7 && -this.field9038 + 2048 < var5 && ~(this.field9038 + 2048) < ~var5) {
                     int var8 = -var7 + 2048;
                     int var9 = var8 < 0 ? -var8 : var8;
                     int var10 = var9 << 12;
                     int var11 = var10 / (-this.field9038 + 2048);
                     var4[var6] = -var11 + 4096;
                     if (!var3) {
                        ++var6;
                        continue;
                     }
                  }

                  if (2048 - this.field9038 < var7 && var7 < this.field9038 + 2048) {
                     int var12 = var5 + -2048;
                     int var13 = var12 < 0 ? -var12 : var12;
                     int var14 = var13 - this.field9038;
                     int var15 = var14 << 12;
                     var4[var6] = var15 / (-this.field9038 + 2048);
                     if (!var3) {
                        ++var6;
                        continue;
                     }
                  }

                  label101: {
                     int var16;
                     int var10000;
                     if (this.field9038 <= var5) {
                        if (~(-this.field9038 + 4096) <= ~var5) {
                           break label101;
                        }

                        var16 = var7 + -2048;
                        var10000 = ~var16 > -1 ? -var16 : var16;
                     } else {
                        var16 = var7 + -2048;
                        var10000 = ~var16 > -1 ? -var16 : var16;
                     }

                     int var17 = var10000;
                     int var18 = var17 - this.field9038;
                     int var19 = var18 << 12;
                     var4[var6] = var19 / (-this.field9038 + 2048);
                     if (!var3) {
                        ++var6;
                        continue;
                     }
                  }

                  if (this.field9038 <= var7 && var7 <= -this.field9038 + 4096) {
                     var4[var6] = 0;
                     ++var6;
                  } else {
                     int var20 = 2048 - var5;
                     int var21 = var20 >= 0 ? var20 : -var20;
                     int var22 = var21 << 12;
                     int var23 = var22 / (-this.field9038 + 2048);
                     var4[var6] = -var23 + 4096;
                     if (var3) {
                        var4[var6] = 0;
                     }

                     ++var6;
                  }
               } while(~class563.field8014 < ~var6);
            }
         }

         return var4;
      } catch (RuntimeException var25) {
         throw class612.method4503(var25, field9040[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4674(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4675(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
