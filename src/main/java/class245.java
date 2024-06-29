import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class245 {
   @OriginalMember(
      owner = "client!dia",
      name = "g",
      descriptor = "I"
   )
   private int field3082 = 0;
   @OriginalMember(
      owner = "client!dia",
      name = "f",
      descriptor = "I"
   )
   public int field3066;
   @OriginalMember(
      owner = "client!dia",
      name = "c",
      descriptor = "[Lmaa;"
   )
   public class500[] field3074;
   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3083 = new String[]{method1853(method1852("Ux3=T\u0019")), method1853(method1852("Ux3=[\u0019")), method1853(method1852("Ux3=S\u0019")), method1853(method1852("Ux3=Y\u0019")), method1853(method1852("Ux3=.X\u007f;g,\u0019")), method1853(method1852("Ux3=^\u0019")), method1853(method1852("_d>\u007f")), method1853(method1852("J?|=o")), method1853(method1852("Ux3=X\u0019")), method1853(method1852("Ux3=Q\u0019")), method1853(method1852("Ux3=P\u0019")), method1853(method1852("Ux3=W\u0019")), method1853(method1852("Ux3=U\u0019")), method1853(method1852("Ux3=V\u0019")), method1853(method1852("Ux3=Z\u0019")), method1853(method1852("Ux3=_\u0019"))};
   @OriginalMember(
      owner = "client!dia",
      name = "n",
      descriptor = "I"
   )
   public static int field3070 = 0;
   @OriginalMember(
      owner = "client!dia",
      name = "r",
      descriptor = "I"
   )
   public static int field3076 = 0;
   @OriginalMember(
      owner = "client!dia",
      name = "l",
      descriptor = "I"
   )
   public static int field3062;
   @OriginalMember(
      owner = "client!dia",
      name = "q",
      descriptor = "I"
   )
   public static int field3065;
   @OriginalMember(
      owner = "client!dia",
      name = "i",
      descriptor = "I"
   )
   public static int field3067;
   @OriginalMember(
      owner = "client!dia",
      name = "u",
      descriptor = "I"
   )
   public static int field3069;
   @OriginalMember(
      owner = "client!dia",
      name = "k",
      descriptor = "I"
   )
   public static int field3071;
   @OriginalMember(
      owner = "client!dia",
      name = "e",
      descriptor = "I"
   )
   public static int field3072;
   @OriginalMember(
      owner = "client!dia",
      name = "p",
      descriptor = "I"
   )
   public static int field3073;
   @OriginalMember(
      owner = "client!dia",
      name = "d",
      descriptor = "I"
   )
   public static int field3075;
   @OriginalMember(
      owner = "client!dia",
      name = "b",
      descriptor = "I"
   )
   public static int field3077;
   @OriginalMember(
      owner = "client!dia",
      name = "h",
      descriptor = "I"
   )
   public static int field3078;
   @OriginalMember(
      owner = "client!dia",
      name = "j",
      descriptor = "I"
   )
   public static int field3079;
   @OriginalMember(
      owner = "client!dia",
      name = "t",
      descriptor = "I"
   )
   public static int field3080;
   @OriginalMember(
      owner = "client!dia",
      name = "o",
      descriptor = "J"
   )
   private long field3063;
   @OriginalMember(
      owner = "client!dia",
      name = "s",
      descriptor = "Lmaa;"
   )
   private class500 field3068;
   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "Lmaa;"
   )
   private class500 field3081;
   @OriginalMember(
      owner = "client!dia",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field3064;

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(IJ)Lmaa;"
   )
   public final class500 method1839(int arg0, long arg1) {
      boolean var4 = client.field4273;

      try {
         int var5 = -89 / ((-74 - arg0) / 37);
         this.field3063 = arg1;
         ++field3065;
         class500 var6 = this.field3074[(int)(arg1 & (long)(this.field3066 - 1))];
         this.field3068 = var6.field6867;
         class500 var7;
         if (var4) {
            if (~this.field3068.field6862 == ~arg1) {
               var7 = this.field3068;
               this.field3068 = this.field3068.field6867;
               return var7;
            }

            this.field3068 = this.field3068.field6867;
         }

         while(true) {
            while(this.field3068 != var6) {
               if (~this.field3068.field6862 == ~arg1) {
                  var7 = this.field3068;
                  this.field3068 = this.field3068.field6867;
                  return var7;
               }

               this.field3068 = this.field3068.field6867;
            }

            this.field3068 = null;
            if (!var4) {
               return null;
            }

            this.field3068 = this.field3068.field6867;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3083[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1840(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(JZLmaa;)V"
   )
   public final void method1841(long arg0, boolean arg1, class500 arg2) {
      try {
         ++field3072;
         if (arg2.field6863 != null) {
            arg2.method3609(125);
         }

         class500 var5 = this.field3074[(int)(arg0 & (long)(this.field3066 + -1))];
         arg2.field6863 = var5.field6863;
         arg2.field6867 = var5;
         arg2.field6863.field6867 = arg2;
         arg2.field6862 = arg0;
         arg2.field6867.field6863 = arg2;
         if (!arg1) {
            method1840(61);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field3083[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3083[7] : field3083[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method1842(int arg0) {
      try {
         if (class791.field11574 < 0) {
            class791.field11574 = 0;
            class575.field7911 = -1;
            class226.field2841 = -1;
         }

         ++field3067;
         if (arg0 < 42) {
            method1840(-77);
         }

         if (~class791.field11574 < ~class618.field8642) {
            class575.field7911 = -1;
            class791.field11574 = class618.field8642;
            class226.field2841 = -1;
         }

         if (~class231.field2870 > -1) {
            class226.field2841 = -1;
            class231.field2870 = 0;
            class575.field7911 = -1;
         }

         if (~class231.field2870 < ~class618.field8636) {
            class575.field7911 = -1;
            class226.field2841 = -1;
            class231.field2870 = class618.field8636;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3083[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "h",
      descriptor = "(I)I"
   )
   public final int method1843(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field3078;
         int var3 = -78 % ((41 - arg0) / 35);
         int var4 = 0;
         int var5 = 0;
         if (!var2 && this.field3066 <= var5) {
            return var4;
         } else {
            do {
               class500 var6 = this.field3074[var5];
               class500 var7 = var6.field6867;
               if (var2) {
                  var7 = var7.field6867;
                  ++var4;
               }

               while(true) {
                  while(var6 != var7) {
                     var7 = var7.field6867;
                     ++var4;
                  }

                  if (!var2) {
                     ++var5;
                     break;
                  }

                  ++var4;
               }
            } while(this.field3066 > var5);

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3083[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Z)Lmaa;"
   )
   public final class500 method1844(boolean arg0) {
      boolean var2 = client.field4273;

      try {
         ++field3079;
         if (this.field3068 == null) {
            return null;
         } else {
            class500 var3 = this.field3074[(int)((long)(this.field3066 + -1) & this.field3063)];
            class500 var4;
            if (arg0) {
               this.method1844(false);
               if (var2) {
                  if (~this.field3068.field6862 == ~this.field3063) {
                     var4 = this.field3068;
                     this.field3068 = this.field3068.field6867;
                     return var4;
                  }

                  this.field3068 = this.field3068.field6867;
               }
            }

            while(true) {
               while(this.field3068 != var3) {
                  if (~this.field3068.field6862 == ~this.field3063) {
                     var4 = this.field3068;
                     this.field3068 = this.field3068.field6867;
                     return var4;
                  }

                  this.field3068 = this.field3068.field6867;
               }

               this.field3068 = null;
               if (!var2) {
                  return null;
               }

               this.field3068 = this.field3068.field6867;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3083[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method1845(int arg0) {
      try {
         if (arg0 != -1) {
            this.method1844(true);
         }

         ++field3077;
         return this.field3066;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3083[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1846(int arg0) {
      try {
         field3064 = null;
         if (arg0 != 0) {
            field3070 = -38;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3083[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "g",
      descriptor = "(I)Lmaa;"
   )
   public final class500 method1847(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field3080;
         if (~this.field3082 < -1 && this.field3074[this.field3082 - 1] != this.field3081) {
            class500 var3 = this.field3081;
            this.field3081 = var3.field6867;
            return var3;
         } else {
            while(this.field3082 < this.field3066) {
               class500 var4 = this.field3074[this.field3082++].field6867;
               class500 var10000 = this.field3074[this.field3082 + -1];

               while(var10000 != var4) {
                  this.field3081 = var4.field6867;
                  var10000 = var4;
                  if (!var2) {
                     return var4;
                  }
               }
            }

            if (arg0 <= 118) {
               field3064 = null;
            }

            return null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3083[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method1848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4273;

      try {
         ++field3069;
         if (arg3 == -10134) {
            int var9 = class138.method1159(arg2, class313.field4171, (byte)-44, class478.field6604);
            int var10 = class138.method1159(arg1, class313.field4171, (byte)-44, class478.field6604);
            int var11 = class138.method1159(arg6, class663.field9442, (byte)-44, class265.field3451);
            int var12 = class138.method1159(arg0, class663.field9442, (byte)-44, class265.field3451);
            int var13 = class138.method1159(arg2 + arg7, class313.field4171, (byte)-44, class478.field6604);
            int var14 = class138.method1159(-arg7 + arg1, class313.field4171, (byte)-44, class478.field6604);
            int var15 = var9;
            if (var8) {
               class125.method1046(-23355, var12, class17.field236[var9], arg5, var11);
               var15 = var9 + 1;
            }

            while(true) {
               while(~var13 < ~var15) {
                  class125.method1046(-23355, var12, class17.field236[var15], arg5, var11);
                  ++var15;
               }

               int var16 = var10;
               if (!var8) {
                  if (var8) {
                     class125.method1046(-23355, var12, class17.field236[var10], arg5, var11);
                     var16 = var10 - 1;
                  }

                  while(true) {
                     while(var14 < var16) {
                        class125.method1046(-23355, var12, class17.field236[var16], arg5, var11);
                        --var16;
                     }

                     int var17 = class138.method1159(arg6 + arg7, class663.field9442, (byte)-44, class265.field3451);
                     int var18 = class138.method1159(-arg7 + arg0, class663.field9442, (byte)-44, class265.field3451);
                     int var19 = var13;
                     if (!var8) {
                        if (!var8 && ~var13 < ~var14) {
                           return;
                        }

                        do {
                           int[] var20 = class17.field236[var19];
                           class125.method1046(-23355, var17, var20, arg5, var11);
                           class125.method1046(-23355, var18, var20, arg4, var17);
                           class125.method1046(-23355, var12, var20, arg5, var18);
                           ++var19;
                        } while(~var19 >= ~var14);

                        return;
                     }

                     --var16;
                  }
               }

               ++var15;
            }
         }
      } catch (RuntimeException var22) {
         throw class534.method3846(var22, field3083[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(I[Lmaa;)I"
   )
   public final int method1849(int arg0, class500[] arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg0 < 71) {
            field3064 = null;
         }

         ++field3062;
         int var4 = 0;
         int var5 = 0;
         if (!var3 && ~var5 <= ~this.field3066) {
            return var4;
         } else {
            do {
               class500 var6 = this.field3074[var5];
               class500 var7 = var6.field6867;
               if (var3) {
                  arg1[var4++] = var7;
                  var7 = var7.field6867;
               }

               while(true) {
                  while(var6 != var7) {
                     arg1[var4++] = var7;
                     var7 = var7.field6867;
                  }

                  if (!var3) {
                     ++var5;
                     break;
                  }

                  var7 = var7.field6867;
               }
            } while(~var5 > ~this.field3066);

            return var4;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3083[13] + arg0 + ',' + (arg1 != null ? field3083[7] : field3083[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "b",
      descriptor = "(I)Lmaa;"
   )
   public final class500 method1850(int arg0) {
      try {
         ++field3073;
         this.field3082 = arg0;
         return this.method1847(arg0 + 120);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3083[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1851(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field3075;
         int var3 = 0;
         class245 var10000;
         class500 var4;
         int var6;
         if (var2) {
            var4 = this.field3074[var3];
         } else {
            if (var3 >= this.field3066) {
               this.field3068 = null;
               var6 = -58 / ((arg0 - 16) / 51);
               var10000 = this;
               if (!var2) {
                  this.field3081 = null;
                  return;
               }
            } else {
               var10000 = this;
            }

            var4 = var10000.field3074[var3];
         }

         while(true) {
            while(true) {
               class500 var5 = var4.field6867;
               if (var4 != var5) {
                  var5.method3609(122);
                  if (var2) {
                     break;
                  }

                  if (!var2) {
                     continue;
                  }

                  ++var3;
                  break;
               }

               ++var3;
               break;
            }

            if (var3 >= this.field3066) {
               this.field3068 = null;
               var6 = -58 / ((arg0 - 16) / 51);
               var10000 = this;
               if (!var2) {
                  this.field3081 = null;
                  return;
               }
            } else {
               var10000 = this;
            }

            var4 = var10000.field3074[var3];
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field3083[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class245(int arg0) {
      try {
         this.field3066 = arg0;
         this.field3074 = new class500[arg0];

         for(int var2 = 0; ~var2 > ~arg0; ++var2) {
            class500 var3 = this.field3074[var2] = new class500();
            var3.field6867 = var3;
            var3.field6863 = var3;
         }

      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3083[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1852(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1853(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
