import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class408 extends class65 {
   @OriginalMember(
      owner = "client!lw",
      name = "Tb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5993 = new String[]{method3202(method3201("\u000bi\f\bZO")), method3202(method3201("\u000bi\f\u000fZO")), method3202(method3201("\u000bi\f\u0006ZO")), method3202(method3201("\u000bi\f\u0007ZO")), method3202(method3201("\tkN'")), method3202(method3201("\u001c0\fed")), method3202(method3201("\u000bi\f\u000eZO")), method3202(method3201("\u000bi\f\u0000ZO")), method3202(method3201("\u000bi\f\u0003ZO")), method3202(method3201("\u000bi\f\rZO")), method3202(method3201("\u000bi\f\u0002ZO")), method3202(method3201("\u000bi\f\fZO")), method3202(method3201("\u000bi\f\u0001ZO"))};
   @OriginalMember(
      owner = "client!lw",
      name = "O",
      descriptor = "I"
   )
   public static int field5980;
   @OriginalMember(
      owner = "client!lw",
      name = "Rb",
      descriptor = "I"
   )
   public static int field5981;
   @OriginalMember(
      owner = "client!lw",
      name = "Kb",
      descriptor = "I"
   )
   public static int field5982;
   @OriginalMember(
      owner = "client!lw",
      name = "Lb",
      descriptor = "I"
   )
   public static int field5983;
   @OriginalMember(
      owner = "client!lw",
      name = "Pb",
      descriptor = "I"
   )
   private int field5984;
   @OriginalMember(
      owner = "client!lw",
      name = "Nb",
      descriptor = "I"
   )
   public static int field5985;
   @OriginalMember(
      owner = "client!lw",
      name = "Ob",
      descriptor = "I"
   )
   public static int field5986;
   @OriginalMember(
      owner = "client!lw",
      name = "Mb",
      descriptor = "I"
   )
   public static int field5987;
   @OriginalMember(
      owner = "client!lw",
      name = "Jb",
      descriptor = "I"
   )
   public static int field5988;
   @OriginalMember(
      owner = "client!lw",
      name = "Hb",
      descriptor = "I"
   )
   public static int field5989;
   @OriginalMember(
      owner = "client!lw",
      name = "Qb",
      descriptor = "I"
   )
   public static int field5990;
   @OriginalMember(
      owner = "client!lw",
      name = "Ib",
      descriptor = "I"
   )
   public static int field5991;
   @OriginalMember(
      owner = "client!lw",
      name = "Sb",
      descriptor = "Luj;"
   )
   private class292 field5992;

   @OriginalMember(
      owner = "client!lw",
      name = "t",
      descriptor = "(B)V"
   )
   public final void method3190(byte arg0) {
      try {
         if (arg0 != 113) {
            this.method3199((byte)-128, (class292)null);
         }

         this.field5984 = super.field945 * 8;
         ++field5983;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5993[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(B[BII)V"
   )
   public final void method3191(byte param1, byte[] param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lw",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class408(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lw",
      name = "u",
      descriptor = "(B)V"
   )
   public final void method3192(byte arg0) {
      try {
         super.field945 = (this.field5984 - -7) / 8;
         ++field5987;
         if (arg0 != 59) {
            this.method3200(56, -9);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5993[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "t",
      descriptor = "(I)I"
   )
   public final int method3193(int arg0) {
      try {
         ++field5982;
         if (arg0 >= -120) {
            this.field5984 = -96;
         }

         int var2 = super.field942[super.field945++] + -this.field5992.method2451(true) & 255;
         return ~var2 > -129 ? var2 : (var2 - 128 << 8) - -(255 & super.field942[super.field945++] + -this.field5992.method2451(true));
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5993[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(Ld;Lsa;B)V"
   )
   public static final void method3194(class672 arg0, class39 arg1, byte arg2) {
      try {
         class662.field9328 = arg0;
         if (arg2 >= -61) {
            method3194((class672)null, (class39)null, (byte)77);
         }

         class297.field4415 = arg1;
         ++field5990;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5993[7] + (arg0 != null ? field5993[5] : field5993[4]) + ',' + (arg1 != null ? field5993[5] : field5993[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "k",
      descriptor = "(II)I"
   )
   public final int method3195(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 < 110) {
            return 118;
         } else {
            ++field5986;
            int var4 = this.field5984 >> 3;
            int var5 = -(this.field5984 & 7) + 8;
            int var6 = 0;
            this.field5984 += arg1;
            if (var3) {
               var6 += (super.field942[var4++] & class236.field3655[var5]) << -var5 + arg1;
               arg1 -= var5;
               var5 = 8;
            }

            while(true) {
               while(var5 < arg1) {
                  var6 += (super.field942[var4++] & class236.field3655[var5]) << -var5 + arg1;
                  arg1 -= var5;
                  var5 = 8;
               }

               int var10000 = ~arg1;
               int var10001 = ~var5;
               if (!var3) {
                  if (var10000 != var10001) {
                     var6 += super.field942[var4] >> var5 - arg1 & class236.field3655[arg1];
                     if (!var3) {
                        return var6;
                     }
                  }

                  var6 += class236.field3655[var5] & super.field942[var4];
                  return var6;
               }

               arg1 = var10000 - var10001;
               var5 = 8;
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field5993[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "u",
      descriptor = "(I)Z"
   )
   public final boolean method3196(int arg0) {
      try {
         ++field5981;
         int var2 = super.field942[super.field945] + -this.field5992.method2453(-75) & 255;
         return arg0 >= ~var2;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5993[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "j",
      descriptor = "(II)I"
   )
   public final int method3197(int arg0, int arg1) {
      try {
         if (arg0 != 8) {
            method3194((class672)null, (class39)null, (byte)15);
         }

         ++field5980;
         return arg1 * 8 + -this.field5984;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5993[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(I[I)V"
   )
   public final void method3198(int arg0, int[] arg1) {
      try {
         this.field5992 = new class292(arg1);
         ++field5988;
         if (arg0 != 255) {
            this.method3190((byte)15);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5993[9] + arg0 + ',' + (arg1 != null ? field5993[5] : field5993[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(BLuj;)V"
   )
   public final void method3199(byte arg0, class292 arg1) {
      try {
         this.field5992 = arg1;
         ++field5985;
         if (arg0 < 80) {
            method3194((class672)null, (class39)null, (byte)-37);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5993[11] + arg0 + ',' + (arg1 != null ? field5993[5] : field5993[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "i",
      descriptor = "(II)V"
   )
   public final void method3200(int arg0, int arg1) {
      try {
         super.field942[super.field945++] = (byte)(this.field5992.method2451(true) + arg0);
         if (arg1 != 792388743) {
            this.method3191((byte)-119, (byte[])null, -53, -112);
         }

         ++field5991;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5993[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3201(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3202(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
