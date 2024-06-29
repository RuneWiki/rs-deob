import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class304 {
   @OriginalMember(
      owner = "client!lj",
      name = "v",
      descriptor = "Lsf;"
   )
   private class475 field4753;
   @OriginalMember(
      owner = "client!lj",
      name = "q",
      descriptor = "I"
   )
   private int field4764;
   @OriginalMember(
      owner = "client!lj",
      name = "j",
      descriptor = "I"
   )
   private int field4754;
   @OriginalMember(
      owner = "client!lj",
      name = "i",
      descriptor = "Let;"
   )
   private class389 field4755;
   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4767 = new String[]{method2558(method2557("\f\\\u0002hz")), method2558(method2557("\u000eC@L")), method2558(method2557("\u001b\u0018\u0002\u000e/")), method2558(method2557("\f\\\u0002dz")), method2558(method2557("\f\\\u0002pz")), method2558(method2557("\f\\\u0002oz")), method2558(method2557("\f\\\u0002\u001c;\u000e_X\u001ez")), method2558(method2557("\f\\\u0002cz")), method2558(method2557("\f\\\u0002nz")), method2558(method2557("\u0013\bOS")), method2558(method2557("\f\\\u0002iz")), method2558(method2557("\f\\\u0002jz")), method2558(method2557("\f\\\u0002lz")), method2558(method2557("\f\\\u0002az")), method2558(method2557("\f\\\u0002gz")), method2558(method2557("\f\\\u0002fz")), method2558(method2557("\f\\\u0002bz")), method2558(method2557("\f\\\u0002kz")), method2558(method2557("\f\\\u0002ez")), method2558(method2557("\f\\\u0002mz"))};
   @OriginalMember(
      owner = "client!lj",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field4759 = false;
   @OriginalMember(
      owner = "client!lj",
      name = "t",
      descriptor = "Z"
   )
   public static boolean field4747 = false;
   @OriginalMember(
      owner = "client!lj",
      name = "u",
      descriptor = "I"
   )
   public static int field4744;
   @OriginalMember(
      owner = "client!lj",
      name = "l",
      descriptor = "I"
   )
   public static int field4745;
   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "I"
   )
   public static int field4746;
   @OriginalMember(
      owner = "client!lj",
      name = "h",
      descriptor = "I"
   )
   public static int field4748;
   @OriginalMember(
      owner = "client!lj",
      name = "g",
      descriptor = "I"
   )
   public static int field4749;
   @OriginalMember(
      owner = "client!lj",
      name = "r",
      descriptor = "I"
   )
   public static int field4750;
   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "I"
   )
   public static int field4751;
   @OriginalMember(
      owner = "client!lj",
      name = "k",
      descriptor = "I"
   )
   public static int field4752;
   @OriginalMember(
      owner = "client!lj",
      name = "e",
      descriptor = "I"
   )
   public static int field4756;
   @OriginalMember(
      owner = "client!lj",
      name = "p",
      descriptor = "I"
   )
   public static int field4757;
   @OriginalMember(
      owner = "client!lj",
      name = "s",
      descriptor = "I"
   )
   public static int field4758;
   @OriginalMember(
      owner = "client!lj",
      name = "f",
      descriptor = "I"
   )
   public static int field4760;
   @OriginalMember(
      owner = "client!lj",
      name = "o",
      descriptor = "I"
   )
   public static int field4761;
   @OriginalMember(
      owner = "client!lj",
      name = "c",
      descriptor = "I"
   )
   public static int field4762;
   @OriginalMember(
      owner = "client!lj",
      name = "n",
      descriptor = "I"
   )
   public static int field4763;
   @OriginalMember(
      owner = "client!lj",
      name = "d",
      descriptor = "I"
   )
   public static int field4765;
   @OriginalMember(
      owner = "client!lj",
      name = "w",
      descriptor = "I"
   )
   public static int field4766;

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(BJ)V",
      line = 4
   )
   private final void method2541(byte arg0, long arg1) {
      try {
         ++field4748;
         if (arg0 != -75) {
            this.field4764 = 109;
         }

         class33 var4 = (class33)this.field4755.method3141(arg1, true);
         this.method2548(arg0 ^ -10, var4);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4767[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "<init>",
      descriptor = "(I)V",
      line = 20
   )
   public class304(int arg0) {
      this(arg0, arg0);
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(CI)C",
      line = 24
   )
   public static final char method2542(char arg0, int arg1) {
      try {
         ++field4749;
         if (arg0 == 198) {
            return 'E';
         } else if (arg0 == 230) {
            return 'e';
         } else if (~arg0 == -224) {
            return 's';
         } else if (~arg0 == -339) {
            return 'E';
         } else if (arg0 == 339) {
            return 'e';
         } else {
            if (arg1 != 11843) {
               method2549((byte)42);
            }

            return '\u0000';
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4767[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "(Z)I",
      line = 51
   )
   public final int method2543(boolean arg0) {
      boolean var2 = client.field1786;

      try {
         if (arg0) {
            this.field4754 = 94;
         }

         ++field4745;
         int var3 = 0;
         class33 var4 = (class33)this.field4753.method3688(true);
         if (var2) {
            if (!var4.method245(-101)) {
               ++var3;
            }

            var4 = (class33)this.field4753.method3691(20);
         }

         while(true) {
            int var10000;
            if (var4 == null) {
               var10000 = var3;
               if (!var2) {
                  return var3;
               }
            } else {
               var10000 = var4.method245(-101);
            }

            if (var10000 == 0) {
               ++var3;
            }

            var4 = (class33)this.field4753.method3691(20);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4767[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(ZJ)Ljava/lang/Object;",
      line = 75
   )
   public final Object method2544(boolean arg0, long arg1) {
      try {
         ++field4761;
         class33 var4 = (class33)this.field4755.method3141(arg1, true);
         if (var4 == null) {
            return null;
         } else {
            Object var5 = var4.method244(-1);
            if (arg0) {
               return null;
            } else if (var5 == null) {
               var4.method2477(1976);
               var4.method2495(-24134);
               this.field4764 += var4.field416;
               return null;
            } else {
               if (var4.method245(-36)) {
                  class417 var6 = new class417(var5, var4.field416);
                  this.field4755.method3143(108, var6, var4.field4655);
                  this.field4753.method3693(var6, !arg0);
                  var6.field4684 = 0L;
                  var4.method2477(1976);
                  var4.method2495(-24134);
               } else {
                  this.field4753.method3693(var4, true);
                  var4.field4684 = 0L;
               }

               return var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4767[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(JILjava/lang/Object;)V",
      line = 121
   )
   public final void method2545(long arg0, int arg1, Object arg2) {
      try {
         this.method2556(1, arg0, (byte)84, arg2);
         if (arg1 < 105) {
            field4744 = 4;
         }

         ++field4752;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4767[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4767[2] : field4767[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "c",
      descriptor = "(B)I",
      line = 134
   )
   public final int method2546(byte arg0) {
      try {
         if (arg0 < 115) {
            this.field4754 = 104;
         }

         ++field4746;
         return this.field4754;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4767[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "(I)I",
      line = 146
   )
   public final int method2547(int arg0) {
      try {
         ++field4765;
         if (arg0 != 1) {
            field4744 = 43;
         }

         return this.field4764;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4767[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(ILkj;)V",
      line = 157
   )
   private final void method2548(int arg0, class33 arg1) {
      try {
         if (arg1 != null) {
            arg1.method2477(1976);
            arg1.method2495(-24134);
            this.field4764 += arg1.field416;
         }

         int var3 = 126 / (arg0 / 51);
         ++field4758;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4767[3] + arg0 + ',' + (arg1 != null ? field4767[2] : field4767[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(B)V",
      line = 173
   )
   public static final void method2549(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field4760;
         if (arg0 <= 43) {
            method2542((char)65469, 32);
         }

         label29: {
            if (class351.field5356.method677()) {
               label26: {
                  class351.field5356.method703(class544.field8183);
                  class734.method5405(false);
                  if (class281.field4472) {
                     class640.method4672(1, class544.field8183);
                     if (!var1) {
                        break label26;
                     }
                  }

                  Dimension var2 = class544.field8183.getSize();
                  class351.field5356.method674(class544.field8183, var2.width, var2.height);
               }

               class351.field5356.method579(class544.field8183);
               if (!var1) {
                  break label29;
               }
            }

            class473.method3678(2744, class687.field10213.field507.method3440(480102311), false);
         }

         class204.method1782((byte)7);
         class67.field884 = true;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4767[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(I)Ljava/lang/Object;",
      line = 204
   )
   public final Object method2550(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field4751;
         class33 var3 = (class33)this.field4755.method3139(-56);
         if (arg0 < 40) {
            field4744 = 39;
            if (!var2 && var3 == null) {
               return null;
            }
         } else if (var3 == null) {
            return null;
         }

         Object var4;
         while(true) {
            var4 = var3.method244(-1);
            if (var4 != null) {
               break;
            }

            class33 var5 = var3;
            var3 = (class33)this.field4755.method3147(-21068);
            var5.method2477(1976);
            var5.method2495(-24134);
            this.field4764 += var5.field416;
            if (var2) {
               break;
            }

            if (var3 == null) {
               return null;
            }
         }

         return var4;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4767[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(Z)V",
      line = 238
   )
   public final void method2551(boolean arg0) {
      try {
         if (arg0) {
            this.field4753.method3696(126);
            ++field4750;
            this.field4755.method3149(-71);
            this.field4764 = this.field4754;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4767[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(II)V",
      line = 254
   )
   public final void method2552(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lj",
      name = "c",
      descriptor = "(I)Ljava/lang/Object;",
      line = 309
   )
   public final Object method2553(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field4756;
         class33 var3 = (class33)this.field4755.method3147(-21068);
         if (!var2 && var3 == null) {
            return arg0 != -20302 ? null : null;
         } else {
            do {
               Object var4 = var3.method244(arg0 ^ 20301);
               if (var4 != null) {
                  return var4;
               }

               class33 var5 = var3;
               var3 = (class33)this.field4755.method3147(-21068);
               var5.method2477(arg0 + 22278);
               var5.method2495(arg0 + -3832);
               this.field4764 += var5.field416;
            } while(var3 != null);

            if (arg0 != -20302) {
               return null;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field4767[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "d",
      descriptor = "(I)V",
      line = 340
   )
   public final void method2554(int arg0) {
      boolean var2 = client.field1786;

      try {
         class33 var3 = (class33)this.field4753.method3688(true);
         if (var2) {
            if (var3.method245(-76)) {
               var3.method2477(1976);
               var3.method2495(-24134);
               this.field4764 += var3.field416;
            }

            var3 = (class33)this.field4753.method3691(20);
         }

         while(true) {
            int var10000;
            if (var3 == null) {
               ++field4762;
               var10000 = arg0;
               if (!var2) {
                  if (arg0 >= -94) {
                     this.method2547(26);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var3.method245(-76);
            }

            if (var10000 != 0) {
               var3.method2477(1976);
               var3.method2495(-24134);
               this.field4764 += var3.field416;
            }

            var3 = (class33)this.field4753.method3691(20);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4767[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "(B)V",
      line = 372
   )
   public static final void method2555(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(IJBLjava/lang/Object;)V",
      line = 393
   )
   public final void method2556(int arg0, long arg1, byte arg2, Object arg3) {
      try {
         if (arg2 != 84) {
            this.method2556(-70, -128L, (byte)15, (Object)null);
         }

         ++field4766;
         if (~arg0 < ~this.field4754) {
            throw new IllegalStateException(field4767[9]);
         } else {
            this.method2541((byte)-75, arg1);
            this.field4764 -= arg0;

            while(this.field4764 < 0) {
               class33 var6 = (class33)this.field4753.method3692((byte)46);
               this.method2548(-116, var6);
            }

            class417 var7 = new class417(arg3, arg0);
            this.field4755.method3143(125, var7, arg1);
            this.field4753.method3693(var7, true);
            var7.field4684 = 0L;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field4767[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4767[2] : field4767[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "<init>",
      descriptor = "(II)V",
      line = 427
   )
   public class304(int arg0, int arg1) {
      this.field4753 = new class475();

      try {
         this.field4764 = arg0;
         this.field4754 = arg0;

         int var3;
         for(var3 = 1; var3 + var3 < arg0 && ~var3 > ~arg1; var3 += var3) {
         }

         this.field4755 = new class389(var3);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4767[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2557(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2558(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
