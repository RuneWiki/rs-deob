import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class439 extends class78 implements class434 {
   @OriginalMember(
      owner = "client!nb",
      name = "cb",
      descriptor = "Z"
   )
   private boolean field6723;
   @OriginalMember(
      owner = "client!nb",
      name = "mb",
      descriptor = "B"
   )
   private byte field6743;
   @OriginalMember(
      owner = "client!nb",
      name = "yb",
      descriptor = "Z"
   )
   private boolean field6747;
   @OriginalMember(
      owner = "client!nb",
      name = "xb",
      descriptor = "Z"
   )
   private boolean field6717;
   @OriginalMember(
      owner = "client!nb",
      name = "wb",
      descriptor = "B"
   )
   private byte field6736;
   @OriginalMember(
      owner = "client!nb",
      name = "W",
      descriptor = "S"
   )
   private short field6735;
   @OriginalMember(
      owner = "client!nb",
      name = "U",
      descriptor = "Z"
   )
   private boolean field6729;
   @OriginalMember(
      owner = "client!nb",
      name = "S",
      descriptor = "Lka;"
   )
   public class91 field6719;
   @OriginalMember(
      owner = "client!nb",
      name = "gb",
      descriptor = "Lr;"
   )
   private class273 field6740;
   @OriginalMember(
      owner = "client!nb",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6749 = new String[]{method3459(method3458("h\u001ddF")), method3459(method3458("h\n&n5")), method3459(method3458("}F&\u0004`")), method3459(method3458("h\n&b5")), method3459(method3458("h\n&f5")), method3459(method3458("h\n&a5")), method3459(method3458("h\n&o5")), method3459(method3458("h\n&|5")), method3459(method3458("h\n&z5")), method3459(method3458("h\n&c5")), method3459(method3458("h\n&i5")), method3459(method3458("h\n&g5")), method3459(method3458("h\n&x5")), method3459(method3458("h\n&e5")), method3459(method3458("h\n&~5")), method3459(method3458("h\n&d5")), method3459(method3458("h\n&{5")), method3459(method3458("h\n&k5")), method3459(method3458("h\n&h5")), method3459(method3458("h\n&m5")), method3459(method3458("h\n&m\\.")), method3459(method3458("h\n&l5")), method3459(method3458("h\n&\u007f5")), method3459(method3458("h\n&`5")), method3459(method3458("h\n&y5")), method3459(method3458("h\n&\u0016th\u0001|\u00145"))};
   @OriginalMember(
      owner = "client!nb",
      name = "fb",
      descriptor = "Z"
   )
   public static boolean field6716 = true;
   @OriginalMember(
      owner = "client!nb",
      name = "Z",
      descriptor = "Luk;"
   )
   public static class498 field6722 = new class498(3, 20);
   @OriginalMember(
      owner = "client!nb",
      name = "qb",
      descriptor = "I"
   )
   public static int field6715;
   @OriginalMember(
      owner = "client!nb",
      name = "V",
      descriptor = "I"
   )
   public static int field6718;
   @OriginalMember(
      owner = "client!nb",
      name = "pb",
      descriptor = "I"
   )
   public static int field6720;
   @OriginalMember(
      owner = "client!nb",
      name = "ab",
      descriptor = "I"
   )
   public static int field6721;
   @OriginalMember(
      owner = "client!nb",
      name = "Y",
      descriptor = "I"
   )
   public static int field6724;
   @OriginalMember(
      owner = "client!nb",
      name = "db",
      descriptor = "I"
   )
   public static int field6725;
   @OriginalMember(
      owner = "client!nb",
      name = "nb",
      descriptor = "I"
   )
   public static int field6727;
   @OriginalMember(
      owner = "client!nb",
      name = "jb",
      descriptor = "I"
   )
   public static int field6728;
   @OriginalMember(
      owner = "client!nb",
      name = "tb",
      descriptor = "I"
   )
   public static int field6730;
   @OriginalMember(
      owner = "client!nb",
      name = "X",
      descriptor = "I"
   )
   public static int field6731;
   @OriginalMember(
      owner = "client!nb",
      name = "bb",
      descriptor = "I"
   )
   public static int field6732;
   @OriginalMember(
      owner = "client!nb",
      name = "ob",
      descriptor = "I"
   )
   public static int field6733;
   @OriginalMember(
      owner = "client!nb",
      name = "rb",
      descriptor = "I"
   )
   public static int field6734;
   @OriginalMember(
      owner = "client!nb",
      name = "hb",
      descriptor = "I"
   )
   public static int field6737;
   @OriginalMember(
      owner = "client!nb",
      name = "T",
      descriptor = "I"
   )
   public static int field6738;
   @OriginalMember(
      owner = "client!nb",
      name = "lb",
      descriptor = "I"
   )
   public static int field6739;
   @OriginalMember(
      owner = "client!nb",
      name = "ub",
      descriptor = "I"
   )
   public static int field6741;
   @OriginalMember(
      owner = "client!nb",
      name = "ib",
      descriptor = "I"
   )
   public static int field6742;
   @OriginalMember(
      owner = "client!nb",
      name = "vb",
      descriptor = "I"
   )
   public static int field6744;
   @OriginalMember(
      owner = "client!nb",
      name = "eb",
      descriptor = "I"
   )
   public static int field6745;
   @OriginalMember(
      owner = "client!nb",
      name = "kb",
      descriptor = "I"
   )
   public static int field6746;
   @OriginalMember(
      owner = "client!nb",
      name = "R",
      descriptor = "I"
   )
   public static int field6748;
   @OriginalMember(
      owner = "client!nb",
      name = "sb",
      descriptor = "Lil;"
   )
   private class680 field6726;

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(BLha;)Lpga;"
   )
   public final class788 method56(byte arg0, class610 arg1) {
      try {
         ++field6725;
         if (arg0 != -20) {
            return null;
         } else if (this.field6719 == null) {
            return null;
         } else {
            class401 var3 = arg1.method640();
            var3.method1542(super.field1505, super.field1495, super.field1494);
            class788 var4 = class333.method2708((byte)114, 1, this.field6717);
            if (!class334.field5143) {
               this.field6719.method897(var3, var4.field11545[0], 0);
               if (!client.field1786) {
                  return var4;
               }
            }

            this.field6719.method905(var3, var4.field11545[0], class591.field8709, 0);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6749[1] + arg0 + ',' + (arg1 != null ? field6749[2] : field6749[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method232(int arg0) {
      try {
         if (this.field6719 != null) {
            this.field6719.method903();
         }

         ++field6724;
         int var2 = -83 % ((arg0 - 54) / 59);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6749[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "e",
      descriptor = "(B)I"
   )
   public final int method3453(byte arg0) {
      try {
         ++field6741;
         if (arg0 != -41) {
            this.field6747 = true;
         }

         return this.field6719 == null ? 15 : this.field6719.method891() / 4;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6749[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method236(byte arg0) {
      try {
         ++field6721;
         if (arg0 != -11) {
            this.field6743 = -108;
         }

         return this.field6735 & 65535;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6749[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method233(boolean arg0) {
      try {
         ++field6730;
         if (this.field6719 != null) {
            return !this.field6719.method895();
         } else {
            return arg0 ? true : true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6749[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method57(int arg0) {
      try {
         ++field6718;
         int var2 = -25 / ((arg0 - -51) / 60);
         this.field6723 = false;
         if (this.field6719 != null) {
            this.field6719.method923(this.field6719.method906() & -65537);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6749[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "h",
      descriptor = "(I)I"
   )
   public final int method230(int arg0) {
      try {
         ++field6738;
         if (arg0 != 2) {
            return 105;
         } else {
            return this.field6719 != null ? this.field6719.method911() : 0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6749[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public final void method227(class610 arg0, byte arg1) {
      try {
         ++field6727;
         Object var3 = null;
         class273 var5;
         if (this.field6740 == null && this.field6729) {
            class690 var4 = this.method3456((byte)10, 262144, arg0, true);
            var5 = var4 == null ? null : var4.field10248;
         } else {
            var5 = this.field6740;
            this.field6740 = null;
         }

         int var6 = 87 / ((arg1 - 30) / 34);
         if (var5 != null) {
            class453.method3553(var5, super.field1500, super.field1505, super.field1494, (boolean[])null);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6749[7] + (arg0 != null ? field6749[2] : field6749[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method3454(boolean arg0) {
      try {
         if (!arg0) {
            method3454(true);
         }

         field6722 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6749[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method237(int arg0) {
      try {
         if (arg0 != 28440) {
            return 127;
         } else {
            ++field6731;
            return this.field6743;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6749[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "<init>",
      descriptor = "(Lha;Lru;IIIIIZIIIIIIZ)V"
   )
   public class439(class610 arg0, class333 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
      super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5100 == 1, class315.method2611((byte)47, arg13, arg12));

      try {
         super.field1500 = (byte)arg3;
         this.field6723 = arg14;
         this.field6743 = (byte)arg12;
         this.field6747 = arg7;
         this.field6717 = arg1.field5071 != 0 && !arg7;
         this.field6736 = (byte)arg13;
         this.field6735 = (short)arg1.field5099;
         this.field6729 = arg0.method702() && arg1.field5102 && !this.field6747 && ~class687.field10213.field498.method5540(480102311) != -1;
         int var16 = 2048;
         if (this.field6723) {
            var16 |= 65536;
         }

         class690 var17 = this.method3456((byte)10, var16, arg0, this.field6729);
         if (var17 != null) {
            this.field6719 = var17.field10250;
            this.field6740 = var17.field10248;
            if (this.field6723) {
               this.field6719 = this.field6719.method868((byte)0, var16, false);
               return;
            }
         }

      } catch (RuntimeException var19) {
         throw class482.method3757(var19, field6749[25] + (arg0 != null ? field6749[2] : field6749[0]) + ',' + (arg1 != null ? field6749[2] : field6749[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(Lha;I)V"
   )
   public final void method49(class610 arg0, int arg1) {
      try {
         if (arg1 != -16) {
            this.field6747 = false;
         }

         ++field6742;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6749[4] + (arg0 != null ? field6749[2] : field6749[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method231(byte arg0) {
      try {
         if (arg0 != -42) {
            this.field6740 = null;
         }

         ++field6745;
         return this.field6736;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6749[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(Ld;IBILjava/awt/Canvas;Lrr;)Lha;"
   )
   public static final class610 method3455(class150 arg0, int arg1, byte arg2, int arg3, Canvas arg4, class678 arg5) {
      try {
         ++field6715;
         if (arg2 < 62) {
            field6716 = false;
         }

         int var6 = 0;
         int var7 = 0;
         if (arg4 != null) {
            Dimension var8 = arg4.getSize();
            var7 = var8.height;
            var6 = var8.width;
         }

         return class610.method4501(arg3, arg1, arg5, var7, arg0, (byte)52, var6, arg4);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6749[9] + (arg0 != null ? field6749[2] : field6749[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6749[2] : field6749[0]) + ',' + (arg5 != null ? field6749[2] : field6749[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(Lha;IIZ)Z"
   )
   public final boolean method43(class610 arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field6744;
         class91 var5 = this.method3457(0, 131072, arg0);
         if (arg3) {
            this.method230(-26);
         }

         if (var5 != null) {
            class401 var6 = arg0.method640();
            var6.method1542(super.field1505, super.field1495, super.field1494);
            return !class334.field5143 ? var5.method886(arg2, arg1, var6, false, 0) : var5.method912(arg2, arg1, var6, false, 0, class591.field8709);
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6749[8] + (arg0 != null ? field6749[2] : field6749[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public final void method238(class610 arg0, int arg1) {
      try {
         ++field6733;
         Object var3 = null;
         int var4 = -96 % ((-20 - arg1) / 62);
         class273 var5;
         if (this.field6740 == null && this.field6729) {
            class690 var6 = this.method3456((byte)10, 262144, arg0, true);
            var5 = var6 == null ? null : var6.field10248;
         } else {
            var5 = this.field6740;
            this.field6740 = null;
         }

         if (var5 != null) {
            class32.method235(var5, super.field1500, super.field1505, super.field1494, (boolean[])null);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field6749[24] + (arg0 != null ? field6749[2] : field6749[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "d",
      descriptor = "(B)Z"
   )
   public final boolean method45(byte arg0) {
      try {
         ++field6748;
         if (arg0 > -108) {
            this.method43((class610)null, 47, 27, true);
         }

         return this.field6723;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6749[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(ILha;)Lil;"
   )
   public final class680 method41(int arg0, class610 arg1) {
      try {
         if (this.field6726 == null) {
            this.field6726 = class404.method3254(-122, super.field1494, super.field1495, this.method3457(arg0 + -4058, 0, arg1), super.field1505);
         }

         ++field6737;
         return arg0 != 4058 ? null : this.field6726;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6749[3] + arg0 + ',' + (arg1 != null ? field6749[2] : field6749[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(BILha;Z)Lla;"
   )
   private final class690 method3456(byte arg0, int arg1, class610 arg2, boolean arg3) {
      boolean var5 = client.field1786;

      try {
         ++field6728;
         class333 var6 = class102.field1434.method1411(65535 & this.field6735, -88);
         if (arg0 != 10) {
            this.method230(-81);
         }

         class271 var7;
         class271 var8;
         if (!this.field6747) {
            label41: {
               if (~super.field1500 > -4) {
                  var7 = class96.field1355[super.field1500 + 1];
                  if (!var5) {
                     break label41;
                  }
               }

               var7 = null;
            }

            var8 = class96.field1355[super.field1500];
            if (!var5) {
               return var6.method2719(arg3, (byte)124, arg1, var7, ~this.field6743 == -12 ? this.field6736 + 4 : this.field6736, super.field1505, (class752)null, arg2, this.field6743 == 11 ? 10 : this.field6743, var8, super.field1494, super.field1495);
            }
         }

         var8 = class190.field2949[super.field1500];
         var7 = class96.field1355[0];
         return var6.method2719(arg3, (byte)124, arg1, var7, ~this.field6743 == -12 ? this.field6736 + 4 : this.field6736, super.field1505, (class752)null, arg2, this.field6743 == 11 ? 10 : this.field6743, var8, super.field1494, super.field1495);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field6749[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6749[2] : field6749[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "k",
      descriptor = "(I)I"
   )
   public final int method239(int arg0) {
      try {
         ++field6732;
         int var2 = -57 % ((-44 - arg0) / 39);
         return this.field6719 == null ? 0 : this.field6719.method919();
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6749[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(IIILha;ZILbaa;)V"
   )
   public final void method44(int arg0, int arg1, int arg2, class610 arg3, boolean arg4, int arg5, class109 arg6) {
      try {
         label47: {
            ++field6739;
            if (arg6 instanceof class278) {
               class278 var8 = (class278)arg6;
               if (this.field6719 == null || var8.field4438 == null) {
                  break label47;
               }

               this.field6719.method877(var8.field4438, arg5, arg0, arg2, arg4);
               if (!client.field1786) {
                  break label47;
               }
            }

            if (arg6 instanceof class439) {
               class439 var9 = (class439)arg6;
               if (this.field6719 != null && var9.field6719 != null) {
                  this.field6719.method877(var9.field6719, arg5, arg0, arg2, arg4);
               }
            }
         }

         if (arg1 != 0) {
            this.method44(-57, -70, -21, (class610)null, false, -29, (class109)null);
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field6749[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6749[2] : field6749[0]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field6749[2] : field6749[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "a",
      descriptor = "(IILha;)Lka;"
   )
   private final class91 method3457(int arg0, int arg1, class610 arg2) {
      try {
         ++field6746;
         if (this.field6719 != null && ~arg2.method690(this.field6719.method906(), arg1) == -1) {
            return this.field6719;
         } else if (arg0 != 0) {
            return null;
         } else {
            class690 var4 = this.method3456((byte)10, arg1, arg2, false);
            return var4 != null ? var4.field10250 : null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6749[20] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6749[2] : field6749[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "g",
      descriptor = "(I)Z"
   )
   public final boolean method228(int arg0) {
      try {
         ++field6720;
         if (arg0 != 0) {
            this.method241(80);
         }

         return this.field6719 != null ? this.field6719.method892() : false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6749[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method241(int arg0) {
      try {
         if (arg0 != -18128) {
            method3454(true);
         }

         ++field6734;
         return this.field6729;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6749[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3458(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3459(char[] arg0) {
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
            var10005 = 104;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
