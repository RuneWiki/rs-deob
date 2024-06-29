import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class713 {
   @OriginalMember(
      owner = "client!vm",
      name = "d",
      descriptor = "Lmt;"
   )
   public class414 field10342 = new class414();
   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10347 = new String[]{method5184(method5183("i\u0002(DO")), method5184(method5183("q\u001aji")), method5184(method5183("i\u0002(GO")), method5184(method5183("dA(+\u001a"))};
   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field10344 = new Color[]{new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277)};
   @OriginalMember(
      owner = "client!vm",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field10346 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   @OriginalMember(
      owner = "client!vm",
      name = "e",
      descriptor = "I"
   )
   public static int field10343;
   @OriginalMember(
      owner = "client!vm",
      name = "b",
      descriptor = "Lsm;"
   )
   public static class297 field10345;

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5181(int arg0) {
      try {
         if (arg0 != 14670) {
            field10344 = null;
         }

         field10345 = null;
         field10346 = null;
         field10344 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10347[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(ILjfa;Ljfa;)V"
   )
   public static final void method5182(int arg0, class303 arg1, class303 arg2) {
      try {
         ++field10343;
         ++class121.field1949;
         class542 var3 = class549.method4093((byte)-113, class304.field4403, class126.field2108);
         var3.field7859.method3540(arg1.field4263, 898075920);
         var3.field7859.method3540(arg2.field4263, arg0 + 898075918);
         var3.field7859.method3555(arg2.field4265, (byte)109);
         var3.field7859.method3541(-23112, arg2.field4346);
         var3.field7859.method3550(arg1.field4346, 29620);
         if (arg0 != 2) {
            method5182(-122, (class303)null, (class303)null);
         }

         var3.field7859.method3550(arg1.field4265, 29620);
         class740.method5332(var3, (byte)77);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10347[2] + arg0 + ',' + (arg1 != null ? field10347[3] : field10347[1]) + ',' + (arg2 != null ? field10347[3] : field10347[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5183(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5184(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
