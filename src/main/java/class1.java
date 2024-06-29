import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class1 extends class96 {
   @OriginalMember(
      owner = "client!ko",
      name = "v",
      descriptor = "Lhaa;"
   )
   public class3 field3;
   @OriginalMember(
      owner = "client!ko",
      name = "x",
      descriptor = "Lrf;"
   )
   public class34 field6;
   @OriginalMember(
      owner = "client!ko",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11 = new String[]{method4(method3("1pnHR")), method4(method3("!1nZF$74X\u0007")), method4(method3("$+,\n")), method4(method3("!1n$\u0007")), method4(method3("!1n'\u0007"))};
   @OriginalMember(
      owner = "client!ko",
      name = "w",
      descriptor = "I"
   )
   public int field1;
   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "I"
   )
   public int field2;
   @OriginalMember(
      owner = "client!ko",
      name = "t",
      descriptor = "I"
   )
   public static int field4;
   @OriginalMember(
      owner = "client!ko",
      name = "r",
      descriptor = "I"
   )
   public int field7;
   @OriginalMember(
      owner = "client!ko",
      name = "s",
      descriptor = "I"
   )
   public int field8;
   @OriginalMember(
      owner = "client!ko",
      name = "y",
      descriptor = "I"
   )
   public int field9;
   @OriginalMember(
      owner = "client!ko",
      name = "u",
      descriptor = "Lsa;"
   )
   public static class39 field5;
   @OriginalMember(
      owner = "client!ko",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field10;

   @OriginalMember(
      owner = "client!ko",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1(int arg0) {
      try {
         this.field9 = this.field3.field27;
         this.field8 = this.field3.field25;
         ++field4;
         this.field7 = this.field3.field30;
         if (this.field3.field28 != null) {
            this.field3.field28.method330(this.field6.field499, this.field6.field500, this.field6.field501, class261.field4005);
         }

         this.field1 = class261.field4005[arg0];
         this.field2 = class261.field4005[2];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method2(int arg0) {
      try {
         field5 = null;
         if (arg0 >= -109) {
            field10 = false;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "<init>",
      descriptor = "(Lhaa;Lwl;)V"
   )
   public class1(class3 arg0, class532 arg1) {
      try {
         this.field3 = arg0;
         this.field6 = this.field3.method12((byte)-93);
         this.method1(0);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11[1] + (arg0 != null ? field11[0] : field11[2]) + ',' + (arg1 != null ? field11[0] : field11[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ko",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
