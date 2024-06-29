import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class490 {
   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6753 = new String[]{method3564(method3563("\"R,;)")), method3564(method3563("\"R,=)")), method3564(method3563("/\r,Q|")), method3564(method3563(":Vn\u0013")), method3564(method3563("\"R,<)")), method3564(method3563("\"R,>)"))};
   @OriginalMember(
      owner = "client!vq",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field6750 = new class378(24, 6);
   @OriginalMember(
      owner = "client!vq",
      name = "b",
      descriptor = "[Loda;"
   )
   public static class127[] field6751 = new class127[8];
   @OriginalMember(
      owner = "client!vq",
      name = "d",
      descriptor = "I"
   )
   public static int field6748;
   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "I"
   )
   public static int field6749;
   @OriginalMember(
      owner = "client!vq",
      name = "c",
      descriptor = "I"
   )
   public static int field6752;

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3559(boolean arg0) {
      try {
         if (arg0) {
            method3562(52, -116, -89);
         }

         field6751 = null;
         field6750 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6753[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(IILjava/io/File;)[B"
   )
   public static final byte[] method3560(int arg0, int arg1, File arg2) {
      try {
         ++field6748;

         try {
            byte[] var3 = new byte[arg0];
            class740.method5360(arg2, var3, (byte)-127, arg0);
            if (arg1 >= -111) {
               method3560(115, 18, (File)null);
            }

            return var3;
         } catch (IOException var5) {
            return null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6753[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6753[2] : field6753[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(ZIII)V"
   )
   public static final void method3561(boolean arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         label46: {
            ++field6752;
            if (arg2 != 1012) {
               if (arg2 == 1010) {
                  class16.method126(class544.field7428, arg3, arg1);
                  if (!var4) {
                     break label46;
                  }
               }

               if (~arg2 == -1005) {
                  class16.method126(class548.field7489, arg3, arg1);
                  if (!var4) {
                     break label46;
                  }
               }

               if (arg2 == 1009) {
                  class16.method126(class168.field2117, arg3, arg1);
                  if (!var4) {
                     break label46;
                  }
               }

               if (~arg2 != -1002) {
                  break label46;
               }

               class16.method126(class248.field3111, arg3, arg1);
               if (!var4) {
                  break label46;
               }
            }

            class16.method126(class299.field3953, arg3, arg1);
         }

         if (arg0) {
            field6750 = null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6753[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3562(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -26186) {
            method3559(false);
         }

         ++field6749;
         class446 var3 = class635.method4607(arg0 + 26300, (long)arg1, 16);
         var3.method3311(true);
         var3.field6167 = arg2;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6753[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3563(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3564(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
