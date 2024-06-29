import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class266 {
   @OriginalMember(
      owner = "client!c",
      name = "m",
      descriptor = "I"
   )
   public int field4066 = -1;
   @OriginalMember(
      owner = "client!c",
      name = "s",
      descriptor = "I"
   )
   public int field4067 = 512;
   @OriginalMember(
      owner = "client!c",
      name = "d",
      descriptor = "Z"
   )
   public boolean field4065 = true;
   @OriginalMember(
      owner = "client!c",
      name = "q",
      descriptor = "Z"
   )
   public boolean field4069 = true;
   @OriginalMember(
      owner = "client!c",
      name = "o",
      descriptor = "I"
   )
   private int field4059 = 0;
   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4074 = new String[]{method2280(method2279("B<Aj")), method2280(method2279("Wg\u0003(q")), method2280(method2279("Oge.")), method2280(method2279("Ogl.")), method2280(method2279("Ogj.")), method2280(method2279("Ogh.")), method2280(method2279("Ogi.")), method2280(method2279("Ogn.")), method2280(method2279("Ogo."))};
   @OriginalMember(
      owner = "client!c",
      name = "f",
      descriptor = "[Z"
   )
   public static boolean[] field4058 = new boolean[100];
   @OriginalMember(
      owner = "client!c",
      name = "l",
      descriptor = "I"
   )
   public int field4054;
   @OriginalMember(
      owner = "client!c",
      name = "g",
      descriptor = "I"
   )
   public static int field4056;
   @OriginalMember(
      owner = "client!c",
      name = "i",
      descriptor = "I"
   )
   public static int field4057;
   @OriginalMember(
      owner = "client!c",
      name = "e",
      descriptor = "I"
   )
   public static int field4061;
   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "I"
   )
   public int field4062;
   @OriginalMember(
      owner = "client!c",
      name = "t",
      descriptor = "I"
   )
   public static int field4064;
   @OriginalMember(
      owner = "client!c",
      name = "p",
      descriptor = "I"
   )
   public static int field4068;
   @OriginalMember(
      owner = "client!c",
      name = "c",
      descriptor = "I"
   )
   public static int field4070;
   @OriginalMember(
      owner = "client!c",
      name = "n",
      descriptor = "I"
   )
   public int field4071;
   @OriginalMember(
      owner = "client!c",
      name = "j",
      descriptor = "I"
   )
   public static int field4072;
   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "I"
   )
   public int field4073;
   @OriginalMember(
      owner = "client!c",
      name = "k",
      descriptor = "Lsa;"
   )
   public static class39 field4063;
   @OriginalMember(
      owner = "client!c",
      name = "h",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field4060;
   @OriginalMember(
      owner = "client!c",
      name = "r",
      descriptor = "[[S"
   )
   public static short[][] field4055;

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(BI)V"
   )
   private final void method2271(byte arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field4068;
         double var4 = (double)((arg1 & 16745582) >> 16) / 256.0D;
         double var6 = (double)((arg1 & 65398) >> 8) / 256.0D;
         double var8 = (double)(255 & arg1) / 256.0D;
         double var10 = var4;
         if (var4 > var6) {
            var10 = var6;
         }

         if (var10 > var8) {
            var10 = var8;
         }

         double var12 = var4;
         if (var6 > var4) {
            var12 = var6;
         }

         if (var12 < var8) {
            var12 = var8;
         }

         double var14 = 0.0D;
         double var16 = 0.0D;
         double var18 = (var10 + var12) / 2.0D;
         if (var10 != var12) {
            label95: {
               if (var18 < 0.5D) {
                  var16 = (var12 - var10) / (var10 + var12);
               }

               if (var18 >= 0.5D) {
                  var16 = (-var10 + var12) / (-var12 + 2.0D + -var10);
               }

               if (var4 != var12) {
                  if (var6 != var12) {
                     if (var8 != var12) {
                        break label95;
                     }

                     var14 = (var4 - var6) / (var12 - var10) + 4.0D;
                     if (!var3) {
                        break label95;
                     }
                  }

                  var14 = (var8 - var4) / (-var10 + var12) + 2.0D;
                  if (!var3) {
                     break label95;
                  }
               }

               var14 = (var6 - var8) / (-var10 + var12);
            }
         }

         double var20;
         label70: {
            this.field4062 = (int)(var18 * 256.0D);
            var20 = var14 / 6.0D;
            this.field4071 = (int)(var16 * 256.0D);
            if (!(var18 > 0.5D)) {
               this.field4054 = (int)(var16 * var18 * 512.0D);
               if (!var3) {
                  break label70;
               }
            }

            this.field4054 = (int)((1.0D - var18) * var16 * 512.0D);
         }

         label65: {
            int var22 = 14 / ((2 - arg0) / 61);
            if (~this.field4062 > -1) {
               this.field4062 = 0;
               if (!var3) {
                  break label65;
               }
            }

            if (this.field4062 > 255) {
               this.field4062 = 255;
            }
         }

         label60: {
            if (this.field4071 < 0) {
               this.field4071 = 0;
               if (!var3) {
                  break label60;
               }
            }

            if (~this.field4071 < -256) {
               this.field4071 = 255;
            }
         }

         if (~this.field4054 > -2) {
            this.field4054 = 1;
         }

         this.field4073 = (int)((double)this.field4054 * var20);
      } catch (RuntimeException var24) {
         throw class612.method4503(var24, field4074[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(Lcu;IB)V"
   )
   private final void method2272(class65 arg0, int arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         label65: {
            if (arg1 == 1) {
               this.field4059 = arg0.method691((byte)-128);
               this.method2271((byte)87, this.field4059);
               if (!var4) {
                  break label65;
               }
            }

            if (arg1 == 2) {
               this.field4066 = arg0.method685(-2);
               if (this.field4066 != 65535) {
                  break label65;
               }

               this.field4066 = -1;
               if (!var4) {
                  break label65;
               }
            }

            if (~arg1 == -4) {
               this.field4067 = arg0.method685(arg2 + -122) << 2;
               if (!var4) {
                  break label65;
               }
            }

            if (arg1 != 4) {
               if (arg1 != 5) {
                  break label65;
               }

               this.field4065 = false;
               if (!var4) {
                  break label65;
               }
            }

            this.field4069 = false;
         }

         ++field4061;
         if (arg2 != 120) {
            this.field4073 = 115;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4074[4] + (arg0 != null ? field4074[1] : field4074[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2273(byte arg0) {
      try {
         field4060 = null;
         int var1 = -4 % ((arg0 - -4) / 54);
         field4063 = null;
         field4058 = null;
         field4055 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4074[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method2274(int arg0, int arg1, int arg2) {
      class312 var3 = class324.field4826[arg0][arg1][arg2];
      if (var3 != null) {
         class631.method4625(var3.field4688);
         class631.method4625(var3.field4689);
         if (var3.field4688 != null) {
            var3.field4688 = null;
         }

         if (var3.field4689 != null) {
            var3.field4689 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "([[FI[[S)[[S"
   )
   public static final short[][] method2275(float[][] arg0, int arg1, short[][] arg2) {
      boolean var3 = client.field10022;

      try {
         int var4 = 0;
         int var10000;
         int var5;
         if (arg1 != 4913) {
            field4060 = null;
            if (var3) {
               var5 = 0;
               if (var3) {
                  arg2[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
                  ++var5;
               }
            } else {
               if (~arg0.length >= ~var4) {
                  var10000 = field4072 + 1;
                  if (!var3) {
                     field4072 = var10000;
                     return arg2;
                  }
               } else {
                  var10000 = 0;
               }

               var5 = var10000;
               if (var3) {
                  arg2[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
                  ++var5;
               }
            }
         } else {
            if (~arg0.length >= ~var4) {
               var10000 = field4072 + 1;
               if (!var3) {
                  field4072 = var10000;
                  return arg2;
               }
            } else {
               var10000 = 0;
            }

            var5 = var10000;
            if (var3) {
               arg2[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
               ++var5;
            }
         }

         while(true) {
            while(arg2[var4].length > var5) {
               arg2[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
               ++var5;
            }

            if (!var3) {
               ++var4;
               if (~arg0.length >= ~var4) {
                  var10000 = field4072 + 1;
                  if (!var3) {
                     field4072 = var10000;
                     return arg2;
                  }
               } else {
                  var10000 = 0;
               }

               var5 = var10000;
               if (var3) {
                  arg2[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
                  ++var5;
               }
            } else {
               ++var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field4074[6] + (arg0 != null ? field4074[1] : field4074[0]) + ',' + arg1 + ',' + (arg2 != null ? field4074[1] : field4074[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2276(int arg0, int arg1, int arg2) {
      try {
         ++field4064;
         if (!class428.method3349(arg1, arg0, -87)) {
            return false;
         } else {
            int var3 = -11 % ((arg2 - 66) / 49);
            return ~(45056 & arg0) != -1 | class431.method3361(arg1, arg0, (byte)32) | class51.method553(false, arg0, arg1) ? true : (arg1 & 55) == 0 & (class512.method3859(arg0, 544, arg1) | class662.method4804(arg1, (byte)-120, arg0));
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4074[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(I[BII)Ljava/lang/String;"
   )
   public static final String method2277(int arg0, byte[] arg1, int arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         ++field4070;
         char[] var5 = new char[arg3];
         int var6 = 0;
         int var7 = arg2;
         int var8 = arg2 + arg3;
         if (arg0 < 103) {
            return null;
         } else {
            while(var7 < var8) {
               int var10;
               label122: {
                  int var9 = 255 & arg1[var7++];
                  if (~var9 <= -129) {
                     if (var9 < 192) {
                        var10 = 65533;
                        if (!var4) {
                           break label122;
                        }
                     }

                     if (~var9 > -225) {
                        if (~var7 <= ~var8 || (192 & arg1[var7]) != 128) {
                           var10 = 65533;
                           if (!var4) {
                              break label122;
                           }
                        }

                        var10 = var9 << 6 & 1984 | arg1[var7++] & 63;
                        if (~var10 <= -129) {
                           break label122;
                        }

                        var10 = 65533;
                        if (!var4) {
                           break label122;
                        }
                     }

                     if (~var9 > -241) {
                        if (~var8 < ~(var7 + 1) && ~(arg1[var7] & 192) == -129 && ~(arg1[var7 + 1] & 192) == -129) {
                           var10 = var9 << 12 & 61440 | arg1[var7++] << 6 & 4032 | 63 & arg1[var7++];
                           if (var10 >= 2048) {
                              break label122;
                           }

                           var10 = 65533;
                           if (!var4) {
                              break label122;
                           }
                        }

                        var10 = 65533;
                        if (!var4) {
                           break label122;
                        }
                     }

                     if (var9 >= 248) {
                        var10 = 65533;
                        if (!var4) {
                           break label122;
                        }
                     }

                     if (~var8 >= ~(var7 + 2) || ~(arg1[var7] & 192) != -129 || ~(arg1[var7 - -1] & 192) != -129 || (arg1[var7 - -2] & 192) != 128) {
                        var10 = 65533;
                        if (!var4) {
                           break label122;
                        }
                     }

                     int var11 = arg1[var7++] << 12 & 258048 | var9 << 18 & 1835008 | (arg1[var7++] & 63) << 6 | 63 & arg1[var7++];
                     if (var11 >= 65536 && ~var11 >= -1114112) {
                        var10 = 65533;
                        if (!var4) {
                           break label122;
                        }
                     }

                     var10 = 65533;
                     if (!var4) {
                        break label122;
                     }
                  }

                  if (~var9 != -1) {
                     var10 = var9;
                     if (!var4) {
                        break label122;
                     }
                  }

                  var10 = 65533;
               }

               var5[var6++] = (char)var10;
            }

            return new String(var5, 0, var6);
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field4074[2] + arg0 + ',' + (arg1 != null ? field4074[1] : field4074[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "a",
      descriptor = "(ZLcu;)V"
   )
   public final void method2278(boolean arg0, class65 arg1) {
      boolean var3 = client.field10022;

      try {
         while(true) {
            int var4 = arg1.method665(arg0);
            if (~var4 != -1) {
               this.method2272(arg1, var4, (byte)120);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field4057;
            break;
         }

         if (arg0) {
            field4058 = null;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4074[7] + arg0 + ',' + (arg1 != null ? field4074[1] : field4074[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2279(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!c",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2280(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
