import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class36 extends class15 {
   @OriginalMember(
      owner = "client!lha",
      name = "B",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field515 = method278(method277("\b\bo\u001bBL"));
   @OriginalMember(
      owner = "client!lha",
      name = "G",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field501 = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
   @OriginalMember(
      owner = "client!lha",
      name = "H",
      descriptor = "I"
   )
   public static int field513 = 0;
   @OriginalMember(
      owner = "client!lha",
      name = "A",
      descriptor = "I"
   )
   public int field497;
   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "I"
   )
   public int field499;
   @OriginalMember(
      owner = "client!lha",
      name = "K",
      descriptor = "I"
   )
   public static int field502;
   @OriginalMember(
      owner = "client!lha",
      name = "E",
      descriptor = "I"
   )
   public int field504;
   @OriginalMember(
      owner = "client!lha",
      name = "w",
      descriptor = "I"
   )
   public int field509;
   @OriginalMember(
      owner = "client!lha",
      name = "D",
      descriptor = "I"
   )
   public int field510;
   @OriginalMember(
      owner = "client!lha",
      name = "u",
      descriptor = "I"
   )
   public int field511;
   @OriginalMember(
      owner = "client!lha",
      name = "x",
      descriptor = "I"
   )
   public static int field514;
   @OriginalMember(
      owner = "client!lha",
      name = "I",
      descriptor = "Ll;"
   )
   public class292 field503;
   @OriginalMember(
      owner = "client!lha",
      name = "y",
      descriptor = "Lww;"
   )
   public static class339 field507;
   @OriginalMember(
      owner = "client!lha",
      name = "J",
      descriptor = "Ljava/lang/String;"
   )
   public String field500;
   @OriginalMember(
      owner = "client!lha",
      name = "C",
      descriptor = "[I"
   )
   public int[] field508;
   @OriginalMember(
      owner = "client!lha",
      name = "F",
      descriptor = "[I"
   )
   public int[] field512;
   @OriginalMember(
      owner = "client!lha",
      name = "v",
      descriptor = "[J"
   )
   public long[] field505;
   @OriginalMember(
      owner = "client!lha",
      name = "s",
      descriptor = "[Lhv;"
   )
   public class227[] field506;
   @OriginalMember(
      owner = "client!lha",
      name = "t",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field498;

   @OriginalMember(
      owner = "client!lha",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method276(int arg0) {
      try {
         field501 = null;
         field507 = null;
         if (arg0 != 16777215) {
            field507 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field515 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method277(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method278(char[] arg0) {
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
            var10005 = 96;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
