import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class7 extends class606 {
   @OriginalMember(
      owner = "client!nw",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field135 = new String[]{method63(method62("`\u001bgk")), method63(method62("u@%)<")), method63(method62("`\u0019%Fi")), method63(method62("`\u0019%Oi")), method63(method62("`\u0019%Ei")), method63(method62("`\u0019%Di"))};
   @OriginalMember(
      owner = "client!nw",
      name = "H",
      descriptor = "Lhha;"
   )
   public static class724 field121 = new class724(47, 4);
   @OriginalMember(
      owner = "client!nw",
      name = "N",
      descriptor = "I"
   )
   public static int field125 = 0;
   @OriginalMember(
      owner = "client!nw",
      name = "P",
      descriptor = "I"
   )
   public static volatile int field130 = -1;
   @OriginalMember(
      owner = "client!nw",
      name = "Q",
      descriptor = "Z"
   )
   public static boolean field128 = true;
   @OriginalMember(
      owner = "client!nw",
      name = "M",
      descriptor = "Z"
   )
   public static boolean field131 = true;
   @OriginalMember(
      owner = "client!nw",
      name = "F",
      descriptor = "I"
   )
   public static int field133 = 0;
   @OriginalMember(
      owner = "client!nw",
      name = "K",
      descriptor = "Lhha;"
   )
   public static class724 field129 = new class724(102, 2);
   @OriginalMember(
      owner = "client!nw",
      name = "O",
      descriptor = "I"
   )
   public static int field122;
   @OriginalMember(
      owner = "client!nw",
      name = "I",
      descriptor = "I"
   )
   public static int field123;
   @OriginalMember(
      owner = "client!nw",
      name = "L",
      descriptor = "I"
   )
   public static int field124;
   @OriginalMember(
      owner = "client!nw",
      name = "G",
      descriptor = "I"
   )
   public static int field127;
   @OriginalMember(
      owner = "client!nw",
      name = "E",
      descriptor = "I"
   )
   public static int field132;
   @OriginalMember(
      owner = "client!nw",
      name = "R",
      descriptor = "I"
   )
   public static int field134;
   @OriginalMember(
      owner = "client!nw",
      name = "J",
      descriptor = "Lsa;"
   )
   public static class39 field126;

   @OriginalMember(
      owner = "client!nw",
      name = "<init>",
      descriptor = "()V"
   )
   public class7() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!nw",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method61(int arg0) {
      try {
         field129 = null;
         field121 = null;
         if (arg0 != -17254) {
            method61(37);
         }

         field126 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field135[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field123;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int[] var5 = this.method4463(arg1, 13064, 0);
            int[] var6 = this.method4463(arg1, 13064, 1);
            int[] var7 = this.method4463(arg1, 13064, 2);
            int var8 = 0;
            if (var3 || ~var8 > ~class563.field8014) {
               do {
                  int var9 = var7[var8];
                  if (~var9 == -4097) {
                     var4[var8] = var5[var8];
                     if (!var3) {
                        ++var8;
                        continue;
                     }
                  }

                  if (~var9 != -1) {
                     var4[var8] = (-var9 + 4096) * var6[var8] + var5[var8] * var9 >> 12;
                     if (var3) {
                        var4[var8] = var6[var8];
                        ++var8;
                     } else {
                        ++var8;
                     }
                  } else {
                     var4[var8] = var6[var8];
                     ++var8;
                  }
               } while(~var8 > ~class563.field8014);
            }
         }

         if (arg0 != 0) {
            field134 = -123;
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field135[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field122;
         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (arg0 != 373) {
            field125 = -102;
         }

         if (super.field8649.field11043) {
            int[] var5 = this.method4463(arg1, arg0 + 12691, 2);
            int[][] var6 = this.method4467(0, arg1, (byte)121);
            int[][] var7 = this.method4467(1, arg1, (byte)58);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            int var17 = 0;
            if (var3 || var17 < class563.field8014) {
               do {
                  int var18 = var5[var17];
                  if (var18 != 4096) {
                     if (~var18 == -1) {
                        var8[var17] = var14[var17];
                        var9[var17] = var15[var17];
                        var10[var17] = var16[var17];
                        if (!var3) {
                           ++var17;
                           continue;
                        }
                     }

                     int var19 = -var18 + 4096;
                     var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                     var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                     var10[var17] = var13[var17] * var18 - -(var16[var17] * var19) >> 12;
                     if (!var3) {
                        ++var17;
                        continue;
                     }
                  }

                  var8[var17] = var11[var17];
                  var9[var17] = var12[var17];
                  var10[var17] = var13[var17];
                  ++var17;
               } while(var17 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field135[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field124;
         if (arg2 >= -6) {
            field126 = null;
         }

         if (~arg1 == -1) {
            super.field8641 = ~arg0.method665(false) == -2;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field135[2] + (arg0 != null ? field135[1] : field135[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method62(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method63(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
