import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class581 {
   @OriginalMember(
      owner = "client!nda",
      name = "i",
      descriptor = "I"
   )
   public int field8346 = 8;
   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "I"
   )
   public int field8342 = 16777215;
   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8355 = new String[]{method4285(method4284("\u0007h\u0006S")), method4285(method4284("\u0007y\u000b\u0011{A")), method4285(method4284("\u00123D\u0011D")), method4285(method4284("\u0007y\u000b\u0011|A")), method4285(method4284("\u0007y\u000b\u0011xA")), method4285(method4284("\u0007y\u000b\u0011zA")), method4285(method4284("\u0007y\u000b\u0011}A"))};
   @OriginalMember(
      owner = "client!nda",
      name = "d",
      descriptor = "Luw;"
   )
   public static class435 field8345 = new class435(1, -1);
   @OriginalMember(
      owner = "client!nda",
      name = "n",
      descriptor = "Ljfa;"
   )
   public static class303 field8351 = null;
   @OriginalMember(
      owner = "client!nda",
      name = "l",
      descriptor = "I"
   )
   public static int field8354 = 100;
   @OriginalMember(
      owner = "client!nda",
      name = "j",
      descriptor = "I"
   )
   public int field8340;
   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "I"
   )
   public int field8341;
   @OriginalMember(
      owner = "client!nda",
      name = "g",
      descriptor = "I"
   )
   public int field8343;
   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "I"
   )
   public static int field8344;
   @OriginalMember(
      owner = "client!nda",
      name = "h",
      descriptor = "I"
   )
   public static int field8347;
   @OriginalMember(
      owner = "client!nda",
      name = "k",
      descriptor = "I"
   )
   public int field8348;
   @OriginalMember(
      owner = "client!nda",
      name = "m",
      descriptor = "I"
   )
   public int field8349;
   @OriginalMember(
      owner = "client!nda",
      name = "f",
      descriptor = "I"
   )
   public static int field8350;
   @OriginalMember(
      owner = "client!nda",
      name = "o",
      descriptor = "I"
   )
   public static int field8352;
   @OriginalMember(
      owner = "client!nda",
      name = "e",
      descriptor = "Z"
   )
   public boolean field8353;

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(IZLrk;II[IZI)Lpe;",
      line = 6
   )
   public static final class633 method4279(int arg0, boolean arg1, class35 arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7) {
      try {
         if (arg1) {
            field8345 = null;
         }

         ++field8347;
         if (!arg2.field831 && (!class756.method5476((byte)-63, arg3) || !class756.method5476((byte)-63, arg4))) {
            return !arg2.field802 ? new class633(arg2, arg3, arg4, class71.method752(arg3, !arg1), class71.method752(arg4, true), arg5) : new class633(arg2, 34037, arg3, arg4, arg6, arg5, arg0, arg7);
         } else {
            return new class633(arg2, 3553, arg3, arg4, arg6, arg5, arg0, arg7);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8355[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8355[2] : field8355[0]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8355[2] : field8355[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(B[[F[[S)[[S",
      line = 25
   )
   public static final short[][] method4280(byte arg0, float[][] arg1, short[][] arg2) {
      boolean var3 = client.field4564;

      try {
         ++field8344;
         int var4 = 0;
         byte var10000;
         if (var3) {
            var10000 = 0;
         } else if (~var4 <= ~arg1.length) {
            var10000 = arg0;
            if (!var3) {
               if (arg0 != -108) {
                  return null;
               }

               return arg2;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            int var5 = var10000;
            if (var3) {
               arg2[var4][var5] = (short)((int)(arg1[var4][var5] * 16383.0F));
               ++var5;
            }

            while(true) {
               while(~arg2[var4].length < ~var5) {
                  arg2[var4][var5] = (short)((int)(arg1[var4][var5] * 16383.0F));
                  ++var5;
               }

               if (!var3) {
                  ++var4;
                  if (~var4 <= ~arg1.length) {
                     var10000 = arg0;
                     if (!var3) {
                        if (arg0 != -108) {
                           return null;
                        }

                        return arg2;
                     }
                  } else {
                     var10000 = 0;
                  }
                  break;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8355[4] + arg0 + ',' + (arg1 != null ? field8355[2] : field8355[0]) + ',' + (arg2 != null ? field8355[2] : field8355[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(I)V",
      line = 65
   )
   public static void method4281(int arg0) {
      try {
         field8351 = null;
         field8345 = null;
         if (arg0 != -4287) {
            method4279(-30, true, (class35)null, 109, -16, (int[])null, false, -38);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8355[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 81
   )
   private final void method4282(class473 arg0, int arg1, int arg2) {
      try {
         ++field8352;
         if (arg2 == -10295) {
            if (arg1 == 1) {
               this.field8346 = arg0.method3565(true);
            } else if (~arg1 == -3) {
               this.field8353 = true;
            } else if (~arg1 == -4) {
               this.field8349 = arg0.method3538(-128);
               this.field8341 = arg0.method3538(arg2 + 10167);
               this.field8343 = arg0.method3538(-128);
            } else if (arg1 != 4) {
               if (arg1 != 5) {
                  if (~arg1 == -7) {
                     this.field8342 = arg0.method3577(-2);
                     return;
                  }
               } else {
                  this.field8348 = arg0.method3565(true);
               }

            } else {
               this.field8340 = arg0.method3564((byte)-42);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8355[6] + (arg0 != null ? field8355[2] : field8355[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(ILuda;)V",
      line = 127
   )
   public final void method4283(int arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         while(true) {
            int var4 = arg1.method3564((byte)-54);
            if (~var4 != -1) {
               this.method4282(arg1, var4, -10295);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            int var5 = -83 / ((arg0 - -73) / 53);
            ++field8350;
            break;
         }

      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8355[5] + arg0 + ',' + (arg1 != null ? field8355[2] : field8355[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4284(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4285(char[] arg0) {
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
            var10005 = 29;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
