import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class310 extends class347 {
   @OriginalMember(
      owner = "client!pfa",
      name = "o",
      descriptor = "I"
   )
   public int field4411;
   @OriginalMember(
      owner = "client!pfa",
      name = "k",
      descriptor = "I"
   )
   public int field4413;
   @OriginalMember(
      owner = "client!pfa",
      name = "n",
      descriptor = "I"
   )
   public int field4410;
   @OriginalMember(
      owner = "client!pfa",
      name = "m",
      descriptor = "I"
   )
   public int field4407;
   @OriginalMember(
      owner = "client!pfa",
      name = "r",
      descriptor = "Z"
   )
   public boolean field4415;
   @OriginalMember(
      owner = "client!pfa",
      name = "q",
      descriptor = "I"
   )
   public int field4412;
   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4419 = new String[]{method2345(method2344("8r<n;`")), method2345(method2344("8r<nC!z44A`")), method2345(method2344("8r<n=`")), method2345(method2344("8r<n>`")), method2345(method2344("8r<n<`"))};
   @OriginalMember(
      owner = "client!pfa",
      name = "i",
      descriptor = "Ldw;"
   )
   public static class748 field4409 = new class748(10);
   @OriginalMember(
      owner = "client!pfa",
      name = "p",
      descriptor = "I"
   )
   public static int field4417 = 0;
   @OriginalMember(
      owner = "client!pfa",
      name = "t",
      descriptor = "I"
   )
   public static int field4406;
   @OriginalMember(
      owner = "client!pfa",
      name = "s",
      descriptor = "I"
   )
   public static int field4408;
   @OriginalMember(
      owner = "client!pfa",
      name = "l",
      descriptor = "I"
   )
   public static int field4414;
   @OriginalMember(
      owner = "client!pfa",
      name = "u",
      descriptor = "I"
   )
   public static int field4416;
   @OriginalMember(
      owner = "client!pfa",
      name = "j",
      descriptor = "I"
   )
   public static int field4418;

   @OriginalMember(
      owner = "client!pfa",
      name = "b",
      descriptor = "(I)V",
      line = 5
   )
   public static final void method2340(int arg0) {
      try {
         class391.method2991(true);
         ++field4414;
         class55.field648 = null;
         if (arg0 == -11) {
            class208.field2653 = null;
            class787.field11445 = null;
            class459.field6944 = null;
            class159.field2017 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4419[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(I)V",
      line = 26
   )
   public static final void method2341(int arg0) {
      try {
         ++field4406;
         if (arg0 >= -33) {
            field4416 = 121;
         }

         class57.method475((byte)110);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4419[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(B)V",
      line = 37
   )
   public static final void method2342(byte arg0) {
      try {
         if (arg0 != -40) {
            field4416 = 88;
         }

         ++field4408;
         if (~class777.field11357 == -11) {
            class777.field11357 = 11;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4419[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "<init>",
      descriptor = "(IIIIIZ)V",
      line = 58
   )
   public class310(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         this.field4411 = arg1;
         this.field4413 = arg0;
         this.field4410 = arg3;
         this.field4407 = arg4;
         this.field4415 = arg5;
         this.field4412 = arg2;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field4419[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "a",
      descriptor = "(Z)V",
      line = 71
   )
   public static void method2343(boolean arg0) {
      try {
         if (arg0) {
            field4418 = -71;
         }

         field4409 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4419[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2344(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2345(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
