import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class class205 {
   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2522 = new String[]{method1553(method1552("-J\u0019p\u001b")), method1553(method1552("*\\V")), method1553(method1552("&\u0015\u0019\u001aN")), method1553(method1552("-J\u0019r\u001b")), method1553(method1552("3N[X")), method1553(method1552("-J\u0019q\u001b")), method1553(method1552("-J\u0019s\u001b"))};
   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "[Z"
   )
   public static boolean[] field2521 = new boolean[5];
   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field2519 = new int[4096];
   @OriginalMember(
      owner = "client!pq",
      name = "c",
      descriptor = "I"
   )
   public static int field2517;
   @OriginalMember(
      owner = "client!pq",
      name = "d",
      descriptor = "I"
   )
   public static int field2518;
   @OriginalMember(
      owner = "client!pq",
      name = "e",
      descriptor = "I"
   )
   public static int field2520;

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIB)[B"
   )
   public abstract byte[] method1545(int arg0, int arg1, byte arg2);

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1546(int arg0) {
      try {
         field2519 = null;
         if (arg0 < 18) {
            method1551(32, -110, -44);
         }

         field2521 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2522[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method1547(int arg0, class65 arg1) {
      try {
         ++field2520;
         class183.field2263 = class569.method4087(class465.field6382, arg1, arg0 + -12543, true);
         class632.field8875 = class637.method4622(arg1, -63, class465.field6382);
         if (arg0 == -7265) {
            class163.field2095 = class569.method4087(class167.field2112, arg1, -19808, true);
            class22.field281 = class637.method4622(arg1, -63, class167.field2112);
            class101.field1310 = class569.method4087(class18.field245, arg1, -19808, true);
            class101.field1304 = class637.method4622(arg1, -63, class18.field245);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2522[6] + arg0 + ',' + (arg1 != null ? field2522[2] : field2522[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(I)[B"
   )
   public abstract byte[] method1548(int arg0);

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IILbj;BLjava/awt/Component;)Lil;"
   )
   public static final class7 method1549(int arg0, int arg1, class255 arg2, byte arg3, Component arg4) {
      try {
         ++field2518;
         if (class556.field7644 == 0) {
            throw new IllegalStateException();
         } else if (~arg1 <= -1 && ~arg1 > -3) {
            if (~arg0 > -257) {
               arg0 = 256;
            }

            try {
               class7 var5 = (class7)Class.forName(field2522[1]).newInstance();
               var5.field47 = new int[(!class614.field8578 ? 1 : 2) * 256];
               var5.field57 = arg0;
               var5.method51(arg4);
               var5.field64 = (-1024 & arg0) + 1024;
               if (~var5.field64 < -16385) {
                  var5.field64 = 16384;
               }

               var5.method52(var5.field64);
               if (class182.field2246 > 0 && class577.field7923 == null) {
                  class577.field7923 = new class21();
                  class577.field7923.field264 = arg2;
                  arg2.method1956(class577.field7923, -96, class182.field2246);
               }

               if (class577.field7923 != null) {
                  if (class577.field7923.field263[arg1] != null) {
                     throw new IllegalArgumentException();
                  }

                  class577.field7923.field263[arg1] = var5;
               }

               return var5;
            } catch (Throwable var9) {
               if (arg3 < 118) {
                  field2521 = null;
               }

               try {
                  class451 var6 = new class451(arg2, arg1);
                  var6.field57 = arg0;
                  var6.field47 = new int[(class614.field8578 ? 2 : 1) * 256];
                  var6.method51(arg4);
                  var6.field64 = 16384;
                  var6.method52(var6.field64);
                  if (class182.field2246 > 0 && class577.field7923 == null) {
                     class577.field7923 = new class21();
                     class577.field7923.field264 = arg2;
                     arg2.method1956(class577.field7923, -109, class182.field2246);
                  }

                  if (class577.field7923 != null) {
                     if (class577.field7923.field263[arg1] != null) {
                        throw new IllegalArgumentException();
                     }

                     class577.field7923.field263[arg1] = var6;
                  }

                  return var6;
               } catch (Throwable var8) {
                  return new class7();
               }
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field2522[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2522[2] : field2522[4]) + ',' + arg3 + ',' + (arg4 != null ? field2522[2] : field2522[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "([BB)V"
   )
   public abstract void method1550(byte[] arg0, byte arg1);

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1551(int arg0, int arg1, int arg2) {
      try {
         ++field2517;
         if (arg2 != 4096) {
            field2519 = null;
         }

         return class276.method2103(arg1, arg0, (byte)108) & class76.method745(arg1, 3179, arg0);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2522[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1552(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1553(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
