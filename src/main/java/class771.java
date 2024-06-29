import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class771 extends class505 {
   @OriginalMember(
      owner = "client!ob",
      name = "v",
      descriptor = "Ljava/lang/String;"
   )
   private String field11345 = null;
   @OriginalMember(
      owner = "client!ob",
      name = "u",
      descriptor = "J"
   )
   private long field11344 = -1L;
   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11349 = new String[]{method5576(method5575("^taz\u0010")), method5576(method5575("^tas\u0010")), method5576(method5575("_c#^")), method5576(method5575("J8a\u001cE")), method5576(method5575("^tau\u0010")), method5576(method5575("\u0011{*_ZTd!SUT,")), method5576(method5575("\\s\"P]C~.AP\u000b"))};
   @OriginalMember(
      owner = "client!ob",
      name = "y",
      descriptor = "B"
   )
   private byte field11347;
   @OriginalMember(
      owner = "client!ob",
      name = "t",
      descriptor = "I"
   )
   public static int field11342;
   @OriginalMember(
      owner = "client!ob",
      name = "w",
      descriptor = "I"
   )
   private int field11343;
   @OriginalMember(
      owner = "client!ob",
      name = "x",
      descriptor = "I"
   )
   public static int field11346;
   @OriginalMember(
      owner = "client!ob",
      name = "s",
      descriptor = "I"
   )
   public static int field11348;

   @OriginalMember(
      owner = "client!ob",
      name = "c",
      descriptor = "(I)Lgk;",
      line = 6
   )
   public static final class503 method5574(int arg0) {
      try {
         class625.field9187 = arg0;
         ++field11348;
         return class72.method663(1000);
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11349[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(ILwf;)V",
      line = 16
   )
   public final void method1338(int arg0, class147 arg1) {
      try {
         if (arg1.method1143(-15465) != 255) {
            --arg1.field1856;
            this.field11344 = arg1.method1207(false);
         }

         ++field11342;
         this.field11345 = arg1.method1175(6781);
         this.field11343 = arg1.method1211(-26166);
         this.field11347 = arg1.method1162(4);
         if (arg0 <= 105) {
            this.method1338(98, (class147)null);
         }

         arg1.method1207(false);
         if (class327.field4470) {
            System.out.println(field11349[6] + this.field11344 + field11349[5] + this.field11345);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11349[4] + arg0 + ',' + (arg1 != null ? field11349[3] : field11349[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "a",
      descriptor = "(Ldda;Z)V",
      line = 53
   )
   public final void method1339(class405 arg0, boolean arg1) {
      try {
         ++field11346;
         class578 var3 = new class578();
         if (!arg1) {
            this.method1339((class405)null, true);
         }

         var3.field8530 = this.field11347;
         var3.field8533 = this.field11343;
         var3.field8532 = this.field11345;
         arg0.method3057(-24875, var3);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11349[1] + (arg0 != null ? field11349[3] : field11349[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5575(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ob",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5576(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
