import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class611 extends class629 {
   @OriginalMember(
      owner = "client!lk",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8875 = new String[]{method4492(method4491("p@9E")), method4492(method4491("e\u001b{\u0007\f")), method4492(method4491("r^{lY")), method4492(method4491("r^{eY")), method4492(method4491("r^{gY")), method4492(method4491("r^{cY")), method4492(method4491("r^{fY"))};
   @OriginalMember(
      owner = "client!lk",
      name = "E",
      descriptor = "I"
   )
   public static int field8871 = 0;
   @OriginalMember(
      owner = "client!lk",
      name = "H",
      descriptor = "I"
   )
   public static int field8870;
   @OriginalMember(
      owner = "client!lk",
      name = "D",
      descriptor = "I"
   )
   public static int field8872;
   @OriginalMember(
      owner = "client!lk",
      name = "F",
      descriptor = "I"
   )
   public static int field8873;
   @OriginalMember(
      owner = "client!lk",
      name = "G",
      descriptor = "I"
   )
   public static int field8874;

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(II)[[I",
      line = 4
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 0) {
            this.method45(7, -110);
         }

         ++field8870;
         int[][] var4 = super.field9169.method785((byte)86, arg0);
         if (super.field9169.field1332) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || var8 < class66.field1214) {
               do {
                  this.method4490(1, var8, arg0);
                  int[][] var9 = this.method4621(-104, 0, class16.field294);
                  var5[var8] = var9[0][class428.field6193];
                  var6[var8] = var9[1][class428.field6193];
                  var7[var8] = var9[2][class428.field6193];
                  ++var8;
               } while(var8 < class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field8875[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(ZZ)Z",
      line = 51
   )
   public static boolean method4488(boolean arg0, boolean arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8875[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 58
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         ++field8872;
         if (arg1 == arg2) {
            super.field9166 = ~arg0.method3564((byte)-55) == -2;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8875[2] + (arg0 != null ? field8875[1] : field8875[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "a",
      descriptor = "(Lvca;)V",
      line = 69
   )
   public static final void method4489(class294 arg0) {
      class49.field1047.method367(arg0.field4101, arg0.field4097 + (arg0.method589(19053) >> 1), arg0.field4096, class443.field6466);
      arg0.field4089 = class443.field6466[0];
      arg0.field4098 = class443.field6466[1];
      arg0.field4094 = class443.field6466[2];
   }

   @OriginalMember(
      owner = "client!lk",
      name = "<init>",
      descriptor = "()V",
      line = 79
   )
   public class611() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!lk",
      name = "b",
      descriptor = "(II)[I",
      line = 83
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field8873;
         if (arg1 != 2048) {
            return null;
         } else {
            int[] var4 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               int var5 = 0;
               if (var3 || ~class66.field1214 < ~var5) {
                  do {
                     this.method4490(1, var5, arg0);
                     int[] var6 = this.method4622((byte)123, 0, class16.field294);
                     var4[var5] = var6[class428.field6193];
                     ++var5;
                  } while(~class66.field1214 < ~var5);
               }
            }

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8875[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "c",
      descriptor = "(III)V",
      line = 117
   )
   private final void method4490(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label111: {
            ++field8874;
            int var5 = class429.field6201[arg1];
            int var6 = class442.field6448[arg2];
            float var7 = (float)Math.atan2((double)(var5 - 2048), (double)(var6 + -2048));
            if ((double)var7 >= -3.141592653589793D && (double)var7 <= -2.356194490192345D) {
               class428.field6193 = arg1;
               class16.field294 = arg2;
               if (!var4) {
                  break label111;
               }
            }

            if ((double)var7 <= -1.5707963267948966D && (double)var7 >= -2.356194490192345D) {
               class428.field6193 = arg2;
               class16.field294 = arg1;
               if (!var4) {
                  break label111;
               }
            }

            if ((double)var7 <= -0.7853981633974483D && (double)var7 >= -1.5707963267948966D) {
               class16.field294 = arg1;
               class428.field6193 = class66.field1214 - arg2;
               if (!var4) {
                  break label111;
               }
            }

            if (var7 <= 0.0F && (double)var7 >= -0.7853981633974483D) {
               class428.field6193 = arg1;
               class16.field294 = -arg2 + class686.field10095;
               if (!var4) {
                  break label111;
               }
            }

            if (var7 >= 0.0F && (double)var7 <= 0.7853981633974483D) {
               class428.field6193 = -arg1 + class66.field1214;
               class16.field294 = -arg2 + class686.field10095;
               if (!var4) {
                  break label111;
               }
            }

            if (!((double)var7 >= 0.7853981633974483D) || !((double)var7 <= 1.5707963267948966D)) {
               if (!((double)var7 >= 1.5707963267948966D) || !((double)var7 <= 2.356194490192345D)) {
                  if (!((double)var7 >= 2.356194490192345D) || !((double)var7 <= 3.141592653589793D)) {
                     break label111;
                  }

                  class428.field6193 = -arg1 + class66.field1214;
                  class16.field294 = arg2;
                  if (!var4) {
                     break label111;
                  }
               }

               class16.field294 = -arg1 + class686.field10095;
               class428.field6193 = arg2;
               if (!var4) {
                  break label111;
               }
            }

            class428.field6193 = -arg2 + class66.field1214;
            class16.field294 = class686.field10095 - arg1;
         }

         class16.field294 &= class37.field902;
         if (arg0 == 1) {
            class428.field6193 &= class704.field10259;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8875[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4491(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4492(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
