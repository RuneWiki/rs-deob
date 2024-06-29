import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class107 {
   @OriginalMember(
      owner = "client!qfa",
      name = "d",
      descriptor = "Lkfa;"
   )
   private class632 field1368;
   @OriginalMember(
      owner = "client!qfa",
      name = "b",
      descriptor = "J"
   )
   public long field1371;
   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1374 = new String[]{method955(method954("i[c=WqSc\u007fXbX*")), method955(method954("i[c=\rqSkg\u000f0")), method955(method954("vHn\u007f")), method955(method954("c\u0013,=L")), method955(method954("i[c=p0"))};
   @OriginalMember(
      owner = "client!qfa",
      name = "f",
      descriptor = "I"
   )
   public static int field1367 = 0;
   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field1366 = false;
   @OriginalMember(
      owner = "client!qfa",
      name = "c",
      descriptor = "I"
   )
   public static int field1373 = 1337;
   @OriginalMember(
      owner = "client!qfa",
      name = "g",
      descriptor = "D"
   )
   public static double field1369;
   @OriginalMember(
      owner = "client!qfa",
      name = "e",
      descriptor = "I"
   )
   public static int field1370;
   @OriginalMember(
      owner = "client!qfa",
      name = "h",
      descriptor = "I"
   )
   public static int field1372;

   @OriginalMember(
      owner = "client!qfa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field1370;
         this.field1368.method4586(this.field1371, (byte)25);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1374[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "a",
      descriptor = "(Z)Lep;"
   )
   public static final class446 method953(boolean arg0) {
      boolean var1 = client.field4273;

      try {
         if (arg0) {
            return null;
         } else {
            ++field1372;
            class446 var2 = (class446)class250.field3137.method3964((byte)47);
            if (var2 != null) {
               var2.method3609(117);
               var2.method3943(-4);
               return var2;
            } else {
               label33:
               while(true) {
                  class446 var3 = (class446)class356.field5073.method3964((byte)80);
                  if (var3 == null) {
                     return null;
                  }

                  class446 var10000 = var3;

                  do {
                     if (var10000.method3310(0) > class792.method5708(-25005)) {
                        return null;
                     }

                     var3.method3609(108);
                     var3.method3943(-4);
                     if ((Long.MIN_VALUE & var3.field7452) == 0L) {
                        continue label33;
                     }

                     var10000 = var3;
                  } while(var1);

                  return var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1374[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "<init>",
      descriptor = "(Lkfa;JI)V"
   )
   public class107(class632 arg0, long arg1, int arg2) {
      try {
         this.field1368 = arg0;
         this.field1371 = arg1;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1374[1] + (arg0 != null ? field1374[3] : field1374[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method954(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method955(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
