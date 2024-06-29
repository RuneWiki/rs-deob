import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class399 {
   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5494 = new String[]{method3137(method3136("yj\u0010\u0003N")), method3137(method3136("yj\u0010\u0000N"))};
   @OriginalMember(
      owner = "client!vb",
      name = "d",
      descriptor = "F"
   )
   public static float field5490;
   @OriginalMember(
      owner = "client!vb",
      name = "c",
      descriptor = "F"
   )
   public static float field5491;
   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "I"
   )
   public static int field5489;
   @OriginalMember(
      owner = "client!vb",
      name = "b",
      descriptor = "I"
   )
   public static int field5492;
   @OriginalMember(
      owner = "client!vb",
      name = "e",
      descriptor = "I"
   )
   public static int field5493;

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method3134(byte arg0, boolean arg1) {
      try {
         ++field5489;
         if (class532.field7800 == null) {
            class86.method815(-127);
         }

         if (arg1) {
            class532.field7800.method728((byte)23);
         }

         if (arg0 != -112) {
            method3135(-84, (byte)26, -102);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5494[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method3135(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 >= 106) {
            ++field5492;
            class487 var3 = class2.method12((long)arg0, 13, (byte)43);
            var3.method3694(-21792);
            var3.field6794 = arg2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5494[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3136(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3137(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
