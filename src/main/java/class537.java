import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public abstract class class537 extends class347 {
   @OriginalMember(
      owner = "client!jq",
      name = "n",
      descriptor = "Ljagtheora/ogg/OggStreamState;"
   )
   public OggStreamState field7847;
   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7856 = new String[]{method3986(method3985("\u000fmp$\u0013")), method3986(method3985("\u001a62f")), method3986(method3985("\u001e2p@F")), method3986(method3985("\u001e2pAF")), method3986(method3985("\u001e2pFF")), method3986(method3985("\u001e2p6\u0007\u001a**4F"))};
   @OriginalMember(
      owner = "client!jq",
      name = "k",
      descriptor = "Lsda;"
   )
   public static class269 field7849 = new class269(29, 3);
   @OriginalMember(
      owner = "client!jq",
      name = "q",
      descriptor = "I"
   )
   public static int field7853 = 0;
   @OriginalMember(
      owner = "client!jq",
      name = "m",
      descriptor = "Lom;"
   )
   public static class392 field7851 = new class392();
   @OriginalMember(
      owner = "client!jq",
      name = "i",
      descriptor = "[F"
   )
   public static float[] field7855 = new float[16];
   @OriginalMember(
      owner = "client!jq",
      name = "p",
      descriptor = "Ldw;"
   )
   public static class748 field7854 = new class748(4);
   @OriginalMember(
      owner = "client!jq",
      name = "o",
      descriptor = "I"
   )
   public int field7848;
   @OriginalMember(
      owner = "client!jq",
      name = "j",
      descriptor = "I"
   )
   public static int field7850;
   @OriginalMember(
      owner = "client!jq",
      name = "l",
      descriptor = "I"
   )
   public static int field7852;

   @OriginalMember(
      owner = "client!jq",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class537(OggStreamState arg0) {
      try {
         this.field7847 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7856[5] + (arg0 != null ? field7856[0] : field7856[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method1467(int arg0);

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(I)Ljj;"
   )
   public static final class128 method3982(int arg0) {
      try {
         ++field7852;
         if (arg0 != 29) {
            method3982(-93);
         }

         class128 var1 = class427.method3256(9614);
         var1.method1071(0L, -360854133);
         var1.method1101(class397.field6109, -60);
         var1.method1071(class256.field3450, -360854133);
         var1.method1071(class401.field6165, -360854133);
         var1.method1040(class791.field11486, class447.field6799, (byte)-106);
         return var1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7856[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;B)V"
   )
   public final void method3983(OggPacket arg0, byte arg1) {
      try {
         this.method1468(arg0, 0);
         ++field7850;
         if (arg1 != 44) {
            this.method1468((OggPacket)null, 122);
         }

         ++this.field7848;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7856[2] + (arg0 != null ? field7856[0] : field7856[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3984(byte arg0) {
      try {
         field7854 = null;
         field7849 = null;
         field7855 = null;
         int var1 = -108 % ((51 - arg0) / 51);
         field7851 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7856[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jq",
      name = "a",
      descriptor = "(Ljagtheora/ogg/OggPacket;I)V"
   )
   public abstract void method1468(OggPacket arg0, int arg1);

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3985(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3986(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
