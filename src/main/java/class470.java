import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class470 extends class437 {
   @OriginalMember(
      owner = "client!qd",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6836 = new String[]{method3514(method3513("\"\u0005=Jc")), method3514(method3513("\"\u0005=Lc")), method3514(method3513("\"\u0005=Cc")), method3514(method3513("\"\u0005=Hc")), method3514(method3513("=\u0014\u007fg")), method3514(method3513("(O=%6")), method3514(method3513("\"\u0005=Mc"))};
   @OriginalMember(
      owner = "client!qd",
      name = "G",
      descriptor = "Lqda;"
   )
   public static class112 field6831 = new class112();
   @OriginalMember(
      owner = "client!qd",
      name = "H",
      descriptor = "Ljfa;"
   )
   public static class303 field6834 = null;
   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "I"
   )
   public static int field6828;
   @OriginalMember(
      owner = "client!qd",
      name = "E",
      descriptor = "I"
   )
   public static int field6829;
   @OriginalMember(
      owner = "client!qd",
      name = "F",
      descriptor = "I"
   )
   public static int field6830;
   @OriginalMember(
      owner = "client!qd",
      name = "B",
      descriptor = "I"
   )
   public static int field6832;
   @OriginalMember(
      owner = "client!qd",
      name = "y",
      descriptor = "I"
   )
   public static int field6833;
   @OriginalMember(
      owner = "client!qd",
      name = "A",
      descriptor = "I"
   )
   public static int field6835;
   @OriginalMember(
      owner = "client!qd",
      name = "D",
      descriptor = "[B"
   )
   private byte[] field6827;

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "([B[I[[B[I[[BIII)I"
   )
   public static final int method3509(byte[] arg0, int[] arg1, byte[][] arg2, int[] arg3, byte[][] arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4564;

      try {
         ++field6828;
         int var9 = arg3[arg7];
         int var10 = var9 - -arg1[arg7];
         int var11 = arg3[arg6];
         int var12 = arg1[arg6] + var11;
         int var13 = var9;
         if (var11 > var9) {
            var13 = var11;
         }

         if (arg5 != -32352) {
            field6834 = null;
         }

         int var14 = var10;
         if (~var10 < ~var12) {
            var14 = var12;
         }

         int var15 = 255 & arg0[arg7];
         if (var15 > (arg0[arg6] & 255)) {
            var15 = arg0[arg6] & 255;
         }

         byte[] var16 = arg2[arg7];
         byte[] var17 = arg4[arg6];
         int var18 = -var9 + var13;
         int var19 = -var11 + var13;
         int var20 = var13;
         int var21;
         if (var8) {
            var21 = var17[var19++] + var16[var18++];
            if (var21 < var15) {
               var15 = var21;
            }

            var20 = var13 + 1;
         }

         while(true) {
            while(~var14 < ~var20) {
               var21 = var17[var19++] + var16[var18++];
               if (var21 < var15) {
                  var15 = var21;
               }

               ++var20;
            }

            int var24 = -var15;
            if (!var8) {
               return var24;
            }

            var21 = var24;
            if (var21 < var15) {
               var15 = var21;
            }

            ++var20;
         }
      } catch (RuntimeException var23) {
         throw class608.method4462(var23, field6836[3] + (arg0 != null ? field6836[5] : field6836[4]) + ',' + (arg1 != null ? field6836[5] : field6836[4]) + ',' + (arg2 != null ? field6836[5] : field6836[4]) + ',' + (arg3 != null ? field6836[5] : field6836[4]) + ',' + (arg4 != null ? field6836[5] : field6836[4]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3510(int arg0) {
      try {
         if (arg0 > -109) {
            method3511((class457)null, -116);
         }

         field6834 = null;
         field6831 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6836[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(Laf;I)V"
   )
   public static final void method3511(class457 arg0, int arg1) {
      try {
         if (arg1 != 255) {
            method3511((class457)null, 110);
         }

         ++field6829;
         class618 var2 = (class618)class638.field9308.method1572((long)arg0.field11306, arg1 + -16544);
         if (var2 != null) {
            if (var2.field8978 != null) {
               class749.field10795.method1606(var2.field8978);
               var2.field8978 = null;
            }

            var2.method154(arg1 ^ -134);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6836[6] + (arg0 != null ? field6836[5] : field6836[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(IIIB)[B"
   )
   public final byte[] method3512(int arg0, int arg1, int arg2, byte arg3) {
      try {
         this.field6827 = new byte[arg0 * 2 * arg1 * arg2];
         ++field6835;
         this.method2345(arg2, false, arg0, arg1);
         if (arg3 >= -32) {
            method3509((byte[])null, (int[])null, (byte[][])null, (int[])null, (byte[][])null, 12, -113, -119);
         }

         return this.field6827;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6836[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(BBI)V"
   )
   public final void method2571(byte arg0, byte arg1, int arg2) {
      try {
         ++field6833;
         byte var7 = (byte)((arg0 >> 1 & 127) + 127);
         int var4 = arg2 * 2;
         int var10001 = var4;
         int var8 = var4 + 1;
         this.field6827[var10001] = var7;
         if (arg1 < 85) {
            field6831 = null;
         }

         this.field6827[var8] = var7;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6836[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "<init>",
      descriptor = "()V"
   )
   public class470() {
      super(12, 5, 16, 2, 2, 0.45F);
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3513(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3514(char[] arg0) {
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
            var10005 = 97;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
