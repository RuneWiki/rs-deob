import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class346 {
   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "I"
   )
   public int field4921 = 2048;
   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "I"
   )
   public int field4930 = 2048;
   @OriginalMember(
      owner = "client!ofa",
      name = "g",
      descriptor = "I"
   )
   public int field4922 = 0;
   @OriginalMember(
      owner = "client!ofa",
      name = "m",
      descriptor = "I"
   )
   public int field4924 = 0;
   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4934 = new String[]{method2679(method2678("&A0o")), method2679(method2678("'R=-Z`")), method2679(method2678("3\u001ar-d")), method2679(method2678("'R=-]`")), method2679(method2678("'R=-[`")), method2679(method2678("'R=-\\`")), method2679(method2678("'R=-X`"))};
   @OriginalMember(
      owner = "client!ofa",
      name = "i",
      descriptor = "Lkk;"
   )
   public static class200 field4923 = new class200(15000);
   @OriginalMember(
      owner = "client!ofa",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field4931 = new int[14];
   @OriginalMember(
      owner = "client!ofa",
      name = "k",
      descriptor = "Lah;"
   )
   public static class402 field4928 = null;
   @OriginalMember(
      owner = "client!ofa",
      name = "l",
      descriptor = "Luw;"
   )
   public static class435 field4933 = new class435(25, 8);
   @OriginalMember(
      owner = "client!ofa",
      name = "e",
      descriptor = "I"
   )
   public static int field4925;
   @OriginalMember(
      owner = "client!ofa",
      name = "f",
      descriptor = "I"
   )
   public static int field4926;
   @OriginalMember(
      owner = "client!ofa",
      name = "c",
      descriptor = "I"
   )
   public static int field4927;
   @OriginalMember(
      owner = "client!ofa",
      name = "d",
      descriptor = "I"
   )
   public static int field4929;
   @OriginalMember(
      owner = "client!ofa",
      name = "h",
      descriptor = "I"
   )
   public static int field4932;

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(ILrk;I[IZ[I)Lbf;"
   )
   public static final class560 method2673(int arg0, class35 arg1, int arg2, int[] arg3, boolean arg4, int[] arg5) {
      boolean var6 = client.field4564;

      try {
         if (!arg4) {
            method2676((byte)-83);
         }

         ++field4927;
         byte[] var7 = new byte[arg0 * arg2];
         int var8 = 0;
         if (!var6 && arg0 <= var8) {
            return new class560(arg1, arg2, arg0, var7);
         } else {
            do {
               int var9 = arg2 * var8 - -arg3[var8];
               int var10 = 0;
               if (var6) {
                  var7[var9++] = -1;
                  ++var10;
               }

               while(true) {
                  while(~arg5[var8] < ~var10) {
                     var7[var9++] = -1;
                     ++var10;
                  }

                  if (!var6) {
                     ++var8;
                     break;
                  }

                  ++var10;
               }
            } while(arg0 > var8);

            return new class560(arg1, arg2, arg0, var7);
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field4934[6] + arg0 + ',' + (arg1 != null ? field4934[2] : field4934[0]) + ',' + arg2 + ',' + (arg3 != null ? field4934[2] : field4934[0]) + ',' + arg4 + ',' + (arg5 != null ? field4934[2] : field4934[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(ILuda;I)V"
   )
   private final void method2674(int arg0, class473 arg1, int arg2) {
      try {
         ++field4932;
         if (arg0 == 31472) {
            if (~arg2 == -2) {
               this.field4924 = arg1.method3564((byte)-70);
            } else {
               if (arg2 != 2) {
                  if (~arg2 == -4) {
                     this.field4921 = arg1.method3565(true);
                     return;
                  }

                  if (arg2 == 4) {
                     this.field4922 = arg1.method3538(-128);
                     return;
                  }
               } else {
                  this.field4930 = arg1.method3565(true);
               }

            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4934[1] + arg0 + ',' + (arg1 != null ? field4934[2] : field4934[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(IIIBIII)Lpa;"
   )
   public static final class386 method2675(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg3 > -13) {
            method2673(-40, (class35)null, 62, (int[])null, false, (int[])null);
         }

         ++field4929;
         long var7 = (long)arg6 * 32147369L ^ (long)arg5 * 986053L ^ (long)arg2 * 475427L ^ (long)arg1 * 67481L ^ (long)arg4 * 97549L ^ (long)arg0 * 76724863L;
         class386 var9 = (class386)class486.field7067.method1584(var7, 1);
         if (var9 != null) {
            return var9;
         } else {
            class386 var10 = class625.field9095.method363(arg1, arg4, arg2, arg5, arg6, arg0);
            class486.field7067.method1581(var7, 0, var10);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field4934[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2676(byte arg0) {
      try {
         field4933 = null;
         if (arg0 == -38) {
            field4931 = null;
            field4923 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4934[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public final void method2677(byte arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         while(true) {
            int var4 = arg1.method3564((byte)-104);
            if (~var4 != -1) {
               this.method2674(31472, arg1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 >= -95) {
               this.field4930 = 33;
            }

            ++field4926;
            break;
         }

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4934[4] + arg0 + ',' + (arg1 != null ? field4934[2] : field4934[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2678(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2679(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
