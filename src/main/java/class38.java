import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class38 {
   @OriginalMember(
      owner = "client!uja",
      name = "b",
      descriptor = "J"
   )
   private long field542 = -1L;
   @OriginalMember(
      owner = "client!uja",
      name = "g",
      descriptor = "Lll;"
   )
   private class387 field544 = new class387();
   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field548 = new String[]{method343(method342("\u0010wW#UDgi2Y\n")), method343(method342("K,\tiI")), method343(method342("snF)wXcI)Q\\FB+@Q,F7D\\{s(w\\cI\u0004\\QlI\"X\u0018+\u001dgwBgC\"ZDkF+G\u0010fHgZ_v\u0007*UDaOf\u0014Sa\t$XQlo&GX8")), method343(method342("^wK+")), method343(method342("EhFiv\u0018")), method343(method342("\u0010fB+@Q,D+U^JF4\\\n")), method343(method342("EhFiu\u0018")), method343(method342("EhFi\bYlN3\n\u0018")), method343(method342("EhFiw\u0018")), method343(method342("elU\"W_eI.GUf\u0007\u0004XQld/U^lB+pUnS&\u0014D{W\"\u0014Yl\u0007#QSmC\"\u001c\u0019"))};
   @OriginalMember(
      owner = "client!uja",
      name = "c",
      descriptor = "Llg;"
   )
   public static class437 field546 = new class437();
   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "I"
   )
   public static int field543;
   @OriginalMember(
      owner = "client!uja",
      name = "d",
      descriptor = "I"
   )
   public static int field547;
   @OriginalMember(
      owner = "client!uja",
      name = "e",
      descriptor = "J"
   )
   private long field541;
   @OriginalMember(
      owner = "client!uja",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field545;

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method339(int arg0) {
      try {
         if (arg0 != -1) {
            field545 = null;
         }

         field545 = null;
         field546 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field548[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(ILdda;)V",
      line = 25
   )
   public final void method340(int arg0, class405 arg1) {
      boolean var3 = client.field4360;

      try {
         ++field547;
         if (~this.field541 == ~arg1.field6137 && ~this.field542 == ~arg1.field5843) {
            class505 var4 = (class505)this.field544.method2933(2);
            if (var3) {
               var4.method1339(arg1, true);
               var4 = (class505)this.field544.method2940(false);
            }

            while(true) {
               if (var4 == null) {
                  if (!var3) {
                     if (arg0 != 3) {
                        this.field544 = null;
                     }

                     ++arg1.field5843;
                     return;
                  }
               } else {
                  var4.method1339(arg1, true);
               }

               var4 = (class505)this.field544.method2940(false);
            }
         } else {
            throw new RuntimeException(field548[2] + arg1.field6137 + field548[0] + arg1.field5843 + field548[5] + this.field541 + field548[0] + this.field542);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field548[4] + arg0 + ',' + (arg1 != null ? field548[1] : field548[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(ILwf;)V",
      line = 50
   )
   private final void method341(int param1, class147 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!uja",
      name = "<init>",
      descriptor = "(Lwf;)V",
      line = 101
   )
   public class38(class147 arg0) {
      try {
         this.method341(-1, arg0);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field548[7] + (arg0 != null ? field548[1] : field548[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method342(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method343(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
