import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class446 extends class347 {
   @OriginalMember(
      owner = "client!ad",
      name = "m",
      descriptor = "Z"
   )
   public boolean field6779 = false;
   @OriginalMember(
      owner = "client!ad",
      name = "k",
      descriptor = "I"
   )
   public int field6786 = -1;
   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6790 = new String[]{method3373(method3372("\u001aQF;=\u0015\\\u001c9|")), method3373(method3372("\bP\u001cF7\u0018P\u001bt=\u0019Y\r")), method3373(method3372("\u0011T\u001efz\u0017T\u0006`z\tP\u000ek1\u0018AFF7\u0018P\u001bt=\u0019Y\rH6\u0011P\u000bs")), method3373(method3372("\u0011T\u001efz\u0017T\u0006`z8Y\tt'")), method3373(method3372("\u0000\u001bF))")), method3373(method3372("\u0017Z\tcd")), method3373(method3372("\u0015@\u0004k")), method3373(method3372("\u001dR")), method3373(method3372("\u001aQFE|")), method3373(method3372("\u0011T\u001efz\u0017T\u0006`z(A\u001an:\u001c")), method3373(method3372("\u0011T\u001efz\u0017T\u0006`z)@\u0006s=\u0016P")), method3373(method3372("\u001aQFF|"))};
   @OriginalMember(
      owner = "client!ad",
      name = "j",
      descriptor = "[Z"
   )
   public static boolean[] field6781 = new boolean[100];
   @OriginalMember(
      owner = "client!ad",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field6785 = false;
   @OriginalMember(
      owner = "client!ad",
      name = "t",
      descriptor = "Lpd;"
   )
   public static class268 field6787 = new class268();
   @OriginalMember(
      owner = "client!ad",
      name = "p",
      descriptor = "I"
   )
   public int field6777;
   @OriginalMember(
      owner = "client!ad",
      name = "i",
      descriptor = "I"
   )
   public static int field6778;
   @OriginalMember(
      owner = "client!ad",
      name = "l",
      descriptor = "I"
   )
   public int field6780;
   @OriginalMember(
      owner = "client!ad",
      name = "n",
      descriptor = "I"
   )
   public int field6782;
   @OriginalMember(
      owner = "client!ad",
      name = "r",
      descriptor = "I"
   )
   public int field6783;
   @OriginalMember(
      owner = "client!ad",
      name = "u",
      descriptor = "I"
   )
   public int field6784;
   @OriginalMember(
      owner = "client!ad",
      name = "q",
      descriptor = "I"
   )
   public static int field6788;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ad",
      name = "o",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field6789;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method3371(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(Z)V",
      line = 13
   )
   public static void method3369(boolean arg0) {
      try {
         if (arg0) {
            method3369(true);
         }

         field6781 = null;
         field6787 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6790[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "<init>",
      descriptor = "(I)V",
      line = 113
   )
   public class446(int arg0) {
      try {
         this.field6786 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6790[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z",
      line = 41
   )
   public static final boolean method3370(Class arg0, int arg1, String arg2) {
      try {
         ++field6788;
         Class var3 = (Class)class40.field425.get(arg2);
         if (arg1 != -26382) {
            method3370((Class)null, -82, (String)null);
         }

         if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
         } else {
            File var4 = null;
            if (var4 == null) {
               var4 = (File)class360.field5435.get(arg2);
            }

            if (var4 != null) {
               try {
                  var4 = new File(var4.getCanonicalPath());
                  Class var5 = Class.forName(field6790[10]);
                  Class var6 = Class.forName(field6790[2]);
                  Method var7 = var6.getDeclaredMethod(field6790[1], Boolean.TYPE);
                  Method var8 = var5.getDeclaredMethod(field6790[5], Class.forName(field6790[3]), Class.forName(field6790[9]));
                  var7.invoke(var8, Boolean.TRUE);
                  var8.invoke(Runtime.getRuntime(), arg0, var4.getPath());
                  var7.invoke(var8, Boolean.FALSE);
                  class40.field425.put(arg2, arg0);
                  return true;
               } catch (NoSuchMethodException var10) {
                  System.load(var4.getPath());
                  class40.field425.put(arg2, field6789 != null ? field6789 : (field6789 = method3371(field6790[7])));
                  return true;
               } catch (Throwable var11) {
               }
            }

            return false;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field6790[8] + (arg0 != null ? field6790[4] : field6790[6]) + ',' + arg1 + ',' + (arg2 != null ? field6790[4] : field6790[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3372(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3373(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
