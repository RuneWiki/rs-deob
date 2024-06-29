import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class787 extends class567 {
   @OriginalMember(
      owner = "client!lr",
      name = "t",
      descriptor = "F"
   )
   private float field11484 = 0.0F;
   @OriginalMember(
      owner = "client!lr",
      name = "x",
      descriptor = "Lfa;"
   )
   private class246 field11483;
   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11494 = new String[]{method5668(method5667("\u0005\u0017zj\u0004")), method5668(method5667("\u0005\u0017zz\u0004")), method5668(method5667("\u0005\u0017zq\u0004")), method5668(method5667("\u0012Kz\u0015Q")), method5668(method5667("\u0007\u00108W")), method5668(method5667("\u0005\u0017z\u0007E\u0007\f \u0005\u0004")), method5668(method5667("\u0005\u0017zx\u0004")), method5668(method5667("\u0005\u0017z}\u0004")), method5668(method5667("\u0005\u0017z~\u0004")), method5668(method5667("\u0005\u0017zy\u0004")), method5668(method5667("\u0005\u0017z|\u0004"))};
   @OriginalMember(
      owner = "client!lr",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field11488 = false;
   @OriginalMember(
      owner = "client!lr",
      name = "p",
      descriptor = "I"
   )
   public static int field11485;
   @OriginalMember(
      owner = "client!lr",
      name = "v",
      descriptor = "I"
   )
   public static int field11486;
   @OriginalMember(
      owner = "client!lr",
      name = "q",
      descriptor = "I"
   )
   public static int field11487;
   @OriginalMember(
      owner = "client!lr",
      name = "y",
      descriptor = "I"
   )
   public static int field11489;
   @OriginalMember(
      owner = "client!lr",
      name = "s",
      descriptor = "I"
   )
   public static int field11490;
   @OriginalMember(
      owner = "client!lr",
      name = "r",
      descriptor = "I"
   )
   public static int field11491;
   @OriginalMember(
      owner = "client!lr",
      name = "u",
      descriptor = "I"
   )
   public static int field11492;
   @OriginalMember(
      owner = "client!lr",
      name = "w",
      descriptor = "I"
   )
   public static int field11493;

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      try {
         if (arg0 >= -64) {
            return false;
         } else {
            ++field11492;
            return this.field11483.method1858(572);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11494[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      try {
         ++field11490;
         super.field7728.method2506(1, arg1 ^ -10266);
         if (arg1 != 10286) {
            field11488 = true;
         }

         super.field7728.method2587(class535.field7314, -112, class59.field623);
         super.field7728.method2517(class550.field7513, -1, 0, true, false);
         super.field7728.method2592(0, class529.field7261, 0);
         super.field7728.method2572((byte)102, 0);
         super.field7728.method2506(0, 99);
         super.field7728.method2552(-16777216, true);
         super.field7728.method2592(0, class206.field2525, 0);
         this.method6(117);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11494[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "<init>",
      descriptor = "(Lce;Lfa;)V"
   )
   public class787(class327 arg0, class246 arg1) {
      super(arg0);

      try {
         this.field11483 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11494[5] + (arg0 != null ? field11494[3] : field11494[4]) + ',' + (arg1 != null ? field11494[3] : field11494[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      try {
         if (arg0 != -1309) {
            method5666((byte)122);
         }

         super.field7728.method2587(class535.field7314, -90, class449.field6203);
         ++field11491;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11494[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label37: {
            int var5 = 58 % ((63 - arg1) / 58);
            ++field11487;
            super.field7728.method2506(1, 124);
            if (~(arg2 & 128) == -1) {
               if (~(1 & arg0) != -2) {
                  if (!this.field11483.field3087) {
                     super.field7728.method2581(this.field11483.field3084[0], -99);
                     if (!var4) {
                        break label37;
                     }
                  }

                  super.field7728.method2581(this.field11483.field3088, -53);
                  if (!var4) {
                     break label37;
                  }
               }

               if (!this.field11483.field3087) {
                  int var6 = super.field7728.field4578 % 4000 * 16 / 4000;
                  super.field7728.method2581(this.field11483.field3084[var6], -56);
                  if (!var4) {
                     break label37;
                  }
               }

               this.field11484 = (float)(super.field7728.field4578 % 4000) / 4000.0F;
               super.field7728.method2581(this.field11483.field3088, 107);
               if (!var4) {
                  break label37;
               }
            }

            super.field7728.method2581((class159)null, -80);
         }

         super.field7728.method2506(0, -93);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field11494[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method5666(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field11486;
         class158 var2 = (class158)class719.field10527.method3855(-14);
         if (var1) {
            if (var2.field2030) {
               var2.method3609(117);
               if (var1) {
                  var2.field2037 = true;
                  if (~var2.field2038 <= -1 && var2.field2039 >= 0 && ~var2.field2038 > ~class507.field7030 && var2.field2039 < class215.field2667) {
                     class9.method80(-127, var2);
                  }

                  var2 = (class158)class719.field10527.method3866((byte)122);
               } else {
                  var2 = (class158)class719.field10527.method3866((byte)122);
               }
            } else {
               var2.field2037 = true;
               if (~var2.field2038 <= -1 && var2.field2039 >= 0 && ~var2.field2038 > ~class507.field7030 && var2.field2039 < class215.field2667) {
                  class9.method80(-127, var2);
               }

               var2 = (class158)class719.field10527.method3866((byte)122);
            }
         }

         while(true) {
            while(var2 != null) {
               if (var2.field2030) {
                  var2.method3609(117);
                  if (var1) {
                     var2.field2037 = true;
                     if (~var2.field2038 <= -1 && var2.field2039 >= 0 && ~var2.field2038 > ~class507.field7030 && var2.field2039 < class215.field2667) {
                        class9.method80(-127, var2);
                     }

                     var2 = (class158)class719.field10527.method3866((byte)122);
                  } else {
                     var2 = (class158)class719.field10527.method3866((byte)122);
                  }
               } else {
                  var2.field2037 = true;
                  if (~var2.field2038 <= -1 && var2.field2039 >= 0 && ~var2.field2038 > ~class507.field7030 && var2.field2039 < class215.field2667) {
                     class9.method80(-127, var2);
                  }

                  var2 = (class158)class719.field10527.method3866((byte)122);
               }
            }

            var2 = (class158)class717.field10510.method3855(-11);
            if (!var1) {
               byte var10000;
               if (var1) {
                  var10000 = var2.field2030;
               } else if (var2 == null) {
                  var10000 = arg0;
                  if (!var1) {
                     if (arg0 > -48) {
                        field11488 = false;
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = var2.field2030;
               }

               while(true) {
                  if (var10000 == 0) {
                     var2.field2037 = true;
                     if (var1) {
                        var2.method3609(102);
                     }
                  } else {
                     var2.method3609(102);
                  }

                  var2 = (class158)class717.field10510.method3866((byte)119);
                  if (var2 == null) {
                     var10000 = arg0;
                     if (!var1) {
                        if (arg0 > -48) {
                           field11488 = false;
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = var2.field2030;
                  }
               }
            }

            if (~var2.field2038 <= -1 && var2.field2039 >= 0 && ~var2.field2038 > ~class507.field7030 && var2.field2039 < class215.field2667) {
               class9.method80(-127, var2);
            }

            var2 = (class158)class719.field10527.method3866((byte)122);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11494[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      try {
         super.field7728.method2581(arg1, 103);
         if (!arg0) {
            this.method6(-116);
         }

         ++field11489;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11494[9] + arg0 + ',' + (arg1 != null ? field11494[3] : field11494[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method6(int arg0) {
      try {
         ++field11493;
         if (arg0 <= 103) {
            this.method9(-6, 118, -122);
         }

         if (super.field7728.method2533(false) == 0) {
            class251 var2 = super.field7728.method2601(false);
            super.field7728.method2506(1, -17);
            class251 var3 = super.field7728.method2527(-126);
            var3.method158(var2);
            var3.method1897(1.0F, 0.125F, 30831, 0.125F);
            var3.method1905(this.field11484, -14542, 0.0F, 0.0F);
            super.field7728.method2503((byte)10, class517.field7092);
            super.field7728.method2506(0, 108);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field11494[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      try {
         ++field11485;
         super.field7728.method2506(1, arg0 ^ 86);
         super.field7728.method2587(class449.field6203, arg0 ^ 63, class449.field6203);
         super.field7728.method2547(0, class550.field7513, 0);
         super.field7728.method2592(0, class550.field7513, 0);
         super.field7728.method2572((byte)103, 1);
         super.field7728.method2581((class159)null, -114);
         super.field7728.method2506(arg0, arg0 + -97);
         super.field7728.method2592(0, class550.field7513, 0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11494[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5667(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5668(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
