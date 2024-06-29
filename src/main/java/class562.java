import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public abstract class class562 extends class76 {
   @OriginalMember(
      owner = "client!ts",
      name = "C",
      descriptor = "Liv;"
   )
   public class107 field8026;
   @OriginalMember(
      owner = "client!ts",
      name = "E",
      descriptor = "I"
   )
   public int field8024;
   @OriginalMember(
      owner = "client!ts",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8028 = new String[]{method4018(method4017("8[\u001b8d")), method4018(method4017("-\u0000Yz")), method4018(method4017("7\u0006\u001bW1")), method4018(method4017("7\u0006\u001b*p-\u001cA(1"))};
   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "F"
   )
   public static float field8025;
   @OriginalMember(
      owner = "client!ts",
      name = "B",
      descriptor = "I"
   )
   public static int field8023;
   @OriginalMember(
      owner = "client!ts",
      name = "F",
      descriptor = "I"
   )
   public static int field8027;

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(I)Z"
   )
   public abstract boolean method2448(int arg0);

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(IILcl;)V"
   )
   public static final void method4016(int arg0, int arg1, class279 arg2) {
      try {
         if (arg2.field3816 != null) {
            int var3 = arg2.field3816[arg0 + 1];
            if (~arg2.field3866 != ~var3) {
               arg2.field3821 = 1;
               arg2.field3804 = 0;
               arg2.field3866 = var3;
               arg2.field3874 = 0;
               arg2.field3827 = 0;
               arg2.field3886 = arg2.field3891;
               if (~arg2.field3866 != 0) {
                  class478.method3485(arg2.field3804, class190.field2702.method4411(arg2.field3866, 122), 734475305, arg2);
               }
            }
         }

         int var4 = 32 / ((58 - arg1) / 55);
         ++field8023;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8028[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8028[0] : field8028[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "c",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public abstract Object method2447(int arg0);

   @OriginalMember(
      owner = "client!ts",
      name = "<init>",
      descriptor = "(Liv;I)V"
   )
   public class562(class107 arg0, int arg1) {
      try {
         this.field8026 = arg0;
         this.field8024 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field8028[3] + (arg0 != null ? field8028[0] : field8028[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4017(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4018(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
