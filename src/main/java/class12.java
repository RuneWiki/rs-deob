import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class12 {
   @OriginalMember(
      owner = "client!oo",
      name = "c",
      descriptor = "[I"
   )
   public int[] field238;
   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "J"
   )
   public long field243;
   @OriginalMember(
      owner = "client!oo",
      name = "g",
      descriptor = "[S"
   )
   public short[] field239;
   @OriginalMember(
      owner = "client!oo",
      name = "b",
      descriptor = "[S"
   )
   public short[] field241;
   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field245 = new String[]{method109(method108("(df\u0012[")), method109(method108("<%f~\u000e")), method109(method108("(dfl\u001a)b<n[")), method109(method108(")~$<"))};
   @OriginalMember(
      owner = "client!oo",
      name = "e",
      descriptor = "Lse;"
   )
   public static class6 field240 = new class6(88, 2);
   @OriginalMember(
      owner = "client!oo",
      name = "d",
      descriptor = "Lnia;"
   )
   public static class31 field244;
   @OriginalMember(
      owner = "client!oo",
      name = "f",
      descriptor = "Lwc;"
   )
   public static class394 field242;

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method106(boolean arg0) {
      try {
         field240 = null;
         field242 = null;
         field244 = null;
         if (arg0) {
            method107(-80, 21);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field245[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method107(int arg0, int arg1) {
      class114 var2 = null;

      for(int var3 = arg0; var3 < arg1; ++var3) {
         class423 var4 = class373.field5223[var3];
         if (var4 != null) {
            for(int var5 = 0; var5 < class181.field2297; ++var5) {
               for(int var6 = 0; var6 < class137.field1743; ++var6) {
                  var2 = var4.method945(var6, var5, var2);
                  if (var2 != null) {
                     int var7 = var6 << class783.field11447;
                     int var8 = var5 << class783.field11447;

                     for(int var9 = var3 - 1; var9 >= 0; --var9) {
                        class423 var10 = class373.field5223[var9];
                        if (var10 != null) {
                           int var11 = var4.method3284(-1, var6, var5) - var10.method3284(-1, var6, var5);
                           int var12 = var4.method3284(-1, var6 + 1, var5) - var10.method3284(-1, var6 + 1, var5);
                           int var13 = var4.method3284(-1, var6 + 1, var5 + 1) - var10.method3284(-1, var6 + 1, var5 + 1);
                           int var14 = var4.method3284(-1, var6, var5 + 1) - var10.method3284(-1, var6, var5 + 1);
                           var10.method952(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!oo",
      name = "<init>",
      descriptor = "(J[I[S[S)V"
   )
   public class12(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field238 = arg1;
         this.field243 = arg0;
         this.field239 = arg3;
         this.field241 = arg2;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field245[2] + arg0 + ',' + (arg1 != null ? field245[1] : field245[3]) + ',' + (arg2 != null ? field245[1] : field245[3]) + ',' + (arg3 != null ? field245[1] : field245[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "<init>",
      descriptor = "()V"
   )
   protected class12() {
   }

   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method108(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method109(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
