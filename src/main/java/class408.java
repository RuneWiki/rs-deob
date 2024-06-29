import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public abstract class class408 extends class126 {
   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6230 = new String[]{method3121(method3120("_5p$%\u001c")), method3121(method3120("Z$}f")), method3121(method3120("O\u007f?$\u0010")), method3121(method3120("_5p$$\u001c"))};
   @OriginalMember(
      owner = "client!kda",
      name = "j",
      descriptor = "I"
   )
   public static int field6224 = 0;
   @OriginalMember(
      owner = "client!kda",
      name = "i",
      descriptor = "Lsda;"
   )
   public static class269 field6226 = new class269(68, -1);
   @OriginalMember(
      owner = "client!kda",
      name = "k",
      descriptor = "Lpia;"
   )
   public static class102 field6227 = new class102("", 12);
   @OriginalMember(
      owner = "client!kda",
      name = "d",
      descriptor = "Lcj;"
   )
   public static class721 field6229 = new class721(4, 1, 1, 1);
   @OriginalMember(
      owner = "client!kda",
      name = "g",
      descriptor = "I"
   )
   public static int field6222;
   @OriginalMember(
      owner = "client!kda",
      name = "f",
      descriptor = "I"
   )
   public static int field6223;
   @OriginalMember(
      owner = "client!kda",
      name = "e",
      descriptor = "I"
   )
   public static int field6225;
   @OriginalMember(
      owner = "client!kda",
      name = "h",
      descriptor = "I"
   )
   public static int field6228;

   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "(I)V",
      line = 5
   )
   public static void method3118(int arg0) {
      try {
         field6229 = null;
         if (arg0 >= -53) {
            field6228 = 18;
         }

         field6226 = null;
         field6227 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6230[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(Lln;I)V",
      line = 20
   )
   public static final void method3119(class397 arg0, int arg1) {
      try {
         boolean var2;
         label69: {
            ++field6225;
            var2 = false;
            if (~class314.field4488 == ~arg0.field6028 || ~arg0.field6072 == 0 || ~arg0.field6092 != -1) {
               var2 = true;
               if (client.field4530 == 0) {
                  break label69;
               }
            }

            class676 var3 = class576.field8554.method3189(arg0.field6072, (byte)-64);
            if (var3.field10149 || arg0.field6053 - -1 > var3.field10151[arg0.field6043]) {
               var2 = true;
            }
         }

         if (var2) {
            int var4 = -arg0.field6086 + arg0.field6028;
            int var5 = -arg0.field6086 + class314.field4488;
            int var6 = arg0.field6089 * 512 - -(256 * arg0.method3046(-67));
            int var7 = arg0.field6039 * 512 - -(256 * arg0.method3046(107));
            int var8 = arg0.field6062 * 512 + 256 * arg0.method3046(116);
            int var9 = arg0.field6047 * 512 + 256 * arg0.method3046(119);
            arg0.field9003 = ((-var5 + var4) * var6 - -(var5 * var8)) / var4;
            arg0.field9007 = ((var4 - var5) * var7 + var5 * var9) / var4;
         }

         arg0.field6123 = 0;
         if (~arg0.field6031 == -1) {
            arg0.method3048(10, 8192, false);
         }

         if (arg1 >= -108) {
            method3119((class397)null, 55);
         }

         if (~arg0.field6031 == -2) {
            arg0.method3048(10, 12288, false);
         }

         if (arg0.field6031 == 2) {
            arg0.method3048(10, 0, false);
         }

         if (~arg0.field6031 == -4) {
            arg0.method3048(10, 4096, false);
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field6230[0] + (arg0 != null ? field6230[2] : field6230[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(I)Lcea;"
   )
   public abstract class223 method1023(int arg0);

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3120(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3121(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
