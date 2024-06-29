import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class788 extends class70 {
   @OriginalMember(
      owner = "client!f",
      name = "A",
      descriptor = "[B"
   )
   public byte[] field11463;
   @OriginalMember(
      owner = "client!f",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11464 = new String[]{method5659(method5658(";\u0014\f\u0011&")), method5659(method5658("&\u0014\u001eV5)N\u001c\u0017")), method5659(method5658(".ONS")), method5659(method5658("&\u0014k\u0017")), method5659(method5658("&\u0014h\u0017")), method5659(method5658("&\u0014i\u0017")), method5659(method5658("&\u0014o\u0017")), method5659(method5658("&\u0014n\u0017"))};
   @OriginalMember(
      owner = "client!f",
      name = "B",
      descriptor = "Ldw;"
   )
   public static class748 field11462 = new class748(64);
   @OriginalMember(
      owner = "client!f",
      name = "x",
      descriptor = "I"
   )
   public static int field11457;
   @OriginalMember(
      owner = "client!f",
      name = "D",
      descriptor = "I"
   )
   public static int field11458;
   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "I"
   )
   public static int field11460;
   @OriginalMember(
      owner = "client!f",
      name = "y",
      descriptor = "I"
   )
   public static int field11461;
   @OriginalMember(
      owner = "client!f",
      name = "C",
      descriptor = "Z"
   )
   public static boolean field11459;

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(Z)V",
      line = 3
   )
   public static void method5653(boolean arg0) {
      try {
         if (arg0) {
            field11462 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11464[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "b",
      descriptor = "(II)I",
      line = 15
   )
   public static final int method5654(int arg0, int arg1) {
      try {
         ++field11458;
         int var2 = 0;
         if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 16;
            var2 += 16;
         }

         if (arg1 >= 256) {
            arg1 >>>= 8;
            var2 += 8;
         }

         if (~arg1 <= -17) {
            var2 += 4;
            arg1 >>>= 4;
         }

         if (arg1 >= 4) {
            arg1 >>>= 2;
            var2 += 2;
         }

         if (~arg1 <= -2) {
            ++var2;
            arg1 >>>= 1;
         }

         if (arg0 != 29990) {
            method5654(-89, -128);
         }

         return arg1 + var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11464[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(IIIIIIIII)V",
      line = 61
   )
   public static final void method5655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field11461;
         if (arg4 >= ~arg2 && ~arg3 <= -2 && ~(class323.field4603 + -2) <= ~arg2 && ~arg3 >= ~(class178.field2197 + -2)) {
            int var9 = arg1;
            if (arg1 < 3 && class598.method4378(arg2, (byte)-64, arg3)) {
               var9 = arg1 + 1;
            }

            if (~class261.field3566.field9428.method2175(arg4 ^ -109) == -1 && !class61.method501(var9, arg2, arg3, class255.field3404, (byte)73)) {
               return;
            }

            if (class353.field5360 == null) {
               return;
            }

            class221.field2832.method1256(arg4 + -91, arg3, arg1, arg2, class786.field11439, arg0, class532.field7778[arg1]);
            if (arg8 >= 0) {
               int var10 = class261.field3566.field9461.method5177(arg4 ^ -92);
               class261.field3566.method4677(class261.field3566.field9461, 89, 1);
               class221.field2832.method1258(arg1, var9, arg3, arg7, arg2, arg8, false, arg6, class786.field11439, arg5, class532.field7778[arg1]);
               class261.field3566.method4677(class261.field3566.field9461, 71, var10);
               return;
            }
         }

      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field11464[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;)V",
      line = 107
   )
   public static final void method5656(int arg0, Canvas arg1) {
      try {
         int var2 = -112 % (-arg0 / 55);
         ++field11460;
         Dimension var3 = arg1.getSize();
         class785.method5640(var3.height, 7, var3.width);
         if (class4.field85 == 1) {
            class616.field9011.method601(arg1, class680.field10222, class379.field5808);
         } else {
            class616.field9011.method601(arg1, class92.field1176, class73.field933);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field11464[3] + arg0 + ',' + (arg1 != null ? field11464[0] : field11464[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "<init>",
      descriptor = "([B)V",
      line = 124
   )
   public class788(byte[] arg0) {
      try {
         this.field11463 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11464[1] + (arg0 != null ? field11464[0] : field11464[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "c",
      descriptor = "(II)I",
      line = 132
   )
   public static final int method5657(int arg0, int arg1) {
      try {
         if (arg1 != 20274) {
            method5653(false);
         }

         ++field11457;
         return 127 & arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11464[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5658(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!f",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5659(char[] arg0) {
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
            var10005 = 58;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
