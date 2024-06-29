import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class596 {
   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8822 = new String[]{method4443(method4442("C\u0007N\u0017\u0001")), method4443(method4442("C\u0007N!Fr\u0006\u0012<GFZ")), method4443(method4442("C\u0007N\u0014\u0001"))};
   @OriginalMember(
      owner = "client!bu",
      name = "c",
      descriptor = "Lse;"
   )
   public static class6 field8818 = new class6(22, 7);
   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "I"
   )
   public static int field8819;
   @OriginalMember(
      owner = "client!bu",
      name = "d",
      descriptor = "I"
   )
   public static int field8820;
   @OriginalMember(
      owner = "client!bu",
      name = "b",
      descriptor = "Lkia;"
   )
   public static class93 field8821;

   @OriginalMember(
      owner = "client!bu",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field8819;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8822[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method4440(int arg0, int arg1, int arg2) {
      try {
         ++field8820;
         int var4 = arg0 >= class91.field1242 ? arg0 : class91.field1242;
         if (class738.field10809 == this) {
            return 0;
         } else if (class725.field10601 == this) {
            return -arg2 + var4;
         } else if (class700.field10253 == this) {
            return (-arg2 + var4) / 2;
         } else {
            int var5 = -44 % ((arg1 - -77) / 43);
            return 0;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field8822[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4441(int arg0) {
      try {
         field8818 = null;
         if (arg0 != 22) {
            method4441(67);
         }

         field8821 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8822[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4442(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4443(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
