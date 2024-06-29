import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class296 extends class385 {
   @OriginalMember(
      owner = "client!wha",
      name = "h",
      descriptor = "I"
   )
   private int field4147;
   @OriginalMember(
      owner = "client!wha",
      name = "i",
      descriptor = "I"
   )
   private int field4144;
   @OriginalMember(
      owner = "client!wha",
      name = "q",
      descriptor = "I"
   )
   private int field4148;
   @OriginalMember(
      owner = "client!wha",
      name = "j",
      descriptor = "I"
   )
   private int field4145;
   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4155 = new String[]{method2314(method2313("\u0013|\u0014\u0002nL")), method2314(method2313("\u0013|\u0014\u0002lL")), method2314(method2313("\u0013|\u0014\u0002kL")), method2314(method2313("\u0013|\u0014\u0002hL")), method2314(method2313("\u0013|\u0014\u0002\u0016\rz\u001cX\u0014L"))};
   @OriginalMember(
      owner = "client!wha",
      name = "k",
      descriptor = "Ltv;"
   )
   public static class584 field4146 = new class584(4);
   @OriginalMember(
      owner = "client!wha",
      name = "l",
      descriptor = "[Lria;"
   )
   public static class299[] field4153 = new class299[37];
   @OriginalMember(
      owner = "client!wha",
      name = "r",
      descriptor = "I"
   )
   public static int field4154 = 0;
   @OriginalMember(
      owner = "client!wha",
      name = "p",
      descriptor = "I"
   )
   public static int field4143;
   @OriginalMember(
      owner = "client!wha",
      name = "o",
      descriptor = "I"
   )
   public static int field4149;
   @OriginalMember(
      owner = "client!wha",
      name = "m",
      descriptor = "I"
   )
   public static int field4150;
   @OriginalMember(
      owner = "client!wha",
      name = "n",
      descriptor = "Lda;"
   )
   public static class66 field4151;
   @OriginalMember(
      owner = "client!wha",
      name = "s",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field4152;

   @OriginalMember(
      owner = "client!wha",
      name = "b",
      descriptor = "(B)V",
      line = 10
   )
   public static void method2312(byte arg0) {
      try {
         field4151 = null;
         field4146 = null;
         if (arg0 != -106) {
            field4153 = null;
         }

         field4153 = null;
         field4152 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4155[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "<init>",
      descriptor = "(IIIIIII)V",
      line = 25
   )
   public class296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      super(arg4, arg5, arg6);

      try {
         this.field4147 = arg1;
         this.field4144 = arg3;
         this.field4148 = arg2;
         this.field4145 = arg0;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field4155[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(IBI)V",
      line = 38
   )
   public final void method2108(int arg0, byte arg1, int arg2) {
      try {
         ++field4149;
         int var4 = 103 / ((arg1 - -3) / 51);
         int var5 = this.field4145 * arg2 >> 12;
         int var6 = this.field4148 * arg2 >> 12;
         int var7 = this.field4147 * arg0 >> 12;
         int var8 = this.field4144 * arg0 >> 12;
         class540.method4042(var7, super.field5687, var8, super.field5688, var6, var5, super.field5689, (byte)-99);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field4155[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(III)V",
      line = 56
   )
   public final void method2104(int arg0, int arg1, int arg2) {
      try {
         if (arg2 == 5598) {
            ++field4143;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4155[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "a",
      descriptor = "(BII)V",
      line = 70
   )
   public final void method2103(byte arg0, int arg1, int arg2) {
      try {
         ++field4150;
         if (arg0 != -38) {
            this.method2108(-128, (byte)-8, 44);
         }

         int var4 = this.field4145 * arg1 >> 12;
         int var5 = this.field4148 * arg1 >> 12;
         int var6 = this.field4147 * arg2 >> 12;
         int var7 = this.field4144 * arg2 >> 12;
         class30.method221((byte)104, var6, var4, var7, var5, super.field5689);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field4155[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2313(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2314(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
