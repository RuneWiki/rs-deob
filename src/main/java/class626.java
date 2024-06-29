import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class626 extends class500 {
   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "I"
   )
   private int field8743;
   @OriginalMember(
      owner = "client!th",
      name = "v",
      descriptor = "I"
   )
   private int field8754;
   @OriginalMember(
      owner = "client!th",
      name = "j",
      descriptor = "I"
   )
   private int field8749;
   @OriginalMember(
      owner = "client!th",
      name = "r",
      descriptor = "I"
   )
   private int field8744;
   @OriginalMember(
      owner = "client!th",
      name = "x",
      descriptor = "I"
   )
   public int field8747;
   @OriginalMember(
      owner = "client!th",
      name = "t",
      descriptor = "I"
   )
   private int field8748;
   @OriginalMember(
      owner = "client!th",
      name = "y",
      descriptor = "I"
   )
   public int field8746;
   @OriginalMember(
      owner = "client!th",
      name = "w",
      descriptor = "I"
   )
   public int field8753;
   @OriginalMember(
      owner = "client!th",
      name = "s",
      descriptor = "I"
   )
   public int field8757;
   @OriginalMember(
      owner = "client!th",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8760 = new String[]{method4557(method4556("\u000ftB?")), method4557(method4556("\u001a/\u0000}\u0015")), method4557(method4556("\u0015i\u0000\u0015@")), method4557(method4556("\u0015i\u0000\u0011@")), method4557(method4556("\u0015i\u0000\u0017@")), method4557(method4556("\u0015i\u0000o\u0001\u000fhZm@")), method4557(method4556("\u0015i\u0000\u0012@")), method4557(method4556("\u0015i\u0000\u0010@")), method4557(method4556("\u0015i\u0000\u0016@"))};
   @OriginalMember(
      owner = "client!th",
      name = "n",
      descriptor = "Z"
   )
   public static boolean field8755 = false;
   @OriginalMember(
      owner = "client!th",
      name = "k",
      descriptor = "Lnw;"
   )
   public static class616 field8751 = new class616(24, 7);
   @OriginalMember(
      owner = "client!th",
      name = "l",
      descriptor = "Lbga;"
   )
   public static class378 field8758 = new class378(110, 8);
   @OriginalMember(
      owner = "client!th",
      name = "o",
      descriptor = "I"
   )
   public static int field8745;
   @OriginalMember(
      owner = "client!th",
      name = "u",
      descriptor = "I"
   )
   public static int field8750;
   @OriginalMember(
      owner = "client!th",
      name = "q",
      descriptor = "I"
   )
   public static int field8752;
   @OriginalMember(
      owner = "client!th",
      name = "m",
      descriptor = "I"
   )
   public static int field8756;
   @OriginalMember(
      owner = "client!th",
      name = "p",
      descriptor = "I"
   )
   public static int field8759;

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(II[IB)V"
   )
   public final void method4550(int arg0, int arg1, int[] arg2, byte arg3) {
      try {
         ++field8756;
         arg2[1] = arg0 - (-this.field8749 + this.field8746);
         arg2[0] = this.field8748;
         if (arg3 == -95) {
            arg2[2] = -this.field8747 - -this.field8754 + arg1;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8760[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8760[1] : field8760[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(IIB[I)V"
   )
   public final void method4551(int arg0, int arg1, byte arg2, int[] arg3) {
      try {
         ++field8759;
         arg3[2] = this.field8747 - this.field8754 + arg1;
         arg3[0] = 0;
         if (arg2 != -122) {
            field8758 = null;
         }

         arg3[1] = this.field8746 - (this.field8749 - arg0);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8760[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8760[1] : field8760[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(IIIZ)Z"
   )
   public final boolean method4552(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field8745;
         if (arg3) {
            field8751 = null;
         }

         return ~this.field8748 == ~arg2 && ~arg0 <= ~this.field8749 && arg0 <= this.field8744 && ~arg1 <= ~this.field8754 && arg1 <= this.field8743;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8760[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method4553(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 110) {
            return true;
         } else {
            ++field8752;
            return this.field8749 <= arg0 && ~this.field8744 <= ~arg0 && arg2 >= this.field8754 && ~arg2 >= ~this.field8743;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8760[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public final boolean method4554(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            this.method4551(-79, -19, (byte)-98, (int[])null);
         }

         ++field8750;
         return ~this.field8746 >= ~arg1 && this.field8757 >= arg1 && arg0 >= this.field8747 && ~arg0 >= ~this.field8753;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8760[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "<init>",
      descriptor = "(IIIIIIIII)V"
   )
   public class626(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field8743 = arg4;
         this.field8754 = arg2;
         this.field8749 = arg1;
         this.field8744 = arg3;
         this.field8747 = arg6;
         this.field8748 = arg0;
         this.field8746 = arg5;
         this.field8753 = arg8;
         this.field8757 = arg7;
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field8760[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4555(int arg0) {
      try {
         if (arg0 > 71) {
            field8751 = null;
            field8758 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8760[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4556(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!th",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4557(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
