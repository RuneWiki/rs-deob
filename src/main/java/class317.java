import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class317 implements class191 {
   @OriginalMember(
      owner = "client!caa",
      name = "c",
      descriptor = "I"
   )
   public int field4536;
   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4541 = new String[]{method2415(method2414("-wI8\u0015f")), method2415(method2414("-wI8\u0012f")), method2415(method2414("-wI8\u0017f")), method2415(method2414("-wI8\u0010f")), method2415(method2414(" cDz")), method2415(method2414("-wI8\u0013f")), method2415(method2414("58\u00068+")), method2415(method2414("-wI8j'xAbhf")), method2415(method2414("-wI8\u0014f"))};
   @OriginalMember(
      owner = "client!caa",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field4535 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!caa",
      name = "h",
      descriptor = "F"
   )
   public static float field4533 = 1024.0F;
   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "I"
   )
   public static int field4534;
   @OriginalMember(
      owner = "client!caa",
      name = "g",
      descriptor = "I"
   )
   public static int field4537;
   @OriginalMember(
      owner = "client!caa",
      name = "e",
      descriptor = "I"
   )
   public static int field4538;
   @OriginalMember(
      owner = "client!caa",
      name = "f",
      descriptor = "I"
   )
   public static int field4539;
   @OriginalMember(
      owner = "client!caa",
      name = "b",
      descriptor = "I"
   )
   public static int field4540;

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(Liaa;B)V"
   )
   public static final void method2409(class520 arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         int var3 = 0;
         if (arg1 == 8) {
            while(true) {
               int var10000;
               if (var3 >= class276.field3852) {
                  var10000 = field4534 + 1;
                  if (var2 == 0) {
                     field4534 = var10000;
                     return;
                  }
               } else {
                  var10000 = class356.field5401[var3];
               }

               int var4 = var10000;
               class687 var5 = class661.field9578[var4];
               int var6 = arg0.method1104(255);
               if (~(var6 & 2) != -1) {
                  var6 += arg0.method1104(255) << 8;
               }

               if (~(var6 & 2048) != -1) {
                  var6 += arg0.method1104(255) << 16;
               }

               class264.method2007(arg0, var4, 124, var5, var6);
               ++var3;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field4541[5] + (arg0 != null ? field4541[6] : field4541[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2410(byte arg0) {
      try {
         int var1 = -109 % ((arg0 - 5) / 41);
         field4535 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4541[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(I)Loi;"
   )
   public final class79 method1311(int arg0) {
      try {
         ++field4539;
         if (arg0 > -106) {
            field4535 = null;
         }

         return class688.field10363;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4541[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method2411(int arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field4540;
         int var3 = 101 % ((arg1 - 56) / 38);
         if (class672.field10112 != arg0) {
            if (arg0 == 13) {
               class54.method426((byte)21);
            }

            if (~arg0 != -14 && class33.field363 != null) {
               class33.field363.method812(2035738378);
               class33.field363 = null;
            }

            if (~arg0 == -4) {
               class247.method1851((byte)-44, class22.field236 != class198.field2452);
            }

            if (~arg0 == -8) {
               class193.method1484(8, ~class314.field4492 != ~class198.field2452);
            }

            label129: {
               if (arg0 != 5 && ~arg0 != -13) {
                  if (~arg0 != -7 && arg0 != 9) {
                     break label129;
                  }

                  class54.method426((byte)21);
                  if (var2 == 0) {
                     break label129;
                  }
               }

               class552.method4084((byte)74);
            }

            if (class117.method980(-54, class672.field10112)) {
               class539.field7873.field7651 = 2;
               class276.field3850.field7651 = 2;
               class386.field5912.field7651 = 2;
               class552.field8187.field7651 = 2;
               class261.field3549.field7651 = 2;
               class728.field10821.field7651 = 2;
               class763.field11220.field7651 = 2;
            }

            if (class117.method980(-96, arg0)) {
               class69.field873 = 0;
               class573.field8529 = 0;
               class767.field11252 = 0;
               class574.field8549 = 1;
               class787.field11449 = 1;
               class372.method2891(0, true);
               class539.field7873.field7651 = 1;
               class276.field3850.field7651 = 1;
               class386.field5912.field7651 = 1;
               class552.field8187.field7651 = 1;
               class261.field3549.field7651 = 1;
               class728.field10821.field7651 = 1;
               class763.field11220.field7651 = 1;
            }

            if (arg0 == 11 || arg0 == 3) {
               class71.method709(-44);
            }

            boolean var4 = ~arg0 == -3 || class766.method5543((byte)-92, arg0) || class677.method4944(arg0, 0);
            boolean var5 = class672.field10112 == 2 || class766.method5543((byte)-58, class672.field10112) || class677.method4944(class672.field10112, 0);
            if (var4 != var5) {
               label141: {
                  if (!var4) {
                     class578.method4265(90, 2);
                     class481.field7144.method1925(true, 2);
                     if (var2 == 0) {
                        break label141;
                     }
                  }

                  label94: {
                     class56.field705 = class576.field8559;
                     if (~class261.field3566.field9477.method1271(87) != -1) {
                        class97.method853(2, class382.field5861, class576.field8559, false, -26632, class261.field3566.field9477.method1271(102), 0);
                        class454.method3417((byte)-52);
                        if (var2 == 0) {
                           break label94;
                        }
                     }

                     class578.method4265(56, 2);
                  }

                  class481.field7144.method1925(false, 2);
               }
            }

            if (class117.method980(-123, arg0) || ~arg0 == -14) {
               class786.field11439.method614();
            }

            class672.field10112 = arg0;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4541[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "b",
      descriptor = "(IB)Lce;"
   )
   public static final class324 method2412(int arg0, byte arg1) {
      int var2 = client.field4530;

      try {
         ++field4538;
         if (arg1 > -15) {
            method2411(89, (byte)-121);
         }

         class324[] var3 = class453.method3408(0);
         int var4 = 0;
         if (var2 == 0 && ~var4 <= ~var3.length) {
            return null;
         } else {
            do {
               class324 var5 = var3[var4];
               if (var5.field4610 == arg0) {
                  return var5;
               }

               ++var4;
            } while(~var4 > ~var3.length);

            return null;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field4541[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2413(int arg0, int arg1, int arg2) {
      try {
         ++field4537;
         if (arg1 != -19559) {
            method2409((class520)null, (byte)74);
         }

         return class177.method1399(arg1 ^ -30813, arg0, arg2) | ~(458752 & arg2) != -1 || class368.method2860(arg0, arg2, 20428);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4541[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class317(int arg0) {
      try {
         this.field4536 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4541[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2414(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2415(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
