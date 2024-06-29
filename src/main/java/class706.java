import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class706 extends class67 {
   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10634 = new String[]{method5213(method5212("p\u0006'{o")), method5213(method5212("p\u0006'\u007fo")), method5213(method5212("p\u0006'}o")), method5213(method5212("p\u0006'uo")), method5213(method5212("p\u0006'yo")), method5213(method5212("p\u0006'to")), method5213(method5212("p\u0006'~o"))};
   @OriginalMember(
      owner = "client!un",
      name = "k",
      descriptor = "I"
   )
   public static int field10625;
   @OriginalMember(
      owner = "client!un",
      name = "m",
      descriptor = "I"
   )
   public static int field10626;
   @OriginalMember(
      owner = "client!un",
      name = "s",
      descriptor = "I"
   )
   public static int field10627;
   @OriginalMember(
      owner = "client!un",
      name = "n",
      descriptor = "I"
   )
   public static int field10628;
   @OriginalMember(
      owner = "client!un",
      name = "r",
      descriptor = "I"
   )
   public static int field10629;
   @OriginalMember(
      owner = "client!un",
      name = "l",
      descriptor = "I"
   )
   public static int field10630;
   @OriginalMember(
      owner = "client!un",
      name = "o",
      descriptor = "I"
   )
   public static int field10631;
   @OriginalMember(
      owner = "client!un",
      name = "q",
      descriptor = "I"
   )
   public static int field10633;
   @OriginalMember(
      owner = "client!un",
      name = "p",
      descriptor = "Liba;"
   )
   public static class343 field10632;

   @OriginalMember(
      owner = "client!un",
      name = "b",
      descriptor = "(I)I",
      line = 3
   )
   public final int method162(int arg0) {
      try {
         ++field10627;
         if (arg0 != 0) {
            field10632 = null;
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10634[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "e",
      descriptor = "(I)Z",
      line = 15
   )
   public final boolean method5209(int arg0) {
      try {
         ++field10630;
         if (arg0 != 3343) {
            field10632 = null;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10634[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 26
   )
   public class706(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!un",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 31
   )
   public class706(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(IZ)V",
      line = 36
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method5209(107);
         }

         super.field877 = arg0;
         ++field10628;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10634[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(II)I",
      line = 47
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field10626;
         if (~arg0 != -1 && ~super.field881.field529.method1918(480102311) != -2) {
            if (arg1 > -74) {
               this.method162(2);
            }

            return 2;
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10634[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "a",
      descriptor = "(B)V",
      line = 61
   )
   public final void method158(byte arg0) {
      try {
         ++field10631;
         if (super.field877 != 0 && super.field881.field529.method1918(480102311) != 1) {
            super.field877 = 0;
         }

         if (~super.field877 > -1 || ~super.field877 < -2) {
            super.field877 = this.method162(0);
         }

         if (arg0 != -69) {
            field10633 = -69;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10634[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "c",
      descriptor = "(I)I",
      line = 78
   )
   public final int method5210(int arg0) {
      try {
         if (arg0 != 480102311) {
            return 67;
         } else {
            ++field10625;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10634[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "d",
      descriptor = "(I)V",
      line = 89
   )
   public static void method5211(int arg0) {
      try {
         field10632 = null;
         if (arg0 <= 85) {
            method5211(-73);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10634[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5212(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!un",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5213(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
