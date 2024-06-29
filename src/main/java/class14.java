import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class14 {
   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "I"
   )
   private int field261 = 0;
   @OriginalMember(
      owner = "client!uw",
      name = "j",
      descriptor = "I"
   )
   private int field269 = -1;
   @OriginalMember(
      owner = "client!uw",
      name = "c",
      descriptor = "Lrca;"
   )
   private class37 field262 = new class37();
   @OriginalMember(
      owner = "client!uw",
      name = "g",
      descriptor = "Z"
   )
   public boolean field270 = false;
   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "I"
   )
   private int field266;
   @OriginalMember(
      owner = "client!uw",
      name = "e",
      descriptor = "I"
   )
   private int field264;
   @OriginalMember(
      owner = "client!uw",
      name = "d",
      descriptor = "[[I"
   )
   private int[][] field256;
   @OriginalMember(
      owner = "client!uw",
      name = "f",
      descriptor = "[Lsj;"
   )
   private class417[] field263;
   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field271 = new String[]{method124(method123("'\"3&\\<<i$\u001d")), method124(method123("'\"3X\u001d")), method124(method123("'\"3_\u001d")), method124(method123("){34H")), method124(method123("< qv")), method124(method123("'\"3^\u001d")), method124(method123("\u00114s:Z<9d:G7!osP$0={\u00154 qv\u0015;8|}Pr6|y]7")), method124(method123("'\"3Y\u001d")), method124(method123("'\"3\\\u001d")), method124(method123(":''vG")), method124(method123("'\"3[\u001d"))};
   @OriginalMember(
      owner = "client!uw",
      name = "i",
      descriptor = "I"
   )
   public static int field265 = 0;
   @OriginalMember(
      owner = "client!uw",
      name = "n",
      descriptor = "I"
   )
   public static int field257;
   @OriginalMember(
      owner = "client!uw",
      name = "h",
      descriptor = "I"
   )
   public static int field259;
   @OriginalMember(
      owner = "client!uw",
      name = "o",
      descriptor = "I"
   )
   public static int field260;
   @OriginalMember(
      owner = "client!uw",
      name = "k",
      descriptor = "I"
   )
   public static int field267;
   @OriginalMember(
      owner = "client!uw",
      name = "l",
      descriptor = "I"
   )
   public static int field268;
   @OriginalMember(
      owner = "client!uw",
      name = "m",
      descriptor = "Lww;"
   )
   public static class339 field258;

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(B)[[I"
   )
   public final int[][] method117(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field260;
         if (this.field266 != this.field264) {
            throw new RuntimeException(field271[6]);
         } else {
            int var3 = 0;
            if (var2) {
               this.field263[var3] = class99.field1312;
               ++var3;
            }

            while(true) {
               while(~this.field266 < ~var3) {
                  this.field263[var3] = class99.field1312;
                  ++var3;
               }

               if (!var2) {
                  if (arg0 != -101) {
                     this.method118(-66);
                  }

                  return this.field256;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field271[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method118(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(ZI)[I"
   )
   public final int[] method119(boolean arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0) {
            this.field270 = true;
         }

         ++field268;
         if (~this.field266 == ~this.field264) {
            this.field270 = this.field263[arg1] == null;
            this.field263[arg1] = class99.field1312;
            return this.field256[arg1];
         } else if (this.field266 == 1) {
            this.field270 = this.field269 != arg1;
            this.field269 = arg1;
            return this.field256[0];
         } else {
            class417 var4;
            label44: {
               var4 = this.field263[arg1];
               if (var4 == null) {
                  label41: {
                     this.field270 = true;
                     if (~this.field266 < ~this.field261) {
                        var4 = new class417(arg1, this.field261);
                        ++this.field261;
                        if (!var3) {
                           break label41;
                        }
                     }

                     class417 var5 = (class417)this.field262.method284((byte)45);
                     var4 = new class417(arg1, var5.field5702);
                     this.field263[var5.field5705] = null;
                     var5.method4924(-2970);
                  }

                  this.field263[arg1] = var4;
                  if (!var3) {
                     break label44;
                  }
               }

               this.field270 = false;
            }

            this.field262.method291(var4, -117);
            return this.field256[var4.field5702];
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field271[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method120(byte arg0) {
      try {
         if (arg0 >= -47) {
            method120((byte)57);
         }

         field258 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field271[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(IILmb;)Z"
   )
   public static final boolean method121(int arg0, int arg1, class431 arg2) {
      try {
         ++field267;
         int var3 = arg2.method3335(4756, 2);
         if (~var3 == -1) {
            if (arg2.method3335(4756, 1) != 0) {
               method121(arg0, 19684, arg2);
            }

            int var4 = arg2.method3335(arg1 ^ 24176, 6);
            int var5 = arg2.method3335(arg1 ^ 24176, 6);
            boolean var6 = arg2.method3335(arg1 ^ 24176, 1) == 1;
            if (var6) {
               class487.field6801[class417.field5707++] = arg0;
            }

            if (class59.field771[arg0] != null) {
               throw new RuntimeException(field271[9]);
            } else {
               class450 var7 = class91.field1231[arg0];
               class783 var8 = class59.field771[arg0] = new class783();
               var8.field145 = arg0;
               if (class485.field6773[arg0] != null) {
                  var8.method5647(class485.field6773[arg0], -18387);
               }

               var8.method79(true, 72, var7.field6100);
               var8.field110 = var7.field6099;
               int var9 = var7.field6101;
               int var10 = var9 >> 28;
               int var11 = (var9 & 4188320) >> 14;
               int var12 = 255 & var9;
               int var13 = (var11 << 6) + -class539.field7889 - -var4;
               int var14 = (var12 << 6) + var5 + -class353.field4940;
               var8.field11450 = var7.field6095;
               var8.field11406 = var7.field6098;
               var8.field204[0] = class430.field5850[arg0];
               var8.field10457 = var8.field10459 = (byte)var10;
               if (class738.method5357(var14, var13, -20749)) {
                  ++var8.field10459;
               }

               var8.method5651((byte)-114, var13, var14);
               var8.field11417 = false;
               class91.field1231[arg0] = null;
               return true;
            }
         } else if (~var3 == -2) {
            int var15 = arg2.method3335(4756, 2);
            int var16 = class91.field1231[arg0].field6101;
            class91.field1231[arg0].field6101 = (805306368 & (var16 >> 28) + var15 << 28) + (var16 & 268435455);
            return false;
         } else if (var3 == 2) {
            int var17 = arg2.method3335(arg1 + -14928, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class91.field1231[arg0].field6101;
            int var21 = (var20 >> 28) + var18 & 3;
            int var22 = 255 & var20 >> 14;
            int var23 = 255 & var20;
            if (~var19 == -1) {
               --var22;
               --var23;
            }

            if (var19 == 1) {
               --var23;
            }

            if (~var19 == -3) {
               ++var22;
               --var23;
            }

            if (var19 == 3) {
               --var22;
            }

            if (~var19 == -5) {
               ++var22;
            }

            if (var19 == 5) {
               ++var23;
               --var22;
            }

            if (var19 == 6) {
               ++var23;
            }

            if (~var19 == -8) {
               ++var23;
               ++var22;
            }

            class91.field1231[arg0].field6101 = (var21 << 28) + (var22 << 14) - -var23;
            return false;
         } else {
            int var24 = arg2.method3335(arg1 + -14928, 18);
            if (arg1 != 19684) {
               method122(true, (String)null, (File)null);
            }

            int var25 = var24 >> 16;
            int var26 = (65531 & var24) >> 8;
            int var27 = 255 & var24;
            int var28 = class91.field1231[arg0].field6101;
            int var29 = (var28 >> 28) + var25 & 3;
            int var30 = 255 & (var28 >> 14) + var26;
            int var31 = var28 - -var27 & 255;
            class91.field1231[arg0].field6101 = (var29 << 28) - (-(var30 << 14) - var31);
            return false;
         }
      } catch (RuntimeException var33) {
         throw class93.method866(var33, field271[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field271[3] : field271[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "a",
      descriptor = "(ZLjava/lang/String;Ljava/io/File;)V"
   )
   public static final void method122(boolean arg0, String arg1, File arg2) {
      try {
         class159.field2036.put(arg1, arg2);
         ++field257;
         if (arg0) {
            method121(39, -77, (class431)null);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field271[2] + arg0 + ',' + (arg1 != null ? field271[3] : field271[4]) + ',' + (arg2 != null ? field271[3] : field271[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class14(int arg0, int arg1, int arg2) {
      try {
         this.field266 = arg0;
         this.field264 = arg1;
         this.field256 = new int[this.field266][arg2];
         this.field263 = new class417[this.field264];
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field271[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method123(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method124(char[] arg0) {
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
            var10005 = 85;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
