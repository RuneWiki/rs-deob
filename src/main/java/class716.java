import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class716 {
   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10505 = new String[]{method5213(method5212("\u000bW{\u000e&U")), method5213(method5212("\u000bW{\u000e$U")), method5213(method5212("\u0006\u00114\u000e\u0018")), method5213(method5212("\u0013JvL")), method5213(method5212("\u000bW{\u000e'U"))};
   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "I"
   )
   public static int field10502;
   @OriginalMember(
      owner = "client!vha",
      name = "c",
      descriptor = "I"
   )
   public static int field10504;
   @OriginalMember(
      owner = "client!vha",
      name = "b",
      descriptor = "Lvca;"
   )
   public static class296 field10503;

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "([I[IZ[BII[[B[[B)I"
   )
   public static final int method5209(int[] arg0, int[] arg1, boolean arg2, byte[] arg3, int arg4, int arg5, byte[][] arg6, byte[][] arg7) {
      boolean var8 = client.field4273;

      try {
         ++field10504;
         int var9 = arg1[arg4];
         int var10 = arg0[arg4] + var9;
         if (arg2) {
            method5209((int[])null, (int[])null, false, (byte[])null, -13, -125, (byte[][])null, (byte[][])null);
         }

         int var11 = arg1[arg5];
         int var12 = arg0[arg5] + var11;
         int var13 = var9;
         if (~var11 < ~var9) {
            var13 = var11;
         }

         int var14 = var10;
         if (var12 < var10) {
            var14 = var12;
         }

         int var15 = arg3[arg4] & 255;
         if (var15 > (255 & arg3[arg5])) {
            var15 = arg3[arg5] & 255;
         }

         byte[] var16 = arg6[arg4];
         byte[] var17 = arg7[arg5];
         int var18 = -var9 + var13;
         int var19 = -var11 + var13;
         int var20 = var13;
         int var21;
         if (var8) {
            var21 = var16[var18++] - -var17[var19++];
            if (var15 > var21) {
               var15 = var21;
            }

            var20 = var13 + 1;
         }

         while(true) {
            while(~var14 < ~var20) {
               var21 = var16[var18++] - -var17[var19++];
               if (var15 > var21) {
                  var15 = var21;
               }

               ++var20;
            }

            int var24 = -var15;
            if (!var8) {
               return var24;
            }

            var21 = var24;
            if (var15 > var21) {
               var15 = var21;
            }

            ++var20;
         }
      } catch (RuntimeException var23) {
         throw class534.method3846(var23, field10505[4] + (arg0 != null ? field10505[2] : field10505[3]) + ',' + (arg1 != null ? field10505[2] : field10505[3]) + ',' + arg2 + ',' + (arg3 != null ? field10505[2] : field10505[3]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10505[2] : field10505[3]) + ',' + (arg7 != null ? field10505[2] : field10505[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5210(int arg0) {
      try {
         field10503 = null;
         if (arg0 <= 88) {
            method5209((int[])null, (int[])null, true, (byte[])null, -104, 19, (byte[][])null, (byte[][])null);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10505[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5211(int arg0) {
      boolean var1 = client.field4273;

      try {
         if (class585.field8040 != null) {
            int var2 = 0;
            if (var1 || class585.field8040.length > var2) {
               do {
                  int var3 = 0;
                  if (var1) {
                     class585.field8040[var2][var3] = class462.field6335;
                     ++var3;
                  }

                  while(true) {
                     while(~var3 > ~class585.field8040[var2].length) {
                        class585.field8040[var2][var3] = class462.field6335;
                        ++var3;
                     }

                     if (!var1) {
                        ++var2;
                        break;
                     }

                     ++var3;
                  }
               } while(class585.field8040.length > var2);
            }
         }

         if (arg0 == 255) {
            ++field10502;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10505[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5212(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5213(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
