import java.io.File;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class397 extends class70 {
   @OriginalMember(
      owner = "client!mt",
      name = "R",
      descriptor = "I"
   )
   private int field6224 = 16;
   @OriginalMember(
      owner = "client!mt",
      name = "L",
      descriptor = "I"
   )
   private int field6229 = 0;
   @OriginalMember(
      owner = "client!mt",
      name = "N",
      descriptor = "I"
   )
   private int field6231 = 2000;
   @OriginalMember(
      owner = "client!mt",
      name = "K",
      descriptor = "I"
   )
   private int field6232 = 4096;
   @OriginalMember(
      owner = "client!mt",
      name = "F",
      descriptor = "I"
   )
   private int field6230 = 0;
   @OriginalMember(
      owner = "client!mt",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6233 = new String[]{method3207(method3206("\u0012p\u007f'U")), method3207(method3206("\u0011q=\b")), method3207(method3206("\u0004*\u007fJ\u0000")), method3207(method3206("\u0012p\u007f,U")), method3207(method3206("\u0012p\u007f&U")), method3207(method3206("\u0012p\u007f!U")), method3207(method3206("\u0012p\u007f%U")), method3207(method3206("_w4\u0007\u0012\u0011`\"JSQ")), method3207(method3206("#+\u007f^Q_[|O&\"z\u0011")), method3207(method3206("/e$\u0017\u0014\u0011cq\u0002\u0012\r$")), method3207(method3206("\u000fe$\u0017\u0018")), method3207(method3206("\u0012p\u007f#U")), method3207(method3206("\u0012p\u007f U")), method3207(method3206("\u0012p\u007f\"U"))};
   @OriginalMember(
      owner = "client!mt",
      name = "O",
      descriptor = "I"
   )
   public static int field6220;
   @OriginalMember(
      owner = "client!mt",
      name = "J",
      descriptor = "I"
   )
   public static int field6221;
   @OriginalMember(
      owner = "client!mt",
      name = "Q",
      descriptor = "I"
   )
   public static int field6222;
   @OriginalMember(
      owner = "client!mt",
      name = "I",
      descriptor = "I"
   )
   public static int field6225;
   @OriginalMember(
      owner = "client!mt",
      name = "G",
      descriptor = "I"
   )
   public static int field6226;
   @OriginalMember(
      owner = "client!mt",
      name = "P",
      descriptor = "I"
   )
   public static int field6227;
   @OriginalMember(
      owner = "client!mt",
      name = "M",
      descriptor = "I"
   )
   public static int field6228;
   @OriginalMember(
      owner = "client!mt",
      name = "H",
      descriptor = "Luja;"
   )
   public static class477 field6223;

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(Z)V",
      line = 3
   )
   public final void method275(boolean arg0) {
      try {
         ++field6222;
         class452.method3548((byte)-119);
         if (arg0) {
            method3202(15);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6233[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(FFFIIFFF)F",
      line = 14
   )
   public static final float method3201(float arg0, float arg1, float arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
      boolean var8 = client.field1786;

      try {
         ++field6221;
         float var9 = 0.0F;
         float var10 = -arg2 + arg7;
         float var11 = -arg1 + arg5;
         float var12 = -arg0 + arg6;
         float var13 = 0.0F;
         float var14 = 0.0F;
         float var15 = 0.0F;
         if (arg4 >= -74) {
            return -2.854114F;
         } else {
            while(true) {
               float var10000;
               if (!(var9 < 1.1F)) {
                  var10000 = -1.0F;
                  if (!var8) {
                     return -1.0F;
                  }
               } else {
                  var10000 = var9 * var10 + arg2;
               }

               float var16 = var10000;
               float var17 = var9 * var11 + arg1;
               float var18 = var9 * var12 + arg0;
               int var19 = (int)var16 >> 9;
               int var20 = (int)var18 >> 9;
               if (~var19 < -1 && ~var20 < -1 && ~var19 > ~class513.field7828 && class475.field7230 > var20) {
                  int var21 = class476.field7251.field1506;
                  if (~var21 > -4 && ~(class757.field11211[1][var19][var20] & 2) != -1) {
                     ++var21;
                  }

                  int var22 = class96.field1355[var21].method2312((int)var16, (int)var18, 78);
                  if ((float)var22 < var17) {
                     if (arg3 < 2) {
                        return var9;
                     }

                     return method3201(var15, var14, var13, arg3 + -1, -83, var17, var18, var16) * 0.1F + (var9 - 0.1F);
                  }
               }

               var14 = var17;
               var13 = var16;
               var15 = var18;
               var9 += 0.1F;
            }
         }
      } catch (RuntimeException var24) {
         throw class482.method3757(var24, field6233[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "h",
      descriptor = "(I)V",
      line = 85
   )
   public static void method3202(int arg0) {
      try {
         field6223 = null;
         if (arg0 != 0) {
            method3203(68);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6233[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "<init>",
      descriptor = "()V",
      line = 95
   )
   public class397() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!mt",
      name = "g",
      descriptor = "(I)V",
      line = 100
   )
   public static final void method3203(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(Ljava/io/File;B)[B",
      line = 293
   )
   public static final byte[] method3204(File arg0, byte arg1) {
      try {
         ++field6226;
         int var2 = -59 % ((arg1 - -21) / 58);
         return class233.method2000(arg0, (int)arg0.length(), -21839);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6233[11] + (arg0 != null ? field6233[2] : field6233[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(BI)[I",
      line = 304
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field6227;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (arg0 != 87) {
            this.field6224 = 8;
         }

         if (super.field923.field7284) {
            int var5 = this.field6232 >> 1;
            int[][] var6 = super.field923.method3719((byte)127);
            Random var7 = new Random((long)this.field6229);
            int var8 = 0;
            if (var3 || var8 < this.field6231) {
               do {
                  int var9 = this.field6232 > 0 ? this.field6230 - -class784.method5696((byte)25, this.field6232, var7) + -var5 : this.field6230;
                  int var10 = (var9 & 4091) >> 4;
                  int var11 = class784.method5696((byte)25, class678.field10127, var7);
                  int var12 = class784.method5696((byte)25, class304.field4744, var7);
                  int var13 = var11 - -(class594.field8746[var10] * this.field6224 >> 12);
                  int var14 = (class143.field2034[var10] * this.field6224 >> 12) + var12;
                  int var15 = -var12 + var14;
                  int var16 = var13 - var11;
                  if (~var16 == -1) {
                     if (var15 == 0) {
                        ++var8;
                        continue;
                     }

                     if (~var16 > -1) {
                        var16 = -var16;
                     }
                  } else if (~var16 > -1) {
                     var16 = -var16;
                  }

                  if (var15 < 0) {
                     var15 = -var15;
                  }

                  boolean var17 = var15 > var16;
                  if (var17) {
                     int var18 = var11;
                     int var19 = var13;
                     var11 = var12;
                     var13 = var14;
                     var12 = var18;
                     var14 = var19;
                  }

                  if (var13 < var11) {
                     int var20 = var11;
                     var11 = var13;
                     int var21 = var12;
                     var13 = var20;
                     var12 = var14;
                     var14 = var21;
                  }

                  int var22 = var12;
                  int var23 = -var11 + var13;
                  int var24 = var14 - var12;
                  int var25 = -var23 / 2;
                  int var26 = 2048 / var23;
                  int var27 = -(class784.method5696((byte)25, 4096, var7) >> 2) + 1024;
                  int var28 = var12 >= var14 ? -1 : 1;
                  if (var24 < 0) {
                     var24 = -var24;
                  }

                  int var29 = var11;
                  if (!var3 && ~var11 <= ~var13) {
                     ++var8;
                  } else {
                     do {
                        int var30 = (-var11 + var29) * var26 + var27 + 1024;
                        int var31 = class50.field637 & var29;
                        int var32 = class578.field8547 & var22;
                        var25 += var24;
                        if (var17) {
                           var6[var32][var31] = var30;
                           if (var3) {
                              var6[var31][var32] = var30;
                           }
                        } else {
                           var6[var31][var32] = var30;
                        }

                        if (var25 > 0) {
                           var25 -= var23;
                           var22 += var28;
                        }

                        ++var29;
                     } while(~var29 > ~var13);

                     ++var8;
                  }
               } while(var8 < this.field6231);
            }
         }

         return var4;
      } catch (RuntimeException var34) {
         throw class482.method3757(var34, field6233[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "i",
      descriptor = "(I)Z",
      line = 440
   )
   public static final boolean method3205(int arg0) {
      try {
         class721.field10795 = true;
         if (arg0 > -46) {
            field6223 = null;
         }

         ++class756.field11198;
         ++field6220;
         return true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6233[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "a",
      descriptor = "(IILica;)V",
      line = 453
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         ++field6225;
         if (arg0 == -1) {
            if (arg1 != 0) {
               if (arg1 == 1) {
                  this.field6231 = arg2.method2848(arg0 ^ 91);
                  return;
               }

               if (~arg1 == -3) {
                  this.field6224 = arg2.method2855(-31007);
                  return;
               }

               if (~arg1 == -4) {
                  this.field6230 = arg2.method2848(-123);
                  return;
               }

               if (arg1 != 4) {
                  return;
               }

               if (!client.field1786) {
                  this.field6232 = arg2.method2848(-92);
                  return;
               }
            }

            this.field6229 = arg2.method2855(-31007);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6233[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6233[2] : field6233[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3206(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3207(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
