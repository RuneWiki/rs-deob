import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class728 extends class335 {
   @OriginalMember(
      owner = "client!ih",
      name = "v",
      descriptor = "I"
   )
   private int field10828;
   @OriginalMember(
      owner = "client!ih",
      name = "p",
      descriptor = "I"
   )
   private int field10812;
   @OriginalMember(
      owner = "client!ih",
      name = "q",
      descriptor = "I"
   )
   private int field10823;
   @OriginalMember(
      owner = "client!ih",
      name = "o",
      descriptor = "I"
   )
   private int field10811;
   @OriginalMember(
      owner = "client!ih",
      name = "l",
      descriptor = "I"
   )
   private int field10829;
   @OriginalMember(
      owner = "client!ih",
      name = "s",
      descriptor = "I"
   )
   private int field10816;
   @OriginalMember(
      owner = "client!ih",
      name = "t",
      descriptor = "I"
   )
   private int field10815;
   @OriginalMember(
      owner = "client!ih",
      name = "j",
      descriptor = "I"
   )
   private int field10817;
   @OriginalMember(
      owner = "client!ih",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10830 = new String[]{method5309(method5308("+j\u0015\u000ee")), method5309(method5308("+j\u0015\u0002e")), method5309(method5308(",wW'")), method5309(method5308("9,\u0015e0")), method5309(method5308("+j\u0015\ne")), method5309(method5308("+j\u0015\be")), method5309(method5308("+j\u0015\u0001e")), method5309(method5308("+j\u0015w$,kOue")), method5309(method5308("+j\u0015\u000fe")), method5309(method5308("+j\u0015\te"))};
   @OriginalMember(
      owner = "client!ih",
      name = "u",
      descriptor = "I"
   )
   public static int field10827 = 0;
   @OriginalMember(
      owner = "client!ih",
      name = "A",
      descriptor = "F"
   )
   public static float field10824;
   @OriginalMember(
      owner = "client!ih",
      name = "m",
      descriptor = "I"
   )
   public static int field10813;
   @OriginalMember(
      owner = "client!ih",
      name = "i",
      descriptor = "I"
   )
   public static int field10814;
   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "I"
   )
   public static int field10818;
   @OriginalMember(
      owner = "client!ih",
      name = "k",
      descriptor = "I"
   )
   public static int field10819;
   @OriginalMember(
      owner = "client!ih",
      name = "x",
      descriptor = "I"
   )
   public static int field10820;
   @OriginalMember(
      owner = "client!ih",
      name = "n",
      descriptor = "I"
   )
   public static int field10822;
   @OriginalMember(
      owner = "client!ih",
      name = "w",
      descriptor = "I"
   )
   public static int field10825;
   @OriginalMember(
      owner = "client!ih",
      name = "y",
      descriptor = "I"
   )
   public static int field10826;
   @OriginalMember(
      owner = "client!ih",
      name = "r",
      descriptor = "Leaa;"
   )
   public static class526 field10821;

   @OriginalMember(
      owner = "client!ih",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5304(int arg0) {
      try {
         if (arg0 != 19887) {
            method5307(-4, (String)null, 90, false, -16, -45, 89, -91);
         }

         field10821 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10830[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method5305(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 799078348) {
            field10821 = null;
         }

         ++field10813;
         return class70.method701(arg0, arg2, false) & class249.method1878(arg2, arg0, -1);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10830[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method2540(byte arg0, int arg1, int arg2) {
      try {
         ++field10820;
         int var4 = this.field10823 * arg2 >> 12;
         int var5 = this.field10812 * arg1 >> 12;
         int var6 = this.field10816 * arg2 >> 12;
         int var7 = this.field10817 * arg1 >> 12;
         int var8 = this.field10829 * arg2 >> 12;
         int var9 = this.field10828 * arg1 >> 12;
         if (arg0 > 71) {
            int var10 = this.field10815 * arg2 >> 12;
            int var11 = this.field10811 * arg1 >> 12;
            class676.method4933(var7, var8, var6, -119, var11, var5, var9, var4, super.field4791, var10);
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field10830[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2541(int arg0, int arg1, int arg2) {
      try {
         if (arg1 == 0) {
            ++field10826;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10830[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method2537(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 < 84) {
            this.field10823 = 50;
         }

         ++field10822;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10830[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(Ljj;I)Ljava/lang/String;"
   )
   public static final String method5306(class128 arg0, int arg1) {
      try {
         if (arg1 <= 47) {
            method5306((class128)null, 38);
         }

         ++field10819;
         return class482.method3576(arg0, 32767, (byte)-122);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10830[1] + (arg0 != null ? field10830[3] : field10830[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(ILjava/lang/String;IZIIII)V"
   )
   public static final void method5307(int arg0, String arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         ++field10814;
         class20 var8 = new class20();
         if (!arg3) {
            field10825 = -123;
         }

         var8.field212 = arg2;
         var8.field216 = arg1;
         var8.field217 = arg4;
         var8.field223 = arg6;
         var8.field220 = arg5;
         var8.field214 = arg0;
         var8.field221 = class314.field4488 + arg7;
         class792.field11509.method100(var8, 1);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10830[6] + arg0 + ',' + (arg1 != null ? field10830[3] : field10830[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class728(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      super(-1, arg8, arg9);

      try {
         this.field10828 = arg5;
         this.field10812 = arg1;
         this.field10823 = arg0;
         this.field10811 = arg7;
         this.field10829 = arg4;
         this.field10816 = arg2;
         this.field10815 = arg6;
         this.field10817 = arg3;
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10830[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5308(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5309(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
