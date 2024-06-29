import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class424 extends class87 {
   @OriginalMember(
      owner = "client!hn",
      name = "h",
      descriptor = "[I"
   )
   public int[] field5776;
   @OriginalMember(
      owner = "client!hn",
      name = "i",
      descriptor = "[I"
   )
   public int[] field5778;
   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5780 = new String[]{method3295(method3294("|1c\u001f:z69\u001d{")), method3295(method3294("z*!O")), method3295(method3294("oqc\r.")), method3295(method3294("|1cb{")), method3295(method3294("|1ca{"))};
   @OriginalMember(
      owner = "client!hn",
      name = "j",
      descriptor = "I"
   )
   public static int field5779;
   @OriginalMember(
      owner = "client!hn",
      name = "g",
      descriptor = "Lwl;"
   )
   public static class149 field5777;

   @OriginalMember(
      owner = "client!hn",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3292(int arg0) {
      try {
         if (arg0 >= 36) {
            field5777 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5780[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "a",
      descriptor = "(ILgj;)[Lgn;"
   )
   public static final class593[] method3293(int arg0, class736 arg1) {
      boolean var2 = client.field1481;

      try {
         ++field5779;
         if (!arg1.method5343(-27358)) {
            return new class593[0];
         } else {
            class769 var3 = arg1.method5344((byte)-88);
            if (var2) {
               class340.method2717(10L, (byte)-119);
            }

            while(~var3.field11210 == -1) {
               class340.method2717(10L, (byte)-119);
            }

            if (var3.field11210 == 2) {
               return new class593[0];
            } else {
               int[] var4 = (int[])var3.field11212;
               class593[] var5 = new class593[var4.length >> 2];
               int var6 = 0;
               if (arg0 <= 8) {
                  return null;
               } else {
                  while(var6 < var5.length) {
                     class593 var7 = new class593();
                     var5[var6] = var7;
                     var7.field8741 = var4[var6 << 2];
                     var7.field8742 = var4[(var6 << 2) + 1];
                     var7.field8743 = var4[(var6 << 2) - -2];
                     var7.field8745 = var4[(var6 << 2) + 3];
                     ++var6;
                  }

                  return var5;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5780[4] + arg0 + ',' + (arg1 != null ? field5780[2] : field5780[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "<init>",
      descriptor = "(II[I[I)V"
   )
   public class424(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         this.field5776 = arg3;
         this.field5778 = arg2;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field5780[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5780[2] : field5780[1]) + ',' + (arg3 != null ? field5780[2] : field5780[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3294(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3295(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
