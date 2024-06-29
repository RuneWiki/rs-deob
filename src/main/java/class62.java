import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class62 extends class580 {
   @OriginalMember(
      owner = "client!mk",
      name = "r",
      descriptor = "I"
   )
   private int field769 = -1;
   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field776 = new String[]{method517(method516("TS*\u007f$")), method517(method516("TS*~$")), method517(method516("B\u0016*\u0012q")), method517(method516("WMhP")), method517(method516("TS*}$"))};
   @OriginalMember(
      owner = "client!mk",
      name = "v",
      descriptor = "Lsd;"
   )
   public static class101 field771 = new class101(7, 2);
   @OriginalMember(
      owner = "client!mk",
      name = "t",
      descriptor = "Lpn;"
   )
   public static class776 field773 = new class776();
   @OriginalMember(
      owner = "client!mk",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field775 = false;
   @OriginalMember(
      owner = "client!mk",
      name = "s",
      descriptor = "I"
   )
   public static int field774 = 0;
   @OriginalMember(
      owner = "client!mk",
      name = "u",
      descriptor = "I"
   )
   public static int field770;
   @OriginalMember(
      owner = "client!mk",
      name = "p",
      descriptor = "I"
   )
   public static int field772;

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(Lki;B)V",
      line = 3
   )
   public final void method513(class736 arg0, byte arg1) {
      try {
         arg0.method5354(-126, this.field769);
         ++field772;
         if (arg1 != 94) {
            this.method513((class736)null, (byte)79);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field776[1] + (arg0 != null ? field776[2] : field776[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "a",
      descriptor = "(ILjj;)V",
      line = 15
   )
   public final void method514(int arg0, class128 arg1) {
      try {
         ++field770;
         this.field769 = arg1.method1038((byte)-123);
         if (arg0 != 15) {
            field775 = false;
         }

         arg1.method1104(255);
         if (~arg1.method1104(255) != -256) {
            --arg1.field1590;
            arg1.method1063(arg0 ^ 126);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field776[4] + arg0 + ',' + (arg1 != null ? field776[2] : field776[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "b",
      descriptor = "(I)V",
      line = 39
   )
   public static void method515(int arg0) {
      try {
         field771 = null;
         if (arg0 != 24416) {
            field773 = null;
         }

         field773 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field776[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method516(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method517(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
