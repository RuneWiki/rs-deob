import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class253 {
   @OriginalMember(
      owner = "client!qw",
      name = "l",
      descriptor = "I"
   )
   public int field3820;
   @OriginalMember(
      owner = "client!qw",
      name = "i",
      descriptor = "I"
   )
   public int field3816;
   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3824 = new String[]{method2138(method2137("XA\u001b|0")), method2138(method2137("XA\u001bz0")), method2138(method2137("XA\u001b{0")), method2138(method2137("XA\u001b\u0004qG_A\u00060")), method2138(method2137("XA\u001by0"))};
   @OriginalMember(
      owner = "client!qw",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field3817 = false;
   @OriginalMember(
      owner = "client!qw",
      name = "g",
      descriptor = "Lnaa;"
   )
   public static class113 field3814 = new class113(53, 2);
   @OriginalMember(
      owner = "client!qw",
      name = "h",
      descriptor = "I"
   )
   public static int field3811;
   @OriginalMember(
      owner = "client!qw",
      name = "d",
      descriptor = "I"
   )
   public int field3813;
   @OriginalMember(
      owner = "client!qw",
      name = "j",
      descriptor = "I"
   )
   public int field3815;
   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "I"
   )
   public int field3819;
   @OriginalMember(
      owner = "client!qw",
      name = "e",
      descriptor = "I"
   )
   public static int field3821;
   @OriginalMember(
      owner = "client!qw",
      name = "m",
      descriptor = "I"
   )
   public static int field3822;
   @OriginalMember(
      owner = "client!qw",
      name = "f",
      descriptor = "I"
   )
   public static int field3823;
   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "Lqw;"
   )
   public class253 field3812;
   @OriginalMember(
      owner = "client!qw",
      name = "k",
      descriptor = "Lkf;"
   )
   public class401 field3818;

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(Z)Lrfa;",
      line = 7
   )
   public final class481 method2133(boolean arg0) {
      try {
         ++field3821;
         if (!arg0) {
            this.field3815 = -92;
         }

         return class523.method4035(1, this.field3820);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3824[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(I)V",
      line = 18
   )
   public static void method2134(int arg0) {
      try {
         if (arg0 != 16505) {
            field3817 = false;
         }

         field3814 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3824[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "a",
      descriptor = "(II)Lqw;",
      line = 39
   )
   public final class253 method2135(int arg0, int arg1) {
      try {
         ++field3811;
         if (arg0 != -25832) {
            this.field3813 = 73;
         }

         return new class253(this.field3820, arg1);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3824[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "b",
      descriptor = "(Z)V",
      line = 50
   )
   public static final void method2136(boolean arg0) {
      try {
         ++field3823;
         if (!arg0) {
            method2134(76);
         }

         class659.field9850.method679(((float)class687.field10213.field508.method4962(480102311) * 0.1F + 0.7F) * class786.field11528);
         class659.field9850.method656(class152.field2281, class699.field10389, class365.field5645, (float)(class124.field1792 << 2), (float)(class162.field2419 << 2), (float)(class154.field2304 << 2));
         class659.field9850.method667(class376.field5983);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3824[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "<init>",
      descriptor = "(II)V",
      line = 64
   )
   public class253(int arg0, int arg1) {
      try {
         this.field3820 = arg0;
         this.field3816 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field3824[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2137(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2138(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
