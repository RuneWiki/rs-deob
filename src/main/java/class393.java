import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class393 {
   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "I"
   )
   public int field5965;
   @OriginalMember(
      owner = "client!mv",
      name = "e",
      descriptor = "Lck;"
   )
   private class667 field5966;
   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5967 = new String[]{method3005(method3004("H$2\u0018\u0007")), method3005(method3004("H$2?FK3p0U@z")), method3005(method3004("^|2wR")), method3005(method3004("K'p5")), method3005(method3004("H$2eFK;hg\u0007")), method3005(method3004("H$2\u001a\u0007")), method3005(method3004("H$2\u001b\u0007"))};
   @OriginalMember(
      owner = "client!mv",
      name = "g",
      descriptor = "I"
   )
   public static int field5959 = 0;
   @OriginalMember(
      owner = "client!mv",
      name = "f",
      descriptor = "I"
   )
   public static int field5960;
   @OriginalMember(
      owner = "client!mv",
      name = "b",
      descriptor = "I"
   )
   public static int field5961;
   @OriginalMember(
      owner = "client!mv",
      name = "d",
      descriptor = "I"
   )
   public static int field5963;
   @OriginalMember(
      owner = "client!mv",
      name = "h",
      descriptor = "I"
   )
   public static int field5964;
   @OriginalMember(
      owner = "client!mv",
      name = "c",
      descriptor = "[[[B"
   )
   public static byte[][][] field5962;

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3001(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -1) {
            field5959 = 29;
         }

         ++field5961;
         if (class647.method4669(arg0, (byte)-72)) {
            class281.method2150(arg2, 0, class136.field1744[arg0]);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5967[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(IIIB)I"
   )
   public static final int method3002(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field5960;
         if (~(8 & class65.field797[arg0][arg2][arg1]) != -1) {
            return 0;
         } else if (arg0 > 0 && (2 & class65.field797[1][arg2][arg1]) != 0) {
            return arg0 + -1;
         } else {
            if (arg3 > -4) {
               field5964 = -4;
            }

            return arg0;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5967[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3003(byte arg0) {
      try {
         if (arg0 < 73) {
            method3001(63, -62, -98);
         }

         field5962 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5967[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field5963;
         this.field5966.method4792((byte)5, this.field5965);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5967[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "<init>",
      descriptor = "(Lck;II)V"
   )
   public class393(class667 arg0, int arg1, int arg2) {
      try {
         this.field5965 = arg2;
         this.field5966 = arg0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field5967[4] + (arg0 != null ? field5967[2] : field5967[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3004(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3005(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
