import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class762 extends class557 {
   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10880 = new String[]{method5505(method5504("[5m\u0005m")), method5505(method5504("[5m\bm")), method5505(method5504("[5m\nm")), method5505(method5504("[5m\u000bm")), method5505(method5504("[5m\u000fm")), method5505(method5504("@./!")), method5505(method5504("Uumc8")), method5505(method5504("[5m\u0004m")), method5505(method5504("[5m\fm")), method5505(method5504("[5m\u000em")), method5505(method5504("[5m\tm")), method5505(method5504("[5m\u0007m"))};
   @OriginalMember(
      owner = "client!un",
      name = "t",
      descriptor = "Lhha;"
   )
   public static class724 field10869 = new class724(29, 4);
   @OriginalMember(
      owner = "client!un",
      name = "h",
      descriptor = "I"
   )
   public static int field10870;
   @OriginalMember(
      owner = "client!un",
      name = "m",
      descriptor = "I"
   )
   public static int field10871;
   @OriginalMember(
      owner = "client!un",
      name = "i",
      descriptor = "I"
   )
   public static int field10872;
   @OriginalMember(
      owner = "client!un",
      name = "p",
      descriptor = "I"
   )
   public static int field10873;
   @OriginalMember(
      owner = "client!un",
      name = "q",
      descriptor = "I"
   )
   public static int field10874;
   @OriginalMember(
      owner = "client!un",
      name = "k",
      descriptor = "I"
   )
   public static int field10875;
   @OriginalMember(
      owner = "client!un",
      name = "s",
      descriptor = "I"
   )
   public static int field10876;
   @OriginalMember(
      owner = "client!un",
      name = "l",
      descriptor = "I"
   )
   public static int field10877;
   @OriginalMember(
      owner = "client!un",
      name = "n",
      descriptor = "I"
   )
   public static int field10878;
   @OriginalMember(
      owner = "client!un",
      name = "j",
      descriptor = "I"
   )
   public static int field10879;
   @OriginalMember(
      owner = "client!un",
      name = "r",
      descriptor = "Lsh;"
   )
   public static class207 field10868;
   @OriginalMember(
      owner = "client!un",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field10867;

   @OriginalMember(
      owner = "client!un",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class762(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field10878;
         if (!arg1) {
            field10879 = 101;
         }

         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10880[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            this.method5500(-92);
         }

         ++field10874;
         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10880[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5498(int arg0) {
      try {
         if (arg0 > -102) {
            field10879 = -49;
         }

         class312.field4675 = null;
         ++field10871;
         class11.field180 = -1;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10880[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(IIIIIIZ)V"
   )
   public static final void method5499(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      boolean var7 = client.field10022;

      try {
         ++field10872;
         if (!arg6) {
            class343[] var8 = class645.field9076;
            int var9 = 0;
            if (var7 || ~var9 > ~var8.length) {
               do {
                  class343 var10 = var8[var9];
                  if (var10 != null) {
                     if (var10.field5050 != 2 && !var7) {
                        ++var9;
                     } else {
                        class747.method5376(var10.field5055 * 2, arg3, var10.field5056, arg5 >> 1, arg0 >> 1, (byte)116, arg2, var10.field5049, var10.field5053);
                        if (~class674.field9452[0] < 0 && class51.field770 % 20 < 10) {
                           class148 var11 = class347.field5110[var10.field5051];
                           int var12 = class674.field9452[0] + arg4 + -12;
                           int var13 = class674.field9452[1] + -28 + arg1;
                           var11.method1451(var12, var13);
                           class515.method3870(var13, var11.method1351() + var12, (byte)-50, var13 - -var11.method1356(), var12);
                        }

                        ++var9;
                     }
                  } else {
                     ++var9;
                  }
               } while(~var9 > ~var8.length);

            }
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field10880[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            field10869 = null;
         }

         ++field10870;
         if (super.field7906.method4710(54)) {
            return 3;
         } else if (super.field7906.method4715((byte)-107) == class648.field9162) {
            if (~arg1 == -1) {
               if (~super.field7906.field9117.method3836(arg0 + -127) == -2) {
                  return 2;
               }

               if (~super.field7906.field9138.method2740(-106) == -2) {
                  return 2;
               }

               if (super.field7906.field9149.method5014(-69) > 0) {
                  return 2;
               }
            }

            return 1;
         } else {
            return 3;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10880[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method5500(int arg0) {
      try {
         ++field10877;
         if (arg0 >= -52) {
            field10879 = 81;
         }

         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10880[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class762(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(IILkn;)V"
   )
   public static final void method5501(int arg0, int arg1, class437 arg2) {
      try {
         if (arg1 == -17527) {
            ++field10875;
            if (class451.field6572) {
               arg0 = 0;
               class451.field6572 = false;
            }

            if (class744.field10582 == null || !class744.field10582.method3397(arg2, arg1 + 40107)) {
               class744.field10582 = arg2;
               class705.field10149 = class604.method4452(-124);
               class140.field2242 = arg0;
               class212.field3025 = arg0;
               if (~class212.field3025 != -1) {
                  class696.field10050 = class572.field8102;
                  class417.field6110 = class236.field3656;
                  class201.field2881 = class413.field6064;
                  class192.field2800 = class218.field3126;
                  class557.field7903 = class405.field5959;
                  class405.field5958 = class244.field3751;
                  class382.field5575 = class31.field441;
                  class693.field9997 = class279.field4230;
                  class664.field9364 = class69.field1001;
                  class609.field8676 = class566.field8039;
                  class138.field2215 = class606.field8652;
                  if (class606.field8652 != null) {
                     if (class606.field8652.method5573(arg1 ^ -22783)) {
                        class138.field2215 = class606.field8652.method5571(0);
                        class606.field8652 = class138.field2215;
                     }

                     if (class606.field8652 != null && class606.field8652 != class744.field10582.field6411) {
                        class606.field8652.method5566(class744.field10582.field6411, arg1 ^ -32572);
                        return;
                     }
                  }
               } else {
                  class801.method5773(1);
               }
            }

         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10880[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10880[6] : field10880[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         label30: {
            if (super.field7906.method4715((byte)-107) != class648.field9162) {
               super.field7905 = 1;
               if (!client.field10022) {
                  break label30;
               }
            }

            if (super.field7906.method4710(-120)) {
               super.field7905 = 0;
            }
         }

         if (arg0 != -22) {
            field10867 = null;
         }

         ++field10876;
         if (super.field7905 != 0 && ~super.field7905 != -2) {
            super.field7905 = this.method97(arg0 + 22);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10880[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method5502(int arg0) {
      try {
         int var1 = 29 / ((-62 - arg0) / 62);
         field10868 = null;
         field10867 = null;
         field10869 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10880[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method5503(byte arg0) {
      try {
         if (arg0 != 108) {
            field10868 = null;
         }

         ++field10873;
         if (super.field7906.method4710(100)) {
            return false;
         } else {
            return super.field7906.method4715((byte)-107) == class648.field9162;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10880[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5504(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5505(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
