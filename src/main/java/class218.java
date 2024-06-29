import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class218 extends class606 {
   @OriginalMember(
      owner = "client!ot",
      name = "H",
      descriptor = "I"
   )
   private int field3121 = 4096;
   @OriginalMember(
      owner = "client!ot",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3127 = new String[]{method1895(method1894("]c\u0019\u0005")), method1895(method1894("H8[G\f")), method1895(method1894("\\b[(Y")), method1895(method1894("\\b[*Y")), method1895(method1894("\\b[,Y")), method1895(method1894("\\b[!Y")), method1895(method1894("\\b[.Y"))};
   @OriginalMember(
      owner = "client!ot",
      name = "E",
      descriptor = "I"
   )
   public static int field3119 = 1;
   @OriginalMember(
      owner = "client!ot",
      name = "L",
      descriptor = "Lhha;"
   )
   public static class724 field3123 = new class724(51, -1);
   @OriginalMember(
      owner = "client!ot",
      name = "I",
      descriptor = "F"
   )
   public static float field3126;
   @OriginalMember(
      owner = "client!ot",
      name = "G",
      descriptor = "I"
   )
   public static int field3118;
   @OriginalMember(
      owner = "client!ot",
      name = "D",
      descriptor = "I"
   )
   public static int field3120;
   @OriginalMember(
      owner = "client!ot",
      name = "K",
      descriptor = "I"
   )
   public static int field3122;
   @OriginalMember(
      owner = "client!ot",
      name = "F",
      descriptor = "I"
   )
   public static int field3124;
   @OriginalMember(
      owner = "client!ot",
      name = "J",
      descriptor = "I"
   )
   public static int field3125;

   @OriginalMember(
      owner = "client!ot",
      name = "<init>",
      descriptor = "()V"
   )
   public class218() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != 0) {
            method1892(113);
         }

         ++field3118;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int[] var5 = this.method4463(arg1 - 1 & class801.field11660, 13064, 0);
            int[] var6 = this.method4463(arg1, arg0 ^ 13064, 0);
            int[] var7 = this.method4463(arg1 - -1 & class801.field11660, arg0 ^ 13064, 0);
            int var8 = 0;
            if (var3 || var8 < class563.field8014) {
               do {
                  int var9 = (var7[var8] - var5[var8]) * this.field3121;
                  int var10 = (var6[class358.field5293 & var8 + 1] - var6[class358.field5293 & var8 - 1]) * this.field3121;
                  int var11 = var10 >> 12;
                  int var12 = var9 >> 12;
                  int var13 = var11 * var11 >> 12;
                  int var14 = var12 * var12 >> 12;
                  int var15 = (int)(4096.0D * Math.sqrt((double)((float)(var14 + 4096 + var13) / 4096.0F)));
                  int var16 = var15 != 0 ? 16777216 / var15 : 0;
                  var4[var8] = -var16 + 4096;
                  ++var8;
               } while(var8 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var18) {
         throw class612.method4503(var18, field3127[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field3122;
         if (arg2 < -6) {
            if (~arg1 == -1) {
               this.field3121 = arg0.method685(-2);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field3127[2] + (arg0 != null ? field3127[1] : field3127[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method1891(int arg0) {
      try {
         ++field3124;
         if (class7.field130 != -1) {
            int var1 = class387.field5645.method1549(-102);
            int var2 = class387.field5645.method1560((byte)-93);
            class143 var3 = (class143)class614.field8732.method2245((byte)-94);
            if (var3 != null) {
               var1 = var3.method502(4);
               var2 = var3.method503(true);
            }

            int var4 = 0;
            int var5 = 0;
            int var6 = 122 % ((arg0 - 10) / 38);
            if (class563.field8012) {
               var4 = class425.method3319(0);
               var5 = class630.method4620((byte)85);
            }

            class351.method2771(class557.field7909 + var4, var2, var1 - -var4, var2 - -var5, class7.field130, var5, var4, var4, var5 - -class140.field2243, -1, var1, var5);
            if (class778.field11352 != null) {
               class539.method4015(var1 + var4, (byte)91, var2 + var5);
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field3127[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "g",
      descriptor = "(I)Z"
   )
   public static final boolean method1892(int arg0) {
      try {
         if (arg0 != 6850) {
            return true;
         } else {
            ++field3120;
            return ~class487.field6949 != -1;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3127[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method1893(int arg0) {
      try {
         int var1 = 72 / ((arg0 - 27) / 54);
         field3123 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3127[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1894(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1895(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
