import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class777 implements class775 {
   @OriginalMember(
      owner = "client!wo",
      name = "f",
      descriptor = "Lkf;"
   )
   private class266 field11390;
   @OriginalMember(
      owner = "client!wo",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   private String field11394;
   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11396 = new String[]{method5601(method5600("7#\u0006;3")), method5601(method5600(";b\u0006)'\"d\\+f")), method5601(method5600("\"xDy")), method5601(method5600(";b\u0006Vf")), method5601(method5600(";b\u0006Wf")), method5601(method5600(";b\u0006Pf"))};
   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field11392 = new class118(51, 6);
   @OriginalMember(
      owner = "client!wo",
      name = "e",
      descriptor = "Leg;"
   )
   public static class118 field11395 = new class118(14, 1);
   @OriginalMember(
      owner = "client!wo",
      name = "d",
      descriptor = "I"
   )
   public static int field11391;
   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "I"
   )
   public static int field11393;

   @OriginalMember(
      owner = "client!wo",
      name = "b",
      descriptor = "(I)I",
      line = 3
   )
   public final int method2561(int arg0) {
      try {
         ++field11391;
         if (arg0 != -29119) {
            return -86;
         } else {
            return this.field11390.method2058(-127, this.field11394) ? 100 : 0;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11396[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(I)Ltfa;",
      line = 18
   )
   public final class36 method2559(int arg0) {
      try {
         ++field11393;
         if (arg0 != -24883) {
            this.field11394 = null;
         }

         return class36.field512;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11396[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "()V",
      line = 34
   )
   public static final void method5598() {
      class146.field1851 = class146.field1847;
   }

   @OriginalMember(
      owner = "client!wo",
      name = "c",
      descriptor = "(I)V",
      line = 37
   )
   public static void method5599(int arg0) {
      try {
         field11392 = null;
         field11395 = null;
         if (arg0 != 14) {
            method5599(53);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11396[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "<init>",
      descriptor = "(Lkf;Ljava/lang/String;)V",
      line = 52
   )
   public class777(class266 arg0, String arg1) {
      try {
         this.field11390 = arg0;
         this.field11394 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11396[1] + (arg0 != null ? field11396[0] : field11396[2]) + ',' + (arg1 != null ? field11396[0] : field11396[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5600(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5601(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 13;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
