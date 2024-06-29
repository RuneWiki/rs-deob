import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class790 implements class644 {
   @OriginalMember(
      owner = "client!wia",
      name = "d",
      descriptor = "I"
   )
   public int field11549;
   @OriginalMember(
      owner = "client!wia",
      name = "h",
      descriptor = "Lfk;"
   )
   public class678 field11547;
   @OriginalMember(
      owner = "client!wia",
      name = "j",
      descriptor = "I"
   )
   public int field11551;
   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "I"
   )
   public int field11546;
   @OriginalMember(
      owner = "client!wia",
      name = "b",
      descriptor = "Lqda;"
   )
   public class112 field11550;
   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11554 = new String[]{method5687(method5686("p7x;\r/")), method5687(method5686("i+uy")), method5687(method5686("|p7;3")), method5687(method5686("p7x;rn0pap/")), method5687(method5686("p7x;\u000f/")), method5687(method5686("p7x;\f/"))};
   @OriginalMember(
      owner = "client!wia",
      name = "c",
      descriptor = "Lgh;"
   )
   public static class572 field11545 = new class572(51, -1);
   @OriginalMember(
      owner = "client!wia",
      name = "f",
      descriptor = "Luw;"
   )
   public static class435 field11552 = new class435(76, 3);
   @OriginalMember(
      owner = "client!wia",
      name = "i",
      descriptor = "I"
   )
   public static int field11553 = 0;
   @OriginalMember(
      owner = "client!wia",
      name = "g",
      descriptor = "I"
   )
   public static int field11544;
   @OriginalMember(
      owner = "client!wia",
      name = "e",
      descriptor = "I"
   )
   public static int field11548;

   @OriginalMember(
      owner = "client!wia",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5684(int arg0) {
      try {
         field11545 = null;
         field11552 = null;
         if (arg0 != -14611) {
            method5685(-82);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11554[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(I)Lsda;"
   )
   public static final class269 method5685(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field11544;
         if (class370.field5489 != null && class98.field1551 != null) {
            class269 var2 = (class269)class98.field1551.method5004(-10649);
            if (!var1 && var2 == null) {
               if (arg0 != -1) {
                  method5685(15);
               }

               return null;
            } else {
               do {
                  class155 var3 = class370.field5480.method3207(var2.field3806, 36);
                  if (var3 != null && var3.field2476 && var3.method1433(class370.field5483, -21)) {
                     return var2;
                  }

                  var2 = (class269)class98.field1551.method5004(-10649);
               } while(var2 != null);

               if (arg0 != -1) {
                  method5685(15);
               }

               return null;
            }
         } else {
            return null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11554[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(B)Lqg;"
   )
   public class485 method672(byte arg0) {
      try {
         ++field11548;
         if (arg0 != 83) {
            method5684(55);
         }

         return class431.field6249;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field11554[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "<init>",
      descriptor = "(ILfk;Lqda;II)V"
   )
   public class790(int arg0, class678 arg1, class112 arg2, int arg3, int arg4) {
      try {
         this.field11549 = arg0;
         this.field11547 = arg1;
         this.field11551 = arg4;
         this.field11546 = arg3;
         this.field11550 = arg2;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field11554[3] + arg0 + ',' + (arg1 != null ? field11554[2] : field11554[1]) + ',' + (arg2 != null ? field11554[2] : field11554[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5686(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5687(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 25;
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
