import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class341 extends class40 {
   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5197 = new String[]{method2763(method2762("+\u0017yC\u0001")), method2763(method2762("+\u0017yF\u0001")), method2763(method2762("+\u0017yE\u0001"))};
   @OriginalMember(
      owner = "client!jr",
      name = "s",
      descriptor = "D"
   )
   public static double field5193;
   @OriginalMember(
      owner = "client!jr",
      name = "t",
      descriptor = "D"
   )
   public static double field5194;
   @OriginalMember(
      owner = "client!jr",
      name = "p",
      descriptor = "I"
   )
   public static int field5190;
   @OriginalMember(
      owner = "client!jr",
      name = "r",
      descriptor = "I"
   )
   public static int field5191;
   @OriginalMember(
      owner = "client!jr",
      name = "u",
      descriptor = "I"
   )
   public static int field5195;
   @OriginalMember(
      owner = "client!jr",
      name = "o",
      descriptor = "I"
   )
   public static int field5196;
   @OriginalMember(
      owner = "client!jr",
      name = "q",
      descriptor = "[[B"
   )
   public static byte[][] field5192;

   @OriginalMember(
      owner = "client!jr",
      name = "<init>",
      descriptor = "(Lrr;Lrr;Lpg;)V",
      line = 10
   )
   public class341(class678 arg0, class678 arg1, class725 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(ZIIB)V",
      line = 15
   )
   public final void method279(boolean arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field5191;
         int var5 = this.method286((byte)-115) * super.field485.field8820 / 10000;
         class351.field5356.method631(arg2, arg1 + 2, var5, super.field485.field8811 + -2, ((class725)super.field485).field10849, 0);
         if (arg3 >= -125) {
            method2761((byte)-4);
         }

         class351.field5356.method631(arg2 + var5, arg1 + 2, -var5 + super.field485.field8820, super.field485.field8811 + -2, 0, 0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5197[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "d",
      descriptor = "(B)V",
      line = 29
   )
   public static void method2761(byte arg0) {
      try {
         if (arg0 != 18) {
            field5190 = 13;
         }

         field5192 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field5197[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "a",
      descriptor = "(IIIZ)V",
      line = 39
   )
   public final void method278(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field5196;
         class351.field5356.method602(arg1 - 2, arg2, super.field485.field8820 + 4, super.field485.field8811 + 2, ((class725)super.field485).field10847, 0);
         class351.field5356.method602(arg1 + -1, arg2 - -1, super.field485.field8820 + 2, super.field485.field8811, 0, 0);
         if (arg0 != -24843) {
            this.method278(-24, -7, 39, true);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5197[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2762(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2763(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
