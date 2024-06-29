import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class341 {
   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4854 = method2639(method2638("h:9\u0013A"));
   @OriginalMember(
      owner = "client!fp",
      name = "c",
      descriptor = "I"
   )
   public static int field4853 = 328;
   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "I"
   )
   public static int field4851;
   @OriginalMember(
      owner = "client!fp",
      name = "b",
      descriptor = "I"
   )
   public static int field4852;

   @OriginalMember(
      owner = "client!fp",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2637(int arg0) {
      try {
         ++field4851;
         class201.field3017.method3967(77);
         class193.field2905.method4686(false);
         class604.field8696.method1142(19824);
         class634.field9256.method2556(5390);
         class373.field5547.method2061(1);
         class408.field5993.method848(-2);
         class588.field8496.method3780(14);
         class760.field11030.method3419((byte)127);
         class440.field6431.method2068(59);
         class516.field7514.method5503((byte)120);
         class252.field3601.method1508(9);
         class424.field6167.method1729((byte)-74);
         class126.field2114.method5060((byte)53);
         class542.field7856.method3210(96);
         class681.field9992.method3915(105);
         class559.field8143.method3264(64);
         class300.field4199.method4151((byte)108);
         class29.field455.method5154(114);
         int var1 = 67 / ((arg0 - -34) / 61);
         class543.field7876.method3648((byte)126);
         class549.field7930.method1856(-115);
         class354.field4998.method190(true);
         class307.field4434.method5046((byte)-50);
         class339.method2622((byte)-120);
         class604.method4447(-71);
         class766.method5542(-14818);
         class210.method1785(0);
         class320.method2497((byte)74);
         class375.field5580.method1591((byte)58);
         class11.field112.method1591((byte)58);
         class530.field7713.method1591((byte)58);
         class217.field3287.method1591((byte)58);
         class161.field2557.method1591((byte)58);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4854 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2638(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2639(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
