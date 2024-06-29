import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class732 {
   @OriginalMember(
      owner = "client!ed",
      name = "c",
      descriptor = "I"
   )
   public int field10522 = 0;
   @OriginalMember(
      owner = "client!ed",
      name = "q",
      descriptor = "Z"
   )
   private boolean field10527 = false;
   @OriginalMember(
      owner = "client!ed",
      name = "b",
      descriptor = "I"
   )
   public int field10516 = 0;
   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10533 = new String[]{method5284(method5283("\u0013sjFJ")), method5284(method5283("\u0013sjEJ")), method5284(method5283("\u0018b(h")), method5284(method5283("\r9j*\u001f")), method5284(method5283("\u0013sj@J")), method5284(method5283("\u0013sjGJ")), method5284(method5283("\u0013sjAJ"))};
   @OriginalMember(
      owner = "client!ed",
      name = "l",
      descriptor = "I"
   )
   public static int field10517 = 1403;
   @OriginalMember(
      owner = "client!ed",
      name = "u",
      descriptor = "Liw;"
   )
   public static class332 field10523 = new class332();
   @OriginalMember(
      owner = "client!ed",
      name = "e",
      descriptor = "[Lhc;"
   )
   public static class150[] field10529 = new class150[5];
   @OriginalMember(
      owner = "client!ed",
      name = "i",
      descriptor = "I"
   )
   public int field10512;
   @OriginalMember(
      owner = "client!ed",
      name = "n",
      descriptor = "I"
   )
   public static int field10513;
   @OriginalMember(
      owner = "client!ed",
      name = "p",
      descriptor = "I"
   )
   public static int field10515;
   @OriginalMember(
      owner = "client!ed",
      name = "f",
      descriptor = "I"
   )
   public int field10518;
   @OriginalMember(
      owner = "client!ed",
      name = "k",
      descriptor = "I"
   )
   public int field10519;
   @OriginalMember(
      owner = "client!ed",
      name = "m",
      descriptor = "I"
   )
   public int field10520;
   @OriginalMember(
      owner = "client!ed",
      name = "r",
      descriptor = "I"
   )
   public int field10521;
   @OriginalMember(
      owner = "client!ed",
      name = "d",
      descriptor = "I"
   )
   public static int field10524;
   @OriginalMember(
      owner = "client!ed",
      name = "j",
      descriptor = "I"
   )
   public int field10525;
   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "I"
   )
   public int field10526;
   @OriginalMember(
      owner = "client!ed",
      name = "g",
      descriptor = "I"
   )
   public int field10528;
   @OriginalMember(
      owner = "client!ed",
      name = "t",
      descriptor = "I"
   )
   private int field10530;
   @OriginalMember(
      owner = "client!ed",
      name = "o",
      descriptor = "I"
   )
   public static int field10531;
   @OriginalMember(
      owner = "client!ed",
      name = "s",
      descriptor = "I"
   )
   public int field10532;
   @OriginalMember(
      owner = "client!ed",
      name = "h",
      descriptor = "J"
   )
   public long field10514;

   static {
      for(int var0 = 0; var0 < field10529.length; ++var0) {
         field10529[var0] = new class150();
      }

   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(B)V",
      line = 5
   )
   public final void method5278(byte arg0) {
      boolean var2 = client.field4564;

      try {
         this.field10525 = class593.field8548[this.field10530 << 3];
         ++field10513;
         long var3 = (long)this.field10521;
         long var5 = (long)this.field10520;
         long var7 = (long)this.field10528;
         this.field10518 = (int)Math.sqrt((double)(var7 * var7 + var3 * var3 + var5 * var5));
         if (~this.field10512 == -1) {
            this.field10512 = 1;
         }

         if (arg0 <= 39) {
            field10523 = null;
         }

         label37: {
            if (this.field10532 != 0) {
               if (~this.field10532 != -2) {
                  if (~this.field10532 != -3) {
                     break label37;
                  }

                  this.field10514 = (long)(this.field10518 * 8 / this.field10512);
                  if (!var2) {
                     break label37;
                  }
               }

               this.field10514 = (long)(this.field10518 * 8 / this.field10512);
               this.field10514 *= this.field10514;
               if (!var2) {
                  break label37;
               }
            }

            this.field10514 = 2147483647L;
         }

         if (this.field10527) {
            this.field10518 *= -1;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field10533[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(I)I",
      line = 54
   )
   public static final int method5279(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field10531;
         if (arg0 != -3) {
            field10523 = null;
         }

         byte var2;
         label47: {
            if (~class73.field1307 > -97) {
               var2 = 1;
               class461.method3459(true, (byte)-93);
               if (!var1) {
                  break label47;
               }
            }

            int var3 = class449.method3385((byte)37);
            if (~var3 >= -101) {
               class618.method4528(1);
               var2 = 4;
               if (!var1) {
                  break label47;
               }
            }

            if (~var3 < -501) {
               if (var3 > 1000) {
                  var2 = 1;
                  class461.method3459(true, (byte)-94);
                  if (!var1) {
                     break label47;
                  }
               }

               var2 = 2;
               class452.method3408(1);
               if (!var1) {
                  break label47;
               }
            }

            var2 = 3;
            class281.method2196(2);
         }

         if (~class510.field7454.field11145.method2098(false) != -1) {
            class510.field7454.method5552(0, arg0 ^ 107, class510.field7454.field11171);
            class363.method2847((byte)34, false, 0);
         }

         class14.method99(118);
         return var2;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10533[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(ILuda;)V",
      line = 116
   )
   public final void method5280(int arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         while(true) {
            int var4 = arg1.method3564((byte)-65);
            if (~var4 != -1) {
               this.method5281((byte)102, arg1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            if (arg0 != 9087) {
               this.field10525 = 54;
            }

            ++field10515;
            break;
         }

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10533[5] + arg0 + ',' + (arg1 != null ? field10533[3] : field10533[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(BLuda;I)V",
      line = 157
   )
   private final void method5281(byte arg0, class473 arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label74: {
            ++field10524;
            if (arg2 != 1) {
               if (arg2 != 2) {
                  if (arg2 != 3) {
                     if (arg2 == 4) {
                        this.field10532 = arg1.method3564((byte)-106);
                        this.field10512 = arg1.method3567(31871);
                        if (!var4) {
                           break label74;
                        }
                     }

                     if (arg2 == 6) {
                        this.field10519 = arg1.method3564((byte)-55);
                        if (!var4) {
                           break label74;
                        }
                     }

                     if (arg2 == 8) {
                        this.field10522 = 1;
                        if (!var4) {
                           break label74;
                        }
                     }

                     if (arg2 != 9) {
                        if (~arg2 != -11) {
                           break label74;
                        }

                        this.field10527 = true;
                        if (!var4) {
                           break label74;
                        }
                     }

                     this.field10516 = 1;
                     if (!var4) {
                        break label74;
                     }
                  }

                  this.field10521 = arg1.method3567(31871);
                  this.field10520 = arg1.method3567(31871);
                  this.field10528 = arg1.method3567(31871);
                  if (!var4) {
                     break label74;
                  }
               }

               arg1.method3564((byte)-117);
               if (!var4) {
                  break label74;
               }
            }

            this.field10530 = arg1.method3565(true);
         }

         if (arg0 <= 71) {
            method5282(61);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10533[1] + arg0 + ',' + (arg1 != null ? field10533[3] : field10533[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "b",
      descriptor = "(I)V",
      line = 214
   )
   public static void method5282(int arg0) {
      try {
         if (arg0 < -34) {
            field10523 = null;
            field10529 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10533[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5283(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5284(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
