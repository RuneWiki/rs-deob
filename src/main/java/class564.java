import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class564 extends class606 {
   @OriginalMember(
      owner = "client!an",
      name = "H",
      descriptor = "I"
   )
   private int field8025 = 4096;
   @OriginalMember(
      owner = "client!an",
      name = "F",
      descriptor = "I"
   )
   private int field8022 = 4096;
   @OriginalMember(
      owner = "client!an",
      name = "J",
      descriptor = "I"
   )
   private int field8023 = 4096;
   @OriginalMember(
      owner = "client!an",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8029 = new String[]{method4201(method4200("\u0018\u0005)\u0007J")), method4201(method4200("\r^kE")), method4201(method4200("\u0002E)h\u001f")), method4201(method4200("\u0002E)k\u001f")), method4201(method4200("\u0002E)j\u001f")), method4201(method4200("\u0002E)l\u001f"))};
   @OriginalMember(
      owner = "client!an",
      name = "E",
      descriptor = "Liw;"
   )
   public static class107 field8028 = new class107(50);
   @OriginalMember(
      owner = "client!an",
      name = "D",
      descriptor = "I"
   )
   public static int field8024;
   @OriginalMember(
      owner = "client!an",
      name = "G",
      descriptor = "I"
   )
   public static int field8026;
   @OriginalMember(
      owner = "client!an",
      name = "I",
      descriptor = "I"
   )
   public static int field8027;

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         if (arg2 <= -6) {
            ++field8026;
            if (arg1 != 0) {
               if (~arg1 == -2) {
                  this.field8023 = arg0.method685(-2);
                  return;
               }

               if (arg1 != 2) {
                  return;
               }

               if (!client.field10022) {
                  this.field8022 = arg0.method685(-2);
                  return;
               }
            }

            this.field8025 = arg0.method685(-2);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8029[2] + (arg0 != null ? field8029[0] : field8029[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "<init>",
      descriptor = "()V"
   )
   public class564() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!an",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4198(int arg0) {
      try {
         if (arg0 != 1) {
            method4199((String)null, (String)null, 48, false, (byte)1);
         }

         field8028 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8029[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field8027;
         int[][] var4 = super.field8649.method5536(arg0 ^ 23627, arg1);
         if (arg0 != 373) {
            this.method8((class65)null, 37, 58);
         }

         if (super.field8649.field11043) {
            int[][] var5 = this.method4467(0, arg1, (byte)88);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || ~class563.field8014 < ~var12) {
               do {
                  int var13 = var6[var12];
                  int var14 = var8[var12];
                  int var15 = var7[var12];
                  if (~var13 != ~var14 || var14 != var15) {
                     var9[var12] = this.field8025;
                     var10[var12] = this.field8023;
                     var11[var12] = this.field8022;
                     if (!var3) {
                        ++var12;
                        continue;
                     }
                  }

                  var9[var12] = this.field8025 * var13 >> 12;
                  var10[var12] = this.field8023 * var14 >> 12;
                  var11[var12] = this.field8022 * var15 >> 12;
                  ++var12;
               } while(~class563.field8014 < ~var12);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class612.method4503(var17, field8029[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IZB)V"
   )
   public static final void method4199(String arg0, String arg1, int arg2, boolean arg3, byte arg4) {
      try {
         if (arg4 != -90) {
            method4198(-55);
         }

         ++field8024;
         class381 var5 = class563.method4194((byte)-95);
         var5.field5570.method656((byte)104, class765.field10975.field11484);
         var5.field5570.method653(0, -105);
         int var6 = var5.field5570.field945;
         var5.field5570.method653(660, arg4 + 40);
         int[] var7 = class171.method1588(var5, 2041);
         int var8 = var5.field5570.field945;
         var5.field5570.method658(arg1, -100);
         var5.field5570.method653(class302.field4544, arg4 + 34);
         var5.field5570.method658(arg0, -99);
         var5.field5570.method686(-1927998584, class635.field9003);
         var5.field5570.method656((byte)101, class777.field11340);
         var5.field5570.method656((byte)-116, class343.field5054.field5700);
         class531.method3966(var5.field5570, (byte)-1);
         String var9 = class537.field7555;
         var5.field5570.method656((byte)-127, var9 == null ? 0 : 1);
         if (var9 != null) {
            var5.field5570.method658(var9, -81);
         }

         var5.field5570.method656((byte)54, arg2);
         var5.field5570.method656((byte)96, arg3 ? 1 : 0);
         var5.field5570.field945 += 7;
         var5.field5570.method657(var5.field5570.field945, var7, var8, (byte)107);
         var5.field5570.method670((byte)-7, -var6 + var5.field5570.field945);
         class745.field10604.method2111(14024, var5);
         class617.field8766 = -3;
         class467.field6773 = 1;
         class699.field10075 = 0;
         class330.field4925 = 0;
         if (arg2 < 13) {
            class789.field11490 = true;
            class102.method1006(-10716);
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field8029[4] + (arg0 != null ? field8029[0] : field8029[1]) + ',' + (arg1 != null ? field8029[0] : field8029[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4200(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!an",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4201(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
