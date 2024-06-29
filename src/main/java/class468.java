import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class468 {
   @OriginalMember(
      owner = "client!cn",
      name = "i",
      descriptor = "[I"
   )
   public int[] field6778;
   @OriginalMember(
      owner = "client!cn",
      name = "b",
      descriptor = "[S"
   )
   public short[] field6780;
   @OriginalMember(
      owner = "client!cn",
      name = "h",
      descriptor = "J"
   )
   public long field6785;
   @OriginalMember(
      owner = "client!cn",
      name = "d",
      descriptor = "[S"
   )
   public short[] field6781;
   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6787 = new String[]{method3594(method3593("ht\u001aO\u000b")), method3594(method3593("ht\u001aL\u000b")), method3594(method3593("eoXb")), method3594(method3593("p4\u001a ^")), method3594(method3593("ht\u001a2Jes@0\u000b")), method3594(method3593("ht\u001aM\u000b"))};
   @OriginalMember(
      owner = "client!cn",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field6779 = new int[32];
   @OriginalMember(
      owner = "client!cn",
      name = "f",
      descriptor = "Lhha;"
   )
   public static class724 field6784 = new class724(86, 10);
   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "I"
   )
   public static int field6782;
   @OriginalMember(
      owner = "client!cn",
      name = "e",
      descriptor = "I"
   )
   public static int field6783;
   @OriginalMember(
      owner = "client!cn",
      name = "g",
      descriptor = "[Lhr;"
   )
   public static class98[] field6786;

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3590(int arg0, int arg1) {
      try {
         if (arg1 != 3) {
            method3592(false);
         }

         ++field6782;
         return arg0 >>> 7;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6787[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(IIIIIII)I"
   )
   public static final int method3591(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field6783;
         if (~(arg2 & 1) == -2) {
            int var7 = arg5;
            arg5 = arg3;
            arg3 = var7;
         }

         int var10 = arg6 & 3;
         if (arg1 == var10) {
            return arg4;
         } else if (~var10 == -2) {
            return -arg0 + 7 + 1 + -arg5;
         } else {
            return ~var10 == -3 ? 1 - arg3 + 7 + -arg4 : arg0;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field6787[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "<init>",
      descriptor = "(J[I[S[S)V"
   )
   public class468(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field6778 = arg1;
         this.field6780 = arg3;
         this.field6785 = arg0;
         this.field6781 = arg2;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6787[4] + arg0 + ',' + (arg1 != null ? field6787[3] : field6787[2]) + ',' + (arg2 != null ? field6787[3] : field6787[2]) + ',' + (arg3 != null ? field6787[3] : field6787[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3592(boolean arg0) {
      try {
         field6784 = null;
         if (!arg0) {
            field6786 = null;
            field6779 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6787[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cn",
      name = "<init>",
      descriptor = "()V"
   )
   protected class468() {
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3593(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3594(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
