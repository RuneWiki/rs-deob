import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class49 {
   @OriginalMember(
      owner = "client!sca",
      name = "e",
      descriptor = "I"
   )
   public int field558;
   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field564 = new String[]{method413(method412("\u0002'~(\u0017\u001e\u0017kt\n\u001f#7")), method413(method412("\u0002'~(_\u0018*vr]Y")), method413(method412("\nj1(\u001e")), method413(method412("\u001f1sj")), method413(method412("\u0002'~(\"Y")), method413(method412("\u0002'~(!Y"))};
   @OriginalMember(
      owner = "client!sca",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field562 = new int[1];
   @OriginalMember(
      owner = "client!sca",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field561 = new int[1];
   @OriginalMember(
      owner = "client!sca",
      name = "b",
      descriptor = "I"
   )
   public static int field559;
   @OriginalMember(
      owner = "client!sca",
      name = "c",
      descriptor = "I"
   )
   public static int field560;
   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "I"
   )
   public static int field563;

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method410(boolean arg0) {
      try {
         if (arg0) {
            field563 = 43;
         }

         ++field560;
         return this.field558;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field564[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method411(byte arg0) {
      try {
         field562 = null;
         if (arg0 != 46) {
            method411((byte)-78);
         }

         field561 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field564[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field559;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field564[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class49(String arg0, int arg1) {
      try {
         this.field558 = arg1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field564[1] + (arg0 != null ? field564[2] : field564[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method412(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method413(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
