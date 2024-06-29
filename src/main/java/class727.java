import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class727 {
   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10468 = new String[]{method5257(method5256("qzZ}L")), method5257(method5256("qzZzL")), method5257(method5256("qzZxL")), method5257(method5256("qzZ|L")), method5257(method5256("qzZ{L"))};
   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "D"
   )
   public static double field10463;
   @OriginalMember(
      owner = "client!ih",
      name = "c",
      descriptor = "I"
   )
   public static int field10461;
   @OriginalMember(
      owner = "client!ih",
      name = "f",
      descriptor = "I"
   )
   public static int field10462;
   @OriginalMember(
      owner = "client!ih",
      name = "b",
      descriptor = "I"
   )
   public static int field10464;
   @OriginalMember(
      owner = "client!ih",
      name = "g",
      descriptor = "I"
   )
   public static int field10465;
   @OriginalMember(
      owner = "client!ih",
      name = "e",
      descriptor = "I"
   )
   public static int field10466;
   @OriginalMember(
      owner = "client!ih",
      name = "d",
      descriptor = "I"
   )
   public static int field10467;

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IIBI)I"
   )
   public static final int method5251(int arg0, int arg1, byte arg2, int arg3) {
      try {
         ++field10467;
         if (arg0 == arg3) {
            return arg0;
         } else {
            int var4 = -arg1 + 128;
            int var5 = (127 & arg0) * var4 + (arg3 & 127) * arg1 >> 7;
            int var6 = (arg0 & 896) * var4 + (arg3 & 896) * arg1 >> 7;
            int var7 = -60 % ((58 - arg2) / 60);
            int var8 = (64512 & arg0) * var4 + (arg3 & 64512) * arg1 >> 7;
            return 127 & var5 | 64512 & var8 | var6 & 896;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field10468[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5252(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IIIIIIIIIIII)V"
   )
   public static final void method5253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      try {
         ++field10464;
         if (class28.method199(0, arg0)) {
            if (arg5 != 127) {
               field10461 = -42;
            }

            if (class327.field4684[arg0] == null) {
               client.method2460(class253.field3608[arg0], -1, arg7, arg10, arg8, arg4, arg3, arg11, arg2, arg6, arg9, arg1);
            } else {
               client.method2460(class327.field4684[arg0], -1, arg7, arg10, arg8, arg4, arg3, arg11, arg2, arg6, arg9, arg1);
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field10468[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5254(int arg0, byte arg1) {
      try {
         class48.field1043 = arg0;
         class3.field22 = -1;
         if (arg1 < -39) {
            ++field10462;
            class3.field22 = -1;
            class632.method4645(15);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10468[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5255(int arg0) {
      try {
         if (arg0 == 127) {
            class625.field9095.method297(1.1523438F * (0.7F + (float)class510.field7454.field11154.method1043(false) * 0.1F));
            ++field10465;
            class625.field9095.method337(class306.field4424, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
            class625.field9095.method424(class127.field2131, -1, 0);
            class625.field9095.method402(class191.field2892);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10468[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5256(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ih",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5257(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
