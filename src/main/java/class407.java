import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class407 extends class264 {
   @OriginalMember(
      owner = "client!uj",
      name = "O",
      descriptor = "I"
   )
   private int field5871 = 1024;
   @OriginalMember(
      owner = "client!uj",
      name = "M",
      descriptor = "I"
   )
   private int field5874 = 8;
   @OriginalMember(
      owner = "client!uj",
      name = "L",
      descriptor = "I"
   )
   private int field5881 = 409;
   @OriginalMember(
      owner = "client!uj",
      name = "F",
      descriptor = "I"
   )
   private int field5876 = 1024;
   @OriginalMember(
      owner = "client!uj",
      name = "J",
      descriptor = "I"
   )
   private int field5872 = 81;
   @OriginalMember(
      owner = "client!uj",
      name = "bb",
      descriptor = "I"
   )
   private int field5873 = 204;
   @OriginalMember(
      owner = "client!uj",
      name = "H",
      descriptor = "I"
   )
   private int field5891 = 4;
   @OriginalMember(
      owner = "client!uj",
      name = "W",
      descriptor = "I"
   )
   private int field5887 = 0;
   @OriginalMember(
      owner = "client!uj",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5893 = new String[]{method3069(method3068("v\u0010V8q")), method3069(method3068("v\u0010V>q")), method3069(method3068("xTV\\$")), method3069(method3068("m\u000f\u0014\u001e")), method3069(method3068("v\u0010V3q")), method3069(method3068("v\u0010V0q")), method3069(method3068("v\u0010V;q")), method3069(method3068("v\u0010V9q"))};
   @OriginalMember(
      owner = "client!uj",
      name = "V",
      descriptor = "Leg;"
   )
   public static class118 field5879 = new class118(12, 0);
   @OriginalMember(
      owner = "client!uj",
      name = "Q",
      descriptor = "I"
   )
   public static int field5875;
   @OriginalMember(
      owner = "client!uj",
      name = "I",
      descriptor = "I"
   )
   private int field5878;
   @OriginalMember(
      owner = "client!uj",
      name = "N",
      descriptor = "I"
   )
   public static int field5880;
   @OriginalMember(
      owner = "client!uj",
      name = "S",
      descriptor = "I"
   )
   private int field5882;
   @OriginalMember(
      owner = "client!uj",
      name = "G",
      descriptor = "I"
   )
   private int field5883;
   @OriginalMember(
      owner = "client!uj",
      name = "X",
      descriptor = "I"
   )
   public static int field5884;
   @OriginalMember(
      owner = "client!uj",
      name = "Z",
      descriptor = "I"
   )
   public static int field5885;
   @OriginalMember(
      owner = "client!uj",
      name = "P",
      descriptor = "I"
   )
   public static int field5888;
   @OriginalMember(
      owner = "client!uj",
      name = "ab",
      descriptor = "I"
   )
   public static int field5889;
   @OriginalMember(
      owner = "client!uj",
      name = "Y",
      descriptor = "[I"
   )
   private int[] field5877;
   @OriginalMember(
      owner = "client!uj",
      name = "T",
      descriptor = "[I"
   )
   public static int[] field5890;
   @OriginalMember(
      owner = "client!uj",
      name = "K",
      descriptor = "[[I"
   )
   private int[][] field5886;
   @OriginalMember(
      owner = "client!uj",
      name = "U",
      descriptor = "[[I"
   )
   private int[][] field5892;

   @OriginalMember(
      owner = "client!uj",
      name = "d",
      descriptor = "(I)V",
      line = 4
   )
   private final void method3065(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uj",
      name = "<init>",
      descriptor = "()V",
      line = 70
   )
   public class407() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!uj",
      name = "c",
      descriptor = "(Z)V",
      line = 85
   )
   public static void method3066(boolean arg0) {
      try {
         if (!arg0) {
            field5885 = 52;
         }

         field5890 = null;
         field5879 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5893[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 102
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label91: {
            label90: {
               label89: {
                  label88: {
                     label87: {
                        label86: {
                           label85: {
                              label84: {
                                 if (~arg0 != -1) {
                                    if (~arg0 == -2) {
                                       break label84;
                                    }

                                    if (arg0 == 2) {
                                       break label85;
                                    }

                                    if (arg0 == 3) {
                                       break label86;
                                    }

                                    if (~arg0 == -5) {
                                       break label87;
                                    }

                                    if (~arg0 == -6) {
                                       break label88;
                                    }

                                    if (~arg0 == -7) {
                                       break label89;
                                    }

                                    if (arg0 != 7) {
                                       break label91;
                                    }

                                    if (!var4) {
                                       break label90;
                                    }
                                 }

                                 this.field5891 = arg1.method1143(-15465);
                                 if (!var4) {
                                    break label91;
                                 }
                              }

                              this.field5874 = arg1.method1143(-15465);
                              if (!var4) {
                                 break label91;
                              }
                           }

                           this.field5881 = arg1.method1211(-26166);
                           if (!var4) {
                              break label91;
                           }
                        }

                        this.field5873 = arg1.method1211(-26166);
                        if (!var4) {
                           break label91;
                        }
                     }

                     this.field5876 = arg1.method1211(-26166);
                     if (!var4) {
                        break label91;
                     }
                  }

                  this.field5887 = arg1.method1211(-26166);
                  if (!var4) {
                     break label91;
                  }
               }

               this.field5872 = arg1.method1211(-26166);
               if (!var4) {
                  break label91;
               }
            }

            this.field5871 = arg1.method1211(-26166);
         }

         ++field5884;
         if (arg2 < 49) {
            this.field5881 = -72;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5893[4] + arg0 + ',' + (arg1 != null ? field5893[2] : field5893[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(I)V",
      line = 187
   )
   public final void method413(int arg0) {
      try {
         ++field5875;
         this.method3065(0);
         if (arg0 < 49) {
            this.field5882 = 100;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5893[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(II)[I",
      line = 218
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field5888;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         int var5 = -88 / ((arg1 - 24) / 44);
         if (super.field3641.field5922) {
            int var6 = 0;
            int var7 = class666.field9668[arg0] + this.field5887;
            if (var3) {
               var7 += 4096;
            }

            while(~var7 > -1) {
               var7 += 4096;
            }

            if (var3) {
               var7 -= 4096;
            }

            while(~var7 < -4097) {
               var7 -= 4096;
            }

            int var8;
            int var10000;
            int var10001;
            label157: {
               if (var3) {
                  var10000 = ~var7;
                  var10001 = ~this.field5877[var6];
               } else if (var6 >= this.field5874) {
                  var8 = var6 + -1;
                  var10000 = ~(1 & var6);
                  var10001 = -1;
                  if (!var3) {
                     break label157;
                  }
               } else {
                  var10000 = ~var7;
                  var10001 = ~this.field5877[var6];
               }

               label156:
               while(true) {
                  while(var10000 > var10001) {
                     var8 = var6 + -1;
                     var10000 = ~(1 & var6);
                     var10001 = -1;
                     if (!var3) {
                        break label156;
                     }
                  }

                  ++var6;
                  if (var6 >= this.field5874) {
                     var8 = var6 + -1;
                     var10000 = ~(1 & var6);
                     var10001 = -1;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var10000 = ~var7;
                     var10001 = ~this.field5877[var6];
                  }
               }
            }

            boolean var9 = var10000 == var10001;
            int var10 = this.field5877[var6];
            int var11 = this.field5877[var6 + -1];
            if (~var7 < ~(this.field5878 + var11) && var7 < -this.field5878 + var10) {
               int var12 = 0;
               if (var3 || var12 < class430.field6152) {
                  do {
                     int var13 = 0;
                     int var14 = !var9 ? -this.field5876 : this.field5876;
                     int var15 = (this.field5883 * var14 >> 12) + class258.field3496[var12];
                     if (var3) {
                        var15 += 4096;
                     }

                     while(~var15 > -1) {
                        var15 += 4096;
                     }

                     if (var3) {
                        var15 -= 4096;
                     }

                     while(~var15 < -4097) {
                        var15 -= 4096;
                     }

                     int var16;
                     int var17;
                     label115: {
                        int var18;
                        if (var3) {
                           var10000 = var15;
                           var10001 = this.field5886[var8][var13];
                        } else if (~this.field5891 >= ~var13) {
                           var16 = var13 + -1;
                           var17 = this.field5886[var8][var13];
                           var18 = this.field5886[var8][var16];
                           var10000 = ~var15;
                           var10001 = ~(this.field5878 + var18);
                           if (!var3) {
                              break label115;
                           }
                        } else {
                           var10000 = var15;
                           var10001 = this.field5886[var8][var13];
                        }

                        label114:
                        while(true) {
                           while(var10000 < var10001) {
                              var16 = var13 + -1;
                              var17 = this.field5886[var8][var13];
                              var18 = this.field5886[var8][var16];
                              var10000 = ~var15;
                              var10001 = ~(this.field5878 + var18);
                              if (!var3) {
                                 break label114;
                              }
                           }

                           ++var13;
                           if (~this.field5891 >= ~var13) {
                              var16 = var13 + -1;
                              var17 = this.field5886[var8][var13];
                              var18 = this.field5886[var8][var16];
                              var10000 = ~var15;
                              var10001 = ~(this.field5878 + var18);
                              if (!var3) {
                                 break;
                              }
                           } else {
                              var10000 = var15;
                              var10001 = this.field5886[var8][var13];
                           }
                        }
                     }

                     if (var10000 >= var10001 || var15 >= -this.field5878 + var17) {
                        var4[var12] = 0;
                        if (!var3) {
                           ++var12;
                           continue;
                        }
                     }

                     var4[var12] = this.field5892[var8][var16];
                     ++var12;
                  } while(var12 < class430.field6152);
               }

               if (!var3) {
                  return var4;
               }
            }

            class242.method1854(var4, 0, class430.field6152, 0);
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class237.method1823(var20, field5893[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "a",
      descriptor = "(ZIIIZII)V",
      line = 320
   )
   public static final void method3067(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         ++field5889;
         if (arg6 < arg1) {
            int var8 = (arg1 + arg6) / 2;
            int var9 = arg6;
            class503 var10 = class316.field4305[var8];
            class316.field4305[var8] = class316.field4305[arg1];
            class316.field4305[arg1] = var10;
            int var11 = arg6;
            class503 var12;
            if (var7) {
               if (~class781.method5631(arg3, (boolean)arg0, arg2, var10, arg4, 10, class316.field4305[arg6]) >= -1) {
                  var12 = class316.field4305[arg6];
                  class316.field4305[arg6] = class316.field4305[arg6];
                  var9 = arg6 + 1;
                  class316.field4305[arg6] = var12;
               }

               var11 = arg6 + 1;
            }

            while(true) {
               int var10000;
               int var10001;
               int var10002;
               if (~arg1 >= ~var11) {
                  class316.field4305[arg1] = class316.field4305[var9];
                  class316.field4305[var9] = var10;
                  method3067((boolean)arg0, var9 + -1, arg2, arg3, arg4, -83, arg6);
                  var10000 = arg0;
                  var10001 = arg1;
                  var10002 = arg2;
                  if (!var7) {
                     method3067((boolean)arg0, arg1, arg2, arg3, arg4, -98, var9 + 1);
                     break;
                  }
               } else {
                  var10000 = arg3;
                  var10001 = arg0;
                  var10002 = arg2;
               }

               if (~class781.method5631(var10000, (boolean)var10001, var10002, var10, arg4, 10, class316.field4305[var11]) >= -1) {
                  var12 = class316.field4305[var11];
                  class316.field4305[var11] = class316.field4305[var9];
                  class316.field4305[var9++] = var12;
               }

               ++var11;
            }
         }

         if (arg5 > -20) {
            method3067(true, -45, 24, -86, false, -123, 96);
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field5893[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3068(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3069(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
