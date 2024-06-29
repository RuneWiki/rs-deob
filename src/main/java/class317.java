import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class317 {
   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4237 = new String[]{method2380(method2379("^'84t]{%5@\u0001")), method2380(method2379("^'\u000es")), method2380(method2379("R'buZ")), method2380(method2379("^'\rs")), method2380(method2379("G| 7"))};
   @OriginalMember(
      owner = "client!w",
      name = "c",
      descriptor = "Lbga;"
   )
   public static class378 field4235 = new class378(124, 0);
   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "I"
   )
   public static int field4234;
   @OriginalMember(
      owner = "client!w",
      name = "d",
      descriptor = "I"
   )
   public static int field4236;
   @OriginalMember(
      owner = "client!w",
      name = "b",
      descriptor = "Ltba;"
   )
   public static class172 field4233;

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(Liw;B)I"
   )
   public static final int method2377(class335 arg0, byte arg1) {
      try {
         ++field4234;
         if (arg1 > -14) {
            field4235 = null;
         }

         if (class335.field4794 == arg0) {
            return 5120;
         } else if (class335.field4801 == arg0) {
            return 5122;
         } else if (class335.field4802 != arg0) {
            if (class335.field4803 != arg0) {
               if (class335.field4804 != arg0) {
                  if (class335.field4805 == arg0) {
                     return 5125;
                  } else if (class335.field4806 == arg0) {
                     return 5131;
                  } else if (class335.field4807 == arg0) {
                     return 5126;
                  } else {
                     throw new IllegalArgumentException("");
                  }
               } else {
                  return 5123;
               }
            } else {
               return 5121;
            }
         } else {
            return 5124;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4237[3] + (arg0 != null ? field4237[2] : field4237[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2378(int arg0) {
      try {
         field4233 = null;
         field4235 = null;
         if (arg0 != 5123) {
            method2378(-48);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4237[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field4236;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4237[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2379(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!w",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2380(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
