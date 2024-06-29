import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class760 extends class435 {
   @OriginalMember(
      owner = "client!aca",
      name = "o",
      descriptor = "I"
   )
   private int field10997 = 0;
   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11000 = new String[]{method5469(method5468("^+\u0012*@\u0017")), method5469(method5468("Q=\u001fh")), method5469(method5468("Df]*t")), method5469(method5468("^+\u0012*J\u0017")), method5469(method5468("^+\u0012*M\u0017"))};
   @OriginalMember(
      owner = "client!aca",
      name = "l",
      descriptor = "I"
   )
   public static int field10994 = 0;
   @OriginalMember(
      owner = "client!aca",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field10998 = new int[1];
   @OriginalMember(
      owner = "client!aca",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field10999 = new int[14];
   @OriginalMember(
      owner = "client!aca",
      name = "q",
      descriptor = "I"
   )
   public static int field10995;
   @OriginalMember(
      owner = "client!aca",
      name = "m",
      descriptor = "I"
   )
   public static int field10996;

   @OriginalMember(
      owner = "client!aca",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5466(int arg0) {
      try {
         if (arg0 != 0) {
            field10999 = null;
         }

         field10999 = null;
         field10998 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11000[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "<init>",
      descriptor = "(Lqh;Ldp;)V"
   )
   public class760(class74 arg0, class3 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(BLjava/lang/String;)Z"
   )
   public static final boolean method5467(byte arg0, String arg1) {
      try {
         if (arg0 > -107) {
            field10999 = null;
         }

         ++field10996;
         return class56.method432(arg1, 11203, true, 10);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field11000[3] + arg0 + ',' + (arg1 != null ? field11000[2] : field11000[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method906(int arg0, boolean arg1) {
      try {
         ++field10995;
         int var3 = super.field6051.field129.method1433(super.field6047.method2125(), class698.field10190, 1) - -super.field6051.field131;
         if (arg0 != 29560) {
            method5467((byte)51, (String)null);
         }

         int var4 = super.field6051.field128.method1325(super.field6047.method2129(), class420.field5892, 8599) + super.field6051.field132;
         super.field6047.method5478((float)(var3 + super.field6047.method2125() / 2), (float)(super.field6047.method2129() / 2 + var4), 4096, this.field10997);
         this.field10997 += ((class3)super.field6051).field17;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field11000[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5468(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5469(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
