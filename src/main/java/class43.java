import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class43 extends class55 {
   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field599 = new String[]{method370(method369("?\u0016;3\u001fg")), method370(method369("?\u0016;3\u0016g")), method370(method369("?\u0016;3\u001cg")), method370(method369("?\u0016;3\u0019g")), method370(method369("?\u0016;3\u001bg")), method370(method369("?\u0016;3\u0017g")), method370(method369("?\u0016;3\u0018g")), method370(method369("?\u0016;3\u001ag")), method370(method369("?\u0016;3\u001dg"))};
   @OriginalMember(
      owner = "client!pja",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public static String field597 = "";
   @OriginalMember(
      owner = "client!pja",
      name = "i",
      descriptor = "[Lij;"
   )
   public static class447[] field598 = new class447[300];
   @OriginalMember(
      owner = "client!pja",
      name = "g",
      descriptor = "I"
   )
   public static int field589;
   @OriginalMember(
      owner = "client!pja",
      name = "l",
      descriptor = "I"
   )
   public static int field590;
   @OriginalMember(
      owner = "client!pja",
      name = "f",
      descriptor = "I"
   )
   public static int field591;
   @OriginalMember(
      owner = "client!pja",
      name = "k",
      descriptor = "I"
   )
   public static int field592;
   @OriginalMember(
      owner = "client!pja",
      name = "e",
      descriptor = "I"
   )
   public static int field593;
   @OriginalMember(
      owner = "client!pja",
      name = "m",
      descriptor = "I"
   )
   public static int field594;
   @OriginalMember(
      owner = "client!pja",
      name = "j",
      descriptor = "I"
   )
   public static int field595;
   @OriginalMember(
      owner = "client!pja",
      name = "n",
      descriptor = "I"
   )
   public static int field596;

   @OriginalMember(
      owner = "client!pja",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 4
   )
   public class43(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!pja",
      name = "d",
      descriptor = "(I)I",
      line = 7
   )
   public final int method364(int arg0) {
      try {
         int var2 = 67 % ((arg0 - 36) / 41);
         ++field593;
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field599[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "b",
      descriptor = "(IB)V",
      line = 19
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = 116 / ((47 - arg1) / 46);
         ++field592;
         super.field680 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field599[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(IIBIII)V",
      line = 29
   )
   public static final void method365(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
      try {
         if (class300.field4107.field6439.method4286(arg2 + 120) != 0 && ~arg5 != -1 && ~class673.field9755 > -51 && ~arg0 != 0) {
            class534.field7614[class673.field9755++] = new class245((byte)1, arg0, arg5, arg1, arg3, 0, arg4, (class731)null);
         }

         if (arg2 != -10) {
            field598 = null;
         }

         ++field589;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field599[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(II)V",
      line = 46
   )
   public static final void method366(int arg0, int arg1) {
      try {
         ++field596;
         class686.field10122 = arg1;
         class235.field3273 = 2;
         class136.field1737 = class430.field6150;
         String var2 = null;
         if (class314.field4289 != null) {
            class147 var3 = new class147(class314.field4289);
            var2 = class727.method5302(var3.method1207(false), -27867);
            class484.field6927 = var3.method1207(false);
         }

         if (arg0 != 26386) {
            field598 = null;
         }

         if (var2 == null) {
            class244.method1858(35, 0);
         } else {
            class506.method3675(false, true, "", var2, 0);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field599[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "c",
      descriptor = "(I)V",
      line = 76
   )
   public static void method367(int arg0) {
      try {
         if (arg0 == 96) {
            field597 = null;
            field598 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field599[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(B)Z",
      line = 87
   )
   public final boolean method368(byte arg0) {
      try {
         if (arg0 != 120) {
            this.method368((byte)67);
         }

         ++field591;
         int var2 = super.field683.method3307(false).method4353(false);
         return var2 >= 96;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field599[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 106
   )
   public class43(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(IB)I",
      line = 111
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field595;
         int var3 = super.field683.method3307(false).method4353(false);
         if (var3 < 96) {
            return 3;
         } else if (~arg0 < -2 && var3 < 128) {
            return 3;
         } else if (arg0 > 3 && var3 < 192) {
            return 3;
         } else {
            return arg1 != 105 ? 58 : 1;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field599[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "b",
      descriptor = "(I)I",
      line = 135
   )
   public final int method101(int arg0) {
      try {
         ++field594;
         if (arg0 >= -116) {
            this.method97(77, (byte)-57);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field599[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "a",
      descriptor = "(I)V",
      line = 155
   )
   public final void method98(int arg0) {
      try {
         ++field590;
         int var2 = super.field683.method3307(false).method4353(false);
         if (~var2 > -97) {
            super.field680 = 0;
         }

         if (super.field680 > 1 && ~var2 > -129) {
            super.field680 = 1;
         }

         if (~super.field680 < -3 && var2 < 192) {
            super.field680 = 2;
         }

         if (arg0 > super.field680 || ~super.field680 < -4) {
            super.field680 = this.method101(-123);
         }

      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field599[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
