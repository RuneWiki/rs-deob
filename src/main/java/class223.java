import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class223 {
   @OriginalMember(
      owner = "client!eq",
      name = "r",
      descriptor = "Lod;"
   )
   private class536 field2774 = new class536();
   @OriginalMember(
      owner = "client!eq",
      name = "n",
      descriptor = "I"
   )
   private int field2785 = 0;
   @OriginalMember(
      owner = "client!eq",
      name = "p",
      descriptor = "Lwm;"
   )
   private class594 field2784 = new class594(1350);
   @OriginalMember(
      owner = "client!eq",
      name = "o",
      descriptor = "Lme;"
   )
   public class206 field2788 = new class206(15000);
   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "I"
   )
   public int field2792 = 0;
   @OriginalMember(
      owner = "client!eq",
      name = "u",
      descriptor = "Z"
   )
   public boolean field2800 = false;
   @OriginalMember(
      owner = "client!eq",
      name = "q",
      descriptor = "I"
   )
   public int field2798 = 0;
   @OriginalMember(
      owner = "client!eq",
      name = "c",
      descriptor = "Lbga;"
   )
   public class378 field2790 = null;
   @OriginalMember(
      owner = "client!eq",
      name = "j",
      descriptor = "Z"
   )
   public boolean field2801 = true;
   @OriginalMember(
      owner = "client!eq",
      name = "D",
      descriptor = "I"
   )
   public int field2791 = 0;
   @OriginalMember(
      owner = "client!eq",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2802 = new String[]{method1705(method1704("B\u0014)3h")), method1705(method1704("B\u0014)7h")), method1705(method1704("B\u0014)4h")), method1705(method1704("I\u0010k\u0019")), method1705(method1704("\\K)[=")), method1705(method1704("B\u0014)=h")), method1705(method1704("B\u0014)0h")), method1705(method1704("B\u0014)1h")), method1705(method1704("B\u0014)2h")), method1705(method1704("B\u0014)6h"))};
   @OriginalMember(
      owner = "client!eq",
      name = "y",
      descriptor = "J"
   )
   public static long field2775 = 0L;
   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "Ldd;"
   )
   public static class735 field2783 = new class735(10, 2, 2, 0);
   @OriginalMember(
      owner = "client!eq",
      name = "w",
      descriptor = "I"
   )
   public static int field2772;
   @OriginalMember(
      owner = "client!eq",
      name = "x",
      descriptor = "I"
   )
   public static int field2773;
   @OriginalMember(
      owner = "client!eq",
      name = "l",
      descriptor = "I"
   )
   public static int field2777;
   @OriginalMember(
      owner = "client!eq",
      name = "m",
      descriptor = "I"
   )
   public static int field2778;
   @OriginalMember(
      owner = "client!eq",
      name = "i",
      descriptor = "I"
   )
   public static int field2781;
   @OriginalMember(
      owner = "client!eq",
      name = "A",
      descriptor = "I"
   )
   public static int field2782;
   @OriginalMember(
      owner = "client!eq",
      name = "h",
      descriptor = "I"
   )
   public static int field2786;
   @OriginalMember(
      owner = "client!eq",
      name = "C",
      descriptor = "I"
   )
   private int field2789;
   @OriginalMember(
      owner = "client!eq",
      name = "k",
      descriptor = "I"
   )
   public int field2793;
   @OriginalMember(
      owner = "client!eq",
      name = "B",
      descriptor = "I"
   )
   public int field2794;
   @OriginalMember(
      owner = "client!eq",
      name = "e",
      descriptor = "I"
   )
   public int field2795;
   @OriginalMember(
      owner = "client!eq",
      name = "g",
      descriptor = "Lri;"
   )
   public class122 field2779;
   @OriginalMember(
      owner = "client!eq",
      name = "v",
      descriptor = "Lvea;"
   )
   public class289 field2780;
   @OriginalMember(
      owner = "client!eq",
      name = "s",
      descriptor = "Laj;"
   )
   public class333 field2787;
   @OriginalMember(
      owner = "client!eq",
      name = "d",
      descriptor = "Ldu;"
   )
   public static class377 field2776;
   @OriginalMember(
      owner = "client!eq",
      name = "b",
      descriptor = "Lbga;"
   )
   public class378 field2796;
   @OriginalMember(
      owner = "client!eq",
      name = "f",
      descriptor = "Lbga;"
   )
   public class378 field2797;
   @OriginalMember(
      owner = "client!eq",
      name = "t",
      descriptor = "Lbga;"
   )
   public class378 field2799;

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public static final void method1696(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         if (arg1 != -48001) {
            method1700((byte)-78);
         }

         ++field2777;
         if (~arg0 <= -8001 && ~arg0 >= -48001) {
            class556.field7644 = arg0;
            class182.field2246 = arg2;
            class614.field8578 = arg3;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2802[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1697(int arg0) {
      try {
         ++field2772;
         if (this.field2779 != null) {
            this.field2779.method1031(0);
            this.field2779 = null;
         }

         if (arg0 < 28) {
            this.field2792 = 65;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2802[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1698(boolean arg0) {
      try {
         this.field2774.method3861(103);
         ++field2778;
         this.field2785 = 0;
         if (!arg0) {
            method1700((byte)78);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2802[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1699(int arg0) throws IOException {
      boolean var2 = client.field4273;

      try {
         int var10000;
         int var10001;
         label40: {
            if (this.field2779 != null && ~this.field2785 < -1) {
               this.field2784.field8243 = 0;

               do {
                  class471 var3 = (class471)this.field2774.method3855(arg0 ^ -16198);
                  if (var3 == null) {
                     break;
                  }

                  var10000 = ~var3.field6525;
                  var10001 = ~(this.field2784.field8227.length + -this.field2784.field8243);
                  if (var2) {
                     break label40;
                  }

                  if (var10000 < var10001) {
                     break;
                  }

                  this.field2784.method4321(var3.field6525, 0, 110909448, var3.field6527.field8227);
                  this.field2785 -= var3.field6525;
                  var3.method3609(84);
                  var3.field6527.method4294(-102);
                  var3.method3453(-93);
               } while(!var2);

               this.field2779.method1028(this.field2784.field8227, this.field2784.field8243, 0, 0);
               this.field2791 = 0;
               this.field2789 += this.field2784.field8243;
            }

            var10000 = arg0;
            var10001 = -16186;
         }

         if (var10000 != var10001) {
            this.field2787 = null;
         }

         ++field2773;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2802[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1700(byte arg0) {
      try {
         if (arg0 != -119) {
            field2776 = null;
         }

         field2776 = null;
         field2783 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2802[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method1701(byte arg0) {
      try {
         if (class464.field6362 != null) {
            try {
               class464.field6362.close();
            } catch (IOException var3) {
            }
         }

         ++field2782;
         class464.field6362 = null;
         int var1 = -85 % ((10 - arg0) / 45);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2802[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(BLbn;)V"
   )
   public final void method1702(byte arg0, class471 arg1) {
      try {
         ++field2786;
         if (arg0 > -44) {
            this.field2779 = null;
         }

         this.field2774.method3859(2, arg1);
         arg1.field6525 = arg1.field6527.field8243;
         arg1.field6527.field8243 = 0;
         this.field2785 += arg1.field6525;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2802[2] + arg0 + ',' + (arg1 != null ? field2802[4] : field2802[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1703(byte arg0) {
      try {
         if (~(class369.field5205 % 50) == -1) {
            this.field2793 = this.field2789;
            this.field2795 = this.field2794;
            this.field2789 = 0;
            this.field2794 = 0;
         }

         ++field2781;
         if (arg0 < 76) {
            this.field2798 = -87;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2802[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1704(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1705(char[] arg0) {
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
            var10005 = 101;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 117;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
