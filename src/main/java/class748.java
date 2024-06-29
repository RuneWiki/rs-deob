import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class748 {
   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10794 = new String[]{method5429(method5428("u\u0007M6")), method5429(method5428("q\u001c\u000f\u0018I")), method5429(method5428("`\\\u000ft\u001c")), method5429(method5428("q\u001c\u000f\u001bI")), method5429(method5428("q\u001c\u000f\u0019I"))};
   @OriginalMember(
      owner = "client!jn",
      name = "n",
      descriptor = "I"
   )
   public static int field10779;
   @OriginalMember(
      owner = "client!jn",
      name = "l",
      descriptor = "I"
   )
   public int field10780;
   @OriginalMember(
      owner = "client!jn",
      name = "f",
      descriptor = "I"
   )
   public int field10781;
   @OriginalMember(
      owner = "client!jn",
      name = "i",
      descriptor = "I"
   )
   public int field10782;
   @OriginalMember(
      owner = "client!jn",
      name = "c",
      descriptor = "I"
   )
   public int field10783;
   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "I"
   )
   public int field10784;
   @OriginalMember(
      owner = "client!jn",
      name = "o",
      descriptor = "I"
   )
   public static int field10785;
   @OriginalMember(
      owner = "client!jn",
      name = "h",
      descriptor = "I"
   )
   public int field10786;
   @OriginalMember(
      owner = "client!jn",
      name = "b",
      descriptor = "I"
   )
   public int field10787;
   @OriginalMember(
      owner = "client!jn",
      name = "g",
      descriptor = "I"
   )
   public int field10788;
   @OriginalMember(
      owner = "client!jn",
      name = "e",
      descriptor = "I"
   )
   public int field10789;
   @OriginalMember(
      owner = "client!jn",
      name = "j",
      descriptor = "I"
   )
   public int field10790;
   @OriginalMember(
      owner = "client!jn",
      name = "k",
      descriptor = "I"
   )
   public int field10791;
   @OriginalMember(
      owner = "client!jn",
      name = "d",
      descriptor = "I"
   )
   public int field10793;
   @OriginalMember(
      owner = "client!jn",
      name = "m",
      descriptor = "[[[Luo;"
   )
   public static class600[][][] field10792;

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(Ljn;B)Z",
      line = 4
   )
   public final boolean method5425(class748 arg0, byte arg1) {
      try {
         if (arg1 != 22) {
            this.field10791 = -103;
         }

         ++field10779;
         return this.field10791 == arg0.field10791 && this.field10793 == arg0.field10793 && ~this.field10787 == ~arg0.field10787;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10794[4] + (arg0 != null ? field10794[2] : field10794[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(I)V",
      line = 29
   )
   public static void method5426(int arg0) {
      try {
         field10792 = null;
         if (arg0 != 30457) {
            field10792 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10794[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(ZLlha;)I",
      line = 39
   )
   public static final int method5427(boolean arg0, class649 arg1) {
      try {
         ++field10785;
         if (arg0) {
            method5426(-44);
         }

         if (class540.field7850 != arg1) {
            if (class701.field10248 != arg1) {
               if (class315.field4537 != arg1) {
                  if (class295.field4119 == arg1) {
                     return 34166;
                  } else {
                     throw new IllegalArgumentException();
                  }
               } else {
                  return 34168;
               }
            } else {
               return 34167;
            }
         } else {
            return 5890;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10794[1] + arg0 + ',' + (arg1 != null ? field10794[2] : field10794[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5428(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5429(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
