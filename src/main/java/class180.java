import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class180 {
   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2296 = new String[]{method1524(method1523("\u0011\u0000\u001cqZ")), method1524(method1523("\u0011\u0000\u001csZ")), method1524(method1523("\u0011\u0000\u001cpZ"))};
   @OriginalMember(
      owner = "client!wd",
      name = "g",
      descriptor = "I"
   )
   public int field2284;
   @OriginalMember(
      owner = "client!wd",
      name = "h",
      descriptor = "I"
   )
   public int field2285;
   @OriginalMember(
      owner = "client!wd",
      name = "b",
      descriptor = "I"
   )
   public static int field2286;
   @OriginalMember(
      owner = "client!wd",
      name = "d",
      descriptor = "I"
   )
   public int field2287;
   @OriginalMember(
      owner = "client!wd",
      name = "f",
      descriptor = "I"
   )
   public int field2288;
   @OriginalMember(
      owner = "client!wd",
      name = "k",
      descriptor = "I"
   )
   public static int field2289;
   @OriginalMember(
      owner = "client!wd",
      name = "l",
      descriptor = "I"
   )
   public int field2290;
   @OriginalMember(
      owner = "client!wd",
      name = "j",
      descriptor = "I"
   )
   public int field2292;
   @OriginalMember(
      owner = "client!wd",
      name = "e",
      descriptor = "I"
   )
   public int field2294;
   @OriginalMember(
      owner = "client!wd",
      name = "c",
      descriptor = "I"
   )
   public static int field2295;
   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "[B"
   )
   public byte[] field2291;
   @OriginalMember(
      owner = "client!wd",
      name = "i",
      descriptor = "[B"
   )
   public byte[] field2293;

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method1520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         class86.field1186 = arg5;
         if (arg2 != 0) {
            method1522(35, 23, -21, -48);
         }

         ++field2289;
         class146.field1830 = arg4;
         class134.field1689 = arg3;
         class430.field5845 = arg6;
         class136.field1729 = arg0;
         class650.field9713 = arg1;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2296[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method1521(int arg0) {
      try {
         if (arg0 <= 74) {
            method1522(87, 13, -16, -59);
         }

         ++field2295;
         return class533.field7825 != 0;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2296[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method1522(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg0 != 25495) {
            return 67;
         } else {
            ++field2286;
            if (arg3 >= arg1) {
               return arg2 >= arg3 ? arg3 : arg2;
            } else {
               return arg1;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2296[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1523(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1524(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
