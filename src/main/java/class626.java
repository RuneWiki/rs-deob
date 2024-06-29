import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class626 extends class391 {
   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9079 = new String[]{method4593(method4592("6d6|w")), method4593(method4592(",\"6\u0010\"")), method4593(method4592("#?t>")), method4593(method4592(",\"6\u0013\""))};
   @OriginalMember(
      owner = "client!ah",
      name = "p",
      descriptor = "Lrga;"
   )
   public static class694 field9073 = new class694();
   @OriginalMember(
      owner = "client!ah",
      name = "l",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9075 = new String[200];
   @OriginalMember(
      owner = "client!ah",
      name = "o",
      descriptor = "I"
   )
   public int field9071;
   @OriginalMember(
      owner = "client!ah",
      name = "r",
      descriptor = "I"
   )
   public int field9074;
   @OriginalMember(
      owner = "client!ah",
      name = "k",
      descriptor = "I"
   )
   public int field9076;
   @OriginalMember(
      owner = "client!ah",
      name = "m",
      descriptor = "I"
   )
   public static int field9077;
   @OriginalMember(
      owner = "client!ah",
      name = "n",
      descriptor = "I"
   )
   public int field9078;
   @OriginalMember(
      owner = "client!ah",
      name = "q",
      descriptor = "Luaa;"
   )
   public class119 field9072;

   @OriginalMember(
      owner = "client!ah",
      name = "b",
      descriptor = "(Z)V",
      line = 11
   )
   public static void method4590(boolean arg0) {
      try {
         field9073 = null;
         field9075 = null;
         if (arg0) {
            method4590(false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9079[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "a",
      descriptor = "(IIII[FII[I[FII[II)V",
      line = 22
   )
   public static final void method4591(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6, int[] arg7, float[] arg8, int arg9, int arg10, int[] arg11, int arg12) {
      boolean var13 = client.field1786;

      try {
         ++field9077;
         int var14 = arg6 * arg9 + arg1;
         int var15 = arg0 * arg5 - -arg10;
         int var16 = -arg3 + arg9;
         int var17 = arg0 - arg3;
         if (arg2 > -108) {
            method4590(false);
         }

         if (arg7 != null) {
            if (arg4 != null) {
               int var20 = 0;
               if (var13 || arg12 > var20) {
                  do {
                     int var21 = arg3 + var14;
                     if (var13) {
                        arg11[var15] = arg7[var14];
                        arg8[var15++] = arg4[var14++];
                     }

                     while(true) {
                        if (var21 <= var14) {
                           var15 += var17;
                           var14 += var16;
                           if (!var13) {
                              ++var20;
                              break;
                           }
                        } else {
                           arg11[var15] = arg7[var14];
                        }

                        arg8[var15++] = arg4[var14++];
                     }
                  } while(arg12 > var20);

               }
            } else {
               int var18 = 0;
               if (var13 || var18 < arg12) {
                  do {
                     int var19 = arg3 + var14;
                     if (var13 || ~var14 > ~var19) {
                        do {
                           arg11[var15++] = arg7[var14++];
                        } while(~var14 > ~var19);
                     }

                     var15 += var17;
                     var14 += var16;
                     ++var18;
                  } while(var18 < arg12);

               }
            }
         } else {
            int var22 = 0;
            if (var13 || arg12 > var22) {
               do {
                  int var23 = arg3 + var14;
                  if (var13 || var14 < var23) {
                     do {
                        arg8[var15++] = arg4[var14++];
                     } while(var14 < var23);
                  }

                  var15 += var17;
                  var14 += var16;
                  ++var22;
               } while(arg12 > var22);

            }
         }
      } catch (RuntimeException var25) {
         throw class482.method3757(var25, field9079[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9079[0] : field9079[2]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field9079[0] : field9079[2]) + ',' + (arg8 != null ? field9079[0] : field9079[2]) + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field9079[0] : field9079[2]) + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4592(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ah",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4593(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
