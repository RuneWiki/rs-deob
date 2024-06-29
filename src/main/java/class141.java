import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class141 {
   @OriginalMember(
      owner = "client!wda",
      name = "h",
      descriptor = "I"
   )
   public int field2248 = -1;
   @OriginalMember(
      owner = "client!wda",
      name = "c",
      descriptor = "Laka;"
   )
   public class258 field2247;
   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2256 = new String[]{method1414(method1413("C~WKk\u001c")), method1414(method1413("C~WKl\u001c")), method1414(method1413("ZoZ\t")), method1414(method1413("C~WK\u0014]t_\u0011\u0016\u001c")), method1414(method1413("O4\u0018KU")), method1414(method1413("C~WKj\u001c")), method1414(method1413("VyW")), method1414(method1413("C~WKi\u001c"))};
   @OriginalMember(
      owner = "client!wda",
      name = "j",
      descriptor = "[J"
   )
   public static long[] field2251 = new long[100];
   @OriginalMember(
      owner = "client!wda",
      name = "f",
      descriptor = "Ljava/util/Random;"
   )
   public static Random field2253 = new Random();
   @OriginalMember(
      owner = "client!wda",
      name = "i",
      descriptor = "I"
   )
   public static int field2255 = 2;
   @OriginalMember(
      owner = "client!wda",
      name = "g",
      descriptor = "I"
   )
   public static int field2245;
   @OriginalMember(
      owner = "client!wda",
      name = "e",
      descriptor = "I"
   )
   public static int field2246;
   @OriginalMember(
      owner = "client!wda",
      name = "k",
      descriptor = "I"
   )
   public int field2249;
   @OriginalMember(
      owner = "client!wda",
      name = "d",
      descriptor = "I"
   )
   public int field2250;
   @OriginalMember(
      owner = "client!wda",
      name = "b",
      descriptor = "I"
   )
   public int field2252;
   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "I"
   )
   public static int field2254;

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1409(byte arg0) {
      try {
         field2251 = null;
         if (arg0 != -116) {
            field2255 = -41;
         }

         field2253 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2256[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(Lfea;ILjava/awt/Component;II)Lnd;"
   )
   public static final class785 method1410(class82 arg0, int arg1, Component arg2, int arg3, int arg4) {
      try {
         ++field2246;
         if (~class358.field5291 == -1) {
            throw new IllegalStateException();
         } else if (arg3 >= 0 && arg3 < 2) {
            if (arg4 < 256) {
               arg4 = 256;
            }

            try {
               class785 var5 = (class785)Class.forName(field2256[6]).newInstance();
               var5.field11434 = new int[256 * (!class235.field3645 ? 1 : 2)];
               var5.field11447 = arg4;
               var5.method3281(arg2);
               var5.field11454 = (-1024 & arg4) + 1024;
               if (var5.field11454 > 16384) {
                  var5.field11454 = 16384;
               }

               var5.method3277(var5.field11454);
               if (class279.field4228 > 0 && class542.field7639 == null) {
                  class542.field7639 = new class583();
                  class542.field7639.field8192 = arg0;
                  arg0.method883(class279.field4228, class542.field7639, arg1 + -7);
               }

               if (class542.field7639 != null) {
                  if (class542.field7639.field8190[arg3] != null) {
                     throw new IllegalArgumentException();
                  }

                  class542.field7639.field8190[arg3] = var5;
               }

               return var5;
            } catch (Throwable var9) {
               try {
                  class420 var6 = new class420(arg0, arg3);
                  var6.field11434 = new int[(class235.field3645 ? 2 : 1) * 256];
                  var6.field11447 = arg4;
                  if (arg1 != 2) {
                     method1410((class82)null, 95, (Component)null, -19, -111);
                  }

                  var6.method3281(arg2);
                  var6.field11454 = 16384;
                  var6.method3277(var6.field11454);
                  if (class279.field4228 > 0 && class542.field7639 == null) {
                     class542.field7639 = new class583();
                     class542.field7639.field8192 = arg0;
                     arg0.method883(class279.field4228, class542.field7639, -5);
                  }

                  if (class542.field7639 != null) {
                     if (class542.field7639.field8190[arg3] != null) {
                        throw new IllegalArgumentException();
                     }

                     class542.field7639.field8190[arg3] = var6;
                  }

                  return var6;
               } catch (Throwable var8) {
                  return new class785();
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2256[7] + (arg0 != null ? field2256[4] : field2256[2]) + ',' + arg1 + ',' + (arg2 != null ? field2256[4] : field2256[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method1411(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         label35: {
            if (-arg3 + arg0 < class729.field10384 || class604.field8618 < arg0 + arg3 || ~class587.field8239 < ~(arg4 - arg3) || arg3 + arg4 > class767.field11011) {
               class744.method5361(arg6, arg4, arg0, arg5, arg3, true, arg1);
               if (!client.field10022) {
                  break label35;
               }
            }

            class29.method361(arg5, arg4, arg0, 5999, arg6, arg3, arg1);
         }

         if (arg2 < -50) {
            ++field2254;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field2256[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(ZLfn;Lfn;)V"
   )
   public static final void method1412(boolean arg0, class96 arg1, class96 arg2) {
      try {
         if (arg2.field1547 != null) {
            arg2.method962(false);
         }

         ++field2245;
         arg2.field1547 = arg1;
         arg2.field1553 = arg1.field1553;
         arg2.field1547.field1553 = arg2;
         arg2.field1553.field1547 = arg2;
         if (arg0) {
            method1411(73, 118, 109, -29, -101, 62, -3);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2256[5] + arg0 + ',' + (arg1 != null ? field2256[4] : field2256[2]) + ',' + (arg2 != null ? field2256[4] : field2256[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "<init>",
      descriptor = "(Lbt;)V"
   )
   public class141(class395 arg0) {
      try {
         this.field2247 = new class479(arg0, false);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2256[3] + (arg0 != null ? field2256[4] : field2256[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1413(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1414(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
