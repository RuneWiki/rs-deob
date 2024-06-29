import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class795 extends class294 {
   @OriginalMember(
      owner = "client!gda",
      name = "n",
      descriptor = "Lefa;"
   )
   public class466 field11592;
   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11594 = new String[]{method5744(method5743("\u0017!\u0017vb")), method5744(method5743("\u0002zU4")), method5744(method5743("\u000bkXv#\u0005aP,!D")), method5744(method5743("\u000bkXv]D")), method5744(method5743("\u000bkXv^D"))};
   @OriginalMember(
      owner = "client!gda",
      name = "p",
      descriptor = "I"
   )
   public static int field11590 = -1;
   @OriginalMember(
      owner = "client!gda",
      name = "o",
      descriptor = "[[Z"
   )
   public static boolean[][] field11593 = new boolean[][]{{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13]};
   @OriginalMember(
      owner = "client!gda",
      name = "m",
      descriptor = "I"
   )
   public static int field11591;

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5741(byte arg0) {
      try {
         class475.field7226.method2554(-121);
         if (arg0 <= 3) {
            method5742(-36);
         }

         ++field11591;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11594[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5742(int arg0) {
      try {
         int var1 = -101 % ((arg0 - -22) / 45);
         field11593 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11594[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "(Lefa;)V"
   )
   public class795(class466 arg0) {
      try {
         this.field11592 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11594[2] + (arg0 != null ? field11594[0] : field11594[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5743(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5744(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
