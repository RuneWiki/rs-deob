import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public class class279 extends class345 {
   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3925 = new String[]{method2187(method2186("Y\u0019\fz\t\u0006")), method2187(method2186("Y\u0019\fz\n\u0006")), method2187(method2186("Y\u0019\fz\u000f\u0006")), method2187(method2186("Y\u0019\fz\f\u0006")), method2187(method2186("Y\u0019\fz\u000e\u0006")), method2187(method2186("Y\u0019\fz\r\u0006")), method2187(method2186("Y\u0019\fz\b\u0006"))};
   @OriginalMember(
      owner = "client!wja",
      name = "j",
      descriptor = "I"
   )
   public static int field3924 = 0;
   @OriginalMember(
      owner = "client!wja",
      name = "n",
      descriptor = "I"
   )
   public static int field3917;
   @OriginalMember(
      owner = "client!wja",
      name = "p",
      descriptor = "I"
   )
   public static int field3918;
   @OriginalMember(
      owner = "client!wja",
      name = "k",
      descriptor = "I"
   )
   public static int field3920;
   @OriginalMember(
      owner = "client!wja",
      name = "o",
      descriptor = "I"
   )
   public static int field3921;
   @OriginalMember(
      owner = "client!wja",
      name = "i",
      descriptor = "I"
   )
   public static int field3922;
   @OriginalMember(
      owner = "client!wja",
      name = "l",
      descriptor = "I"
   )
   public static int field3923;
   @OriginalMember(
      owner = "client!wja",
      name = "m",
      descriptor = "[J"
   )
   public static long[] field3919;

   @OriginalMember(
      owner = "client!wja",
      name = "b",
      descriptor = "(Z)V",
      line = 3
   )
   public static void method2183(boolean arg0) {
      try {
         if (arg0) {
            method2183(false);
         }

         field3919 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3925[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "c",
      descriptor = "(Z)I",
      line = 14
   )
   public final int method2184(boolean arg0) {
      try {
         ++field3917;
         if (arg0) {
            field3924 = -123;
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3925[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "b",
      descriptor = "(I)V",
      line = 28
   )
   public final void method51(int arg0) {
      try {
         if (arg0 != 0) {
            method2183(true);
         }

         super.field4913 = this.method53(false);
         ++field3918;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3925[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(Z)I",
      line = 39
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            this.method54(-39, (byte)5);
         }

         ++field3920;
         return super.field4914.method5560(13750) ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3925[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 55
   )
   public class279(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!wja",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 58
   )
   public class279(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(IB)V",
      line = 63
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 < 99) {
            field3919 = null;
         }

         ++field3921;
         super.field4913 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3925[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(BI)I",
      line = 78
   )
   public final int method52(byte arg0, int arg1) {
      try {
         ++field3922;
         return arg0 >= -45 ? 107 : 3;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3925[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "a",
      descriptor = "(II)Z",
      line = 89
   )
   public static final boolean method2185(int arg0, int arg1) {
      try {
         if (arg0 <= 8) {
            method2185(23, 64);
         }

         ++field3923;
         return arg1 == 3 || arg1 == 4 || arg1 == 5 || ~arg1 == -7;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3925[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2186(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2187(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
