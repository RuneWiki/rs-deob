import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class248 implements class136 {
   @OriginalMember(
      owner = "client!kea",
      name = "g",
      descriptor = "I"
   )
   public int field3573;
   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3577 = new String[]{method2021(method2020("\n\u0007\u0001sgI")), method2021(method2020("\n\u0007\u0001sQ\u000e1\u0014/L\u000f\u0005H")), method2021(method2020("\u000f\u0017\f1")), method2021(method2020("\n\u0007\u0001sfI")), method2021(method2020("\u001aLNsX")), method2021(method2020("\n\u0007\u0001sdI")), method2021(method2020("\n\u0007\u0001s\u0019\b\f\t)\u001bI"))};
   @OriginalMember(
      owner = "client!kea",
      name = "c",
      descriptor = "I"
   )
   public static int field3571 = 0;
   @OriginalMember(
      owner = "client!kea",
      name = "f",
      descriptor = "I"
   )
   public static int field3574 = 0;
   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field3575 = false;
   @OriginalMember(
      owner = "client!kea",
      name = "d",
      descriptor = "Lgh;"
   )
   public static class572 field3570 = new class572(83, -2);
   @OriginalMember(
      owner = "client!kea",
      name = "h",
      descriptor = "I"
   )
   public static int field3569;
   @OriginalMember(
      owner = "client!kea",
      name = "b",
      descriptor = "I"
   )
   public static int field3572;
   @OriginalMember(
      owner = "client!kea",
      name = "e",
      descriptor = "I"
   )
   public static int field3576;

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2017(int arg0, int arg1) {
      try {
         ++field3569;
         if (arg0 != -2) {
            return false;
         } else {
            return arg1 == 0 || ~arg1 == -2 || arg1 == 2;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3577[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(Ljfa;ZZ)V"
   )
   public static final void method2018(class303 arg0, boolean arg1, boolean arg2) {
      try {
         ++field3576;
         if (!arg2) {
            field3574 = 27;
         }

         int var3 = arg0.field4289 == 0 ? arg0.field4308 : arg0.field4289;
         int var4 = ~arg0.field4372 == -1 ? arg0.field4226 : arg0.field4372;
         class641.method4692(class253.field3608[arg0.field4263 >> 16], arg0.field4263, arg1, var4, !arg2, var3);
         if (arg0.field4322 != null) {
            class641.method4692(arg0.field4322, arg0.field4263, arg1, var4, false, var3);
         }

         class719 var5 = (class719)class520.field7582.method1572((long)arg0.field4263, -16289);
         if (var5 != null) {
            class763.method5509(var3, var5.field10375, 107, arg1, var4);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3577[3] + (arg0 != null ? field3577[4] : field3577[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field3572;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3577[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2019(int arg0) {
      try {
         field3570 = null;
         if (arg0 != -18906) {
            field3575 = false;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3577[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class248(String arg0, int arg1) {
      try {
         this.field3573 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3577[6] + (arg0 != null ? field3577[4] : field3577[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2020(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2021(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
