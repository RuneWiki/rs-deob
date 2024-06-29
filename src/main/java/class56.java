import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class56 extends class588 {
   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1121 = new String[]{method646(method645("\f\u0005S\u0017eL")), method646(method645("\u001f@\u001c\u0017P")), method646(method645("\n\u001b^U")), method646(method645("\f\u0005S\u0017lL")), method646(method645("\f\u0005S\u0017oL"))};
   @OriginalMember(
      owner = "client!hka",
      name = "x",
      descriptor = "Luw;"
   )
   public static class435 field1112 = new class435(54, 4);
   @OriginalMember(
      owner = "client!hka",
      name = "p",
      descriptor = "Lfd;"
   )
   public static class551 field1113 = new class551();
   @OriginalMember(
      owner = "client!hka",
      name = "u",
      descriptor = "I"
   )
   public static int field1117;
   @OriginalMember(
      owner = "client!hka",
      name = "v",
      descriptor = "I"
   )
   private int field1118;
   @OriginalMember(
      owner = "client!hka",
      name = "t",
      descriptor = "I"
   )
   public static int field1119;
   @OriginalMember(
      owner = "client!hka",
      name = "r",
      descriptor = "Ldfa;"
   )
   public static class173 field1115;
   @OriginalMember(
      owner = "client!hka",
      name = "q",
      descriptor = "Ltd;"
   )
   public static class476 field1120;
   @OriginalMember(
      owner = "client!hka",
      name = "w",
      descriptor = "Lcc;"
   )
   public static class760 field1116;
   @OriginalMember(
      owner = "client!hka",
      name = "s",
      descriptor = "Ljava/lang/String;"
   )
   private String field1114;

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(Lwga;I)V"
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         arg0.method5627(this.field1118, (byte)-82, this.field1114);
         if (arg1 > -120) {
            this.field1114 = null;
         }

         ++field1117;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field1121[4] + (arg0 != null ? field1121[1] : field1121[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         this.field1118 = arg1.method3567(31871);
         ++field1119;
         this.field1114 = arg1.method3566(-16496688);
         int var3 = -8 / ((arg0 - -26) / 33);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1121[0] + arg0 + ',' + (arg1 != null ? field1121[1] : field1121[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method644(byte arg0) {
      try {
         field1116 = null;
         field1112 = null;
         field1113 = null;
         field1115 = null;
         field1120 = null;
         if (arg0 > -64) {
            field1113 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1121[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method645(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method646(char[] arg0) {
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
            var10005 = 110;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
