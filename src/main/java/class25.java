import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class25 extends class22 {
   @OriginalMember(
      owner = "client!an",
      name = "r",
      descriptor = "I"
   )
   public int field369 = 0;
   @OriginalMember(
      owner = "client!an",
      name = "q",
      descriptor = "Z"
   )
   private boolean field381 = true;
   @OriginalMember(
      owner = "client!an",
      name = "A",
      descriptor = "Ljava/lang/String;"
   )
   public String field384 = null;
   @OriginalMember(
      owner = "client!an",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field389 = new String[]{method181(method180("\u007f\u001cw&")), method181(method180("jG5d\r")), method181(method180("p\u00075v\u0019\u007f\u0000otX")), method181(method180("p\u00075\rX")), method181(method180("p\u00075\u000fX")), method181(method180("p\u00075\u0002X")), method181(method180("p\u00075\fX")), method181(method180("p\u00075\tX")), method181(method180("p\u00075\bX")), method181(method180("p\u00075\u000eX")), method181(method180("p\u00075\u000bX")), method181(method180("p\u00075\u0003X"))};
   @OriginalMember(
      owner = "client!an",
      name = "o",
      descriptor = "I"
   )
   public static int field375 = -1;
   @OriginalMember(
      owner = "client!an",
      name = "u",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field370 = new BigInteger(method181(method180(" Y+zA")), 16);
   @OriginalMember(
      owner = "client!an",
      name = "k",
      descriptor = "I"
   )
   public static int field388 = 0;
   @OriginalMember(
      owner = "client!an",
      name = "t",
      descriptor = "B"
   )
   public byte field371;
   @OriginalMember(
      owner = "client!an",
      name = "j",
      descriptor = "B"
   )
   public byte field379;
   @OriginalMember(
      owner = "client!an",
      name = "p",
      descriptor = "I"
   )
   public static int field372;
   @OriginalMember(
      owner = "client!an",
      name = "m",
      descriptor = "I"
   )
   public static int field373;
   @OriginalMember(
      owner = "client!an",
      name = "w",
      descriptor = "I"
   )
   public static int field376;
   @OriginalMember(
      owner = "client!an",
      name = "y",
      descriptor = "I"
   )
   public static int field377;
   @OriginalMember(
      owner = "client!an",
      name = "B",
      descriptor = "I"
   )
   public static int field378;
   @OriginalMember(
      owner = "client!an",
      name = "x",
      descriptor = "I"
   )
   public static int field382;
   @OriginalMember(
      owner = "client!an",
      name = "l",
      descriptor = "I"
   )
   public static int field385;
   @OriginalMember(
      owner = "client!an",
      name = "n",
      descriptor = "I"
   )
   public static int field387;
   @OriginalMember(
      owner = "client!an",
      name = "s",
      descriptor = "J"
   )
   public long field374;
   @OriginalMember(
      owner = "client!an",
      name = "C",
      descriptor = "Z"
   )
   private boolean field383;
   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "[I"
   )
   private int[] field386;
   @OriginalMember(
      owner = "client!an",
      name = "v",
      descriptor = "[Lad;"
   )
   public class444[] field380;

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(IIIII)V",
      line = 9
   )
   public static final void method171(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         label20: {
            if (~arg3 <= ~arg1) {
               class18.method132(false, arg1, arg3, arg2, class448.field6542[arg4]);
               if (!client.field4564) {
                  break label20;
               }
            }

            class18.method132(false, arg3, arg1, arg2, class448.field6542[arg4]);
         }

         if (arg0 <= 113) {
            field375 = -114;
         }

         ++field376;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field389[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(IB)V",
      line = 28
   )
   public final void method172(int arg0, byte arg1) {
      try {
         label16: {
            --this.field369;
            int var3 = 1 / ((arg1 - -5) / 48);
            ++field378;
            if (this.field369 != 0) {
               class365.method2853(this.field380, arg0 + 1, this.field380, arg0, -arg0 + this.field369);
               if (!client.field4564) {
                  break label16;
               }
            }

            this.field380 = null;
         }

         this.field386 = null;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field389[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(I)[I",
      line = 49
   )
   public final int[] method173(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field373;
         if (this.field386 == null) {
            this.field386 = new int[this.field369];
            String[] var3 = new String[this.field369];
            int var4 = 0;
            if (var2) {
               var3[var4] = this.field380[var4].field6470;
               this.field386[var4] = var4++;
            }

            while(true) {
               while(this.field369 > var4) {
                  var3[var4] = this.field380[var4].field6470;
                  this.field386[var4] = var4++;
               }

               int[] var10000 = this.field386;
               if (!var2) {
                  class245.method1989(var10000, var3, 25555);
                  break;
               }

               var10000[var4] = var4++;
            }
         }

         return arg0 <= 6 ? null : this.field386;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field389[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(B)V",
      line = 81
   )
   public static void method174(byte arg0) {
      try {
         field370 = null;
         if (arg0 >= -88) {
            method175(71);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field389[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "<init>",
      descriptor = "(Luda;)V",
      line = 229
   )
   public class25(class473 arg0) {
      try {
         this.method176((byte)-26, arg0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field389[2] + (arg0 != null ? field389[1] : field389[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "b",
      descriptor = "(I)V",
      line = 103
   )
   public static final void method175(int arg0) {
      try {
         ++field372;
         if (arg0 > -76) {
            method174((byte)14);
         }

         class729.field10493 = null;
         class613.field8905 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field389[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(BLuda;)V",
      line = 116
   )
   private final void method176(byte arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         ++field382;
         int var4 = arg1.method3564((byte)-105);
         if ((var4 & 1) != 0) {
            this.field383 = true;
         }

         if ((var4 & 2) != 0) {
            this.field381 = true;
         }

         super.field347 = arg1.method3523(97);
         this.field374 = arg1.method3523(arg0 + 47);
         this.field384 = arg1.method3566(-16496688);
         arg1.method3564((byte)-97);
         this.field379 = arg1.method3543(-1132613840);
         this.field371 = arg1.method3543(-1132613840);
         if (arg0 != -26) {
            this.field379 = 49;
         }

         this.field369 = arg1.method3565(true);
         if (~this.field369 < -1) {
            this.field380 = new class444[this.field369];
            int var5 = 0;
            if (var3 || var5 < this.field369) {
               do {
                  class444 var6 = new class444();
                  if (this.field383) {
                     arg1.method3523(2);
                  }

                  if (this.field381) {
                     var6.field6470 = arg1.method3566(arg0 ^ 16496694);
                  }

                  var6.field6472 = arg1.method3543(-1132613840);
                  var6.field6471 = arg1.method3565(true);
                  this.field380[var5] = var6;
                  ++var5;
               } while(var5 < this.field369);

            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field389[11] + arg0 + ',' + (arg1 != null ? field389[1] : field389[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(Lad;I)V",
      line = 171
   )
   public final void method177(class444 arg0, int arg1) {
      try {
         if (arg1 != 5) {
            this.field374 = 34L;
         }

         ++field377;
         if (this.field380 == null || ~this.field369 <= ~this.field380.length) {
            this.method179(this.field369 + 5, false);
         }

         this.field380[this.field369++] = arg0;
         this.field386 = null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field389[9] + (arg0 != null ? field389[1] : field389[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(ILjava/lang/String;)I",
      line = 187
   )
   public final int method178(int arg0, String arg1) {
      boolean var3 = client.field4564;

      try {
         ++field385;
         if (arg0 != -1) {
            return -32;
         } else {
            int var4 = 0;
            if (var3) {
               if (this.field380[var4].field6470.equalsIgnoreCase(arg1)) {
                  return var4;
               }

               ++var4;
            }

            while(true) {
               while(~var4 > ~this.field369) {
                  if (this.field380[var4].field6470.equalsIgnoreCase(arg1)) {
                     return var4;
                  }

                  ++var4;
               }

               if (!var3) {
                  return -1;
               }

               if (-1 != 0) {
                  return var4;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field389[3] + arg0 + ',' + (arg1 != null ? field389[1] : field389[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(IZ)V",
      line = 237
   )
   private final void method179(int arg0, boolean arg1) {
      try {
         label20: {
            if (this.field380 == null) {
               this.field380 = new class444[arg0];
               if (!client.field4564) {
                  break label20;
               }
            }

            class365.method2853(this.field380, 0, this.field380 = new class444[arg0], 0, this.field369);
         }

         ++field387;
         if (arg1) {
            this.field379 = -96;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field389[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method180(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method181(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
