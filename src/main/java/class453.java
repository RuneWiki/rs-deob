import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class453 {
   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6596 = new String[]{method3495(method3494("@\u0006Y`~\n")), method3495(method3494("L\u0019T\"")), method3495(method3494("YB\u0016`A")), method3495(method3494("@\u0006Y`}\n"))};
   @OriginalMember(
      owner = "client!bja",
      name = "b",
      descriptor = "Leu;"
   )
   public static class634 field6594 = new class634();
   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "I"
   )
   public static int field6593;
   @OriginalMember(
      owner = "client!bja",
      name = "c",
      descriptor = "Lpf;"
   )
   public static class424 field6595;

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(BLob;)I"
   )
   public static final int method3492(byte arg0, class779 arg1) {
      try {
         ++field6593;
         int var2 = 94 % ((-2 - arg0) / 62);
         if (class779.field11363 == arg1) {
            return 5120;
         } else if (class779.field11367 != arg1) {
            if (class779.field11370 == arg1) {
               return 5124;
            } else if (class779.field11371 == arg1) {
               return 5121;
            } else if (class779.field11372 != arg1) {
               if (class779.field11373 == arg1) {
                  return 5125;
               } else if (class779.field11374 != arg1) {
                  if (class779.field11375 == arg1) {
                     return 5126;
                  } else {
                     throw new IllegalArgumentException("");
                  }
               } else {
                  return 5131;
               }
            } else {
               return 5123;
            }
         } else {
            return 5122;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6596[3] + arg0 + ',' + (arg1 != null ? field6596[2] : field6596[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3493(int arg0) {
      try {
         if (arg0 != 30001) {
            field6594 = null;
         }

         field6595 = null;
         field6594 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6596[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3494(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3495(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
