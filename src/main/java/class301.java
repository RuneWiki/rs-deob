import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public abstract class class301 {
   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "I"
   )
   public int field4202 = 4;
   @OriginalMember(
      owner = "client!ao",
      name = "f",
      descriptor = "I"
   )
   private int field4207 = 4;
   @OriginalMember(
      owner = "client!ao",
      name = "b",
      descriptor = "[S"
   )
   private short[] field4204 = new short[512];
   @OriginalMember(
      owner = "client!ao",
      name = "i",
      descriptor = "I"
   )
   private int field4208 = 4;
   @OriginalMember(
      owner = "client!ao",
      name = "d",
      descriptor = "I"
   )
   private int field4209 = 4;
   @OriginalMember(
      owner = "client!ao",
      name = "l",
      descriptor = "I"
   )
   private int field4210 = 0;
   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4213 = new String[]{method2353(method2352("bGyY8")), method2353(method2352("bGyX8")), method2353(method2352("bGy5ymA#78")), method2353(method2352("bGy[8")), method2353(method2352("bGyD8")), method2353(method2352("bGyG8"))};
   @OriginalMember(
      owner = "client!ao",
      name = "h",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4212 = new String[100];
   @OriginalMember(
      owner = "client!ao",
      name = "j",
      descriptor = "I"
   )
   public static int field4201;
   @OriginalMember(
      owner = "client!ao",
      name = "k",
      descriptor = "I"
   )
   public static int field4203;
   @OriginalMember(
      owner = "client!ao",
      name = "c",
      descriptor = "I"
   )
   public static int field4205;
   @OriginalMember(
      owner = "client!ao",
      name = "e",
      descriptor = "I"
   )
   public static int field4211;
   @OriginalMember(
      owner = "client!ao",
      name = "g",
      descriptor = "[S"
   )
   private short[] field4206;

   @OriginalMember(
      owner = "client!ao",
      name = "<init>",
      descriptor = "(IIIII)V",
      line = 340
   )
   public class301(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field4202 = arg1;
         this.field4210 = arg0;
         this.field4209 = arg3;
         this.field4207 = arg4;
         this.field4208 = arg2;
         this.method2349(-118);
         this.method2344(255);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field4213[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "b",
      descriptor = "(I)V",
      line = 14
   )
   private final void method2344(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field4211;
         Random var3 = new Random((long)this.field4210);
         int var4 = 0;
         if (var2) {
            this.field4204[var4] = (short)var4;
            ++var4;
         }

         while(true) {
            while(var4 < 255) {
               this.field4204[var4] = (short)var4;
               ++var4;
            }

            if (!var2) {
               if (arg0 != 255) {
                  this.field4202 = -23;
               }

               int var5 = 0;
               if (!var2 && var5 >= 255) {
                  return;
               }

               do {
                  int var6 = -var5 + 255;
                  int var7 = class398.method3070(var6, var3, (byte)108);
                  short var8 = this.field4204[var7];
                  this.field4204[var7] = this.field4204[var6];
                  this.field4204[var6] = this.field4204[var6 - -256] = var8;
                  ++var5;
               } while(var5 < 255);

               return;
            }

            ++var4;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field4213[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(IZII)V",
      line = 52
   )
   public final void method2345(int arg0, boolean arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field4203;
         int[] var6 = new int[arg0];
         if (!arg1) {
            int[] var7 = new int[arg3];
            int[] var8 = new int[arg2];
            int var9 = 0;
            if (var5) {
               var6[var9] = (var9 << 12) / arg0;
               ++var9;
            }

            while(true) {
               while(~arg0 < ~var9) {
                  var6[var9] = (var9 << 12) / arg0;
                  ++var9;
               }

               int var10 = 0;
               if (!var5) {
                  if (var5) {
                     var7[var10] = (var10 << 12) / arg3;
                     ++var10;
                  }

                  while(true) {
                     while(arg3 > var10) {
                        var7[var10] = (var10 << 12) / arg3;
                        ++var10;
                     }

                     int var11 = 0;
                     if (!var5) {
                        if (var5) {
                           var8[var11] = (var11 << 12) / arg2;
                           ++var11;
                        }

                        while(true) {
                           while(var11 < arg2) {
                              var8[var11] = (var11 << 12) / arg2;
                              ++var11;
                           }

                           this.method2346(-31077);
                           int var12 = 0;
                           if (!var5) {
                              if (!var5 && ~var12 <= ~arg2) {
                                 return;
                              }

                              do {
                                 int var13 = 0;
                                 if (var5 || ~var13 > ~arg3) {
                                    do {
                                       int var14 = 0;
                                       if (var5 || ~var14 > ~arg0) {
                                          do {
                                             class301 var10000;
                                             label125: {
                                                int var15 = 0;
                                                if (var5) {
                                                   var10000 = this;
                                                } else if (~var15 <= ~this.field4202) {
                                                   var10000 = this;
                                                   if (!var5) {
                                                      break label125;
                                                   }
                                                } else {
                                                   var10000 = this;
                                                }

                                                while(true) {
                                                   int var16 = var10000.field4206[var15] << 12;
                                                   int var17 = var6[var14] * var16 >> 12;
                                                   int var18 = var8[var12] * var16 >> 12;
                                                   int var19 = this.field4208 * var16 >> 12;
                                                   int var20 = var7[var13] * var16 >> 12;
                                                   int var21 = this.field4209 * var16 >> 12;
                                                   int var22 = this.field4207 * var16 >> 12;
                                                   int var23 = this.field4209 * var20;
                                                   int var24 = this.field4208 * var17;
                                                   int var25 = this.field4207 * var18;
                                                   int var26 = var24 >> 12;
                                                   int var27 = var26 + 1;
                                                   int var28 = var23 >> 12;
                                                   int var29 = var26 & 255;
                                                   int var30 = var28 - -1;
                                                   int var31 = var28 & 255;
                                                   int var32 = var25 >> 12;
                                                   int var33 = var32 + 1;
                                                   if (var19 <= var27) {
                                                      var27 = 0;
                                                      if (var5) {
                                                         var27 &= 255;
                                                      }
                                                   } else {
                                                      var27 &= 255;
                                                   }

                                                   int var34 = var25 & 4095;
                                                   if (var22 <= var33) {
                                                      var33 = 0;
                                                      if (var5) {
                                                         var33 &= 255;
                                                      }
                                                   } else {
                                                      var33 &= 255;
                                                   }

                                                   int var35 = var24 & 4095;
                                                   int var36 = var23 & 4095;
                                                   int var37 = var32 & 255;
                                                   if (var21 <= var30) {
                                                      var30 = 0;
                                                      if (var5) {
                                                         var30 &= 255;
                                                      }
                                                   } else {
                                                      var30 &= 255;
                                                   }

                                                   int var38 = var36 + -4096;
                                                   int var39 = class267.field3787[var35];
                                                   int var40 = var35 + -4096;
                                                   int var41 = class267.field3787[var36];
                                                   int var42 = class267.field3787[var34];
                                                   int var43 = var34 + -4096;
                                                   short var44 = this.field4204[var33];
                                                   short var45 = this.field4204[var37];
                                                   short var46 = this.field4204[var30 + var44];
                                                   short var47 = this.field4204[var31 + var45];
                                                   short var48 = this.field4204[var31 + var44];
                                                   short var49 = this.field4204[var30 + var45];
                                                   int var50 = class173.method1546(this.field4204[var29 + var47], (byte)-116, var34, var36, var35);
                                                   int var51 = class173.method1546(this.field4204[var27 + var47], (byte)-86, var34, var36, var40);
                                                   int var52 = ((-var50 + var51) * var39 >> 12) + var50;
                                                   int var53 = class173.method1546(this.field4204[var29 + var49], (byte)-62, var34, var38, var35);
                                                   int var54 = class173.method1546(this.field4204[var27 + var49], (byte)-75, var34, var38, var40);
                                                   int var55 = ((var54 - var53) * var39 >> 12) + var53;
                                                   int var56 = class173.method1546(this.field4204[var29 + var48], (byte)-84, var43, var36, var35);
                                                   int var57 = ((-var52 + var55) * var41 >> 12) + var52;
                                                   int var58 = class173.method1546(this.field4204[var27 + var48], (byte)-58, var43, var36, var40);
                                                   int var59 = ((var58 - var56) * var39 >> 12) + var56;
                                                   int var60 = class173.method1546(this.field4204[var29 + var46], (byte)-89, var43, var38, var35);
                                                   int var61 = class173.method1546(this.field4204[var27 - -var46], (byte)-41, var43, var38, var40);
                                                   int var62 = ((-var60 + var61) * var39 >> 12) + var60;
                                                   int var63 = var59 - -((-var59 + var62) * var41 >> 12);
                                                   this.method2350(((-var57 + var63) * var42 >> 12) + var57, (byte)10, var15);
                                                   ++var15;
                                                   if (~var15 <= ~this.field4202) {
                                                      var10000 = this;
                                                      if (!var5) {
                                                         break;
                                                      }
                                                   } else {
                                                      var10000 = this;
                                                   }
                                                }
                                             }

                                             var10000.method2343((byte)19);
                                             ++var14;
                                          } while(~var14 > ~arg0);
                                       }

                                       ++var13;
                                    } while(~var13 > ~arg3);
                                 }

                                 ++var12;
                              } while(~var12 > ~arg2);

                              return;
                           }

                           ++var11;
                        }
                     }

                     ++var10;
                  }
               }

               ++var9;
            }
         }
      } catch (RuntimeException var65) {
         throw class608.method4462(var65, field4213[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(IIILmn;Lmn;)V",
      line = 220
   )
   public static final void method2347(int arg0, int arg1, int arg2, class383 arg3, class383 arg4) {
      class600 var5 = class18.method134(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field8658 = arg3;
         var5.field8660 = arg4;
         int var6 = class455.field6647 == class269.field3810 ? 1 : 0;
         if (arg3.method593((byte)-94)) {
            if (arg3.method588(1)) {
               arg3.field4088 = class559.field8137[var6];
               class559.field8137[var6] = arg3;
            } else {
               arg3.field4088 = class529.field7698[var6];
               class529.field7698[var6] = arg3;
               class186.field2818 = true;
            }
         } else {
            arg3.field4088 = class389.field5744[var6];
            class389.field5744[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method593((byte)-94)) {
               if (arg4.method588(1)) {
                  arg4.field4088 = class559.field8137[var6];
                  class559.field8137[var6] = arg4;
                  return;
               }

               arg4.field4088 = class529.field7698[var6];
               class529.field7698[var6] = arg4;
               class186.field2818 = true;
               return;
            }

            arg4.field4088 = class389.field5744[var6];
            class389.field5744[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(Z)V",
      line = 282
   )
   public static void method2348(boolean arg0) {
      try {
         field4212 = null;
         if (!arg0) {
            method2347(88, -59, -47, (class383)null, (class383)null);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4213[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "c",
      descriptor = "(I)V",
      line = 294
   )
   private final void method2349(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field4205;
         this.field4206 = new short[this.field4202];
         int var3 = 0;
         if (var2) {
            this.field4206[var3] = (short)((int)Math.pow(2.0D, (double)var3));
            ++var3;
         }

         while(true) {
            while(~this.field4202 < ~var3) {
               this.field4206[var3] = (short)((int)Math.pow(2.0D, (double)var3));
               ++var3;
            }

            if (!var2) {
               if (arg0 >= -111) {
                  this.method2344(-99);
                  return;
               }

               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4213[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(IZI)Z",
      line = 319
   )
   public static final boolean method2351(int arg0, boolean arg1, int arg2) {
      try {
         ++field4201;
         if (!arg1) {
            method2347(108, -124, -92, (class383)null, (class383)null);
         }

         return (arg0 & 384) != 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4213[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method2343(byte arg0);

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method2346(int arg0);

   @OriginalMember(
      owner = "client!ao",
      name = "a",
      descriptor = "(IBI)V"
   )
   public abstract void method2350(int arg0, byte arg1, int arg2);

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2352(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ao",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2353(char[] arg0) {
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
            var10005 = 40;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
