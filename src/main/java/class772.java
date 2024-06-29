import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class772 {
   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11356 = new String[]{method5582(method5581("6\u00059iL")), method5582(method5581("6\u00059jL")), method5582(method5581("6\u00059lL")), method5582(method5581("6\u00059kL"))};
   @OriginalMember(
      owner = "client!fl",
      name = "f",
      descriptor = "Leg;"
   )
   public static class118 field11353 = new class118(100, 3);
   @OriginalMember(
      owner = "client!fl",
      name = "b",
      descriptor = "I"
   )
   public static int field11350;
   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "I"
   )
   public static int field11351;
   @OriginalMember(
      owner = "client!fl",
      name = "e",
      descriptor = "I"
   )
   public static int field11355;
   @OriginalMember(
      owner = "client!fl",
      name = "d",
      descriptor = "Lgl;"
   )
   public class627 field11352;
   @OriginalMember(
      owner = "client!fl",
      name = "c",
      descriptor = "Lfl;"
   )
   public class772 field11354;

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5577(byte arg0) {
      try {
         if (arg0 <= 101) {
            this.field11352 = null;
         }

         ++field11351;
         if (class653.field9570 < 500) {
            this.field11354 = class598.field8787;
            this.field11352 = null;
            class598.field8787 = this;
            ++class653.field9570;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11356[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5578(int arg0) {
      try {
         if (arg0 != 15751) {
            method5579(false);
         }

         class116.field1444 = null;
         ++field11355;
         class385.field5596 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11356[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5579(boolean arg0) {
      try {
         if (!arg0) {
            field11353 = null;
         }

         field11353 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11356[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method5580(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -2129536883) {
            method5579(true);
         }

         ++field11350;
         int var3 = arg1 * 57 + arg2;
         int var4 = var3 ^ var3 << 13;
         int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
         return 255 & var5 >> 19;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11356[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5581(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5582(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
