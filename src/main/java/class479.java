import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class479 extends class376 {
   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7292 = new String[]{method3729(method3728("m\"q\u0002O")), method3729(method3728("m\"q\u0003O")), method3729(method3728("m\"q\u0000O")), method3729(method3728("n)<-\u000ef")), method3729(method3728("l?l%"))};
   @OriginalMember(
      owner = "client!ij",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field7286 = true;
   @OriginalMember(
      owner = "client!ij",
      name = "l",
      descriptor = "F"
   )
   public static float field7287;
   @OriginalMember(
      owner = "client!ij",
      name = "m",
      descriptor = "I"
   )
   public static int field7288;
   @OriginalMember(
      owner = "client!ij",
      name = "n",
      descriptor = "I"
   )
   public static int field7290;
   @OriginalMember(
      owner = "client!ij",
      name = "p",
      descriptor = "Ldv;"
   )
   public static class65 field7291;
   @OriginalMember(
      owner = "client!ij",
      name = "o",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field7289;

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(B)Z"
   )
   public static final boolean method3725(byte arg0) {
      try {
         ++field7288;
         if (arg0 != -6) {
            field7286 = true;
         }

         return !class158.method1410((byte)-93, field7292[3]) ? false : class158.method1410((byte)-93, field7292[4]);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7292[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method3726(int arg0) {
      try {
         field7291 = null;
         field7289 = null;
         if (arg0 <= 105) {
            field7291 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7292[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(BII)I"
   )
   public static final int method3727(byte arg0, int arg1, int arg2) {
      try {
         ++field7290;
         double var3 = Math.log((double)arg2) / Math.log(2.0D);
         double var5 = Math.log((double)arg1) / Math.log(2.0D);
         double var7 = (var3 - var5) * Math.random() + var5;
         if (arg0 >= -7) {
            method3727((byte)88, -64, 46);
         }

         return (int)(Math.pow(2.0D, var7) + 0.5D);
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field7292[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3728(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3729(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
