import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class789 extends class606 {
   @OriginalMember(
      owner = "client!fw",
      name = "M",
      descriptor = "I"
   )
   private int field11498 = -1;
   @OriginalMember(
      owner = "client!fw",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11500 = new String[]{method5698(method5697("&9H0{")), method5698(method5697("&9H6{")), method5698(method5697("&9H5{")), method5698(method5697("&9H1{")), method5698(method5697(";`H].")), method5698(method5697("&9H2{")), method5698(method5697(".;\n\u001f")), method5698(method5697("&9H7{"))};
   @OriginalMember(
      owner = "client!fw",
      name = "I",
      descriptor = "Z"
   )
   public static boolean field11490 = false;
   @OriginalMember(
      owner = "client!fw",
      name = "H",
      descriptor = "I"
   )
   public static int field11489;
   @OriginalMember(
      owner = "client!fw",
      name = "F",
      descriptor = "I"
   )
   public int field11491;
   @OriginalMember(
      owner = "client!fw",
      name = "E",
      descriptor = "I"
   )
   public static int field11492;
   @OriginalMember(
      owner = "client!fw",
      name = "G",
      descriptor = "I"
   )
   public static int field11494;
   @OriginalMember(
      owner = "client!fw",
      name = "J",
      descriptor = "I"
   )
   public static int field11495;
   @OriginalMember(
      owner = "client!fw",
      name = "N",
      descriptor = "I"
   )
   public static int field11496;
   @OriginalMember(
      owner = "client!fw",
      name = "L",
      descriptor = "I"
   )
   public static int field11497;
   @OriginalMember(
      owner = "client!fw",
      name = "O",
      descriptor = "I"
   )
   public int field11499;
   @OriginalMember(
      owner = "client!fw",
      name = "K",
      descriptor = "[I"
   )
   public int[] field11493;

   @OriginalMember(
      owner = "client!fw",
      name = "<init>",
      descriptor = "()V"
   )
   public class789() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4470(int arg0) {
      try {
         super.method4470(arg0);
         ++field11496;
         this.field11493 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11500[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method4469(int arg0) {
      try {
         ++field11489;
         return arg0 != -1 ? -55 : this.field11498;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11500[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "e",
      descriptor = "(B)Z"
   )
   public final boolean method5695(byte arg0) {
      try {
         if (arg0 != -87) {
            this.method5(124, 80);
         }

         ++field11497;
         if (this.field11493 != null) {
            return true;
         } else if (~this.field11498 <= -1) {
            class433 var2 = class409.field6007 < 0 ? class433.method3371(class30.field436, this.field11498) : class433.method3382(class30.field436, class409.field6007, this.field11498);
            var2.method3377();
            this.field11493 = var2.method3383();
            this.field11491 = var2.field6353;
            this.field11499 = var2.field6361;
            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11500[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "b",
      descriptor = "(II)[[I"
   )
   public int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field11492;
         if (arg0 != 373) {
            this.method5(-71, -29);
         }

         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (super.field8649.field11043 && this.method5695((byte)-87)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = this.field11499 * (~class451.field6570 != ~this.field11491 ? this.field11491 * arg1 / class451.field6570 : arg1);
            if (~class563.field8014 != ~this.field11499) {
               int var9 = 0;
               if (var3 || ~class563.field8014 < ~var9) {
                  do {
                     int var10 = this.field11499 * var9 / class563.field8014;
                     int var11 = this.field11493[var8 + var10];
                     var7[var9] = class697.method5101(var11 << 4, 4080);
                     var6[var9] = class697.method5101(var11 >> 4, 4080);
                     var5[var9] = class697.method5101(16711680, var11) >> 12;
                     ++var9;
                  } while(~class563.field8014 < ~var9);
               }

               if (!var3) {
                  return var4;
               }
            }

            int var12 = 0;
            if (var3 || var12 < class563.field8014) {
               do {
                  int var13 = this.field11493[var8++];
                  var7[var12] = class697.method5101(4080, var13 << 4);
                  var6[var12] = class697.method5101(var13 >> 4, 4080);
                  var5[var12] = class697.method5101(var13 >> 12, 4080);
                  ++var12;
               } while(var12 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field11500[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field11495;
         if (arg2 < -6) {
            if (arg1 == 0) {
               this.field11498 = arg0.method685(-2);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11500[5] + (arg0 != null ? field11500[4] : field11500[6]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method5696(int arg0, int arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         label32: {
            if (class682.field9875 == 1) {
               class508.method3829(arg0, (byte)21, arg1, class261.field4003);
               if (!var3) {
                  break label32;
               }
            }

            if (class682.field9875 == 2) {
               label27: {
                  if (class563.field8012) {
                     class60.method615(arg0 - -class425.method3319(0), class630.method4620((byte)85) + arg1, (byte)10);
                     if (!var3) {
                        break label27;
                     }
                  }

                  class60.method615(arg0, arg1, (byte)10);
               }
            }
         }

         if (arg2 >= -66) {
            method5696(42, -68, -94);
         }

         ++field11494;
         class261.field4003 = null;
         class682.field9875 = 0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11500[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5697(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5698(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
