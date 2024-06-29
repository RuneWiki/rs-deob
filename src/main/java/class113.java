import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class113 extends class409 {
   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1510 = new String[]{method1019(method1018("-\u0012P]k")), method1019(method1018(".\r\u0012p")), method1019(method1018("-\u0012PZk")), method1019(method1018(";VP2>")), method1019(method1018("-\u0012P_k"))};
   @OriginalMember(
      owner = "client!mj",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field1502 = new int[1];
   @OriginalMember(
      owner = "client!mj",
      name = "r",
      descriptor = "I"
   )
   public static int field1508 = 0;
   @OriginalMember(
      owner = "client!mj",
      name = "v",
      descriptor = "I"
   )
   public static int field1504;
   @OriginalMember(
      owner = "client!mj",
      name = "y",
      descriptor = "I"
   )
   public static int field1505;
   @OriginalMember(
      owner = "client!mj",
      name = "w",
      descriptor = "I"
   )
   public static int field1506;
   @OriginalMember(
      owner = "client!mj",
      name = "t",
      descriptor = "I"
   )
   public static int field1507;
   @OriginalMember(
      owner = "client!mj",
      name = "u",
      descriptor = "I"
   )
   public static int field1509;
   @OriginalMember(
      owner = "client!mj",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field1503;

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(ILjagtheora/ogg/OggPacket;)V"
   )
   public final void method1015(int arg0, OggPacket arg1) {
      try {
         if (arg0 != 0) {
            this.method1015(16, (OggPacket)null);
         }

         ++field1505;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1510[2] + arg0 + ',' + (arg1 != null ? field1510[3] : field1510[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "<init>",
      descriptor = "(Ljagtheora/ogg/OggStreamState;)V"
   )
   public class113(OggStreamState arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mj",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1016(int arg0) {
      try {
         field1502 = null;
         if (arg0 <= 118) {
            method1016(55);
         }

         field1503 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1510[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1017(int arg0) {
      try {
         ++field1507;
         if (arg0 > -126) {
            field1506 = 94;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1510[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1018(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1019(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
