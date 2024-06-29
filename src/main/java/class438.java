import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class438 {
   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "Z"
   )
   private boolean field6682;
   @OriginalMember(
      owner = "client!nv",
      name = "e",
      descriptor = "I"
   )
   private int field6685;
   @OriginalMember(
      owner = "client!nv",
      name = "h",
      descriptor = "I"
   )
   private int field6678;
   @OriginalMember(
      owner = "client!nv",
      name = "d",
      descriptor = "Z"
   )
   private boolean field6681;
   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6687 = new String[]{method3320(method3319("jh\u000f\u0011\n")), method3320(method3319("jh\u000f\u0015\n")), method3320(method3319("jh\u000f\u0014\n")), method3320(method3319("jh\u000f\u0013\n")), method3320(method3319("jh\u000flKjwUn\n")), method3320(method3319("jh\u000f\u0012\n"))};
   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field6680 = new String[]{method3320(method3319("WkO")), method3320(method3319("IqO")), method3320(method3319("PkD")), method3320(method3319("S{E")), method3320(method3319("PvT")), method3320(method3319("BlH")), method3320(method3319("W\u007fU"))};
   @OriginalMember(
      owner = "client!nv",
      name = "c",
      descriptor = "I"
   )
   public static int field6679;
   @OriginalMember(
      owner = "client!nv",
      name = "g",
      descriptor = "I"
   )
   public static int field6683;
   @OriginalMember(
      owner = "client!nv",
      name = "i",
      descriptor = "I"
   )
   public static int field6684;
   @OriginalMember(
      owner = "client!nv",
      name = "f",
      descriptor = "I"
   )
   public static int field6686;

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(Z)Z",
      line = 3
   )
   public final boolean method3314(boolean arg0) {
      try {
         if (!arg0) {
            this.field6678 = -48;
         }

         ++field6684;
         return this.field6681;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6687[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "b",
      descriptor = "(B)Z",
      line = 18
   )
   public final boolean method3315(byte arg0) {
      try {
         int var2 = -82 % ((arg0 - -4) / 49);
         ++field6679;
         return this.field6682;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6687[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "c",
      descriptor = "(B)V",
      line = 29
   )
   public static void method3316(byte arg0) {
      try {
         field6680 = null;
         if (arg0 > -43) {
            method3316((byte)-27);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6687[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(I)I",
      line = 42
   )
   public final int method3317(int arg0) {
      try {
         ++field6683;
         return arg0 != 19285 ? -51 : this.field6678;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6687[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(B)I",
      line = 53
   )
   public final int method3318(byte arg0) {
      try {
         if (arg0 < 60) {
            this.field6678 = -103;
         }

         ++field6686;
         return this.field6685;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6687[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "<init>",
      descriptor = "(ZIIZ)V",
      line = 65
   )
   public class438(boolean arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field6682 = arg0;
         this.field6685 = arg2;
         this.field6678 = arg1;
         this.field6681 = arg3;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6687[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3319(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3320(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
