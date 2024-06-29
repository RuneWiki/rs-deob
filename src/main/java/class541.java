import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class541 extends class302 {
   @OriginalMember(
      owner = "client!cn",
      name = "O",
      descriptor = "I"
   )
   private int field7882 = 0;
   @OriginalMember(
      owner = "client!cn",
      name = "X",
      descriptor = "I"
   )
   private int field7883 = 0;
   @OriginalMember(
      owner = "client!cn",
      name = "I",
      descriptor = "I"
   )
   private int field7889 = 0;
   @OriginalMember(
      owner = "client!cn",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7894 = new String[]{method4007(method4006("\na\u0010{:")), method4007(method4006("\na\u0010z:")), method4007(method4006("\u0012!\u0010\u0016o")), method4007(method4006("\u0007zRT")), method4007(method4006("\na\u0010~:")), method4007(method4006("\na\u0010i:")), method4007(method4006("\na\u0010}:")), method4007(method4006("\na\u0010\u007f:"))};
   @OriginalMember(
      owner = "client!cn",
      name = "U",
      descriptor = "Lsd;"
   )
   public static class101 field7880 = new class101(60, 3);
   @OriginalMember(
      owner = "client!cn",
      name = "P",
      descriptor = "I"
   )
   public static int field7877;
   @OriginalMember(
      owner = "client!cn",
      name = "V",
      descriptor = "I"
   )
   public static int field7878;
   @OriginalMember(
      owner = "client!cn",
      name = "H",
      descriptor = "I"
   )
   private int field7879;
   @OriginalMember(
      owner = "client!cn",
      name = "J",
      descriptor = "I"
   )
   private int field7881;
   @OriginalMember(
      owner = "client!cn",
      name = "T",
      descriptor = "I"
   )
   public static int field7884;
   @OriginalMember(
      owner = "client!cn",
      name = "L",
      descriptor = "I"
   )
   private int field7885;
   @OriginalMember(
      owner = "client!cn",
      name = "W",
      descriptor = "I"
   )
   private int field7886;
   @OriginalMember(
      owner = "client!cn",
      name = "K",
      descriptor = "I"
   )
   public static int field7887;
   @OriginalMember(
      owner = "client!cn",
      name = "Y",
      descriptor = "I"
   )
   private int field7888;
   @OriginalMember(
      owner = "client!cn",
      name = "M",
      descriptor = "I"
   )
   public static int field7890;
   @OriginalMember(
      owner = "client!cn",
      name = "Q",
      descriptor = "I"
   )
   public static int field7891;
   @OriginalMember(
      owner = "client!cn",
      name = "S",
      descriptor = "I"
   )
   private int field7893;
   @OriginalMember(
      owner = "client!cn",
      name = "R",
      descriptor = "Ltba;"
   )
   public static class172 field7892;

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(BIII)V"
   )
   private final void method4002(byte arg0, int arg1, int arg2, int arg3) {
      int var5 = client.field4530;

      try {
         label83: {
            ++field7877;
            int var6 = ~arg1 >= -2049 ? (arg3 + 4096) * arg1 >> 12 : -(arg1 * arg3 >> 12) + arg3 + arg1;
            if (~var6 >= -1) {
               this.field7893 = this.field7885 = this.field7881 = arg1;
               if (var5 == 0) {
                  break label83;
               }
            }

            int var7;
            int var15;
            label72: {
               int var14;
               label71: {
                  label70: {
                     label69: {
                        label68: {
                           int var19 = arg2 * 6;
                           var7 = -var6 + arg1 + arg1;
                           int var8 = (-var7 + var6 << 12) / var6;
                           int var9 = var19 >> 12;
                           int var10 = var19 - (var9 << 12);
                           int var12 = var8 * var6 >> 12;
                           int var13 = var10 * var12 >> 12;
                           var14 = var7 + var13;
                           var15 = -var13 + var6;
                           if (var9 != 0) {
                              if (~var9 == -2) {
                                 break label68;
                              }

                              if (~var9 == -3) {
                                 break label69;
                              }

                              if (var9 == 3) {
                                 break label70;
                              }

                              if (var9 == 4) {
                                 break label71;
                              }

                              if (~var9 != -6) {
                                 break label83;
                              }

                              if (var5 == 0) {
                                 break label72;
                              }
                           }

                           this.field7893 = var6;
                           this.field7885 = var14;
                           this.field7881 = var7;
                           if (var5 == 0) {
                              break label83;
                           }
                        }

                        this.field7881 = var7;
                        this.field7885 = var6;
                        this.field7893 = var15;
                        if (var5 == 0) {
                           break label83;
                        }
                     }

                     this.field7885 = var6;
                     this.field7881 = var14;
                     this.field7893 = var7;
                     if (var5 == 0) {
                        break label83;
                     }
                  }

                  this.field7885 = var15;
                  this.field7881 = var6;
                  this.field7893 = var7;
                  if (var5 == 0) {
                     break label83;
                  }
               }

               this.field7885 = var7;
               this.field7881 = var6;
               this.field7893 = var14;
               if (var5 == 0) {
                  break label83;
               }
            }

            this.field7881 = var15;
            this.field7893 = var6;
            this.field7885 = var7;
         }

         if (arg0 != -39) {
            field7892 = null;
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field7894[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field7891;
         if (arg1 == 0) {
            if (arg0 != 0) {
               if (arg0 == 1) {
                  this.field7882 = (arg2.method1047((byte)-122) << 12) / 100;
                  return;
               }

               if (arg0 != 2) {
                  return;
               }

               if (client.field4530 == 0) {
                  this.field7883 = (arg2.method1047((byte)119) << 12) / 100;
                  return;
               }
            }

            this.field7889 = arg2.method1066(arg1 + 32767);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7894[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7894[2] : field7894[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4003(byte arg0) {
      try {
         int var1 = 67 % ((-9 - arg0) / 46);
         field7892 = null;
         field7880 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7894[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(IIIB)V"
   )
   private final void method4004(int arg0, int arg1, int arg2, byte arg3) {
      int var5 = client.field4530;

      try {
         ++field7887;
         int var6 = arg0 > arg1 ? arg0 : arg1;
         int var7 = var6 >= arg2 ? var6 : arg2;
         int var8 = arg0 >= arg1 ? arg1 : arg0;
         if (arg3 <= 107) {
            this.method245((byte)-74, -96);
         }

         int var10;
         label80: {
            int var9 = ~arg2 <= ~var8 ? var8 : arg2;
            var10 = -var9 + var7;
            this.field7886 = (var7 + var9) / 2;
            if (~var10 < -1) {
               label89: {
                  int var11 = (var7 - arg0 << 12) / var10;
                  int var12 = (-arg1 + var7 << 12) / var10;
                  int var13 = (-arg2 + var7 << 12) / var10;
                  if (~arg0 != ~var7) {
                     if (arg1 != var7) {
                        this.field7879 = arg0 != var9 ? 20480 - var11 : var12 + 12288;
                        if (var5 == 0) {
                           break label89;
                        }
                     }

                     this.field7879 = arg2 == var9 ? 4096 - -var11 : -var13 + 12288;
                     if (var5 == 0) {
                        break label89;
                     }
                  }

                  this.field7879 = arg1 != var9 ? -var12 + 4096 : var13 + 20480;
               }

               this.field7879 /= 6;
               if (var5 == 0) {
                  break label80;
               }
            }

            this.field7879 = 0;
         }

         if (this.field7886 > 0 && this.field7886 < 4096) {
            this.field7888 = (var10 << 12) / (~this.field7886 < -2049 ? 8192 - this.field7886 * 2 : this.field7886 * 2);
         } else {
            this.field7888 = 0;
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field7894[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(IIII)Lln;"
   )
   public static final class397 method4005(int arg0, int arg1, int arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field7878;
         if (arg0 <= 43) {
            return null;
         } else {
            class72 var5 = class353.field5360[arg2][arg3][arg1];
            if (var5 == null) {
               return null;
            } else {
               class397 var6 = null;
               int var7 = -1;
               class389 var8 = var5.field910;

               while(true) {
                  class741 var10000;
                  if (var8 == null) {
                     var10000 = var6;
                     if (var4 == 0) {
                        return var6;
                     }
                  } else {
                     var10000 = var8.field5943;
                  }

                  class741 var9 = var10000;
                  if (var9 instanceof class397) {
                     class397 var10 = (class397)var9;
                     int var11 = 252 + -256 + var10.method3046(124) * 256;
                     int var12 = -var11 + var10.field9003 >> 9;
                     int var13 = -var11 + var10.field9007 >> 9;
                     int var14 = var10.field9003 - -var11 >> 9;
                     int var15 = var10.field9007 - -var11 >> 9;
                     if (arg3 >= var12 && var13 <= arg1 && arg3 <= var14 && ~arg1 >= ~var15) {
                        int var16 = (var15 - arg1 + 1) * (var14 + 1 + -arg3);
                        if (var16 > var7) {
                           var7 = var16;
                           var6 = var10;
                        }
                     }
                  }

                  var8 = var8.field5942;
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field7894[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field7884;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (arg0 != -90) {
            this.field7882 = 103;
         }

         if (super.field4292.field6892) {
            int[][] var5 = this.method2297(0, arg1, arg0 + 90);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 != 0 || class344.field5238 > var12) {
               label78:
               do {
                  this.method4004(var6[var12], var7[var12], var8[var12], (byte)119);
                  this.field7886 += this.field7883;
                  this.field7879 += this.field7889;
                  this.field7888 += this.field7882;
                  if (var3 != 0) {
                     this.field7879 += 4096;
                  }

                  while(true) {
                     class541 var10000;
                     if (~this.field7879 <= -1) {
                        var10000 = this;
                        if (var3 == 0) {
                           if (this.field7888 < 0) {
                              this.field7888 = 0;
                              if (var3 != 0) {
                                 this.field7879 -= 4096;
                              }
                           }

                           while(true) {
                              if (this.field7879 <= 4096) {
                                 var10000 = this;
                                 if (var3 == 0) {
                                    if (~this.field7888 < -4097) {
                                       this.field7888 = 4096;
                                    }

                                    if (~this.field7886 > -1) {
                                       this.field7886 = 0;
                                    }

                                    if (this.field7886 > 4096) {
                                       this.field7886 = 4096;
                                    }

                                    this.method4002((byte)-39, this.field7886, this.field7879, this.field7888);
                                    var9[var12] = this.field7893;
                                    var10[var12] = this.field7885;
                                    var11[var12] = this.field7881;
                                    ++var12;
                                    continue label78;
                                 }
                              } else {
                                 var10000 = this;
                              }

                              var10000.field7879 -= 4096;
                           }
                        }
                     } else {
                        var10000 = this;
                     }

                     var10000.field7879 += 4096;
                  }
               } while(class344.field5238 > var12);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field7894[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "<init>",
      descriptor = "()V"
   )
   public class541() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4006(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4007(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
