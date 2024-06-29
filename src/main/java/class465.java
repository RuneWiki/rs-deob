import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public abstract class class465 {
   @OriginalMember(
      owner = "client!vj",
      name = "c",
      descriptor = "Lsk;"
   )
   public class648 field6980;
   @OriginalMember(
      owner = "client!vj",
      name = "e",
      descriptor = "I"
   )
   public int field6984;
   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6985 = new String[]{method3477(method3476("\u000b\u0017\u001d@\u001b")), method3477(method3476("\u0013\b_`")), method3477(method3476("\u000b\u0017\u001d0Z\u0013\u0014G2\u001b")), method3477(method3476("\u0006S\u001d\"N")), method3477(method3476("\u000b\u0017\u001dG\u001b"))};
   @OriginalMember(
      owner = "client!vj",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field6982 = new int[2];
   @OriginalMember(
      owner = "client!vj",
      name = "d",
      descriptor = "I"
   )
   public static int field6981;
   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "I"
   )
   public static int field6983;

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(II)V",
      line = 18
   )
   public final void method3474(int arg0, int arg1) {
      try {
         ++field6981;
         if (arg0 != this.method70(arg1, (byte)127)) {
            this.method77(-14812, arg1);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6985[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "b",
      descriptor = "(Z)V",
      line = 31
   )
   public static void method3475(boolean arg0) {
      try {
         field6982 = null;
         if (!arg0) {
            field6983 = -40;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6985[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "<init>",
      descriptor = "(Lsk;)V",
      line = 40
   )
   public class465(class648 arg0) {
      try {
         this.field6980 = arg0;
         this.field6984 = this.method78(16726277);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6985[2] + (arg0 != null ? field6985[3] : field6985[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "<init>",
      descriptor = "(ILsk;)V",
      line = 48
   )
   public class465(int arg0, class648 arg1) {
      try {
         this.field6980 = arg1;
         this.field6984 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6985[2] + arg0 + ',' + (arg1 != null ? field6985[3] : field6985[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method78(int arg0);

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method69(boolean arg0);

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(IB)I"
   )
   public abstract int method70(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!vj",
      name = "b",
      descriptor = "(II)V"
   )
   public abstract void method77(int arg0, int arg1);

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3476(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3477(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
