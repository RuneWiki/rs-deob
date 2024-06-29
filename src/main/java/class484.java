import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class484 {
   @OriginalMember(
      owner = "client!nk",
      name = "g",
      descriptor = "I"
   )
   private int field6732;
   @OriginalMember(
      owner = "client!nk",
      name = "k",
      descriptor = "I"
   )
   private int field6737;
   @OriginalMember(
      owner = "client!nk",
      name = "e",
      descriptor = "I"
   )
   private int field6725;
   @OriginalMember(
      owner = "client!nk",
      name = "p",
      descriptor = "I"
   )
   private int field6731;
   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "I"
   )
   public int field6735;
   @OriginalMember(
      owner = "client!nk",
      name = "f",
      descriptor = "I"
   )
   public int field6729;
   @OriginalMember(
      owner = "client!nk",
      name = "j",
      descriptor = "I"
   )
   public int field6730;
   @OriginalMember(
      owner = "client!nk",
      name = "c",
      descriptor = "I"
   )
   public int field6726;
   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "I"
   )
   public int field6728;
   @OriginalMember(
      owner = "client!nk",
      name = "d",
      descriptor = "I"
   )
   public int field6727;
   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6742 = new String[]{method3679(method3678("b\u0001\u001d`3")), method3679(method3678("b\u0001\u001d\u001frb\u0003G\u001d3")), method3679(method3678("b\u0001\u001db3")), method3679(method3678("b\u0001\u001da3"))};
   @OriginalMember(
      owner = "client!nk",
      name = "h",
      descriptor = "Laka;"
   )
   public static class418 field6736 = new class418(137, 0);
   @OriginalMember(
      owner = "client!nk",
      name = "o",
      descriptor = "I"
   )
   public static int field6741 = 0;
   @OriginalMember(
      owner = "client!nk",
      name = "n",
      descriptor = "I"
   )
   public static int field6740 = 0;
   @OriginalMember(
      owner = "client!nk",
      name = "m",
      descriptor = "I"
   )
   public static int field6733;
   @OriginalMember(
      owner = "client!nk",
      name = "q",
      descriptor = "I"
   )
   public static int field6734;
   @OriginalMember(
      owner = "client!nk",
      name = "l",
      descriptor = "I"
   )
   public static int field6739;
   @OriginalMember(
      owner = "client!nk",
      name = "i",
      descriptor = "Ld;"
   )
   public static class102 field6738;

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(BIII)Z"
   )
   public final boolean method3674(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6733;
         if (this.field6728 <= arg2 && arg2 <= this.field6726) {
            if (arg1 >= this.field6729 && arg1 <= this.field6727) {
               if (this.field6730 <= arg3 && this.field6735 >= arg3) {
                  int var5 = -this.field6725 + arg2;
                  if (arg0 < 19) {
                     this.method3674((byte)78, -34, -120, -78);
                  }

                  int var6 = arg3 - this.field6737;
                  return ~this.field6731 < ~(var5 * var5 + var6 * var6);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field6742[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3675(int arg0) {
      try {
         if (arg0 >= -111) {
            method3676(100, -112);
         }

         field6736 = null;
         field6738 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6742[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3676(int arg0, int arg1) {
      return class743.field10860 != null ? class743.field10860[arg0][arg1] & 16777215 : 0;
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(IIIIIIIIIII)V"
   )
   public final void method3677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      try {
         int var12 = 95 % ((arg5 - -61) / 58);
         this.field6737 = arg7;
         this.field6725 = arg6;
         ++field6734;
         this.field6731 = arg2 * arg2;
         this.field6732 = arg9;
         this.field6728 = this.field6725 + arg3;
         this.field6726 = this.field6725 + arg0;
         this.field6729 = this.field6732 + arg1;
         this.field6735 = this.field6737 + arg4;
         this.field6727 = this.field6732 + arg10;
         this.field6730 = this.field6737 - -arg8;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field6742[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         this.field6732 = arg1;
         this.field6737 = arg2;
         this.field6725 = arg0;
         this.field6731 = arg3 * arg3;
         this.field6735 = this.field6737 - -arg9;
         this.field6729 = this.field6732 + arg6;
         this.field6730 = this.field6737 + arg8;
         this.field6726 = this.field6725 - -arg5;
         this.field6728 = this.field6725 + arg4;
         this.field6727 = this.field6732 + arg7;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field6742[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3678(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3679(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
