import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class277 {
   @OriginalMember(
      owner = "client!cl",
      name = "o",
      descriptor = "Z"
   )
   public boolean field3864;
   @OriginalMember(
      owner = "client!cl",
      name = "j",
      descriptor = "S"
   )
   public short field3865;
   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "I"
   )
   public int field3858;
   @OriginalMember(
      owner = "client!cl",
      name = "f",
      descriptor = "I"
   )
   public int field3862;
   @OriginalMember(
      owner = "client!cl",
      name = "k",
      descriptor = "I"
   )
   public int field3871;
   @OriginalMember(
      owner = "client!cl",
      name = "g",
      descriptor = "I"
   )
   public int field3866;
   @OriginalMember(
      owner = "client!cl",
      name = "i",
      descriptor = "B"
   )
   public byte field3870;
   @OriginalMember(
      owner = "client!cl",
      name = "d",
      descriptor = "I"
   )
   public int field3867;
   @OriginalMember(
      owner = "client!cl",
      name = "m",
      descriptor = "S"
   )
   public short field3860;
   @OriginalMember(
      owner = "client!cl",
      name = "b",
      descriptor = "S"
   )
   public short field3863;
   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3873 = new String[]{method2136(method2135("\u0007<y.c")), method2136(method2135("\u0007<yQ\"\n9#Sc")), method2136(method2135("\u0007<y/c")), method2136(method2135("\u0007<y,c"))};
   @OriginalMember(
      owner = "client!cl",
      name = "h",
      descriptor = "[Lkia;"
   )
   public static class646[] field3859 = new class646[37];
   @OriginalMember(
      owner = "client!cl",
      name = "c",
      descriptor = "Lpn;"
   )
   public static class776 field3861 = new class776();
   @OriginalMember(
      owner = "client!cl",
      name = "l",
      descriptor = "I"
   )
   public static int field3868;
   @OriginalMember(
      owner = "client!cl",
      name = "e",
      descriptor = "I"
   )
   public static int field3869;
   @OriginalMember(
      owner = "client!cl",
      name = "n",
      descriptor = "I"
   )
   public static int field3872;

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(IIIII)V",
      line = 13
   )
   public static final void method2132(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (class506.field7472 <= arg3 && class22.field234 >= arg3) {
            int var8 = class768.method5559(arg1, class100.field1232, class197.field2442, 71);
            int var7 = class768.method5559(arg0, class100.field1232, class197.field2442, 71);
            class274.method2111((byte)-119, arg4, var8, var7, arg3);
         }

         if (arg2 < -64) {
            ++field3869;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3873[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(I)V",
      line = 32
   )
   public static void method2133(int arg0) {
      try {
         field3859 = null;
         if (arg0 != 37) {
            method2134(false);
         }

         field3861 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3873[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "a",
      descriptor = "(Z)V",
      line = 43
   )
   public static final void method2134(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cl",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V",
      line = 79
   )
   public class277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field3864 = arg10;
         this.field3865 = (short)arg6;
         this.field3858 = arg0;
         this.field3862 = arg11;
         this.field3871 = arg1;
         this.field3866 = arg2;
         this.field3870 = (byte)arg8;
         this.field3867 = arg3;
         this.field3860 = (short)arg4;
         this.field3863 = (short)arg5;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field3873[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2135(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2136(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
