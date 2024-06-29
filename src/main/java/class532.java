import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class532 extends class757 {
   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7287 = new String[]{method3836(method3835("D\u001f\u0015V?")), method3836(method3835("D\u001f\u0015S?")), method3836(method3835("D\u001f\u0015T?")), method3836(method3835("D\u001f\u0015R?")), method3836(method3835("D\u001f\u0015U?")), method3836(method3835("D\u001f\u0015Y?")), method3836(method3835("C\u0019W|")), method3836(method3835("VB\u0015>j")), method3836(method3835("D\u001f\u0015Q?"))};
   @OriginalMember(
      owner = "client!is",
      name = "o",
      descriptor = "Ljh;"
   )
   public static class169 field7275 = new class169();
   @OriginalMember(
      owner = "client!is",
      name = "i",
      descriptor = "Lod;"
   )
   public static class536 field7281 = new class536();
   @OriginalMember(
      owner = "client!is",
      name = "j",
      descriptor = "I"
   )
   public static int field7276;
   @OriginalMember(
      owner = "client!is",
      name = "m",
      descriptor = "I"
   )
   public static int field7278;
   @OriginalMember(
      owner = "client!is",
      name = "k",
      descriptor = "I"
   )
   public static int field7279;
   @OriginalMember(
      owner = "client!is",
      name = "h",
      descriptor = "I"
   )
   public static int field7282;
   @OriginalMember(
      owner = "client!is",
      name = "f",
      descriptor = "I"
   )
   public static int field7283;
   @OriginalMember(
      owner = "client!is",
      name = "l",
      descriptor = "I"
   )
   public static int field7284;
   @OriginalMember(
      owner = "client!is",
      name = "n",
      descriptor = "I"
   )
   public static int field7285;
   @OriginalMember(
      owner = "client!is",
      name = "g",
      descriptor = "I"
   )
   public static int field7286;
   @OriginalMember(
      owner = "client!is",
      name = "e",
      descriptor = "Ldea;"
   )
   public static class259 field7280;
   @OriginalMember(
      owner = "client!is",
      name = "p",
      descriptor = "Lqh;"
   )
   public static class74 field7277;

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method385(boolean arg0, int arg1) {
      try {
         if (arg1 != 500) {
            method3834(3);
         }

         ++field7282;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7287[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(BILmd;)V"
   )
   public final void method387(byte arg0, int arg1, class573 arg2) {
      try {
         if (arg0 != -96) {
            field7285 = -88;
         }

         super.field10974.method4848(false, arg2);
         ++field7278;
         super.field10974.method4879(0, arg1);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7287[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7287[7] : field7287[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method392(int arg0) {
      try {
         ++field7279;
         return arg0 < 110 ? true : true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7287[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method388(byte arg0) {
      try {
         super.field10974.method4890(true, false);
         int var2 = 87 / ((48 - arg0) / 63);
         ++field7276;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7287[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method391(int arg0, boolean arg1) {
      try {
         super.field10974.method4890(true, true);
         ++field7283;
         if (arg0 <= 24) {
            field7281 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7287[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3834(int arg0) {
      try {
         field7281 = null;
         if (arg0 >= -74) {
            field7285 = -104;
         }

         field7275 = null;
         field7277 = null;
         field7280 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7287[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method386(int arg0, int arg1, int arg2) {
      try {
         ++field7286;
         if (arg1 > -118) {
            field7277 = null;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7287[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class532(class670 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3835(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3836(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
