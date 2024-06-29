import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class161 {
   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "[S"
   )
   private short[] field2458 = new short[512];
   @OriginalMember(
      owner = "client!cd",
      name = "e",
      descriptor = "I"
   )
   private int field2454 = 4;
   @OriginalMember(
      owner = "client!cd",
      name = "i",
      descriptor = "I"
   )
   private int field2460 = 4;
   @OriginalMember(
      owner = "client!cd",
      name = "h",
      descriptor = "I"
   )
   private int field2461 = 0;
   @OriginalMember(
      owner = "client!cd",
      name = "c",
      descriptor = "I"
   )
   public int field2464 = 4;
   @OriginalMember(
      owner = "client!cd",
      name = "d",
      descriptor = "I"
   )
   private int field2457 = 4;
   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2466 = new String[]{method1524(method1523("+_9\u0015,")), method1524(method1523("+_9\u0017,")), method1524(method1523("+_9\u0014,")), method1524(method1523("+_9\u0016,")), method1524(method1523("+_9xm&Rcz,"))};
   @OriginalMember(
      owner = "client!cd",
      name = "j",
      descriptor = "I"
   )
   public static int field2455 = 0;
   @OriginalMember(
      owner = "client!cd",
      name = "g",
      descriptor = "[S"
   )
   public static short[] field2459 = new short[256];
   @OriginalMember(
      owner = "client!cd",
      name = "l",
      descriptor = "I"
   )
   public static int field2462;
   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "I"
   )
   public static int field2463;
   @OriginalMember(
      owner = "client!cd",
      name = "f",
      descriptor = "I"
   )
   public static int field2465;
   @OriginalMember(
      owner = "client!cd",
      name = "k",
      descriptor = "[S"
   )
   private short[] field2456;

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1516(int arg0) {
      try {
         if (arg0 != -28188) {
            field2455 = 23;
         }

         field2459 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2466[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method1517(int arg0);

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(Z)V"
   )
   private final void method1518(boolean arg0) {
      boolean var2 = client.field10022;

      RuntimeException var10000;
      label33: {
         boolean var10001;
         int var3;
         try {
            this.field2456 = new short[this.field2464];
            ++field2462;
            var3 = 0;
            if (!arg0) {
               return;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label33;
         }

         while(true) {
            label28: {
               try {
                  if (this.field2464 > var3) {
                     this.field2456[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                     break label28;
                  }
               } catch (RuntimeException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               if (!var2) {
                  return;
               }
            }

            try {
               ++var3;
            } catch (RuntimeException var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var4 = var10000;
      throw class612.method4503(var4, field2466[1] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(ZII)V"
   )
   public abstract void method1519(boolean arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method1520(boolean arg0);

   @OriginalMember(
      owner = "client!cd",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class161(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field2457 = arg2;
         this.field2461 = arg0;
         this.field2460 = arg4;
         this.field2464 = arg1;
         this.field2454 = arg3;
         this.method1518(true);
         this.method1521(true);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2466[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "c",
      descriptor = "(Z)V"
   )
   private final void method1521(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         ++field2463;
         Random var3 = new Random((long)this.field2461);
         if (!arg0) {
            this.method1522(58, -34, -125, 22);
         }

         int var4 = 0;
         if (var2) {
            this.field2458[var4] = (short)var4;
            ++var4;
         }

         while(true) {
            while(var4 < 255) {
               this.field2458[var4] = (short)var4;
               ++var4;
            }

            int var5 = 0;
            if (!var2) {
               if (!var2 && var5 >= 255) {
                  return;
               } else {
                  do {
                     int var6 = -var5 + 255;
                     int var7 = class633.method4632(12, var3, var6);
                     short var8 = this.field2458[var7];
                     this.field2458[var7] = this.field2458[var6];
                     this.field2458[var6] = this.field2458[var6 + 256] = var8;
                     ++var5;
                  } while(var5 < 255);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field2466[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method1522(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field2465;
         int[] var6 = new int[arg2];
         if (arg3 <= -94) {
            int[] var7 = new int[arg1];
            int var8 = 0;
            if (var5) {
               var6[var8] = (var8 << 12) / arg2;
               ++var8;
            }

            while(true) {
               while(~arg2 < ~var8) {
                  var6[var8] = (var8 << 12) / arg2;
                  ++var8;
               }

               int[] var9 = new int[arg0];
               int var10 = 0;
               if (!var5) {
                  if (var5) {
                     var7[var10] = (var10 << 12) / arg1;
                     ++var10;
                  }

                  while(true) {
                     while(~var10 > ~arg1) {
                        var7[var10] = (var10 << 12) / arg1;
                        ++var10;
                     }

                     int var11 = 0;
                     if (!var5) {
                        if (var5) {
                           var9[var11] = (var11 << 12) / arg0;
                           ++var11;
                        }

                        while(true) {
                           while(var11 < arg0) {
                              var9[var11] = (var11 << 12) / arg0;
                              ++var11;
                           }

                           this.method1520(false);
                           int var12 = 0;
                           if (!var5) {
                              if (!var5 && ~var12 <= ~arg0) {
                                 return;
                              }

                              do {
                                 int var13 = 0;
                                 if (var5 || ~var13 > ~arg1) {
                                    do {
                                       int var14 = 0;
                                       if (var5 || var14 < arg2) {
                                          do {
                                             class161 var10000;
                                             label125: {
                                                int var15 = 0;
                                                if (var5) {
                                                   var10000 = this;
                                                } else if (this.field2464 <= var15) {
                                                   var10000 = this;
                                                   if (!var5) {
                                                      break label125;
                                                   }
                                                } else {
                                                   var10000 = this;
                                                }

                                                while(true) {
                                                   int var16 = var10000.field2456[var15] << 12;
                                                   int var17 = this.field2454 * var16 >> 12;
                                                   int var18 = this.field2460 * var16 >> 12;
                                                   int var19 = var9[var12] * var16 >> 12;
                                                   int var20 = this.field2457 * var16 >> 12;
                                                   int var21 = var6[var14] * var16 >> 12;
                                                   int var22 = var7[var13] * var16 >> 12;
                                                   int var23 = this.field2457 * var21;
                                                   int var24 = this.field2460 * var19;
                                                   int var25 = this.field2454 * var22;
                                                   int var26 = var23 >> 12;
                                                   int var27 = var26 - -1;
                                                   int var28 = var26 & 255;
                                                   int var29 = var25 >> 12;
                                                   int var30 = var29 + 1;
                                                   int var31 = var29 & 255;
                                                   int var32 = var24 >> 12;
                                                   int var33 = var32 - -1;
                                                   int var34 = var24 & 4095;
                                                   int var35;
                                                   if (var20 > var27) {
                                                      var35 = var27 & 255;
                                                      if (var5) {
                                                         var35 = 0;
                                                      }
                                                   } else {
                                                      var35 = 0;
                                                   }

                                                   if (~var30 <= ~var17) {
                                                      var30 = 0;
                                                      if (var5) {
                                                         var30 &= 255;
                                                      }
                                                   } else {
                                                      var30 &= 255;
                                                   }

                                                   int var36 = var23 & 4095;
                                                   int var37 = var25 & 4095;
                                                   int var38 = var32 & 255;
                                                   if (var18 <= var33) {
                                                      var33 = 0;
                                                      if (var5) {
                                                         var33 &= 255;
                                                      }
                                                   } else {
                                                      var33 &= 255;
                                                   }

                                                   int var39 = var37 + -4096;
                                                   short var40 = this.field2458[var33];
                                                   int var41 = class482.field6913[var34];
                                                   int var42 = class482.field6913[var36];
                                                   int var43 = class482.field6913[var37];
                                                   short var44 = this.field2458[var38];
                                                   int var45 = var34 + -4096;
                                                   int var46 = var36 + -4096;
                                                   short var47 = this.field2458[var30 - -var44];
                                                   short var48 = this.field2458[var30 + var40];
                                                   short var49 = this.field2458[var31 + var44];
                                                   short var50 = this.field2458[var31 + var40];
                                                   int var51 = class782.method5649(var36, -2, this.field2458[var28 - -var49], var37, var34);
                                                   int var52 = class782.method5649(var46, -45, this.field2458[var35 - -var49], var37, var34);
                                                   int var53 = ((var52 - var51) * var42 >> 12) + var51;
                                                   int var54 = class782.method5649(var36, -109, this.field2458[var28 + var47], var39, var34);
                                                   int var55 = class782.method5649(var46, 127, this.field2458[var35 + var47], var39, var34);
                                                   int var56 = var54 - -((var55 - var54) * var42 >> 12);
                                                   int var57 = class782.method5649(var36, -20, this.field2458[var28 + var50], var37, var45);
                                                   int var58 = ((-var53 + var56) * var43 >> 12) + var53;
                                                   int var59 = class782.method5649(var46, 123, this.field2458[var35 + var50], var37, var45);
                                                   int var60 = ((-var57 + var59) * var42 >> 12) + var57;
                                                   int var61 = class782.method5649(var36, 127, this.field2458[var28 + var48], var39, var45);
                                                   int var62 = class782.method5649(var46, 119, this.field2458[var35 + var48], var39, var45);
                                                   int var63 = ((-var61 + var62) * var42 >> 12) + var61;
                                                   int var64 = ((-var60 + var63) * var43 >> 12) + var60;
                                                   this.method1519(true, var15, ((-var58 + var64) * var41 >> 12) + var58);
                                                   ++var15;
                                                   if (this.field2464 <= var15) {
                                                      var10000 = this;
                                                      if (!var5) {
                                                         break;
                                                      }
                                                   } else {
                                                      var10000 = this;
                                                   }
                                                }
                                             }

                                             var10000.method1517(-164086452);
                                             ++var14;
                                          } while(var14 < arg2);
                                       }

                                       ++var13;
                                    } while(~var13 > ~arg1);
                                 }

                                 ++var12;
                              } while(~var12 > ~arg0);

                              return;
                           }

                           ++var11;
                        }
                     }

                     ++var10;
                  }
               }

               ++var8;
            }
         }
      } catch (RuntimeException var66) {
         throw class612.method4503(var66, field2466[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1523(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1524(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
