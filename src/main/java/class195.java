import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public abstract class class195 {
   @OriginalMember(
      owner = "client!efa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2373 = new String[]{method1473(method1472("^`+(\u0000\u0013")), method1473(method1472("^`+(\u0001\u0013")), method1473(method1472("@(d(;")), method1473(method1472("^`+(\u000e\u0013")), method1473(method1472("Us&j"))};
   @OriginalMember(
      owner = "client!efa",
      name = "d",
      descriptor = "F"
   )
   public static float field2372;
   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "I"
   )
   public static int field2369;
   @OriginalMember(
      owner = "client!efa",
      name = "b",
      descriptor = "I"
   )
   public static int field2371;
   @OriginalMember(
      owner = "client!efa",
      name = "c",
      descriptor = "Lkh;"
   )
   public static class17 field2370;

   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "(I)J"
   )
   public abstract long method1465(int arg0);

   @OriginalMember(
      owner = "client!efa",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method1466(int arg0);

   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "(JB)I"
   )
   public abstract int method1467(long arg0, byte arg1);

   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "(Lvi;I)V"
   )
   public static final void method1468(class569 arg0, int arg1) {
      try {
         ++field2369;
         int var2 = -class369.field5205 + arg0.field7816;
         int var3 = arg0.field7792 * 512 + 256 * arg0.method3060((byte)38);
         if (arg1 >= 0) {
            int var4 = arg0.field7797 * 512 + arg0.method3060((byte)38) * 256;
            arg0.field1003 += (var4 - arg0.field1003) / var2;
            arg0.field999 += (-arg0.field999 + var3) / var2;
            arg0.field7849 = 0;
            if (~arg0.field7827 == -1) {
               arg0.method4079(8192, -6541);
            }

            if (arg0.field7827 == 1) {
               arg0.method4079(12288, -6541);
            }

            if (~arg0.field7827 == -3) {
               arg0.method4079(0, -6541);
            }

            if (arg0.field7827 == 3) {
               arg0.method4079(4096, -6541);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2373[3] + (arg0 != null ? field2373[2] : field2373[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "b",
      descriptor = "(B)J"
   )
   public abstract long method1469(byte arg0);

   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1470(byte arg0) {
      try {
         field2370 = null;
         if (arg0 < 124) {
            method1470((byte)-23);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2373[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "a",
      descriptor = "(IJ)I"
   )
   public final int method1471(int arg0, long arg1) {
      try {
         ++field2371;
         long var4 = this.method1469((byte)103);
         if ((long)arg0 < var4) {
            class173.method1347(-101, var4);
         }

         return this.method1467(arg1, (byte)111);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2373[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!efa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1472(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!efa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1473(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
