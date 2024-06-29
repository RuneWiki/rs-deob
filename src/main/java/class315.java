import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public abstract class class315 {
   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "I"
   )
   public int field4715;
   @OriginalMember(
      owner = "client!jha",
      name = "d",
      descriptor = "I"
   )
   public int field4717;
   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "I"
   )
   public int field4718;
   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4721 = new String[]{method2565(method2564("6\u0012\fBZ5\u0014\u0004\u0018Xt")), method2565(method2564("6\u0012\fB,t")), method2565(method2564("6\u0012\fB/t")), method2565(method2564("6\u0012\fB.t"))};
   @OriginalMember(
      owner = "client!jha",
      name = "c",
      descriptor = "I"
   )
   public static int field4714;
   @OriginalMember(
      owner = "client!jha",
      name = "f",
      descriptor = "I"
   )
   public static int field4720;
   @OriginalMember(
      owner = "client!jha",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field4716;
   @OriginalMember(
      owner = "client!jha",
      name = "e",
      descriptor = "[[Ljga;"
   )
   public static class91[][] field4719;

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2561(int arg0) {
      try {
         ++field4720;
         if (!class299.field4479) {
            class411.field6028 = true;
            class299.field4479 = true;
            if (arg0 >= 9) {
               class662.field9329 += (24.0F - class662.field9329) / 2.0F;
            }
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4721[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1887(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "(BII)I"
   )
   public static final int method2562(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 >= -30) {
            return 37;
         } else {
            ++field4714;
            int var3 = arg2 >> 31 & arg1 + -1;
            return ((arg2 >>> 31) + arg2) % arg1 - -var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4721[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public abstract void method1883(int arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(BII)V"
   )
   public abstract void method1886(byte arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2563(int arg0) {
      try {
         field4716 = null;
         if (arg0 != 2050112671) {
            field4716 = null;
         }

         field4719 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4721[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class315(int arg0, int arg1, int arg2) {
      try {
         this.field4715 = arg2;
         this.field4717 = arg1;
         this.field4718 = arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4721[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2564(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2565(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
