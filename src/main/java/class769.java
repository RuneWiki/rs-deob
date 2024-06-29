import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class769 extends class467 {
   @OriginalMember(
      owner = "client!ob",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11286 = new String[]{method5566(method5565("|\n89|")), method5566(method5565("|\n8?|")), method5566(method5565("|\n8>|")), method5566(method5565("|\n8<|")), method5566(method5565("|\n88|")), method5566(method5565("|\n85|")), method5566(method5565("|\n8;|")), method5566(method5565("|\n8:|"))};
   @OriginalMember(
      owner = "client!ob",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public static String field11280 = null;
   @OriginalMember(
      owner = "client!ob",
      name = "D",
      descriptor = "[[[I"
   )
   public static int[][][] field11285 = new int[2][][];
   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "Lsd;"
   )
   public static class101 field11272 = new class101(20, 9);
   @OriginalMember(
      owner = "client!ob",
      name = "s",
      descriptor = "I"
   )
   public static int field11269;
   @OriginalMember(
      owner = "client!ob",
      name = "B",
      descriptor = "I"
   )
   public static int field11270;
   @OriginalMember(
      owner = "client!ob",
      name = "w",
      descriptor = "I"
   )
   public int field11273;
   @OriginalMember(
      owner = "client!ob",
      name = "u",
      descriptor = "I"
   )
   public static int field11274;
   @OriginalMember(
      owner = "client!ob",
      name = "C",
      descriptor = "I"
   )
   public int field11276;
   @OriginalMember(
      owner = "client!ob",
      name = "A",
      descriptor = "I"
   )
   public static int field11277;
   @OriginalMember(
      owner = "client!ob",
      name = "n",
      descriptor = "I"
   )
   public int field11278;
   @OriginalMember(
      owner = "client!ob",
      name = "p",
      descriptor = "I"
   )
   public static int field11279;
   @OriginalMember(
      owner = "client!ob",
      name = "q",
      descriptor = "I"
   )
   public int field11281;
   @OriginalMember(
      owner = "client!ob",
      name = "o",
      descriptor = "I"
   )
   public static int field11282;
   @OriginalMember(
      owner = "client!ob",
      name = "v",
      descriptor = "I"
   )
   public static int field11283;
   @OriginalMember(
      owner = "client!ob",
      name = "y",
      descriptor = "I"
   )
   public static int field11284;
   @OriginalMember(
      owner = "client!ob",
      name = "x",
      descriptor = "J"
   )
   public long field11275;
   @OriginalMember(
      owner = "client!ob",
      name = "t",
      descriptor = "Ljava/awt/Canvas;"
   )
   public static Canvas field11271;

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(B)I",
      line = 3
   )
   public final int method3489(byte arg0) {
      try {
         ++field11269;
         if (arg0 <= 30) {
            this.field11278 = -120;
         }

         return this.field11276;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11286[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(BIIII)V",
      line = 17
   )
   public static final void method5562(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg0 != -20) {
            method5562((byte)-110, -122, -123, 22, -75);
         }

         ++field11270;
         class403 var5 = class453.method3410((long)arg1 << 32 | (long)arg3, true, 19);
         var5.method3093(22144);
         var5.field6185 = arg2;
         var5.field6183 = arg4;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field11286[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "e",
      descriptor = "(I)I",
      line = 37
   )
   public final int method3490(int arg0) {
      try {
         ++field11283;
         int var2 = -13 / ((arg0 - -32) / 45);
         return this.field11278;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11286[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "b",
      descriptor = "(I)J",
      line = 47
   )
   public final long method3494(int arg0) {
      try {
         ++field11284;
         if (arg0 != 3) {
            field11272 = null;
         }

         return this.field11275;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11286[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(II)V",
      line = 60
   )
   public static final void method5563(int arg0, int arg1) {
      try {
         ++field11277;
         class403 var2 = class453.method3410((long)arg1, true, arg0);
         var2.method3096((byte)72);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field11286[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(I)I",
      line = 70
   )
   public final int method3491(int arg0) {
      try {
         ++field11279;
         return arg0 != -5 ? -11 : this.field11281;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11286[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "c",
      descriptor = "(B)I",
      line = 82
   )
   public final int method3493(byte arg0) {
      try {
         if (arg0 <= 50) {
            this.field11273 = -76;
         }

         ++field11282;
         return this.field11273;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11286[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "f",
      descriptor = "(I)V",
      line = 107
   )
   public static void method5564(int arg0) {
      try {
         field11271 = null;
         field11280 = null;
         field11285 = null;
         field11272 = null;
         if (arg0 != 20) {
            method5562((byte)-75, 9, -54, -29, -34);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11286[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5565(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5566(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
