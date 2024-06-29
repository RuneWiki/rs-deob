import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class347 {
   @OriginalMember(
      owner = "client!hd",
      name = "c",
      descriptor = "Lqn;"
   )
   private class532 field4760 = null;
   @OriginalMember(
      owner = "client!hd",
      name = "f",
      descriptor = "I"
   )
   private int field4761 = 65000;
   @OriginalMember(
      owner = "client!hd",
      name = "d",
      descriptor = "Lqn;"
   )
   private class532 field4764 = null;
   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "I"
   )
   private int field4757;
   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4766 = new String[]{method2748(method2747("]\u000e\u001bxZ")), method2748(method2747("]\u000e\u001b\u007fZ")), method2748(method2747("]\u000e\u001b\u0000\u001b[\u0003A\u0002Z")), method2748(method2747("ND\u001b\u0012\u000f")), method2748(method2747("[\u001fYP")), method2748(method2747("]\u000e\u001bH\u001df\u001eGU\u001cRB")), method2748(method2747("v\u000bVT\u0017\u000f")), method2748(method2747("]\u000e\u001b}Z")), method2748(method2747("]\u000e\u001byZ")), method2748(method2747("]\u000e\u001b~Z"))};
   @OriginalMember(
      owner = "client!hd",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field4759 = new int[1];
   @OriginalMember(
      owner = "client!hd",
      name = "k",
      descriptor = "I"
   )
   public static int field4754;
   @OriginalMember(
      owner = "client!hd",
      name = "e",
      descriptor = "I"
   )
   public static int field4755;
   @OriginalMember(
      owner = "client!hd",
      name = "h",
      descriptor = "I"
   )
   public static int field4756;
   @OriginalMember(
      owner = "client!hd",
      name = "g",
      descriptor = "I"
   )
   public static int field4758;
   @OriginalMember(
      owner = "client!hd",
      name = "j",
      descriptor = "I"
   )
   public static int field4762;
   @OriginalMember(
      owner = "client!hd",
      name = "l",
      descriptor = "I"
   )
   public static int field4763;
   @OriginalMember(
      owner = "client!hd",
      name = "b",
      descriptor = "I"
   )
   public static int field4765;

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(IIIIZIIIII)V"
   )
   public static final void method2741(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field1481;

      try {
         if (arg4) {
            ++field4756;
            if (arg5 == arg9 && arg3 == arg8 && arg0 == arg7 && arg2 == arg6) {
               class552.method4178(arg8, arg7, true, arg1, arg2, arg9);
            } else {
               int var11 = arg9;
               int var12 = arg8;
               int var13 = arg9 * 3;
               int var14 = arg8 * 3;
               int var15 = arg5 * 3;
               int var16 = arg3 * 3;
               int var17 = arg0 * 3;
               int var18 = arg6 * 3;
               int var19 = -var17 + arg7 + var15 - arg9;
               int var20 = -arg8 + arg2 - var18 + var16;
               int var21 = -var15 + var17 + -var15 + var13;
               int var22 = -var16 + var18 + var14 - var16;
               int var23 = var15 - var13;
               int var24 = -var14 + var16;
               int var25 = 128;
               if (var10 || var25 <= 4096) {
                  do {
                     int var26 = var25 * var25 >> 12;
                     int var27 = var25 * var26 >> 12;
                     int var28 = var19 * var27;
                     int var29 = var20 * var27;
                     int var30 = var21 * var26;
                     int var31 = var22 * var26;
                     int var32 = var23 * var25;
                     int var33 = var24 * var25;
                     int var34 = arg9 - -(var30 + var32 + var28 >> 12);
                     int var35 = (var29 - -var31 + var33 >> 12) + arg8;
                     class552.method4178(var12, var34, arg4, arg1, var35, var11);
                     var12 = var35;
                     var11 = var34;
                     var25 += 128;
                  } while(var25 <= 4096);

               }
            }
         }
      } catch (RuntimeException var37) {
         throw class93.method866(var37, field4766[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field4762;
         return field4766[6] + this.field4757;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4766[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(I[BZII)Z"
   )
   private final boolean method2742(int param1, byte[] param2, boolean param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2743(byte arg0) {
      try {
         field4759 = null;
         if (arg0 <= 121) {
            field4759 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4766[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(IIB[B)Z"
   )
   public final boolean method2744(int arg0, int arg1, byte arg2, byte[] arg3) {
      try {
         if (arg2 < 123) {
            return false;
         } else {
            ++field4755;
            class532 var5 = this.field4764;
            synchronized(this.field4764) {
               if (~arg0 <= -1 && this.field4761 >= arg0) {
                  boolean var6 = this.method2742(255, arg3, true, arg1, arg0);
                  if (!var6) {
                     var6 = this.method2742(255, arg3, false, arg1, arg0);
                  }

                  return var6;
               } else {
                  throw new IllegalArgumentException();
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field4766[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4766[3] : field4766[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(BI)[B"
   )
   public final byte[] method2745(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field4765;
         class532 var4 = this.field4764;
         synchronized(this.field4764) {
            try {
               if (arg0 > -21) {
                  this.method2742(-2, (byte[])null, false, -124, 36);
               }

               if (this.field4760.method4050(0) < (long)(arg1 * 6 + 6)) {
                  return null;
               } else {
                  this.field4760.method4049((long)(arg1 * 6), -1);
                  this.field4760.method4052(-115, 6, class689.field10135, 0);
                  int var6 = (255 & class689.field10135[2]) + ((class689.field10135[0] & 255) << 16) + (class689.field10135[1] << 8 & 65280);
                  int var7 = (16711680 & class689.field10135[3] << 16) + ((class689.field10135[4] & 255) << 8) + (255 & class689.field10135[5]);
                  if (var6 >= 0 && ~this.field4761 <= ~var6) {
                     if (~var7 < -1 && ~((long)var7) >= ~(this.field4764.method4050(0) / 520L)) {
                        byte[] var10 = new byte[var6];
                        int var11 = 0;
                        int var12 = 0;
                        if (var3) {
                           if (var7 == 0) {
                              return null;
                           }

                           this.field4764.method4049((long)(var7 * 520), -1);
                        } else if (var6 <= var11) {
                           if (!var3) {
                              return var10;
                           }
                        } else {
                           if (var7 == 0) {
                              return null;
                           }

                           this.field4764.method4049((long)(var7 * 520), -1);
                        }

                        while(true) {
                           int var14 = -var11 + var6;
                           if (~var14 < -513) {
                              var14 = 512;
                           }

                           this.field4764.method4052(-85, var14 - -8, class689.field10135, 0);
                           int var15 = ((255 & class689.field10135[0]) << 8) + (class689.field10135[1] & 255);
                           int var16 = ((class689.field10135[2] & 255) << 8) + (class689.field10135[3] & 255);
                           int var17 = ((255 & class689.field10135[4]) << 16) - -((255 & class689.field10135[5]) << 8) - -(class689.field10135[6] & 255);
                           int var18 = class689.field10135[7] & 255;
                           if (arg1 != var15 || var12 != var16 || this.field4757 != var18) {
                              return null;
                           }

                           if (~var17 > -1 || ~((long)var17) < ~(this.field4764.method4050(0) / 520L)) {
                              return null;
                           }

                           int var21 = 0;
                           if (var3) {
                              var10[var11++] = class689.field10135[var21 + 8];
                              ++var21;
                           }

                           while(true) {
                              while(var21 < var14) {
                                 var10[var11++] = class689.field10135[var21 + 8];
                                 ++var21;
                              }

                              if (!var3) {
                                 ++var12;
                                 if (var6 <= var11) {
                                    if (!var3) {
                                       return var10;
                                    }
                                 } else {
                                    if (var17 == 0) {
                                       return null;
                                    }

                                    this.field4764.method4049((long)(var17 * 520), -1);
                                 }
                                 break;
                              }

                              ++var21;
                           }
                        }
                     } else {
                        return null;
                     }
                  } else {
                     return null;
                  }
               }
            } catch (IOException var41) {
               return null;
            }
         }
      } catch (RuntimeException var43) {
         throw class93.method866(var43, field4766[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method2746(int arg0, int arg1) {
      return class684.field10073 != null ? class684.field10073[arg0][arg1] & 255 : 0;
   }

   @OriginalMember(
      owner = "client!hd",
      name = "<init>",
      descriptor = "(ILqn;Lqn;I)V"
   )
   public class347(int arg0, class532 arg1, class532 arg2, int arg3) {
      try {
         this.field4757 = arg0;
         this.field4760 = arg2;
         this.field4761 = arg3;
         this.field4764 = arg1;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4766[2] + arg0 + ',' + (arg1 != null ? field4766[3] : field4766[4]) + ',' + (arg2 != null ? field4766[3] : field4766[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2747(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2748(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
