import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class356 {
   @OriginalMember(
      owner = "client!on",
      name = "i",
      descriptor = "J"
   )
   public long field5071;
   @OriginalMember(
      owner = "client!on",
      name = "f",
      descriptor = "Lor;"
   )
   private class670 field5075;
   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5081 = new String[]{method2797(method2796("1\u0010S\u0012\u001c0\u0017\t\u0010]")), method2797(method2796("%PS\u0000\b")), method2797(method2796("0\u000b\u0011B")), method2797(method2796("1\u0010Sl]")), method2797(method2796("1\u0010SH\u001c0\u001f\u0011G\u000f;V")), method2797(method2796("1\u0010So]"))};
   @OriginalMember(
      owner = "client!on",
      name = "h",
      descriptor = "Lhha;"
   )
   public static class549 field5073 = new class549();
   @OriginalMember(
      owner = "client!on",
      name = "j",
      descriptor = "Lbga;"
   )
   public static class378 field5077 = new class378(70, 4);
   @OriginalMember(
      owner = "client!on",
      name = "e",
      descriptor = "I"
   )
   public static int field5078 = 0;
   @OriginalMember(
      owner = "client!on",
      name = "c",
      descriptor = "I"
   )
   public static int field5080 = 0;
   @OriginalMember(
      owner = "client!on",
      name = "d",
      descriptor = "F"
   )
   public static float field5072;
   @OriginalMember(
      owner = "client!on",
      name = "b",
      descriptor = "I"
   )
   public static int field5074;
   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "I"
   )
   public static int field5076;
   @OriginalMember(
      owner = "client!on",
      name = "g",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field5079;

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2794(int arg0) {
      try {
         field5073 = null;
         if (arg0 != -2242) {
            field5077 = null;
         }

         field5077 = null;
         field5079 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5081[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method2795(byte arg0, int arg1) {
      try {
         ++field5076;
         class49.field563 = arg1;
         class622.field8690.method4245(true);
         if (arg0 != 126) {
            field5078 = 11;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5081[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "<init>",
      descriptor = "(Lor;J[Lmba;)V"
   )
   public class356(class670 arg0, long arg1, class445[] arg2) {
      try {
         this.field5071 = arg1;
         this.field5075 = arg0;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5081[0] + (arg0 != null ? field5081[1] : field5081[2]) + ',' + arg1 + ',' + (arg2 != null ? field5081[1] : field5081[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field5074;
         this.field5075.method4889(87, this.field5071);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5081[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2796(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!on",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2797(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
