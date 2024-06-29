import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class300 {
   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3965 = new String[]{method2263(method2262("/ <;$")), method2263(method2262("/ <>$")), method2263(method2262("/ <\u000bc\u00138`\u0016b'd")), method2263(method2262(".9~\u0013")), method2263(method2262("/ <:$")), method2263(method2262(";b<Qq")), method2263(method2262("/ <<$")), method2263(method2262("/ <=$"))};
   @OriginalMember(
      owner = "client!ol",
      name = "b",
      descriptor = "I"
   )
   public static int field3959;
   @OriginalMember(
      owner = "client!ol",
      name = "e",
      descriptor = "I"
   )
   public static int field3961;
   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "I"
   )
   public static int field3962;
   @OriginalMember(
      owner = "client!ol",
      name = "f",
      descriptor = "I"
   )
   public static int field3963;
   @OriginalMember(
      owner = "client!ol",
      name = "c",
      descriptor = "I"
   )
   public static int field3964;
   @OriginalMember(
      owner = "client!ol",
      name = "d",
      descriptor = "Lsca;"
   )
   public static class49 field3960;

   @OriginalMember(
      owner = "client!ol",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2257(int arg0) {
      try {
         if (arg0 > -37) {
            method2260(-88);
         }

         field3960 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3965[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2258(int arg0, int arg1, int arg2) {
      try {
         if (arg2 > -2) {
            field3960 = null;
         }

         ++field3959;
         return ~(arg1 & 384) != -1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3965[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field3961;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3965[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(I[Lbo;)V"
   )
   public static final void method2259(int param0, class763[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ol",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method2260(int arg0) {
      try {
         ++field3964;
         if (class671.field9873 == null) {
            return 0;
         } else {
            if (arg0 != 2) {
               method2258(105, -22, 53);
            }

            return class671.field9873.length * 2;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3965[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method2261(int arg0) {
      try {
         class237.field2934 = true;
         if (arg0 == 15966) {
            ++field3962;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3965[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2262(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ol",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2263(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
