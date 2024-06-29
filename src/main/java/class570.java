import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class570 extends class546 {
   @OriginalMember(
      owner = "client!ac",
      name = "w",
      descriptor = "I"
   )
   public int field7861;
   @OriginalMember(
      owner = "client!ac",
      name = "u",
      descriptor = "Lli;"
   )
   public class455 field7859;
   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7864 = new String[]{method4097(method4096("TWs\u001al")), method4097(method4096("TWs\u0002l")), method4097(method4096("TWs\u0003l")), method4097(method4096("TWs\u001bl")), method4097(method4096("[A1'")), method4097(method4096("TWsw-[])ul")), method4097(method4096("N\u001ase9"))};
   @OriginalMember(
      owner = "client!ac",
      name = "v",
      descriptor = "Lnw;"
   )
   public static class616 field7860 = new class616(67, 4);
   @OriginalMember(
      owner = "client!ac",
      name = "x",
      descriptor = "I"
   )
   public static int field7858;
   @OriginalMember(
      owner = "client!ac",
      name = "y",
      descriptor = "I"
   )
   public static int field7862;
   @OriginalMember(
      owner = "client!ac",
      name = "t",
      descriptor = "I"
   )
   public static int field7863;

   @OriginalMember(
      owner = "client!ac",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method4092(boolean arg0) {
      try {
         ++field7858;
         if (!class355.field5068) {
            class606.method4424(class110.field1395, 68);
            if (class194.field2364 != null) {
               class606.method4424(class194.field2364, 71);
            }

            if (arg0) {
               field7860 = null;
            }

            class355.field5068 = true;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7864[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "f",
      descriptor = "(I)Z"
   )
   public abstract boolean method1078(int arg0);

   @OriginalMember(
      owner = "client!ac",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method4093(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field7863;
         int var2 = 0;
         if (var1) {
            class244.field3057[var2] = true;
            ++var2;
         }

         while(true) {
            while(var2 < 100) {
               class244.field3057[var2] = true;
               ++var2;
            }

            if (!var1) {
               if (arg0 != -30624) {
                  field7860 = null;
                  return;
               }

               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7864[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "<init>",
      descriptor = "(Lli;I)V"
   )
   public class570(class455 arg0, int arg1) {
      try {
         this.field7861 = arg1;
         this.field7859 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7864[5] + (arg0 != null ? field7864[6] : field7864[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "c",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public abstract Object method1079(byte arg0);

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4094(int arg0) {
      try {
         if (arg0 != 0) {
            method4094(115);
         }

         field7860 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7864[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method4095(byte arg0) {
      try {
         ++class123.field1534;
         ++field7862;
         if (arg0 != -58) {
            field7860 = null;
         }

         class223 var1 = class355.method2790(13111);
         class471 var2 = class133.method1118(var1.field2787, 2, class350.field5011);
         var2.field6527.method4318(0, arg0 ^ -58);
         var1.method1702((byte)-125, var2);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7864[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4096(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4097(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
