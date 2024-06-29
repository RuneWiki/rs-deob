import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class308 implements class220 {
   @OriginalMember(
      owner = "client!ss",
      name = "g",
      descriptor = "[F"
   )
   public float[] field4315;
   @OriginalMember(
      owner = "client!ss",
      name = "c",
      descriptor = "I"
   )
   public int field4313;
   @OriginalMember(
      owner = "client!ss",
      name = "f",
      descriptor = "I"
   )
   public int field4312;
   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4316 = new String[]{method2467(method2466("U\u001eH8\u0004")), method2467(method2466("U\u001eH:\u0004")), method2467(method2466("U\u001eH9\u0004")), method2467(method2466("U\u001eHGEH\u0004\u0012E\u0004"))};
   @OriginalMember(
      owner = "client!ss",
      name = "b",
      descriptor = "I"
   )
   public static int field4309 = 0;
   @OriginalMember(
      owner = "client!ss",
      name = "d",
      descriptor = "I"
   )
   public static int field4311;
   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "I"
   )
   public static int field4314;
   @OriginalMember(
      owner = "client!ss",
      name = "e",
      descriptor = "Lkr;"
   )
   public static class122 field4310;

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2463(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method2464(int arg0, int arg1) {
      try {
         ++field4311;
         if (arg0 != 16) {
            method2464(-57, -79);
         }

         return ~arg1 == -46 || arg1 == 13 || arg1 == 1004 || ~arg1 == -4 || arg1 == 16;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4316[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2465(int arg0) {
      try {
         if (arg0 > -61) {
            field4310 = null;
         }

         field4310 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4316[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class308(int arg0, int arg1) {
      try {
         this.field4315 = new float[arg0 * arg1];
         this.field4313 = arg0;
         this.field4312 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4316[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2466(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ss",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2467(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
