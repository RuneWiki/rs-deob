import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class211 {
   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2631 = new String[]{method1611(method1610("@cX_-\u001a")), method1611(method1610("\\pU\u001d")), method1611(method1610("I+\u0017_\u0011")), method1611(method1610("{kO\u0010\u0000[a\u001966{U\u0019\u0019\tSa\\\u0003M")), method1611(method1610("@cX_.\u001a")), method1611(method1610("{kO\u0010\u0000[a\u001966{U\u0019\u0012\u0003_uK\u0014\u001fA`]Q\bSqXP"))};
   @OriginalMember(
      owner = "client!rfa",
      name = "e",
      descriptor = "I"
   )
   public static int field2626 = 0;
   @OriginalMember(
      owner = "client!rfa",
      name = "c",
      descriptor = "I"
   )
   public static int field2628;
   @OriginalMember(
      owner = "client!rfa",
      name = "d",
      descriptor = "I"
   )
   public static int field2629;
   @OriginalMember(
      owner = "client!rfa",
      name = "b",
      descriptor = "I"
   )
   public static int field2630;
   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "Ljava/util/zip/Inflater;"
   )
   private Inflater field2627;

   @OriginalMember(
      owner = "client!rfa",
      name = "<init>",
      descriptor = "()V"
   )
   public class211() {
      this(-1, 1000000, 1000000);
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "([BI)[B"
   )
   public final byte[] method1608(byte[] arg0, int arg1) {
      try {
         if (arg1 != 11351) {
            return null;
         } else {
            ++field2628;
            class594 var3 = new class594(arg0);
            var3.field8243 = arg0.length - 4;
            int var4 = var3.method4322(arg1 + -1165431583);
            var3.field8243 = 0;
            byte[] var5 = new byte[var4];
            this.method1609(14911, var5, var3);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2631[0] + (arg0 != null ? field2631[2] : field2631[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(I[BLwm;)V"
   )
   public final void method1609(int arg0, byte[] arg1, class594 arg2) {
      try {
         ++field2629;
         if (arg2.field8227[arg2.field8243] == 31 && ~arg2.field8227[arg2.field8243 + 1] == 116) {
            if (this.field2627 == null) {
               this.field2627 = new Inflater(true);
            }

            try {
               if (arg0 != 14911) {
                  return;
               }

               this.field2627.setInput(arg2.field8227, arg2.field8243 + 10, arg2.field8227.length + -8 + -arg2.field8243 + -10);
               this.field2627.inflate(arg1);
            } catch (Exception var5) {
               this.field2627.reset();
               throw new RuntimeException(field2631[5]);
            }

            this.field2627.reset();
         } else {
            throw new RuntimeException(field2631[3]);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2631[4] + arg0 + ',' + (arg1 != null ? field2631[2] : field2631[1]) + ',' + (arg2 != null ? field2631[2] : field2631[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "<init>",
      descriptor = "(III)V"
   )
   private class211(int arg0, int arg1, int arg2) {
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1610(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1611(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
