import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class359 extends class22 {
   @OriginalMember(
      owner = "client!dj",
      name = "v",
      descriptor = "I"
   )
   private int field5373;
   @OriginalMember(
      owner = "client!dj",
      name = "t",
      descriptor = "I"
   )
   private int field5374;
   @OriginalMember(
      owner = "client!dj",
      name = "r",
      descriptor = "I"
   )
   public int field5384;
   @OriginalMember(
      owner = "client!dj",
      name = "A",
      descriptor = "I"
   )
   private int field5375;
   @OriginalMember(
      owner = "client!dj",
      name = "l",
      descriptor = "I"
   )
   public int field5377;
   @OriginalMember(
      owner = "client!dj",
      name = "q",
      descriptor = "I"
   )
   private int field5387;
   @OriginalMember(
      owner = "client!dj",
      name = "k",
      descriptor = "I"
   )
   public int field5367;
   @OriginalMember(
      owner = "client!dj",
      name = "F",
      descriptor = "I"
   )
   private int field5385;
   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "I"
   )
   public int field5365;
   @OriginalMember(
      owner = "client!dj",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5388 = new String[]{method2828(method2827("'.V\u0010U")), method2828(method2827("'.V\u0014U")), method2828(method2827("-1\u00149")), method2828(method2827("8jV{\u0000")), method2828(method2827("'.V\u0016U")), method2828(method2827("'.V\u0013U")), method2828(method2827("'.Vi\u0014--\fkU")), method2828(method2827("'.V\u0017U")), method2828(method2827("'.V\u0011U")), method2828(method2827("'.V\u0012U"))};
   @OriginalMember(
      owner = "client!dj",
      name = "u",
      descriptor = "J"
   )
   public static long field5369 = 20000000L;
   @OriginalMember(
      owner = "client!dj",
      name = "y",
      descriptor = "I"
   )
   public static int field5371 = 0;
   @OriginalMember(
      owner = "client!dj",
      name = "n",
      descriptor = "I"
   )
   public static int field5366;
   @OriginalMember(
      owner = "client!dj",
      name = "w",
      descriptor = "I"
   )
   public static int field5368;
   @OriginalMember(
      owner = "client!dj",
      name = "x",
      descriptor = "I"
   )
   public static int field5370;
   @OriginalMember(
      owner = "client!dj",
      name = "p",
      descriptor = "I"
   )
   public static int field5376;
   @OriginalMember(
      owner = "client!dj",
      name = "B",
      descriptor = "I"
   )
   public static int field5378;
   @OriginalMember(
      owner = "client!dj",
      name = "s",
      descriptor = "I"
   )
   public static int field5379;
   @OriginalMember(
      owner = "client!dj",
      name = "D",
      descriptor = "I"
   )
   public static int field5380;
   @OriginalMember(
      owner = "client!dj",
      name = "E",
      descriptor = "I"
   )
   public static int field5382;
   @OriginalMember(
      owner = "client!dj",
      name = "o",
      descriptor = "I"
   )
   public static int field5386;
   @OriginalMember(
      owner = "client!dj",
      name = "j",
      descriptor = "J"
   )
   public static long field5383;
   @OriginalMember(
      owner = "client!dj",
      name = "C",
      descriptor = "Lwda;"
   )
   public static class663 field5381;
   @OriginalMember(
      owner = "client!dj",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field5372;

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(II[II)V"
   )
   public final void method2820(int arg0, int arg1, int[] arg2, int arg3) {
      try {
         ++field5382;
         arg2[2] = this.field5373 + arg1 + -this.field5365;
         int var5 = 104 % ((-63 - arg3) / 61);
         arg2[0] = this.field5375;
         arg2[1] = this.field5387 + arg0 - this.field5367;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5388[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5388[3] : field5388[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(IIII)Z"
   )
   public final boolean method2821(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field5366;
         if (arg0 > -120) {
            method2826((byte)-17, -68);
         }

         return ~this.field5375 == ~arg2 && arg3 >= this.field5387 && ~arg3 >= ~this.field5374 && ~this.field5373 >= ~arg1 && arg1 <= this.field5385;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5388[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public final boolean method2822(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 52) {
            this.method2825(-77, false, 19);
         }

         ++field5376;
         return this.field5367 <= arg1 && this.field5384 >= arg1 && arg0 >= this.field5365 && this.field5377 >= arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5388[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2823(int arg0) {
      try {
         field5381 = null;
         field5372 = null;
         int var1 = -101 / ((arg0 - 8) / 54);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5388[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(I[III)V"
   )
   public final void method2824(int arg0, int[] arg1, int arg2, int arg3) {
      try {
         ++field5386;
         arg1[2] = -this.field5373 + arg0 + this.field5365;
         arg1[0] = 0;
         arg1[arg2] = this.field5367 - (this.field5387 - arg3);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5388[5] + arg0 + ',' + (arg1 != null ? field5388[3] : field5388[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public final boolean method2825(int arg0, boolean arg1, int arg2) {
      try {
         if (arg1) {
            return true;
         } else {
            ++field5368;
            return ~this.field5387 >= ~arg2 && ~arg2 >= ~this.field5374 && ~this.field5373 >= ~arg0 && this.field5385 >= arg0;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5388[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "b",
      descriptor = "(BI)V"
   )
   public static final void method2826(byte arg0, int arg1) {
      try {
         ++field5380;
         if (arg0 >= -95) {
            field5383 = 88L;
         }

         if (~class743.field10700 == -2) {
            class386.field5698 = arg1;
         } else if (class743.field10700 == 2) {
            class147.field2385 = arg1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5388[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "<init>",
      descriptor = "(IIIIIIIII)V"
   )
   public class359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field5373 = arg2;
         this.field5374 = arg3;
         this.field5384 = arg7;
         this.field5375 = arg0;
         this.field5377 = arg8;
         this.field5387 = arg1;
         this.field5367 = arg5;
         this.field5385 = arg4;
         this.field5365 = arg6;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field5388[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2827(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2828(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
