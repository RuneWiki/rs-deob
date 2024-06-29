import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class54 {
   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1106 = new String[]{method640(method639("k.4\u00161m.,\u00101s*$\u001bzb;l6|b*1\u0004vc#'8}k*!\u0003")), method640(method639("w9")), method640(method639("zalYb")), method640(method639("k.4\u00161m.,\u00101B##\u0004l")), method640(method639("v-#Y^)")), method640(method639("o:.\u001b")), method640(method639("r*66|b*1\u0004vc#'")), method640(method639("k.4\u00161m.,\u00101R;0\u001eqf")), method640(method639("k.4\u00161m.,\u00101S:,\u0003vl*")), method640(method639("m #\u0013/")), method640(method639("v-#Y])"))};
   @OriginalMember(
      owner = "client!wba",
      name = "c",
      descriptor = "I"
   )
   public static int field1102;
   @OriginalMember(
      owner = "client!wba",
      name = "b",
      descriptor = "I"
   )
   public static int field1103;
   @OriginalMember(
      owner = "client!wba",
      name = "d",
      descriptor = "I"
   )
   public static int field1104;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1105;

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 1
   )
   public static Class method638(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/Class;B)Z",
      line = 4
   )
   public static final boolean method636(String arg0, Class arg1, byte arg2) {
      try {
         ++field1103;
         Class var3 = (Class)class592.field8528.get(arg0);
         if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
         } else {
            int var4 = -2 / ((arg2 - 57) / 59);
            File var5 = null;
            if (var5 == null) {
               var5 = (File)class74.field1312.get(arg0);
            }

            if (var5 != null) {
               try {
                  var5 = new File(var5.getCanonicalPath());
                  Class var6 = Class.forName(field1106[8]);
                  Class var7 = Class.forName(field1106[0]);
                  Method var8 = var7.getDeclaredMethod(field1106[6], Boolean.TYPE);
                  Method var9 = var6.getDeclaredMethod(field1106[9], Class.forName(field1106[3]), Class.forName(field1106[7]));
                  var8.invoke(var9, Boolean.TRUE);
                  var9.invoke(Runtime.getRuntime(), arg1, var5.getPath());
                  var8.invoke(var9, Boolean.FALSE);
                  class592.field8528.put(arg0, arg1);
                  return true;
               } catch (NoSuchMethodException var11) {
                  System.load(var5.getPath());
                  class592.field8528.put(arg0, field1105 != null ? field1105 : (field1105 = method638(field1106[1])));
                  return true;
               } catch (Throwable var12) {
               }
            }

            return false;
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field1106[4] + (arg0 != null ? field1106[2] : field1106[5]) + ',' + (arg1 != null ? field1106[2] : field1106[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(B)V",
      line = 72
   )
   public static final void method637(byte arg0) {
      try {
         ++field1104;
         class744.method5400((byte)119);
         class529.method3961(2, -48001, 22050, ~class510.field7454.field11177.method4391(false) == -2);
         class600.field8650 = class101.method966(class412.field6033, -104, 0, class386.field5692, 22050);
         class326.method2530(true, class632.method4642((class582)null, -95), (byte)-116);
         class39.field934 = class101.method966(class412.field6033, -125, 1, class386.field5692, 2048);
         class39.field934.method1560(32, class749.field10795);
         int var1 = -110 / (arg0 / 32);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1106[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method639(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method640(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
