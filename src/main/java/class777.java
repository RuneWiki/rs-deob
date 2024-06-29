import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class777 {
   @OriginalMember(
      owner = "client!vw",
      name = "h",
      descriptor = "Llj;"
   )
   private class304 field11411 = new class304(64);
   @OriginalMember(
      owner = "client!vw",
      name = "d",
      descriptor = "Lrr;"
   )
   private class678 field11404;
   @OriginalMember(
      owner = "client!vw",
      name = "i",
      descriptor = "I"
   )
   public int field11409;
   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11412 = new String[]{method5655(method5654("o}\u0019]\u0006wcC_G")), method5655(method5654("w\u007f[\r")), method5655(method5654("b$\u0019O\u0012")), method5655(method5654("o}\u0019#G")), method5655(method5654("o}\u0019 G")), method5655(method5654("o}\u0019\"G"))};
   @OriginalMember(
      owner = "client!vw",
      name = "e",
      descriptor = "Lsn;"
   )
   public static class675 field11405 = new class675();
   @OriginalMember(
      owner = "client!vw",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field11408 = false;
   @OriginalMember(
      owner = "client!vw",
      name = "g",
      descriptor = "I"
   )
   public static int field11403;
   @OriginalMember(
      owner = "client!vw",
      name = "f",
      descriptor = "I"
   )
   public static int field11407;
   @OriginalMember(
      owner = "client!vw",
      name = "c",
      descriptor = "I"
   )
   public static int field11410;
   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "[Lbaa;"
   )
   public static class109[] field11406;

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5651(int arg0) {
      try {
         field11405 = null;
         if (arg0 == -11371) {
            field11406 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11412[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "b",
      descriptor = "(BI)Lol;"
   )
   public final class509 method5652(byte arg0, int arg1) {
      try {
         if (arg0 >= -53) {
            field11406 = null;
         }

         ++field11403;
         class304 var3 = this.field11411;
         class509 var4;
         synchronized(this.field11411) {
            var4 = (class509)this.field11411.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field11404;
            byte[] var6;
            synchronized(this.field11404) {
               var6 = this.field11404.method5017(19, arg1, (byte)71);
            }

            class509 var7 = new class509();
            if (var6 != null) {
               var7.method3959((byte)-65, new class354(var6));
            }

            class304 var8 = this.field11411;
            synchronized(this.field11411) {
               this.field11411.method2545((long)arg1, 114, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field11412[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method5653(byte arg0, int arg1) {
      try {
         ++field11410;
         class566 var2 = class146.method1321((long)arg1, 10, -1428737160);
         if (arg0 != -86) {
            method5653((byte)-51, 85);
         }

         var2.method4268(4);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11412[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V"
   )
   public class777(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field11404 = arg2;
         this.field11409 = this.field11404.method4998((byte)-82, 19);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11412[0] + (arg0 != null ? field11412[2] : field11412[1]) + ',' + arg1 + ',' + (arg2 != null ? field11412[2] : field11412[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5654(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5655(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
