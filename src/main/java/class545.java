import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class545 {
   @OriginalMember(
      owner = "client!cn",
      name = "b",
      descriptor = "I"
   )
   public int field7438 = -1;
   @OriginalMember(
      owner = "client!cn",
      name = "m",
      descriptor = "I"
   )
   public int field7439 = -1;
   @OriginalMember(
      owner = "client!cn",
      name = "c",
      descriptor = "I"
   )
   public int field7435 = -1;
   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7446 = new String[]{method3940(method3939("6J~v7")), method3940(method3939("6J~u7")), method3940(method3939(".\n~\u001ab")), method3940(method3939(";Q<X")), method3940(method3939("6J~w7"))};
   @OriginalMember(
      owner = "client!cn",
      name = "d",
      descriptor = "I"
   )
   public static int field7442 = 0;
   @OriginalMember(
      owner = "client!cn",
      name = "g",
      descriptor = "I"
   )
   public int field7433;
   @OriginalMember(
      owner = "client!cn",
      name = "k",
      descriptor = "I"
   )
   public static int field7434;
   @OriginalMember(
      owner = "client!cn",
      name = "j",
      descriptor = "I"
   )
   public int field7436;
   @OriginalMember(
      owner = "client!cn",
      name = "f",
      descriptor = "I"
   )
   public int field7437;
   @OriginalMember(
      owner = "client!cn",
      name = "e",
      descriptor = "I"
   )
   public int field7440;
   @OriginalMember(
      owner = "client!cn",
      name = "i",
      descriptor = "I"
   )
   public int field7441;
   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "I"
   )
   public int field7443;
   @OriginalMember(
      owner = "client!cn",
      name = "l",
      descriptor = "I"
   )
   public static int field7444;
   @OriginalMember(
      owner = "client!cn",
      name = "h",
      descriptor = "Lkk;"
   )
   public static class202 field7445;

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(IIIIIII)J"
   )
   public static final long method3936(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         class624.field8715.clear();
         ++field7434;
         if (arg1 != -13563) {
            return 62L;
         } else {
            class624.field8715.set(arg4, arg3, arg0, arg6, arg2, arg5);
            return class624.field8715.getTime().getTime();
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field7446[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3937(byte arg0) {
      try {
         field7445 = null;
         if (arg0 > -95) {
            field7442 = -29;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7446[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(IILjava/lang/String;)V"
   )
   public static final void method3938(int arg0, int arg1, String arg2) {
      try {
         ++field7444;
         class127.method1069(arg1, arg2, "", (byte)97, "", "", 0);
         if (arg0 != -7764) {
            method3938(110, 13, (String)null);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7446[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7446[2] : field7446[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "<init>",
      descriptor = "(Lvi;)V"
   )
   public class545(class569 arg0) {
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3939(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3940(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
