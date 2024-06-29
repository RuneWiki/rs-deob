import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class531 {
   @OriginalMember(
      owner = "client!ek",
      name = "t",
      descriptor = "F"
   )
   public float field7724;
   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "F"
   )
   public float field7735;
   @OriginalMember(
      owner = "client!ek",
      name = "j",
      descriptor = "F"
   )
   public float field7741;
   @OriginalMember(
      owner = "client!ek",
      name = "g",
      descriptor = "I"
   )
   public int field7730;
   @OriginalMember(
      owner = "client!ek",
      name = "p",
      descriptor = "F"
   )
   public float field7737;
   @OriginalMember(
      owner = "client!ek",
      name = "i",
      descriptor = "Lpa;"
   )
   public class386 field7734;
   @OriginalMember(
      owner = "client!ek",
      name = "r",
      descriptor = "I"
   )
   public int field7740;
   @OriginalMember(
      owner = "client!ek",
      name = "v",
      descriptor = "I"
   )
   public int field7733;
   @OriginalMember(
      owner = "client!ek",
      name = "e",
      descriptor = "I"
   )
   public int field7731;
   @OriginalMember(
      owner = "client!ek",
      name = "o",
      descriptor = "F"
   )
   public float field7726;
   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "F"
   )
   public float field7729;
   @OriginalMember(
      owner = "client!ek",
      name = "q",
      descriptor = "I"
   )
   public int field7725;
   @OriginalMember(
      owner = "client!ek",
      name = "l",
      descriptor = "I"
   )
   public int field7739;
   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7745 = new String[]{method3983(method3982("\u0010`\u0003y\\")), method3983(method3982("\u000e%\u0003\u0012\t")), method3983(method3982("\u0010`\u0003x\\")), method3983(method3982("\u001b~AP")), method3983(method3982("\u0010`\u0003}\\")), method3983(method3982("\u0010`\u0003\u007f\\")), method3983(method3982("\u0010`\u0003z\\")), method3983(method3982("\u0010`\u0003\u0000\u001d\u001bbY\u0002\\")), method3983(method3982("\u0010`\u0003{\\")), method3983(method3982("\u0010`\u0003~\\"))};
   @OriginalMember(
      owner = "client!ek",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field7728 = new int[14];
   @OriginalMember(
      owner = "client!ek",
      name = "m",
      descriptor = "I"
   )
   public static int field7738 = 0;
   @OriginalMember(
      owner = "client!ek",
      name = "c",
      descriptor = "Luw;"
   )
   public static class435 field7743 = new class435(37, 3);
   @OriginalMember(
      owner = "client!ek",
      name = "f",
      descriptor = "I"
   )
   public static int field7723;
   @OriginalMember(
      owner = "client!ek",
      name = "h",
      descriptor = "I"
   )
   public static int field7727;
   @OriginalMember(
      owner = "client!ek",
      name = "d",
      descriptor = "I"
   )
   public static int field7732;
   @OriginalMember(
      owner = "client!ek",
      name = "s",
      descriptor = "I"
   )
   public static int field7736;
   @OriginalMember(
      owner = "client!ek",
      name = "n",
      descriptor = "I"
   )
   public static int field7742;
   @OriginalMember(
      owner = "client!ek",
      name = "u",
      descriptor = "I"
   )
   public static int field7744;

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(Luda;I)V"
   )
   public final void method3975(class473 arg0, int arg1) {
      try {
         ++field7742;
         if (arg1 != -22946) {
            this.field7737 = 2.1722183F;
         }

         this.field7724 = (float)(arg0.method3564((byte)-78) * 8) / 255.0F;
         this.field7741 = (float)(8 * arg0.method3564((byte)-67)) / 255.0F;
         this.field7735 = (float)(8 * arg0.method3564((byte)-54)) / 255.0F;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7745[2] + (arg0 != null ? field7745[1] : field7745[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public static final void method3976(int arg0, int arg1, boolean arg2) {
      try {
         ++field7732;
         class536 var3 = class108.method1038((long)arg0, 63, 6);
         var3.method4017(24076);
         var3.field7800 = arg1;
         if (arg2) {
            field7743 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7745[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(ILek;)Z"
   )
   public final boolean method3977(int arg0, class531 arg1) {
      try {
         if (arg0 != 26154) {
            this.method3975((class473)null, -108);
         }

         ++field7723;
         return ~this.field7731 == ~arg1.field7731 && this.field7737 == arg1.field7737 && this.field7729 == arg1.field7729 && this.field7726 == arg1.field7726 && this.field7741 == arg1.field7741 && this.field7724 == arg1.field7724 && this.field7735 == arg1.field7735 && ~this.field7740 == ~arg1.field7740 && this.field7725 == arg1.field7725 && this.field7734 == arg1.field7734;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7745[9] + arg0 + ',' + (arg1 != null ? field7745[1] : field7745[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(Lhw;I)V"
   )
   public static final void method3978(class141 arg0, int arg1) {
      try {
         ++field7727;
         if (arg1 != 1) {
            field7738 = 0;
         }

         class465.field6802 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7745[8] + (arg0 != null ? field7745[1] : field7745[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method3979(byte arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         if (class443.field6462 == null) {
            class443.field6462 = new byte[4][class209.field3112][class1.field3];
         }

         ++field7736;
         int var3 = arg1;
         if (var2 || arg1 < 4) {
            do {
               int var4 = 0;
               if (var2 || ~var4 > ~class209.field3112) {
                  do {
                     int var5 = 0;
                     if (var2) {
                        class443.field6462[var3][var4][var5] = arg0;
                        ++var5;
                     }

                     while(true) {
                        while(~var5 > ~class1.field3) {
                           class443.field6462[var3][var4][var5] = arg0;
                           ++var5;
                        }

                        if (!var2) {
                           ++var4;
                           break;
                        }

                        ++var5;
                     }
                  } while(~var4 > ~class209.field3112);
               }

               ++var3;
            } while(var3 < 4);

         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7745[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3980(int arg0) {
      try {
         field7728 = null;
         if (arg0 != 8) {
            method3979((byte)-81, 33);
         }

         field7743 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7745[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public static final boolean method3981(String arg0, int arg1) {
      try {
         ++field7744;
         if (arg1 != 10) {
            field7738 = 99;
         }

         return class312.method2426(false, 10, arg0, true);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7745[5] + (arg0 != null ? field7745[1] : field7745[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "<init>",
      descriptor = "()V"
   )
   public class531() {
      this.field7724 = 1.0F;
      this.field7735 = 1.0F;
      this.field7741 = 0.25F;

      try {
         this.field7730 = -50;
         this.field7737 = 1.1523438F;
         this.field7734 = class191.field2892;
         this.field7740 = class127.field2131;
         this.field7733 = -50;
         this.field7731 = class306.field4424;
         this.field7726 = 1.2F;
         this.field7729 = 0.69921875F;
         this.field7725 = 0;
         this.field7739 = -60;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7745[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "<init>",
      descriptor = "(Luda;)V"
   )
   public class531(class473 arg0) {
      boolean var2 = client.field4564;
      super();
      this.field7724 = 1.0F;
      this.field7735 = 1.0F;
      this.field7741 = 0.25F;

      try {
         int var3;
         label114: {
            var3 = arg0.method3564((byte)-45);
            if (~class510.field7454.field11139.method5300(false) == -2 && ~class625.field9095.method329() < -1) {
               label105: {
                  if ((1 & var3) == 0) {
                     this.field7731 = class306.field4424;
                     if (!var2) {
                        break label105;
                     }
                  }

                  this.field7731 = arg0.method3567(31871);
               }

               label100: {
                  if ((var3 & 2) != 0) {
                     this.field7737 = (float)arg0.method3565(true) / 256.0F;
                     if (!var2) {
                        break label100;
                     }
                  }

                  this.field7737 = 1.1523438F;
               }

               label95: {
                  if (~(4 & var3) == -1) {
                     this.field7729 = 0.69921875F;
                     if (!var2) {
                        break label95;
                     }
                  }

                  this.field7729 = (float)arg0.method3565(true) / 256.0F;
               }

               if (~(var3 & 8) != -1) {
                  this.field7726 = (float)arg0.method3565(true) / 256.0F;
                  if (!var2) {
                     break label114;
                  }
               }

               this.field7726 = 1.2F;
               if (!var2) {
                  break label114;
               }
            }

            if ((var3 & 1) != 0) {
               arg0.method3567(31871);
            }

            if ((var3 & 2) != 0) {
               arg0.method3565(true);
            }

            if (~(var3 & 4) != -1) {
               arg0.method3565(true);
            }

            if ((8 & var3) != 0) {
               arg0.method3565(true);
            }

            this.field7731 = class306.field4424;
            this.field7737 = 1.1523438F;
            this.field7729 = 0.69921875F;
            this.field7726 = 1.2F;
         }

         label85: {
            if ((16 & var3) == 0) {
               this.field7739 = -60;
               this.field7733 = -50;
               this.field7730 = -50;
               if (!var2) {
                  break label85;
               }
            }

            this.field7733 = arg0.method3538(-128);
            this.field7739 = arg0.method3538(-128);
            this.field7730 = arg0.method3538(-128);
         }

         label80: {
            if ((32 & var3) != 0) {
               this.field7740 = arg0.method3567(31871);
               if (!var2) {
                  break label80;
               }
            }

            this.field7740 = class127.field2131;
         }

         label75: {
            if ((64 & var3) != 0) {
               this.field7725 = arg0.method3565(true);
               if (!var2) {
                  break label75;
               }
            }

            this.field7725 = 0;
         }

         if ((var3 & 128) == 0) {
            this.field7734 = class191.field2892;
         } else {
            int var4 = arg0.method3565(true);
            int var5 = arg0.method3565(true);
            int var6 = arg0.method3565(true);
            int var7 = arg0.method3565(true);
            int var8 = arg0.method3565(true);
            int var9 = arg0.method3565(true);
            this.field7734 = class346.method2675(var9, var4, var6, (byte)-68, var5, var7, var8);
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field7745[7] + (arg0 != null ? field7745[1] : field7745[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3982(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3983(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
