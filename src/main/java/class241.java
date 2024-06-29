import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class241 {
   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3356 = new String[]{method1846(method1845("jx<P'#")), method1846(method1845("jx<P$#"))};
   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "I"
   )
   public static int field3352;
   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "I"
   )
   public static int field3353;
   @OriginalMember(
      owner = "client!aia",
      name = "c",
      descriptor = "I"
   )
   public static int field3354;
   @OriginalMember(
      owner = "client!aia",
      name = "d",
      descriptor = "I"
   )
   public static int field3355;

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(BIIIIIZ)V",
      line = 6
   )
   public static final void method1843(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      try {
         if ((arg6 ? class300.field4107.field6428.method4286(-90) : class300.field4107.field6439.method4286(-19)) != 0 && arg3 != 0 && ~class673.field9755 > -51 && arg5 != -1) {
            class534.field7614[class673.field9755++] = new class245((byte)(!arg6 ? 2 : 3), arg5, arg3, arg1, arg4, 0, arg2, (class731)null);
         }

         int var7 = 13 % ((25 - arg0) / 49);
         ++field3352;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3356[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(II)V",
      line = 23
   )
   public static final void method1844(int arg0, int arg1) {
      try {
         ++field3355;
         class493.field7038.method726(arg0, 25324);
         class409.field5909.method726(arg0, 25324);
         class198.field2811.method726(arg0, 25324);
         class155.field2212.method726(arg0, 25324);
         if (arg1 < 107) {
            field3354 = 1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3356[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1845(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1846(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
