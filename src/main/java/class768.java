import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class768 extends class70 {
   @OriginalMember(
      owner = "client!dm",
      name = "I",
      descriptor = "I"
   )
   private int field11207 = 4096;
   @OriginalMember(
      owner = "client!dm",
      name = "M",
      descriptor = "Z"
   )
   private boolean field11206 = true;
   @OriginalMember(
      owner = "client!dm",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11209 = new String[]{method5551(method5550("c\b\"X\u0017")), method5551(method5550("vS`\u001a")), method5551(method5550("|K\"5B")), method5551(method5550("|K\"4B")), method5551(method5550("|K\"2B")), method5551(method5550("|K\"3B"))};
   @OriginalMember(
      owner = "client!dm",
      name = "N",
      descriptor = "I"
   )
   public static int field11202;
   @OriginalMember(
      owner = "client!dm",
      name = "L",
      descriptor = "I"
   )
   public static int field11203;
   @OriginalMember(
      owner = "client!dm",
      name = "O",
      descriptor = "I"
   )
   public static int field11204;
   @OriginalMember(
      owner = "client!dm",
      name = "J",
      descriptor = "I"
   )
   public static int field11205;
   @OriginalMember(
      owner = "client!dm",
      name = "K",
      descriptor = "I"
   )
   public static int field11208;

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field11208;
         if (arg0 != -6752) {
            this.field11207 = 123;
         }

         int[][] var4 = super.field926.method2860(arg0 + 6752, arg1);
         if (super.field926.field5048) {
            int[] var5 = this.method690(arg0 ^ 6761, 0, class623.field9205 & arg1 + -1);
            int[] var6 = this.method690(89, 0, arg1);
            int[] var7 = this.method690(arg0 ^ 6707, 0, class623.field9205 & arg1 + 1);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int var11 = 0;
            if (var3 || class262.field3328 > var11) {
               do {
                  int var19;
                  int var20;
                  int var21;
                  label33: {
                     int var12 = (var7[var11] + -var5[var11]) * this.field11207;
                     int var13 = (var6[class174.field2249 & var11 + 1] + -var6[var11 + -1 & class174.field2249]) * this.field11207;
                     int var14 = var13 >> 12;
                     int var15 = var12 >> 12;
                     int var16 = var14 * var14 >> 12;
                     int var17 = var15 * var15 >> 12;
                     int var18 = (int)(Math.sqrt((double)((float)(var16 + var17 + 4096) / 4096.0F)) * 4096.0D);
                     if (~var18 == -1) {
                        var19 = 0;
                        var20 = 0;
                        var21 = 0;
                        if (!var3) {
                           break label33;
                        }
                     }

                     var20 = 16777216 / var18;
                     var21 = var12 / var18;
                     var19 = var13 / var18;
                  }

                  if (this.field11206) {
                     var21 = (var21 >> 1) + 2048;
                     var20 = (var20 >> 1) + 2048;
                     var19 = (var19 >> 1) + 2048;
                  }

                  var8[var11] = var19;
                  var9[var11] = var21;
                  var10[var11] = var20;
                  ++var11;
               } while(class262.field3328 > var11);
            }
         }

         return var4;
      } catch (RuntimeException var23) {
         throw class93.method866(var23, field11209[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "<init>",
      descriptor = "()V"
   )
   public class768() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         ++field11205;
         if (arg0 >= -34) {
            this.field11206 = true;
         }

         if (arg2 != 0) {
            if (arg2 != 1) {
               return;
            }

            if (!client.field1481) {
               this.field11206 = arg1.method640(255) == 1;
               return;
            }
         }

         this.field11207 = arg1.method603(-2);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field11209[2] + arg0 + ',' + (arg1 != null ? field11209[0] : field11209[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(IZII)Lkw;"
   )
   public static final class9 method5548(int arg0, boolean arg1, int arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field11202;
         class731 var5 = class548.field8080[arg2][arg3][arg0];
         if (var5 == null) {
            return null;
         } else {
            if (arg1) {
               method5549(false, -67);
            }

            class9 var6 = null;
            int var7 = -1;
            class131 var8 = var5.field10654;

            while(true) {
               class680 var10000;
               if (var8 == null) {
                  var10000 = var6;
                  if (!var4) {
                     return var6;
                  }
               } else {
                  var10000 = var8.field1676;
               }

               class680 var9 = var10000;
               if (var9 instanceof class9) {
                  class9 var10 = (class9)var9;
                  int var11 = 252 + 256 * (var10.method78(0) - 1);
                  int var12 = -var11 + var10.field10467 >> 9;
                  int var13 = -var11 + var10.field10468 >> 9;
                  int var14 = var10.field10467 + var11 >> 9;
                  int var15 = var10.field10468 - -var11 >> 9;
                  if (~var12 >= ~arg3 && arg0 >= var13 && var14 >= arg3 && var15 >= arg0) {
                     int var16 = (-arg0 + var15 - -1) * (-arg3 + 1 + var14);
                     if (var7 < var16) {
                        var6 = var10;
                        var7 = var16;
                     }
                  }
               }

               var8 = var8.field1670;
            }
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field11209[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dm",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method5549(boolean param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5550(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5551(char[] arg0) {
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
            var10005 = 38;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
