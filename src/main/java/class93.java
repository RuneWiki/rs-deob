import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class93 {
   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1243 = new String[]{method877(method876("O:{(P")), method877(method876("Bs4(l\u001c")), method877(method876("Za9j")), method877(method876("Bs4(n\u001c")), method877(method876("Bs4(o\u001c"))};
   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "I"
   )
   public static int field1236 = 0;
   @OriginalMember(
      owner = "client!vga",
      name = "b",
      descriptor = "I"
   )
   public static int field1240 = -1;
   @OriginalMember(
      owner = "client!vga",
      name = "d",
      descriptor = "Lnw;"
   )
   public static class616 field1239 = new class616(10, -1);
   @OriginalMember(
      owner = "client!vga",
      name = "e",
      descriptor = "I"
   )
   public static int field1242 = 0;
   @OriginalMember(
      owner = "client!vga",
      name = "f",
      descriptor = "I"
   )
   public static int field1237;
   @OriginalMember(
      owner = "client!vga",
      name = "c",
      descriptor = "I"
   )
   public static int field1238;
   @OriginalMember(
      owner = "client!vga",
      name = "g",
      descriptor = "[Ls;"
   )
   public static class295[] field1241;

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method873(int arg0) {
      try {
         field1241 = null;
         if (arg0 < 67) {
            field1241 = null;
         }

         field1239 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1243[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(I[IIB[ILor;)Lqha;"
   )
   public static final class111 method874(int arg0, int[] arg1, int arg2, byte arg3, int[] arg4, class670 arg5) {
      boolean var6 = client.field4273;

      try {
         ++field1238;
         byte[] var7 = new byte[arg0 * arg2];
         int var8 = 0;
         if (arg3 != -102) {
            return null;
         } else {
            while(var8 < arg2) {
               int var9 = arg0 * var8 + arg4[var8];
               int var10 = 0;
               if (var6) {
                  var7[var9++] = -1;
                  ++var10;
               }

               while(true) {
                  while(~arg1[var8] < ~var10) {
                     var7[var9++] = -1;
                     ++var10;
                  }

                  if (!var6) {
                     ++var8;
                     break;
                  }

                  ++var10;
               }
            }

            return new class111(arg5, arg0, arg2, var7);
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field1243[1] + arg0 + ',' + (arg1 != null ? field1243[0] : field1243[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1243[0] : field1243[2]) + ',' + (arg5 != null ? field1243[0] : field1243[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method875(int arg0, String arg1) {
      try {
         class203.field2495 = arg1;
         if (arg0 != -1) {
            method874(-11, (int[])null, 119, (byte)90, (int[])null, (class670)null);
         }

         ++field1237;
         class7.field66 = class203.field2495.length();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1243[3] + arg0 + ',' + (arg1 != null ? field1243[0] : field1243[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method876(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method877(char[] arg0) {
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
            var10005 = 20;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
