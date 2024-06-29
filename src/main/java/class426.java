import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class426 extends class47 {
   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6233 = new String[]{method3327(method3326("\u00105\u0002\u0019L")), method3327(method3326("\u0005n@[")), method3327(method3326("\u0007s\u0002s\u0019")), method3327(method3326("\u0007s\u0002p\u0019")), method3327(method3326("\u0007s\u0002v\u0019"))};
   @OriginalMember(
      owner = "client!lh",
      name = "p",
      descriptor = "I"
   )
   public static int field6230;
   @OriginalMember(
      owner = "client!lh",
      name = "q",
      descriptor = "I"
   )
   public static int field6231;
   @OriginalMember(
      owner = "client!lh",
      name = "o",
      descriptor = "I"
   )
   public static int field6232;
   @OriginalMember(
      owner = "client!lh",
      name = "r",
      descriptor = "J"
   )
   public static long field6229;

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method468(int arg0, OggPacket arg1) {
      try {
         if (arg0 != -13313) {
            method3325(41, 45, -34);
         }

         ++field6231;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6233[2] + arg0 + ',' + (arg1 != null ? field6233[0] : field6233[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method471(int arg0) {
      try {
         if (arg0 != -1) {
            method3325(-69, -23, -12);
         }

         ++field6230;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6233[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class426(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lh",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3325(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 33) {
            field6229 = 14L;
         }

         ++field6232;
         return ~(33 & arg1) != -1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6233[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3326(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3327(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
