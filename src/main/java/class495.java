import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class495 {
   @OriginalMember(
      owner = "client!wi",
      name = "n",
      descriptor = "Z"
   )
   public boolean field6798 = false;
   @OriginalMember(
      owner = "client!wi",
      name = "q",
      descriptor = "Ltv;"
   )
   private class590 field6808 = new class590(64);
   @OriginalMember(
      owner = "client!wi",
      name = "t",
      descriptor = "Ltv;"
   )
   public class590 field6809 = new class590(500);
   @OriginalMember(
      owner = "client!wi",
      name = "r",
      descriptor = "Ltv;"
   )
   public class590 field6810 = new class590(30);
   @OriginalMember(
      owner = "client!wi",
      name = "k",
      descriptor = "Ltv;"
   )
   public class590 field6811 = new class590(50);
   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "Z"
   )
   public boolean field6807;
   @OriginalMember(
      owner = "client!wi",
      name = "m",
      descriptor = "Lqh;"
   )
   public class74 field6806;
   @OriginalMember(
      owner = "client!wi",
      name = "o",
      descriptor = "Lqh;"
   )
   private class74 field6796;
   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6813 = new String[]{method3596(method3595("kugPP")), method3596(method3595("kugQP")), method3596(method3595("kugRP")), method3596(method3595("kug]P")), method3596(method3595("ri%x")), method3596(method3595("g2g:\u0005")), method3596(method3595("kug(\u0011ru=*P")), method3596(method3595("kug\\P")), method3596(method3595("kugUP")), method3596(method3595("kugWP")), method3596(method3595("kugSP")), method3596(method3595("kugVP"))};
   @OriginalMember(
      owner = "client!wi",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field6804 = new int[14];
   @OriginalMember(
      owner = "client!wi",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field6793 = new int[64];
   @OriginalMember(
      owner = "client!wi",
      name = "h",
      descriptor = "I"
   )
   public static int field6794;
   @OriginalMember(
      owner = "client!wi",
      name = "g",
      descriptor = "I"
   )
   public static int field6795;
   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "I"
   )
   public static int field6797;
   @OriginalMember(
      owner = "client!wi",
      name = "p",
      descriptor = "I"
   )
   public static int field6799;
   @OriginalMember(
      owner = "client!wi",
      name = "i",
      descriptor = "I"
   )
   public static int field6800;
   @OriginalMember(
      owner = "client!wi",
      name = "s",
      descriptor = "I"
   )
   public static int field6801;
   @OriginalMember(
      owner = "client!wi",
      name = "j",
      descriptor = "I"
   )
   public static int field6802;
   @OriginalMember(
      owner = "client!wi",
      name = "c",
      descriptor = "I"
   )
   public static int field6803;
   @OriginalMember(
      owner = "client!wi",
      name = "f",
      descriptor = "I"
   )
   public static int field6805;
   @OriginalMember(
      owner = "client!wi",
      name = "l",
      descriptor = "I"
   )
   public int field6812;

   @OriginalMember(
      owner = "client!wi",
      name = "c",
      descriptor = "(II)Lkn;"
   )
   public final class774 method3586(int arg0, int arg1) {
      try {
         ++field6801;
         class590 var3 = this.field6808;
         class774 var4;
         synchronized(this.field6808) {
            var4 = (class774)this.field6808.method4239((long)arg1, 0);
         }

         if (arg0 != 64) {
            this.method3587(true, true);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field6796;
            byte[] var6;
            synchronized(this.field6796) {
               var6 = this.field6796.method732(class193.method1453(arg1, (byte)-23), class648.method4665(arg1, (byte)-53), (byte)63);
            }

            class774 var7 = new class774();
            var7.field11210 = arg1;
            var7.field11175 = this;
            if (var6 != null) {
               var7.method5538((byte)0, new class594(var6));
            }

            var7.method5550(arg0 + -152);
            if (var7.field11239) {
               var7.field11204 = 0;
               var7.field11183 = false;
            }

            if (!this.field6807 && var7.field11220) {
               var7.field11223 = null;
               var7.field11233 = null;
            }

            class590 var8 = this.field6808;
            synchronized(this.field6808) {
               this.field6808.method4238(123, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field6813[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method3587(boolean arg0, boolean arg1) {
      try {
         if (arg0) {
            ++field6802;
            if (this.field6798 != arg1) {
               this.field6798 = arg1;
               this.method3590(124);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6813[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3588(byte arg0) {
      try {
         class590 var2 = this.field6808;
         synchronized(this.field6808) {
            this.field6808.method4244(true);
         }

         ++field6795;
         class590 var3 = this.field6809;
         synchronized(this.field6809) {
            this.field6809.method4244(true);
         }

         class590 var4 = this.field6810;
         synchronized(this.field6810) {
            this.field6810.method4244(true);
            if (arg0 < 49) {
               this.method3587(false, false);
            }
         }

         class590 var5 = this.field6811;
         synchronized(this.field6811) {
            this.field6811.method4244(true);
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field6813[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "d",
      descriptor = "(II)V"
   )
   public final void method3589(int arg0, int arg1) {
      try {
         class590 var3 = this.field6808;
         synchronized(this.field6808) {
            this.field6808.method4234(2, arg1);
         }

         if (arg0 == 64) {
            ++field6799;
            class590 var4 = this.field6809;
            synchronized(this.field6809) {
               this.field6809.method4234(2, arg1);
            }

            class590 var5 = this.field6810;
            synchronized(this.field6810) {
               this.field6810.method4234(arg0 + -62, arg1);
            }

            class590 var6 = this.field6811;
            synchronized(this.field6811) {
               this.field6811.method4234(2, arg1);
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field6813[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3590(int arg0) {
      try {
         class590 var2 = this.field6808;
         synchronized(this.field6808) {
            this.field6808.method4245(true);
         }

         ++field6800;
         class590 var3 = this.field6809;
         synchronized(this.field6809) {
            this.field6809.method4245(true);
            int var4 = -101 % ((-35 - arg0) / 61);
         }

         class590 var5 = this.field6810;
         synchronized(this.field6810) {
            this.field6810.method4245(true);
         }

         class590 var6 = this.field6811;
         synchronized(this.field6811) {
            this.field6811.method4245(true);
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field6813[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3591(byte arg0) {
      try {
         int var1 = -94 / ((arg0 - -79) / 40);
         field6804 = null;
         field6793 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6813[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3592(int arg0, int arg1) {
      try {
         this.field6808 = new class590(arg1);
         if (arg0 == 0) {
            ++field6805;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6813[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method3593(boolean arg0, byte arg1) {
      try {
         if (arg1 == 47) {
            ++field6794;
            if (this.field6807 != arg0) {
               this.field6807 = arg0;
               this.method3590(122);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6813[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3594(int arg0, int arg1) {
      try {
         this.field6812 = arg0;
         if (arg1 == 4864) {
            ++field6803;
            class590 var3 = this.field6809;
            synchronized(this.field6809) {
               this.field6809.method4245(true);
            }

            class590 var4 = this.field6810;
            synchronized(this.field6810) {
               this.field6810.method4245(true);
            }

            class590 var5 = this.field6811;
            synchronized(this.field6811) {
               this.field6811.method4245(true);
            }
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field6813[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "<init>",
      descriptor = "(Lnc;IZLqh;Lqh;)V"
   )
   public class495(class26 arg0, int arg1, boolean arg2, class74 arg3, class74 arg4) {
      try {
         this.field6807 = arg2;
         this.field6806 = arg4;
         this.field6796 = arg3;
         if (this.field6796 != null) {
            int var6 = -1 + this.field6796.method719(true);
            this.field6796.method727(var6, -32767);
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6813[6] + (arg0 != null ? field6813[5] : field6813[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6813[5] : field6813[4]) + ',' + (arg4 != null ? field6813[5] : field6813[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3595(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3596(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
