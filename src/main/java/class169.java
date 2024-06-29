import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class169 {
   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2131 = new String[]{method1329(method1328("W{\u0014Y:ngHD;Z;")), method1329(method1328("W{\u0014l}")), method1329(method1328("W{\u0014n}")), method1329(method1328("W{\u0014o}"))};
   @OriginalMember(
      owner = "client!jh",
      name = "b",
      descriptor = "Lsca;"
   )
   public static class49 field2129 = new class49(method1329(method1328("oP")), 1);
   @OriginalMember(
      owner = "client!jh",
      name = "d",
      descriptor = "Lnw;"
   )
   public static class616 field2130 = new class616(50, 11);
   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "I"
   )
   public static int field2126;
   @OriginalMember(
      owner = "client!jh",
      name = "c",
      descriptor = "I"
   )
   public static int field2127;
   @OriginalMember(
      owner = "client!jh",
      name = "e",
      descriptor = "I"
   )
   public static int field2128;

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method1325(int arg0, int arg1, int arg2) {
      try {
         ++field2126;
         int var4 = class41.field479 <= arg1 ? arg1 : class41.field479;
         if (arg2 != 8599) {
            field2129 = null;
         }

         if (class639.field9013 == this) {
            return 0;
         } else if (class532.field7275 == this) {
            return -arg0 + var4;
         } else {
            return class100.field1291 == this ? (-arg0 + var4) / 2 : 0;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2131[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(IIIBIIIIII)V"
   )
   public static final void method1326(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field4273;

      try {
         ++field2128;
         if (~arg7 <= -513 && ~arg0 <= -513 && ~arg7 >= ~((class507.field7030 + -2) * 512) && ~arg0 >= ~(class215.field2667 * 512 + -1024)) {
            if (arg3 >= -126) {
               method1327(-89);
            }

            int var11;
            label41: {
               var11 = -arg5 + class687.method5016(arg7, arg4, arg0, 2);
               if (!class775.field11283) {
                  class92.field1230.method154(arg6, 0, 0);
                  class338.field4832.method581(class92.field1230);
                  if (!var10) {
                     break label41;
                  }
               }

               class196.method1475((byte)-69, true);
            }

            label36: {
               if (!class33.field392) {
                  class338.field4832.method562(arg7, var11, arg0, class140.field1862);
                  if (!var10) {
                     break label36;
                  }
               }

               class338.field4832.method492(arg7, var11, arg0, class334.field4784, class140.field1862);
            }

            if (!class775.field11283) {
               class92.field1230.method154(-arg6, 0, 0);
               class338.field4832.method581(class92.field1230);
            } else {
               class584.method4194(5122);
            }
         } else {
            class140.field1862[0] = class140.field1862[1] = -1;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field2131[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2127;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2131[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1327(int arg0) {
      try {
         if (arg0 != 0) {
            field2129 = null;
         }

         field2129 = null;
         field2130 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2131[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1328(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1329(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
