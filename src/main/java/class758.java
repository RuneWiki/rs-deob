import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public abstract class class758 extends class500 {
   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10980 = new String[]{method5454(method5453("\u0006\u001fpK")), method5454(method5453("\u0018\u000f}\tQ@")), method5454(method5453("\u0013D2\to"))};
   @OriginalMember(
      owner = "client!pea",
      name = "m",
      descriptor = "I"
   )
   public static int field10978 = 0;
   @OriginalMember(
      owner = "client!pea",
      name = "l",
      descriptor = "I"
   )
   public static int field10977 = 1;
   @OriginalMember(
      owner = "client!pea",
      name = "j",
      descriptor = "I"
   )
   public static int field10979 = 0;
   @OriginalMember(
      owner = "client!pea",
      name = "k",
      descriptor = "I"
   )
   public static int field10976;

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(IIILha;)V"
   )
   public static final void method5452(int arg0, int arg1, int arg2, class65 arg3) {
      try {
         class252.field3198 = arg3;
         class585.field8040 = new class507[arg1][arg0];
         int var4 = 41 % ((-4 - arg2) / 63);
         ++field10976;
         if (class472.field6556 != null) {
            class233.field2892 = class707.method5142(class472.field6556[2], class472.field6556[0], true, class472.field6556[4], class472.field6556[1], class472.field6556[3], class472.field6556[5]);
         }

         class462.field6335 = new class507();
         class716.method5211(255);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10980[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10980[2] : field10980[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(Lob;B)V"
   )
   public abstract void method1311(class772 arg0, byte arg1);

   @OriginalMember(
      owner = "client!pea",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public abstract void method1313(class594 arg0, byte arg1);

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5453(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5454(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
