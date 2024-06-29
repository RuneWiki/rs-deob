import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class702 extends class673 {
   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10270 = new String[]{method5110(method5109("\u0018[\u0000M\u001d")), method5110(method5109("\r\u0000B\u000f")), method5110(method5109("\u0005\u0003\u0000!H")), method5110(method5109("\u0005\u0003\u0000 H")), method5110(method5109("\u0005\u0003\u0000\"H"))};
   @OriginalMember(
      owner = "client!fv",
      name = "l",
      descriptor = "Lse;"
   )
   public static class6 field10268 = new class6(69, -1);
   @OriginalMember(
      owner = "client!fv",
      name = "o",
      descriptor = "I"
   )
   public int field10263;
   @OriginalMember(
      owner = "client!fv",
      name = "n",
      descriptor = "I"
   )
   public static int field10265;
   @OriginalMember(
      owner = "client!fv",
      name = "r",
      descriptor = "I"
   )
   public int field10266;
   @OriginalMember(
      owner = "client!fv",
      name = "p",
      descriptor = "I"
   )
   public static int field10267;
   @OriginalMember(
      owner = "client!fv",
      name = "m",
      descriptor = "Lmb;"
   )
   public class431 field10264;
   @OriginalMember(
      owner = "client!fv",
      name = "q",
      descriptor = "Lse;"
   )
   public class6 field10269;

   @OriginalMember(
      owner = "client!fv",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5106(int arg0) {
      try {
         field10268 = null;
         if (arg0 != -1) {
            field10268 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10270[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V"
   )
   public static final void method5107(int arg0, int arg1, String arg2, String arg3, int arg4, String arg5, String arg6) {
      try {
         if (arg4 == -18224) {
            ++field10267;
            class574.method4304((String)null, arg3, arg0, arg4 + 18343, arg2, arg1, arg6, -1, arg5);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10270[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10270[0] : field10270[1]) + ',' + (arg3 != null ? field10270[0] : field10270[1]) + ',' + arg4 + ',' + (arg5 != null ? field10270[0] : field10270[1]) + ',' + (arg6 != null ? field10270[0] : field10270[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5108(int arg0) {
      try {
         ++field10265;
         if (arg0 != -1) {
            method5107(-84, 53, (String)null, (String)null, -78, (String)null, (String)null);
         }

         if (class259.field3300.length > class155.field1999) {
            class259.field3300[class155.field1999++] = this;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10270[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5109(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5110(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
