import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class291 {
   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3847 = new String[]{method2193(method2192("e4\r\u001c\u001e")), method2193(method2192("kj\rsK")), method2193(method2192("~1O1")), method2193(method2192("e4\r\u001e\u001e")), method2193(method2192("e4\r\u001f\u001e"))};
   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "[Lci;"
   )
   public static class477[] field3841 = new class477[14];
   @OriginalMember(
      owner = "client!up",
      name = "f",
      descriptor = "I"
   )
   public static int field3840 = 0;
   @OriginalMember(
      owner = "client!up",
      name = "g",
      descriptor = "I"
   )
   public static int field3846 = 0;
   @OriginalMember(
      owner = "client!up",
      name = "e",
      descriptor = "I"
   )
   public static int field3842;
   @OriginalMember(
      owner = "client!up",
      name = "d",
      descriptor = "I"
   )
   public static int field3844;
   @OriginalMember(
      owner = "client!up",
      name = "c",
      descriptor = "I"
   )
   public static int field3845;
   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "J"
   )
   public static long field3843;

   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2189(int arg0) {
      try {
         field3841 = null;
         if (arg0 != 0) {
            method2191((int[])null, -18, 105, 42, -100, -7, (float[])null, 103, (float[])null, (int[])null, 66, -60, -22);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3847[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method2190(int arg0) {
      try {
         ++field3844;
         int var1 = -59 % ((-27 - arg0) / 41);
         return class616.field8588 == 1 ? class384.field5398 : 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3847[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "([IIIIII[FI[F[IIII)V"
   )
   public static final void method2191(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float[] arg8, int[] arg9, int arg10, int arg11, int arg12) {
      boolean var13 = client.field4273;

      try {
         ++field3845;
         int var14 = arg2 * arg12 + arg5;
         int var15 = arg1 * arg4 + arg10;
         if (arg7 != 0) {
            field3842 = 104;
         }

         int var16 = -arg3 + arg2;
         int var17 = -arg3 + arg4;
         if (arg0 != null) {
            if (arg8 != null) {
               int var18 = 0;
               if (var13 || arg11 > var18) {
                  do {
                     int var19 = arg3 + var14;
                     if (var13) {
                        arg9[var15] = arg0[var14];
                        arg6[var15++] = arg8[var14++];
                     }

                     while(true) {
                        if (~var14 <= ~var19) {
                           var15 += var17;
                           var14 += var16;
                           if (!var13) {
                              ++var18;
                              break;
                           }
                        } else {
                           arg9[var15] = arg0[var14];
                        }

                        arg6[var15++] = arg8[var14++];
                     }
                  } while(arg11 > var18);

               }
            } else {
               int var20 = 0;
               if (var13 || arg11 > var20) {
                  do {
                     int var21 = arg3 + var14;
                     if (var13 || var14 < var21) {
                        do {
                           arg9[var15++] = arg0[var14++];
                        } while(var14 < var21);
                     }

                     var15 += var17;
                     var14 += var16;
                     ++var20;
                  } while(arg11 > var20);

               }
            }
         } else {
            int var22 = 0;
            if (var13 || arg11 > var22) {
               do {
                  int var23 = var14 - -arg3;
                  if (var13 || ~var23 < ~var14) {
                     do {
                        arg6[var15++] = arg8[var14++];
                     } while(~var23 < ~var14);
                  }

                  var15 += var17;
                  var14 += var16;
                  ++var22;
               } while(arg11 > var22);

            }
         }
      } catch (RuntimeException var25) {
         throw class534.method3846(var25, field3847[0] + (arg0 != null ? field3847[1] : field3847[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field3847[1] : field3847[2]) + ',' + arg7 + ',' + (arg8 != null ? field3847[1] : field3847[2]) + ',' + (arg9 != null ? field3847[1] : field3847[2]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2192(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2193(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
