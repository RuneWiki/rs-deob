import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class450 extends class351 implements class189 {
   @OriginalMember(
      owner = "client!ad",
      name = "h",
      descriptor = "I"
   )
   private int field6224;
   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6225 = new String[]{method3338(method3337("\u0015Xf:{\u001aU<8:")), method3338(method3337("\u000f\u0012f(o")), method3338(method3337("\u001aI$j")), method3338(method3337("\u0015XfG:")), method3338(method3337("\u0015XfE:")), method3338(method3337("\u0015XfN:")), method3338(method3337("\u0015XfK:")), method3338(method3337("\u0015XfL:")), method3338(method3337("\u0015XfJ:"))};
   @OriginalMember(
      owner = "client!ad",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field6218 = new int[200];
   @OriginalMember(
      owner = "client!ad",
      name = "i",
      descriptor = "I"
   )
   public static int field6220 = 0;
   @OriginalMember(
      owner = "client!ad",
      name = "j",
      descriptor = "Lnw;"
   )
   public static class616 field6219 = new class616(34, 6);
   @OriginalMember(
      owner = "client!ad",
      name = "e",
      descriptor = "I"
   )
   public static int field6222 = 0;
   @OriginalMember(
      owner = "client!ad",
      name = "k",
      descriptor = "Ldia;"
   )
   public static class245 field6221 = new class245(32);
   @OriginalMember(
      owner = "client!ad",
      name = "g",
      descriptor = "I"
   )
   public static int field6214;
   @OriginalMember(
      owner = "client!ad",
      name = "d",
      descriptor = "I"
   )
   public static int field6215;
   @OriginalMember(
      owner = "client!ad",
      name = "c",
      descriptor = "I"
   )
   public static int field6216;
   @OriginalMember(
      owner = "client!ad",
      name = "f",
      descriptor = "I"
   )
   public static int field6217;
   @OriginalMember(
      owner = "client!ad",
      name = "m",
      descriptor = "I"
   )
   public static int field6223;

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(III[B)V"
   )
   public final void method748(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         ++field6214;
         if (arg0 >= -103) {
            field6221 = null;
         }

         this.method2766(arg3, arg1);
         this.field6224 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6225[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6225[1] : field6225[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method749(byte arg0) {
      try {
         ++field6216;
         if (arg0 < 82) {
            field6218 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6225[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "<init>",
      descriptor = "(Lor;ILjaclib/memory/Buffer;)V"
   )
   public class450(class670 arg0, int arg1, Buffer arg2) {
      super(arg0, arg2);

      try {
         this.field6224 = arg1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6225[0] + (arg0 != null ? field6225[1] : field6225[2]) + ',' + arg1 + ',' + (arg2 != null ? field6225[1] : field6225[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "<init>",
      descriptor = "(Lor;I[BI)V"
   )
   public class450(class670 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field6224 = arg1;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6225[0] + (arg0 != null ? field6225[1] : field6225[2]) + ',' + arg1 + ',' + (arg2 != null ? field6225[1] : field6225[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method3335(byte arg0) {
      try {
         ++field6215;
         class270.field3517.method4244(true);
         class663.field9447.method4244(true);
         class276.field3680.method4244(true);
         class56.field603.method4244(true);
         if (arg0 != 63) {
            method3335((byte)-5);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6225[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3336(int arg0) {
      try {
         if (arg0 != 200) {
            method3335((byte)105);
         }

         field6219 = null;
         field6218 = null;
         field6221 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6225[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method752(byte arg0) {
      try {
         int var2 = -41 / ((12 - arg0) / 57);
         ++field6223;
         return super.field5021.getAddress();
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6225[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method750(int arg0) {
      try {
         if (arg0 >= -34) {
            field6220 = 43;
         }

         ++field6217;
         return this.field6224;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6225[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3337(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ad",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3338(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
