import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class694 {
   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10182 = new String[]{method5063(method5062("\u0018wPnj")), method5063(method5062("\u00058P\u0001?")), method5063(method5062("\u0018wPkj")), method5063(method5062("\u0010c\u0012C")), method5063(method5062("\u0018wPlj")), method5063(method5062("\u0018wPmj"))};
   @OriginalMember(
      owner = "client!fa",
      name = "d",
      descriptor = "Lfea;"
   )
   public static class681 field10176 = new class681(13, 0, 1, 0);
   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "Laka;"
   )
   public static class418 field10180 = new class418(76, 6);
   @OriginalMember(
      owner = "client!fa",
      name = "e",
      descriptor = "I"
   )
   public static int field10177;
   @OriginalMember(
      owner = "client!fa",
      name = "b",
      descriptor = "I"
   )
   public static int field10178;
   @OriginalMember(
      owner = "client!fa",
      name = "c",
      descriptor = "I"
   )
   public static int field10179;
   @OriginalMember(
      owner = "client!fa",
      name = "f",
      descriptor = "J"
   )
   public static long field10181;

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5058(byte arg0) {
      try {
         if (arg0 >= -33) {
            field10181 = 95L;
         }

         field10176 = null;
         field10180 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10182[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(IBIII)V"
   )
   public static final void method5059(int param0, byte param1, int param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(Ljava/lang/String;BI)I"
   )
   public static final int method5060(String arg0, byte arg1, int arg2) {
      try {
         ++field10179;
         if (arg1 != -118) {
            field10176 = null;
         }

         return class21.method165(arg0, true, false, arg2);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10182[2] + (arg0 != null ? field10182[1] : field10182[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "([III[IB[FI[FIIIII)V"
   )
   public static final void method5061(int[] arg0, int arg1, int arg2, int[] arg3, byte arg4, float[] arg5, int arg6, float[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      boolean var13 = client.field1481;

      try {
         if (arg4 > -110) {
            field10181 = 119L;
         }

         ++field10178;
         int var14 = arg2 * arg11 + arg10;
         int var15 = arg6 * arg12 + arg8;
         int var16 = -arg9 + arg2;
         int var17 = -arg9 + arg12;
         if (arg3 != null) {
            if (arg5 == null) {
               int var20 = 0;
               if (var13 || ~var20 > ~arg1) {
                  do {
                     int var21 = var14 - -arg9;
                     if (var13) {
                        arg0[var15++] = arg3[var14++];
                     }

                     while(~var14 > ~var21) {
                        arg0[var15++] = arg3[var14++];
                     }

                     var14 += var16;
                     var15 += var17;
                     ++var20;
                  } while(~var20 > ~arg1);

               }
            } else {
               int var22 = 0;
               if (var13 || var22 < arg1) {
                  do {
                     int var23 = arg9 + var14;
                     if (var13) {
                        arg0[var15] = arg3[var14];
                        arg7[var15++] = arg5[var14++];
                     }

                     while(true) {
                        if (var23 <= var14) {
                           var14 += var16;
                           var15 += var17;
                           if (!var13) {
                              ++var22;
                              break;
                           }
                        } else {
                           arg0[var15] = arg3[var14];
                        }

                        arg7[var15++] = arg5[var14++];
                     }
                  } while(var22 < arg1);

               }
            }
         } else {
            int var18 = 0;
            if (var13 || ~var18 > ~arg1) {
               do {
                  int var19 = arg9 + var14;
                  if (var13) {
                     arg7[var15++] = arg5[var14++];
                  }

                  while(var14 < var19) {
                     arg7[var15++] = arg5[var14++];
                  }

                  var14 += var16;
                  var15 += var17;
                  ++var18;
               } while(~var18 > ~arg1);

            }
         }
      } catch (RuntimeException var25) {
         throw class93.method866(var25, field10182[4] + (arg0 != null ? field10182[1] : field10182[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10182[1] : field10182[3]) + ',' + arg4 + ',' + (arg5 != null ? field10182[1] : field10182[3]) + ',' + arg6 + ',' + (arg7 != null ? field10182[1] : field10182[3]) + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5062(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5063(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
