import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class333 {
   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4950 = new String[]{method2669(method2668("iUyB")), method2669(method2668("lE;l7")), method2669(method2668("|\u000e;\u0000b")), method2669(method2668("lE;m7")), method2669(method2668("lE;o7"))};
   @OriginalMember(
      owner = "client!ke",
      name = "f",
      descriptor = "Lhha;"
   )
   public static class724 field4945 = new class724(19, -1);
   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "I"
   )
   public static int field4942;
   @OriginalMember(
      owner = "client!ke",
      name = "b",
      descriptor = "I"
   )
   public static int field4944;
   @OriginalMember(
      owner = "client!ke",
      name = "e",
      descriptor = "I"
   )
   public static int field4946;
   @OriginalMember(
      owner = "client!ke",
      name = "c",
      descriptor = "I"
   )
   public int field4947;
   @OriginalMember(
      owner = "client!ke",
      name = "d",
      descriptor = "I"
   )
   public static int field4948;
   @OriginalMember(
      owner = "client!ke",
      name = "h",
      descriptor = "I"
   )
   public int field4949;
   @OriginalMember(
      owner = "client!ke",
      name = "g",
      descriptor = "[Lfja;"
   )
   public class262[] field4943;

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(ILcu;)V"
   )
   public final void method2665(int param1, class65 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(Ldi;Lcu;I)Lfja;"
   )
   private final class262 method2666(class577 arg0, class65 arg1, int arg2) {
      try {
         ++field4944;
         if (class555.field7889 == arg0) {
            return class615.method4519(-19324, arg1);
         } else if (class556.field7899 == arg0) {
            return class65.method692(128, arg1);
         } else if (class25.field359 == arg0) {
            return class442.method3437(arg2 + 65, arg1);
         } else {
            if (arg2 != -1) {
               field4946 = -120;
            }

            if (class776.field11331 == arg0) {
               return class548.method4109(arg1, (byte)-112);
            } else if (class220.field3142 == arg0) {
               return class769.method5540((byte)-115, arg1);
            } else if (class197.field2850 == arg0) {
               return class487.method3705(arg1, (byte)-85);
            } else if (class33.field484 == arg0) {
               return class646.method4704(arg1, -123);
            } else if (class294.field4385 == arg0) {
               return class91.method919(arg1, -95);
            } else if (class196.field2831 == arg0) {
               return class417.method3260(arg1, -49);
            } else {
               return class543.field7660 == arg0 ? class710.method5161(false, arg1) : null;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4950[4] + (arg0 != null ? field4950[2] : field4950[0]) + ',' + (arg1 != null ? field4950[2] : field4950[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2667(int arg0) {
      try {
         field4945 = null;
         int var1 = 56 / ((-1 - arg0) / 62);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4950[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2668(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2669(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
