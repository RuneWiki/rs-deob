import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class169 extends class566 implements class338 {
   @OriginalMember(
      owner = "client!sf",
      name = "tb",
      descriptor = "S"
   )
   private short field2548;
   @OriginalMember(
      owner = "client!sf",
      name = "S",
      descriptor = "Z"
   )
   private boolean field2539;
   @OriginalMember(
      owner = "client!sf",
      name = "mb",
      descriptor = "Z"
   )
   private boolean field2545;
   @OriginalMember(
      owner = "client!sf",
      name = "fb",
      descriptor = "B"
   )
   private byte field2527;
   @OriginalMember(
      owner = "client!sf",
      name = "rb",
      descriptor = "B"
   )
   private byte field2543;
   @OriginalMember(
      owner = "client!sf",
      name = "gb",
      descriptor = "Z"
   )
   private boolean field2530;
   @OriginalMember(
      owner = "client!sf",
      name = "X",
      descriptor = "Lka;"
   )
   private class761 field2531;
   @OriginalMember(
      owner = "client!sf",
      name = "T",
      descriptor = "Lr;"
   )
   private class412 field2537;
   @OriginalMember(
      owner = "client!sf",
      name = "vb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2551 = new String[]{method1580(method1579("fn\u0016\u0018R")), method1580(method1579("n&\u0016x\u0007")), method1580(method1579("{}T:")), method1580(method1579("fn\u0016\u0003R")), method1580(method1579("fn\u0016\u0007R")), method1580(method1579("fn\u0016\u0000R")), method1580(method1579("fn\u0016\u0017;=")), method1580(method1579("fn\u0016j\u0013{aLhR")), method1580(method1579("fn\u0016\u0005R")), method1580(method1579("fn\u0016\u001aR")), method1580(method1579("fn\u0016\u0014;=")), method1580(method1579("fn\u0016\u0019R")), method1580(method1579("fn\u0016\u0004R")), method1580(method1579("fn\u0016\u001fR")), method1580(method1579("fn\u0016\u001bR")), method1580(method1579("fn\u0016\u0001R")), method1580(method1579("fn\u0016\u001dR")), method1580(method1579("fn\u0016\u0002R")), method1580(method1579("fn\u0016\u001cR")), method1580(method1579("fn\u0016\u0012;=")), method1580(method1579("fn\u0016\u0010;="))};
   @OriginalMember(
      owner = "client!sf",
      name = "kb",
      descriptor = "[[I"
   )
   public static int[][] field2529 = new int[6][];
   @OriginalMember(
      owner = "client!sf",
      name = "eb",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2533 = new String[100];
   @OriginalMember(
      owner = "client!sf",
      name = "bb",
      descriptor = "I"
   )
   public static int field2522;
   @OriginalMember(
      owner = "client!sf",
      name = "sb",
      descriptor = "I"
   )
   public static int field2523;
   @OriginalMember(
      owner = "client!sf",
      name = "hb",
      descriptor = "I"
   )
   public static int field2524;
   @OriginalMember(
      owner = "client!sf",
      name = "qb",
      descriptor = "I"
   )
   public static int field2525;
   @OriginalMember(
      owner = "client!sf",
      name = "cb",
      descriptor = "I"
   )
   public static int field2526;
   @OriginalMember(
      owner = "client!sf",
      name = "Y",
      descriptor = "I"
   )
   public static int field2528;
   @OriginalMember(
      owner = "client!sf",
      name = "ub",
      descriptor = "I"
   )
   public static int field2532;
   @OriginalMember(
      owner = "client!sf",
      name = "V",
      descriptor = "I"
   )
   public static int field2534;
   @OriginalMember(
      owner = "client!sf",
      name = "Z",
      descriptor = "I"
   )
   public static int field2536;
   @OriginalMember(
      owner = "client!sf",
      name = "W",
      descriptor = "I"
   )
   public static int field2538;
   @OriginalMember(
      owner = "client!sf",
      name = "ib",
      descriptor = "I"
   )
   public static int field2540;
   @OriginalMember(
      owner = "client!sf",
      name = "jb",
      descriptor = "I"
   )
   public static int field2541;
   @OriginalMember(
      owner = "client!sf",
      name = "ab",
      descriptor = "I"
   )
   public static int field2542;
   @OriginalMember(
      owner = "client!sf",
      name = "db",
      descriptor = "I"
   )
   public static int field2544;
   @OriginalMember(
      owner = "client!sf",
      name = "nb",
      descriptor = "I"
   )
   public static int field2546;
   @OriginalMember(
      owner = "client!sf",
      name = "U",
      descriptor = "I"
   )
   public static int field2547;
   @OriginalMember(
      owner = "client!sf",
      name = "ob",
      descriptor = "I"
   )
   public static int field2549;
   @OriginalMember(
      owner = "client!sf",
      name = "pb",
      descriptor = "I"
   )
   public static int field2550;
   @OriginalMember(
      owner = "client!sf",
      name = "lb",
      descriptor = "Loga;"
   )
   private class358 field2535;

   @OriginalMember(
      owner = "client!sf",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method733(int arg0) {
      try {
         ++field2550;
         return arg0 != 28344 ? 18 : this.field2543;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2551[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "h",
      descriptor = "(I)Z"
   )
   public final boolean method725(int arg0) {
      try {
         if (arg0 != -6664) {
            return true;
         } else {
            ++field2534;
            if (this.field2531 != null) {
               return !this.field2531.method767();
            } else {
               return true;
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2551[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method721(byte arg0) {
      try {
         ++field2525;
         if (arg0 < 81) {
            this.method724(-41);
         }

         return this.field2530;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2551[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public final void method727(class17 arg0, int arg1) {
      try {
         if (arg1 != -26496) {
            this.method727((class17)null, -25);
         }

         ++field2546;
         Object var3 = null;
         class412 var4;
         if (this.field2537 == null && this.field2530) {
            class176 var5 = this.method1577((byte)-63, arg0, true, 262144);
            var4 = var5 != null ? var5.field2612 : null;
         } else {
            var4 = this.field2537;
            this.field2537 = null;
         }

         if (var4 != null) {
            class486.method3700(var4, super.field6826, super.field6832, super.field6833, (boolean[])null);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2551[8] + (arg0 != null ? field2551[1] : field2551[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method724(int arg0) {
      try {
         if (arg0 != 23976) {
            this.field2543 = 23;
         }

         ++field2549;
         return 65535 & this.field2548;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2551[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "j",
      descriptor = "(I)I"
   )
   public final int method728(int arg0) {
      try {
         if (arg0 != 0) {
            this.field2530 = true;
         }

         ++field2540;
         return this.field2531 != null ? this.field2531.method801() : 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2551[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public final void method726(class17 arg0, byte arg1) {
      try {
         int var3 = 112 / ((39 - arg1) / 46);
         ++field2544;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2551[9] + (arg0 != null ? field2551[1] : field2551[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "m",
      descriptor = "(I)V"
   )
   public static void method1576(int arg0) {
      try {
         if (arg0 <= 16) {
            method1576(-97);
         }

         field2533 = null;
         field2529 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2551[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "b",
      descriptor = "(ILha;)Lwba;"
   )
   public final class731 method730(int arg0, class17 arg1) {
      try {
         ++field2547;
         if (this.field2531 == null) {
            return null;
         } else {
            class502 var3 = arg1.method254();
            var3.method322(super.field8045 + super.field6832, super.field6829, super.field8044 + super.field6833);
            class731 var4 = class54.method574(0, this.field2545, 1);
            if (class791.field11526) {
               this.field2531.method763(var3, var4.field10397[0], class582.field8178, 0);
               if (!client.field10022) {
                  return arg0 > -30 ? null : var4;
               }
            }

            this.field2531.method805(var3, var4.field10397[0], 0);
            return arg0 > -30 ? null : var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2551[12] + arg0 + ',' + (arg1 != null ? field2551[1] : field2551[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(BLha;ZI)Lat;"
   )
   private final class176 method1577(byte arg0, class17 arg1, boolean arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field2536;
         if (arg0 != -63) {
            return null;
         } else {
            class544 var6 = class549.field7834.method3850(3917, 65535 & this.field2548);
            class751 var7;
            class751 var8;
            if (this.field2539) {
               var7 = class634.field8989[super.field6826];
               var8 = class558.field7922[0];
               if (!var5) {
                  return var6.method4076(super.field6832, var7, arg3, (class468)null, (byte)-85, arg1, super.field6833, super.field6829, var8, this.field2543, arg2, this.field2527);
               }
            }

            label29: {
               if (super.field6826 < 3) {
                  var8 = class558.field7922[super.field6826 - -1];
                  if (!var5) {
                     break label29;
                  }
               }

               var8 = null;
            }

            var7 = class558.field7922[super.field6826];
            return var6.method4076(super.field6832, var7, arg3, (class468)null, (byte)-85, arg1, super.field6833, super.field6829, var8, this.field2543, arg2, this.field2527);
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2551[5] + arg0 + ',' + (arg1 != null ? field2551[1] : field2551[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "<init>",
      descriptor = "(Lha;Lbha;IIIIIZIIII)V"
   )
   public class169(class17 arg0, class544 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);

      try {
         this.field2548 = (short)arg1.field7665;
         super.field6833 = arg6;
         super.field6832 = arg4;
         this.field2539 = arg7;
         this.field2545 = ~arg1.field7716 != -1 && !arg7;
         this.field2527 = (byte)arg11;
         this.field2543 = (byte)arg10;
         this.field2530 = arg0.method230() && arg1.field7760 && !this.field2539 && ~class476.field6870.field9118.method709(-54) != -1;
         class176 var13 = this.method1577((byte)-63, arg0, this.field2530, 2048);
         if (var13 != null) {
            this.field2531 = var13.field2609;
            this.field2537 = var13.field2612;
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field2551[7] + (arg0 != null ? field2551[1] : field2551[2]) + ',' + (arg1 != null ? field2551[1] : field2551[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IIILha;)Z"
   )
   public final boolean method718(int arg0, int arg1, int arg2, class17 arg3) {
      try {
         ++field2526;
         class761 var5 = this.method1578(131072, arg2 + arg2, arg3);
         if (var5 != null) {
            class502 var6 = arg3.method254();
            var6.method322(super.field6832, super.field6829, super.field6833);
            return class791.field11526 ? var5.method804(arg0, arg1, var6, false, 0, class582.field8178) : var5.method748(arg0, arg1, var6, false, 0);
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field2551[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2551[1] : field2551[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(IILha;)Lka;"
   )
   private final class761 method1578(int arg0, int arg1, class17 arg2) {
      try {
         ++field2522;
         if (this.field2531 != null && ~arg2.method214(this.field2531.method775(), arg0) == -1) {
            return this.field2531;
         } else if (arg1 != 0) {
            return null;
         } else {
            class176 var4 = this.method1577((byte)-63, arg2, false, arg0);
            return var4 != null ? var4.field2609 : null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2551[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2551[1] : field2551[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public final void method736(int arg0, class17 arg1) {
      try {
         ++field2538;
         Object var3 = null;
         if (arg0 != -19501) {
            this.method727((class17)null, 23);
         }

         class412 var4;
         if (this.field2537 == null && this.field2530) {
            class176 var5 = this.method1577((byte)-63, arg1, true, 262144);
            var4 = var5 == null ? null : var5.field2612;
         } else {
            var4 = this.field2537;
            this.field2537 = null;
         }

         if (var4 != null) {
            class278.method2338(var4, super.field6826, super.field6832, super.field6833, (boolean[])null);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2551[13] + arg0 + ',' + (arg1 != null ? field2551[1] : field2551[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(ZLha;)Loga;"
   )
   public final class358 method722(boolean arg0, class17 arg1) {
      try {
         ++field2541;
         if (this.field2535 == null) {
            this.field2535 = class357.method2806(super.field6833, super.field6832, -119, this.method1578(0, 0, arg1), super.field6829);
         }

         if (arg0) {
            this.method722(true, (class17)null);
         }

         return this.field2535;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2551[19] + arg0 + ',' + (arg1 != null ? field2551[1] : field2551[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method732(int arg0) {
      try {
         ++field2542;
         if (this.field2531 != null) {
            this.field2531.method756();
         }

         if (arg0 != 9799) {
            field2533 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2551[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "k",
      descriptor = "(I)Z"
   )
   public final boolean method723(int arg0) {
      try {
         ++field2523;
         if (arg0 > -26) {
            return true;
         } else {
            return this.field2531 != null ? this.field2531.method781() : false;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2551[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "e",
      descriptor = "(B)I"
   )
   public final int method720(byte arg0) {
      try {
         ++field2532;
         if (arg0 >= -75) {
            return -7;
         } else {
            return this.field2531 == null ? 0 : this.field2531.method794();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2551[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method734(int arg0) {
      try {
         ++field2524;
         if (arg0 != -5723) {
            this.method736(-128, (class17)null);
         }

         return this.field2527;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2551[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1579(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1580(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
