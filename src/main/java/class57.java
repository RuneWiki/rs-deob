import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class57 implements class620 {
   @OriginalMember(
      owner = "client!hka",
      name = "g",
      descriptor = "Lwv;"
   )
   private class37 field710 = new class37(128);
   @OriginalMember(
      owner = "client!hka",
      name = "d",
      descriptor = "[I"
   )
   public int[] field698;
   @OriginalMember(
      owner = "client!hka",
      name = "o",
      descriptor = "[I"
   )
   private int[] field709;
   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field712 = new String[]{method451(method450("a~ty\u0010`{|#\u0012!")), method451(method450("a~tyg!")), method451(method450("a~tym!")), method451(method450("a~tyj!")), method451(method450("a~tyf!")), method451(method450("a~tyk!")), method451(method450("a~tyd!")), method451(method450("a~tyi!")), method451(method450("a~tyn!")), method451(method450("a~tyh!")), method451(method450("a~tyo!")), method451(method450("a~tye!"))};
   @OriginalMember(
      owner = "client!hka",
      name = "p",
      descriptor = "F"
   )
   public static float field707;
   @OriginalMember(
      owner = "client!hka",
      name = "n",
      descriptor = "I"
   )
   public static int field696;
   @OriginalMember(
      owner = "client!hka",
      name = "l",
      descriptor = "I"
   )
   public static int field697;
   @OriginalMember(
      owner = "client!hka",
      name = "c",
      descriptor = "I"
   )
   public static int field699;
   @OriginalMember(
      owner = "client!hka",
      name = "m",
      descriptor = "I"
   )
   public static int field700;
   @OriginalMember(
      owner = "client!hka",
      name = "b",
      descriptor = "I"
   )
   public static int field701;
   @OriginalMember(
      owner = "client!hka",
      name = "h",
      descriptor = "I"
   )
   public static int field703;
   @OriginalMember(
      owner = "client!hka",
      name = "i",
      descriptor = "I"
   )
   public static int field704;
   @OriginalMember(
      owner = "client!hka",
      name = "e",
      descriptor = "I"
   )
   public static int field705;
   @OriginalMember(
      owner = "client!hka",
      name = "f",
      descriptor = "I"
   )
   public static int field706;
   @OriginalMember(
      owner = "client!hka",
      name = "k",
      descriptor = "I"
   )
   public static int field708;
   @OriginalMember(
      owner = "client!hka",
      name = "j",
      descriptor = "I"
   )
   public static int field711;
   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "Lkf;"
   )
   public static class266 field702;

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(BZ)I"
   )
   public final int method439(byte arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         ++field706;
         long var4 = class133.method1054(-29025);
         class424 var6 = !arg1 ? (class424)this.field710.method325(-4629) : (class424)this.field710.method328(1745388291);
         int var10000;
         if (var3) {
            long var10;
            var10000 = (var10 = ~var4 - ~(4611686018427387903L & var6.field6040)) == 0L ? 0 : (var10 < 0L ? -1 : 1);
         } else if (var6 == null) {
            var10000 = arg0;
            if (!var3) {
               if (arg0 != -94) {
                  field702 = null;
               }

               return -1;
            }
         } else {
            long var11;
            var10000 = (var11 = ~var4 - ~(4611686018427387903L & var6.field6040)) == 0L ? 0 : (var11 < 0L ? -1 : 1);
         }

         while(true) {
            if (var10000 < 0) {
               if ((4611686018427387904L & var6.field6040) != 0L) {
                  int var7 = (int)var6.field6137;
                  this.field698[var7] = this.field709[var7];
                  var6.method3165(125);
                  return var7;
               }

               var6.method3165(114);
            }

            var6 = (class424)this.field710.method325(-4629);
            if (var6 == null) {
               var10000 = arg0;
               if (!var3) {
                  if (arg0 != -94) {
                     field702 = null;
                  }

                  return -1;
               }
            } else {
               long var12;
               var10000 = (var12 = ~var4 - ~(4611686018427387903L & var6.field6040)) == 0L ? 0 : (var12 < 0L ? -1 : 1);
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field712[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method440(int arg0) {
      try {
         if (arg0 != -31445) {
            method445((byte)-13);
         }

         field702 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field712[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "c",
      descriptor = "(III)V"
   )
   public final void method441(int arg0, int arg1, int arg2) {
      try {
         this.field698[arg0] = arg2;
         ++field704;
         class424 var4 = (class424)this.field710.method329((byte)118, (long)arg0);
         if (arg1 != 0) {
            field705 = -85;
         }

         if (var4 == null) {
            class424 var5 = new class424(500L + class133.method1054(-29025));
            this.field710.method336(~arg1, (long)arg0, var5);
         } else {
            var4.field6040 = 500L + class133.method1054(-29025);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field712[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method442(int arg0, byte arg1, int arg2) {
      try {
         ++field703;
         if (arg1 <= -105) {
            class260 var4 = class631.field9253.method4274(0, arg2);
            int var5 = var4.field3610;
            int var6 = var4.field3615;
            int var7 = var4.field3614;
            int var8 = class252.field3437[var7 - var6];
            if (~arg0 > -1 || ~arg0 < ~var8) {
               arg0 = 0;
            }

            int var9 = var8 << var6;
            this.method446(94, ~var9 & this.field709[var5] | var9 & arg0 << var6, var5);
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field712[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method443(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field701;
         if (arg0 == 23943) {
            int var3 = 0;
            if (!var2 && class468.field6732.field6929 <= var3) {
               this.field710 = new class37(128);
            } else {
               do {
                  class193 var4 = class468.field6732.method3513(var3, arg0 ^ 23943);
                  if (var4 != null && ~var4.field2737 == -1) {
                     this.field709[var3] = 0;
                     this.field698[var3] = 0;
                  }

                  ++var3;
               } while(class468.field6732.field6929 > var3);

               this.field710 = new class37(128);
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field712[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(IIIIIB)V"
   )
   public static final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
      boolean var6 = client.field4360;

      try {
         ++field696;
         int var7 = -arg2 + arg0;
         int var8 = -arg4 + arg1;
         if (var7 == 0) {
            if (~var8 != -1) {
               class112.method912(0, arg1, arg3, arg4, arg2);
            }

         } else if (~var8 == -1) {
            class397.method2997(arg0, arg3, 0, arg4, arg2);
         } else {
            if (arg5 > -78) {
               field707 = -1.2780968F;
            }

            int var9;
            int var10;
            int var11;
            int var12;
            label84: {
               var9 = (var8 << 12) / var7;
               var10 = arg4 - (arg2 * var9 >> 12);
               if (class457.field6528 > arg0) {
                  var11 = (class457.field6528 * var9 >> 12) + var10;
                  var12 = class457.field6528;
                  if (!var6) {
                     break label84;
                  }
               }

               if (arg0 <= class348.field4702) {
                  var12 = arg0;
                  var11 = arg1;
                  if (!var6) {
                     break label84;
                  }
               }

               var12 = class348.field4702;
               var11 = (class348.field4702 * var9 >> 12) + var10;
            }

            int var13;
            int var14;
            label85: {
               if (~class457.field6528 < ~arg2) {
                  var13 = class457.field6528;
                  var14 = (class457.field6528 * var9 >> 12) + var10;
                  if (!var6) {
                     break label85;
                  }
               }

               if (~arg2 >= ~class348.field4702) {
                  var14 = arg4;
                  var13 = arg2;
                  if (!var6) {
                     break label85;
                  }
               }

               var14 = (class348.field4702 * var9 >> 12) + var10;
               var13 = class348.field4702;
            }

            label57: {
               if (class245.field3374 <= var14) {
                  if (~class699.field10237 <= ~var14) {
                     break label57;
                  }

                  var13 = (-var10 + class699.field10237 << 12) / var9;
                  var14 = class699.field10237;
                  if (!var6) {
                     break label57;
                  }
               }

               var14 = class245.field3374;
               var13 = (-var10 + class245.field3374 << 12) / var9;
            }

            label50: {
               if (~class245.field3374 >= ~var11) {
                  if (~var11 >= ~class699.field10237) {
                     break label50;
                  }

                  var11 = class699.field10237;
                  var12 = (-var10 + class699.field10237 << 12) / var9;
                  if (!var6) {
                     break label50;
                  }
               }

               var11 = class245.field3374;
               var12 = (-var10 + class245.field3374 << 12) / var9;
            }

            class550.method3947(-97, var13, var11, var14, var12, arg3);
         }
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field712[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method445(byte arg0) {
      boolean var1 = client.field4360;

      try {
         class17.field194 = new class426(8);
         ++field711;
         class70.field865 = 0;
         class577 var2 = (class577)class663.field9658.method5529((byte)-42);
         if (var1) {
            var2.method4188();
            var2 = (class577)class663.field9658.method5527((byte)45);
         }

         while(true) {
            if (var2 == null) {
               if (!var1) {
                  if (arg0 != -75) {
                     method445((byte)97);
                     return;
                  }

                  return;
               }
            } else {
               var2.method4188();
            }

            var2 = (class577)class663.field9658.method5527((byte)45);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field712[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "b",
      descriptor = "(III)V"
   )
   public final void method446(int arg0, int arg1, int arg2) {
      try {
         this.field709[arg2] = arg1;
         ++field700;
         if (arg0 <= 73) {
            this.method439((byte)-87, false);
         }

         class424 var4 = (class424)this.field710.method329((byte)116, (long)arg2);
         if (var4 != null) {
            if (~var4.field6040 != -4611686018427387906L) {
               var4.field6040 = 4611686018427387904L | 500L + class133.method1054(-29025);
               return;
            }
         } else {
            class424 var5 = new class424(4611686018427387905L);
            this.field710.method336(-1, (long)arg2, var5);
         }

      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field712[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method447(int arg0, int arg1) {
      try {
         if (arg0 != -1) {
            this.field698 = null;
         }

         ++field708;
         return this.field698[arg1];
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field712[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method448(int arg0, int arg1, int arg2) {
      try {
         ++field697;
         class260 var4 = class631.field9253.method4274(0, arg2);
         int var5 = var4.field3610;
         int var6 = var4.field3615;
         int var7 = var4.field3614;
         int var8 = class252.field3437[var7 - var6];
         if (arg1 < arg0 || arg1 > var8) {
            arg1 = 0;
         }

         int var9 = var8 << var6;
         this.method441(var5, 0, this.field698[var5] & ~var9 | arg1 << var6 & var9);
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field712[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "<init>",
      descriptor = "()V"
   )
   public class57() {
      try {
         this.field698 = new int[class468.field6732.field6929];
         this.field709 = new int[class468.field6732.field6929];
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field712[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(ZI)I"
   )
   public final int method449(boolean arg0, int arg1) {
      try {
         ++field699;
         if (!arg0) {
            field705 = -34;
         }

         class260 var3 = class631.field9253.method4274(0, arg1);
         int var4 = var3.field3610;
         int var5 = var3.field3615;
         int var6 = var3.field3614;
         int var7 = class252.field3437[-var5 + var6];
         return var7 & this.field698[var4] >> var5;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field712[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method450(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method451(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
