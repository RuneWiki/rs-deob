import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class728 {
   @OriginalMember(
      owner = "client!od",
      name = "f",
      descriptor = "Lc;"
   )
   private class652 field10869;
   @OriginalMember(
      owner = "client!od",
      name = "m",
      descriptor = "Lg;"
   )
   private class361 field10868;
   @OriginalMember(
      owner = "client!od",
      name = "t",
      descriptor = "I"
   )
   public int field10866;
   @OriginalMember(
      owner = "client!od",
      name = "r",
      descriptor = "I"
   )
   private int field10879;
   @OriginalMember(
      owner = "client!od",
      name = "e",
      descriptor = "[B"
   )
   public byte[] field10870;
   @OriginalMember(
      owner = "client!od",
      name = "j",
      descriptor = "I"
   )
   private int field10873;
   @OriginalMember(
      owner = "client!od",
      name = "n",
      descriptor = "I"
   )
   private int field10862;
   @OriginalMember(
      owner = "client!od",
      name = "q",
      descriptor = "I"
   )
   private int field10863;
   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10881 = new String[]{method5377(method5376("dh|Kv")), method5377(method5376("q3>\t")), method5377(method5376("p\"|!#")), method5377(method5376("p\"|$#")), method5377(method5376("p\"| #")), method5377(method5376("p\"|'#")), method5377(method5376("p\"|&#")), method5377(method5376("p\"|##")), method5377(method5376("p\"|\"#")), method5377(method5376("p\"|Ybq/&[#"))};
   @OriginalMember(
      owner = "client!od",
      name = "p",
      descriptor = "I"
   )
   public static int field10861 = 0;
   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "I"
   )
   public static int field10864;
   @OriginalMember(
      owner = "client!od",
      name = "i",
      descriptor = "I"
   )
   public static int field10865;
   @OriginalMember(
      owner = "client!od",
      name = "d",
      descriptor = "I"
   )
   public static int field10867;
   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "I"
   )
   public static int field10871;
   @OriginalMember(
      owner = "client!od",
      name = "l",
      descriptor = "I"
   )
   public static int field10872;
   @OriginalMember(
      owner = "client!od",
      name = "k",
      descriptor = "I"
   )
   public static int field10874;
   @OriginalMember(
      owner = "client!od",
      name = "g",
      descriptor = "I"
   )
   public static int field10875;
   @OriginalMember(
      owner = "client!od",
      name = "s",
      descriptor = "I"
   )
   public static int field10876;
   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "I"
   )
   public static int field10878;
   @OriginalMember(
      owner = "client!od",
      name = "o",
      descriptor = "I"
   )
   public static int field10880;
   @OriginalMember(
      owner = "client!od",
      name = "h",
      descriptor = "[[Lva;"
   )
   private class218[][] field10877;

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(I[[ZIZIZ)V",
      line = 4
   )
   public final void method5369(int param1, boolean[][] param2, int param3, boolean param4, int param5, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(B)V",
      line = 186
   )
   public final void method5370(byte arg0) {
      boolean var2 = client.field1786;

      try {
         this.field10877 = new class218[this.field10862][this.field10863];
         ++field10875;
         int var3 = -9 / ((arg0 - 54) / 35);
         int var4 = 0;
         if (var2 || ~var4 > ~this.field10863) {
            do {
               int var5 = 0;
               if (var2) {
                  this.field10877[var5][var4] = new class218(this.field10869, this, this.field10868, var5, var4, this.field10873, var5 * 128 + 1, var4 * 128 + 1);
                  ++var5;
               }

               while(true) {
                  while(var5 < this.field10862) {
                     this.field10877[var5][var4] = new class218(this.field10869, this, this.field10868, var5, var4, this.field10873, var5 * 128 + 1, var4 * 128 + 1);
                     ++var5;
                  }

                  if (!var2) {
                     ++var4;
                     break;
                  }

                  ++var5;
               }
            } while(~var4 > ~this.field10863);

         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10881[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Lr;III)V",
      line = 228
   )
   public final void method5371(class273 arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10880;
         class630 var5 = (class630)arg0;
         if (arg2 != 2) {
            this.method5371((class273)null, 46, 102, -89);
         }

         arg3 += var5.field9117 - -1;
         arg1 += var5.field9109 + 1;
         int var6 = this.field10866 * arg1 + arg3;
         int var7 = 0;
         int var8 = var5.field9112;
         int var9 = var5.field9116;
         int var10 = this.field10866 - var9;
         if (~arg1 >= -1) {
            int var11 = 1 - arg1;
            var8 -= var11;
            arg1 = 1;
            var6 += this.field10866 * var11;
            var7 += var9 * var11;
         }

         int var12 = 0;
         if (~this.field10879 >= ~(arg1 + var8)) {
            int var13 = arg1 - (-var8 + -1 - -this.field10879);
            var8 -= var13;
         }

         if (arg3 <= 0) {
            int var14 = -arg3 + 1;
            arg3 = 1;
            var12 += var14;
            var7 += var14;
            var9 -= var14;
            var6 += var14;
            var10 += var14;
         }

         if (~this.field10866 >= ~(arg3 + var9)) {
            int var15 = arg3 + var9 - this.field10866 + 1;
            var9 -= var15;
            var12 += var15;
            var10 += var15;
         }

         if (var9 > 0 && var8 > 0) {
            class327.method2674(var10, var6, true, var12, var9, var7, var8, this.field10870, var5.field9120);
            this.method5373(arg1, (byte)53, var8, arg3, var9);
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field10881[2] + (arg0 != null ? field10881[0] : field10881[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Ljava/io/File;ZLjava/lang/String;)V",
      line = 301
   )
   public static final void method5372(File arg0, boolean arg1, String arg2) {
      try {
         if (!arg1) {
            method5372((File)null, false, (String)null);
         }

         ++field10871;
         class552.field8262.put(arg2, arg0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10881[4] + (arg0 != null ? field10881[0] : field10881[1]) + ',' + arg1 + ',' + (arg2 != null ? field10881[0] : field10881[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(IBIII)V",
      line = 315
   )
   private final void method5373(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field1786;

      try {
         ++field10867;
         if (arg1 == 53) {
            if (this.field10877 != null) {
               int var7 = arg3 + -1 >> 7;
               int var8 = arg3 + -1 + arg4 + -1 >> 7;
               int var9 = arg0 - 1 >> 7;
               int var10 = arg0 + -1 + arg2 + -1 >> 7;
               int var11 = var7;
               if (var6 || var7 <= var8) {
                  do {
                     class218[] var12 = this.field10877[var11];
                     int var13 = var9;
                     if (var6) {
                        var12[var9].field3291 = true;
                        var13 = var9 + 1;
                     }

                     while(true) {
                        while(var13 <= var10) {
                           var12[var13].field3291 = true;
                           ++var13;
                        }

                        if (!var6) {
                           ++var11;
                           break;
                        }

                        ++var13;
                     }
                  } while(var11 <= var8);

               }
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field10881[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Lr;IBI)Z",
      line = 354
   )
   public final boolean method5374(class273 arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field10874;
         if (arg2 < 51) {
            this.method5374((class273)null, 1, (byte)-78, -26);
         }

         class630 var5 = (class630)arg0;
         arg3 += var5.field9117 + 1;
         arg1 += var5.field9109 + 1;
         int var6 = arg3 - -(this.field10866 * arg1);
         int var7 = var5.field9112;
         int var8 = var5.field9116;
         int var9 = -var8 + this.field10866;
         if (~arg1 >= -1) {
            int var10 = -arg1 + 1;
            var6 += this.field10866 * var10;
            arg1 = 1;
            var7 -= var10;
         }

         if (~(arg1 + var7) <= ~this.field10879) {
            int var11 = arg1 - this.field10879 + var7 + 1;
            var7 -= var11;
         }

         if (~arg3 >= -1) {
            int var12 = -arg3 + 1;
            var9 += var12;
            var8 -= var12;
            var6 += var12;
            arg3 = 1;
         }

         if (arg3 - -var8 >= this.field10866) {
            int var13 = -this.field10866 + arg3 + var8 - -1;
            var8 -= var13;
            var9 += var13;
         }

         if (~var8 < -1 && ~var7 < -1) {
            byte var14 = 8;
            int var15 = (var14 - 1) * this.field10866 + var9;
            return class673.method4961(var7, (byte)15, this.field10870, var8, var15, var14, var6);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field10881[5] + (arg0 != null ? field10881[0] : field10881[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(Lr;ZII)V",
      line = 430
   )
   public final void method5375(class273 arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field10864;
         class630 var5 = (class630)arg0;
         arg3 += var5.field9109 + 1;
         arg2 += var5.field9117 + 1;
         int var6 = arg2 - -(this.field10866 * arg3);
         int var7 = 0;
         int var8 = var5.field9112;
         int var9 = var5.field9116;
         int var10 = -var9 + this.field10866;
         if (!arg1) {
            this.method5369(-105, (boolean[][])null, 15, true, 84, false);
         }

         if (arg3 <= 0) {
            int var11 = -arg3 + 1;
            arg3 = 1;
            var6 += this.field10866 * var11;
            var8 -= var11;
            var7 += var9 * var11;
         }

         int var12 = 0;
         if (~this.field10879 >= ~(arg3 + var8)) {
            int var13 = arg3 + 1 + var8 + -this.field10879;
            var8 -= var13;
         }

         if (arg2 <= 0) {
            int var14 = -arg2 + 1;
            var12 += var14;
            arg2 = 1;
            var6 += var14;
            var7 += var14;
            var9 -= var14;
            var10 += var14;
         }

         if (this.field10866 <= arg2 + var9) {
            int var15 = -this.field10866 + 1 + var9 + arg2;
            var9 -= var15;
            var10 += var15;
            var12 += var15;
         }

         if (var9 > 0 && var8 > 0) {
            class738.method5422(var10, var6, this.field10870, var7, var12, -82, var9, var5.field9120, var8);
            this.method5373(arg3, (byte)53, var8, arg2, var9);
         }
      } catch (RuntimeException var17) {
         throw class482.method3757(var17, field10881[3] + (arg0 != null ? field10881[0] : field10881[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "<init>",
      descriptor = "(Lc;Lg;)V",
      line = 503
   )
   public class728(class652 arg0, class361 arg1) {
      try {
         this.field10869 = arg0;
         this.field10868 = arg1;
         this.field10866 = (this.field10868.field4383 * this.field10868.field4377 >> this.field10869.field9620) + 2;
         this.field10879 = 2 - -(this.field10868.field4379 * this.field10868.field4377 >> this.field10869.field9620);
         this.field10870 = new byte[this.field10879 * this.field10866];
         this.field10873 = this.field10869.field9620 + 7 + -this.field10868.field4375;
         this.field10862 = this.field10868.field4383 >> this.field10873;
         this.field10863 = this.field10868.field4379 >> this.field10873;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10881[9] + (arg0 != null ? field10881[0] : field10881[1]) + ',' + (arg1 != null ? field10881[0] : field10881[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5376(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5377(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
