import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class283 {
   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "Lrca;"
   )
   private class37 field3929;
   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3932 = new String[]{method2315(method2314("\u0018#Fd\u0006")), method2315(method2314("\u0002{Fv\u0012\rd\u001ctS")), method2315(method2314("\rx\u0004&")), method2315(method2314("\u0002{F\tS")), method2315(method2314("\u0002{F\bS")), method2315(method2314("\u0002{F\u000bS"))};
   @OriginalMember(
      owner = "client!av",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field3931 = false;
   @OriginalMember(
      owner = "client!av",
      name = "d",
      descriptor = "I"
   )
   public static int field3926;
   @OriginalMember(
      owner = "client!av",
      name = "e",
      descriptor = "I"
   )
   public static int field3927;
   @OriginalMember(
      owner = "client!av",
      name = "g",
      descriptor = "I"
   )
   public static int field3928;
   @OriginalMember(
      owner = "client!av",
      name = "c",
      descriptor = "I"
   )
   public static int field3930;
   @OriginalMember(
      owner = "client!av",
      name = "b",
      descriptor = "Lcm;"
   )
   private class673 field3925;

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(B)Lcm;"
   )
   public final class673 method2311(byte arg0) {
      try {
         ++field3930;
         class673 var2 = this.field3925;
         if (arg0 < 121) {
            this.field3929 = null;
         }

         if (this.field3929.field527 == var2) {
            this.field3925 = null;
            return null;
         } else {
            this.field3925 = var2.field9972;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3932[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(ILrca;)V"
   )
   public final void method2312(int arg0, class37 arg1) {
      try {
         if (arg0 != 19854) {
            this.field3925 = null;
         }

         this.field3929 = arg1;
         ++field3926;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3932[4] + arg0 + ',' + (arg1 != null ? field3932[0] : field3932[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(I)Lcm;"
   )
   public final class673 method2313(int arg0) {
      try {
         ++field3928;
         class673 var2 = this.field3929.field527.field9972;
         if (arg0 <= 47) {
            this.field3929 = null;
         }

         if (this.field3929.field527 == var2) {
            this.field3925 = null;
            return null;
         } else {
            this.field3925 = var2.field9972;
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3932[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "<init>",
      descriptor = "()V"
   )
   public class283() {
   }

   @OriginalMember(
      owner = "client!av",
      name = "<init>",
      descriptor = "(Lrca;)V"
   )
   public class283(class37 arg0) {
      try {
         this.field3929 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3932[1] + (arg0 != null ? field3932[0] : field3932[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2314(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2315(char[] arg0) {
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
            var10005 = 13;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
