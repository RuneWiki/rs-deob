import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public abstract class class62 {
   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field799 = new String[]{method480(method479("X2&r\u001d\u001f")), method480(method479("X2&r\u0018\u001f")), method480(method479("X2&r\u001e\u001f"))};
   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "I"
   )
   public static int field797;
   @OriginalMember(
      owner = "client!oga",
      name = "c",
      descriptor = "I"
   )
   public static int field798;
   @OriginalMember(
      owner = "client!oga",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field796;

   @OriginalMember(
      owner = "client!oga",
      name = "b",
      descriptor = "(IIB)V",
      line = 7
   )
   public static final void method475(int arg0, int arg1, byte arg2) {
      try {
         ++field797;
         if (arg2 > -21) {
            field796 = null;
         }

         class566 var3 = class146.method1321((long)arg1, 16, -1428737160);
         var3.method4269((byte)-121);
         var3.field8394 = arg0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field799[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(IIB)I",
      line = 21
   )
   public static final int method476(int arg0, int arg1, byte arg2) {
      try {
         ++field798;
         if (arg2 != -123) {
            field796 = null;
         }

         int var3 = arg0 >>> 31;
         return (arg0 + var3) / arg1 + -var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field799[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(B)V",
      line = 35
   )
   public static void method477(byte arg0) {
      try {
         if (arg0 > 11) {
            field796 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field799[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(IFIIIFFFII[F)V"
   )
   public abstract void method478(int arg0, float arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7, int arg8, int arg9, float[] arg10);

   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method479(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 92);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method480(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 92;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
