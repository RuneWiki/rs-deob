import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class651 {
   @OriginalMember(
      owner = "client!ve",
      name = "g",
      descriptor = "S"
   )
   public short field9716;
   @OriginalMember(
      owner = "client!ve",
      name = "j",
      descriptor = "S"
   )
   public short field9724;
   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "I"
   )
   public int field9717;
   @OriginalMember(
      owner = "client!ve",
      name = "h",
      descriptor = "S"
   )
   public short field9718;
   @OriginalMember(
      owner = "client!ve",
      name = "c",
      descriptor = "B"
   )
   public byte field9723;
   @OriginalMember(
      owner = "client!ve",
      name = "i",
      descriptor = "Z"
   )
   public boolean field9721;
   @OriginalMember(
      owner = "client!ve",
      name = "d",
      descriptor = "B"
   )
   public byte field9715;
   @OriginalMember(
      owner = "client!ve",
      name = "f",
      descriptor = "I"
   )
   public int field9719;
   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9725 = new String[]{method4787(method4786("J8j,T")), method4787(method4786("J8j/T")), method4787(method4786("J8jR\u0015R40PT"))};
   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "Lse;"
   )
   public static class6 field9720 = new class6(48, 8);
   @OriginalMember(
      owner = "client!ve",
      name = "e",
      descriptor = "I"
   )
   public static int field9722;

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(I)[Lfea;"
   )
   public static final class681[] method4784(int arg0) {
      try {
         if (arg0 != 48) {
            field9720 = null;
         }

         ++field9722;
         return new class681[]{class163.field2067, class613.field9023, class98.field1308, class554.field8142, class459.field6313, class649.field9692, class400.field5501, class208.field2643, class77.field1025, class201.field2550, class738.field10814, class694.field10176, class784.field11460, class753.field11027};
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9725[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4785(int arg0) {
      try {
         if (arg0 > -22) {
            field9720 = null;
         }

         field9720 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9725[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "<init>",
      descriptor = "(IIIIIIIIIZI)V"
   )
   public class651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
      try {
         this.field9716 = (short)arg6;
         this.field9724 = (short)arg5;
         this.field9717 = arg10;
         this.field9718 = (short)arg4;
         this.field9723 = (byte)arg7;
         this.field9721 = arg9;
         this.field9715 = (byte)arg8;
         this.field9719 = arg0;
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field9725[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4786(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4787(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
