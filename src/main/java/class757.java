import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public abstract class class757 {
   @OriginalMember(
      owner = "client!cp",
      name = "c",
      descriptor = "Lor;"
   )
   public class670 field10974;
   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10975 = new String[]{method5451(method5450("F{\u0003\u0001c")), method5451(method5450("F{\u0003\u0000c")), method5451(method5450("K~A!")), method5451(method5450("F{\u0003q\"KbYsc")), method5451(method5450("^%\u0003c6"))};
   @OriginalMember(
      owner = "client!cp",
      name = "d",
      descriptor = "I"
   )
   public static int field10973;
   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "Llt;"
   )
   public static class706 field10971;
   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field10972;

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method388(byte arg0);

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5448(boolean arg0) {
      try {
         class24.field312 = new int[class398.field5594][class635.field8973 + 1][class304.field4042 - -1];
         ++field10973;
         class614.field8580 = new class777[500];
         class625.field8733 = new class777[500];
         if (!arg0) {
            field10971 = null;
         }

         class536.field7332 = class212.field2635;
         class67.field767 = class212.field2635;
         class397.field5579 = new class777[1000];
         class523.field7165 = 0;
         class766.field11047 = false;
         class795.field11617 = new class777[2000];
         class28.field350 = 0;
         class642.field9026 = 0;
         class623.field8695 = 0;
         if (class292.field3851 instanceof class725) {
            class233.field2888 = false;
         } else {
            class233.field2888 = true;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10975[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(ZI)V"
   )
   public abstract void method385(boolean arg0, int arg1);

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(BILmd;)V"
   )
   public abstract void method387(byte arg0, int arg1, class573 arg2);

   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "(I)Z"
   )
   public abstract boolean method392(int arg0);

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(IZ)V"
   )
   public abstract void method391(int arg0, boolean arg1);

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5449(int arg0) {
      try {
         field10971 = null;
         field10972 = null;
         if (arg0 != 21752) {
            field10971 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10975[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method386(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class757(class670 arg0) {
      try {
         this.field10974 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10975[3] + (arg0 != null ? field10975[4] : field10975[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5450(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5451(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
