import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public abstract class class691 implements class261 {
   @OriginalMember(
      owner = "client!bca",
      name = "j",
      descriptor = "Lkf;"
   )
   public class266 field10173;
   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "Lkf;"
   )
   private class266 field10178;
   @OriginalMember(
      owner = "client!bca",
      name = "e",
      descriptor = "Lpd;"
   )
   public class270 field10175;
   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10180 = new String[]{method5047(method5046("dmXOZ.")), method5047(method5046("&&")), method5047(method5046("dmXO_.")), method5047(method5046("dmXO^.")), method5047(method5046("dmXOS.")), method5047(method5046("dmXOV.")), method5047(method5046("dmXO\\.")), method5047(method5046("h{U\r")), method5047(method5046("} \u0017Oo")), method5047(method5046("dmXO.o`P\u0015,.")), method5047(method5046("dmXOX."))};
   @OriginalMember(
      owner = "client!bca",
      name = "f",
      descriptor = "Ltn;"
   )
   public static class95 field10171 = new class95();
   @OriginalMember(
      owner = "client!bca",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field10179 = null;
   @OriginalMember(
      owner = "client!bca",
      name = "g",
      descriptor = "I"
   )
   public static int field10166;
   @OriginalMember(
      owner = "client!bca",
      name = "l",
      descriptor = "I"
   )
   public static int field10167;
   @OriginalMember(
      owner = "client!bca",
      name = "h",
      descriptor = "I"
   )
   public static int field10170;
   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "I"
   )
   public static int field10172;
   @OriginalMember(
      owner = "client!bca",
      name = "i",
      descriptor = "I"
   )
   public static int field10174;
   @OriginalMember(
      owner = "client!bca",
      name = "m",
      descriptor = "I"
   )
   private int field10176;
   @OriginalMember(
      owner = "client!bca",
      name = "d",
      descriptor = "I"
   )
   public static int field10177;
   @OriginalMember(
      owner = "client!bca",
      name = "n",
      descriptor = "J"
   )
   private long field10168;
   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "Lda;"
   )
   private class67 field10169;

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public abstract void method67(boolean arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!bca",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method5041(int arg0) {
      boolean var2 = client.field4360;

      try {
         int var4;
         label29: {
            ++field10166;
            int var3 = class660.field9618.method5434(-113);
            var4 = var3 * 100;
            if (this.field10176 == var3 && var3 != 0) {
               int var5 = class660.field9618.method5431(true);
               if (~var3 <= ~var5) {
                  break label29;
               }

               long var6 = this.field10168 + -class660.field9618.method5433(255);
               if (var6 <= 0L) {
                  break label29;
               }

               long var8 = var6 * 10000L / (long)var3 * (long)(var5 - var3);
               long var10 = 10000L * (class133.method1054(-29025) + -this.field10168);
               if (var10 >= var8) {
                  var4 = var5 * 100;
                  if (!var2) {
                     break label29;
                  }
               }

               var4 = (int)((long)(-var3 + var5) * var10 * 100L / var8 + (long)(var3 * 100));
               if (!var2) {
                  break label29;
               }
            }

            this.field10176 = var3;
            this.field10168 = class133.method1054(-29025);
         }

         int var12 = -17 / ((arg0 - 22) / 56);
         return var4;
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field10180[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "b",
      descriptor = "(I)Z"
   )
   public boolean method860(int arg0) {
      try {
         ++field10167;
         boolean var2 = true;
         if (arg0 != 9201) {
            method5042(-19, 107, -109, (Class)null);
         }

         if (!this.field10173.method2051(this.field10175.field3736, (byte)60)) {
            var2 = false;
         }

         if (!this.field10178.method2051(this.field10175.field3736, (byte)60)) {
            var2 = false;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10180[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(I)V"
   )
   public void method862(int arg0) {
      try {
         ++field10177;
         class206 var2 = class73.method674(this.field10175.field3736, this.field10178, (byte)94);
         if (arg0 != -23681) {
            this.method5041(25);
         }

         this.field10169 = class383.field5543.method502(var2, class439.method3232(this.field10173, this.field10175.field3736), true);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10180[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)Lgl;"
   )
   public static final class627 method5042(int arg0, int arg1, int arg2, Class arg3) {
      class517 var4 = class663.field9659[arg0][arg1][arg2];
      if (var4 == null) {
         return null;
      } else {
         for(class772 var5 = var4.field7468; var5 != null; var5 = var5.field11354) {
            class627 var6 = var5.field11352;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field9207 == arg1 && var6.field9208 == arg2) {
               return var6;
            }
         }

         return null;
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(IZIB)V"
   )
   public abstract void method69(int arg0, boolean arg1, int arg2, byte arg3);

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method861(byte arg0, boolean arg1) {
      try {
         ++field10174;
         int var3 = this.field10175.field3728.method1384(this.field10175.field3731, (byte)-115, class87.field1142) - -this.field10175.field3725;
         int var4 = this.field10175.field3724.method1414(this.field10175.field3729, -100, class60.field743) + this.field10175.field3727;
         this.method67(arg1, var3, var4, 5178);
         int var5 = 90 / ((arg0 - -31) / 44);
         this.method69(var4, arg1, var3, (byte)88);
         String var6 = class660.field9618.method5430(0);
         if (~(class133.method1054(-29025) + -this.field10168) < -10001L) {
            var6 = var6 + field10180[1] + class660.field9618.method5428(0).method1478(25) + ")";
         }

         this.field10169.method632(this.field10175.field3731 / 2 + var3, false, -1, this.field10175.field3729 / 2 + 4 + this.field10175.field3738 + var4, var6, this.field10175.field3732);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field10180[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(Z)Lsia;"
   )
   public static final class768 method5043(boolean arg0) {
      try {
         ++field10172;
         if (arg0) {
            field10171 = null;
         }

         return class435.method3211(1, 5192);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10180[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(IZIIJ)Ljava/lang/String;"
   )
   public static final String method5044(int arg0, boolean arg1, int arg2, int arg3, long arg4) {
      boolean var6 = client.field4360;

      try {
         ++field10170;
         char var7 = ',';
         char var8 = '.';
         if (arg2 == 0) {
            var7 = '.';
            var8 = ',';
         }

         if (arg2 == 2) {
            var8 = 160;
         }

         byte var9 = 0;
         if (arg4 < 0L) {
            var9 = 1;
            arg4 = -arg4;
         }

         if (arg3 < 80) {
            return null;
         } else {
            StringBuffer var10 = new StringBuffer(26);
            if (~arg0 < -1) {
               int var11 = 0;
               if (var6 || arg0 > var11) {
                  do {
                     int var12 = (int)arg4;
                     arg4 /= 10L;
                     var10.append((char)(48 - -var12 + -((int)arg4 * 10)));
                     ++var11;
                  } while(arg0 > var11);
               }

               var10.append(var7);
            }

            int var13 = 0;

            int var10000;
            while(true) {
               int var14 = (int)arg4;
               arg4 /= 10L;
               var10.append((char)(-((int)arg4 * 10) + var14 + 48));
               if (arg4 != 0L) {
                  if (!arg1) {
                     continue;
                  }

                  ++var13;
                  var10000 = ~(var13 % 3);
                  if (var6) {
                     break;
                  }

                  if (var10000 != -1) {
                     continue;
                  }

                  var10.append(var8);
                  if (!var6) {
                     continue;
                  }
               }

               var10000 = var9;
               break;
            }

            if (var10000 != 0) {
               var10.append('-');
            }

            return var10.reverse().toString();
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field10180[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "<init>",
      descriptor = "(Lkf;Lkf;Lpd;)V"
   )
   public class691(class266 arg0, class266 arg1, class270 arg2) {
      try {
         this.field10173 = arg0;
         this.field10178 = arg1;
         this.field10175 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10180[9] + (arg0 != null ? field10180[8] : field10180[7]) + ',' + (arg1 != null ? field10180[8] : field10180[7]) + ',' + (arg2 != null ? field10180[8] : field10180[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5045(byte arg0) {
      try {
         field10179 = null;
         field10171 = null;
         if (arg0 != -9) {
            method5042(-39, -75, 42, (Class)null);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10180[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5046(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5047(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
