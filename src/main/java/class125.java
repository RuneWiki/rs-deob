import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class125 extends class294 {
   @OriginalMember(
      owner = "client!mv",
      name = "n",
      descriptor = "[B"
   )
   public byte[] field1795;
   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1801 = new String[]{method1187(method1186("7#MU*")), method1187(method1186("7#M(k4<\u0017**")), method1187(method1186("4 \u000fx")), method1187(method1186("!{M:\u007f")), method1187(method1186("7#MW*"))};
   @OriginalMember(
      owner = "client!mv",
      name = "p",
      descriptor = "Lnaa;"
   )
   public static class113 field1796 = new class113(37, 3);
   @OriginalMember(
      owner = "client!mv",
      name = "r",
      descriptor = "Ltia;"
   )
   public static class208 field1798 = new class208();
   @OriginalMember(
      owner = "client!mv",
      name = "m",
      descriptor = "Lkaa;"
   )
   public static class602 field1799 = new class602();
   @OriginalMember(
      owner = "client!mv",
      name = "q",
      descriptor = "I"
   )
   public static int field1797;
   @OriginalMember(
      owner = "client!mv",
      name = "o",
      descriptor = "J"
   )
   public static long field1800;

   @OriginalMember(
      owner = "client!mv",
      name = "<init>",
      descriptor = "([B)V",
      line = 8
   )
   public class125(byte[] arg0) {
      try {
         this.field1795 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field1801[1] + (arg0 != null ? field1801[3] : field1801[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "(III)Z",
      line = 19
   )
   public static final boolean method1183(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 225) {
            method1184(-103, -116, -124);
         }

         ++field1797;
         return class618.method4547(arg1, arg2, -28299) & class368.method3015(arg1, (byte)82, arg2);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1801[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(III)V",
      line = 33
   )
   public static final void method1184(int arg0, int arg1, int arg2) {
      boolean var3 = class711.field10694[0][arg1][arg2] != null && class711.field10694[0][arg1][arg2].field2959 != null;

      for(int var4 = arg0; var4 >= 0; --var4) {
         if (class711.field10694[var4][arg1][arg2] == null) {
            class190 var5 = class711.field10694[var4][arg1][arg2] = new class190(var4);
            if (var3) {
               ++var5.field2954;
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(Z)V",
      line = 56
   )
   public static void method1185(boolean arg0) {
      try {
         field1796 = null;
         field1798 = null;
         if (!arg0) {
            field1798 = null;
         }

         field1799 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1801[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1186(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1187(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
