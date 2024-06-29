import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class750 {
   @OriginalMember(
      owner = "client!cg",
      name = "c",
      descriptor = "I"
   )
   public int field10658 = 128;
   @OriginalMember(
      owner = "client!cg",
      name = "b",
      descriptor = "I"
   )
   public int field10660 = 128;
   @OriginalMember(
      owner = "client!cg",
      name = "j",
      descriptor = "I"
   )
   public int field10654;
   @OriginalMember(
      owner = "client!cg",
      name = "e",
      descriptor = "I"
   )
   public int field10653;
   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "I"
   )
   public int field10655;
   @OriginalMember(
      owner = "client!cg",
      name = "i",
      descriptor = "I"
   )
   public int field10656;
   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10663 = new String[]{method5397(method5396("&\u0003\u0001|>")), method5397(method5396("&\u0003\u0001\u0003\u007f+\r[\u0001>")), method5397(method5396("&\u0003\u0001}>")), method5397(method5396("+\u0011CS")), method5397(method5396("&\u0003\u0001~>")), method5397(method5396(">J\u0001\u0011k"))};
   @OriginalMember(
      owner = "client!cg",
      name = "d",
      descriptor = "Lsb;"
   )
   public static class261 field10657 = new class261();
   @OriginalMember(
      owner = "client!cg",
      name = "k",
      descriptor = "I"
   )
   public static int field10652;
   @OriginalMember(
      owner = "client!cg",
      name = "g",
      descriptor = "I"
   )
   public static int field10659;
   @OriginalMember(
      owner = "client!cg",
      name = "f",
      descriptor = "I"
   )
   public static int field10661;
   @OriginalMember(
      owner = "client!cg",
      name = "h",
      descriptor = "Lpb;"
   )
   public static class142 field10662;

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(Lcg;B)V"
   )
   public final void method5393(class750 arg0, byte arg1) {
      try {
         ++field10652;
         this.field10660 = arg0.field10660;
         this.field10658 = arg0.field10658;
         this.field10656 = arg0.field10656;
         this.field10654 = arg0.field10654;
         this.field10653 = arg0.field10653;
         this.field10655 = arg0.field10655;
         if (arg1 > -18) {
            method5394(3);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10663[4] + (arg0 != null ? field10663[5] : field10663[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5394(int arg0) {
      try {
         if (arg0 != 20296) {
            method5394(-4);
         }

         field10662 = null;
         field10657 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10663[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "a",
      descriptor = "(I)Lcg;"
   )
   public final class750 method5395(int arg0) {
      try {
         ++field10659;
         if (arg0 > -77) {
            method5394(-25);
         }

         return new class750(this.field10654, this.field10660, this.field10658, this.field10656, this.field10655, this.field10653);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10663[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class750(int arg0) {
      try {
         this.field10654 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10663[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   private class750(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field10654 = arg0;
         this.field10653 = arg5;
         this.field10660 = arg1;
         this.field10658 = arg2;
         this.field10655 = arg4;
         this.field10656 = arg3;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10663[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5396(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5397(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
