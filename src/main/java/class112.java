import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class112 {
   @OriginalMember(
      owner = "client!jt",
      name = "b",
      descriptor = "J"
   )
   public long field1358;
   @OriginalMember(
      owner = "client!jt",
      name = "f",
      descriptor = "Leh;"
   )
   private class379 field1359;
   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1364 = new String[]{method954(method953("\th}\"l\r}?-\u007f\u00064")), method954(method953("\ri?(")), method954(method953("\u00182}jx")), method954(method953("\th}xl\ru'z-")), method954(method953("\th}\u0005-")), method954(method953("\th}\u0006-"))};
   @OriginalMember(
      owner = "client!jt",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field1362 = true;
   @OriginalMember(
      owner = "client!jt",
      name = "d",
      descriptor = "I"
   )
   public static int field1357;
   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "I"
   )
   public static int field1360;
   @OriginalMember(
      owner = "client!jt",
      name = "c",
      descriptor = "I"
   )
   public static int field1361;
   @OriginalMember(
      owner = "client!jt",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field1363;

   @OriginalMember(
      owner = "client!jt",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field1359.method2932(-124, this.field1358);
         ++field1361;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1364[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method951(boolean arg0) {
      try {
         if (arg0) {
            method952(-91, (byte)-3);
         }

         field1363 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1364[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "<init>",
      descriptor = "(Leh;J[Lwl;)V"
   )
   public class112(class379 arg0, long arg1, class429[] arg2) {
      try {
         this.field1358 = arg1;
         this.field1359 = arg0;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1364[3] + (arg0 != null ? field1364[2] : field1364[1]) + ',' + arg1 + ',' + (arg2 != null ? field1364[2] : field1364[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method952(int arg0, byte arg1) {
      try {
         if (arg1 != 91) {
            field1362 = true;
         }

         ++field1360;
         class403 var2 = class453.method3410((long)arg0, true, 1);
         var2.method3096((byte)-40);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1364[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method953(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method954(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
