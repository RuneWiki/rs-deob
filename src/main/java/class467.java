import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class467 extends class775 {
   @OriginalMember(
      owner = "client!qi",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7113 = new String[]{method3629(method3628("\u0000\u001bm2N")), method3629(method3628("\n\\m]\u001b")), method3629(method3628("\u0015@/p")), method3629(method3628("\n\\m_\u001b")), method3629(method3628("\n\\mX\u001b")), method3629(method3628("\n\\mZ\u001b")), method3629(method3628("\n\\mY\u001b")), method3629(method3628("\n\\m^\u001b"))};
   @OriginalMember(
      owner = "client!qi",
      name = "C",
      descriptor = "B"
   )
   public static byte field7106;
   @OriginalMember(
      owner = "client!qi",
      name = "x",
      descriptor = "I"
   )
   public static int field7103;
   @OriginalMember(
      owner = "client!qi",
      name = "D",
      descriptor = "I"
   )
   public static int field7104;
   @OriginalMember(
      owner = "client!qi",
      name = "A",
      descriptor = "I"
   )
   public static int field7105;
   @OriginalMember(
      owner = "client!qi",
      name = "t",
      descriptor = "I"
   )
   public static int field7109;
   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "I"
   )
   public static int field7110;
   @OriginalMember(
      owner = "client!qi",
      name = "v",
      descriptor = "I"
   )
   public static int field7111;
   @OriginalMember(
      owner = "client!qi",
      name = "u",
      descriptor = "I"
   )
   public static int field7112;
   @OriginalMember(
      owner = "client!qi",
      name = "w",
      descriptor = "Lrr;"
   )
   public static class678 field7107;
   @OriginalMember(
      owner = "client!qi",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   private String field7108;

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(IIII)I",
      line = 4
   )
   public static final int method3624(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field7110;
         int var7 = arg3 & 3;
         if (var7 == 0) {
            return arg0;
         } else {
            int var4 = 63 % ((-35 - arg2) / 33);
            if (var7 == 1) {
               return arg1;
            } else {
               return ~var7 == -3 ? -arg0 + 4095 : -arg1 + 4095;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7113[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(Lica;B)V",
      line = 30
   )
   public final void method1189(class354 arg0, byte arg1) {
      try {
         ++field7112;
         int var3 = -33 % ((arg1 - -84) / 34);
         this.field7108 = arg0.method2843(-1);
         arg0.method2894(99);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7113[3] + (arg0 != null ? field7113[0] : field7113[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "b",
      descriptor = "(B)V",
      line = 46
   )
   public static final void method3625(byte arg0) {
      try {
         ++field7111;
         if (arg0 < 33) {
            method3625((byte)-9);
         }

         class603.field8813.method2554(-120);
         class630.field9118.method2554(-112);
         class58.field722.method2554(-101);
         class361.field5595.method2554(-119);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7113[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(Lsda;I)V",
      line = 60
   )
   public final void method1190(class223 arg0, int arg1) {
      try {
         ++field7104;
         int var3 = -78 % ((-23 - arg1) / 45);
         arg0.field3365 = this.field7108;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7113[1] + (arg0 != null ? field7113[0] : field7113[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(I)V",
      line = 77
   )
   public static void method3626(int arg0) {
      try {
         if (arg0 != 4095) {
            method3627(-31, 70);
         }

         field7107 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7113[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "a",
      descriptor = "(II)V",
      line = 91
   )
   public static final void method3627(int arg0, int arg1) {
      try {
         ++field7109;
         class332 var2 = (class332)class570.field8426.method3141((long)arg0, true);
         if (var2 != null) {
            var2.field5024 = !var2.field5024;
            var2.field5035.method4079((byte)-65, var2.field5024);
         }

         if (arg1 > -18) {
            method3625((byte)61);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7113[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3628(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 51);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3629(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 28;
            break;
         default:
            var10005 = 51;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
