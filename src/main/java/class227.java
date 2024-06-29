import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class227 extends class22 {
   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3362 = method1892(method1891("\bBUBcC"));
   @OriginalMember(
      owner = "client!cha",
      name = "m",
      descriptor = "I"
   )
   public int field3350;
   @OriginalMember(
      owner = "client!cha",
      name = "o",
      descriptor = "I"
   )
   public static int field3353;
   @OriginalMember(
      owner = "client!cha",
      name = "q",
      descriptor = "I"
   )
   public int field3354;
   @OriginalMember(
      owner = "client!cha",
      name = "l",
      descriptor = "I"
   )
   public int field3355;
   @OriginalMember(
      owner = "client!cha",
      name = "t",
      descriptor = "I"
   )
   public int field3356;
   @OriginalMember(
      owner = "client!cha",
      name = "u",
      descriptor = "I"
   )
   public int field3358;
   @OriginalMember(
      owner = "client!cha",
      name = "p",
      descriptor = "I"
   )
   public int field3359;
   @OriginalMember(
      owner = "client!cha",
      name = "r",
      descriptor = "Ljfa;"
   )
   public class303 field3357;
   @OriginalMember(
      owner = "client!cha",
      name = "j",
      descriptor = "Ljfa;"
   )
   public class303 field3360;
   @OriginalMember(
      owner = "client!cha",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   public String field3351;
   @OriginalMember(
      owner = "client!cha",
      name = "k",
      descriptor = "Z"
   )
   public boolean field3361;
   @OriginalMember(
      owner = "client!cha",
      name = "n",
      descriptor = "[Ljava/lang/Object;"
   )
   public Object[] field3352;

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(IIIIIII)I",
      line = 12
   )
   public static final int method1890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         int var10 = arg0 & 3;
         if ((1 & arg5) == 1) {
            int var7 = arg3;
            arg3 = arg6;
            arg6 = var7;
         }

         ++field3353;
         if (~var10 == arg1) {
            return arg4;
         } else if (var10 == 1) {
            return arg2;
         } else {
            return ~var10 == -3 ? 1 - arg3 + 7 + -arg4 : -arg2 + 7 - (arg6 + -1);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field3362 + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1891(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1892(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
