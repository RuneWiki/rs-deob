import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class20 {
   @OriginalMember(
      owner = "client!l",
      name = "l",
      descriptor = "I"
   )
   private int field325 = 0;
   @OriginalMember(
      owner = "client!l",
      name = "f",
      descriptor = "I"
   )
   public int field327 = 512;
   @OriginalMember(
      owner = "client!l",
      name = "e",
      descriptor = "Z"
   )
   public boolean field330 = true;
   @OriginalMember(
      owner = "client!l",
      name = "n",
      descriptor = "Z"
   )
   public boolean field335 = true;
   @OriginalMember(
      owner = "client!l",
      name = "g",
      descriptor = "I"
   )
   public int field337 = -1;
   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field338 = new String[]{method149(method148("j=\nY")), method149(method148("j=\bY")), method149(method148("hf%\u001d")), method149(method148("}=g_\u0017")), method149(method148("j=\u000bY")), method149(method148("j=\rY"))};
   @OriginalMember(
      owner = "client!l",
      name = "d",
      descriptor = "I"
   )
   public static int field324 = -1;
   @OriginalMember(
      owner = "client!l",
      name = "i",
      descriptor = "I"
   )
   public static int field328 = -1;
   @OriginalMember(
      owner = "client!l",
      name = "k",
      descriptor = "I"
   )
   public int field323;
   @OriginalMember(
      owner = "client!l",
      name = "c",
      descriptor = "I"
   )
   public int field326;
   @OriginalMember(
      owner = "client!l",
      name = "h",
      descriptor = "I"
   )
   public static int field329;
   @OriginalMember(
      owner = "client!l",
      name = "j",
      descriptor = "I"
   )
   public int field331;
   @OriginalMember(
      owner = "client!l",
      name = "o",
      descriptor = "I"
   )
   public static int field332;
   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "I"
   )
   public static int field333;
   @OriginalMember(
      owner = "client!l",
      name = "m",
      descriptor = "I"
   )
   public static int field334;
   @OriginalMember(
      owner = "client!l",
      name = "b",
      descriptor = "I"
   )
   public int field336;

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(I[I[I[FII[FIIIIBI)V",
      line = 6
   )
   public static final void method144(int arg0, int[] arg1, int[] arg2, float[] arg3, int arg4, int arg5, float[] arg6, int arg7, int arg8, int arg9, int arg10, byte arg11, int arg12) {
      boolean var13 = client.field4564;

      try {
         ++field332;
         int var14 = arg5 * arg9 + arg8;
         int var15 = arg0 * arg7 + arg12;
         int var16 = arg9 - arg10;
         int var17 = arg7 - arg10;
         if (arg11 != 95) {
            method144(-62, (int[])null, (int[])null, (float[])null, -118, 105, (float[])null, 103, 25, 127, -80, (byte)39, -111);
         }

         if (arg1 != null) {
            if (arg3 != null) {
               int var20 = 0;
               if (var13 || ~arg4 < ~var20) {
                  do {
                     int var21 = arg10 + var14;
                     if (var13) {
                        arg2[var15] = arg1[var14];
                        arg6[var15++] = arg3[var14++];
                     }

                     while(true) {
                        if (~var14 <= ~var21) {
                           var15 += var17;
                           var14 += var16;
                           if (!var13) {
                              ++var20;
                              break;
                           }
                        } else {
                           arg2[var15] = arg1[var14];
                        }

                        arg6[var15++] = arg3[var14++];
                     }
                  } while(~arg4 < ~var20);

               }
            } else {
               int var18 = 0;
               if (var13 || var18 < arg4) {
                  do {
                     int var19 = arg10 + var14;
                     if (var13 || var14 < var19) {
                        do {
                           arg2[var15++] = arg1[var14++];
                        } while(var14 < var19);
                     }

                     var15 += var17;
                     var14 += var16;
                     ++var18;
                  } while(var18 < arg4);

               }
            }
         } else {
            int var22 = 0;
            if (var13 || var22 < arg4) {
               do {
                  int var23 = var14 - -arg10;
                  if (var13 || var14 < var23) {
                     do {
                        arg6[var15++] = arg3[var14++];
                     } while(var14 < var23);
                  }

                  var15 += var17;
                  var14 += var16;
                  ++var22;
               } while(var22 < arg4);

            }
         }
      } catch (RuntimeException var25) {
         throw class608.method4462(var25, field338[4] + arg0 + ',' + (arg1 != null ? field338[3] : field338[2]) + ',' + (arg2 != null ? field338[3] : field338[2]) + ',' + (arg3 != null ? field338[3] : field338[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field338[3] : field338[2]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(Luda;I)V",
      line = 97
   )
   public final void method145(class473 arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field329;
         if (arg1 != 0) {
            this.field325 = -123;
         }

         do {
            int var4 = arg0.method3564((byte)-116);
            if (var4 == 0) {
               break;
            }

            this.method147(var4, arg0, arg1 ^ 42);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field338[1] + (arg0 != null ? field338[3] : field338[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(ZI)V",
      line = 121
   )
   private final void method146(boolean arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field333;
         double var4 = (double)(255 & arg1 >> 16) / 256.0D;
         double var6 = (double)(255 & arg1 >> 8) / 256.0D;
         double var8 = (double)(arg1 & 255) / 256.0D;
         double var10 = var4;
         if (var4 > var6) {
            var10 = var6;
         }

         if (var8 < var10) {
            var10 = var8;
         }

         double var12 = var4;
         if (var4 < var6) {
            var12 = var6;
         }

         if (var12 < var8) {
            var12 = var8;
         }

         double var14 = 0.0D;
         if (arg0) {
            this.field331 = -81;
         }

         double var16 = 0.0D;
         double var18 = (var10 + var12) / 2.0D;
         if (var10 != var12) {
            label102: {
               if (var18 < 0.5D) {
                  var16 = (-var10 + var12) / (var10 + var12);
               }

               if (var18 >= 0.5D) {
                  var16 = (var12 - var10) / (-var12 + 2.0D + -var10);
               }

               if (var4 == var12) {
                  var14 = (var6 - var8) / (var12 - var10);
                  if (!var3) {
                     break label102;
                  }
               }

               if (var6 != var12) {
                  if (var8 != var12) {
                     break label102;
                  }

                  var14 = (-var6 + var4) / (-var10 + var12) + 4.0D;
                  if (!var3) {
                     break label102;
                  }
               }

               var14 = (var8 - var4) / (-var10 + var12) + 2.0D;
            }
         }

         double var20;
         label75: {
            var20 = var14 / 6.0D;
            this.field323 = (int)(var16 * 256.0D);
            this.field331 = (int)(var18 * 256.0D);
            if (!(var18 > 0.5D)) {
               this.field336 = (int)(var16 * var18 * 512.0D);
               if (!var3) {
                  break label75;
               }
            }

            this.field336 = (int)((1.0D - var18) * var16 * 512.0D);
         }

         label70: {
            if (this.field323 >= 0) {
               if (~this.field323 >= -256) {
                  break label70;
               }

               this.field323 = 255;
               if (!var3) {
                  break label70;
               }
            }

            this.field323 = 0;
         }

         label63: {
            if (this.field331 >= 0) {
               if (~this.field331 >= -256) {
                  break label63;
               }

               this.field331 = 255;
               if (!var3) {
                  break label63;
               }
            }

            this.field331 = 0;
         }

         if (this.field336 < 1) {
            this.field336 = 1;
         }

         this.field326 = (int)((double)this.field336 * var20);
      } catch (RuntimeException var23) {
         throw class608.method4462(var23, field338[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "a",
      descriptor = "(ILuda;I)V",
      line = 216
   )
   private final void method147(int arg0, class473 arg1, int arg2) {
      try {
         ++field334;
         int var4 = 17 / ((-62 - arg2) / 39);
         if (arg0 != 1) {
            if (~arg0 == -3) {
               this.field337 = arg1.method3565(true);
               if (~this.field337 == -65536) {
                  this.field337 = -1;
                  return;
               }
            } else if (~arg0 != -4) {
               if (arg0 == 4) {
                  this.field335 = false;
                  return;
               }

               if (~arg0 == -6) {
                  this.field330 = false;
                  return;
               }
            } else {
               this.field327 = arg1.method3565(true) << 2;
            }

         } else {
            this.field325 = arg1.method3577(-2);
            this.method146(false, this.field325);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field338[5] + arg0 + ',' + (arg1 != null ? field338[3] : field338[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method148(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!l",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method149(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
