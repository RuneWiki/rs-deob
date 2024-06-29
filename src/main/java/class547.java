import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class547 extends class22 {
   @OriginalMember(
      owner = "client!sf",
      name = "l",
      descriptor = "I"
   )
   public int field7910;
   @OriginalMember(
      owner = "client!sf",
      name = "p",
      descriptor = "I"
   )
   public int field7909;
   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7913 = new String[]{method4087(method4086("\u0005\u0014MJ$\u0018\u001b\u0017He")), method4087(method4086("\u0005\u0014M7e")), method4087(method4086("\u0005\u0014M4e"))};
   @OriginalMember(
      owner = "client!sf",
      name = "m",
      descriptor = "I"
   )
   public static int field7908 = -1;
   @OriginalMember(
      owner = "client!sf",
      name = "o",
      descriptor = "Luw;"
   )
   public static class435 field7907 = new class435(22, 3);
   @OriginalMember(
      owner = "client!sf",
      name = "n",
      descriptor = "I"
   )
   public static int field7906;
   @OriginalMember(
      owner = "client!sf",
      name = "k",
      descriptor = "I"
   )
   public static int field7911;
   @OriginalMember(
      owner = "client!sf",
      name = "j",
      descriptor = "I"
   )
   public static int field7912;

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4084(int arg0) {
      try {
         field7907 = null;
         if (arg0 != -1) {
            method4085(9, -29, 16, -115, -57, 125, (byte)51, -88);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7913[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IIIIIIBI)V"
   )
   public static final void method4085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
      boolean var8 = client.field4564;

      try {
         ++field7906;
         int var9 = class741.method5346(arg5, class3.field16, class581.field8354, -1);
         int var10 = class741.method5346(arg7, class3.field16, class581.field8354, -1);
         int var11 = class741.method5346(arg1, class515.field7502, class130.field2163, -1);
         int var12 = class741.method5346(arg0, class515.field7502, class130.field2163, -1);
         int var13 = class741.method5346(arg3 + arg5, class3.field16, class581.field8354, -1);
         int var14 = class741.method5346(-arg3 + arg7, class3.field16, class581.field8354, -1);
         if (arg6 <= 25) {
            method4085(71, 58, 54, -10, -99, -109, (byte)-39, 21);
         }

         int var15 = var9;
         if (var8) {
            class18.method132(false, var11, var12, arg4, class448.field6542[var9]);
            var15 = var9 + 1;
         }

         while(true) {
            while(~var15 > ~var13) {
               class18.method132(false, var11, var12, arg4, class448.field6542[var15]);
               ++var15;
            }

            int var16 = var10;
            if (!var8) {
               if (var8) {
                  class18.method132(false, var11, var12, arg4, class448.field6542[var10]);
                  var16 = var10 - 1;
               }

               while(true) {
                  while(var14 < var16) {
                     class18.method132(false, var11, var12, arg4, class448.field6542[var16]);
                     --var16;
                  }

                  int var17 = class741.method5346(arg1 + arg3, class515.field7502, class130.field2163, -1);
                  int var18 = class741.method5346(-arg3 + arg0, class515.field7502, class130.field2163, -1);
                  int var19 = var13;
                  if (!var8) {
                     if (!var8 && ~var14 > ~var13) {
                        return;
                     }

                     do {
                        int[] var20 = class448.field6542[var19];
                        class18.method132(false, var11, var17, arg4, var20);
                        class18.method132(false, var17, var18, arg2, var20);
                        class18.method132(false, var18, var12, arg4, var20);
                        ++var19;
                     } while(~var14 <= ~var19);

                     return;
                  }

                  --var16;
               }
            }

            ++var15;
         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field7913[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class547(int arg0, int arg1) {
      try {
         this.field7910 = arg1;
         this.field7909 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7913[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4086(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4087(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
