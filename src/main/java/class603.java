import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class603 implements class26 {
   @OriginalMember(
      owner = "client!ve",
      name = "n",
      descriptor = "I"
   )
   public int field8822;
   @OriginalMember(
      owner = "client!ve",
      name = "h",
      descriptor = "Lgea;"
   )
   public class750 field8815;
   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "I"
   )
   public int field8823;
   @OriginalMember(
      owner = "client!ve",
      name = "d",
      descriptor = "I"
   )
   public int field8819;
   @OriginalMember(
      owner = "client!ve",
      name = "f",
      descriptor = "I"
   )
   public int field8814;
   @OriginalMember(
      owner = "client!ve",
      name = "g",
      descriptor = "I"
   )
   public int field8818;
   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "I"
   )
   public int field8811;
   @OriginalMember(
      owner = "client!ve",
      name = "i",
      descriptor = "Lrga;"
   )
   public class694 field8810;
   @OriginalMember(
      owner = "client!ve",
      name = "k",
      descriptor = "I"
   )
   public int field8820;
   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8824 = new String[]{method4460(method4459("Z*~N\u007f")), method4460(method4459("Wa~!*")), method4460(method4459("Z*~K\u007f")), method4460(method4459("B:<c")), method4460(method4459("Z*~L\u007f")), method4460(method4459("Z*~3>B&$1\u007f"))};
   @OriginalMember(
      owner = "client!ve",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field8816 = new float[4];
   @OriginalMember(
      owner = "client!ve",
      name = "j",
      descriptor = "Llj;"
   )
   public static class304 field8813 = new class304(3000000, 200);
   @OriginalMember(
      owner = "client!ve",
      name = "l",
      descriptor = "I"
   )
   public static int field8812;
   @OriginalMember(
      owner = "client!ve",
      name = "e",
      descriptor = "I"
   )
   public static int field8817;
   @OriginalMember(
      owner = "client!ve",
      name = "m",
      descriptor = "I"
   )
   public static int field8821;

   @OriginalMember(
      owner = "client!ve",
      name = "b",
      descriptor = "(I)V",
      line = 7
   )
   public static void method4457(int arg0) {
      try {
         if (arg0 == -6712) {
            field8816 = null;
            field8813 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8824[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(I)Lbda;",
      line = 21
   )
   public class783 method193(int arg0) {
      try {
         ++field8812;
         return arg0 != -1 ? null : null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8824[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I",
      line = 40
   )
   public static final int method4458(String arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field8821;
         int var3 = 0;
         if (var2) {
            if (class227.field3455[var3].equalsIgnoreCase(arg0)) {
               return var3;
            }

            ++var3;
         }

         while(true) {
            while(var3 < class227.field3455.length) {
               if (class227.field3455[var3].equalsIgnoreCase(arg0)) {
                  return var3;
               }

               ++var3;
            }

            if (!var2) {
               if (arg1 >= -6) {
                  return -32;
               }

               return -1;
            }

            if (arg1 != 0) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8824[2] + (arg0 != null ? field8824[1] : field8824[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "<init>",
      descriptor = "(Lrga;Lgea;IIIIIII)V",
      line = 72
   )
   public class603(class694 arg0, class750 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field8822 = arg7;
         this.field8815 = arg1;
         this.field8823 = arg3;
         this.field8819 = arg2;
         this.field8814 = arg8;
         this.field8818 = arg6;
         this.field8811 = arg5;
         this.field8810 = arg0;
         this.field8820 = arg4;
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field8824[5] + (arg0 != null ? field8824[1] : field8824[3]) + ',' + (arg1 != null ? field8824[1] : field8824[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4459(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ve",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4460(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 15;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
