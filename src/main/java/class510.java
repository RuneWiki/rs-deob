import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class510 extends class264 {
   @OriginalMember(
      owner = "client!cga",
      name = "G",
      descriptor = "I"
   )
   private int field7418 = 4096;
   @OriginalMember(
      owner = "client!cga",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7421 = new String[]{method3706(method3705("R^+*2")), method3706(method3705("J\u0017d*\u000b\u0001")), method3706(method3705("G\u0005ih")), method3706(method3705("J\u0017d*\u0007\u0001")), method3706(method3705("J\u0017d*\n\u0001")), method3706(method3705("J\u0017d*\t\u0001")), method3706(method3705("J\u0017d*\u000e\u0001")), method3706(method3705("J\u0017d*\f\u0001")), method3706(method3705("J\u0017d*\r\u0001"))};
   @OriginalMember(
      owner = "client!cga",
      name = "F",
      descriptor = "Lqd;"
   )
   public static class475 field7420 = new class475("", 11);
   @OriginalMember(
      owner = "client!cga",
      name = "K",
      descriptor = "I"
   )
   public static int field7413;
   @OriginalMember(
      owner = "client!cga",
      name = "H",
      descriptor = "I"
   )
   public static int field7414;
   @OriginalMember(
      owner = "client!cga",
      name = "I",
      descriptor = "I"
   )
   public static int field7415;
   @OriginalMember(
      owner = "client!cga",
      name = "M",
      descriptor = "I"
   )
   public static int field7416;
   @OriginalMember(
      owner = "client!cga",
      name = "L",
      descriptor = "I"
   )
   public static int field7417;
   @OriginalMember(
      owner = "client!cga",
      name = "J",
      descriptor = "I"
   )
   public static int field7419;

   @OriginalMember(
      owner = "client!cga",
      name = "b",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method3700(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 55) {
            return true;
         } else {
            ++field7419;
            return (55 & arg0) != 0;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7421[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "d",
      descriptor = "(I)V",
      line = 14
   )
   public static void method3701(int arg0) {
      try {
         if (arg0 != -339) {
            field7420 = null;
         }

         field7420 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7421[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "<init>",
      descriptor = "()V",
      line = 25
   )
   public class510() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!cga",
      name = "c",
      descriptor = "(Z)V",
      line = 30
   )
   public static final void method3702(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(II)[I",
      line = 51
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = -127 / ((24 - arg1) / 44);
         ++field7414;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int[] var6 = this.method2019(0, -27804, arg0 + -1 & class220.field3144);
            int[] var7 = this.method2019(0, -27804, arg0);
            int[] var8 = this.method2019(0, -27804, class220.field3144 & arg0 - -1);
            int var9 = 0;
            if (var3 || var9 < class430.field6152) {
               do {
                  int var10 = (var8[var9] + -var6[var9]) * this.field7418;
                  int var11 = (var7[var9 + 1 & class78.field967] + -var7[class78.field967 & var9 - 1]) * this.field7418;
                  int var12 = var11 >> 12;
                  int var13 = var10 >> 12;
                  int var14 = var12 * var12 >> 12;
                  int var15 = var13 * var13 >> 12;
                  int var16 = (int)(4096.0D * Math.sqrt((double)((float)(var14 - -var15 + 4096) / 4096.0F)));
                  int var17 = var16 == 0 ? 0 : 16777216 / var16;
                  var5[var9] = -var17 + 4096;
                  ++var9;
               } while(var9 < class430.field6152);
            }
         }

         return var5;
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field7421[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(Lbl;III)V",
      line = 106
   )
   public static final void method3703(class678 arg0, int arg1, int arg2, int arg3) {
      try {
         class284.field3939 = arg3;
         if (arg2 == 11) {
            class176.field2438 = arg0;
            ++field7415;
            class564.field8046 = arg1;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7421[1] + (arg0 != null ? field7421[0] : field7421[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 130
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         if (arg2 <= 49) {
            this.method3(-86, (class147)null, 24);
         }

         ++field7413;
         if (arg0 == 0) {
            this.field7418 = arg1.method1211(-26166);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7421[6] + arg0 + ',' + (arg1 != null ? field7421[0] : field7421[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(CZ)Z",
      line = 144
   )
   public static final boolean method3704(char arg0, boolean arg1) {
      try {
         ++field7417;
         if (~arg0 <= -33 && arg0 <= '~') {
            return true;
         } else if (~arg0 <= -161 && ~arg0 >= -256) {
            return true;
         } else if (arg1) {
            return false;
         } else {
            return ~arg0 == -8365 || ~arg0 == -339 || arg0 == 8212 || ~arg0 == -340 || arg0 == 376;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7421[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3705(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3706(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
