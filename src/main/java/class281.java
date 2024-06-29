import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class281 implements class191 {
   @OriginalMember(
      owner = "client!kv",
      name = "o",
      descriptor = "I"
   )
   public int field3912;
   @OriginalMember(
      owner = "client!kv",
      name = "n",
      descriptor = "I"
   )
   public int field3911;
   @OriginalMember(
      owner = "client!kv",
      name = "l",
      descriptor = "I"
   )
   public int field3909;
   @OriginalMember(
      owner = "client!kv",
      name = "f",
      descriptor = "Lvh;"
   )
   public class378 field3905;
   @OriginalMember(
      owner = "client!kv",
      name = "j",
      descriptor = "I"
   )
   public int field3903;
   @OriginalMember(
      owner = "client!kv",
      name = "m",
      descriptor = "I"
   )
   public int field3910;
   @OriginalMember(
      owner = "client!kv",
      name = "b",
      descriptor = "Z"
   )
   public boolean field3915;
   @OriginalMember(
      owner = "client!kv",
      name = "i",
      descriptor = "I"
   )
   public int field3908;
   @OriginalMember(
      owner = "client!kv",
      name = "g",
      descriptor = "I"
   )
   public int field3904;
   @OriginalMember(
      owner = "client!kv",
      name = "p",
      descriptor = "I"
   )
   public int field3902;
   @OriginalMember(
      owner = "client!kv",
      name = "e",
      descriptor = "Lwm;"
   )
   public class590 field3913;
   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3918 = new String[]{method2153(method2152("LH\r'")), method2153(method2152("Y\u0013Oeh")), method2153(method2152("IKOw|LT\u0015u=")), method2153(method2152("IKO\b=")), method2153(method2152("IKO\n=")), method2153(method2152("IKO\t="))};
   @OriginalMember(
      owner = "client!kv",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field3907 = new class101(97, 10);
   @OriginalMember(
      owner = "client!kv",
      name = "c",
      descriptor = "Lsda;"
   )
   public static class269 field3916 = new class269(47, 0);
   @OriginalMember(
      owner = "client!kv",
      name = "k",
      descriptor = "Lnn;"
   )
   public static class436 field3917 = new class436(method2153(method2152("nt7\u000e")), "", "", 0);
   @OriginalMember(
      owner = "client!kv",
      name = "h",
      descriptor = "I"
   )
   public static int field3906;
   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "I"
   )
   public static int field3914;

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(II[Lhv;)V"
   )
   public static final void method2150(int param0, int param1, class544[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(I)Loi;"
   )
   public final class79 method1311(int arg0) {
      try {
         if (arg0 >= -106) {
            this.field3908 = -94;
         }

         ++field3914;
         return class561.field8388;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3918[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2151(byte arg0) {
      try {
         field3907 = null;
         field3916 = null;
         field3917 = null;
         int var1 = -84 % ((arg0 - -55) / 33);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3918[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "<init>",
      descriptor = "(ILwm;Lvh;IIIIIIIZ)V"
   )
   public class281(int arg0, class590 arg1, class378 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
      try {
         this.field3912 = arg4;
         this.field3911 = arg6;
         this.field3909 = arg3;
         this.field3905 = arg2;
         this.field3903 = arg0;
         this.field3910 = arg5;
         this.field3915 = arg10;
         this.field3908 = arg9;
         this.field3904 = arg7;
         this.field3902 = arg8;
         this.field3913 = arg1;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field3918[2] + arg0 + ',' + (arg1 != null ? field3918[1] : field3918[0]) + ',' + (arg2 != null ? field3918[1] : field3918[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2152(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2153(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
