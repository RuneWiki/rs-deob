import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class360 extends class264 {
   @OriginalMember(
      owner = "client!gd",
      name = "Z",
      descriptor = "I"
   )
   private int field4910 = 0;
   @OriginalMember(
      owner = "client!gd",
      name = "V",
      descriptor = "I"
   )
   private int field4911 = 0;
   @OriginalMember(
      owner = "client!gd",
      name = "F",
      descriptor = "I"
   )
   private int field4916 = 0;
   @OriginalMember(
      owner = "client!gd",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4921 = new String[]{method2704(method2703("5]^TL")), method2704(method2703("5]^YL")), method2704(method2703("5]^XL")), method2704(method2703(")\u0017^3\u0019")), method2704(method2703("5]^\\L")), method2704(method2703("<L\u001cq")), method2704(method2703("5]^^L")), method2704(method2703("5]^UL")), method2704(method2703("%P\u001e")), method2704(method2703("5]^[L")), method2704(method2703("5]^ZL"))};
   @OriginalMember(
      owner = "client!gd",
      name = "Y",
      descriptor = "Loi;"
   )
   public static class80 field4902 = new class80(4);
   @OriginalMember(
      owner = "client!gd",
      name = "J",
      descriptor = "Leg;"
   )
   public static class118 field4918 = new class118(112, -1);
   @OriginalMember(
      owner = "client!gd",
      name = "Q",
      descriptor = "[I"
   )
   public static int[] field4920 = new int[]{3, 7, 15};
   @OriginalMember(
      owner = "client!gd",
      name = "R",
      descriptor = "I"
   )
   public static int field4901;
   @OriginalMember(
      owner = "client!gd",
      name = "L",
      descriptor = "I"
   )
   private int field4903;
   @OriginalMember(
      owner = "client!gd",
      name = "ab",
      descriptor = "I"
   )
   public static int field4904;
   @OriginalMember(
      owner = "client!gd",
      name = "N",
      descriptor = "I"
   )
   public static int field4905;
   @OriginalMember(
      owner = "client!gd",
      name = "O",
      descriptor = "I"
   )
   public static int field4906;
   @OriginalMember(
      owner = "client!gd",
      name = "W",
      descriptor = "I"
   )
   private int field4907;
   @OriginalMember(
      owner = "client!gd",
      name = "K",
      descriptor = "I"
   )
   private int field4908;
   @OriginalMember(
      owner = "client!gd",
      name = "M",
      descriptor = "I"
   )
   private int field4909;
   @OriginalMember(
      owner = "client!gd",
      name = "H",
      descriptor = "I"
   )
   public static int field4912;
   @OriginalMember(
      owner = "client!gd",
      name = "T",
      descriptor = "I"
   )
   public static int field4913;
   @OriginalMember(
      owner = "client!gd",
      name = "U",
      descriptor = "I"
   )
   public static int field4914;
   @OriginalMember(
      owner = "client!gd",
      name = "G",
      descriptor = "I"
   )
   public static int field4915;
   @OriginalMember(
      owner = "client!gd",
      name = "I",
      descriptor = "I"
   )
   private int field4917;
   @OriginalMember(
      owner = "client!gd",
      name = "X",
      descriptor = "I"
   )
   private int field4919;

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field4915;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 > -117) {
            return null;
         } else {
            if (super.field3634.field8828) {
               int[][] var5 = this.method2015(0, (byte)76, arg0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               if (var3 || class430.field6152 > var12) {
                  do {
                     this.method2702(var7[var12], var6[var12], 62, var8[var12]);
                     this.field4909 += this.field4911;
                     this.field4917 += this.field4916;
                     this.field4903 += this.field4910;
                     if (var3 || this.field4909 < 0) {
                        do {
                           this.field4909 += 4096;
                        } while(this.field4909 < 0);
                     }

                     if (var3) {
                        this.field4909 -= 4096;
                     }

                     while(true) {
                        class360 var10000;
                        if (~this.field4909 >= -4097) {
                           var10000 = this;
                           if (!var3) {
                              if (this.field4903 < 0) {
                                 this.field4903 = 0;
                              }

                              if (this.field4903 > 4096) {
                                 this.field4903 = 4096;
                              }

                              if (~this.field4917 > -1) {
                                 this.field4917 = 0;
                              }

                              if (this.field4917 > 4096) {
                                 this.field4917 = 4096;
                              }

                              this.method2699(this.field4903, -47, this.field4909, this.field4917);
                              var9[var12] = this.field4919;
                              var10[var12] = this.field4908;
                              var11[var12] = this.field4907;
                              ++var12;
                              break;
                           }
                        } else {
                           var10000 = this;
                        }

                        var10000.field4909 -= 4096;
                     }
                  } while(class430.field6152 > var12);
               }
            }

            return var4;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field4921[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method2697(int arg0, int arg1, int arg2) {
      try {
         ++field4905;
         if (arg0 != 29405) {
            method2697(-9, -77, -61);
         }

         return class279.method2130(arg1, arg2, -1) | ~(262144 & arg2) != -1 || class387.method2929(arg1, 0, arg2);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4921[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method2698(int arg0) {
      try {
         ++field4912;
         if (~class542.field7787 != arg0) {
            class136.field1737.method54((byte)89);
            class625.method4542(false);
            class614.method4464(arg0 ^ 94);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4921[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "<init>",
      descriptor = "()V"
   )
   public class360() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label46: {
            label45: {
               label44: {
                  ++field4913;
                  if (arg0 != 0) {
                     if (arg0 == 1) {
                        break label44;
                     }

                     if (~arg0 != -3) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field4911 = arg1.method1187((byte)88);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field4910 = (arg1.method1162(4) << 12) / 100;
               if (!var4) {
                  break label46;
               }
            }

            this.field4916 = (arg1.method1162(4) << 12) / 100;
         }

         if (arg2 < 49) {
            field4918 = null;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4921[4] + arg0 + ',' + (arg1 != null ? field4921[3] : field4921[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "a",
      descriptor = "(IIII)V"
   )
   private final void method2699(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4906;
         int var5 = ~arg3 >= -2049 ? (arg0 + 4096) * arg3 >> 12 : arg0 + arg3 + -(arg0 * arg3 >> 12);
         if (arg1 > -10) {
            field4920 = null;
         }

         int var6;
         int var13;
         label52: {
            if (~var5 < -1) {
               int var18 = arg2 * 6;
               var6 = -var5 + arg3 - -arg3;
               int var7 = (var5 - var6 << 12) / var5;
               int var8 = var18 >> 12;
               int var9 = var18 - (var8 << 12);
               int var11 = var7 * var5 >> 12;
               int var12 = var9 * var11 >> 12;
               var13 = var6 + var12;
               int var14 = var5 - var12;
               if (~var8 == -1) {
                  break label52;
               }

               if (~var8 == -2) {
                  this.field4908 = var5;
                  this.field4919 = var14;
                  this.field4907 = var6;
                  return;
               }

               if (~var8 == -3) {
                  this.field4908 = var5;
                  this.field4907 = var13;
                  this.field4919 = var6;
                  return;
               }

               if (~var8 == -4) {
                  this.field4908 = var14;
                  this.field4919 = var6;
                  this.field4907 = var5;
                  return;
               }

               if (var8 == 4) {
                  this.field4919 = var13;
                  this.field4908 = var6;
                  this.field4907 = var5;
                  return;
               }

               if (var8 == 5) {
                  if (!client.field4360) {
                     this.field4907 = var14;
                     this.field4908 = var6;
                     this.field4919 = var5;
                     return;
                  }
                  break label52;
               }
            } else {
               this.field4919 = this.field4908 = this.field4907 = arg3;
            }

            return;
         }

         this.field4907 = var6;
         this.field4908 = var13;
         this.field4919 = var5;
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field4921[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method2700(boolean arg0) {
      try {
         if (!arg0) {
            field4918 = null;
            field4920 = null;
            field4902 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4921[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "b",
      descriptor = "(B)I"
   )
   public static final int method2701(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field4904;
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         if (class316.field4304.field9134 && !class316.field4304.field9110) {
            label131: {
               var2 = true;
               if (~class169.field2360.field1162 > -513 && class169.field2360.field1162 != 0) {
                  var2 = false;
               }

               if (!class619.field9120.startsWith(field4921[8])) {
                  var3 = true;
                  if (!var1) {
                     break label131;
                  }
               }

               var3 = true;
               var4 = true;
            }
         }

         if (class785.field11529) {
            var3 = false;
         }

         if (class351.field4721) {
            var4 = false;
         }

         if (class498.field7227) {
            var2 = false;
         }

         if (!var2 && !var3 && !var4) {
            return class514.method3740((byte)-62);
         } else {
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
               try {
                  var5 = class8.method40((byte)124, 1000, 2);
               } catch (Exception var16) {
               }
            }

            if (var4) {
               try {
                  var7 = class8.method40((byte)118, 1000, 3);
                  if (class300.field4107.field6419.method391(-114) == 3) {
                     label132: {
                        long var9;
                        label133: {
                           class122 var8 = class383.field5543.method573();
                           var9 = 281474976710655L & var8.field1577;
                           int var11 = var8.field1584;
                           if (var11 != 4318) {
                              if (~var11 != -4099) {
                                 break label132;
                              }

                              if (!var1) {
                                 break label133;
                              }
                           }

                           var3 &= ~var9 <= -64425238955L;
                           if (!var1) {
                              break label132;
                           }
                        }

                        var3 &= var9 >= 60129613779L;
                     }
                  }
               } catch (Exception var17) {
               }
            }

            if (arg0 != -117) {
               field4920 = null;
            }

            if (var3) {
               try {
                  var6 = class8.method40((byte)108, 1000, 1);
               } catch (Exception var15) {
               }
            }

            if (var5 == -1 && var6 == -1 && ~var7 == 0) {
               return class514.method3740((byte)-62);
            } else {
               int var12 = (int)((float)var6 * 1.1F);
               int var13 = (int)((float)var7 * 1.1F);
               if (~var13 > ~var5 && var12 < var5) {
                  return class547.method3927(var5, 2);
               } else {
                  return ~var13 < ~var12 ? class606.method4409(3, -122, var13) : class606.method4409(1, -127, var12);
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field4921[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "b",
      descriptor = "(IIII)V"
   )
   private final void method2702(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4360;

      try {
         ++field4914;
         int var6 = arg1 <= arg0 ? arg0 : arg1;
         int var7 = ~arg0 < ~arg1 ? arg1 : arg0;
         int var8 = ~var6 <= ~arg3 ? var6 : arg3;
         int var9 = var7 <= arg3 ? var7 : arg3;
         this.field4917 = (var8 + var9) / 2;
         if (arg2 <= 57) {
            this.method2699(-41, -124, -40, -78);
         }

         int var10;
         label109: {
            var10 = var8 - var9;
            if (this.field4917 <= 0 || this.field4917 >= 4096) {
               this.field4903 = 0;
               if (!var5) {
                  break label109;
               }
            }

            this.field4903 = (var10 << 12) / (this.field4917 <= 2048 ? this.field4917 * 2 : -(this.field4917 * 2) + 8192);
         }

         if (~var10 >= -1) {
            this.field4909 = 0;
         } else {
            label95: {
               int var11 = (-arg1 + var8 << 12) / var10;
               int var12 = (-arg0 + var8 << 12) / var10;
               int var13 = (var8 - arg3 << 12) / var10;
               if (arg1 == var8) {
                  this.field4909 = arg0 != var9 ? 4096 - var12 : var13 + 20480;
                  if (!var5) {
                     break label95;
                  }
               }

               if (~arg0 != ~var8) {
                  this.field4909 = arg1 == var9 ? 12288 - -var12 : 20480 - var11;
                  if (!var5) {
                     break label95;
                  }
               }

               this.field4909 = ~arg3 != ~var9 ? -var13 + 12288 : var11 + 4096;
            }

            this.field4909 /= 6;
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field4921[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2703(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2704(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
