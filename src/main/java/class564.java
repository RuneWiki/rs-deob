import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class564 {
   @OriginalMember(
      owner = "client!oj",
      name = "d",
      descriptor = "Lda;"
   )
   public class288 field8378 = null;
   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "Lqda;"
   )
   public class697 field8382 = null;
   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8384 = new String[]{method4259(method4258("1jSx")), method4259(method4258("0u\u0011(\u001f1vK*^")), method4259(method4258("$1\u0011:\u000b")), method4259(method4258("0u\u0011U^")), method4259(method4258("0u\u0011P^")), method4259(method4258("0u\u0011W^")), method4259(method4258("0u\u0011V^"))};
   @OriginalMember(
      owner = "client!oj",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field8379 = new int[2];
   @OriginalMember(
      owner = "client!oj",
      name = "e",
      descriptor = "I"
   )
   public static int field8377;
   @OriginalMember(
      owner = "client!oj",
      name = "g",
      descriptor = "I"
   )
   public static int field8380;
   @OriginalMember(
      owner = "client!oj",
      name = "c",
      descriptor = "I"
   )
   public static int field8383;
   @OriginalMember(
      owner = "client!oj",
      name = "f",
      descriptor = "Lqda;"
   )
   public static class697 field8381;

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(ILru;IIILha;)V",
      line = 4
   )
   public static final void method4254(int arg0, class333 arg1, int arg2, int arg3, int arg4, class610 arg5) {
      try {
         ++field8383;
         class287 var6 = class230.field3520.method4009(arg1.field5107, 118);
         if (var6.field4506 != -1) {
            if (arg2 < -17) {
               if (arg1.field5048) {
                  int var14 = arg1.field5089 + arg4;
                  arg4 = var14 & 3;
               } else {
                  arg4 = 0;
               }

               class672 var7 = var6.method2396(3, arg5, arg4, arg1.field5108);
               if (var7 != null) {
                  int var8 = arg1.field5097;
                  int var9 = arg1.field5104;
                  if ((arg4 & 1) == 1) {
                     var8 = arg1.field5104;
                     var9 = arg1.field5097;
                  }

                  int var10 = var7.method2106();
                  int var11 = var7.method2108();
                  if (var6.field4513) {
                     var11 = var9 * 4;
                     var10 = var8 * 4;
                  }

                  if (var6.field4511 == 0) {
                     var7.method4954(arg3, -((var9 + -1) * 4) + arg0, var10, var11);
                  } else {
                     var7.method4953(arg3, arg0 - var9 * 4 + 4, var10, var11, 0, -16777216 | var6.field4511, 1);
                  }
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field8384[6] + arg0 + ',' + (arg1 != null ? field8384[2] : field8384[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8384[2] : field8384[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "<init>",
      descriptor = "(Lda;)V",
      line = 115
   )
   public class564(class288 arg0) {
      try {
         this.field8378 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8384[1] + (arg0 != null ? field8384[2] : field8384[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "<init>",
      descriptor = "(Lda;Lqda;)V",
      line = 122
   )
   public class564(class288 arg0, class697 arg1) {
      try {
         this.field8382 = arg1;
         this.field8378 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8384[1] + (arg0 != null ? field8384[2] : field8384[0]) + ',' + (arg1 != null ? field8384[2] : field8384[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(IILha;I)V",
      line = 68
   )
   public static final void method4255(int arg0, int arg1, class610 arg2, int arg3) {
      try {
         class476.field7237 = new class365[arg0][arg3];
         class659.field9850 = arg2;
         if (arg1 != -16777216) {
            method4256(50, -12, 82);
         }

         ++field8380;
         if (class202.field3086 != null) {
            class185.field2897 = class281.method2350(class202.field3086[0], 0, class202.field3086[1], class202.field3086[5], class202.field3086[4], class202.field3086[2], class202.field3086[3]);
         }

         class735.field10951 = null;
         class314.field4858 = new class365();
         class287.method2394(-45);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8384[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8384[2] : field8384[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(III)Z",
      line = 86
   )
   public static final boolean method4256(int arg0, int arg1, int arg2) {
      try {
         ++field8377;
         if (arg1 != -19410) {
            field8381 = null;
         }

         return (1048832 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8384[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "a",
      descriptor = "(Z)V",
      line = 104
   )
   public static void method4257(boolean arg0) {
      try {
         field8381 = null;
         field8379 = null;
         if (!arg0) {
            field8381 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8384[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4258(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4259(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
