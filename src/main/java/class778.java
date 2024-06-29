import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class778 extends class264 {
   @OriginalMember(
      owner = "client!pn",
      name = "J",
      descriptor = "Z"
   )
   private boolean field11403 = true;
   @OriginalMember(
      owner = "client!pn",
      name = "H",
      descriptor = "I"
   )
   private int field11401 = 4096;
   @OriginalMember(
      owner = "client!pn",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11408 = new String[]{method5606(method5605("r\u001cp\u001ax")), method5606(method5605("r\u001cp\u001bx")), method5606(method5605("r\u001cp\u0019x")), method5606(method5605("y\\pp-")), method5606(method5605("l\u000722")), method5606(method5605("r\u001cp\u001fx")), method5606(method5605("r\u001cp\u001dx"))};
   @OriginalMember(
      owner = "client!pn",
      name = "O",
      descriptor = "I"
   )
   public static int field11399 = 0;
   @OriginalMember(
      owner = "client!pn",
      name = "I",
      descriptor = "[Lli;"
   )
   public static class455[] field11406 = new class455[6];
   @OriginalMember(
      owner = "client!pn",
      name = "L",
      descriptor = "I"
   )
   public static int field11398;
   @OriginalMember(
      owner = "client!pn",
      name = "P",
      descriptor = "I"
   )
   public static int field11400;
   @OriginalMember(
      owner = "client!pn",
      name = "Q",
      descriptor = "I"
   )
   public static int field11402;
   @OriginalMember(
      owner = "client!pn",
      name = "F",
      descriptor = "I"
   )
   public static int field11404;
   @OriginalMember(
      owner = "client!pn",
      name = "M",
      descriptor = "I"
   )
   public static int field11407;
   @OriginalMember(
      owner = "client!pn",
      name = "N",
      descriptor = "Lkf;"
   )
   public static class266 field11397;
   @OriginalMember(
      owner = "client!pn",
      name = "G",
      descriptor = "Lmja;"
   )
   public static class444 field11405;

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(IC)Z"
   )
   public static final boolean method5602(int arg0, char arg1) {
      try {
         if (arg0 != 10358) {
            field11407 = -115;
         }

         ++field11398;
         return arg1 >= '0' && ~arg1 >= -58 || arg1 >= 'A' && ~arg1 >= -91 || ~arg1 <= -98 && arg1 <= 'z';
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11408[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "<init>",
      descriptor = "()V"
   )
   public class778() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg1 >= -117) {
            method5604(-36, -40);
         }

         ++field11400;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (super.field3634.field8828) {
            int[] var5 = this.method2019(0, -27804, class220.field3144 & arg0 + -1);
            int[] var6 = this.method2019(0, -27804, arg0);
            int[] var7 = this.method2019(0, -27804, class220.field3144 & arg0 - -1);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int var11 = 0;
            if (var3 || class430.field6152 > var11) {
               do {
                  int var19;
                  int var20;
                  int var21;
                  label33: {
                     int var12 = (var7[var11] + -var5[var11]) * this.field11401;
                     int var13 = (var6[class78.field967 & var11 + 1] + -var6[var11 + -1 & class78.field967]) * this.field11401;
                     int var14 = var13 >> 12;
                     int var15 = var12 >> 12;
                     int var16 = var14 * var14 >> 12;
                     int var17 = var15 * var15 >> 12;
                     int var18 = (int)(4096.0D * Math.sqrt((double)((float)(var16 + var17 + 4096) / 4096.0F)));
                     if (var18 != 0) {
                        var19 = var12 / var18;
                        var20 = var13 / var18;
                        var21 = 16777216 / var18;
                        if (!var3) {
                           break label33;
                        }
                     }

                     var19 = 0;
                     var20 = 0;
                     var21 = 0;
                  }

                  if (this.field11403) {
                     var20 = (var20 >> 1) + 2048;
                     var19 = (var19 >> 1) + 2048;
                     var21 = (var21 >> 1) + 2048;
                  }

                  var8[var11] = var20;
                  var9[var11] = var19;
                  var10[var11] = var21;
                  ++var11;
               } while(class430.field6152 > var11);
            }
         }

         return var4;
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field11408[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method5603(boolean arg0) {
      try {
         field11405 = null;
         field11406 = null;
         if (!arg0) {
            field11397 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11408[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method5604(int arg0, int arg1) {
      try {
         ++field11402;
         class699 var2 = (class699)class148.field1935.method329((byte)98, (long)arg0);
         if (var2 != null) {
            var2.field10233 = !var2.field10233;
            var2.field10230.method4682(0, var2.field10233);
         }

         if (arg1 != 4096) {
            field11405 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11408[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label48: {
            label42: {
               if (~arg0 != -1) {
                  if (arg0 != 1) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field11401 = arg1.method1211(-26166);
               if (!var4) {
                  break label48;
               }
            }

            this.field11403 = arg1.method1143(-15465) == 1;
         }

         if (arg2 < 49) {
            method5604(-11, 99);
         }

         ++field11404;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11408[5] + arg0 + ',' + (arg1 != null ? field11408[3] : field11408[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5605(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5606(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
