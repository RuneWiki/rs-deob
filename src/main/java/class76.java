import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class76 extends class393 implements class189 {
   @OriginalMember(
      owner = "client!sh",
      name = "s",
      descriptor = "I"
   )
   private int field955;
   @OriginalMember(
      owner = "client!sh",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field966 = new String[]{method754(method753("U#+SE")), method754(method753("]e+7\u0010")), method754(method753("@xi\u0011")), method754(method753("]e+1\u0010")), method754(method753("]e+3\u0010")), method754(method753("]e+0\u0010")), method754(method753("]e+AQ@dqC\u0010")), method754(method753("]e+;\u0010")), method754(method753("]e+6\u0010")), method754(method753("]e+5\u0010")), method754(method753("]e+4\u0010"))};
   @OriginalMember(
      owner = "client!sh",
      name = "p",
      descriptor = "I"
   )
   public static int field957 = 0;
   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "Lbga;"
   )
   public static class378 field963 = new class378(40, 10);
   @OriginalMember(
      owner = "client!sh",
      name = "A",
      descriptor = "I"
   )
   public static int field964 = 0;
   @OriginalMember(
      owner = "client!sh",
      name = "o",
      descriptor = "I"
   )
   public static int field952;
   @OriginalMember(
      owner = "client!sh",
      name = "v",
      descriptor = "I"
   )
   public static int field954;
   @OriginalMember(
      owner = "client!sh",
      name = "u",
      descriptor = "I"
   )
   public static int field956;
   @OriginalMember(
      owner = "client!sh",
      name = "q",
      descriptor = "I"
   )
   public static int field959;
   @OriginalMember(
      owner = "client!sh",
      name = "B",
      descriptor = "I"
   )
   public static int field960;
   @OriginalMember(
      owner = "client!sh",
      name = "x",
      descriptor = "I"
   )
   public static int field961;
   @OriginalMember(
      owner = "client!sh",
      name = "r",
      descriptor = "I"
   )
   public static int field962;
   @OriginalMember(
      owner = "client!sh",
      name = "t",
      descriptor = "I"
   )
   public static int field965;
   @OriginalMember(
      owner = "client!sh",
      name = "y",
      descriptor = "Lbj;"
   )
   public static class255 field958;
   @OriginalMember(
      owner = "client!sh",
      name = "w",
      descriptor = "Ldha;"
   )
   public static class84 field953;

   @OriginalMember(
      owner = "client!sh",
      name = "<init>",
      descriptor = "(Lor;ILjaclib/memory/Buffer;IZ)V"
   )
   public class76(class670 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field955 = arg1;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field966[6] + (arg0 != null ? field966[0] : field966[2]) + ',' + arg1 + ',' + (arg2 != null ? field966[0] : field966[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method745(int arg0, int arg1, int arg2) {
      try {
         ++field959;
         if (arg1 != 3179) {
            method746(83);
         }

         return (2048 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field966[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method746(int arg0) {
      try {
         field953 = null;
         field963 = null;
         field958 = null;
         int var1 = 7 / ((-74 - arg0) / 46);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field966[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(ILjava/lang/String;)I"
   )
   public static final int method747(int arg0, String arg1) {
      try {
         if (arg0 != 11732) {
            method746(107);
         }

         ++field961;
         return class608.method4442(true, arg0 ^ 11732, arg1, 10);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field966[8] + arg0 + ',' + (arg1 != null ? field966[0] : field966[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "<init>",
      descriptor = "(Lor;I[BIZ)V"
   )
   public class76(class670 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34962, arg2, arg3, arg4);

      try {
         this.field955 = arg1;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field966[6] + (arg0 != null ? field966[0] : field966[2]) + ',' + arg1 + ',' + (arg2 != null ? field966[0] : field966[2]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(III[B)V"
   )
   public final void method748(int arg0, int arg1, int arg2, byte[] arg3) {
      try {
         this.method2994(arg1, (byte)-79, arg3);
         if (arg0 <= -103) {
            ++field952;
            this.field955 = arg2;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field966[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field966[0] : field966[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method749(byte arg0) {
      try {
         if (arg0 < 82) {
            field958 = null;
         }

         ++field960;
         return super.field5556;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field966[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method750(int arg0) {
      try {
         if (arg0 > -34) {
            return -40;
         } else {
            ++field956;
            return this.field955;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field966[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method751(boolean arg0) {
      try {
         ++field954;
         if (arg0) {
            this.method750(4);
         }

         super.field5557.method4863(89, this);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field966[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method752(byte arg0) {
      try {
         ++field962;
         int var2 = -65 / ((arg0 - 12) / 57);
         return 0L;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field966[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method753(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method754(char[] arg0) {
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
            var10005 = 13;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
