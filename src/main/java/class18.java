import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class18 {
   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field208 = new String[]{method108(method107("'\u001bYLm")), method108(method107("'\u001bYOm")), method108(method107("8\u0005\u001bb")), method108(method107("-^Y 8"))};
   @OriginalMember(
      owner = "client!qk",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field206 = new int[2];
   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "I"
   )
   public static int field204;
   @OriginalMember(
      owner = "client!qk",
      name = "b",
      descriptor = "I"
   )
   public static int field205;
   @OriginalMember(
      owner = "client!qk",
      name = "d",
      descriptor = "I"
   )
   public static int field207;

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(IILkt;IBIIIIIILada;)V",
      line = 4
   )
   public static final void method105(int arg0, int arg1, class169 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class175 arg11) {
      try {
         class595.field8750 = null;
         class94.field1224 = arg6;
         class163.field2318 = arg9;
         class470.field6755 = arg8;
         class653.field9566 = arg11;
         ++field205;
         class116.field1451 = arg7;
         class157.field2241 = arg1;
         class602.field8847 = arg0;
         class488.field6981 = arg3;
         class41.field572 = arg10;
         class592.field8713 = arg2;
         class655.field9584 = null;
         class25.field393 = null;
         class746.field10937 = arg5;
         if (arg4 < -78) {
            class240.method1840((byte)-28);
            class216.field3091 = true;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field208[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field208[3] : field208[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field208[3] : field208[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "a",
      descriptor = "(B)V",
      line = 41
   )
   public static void method106(byte arg0) {
      try {
         field206 = null;
         if (arg0 != 74) {
            method106((byte)-116);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field208[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method107(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method108(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
