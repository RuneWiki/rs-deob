import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class639 {
   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9340 = new String[]{method4620(method4619("\u00177h&M\u0017#e*q\u0004.j*R\u0005.{<")), method4620(method4619("\u001c \u007f.\u000f\u001a g(\u000f$4g;H\u001b$")), method4620(method4619("\u001a$ha`^")), method4620(method4619("\u001a$hac^")), method4620(method4619("\u001a$haU\u0019\u0012}=H\u0018&!"))};
   @OriginalMember(
      owner = "client!lea",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field9336 = false;
   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "I"
   )
   public static int field9334;
   @OriginalMember(
      owner = "client!lea",
      name = "b",
      descriptor = "I"
   )
   public static int field9335;
   @OriginalMember(
      owner = "client!lea",
      name = "d",
      descriptor = "I"
   )
   public static int field9337;
   @OriginalMember(
      owner = "client!lea",
      name = "e",
      descriptor = "I"
   )
   public static int field9338;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!lea",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9339;

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4616(byte arg0) {
      try {
         try {
            Method var1 = (field9339 != null ? field9339 : (field9339 = method4618(field9340[1]))).getMethod(field9340[0]);
            if (var1 != null) {
               try {
                  Runtime var2 = Runtime.getRuntime();
                  Integer var3 = (Integer)var1.invoke(var2, (Object[])null);
                  class683.field10050 = var3;
               } catch (Throwable var6) {
               }
            }
         } catch (Exception var7) {
         }

         ++field9335;
         int var4 = 118 % ((17 - arg0) / 60);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9340[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(IIB)V"
   )
   public static final void method4617(int arg0, int arg1, byte arg2) {
      try {
         ++field9334;
         class167.method1374((byte)-13, arg0, arg1);
         int var3 = -16 % ((46 - arg2) / 63);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9340[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9337;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9340[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class639(int arg0, int arg1) {
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4618(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4619(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 33);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4620(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 33;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
