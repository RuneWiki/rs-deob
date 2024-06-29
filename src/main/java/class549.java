import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public abstract class class549 {
   @OriginalMember(
      owner = "client!dq",
      name = "c",
      descriptor = "I"
   )
   public int field8217 = 4;
   @OriginalMember(
      owner = "client!dq",
      name = "j",
      descriptor = "I"
   )
   private int field8220 = 4;
   @OriginalMember(
      owner = "client!dq",
      name = "i",
      descriptor = "I"
   )
   private int field8224 = 4;
   @OriginalMember(
      owner = "client!dq",
      name = "d",
      descriptor = "[S"
   )
   private short[] field8221 = new short[512];
   @OriginalMember(
      owner = "client!dq",
      name = "f",
      descriptor = "I"
   )
   private int field8225 = 0;
   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "I"
   )
   private int field8226 = 4;
   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8227 = new String[]{method4174(method4173("C\u0013=\u0005i")), method4174(method4173("C\u0013=\u0007i")), method4174(method4173("C\u0013=\u0006i")), method4174(method4173("C\u0013=u(I\u000bgwi")), method4174(method4173("C\u0013=\u0004i"))};
   @OriginalMember(
      owner = "client!dq",
      name = "h",
      descriptor = "I"
   )
   public static int field8216;
   @OriginalMember(
      owner = "client!dq",
      name = "k",
      descriptor = "I"
   )
   public static int field8218;
   @OriginalMember(
      owner = "client!dq",
      name = "e",
      descriptor = "I"
   )
   public static int field8219;
   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "I"
   )
   public static int field8222;
   @OriginalMember(
      owner = "client!dq",
      name = "g",
      descriptor = "[S"
   )
   private short[] field8223;

   @OriginalMember(
      owner = "client!dq",
      name = "b",
      descriptor = "(B)V",
      line = 8
   )
   private final void method4169(byte arg0) {
      try {
         ++field8222;
         this.field8223 = new short[this.field8217];
         if (arg0 == -78) {
            for(int var2 = 0; ~this.field8217 < ~var2; ++var2) {
               this.field8223[var2] = (short)((int)Math.pow(2.0D, (double)var2));
            }

         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8227[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "<init>",
      descriptor = "(IIIII)V",
      line = 315
   )
   public class549(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field8226 = arg2;
         this.field8225 = arg0;
         this.field8220 = arg3;
         this.field8224 = arg4;
         this.field8217 = arg1;
         this.method4169((byte)-78);
         this.method4170((byte)-57);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8227[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(B)V",
      line = 35
   )
   private final void method4170(byte arg0) {
      try {
         ++field8218;
         Random var2 = new Random((long)this.field8225);
         if (arg0 > -53) {
            this.field8224 = -53;
         }

         for(int var3 = 0; ~var3 > -256; ++var3) {
            this.field8221[var3] = (short)var3;
         }

         for(int var4 = 0; ~var4 > -256; ++var4) {
            int var5 = -var4 + 255;
            int var6 = class784.method5696((byte)25, var5, var2);
            short var7 = this.field8221[var6];
            this.field8221[var6] = this.field8221[var5];
            this.field8221[var5] = this.field8221[var5 + 256] = var7;
         }

      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8227[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IIZI)V",
      line = 74
   )
   public final void method4171(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field8216;
         int[] var5 = new int[arg1];
         int[] var6 = new int[arg3];
         if (arg2) {
            this.method471(false);
         }

         for(int var7 = 0; ~arg1 < ~var7; ++var7) {
            var5[var7] = (var7 << 12) / arg1;
         }

         int[] var8 = new int[arg0];

         for(int var9 = 0; ~arg3 < ~var9; ++var9) {
            var6[var9] = (var9 << 12) / arg3;
         }

         for(int var10 = 0; ~arg0 < ~var10; ++var10) {
            var8[var10] = (var10 << 12) / arg0;
         }

         this.method470(-273);

         for(int var11 = 0; var11 < arg0; ++var11) {
            for(int var12 = 0; ~var12 > ~arg3; ++var12) {
               for(int var13 = 0; ~arg1 < ~var13; ++var13) {
                  for(int var14 = 0; ~var14 > ~this.field8217; ++var14) {
                     int var15 = this.field8223[var14] << 12;
                     int var16 = var6[var12] * var15 >> 12;
                     int var17 = this.field8226 * var15 >> 12;
                     int var18 = var5[var13] * var15 >> 12;
                     int var19 = this.field8224 * var15 >> 12;
                     int var20 = var8[var11] * var15 >> 12;
                     int var21 = this.field8220 * var15 >> 12;
                     int var22 = this.field8226 * var18;
                     int var23 = this.field8220 * var16;
                     int var24 = this.field8224 * var20;
                     int var25 = var22 >> 12;
                     int var26 = var25 + 1;
                     int var27 = var23 >> 12;
                     int var28 = var25 & 255;
                     int var29 = var27 + 1;
                     int var30 = var27 & 255;
                     int var31 = var24 >> 12;
                     int var32 = var31 - -1;
                     int var33;
                     if (var26 >= var17) {
                        var33 = 0;
                     } else {
                        var33 = var26 & 255;
                     }

                     int var34 = var31 & 255;
                     int var35 = var22 & 4095;
                     int var36;
                     if (var32 < var19) {
                        var36 = var32 & 255;
                     } else {
                        var36 = 0;
                     }

                     int var37;
                     if (~var21 >= ~var29) {
                        var37 = 0;
                     } else {
                        var37 = var29 & 255;
                     }

                     int var38 = var24 & 4095;
                     int var39 = var23 & 4095;
                     int var40 = class198.field3052[var38];
                     short var41 = this.field8221[var36];
                     int var42 = class198.field3052[var39];
                     short var43 = this.field8221[var34];
                     int var44 = class198.field3052[var35];
                     int var45 = var39 - 4096;
                     int var46 = var38 + -4096;
                     int var47 = var35 + -4096;
                     short var48 = this.field8221[var37 + var41];
                     short var49 = this.field8221[var30 - -var41];
                     short var50 = this.field8221[var30 + var43];
                     short var51 = this.field8221[var37 + var43];
                     int var52 = class570.method4284(var35, var38, this.field8221[var28 + var50], var39, arg2);
                     int var53 = class570.method4284(var47, var38, this.field8221[var33 + var50], var39, false);
                     int var54 = ((-var52 + var53) * var44 >> 12) + var52;
                     int var55 = class570.method4284(var35, var38, this.field8221[var28 + var51], var45, false);
                     int var56 = class570.method4284(var47, var38, this.field8221[var33 + var51], var45, false);
                     int var57 = ((-var55 + var56) * var44 >> 12) + var55;
                     int var58 = var54 - -((var57 - var54) * var42 >> 12);
                     int var59 = class570.method4284(var35, var46, this.field8221[var28 + var49], var39, false);
                     int var60 = class570.method4284(var47, var46, this.field8221[var33 + var49], var39, false);
                     int var61 = ((-var59 + var60) * var44 >> 12) + var59;
                     int var62 = class570.method4284(var35, var46, this.field8221[var28 - -var48], var45, false);
                     int var63 = class570.method4284(var47, var46, this.field8221[var33 + var48], var45, arg2);
                     int var64 = var62 - -((var63 - var62) * var44 >> 12);
                     int var65 = ((-var61 + var64) * var42 >> 12) + var61;
                     this.method469(var14, -256, var58 - -((-var58 + var65) * var40 >> 12));
                  }

                  this.method471(!arg2);
               }
            }
         }

      } catch (RuntimeException var67) {
         throw class482.method3757(var67, field8227[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IIIIBIII)V",
      line = 242
   )
   public static final void method4172(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1786;

      try {
         ++field8219;
         int var9 = class47.method332(arg1, class84.field1212, 15989, class368.field5724);
         int var10 = class47.method332(arg5, class84.field1212, 15989, class368.field5724);
         int var11 = class47.method332(arg6, class182.field2833, 15989, class443.field6806);
         int var12 = class47.method332(arg3, class182.field2833, 15989, class443.field6806);
         int var13 = class47.method332(arg1 - -arg7, class84.field1212, 15989, class368.field5724);
         int var14 = class47.method332(-arg7 + arg5, class84.field1212, 15989, class368.field5724);
         int var15 = var9;
         if (var8) {
            class689.method5076(var12, var11, (byte)57, class512.field7820[var9], arg0);
            var15 = var9 + 1;
         }

         while(true) {
            int var10000;
            int var10001;
            if (var15 >= var13) {
               int var16 = var10;
               var10000 = arg4;
               var10001 = -53;
               if (!var8) {
                  if (arg4 >= -53) {
                     return;
                  }

                  while(true) {
                     if (var14 >= var16) {
                        int var17 = class47.method332(arg6 + arg7, class182.field2833, 15989, class443.field6806);
                        int var18 = class47.method332(-arg7 + arg3, class182.field2833, 15989, class443.field6806);
                        int var19 = var13;
                        if (!var8) {
                           if (!var8 && ~var13 < ~var14) {
                              return;
                           }

                           do {
                              int[] var20 = class512.field7820[var19];
                              class689.method5076(var17, var11, (byte)57, var20, arg0);
                              class689.method5076(var18, var17, (byte)57, var20, arg2);
                              class689.method5076(var12, var18, (byte)57, var20, arg0);
                              ++var19;
                           } while(~var19 >= ~var14);

                           return;
                        }
                     } else {
                        class689.method5076(var12, var11, (byte)57, class512.field7820[var16], arg0);
                     }

                     --var16;
                  }
               }
            } else {
               var10000 = var12;
               var10001 = var11;
            }

            class689.method5076(var10000, var10001, (byte)57, class512.field7820[var15], arg0);
            ++var15;
         }
      } catch (RuntimeException var22) {
         throw class482.method3757(var22, field8227[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method471(boolean arg0);

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method469(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method470(int arg0);

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4173(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4174(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
