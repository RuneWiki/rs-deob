import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public class class394 extends class490 {
   @OriginalMember(
      owner = "client!gka",
      name = "l",
      descriptor = "I"
   )
   private int field5699;
   @OriginalMember(
      owner = "client!gka",
      name = "u",
      descriptor = "I"
   )
   private int field5693;
   @OriginalMember(
      owner = "client!gka",
      name = "s",
      descriptor = "I"
   )
   private int field5697;
   @OriginalMember(
      owner = "client!gka",
      name = "q",
      descriptor = "I"
   )
   private int field5694;
   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5702 = new String[]{method2990(method2989("N\u0012\u0001<,\u0001")), method2990(method2989("N\u0012\u0001<'\u0001")), method2990(method2989("N\u0012\u0001<#\u0001")), method2990(method2989("N\u0012\u0001<X@\u0017\tfZ\u0001")), method2990(method2989("N\u0012\u0001< \u0001"))};
   @OriginalMember(
      owner = "client!gka",
      name = "t",
      descriptor = "Llg;"
   )
   public static class437 field5700 = new class437();
   @OriginalMember(
      owner = "client!gka",
      name = "n",
      descriptor = "I"
   )
   public static int field5701 = -2;
   @OriginalMember(
      owner = "client!gka",
      name = "r",
      descriptor = "I"
   )
   public static int field5692;
   @OriginalMember(
      owner = "client!gka",
      name = "p",
      descriptor = "I"
   )
   public static int field5695;
   @OriginalMember(
      owner = "client!gka",
      name = "m",
      descriptor = "I"
   )
   public static int field5696;
   @OriginalMember(
      owner = "client!gka",
      name = "o",
      descriptor = "I"
   )
   public static int field5698;

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static void method2988(int arg0) {
      try {
         field5700 = null;
         int var1 = 17 / ((-4 - arg0) / 57);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5702[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "b",
      descriptor = "(III)V",
      line = 19
   )
   public final void method1646(int arg0, int arg1, int arg2) {
      try {
         ++field5698;
         int var4 = this.field5693 * arg1 >> 12;
         int var5 = this.field5694 * arg1 >> 12;
         int var6 = this.field5699 * arg2 >> 12;
         if (arg0 != 30078) {
            this.field5699 = -121;
         }

         int var7 = this.field5697 * arg2 >> 12;
         class514.method3741(var7, var6, var4, var5, true, super.field7015);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5702[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "c",
      descriptor = "(III)V",
      line = 39
   )
   public final void method1645(int arg0, int arg1, int arg2) {
      try {
         int var4 = -114 / ((arg2 - 39) / 45);
         ++field5696;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5702[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "a",
      descriptor = "(BII)V",
      line = 52
   )
   public final void method1644(byte arg0, int arg1, int arg2) {
      try {
         int var4 = 54 / ((75 - arg0) / 40);
         ++field5695;
         int var5 = this.field5693 * arg1 >> 12;
         int var6 = this.field5694 * arg1 >> 12;
         int var7 = this.field5699 * arg2 >> 12;
         int var8 = this.field5697 * arg2 >> 12;
         class362.method2710(-26359, var5, var8, var7, super.field7017, super.field7015, super.field7012, var6);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field5702[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "<init>",
      descriptor = "(IIIIIII)V",
      line = 70
   )
   public class394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field5699 = arg1;
         this.field5693 = arg0;
         this.field5697 = arg3;
         this.field5694 = arg2;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5702[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2989(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2990(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
