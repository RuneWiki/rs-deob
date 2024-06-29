import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class798 extends class606 {
   @OriginalMember(
      owner = "client!ck",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11602 = new String[]{method5752(method5751("\r^ge,")), method5752(method5751("\r^gd,")), method5752(method5751("\r^go,")), method5752(method5751("\r^gf,")), method5752(method5751("\u0000@%K")), method5752(method5751("\u0015\u001bg\ty")), method5752(method5751("\r^gb,"))};
   @OriginalMember(
      owner = "client!ck",
      name = "G",
      descriptor = "Lwt;"
   )
   public static class9 field11597 = new class9(128);
   @OriginalMember(
      owner = "client!ck",
      name = "H",
      descriptor = "Lpl;"
   )
   public static class168 field11600 = new class168();
   @OriginalMember(
      owner = "client!ck",
      name = "E",
      descriptor = "I"
   )
   public static int field11596;
   @OriginalMember(
      owner = "client!ck",
      name = "F",
      descriptor = "I"
   )
   public static int field11598;
   @OriginalMember(
      owner = "client!ck",
      name = "I",
      descriptor = "I"
   )
   public static int field11599;
   @OriginalMember(
      owner = "client!ck",
      name = "J",
      descriptor = "I"
   )
   public static int field11601;

   @OriginalMember(
      owner = "client!ck",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method5749(int arg0) {
      try {
         field11597 = null;
         field11600 = null;
         if (arg0 != -1) {
            method5749(-16);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11602[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "<init>",
      descriptor = "()V"
   )
   public class798() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field11601;
         int[][] var4 = super.field8649.method5536(arg0 ^ 23627, arg1);
         if (arg0 != 373) {
            this.method9(15, -48);
         }

         if (super.field8649.field11043) {
            int[][] var5 = this.method4467(0, arg1, (byte)109);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || var12 < class563.field8014) {
               do {
                  var9[var12] = -var6[var12] + 4096;
                  var10[var12] = 4096 - var7[var12];
                  var11[var12] = -var8[var12] + 4096;
                  ++var12;
               } while(var12 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field11602[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(II)V"
   )
   public static final void method5750(int arg0, int arg1) {
      try {
         if (class476.field6870.field9153.method1427(-58) == 0) {
            arg0 = -1;
         }

         ++field11599;
         if (~class58.field838 != ~arg0) {
            if (~arg0 != arg1) {
               label28: {
                  class244 var2 = class787.field11478.method3710(arg0, 33);
                  class433 var3 = var2.method2128(-96);
                  if (var3 == null) {
                     arg0 = -1;
                     if (!client.field10022) {
                        break label28;
                     }
                  }

                  class720.field10318.method881(var3.method3383(), (byte)-76, new Point(var2.field3747, var2.field3752), var3.method3372(), var3.method3375(), class729.field10389);
                  class58.field838 = arg0;
               }
            }

            if (arg0 == -1 && ~class58.field838 != 0) {
               class720.field10318.method881((int[])null, (byte)-28, new Point(), -1, -1, class729.field10389);
               class58.field838 = -1;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11602[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field11596;
         if (arg2 > -6) {
            this.method5(44, -100);
         }

         if (arg1 == 0) {
            super.field8641 = ~arg0.method665(false) == -2;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11602[3] + (arg0 != null ? field11602[5] : field11602[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field11598;
         if (arg0 != 0) {
            field11597 = null;
         }

         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int[] var5 = this.method4463(arg1, arg0 + 13064, 0);
            int var6 = 0;
            if (var3 || class563.field8014 > var6) {
               do {
                  var4[var6] = -var5[var6] + 4096;
                  ++var6;
               } while(class563.field8014 > var6);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field11602[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5751(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5752(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
