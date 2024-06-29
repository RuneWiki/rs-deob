import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class460 extends class757 {
   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6320 = new String[]{method3511(method3510("r=\u0004o\u001c")), method3511(method3510("r=\u0004l\u001c")), method3511(method3510("r=\u0004d\u001c")), method3511(method3510("r=\u0004g\u001c"))};
   @OriginalMember(
      owner = "client!wp",
      name = "r",
      descriptor = "[Lue;"
   )
   public static class243[] field6316 = new class243[8];
   @OriginalMember(
      owner = "client!wp",
      name = "s",
      descriptor = "I"
   )
   public static int field6317 = -1;
   @OriginalMember(
      owner = "client!wp",
      name = "t",
      descriptor = "I"
   )
   public static int field6315;
   @OriginalMember(
      owner = "client!wp",
      name = "q",
      descriptor = "I"
   )
   public static int field6318;
   @OriginalMember(
      owner = "client!wp",
      name = "u",
      descriptor = "I"
   )
   public static int field6319;

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(ZBII)V"
   )
   public final void method3506(boolean arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field6318;
         if (arg1 == 62) {
            int var5 = this.method5479(36) * super.field11086.field2853 / 10000;
            class629.field9294.method513(arg3, arg2 + 2, var5, super.field11086.field2850 + -2, ((class259)super.field11086).field3295, 0);
            class629.field9294.method513(arg3 + var5, arg2 + 2, -var5 + super.field11086.field2853, super.field11086.field2850 + -2, 0, 0);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6320[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "<init>",
      descriptor = "(Lww;Lww;Lru;)V"
   )
   public class460(class339 arg0, class339 arg1, class259 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!wp",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3507(byte arg0) {
      try {
         field6316 = null;
         int var1 = 47 % ((21 - arg0) / 57);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6320[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public final void method3508(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         ++field6319;
         class629.field9294.method462(arg1 + -2, arg0, super.field11086.field2853 + 4, super.field11086.field2850 - -2, ((class259)super.field11086).field3296, 0);
         class629.field9294.method462(arg1 + -1, arg0 + arg3, super.field11086.field2853 + 2, super.field11086.field2850, 0, 0);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6320[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(IIIIIBIIII)V"
   )
   public static final void method3509(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var10 = client.field1481;

      try {
         if (arg5 <= 44) {
            method3509(101, -98, -75, 119, 25, (byte)-83, -20, -100, -13, 12);
         }

         ++field6315;
         if (arg6 >= 512 && arg1 >= 512 && ~arg6 >= ~(class273.field3491 * 512 + -1024) && (class211.field2689 + -2) * 512 >= arg1) {
            int var11;
            label41: {
               var11 = class215.method1757(arg6, false, arg9, arg1) - arg0;
               if (!class28.field416) {
                  class428.field5818.method868(arg4, 0, 0);
                  class629.field9294.method397(class428.field5818);
                  if (!var10) {
                     break label41;
                  }
               }

               class301.method2420(true, 19934);
            }

            label36: {
               if (!class400.field5500) {
                  class629.field9294.method451(arg6, var11, arg1, class489.field6820);
                  if (!var10) {
                     break label36;
                  }
               }

               class629.field9294.method509(arg6, var11, arg1, class629.field9293, class489.field6820);
            }

            if (class28.field416) {
               class684.method4980(0);
            } else {
               class428.field5818.method868(-arg4, 0, 0);
               class629.field9294.method397(class428.field5818);
            }
         } else {
            class489.field6820[0] = class489.field6820[1] = -1;
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field6320[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3510(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3511(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
