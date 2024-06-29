import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class347 extends class345 {
   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4945 = new String[]{method2684(method2683("\u0013e\u001e*@")), method2684(method2683("\u0013e\u001e+@")), method2684(method2683("\u0013e\u001e/@")), method2684(method2683("\u0013e\u001e)@")), method2684(method2683("\u0013e\u001e-@")), method2684(method2683("\u0013e\u001e(@")), method2684(method2683("\u0013e\u001e.@"))};
   @OriginalMember(
      owner = "client!wb",
      name = "m",
      descriptor = "Luw;"
   )
   public static class435 field4936 = new class435(44, -1);
   @OriginalMember(
      owner = "client!wb",
      name = "q",
      descriptor = "I"
   )
   public static int field4935;
   @OriginalMember(
      owner = "client!wb",
      name = "p",
      descriptor = "I"
   )
   public static int field4937;
   @OriginalMember(
      owner = "client!wb",
      name = "r",
      descriptor = "I"
   )
   public static int field4938;
   @OriginalMember(
      owner = "client!wb",
      name = "k",
      descriptor = "I"
   )
   public static int field4939;
   @OriginalMember(
      owner = "client!wb",
      name = "n",
      descriptor = "I"
   )
   public static int field4941;
   @OriginalMember(
      owner = "client!wb",
      name = "o",
      descriptor = "I"
   )
   public static int field4942;
   @OriginalMember(
      owner = "client!wb",
      name = "j",
      descriptor = "I"
   )
   public static int field4943;
   @OriginalMember(
      owner = "client!wb",
      name = "l",
      descriptor = "Lhw;"
   )
   public static class141 field4940;
   @OriginalMember(
      owner = "client!wb",
      name = "i",
      descriptor = "Lhw;"
   )
   public static class141 field4944;

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(BI)I",
      line = 5
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 >= -45) {
            return 122;
         } else {
            ++field4935;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4945[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(IB)V",
      line = 18
   )
   public final void method54(int arg0, byte arg1) {
      try {
         ++field4943;
         if (arg1 <= 99) {
            field4939 = -84;
         }

         super.field4913 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4945[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(Z)I",
      line = 29
   )
   public final int method2680(boolean arg0) {
      try {
         ++field4938;
         if (arg0) {
            field4940 = null;
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4945[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(Z)I",
      line = 40
   )
   public final int method53(boolean arg0) {
      try {
         ++field4941;
         if (arg0) {
            return -59;
         } else {
            return !super.field4914.method5554(-1).method1932((byte)-122) ? 2 : 3;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4945[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 51
   )
   public class347(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!wb",
      name = "c",
      descriptor = "(I)V",
      line = 56
   )
   public static void method2681(int arg0) {
      try {
         if (arg0 != 3) {
            field4940 = null;
         }

         field4944 = null;
         field4940 = null;
         field4936 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4945[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "b",
      descriptor = "(I)V",
      line = 71
   )
   public final void method51(int arg0) {
      try {
         ++field4942;
         if (arg0 != 0) {
            this.method53(true);
         }

         if (~super.field4913 > -2 || super.field4913 > 3) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4945[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 86
   )
   public class347(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!wb",
      name = "a",
      descriptor = "(III)I",
      line = 89
   )
   public static final int method2682(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 3) {
            method2681(97);
         }

         ++field4937;
         if (arg2 == -1) {
            return 12345678;
         } else {
            arg1 = (127 & arg2) * arg1 >> 7;
            if (arg1 >= 2) {
               if (~arg1 >= -127) {
                  return (arg2 & 65408) + arg1;
               }

               arg1 = 126;
               if (!client.field4564) {
                  return (arg2 & 65408) + arg1;
               }
            }

            arg1 = 2;
            return (arg2 & 65408) + arg1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4945[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2683(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2684(char[] arg0) {
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
            var10005 = 7;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
