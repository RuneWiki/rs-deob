import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class539 extends class300 implements class604 {
   @OriginalMember(
      owner = "client!dk",
      name = "gb",
      descriptor = "B"
   )
   private byte field7704;
   @OriginalMember(
      owner = "client!dk",
      name = "kb",
      descriptor = "Z"
   )
   private boolean field7685;
   @OriginalMember(
      owner = "client!dk",
      name = "V",
      descriptor = "S"
   )
   private short field7711;
   @OriginalMember(
      owner = "client!dk",
      name = "fb",
      descriptor = "Z"
   )
   private boolean field7687;
   @OriginalMember(
      owner = "client!dk",
      name = "db",
      descriptor = "B"
   )
   private byte field7703;
   @OriginalMember(
      owner = "client!dk",
      name = "mb",
      descriptor = "Z"
   )
   private boolean field7691;
   @OriginalMember(
      owner = "client!dk",
      name = "eb",
      descriptor = "Lr;"
   )
   private class196 field7694;
   @OriginalMember(
      owner = "client!dk",
      name = "O",
      descriptor = "Lka;"
   )
   private class500 field7708;
   @OriginalMember(
      owner = "client!dk",
      name = "ob",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7712 = new String[]{method3884(method3883("\u0010s\ff\u0019")), method3884(method3883("\u0005(N$")), method3884(method3883("\u000f6\ft\r\u00054VvL")), method3884(method3883("\u000f6\f\r%C")), method3884(method3883("\u000f6\f\u001bL")), method3884(method3883("\u000f6\f\nL")), method3884(method3883("\u000f6\f\u0004L")), method3884(method3883("\u000f6\f\tL")), method3884(method3883("\u000f6\f\u0005L")), method3884(method3883("\u000f6\f\u0001L")), method3884(method3883("\u000f6\f\t%C")), method3884(method3883("\u000f6\f\n%C")), method3884(method3883("\u000f6\f\u000e%C")), method3884(method3883("\u000f6\f\u000f%C")), method3884(method3883("\u000f6\f\fL")), method3884(method3883("\u000f6\f\u0002L")), method3884(method3883("\u000f6\f\u000b%C")), method3884(method3883("\u000f6\f\u001cL")), method3884(method3883("\u000f6\f\u001eL")), method3884(method3883("\u000f6\f\u001aL")), method3884(method3883("\u000f6\f\f%C"))};
   @OriginalMember(
      owner = "client!dk",
      name = "Y",
      descriptor = "[I"
   )
   public static int[] field7688 = new int[13];
   @OriginalMember(
      owner = "client!dk",
      name = "X",
      descriptor = "Z"
   )
   public static boolean field7710 = true;
   @OriginalMember(
      owner = "client!dk",
      name = "lb",
      descriptor = "I"
   )
   public static int field7683;
   @OriginalMember(
      owner = "client!dk",
      name = "Q",
      descriptor = "I"
   )
   public static int field7684;
   @OriginalMember(
      owner = "client!dk",
      name = "T",
      descriptor = "I"
   )
   public static int field7686;
   @OriginalMember(
      owner = "client!dk",
      name = "N",
      descriptor = "I"
   )
   public static int field7689;
   @OriginalMember(
      owner = "client!dk",
      name = "cb",
      descriptor = "I"
   )
   public static int field7690;
   @OriginalMember(
      owner = "client!dk",
      name = "W",
      descriptor = "I"
   )
   public static int field7692;
   @OriginalMember(
      owner = "client!dk",
      name = "S",
      descriptor = "I"
   )
   public static int field7693;
   @OriginalMember(
      owner = "client!dk",
      name = "L",
      descriptor = "I"
   )
   public static int field7695;
   @OriginalMember(
      owner = "client!dk",
      name = "jb",
      descriptor = "I"
   )
   public static int field7696;
   @OriginalMember(
      owner = "client!dk",
      name = "ab",
      descriptor = "I"
   )
   public static int field7698;
   @OriginalMember(
      owner = "client!dk",
      name = "nb",
      descriptor = "I"
   )
   public static int field7699;
   @OriginalMember(
      owner = "client!dk",
      name = "bb",
      descriptor = "I"
   )
   public static int field7700;
   @OriginalMember(
      owner = "client!dk",
      name = "Z",
      descriptor = "I"
   )
   public static int field7701;
   @OriginalMember(
      owner = "client!dk",
      name = "U",
      descriptor = "I"
   )
   public static int field7702;
   @OriginalMember(
      owner = "client!dk",
      name = "P",
      descriptor = "I"
   )
   public static int field7705;
   @OriginalMember(
      owner = "client!dk",
      name = "hb",
      descriptor = "I"
   )
   public static int field7706;
   @OriginalMember(
      owner = "client!dk",
      name = "ib",
      descriptor = "I"
   )
   public static int field7707;
   @OriginalMember(
      owner = "client!dk",
      name = "R",
      descriptor = "I"
   )
   public static int field7709;
   @OriginalMember(
      owner = "client!dk",
      name = "M",
      descriptor = "Lmk;"
   )
   private class62 field7697;

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public final void method240(int arg0, class66 arg1) {
      try {
         ++field7706;
         Object var3 = null;
         class196 var4;
         if (this.field7694 == null && this.field7691) {
            class580 var5 = this.method3881(262144, true, 13148, arg1);
            var4 = var5 != null ? var5.field8544 : null;
         } else {
            var4 = this.field7694;
            this.field7694 = null;
         }

         if (arg0 > -23) {
            this.method240(-84, (class66)null);
         }

         if (var4 != null) {
            class85.method761(var4, super.field10702, super.field10694, super.field10693, (boolean[])null);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7712[15] + arg0 + ',' + (arg1 != null ? field7712[0] : field7712[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(Lha;Z)V"
   )
   public final void method245(class66 arg0, boolean arg1) {
      try {
         ++field7692;
         if (arg1) {
            this.field7711 = -91;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7712[13] + (arg0 != null ? field7712[0] : field7712[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method238(byte arg0) {
      try {
         ++field7683;
         if (arg0 <= 73) {
            this.method248(11);
         }

         return this.field7708 != null ? this.field7708.method222() : false;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7712[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "<init>",
      descriptor = "(Lha;Ldea;IIIIIZIIII)V"
   )
   public class539(class66 arg0, class259 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);

      try {
         this.field7704 = (byte)arg11;
         this.field7685 = arg1.field3587 != 0 && !arg7;
         this.field7711 = (short)arg1.field3544;
         super.field10693 = arg6;
         this.field7687 = arg7;
         super.field10694 = arg4;
         this.field7703 = (byte)arg10;
         this.field7691 = arg0.method538() && arg1.field3560 && !this.field7687 && ~class300.field4107.field6423.method3404(-72) != -1;
         class580 var13 = this.method3881(2048, this.field7691, 13148, arg0);
         if (var13 != null) {
            this.field7694 = var13.field8544;
            this.field7708 = var13.field8542;
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field7712[2] + (arg0 != null ? field7712[0] : field7712[1]) + ',' + (arg1 != null ? field7712[0] : field7712[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method248(int arg0) {
      try {
         if (arg0 != -1) {
            this.field7697 = null;
         }

         ++field7699;
         return this.field7708 != null ? this.field7708.method225() : 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7712[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "(ILha;)Lth;"
   )
   public final class623 method242(int arg0, class66 arg1) {
      try {
         ++field7690;
         if (this.field7708 == null) {
            return null;
         } else {
            class521 var3 = arg1.method598();
            if (arg0 < 94) {
               return null;
            } else {
               var3.method1217(super.field4100 + super.field10694, super.field10697, super.field4105 + super.field10693);
               class623 var4 = class403.method3038(1, this.field7685, true);
               if (class183.field2581) {
                  this.field7708.method182(var3, var4.field9164[0], class298.field4088, 0);
                  if (!client.field4360) {
                     return var4;
                  }
               }

               this.field7708.method192(var3, var4.field9164[0], 0);
               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7712[12] + arg0 + ',' + (arg1 != null ? field7712[0] : field7712[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method243(int arg0) {
      try {
         if (arg0 != -29381) {
            this.method237(-53);
         }

         ++field7701;
         if (this.field7708 != null) {
            this.field7708.method169();
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7712[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "j",
      descriptor = "(B)V"
   )
   public static void method3880(byte arg0) {
      try {
         field7688 = null;
         if (arg0 <= 90) {
            method3880((byte)-78);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7712[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(Lha;I)Lmk;"
   )
   public final class62 method244(class66 arg0, int arg1) {
      try {
         if (arg1 != 92160000) {
            this.field7685 = true;
         }

         ++field7686;
         if (this.field7697 == null) {
            this.field7697 = class487.method3534(this.method3882((byte)65, arg0, 0), super.field10694, -1, super.field10697, super.field10693);
         }

         return this.field7697;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7712[8] + (arg0 != null ? field7712[0] : field7712[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method232(int arg0) {
      try {
         if (arg0 >= -88) {
            this.method245((class66)null, true);
         }

         ++field7684;
         return this.field7708 != null ? this.field7708.method226() : 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7712[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(IILha;I)Z"
   )
   public final boolean method251(int arg0, int arg1, class66 arg2, int arg3) {
      try {
         if (arg3 != -1) {
            this.method247(92);
         }

         ++field7698;
         class500 var5 = this.method3882((byte)68, arg2, 131072);
         if (var5 != null) {
            class521 var6 = arg2.method598();
            var6.method1217(super.field10694, super.field10697, super.field10693);
            return !class183.field2581 ? var5.method183(arg1, arg0, var6, false, 0) : var5.method206(arg1, arg0, var6, false, 0, class298.field4088);
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field7712[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7712[0] : field7712[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "b",
      descriptor = "(ILha;)V"
   )
   public final void method249(int arg0, class66 arg1) {
      try {
         ++field7693;
         Object var3 = null;
         class196 var5;
         if (this.field7694 == null && this.field7691) {
            class580 var4 = this.method3881(262144, true, 13148, arg1);
            var5 = var4 != null ? var4.field8544 : null;
         } else {
            var5 = this.field7694;
            this.field7694 = null;
         }

         if (arg0 >= -95) {
            this.field7694 = null;
         }

         if (var5 != null) {
            class196.method1536(var5, super.field10702, super.field10694, super.field10693, (boolean[])null);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field7712[19] + arg0 + ',' + (arg1 != null ? field7712[0] : field7712[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method236(int arg0) {
      try {
         ++field7705;
         if (arg0 != 28154) {
            this.method252((byte)-60);
         }

         return 65535 & this.field7711;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7712[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(IZILha;)Lii;"
   )
   private final class580 method3881(int arg0, boolean arg1, int arg2, class66 arg3) {
      boolean var5 = client.field4360;

      try {
         ++field7696;
         class259 var6 = class387.field5618.method3977(this.field7711 & 65535, (byte)75);
         if (arg2 != 13148) {
            this.method245((class66)null, false);
         }

         class295 var7;
         class295 var8;
         if (!this.field7687) {
            label31: {
               if (~super.field10702 > -4) {
                  var7 = class265.field3658[super.field10702 + 1];
                  if (!var5) {
                     break label31;
                  }
               }

               var7 = null;
            }

            var8 = class265.field3658[super.field10702];
            if (!var5) {
               return var6.method1982(arg2 + -13251, super.field10697, arg1, this.field7703, super.field10694, super.field10693, var8, var7, arg3, (class39)null, arg0, this.field7704);
            }
         }

         var8 = class757.field11220[super.field10702];
         var7 = class265.field3658[0];
         return var6.method1982(arg2 + -13251, super.field10697, arg1, this.field7703, super.field10694, super.field10693, var8, var7, arg3, (class39)null, arg0, this.field7704);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field7712[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7712[0] : field7712[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(BLha;I)Lka;"
   )
   private final class500 method3882(byte arg0, class66 arg1, int arg2) {
      try {
         ++field7707;
         if (this.field7708 != null && ~arg1.method531(this.field7708.method214(), arg2) == -1) {
            return this.field7708;
         } else {
            if (arg0 <= 51) {
               method3880((byte)-16);
            }

            class580 var4 = this.method3881(arg2, false, 13148, arg1);
            return var4 != null ? var4.field8542 : null;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7712[7] + arg0 + ',' + (arg1 != null ? field7712[0] : field7712[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "h",
      descriptor = "(B)Z"
   )
   public final boolean method253(byte arg0) {
      try {
         ++field7695;
         int var2 = 4 / ((arg0 - -84) / 38);
         if (this.field7708 != null) {
            return !this.field7708.method215();
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7712[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method237(int arg0) {
      try {
         int var2 = -109 / ((arg0 - 27) / 63);
         ++field7700;
         return this.field7703;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7712[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method252(byte arg0) {
      try {
         ++field7702;
         return arg0 != 6 ? -32 : this.field7704;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7712[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method247(int arg0) {
      try {
         ++field7709;
         if (arg0 != -6091) {
            this.field7685 = false;
         }

         return this.field7691;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7712[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3883(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3884(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
