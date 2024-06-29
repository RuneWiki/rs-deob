import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class225 {
   @OriginalMember(
      owner = "client!jf",
      name = "w",
      descriptor = "I"
   )
   public int field2874 = 0;
   @OriginalMember(
      owner = "client!jf",
      name = "l",
      descriptor = "I"
   )
   public int field2888 = 0;
   @OriginalMember(
      owner = "client!jf",
      name = "v",
      descriptor = "Z"
   )
   private boolean field2885 = false;
   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2896 = new String[]{method1708(method1707("sv\u000eRy")), method1708(method1707("sv\u000eTy")), method1708(method1707("sv\u000eSy")), method1708(method1707("sv\u000eUy")), method1708(method1707("weL{")), method1708(method1707("b>\u000e9,")), method1708(method1707("sv\u000eQy")), method1708(method1707("sv\u000eVy"))};
   @OriginalMember(
      owner = "client!jf",
      name = "u",
      descriptor = "Lcs;"
   )
   public static class358 field2891 = new class358();
   @OriginalMember(
      owner = "client!jf",
      name = "k",
      descriptor = "I"
   )
   public static int field2894 = 0;
   @OriginalMember(
      owner = "client!jf",
      name = "g",
      descriptor = "Lpia;"
   )
   public static class102 field2893 = new class102("", 16);
   @OriginalMember(
      owner = "client!jf",
      name = "e",
      descriptor = "I"
   )
   public int field2873;
   @OriginalMember(
      owner = "client!jf",
      name = "f",
      descriptor = "I"
   )
   public int field2875;
   @OriginalMember(
      owner = "client!jf",
      name = "t",
      descriptor = "I"
   )
   public int field2876;
   @OriginalMember(
      owner = "client!jf",
      name = "j",
      descriptor = "I"
   )
   public int field2877;
   @OriginalMember(
      owner = "client!jf",
      name = "s",
      descriptor = "I"
   )
   public int field2878;
   @OriginalMember(
      owner = "client!jf",
      name = "d",
      descriptor = "I"
   )
   public static int field2879;
   @OriginalMember(
      owner = "client!jf",
      name = "q",
      descriptor = "I"
   )
   public static int field2880;
   @OriginalMember(
      owner = "client!jf",
      name = "p",
      descriptor = "I"
   )
   public int field2881;
   @OriginalMember(
      owner = "client!jf",
      name = "o",
      descriptor = "I"
   )
   private int field2882;
   @OriginalMember(
      owner = "client!jf",
      name = "n",
      descriptor = "I"
   )
   public static int field2883;
   @OriginalMember(
      owner = "client!jf",
      name = "i",
      descriptor = "I"
   )
   public int field2884;
   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "I"
   )
   public static int field2886;
   @OriginalMember(
      owner = "client!jf",
      name = "c",
      descriptor = "I"
   )
   public static int field2887;
   @OriginalMember(
      owner = "client!jf",
      name = "m",
      descriptor = "I"
   )
   public int field2890;
   @OriginalMember(
      owner = "client!jf",
      name = "r",
      descriptor = "I"
   )
   public int field2892;
   @OriginalMember(
      owner = "client!jf",
      name = "h",
      descriptor = "I"
   )
   public static int field2895;
   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "J"
   )
   public long field2889;

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(ILjj;)V"
   )
   public final void method1701(int arg0, class128 arg1) {
      int var3 = client.field4530;

      try {
         while(true) {
            int var4 = arg1.method1104(255);
            if (var4 != 0) {
               this.method1703(var4, (byte)-103, arg1);
               if (var3 != 0) {
                  break;
               }

               if (var3 == 0) {
                  continue;
               }
            }

            if (arg0 != 0) {
               return;
            }

            ++field2880;
            break;
         }

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2896[3] + arg0 + ',' + (arg1 != null ? field2896[5] : field2896[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1702(int arg0) {
      try {
         if (arg0 != 4293) {
            field2891 = null;
         }

         field2893 = null;
         field2891 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2896[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(IBLjj;)V"
   )
   private final void method1703(int arg0, byte arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label82: {
            ++field2883;
            if (arg0 == 1) {
               this.field2882 = arg2.method1038((byte)-102);
               if (var4 == 0) {
                  break label82;
               }
            }

            if (~arg0 == -3) {
               arg2.method1104(255);
               if (var4 == 0) {
                  break label82;
               }
            }

            if (~arg0 == -4) {
               this.field2875 = arg2.method1041(4758);
               this.field2876 = arg2.method1041(4758);
               this.field2892 = arg2.method1041(4758);
               if (var4 == 0) {
                  break label82;
               }
            }

            if (arg0 != 4) {
               if (~arg0 != -7) {
                  if (arg0 != 8) {
                     if (arg0 == 9) {
                        this.field2888 = 1;
                        if (var4 == 0) {
                           break label82;
                        }
                     }

                     if (~arg0 != -11) {
                        break label82;
                     }

                     this.field2885 = true;
                     if (var4 == 0) {
                        break label82;
                     }
                  }

                  this.field2874 = 1;
                  if (var4 == 0) {
                     break label82;
                  }
               }

               this.field2890 = arg2.method1104(255);
               if (var4 == 0) {
                  break label82;
               }
            }

            this.field2873 = arg2.method1104(255);
            this.field2881 = arg2.method1041(4758);
         }

         if (arg1 >= -49) {
            this.method1704((byte)-60);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2896[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2896[5] : field2896[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1704(byte arg0) {
      int var2 = client.field4530;

      try {
         this.field2878 = class689.field10391[this.field2882 << 3];
         ++field2886;
         long var3 = (long)this.field2875;
         long var5 = (long)this.field2876;
         long var7 = (long)this.field2892;
         if (arg0 == -18) {
            this.field2877 = (int)Math.sqrt((double)(var3 * var3 + var7 * var7 - -(var5 * var5)));
            if (~this.field2881 == -1) {
               this.field2881 = 1;
            }

            label37: {
               if (~this.field2873 != -1) {
                  if (this.field2873 == 1) {
                     this.field2889 = (long)(this.field2877 * 8 / this.field2881);
                     this.field2889 *= this.field2889;
                     if (var2 == 0) {
                        break label37;
                     }
                  }

                  if (this.field2873 != 2) {
                     break label37;
                  }

                  this.field2889 = (long)(this.field2877 * 8 / this.field2881);
                  if (var2 == 0) {
                     break label37;
                  }
               }

               this.field2889 = 2147483647L;
            }

            if (this.field2885) {
               this.field2877 *= -1;
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field2896[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method1705(int arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         int var4 = 75 / ((arg2 - -42) / 33);
         if (~class627.field9106 != -1) {
            label34: {
               if (arg0 >= 0) {
                  class185.field2310[arg0] = arg1;
                  if (var3 == 0) {
                     break label34;
                  }
               }

               int var5 = 0;
               if (var3 != 0) {
                  class185.field2310[var5] = arg1;
                  ++var5;
               }

               while(~var5 > -17) {
                  class185.field2310[var5] = arg1;
                  ++var5;
               }
            }
         }

         ++field2887;
         class663.field9609.method463(-88, arg0, arg1);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2896[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1706(int arg0, int arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         if (arg2 != 4) {
            field2894 = -96;
         }

         ++field2879;
         if (~arg1 < -244) {
            arg0 >>= 4;
            if (var4 == 0) {
               return (arg1 >> 1) + (arg0 >> 5 << 7) + ((arg3 >> 2 & 63) << 10);
            }
         }

         if (~arg1 < -218) {
            arg0 >>= 3;
            if (var4 == 0) {
               return (arg1 >> 1) + (arg0 >> 5 << 7) + ((arg3 >> 2 & 63) << 10);
            }
         }

         if (arg1 > 192) {
            arg0 >>= 2;
            if (var4 == 0) {
               return (arg1 >> 1) + (arg0 >> 5 << 7) + ((arg3 >> 2 & 63) << 10);
            }
         }

         if (arg1 > 179) {
            arg0 >>= 1;
         }

         return (arg1 >> 1) + (arg0 >> 5 << 7) + ((arg3 >> 2 & 63) << 10);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2896[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1707(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 81);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1708(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 81;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
