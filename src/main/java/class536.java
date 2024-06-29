import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class536 {
   @OriginalMember(
      owner = "client!od",
      name = "r",
      descriptor = "Lmaa;"
   )
   public class500 field7319 = new class500();
   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7337 = new String[]{method3871(method3870("7}\u000b\u000f")), method3871(method3870("6lI*\u0018")), method3871(method3870("\"&IMM")), method3871(method3870("6lI'\u0018")), method3871(method3870("6lI_Y7a\u0013]\u0018")), method3871(method3870("6lI%\u0018")), method3871(method3870("6lI.\u0018")), method3871(method3870("6lI,\u0018")), method3871(method3870("6lI!\u0018")), method3871(method3870("6lI(\u0018")), method3871(method3870("6lI&\u0018")), method3871(method3870("6lI\"\u0018")), method3871(method3870("6lI$\u0018")), method3871(method3870("6lI)\u0018")), method3871(method3870("6lI+\u0018")), method3871(method3870("6lI \u0018")), method3871(method3870("6lI/\u0018")), method3871(method3870("6lI-\u0018"))};
   @OriginalMember(
      owner = "client!od",
      name = "p",
      descriptor = "I"
   )
   public static int field7320;
   @OriginalMember(
      owner = "client!od",
      name = "e",
      descriptor = "I"
   )
   public static int field7321;
   @OriginalMember(
      owner = "client!od",
      name = "o",
      descriptor = "I"
   )
   public static int field7322;
   @OriginalMember(
      owner = "client!od",
      name = "l",
      descriptor = "I"
   )
   public static int field7323;
   @OriginalMember(
      owner = "client!od",
      name = "i",
      descriptor = "I"
   )
   public static int field7324;
   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "I"
   )
   public static int field7325;
   @OriginalMember(
      owner = "client!od",
      name = "d",
      descriptor = "I"
   )
   public static int field7326;
   @OriginalMember(
      owner = "client!od",
      name = "h",
      descriptor = "I"
   )
   public static int field7327;
   @OriginalMember(
      owner = "client!od",
      name = "g",
      descriptor = "I"
   )
   public static int field7328;
   @OriginalMember(
      owner = "client!od",
      name = "j",
      descriptor = "I"
   )
   public static int field7329;
   @OriginalMember(
      owner = "client!od",
      name = "k",
      descriptor = "I"
   )
   public static int field7330;
   @OriginalMember(
      owner = "client!od",
      name = "f",
      descriptor = "I"
   )
   public static int field7331;
   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "I"
   )
   public static int field7332;
   @OriginalMember(
      owner = "client!od",
      name = "q",
      descriptor = "I"
   )
   public static int field7333;
   @OriginalMember(
      owner = "client!od",
      name = "n",
      descriptor = "I"
   )
   public static int field7335;
   @OriginalMember(
      owner = "client!od",
      name = "m",
      descriptor = "I"
   )
   public static int field7336;
   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "Lmaa;"
   )
   private class500 field7334;

   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "(I)Lmaa;"
   )
   public final class500 method3855(int arg0) {
      try {
         ++field7326;
         class500 var2 = this.field7319.field6867;
         int var3 = -24 / ((arg0 - 53) / 60);
         if (this.field7319 == var2) {
            this.field7334 = null;
            return null;
         } else {
            this.field7334 = var2.field6867;
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7337[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Lmaa;Lod;I)V"
   )
   private final void method3856(class500 arg0, class536 arg1, int arg2) {
      try {
         ++field7327;
         class500 var4 = this.field7319.field6863;
         if (arg2 != 1) {
            field7332 = -124;
         }

         this.field7319.field6863 = arg0.field6863;
         arg0.field6863.field6867 = this.field7319;
         if (this.field7319 != arg0) {
            arg0.field6863 = arg1.field7319.field6863;
            arg0.field6863.field6867 = arg0;
            var4.field6867 = arg1.field7319;
            arg1.field7319.field6863 = var4;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7337[15] + (arg0 != null ? field7337[2] : field7337[0]) + ',' + (arg1 != null ? field7337[2] : field7337[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3857(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field7324;
         int var3 = 0;
         class500 var4 = this.field7319.field6867;
         if (arg0 <= 112) {
            this.method3865((byte)118);
            if (var2) {
               ++var3;
               var4 = var4.field6867;
            }
         }

         while(true) {
            if (this.field7319 == var4) {
               if (!var2) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field6867;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7337[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method3858(byte arg0) {
      try {
         ++field7322;
         if (arg0 != -63) {
            this.method3858((byte)-115);
         }

         return this.field7319.field6867 == this.field7319;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7337[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(ILmaa;)V"
   )
   public final void method3859(int arg0, class500 arg1) {
      try {
         if (arg1.field6863 != null) {
            arg1.method3609(116);
         }

         if (arg0 != 2) {
            this.method3865((byte)-81);
         }

         ++field7328;
         arg1.field6867 = this.field7319;
         arg1.field6863 = this.field7319.field6863;
         arg1.field6863.field6867 = arg1;
         arg1.field6867.field6863 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7337[6] + arg0 + ',' + (arg1 != null ? field7337[2] : field7337[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(BLjava/lang/String;)V"
   )
   public static final void method3860(byte arg0, String arg1) {
      try {
         ++field7330;
         class471 var2 = class311.method2331(-26);
         var2.field6527.method4318(class553.field7619.field3850, 0);
         var2.field6527.method4284(0, -31429);
         int var3 = var2.field6527.field8243;
         var2.field6527.method4284(654, -31429);
         int[] var4 = class31.method254(4, var2);
         int var5 = var2.field6527.field8243;
         var2.field6527.method4332((byte)-96, arg1);
         var2.field6527.method4318(class494.field6787, 0);
         if (arg0 > -43) {
            method3860((byte)48, (String)null);
         }

         var2.field6527.field8243 += 7;
         var2.field6527.method4329(var2.field6527.field8243, -12467, var4, var5);
         var2.field6527.method4313(56136136, var2.field6527.field8243 - var3);
         class605.field8473.method1702((byte)-51, var2);
         class546.field7447 = 0;
         class291.field3840 = 0;
         class489.field6746 = -3;
         class617.field8606 = 1;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7337[8] + arg0 + ',' + (arg1 != null ? field7337[2] : field7337[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3861(int arg0) {
      boolean var2 = client.field4273;

      try {
         while(true) {
            class500 var3 = this.field7319.field6867;
            if (this.field7319 != var3) {
               var3.method3609(121);
               if (var2) {
                  break;
               }

               if (!var2) {
                  continue;
               }
            }

            ++field7333;
            break;
         }

         if (arg0 <= 68) {
            field7332 = 36;
         }

         this.field7334 = null;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7337[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Lod;Z)V"
   )
   public final void method3862(class536 arg0, boolean arg1) {
      try {
         this.method3856(this.field7319.field6867, arg0, 1);
         if (!arg1) {
            field7332 = -113;
         }

         ++field7329;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7337[11] + (arg0 != null ? field7337[2] : field7337[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "d",
      descriptor = "(B)Lmaa;"
   )
   public final class500 method3863(byte arg0) {
      try {
         if (arg0 < 65) {
            this.field7319 = null;
         }

         ++field7323;
         class500 var2 = this.field7319.field6863;
         if (this.field7319 == var2) {
            this.field7334 = null;
            return null;
         } else {
            this.field7334 = var2.field6863;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7337[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(IIIII)I"
   )
   public static final int method3864(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field7335;
         int var5 = arg0 & 15;
         if (arg3 != 7) {
            return -18;
         } else {
            int var6 = ~var5 > -9 ? arg4 : arg1;
            int var7 = ~var5 <= -5 ? (~var5 != -13 && var5 != 14 ? arg2 : arg4) : arg1;
            return (~(var5 & 1) == -1 ? var6 : -var6) + (~(var5 & 2) != -1 ? -var7 : var7);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field7337[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "f",
      descriptor = "(B)Lmaa;"
   )
   public final class500 method3865(byte arg0) {
      try {
         if (arg0 <= 124) {
            this.method3866((byte)-27);
         }

         ++field7320;
         class500 var2 = this.field7334;
         if (this.field7319 == var2) {
            this.field7334 = null;
            return null;
         } else {
            this.field7334 = var2.field6863;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7337[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "(B)Lmaa;"
   )
   public final class500 method3866(byte arg0) {
      try {
         ++field7336;
         if (arg0 < 109) {
            return null;
         } else {
            class500 var2 = this.field7334;
            if (this.field7319 == var2) {
               this.field7334 = null;
               return null;
            } else {
               this.field7334 = var2.field6867;
               return var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7337[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Lmaa;I)V"
   )
   public final void method3867(class500 arg0, int arg1) {
      try {
         if (arg0.field6863 != null) {
            arg0.method3609(104);
         }

         ++field7325;
         arg0.field6863 = this.field7319;
         arg0.field6867 = this.field7319.field6867;
         arg0.field6863.field6867 = arg0;
         int var3 = 36 / ((arg1 - 78) / 46);
         arg0.field6867.field6863 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7337[1] + (arg0 != null ? field7337[2] : field7337[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method3868(byte arg0) {
      boolean var1 = client.field4273;

      try {
         byte var3;
         label40: {
            ++field7321;
            if (~class155.field2005 <= -97) {
               int var2 = class249.method1875(arg0 ^ 7);
               if (var2 <= 100) {
                  class135.method1133(1);
                  var3 = 4;
                  if (!var1) {
                     break label40;
                  }
               }

               if (var2 <= 500) {
                  class26.method222(1);
                  var3 = 3;
                  if (!var1) {
                     break label40;
                  }
               }

               if (var2 <= 1000) {
                  class428.method3214(0);
                  var3 = 2;
                  if (!var1) {
                     break label40;
                  }
               }

               class401.method3035(true, (byte)85);
               var3 = 1;
               if (!var1) {
                  break label40;
               }
            }

            var3 = 1;
            class401.method3035(true, (byte)67);
         }

         if (class674.field9907.field8451.method2770((byte)-83) != 0) {
            class674.field9907.method4407(class674.field9907.field8420, -2160, 0);
            class594.method4335(false, Integer.MAX_VALUE, 0);
         }

         if (arg0 != -30) {
            return -128;
         } else {
            class647.method4661((byte)-26);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7337[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "e",
      descriptor = "(B)Lmaa;"
   )
   public final class500 method3869(byte arg0) {
      try {
         if (arg0 < 39) {
            this.method3863((byte)-72);
         }

         ++field7331;
         class500 var2 = this.field7319.field6867;
         if (this.field7319 == var2) {
            return null;
         } else {
            var2.method3609(103);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7337[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "<init>",
      descriptor = "()V"
   )
   public class536() {
      try {
         this.field7319.field6863 = this.field7319;
         this.field7319.field6867 = this.field7319;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7337[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3870(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 48);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3871(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 48;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
