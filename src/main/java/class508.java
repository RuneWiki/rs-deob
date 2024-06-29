import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class508 {
   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "Z"
   )
   public boolean field7073;
   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7074 = new String[]{method3836(method3835("_=MASD%\u0017C\u0012")), method3836(method3835("_=M?\u0012")), method3836(method3835("_=M>\u0012")), method3836(method3835("_=M<\u0012"))};
   @OriginalMember(
      owner = "client!uq",
      name = "i",
      descriptor = "I"
   )
   public static int field7065;
   @OriginalMember(
      owner = "client!uq",
      name = "c",
      descriptor = "I"
   )
   public static int field7067;
   @OriginalMember(
      owner = "client!uq",
      name = "f",
      descriptor = "I"
   )
   public static int field7070;
   @OriginalMember(
      owner = "client!uq",
      name = "g",
      descriptor = "I"
   )
   public static int field7071;
   @OriginalMember(
      owner = "client!uq",
      name = "b",
      descriptor = "Lfi;"
   )
   public class265 field7066;
   @OriginalMember(
      owner = "client!uq",
      name = "d",
      descriptor = "Lfi;"
   )
   public class265 field7068;
   @OriginalMember(
      owner = "client!uq",
      name = "e",
      descriptor = "Z"
   )
   public boolean field7072;
   @OriginalMember(
      owner = "client!uq",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field7069;

   @OriginalMember(
      owner = "client!uq",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3832(int arg0) {
      try {
         if (this.field7066 != null) {
            this.field7066.method105(-126);
         }

         if (arg0 < 90) {
            this.method3834(5);
         }

         ++field7065;
         this.field7072 = false;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7074[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3833(boolean arg0) {
      try {
         if (!arg0) {
            field7069 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7074[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class508(boolean arg0) {
      try {
         this.field7073 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7074[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method3834(int arg0) {
      try {
         if (arg0 != 27152) {
            return false;
         } else {
            ++field7071;
            return this.field7072 && !this.field7073;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7074[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3835(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3836(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
