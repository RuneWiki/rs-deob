import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class661 {
   @OriginalMember(
      owner = "client!qt",
      name = "e",
      descriptor = "Lgw;"
   )
   private class179 field9615 = new class179(64);
   @OriginalMember(
      owner = "client!qt",
      name = "c",
      descriptor = "Lhw;"
   )
   private class141 field9614;
   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9619 = new String[]{method4842(method4841("\u0000\u0017(vF")), method4842(method4841("\nM(dR\u0015Prf\u0013")), method4842(method4841("\u0015Lj4")), method4842(method4841("\nM(\u0019\u0013"))};
   @OriginalMember(
      owner = "client!qt",
      name = "d",
      descriptor = "I"
   )
   public static int field9617 = 0;
   @OriginalMember(
      owner = "client!qt",
      name = "b",
      descriptor = "I"
   )
   public static int field9616;
   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "I"
   )
   public static int field9618;

   @OriginalMember(
      owner = "client!qt",
      name = "a",
      descriptor = "(II)Lbc;",
      line = 23
   )
   public final class382 method4840(int arg0, int arg1) {
      try {
         ++field9618;
         class179 var3 = this.field9615;
         class382 var4;
         synchronized(this.field9615) {
            var4 = (class382)this.field9615.method1584((long)arg0, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field9614;
            byte[] var6;
            synchronized(this.field9614) {
               var6 = this.field9614.method1347((byte)127, arg1, arg0);
            }

            class382 var7 = new class382();
            if (var6 != null) {
               var7.method2973(new class473(var6), (byte)117);
            }

            class179 var8 = this.field9615;
            synchronized(this.field9615) {
               this.field9615.method1581((long)arg0, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field9619[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V",
      line = 52
   )
   public class661(class320 arg0, int arg1, class141 arg2) {
      try {
         this.field9614 = arg2;
         this.field9614.method1346(5, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9619[1] + (arg0 != null ? field9619[0] : field9619[2]) + ',' + arg1 + ',' + (arg2 != null ? field9619[0] : field9619[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4841(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4842(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
