import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class250 {
   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3139 = new String[]{method1885(method1884("]43Yq\u001e")), method1885(method1884("]43Yu\u001e")), method1885(method1884("X$>\u001b")), method1885(method1884("M\u007f|YI")), method1885(method1884("]43Yv\u001e"))};
   @OriginalMember(
      owner = "client!kea",
      name = "d",
      descriptor = "Lhha;"
   )
   public static class549 field3137 = new class549();
   @OriginalMember(
      owner = "client!kea",
      name = "b",
      descriptor = "I"
   )
   public static int field3135;
   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "I"
   )
   public static int field3136;
   @OriginalMember(
      owner = "client!kea",
      name = "c",
      descriptor = "I"
   )
   public static int field3138;

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(BIZILqh;II)V"
   )
   public static final void method1879(byte arg0, int arg1, boolean arg2, int arg3, class74 arg4, int arg5, int arg6) {
      try {
         class728.field10669 = null;
         class370.field5220 = arg6;
         class104.field1328 = arg3;
         ++field3135;
         class479.field6625 = arg1;
         class671.field9870 = arg5;
         class188.field2305 = arg4;
         class382.field5353 = arg2;
         if (arg0 != -18) {
            field3137 = null;
         }

         class449.field6210 = 1;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field3139[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field3139[3] : field3139[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method1880(int arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         byte var3;
         label42: {
            ++field3136;
            if (arg0 > 12000) {
               var3 = 4;
               class135.method1133(1);
               if (!var2) {
                  break label42;
               }
            }

            if (~arg0 < -5001) {
               class26.method222(1);
               var3 = 3;
               if (!var2) {
                  break label42;
               }
            }

            if (~arg0 >= -2001) {
               var3 = 1;
               class401.method3035(true, (byte)89);
               if (!var2) {
                  break label42;
               }
            }

            var3 = 2;
            class428.method3214(0);
         }

         if (class674.field9907.field8451.method2770((byte)-87) != 2) {
            class674.field9907.method4407(class674.field9907.field8420, -2160, 2);
            class594.method4335(false, Integer.MAX_VALUE, 2);
         }

         class647.method4661((byte)88);
         if (arg1 < 3) {
            method1882((String)null, 2, (String)null, (String)null);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3139[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1881(byte arg0) {
      try {
         field3137 = null;
         if (arg0 != 29) {
            method1879((byte)60, 43, true, 23, (class74)null, 76, 108);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3139[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;"
   )
   public static final String method1882(String arg0, int arg1, String arg2, String arg3) {
      ++field3138;

      for(int var4 = arg3.indexOf(arg2); var4 != -1; var4 = arg3.indexOf(arg2, var4 - -arg0.length())) {
         arg3 = arg3.substring(0, var4) + arg0 + arg3.substring(arg2.length() + var4);
      }

      int var5 = 94 / ((22 - arg1) / 50);
      return arg3;
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1883(int arg0) {
      class575.field7913 = arg0;

      for(int var1 = 0; var1 < class635.field8973; ++var1) {
         for(int var2 = 0; var2 < class304.field4042; ++var2) {
            if (class111.field1404[arg0][var1][var2] == null) {
               class111.field1404[arg0][var1][var2] = new class225(arg0);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1884(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1885(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
