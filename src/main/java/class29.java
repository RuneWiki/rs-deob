import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class29 extends class305 {
   @OriginalMember(
      owner = "client!qaa",
      name = "J",
      descriptor = "Z"
   )
   public boolean field453 = true;
   @OriginalMember(
      owner = "client!qaa",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field459 = new String[]{method218(method217("cY\"V-:")), method218(method217("i\u0016mV\u0019")), method218(method217("|M/\u0014")), method218(method217("cY\"V.:")), method218(method217("cY\"V,:")), method218(method217("cY\"V :")), method218(method217("cY\"V%:")), method218(method217("<\u0016m")), method218(method217("cY\"V#:")), method218(method217("cY\"V!:")), method218(method217("cY\"V':")), method218(method217("cY\"V\":")), method218(method217("cY\"V&:"))};
   @OriginalMember(
      owner = "client!qaa",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field448 = new int[]{1, 0, -1, 0};
   @OriginalMember(
      owner = "client!qaa",
      name = "F",
      descriptor = "Lgh;"
   )
   public static class572 field449 = new class572(130, 3);
   @OriginalMember(
      owner = "client!qaa",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field454 = new String[100];
   @OriginalMember(
      owner = "client!qaa",
      name = "M",
      descriptor = "I"
   )
   public static int field458 = 0;
   @OriginalMember(
      owner = "client!qaa",
      name = "A",
      descriptor = "F"
   )
   public static float field456;
   @OriginalMember(
      owner = "client!qaa",
      name = "P",
      descriptor = "F"
   )
   public static float field457;
   @OriginalMember(
      owner = "client!qaa",
      name = "L",
      descriptor = "I"
   )
   public static int field438;
   @OriginalMember(
      owner = "client!qaa",
      name = "y",
      descriptor = "I"
   )
   public static int field439;
   @OriginalMember(
      owner = "client!qaa",
      name = "E",
      descriptor = "I"
   )
   public static int field441;
   @OriginalMember(
      owner = "client!qaa",
      name = "C",
      descriptor = "I"
   )
   public static int field443;
   @OriginalMember(
      owner = "client!qaa",
      name = "w",
      descriptor = "I"
   )
   public static int field444;
   @OriginalMember(
      owner = "client!qaa",
      name = "v",
      descriptor = "I"
   )
   public static int field445;
   @OriginalMember(
      owner = "client!qaa",
      name = "N",
      descriptor = "I"
   )
   public static int field447;
   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "I"
   )
   public static int field450;
   @OriginalMember(
      owner = "client!qaa",
      name = "O",
      descriptor = "I"
   )
   public static int field451;
   @OriginalMember(
      owner = "client!qaa",
      name = "x",
      descriptor = "Ldb;"
   )
   public class340 field452;
   @OriginalMember(
      owner = "client!qaa",
      name = "I",
      descriptor = "Lar;"
   )
   public static class709 field455;
   @OriginalMember(
      owner = "client!qaa",
      name = "K",
      descriptor = "[I"
   )
   private int[] field437;
   @OriginalMember(
      owner = "client!qaa",
      name = "B",
      descriptor = "[I"
   )
   public int[] field446;
   @OriginalMember(
      owner = "client!qaa",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field442;
   @OriginalMember(
      owner = "client!qaa",
      name = "G",
      descriptor = "[[I"
   )
   private int[][] field440;

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(I)I",
      line = 5
   )
   public final int method207(int arg0) {
      try {
         ++field443;
         if (this.field437 == null) {
            return 0;
         } else {
            if (arg0 != -24361) {
               this.method210((class473)null, (byte)45, (int[])null);
            }

            return this.field437.length;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field459[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(III)I",
      line = 21
   )
   public final int method208(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 19084) {
            return -52;
         } else {
            ++field450;
            if (this.field437 != null && arg1 >= 0 && ~arg1 >= ~this.field437.length) {
               return this.field440[arg1] != null && arg0 >= 0 && ~arg0 >= ~this.field440[arg1].length ? this.field440[arg1][arg0] : -1;
            } else {
               return -1;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field459[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "b",
      descriptor = "(Z)V",
      line = 39
   )
   public final void method209(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         if (this.field446 != null) {
            int var3 = 0;
            if (var2 || var3 < this.field446.length) {
               do {
                  this.field446[var3] = class93.method899(this.field446[var3], 32768);
                  ++var3;
               } while(var3 < this.field446.length);
            }
         }

         if (!arg0) {
            field448 = null;
         }

         ++field451;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field459[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Luda;B[I)V",
      line = 65
   )
   public final void method210(class473 arg0, byte arg1, int[] arg2) {
      boolean var4 = client.field4564;

      try {
         ++field445;
         if (this.field437 != null) {
            int var5 = -95 / ((arg1 - 76) / 34);
            int var6 = 0;
            if (!var4) {
               if (this.field437.length <= var6) {
                  return;
               }

               if (var6 >= arg2.length) {
                  return;
               }
            }

            do {
               int var7 = this.method215(var6, (byte)-106).field3380;
               if (~var7 < -1) {
                  arg0.method3535(8, (long)arg2[var6], var7);
               }

               ++var6;
               if (this.field437.length <= var6) {
                  return;
               }
            } while(var6 < arg2.length);

         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field459[8] + (arg0 != null ? field459[1] : field459[2]) + ',' + arg1 + ',' + (arg2 != null ? field459[1] : field459[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "h",
      descriptor = "(I)V",
      line = 92
   )
   public static void method211(int arg0) {
      try {
         if (arg0 != 0) {
            method211(91);
         }

         field448 = null;
         field455 = null;
         field449 = null;
         field454 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field459[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(B)Ljava/lang/String;",
      line = 106
   )
   public final String method212(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field441;
         StringBuffer var3 = new StringBuffer(80);
         if (this.field442 == null) {
            return "";
         } else {
            var3.append(this.field442[0]);
            int var4 = 1;
            if (var2) {
               var3.append(field459[7]);
               var3.append(this.field442[var4]);
               ++var4;
            }

            while(true) {
               while(~var4 > ~this.field442.length) {
                  var3.append(field459[7]);
                  var3.append(this.field442[var4]);
                  ++var4;
               }

               if (!var2) {
                  if (arg0 != 11) {
                     this.method215(38, (byte)115);
                  }

                  return var3.toString();
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field459[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IILuda;)V",
      line = 136
   )
   private final void method213(int arg0, int arg1, class473 arg2) {
      boolean var4 = client.field4564;

      try {
         label103: {
            int var5 = -31 % ((49 - arg0) / 54);
            if (arg1 != 1) {
               if (arg1 == 2) {
                  int var6 = arg2.method3564((byte)-47);
                  this.field446 = new int[var6];
                  int var7 = 0;
                  if (var4) {
                     this.field446[var7] = arg2.method3565(true);
                     ++var7;
                  }

                  while(true) {
                     while(~var6 < ~var7) {
                        this.field446[var7] = arg2.method3565(true);
                        ++var7;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label103;
                        }
                        break;
                     }

                     ++var7;
                  }
               }

               if (arg1 == 3) {
                  int var8 = arg2.method3564((byte)-125);
                  this.field440 = new int[var8][];
                  this.field437 = new int[var8];
                  int var9 = 0;
                  if (!var4 && ~var9 <= ~var8) {
                     if (!var4) {
                        break label103;
                     }
                  } else {
                     while(true) {
                        int var10 = arg2.method3565(true);
                        class230 var11 = class358.method2816(var10, 0);
                        if (var11 == null) {
                           ++var9;
                        } else {
                           this.field437[var9] = var10;
                           this.field440[var9] = new int[var11.field3378];
                           int var12 = 0;
                           if (var4) {
                              this.field440[var9][var12] = arg2.method3565(true);
                              ++var12;
                           }

                           while(~var12 > ~var11.field3378) {
                              this.field440[var9][var12] = arg2.method3565(true);
                              ++var12;
                           }

                           ++var9;
                        }

                        if (~var9 <= ~var8) {
                           if (!var4) {
                              break label103;
                           }
                           break;
                        }
                     }
                  }
               }

               if (~arg1 != -5) {
                  break label103;
               }

               this.field453 = false;
               if (!var4) {
                  break label103;
               }
            }

            this.field442 = class431.method3250(true, arg2.method3566(-16496688), '<');
         }

         ++field444;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field459[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field459[1] : field459[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(Luda;Z)Ljava/lang/String;",
      line = 210
   )
   public final String method214(class473 arg0, boolean arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1) {
            return null;
         } else {
            ++field438;
            StringBuffer var4 = new StringBuffer(80);
            if (this.field437 != null) {
               int var5 = 0;
               if (var3 || ~this.field437.length < ~var5) {
                  do {
                     var4.append(this.field442[var5]);
                     var4.append(this.field452.method2630(this.method215(var5, (byte)-94), arg0.method3575(class358.method2816(this.field437[var5], 0).field3381, -16399), 1, this.field440[var5]));
                     ++var5;
                  } while(~this.field437.length < ~var5);
               }
            }

            var4.append(this.field442[this.field442.length + -1]);
            return var4.toString();
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field459[9] + (arg0 != null ? field459[1] : field459[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IB)Lhm;",
      line = 239
   )
   public final class230 method215(int arg0, byte arg1) {
      try {
         ++field447;
         if (this.field437 != null && arg0 >= 0 && arg0 <= this.field437.length) {
            if (arg1 > -87) {
               field454 = null;
            }

            return class358.method2816(this.field437[arg0], 0);
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field459[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(BLuda;)V",
      line = 283
   )
   public final void method216(byte arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg0 != 21) {
            this.method208(-125, -19, 107);
         }

         ++field439;

         do {
            int var4 = arg1.method3564((byte)-91);
            if (var4 == 0) {
               break;
            }

            this.method213(126, var4, arg1);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field459[3] + arg0 + ',' + (arg1 != null ? field459[1] : field459[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method217(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method218(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
