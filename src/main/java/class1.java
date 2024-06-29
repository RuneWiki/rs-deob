import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class1 {
   @OriginalMember(
      owner = "client!qk",
      name = "c",
      descriptor = "Lfm;"
   )
   private class281 field16;
   @OriginalMember(
      owner = "client!qk",
      name = "i",
      descriptor = "Laja;"
   )
   private class106 field19;
   @OriginalMember(
      owner = "client!qk",
      name = "f",
      descriptor = "I"
   )
   public int field8;
   @OriginalMember(
      owner = "client!qk",
      name = "j",
      descriptor = "I"
   )
   private int field4;
   @OriginalMember(
      owner = "client!qk",
      name = "h",
      descriptor = "I"
   )
   private int field3;
   @OriginalMember(
      owner = "client!qk",
      name = "r",
      descriptor = "[B"
   )
   public byte[] field9;
   @OriginalMember(
      owner = "client!qk",
      name = "s",
      descriptor = "I"
   )
   private int field7;
   @OriginalMember(
      owner = "client!qk",
      name = "b",
      descriptor = "I"
   )
   private int field12;
   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field20 = new String[]{method11(method10("bfMZQ")), method11(method10("h#M6\u0004")), method11(method10("bfMPQ")), method11(method10("}x\u000ft")), method11(method10("bfM^Q")), method11(method10("bfM$\u0010}d\u0017&Q")), method11(method10("bfM]Q")), method11(method10("bfMYQ")), method11(method10("bfMQQ")), method11(method10("bfM\\Q")), method11(method10("bfM[Q")), method11(method10("bfM_Q"))};
   @OriginalMember(
      owner = "client!qk",
      name = "e",
      descriptor = "Ltia;"
   )
   public static class17 field2 = new class17(0);
   @OriginalMember(
      owner = "client!qk",
      name = "q",
      descriptor = "S"
   )
   public static short field18 = 1;
   @OriginalMember(
      owner = "client!qk",
      name = "l",
      descriptor = "I"
   )
   public static int field1;
   @OriginalMember(
      owner = "client!qk",
      name = "m",
      descriptor = "I"
   )
   public static int field11;
   @OriginalMember(
      owner = "client!qk",
      name = "n",
      descriptor = "I"
   )
   public static int field13;
   @OriginalMember(
      owner = "client!qk",
      name = "d",
      descriptor = "I"
   )
   public static int field14;
   @OriginalMember(
      owner = "client!qk",
      name = "k",
      descriptor = "I"
   )
   public static int field15;
   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "I"
   )
   public static int field17;
   @OriginalMember(
      owner = "client!qk",
      name = "o",
      descriptor = "I"
   )
   public static int field5;
   @OriginalMember(
      owner = "client!qk",
      name = "g",
      descriptor = "I"
   )
   public static int field6;
   @OriginalMember(
      owner = "client!qk",
      name = "p",
      descriptor = "[[Lpaa;"
   )
   private class653[][] field10;

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(ZI[[ZIII)V"
   )
   public final void method1(boolean param1, int param2, boolean[][] param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(ZILjava/lang/String;ZILjava/lang/String;I)V"
   )
   public static final void method2(boolean arg0, int arg1, String arg2, boolean arg3, int arg4, String arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         class741.field10844.field4661 = 1;
         ++field5;
         String var21 = arg2.toLowerCase();
         short[] var8 = new short[16];
         int var9 = -1;
         String var10 = null;
         if (~arg1 != 0) {
            class32 var11 = class566.field8336.method1210(arg1, true);
            if (var11 == null || !arg3 != !var11.method255(-29281)) {
               return;
            }

            if (var11.method255(-29281)) {
               var10 = var11.field470;
            } else {
               var9 = var11.field466;
            }
         }

         int var12 = 0;
         int var13 = 0;
         if (var7 || class166.field2126.field11240 > var13) {
            do {
               class546 var14 = class166.field2126.method5576(var13, (byte)-60);
               if ((!arg0 || var14.field8006) && var14.field8000 == -1 && var14.field8037 == -1 && var14.field7986 == -1 && (var14.field8046 == 0 || var7) && ~var14.field8056.toLowerCase().indexOf(var21) != 0) {
                  label193: {
                     if (arg1 != -1) {
                        label133: {
                           if (arg3) {
                              if (arg5.equals(var14.method4135(arg1, var10, (byte)21))) {
                                 break label133;
                              }

                              if (!var7) {
                                 break label193;
                              }
                           }

                           if (arg4 != var14.method4141(12186, arg1, var9) && !var7) {
                              break label193;
                           }
                        }
                     }

                     if (~var12 <= -251) {
                        class121.field1607 = null;
                        class562.field8270 = -1;
                        return;
                     }

                     if (~var8.length >= ~var12) {
                        short[] var15 = new short[var8.length * 2];
                        int var16 = 0;
                        if (var7) {
                           var15[var16] = var8[var16];
                           ++var16;
                        }

                        while(true) {
                           short[] var10000;
                           if (~var16 <= ~var12) {
                              var10000 = var15;
                              if (!var7) {
                                 var8 = var15;
                                 break;
                              }
                           } else {
                              var10000 = var15;
                           }

                           var10000[var16] = var8[var16];
                           ++var16;
                        }
                     }

                     var8[var12++] = (short)var13;
                  }
               }

               ++var13;
            } while(class166.field2126.field11240 > var13);
         }

         class602.field8869 = 0;
         class121.field1607 = var8;
         class562.field8270 = var12;
         String[] var17 = new String[class562.field8270];
         int var18 = 0;
         if (var7) {
            var17[var18] = class166.field2126.method5576(var8[var18], (byte)-87).field8056;
            ++var18;
         }

         while(true) {
            while(var18 < class562.field8270) {
               var17[var18] = class166.field2126.method5576(var8[var18], (byte)-87).field8056;
               ++var18;
            }

            class33.method268(var17, -22473, class121.field1607);
            class741.field10844.method2701((byte)127);
            class741.field10844.field4661 = 2;
            if (!var7) {
               if (arg6 >= -69) {
                  method2(true, 111, (String)null, true, -66, (String)null, -39);
                  return;
               }

               return;
            }

            ++var18;
         }
      } catch (RuntimeException var20) {
         throw class93.method866(var20, field20[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field20[1] : field20[3]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field20[1] : field20[3]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(ILha;IILjava/lang/String;IBI)V"
   )
   public static final void method3(int arg0, class479 arg1, int arg2, int arg3, String arg4, int arg5, byte arg6, int arg7) {
      boolean var8 = client.field1481;

      try {
         ++field13;
         if (class382.field5309 == null || class400.field5502 == null) {
            label87: {
               if (class268.field3430.method2681((byte)54, class494.field6898) && class268.field3430.method2681((byte)70, class435.field5925)) {
                  class382.field5309 = arg1.method402(class65.method589(class268.field3430, class494.field6898, 0), true);
                  class65 var9 = class65.method589(class268.field3430, class435.field5925, 0);
                  class400.field5502 = arg1.method402(var9, true);
                  var9.method580();
                  class370.field5157 = arg1.method402(var9, true);
                  if (!var8) {
                     break label87;
                  }
               }

               arg1.method513(arg2, arg5, arg0, arg7, class217.field2755 | -class522.field7326 + 255 << 24, 1);
            }
         }

         if (class382.field5309 != null && class400.field5502 != null) {
            int var10 = (arg0 - class400.field5502.method2394() * 2) / class382.field5309.method2394();
            int var11 = 0;
            if (var8) {
               class382.field5309.method4760(arg2 - -class400.field5502.method2394() + class382.field5309.method2394() * var11, arg5);
               ++var11;
            }

            while(true) {
               while(~var10 < ~var11) {
                  class382.field5309.method4760(arg2 - -class400.field5502.method2394() + class382.field5309.method2394() * var11, arg5);
                  ++var11;
               }

               class400.field5502.method4760(arg2, arg5);
               class648 var10000 = class370.field5157;
               int var10001 = -class370.field5157.method2394() + arg0 + arg2;
               if (!var8) {
                  var10000.method4760(var10001, arg5);
                  break;
               }

               var10000.method4760(var10001, arg5);
               ++var11;
            }
         }

         class98.field1306.method3433(arg4, arg5 + 14, -86, -1, arg2 + 3, -16777216 | class541.field7916);
         arg1.method513(arg2, arg5 - -arg7, arg0, -arg7 + arg3, -class522.field7326 + 255 << 24 | class217.field2755, 1);
         if (arg6 > -24) {
            method2(false, -109, (String)null, true, -12, (String)null, 77);
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field20[4] + arg0 + ',' + (arg1 != null ? field20[1] : field20[3]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field20[1] : field20[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(Lr;IBI)V"
   )
   public final void method4(class114 arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field6;
         class156 var5 = (class156)arg0;
         arg1 += var5.field2009 + 1;
         arg3 += var5.field2014 - -1;
         int var6 = this.field8 * arg1 + arg3;
         int var7 = 0;
         int var8 = var5.field2011;
         if (arg2 >= -86) {
            this.field7 = 71;
         }

         int var9 = var5.field2007;
         int var10 = this.field8 - var9;
         int var11 = 0;
         if (arg1 <= 0) {
            int var12 = -arg1 + 1;
            var7 += var9 * var12;
            var6 += this.field8 * var12;
            arg1 = 1;
            var8 -= var12;
         }

         if (this.field4 <= arg1 + var8) {
            int var13 = arg1 + 1 - -var8 + -this.field4;
            var8 -= var13;
         }

         if (~arg3 >= -1) {
            int var14 = -arg3 + 1;
            var6 += var14;
            var11 += var14;
            var7 += var14;
            var9 -= var14;
            var10 += var14;
            arg3 = 1;
         }

         if (this.field8 <= arg3 + var9) {
            int var15 = var9 + 1 + -this.field8 + arg3;
            var10 += var15;
            var9 -= var15;
            var11 += var15;
         }

         if (var9 > 0 && ~var8 < -1) {
            class608.method4499((byte)-87, var11, var7, var8, var6, this.field9, var5.field2018, var9, var10);
            this.method9(var8, arg1, arg3, var9, 55);
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field20[7] + (arg0 != null ? field20[1] : field20[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(IIILr;)V"
   )
   public final void method5(int arg0, int arg1, int arg2, class114 arg3) {
      try {
         ++field15;
         class156 var5 = (class156)arg3;
         arg2 += var5.field2014 + 1;
         arg0 += var5.field2009 + 1;
         int var6 = arg2 - -(this.field8 * arg0);
         int var7 = 0;
         int var8 = var5.field2011;
         int var9 = var5.field2007;
         int var10 = -22 / ((-55 - arg1) / 46);
         int var11 = -var9 + this.field8;
         int var12 = 0;
         if (arg0 <= 0) {
            int var13 = -arg0 + 1;
            var7 += var9 * var13;
            arg0 = 1;
            var8 -= var13;
            var6 += this.field8 * var13;
         }

         if (this.field4 <= arg0 + var8) {
            int var14 = -this.field4 + 1 + arg0 + var8;
            var8 -= var14;
         }

         if (arg2 <= 0) {
            int var15 = -arg2 + 1;
            var6 += var15;
            var7 += var15;
            arg2 = 1;
            var12 += var15;
            var11 += var15;
            var9 -= var15;
         }

         if (~(arg2 + var9) <= ~this.field8) {
            int var16 = arg2 + var9 - this.field8 + 1;
            var12 += var16;
            var11 += var16;
            var9 -= var16;
         }

         if (~var9 < -1 && var8 > 0) {
            class725.method5251(this.field9, var12, var5.field2018, var9, var6, -1, var11, var8, var7);
            this.method9(var8, arg0, arg2, var9, -101);
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field20[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field20[1] : field20[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(ILr;ZI)Z"
   )
   public final boolean method6(int arg0, class114 arg1, boolean arg2, int arg3) {
      try {
         ++field1;
         if (!arg2) {
            return true;
         } else {
            class156 var5 = (class156)arg1;
            arg0 += var5.field2014 - -1;
            arg3 += var5.field2009 + 1;
            int var6 = this.field8 * arg3 + arg0;
            int var7 = var5.field2011;
            int var8 = var5.field2007;
            if (~arg3 >= -1) {
               int var9 = -arg3 + 1;
               var6 += this.field8 * var9;
               var7 -= var9;
               arg3 = 1;
            }

            int var10 = -var8 + this.field8;
            if (this.field4 <= arg3 + var7) {
               int var11 = arg3 - (-var7 - -this.field4) + 1;
               var7 -= var11;
            }

            if (~arg0 >= -1) {
               int var12 = -arg0 + 1;
               arg0 = 1;
               var8 -= var12;
               var10 += var12;
               var6 += var12;
            }

            if (this.field8 <= arg0 + var8) {
               int var13 = arg0 - -var8 + 1 + -this.field8;
               var8 -= var13;
               var10 += var13;
            }

            if (var8 > 0 && ~var7 < -1) {
               byte var14 = 8;
               int var15 = (var14 - 1) * this.field8 + var10;
               return class743.method5392(var6, var8, var7, var15, var14, this.field9, 255);
            } else {
               return false;
            }
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field20[2] + arg0 + ',' + (arg1 != null ? field20[1] : field20[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method7(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         if (!arg0) {
            this.field9 = null;
         }

         ++field17;
         this.field10 = new class653[this.field7][this.field12];
         int var3 = 0;
         if (var2 || this.field12 > var3) {
            do {
               int var4 = 0;
               if (var2) {
                  this.field10[var4][var3] = new class653(this.field16, this, this.field19, var4, var3, this.field3, var4 * 128 - -1, var3 * 128 + 1);
                  if (this.field10[var4][var3].field9754 == 0) {
                     this.field10[var4][var3] = null;
                  }

                  ++var4;
               }

               while(true) {
                  while(~var4 > ~this.field7) {
                     this.field10[var4][var3] = new class653(this.field16, this, this.field19, var4, var3, this.field3, var4 * 128 - -1, var3 * 128 + 1);
                     if (this.field10[var4][var3].field9754 == 0) {
                        this.field10[var4][var3] = null;
                     }

                     ++var4;
                  }

                  if (!var2) {
                     ++var3;
                     break;
                  }

                  if (this.field10[var4][var3].field9754 == 0) {
                     this.field10[var4][var3] = null;
                  }

                  ++var4;
               }
            } while(this.field12 > var3);

         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field20[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method8(int arg0) {
      try {
         if (arg0 == 1) {
            field2 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field20[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "<init>",
      descriptor = "(Lfm;Laja;)V"
   )
   public class1(class281 arg0, class106 arg1) {
      try {
         this.field16 = arg0;
         this.field19 = arg1;
         this.field8 = 2 - -(this.field19.field5769 * this.field19.field5764 >> this.field16.field3792);
         this.field4 = (this.field19.field5767 * this.field19.field5764 >> this.field16.field3792) + 2;
         this.field3 = this.field16.field3792 + 7 + -this.field19.field5773;
         this.field9 = new byte[this.field8 * this.field4];
         this.field7 = this.field19.field5769 >> this.field3;
         this.field12 = this.field19.field5767 >> this.field3;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field20[5] + (arg0 != null ? field20[1] : field20[3]) + ',' + (arg1 != null ? field20[1] : field20[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final void method9(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field14;
         if (this.field10 != null) {
            int var7 = 16 / ((-54 - arg4) / 42);
            int var8 = arg2 - 1 >> 7;
            int var9 = arg2 - (1 - arg3) - 1 >> 7;
            int var10 = arg1 - 1 >> 7;
            int var11 = arg1 + -1 + arg0 + -1 >> 7;
            int var12 = var8;
            if (var6 || var9 >= var8) {
               do {
                  class653[] var13 = this.field10[var12];
                  int var14 = var10;
                  if (var6) {
                     if (var13[var10] != null) {
                        var13[var10].field9759 = true;
                     }

                     var14 = var10 + 1;
                  }

                  while(true) {
                     while(~var14 >= ~var11) {
                        if (var13[var14] != null) {
                           var13[var14].field9759 = true;
                        }

                        ++var14;
                     }

                     if (!var6) {
                        ++var12;
                        break;
                     }

                     ++var14;
                  }
               } while(var9 >= var12);

            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field20[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method10(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method11(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
