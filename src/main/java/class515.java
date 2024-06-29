import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class515 {
   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7507 = new String[]{method3898(method3897("Y\"\u0004+b")), method3898(method3897("O{\u0004D7")), method3898(method3897("Y\"\u0004(b")), method3898(method3897("Z F\u0006")), method3898(method3897("Y\"\u0004.b")), method3898(method3897("Y\"\u0004)b"))};
   @OriginalMember(
      owner = "client!mw",
      name = "d",
      descriptor = "I"
   )
   public static int field7502 = 0;
   @OriginalMember(
      owner = "client!mw",
      name = "g",
      descriptor = "Luw;"
   )
   public static class435 field7504 = new class435(85, 4);
   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "I"
   )
   public static int field7500;
   @OriginalMember(
      owner = "client!mw",
      name = "f",
      descriptor = "I"
   )
   public static int field7501;
   @OriginalMember(
      owner = "client!mw",
      name = "c",
      descriptor = "I"
   )
   public static int field7503;
   @OriginalMember(
      owner = "client!mw",
      name = "e",
      descriptor = "Lhw;"
   )
   public static class141 field7506;
   @OriginalMember(
      owner = "client!mw",
      name = "b",
      descriptor = "Ltd;"
   )
   public static class476 field7505;

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(II)V",
      line = 3
   )
   public static final void method3893(int arg0, int arg1) {
      try {
         ++field7503;
         class536 var2 = class108.method1038((long)arg0, 101, arg1);
         var2.method4013((byte)126);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7507[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(I)V",
      line = 13
   )
   public static void method3894(int arg0) {
      try {
         field7504 = null;
         field7505 = null;
         if (arg0 != 10) {
            method3894(125);
         }

         field7506 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7507[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(IIIZIII)V",
      line = 29
   )
   public static final void method3895(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4564;

      try {
         ++field7501;
         int var8 = class741.method5346(arg2, class3.field16, class581.field8354, -1);
         int var9 = class741.method5346(arg4, class3.field16, class581.field8354, -1);
         int var10 = class741.method5346(arg0, field7502, class130.field2163, -1);
         int var11 = class741.method5346(arg6, field7502, class130.field2163, -1);
         int var12 = class741.method5346(arg2 - -arg5, class3.field16, class581.field8354, -1);
         int var13 = class741.method5346(-arg5 + arg4, class3.field16, class581.field8354, -1);
         int var14 = var8;
         if (var7) {
            class18.method132(arg3, var10, var11, arg1, class448.field6542[var8]);
            var14 = var8 + 1;
         }

         while(true) {
            while(var14 < var12) {
               class18.method132(arg3, var10, var11, arg1, class448.field6542[var14]);
               ++var14;
            }

            int var15 = var9;
            if (!var7) {
               if (var7) {
                  class18.method132(false, var10, var11, arg1, class448.field6542[var9]);
                  var15 = var9 - 1;
               }

               while(true) {
                  while(~var15 < ~var13) {
                     class18.method132(false, var10, var11, arg1, class448.field6542[var15]);
                     --var15;
                  }

                  int var16 = class741.method5346(arg0 + arg5, field7502, class130.field2163, -1);
                  int var17 = class741.method5346(-arg5 + arg6, field7502, class130.field2163, -1);
                  int var18 = var12;
                  if (!var7) {
                     if (!var7 && var12 > var13) {
                        if (arg3) {
                           field7504 = null;
                           return;
                        }

                        return;
                     }

                     do {
                        int[] var19 = class448.field6542[var18];
                        class18.method132(arg3, var10, var16, arg1, var19);
                        class18.method132(false, var17, var11, arg1, var19);
                        ++var18;
                     } while(var18 <= var13);

                     if (arg3) {
                        field7504 = null;
                        return;
                     }

                     return;
                  }

                  --var15;
               }
            }

            ++var14;
         }
      } catch (RuntimeException var21) {
         throw class608.method4462(var21, field7507[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 81
   )
   public static final int method3896(int arg0, String arg1) {
      try {
         ++field7500;
         return arg0 != 10 ? -40 : class683.method4987(true, 10, arg1, arg0 ^ 30006);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7507[2] + arg0 + ',' + (arg1 != null ? field7507[1] : field7507[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3897(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3898(char[] arg0) {
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
            var10005 = 85;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
