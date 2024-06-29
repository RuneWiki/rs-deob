import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 {
   @OriginalMember(
      owner = "client!ft",
      name = "c",
      descriptor = "I"
   )
   public int field80 = 128;
   @OriginalMember(
      owner = "client!ft",
      name = "g",
      descriptor = "I"
   )
   public int field83 = 128;
   @OriginalMember(
      owner = "client!ft",
      name = "i",
      descriptor = "I"
   )
   public int field78;
   @OriginalMember(
      owner = "client!ft",
      name = "d",
      descriptor = "I"
   )
   public int field79;
   @OriginalMember(
      owner = "client!ft",
      name = "e",
      descriptor = "I"
   )
   public int field75;
   @OriginalMember(
      owner = "client!ft",
      name = "b",
      descriptor = "I"
   )
   public int field84;
   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field86 = new String[]{method40(method39("\u001cfB*\u0015")), method40(method39("\u0001<BF@")), method40(method39("\t=\u0000h")), method40(method39("\u0001<B8\u0001\t!\u0018:@")), method40(method39("\u0001<BE@"))};
   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "J"
   )
   public static long field77 = -1L;
   @OriginalMember(
      owner = "client!ft",
      name = "j",
      descriptor = "F"
   )
   public static float field76;
   @OriginalMember(
      owner = "client!ft",
      name = "k",
      descriptor = "I"
   )
   public static int field81;
   @OriginalMember(
      owner = "client!ft",
      name = "h",
      descriptor = "I"
   )
   public static int field82;
   @OriginalMember(
      owner = "client!ft",
      name = "f",
      descriptor = "I"
   )
   public static int field85;

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(Lft;I)V",
      line = 3
   )
   public final void method37(class4 arg0, int arg1) {
      try {
         this.field80 = arg0.field80;
         this.field79 = arg0.field79;
         this.field83 = arg0.field83;
         this.field78 = arg0.field78;
         this.field75 = arg0.field75;
         if (arg1 > -55) {
            this.field83 = 99;
         }

         this.field84 = arg0.field84;
         ++field81;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field86[1] + (arg0 != null ? field86[0] : field86[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "a",
      descriptor = "(Z)Lft;",
      line = 28
   )
   public final class4 method38(boolean arg0) {
      try {
         ++field82;
         if (!arg0) {
            this.field83 = 77;
         }

         return new class4(this.field78, this.field80, this.field83, this.field79, this.field75, this.field84);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field86[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "<init>",
      descriptor = "(I)V",
      line = 50
   )
   public class4(int arg0) {
      try {
         this.field78 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field86[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 57
   )
   private class4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field79 = arg3;
         this.field75 = arg4;
         this.field78 = arg0;
         this.field80 = arg1;
         this.field83 = arg2;
         this.field84 = arg5;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field86[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method39(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ft",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method40(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
