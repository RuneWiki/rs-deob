import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class727 {
   @OriginalMember(
      owner = "client!sfa",
      name = "g",
      descriptor = "I"
   )
   public int field10649;
   @OriginalMember(
      owner = "client!sfa",
      name = "l",
      descriptor = "Liw;"
   )
   private class335 field10648;
   @OriginalMember(
      owner = "client!sfa",
      name = "j",
      descriptor = "I"
   )
   private int field10645;
   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "I"
   )
   public int field10641;
   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10658 = new String[]{method5294(method5293("w\u001bbvg,")), method5294(method5293("w\u001bbv`,")), method5294(method5293("w\u001bbvd,")), method5294(method5293("w\u001bbv\u001em\u0013j,\u001c,")), method5294(method5293("\u007fS-v_")), method5294(method5293("j\bo4")), method5294(method5293("w\u001bbva,")), method5294(method5293("w\u001bbvf,")), method5294(method5293("w\u001bbvc,")), method5294(method5293("w\u001bbvVk.w*Kj\u001a+"))};
   @OriginalMember(
      owner = "client!sfa",
      name = "o",
      descriptor = "Lsfa;"
   )
   public static class727 field10647 = new class727(0, 3, class335.field4807);
   @OriginalMember(
      owner = "client!sfa",
      name = "d",
      descriptor = "Lsfa;"
   )
   public static class727 field10650 = new class727(1, 3, class335.field4807);
   @OriginalMember(
      owner = "client!sfa",
      name = "n",
      descriptor = "Lsfa;"
   )
   public static class727 field10651 = new class727(2, 4, class335.field4803);
   @OriginalMember(
      owner = "client!sfa",
      name = "k",
      descriptor = "Lsfa;"
   )
   public static class727 field10652 = new class727(3, 1, class335.field4807);
   @OriginalMember(
      owner = "client!sfa",
      name = "m",
      descriptor = "Lsfa;"
   )
   public static class727 field10653 = new class727(4, 2, class335.field4807);
   @OriginalMember(
      owner = "client!sfa",
      name = "r",
      descriptor = "Lsfa;"
   )
   public static class727 field10654 = new class727(5, 3, class335.field4807);
   @OriginalMember(
      owner = "client!sfa",
      name = "h",
      descriptor = "Lsfa;"
   )
   public static class727 field10655 = new class727(6, 4, class335.field4807);
   @OriginalMember(
      owner = "client!sfa",
      name = "q",
      descriptor = "I"
   )
   public static int field10656 = class138.method1155(16, (byte)-122);
   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "I"
   )
   public static int field10657 = 0;
   @OriginalMember(
      owner = "client!sfa",
      name = "f",
      descriptor = "I"
   )
   public static int field10639;
   @OriginalMember(
      owner = "client!sfa",
      name = "e",
      descriptor = "I"
   )
   public static int field10640;
   @OriginalMember(
      owner = "client!sfa",
      name = "s",
      descriptor = "I"
   )
   public static int field10642;
   @OriginalMember(
      owner = "client!sfa",
      name = "i",
      descriptor = "I"
   )
   public static int field10643;
   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "I"
   )
   public static int field10644;
   @OriginalMember(
      owner = "client!sfa",
      name = "p",
      descriptor = "I"
   )
   public static int field10646;

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5287(int arg0, int arg1) {
      try {
         if (arg1 == 18274) {
            ++field10642;
            class446 var2 = class635.method4607(119, (long)arg0, 9);
            var2.method3312(arg1 ^ -18203);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10658[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field10644;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10658[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method5288(int arg0, int arg1) {
      try {
         if (arg0 < 39) {
            method5291(-106, 13, -81);
         }

         ++field10643;
         if (~class674.field9907.field8432.method640((byte)-90) == -1) {
            arg1 = -1;
         }

         if (~class640.field9018 != ~arg1) {
            if (arg1 != -1) {
               label32: {
                  class185 var2 = class694.field10144.method3219(false, arg1);
                  class267 var3 = var2.method1411(0);
                  if (var3 != null) {
                     class61.field671.method1952(var3.method2042(), -27509, var3.method2053(), new Point(var2.field2277, var2.field2278), class204.field2515, var3.method2047());
                     class640.field9018 = arg1;
                     if (!client.field4273) {
                        break label32;
                     }
                  }

                  arg1 = -1;
               }
            }

            if (~arg1 == 0 && ~class640.field9018 != 0) {
               class61.field671.method1952(-1, -27509, (int[])null, new Point(), class204.field2515, -1);
               class640.field9018 = -1;
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10658[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5289(int arg0) {
      try {
         field10652 = null;
         field10653 = null;
         field10650 = null;
         field10654 = null;
         field10655 = null;
         field10651 = null;
         field10647 = null;
         if (arg0 != 595656065) {
            method5288(53, 47);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10658[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(IBI)I"
   )
   public static final int method5290(int arg0, byte arg1, int arg2) {
      try {
         ++field10639;
         if (arg1 <= 53) {
            field10647 = null;
         }

         int var3 = arg2 >>> 31;
         return (arg2 + var3) / arg0 + -var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10658[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method5291(int arg0, int arg1, int arg2) {
      try {
         class192.field2343 = arg1;
         class314.field4187 = arg0;
         if (arg2 == 2) {
            ++field10646;
            if (~class616.field8588 != -1) {
               if (class616.field8588 == 1) {
                  class124.field1540 = class314.field4187 / class182.field2249 + class269.field3479 + 2;
                  class498.field6856 = class192.field2343 / class477.field6599 + 2 + class369.field5198;
                  class40.field462 = class498.field6856 * class477.field6599;
                  class459.field6289 = class182.field2249 * class124.field1540;
                  class167.field2111 = -class192.field2343 + class40.field462 >> 1;
                  class292.field3853 = -class314.field4187 + class459.field6289 >> 1;
                  return;
               }

               if (~class616.field8588 == -3) {
                  class459.field6289 = class314.field4187;
                  class40.field462 = class192.field2343;
                  return;
               }
            } else {
               class40.field462 = class192.field2343 - -(class167.field2111 * 2);
               class459.field6289 = class292.field3853 * 2 + class314.field4187;
            }

         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10658[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "<init>",
      descriptor = "(IILiw;)V"
   )
   private class727(int arg0, int arg1, class335 arg2) {
      try {
         this.field10649 = arg0;
         this.field10648 = arg2;
         this.field10645 = arg1;
         this.field10641 = this.field10648.field4797 * this.field10645;
         if (~this.field10649 <= -17) {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10658[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10658[4] : field10658[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "(II)Lsfa;"
   )
   public static final class727 method5292(int arg0, int arg1) {
      try {
         ++field10640;
         if (arg1 != -13504) {
            field10647 = null;
         }

         if (arg0 != 0) {
            if (arg0 == 1) {
               return field10650;
            }

            if (arg0 == 2) {
               return field10651;
            }

            if (arg0 == 3) {
               return field10652;
            }

            if (arg0 == 4) {
               return field10653;
            }

            if (arg0 == 5) {
               return field10654;
            }

            if (~arg0 != -7) {
               return null;
            }

            if (!client.field4273) {
               return field10655;
            }
         }

         return field10647;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10658[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5293(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5294(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
