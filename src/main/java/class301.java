import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class301 {
   @OriginalMember(
      owner = "client!ria",
      name = "e",
      descriptor = "I"
   )
   public int field4112;
   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4125 = new String[]{method2248(method2247("Y\u001e-O-B\u0019%\u0015/\u0003")), method2248(method2247("Y\u001e-OS\u0003")), method2248(method2247("Y\u001e-OP\u0003")), method2248(method2247("Y\u001e-OeD$8\u0013xE\u0010d")), method2248(method2247("E\u0002 \r")), method2248(method2247("PYbOl")), method2248(method2247("Y\u001e-OU\u0003")), method2248(method2247("Y\u001e-OR\u0003"))};
   @OriginalMember(
      owner = "client!ria",
      name = "d",
      descriptor = "Lria;"
   )
   public static class301 field4111 = new class301(1);
   @OriginalMember(
      owner = "client!ria",
      name = "g",
      descriptor = "Lria;"
   )
   public static class301 field4113 = new class301(2);
   @OriginalMember(
      owner = "client!ria",
      name = "f",
      descriptor = "Lria;"
   )
   public static class301 field4116 = new class301(4);
   @OriginalMember(
      owner = "client!ria",
      name = "b",
      descriptor = "Lria;"
   )
   public static class301 field4117 = new class301(1);
   @OriginalMember(
      owner = "client!ria",
      name = "n",
      descriptor = "Lria;"
   )
   public static class301 field4118 = new class301(2);
   @OriginalMember(
      owner = "client!ria",
      name = "p",
      descriptor = "Lria;"
   )
   public static class301 field4119 = new class301(4);
   @OriginalMember(
      owner = "client!ria",
      name = "j",
      descriptor = "Lria;"
   )
   public static class301 field4120 = new class301(2);
   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "Lria;"
   )
   public static class301 field4121 = new class301(4);
   @OriginalMember(
      owner = "client!ria",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field4122 = new class118(73, -2);
   @OriginalMember(
      owner = "client!ria",
      name = "k",
      descriptor = "I"
   )
   public static int field4124 = 0;
   @OriginalMember(
      owner = "client!ria",
      name = "m",
      descriptor = "[Z"
   )
   public static boolean[] field4123 = new boolean[100];
   @OriginalMember(
      owner = "client!ria",
      name = "l",
      descriptor = "I"
   )
   public static int field4109;
   @OriginalMember(
      owner = "client!ria",
      name = "h",
      descriptor = "I"
   )
   public static int field4110;
   @OriginalMember(
      owner = "client!ria",
      name = "o",
      descriptor = "I"
   )
   public static int field4114;
   @OriginalMember(
      owner = "client!ria",
      name = "i",
      descriptor = "I"
   )
   public static int field4115;

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(CII)I",
      line = 6
   )
   public static final int method2243(char arg0, int arg1, int arg2) {
      try {
         if (arg1 != 1) {
            return -23;
         } else {
            ++field4109;
            int var3 = arg0 << 4;
            if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
               char var6 = Character.toLowerCase(arg0);
               var3 = (var6 << 4) + 1;
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4125[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 28
   )
   public final String toString() {
      try {
         ++field4110;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4125[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(II)V",
      line = 41
   )
   public static final void method2244(int arg0, int arg1) {
      boolean var2 = client.field4360;

      try {
         ++field4115;
         class428 var3 = class13.field145.method328(1745388291);
         if (var2) {
            if (~((long)arg1) == ~(var3.field6137 >> 48 & 65535L)) {
               var3.method3165(125);
            }

            var3 = class13.field145.method325(arg0 ^ 2075420443);
         }

         while(true) {
            while(var3 != null) {
               if (~((long)arg1) == ~(var3.field6137 >> 48 & 65535L)) {
                  var3.method3165(125);
               }

               var3 = class13.field145.method325(arg0 ^ 2075420443);
            }

            if (!var2) {
               if (arg0 != -2075424016) {
                  field4119 = null;
                  return;
               }

               return;
            }

            if (arg0 == 0) {
               var3.method3165(125);
            }

            var3 = class13.field145.method325(arg0 ^ 2075420443);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4125[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(I)V",
      line = 66
   )
   public static void method2245(int arg0) {
      try {
         field4111 = null;
         field4120 = null;
         field4119 = null;
         field4116 = null;
         field4118 = null;
         field4122 = null;
         field4117 = null;
         field4123 = null;
         if (arg0 != 1) {
            method2246((String)null, false);
         }

         field4113 = null;
         field4121 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4125[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)V",
      line = 86
   )
   public static final void method2246(String arg0, boolean arg1) {
      try {
         System.exit(1);
         ++field4114;
         if (!arg1) {
            field4123 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4125[6] + (arg0 != null ? field4125[5] : field4125[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "<init>",
      descriptor = "(I)V",
      line = 101
   )
   private class301(int arg0) {
      try {
         this.field4112 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4125[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2247(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ria",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2248(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
