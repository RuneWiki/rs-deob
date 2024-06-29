import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class127 {
   @OriginalMember(
      owner = "client!ff",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field119 = new String[]{method83(method82("Xd\u0018\u0003j")), method83(method82("Xd\u0018\u0007j")), method83(method82("Xd\u0018\u0005j")), method83(method82("Xd\u0018\u0002j")), method83(method82("E,\u0018h?")), method83(method82("PwZ*")), method83(method82("Od")), method83(method82("Xd\u0018\u0004j"))};
   @OriginalMember(
      owner = "client!ff",
      name = "A",
      descriptor = "Lbga;"
   )
   public static class378 field116 = new class378(103, 10);
   @OriginalMember(
      owner = "client!ff",
      name = "E",
      descriptor = "I"
   )
   public static int field113;
   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "I"
   )
   public static int field114;
   @OriginalMember(
      owner = "client!ff",
      name = "D",
      descriptor = "I"
   )
   public static int field115;
   @OriginalMember(
      owner = "client!ff",
      name = "C",
      descriptor = "I"
   )
   public static int field117;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ff",
      name = "B",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field118;

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(IF)V"
   )
   public final void method76(int arg0, float arg1) {
      try {
         if (arg0 != -1) {
            method79(-105);
         }

         super.field1596 = arg1;
         ++field114;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field119[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method77(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         byte var4;
         label38: {
            ++field117;
            if (arg2 > 20000) {
               class135.method1133(1);
               var4 = 4;
               if (!var3) {
                  break label38;
               }
            }

            if (~arg2 < -10001) {
               class26.method222(1);
               var4 = 3;
               if (!var3) {
                  break label38;
               }
            }

            if (arg2 > 5000) {
               class428.method3214(0);
               var4 = 2;
               if (!var3) {
                  break label38;
               }
            }

            class401.method3035(true, (byte)94);
            var4 = 1;
         }

         int var5 = -22 % ((-74 - arg1) / 47);
         if (~arg0 != ~class674.field9907.field8451.method2770((byte)-90)) {
            class674.field9907.method4407(class674.field9907.field8420, -2160, arg0);
            class594.method4335(false, Integer.MAX_VALUE, arg0);
         }

         class647.method4661((byte)-126);
         return var4;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field119[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public final void method78(int arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 < 37) {
            method79(17);
         }

         ++field113;
         super.field1595 = arg1;
         super.field1594 = arg0;
         super.field1608 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field119[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method79(int arg0) {
      try {
         if (arg0 != 10) {
            method80(-105, (class158)null);
         }

         field116 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field119[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(ILmg;)V"
   )
   public static final void method80(int arg0, class158 arg1) {
      try {
         ++field115;
         if (class111.field1404 != null) {
            int var2 = 62 % ((arg0 - -61) / 53);
            class712 var3 = null;
            if (~arg1.field2035 == -1) {
               var3 = (class712)class396.method3009(arg1.field2027, arg1.field2038, arg1.field2039);
            }

            if (~arg1.field2035 == -2) {
               var3 = (class712)class401.method3033(arg1.field2027, arg1.field2038, arg1.field2039);
            }

            if (arg1.field2035 == 2) {
               var3 = (class712)class737.method5341(arg1.field2027, arg1.field2038, arg1.field2039, field118 != null ? field118 : (field118 = method81(field119[6])));
            }

            if (~arg1.field2035 == -4) {
               var3 = (class712)class270.method2064(arg1.field2027, arg1.field2038, arg1.field2039);
            }

            if (var3 != null) {
               arg1.field2033 = var3.method2281((byte)-128);
               arg1.field2036 = var3.method2273((byte)17);
               arg1.field2029 = var3.method2280(-31276);
            } else {
               arg1.field2029 = 0;
               arg1.field2036 = 0;
               arg1.field2033 = -1;
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field119[7] + arg0 + ',' + (arg1 != null ? field119[4] : field119[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class9(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ff",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method81(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method82(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ff",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method83(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
