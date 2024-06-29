import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class729 extends InputStream {
   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10838 = new String[]{method5315(method5314("\u000116V/")), method5315(method5314("\u000116T/")), method5315(method5314("\u001dq6;z")), method5315(method5314("\u000116Q/")), method5315(method5314("\b*ty")), method5315(method5314("\u000116W/")), method5315(method5314("\u000116gb\u0007;0"))};
   @OriginalMember(
      owner = "client!gn",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field10835 = new int[4];
   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field10837 = new class101(31, 4);
   @OriginalMember(
      owner = "client!gn",
      name = "b",
      descriptor = "I"
   )
   public static int field10831;
   @OriginalMember(
      owner = "client!gn",
      name = "e",
      descriptor = "I"
   )
   public static int field10832;
   @OriginalMember(
      owner = "client!gn",
      name = "c",
      descriptor = "I"
   )
   public static int field10833;
   @OriginalMember(
      owner = "client!gn",
      name = "d",
      descriptor = "I"
   )
   public static int field10834;
   @OriginalMember(
      owner = "client!gn",
      name = "f",
      descriptor = "I"
   )
   public static int field10836;

   @OriginalMember(
      owner = "client!gn",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5310(byte arg0) {
      try {
         ++field10831;
         class718.field10677 = null;
         if (arg0 != -44) {
            field10835 = null;
         }

         class638.field9297 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10838[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         class89.method817(30000L, 2535);
         ++field10836;
         return -1;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10838[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(B[B)[B"
   )
   public static final byte[] method5311(byte arg0, byte[] arg1) {
      try {
         if (arg0 != -4) {
            return null;
         } else {
            ++field10833;
            int var2 = arg1.length;
            byte[] var3 = new byte[var2];
            class195.method1492(arg1, 0, var3, 0, var2);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10838[5] + arg0 + ',' + (arg1 != null ? field10838[2] : field10838[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(BLdl;Ldl;)V"
   )
   public static final void method5312(byte arg0, class70 arg1, class70 arg2) {
      try {
         if (arg1.field878 != null) {
            arg1.method699(12);
         }

         ++field10832;
         arg1.field878 = arg2;
         arg1.field881 = arg2.field881;
         arg1.field878.field881 = arg1;
         arg1.field881.field878 = arg1;
         if (arg0 >= -55) {
            field10834 = 78;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10838[3] + arg0 + ',' + (arg1 != null ? field10838[2] : field10838[4]) + ',' + (arg2 != null ? field10838[2] : field10838[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5313(byte arg0) {
      try {
         field10837 = null;
         if (arg0 >= -14) {
            method5310((byte)-88);
         }

         field10835 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10838[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5314(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5315(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
