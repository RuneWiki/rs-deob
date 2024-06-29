import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class604 extends class67 {
   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8833 = new String[]{method4465(method4464("5W6UF")), method4465(method4464("5W6SF")), method4465(method4464("5W6RF")), method4465(method4464("5W6QF")), method4465(method4464("5W6WF")), method4465(method4464("5W6XF")), method4465(method4464("5W6TF")), method4465(method4464(",\r6>\u0013")), method4465(method4464("9Vt|"))};
   @OriginalMember(
      owner = "client!bt",
      name = "k",
      descriptor = "I"
   )
   public static int field8825;
   @OriginalMember(
      owner = "client!bt",
      name = "r",
      descriptor = "I"
   )
   public static int field8826;
   @OriginalMember(
      owner = "client!bt",
      name = "p",
      descriptor = "I"
   )
   public static int field8827;
   @OriginalMember(
      owner = "client!bt",
      name = "l",
      descriptor = "I"
   )
   public static int field8828;
   @OriginalMember(
      owner = "client!bt",
      name = "q",
      descriptor = "I"
   )
   public static int field8829;
   @OriginalMember(
      owner = "client!bt",
      name = "n",
      descriptor = "I"
   )
   public static int field8830;
   @OriginalMember(
      owner = "client!bt",
      name = "m",
      descriptor = "I"
   )
   public static int field8831;
   @OriginalMember(
      owner = "client!bt",
      name = "o",
      descriptor = "I"
   )
   public static int field8832;

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public final void method158(byte arg0) {
      try {
         if (super.field877 != 1 && ~super.field877 != -1) {
            super.field877 = this.method162(0);
         }

         if (arg0 == -69) {
            ++field8832;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8833[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "b",
      descriptor = "(I)I",
      line = 18
   )
   public final int method162(int arg0) {
      try {
         ++field8830;
         return arg0 != 0 ? -63 : 1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8833[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(IZ)V",
      line = 30
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field8831;
         if (!arg1) {
            method4461(35, -23, -26, (class610)null, (byte)-109, 118, 28, -70);
         }

         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8833[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(IIILha;BIII)V",
      line = 44
   )
   public static final void method4461(int arg0, int arg1, int arg2, class610 arg3, byte arg4, int arg5, int arg6, int arg7) {
      try {
         ++field8825;
         if (arg4 == 68) {
            arg3.method4502(arg5, 0, arg1, arg0, arg2, arg6);
            arg3.method4502(arg5 - -1, 0, arg7, arg0 - 2, arg2 - -1, 16);
            arg3.method4500(1, arg0 - 2, arg5 + 1, arg2 + 18, arg6 + -19, arg7);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8833[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8833[7] : field8833[8]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "a",
      descriptor = "(II)I",
      line = 58
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 > -74) {
            this.method158((byte)56);
         }

         ++field8828;
         return 1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8833[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "b",
      descriptor = "(B)V",
      line = 69
   )
   public static final void method4462(byte arg0) {
      try {
         class500.method3881(-22);
         ++field8827;
         int var1 = -37 % ((arg0 - -76) / 48);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8833[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 82
   )
   public class604(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!bt",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 86
   )
   public class604(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!bt",
      name = "c",
      descriptor = "(I)I",
      line = 89
   )
   public final int method4463(int arg0) {
      try {
         if (arg0 != 480102311) {
            return -114;
         } else {
            ++field8826;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8833[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4464(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4465(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
