import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class593 extends class213 {
   @OriginalMember(
      owner = "client!via",
      name = "U",
      descriptor = "I"
   )
   private int field8189 = 0;
   @OriginalMember(
      owner = "client!via",
      name = "X",
      descriptor = "I"
   )
   private int field8195 = 0;
   @OriginalMember(
      owner = "client!via",
      name = "I",
      descriptor = "I"
   )
   private int field8201 = 0;
   @OriginalMember(
      owner = "client!via",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8209 = new String[]{method4271(method4270("\u000fz\u0002\u001f'Q")), method4271(method4270("\u0017f\u000f]")), method4271(method4270("\u000fz\u0002\u001f$Q")), method4271(method4270("\u0002=M\u001f\u001e")), method4271(method4270("\u000fz\u0002\u001f Q")), method4271(method4270("\u000fz\u0002\u001f)Q")), method4271(method4270("\u000fz\u0002\u001f!Q")), method4271(method4270("\u000fz\u0002\u001f*Q")), method4271(method4270("\u000fz\u0002\u001f%Q")), method4271(method4270("\u000fz\u0002\u001f+Q")), method4271(method4270("\u000fz\u0002\u001f&Q"))};
   @OriginalMember(
      owner = "client!via",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field8202 = new int[1000];
   @OriginalMember(
      owner = "client!via",
      name = "O",
      descriptor = "I"
   )
   public static int field8187;
   @OriginalMember(
      owner = "client!via",
      name = "H",
      descriptor = "I"
   )
   private int field8188;
   @OriginalMember(
      owner = "client!via",
      name = "D",
      descriptor = "I"
   )
   private int field8190;
   @OriginalMember(
      owner = "client!via",
      name = "Z",
      descriptor = "I"
   )
   public static int field8191;
   @OriginalMember(
      owner = "client!via",
      name = "E",
      descriptor = "I"
   )
   public static int field8192;
   @OriginalMember(
      owner = "client!via",
      name = "R",
      descriptor = "I"
   )
   public static int field8193;
   @OriginalMember(
      owner = "client!via",
      name = "S",
      descriptor = "I"
   )
   public static int field8194;
   @OriginalMember(
      owner = "client!via",
      name = "G",
      descriptor = "I"
   )
   public static int field8196;
   @OriginalMember(
      owner = "client!via",
      name = "P",
      descriptor = "I"
   )
   public static int field8197;
   @OriginalMember(
      owner = "client!via",
      name = "K",
      descriptor = "I"
   )
   private int field8198;
   @OriginalMember(
      owner = "client!via",
      name = "T",
      descriptor = "I"
   )
   public static int field8199;
   @OriginalMember(
      owner = "client!via",
      name = "V",
      descriptor = "I"
   )
   private int field8200;
   @OriginalMember(
      owner = "client!via",
      name = "Y",
      descriptor = "I"
   )
   private int field8203;
   @OriginalMember(
      owner = "client!via",
      name = "L",
      descriptor = "I"
   )
   private int field8204;
   @OriginalMember(
      owner = "client!via",
      name = "J",
      descriptor = "I"
   )
   public static int field8205;
   @OriginalMember(
      owner = "client!via",
      name = "N",
      descriptor = "I"
   )
   public static int field8206;
   @OriginalMember(
      owner = "client!via",
      name = "W",
      descriptor = "I"
   )
   public static int field8207;
   @OriginalMember(
      owner = "client!via",
      name = "F",
      descriptor = "I"
   )
   public static int field8208;

   @OriginalMember(
      owner = "client!via",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method4263(int arg0) {
      try {
         if (arg0 != 839) {
            field8197 = 82;
         }

         class179.method1380(false, 51);
         ++field8196;
         if (class71.field881 >= 0 && class71.field881 != 0) {
            class594.method4335(false, Integer.MAX_VALUE, class71.field881);
            class71.field881 = -1;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8209[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label42: {
            label41: {
               label40: {
                  ++field8187;
                  if (arg2 != 0) {
                     if (~arg2 == -2) {
                        break label40;
                     }

                     if (~arg2 != -3) {
                        break label42;
                     }

                     if (!var4) {
                        break label41;
                     }
                  }

                  this.field8189 = arg0.method4333(-77);
                  if (!var4) {
                     break label42;
                  }
               }

               this.field8195 = (arg0.method4340(409855200) << 12) / 100;
               if (!var4) {
                  break label42;
               }
            }

            this.field8201 = (arg0.method4340(409855200) << 12) / 100;
         }

         int var6 = -35 % ((68 - arg1) / 48);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8209[2] + (arg0 != null ? field8209[3] : field8209[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field8207;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (super.field2644.field6719) {
            int[][] var5 = this.method1615(true, arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || class576.field7916 > var12) {
               do {
                  this.method4268(var6[var12], var7[var12], (byte)105, var8[var12]);
                  this.field8203 += this.field8189;
                  this.field8200 += this.field8195;
                  this.field8188 += this.field8201;
                  if (var3 || this.field8203 < 0) {
                     do {
                        this.field8203 += 4096;
                     } while(this.field8203 < 0);
                  }

                  if (var3) {
                     this.field8203 -= 4096;
                  }

                  while(true) {
                     class593 var10000;
                     if (this.field8203 <= 4096) {
                        var10000 = this;
                        if (!var3) {
                           if (this.field8200 < 0) {
                              this.field8200 = 0;
                           }

                           if (~this.field8200 < -4097) {
                              this.field8200 = 4096;
                           }

                           if (this.field8188 < 0) {
                              this.field8188 = 0;
                           }

                           if (this.field8188 > 4096) {
                              this.field8188 = 4096;
                           }

                           this.method4266(this.field8200, 109, this.field8203, this.field8188);
                           var9[var12] = this.field8204;
                           var10[var12] = this.field8190;
                           var11[var12] = this.field8198;
                           ++var12;
                           break;
                        }
                     } else {
                        var10000 = this;
                     }

                     var10000.field8203 -= 4096;
                  }
               } while(class576.field7916 > var12);
            }
         }

         if (arg1 < 26) {
            this.field8198 = -30;
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field8209[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method4264(byte arg0, int arg1) {
      try {
         ++field8199;
         if (class521.method3770(true)) {
            if (class25.field324 != arg1) {
               class762.field11020 = "";
            }

            class25.field324 = arg1;
            if (arg0 >= -91) {
               method4264((byte)54, 13);
            }

            class605.field8473.method1697(48);
            class397.method3019(73, 5);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8209[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(ILvi;IIIII)V"
   )
   public static final void method4265(int arg0, class569 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         class169.method1326(arg1.field1003, arg5, arg3, (byte)-127, arg1.field1001, arg4, arg2, arg1.field999, arg0, arg6);
         ++field8206;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field8209[9] + arg0 + ',' + (arg1 != null ? field8209[3] : field8209[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(IIII)V"
   )
   private final void method4266(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8205;
         int var5 = -47 / ((-4 - arg1) / 57);
         int var6 = arg3 <= 2048 ? (arg0 + 4096) * arg3 >> 12 : arg0 + arg3 + -(arg0 * arg3 >> 12);
         if (~var6 >= -1) {
            this.field8204 = this.field8190 = this.field8198 = arg3;
         } else {
            int var19 = arg2 * 6;
            int var7 = arg3 + arg3 + -var6;
            int var8 = (-var7 + var6 << 12) / var6;
            int var9 = var19 >> 12;
            int var10 = var19 - (var9 << 12);
            int var12 = var8 * var6 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var6;
            if (~var9 != -1) {
               if (var9 == 1) {
                  this.field8198 = var7;
                  this.field8190 = var6;
                  this.field8204 = var15;
                  return;
               }

               if (var9 == 2) {
                  this.field8190 = var6;
                  this.field8198 = var14;
                  this.field8204 = var7;
                  return;
               }

               if (~var9 == -4) {
                  this.field8198 = var6;
                  this.field8190 = var15;
                  this.field8204 = var7;
                  return;
               }

               if (var9 == 4) {
                  this.field8204 = var14;
                  this.field8190 = var7;
                  this.field8198 = var6;
                  return;
               }

               if (~var9 != -6) {
                  return;
               }

               if (!client.field4273) {
                  this.field8204 = var6;
                  this.field8198 = var15;
                  this.field8190 = var7;
                  return;
               }
            }

            this.field8204 = var6;
            this.field8198 = var7;
            this.field8190 = var14;
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field8209[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method4267(boolean arg0) {
      try {
         field8202 = null;
         if (arg0) {
            field8197 = 82;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8209[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "<init>",
      descriptor = "()V"
   )
   public class593() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(IIBI)V"
   )
   private final void method4268(int arg0, int arg1, byte arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         ++field8194;
         int var6 = ~arg1 <= ~arg0 ? arg1 : arg0;
         int var7 = ~arg0 > ~arg1 ? arg0 : arg1;
         int var8 = arg3 <= var6 ? var6 : arg3;
         if (arg2 <= 92) {
            method4263(111);
         }

         int var10;
         label81: {
            int var9 = ~var7 < ~arg3 ? arg3 : var7;
            this.field8188 = (var9 - -var8) / 2;
            var10 = -var9 + var8;
            if (var10 > 0) {
               label90: {
                  int var11 = (var8 - arg0 << 12) / var10;
                  int var12 = (-arg1 + var8 << 12) / var10;
                  int var13 = (var8 - arg3 << 12) / var10;
                  if (~arg0 != ~var8) {
                     if (arg1 == var8) {
                        this.field8203 = arg3 == var9 ? var11 + 4096 : -var13 + 12288;
                        if (!var5) {
                           break label90;
                        }
                     }

                     this.field8203 = ~arg0 != ~var9 ? -var11 + 20480 : var12 + 12288;
                     if (!var5) {
                        break label90;
                     }
                  }

                  this.field8203 = arg1 == var9 ? var13 + 20480 : -var12 + 4096;
               }

               this.field8203 /= 6;
               if (!var5) {
                  break label81;
               }
            }

            this.field8203 = 0;
         }

         if (~this.field8188 < -1 && this.field8188 < 4096) {
            this.field8200 = (var10 << 12) / (this.field8188 > 2048 ? 8192 - this.field8188 * 2 : this.field8188 * 2);
         } else {
            this.field8200 = 0;
         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field8209[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "a",
      descriptor = "(IZZ)V"
   )
   public static final void method4269(int arg0, boolean arg1, boolean arg2) {
      try {
         if (arg0 == -1) {
            if (arg2) {
               ++class459.field6290;
               class215.method1635((byte)122);
            }

            ++field8193;
            if (arg1) {
               ++class109.field1385;
               class350.method2759(-76);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8209[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4270(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!via",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4271(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
