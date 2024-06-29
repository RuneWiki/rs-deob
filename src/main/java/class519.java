import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class519 {
   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7323 = new String[]{method3883(method3882("2gyJ\"r")), method3883(method3882("!#6J\u001d")), method3883(method3882("4xt\b")), method3883(method3882("2gyJ!r")), method3883(method3882("2gyJ#r"))};
   @OriginalMember(
      owner = "client!hja",
      name = "c",
      descriptor = "I"
   )
   public static int field7319;
   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "I"
   )
   public static int field7320;
   @OriginalMember(
      owner = "client!hja",
      name = "b",
      descriptor = "I"
   )
   public static int field7321;
   @OriginalMember(
      owner = "client!hja",
      name = "d",
      descriptor = "I"
   )
   public static int field7322;

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(ZLkc;BZ)V"
   )
   public static final void method3879(boolean param0, class733 param1, byte param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(ZLjava/lang/String;)I"
   )
   public static final int method3880(boolean arg0, String arg1) {
      try {
         if (arg0) {
            return -90;
         } else {
            ++field7319;
            return 1 + arg1.length();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7323[4] + arg0 + ',' + (arg1 != null ? field7323[1] : field7323[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(Leh;[[BB)V"
   )
   public static final void method3881(class543 param0, byte[][] param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3882(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 96);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3883(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 96;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
