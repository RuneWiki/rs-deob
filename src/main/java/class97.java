import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class97 extends class750 {
   @OriginalMember(
      owner = "client!in",
      name = "m",
      descriptor = "I"
   )
   public int field1193;
   @OriginalMember(
      owner = "client!in",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public String field1197;
   @OriginalMember(
      owner = "client!in",
      name = "o",
      descriptor = "S"
   )
   public short field1192;
   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1199 = new String[]{method858(method857("Lx1d\n")), method858(method857("KcsL")), method858(method857("^81\u000e_")), method858(method857("Lx1e\n")), method858(method857("Lx1b\n")), method858(method857("Lx1\u001cKK\u007fk\u001e\n"))};
   @OriginalMember(
      owner = "client!in",
      name = "n",
      descriptor = "I"
   )
   public static int field1194 = 0;
   @OriginalMember(
      owner = "client!in",
      name = "t",
      descriptor = "Lpd;"
   )
   public static class268 field1195 = new class268();
   @OriginalMember(
      owner = "client!in",
      name = "s",
      descriptor = "I"
   )
   public static int field1191;
   @OriginalMember(
      owner = "client!in",
      name = "r",
      descriptor = "I"
   )
   public static int field1196;
   @OriginalMember(
      owner = "client!in",
      name = "q",
      descriptor = "Leaa;"
   )
   public static class526 field1198;

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(ILeaa;IZIII)V"
   )
   public static final void method853(int arg0, class526 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
      try {
         class560.field8372 = arg2;
         ++field1191;
         class357.field5407 = arg0;
         if (arg4 != -26632) {
            field1198 = null;
         }

         class67.field837 = arg1;
         class660.field9569 = arg3;
         class9.field136 = arg5;
         class660.field9563 = null;
         class668.field10055 = arg6;
         class627.field9106 = 1;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1199[3] + arg0 + ',' + (arg1 != null ? field1199[2] : field1199[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method854(byte arg0) {
      try {
         field1195 = null;
         field1198 = null;
         if (arg0 >= -112) {
            method856(-49, -124, 20);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1199[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method855(int arg0) {
      int var1 = client.field4530;

      try {
         if (class26.field282 != null) {
            class494[] var2 = class26.field282;
            int var3 = 0;
            if (var1 != 0 || var3 < var2.length) {
               do {
                  class494 var4 = var2[var3];
                  var4.method2189(-12552);
                  ++var3;
               } while(var3 < var2.length);
            }
         }

         if (arg0 != 0) {
            field1194 = -72;
         }

         ++field1196;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1199[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(III)Ltea;"
   )
   public static final class249 method856(int arg0, int arg1, int arg2) {
      class72 var3 = class353.field5360[arg0][arg1][arg2];
      return var3 != null && var3.field919 != null ? var3.field919 : null;
   }

   @OriginalMember(
      owner = "client!in",
      name = "<init>",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public class97(String arg0, int arg1) {
      try {
         this.field1193 = (int)(class188.method1462(true) / 1000L);
         this.field1197 = arg0;
         this.field1192 = (short)arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1199[5] + (arg0 != null ? field1199[2] : field1199[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method857(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method858(char[] arg0) {
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
            var10005 = 22;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
