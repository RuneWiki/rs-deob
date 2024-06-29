import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class18 extends class588 {
   @OriginalMember(
      owner = "client!qk",
      name = "s",
      descriptor = "I"
   )
   private int field318 = -1;
   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field322 = new String[]{method138(method137("b|\u0017C")), method138(method137("w'U\u0001v")), method138(method137("}bUg#")), method138(method137("}bUk#")), method138(method137("}bUm#")), method138(method137("}bUn#"))};
   @OriginalMember(
      owner = "client!qk",
      name = "t",
      descriptor = "I"
   )
   public static int field319 = -1;
   @OriginalMember(
      owner = "client!qk",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field321 = new int[8];
   @OriginalMember(
      owner = "client!qk",
      name = "p",
      descriptor = "I"
   )
   public static int field316;
   @OriginalMember(
      owner = "client!qk",
      name = "q",
      descriptor = "I"
   )
   public static int field317;
   @OriginalMember(
      owner = "client!qk",
      name = "u",
      descriptor = "I"
   )
   public static int field320;

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(ZIII[I)V"
   )
   public static final void method132(boolean arg0, int arg1, int arg2, int arg3, int[] arg4) {
      boolean var5 = client.field4564;

      try {
         ++field316;
         if (arg0) {
            field321 = null;
         }

         --arg1;
         int var11 = arg2 - 1;
         int var6 = -7 + var11;
         int var9;
         if (var5) {
            var9 = arg1 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var12 = var10 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            int var14 = var13 + 1;
            arg4[var14] = arg3;
            int var15 = var14 + 1;
            arg4[var15] = arg3;
            int var16 = var15 + 1;
            arg4[var16] = arg3;
            arg1 = var16 + 1;
            arg4[arg1] = arg3;
         }

         while(true) {
            while(arg1 < var6) {
               var9 = arg1 + 1;
               arg4[var9] = arg3;
               ++var9;
               arg4[var9] = arg3;
               ++var9;
               arg4[var9] = arg3;
               ++var9;
               arg4[var9] = arg3;
               ++var9;
               arg4[var9] = arg3;
               ++var9;
               arg4[var9] = arg3;
               ++var9;
               arg4[var9] = arg3;
               arg1 = var9 + 1;
               arg4[arg1] = arg3;
            }

            if (!var5) {
               if (var5) {
                  ++arg1;
                  arg4[arg1] = arg3;
               }

               while(~arg1 > ~var11) {
                  ++arg1;
                  arg4[arg1] = arg3;
               }

               return;
            }

            ++arg1;
            arg4[arg1] = arg3;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field322[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field322[1] : field322[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         this.field318 = arg1.method3565(true);
         ++field317;
         int var3 = 54 % ((arg0 - -26) / 33);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field322[2] + arg0 + ',' + (arg1 != null ? field322[1] : field322[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(III)Luo;"
   )
   public static final class600 method134(int arg0, int arg1, int arg2) {
      if (class90.field1473[arg0][arg1][arg2] == null) {
         boolean var3 = class90.field1473[0][arg1][arg2] != null && class90.field1473[0][arg1][arg2].field8656 != null;
         if (var3 && arg0 >= class323.field4655 - 1) {
            return null;
         }

         class170.method1534(arg0, arg1, arg2);
      }

      return class90.field1473[arg0][arg1][arg2];
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(Lwga;I)V"
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         ++field320;
         arg0.method5616((byte)98, this.field318);
         if (arg1 > -120) {
            this.field318 = 26;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field322[4] + (arg0 != null ? field322[1] : field322[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method136(boolean arg0) {
      try {
         if (!arg0) {
            method132(true, -9, 44, -66, (int[])null);
         }

         field321 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field322[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method137(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method138(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
