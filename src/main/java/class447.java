import jaggl.OpenGL;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class447 extends class479 implements class13 {
   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "I"
   )
   private int field6792;
   @OriginalMember(
      owner = "client!ika",
      name = "G",
      descriptor = "I"
   )
   private int field6791;
   @OriginalMember(
      owner = "client!ika",
      name = "C",
      descriptor = "I"
   )
   private int field6793;
   @OriginalMember(
      owner = "client!ika",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6802 = new String[]{method3376(method3375("{[u\u0014\r:")), method3376(method3375("{[u\u0014p{^}Nr:")), method3376(method3375("i\u001e:\u00141")), method3376(method3375("|ExV"))};
   @OriginalMember(
      owner = "client!ika",
      name = "A",
      descriptor = "Lgo;"
   )
   public static class653 field6794 = new class653(0, 0);
   @OriginalMember(
      owner = "client!ika",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field6797 = false;
   @OriginalMember(
      owner = "client!ika",
      name = "w",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field6798 = Calendar.getInstance();
   @OriginalMember(
      owner = "client!ika",
      name = "F",
      descriptor = "Ljava/util/Calendar;"
   )
   public static Calendar field6795 = Calendar.getInstance(TimeZone.getTimeZone(method3376(method3375("U}@"))));
   @OriginalMember(
      owner = "client!ika",
      name = "E",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field6799 = new BigInteger(method3376(method3375("#\u0000$\n}")), 16);
   @OriginalMember(
      owner = "client!ika",
      name = "x",
      descriptor = "I"
   )
   public static int field6800 = 0;
   @OriginalMember(
      owner = "client!ika",
      name = "B",
      descriptor = "I"
   )
   public static int field6801;
   @OriginalMember(
      owner = "client!ika",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field6796;

   @OriginalMember(
      owner = "client!ika",
      name = "b",
      descriptor = "(Z)V",
      line = 10
   )
   public static void method3374(boolean arg0) {
      try {
         field6795 = null;
         field6799 = null;
         if (!arg0) {
            method3374(true);
         }

         field6798 = null;
         field6794 = null;
         field6796 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6802[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "<init>",
      descriptor = "(Leh;Lii;III[B)V",
      line = 27
   )
   public class447(class379 arg0, class579 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      super(arg0, 32879, arg1, class513.field7519, arg2 * arg3 * arg4, false);

      try {
         this.field6792 = arg4;
         this.field6791 = arg3;
         this.field6793 = arg2;
         super.field7119.method2578(this, true);
         OpenGL.glPixelStorei(3317, 1);
         OpenGL.glTexImage3Dub(super.field7122, 0, this.method3554(34840), this.field6793, this.field6791, this.field6792, 0, class420.method3207(super.field7112, 17835), 5121, arg5, 0);
         OpenGL.glPixelStorei(3317, 4);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6802[1] + (arg0 != null ? field6802[2] : field6802[3]) + ',' + (arg1 != null ? field6802[2] : field6802[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6802[2] : field6802[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3375(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ika",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3376(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
