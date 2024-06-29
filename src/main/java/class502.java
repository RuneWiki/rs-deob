import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public abstract class class502 extends class15 {
   @OriginalMember(
      owner = "client!laa",
      name = "v",
      descriptor = "I"
   )
   public int field6980;
   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6982 = new String[]{method3800(method3799("V3\u000e\u001bLS<\u0006AN\u0012")), method3800(method3799("A|A\u001b\r")), method3800(method3799("V3\u000e\u001b6\u0012")), method3800(method3799("T'\u0003Y")), method3800(method3799("s<\u0019T\u001cS6OG\u0011^;\u0017\u000f")), method3800(method3799("V3\u000e\u001b7\u0012")), method3800(method3799("V3\u000e\u001b4\u0012")), method3800(method3799("P3\bR\u001c"))};
   @OriginalMember(
      owner = "client!laa",
      name = "t",
      descriptor = "Lsia;"
   )
   public static class407 field6981 = new class407(8);
   @OriginalMember(
      owner = "client!laa",
      name = "x",
      descriptor = "I"
   )
   public static int field6977;
   @OriginalMember(
      owner = "client!laa",
      name = "w",
      descriptor = "I"
   )
   public static int field6978;
   @OriginalMember(
      owner = "client!laa",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field6976;
   @OriginalMember(
      owner = "client!laa",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field6979;

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(IZBLjava/lang/String;)Z"
   )
   public static final boolean method3795(int arg0, boolean arg1, byte arg2, String arg3) {
      boolean var4 = client.field1481;

      try {
         if (arg2 != 35) {
            field6976 = null;
         }

         ++field6978;
         if (arg0 >= 2 && arg0 <= 36) {
            boolean var5 = false;
            byte var6 = 0;
            int var7 = 0;
            int var8 = arg3.length();
            int var9 = 0;
            char var10000;
            if (var4) {
               var10000 = arg3.charAt(var9);
            } else if (var8 <= var9) {
               var10000 = (char)var6;
               if (!var4) {
                  return (boolean)var6;
               }
            } else {
               var10000 = arg3.charAt(var9);
            }

            while(true) {
               label153: {
                  char var10 = var10000;
                  if (~var9 == -1) {
                     if (~var10 == -46) {
                        var5 = true;
                        if (!var4) {
                           ++var9;
                           break label153;
                        }
                     }

                     if (~var10 == -44 && arg1 && !var4) {
                        ++var9;
                        break label153;
                     }
                  }

                  int var14;
                  if (var10 >= '0' && var10 <= '9') {
                     var14 = var10 - '0';
                  } else if (var10 >= 'A') {
                     if (var10 > 'Z') {
                        if (var10 < 'a' || ~var10 < -123) {
                           break;
                        }

                        var14 = var10 - 'W';
                        if (var4) {
                           var14 -= 55;
                           if (var4) {
                              var14 -= 48;
                           }
                        }
                     } else {
                        var14 = var10 - '7';
                        if (var4) {
                           var14 -= 48;
                        }
                     }
                  } else {
                     if (var10 < 'a' || ~var10 < -123) {
                        break;
                     }

                     var14 = var10 - 'W';
                     if (var4) {
                        var14 -= 55;
                        if (var4) {
                           var14 -= 48;
                        }
                     }
                  }

                  if (var14 >= arg0) {
                     return false;
                  }

                  if (var5) {
                     var14 = -var14;
                  }

                  int var11 = arg0 * var7 - -var14;
                  if (~(var11 / arg0) != ~var7) {
                     return false;
                  }

                  var6 = 1;
                  var7 = var11;
                  ++var9;
               }

               if (var8 <= var9) {
                  var10000 = (char)var6;
                  if (!var4) {
                     return (boolean)var6;
                  }
               } else {
                  var10000 = arg3.charAt(var9);
               }
            }

            return false;
         } else {
            throw new IllegalArgumentException(field6982[4] + arg0);
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field6982[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6982[1] : field6982[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(Ld;Lww;IBLjava/awt/Canvas;)Lha;"
   )
   public static final class479 method3796(class102 arg0, class339 arg1, int arg2, byte arg3, Canvas arg4) {
      try {
         ++field6977;
         if (!class679.method4955(34069)) {
            throw new RuntimeException("");
         } else if (!class52.method385(field6982[7], -100)) {
            throw new RuntimeException("");
         } else {
            if (arg3 != 39) {
               method3796((class102)null, (class339)null, -59, (byte)-121, (Canvas)null);
            }

            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg4, 8, 8, 8, 24, 0, arg2);
            if (var6 == 0L) {
               throw new RuntimeException("");
            } else {
               class574 var8 = new class574(var5, arg4, var6, arg0, arg1, arg2);
               var8.method2243(106);
               return var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field6982[6] + (arg0 != null ? field6982[1] : field6982[3]) + ',' + (arg1 != null ? field6982[1] : field6982[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6982[1] : field6982[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "c",
      descriptor = "(B)Z"
   )
   public abstract boolean method1583(byte arg0);

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method3797(int arg0, int arg1, int arg2, int arg3) {
      class731 var4 = class548.field8080[arg0][arg1][arg2];
      if (var4 != null) {
         class762 var5 = var4.field10655;
         class762 var6 = var4.field10651;
         if (var5 != null) {
            var5.field11165 = (short)(var5.field11165 * arg3 / (16 << class783.field11447 - 7));
            var5.field11157 = (short)(var5.field11157 * arg3 / (16 << class783.field11447 - 7));
         }

         if (var6 != null) {
            var6.field11165 = (short)(var6.field11165 * arg3 / (16 << class783.field11447 - 7));
            var6.field11157 = (short)(var6.field11157 * arg3 / (16 << class783.field11447 - 7));
         }

      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public abstract Object method1582(byte arg0);

   @OriginalMember(
      owner = "client!laa",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class502(int arg0) {
      try {
         this.field6980 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6982[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3798(boolean arg0) {
      try {
         field6981 = null;
         field6979 = null;
         if (!arg0) {
            field6976 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6982[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3799(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!laa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3800(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
