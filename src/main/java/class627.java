import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class627 {
   @OriginalMember(
      owner = "client!av",
      name = "e",
      descriptor = "Z"
   )
   public boolean field9081;
   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9088 = new String[]{method4598(method4597("t\u0004jF>")), method4598(method4597("t\u0004jG>")), method4598(method4597("t\u0004jD>")), method4598(method4597("t\u0004j9\u007f{\u001b0;>"))};
   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "I"
   )
   public static int field9082;
   @OriginalMember(
      owner = "client!av",
      name = "c",
      descriptor = "I"
   )
   public static int field9084;
   @OriginalMember(
      owner = "client!av",
      name = "h",
      descriptor = "I"
   )
   public static int field9085;
   @OriginalMember(
      owner = "client!av",
      name = "f",
      descriptor = "I"
   )
   public static int field9087;
   @OriginalMember(
      owner = "client!av",
      name = "d",
      descriptor = "Lqq;"
   )
   public class800 field9083;
   @OriginalMember(
      owner = "client!av",
      name = "g",
      descriptor = "Lqq;"
   )
   public class800 field9086;
   @OriginalMember(
      owner = "client!av",
      name = "b",
      descriptor = "Z"
   )
   public boolean field9080;

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(B)Z",
      line = 7
   )
   public final boolean method4594(byte arg0) {
      try {
         ++field9085;
         if (arg0 != -63) {
            field9082 = -105;
         }

         return this.field9080 && !this.field9081;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9088[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(I)V",
      line = 18
   )
   public final void method4595(int arg0) {
      try {
         if (this.field9083 != null) {
            this.field9083.method1533(16966);
         }

         ++field9087;
         this.field9080 = false;
         int var2 = 55 % ((46 - arg0) / 58);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9088[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(III)Z",
      line = 35
   )
   public static final boolean method4596(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!av",
      name = "<init>",
      descriptor = "(Z)V",
      line = 105
   )
   public class627(boolean arg0) {
      try {
         this.field9081 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9088[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4597(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4598(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
