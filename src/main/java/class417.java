import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class417 {
   @OriginalMember(
      owner = "client!br",
      name = "i",
      descriptor = "I"
   )
   public int field5860 = -1;
   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5864 = new String[]{method3158(method3157(" \u0017WY\b0\u0017Pk\u00021\u001eF")), method3158(method3157("9\u0013UyE?\u0013M\u007fE\u0000\u0006Qq\u00054")), method3158(method3157("&\u0003")), method3158(method3157("?\u001dB|[")), method3158(method3157("1\u0000\rZC")), method3158(method3157("=\u0007Ot")), method3158(method3157("9\u0013UyE?\u0013M\u007fE!\u0017Et\u000e0\u0006\rY\b0\u0017Pk\u00021\u001eFW\t9\u0017@l")), method3158(method3157("9\u0013UyE?\u0013M\u007fE\u0001\u0007Ml\u0002>\u0017")), method3158(method3157("(\\\r6\u0016")), method3158(method3157("9\u0013UyE?\u0013M\u007fE\u0010\u001eBk\u0018")), method3158(method3157("1\u0000\rYC")), method3158(method3157("1\u0000\r[C"))};
   @OriginalMember(
      owner = "client!br",
      name = "d",
      descriptor = "I"
   )
   public static int field5859 = 0;
   @OriginalMember(
      owner = "client!br",
      name = "b",
      descriptor = "Lnw;"
   )
   public static class616 field5858 = new class616(42, 3);
   @OriginalMember(
      owner = "client!br",
      name = "c",
      descriptor = "I"
   )
   public static int field5854;
   @OriginalMember(
      owner = "client!br",
      name = "g",
      descriptor = "I"
   )
   public static int field5861;
   @OriginalMember(
      owner = "client!br",
      name = "h",
      descriptor = "Lgr;"
   )
   public class462 field5857;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!br",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5863;
   @OriginalMember(
      owner = "client!br",
      name = "e",
      descriptor = "[I"
   )
   public int[] field5856;
   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "[J"
   )
   public long[] field5855;
   @OriginalMember(
      owner = "client!br",
      name = "j",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field5862;

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3153(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(BLjava/lang/Class;Ljava/lang/String;)Z"
   )
   public static final boolean method3154(byte arg0, Class arg1, String arg2) {
      try {
         ++field5854;
         Class var3 = (Class)class192.field2346.get(arg2);
         if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
         } else {
            File var4 = null;
            if (var4 == null) {
               var4 = (File)class307.field4083.get(arg2);
            }

            if (arg0 <= 106) {
               method3153(true);
            }

            if (var4 != null) {
               try {
                  var4 = new File(var4.getCanonicalPath());
                  Class var5 = Class.forName(field5864[7]);
                  Class var6 = Class.forName(field5864[6]);
                  Method var7 = var6.getDeclaredMethod(field5864[0], Boolean.TYPE);
                  Method var8 = var5.getDeclaredMethod(field5864[3], Class.forName(field5864[9]), Class.forName(field5864[1]));
                  var7.invoke(var8, Boolean.TRUE);
                  var8.invoke(Runtime.getRuntime(), arg1, var4.getPath());
                  var7.invoke(var8, Boolean.FALSE);
                  class192.field2346.put(arg2, arg1);
                  return true;
               } catch (NoSuchMethodException var10) {
                  System.load(var4.getPath());
                  class192.field2346.put(arg2, field5863 != null ? field5863 : (field5863 = method3156(field5864[2])));
                  return true;
               } catch (Throwable var11) {
               }
            }

            return false;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field5864[4] + arg0 + ',' + (arg1 != null ? field5864[8] : field5864[5]) + ',' + (arg2 != null ? field5864[8] : field5864[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3155(int arg0) {
      try {
         int var1 = 93 / ((arg0 - -29) / 35);
         field5858 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5864[11] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3156(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3157(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3158(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
