import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class599 extends class207 {
   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8811 = new String[]{method4385(method4384("t&!L!")), method4385(method4384("lz! t")), method4385(method4384("y!cb")), method4385(method4384("t&!M!")), method4385(method4384("t&!O!")), method4385(method4384("t&!K!")), method4385(method4384("t&!J!"))};
   @OriginalMember(
      owner = "client!cr",
      name = "s",
      descriptor = "J"
   )
   public static long field8806 = 0L;
   @OriginalMember(
      owner = "client!cr",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field8808 = new int[5];
   @OriginalMember(
      owner = "client!cr",
      name = "q",
      descriptor = "I"
   )
   public static int field8804;
   @OriginalMember(
      owner = "client!cr",
      name = "o",
      descriptor = "I"
   )
   public static int field8805;
   @OriginalMember(
      owner = "client!cr",
      name = "r",
      descriptor = "I"
   )
   public static int field8807;
   @OriginalMember(
      owner = "client!cr",
      name = "t",
      descriptor = "I"
   )
   public static int field8809;
   @OriginalMember(
      owner = "client!cr",
      name = "n",
      descriptor = "Ljava/lang/String;"
   )
   private String field8810;

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(Lfa;Z)V"
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         arg0.field3114 = this.field8810;
         if (arg1) {
            ++field8809;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8811[0] + (arg0 != null ? field8811[1] : field8811[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(Ljj;Z)V"
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         this.field8810 = arg0.method1083((byte)76);
         ++field8807;
         if (!arg1) {
            this.field8810 = null;
         }

         arg0.method1041(4758);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8811[4] + (arg0 != null ? field8811[1] : field8811[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method4381(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg0 < -116) {
            ++field8804;
            if (arg1 == arg2) {
               class429.method3269(arg5, 126, arg3, arg4, arg2);
            } else if (~(-arg2 + arg4) <= ~class197.field2442 && ~class100.field1232 <= ~(arg2 + arg4) && ~(arg3 - arg1) <= ~class506.field7472 && ~(arg1 + arg3) >= ~class22.field234) {
               class332.method2518(arg3, 75, arg2, arg5, arg4, arg1);
            } else {
               class111.method945(arg5, (byte)102, arg4, arg3, arg2, arg1);
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8811[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "c",
      descriptor = "(III)I"
   )
   public static final int method4382(int arg0, int arg1, int arg2) {
      try {
         ++field8805;
         int var3 = arg2 >>> 24;
         int var8 = (16711680 & (arg2 & 65280) * var3 | -16711936 & (16711935 & arg2) * var3) >>> 8;
         int var4 = 59 % ((arg0 - 9) / 53);
         int var5 = -var3 + 255;
         return ((-16711936 & (arg1 & 16711935) * var5 | 16711680 & (arg1 & 65280) * var5) >>> 8) + var8;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8811[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4383(int arg0) {
      try {
         if (arg0 >= 62) {
            field8808 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8811[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4384(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4385(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
