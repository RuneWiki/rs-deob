import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class181 {
   @OriginalMember(
      owner = "client!qc",
      name = "n",
      descriptor = "Llj;"
   )
   private class304 field2814 = new class304(64);
   @OriginalMember(
      owner = "client!qc",
      name = "l",
      descriptor = "Llj;"
   )
   public class304 field2815 = new class304(60);
   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "Lrr;"
   )
   private class678 field2810;
   @OriginalMember(
      owner = "client!qc",
      name = "j",
      descriptor = "Lrr;"
   )
   public class678 field2811;
   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2817 = new String[]{method1651(method1650("t\u001b\tn2")), method1651(method1650("k\rKA")), method1651(method1650("t\u001b\t\u0011sk\u0011S\u00132")), method1651(method1650("~V\t\u0003g")), method1651(method1650("t\u001b\th2")), method1651(method1650("t\u001b\tj2")), method1651(method1650("t\u001b\td2")), method1651(method1650("t\u001b\tl2")), method1651(method1650("t\u001b\ti2")), method1651(method1650("t\u001b\te2")), method1651(method1650("t\u001b\to2")), method1651(method1650("t\u001b\tk2"))};
   @OriginalMember(
      owner = "client!qc",
      name = "c",
      descriptor = "I"
   )
   public static int field2803;
   @OriginalMember(
      owner = "client!qc",
      name = "g",
      descriptor = "I"
   )
   public static int field2804;
   @OriginalMember(
      owner = "client!qc",
      name = "b",
      descriptor = "I"
   )
   public static int field2805;
   @OriginalMember(
      owner = "client!qc",
      name = "k",
      descriptor = "I"
   )
   public static int field2806;
   @OriginalMember(
      owner = "client!qc",
      name = "m",
      descriptor = "I"
   )
   public static int field2807;
   @OriginalMember(
      owner = "client!qc",
      name = "d",
      descriptor = "I"
   )
   public static int field2808;
   @OriginalMember(
      owner = "client!qc",
      name = "e",
      descriptor = "I"
   )
   public static int field2809;
   @OriginalMember(
      owner = "client!qc",
      name = "f",
      descriptor = "I"
   )
   public static int field2813;
   @OriginalMember(
      owner = "client!qc",
      name = "i",
      descriptor = "I"
   )
   public int field2816;
   @OriginalMember(
      owner = "client!qc",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field2812;

   @OriginalMember(
      owner = "client!qc",
      name = "d",
      descriptor = "(II)[I",
      line = 8
   )
   public static final int[] method1641(int arg0, int arg1) {
      try {
         ++field2804;
         int[] var2 = new int[3];
         class552.method4193(arg0 + 27444, class440.method3461(arg1, (byte)-82));
         var2[arg0] = class406.field6327.get(5);
         var2[1] = class406.field6327.get(2);
         var2[2] = class406.field6327.get(1);
         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2817[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "b",
      descriptor = "(B)V",
      line = 26
   )
   public static final void method1642(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qc",
      name = "c",
      descriptor = "(II)V",
      line = 58
   )
   public final void method1643(int arg0, int arg1) {
      try {
         class304 var3 = this.field2814;
         synchronized(this.field2814) {
            this.field2814.method2552(arg0, 21533);
            if (arg1 != 6998) {
               method1641(73, 9);
            }
         }

         ++field2809;
         class304 var4 = this.field2815;
         synchronized(this.field2815) {
            this.field2815.method2552(arg0, 21533);
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2817[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "c",
      descriptor = "(B)V",
      line = 75
   )
   public static void method1644(byte arg0) {
      try {
         if (arg0 < 21) {
            field2812 = null;
         }

         field2812 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2817[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(II)Lof;",
      line = 86
   )
   public final class618 method1645(int arg0, int arg1) {
      try {
         ++field2808;
         class304 var3 = this.field2814;
         class618 var4;
         synchronized(this.field2814) {
            var4 = (class618)this.field2814.method2544(false, (long)arg0);
         }

         if (arg1 != 1) {
            method1641(62, 43);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field2810;
            byte[] var6;
            synchronized(this.field2810) {
               var6 = this.field2810.method5017(class365.method2967(true, arg0), class33.method249(arg0, (byte)-62), (byte)71);
            }

            class618 var7 = new class618();
            var7.field8989 = this;
            var7.field8981 = arg0;
            if (var6 != null) {
               var7.method4548(false, new class354(var6));
            }

            class304 var8 = this.field2814;
            synchronized(this.field2814) {
               this.field2814.method2545((long)arg0, 124, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field2817[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(I)V",
      line = 119
   )
   public final void method1646(int arg0) {
      try {
         ++field2807;
         if (arg0 == 0) {
            class304 var2 = this.field2814;
            synchronized(this.field2814) {
               this.field2814.method2551(true);
            }

            class304 var3 = this.field2815;
            synchronized(this.field2815) {
               this.field2815.method2551(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2817[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(IB)V",
      line = 136
   )
   public static final void method1647(int arg0, byte arg1) {
      try {
         if (arg1 != 73) {
            field2812 = null;
         }

         ++field2813;
         class566 var2 = class146.method1321((long)arg0, 17, -1428737160);
         var2.method4268(4);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2817[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "b",
      descriptor = "(II)V",
      line = 151
   )
   public final void method1648(int arg0, int arg1) {
      try {
         this.field2816 = arg0;
         ++field2805;
         class304 var3 = this.field2815;
         synchronized(this.field2815) {
            this.field2815.method2551(true);
            if (arg1 != -24129) {
               this.method1645(-74, 88);
            }

         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2817[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(B)V",
      line = 165
   )
   public final void method1649(byte arg0) {
      try {
         class304 var2 = this.field2814;
         synchronized(this.field2814) {
            this.field2814.method2554(-127);
         }

         ++field2803;
         class304 var3 = this.field2815;
         synchronized(this.field2815) {
            this.field2815.method2554(-125);
         }

         if (arg0 != -2) {
            field2812 = null;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2817[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "<init>",
      descriptor = "(Ltv;ILrr;Lrr;)V",
      line = 189
   )
   public class181(class311 arg0, int arg1, class678 arg2, class678 arg3) {
      try {
         this.field2810 = arg2;
         this.field2811 = arg3;
         int var5 = -1 + this.field2810.method5008(-1);
         this.field2810.method4998((byte)-82, var5);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2817[2] + (arg0 != null ? field2817[3] : field2817[1]) + ',' + arg1 + ',' + (arg2 != null ? field2817[3] : field2817[1]) + ',' + (arg3 != null ? field2817[3] : field2817[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1650(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1651(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
