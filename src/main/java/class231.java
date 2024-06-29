import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class231 extends class690 {
   @OriginalMember(
      owner = "client!cu",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   private String field2868 = null;
   @OriginalMember(
      owner = "client!cu",
      name = "q",
      descriptor = "J"
   )
   private long field2871 = -1L;
   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2877 = new String[]{method1755(method1754("Op\u0005R\u001d")), method1755(method1754("Z+G\u0010")), method1755(method1754("W+\u0005?H")), method1755(method1754("W+\u0005=H")), method1755(method1754("W+\u00058H")), method1755(method1754("W+\u0005;H")), method1755(method1754("\u001a:R\u0010\tV")), method1755(method1754("C7E")), method1755(method1754("\u001a:G\u0010")), method1755(method1754("Y?H")), method1755(method1754("X7E\t\u0018")), method1755(method1754("X7I")), method1755(method1754("W+\u0005>H")), method1755(method1754("\u001a-D")), method1755(method1754("W+\u00059H"))};
   @OriginalMember(
      owner = "client!cu",
      name = "w",
      descriptor = "[Z"
   )
   public static boolean[] field2876 = new boolean[8];
   @OriginalMember(
      owner = "client!cu",
      name = "m",
      descriptor = "I"
   )
   public static int field2866;
   @OriginalMember(
      owner = "client!cu",
      name = "u",
      descriptor = "I"
   )
   public static int field2867;
   @OriginalMember(
      owner = "client!cu",
      name = "o",
      descriptor = "I"
   )
   public static int field2869;
   @OriginalMember(
      owner = "client!cu",
      name = "n",
      descriptor = "I"
   )
   public static int field2870;
   @OriginalMember(
      owner = "client!cu",
      name = "v",
      descriptor = "I"
   )
   public static int field2872;
   @OriginalMember(
      owner = "client!cu",
      name = "p",
      descriptor = "I"
   )
   public static int field2873;
   @OriginalMember(
      owner = "client!cu",
      name = "s",
      descriptor = "I"
   )
   public static int field2874;
   @OriginalMember(
      owner = "client!cu",
      name = "t",
      descriptor = "I"
   )
   public static int field2875;

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(BZLmg;)V"
   )
   public static final void method1749(byte arg0, boolean arg1, class158 arg2) {
      boolean var3 = client.field4273;

      try {
         label108: {
            if (arg2.field2030) {
               if (arg2.field2033 >= 0 && !class619.method4506(arg2.field2036, (byte)-22, arg2.field2033)) {
                  break label108;
               }

               label104: {
                  if (arg1) {
                     class580.method4169(arg2.field2038, (byte)-76, arg2.field2027, arg2.field2039, (class87)null, arg2.field2035);
                     if (!var3) {
                        break label104;
                     }
                  }

                  class172.method1343(arg2.field2035, arg2.field2036, -97, arg2.field2029, arg2.field2038, arg2.field2033, -1, arg2.field2027, arg2.field2039);
               }

               arg2.method3609(99);
               if (!var3) {
                  break label108;
               }
            }

            if (arg2.field2037 && arg2.field2038 >= 1 && ~arg2.field2039 <= -2 && arg2.field2038 <= class507.field7030 - 2 && ~(class215.field2667 + -2) <= ~arg2.field2039 && (arg2.field2028 < 0 || class619.method4506(arg2.field2034, (byte)-22, arg2.field2028))) {
               label121: {
                  label86: {
                     if (arg1) {
                        class580.method4169(arg2.field2038, (byte)-76, arg2.field2027, arg2.field2039, arg2.field2040, arg2.field2035);
                        if (!var3) {
                           break label86;
                        }
                     }

                     class172.method1343(arg2.field2035, arg2.field2034, arg0 ^ 59, arg2.field2026, arg2.field2038, arg2.field2028, -1, arg2.field2027, arg2.field2039);
                  }

                  arg2.field2037 = false;
                  if (arg1 || ~arg2.field2033 != ~arg2.field2028 || arg2.field2033 != -1) {
                     if (arg1 || arg2.field2033 != arg2.field2028 || ~arg2.field2029 != ~arg2.field2026 || arg2.field2036 != arg2.field2034) {
                        break label121;
                     }

                     arg2.method3609(85);
                     if (!var3) {
                        break label121;
                     }
                  }

                  arg2.method3609(101);
               }
            }
         }

         if (arg0 != -87) {
            method1750(-80, 26, 106L);
         }

         ++field2866;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2877[14] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2877[0] : field2877[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(IIJ)Ljava/lang/String;"
   )
   public static final String method1750(int arg0, int arg1, long arg2) {
      try {
         ++field2872;
         class621.method4518((byte)-2, arg2);
         int var4 = class624.field8714.get(5);
         if (arg1 != -1) {
            method1751(-17, 67);
         }

         int var5 = class624.field8714.get(2) + 1;
         int var6 = class624.field8714.get(1);
         return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2877[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(ZLhh;)V"
   )
   public final void method27(boolean arg0, class139 arg1) {
      try {
         ++field2873;
         if (!arg0) {
            arg1.method1186(this.field2868, this.field2871, -5);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2877[2] + arg0 + ',' + (arg1 != null ? field2877[0] : field2877[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1751(int arg0, int arg1) {
      return class350.field5017 != null ? class350.field5017[arg0][arg1] & 255 : 0;
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method26(class594 arg0, byte arg1) {
      try {
         if (~arg0.method4288((byte)77) != -256) {
            --arg0.field8243;
            this.field2871 = arg0.method4304((byte)121);
         }

         if (arg1 > -19) {
            this.method27(true, (class139)null);
         }

         ++field2867;
         this.field2868 = arg0.method4334(4794);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2877[4] + (arg0 != null ? field2877[0] : field2877[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1752(int arg0) {
      try {
         field2876 = null;
         if (arg0 != -1) {
            field2870 = -13;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2877[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method1753(String arg0, int arg1) {
      try {
         ++field2869;
         if (arg1 != 10) {
            return null;
         } else if (!class364.field5148.startsWith(field2877[7])) {
            if (class364.field5148.startsWith(field2877[10])) {
               return field2877[11] + arg0 + field2877[13];
            } else {
               return class364.field5148.startsWith(field2877[9]) ? field2877[11] + arg0 + field2877[6] : null;
            }
         } else {
            return arg0 + field2877[8];
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2877[12] + (arg0 != null ? field2877[0] : field2877[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1754(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1755(char[] arg0) {
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
            var10005 = 94;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
