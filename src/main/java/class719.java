import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class719 extends class294 {
   @OriginalMember(
      owner = "client!mm",
      name = "u",
      descriptor = "I"
   )
   public int field10769 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!mm",
      name = "n",
      descriptor = "I"
   )
   public int field10773 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!mm",
      name = "r",
      descriptor = "I"
   )
   public int field10771 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!mm",
      name = "p",
      descriptor = "I"
   )
   public int field10770 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!mm",
      name = "x",
      descriptor = "I"
   )
   public int field10777 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!mm",
      name = "m",
      descriptor = "I"
   )
   public int field10776 = Integer.MAX_VALUE;
   @OriginalMember(
      owner = "client!mm",
      name = "w",
      descriptor = "I"
   )
   public int field10775 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!mm",
      name = "t",
      descriptor = "I"
   )
   public int field10781 = Integer.MIN_VALUE;
   @OriginalMember(
      owner = "client!mm",
      name = "o",
      descriptor = "Lkb;"
   )
   public class28 field10774;
   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10782 = new String[]{method5321(method5320("HB\u0004\u001c")), method5321(method5320("KZFLyH^\u001cN8")), method5321(method5320("]\u0019F^m")), method5321(method5320("KZF28")), method5321(method5320("KZF18"))};
   @OriginalMember(
      owner = "client!mm",
      name = "y",
      descriptor = "Llj;"
   )
   public static class304 field10778 = new class304(10);
   @OriginalMember(
      owner = "client!mm",
      name = "s",
      descriptor = "Lnaa;"
   )
   public static class113 field10779 = new class113(27, 7);
   @OriginalMember(
      owner = "client!mm",
      name = "v",
      descriptor = "I"
   )
   public static int field10772;
   @OriginalMember(
      owner = "client!mm",
      name = "q",
      descriptor = "I"
   )
   public static int field10780;

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(III)Z",
      line = 6
   )
   public final boolean method5318(int arg0, int arg1, int arg2) {
      try {
         ++field10772;
         if (~this.field10769 >= ~arg2 && this.field10781 >= arg2 && arg1 >= this.field10773 && ~arg1 >= ~this.field10775) {
            return true;
         } else {
            if (arg0 != 15794) {
               this.method5318(-123, -116, -56);
            }

            return arg2 >= this.field10777 && ~arg2 >= ~this.field10771 && ~arg1 <= ~this.field10776 && ~arg1 >= ~this.field10770;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10782[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(I)V",
      line = 30
   )
   public static void method5319(int arg0) {
      try {
         if (arg0 != Integer.MAX_VALUE) {
            method5319(92);
         }

         field10779 = null;
         field10778 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10782[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "<init>",
      descriptor = "(Lkb;)V",
      line = 76
   )
   public class719(class28 arg0) {
      try {
         this.field10774 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10782[1] + (arg0 != null ? field10782[2] : field10782[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5320(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5321(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
