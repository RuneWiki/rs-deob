import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public abstract class class657 extends class96 {
   @OriginalMember(
      owner = "client!qga",
      name = "q",
      descriptor = "Lhh;"
   )
   public class250 field9291;
   @OriginalMember(
      owner = "client!qga",
      name = "v",
      descriptor = "I"
   )
   public int field9289;
   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9294 = new String[]{method4792(method4791(">_Z@")), method4792(method4791("!MW\u0002,9D_X.x")), method4792(method4791("+\u0004\u0018\u0002m")), method4792(method4791("!MW\u0002Yx")), method4792(method4791("!MW\u0002Wx"))};
   @OriginalMember(
      owner = "client!qga",
      name = "r",
      descriptor = "Lhha;"
   )
   public static class724 field9290 = new class724(91, 2);
   @OriginalMember(
      owner = "client!qga",
      name = "t",
      descriptor = "[[I"
   )
   public static int[][] field9293 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!qga",
      name = "u",
      descriptor = "I"
   )
   public static int field9288;
   @OriginalMember(
      owner = "client!qga",
      name = "s",
      descriptor = "Lei;"
   )
   public static class594 field9292;

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(Ldea;IIIII)V"
   )
   public static final void method4788(class471 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = true;
      int var7 = arg2;
      int var8 = arg2 + arg4;
      int var9 = arg3 - 1;
      int var10 = arg3 + arg5;

      for(int var11 = arg1; var11 <= arg1 + 1; ++var11) {
         if (class522.field7337 != var11) {
            for(int var12 = var7; var12 <= var8; ++var12) {
               if (var12 >= 0 && var12 < class155.field2381) {
                  for(int var13 = var9; var13 <= var10; ++var13) {
                     if (var13 >= 0 && var13 < class25.field360 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                        class312 var14 = class324.field4826[var11][var12][var13];
                        if (var14 != null) {
                           int var15 = (class225.field3197[var11].method5400(-1, var13, var12) + class225.field3197[var11].method5400(-1, var13, var12 + 1) + class225.field3197[var11].method5400(-1, var13 + 1, var12) + class225.field3197[var11].method5400(-1, var13 + 1, var12 + 1)) / 4 - (class225.field3197[arg1].method5400(-1, arg3, arg2) + class225.field3197[arg1].method5400(-1, arg3, arg2 + 1) + class225.field3197[arg1].method5400(-1, arg3 + 1, arg2) + class225.field3197[arg1].method5400(-1, arg3 + 1, arg2 + 1)) / 4;
                           class565 var16 = var14.field4688;
                           class565 var17 = var14.field4689;
                           if (var16 != null && var16.method731(255)) {
                              arg0.method719(var15, var16, (var13 - arg3) * class44.field655 + (1 - arg5) * class744.field10587, var6, class720.field10315, (var12 - arg2) * class44.field655 + (1 - arg4) * class744.field10587, 0);
                           }

                           if (var17 != null && var17.method731(255)) {
                              arg0.method719(var15, var17, (var13 - arg3) * class44.field655 + (1 - arg5) * class744.field10587, var6, class720.field10315, (var12 - arg2) * class44.field655 + (1 - arg4) * class744.field10587, 0);
                           }

                           for(class84 var18 = var14.field4678; var18 != null; var18 = var18.field1305) {
                              class578 var19 = var18.field1299;
                              if (var19 != null && var19.method731(255) && (var19.field8154 == var12 || var7 == var12) && (var19.field8160 == var13 || var9 == var13)) {
                                 int var20 = var19.field8150 - var19.field8154 + 1;
                                 int var21 = var19.field8155 - var19.field8160 + 1;
                                 arg0.method719(var15, var19, (var19.field8160 - arg3) * class44.field655 + (var21 - arg5) * class744.field10587, var6, class720.field10315, (var19.field8154 - arg2) * class44.field655 + (var20 - arg4) * class744.field10587, 0);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var7;
            var6 = false;
         }
      }

   }

   @OriginalMember(
      owner = "client!qga",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method4789(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(I)Z"
   )
   public abstract boolean method3608(int arg0);

   @OriginalMember(
      owner = "client!qga",
      name = "<init>",
      descriptor = "(Lhh;I)V"
   )
   public class657(class250 arg0, int arg1) {
      try {
         this.field9291 = arg0;
         this.field9289 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9294[1] + (arg0 != null ? field9294[2] : field9294[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4790(byte arg0) {
      try {
         field9290 = null;
         field9293 = null;
         field9292 = null;
         if (arg0 != 80) {
            method4790((byte)113);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9294[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "e",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public abstract Object method3607(int arg0);

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4791(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4792(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
