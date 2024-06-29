import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class426 {
   @OriginalMember(
      owner = "client!mha",
      name = "e",
      descriptor = "I"
   )
   public int field5794;
   @OriginalMember(
      owner = "client!mha",
      name = "o",
      descriptor = "I"
   )
   public int field5789;
   @OriginalMember(
      owner = "client!mha",
      name = "n",
      descriptor = "I"
   )
   public int field5791;
   @OriginalMember(
      owner = "client!mha",
      name = "f",
      descriptor = "I"
   )
   private int field5788;
   @OriginalMember(
      owner = "client!mha",
      name = "c",
      descriptor = "B"
   )
   public byte field5792;
   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5808 = new String[]{method3306(method3305("\\#/m \u0019")), method3306(method3305("\\#/m'\u0019")), method3306(method3305("\\#/m_X%'7]\u0019")), method3306(method3305("\\#/m\"\u0019")), method3306(method3305("\\#/m!\u0019"))};
   @OriginalMember(
      owner = "client!mha",
      name = "t",
      descriptor = "[Ltk;"
   )
   public static class111[] field5795 = new class111[0];
   @OriginalMember(
      owner = "client!mha",
      name = "r",
      descriptor = "I"
   )
   public int field5786;
   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "I"
   )
   public int field5787;
   @OriginalMember(
      owner = "client!mha",
      name = "j",
      descriptor = "I"
   )
   public static int field5793;
   @OriginalMember(
      owner = "client!mha",
      name = "i",
      descriptor = "I"
   )
   public int field5796;
   @OriginalMember(
      owner = "client!mha",
      name = "s",
      descriptor = "I"
   )
   public int field5797;
   @OriginalMember(
      owner = "client!mha",
      name = "p",
      descriptor = "I"
   )
   public int field5798;
   @OriginalMember(
      owner = "client!mha",
      name = "d",
      descriptor = "I"
   )
   public int field5799;
   @OriginalMember(
      owner = "client!mha",
      name = "h",
      descriptor = "I"
   )
   public int field5800;
   @OriginalMember(
      owner = "client!mha",
      name = "g",
      descriptor = "I"
   )
   public static int field5802;
   @OriginalMember(
      owner = "client!mha",
      name = "u",
      descriptor = "I"
   )
   public int field5804;
   @OriginalMember(
      owner = "client!mha",
      name = "l",
      descriptor = "I"
   )
   public static int field5805;
   @OriginalMember(
      owner = "client!mha",
      name = "v",
      descriptor = "I"
   )
   public int field5806;
   @OriginalMember(
      owner = "client!mha",
      name = "q",
      descriptor = "I"
   )
   public static int field5807;
   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "Lmha;"
   )
   public class426 field5790;
   @OriginalMember(
      owner = "client!mha",
      name = "k",
      descriptor = "[Lpd;"
   )
   public static class648[] field5801;
   @OriginalMember(
      owner = "client!mha",
      name = "m",
      descriptor = "[Lpd;"
   )
   public static class648[] field5803;

   @OriginalMember(
      owner = "client!mha",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3301(int arg0) {
      try {
         if (arg0 == 512) {
            field5795 = null;
            field5803 = null;
            field5801 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5808[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "b",
      descriptor = "(I)Lgv;"
   )
   public final class48 method3302(int arg0) {
      try {
         ++field5793;
         if (arg0 != 22713) {
            field5801 = null;
         }

         return class429.method3318((byte)117, this.field5788);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5808[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3303(int arg0) {
      try {
         label128: {
            ++field5802;
            int var1 = class567.field8342 * 512 - -256;
            int var2 = class565.field8322 * 512 + 256;
            int var3 = class215.method1757(var1, false, class674.field9984, var2) - class523.field7334;
            if (~class158.field2030 > -101) {
               if (var1 > class160.field2051) {
                  class160.field2051 += (-class160.field2051 + var1) * class158.field2030 / 1000 + class570.field8380;
                  if (~class160.field2051 < ~var1) {
                     class160.field2051 = var1;
                  }
               }

               if (class546.field8031 < var3) {
                  class546.field8031 += (-class546.field8031 + var3) * class158.field2030 / 1000 + class570.field8380;
                  if (class546.field8031 > var3) {
                     class546.field8031 = var3;
                  }
               }

               if (var1 < class160.field2051) {
                  class160.field2051 -= (-var1 + class160.field2051) * class158.field2030 / 1000 + class570.field8380;
                  if (~class160.field2051 > ~var1) {
                     class160.field2051 = var1;
                  }
               }

               if (~class546.field8031 < ~var3) {
                  class546.field8031 -= class570.field8380 - -((class546.field8031 - var3) * class158.field2030 / 1000);
                  if (~class546.field8031 > ~var3) {
                     class546.field8031 = var3;
                  }
               }

               if (class168.field2195 < var2) {
                  class168.field2195 += (-class168.field2195 + var2) * class158.field2030 / 1000 + class570.field8380;
                  if (~class168.field2195 < ~var2) {
                     class168.field2195 = var2;
                  }
               }

               if (~var2 <= ~class168.field2195) {
                  break label128;
               }

               class168.field2195 -= (-var2 + class168.field2195) * class158.field2030 / 1000 + class570.field8380;
               if (class168.field2195 >= var2) {
                  break label128;
               }

               class168.field2195 = var2;
               if (!client.field1481) {
                  break label128;
               }
            }

            class168.field2195 = class565.field8322 * 512 + 256;
            class160.field2051 = class567.field8342 * 512 + 256;
            class546.field8031 = class215.method1757(class160.field2051, false, class674.field9984, class168.field2195) + -class523.field7334;
         }

         int var4 = class175.field2264 * 512 + 256;
         int var5 = class283.field3927 * 512 + 256;
         int var6 = class215.method1757(var5, false, class674.field9984, var4) + -class550.field8112;
         if (arg0 < -75) {
            int var7 = -class160.field2051 + var5;
            int var8 = -class546.field8031 + var6;
            int var9 = -class168.field2195 + var4;
            int var10 = (int)Math.sqrt((double)(var7 * var7 - -(var9 * var9)));
            int var11 = (int)(2607.5945876176133D * Math.atan2((double)var8, (double)var10)) & 16383;
            if (var11 < 1024) {
               var11 = 1024;
            }

            int var12 = 16383 & (int)(-2607.5945876176133D * Math.atan2((double)var7, (double)var9));
            if (~var11 < -3073) {
               var11 = 3072;
            }

            if (var11 > class653.field9755) {
               class653.field9755 += (-class653.field9755 + var11 >> 3) * class62.field791 / 1000 + class267.field3374 << 3;
               if (class653.field9755 > var11) {
                  class653.field9755 = var11;
               }
            }

            if (class653.field9755 > var11) {
               class653.field9755 -= (-var11 + class653.field9755 >> 3) * class62.field791 / 1000 + class267.field3374 << 3;
               if (~class653.field9755 > ~var11) {
                  class653.field9755 = var11;
               }
            }

            int var13 = var12 - class242.field3054;
            if (var13 > 8192) {
               var13 -= 16384;
            }

            if (~var13 > 8191) {
               var13 += 16384;
            }

            int var14 = var13 >> 3;
            if (var14 > 0) {
               class242.field3054 += class62.field791 * var14 / 1000 + class267.field3374 << 3;
               class242.field3054 &= 16383;
            }

            if (~var14 > -1) {
               class242.field3054 -= -var14 * class62.field791 / 1000 + class267.field3374 << 3;
               class242.field3054 &= 16383;
            }

            int var15 = -class242.field3054 + var12;
            if (~var15 < -8193) {
               var15 -= 16384;
            }

            if (~var15 > 8191) {
               var15 += 16384;
            }

            class673.field9969 = 0;
            if (~var15 > -1 && var14 > 0 || var15 > 0 && ~var14 > -1) {
               class242.field3054 = var12;
            }
         }
      } catch (RuntimeException var17) {
         throw class93.method866(var17, field5808[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "a",
      descriptor = "(IIII)Lmha;"
   )
   public final class426 method3304(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 != 1000) {
            this.field5792 = -58;
         }

         ++field5805;
         return new class426(this.field5788, arg1, arg2, arg0, this.field5792);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5808[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "<init>",
      descriptor = "(IIIIB)V"
   )
   public class426(int arg0, int arg1, int arg2, int arg3, byte arg4) {
      try {
         this.field5794 = arg2;
         this.field5789 = arg1;
         this.field5791 = arg3;
         this.field5788 = arg0;
         this.field5792 = arg4;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5808[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3305(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3306(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
