import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public class class380 {
   @OriginalMember(
      owner = "client!mga",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   private String field5279 = field5297[1];
   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5297 = new String[]{method3024(method3023("6p\u001cnSs")), method3024(method3023("5b\u0011,")), method3024(method3023(" 9Snc")), method3024(method3023("6p\u001cnYs")), method3024(method3023("6p\u001cnZs")), method3024(method3023("6p\u001cn_s")), method3024(method3023("6p\u001cnTs")), method3024(method3023("6p\u001cnRs")), method3024(method3023("6p\u001cnXs")), method3024(method3023("6p\u001cn]s")), method3024(method3023("6p\u001cnUs")), method3024(method3023("6p\u001cn\\s")), method3024(method3023("6p\u001cnVs")), method3024(method3023("6p\u001cn[s"))};
   @OriginalMember(
      owner = "client!mga",
      name = "c",
      descriptor = "Laka;"
   )
   public static class418 field5289 = new class418(119, 8);
   @OriginalMember(
      owner = "client!mga",
      name = "o",
      descriptor = "Laka;"
   )
   public static class418 field5295 = new class418(84, 12);
   @OriginalMember(
      owner = "client!mga",
      name = "b",
      descriptor = "C"
   )
   public char field5280;
   @OriginalMember(
      owner = "client!mga",
      name = "g",
      descriptor = "C"
   )
   public char field5287;
   @OriginalMember(
      owner = "client!mga",
      name = "r",
      descriptor = "F"
   )
   public static float field5296;
   @OriginalMember(
      owner = "client!mga",
      name = "u",
      descriptor = "I"
   )
   public static int field5276;
   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "I"
   )
   public static int field5278;
   @OriginalMember(
      owner = "client!mga",
      name = "s",
      descriptor = "I"
   )
   public static int field5282;
   @OriginalMember(
      owner = "client!mga",
      name = "n",
      descriptor = "I"
   )
   private int field5283;
   @OriginalMember(
      owner = "client!mga",
      name = "e",
      descriptor = "I"
   )
   public static int field5284;
   @OriginalMember(
      owner = "client!mga",
      name = "k",
      descriptor = "I"
   )
   public static int field5285;
   @OriginalMember(
      owner = "client!mga",
      name = "m",
      descriptor = "I"
   )
   public static int field5286;
   @OriginalMember(
      owner = "client!mga",
      name = "l",
      descriptor = "I"
   )
   public static int field5288;
   @OriginalMember(
      owner = "client!mga",
      name = "d",
      descriptor = "I"
   )
   public static int field5290;
   @OriginalMember(
      owner = "client!mga",
      name = "f",
      descriptor = "I"
   )
   public static int field5291;
   @OriginalMember(
      owner = "client!mga",
      name = "h",
      descriptor = "I"
   )
   public static int field5292;
   @OriginalMember(
      owner = "client!mga",
      name = "j",
      descriptor = "I"
   )
   public static int field5293;
   @OriginalMember(
      owner = "client!mga",
      name = "q",
      descriptor = "I"
   )
   private int field5294;
   @OriginalMember(
      owner = "client!mga",
      name = "p",
      descriptor = "Lhv;"
   )
   private class227 field5281;
   @OriginalMember(
      owner = "client!mga",
      name = "t",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field5277;

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method3010(int arg0, byte arg1) {
      try {
         ++field5293;
         if (this.field5277 == null) {
            return this.field5294;
         } else {
            if (arg1 != 41) {
               method3022((class713[])null, -44, -124);
            }

            if (!(this.field5277 instanceof class227)) {
               Integer[] var3 = (Integer[])this.field5277;
               if (arg0 >= 0 && ~arg0 > ~var3.length) {
                  Integer var4 = var3[arg0];
                  return var4 != null ? var4 : this.field5294;
               } else {
                  return this.field5294;
               }
            } else {
               class278 var5 = (class278)((class227)this.field5277).method1818(arg1 + -42, (long)arg0);
               return var5 != null ? var5.field3546 : this.field5294;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5297[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(ZIIILww;B)V"
   )
   public static final void method3011(boolean arg0, int arg1, int arg2, int arg3, class339 arg4, byte arg5) {
      try {
         if (arg5 <= -95) {
            class422.method3273(arg4, (byte)111, arg3, arg0, 0L, arg2, arg1);
            ++field5282;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5297[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5297[2] : field5297[1]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3012(byte arg0) {
      try {
         if (arg0 != 1) {
            this.field5280 = 7;
         }

         ++field5291;
         return this.field5283;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5297[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3013(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method3014(int arg0) {
      boolean var2 = client.field1481;

      try {
         if (arg0 != 0) {
            method3017(true);
         }

         label55: {
            if (this.field5277 instanceof class227) {
               class227 var3 = (class227)this.field5277;
               this.field5281 = new class227(var3.method1807(~arg0));
               class217 var4 = (class217)var3.method1817(arg0 ^ -46);
               if (var2 || var4 != null) {
                  do {
                     class89 var5 = new class89(var4.field2751, (int)var4.field9965);
                     this.field5281.method1808(class139.method1156(var4.field2751, 126), var5, 26459);
                     var4 = (class217)var3.method1812(353);
                  } while(var4 != null);
               }

               if (!var2) {
                  break label55;
               }
            }

            String[] var6 = (String[])this.field5277;
            this.field5281 = new class227(class109.method978(~arg0, var6.length));
            int var7 = 0;
            if (var2 || var7 < var6.length) {
               do {
                  if (var6[var7] != null) {
                     class89 var8 = new class89(var6[var7], var7);
                     this.field5281.method1808(class139.method1156(var6[var7], -102), var8, 26459);
                  }

                  ++var7;
               } while(var7 < var6.length);
            }
         }

         ++field5278;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field5297[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public final boolean method3015(String arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field5276;
         if (this.field5277 == null) {
            return false;
         } else {
            if (this.field5281 == null) {
               this.method3014(0);
            }

            class89 var4 = (class89)this.field5281.method1818(-1, class139.method1156(arg0, -86));
            if (var3) {
               if (var4.field1204.equals(arg0)) {
                  return true;
               }

               var4 = (class89)this.field5281.method1816((byte)-115);
            }

            while(true) {
               int var10000;
               if (var4 == null) {
                  var10000 = arg1;
                  if (!var3) {
                     if (arg1 != 1) {
                        field5295 = null;
                     }

                     return false;
                  }
               } else {
                  var10000 = var4.field1204.equals(arg0);
               }

               if (var10000 != 0) {
                  return true;
               }

               var4 = (class89)this.field5281.method1816((byte)-115);
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5297[5] + (arg0 != null ? field5297[2] : field5297[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Lgea;IZ)V"
   )
   private final void method3016(class66 arg0, int arg1, boolean arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg2) {
            this.method3012((byte)-97);
         }

         ++field5284;
         if (arg1 == 1) {
            this.field5287 = class123.method1076(arg0.method628((byte)-12), -25094);
         } else if (~arg1 == -3) {
            this.field5280 = class123.method1076(arg0.method628((byte)-12), -25094);
         } else if (arg1 != 3) {
            if (arg1 == 4) {
               this.field5294 = arg0.method610(-7);
            } else if (arg1 != 5 && arg1 != 6) {
               if (~arg1 != -8) {
                  if (arg1 == 8) {
                     int var13 = arg0.method603(-2);
                     this.field5283 = arg0.method603(-2);
                     Integer[] var14 = new Integer[var13];
                     int var15 = 0;
                     if (!var4 && var15 >= this.field5283) {
                        this.field5277 = var14;
                     } else {
                        do {
                           int var16 = arg0.method603(-2);
                           var14[var16] = new Integer(arg0.method610(124));
                           ++var15;
                        } while(var15 < this.field5283);

                        this.field5277 = var14;
                     }
                  }
               } else {
                  int var9 = arg0.method603(-2);
                  this.field5283 = arg0.method603(-2);
                  String[] var10 = new String[var9];
                  int var11 = 0;
                  if (!var4 && var11 >= this.field5283) {
                     this.field5277 = var10;
                  } else {
                     do {
                        int var12 = arg0.method603(-2);
                        var10[var12] = arg0.method606(11856);
                        ++var11;
                     } while(var11 < this.field5283);

                     this.field5277 = var10;
                  }
               }
            } else {
               this.field5283 = arg0.method603(-2);
               class227 var5 = new class227(class109.method978(-1, this.field5283));
               int var6 = 0;
               if (!var4 && ~var6 <= ~this.field5283) {
                  this.field5277 = var5;
               } else {
                  do {
                     int var7 = arg0.method610(-2);
                     class217 var19;
                     if (~arg1 != -6) {
                        class278 var8 = new class278(arg0.method610(-87));
                        if (var4) {
                           var19 = new class217(arg0.method606(11856));
                           var5.method1808((long)var7, var19, 26459);
                           ++var6;
                        } else {
                           var5.method1808((long)var7, var8, 26459);
                           ++var6;
                        }
                     } else {
                        var19 = new class217(arg0.method606(11856));
                        var5.method1808((long)var7, var19, 26459);
                        ++var6;
                     }
                  } while(~var6 > ~this.field5283);

                  this.field5277 = var5;
               }
            }
         } else {
            this.field5279 = arg0.method606(11856);
         }
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field5297[11] + (arg0 != null ? field5297[2] : field5297[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3017(boolean arg0) {
      try {
         field5295 = null;
         field5289 = null;
         if (arg0) {
            method3017(true);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5297[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "b",
      descriptor = "(II)Ljava/lang/String;"
   )
   public final String method3018(int arg0, int arg1) {
      try {
         ++field5285;
         if (this.field5277 == null) {
            return this.field5279;
         } else if (arg0 <= 19) {
            return null;
         } else if (!(this.field5277 instanceof class227)) {
            String[] var3 = (String[])this.field5277;
            if (arg1 >= 0 && ~arg1 > ~var3.length) {
               String var4 = var3[arg1];
               return var4 != null ? var4 : this.field5279;
            } else {
               return this.field5279;
            }
         } else {
            class217 var5 = (class217)((class227)this.field5277).method1818(-1, (long)arg1);
            return var5 != null ? var5.field2751 : this.field5279;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5297[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method3019(int arg0, int arg1) {
      try {
         ++field5286;
         if (arg0 > -40) {
            this.method3015((String)null, 99);
         }

         if (this.field5277 == null) {
            return false;
         } else {
            if (this.field5281 == null) {
               this.method3021((byte)-3);
            }

            class278 var3 = (class278)this.field5281.method1818(-1, (long)arg1);
            return var3 != null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5297[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method3020(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         while(true) {
            int var4 = arg1.method640(255);
            if (~var4 != -1) {
               this.method3016(arg1, var4, false);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field5292;
            break;
         }

         if (arg0 > -106) {
            field5295 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5297[13] + arg0 + ',' + (arg1 != null ? field5297[2] : field5297[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mga",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method3021(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mga",
      name = "a",
      descriptor = "([Lnl;II)V"
   )
   public static final void method3022(class713[] arg0, int arg1, int arg2) {
      if (arg1 < arg2) {
         int var3 = (arg1 + arg2) / 2;
         int var4 = arg1;
         class713 var5 = arg0[var3];
         arg0[var3] = arg0[arg2];
         arg0[arg2] = var5;
         int var6 = var5.field10460;

         for(int var7 = arg1; var7 < arg2; ++var7) {
            if (arg0[var7].field10460 < (var7 & 1) + var6) {
               class713 var8 = arg0[var7];
               arg0[var7] = arg0[var4];
               arg0[var4++] = var8;
            }
         }

         arg0[arg2] = arg0[var4];
         arg0[var4] = var5;
         method3022(arg0, arg1, var4 - 1);
         method3022(arg0, var4 + 1, arg2);
      }

   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3023(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3024(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
