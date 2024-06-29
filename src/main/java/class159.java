import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class159 {
   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2043 = new String[]{method1338(method1337("\u0012\u0014+$")), method1338(method1337("\u0007Oifw")), method1338(method1337("\t\u0007&fKT")), method1338(method1337("\t\u0007&fHT")), method1338(method1337("\t\u0007&fIT"))};
   @OriginalMember(
      owner = "client!ufa",
      name = "g",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field2036 = new Hashtable();
   @OriginalMember(
      owner = "client!ufa",
      name = "b",
      descriptor = "I"
   )
   public static int field2039 = 0;
   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "Laka;"
   )
   public static class418 field2041 = new class418(19, 3);
   @OriginalMember(
      owner = "client!ufa",
      name = "e",
      descriptor = "I"
   )
   public static int field2037;
   @OriginalMember(
      owner = "client!ufa",
      name = "d",
      descriptor = "I"
   )
   public static int field2040;
   @OriginalMember(
      owner = "client!ufa",
      name = "c",
      descriptor = "I"
   )
   public static int field2042;
   @OriginalMember(
      owner = "client!ufa",
      name = "f",
      descriptor = "Lww;"
   )
   public static class339 field2038;

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method1334(int arg0) {
      try {
         ++field2040;
         return arg0 != 31770 ? 114 : 16;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2043[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(IZIILww;II)V"
   )
   public static final void method1335(int arg0, boolean arg1, int arg2, int arg3, class339 arg4, int arg5, int arg6) {
      try {
         class624.field9229 = arg6;
         class242.field3046 = arg2;
         class471.field6491 = arg4;
         class746.field10895 = arg1;
         ++field2037;
         class131.field1682 = arg3;
         class176.field2274 = null;
         class204.field2599 = arg0;
         class533.field7825 = 1;
         if (arg5 <= 84) {
            method1335(73, true, 39, 127, (class339)null, 93, -115);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2043[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2043[1] : field2043[0]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1336(byte arg0) {
      try {
         field2041 = null;
         if (arg0 == 113) {
            field2036 = null;
            field2038 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2043[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1337(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ufa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1338(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
