import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public abstract class class310 implements class765 {
   @OriginalMember(
      owner = "client!pfa",
      name = "d",
      descriptor = "Lhw;"
   )
   private class141 field4473;
   @OriginalMember(
      owner = "client!pfa",
      name = "n",
      descriptor = "Lli;"
   )
   public class449 field4464;
   @OriginalMember(
      owner = "client!pfa",
      name = "k",
      descriptor = "Lhw;"
   )
   public class141 field4479;
   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4480 = new String[]{method2421(method2420("\u0013XQ\u001c")), method2421(method2420("\u0006\u0003\u0013^U")), method2421(method2420("\rK\\^\u0014\u0014CT\u0004\u0016U")), method2421(method2420("\rK\\^aU")), method2421(method2420("\rK\\^oU")), method2421(method2420("\rK\\^mU")), method2421(method2420("\rK\\^bU")), method2421(method2420("\rK\\^jU")), method2421(method2420("]\u0005")), method2421(method2420("\rK\\^nU")), method2421(method2420("\rK\\^lU")), method2421(method2420("\u0012]X\u001eB\u000e")), method2421(method2420("\rK\\^iU"))};
   @OriginalMember(
      owner = "client!pfa",
      name = "q",
      descriptor = "Lld;"
   )
   public static class178 field4469 = new class178(32);
   @OriginalMember(
      owner = "client!pfa",
      name = "b",
      descriptor = "I"
   )
   public static int field4476 = 0;
   @OriginalMember(
      owner = "client!pfa",
      name = "p",
      descriptor = "S"
   )
   public static short field4477 = 1;
   @OriginalMember(
      owner = "client!pfa",
      name = "j",
      descriptor = "Lgw;"
   )
   public static class179 field4478 = new class179(30);
   @OriginalMember(
      owner = "client!pfa",
      name = "i",
      descriptor = "I"
   )
   public static int field4465;
   @OriginalMember(
      owner = "client!pfa",
      name = "c",
      descriptor = "I"
   )
   public static int field4466;
   @OriginalMember(
      owner = "client!pfa",
      name = "l",
      descriptor = "I"
   )
   public static int field4467;
   @OriginalMember(
      owner = "client!pfa",
      name = "o",
      descriptor = "I"
   )
   public static int field4468;
   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "I"
   )
   public static int field4470;
   @OriginalMember(
      owner = "client!pfa",
      name = "m",
      descriptor = "I"
   )
   public static int field4471;
   @OriginalMember(
      owner = "client!pfa",
      name = "g",
      descriptor = "I"
   )
   private int field4472;
   @OriginalMember(
      owner = "client!pfa",
      name = "e",
      descriptor = "I"
   )
   public static int field4475;
   @OriginalMember(
      owner = "client!pfa",
      name = "h",
      descriptor = "J"
   )
   private long field4463;
   @OriginalMember(
      owner = "client!pfa",
      name = "f",
      descriptor = "Lda;"
   )
   private class66 field4474;

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(B)Z"
   )
   public boolean method59(byte arg0) {
      try {
         ++field4470;
         int var2 = 26 % ((arg0 - 62) / 51);
         boolean var3 = true;
         if (!this.field4479.method1335((byte)115, this.field4464.field6562)) {
            var3 = false;
         }

         if (!this.field4473.method1335((byte)115, this.field4464.field6562)) {
            var3 = false;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4480[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2415(int arg0) {
      try {
         if (arg0 >= -117) {
            method2418(true, (String)null, 100, (class651)null, false);
         }

         class621.field9054 = 0;
         ++field4465;
         class123.field1969 = new class377[50];
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4480[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public static final boolean method2416(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4475;
         if (class11.field119 && class675.field9895) {
            if (class771.field11305 < 100) {
               return false;
            } else {
               int var4 = class665.field9667[arg2][arg0][arg1];
               if (-class36.field882 == var4) {
                  return false;
               } else {
                  if (arg3 >= -94) {
                     method2418(false, (String)null, -30, (class651)null, true);
                  }

                  if (~class36.field882 == ~var4) {
                     return true;
                  } else if (class455.field6647 == class269.field3810) {
                     return false;
                  } else {
                     int var5 = arg0 << class76.field1336;
                     int var6 = arg1 << class76.field1336;
                     if (class252.method2038(var6 - -class57.field1124 + -1, class57.field1124 + var5 - 1, var6 + 1, var6 - -class57.field1124 + -1, class269.field3810[arg2].method2289(arg0, arg1, (byte)118), class269.field3810[arg2].method2289(arg0 - -1, arg1 + 1, (byte)124), -30465, var5 + 1, class269.field3810[arg2].method2289(arg0, arg1 + 1, (byte)127), var5 - -1) && class252.method2038(class57.field1124 + var6 + -1, class57.field1124 + var5 + -1, var6 + 1, var6 + 1, class269.field3810[arg2].method2289(arg0, arg1, (byte)124), class269.field3810[arg2].method2289(arg0 + 1, arg1, (byte)122), -30465, class57.field1124 + -1 + var5, class269.field3810[arg2].method2289(arg0 - -1, arg1 + 1, (byte)116), var5 + 1)) {
                        ++class341.field4852;
                        class665.field9667[arg2][arg0][arg1] = class36.field882;
                        return true;
                     } else {
                        class665.field9667[arg2][arg0][arg1] = -class36.field882;
                        return false;
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4480[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method2417(int arg0) {
      boolean var2 = client.field4564;

      try {
         int var4;
         label33: {
            ++field4466;
            int var3 = class445.field6487.method1075(-70);
            var4 = var3 * 100;
            if (this.field4472 == var3 && var3 != 0) {
               int var5 = class445.field6487.method1077(-116);
               if (~var3 <= ~var5) {
                  break label33;
               }

               long var6 = this.field4463 - class445.field6487.method1070((byte)93);
               if (~var6 >= -1L) {
                  break label33;
               }

               long var8 = var6 * 10000L / (long)var3 * (long)(-var3 + var5);
               long var10 = (-this.field4463 + class57.method650(109)) * 10000L;
               if (var8 > var10) {
                  var4 = (int)((long)(-var3 + var5) * var10 * 100L / var8 + (long)(var3 * 100));
                  if (!var2) {
                     break label33;
                  }
               }

               var4 = var5 * 100;
               if (!var2) {
                  break label33;
               }
            }

            this.field4472 = var3;
            this.field4463 = class57.method650(105);
         }

         if (arg0 >= -48) {
            method2415(-67);
         }

         return var4;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field4480[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method58(boolean arg0, int arg1) {
      try {
         if (arg1 == 9124) {
            ++field4467;
            int var3 = this.field4464.field6556.method4952(this.field4464.field6555, class140.field2281, true) - -this.field4464.field6561;
            int var4 = this.field4464.field6564.method1060(this.field4464.field6566, arg1 ^ -9197, class664.field9661) + this.field4464.field6560;
            this.method2395(var4, var3, arg0, (byte)36);
            this.method2397(var4, false, var3, arg0);
            String var5 = class445.field6487.method1072(3505);
            if (~(-this.field4463 + class57.method650(arg1 ^ 9177)) < -10001L) {
               var5 = var5 + field4480[8] + class445.field6487.method1078(-113).method3251(19) + ")";
            }

            this.field4474.method712(this.field4464.field6555 / 2 + var3, -1, 5, this.field4464.field6554, this.field4464.field6566 / 2 + var4 - (-this.field4464.field6551 + -4), var5);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4480[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IIZB)V"
   )
   public abstract void method2395(int arg0, int arg1, boolean arg2, byte arg3);

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(IZIZ)V"
   )
   public abstract void method2397(int arg0, boolean arg1, int arg2, boolean arg3);

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(I)V"
   )
   public void method61(int arg0) {
      try {
         ++field4468;
         class445 var2 = class85.method843(this.field4473, this.field4464.field6562, (byte)-125);
         this.field4474 = class444.field6473.method414(var2, class94.method907(this.field4479, this.field4464.field6562), true);
         if (arg0 != -15367) {
            this.field4464 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4480[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(ZLjava/lang/String;ILoo;Z)V"
   )
   public static final void method2418(boolean arg0, String arg1, int arg2, class651 arg3, boolean arg4) {
      try {
         if (arg2 != -1) {
            field4478 = null;
         }

         ++field4471;
         class252.method2036(arg1, arg0, false, arg3, arg4, field4480[11]);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4480[10] + arg0 + ',' + (arg1 != null ? field4480[1] : field4480[0]) + ',' + arg2 + ',' + (arg3 != null ? field4480[1] : field4480[0]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method2419(int arg0) {
      try {
         field4469 = null;
         if (arg0 == -8767) {
            field4478 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4480[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "<init>",
      descriptor = "(Lhw;Lhw;Lli;)V"
   )
   public class310(class141 arg0, class141 arg1, class449 arg2) {
      try {
         this.field4473 = arg1;
         this.field4464 = arg2;
         this.field4479 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4480[2] + (arg0 != null ? field4480[1] : field4480[0]) + ',' + (arg1 != null ? field4480[1] : field4480[0]) + ',' + (arg2 != null ? field4480[1] : field4480[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2420(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2421(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
