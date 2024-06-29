import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class714 extends class603 {
   @OriginalMember(
      owner = "client!di",
      name = "t",
      descriptor = "I"
   )
   public int field10711;
   @OriginalMember(
      owner = "client!di",
      name = "s",
      descriptor = "I"
   )
   public int field10715;
   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10717 = new String[]{method5294(method5293(":\u000bSw\u0010")), method5294(method5293("0\u0017\u0011^")), method5294(method5293("%LS\u001cE")), method5294(method5293(":\u000bSs\u0010")), method5294(method5293(":\u000bS\u000eQ0\u000b\t\f\u0010")), method5294(method5293(":\u000bSp\u0010"))};
   @OriginalMember(
      owner = "client!di",
      name = "p",
      descriptor = "I"
   )
   public static int field10713 = 1;
   @OriginalMember(
      owner = "client!di",
      name = "q",
      descriptor = "I"
   )
   public static int field10712;
   @OriginalMember(
      owner = "client!di",
      name = "r",
      descriptor = "I"
   )
   public static int field10714;
   @OriginalMember(
      owner = "client!di",
      name = "o",
      descriptor = "I"
   )
   public static int field10716;

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public static final void method5291(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            method5292((byte)-65, (String)null);
         }

         class688.method5069(arg1, class288.field4539, class692.field10301, class316.field4878, -1);
         ++field10712;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10717[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "<init>",
      descriptor = "(Lrga;Lgea;IIIIIIIIII)V"
   )
   public class714(class694 arg0, class750 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field10711 = arg10;
         this.field10715 = arg11;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field10717[4] + (arg0 != null ? field10717[2] : field10717[1]) + ',' + (arg1 != null ? field10717[2] : field10717[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(I)Lbda;"
   )
   public final class783 method193(int arg0) {
      try {
         ++field10714;
         return arg0 != -1 ? null : class696.field10344;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10717[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(BLjava/lang/String;)I"
   )
   public static final int method5292(byte arg0, String arg1) {
      try {
         ++field10716;
         if (arg0 > -95) {
            field10713 = 113;
         }

         return 1 + arg1.length();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10717[0] + arg0 + ',' + (arg1 != null ? field10717[2] : field10717[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5293(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5294(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
