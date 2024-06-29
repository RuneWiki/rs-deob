import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class381 extends class297 {
   @OriginalMember(
      owner = "client!rba",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6030 = new String[]{method3103(method3102("\u0016Q9\u000ebL")), method3103(method3102("\u0016Q9\u000eeL")), method3103(method3102("\u001f\u001dv\u000eZ")), method3103(method3102("\nF4L")), method3103(method3102("\u0016Q9\u000eaL")), method3103(method3102("\u0016Q9\u000e`L")), method3103(method3102("\u0016Q9\u000ecL")), method3103(method3102("\u0016Q9\u000edL")), method3103(method3102("\u0000X")), method3103(method3102("\u0016Q9\u000efL"))};
   @OriginalMember(
      owner = "client!rba",
      name = "D",
      descriptor = "Luk;"
   )
   public static class498 field6024 = new class498(11, -1);
   @OriginalMember(
      owner = "client!rba",
      name = "v",
      descriptor = "I"
   )
   public static int field6029 = -1;
   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "I"
   )
   public static int field6020;
   @OriginalMember(
      owner = "client!rba",
      name = "u",
      descriptor = "I"
   )
   public static int field6021;
   @OriginalMember(
      owner = "client!rba",
      name = "w",
      descriptor = "I"
   )
   public static int field6022;
   @OriginalMember(
      owner = "client!rba",
      name = "C",
      descriptor = "I"
   )
   public static int field6025;
   @OriginalMember(
      owner = "client!rba",
      name = "A",
      descriptor = "I"
   )
   public static int field6026;
   @OriginalMember(
      owner = "client!rba",
      name = "x",
      descriptor = "I"
   )
   public static int field6027;
   @OriginalMember(
      owner = "client!rba",
      name = "E",
      descriptor = "I"
   )
   public static int field6028;
   @OriginalMember(
      owner = "client!rba",
      name = "y",
      descriptor = "Let;"
   )
   private class389 field6023;

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(BLjava/lang/String;I)Ljava/lang/String;"
   )
   public final String method3095(byte arg0, String arg1, int arg2) {
      try {
         ++field6027;
         if (this.field6023 == null) {
            return arg1;
         } else {
            class55 var4 = (class55)this.field6023.method3141((long)arg2, true);
            if (arg0 != 78) {
               method3101(35);
            }

            return var4 == null ? arg1 : var4.field680;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6030[4] + arg0 + ',' + (arg1 != null ? field6030[2] : field6030[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(ILjava/awt/Component;Lsu;BI)Lgj;"
   )
   public static final class761 method3096(int arg0, Component arg1, class289 arg2, byte arg3, int arg4) {
      try {
         ++field6028;
         if (class752.field11155 == 0) {
            throw new IllegalStateException();
         } else if (~arg0 <= -1 && ~arg0 > -3) {
            if (~arg4 > -257) {
               arg4 = 256;
            }

            try {
               class761 var5 = (class761)Class.forName(field6030[8]).newInstance();
               var5.field11272 = arg4;
               var5.field11250 = new int[256 * (!class262.field4308 ? 1 : 2)];
               var5.method2814(arg1);
               var5.field11277 = (-1024 & arg4) - -1024;
               if (var5.field11277 > 16384) {
                  var5.field11277 = 16384;
               }

               var5.method2817(var5.field11277);
               if (class294.field4662 > 0 && class224.field3401 == null) {
                  class224.field3401 = new class143();
                  class224.field3401.field2030 = arg2;
                  arg2.method2442(class224.field3401, false, class294.field4662);
               }

               if (class224.field3401 != null) {
                  if (class224.field3401.field2031[arg0] != null) {
                     throw new IllegalArgumentException();
                  }

                  class224.field3401.field2031[arg0] = var5;
               }

               return var5;
            } catch (Throwable var9) {
               try {
                  class349 var6 = new class349(arg2, arg0);
                  var6.field11272 = arg4;
                  var6.field11250 = new int[(class262.field4308 ? 2 : 1) * 256];
                  var6.method2814(arg1);
                  var6.field11277 = 16384;
                  var6.method2817(var6.field11277);
                  if (~class294.field4662 < -1 && class224.field3401 == null) {
                     class224.field3401 = new class143();
                     class224.field3401.field2030 = arg2;
                     arg2.method2442(class224.field3401, false, class294.field4662);
                  }

                  if (class224.field3401 != null) {
                     if (class224.field3401.field2031[arg0] != null) {
                        throw new IllegalArgumentException();
                     }

                     class224.field3401.field2031[arg0] = var6;
                  }

                  return var6;
               } catch (Throwable var8) {
                  if (arg3 != 118) {
                     field6029 = -102;
                  }

                  return new class761();
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6030[9] + arg0 + ',' + (arg1 != null ? field6030[2] : field6030[3]) + ',' + (arg2 != null ? field6030[2] : field6030[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method3097(int arg0, int arg1, int arg2) {
      try {
         ++field6025;
         if (this.field6023 == null) {
            return arg1;
         } else {
            class668 var4 = (class668)this.field6023.method3141((long)arg2, true);
            if (var4 == null) {
               return arg1;
            } else {
               return arg0 != 6451 ? 83 : var4.field9986;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6030[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(ILfq;IIILqda;BILjava/lang/String;ILaa;Lda;)V"
   )
   public static final void method3098(int arg0, class374 arg1, int arg2, int arg3, int arg4, class697 arg5, byte arg6, int arg7, String arg8, int arg9, class96 arg10, class288 arg11) {
      try {
         int var12;
         label67: {
            ++field6026;
            if (~class648.field9340 == -5) {
               var12 = 16383 & (int)class417.field6456;
               if (!client.field1786) {
                  break label67;
               }
            }

            var12 = (int)class417.field6456 + class438.field6710 & 16383;
         }

         int var13 = 10 + Math.max(arg1.field5849 / 2, arg1.field5915 / 2);
         int var14 = arg0 * arg0 - -(arg3 * arg3);
         if (~var14 >= ~(var13 * var13)) {
            int var15 = class83.field1196[var12];
            int var16 = class83.field1194[var12];
            if (~class648.field9340 != -5) {
               var15 = var15 * 256 / (class243.field3683 - -256);
               var16 = var16 * 256 / (class243.field3683 - -256);
            }

            int var17 = arg0 * var16 + arg3 * var15 >> 14;
            int var18 = arg3 * var16 - arg0 * var15 >> 14;
            if (arg6 <= 4) {
               field6029 = 83;
            }

            int var19 = arg5.method5124(arg8, 1, 100, (class672[])null);
            int var20 = arg5.method5127(100, (class672[])null, 0, arg8, 8364);
            int var21 = var17 - var19 / 2;
            if (var21 >= -arg1.field5849 && ~arg1.field5849 <= ~var21 && -arg1.field5915 <= var18 && var18 <= arg1.field5915) {
               arg11.method2408(arg2, var19, arg1.field5915 / 2 + -var18 + -arg4 + -var20 + arg7, (int[])null, 0, var21 - -arg9 - -(arg1.field5849 / 2), arg7, arg10, 0, arg8, 50, 0, arg9, -27121, 1, (class672[])null);
            }
         }
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field6030[1] + arg0 + ',' + (arg1 != null ? field6030[2] : field6030[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6030[2] : field6030[3]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field6030[2] : field6030[3]) + ',' + arg9 + ',' + (arg10 != null ? field6030[2] : field6030[3]) + ',' + (arg11 != null ? field6030[2] : field6030[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(Lica;II)V"
   )
   private final void method3099(class354 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rba",
      name = "a",
      descriptor = "(ILica;)V"
   )
   public final void method3100(int arg0, class354 arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 == -1) {
            ++field6020;

            do {
               int var4 = arg1.method2855(-31007);
               if (~var4 == -1) {
                  break;
               }

               this.method3099(arg1, var4, 0);
            } while(!var3);

         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6030[7] + arg0 + ',' + (arg1 != null ? field6030[2] : field6030[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3101(int arg0) {
      try {
         field6024 = null;
         if (arg0 != 100) {
            field6024 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6030[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3102(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3103(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
