import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class362 {
   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5030 = new String[]{method2856(method2855("\u001et{\u0013r")), method2856(method2855("\u001et{\u0010r")), method2856(method2855("=w4\"\u001e\u0000\u007f%r)\u0010f \"z\u0010`'=(O")), method2856(method2855("\u0012w!\u00026\u0014f3=(\u0018_\u00177;\u001bA0 ,\u0010`")), method2856(method2855("\u001et{\u0011r")), method2856(method2855("\u001bw\"\u00026\u0014f3=(\u0018_\r\u0010?\u0014|\u0005 5\rk")), method2856(method2855("\u0016}8|)\u0000|{?;\u001bs277\u0010|!h.\fb0o\u0012\u001af\u0006\"5\u0001V<3=\u001b}&&3\u0016")), method2856(method2855("\u001fs#3t\u0019s;5t&f';4\u0012")), method2856(method2855("\u001fs#3t\u0019s;5t6~4!)")), method2856(method2855("\u001fs#3t\u0019s;5t\u0018s;3=\u0010\u007f0<.[_4<;\u0012w874\u0001T41.\u001a`,")), method2856(method2855("\u0016}8|)\u0000|{?;\u001bs277\u0010|!|\u0012\u001af\u0006\"5\u0001V<3=\u001b}&&3\u0016_\r\u0010?\u0014|")), method2856(method2855("\u001fs#3\"[\u007f4<;\u0012w874\u0001<\u0018\u0010?\u0014|\u00067(\u0003w'\u00115\u001b|01.\u001c};"))};
   @OriginalMember(
      owner = "client!kf",
      name = "g",
      descriptor = "I"
   )
   public static int field5024 = -1;
   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field5026 = false;
   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "I"
   )
   public static int field5023;
   @OriginalMember(
      owner = "client!kf",
      name = "c",
      descriptor = "I"
   )
   public static int field5025;
   @OriginalMember(
      owner = "client!kf",
      name = "f",
      descriptor = "I"
   )
   public static int field5027;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!kf",
      name = "e",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5028;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!kf",
      name = "d",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5029;

   @OriginalMember(
      owner = "client!kf",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method2851(int arg0) {
      try {
         if (arg0 < 89) {
            field5024 = 45;
         }

         ++field5023;
         return class139.field1755;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5030[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(I)V"
   )
   public static final synchronized void method2852(int arg0) {
      try {
         ++field5027;
         if (class188.field2401 == null) {
            try {
               if (arg0 != -1) {
                  method2852(55);
               }

               Class var1 = Class.forName(field5030[9]);
               Method var2 = var1.getDeclaredMethod(field5030[3], (Class[])null);
               Object var3 = var2.invoke((Object)null, (Object[])null);
               Method var4 = var1.getMethod(field5030[5], Class.forName(field5030[11]), field5028 != null ? field5028 : (field5028 = method2854(field5030[7])), field5029 != null ? field5029 : (field5029 = method2854(field5030[8])));
               class188.field2401 = var4.invoke((Object)null, var3, field5030[6], Class.forName(field5030[10]));
            } catch (Exception var7) {
               System.out.println(field5030[2]);
               var7.printStackTrace();
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5030[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(IIIIIIB)V"
   )
   public static final void method2853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
      try {
         if (arg6 > -97) {
            method2853(119, 100, 21, 98, -67, -18, (byte)31);
         }

         ++field5025;
         if (class415.field5689 <= -arg5 + arg2 && class282.field3921 >= arg2 - -arg5 && -arg5 + arg0 >= class577.field8561 && ~(arg0 + arg5) >= ~class586.field8647) {
            class696.method5072(arg4, arg1, (byte)87, arg2, arg0, arg3, arg5);
         } else {
            class216.method1763(arg1, arg5, arg4, arg3, arg0, (byte)-72, arg2);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field5030[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!kf",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2854(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2855(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2856(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
