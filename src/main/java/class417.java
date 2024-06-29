import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class class417 extends class294 {
   @OriginalMember(
      owner = "client!tb",
      name = "G",
      descriptor = "S"
   )
   public short field6097;
   @OriginalMember(
      owner = "client!tb",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6107 = new String[]{method3186(method3185("kz\u001333qqI1r")), method3186(method3185("kz\u0013E\u001b7")), method3186(method3185("d6\u0013!'")), method3186(method3185("WqYk?q5")), method3186(method3185("qmQc")), method3186(method3185("kz\u0013D\u001b7")), method3186(method3185("kz\u0013K\u001b7")), method3186(method3185("kz\u0013I\u001b7")), method3186(method3185("kz\u0013C\u001b7")), method3186(method3185("kz\u0013H\u001b7")), method3186(method3185("kz\u0013B\u001b7"))};
   @OriginalMember(
      owner = "client!tb",
      name = "J",
      descriptor = "Lgh;"
   )
   public static class572 field6100 = new class572(65, -1);
   @OriginalMember(
      owner = "client!tb",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field6104 = new int[]{0, 1, 2, 3, 4, 5, 6, 14};
   @OriginalMember(
      owner = "client!tb",
      name = "K",
      descriptor = "I"
   )
   public static int field6096;
   @OriginalMember(
      owner = "client!tb",
      name = "B",
      descriptor = "I"
   )
   public static int field6098;
   @OriginalMember(
      owner = "client!tb",
      name = "I",
      descriptor = "I"
   )
   public static int field6099;
   @OriginalMember(
      owner = "client!tb",
      name = "H",
      descriptor = "I"
   )
   public static int field6101;
   @OriginalMember(
      owner = "client!tb",
      name = "F",
      descriptor = "I"
   )
   public static int field6102;
   @OriginalMember(
      owner = "client!tb",
      name = "C",
      descriptor = "I"
   )
   public static int field6103;
   @OriginalMember(
      owner = "client!tb",
      name = "E",
      descriptor = "I"
   )
   public static int field6106;
   @OriginalMember(
      owner = "client!tb",
      name = "A",
      descriptor = "Lir;"
   )
   public static class28 field6105;

   @OriginalMember(
      owner = "client!tb",
      name = "g",
      descriptor = "(B)V",
      line = 3
   )
   public static void method3181(byte arg0) {
      try {
         field6105 = null;
         field6104 = null;
         field6100 = null;
         if (arg0 >= -29) {
            method3182(-55, true, -78);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6107[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "b",
      descriptor = "(ILha;)Z",
      line = 16
   )
   public final boolean method1362(int arg0, class65 arg1) {
      try {
         ++field6098;
         if (arg0 != 0) {
            this.field6097 = 53;
         }

         return class310.method2416(super.field4101 >> class76.field1336, super.field4096 >> class76.field1336, super.field4091, -115);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6107[9] + arg0 + ',' + (arg1 != null ? field6107[2] : field6107[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 27
   )
   public class417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field4096 = arg2;
         super.field4097 = arg1;
         super.field4090 = (byte)arg3;
         this.field6097 = (short)arg5;
         super.field4091 = (byte)arg4;
         super.field4101 = arg0;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field6107[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(IZI)Z",
      line = 41
   )
   public static final boolean method3182(int arg0, boolean arg1, int arg2) {
      try {
         if (!arg1) {
            method3181((byte)-58);
         }

         ++field6099;
         return (class440.method3313(arg2, 74, arg0) | class498.method3753(-40, arg2, arg0) | class269.method2133(arg2, -109, arg0)) & class443.method3336(arg2, arg0, 126);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6107[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "([Lke;B)I",
      line = 53
   )
   public final int method1366(class622[] arg0, byte arg1) {
      try {
         ++field6106;
         if (arg1 > -57) {
            this.method1365(-91);
         }

         return this.method2296(super.field4096 >> class76.field1336, arg0, super.field4101 >> class76.field1336, true);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6107[7] + (arg0 != null ? field6107[2] : field6107[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(IBLjfa;)Ljava/lang/String;",
      line = 65
   )
   public static final String method3183(int arg0, byte arg1, class303 arg2) {
      try {
         if (arg1 != 22) {
            method3182(0, false, -124);
         }

         ++field6101;
         if (!client.method2454(arg2).method5165(1, arg0) && arg2.field4335 == null) {
            return null;
         } else if (arg2.field4389 != null && arg2.field4389.length > arg0 && arg2.field4389[arg0] != null && arg2.field4389[arg0].trim().length() != 0) {
            return arg2.field4389[arg0];
         } else {
            return class589.field8508 ? field6107[3] + arg0 : null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6107[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6107[2] : field6107[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "i",
      descriptor = "(I)Z",
      line = 87
   )
   public final boolean method1365(int arg0) {
      try {
         if (arg0 != -1) {
            field6105 = null;
         }

         ++field6096;
         return class750.field10812[(super.field4101 >> class76.field1336) + -class566.field8206 + class54.field1102][(super.field4096 >> class76.field1336) + -class115.field1864 + class54.field1102];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6107[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "a",
      descriptor = "(IIIIIIIIII)V",
      line = 102
   )
   public static final void method3184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4564;

      try {
         ++field6102;
         if (~arg0 <= -513 && ~arg6 <= -513 && ~arg0 >= ~((class209.field3112 - 2) * 512) && ~arg6 >= ~((class1.field3 + -2) * 512)) {
            int var11;
            label42: {
               var11 = -arg1 + class663.method4851(arg6, arg0, arg3, arg2 ^ -22734);
               if (!class262.field3734) {
                  class734.field10566.method990(arg5, 0, 0);
                  class444.field6473.method338(class734.field10566);
                  if (!var10) {
                     break label42;
                  }
               }

               class690.method5025(2, true);
            }

            if (arg2 == -22719) {
               label36: {
                  if (!class679.field9962) {
                     class444.field6473.method389(arg0, var11, arg6, class409.field6005);
                     if (!var10) {
                        break label36;
                     }
                  }

                  class444.field6473.method280(arg0, var11, arg6, class75.field1316, class409.field6005);
               }

               if (class262.field3734) {
                  class218.method1851(arg2 ^ -22744);
               } else {
                  class734.field10566.method990(-arg5, 0, 0);
                  class444.field6473.method338(class734.field10566);
               }
            }
         } else {
            class409.field6005[0] = class409.field6005[1] = -1;
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field6107[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3185(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3186(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
