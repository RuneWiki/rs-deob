import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class564 {
   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7703 = new String[]{method4053(method4052("\"\u0010e\u001a4z")), method4053(method4052("1\u0018i\u001a\u0003'\u0019*Y\u0011<\u0016cQ\u001d7\u0019p\u001a8=\u0003WD\u001f&3mU\u0017<\u0018w@\u00191:\\v\u00153\u0019")), method4053(method4052("\u001a\u0012eD4'\u001at\u0014\u0015 \u0005kFJ")), method4053(method4052(")Y*\u001a\r")), method4053(method4052("<\u0002hX")), method4053(method4052("6\u0002iD87\u0016t")), method4053(method4052("8\u0016rU^>\u0016jS^\u0001\u0003v]\u001e5")), method4053(method4052("\"\u0010e\u001a5z"))};
   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "Lnw;"
   )
   public static class616 field7701 = new class616(55, 8);
   @OriginalMember(
      owner = "client!pga",
      name = "b",
      descriptor = "I"
   )
   public static int field7700;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!pga",
      name = "c",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7702;

   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4049(int arg0) {
      try {
         if (arg0 != 8) {
            field7701 = null;
         }

         field7701 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7703[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(Ljava/io/File;BZ)V"
   )
   public static final void method4050(File arg0, byte arg1, boolean arg2) {
      try {
         if (class362.field5132 == null) {
            class53.method422(false);
         }

         ++field7700;

         try {
            if (arg1 <= 8) {
               field7701 = null;
            }

            Class var3 = Class.forName(field7703[1]);
            Method var4 = var3.getDeclaredMethod(field7703[5], field7702 != null ? field7702 : (field7702 = method4051(field7703[6])), Boolean.TYPE);
            var4.invoke(class362.field5132, arg0.getAbsolutePath(), new Boolean(arg2));
         } catch (Exception var7) {
            System.out.println(field7703[2]);
            var7.printStackTrace();
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field7703[0] + (arg0 != null ? field7703[3] : field7703[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!pga",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4051(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4052(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4053(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
