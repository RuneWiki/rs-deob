import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class226 {
   @OriginalMember(
      owner = "client!ew",
      name = "c",
      descriptor = "Llj;"
   )
   private class304 field3441 = new class304(64);
   @OriginalMember(
      owner = "client!ew",
      name = "d",
      descriptor = "Lrr;"
   )
   private class678 field3438;
   @OriginalMember(
      owner = "client!ew",
      name = "e",
      descriptor = "Lrr;"
   )
   private class678 field3437;
   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3442 = new String[]{method1960(method1959("<]^+5")), method1960(method1959("<]^(5")), method1960(method1959("7_\u001c\u0005")), method1960(method1959("<]^Ut7C\u0004W5")), method1960(method1959("\"\u0004^G`"))};
   @OriginalMember(
      owner = "client!ew",
      name = "f",
      descriptor = "F"
   )
   public static float field3440;
   @OriginalMember(
      owner = "client!ew",
      name = "b",
      descriptor = "I"
   )
   public static int field3436;
   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "[[[J"
   )
   public static long[][][] field3439;

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(II)Lhc;"
   )
   public final class315 method1957(int arg0, int arg1) {
      try {
         ++field3436;
         if (arg1 != 0) {
            method1958(16);
         }

         class315 var3 = (class315)this.field3441.method2544(false, (long)arg0);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label27: {
               if (~arg0 <= -32769) {
                  var4 = this.field3438.method5017(0, arg0 & 32767, (byte)71);
                  if (!client.field1786) {
                     break label27;
                  }
               }

               var4 = this.field3437.method5017(0, arg0, (byte)71);
            }

            class315 var5 = new class315();
            if (var4 != null) {
               var5.method2608(7, new class354(var4));
            }

            if (~arg0 <= -32769) {
               var5.method2612(true);
            }

            this.field3441.method2545((long)arg0, 117, var5);
            return var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3442[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1958(int arg0) {
      try {
         field3439 = null;
         if (arg0 >= -13) {
            field3440 = 0.22515504F;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3442[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "<init>",
      descriptor = "(ILrr;Lrr;)V"
   )
   public class226(int arg0, class678 arg1, class678 arg2) {
      try {
         this.field3438 = arg2;
         this.field3437 = arg1;
         if (this.field3437 != null) {
            this.field3437.method4998((byte)-82, 0);
         }

         if (this.field3438 != null) {
            this.field3438.method4998((byte)-82, 0);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3442[3] + arg0 + ',' + (arg1 != null ? field3442[4] : field3442[2]) + ',' + (arg2 != null ? field3442[4] : field3442[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1959(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ew",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1960(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
