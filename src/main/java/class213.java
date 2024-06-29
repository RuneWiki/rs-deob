import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class class213 extends class500 {
   @OriginalMember(
      owner = "client!fq",
      name = "y",
      descriptor = "[Lfq;"
   )
   public class213[] field2653;
   @OriginalMember(
      owner = "client!fq",
      name = "v",
      descriptor = "Z"
   )
   public boolean field2645;
   @OriginalMember(
      owner = "client!fq",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2658 = new String[]{method1623(method1622("R)u;\u0019\u001c")), method1623(method1622("R)u1p")), method1623(method1622("R)uF1Z1/Dp")), method1623(method1622("R)u5p")), method1623(method1622("R)u(p")), method1623(method1622("R)u=p")), method1623(method1622("Z-7\u0016")), method1623(method1622("OvuT%")), method1623(method1622("R)u3\u0019\u001c")), method1623(method1622("R)u2\u0019\u001c")), method1623(method1622("R)u=\u0019\u001c")), method1623(method1622("R)u;p")), method1623(method1622("`02\tx[(>\b9@14\u0014xP7>\txZ7/Z0U.>Z9\u001454\u00147W0)\u00155Qx4\u000f,D-/")), method1623(method1622("R)u?\u0019\u001c")), method1623(method1622("`02\tx[(>\b9@14\u0014xP7>\txZ7/Z0U.>Z9\u0014;4\u00167A*{\u0015-@(.\u000e")), method1623(method1622("R)u0p")), method1623(method1622("R)u.p")), method1623(method1622("R)u<\u0019\u001c"))};
   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field2646 = new String[][]{{method1623(method1622("yi")), method1623(method1622("yj")), method1623(method1622("gi")), "F"}, {method1623(method1622("yi")), method1623(method1622("yj")), method1623(method1622("yk")), method1623(method1622("gi")), method1623(method1622("gj")), "F"}, {method1623(method1622("yi")), method1623(method1622("yj")), method1623(method1622("yk")), method1623(method1622("yl")), method1623(method1622("gi")), method1623(method1622("gj")), method1623(method1622("gk")), "F"}};
   @OriginalMember(
      owner = "client!fq",
      name = "A",
      descriptor = "Lrb;"
   )
   public static class374 field2642 = new class374();
   @OriginalMember(
      owner = "client!fq",
      name = "m",
      descriptor = "I"
   )
   public static int field2638;
   @OriginalMember(
      owner = "client!fq",
      name = "k",
      descriptor = "I"
   )
   public static int field2639;
   @OriginalMember(
      owner = "client!fq",
      name = "s",
      descriptor = "I"
   )
   public static int field2640;
   @OriginalMember(
      owner = "client!fq",
      name = "t",
      descriptor = "I"
   )
   public static int field2641;
   @OriginalMember(
      owner = "client!fq",
      name = "l",
      descriptor = "I"
   )
   public int field2643;
   @OriginalMember(
      owner = "client!fq",
      name = "p",
      descriptor = "I"
   )
   public static int field2647;
   @OriginalMember(
      owner = "client!fq",
      name = "o",
      descriptor = "I"
   )
   public static int field2648;
   @OriginalMember(
      owner = "client!fq",
      name = "j",
      descriptor = "I"
   )
   public static int field2649;
   @OriginalMember(
      owner = "client!fq",
      name = "C",
      descriptor = "I"
   )
   public static int field2651;
   @OriginalMember(
      owner = "client!fq",
      name = "x",
      descriptor = "I"
   )
   public static int field2652;
   @OriginalMember(
      owner = "client!fq",
      name = "B",
      descriptor = "I"
   )
   public static int field2654;
   @OriginalMember(
      owner = "client!fq",
      name = "w",
      descriptor = "I"
   )
   public static int field2655;
   @OriginalMember(
      owner = "client!fq",
      name = "u",
      descriptor = "I"
   )
   public static int field2656;
   @OriginalMember(
      owner = "client!fq",
      name = "n",
      descriptor = "I"
   )
   public static int field2657;
   @OriginalMember(
      owner = "client!fq",
      name = "q",
      descriptor = "Lsl;"
   )
   public class487 field2644;
   @OriginalMember(
      owner = "client!fq",
      name = "r",
      descriptor = "Lmw;"
   )
   public class521 field2650;

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(ZII)[[I"
   )
   public final int[][] method1615(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field2639;
            if (!this.field2653[arg2].field2645) {
               return this.field2653[arg2].method212(arg1, (byte)95);
            } else {
               int[] var4 = this.field2653[arg2].method215(arg1, 2064866508);
               return new int[][]{var4, var4, var4};
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2658[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "e",
      descriptor = "(I)V"
   )
   public void method1537(int arg0) {
      try {
         if (arg0 >= -57) {
            field2655 = 17;
         }

         ++field2654;
         if (!this.field2645) {
            this.field2644.method3541(-127);
            this.field2644 = null;
         } else {
            this.field2650.method3771(69);
            this.field2650 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2658[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "f",
      descriptor = "(I)V"
   )
   public void method1457(int arg0) {
      try {
         ++field2649;
         if (arg0 != 28274) {
            this.method212(-58, (byte)86);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2658[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field2640;
         int var4 = -109 % ((68 - arg1) / 48);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2658[5] + (arg0 != null ? field2658[7] : field2658[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(I)I"
   )
   public int method1616(int arg0) {
      try {
         ++field2651;
         if (arg0 != -1) {
            this.field2644 = null;
         }

         return -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2658[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(BLjava/awt/Canvas;)V"
   )
   public static final void method1617(byte arg0, Canvas arg1) {
      try {
         ++field2648;
         Dimension var2 = arg1.getSize();
         class316.method2374(var2.height, var2.width, (byte)110);
         if (arg0 > 3) {
            if (~class616.field8588 != -2) {
               class633.field8958.method521(arg1, class192.field2343, class314.field4187);
            } else {
               class633.field8958.method521(arg1, class40.field462, class459.field6289);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2658[17] + arg0 + ',' + (arg1 != null ? field2658[7] : field2658[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(IZ)Lfq;"
   )
   public static final class213 method1618(int arg0, boolean arg1) {
      try {
         ++field2641;
         if (~arg0 != -1) {
            if (~arg0 == -2) {
               return new class235();
            }

            if (arg0 == 2) {
               return new class97();
            }

            if (arg0 == 3) {
               return new class215();
            }

            if (~arg0 == -5) {
               return new class472();
            }

            if (~arg0 == -6) {
               return new class188();
            }

            if (arg0 == 6) {
               return new class387();
            }

            if (arg0 == 7) {
               return new class248();
            }

            if (~arg0 == -9) {
               return new class597();
            }

            if (arg0 == 9) {
               return new class134();
            }

            if (~arg0 == -11) {
               return new class493();
            }

            if (~arg0 == -12) {
               return new class726();
            }

            if (arg0 == 12) {
               return new class306();
            }

            if (arg0 == 13) {
               return new class275();
            }

            if (~arg0 == -15) {
               return new class676();
            }

            if (~arg0 == -16) {
               return new class345();
            }

            if (~arg0 == -17) {
               return new class637();
            }

            if (~arg0 == -18) {
               return new class593();
            }

            if (~arg0 == -19) {
               return new class700();
            }

            if (arg0 == 19) {
               return new class542();
            }

            if (arg0 == 20) {
               return new class358();
            }

            if (arg0 == 21) {
               return new class25();
            }

            if (arg0 == 22) {
               return new class232();
            }

            if (arg0 == 23) {
               return new class37();
            }

            if (arg0 == 24) {
               return new class576();
            }

            if (~arg0 == -26) {
               return new class379();
            }

            if (~arg0 == -27) {
               return new class484();
            }

            if (~arg0 == -28) {
               return new class685();
            }

            if (~arg0 == -29) {
               return new class479();
            }

            if (~arg0 == -30) {
               return new class742();
            }

            if (arg0 == 30) {
               return new class661();
            }

            if (~arg0 == -32) {
               return new class795();
            }

            if (arg0 == 32) {
               return new class193();
            }

            if (arg0 == 33) {
               return new class123();
            }

            if (~arg0 == -35) {
               return new class276();
            }

            if (arg0 == 35) {
               return new class733();
            }

            if (~arg0 == -37) {
               return new class539();
            }

            if (arg0 == 37) {
               return new class625();
            }

            if (arg0 == 38) {
               return new class415();
            }

            if (~arg0 != -40) {
               if (!arg1) {
                  method1617((byte)78, (Canvas)null);
               }

               return null;
            }

            if (!client.field4273) {
               return new class204();
            }
         }

         return new class128();
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2658[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(BII)[I"
   )
   public final int[] method1619(byte arg0, int arg1, int arg2) {
      try {
         ++field2638;
         if (arg0 <= 25) {
            this.field2650 = null;
         }

         return !this.field2653[arg2].field2645 ? this.field2653[arg2].method212(arg1, (byte)127)[0] : this.field2653[arg2].method215(arg1, 2064866508);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2658[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1620(int arg0) {
      try {
         field2642 = null;
         field2646 = null;
         if (arg0 > -2) {
            method1617((byte)-22, (Canvas)null);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2658[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(II)[I"
   )
   public int[] method215(int arg0, int arg1) {
      try {
         if (arg1 != 2064866508) {
            return null;
         } else {
            ++field2657;
            throw new IllegalStateException(field2658[12]);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2658[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(III)V"
   )
   public void method1621(int arg0, int arg1, int arg2) {
      try {
         label24: {
            ++field2647;
            int var4 = this.field2643 == 255 ? arg0 : this.field2643;
            if (!this.field2645) {
               this.field2644 = new class487(var4, arg0, arg2);
               if (!client.field4273) {
                  break label24;
               }
            }

            this.field2650 = new class521(var4, arg0, arg2);
         }

         if (arg1 != -30173) {
            this.field2653 = null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2658[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(B)I"
   )
   public int method1541(byte arg0) {
      try {
         if (arg0 < 40) {
            this.method1621(104, 27, -87);
         }

         ++field2656;
         return -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2658[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public int[][] method212(int arg0, byte arg1) {
      try {
         if (arg1 <= 26) {
            this.field2645 = true;
         }

         ++field2652;
         throw new IllegalStateException(field2658[14]);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2658[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "<init>",
      descriptor = "(IZ)V"
   )
   public class213(int arg0, boolean arg1) {
      try {
         this.field2653 = new class213[arg0];
         this.field2645 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2658[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1622(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1623(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
