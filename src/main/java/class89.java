import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class89 extends class45 {
   @OriginalMember(
      owner = "client!haa",
      name = "Y",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1161 = new String[]{method786(method785("\u0006{\u0019\f@F")), method786(method785("\u0006{\u0019\fLF")), method786(method785("\u0000o\u0014N")), method786(method785("\u00154V\fu")), method786(method785("\u0006{\u0019\fMF")), method786(method785("\u0006{\u0019\fNF")), method786(method785("\u0006{\u0019\fOF"))};
   @OriginalMember(
      owner = "client!haa",
      name = "S",
      descriptor = "[J"
   )
   public static long[] field1158 = new long[256];
   @OriginalMember(
      owner = "client!haa",
      name = "W",
      descriptor = "[I"
   )
   public static int[] field1159;
   @OriginalMember(
      owner = "client!haa",
      name = "V",
      descriptor = "F"
   )
   public static float field1155;
   @OriginalMember(
      owner = "client!haa",
      name = "Q",
      descriptor = "I"
   )
   public static int field1153;
   @OriginalMember(
      owner = "client!haa",
      name = "X",
      descriptor = "I"
   )
   public static int field1154;
   @OriginalMember(
      owner = "client!haa",
      name = "T",
      descriptor = "I"
   )
   public static int field1156;
   @OriginalMember(
      owner = "client!haa",
      name = "U",
      descriptor = "I"
   )
   public static int field1157;
   @OriginalMember(
      owner = "client!haa",
      name = "R",
      descriptor = "Lew;"
   )
   public static class521 field1160;

   @OriginalMember(
      owner = "client!haa",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method781(int arg0) {
      try {
         class641.field9368 = new class387();
         if (arg0 != 262144) {
            method782((byte)-29);
         }

         ++field1156;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1161[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method782(byte arg0) {
      try {
         field1159 = null;
         field1160 = null;
         field1158 = null;
         if (arg0 >= -29) {
            method784(5, 86, -16);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1161[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1157;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (super.field3634.field8828 && this.method380(-1615170204)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = arg0 % super.field610 * super.field610;
            int var9 = 0;
            if (var3 || var9 < class430.field6152) {
               do {
                  int var10 = super.field606[var9 % super.field614 + var8];
                  var7[var9] = class556.method3988(255, var10) << 4;
                  var6[var9] = class556.method3988(var10 >> 4, 4080);
                  var5[var9] = class556.method3988(var10 >> 12, 4080);
                  ++var9;
               } while(var9 < class430.field6152);
            }
         }

         if (arg1 > -117) {
            method784(-126, -124, -87);
         }

         return var4;
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field1161[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method783(int arg0, String arg1) {
      try {
         ++field1154;
         if (arg0 != 1) {
            method784(-1, 11, 116);
         }

         return 1 + arg1.length();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1161[4] + arg0 + ',' + (arg1 != null ? field1161[3] : field1161[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "c",
      descriptor = "(III)Z"
   )
   public static final boolean method784(int arg0, int arg1, int arg2) {
      try {
         ++field1153;
         if (arg2 != 262144) {
            method781(9);
         }

         return (arg1 & 262144) != 0 | class92.method799((byte)80, arg1, arg0) || class326.method2410(false, arg1, arg0);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1161[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         long var1 = (long)var0;

         for(int var3 = 0; var3 < 8; ++var3) {
            if (~(1L & var1) == -2L) {
               var1 = var1 >>> 1 ^ -3932672073523589310L;
            } else {
               var1 >>>= 1;
            }
         }

         field1158[var0] = var1;
      }

      field1159 = null;
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method785(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method786(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
