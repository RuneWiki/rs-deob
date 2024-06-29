import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class211 {
   @OriginalMember(
      owner = "client!pk",
      name = "c",
      descriptor = "Lwi;"
   )
   private class494 field3020;
   @OriginalMember(
      owner = "client!pk",
      name = "b",
      descriptor = "I"
   )
   public int field3016;
   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3021 = new String[]{method1674(method1673("7\u0000}\u0005\u0015")), method1674(method1673("7\u0000}\"T)\n?-G\"C")), method1674(method1673("<E}j@")), method1674(method1673("7\u0000}xT)\u0002'z\u0015")), method1674(method1673(")\u001e?(")), method1674(method1673("7\u0000}\u0006\u0015"))};
   @OriginalMember(
      owner = "client!pk",
      name = "e",
      descriptor = "I"
   )
   public static int field3017 = -1;
   @OriginalMember(
      owner = "client!pk",
      name = "d",
      descriptor = "I"
   )
   public static int field3018;
   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "I"
   )
   public static int field3019;
   @OriginalMember(
      owner = "client!pk",
      name = "f",
      descriptor = "[Lbg;"
   )
   public static class492[] field3015;

   @OriginalMember(
      owner = "client!pk",
      name = "finalize",
      descriptor = "()V",
      line = 7
   )
   protected final void finalize() throws Throwable {
      try {
         this.field3020.method3590((byte)-62, this.field3016);
         ++field3018;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3021[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(B)V",
      line = 17
   )
   public static final void method1671(byte arg0) {
      try {
         class389.method2954(false, (byte)-122);
         ++field3019;
         if (~class165.field2337 <= -1 && class165.field2337 != 0) {
            class42.method358(class165.field2337, -3, false);
            class165.field2337 = -1;
         }

         if (arg0 > -51) {
            field3017 = 88;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3021[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "<init>",
      descriptor = "(Lwi;II)V",
      line = 43
   )
   public class211(class494 arg0, int arg1, int arg2) {
      try {
         this.field3020 = arg0;
         this.field3016 = arg2;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field3021[3] + (arg0 != null ? field3021[2] : field3021[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "a",
      descriptor = "(I)V",
      line = 54
   )
   public static void method1672(int arg0) {
      try {
         int var1 = -108 / ((arg0 - -57) / 49);
         field3015 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3021[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1673(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1674(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
