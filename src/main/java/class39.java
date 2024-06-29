import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class39 {
   @OriginalMember(
      owner = "client!ud",
      name = "c",
      descriptor = "[I"
   )
   public int[] field555;
   @OriginalMember(
      owner = "client!ud",
      name = "k",
      descriptor = "J"
   )
   public long field552;
   @OriginalMember(
      owner = "client!ud",
      name = "j",
      descriptor = "[S"
   )
   public short[] field550;
   @OriginalMember(
      owner = "client!ud",
      name = "h",
      descriptor = "[S"
   )
   public short[] field549;
   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field560 = new String[]{method347(method346("\rfF@9")), method347(method346("\rfFC9")), method347(method346("\u0003,F,l")), method347(method346("\u0016w\u0004n")), method347(method346("\rfF>x\u0016k\u001c<9"))};
   @OriginalMember(
      owner = "client!ud",
      name = "g",
      descriptor = "I"
   )
   public static int field553 = 0;
   @OriginalMember(
      owner = "client!ud",
      name = "f",
      descriptor = "I"
   )
   public static int field554 = class456.method3326(1600, (byte)103);
   @OriginalMember(
      owner = "client!ud",
      name = "d",
      descriptor = "Lwv;"
   )
   public static class37 field556 = new class37(64);
   @OriginalMember(
      owner = "client!ud",
      name = "i",
      descriptor = "I"
   )
   public static int field558 = 0;
   @OriginalMember(
      owner = "client!ud",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field557 = false;
   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "I"
   )
   public static int field551;
   @OriginalMember(
      owner = "client!ud",
      name = "b",
      descriptor = "I"
   )
   public static int field559;

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method344(int arg0) {
      try {
         field556 = null;
         if (arg0 != 0) {
            method344(-2);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field560[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method345(int arg0, String arg1) {
      try {
         class3.method11("", 0, "", arg1, arg0, "", (byte)-87);
         ++field551;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field560[1] + arg0 + ',' + (arg1 != null ? field560[2] : field560[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "<init>",
      descriptor = "(J[I[S[S)V"
   )
   public class39(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field555 = arg1;
         this.field552 = arg0;
         this.field550 = arg3;
         this.field549 = arg2;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field560[4] + arg0 + ',' + (arg1 != null ? field560[2] : field560[3]) + ',' + (arg2 != null ? field560[2] : field560[3]) + ',' + (arg3 != null ? field560[2] : field560[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ud",
      name = "<init>",
      descriptor = "()V"
   )
   protected class39() {
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method346(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ud",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method347(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
