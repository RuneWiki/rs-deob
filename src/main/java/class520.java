import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class520 {
   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7125 = new String[]{method3768(method3767("\u00191!#F")), method3768(method3767("\fo!L\u0013")), method3768(method3767("\fjca")), method3768(method3767("\fo!O\u0013"))};
   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "I"
   )
   public static int field7123;
   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "I"
   )
   public static int field7124;
   @OriginalMember(
      owner = "client!np",
      name = "c",
      descriptor = "Lda;"
   )
   public static class66 field7122;

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3765(int arg0) {
      try {
         field7122 = null;
         if (arg0 != -7585) {
            method3766(-102, -23, (int[])null, (String[])null, -69);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7125[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(II[I[Ljava/lang/String;I)V"
   )
   public static final void method3766(int arg0, int arg1, int[] arg2, String[] arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         if (arg1 < arg0) {
            int var6 = (arg0 + arg1) / 2;
            int var7 = arg1;
            String var8 = arg3[var6];
            arg3[var6] = arg3[arg0];
            arg3[arg0] = var8;
            int var9 = arg2[var6];
            arg2[var6] = arg2[arg0];
            arg2[arg0] = var9;
            int var10 = arg1;
            String var11;
            int var12;
            if (var5) {
               if (var8 != null) {
                  if (arg3[arg1] != null) {
                     if (~(arg1 & 1) < ~arg3[arg1].compareTo(var8)) {
                        var11 = arg3[arg1];
                        arg3[arg1] = arg3[arg1];
                        arg3[arg1] = var11;
                        var12 = arg2[arg1];
                        arg2[arg1] = arg2[arg1];
                        var7 = arg1 + 1;
                        arg2[arg1] = var12;
                        var10 = arg1 + 1;
                     } else {
                        var10 = arg1 + 1;
                     }
                  } else {
                     var10 = arg1 + 1;
                  }
               } else {
                  var11 = arg3[arg1];
                  arg3[arg1] = arg3[arg1];
                  arg3[arg1] = var11;
                  var12 = arg2[arg1];
                  arg2[arg1] = arg2[arg1];
                  var7 = arg1 + 1;
                  arg2[arg1] = var12;
                  var10 = arg1 + 1;
               }
            }

            while(true) {
               while(arg0 > var10) {
                  if (var8 != null) {
                     if (arg3[var10] != null) {
                        if (~(var10 & 1) < ~arg3[var10].compareTo(var8)) {
                           var11 = arg3[var10];
                           arg3[var10] = arg3[var7];
                           arg3[var7] = var11;
                           var12 = arg2[var10];
                           arg2[var10] = arg2[var7];
                           arg2[var7++] = var12;
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        ++var10;
                     }
                  } else {
                     var11 = arg3[var10];
                     arg3[var10] = arg3[var7];
                     arg3[var7] = var11;
                     var12 = arg2[var10];
                     arg2[var10] = arg2[var7];
                     arg2[var7++] = var12;
                     ++var10;
                  }
               }

               arg3[arg0] = arg3[var7];
               arg3[var7] = var8;
               arg2[arg0] = arg2[var7];
               arg2[var7] = var9;
               method3766(var7 + -1, arg1, arg2, arg3, -1924);
               int var10001 = var7 + 1;
               if (!var5) {
                  method3766(arg0, var10001, arg2, arg3, -1924);
                  break;
               }

               if (arg0 < var10001) {
                  var11 = arg3[var10];
                  arg3[var10] = arg3[var7];
                  arg3[var7] = var11;
                  var12 = arg2[var10];
                  arg2[var10] = arg2[var7];
                  arg2[var7++] = var12;
                  ++var10;
               } else {
                  ++var10;
               }
            }
         }

         ++field7124;
         if (arg4 != -1924) {
            field7122 = null;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field7125[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7125[0] : field7125[2]) + ',' + (arg3 != null ? field7125[0] : field7125[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3767(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3768(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
