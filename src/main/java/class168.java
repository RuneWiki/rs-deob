import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class168 extends class294 {
   @OriginalMember(
      owner = "client!lo",
      name = "N",
      descriptor = "I"
   )
   public int field2556 = 0;
   @OriginalMember(
      owner = "client!lo",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2580 = new String[]{method1567(method1566("\u0000T\u000e\\\u0013")), method1567(method1566("\u0000T\u000e_\u0013"))};
   @OriginalMember(
      owner = "client!lo",
      name = "B",
      descriptor = "Leh;"
   )
   public static class19 field2565 = new class19(1);
   @OriginalMember(
      owner = "client!lo",
      name = "F",
      descriptor = "Lpi;"
   )
   public static class427 field2573 = new class427();
   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "Z"
   )
   public static boolean field2578 = false;
   @OriginalMember(
      owner = "client!lo",
      name = "P",
      descriptor = "[F"
   )
   public static float[] field2575 = new float[4];
   @OriginalMember(
      owner = "client!lo",
      name = "C",
      descriptor = "Luk;"
   )
   public static class498 field2579 = new class498(70, -2);
   @OriginalMember(
      owner = "client!lo",
      name = "R",
      descriptor = "I"
   )
   public int field2547;
   @OriginalMember(
      owner = "client!lo",
      name = "y",
      descriptor = "I"
   )
   public int field2549;
   @OriginalMember(
      owner = "client!lo",
      name = "m",
      descriptor = "I"
   )
   public static int field2550;
   @OriginalMember(
      owner = "client!lo",
      name = "u",
      descriptor = "I"
   )
   public int field2553;
   @OriginalMember(
      owner = "client!lo",
      name = "n",
      descriptor = "I"
   )
   public int field2554;
   @OriginalMember(
      owner = "client!lo",
      name = "w",
      descriptor = "I"
   )
   public int field2559;
   @OriginalMember(
      owner = "client!lo",
      name = "s",
      descriptor = "I"
   )
   public int field2561;
   @OriginalMember(
      owner = "client!lo",
      name = "r",
      descriptor = "I"
   )
   public int field2563;
   @OriginalMember(
      owner = "client!lo",
      name = "M",
      descriptor = "I"
   )
   public int field2564;
   @OriginalMember(
      owner = "client!lo",
      name = "A",
      descriptor = "I"
   )
   public int field2566;
   @OriginalMember(
      owner = "client!lo",
      name = "t",
      descriptor = "I"
   )
   public int field2569;
   @OriginalMember(
      owner = "client!lo",
      name = "q",
      descriptor = "I"
   )
   public int field2570;
   @OriginalMember(
      owner = "client!lo",
      name = "K",
      descriptor = "I"
   )
   public int field2571;
   @OriginalMember(
      owner = "client!lo",
      name = "J",
      descriptor = "I"
   )
   public int field2572;
   @OriginalMember(
      owner = "client!lo",
      name = "T",
      descriptor = "I"
   )
   public int field2576;
   @OriginalMember(
      owner = "client!lo",
      name = "L",
      descriptor = "Lec;"
   )
   public class184 field2551;
   @OriginalMember(
      owner = "client!lo",
      name = "E",
      descriptor = "Lec;"
   )
   public class184 field2560;
   @OriginalMember(
      owner = "client!lo",
      name = "v",
      descriptor = "Lru;"
   )
   public class333 field2577;
   @OriginalMember(
      owner = "client!lo",
      name = "U",
      descriptor = "Lefa;"
   )
   public class466 field2562;
   @OriginalMember(
      owner = "client!lo",
      name = "O",
      descriptor = "Lmd;"
   )
   public class54 field2557;
   @OriginalMember(
      owner = "client!lo",
      name = "Q",
      descriptor = "Lmd;"
   )
   public class54 field2567;
   @OriginalMember(
      owner = "client!lo",
      name = "D",
      descriptor = "Lon;"
   )
   public class617 field2545;
   @OriginalMember(
      owner = "client!lo",
      name = "x",
      descriptor = "Lon;"
   )
   public class617 field2548;
   @OriginalMember(
      owner = "client!lo",
      name = "p",
      descriptor = "Lwo;"
   )
   public class9 field2555;
   @OriginalMember(
      owner = "client!lo",
      name = "G",
      descriptor = "Z"
   )
   public boolean field2552;
   @OriginalMember(
      owner = "client!lo",
      name = "I",
      descriptor = "Z"
   )
   public boolean field2558;
   @OriginalMember(
      owner = "client!lo",
      name = "H",
      descriptor = "Z"
   )
   public boolean field2574;
   @OriginalMember(
      owner = "client!lo",
      name = "o",
      descriptor = "[I"
   )
   public int[] field2546;
   @OriginalMember(
      owner = "client!lo",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2568;

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1564(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2550;
         int var3 = this.field2549;
         boolean var4 = this.field2552;
         if (arg0 <= 64) {
            this.field2558 = true;
         }

         label80: {
            if (this.field2577 != null) {
               class333 var5 = this.field2577.method2714(class45.field599, -1);
               if (var5 != null) {
                  this.field2558 = var5.field5121;
                  this.field2552 = var5.field5084;
                  this.field2553 = var5.field5049;
                  this.field2570 = var5.field5110;
                  this.field2554 = var5.field5122 << 9;
                  this.field2546 = var5.field5128;
                  this.field2549 = var5.field5123;
                  this.field2561 = var5.field5072;
                  this.field2569 = var5.field5075;
                  this.field2564 = var5.field5058;
                  if (!var2) {
                     break label80;
                  }
               }

               this.field2549 = -1;
               this.field2552 = false;
               this.field2563 = 0;
               this.field2561 = 256;
               this.field2546 = null;
               this.field2558 = false;
               this.field2554 = 0;
               this.field2569 = 0;
               this.field2570 = 256;
               this.field2553 = 0;
               this.field2564 = 0;
               if (!var2) {
                  break label80;
               }
            }

            if (this.field2562 == null) {
               if (this.field2555 == null) {
                  break label80;
               }

               this.field2549 = class437.method3439(this.field2555, -1);
               this.field2554 = this.field2555.field101 << 9;
               this.field2570 = 256;
               this.field2561 = 256;
               this.field2552 = this.field2555.field104;
               this.field2563 = 0;
               this.field2553 = this.field2555.field117;
               if (!var2) {
                  break label80;
               }
            }

            int var6 = class281.method2352(0, this.field2562);
            if (var3 != var6) {
               label81: {
                  this.field2549 = var6;
                  class344 var7 = this.field2562.field7072;
                  if (var7.field5221 != null) {
                     var7 = var7.method2782((byte)126, class45.field599);
                  }

                  if (var7 != null) {
                     this.field2552 = var7.field5231;
                     this.field2563 = var7.field5270 << 9;
                     this.field2553 = var7.field5257;
                     this.field2561 = var7.field5247;
                     this.field2570 = var7.field5259;
                     this.field2554 = var7.field5263 << 9;
                     if (!var2) {
                        break label81;
                     }
                  }

                  this.field2553 = this.field2554 = this.field2563 = 0;
                  this.field2570 = 256;
                  this.field2561 = 256;
                  this.field2552 = this.field2562.field7072.field5231;
               }
            }
         }

         if (~this.field2549 != ~var3 || !this.field2552 != !var4) {
            if (this.field2557 == null) {
               return;
            }

            class426.field6579.method4704(this.field2557);
            this.field2551 = null;
            this.field2557 = null;
            this.field2548 = null;
         }

      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field2580[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1565(byte arg0) {
      try {
         if (arg0 != 77) {
            method1565((byte)-93);
         }

         field2575 = null;
         field2579 = null;
         field2565 = null;
         field2573 = null;
         field2568 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2580[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1566(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1567(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
