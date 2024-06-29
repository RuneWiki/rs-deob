import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class87 {
   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1194 = new String[]{method824(method823("NRd\u0018d")), method824(method823("NRd\u0019d")), method824(method823("NRd\u001ad"))};
   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "Lae;"
   )
   public static class285 field1189 = new class285(method824(method823("cz\u001c\u0019")), 0);
   @OriginalMember(
      owner = "client!aa",
      name = "e",
      descriptor = "I"
   )
   public static int field1192 = 0;
   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "[Ltja;"
   )
   public static class496[] field1193 = new class496[37];
   @OriginalMember(
      owner = "client!aa",
      name = "f",
      descriptor = "Laka;"
   )
   public static class418 field1190 = new class418(103, -2);
   @OriginalMember(
      owner = "client!aa",
      name = "d",
      descriptor = "I"
   )
   public static int field1188;
   @OriginalMember(
      owner = "client!aa",
      name = "c",
      descriptor = "I"
   )
   public static int field1191;

   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method819(int arg0) {
      try {
         if (arg0 > -79) {
            method821(true, 110, -114);
         }

         field1190 = null;
         field1193 = null;
         field1189 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1194[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "()V"
   )
   public static final void method820() {
      for(int var0 = 0; var0 < class315.field4362; ++var0) {
         class680 var1 = class156.field2017[var0];
         class663.method4843(var1, true);
         class156.field2017[var0] = null;
      }

      class315.field4362 = 0;
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(ZII)I"
   )
   public static final int method821(boolean arg0, int arg1, int arg2) {
      try {
         ++field1188;
         int var3 = arg2 * 57 + arg1;
         int var4 = var3 ^ var3 << 13;
         if (arg0) {
            method820();
         }

         int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
         return (133740951 & var5) >> 19;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1194[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method822(int arg0) {
      try {
         ++field1191;
         ++class657.field9800;
         class325.field4465 = true;
         if (arg0 != 103) {
            field1189 = null;
         }

         return true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1194[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method823(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method824(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
