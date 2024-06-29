import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class367 {
   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5432 = new String[]{method2896(method2895("#\u000f9Ss~")), method2896(method2895("8\u001c4\u0011")), method2896(method2895("#\u000f9St~")), method2896(method2895("-GvSL")), method2896(method2895("#\u000f9Sp~")), method2896(method2895("#\u000f9Su~")), method2896(method2895("#\u000f9Sr~"))};
   @OriginalMember(
      owner = "client!ufa",
      name = "d",
      descriptor = "I"
   )
   public static int field5425;
   @OriginalMember(
      owner = "client!ufa",
      name = "f",
      descriptor = "I"
   )
   public static int field5426;
   @OriginalMember(
      owner = "client!ufa",
      name = "c",
      descriptor = "I"
   )
   public static int field5427;
   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "I"
   )
   public static int field5428;
   @OriginalMember(
      owner = "client!ufa",
      name = "g",
      descriptor = "I"
   )
   public static int field5429;
   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "I"
   )
   public static int field5430;
   @OriginalMember(
      owner = "client!ufa",
      name = "e",
      descriptor = "I"
   )
   public static int field5431;

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2890(int arg0, int arg1, int arg2) {
      try {
         int var3 = -121 / ((37 - arg1) / 39);
         ++field5426;
         return ~(arg0 & 2048) != -1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5432[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(IILjava/lang/String;Laea;)Ldm;"
   )
   public static final class274 method2891(int arg0, int arg1, String arg2, class678 arg3) {
      try {
         ++field5431;
         int var4 = OpenGL.glGenProgramARB();
         if (arg1 < 58) {
            return null;
         } else {
            OpenGL.glBindProgramARB(arg0, var4);
            OpenGL.glProgramStringARB(arg0, 34933, arg2);
            OpenGL.glGetIntegerv(34379, class438.field6425, 0);
            if (class438.field6425[0] != -1) {
               OpenGL.glBindProgramARB(arg0, 0);
               return null;
            } else {
               OpenGL.glBindProgramARB(arg0, 0);
               return new class274(arg3, arg0, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5432[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5432[3] : field5432[1]) + ',' + (arg3 != null ? field5432[3] : field5432[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(I)[Ldb;"
   )
   public static final class685[] method2892(int arg0) {
      try {
         int var1 = 124 / ((arg0 - 47) / 58);
         ++field5430;
         return new class685[]{class21.field319, class61.field871, class388.field5656, class765.field10967, class209.field2984, class573.field8105, class777.field11338, class592.field8362, class666.field9371, class28.field410, class316.field4723, class482.field6914, class654.field9264, class637.field9012, class695.field10038};
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5432[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method2893(byte arg0, int arg1) {
      try {
         ++field5427;
         class685.field9893 = arg1;
         class107 var2 = class455.field6619;
         synchronized(class455.field6619) {
            class455.field6619.method1052(true);
         }

         if (arg0 <= 93) {
            method2893((byte)45, -31);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5432[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method2894(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field5425;
         int var5 = class115.field1824 + arg1;
         int var6 = class480.field6903 + arg0;
         if (class324.field4826 != null && arg1 >= 0 && ~arg0 <= -1 && ~class234.field3626 < ~arg1 && class209.field2989 > arg0) {
            if (~class476.field6870.field9133.method2232(-69) != -1 || ~class117.field1849.field6824 == ~arg3) {
               long var7 = (long)(var6 << 14 | arg3 << 28 | var5);
               class279 var9 = (class279)class216.field3081.method3101(arg2 + -5194, var7);
               if (var9 == null) {
                  class265.method2267(arg3, arg1, arg0);
               } else {
                  class311 var10 = (class311)var9.field4227.method2245((byte)-94);
                  if (var10 == null) {
                     class265.method2267(arg3, arg1, arg0);
                  } else {
                     class346 var11;
                     label92: {
                        var11 = (class346)class265.method2267(arg3, arg1, arg0);
                        if (var11 != null) {
                           var11.field5099 = var11.field5098 = -1;
                           if (!var4) {
                              break label92;
                           }
                        }

                        var11 = new class346(arg1 << 9, class225.field3197[arg3].method5400(arg2 ^ -5194, arg0, arg1), arg0 << 9, arg3, arg3);
                     }

                     var11.field5097 = var10.field4666;
                     var11.field5104 = var10.field4669;

                     int var10000;
                     int var10001;
                     label86:
                     while(true) {
                        class311 var12 = (class311)var9.field4227.method2239((byte)102);
                        if (var12 != null) {
                           label107: {
                              var10000 = var12.field4666;
                              var10001 = var11.field5097;
                              if (var4) {
                                 break;
                              }

                              if (var10000 != var10001) {
                                 var11.field5099 = var12.field4666;
                                 var11.field5108 = var12.field4669;

                                 do {
                                    class311 var13;
                                    do {
                                       do {
                                          var13 = (class311)var9.field4227.method2239((byte)125);
                                          if (var13 == null) {
                                             break label107;
                                          }
                                       } while(~var11.field5097 == ~var13.field4666);

                                       var10000 = var11.field5099;
                                       var10001 = var13.field4666;
                                       if (var4) {
                                          break label86;
                                       }
                                    } while(var10000 == var10001 && !var4);

                                    var11.field5087 = var13.field4669;
                                    var11.field5098 = var13.field4666;
                                 } while(!var4);
                              }

                              if (!var4) {
                                 continue;
                              }
                           }
                        }

                        var10000 = arg3;
                        var10001 = (arg1 << 9) + 256;
                        break;
                     }

                     int var14 = class478.method3658(var10000, var10001, (arg0 << 9) + 256, (byte)-20);
                     var11.field6829 = var14;
                     var11.field6833 = arg0 << 9;
                     var11.field5089 = 0;
                     if (arg2 == 5193) {
                        var11.field6826 = (byte)arg3;
                        var11.field6832 = arg1 << 9;
                        var11.field6824 = (byte)arg3;
                        if (class172.method1598(arg0, arg1, 109)) {
                           ++var11.field6826;
                        }

                        class164.method1540(arg3, arg1, arg0, var14, var11);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field5432[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2895(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2896(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
