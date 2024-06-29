import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class25 {
   @OriginalMember(
      owner = "client!js",
      name = "b",
      descriptor = "Llj;"
   )
   private class304 field307 = new class304(256);
   @OriginalMember(
      owner = "client!js",
      name = "i",
      descriptor = "Ld;"
   )
   private class150 field316;
   @OriginalMember(
      owner = "client!js",
      name = "k",
      descriptor = "Lc;"
   )
   private class652 field308;
   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field322 = new String[]{method192(method191("\u000f\u0017'$b")), method192(method191("\u000b\u0011e\u0001")), method192(method191("\u001eJ'C7")), method192(method191("\u000f\u0017'.b")), method192(method191("\u000f\u0017'Q#\u000b\r}Sb")), method192(method191("\u000f\u0017')b")), method192(method191("\u000f\u0017'+b")), method192(method191("\u000f\u0017'(b")), method192(method191("\u000f\u0017'%b")), method192(method191("\u000f\u0017',b")), method192(method191("\u000f\u0017'*b")), method192(method191("\u000f\u0017'/b"))};
   @OriginalMember(
      owner = "client!js",
      name = "l",
      descriptor = "Ljw;"
   )
   public static class779 field313 = new class779(14, 0, 4, 1);
   @OriginalMember(
      owner = "client!js",
      name = "d",
      descriptor = "Luk;"
   )
   public static class498 field320 = new class498(75, 8);
   @OriginalMember(
      owner = "client!js",
      name = "g",
      descriptor = "I"
   )
   public static int field309;
   @OriginalMember(
      owner = "client!js",
      name = "h",
      descriptor = "I"
   )
   public static int field310;
   @OriginalMember(
      owner = "client!js",
      name = "o",
      descriptor = "I"
   )
   public static int field311;
   @OriginalMember(
      owner = "client!js",
      name = "j",
      descriptor = "I"
   )
   public static int field312;
   @OriginalMember(
      owner = "client!js",
      name = "e",
      descriptor = "I"
   )
   public static int field314;
   @OriginalMember(
      owner = "client!js",
      name = "f",
      descriptor = "I"
   )
   public static int field315;
   @OriginalMember(
      owner = "client!js",
      name = "m",
      descriptor = "I"
   )
   public static int field317;
   @OriginalMember(
      owner = "client!js",
      name = "n",
      descriptor = "I"
   )
   public static int field318;
   @OriginalMember(
      owner = "client!js",
      name = "c",
      descriptor = "I"
   )
   public static int field319;
   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "I"
   )
   public static int field321;

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(Z)V",
      line = 4
   )
   public final void method182(boolean arg0) {
      try {
         ++field319;
         this.field307.method2551(arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field322[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(BI)Lgv;",
      line = 12
   )
   public static final class12 method183(byte arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field309;
         if (arg0 != -28) {
            field320 = null;
         }

         class12[] var3 = class435.method3423(92);
         int var4 = 0;
         if (!var2 && var3.length <= var4) {
            return null;
         } else {
            do {
               class12 var5 = var3[var4];
               if (~var5.field159 == ~arg1) {
                  return var5;
               }

               ++var4;
            } while(var3.length > var4);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field322[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
      line = 44
   )
   public static final void method184(String arg0, String arg1, int arg2) {
      try {
         ++field317;
         if (arg1.length() <= 320) {
            if (class225.method1954(-112)) {
               class510.field7800.method204((byte)124);
               class144.method1303((byte)88);
               class722.field10813 = arg1;
               class455.field6963 = arg0;
               class69.method532(1, arg2);
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field322[3] + (arg0 != null ? field322[2] : field322[1]) + ',' + (arg1 != null ? field322[2] : field322[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(B)V",
      line = 64
   )
   public static void method185(byte arg0) {
      try {
         field320 = null;
         field313 = null;
         if (arg0 != -4) {
            method184((String)null, (String)null, 34);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field322[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(ILrr;I)Lcq;",
      line = 78
   )
   public static final class582 method186(int arg0, class678 arg1, int arg2) {
      try {
         ++field318;
         byte[] var3 = arg1.method5025(arg0 + -3553, arg2);
         if (var3 == null) {
            return null;
         } else {
            return arg0 != 3553 ? null : new class582(var3);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field322[6] + arg0 + ',' + (arg1 != null ? field322[2] : field322[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(II)Lbka;",
      line = 94
   )
   public final class396 method187(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field310;
         Object var4 = this.field307.method2544(false, (long)arg1);
         if (var4 != null) {
            return (class396)var4;
         } else if (!this.field316.method1372(-128, arg1)) {
            return null;
         } else {
            class453 var5;
            class396 var9;
            label60: {
               var5 = this.field316.method1373(arg1, (byte)-54);
               int var6 = -19 / ((23 - arg0) / 57);
               int var7 = !var5.field6933 ? this.field308.field9610 : 64;
               if (var5.field6940 && this.field308.method617()) {
                  float[] var8 = this.field316.method1376(var7, arg1, false, (byte)-98, 0.7F, var7);
                  var9 = new class396(this.field308, 3553, 34842, var7, var7, ~var5.field6936 != -1, var8, 6408);
                  if (!var3) {
                     break label60;
                  }
               }

               int[] var10;
               label69: {
                  if (var5.field6927 == 2 || !class329.method2685(11027, var5.field6924)) {
                     var10 = this.field316.method1374(-2395, var7, false, arg1, 0.7F, var7);
                     if (!var3) {
                        break label69;
                     }
                  }

                  var10 = this.field316.method1375(var7, 0.7F, true, var7, arg1, -9197);
               }

               var9 = new class396(this.field308, 3553, 6408, var7, var7, var5.field6936 != 0, var10, 0, 0, false);
            }

            var9.method3192(var5.field6937, false, var5.field6938);
            this.field307.method2545((long)arg1, 121, var9);
            return var9;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field322[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "<init>",
      descriptor = "(Lc;Ld;)V",
      line = 162
   )
   public class25(class652 arg0, class150 arg1) {
      try {
         this.field316 = arg1;
         this.field308 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field322[4] + (arg0 != null ? field322[2] : field322[1]) + ',' + (arg1 != null ? field322[2] : field322[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(I)V",
      line = 148
   )
   public static final void method188(int arg0) {
      try {
         if (arg0 >= -24) {
            field312 = -110;
         }

         ++field314;
         class790.field11556 = new class185(class499.field7592.method3875(class493.field7455, 83), "", class436.field6683, 1010, -1, 0L, 0, 0, true, false, 0L, true);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field322[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "a",
      descriptor = "(III)V",
      line = 171
   )
   public static final void method189(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         int var4;
         int var7;
         label114: {
            ++field315;
            var4 = class355.field5457.method5130(true, class499.field7612.method3875(class493.field7455, 106));
            int var10000;
            if (!class510.field7804) {
               label106: {
                  class185 var5 = (class185)class326.field4958.method4972((byte)-84);
                  if (var3) {
                     var10000 = class65.method505(var5, -91);
                  } else if (var5 == null) {
                     var4 += 8;
                     var10000 = class485.field7378;
                     if (!var3) {
                        break label106;
                     }
                  } else {
                     var10000 = class65.method505(var5, -91);
                  }

                  while(true) {
                     int var6 = var10000;
                     if (~var6 < ~var4) {
                        var4 = var6;
                     }

                     var5 = (class185)class326.field4958.method4975((byte)104);
                     if (var5 == null) {
                        var4 += 8;
                        var10000 = class485.field7378;
                        if (!var3) {
                           break;
                        }
                     } else {
                        var10000 = class65.method505(var5, -91);
                     }
                  }
               }

               class572.field8475 = (var10000 == 0 ? 22 : 26) + class558.field8307 * 16;
               var7 = class558.field8307 * 16 + 21;
               if (!var3) {
                  break label114;
               }
            }

            label85: {
               class525 var8 = (class525)class681.field10158.method3688(true);
               if (var3) {
                  var10000 = var8.field8004;
               } else if (var8 == null) {
                  var7 = class97.field1368 * 16 - -21;
                  var10000 = class485.field7378;
                  if (!var3) {
                     break label85;
                  }
               } else {
                  var10000 = var8.field8004;
               }

               while(true) {
                  int var9;
                  if (var10000 == 1) {
                     var9 = class65.method505((class185)var8.field8005.field7220.field4682, -125);
                     if (var3) {
                        var9 = class446.method3501((byte)111, var8);
                     }
                  } else {
                     var9 = class446.method3501((byte)111, var8);
                  }

                  if (var4 < var9) {
                     var4 = var9;
                  }

                  var8 = (class525)class681.field10158.method3691(20);
                  if (var8 == null) {
                     var7 = class97.field1368 * 16 - -21;
                     var10000 = class485.field7378;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var10000 = var8.field8004;
                  }
               }
            }

            class572.field8475 = (var10000 != 0 ? 26 : 22) + class97.field1368 * 16;
            var4 += 8;
         }

         int var10 = arg0 - var4 / 2;
         if (var4 + var10 > class316.field4878) {
            var10 = -var4 + class316.field4878;
         }

         if (~var10 > -1) {
            var10 = 0;
         }

         int var11 = arg1;
         if (~class692.field10301 > ~(arg1 - -var7)) {
            var11 = -var7 + class692.field10301;
         }

         class108.field1490 = var10;
         if (var11 < 0) {
            var11 = 0;
         }

         class304.field4759 = true;
         class190.field2947 = var11;
         if (arg2 != 16) {
            method183((byte)3, -37);
         }

         class344.field5235 = var4;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field322[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "b",
      descriptor = "(Z)V",
      line = 255
   )
   public final void method190(boolean arg0) {
      try {
         if (arg0) {
            field313 = null;
         }

         this.field307.method2552(5, 21533);
         ++field311;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field322[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method191(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!js",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method192(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
