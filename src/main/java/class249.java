import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class249 {
   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "I"
   )
   public int field3783;
   @OriginalMember(
      owner = "client!fo",
      name = "f",
      descriptor = "I"
   )
   public int field3791;
   @OriginalMember(
      owner = "client!fo",
      name = "g",
      descriptor = "I"
   )
   public int field3792;
   @OriginalMember(
      owner = "client!fo",
      name = "c",
      descriptor = "S"
   )
   public short field3782;
   @OriginalMember(
      owner = "client!fo",
      name = "d",
      descriptor = "Z"
   )
   public boolean field3790;
   @OriginalMember(
      owner = "client!fo",
      name = "i",
      descriptor = "B"
   )
   public byte field3793;
   @OriginalMember(
      owner = "client!fo",
      name = "e",
      descriptor = "I"
   )
   public int field3779;
   @OriginalMember(
      owner = "client!fo",
      name = "h",
      descriptor = "I"
   )
   public int field3784;
   @OriginalMember(
      owner = "client!fo",
      name = "m",
      descriptor = "S"
   )
   public short field3780;
   @OriginalMember(
      owner = "client!fo",
      name = "n",
      descriptor = "S"
   )
   public short field3788;
   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3794 = new String[]{method2120(method2119("\fE\u007f$\u0017")), method2120(method2119("\fE\u007fYV\u0004C%[\u0017")), method2120(method2119("\fE\u007f'\u0017"))};
   @OriginalMember(
      owner = "client!fo",
      name = "b",
      descriptor = "[[B"
   )
   public static byte[][] field3789 = new byte[1000][];
   @OriginalMember(
      owner = "client!fo",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field3787 = false;
   @OriginalMember(
      owner = "client!fo",
      name = "k",
      descriptor = "I"
   )
   public static int field3781;
   @OriginalMember(
      owner = "client!fo",
      name = "l",
      descriptor = "I"
   )
   public static int field3786;
   @OriginalMember(
      owner = "client!fo",
      name = "j",
      descriptor = "Lgea;"
   )
   public static class750 field3785;

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(ZII)V"
   )
   public static final void method2117(boolean arg0, int arg1, int arg2) {
      try {
         ++field3786;
         ++class446.field6843;
         class577 var3 = class218.method1888(class539.field8129, 121, class510.field7801.field361);
         if (arg0) {
            var3.field8531.method2856(71, arg2);
            var3.field8531.method2866(arg1, arg0);
            class510.field7801.method211(var3, 126);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3794[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2118(int arg0) {
      try {
         if (arg0 != 1000) {
            field3787 = false;
         }

         field3785 = null;
         field3789 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3794[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field3783 = arg0;
         this.field3791 = arg11;
         this.field3792 = arg3;
         this.field3782 = (short)arg5;
         this.field3790 = arg10;
         this.field3793 = (byte)arg8;
         this.field3779 = arg2;
         this.field3784 = arg1;
         this.field3780 = (short)arg4;
         this.field3788 = (short)arg6;
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field3794[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2119(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2120(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
