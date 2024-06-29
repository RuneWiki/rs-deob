import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public abstract class class173 {
   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2675 = new String[]{method1549(method1548("=\"`\nz\u001bl")), method1549(method1548("=\"`\ny\u001bl"))};
   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2672 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   @OriginalMember(
      owner = "client!dfa",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field2674 = new int[14];
   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "I"
   )
   public static int field2673;
   @OriginalMember(
      owner = "client!dfa",
      name = "d",
      descriptor = "Lqda;"
   )
   public static class112 field2671;

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(IBIII)I",
      line = 25
   )
   public static final int method1546(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      try {
         ++field2673;
         if (arg1 >= -35) {
            field2672 = null;
         }

         int var5 = 15 & arg0;
         int var6 = var5 >= 8 ? arg3 : arg4;
         int var7 = var5 >= 4 ? (~var5 != -13 && var5 != 14 ? arg2 : arg4) : arg3;
         return (~(1 & var5) == -1 ? var6 : -var6) - -(~(2 & var5) != -1 ? -var7 : var7);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field2675[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(B)V",
      line = 45
   )
   public static void method1547(byte arg0) {
      try {
         field2674 = null;
         if (arg0 > -123) {
            field2672 = null;
         }

         field2671 = null;
         field2672 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2675[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method981(int arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method994(int arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "e",
      descriptor = "(I)V"
   )
   public abstract void method1005(int arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(Ldfa;)V"
   )
   public abstract void method982(class173 arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public abstract void method997(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!dfa",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method1002(int arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "c",
      descriptor = "(III[I)V"
   )
   public abstract void method1001(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(III[I)V"
   )
   public abstract void method986(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "()Ldfa;"
   )
   public abstract class173 method999();

   @OriginalMember(
      owner = "client!dfa",
      name = "f",
      descriptor = "(I)V"
   )
   public abstract void method998(int arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "(III)V"
   )
   public abstract void method990(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "()V"
   )
   public abstract void method979();

   @OriginalMember(
      owner = "client!dfa",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method1015(int arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "b",
      descriptor = "(III[I)V"
   )
   public abstract void method988(int arg0, int arg1, int arg2, int[] arg3);

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "([I)V"
   )
   public abstract void method976(int[] arg0);

   @OriginalMember(
      owner = "client!dfa",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method1008(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1548(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1549(char[] arg0) {
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
            var10005 = 68;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
