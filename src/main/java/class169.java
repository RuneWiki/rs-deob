import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class169 extends class246 {
   @OriginalMember(
      owner = "client!uq",
      name = "l",
      descriptor = "I"
   )
   public int field2638;
   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2642 = new String[]{method1528(method1527("\u0001=\u001c5O")), method1528(method1527("\u000fb\u001cZ\u001a")), method1528(method1527("\u0014f^w")), method1528(method1527("\u000fb\u001c_\u001a")), method1528(method1527("\u000fb\u001cY\u001a")), method1528(method1527("\u000fb\u001cX\u001a")), method1528(method1527("\u000fb\u001c'[\u0014zF%\u001a"))};
   @OriginalMember(
      owner = "client!uq",
      name = "j",
      descriptor = "Liw;"
   )
   public static class332 field2637 = new class332();
   @OriginalMember(
      owner = "client!uq",
      name = "o",
      descriptor = "I"
   )
   public static int field2636;
   @OriginalMember(
      owner = "client!uq",
      name = "k",
      descriptor = "I"
   )
   public static int field2639;
   @OriginalMember(
      owner = "client!uq",
      name = "m",
      descriptor = "I"
   )
   public static int field2641;
   @OriginalMember(
      owner = "client!uq",
      name = "n",
      descriptor = "Lhw;"
   )
   public static class141 field2640;

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "([SI)[S",
      line = 6
   )
   public static final short[] method1523(short[] arg0, int arg1) {
      try {
         ++field2639;
         if (arg0 == null) {
            return null;
         } else {
            if (arg1 != -1633) {
               method1526((String)null, -22);
            }

            short[] var2 = new short[arg0.length];
            class365.method2859(arg0, 0, var2, 0, arg0.length);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2642[5] + (arg0 != null ? field2642[0] : field2642[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(I)V",
      line = 25
   )
   public static final void method1524(int arg0) {
      try {
         ++field2641;
         if (class285.field3970 != null) {
            if (~class285.field3970.field11542 == -2) {
               class285.field3970 = null;
               return;
            }

            if (~class285.field3970.field11542 == -3) {
               class39.method475(client.field4557, 9226, class39.field936, 2);
               class285.field3970 = null;
               return;
            }
         }

         if (arg0 >= -117) {
            field2637 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2642[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(B)V",
      line = 52
   )
   public static void method1525(byte arg0) {
      try {
         if (arg0 >= -96) {
            method1523((short[])null, 104);
         }

         field2640 = null;
         field2637 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2642[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V",
      line = 63
   )
   public static final void method1526(String arg0, int arg1) {
      try {
         ++field2636;
         class542 var2 = class44.method560(16);
         var2.field7859.method3571(255, class485.field7055.field7915);
         var2.field7859.method3550(0, 29620);
         int var3 = var2.field7859.field6907;
         var2.field7859.method3550(653, 29620);
         if (arg1 > -86) {
            field2640 = null;
         }

         int[] var4 = class318.method2486(var2, 2);
         int var5 = var2.field7859.field6907;
         var2.field7859.method3546((byte)-127, arg0);
         var2.field7859.method3571(255, class385.field5684);
         var2.field7859.field6907 += 7;
         var2.field7859.method3552((byte)-97, var2.field7859.field6907, var4, var5);
         var2.field7859.method3560(-var3 + var2.field7859.field6907, 27995);
         class740.method5332(var2, (byte)77);
         class487.field7080 = 1;
         class518.field7548 = 0;
         class349.field4968 = -3;
         class608.field8731 = 0;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field2642[1] + (arg0 != null ? field2642[0] : field2642[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "<init>",
      descriptor = "(I)V",
      line = 100
   )
   public class169(int arg0) {
      try {
         this.field2638 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2642[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1527(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1528(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
