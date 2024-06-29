import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class711 implements class490 {
   @OriginalMember(
      owner = "client!q",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   private String field10692;
   @OriginalMember(
      owner = "client!q",
      name = "c",
      descriptor = "Lrr;"
   )
   private class678 field10687;
   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10695 = new String[]{method5259(method5258("\u0003\u0019\u0001!")), method5259(method5258("\u001cB,e")), method5259(method5258("\t\u0019n'E")), method5259(method5258("\u0003\u0019\u0002!")), method5259(method5258("\u0003\u0019\u0004!")), method5259(method5258("\u0003\u0019\u0003!")), method5259(method5258("\u0003\u0019|`V\u001bC~!"))};
   @OriginalMember(
      owner = "client!q",
      name = "g",
      descriptor = "I"
   )
   public static int field10688;
   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "I"
   )
   public static int field10689;
   @OriginalMember(
      owner = "client!q",
      name = "d",
      descriptor = "I"
   )
   public static int field10690;
   @OriginalMember(
      owner = "client!q",
      name = "e",
      descriptor = "I"
   )
   public static int field10691;
   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "I"
   )
   public static int field10693;
   @OriginalMember(
      owner = "client!q",
      name = "h",
      descriptor = "[[[Lika;"
   )
   public static class190[][][] field10694;

   @OriginalMember(
      owner = "client!q",
      name = "b",
      descriptor = "(I)Lhba;",
      line = 3
   )
   public final class430 method3794(int arg0) {
      try {
         if (arg0 != 13943) {
            field10690 = -48;
         }

         ++field10688;
         return class430.field6637;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10695[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(B)V",
      line = 15
   )
   public static void method5256(byte arg0) {
      try {
         if (arg0 != 16) {
            method5257((Component)null, false);
         }

         field10694 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10695[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(Ljava/awt/Component;Z)Lnj;",
      line = 30
   )
   public static final class31 method5257(Component arg0, boolean arg1) {
      try {
         if (!arg1) {
            field10691 = 48;
         }

         ++field10689;
         return new class231(arg0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10695[0] + (arg0 != null ? field10695[2] : field10695[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "a",
      descriptor = "(I)I",
      line = 42
   )
   public final int method3797(int arg0) {
      try {
         if (arg0 <= 62) {
            field10691 = 58;
         }

         ++field10693;
         return this.field10687.method5009(this.field10692, 29704) ? 100 : this.field10687.method5012((byte)104, this.field10692);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10695[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "<init>",
      descriptor = "(Lrr;Ljava/lang/String;)V",
      line = 63
   )
   public class711(class678 arg0, String arg1) {
      try {
         this.field10692 = arg1;
         this.field10687 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10695[6] + (arg0 != null ? field10695[2] : field10695[1]) + ',' + (arg1 != null ? field10695[2] : field10695[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5258(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!q",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5259(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 9;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
