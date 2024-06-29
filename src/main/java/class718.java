import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class718 {
   @OriginalMember(
      owner = "client!hda",
      name = "m",
      descriptor = "I"
   )
   public int field10525 = 128;
   @OriginalMember(
      owner = "client!hda",
      name = "j",
      descriptor = "I"
   )
   public int field10530 = 128;
   @OriginalMember(
      owner = "client!hda",
      name = "c",
      descriptor = "I"
   )
   public int field10528;
   @OriginalMember(
      owner = "client!hda",
      name = "k",
      descriptor = "I"
   )
   public int field10522;
   @OriginalMember(
      owner = "client!hda",
      name = "f",
      descriptor = "I"
   )
   public int field10527;
   @OriginalMember(
      owner = "client!hda",
      name = "h",
      descriptor = "I"
   )
   public int field10521;
   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10533 = new String[]{method5229(method5228("%D#cBe")), method5229(method5228("%D#c?$N+9=e")), method5229(method5228("%D#cAe")), method5229(method5228("#U.!")), method5229(method5228("6\u000elc~"))};
   @OriginalMember(
      owner = "client!hda",
      name = "b",
      descriptor = "I"
   )
   public int field10520;
   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "I"
   )
   public static int field10523;
   @OriginalMember(
      owner = "client!hda",
      name = "g",
      descriptor = "I"
   )
   public int field10524;
   @OriginalMember(
      owner = "client!hda",
      name = "l",
      descriptor = "I"
   )
   public static int field10526;
   @OriginalMember(
      owner = "client!hda",
      name = "i",
      descriptor = "I"
   )
   public int field10529;
   @OriginalMember(
      owner = "client!hda",
      name = "e",
      descriptor = "I"
   )
   public int field10531;
   @OriginalMember(
      owner = "client!hda",
      name = "d",
      descriptor = "I"
   )
   public int field10532;

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(Z)Lhda;"
   )
   public final class718 method5226(boolean arg0) {
      try {
         if (arg0) {
            return null;
         } else {
            ++field10523;
            return new class718(this.field10528, this.field10525, this.field10530, this.field10522, this.field10521, this.field10527);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10533[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "a",
      descriptor = "(BLhda;)V"
   )
   public final void method5227(byte arg0, class718 arg1) {
      try {
         this.field10527 = arg1.field10527;
         this.field10528 = arg1.field10528;
         ++field10526;
         this.field10521 = arg1.field10521;
         this.field10530 = arg1.field10530;
         this.field10525 = arg1.field10525;
         int var3 = 108 % ((-59 - arg0) / 50);
         this.field10522 = arg1.field10522;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10533[2] + arg0 + ',' + (arg1 != null ? field10533[4] : field10533[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class718(int arg0) {
      try {
         this.field10528 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10533[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field10522 = arg3;
         this.field10530 = arg2;
         this.field10527 = arg5;
         this.field10525 = arg1;
         this.field10521 = arg4;
         this.field10528 = arg0;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10533[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5228(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5229(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 66;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
