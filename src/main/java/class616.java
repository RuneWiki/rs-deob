import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class616 extends class70 {
   @OriginalMember(
      owner = "client!uga",
      name = "R",
      descriptor = "[I"
   )
   private int[] field9069 = new int[3];
   @OriginalMember(
      owner = "client!uga",
      name = "T",
      descriptor = "I"
   )
   private int field9077 = 4096;
   @OriginalMember(
      owner = "client!uga",
      name = "X",
      descriptor = "I"
   )
   private int field9079 = 409;
   @OriginalMember(
      owner = "client!uga",
      name = "Q",
      descriptor = "I"
   )
   private int field9078 = 4096;
   @OriginalMember(
      owner = "client!uga",
      name = "O",
      descriptor = "I"
   )
   private int field9082 = 4096;
   @OriginalMember(
      owner = "client!uga",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9084 = new String[]{method4546(method4545("P7\u001eP;\r")), method4546(method4545("P7\u001eP9\r")), method4546(method4545("P7\u001eP4\r")), method4546(method4545("^~QP\u0001")), method4546(method4545("P7\u001eP6\r")), method4546(method4545("K%\u0013\u0012")), method4546(method4545("Q7\u001e")), method4546(method4545("P7\u001eP?\r")), method4546(method4545("P7\u001eP>\r")), method4546(method4545("P7\u001eP8\r"))};
   @OriginalMember(
      owner = "client!uga",
      name = "U",
      descriptor = "[F"
   )
   public static float[] field9071 = new float[4];
   @OriginalMember(
      owner = "client!uga",
      name = "P",
      descriptor = "I"
   )
   public static int field9074 = 0;
   @OriginalMember(
      owner = "client!uga",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9070 = new String[5];
   @OriginalMember(
      owner = "client!uga",
      name = "S",
      descriptor = "I"
   )
   public static int field9072;
   @OriginalMember(
      owner = "client!uga",
      name = "W",
      descriptor = "I"
   )
   public static int field9073;
   @OriginalMember(
      owner = "client!uga",
      name = "M",
      descriptor = "I"
   )
   public static int field9075;
   @OriginalMember(
      owner = "client!uga",
      name = "L",
      descriptor = "I"
   )
   public static int field9076;
   @OriginalMember(
      owner = "client!uga",
      name = "N",
      descriptor = "I"
   )
   public static int field9080;
   @OriginalMember(
      owner = "client!uga",
      name = "J",
      descriptor = "I"
   )
   public static int field9081;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!uga",
      name = "I",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9083;

   @OriginalMember(
      owner = "client!uga",
      name = "<init>",
      descriptor = "()V"
   )
   public class616() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(BII)V"
   )
   public static final void method4539(byte arg0, int arg1, int arg2) {
      try {
         label33: {
            ++field9080;
            if (class776.field11312 == class688.field10127) {
               if (class412.method3236(false, -2, 1, 0, arg2, arg1, 0, 0, 1)) {
                  return;
               }

               class412.method3236(false, -3, 1, 0, arg2, arg1, 0, 0, 1);
               if (!client.field1481) {
                  break label33;
               }
            }

            if (class412.method3236(false, -3, 1, 0, arg2, arg1, 0, 0, 1)) {
               return;
            }

            class412.method3236(false, -2, 1, 0, arg2, arg1, 0, 0, 1);
         }

         if (arg0 > -54) {
            field9074 = 9;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9084[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg0 > -34) {
            field9070 = null;
         }

         label63: {
            label62: {
               label61: {
                  label60: {
                     label59: {
                        if (~arg2 != -1) {
                           if (~arg2 == -2) {
                              break label59;
                           }

                           if (~arg2 == -3) {
                              break label60;
                           }

                           if (arg2 == 3) {
                              break label61;
                           }

                           if (arg2 != 4) {
                              break label63;
                           }

                           if (!var4) {
                              break label62;
                           }
                        }

                        this.field9079 = arg1.method603(-2);
                        if (!var4) {
                           break label63;
                        }
                     }

                     this.field9077 = arg1.method603(-2);
                     if (!var4) {
                        break label63;
                     }
                  }

                  this.field9078 = arg1.method603(-2);
                  if (!var4) {
                     break label63;
                  }
               }

               this.field9082 = arg1.method603(-2);
               if (!var4) {
                  break label63;
               }
            }

            int var6 = arg1.method645((byte)-26);
            this.field9069[1] = class109.method974(4080, var6 >> 4);
            this.field9069[0] = class109.method974(var6, 16711680) << 4;
            this.field9069[2] = class109.method974(255, var6) >> 12;
         }

         ++field9076;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field9084[7] + arg0 + ',' + (arg1 != null ? field9084[3] : field9084[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(IZLha;)Z"
   )
   public static final boolean method4540(int param0, boolean param1, class479 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(ZB)I"
   )
   public static final int method4541(boolean arg0, byte arg1) {
      try {
         int var2 = 51 / ((39 - arg1) / 34);
         ++field9073;
         int var3 = class175.field2258;
         if (~var3 != -1) {
            if (var3 == 1) {
               return class409.field5641;
            }

            if (var3 != 2) {
               return 0;
            }

            if (!client.field1481) {
               return 0;
            }
         }

         return arg0 ? 0 : class409.field5641;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9084[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field9081;
         if (arg0 != -6752) {
            this.field9078 = 24;
         }

         int[][] var4 = super.field926.method2860(0, arg1);
         if (super.field926.field5048) {
            int[][] var5 = this.method696(arg1, 0, 32767);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            int var13;
            int var14;
            if (var3) {
               var13 = var6[var12];
               var14 = -this.field9069[0] + var13;
               if (~var14 > -1) {
                  var14 = -var14;
               }
            } else {
               if (~class262.field3328 >= ~var12) {
                  return var4;
               }

               var13 = var6[var12];
               var14 = -this.field9069[0] + var13;
               if (~var14 > -1) {
                  var14 = -var14;
               }
            }

            while(true) {
               label103: {
                  int var15;
                  int var16;
                  if (this.field9079 < var14) {
                     var9[var12] = var13;
                     var10[var12] = var7[var12];
                     var11[var12] = var8[var12];
                     if (!var3) {
                        ++var12;
                        break label103;
                     }

                     var15 = var7[var12];
                     var16 = -this.field9069[1] + var15;
                     if (~var16 > -1) {
                        var16 = -var16;
                     }
                  } else {
                     var15 = var7[var12];
                     var16 = -this.field9069[1] + var15;
                     if (~var16 > -1) {
                        var16 = -var16;
                     }
                  }

                  int var17;
                  int var18;
                  if (~var16 < ~this.field9079) {
                     var9[var12] = var13;
                     var10[var12] = var15;
                     var11[var12] = var8[var12];
                     if (var3) {
                        var17 = var8[var12];
                        var18 = -this.field9069[2] + var17;
                        if (var18 < 0) {
                           var18 = -var18;
                        }

                        if (~var18 < ~this.field9079) {
                           var9[var12] = var13;
                           var10[var12] = var15;
                           var11[var12] = var17;
                           if (var3) {
                              var9[var12] = this.field9082 * var13 >> 12;
                              var10[var12] = this.field9078 * var15 >> 12;
                              var11[var12] = this.field9077 * var17 >> 12;
                              ++var12;
                           } else {
                              ++var12;
                           }
                        } else {
                           var9[var12] = this.field9082 * var13 >> 12;
                           var10[var12] = this.field9078 * var15 >> 12;
                           var11[var12] = this.field9077 * var17 >> 12;
                           ++var12;
                        }
                     } else {
                        ++var12;
                     }
                  } else {
                     var17 = var8[var12];
                     var18 = -this.field9069[2] + var17;
                     if (var18 < 0) {
                        var18 = -var18;
                     }

                     if (~var18 < ~this.field9079) {
                        var9[var12] = var13;
                        var10[var12] = var15;
                        var11[var12] = var17;
                        if (var3) {
                           var9[var12] = this.field9082 * var13 >> 12;
                           var10[var12] = this.field9078 * var15 >> 12;
                           var11[var12] = this.field9077 * var17 >> 12;
                           ++var12;
                        } else {
                           ++var12;
                        }
                     } else {
                        var9[var12] = this.field9082 * var13 >> 12;
                        var10[var12] = this.field9078 * var15 >> 12;
                        var11[var12] = this.field9077 * var17 >> 12;
                        ++var12;
                     }
                  }
               }

               if (~class262.field3328 >= ~var12) {
                  break;
               }

               var13 = var6[var12];
               var14 = -this.field9069[0] + var13;
               if (~var14 > -1) {
                  var14 = -var14;
               }
            }
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class93.method866(var20, field9084[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "j",
      descriptor = "(I)V"
   )
   public static void method4542(int arg0) {
      try {
         if (arg0 == 8) {
            field9071 = null;
            field9070 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9084[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method4543(int arg0) {
      try {
         class44.field570.method3201((byte)96);
         ++field9072;
         int var1 = 7 / ((arg0 - 76) / 48);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9084[0] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!uga",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4544(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4545(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4546(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
