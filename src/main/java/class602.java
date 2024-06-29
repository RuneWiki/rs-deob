import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class602 extends class101 {
   @OriginalMember(
      owner = "client!ul",
      name = "p",
      descriptor = "I"
   )
   public int field8394;
   @OriginalMember(
      owner = "client!ul",
      name = "v",
      descriptor = "I"
   )
   public int field8401;
   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8403 = new String[]{method4396(method4395("\u0007\u000fm\u000fP")), method4396(method4395("\u0007\u000fm\rP")), method4396(method4395("\tMm`\u0005")), method4396(method4395("\u001c\u0016/\"")), method4396(method4395("\u0007\u000fmr\u0011\u001c\n7pP")), method4396(method4395("\u0007\u000fm\fP")), method4396(method4395("\u0007\u000fm\nP"))};
   @OriginalMember(
      owner = "client!ul",
      name = "r",
      descriptor = "I"
   )
   public static int field8397 = -1;
   @OriginalMember(
      owner = "client!ul",
      name = "u",
      descriptor = "Leb;"
   )
   public static class657 field8398 = null;
   @OriginalMember(
      owner = "client!ul",
      name = "s",
      descriptor = "I"
   )
   public static int field8400 = 1;
   @OriginalMember(
      owner = "client!ul",
      name = "t",
      descriptor = "I"
   )
   public static int field8395;
   @OriginalMember(
      owner = "client!ul",
      name = "w",
      descriptor = "I"
   )
   public static int field8399;
   @OriginalMember(
      owner = "client!ul",
      name = "x",
      descriptor = "I"
   )
   public static int field8402;
   @OriginalMember(
      owner = "client!ul",
      name = "q",
      descriptor = "Lne;"
   )
   public static class338 field8396;

   @OriginalMember(
      owner = "client!ul",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4392(int arg0) {
      try {
         field8396 = null;
         field8398 = null;
         int var1 = 25 % ((arg0 - -23) / 43);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8403[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "<init>",
      descriptor = "(Lsq;Ljh;IIIIIIIII)V"
   )
   public class602(class190 arg0, class169 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field8394 = arg10;
         this.field8401 = arg9;
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field8403[4] + (arg0 != null ? field8403[2] : field8403[3]) + ',' + (arg1 != null ? field8403[2] : field8403[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(Laha;B)V"
   )
   public static final void method4393(class404 arg0, byte arg1) {
      try {
         if (arg1 != 111) {
            method4392(87);
         }

         ++field8402;
         class775 var2 = (class775)class128.field1610.method1839(arg1 ^ -78, (long)arg0.field7843);
         if (var2 != null) {
            if (var2.field11262 != null) {
               class717.field10509.method2175(var2.field11262);
               var2.field11262 = null;
            }

            var2.method3609(arg1 + -29);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8403[5] + (arg0 != null ? field8403[2] : field8403[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(I)Lafa;"
   )
   public final class365 method19(int arg0) {
      try {
         ++field8399;
         int var2 = 126 / ((1 - arg0) / 55);
         return class178.field2206;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8403[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(BLeb;)V"
   )
   public static final void method4394(byte arg0, class657 arg1) {
      try {
         if (arg0 < 59) {
            method4392(-26);
         }

         ++field8395;
         if (~class754.field10933 == ~arg1.field9209) {
            if (class278.field3709.field5662 == null) {
               arg1.field9281 = 0;
               arg1.field9302 = 0;
            } else {
               arg1.field9317 = 150;
               arg1.field9204 = (int)(Math.sin((double)class369.field5205 / 40.0D) * 256.0D) & 2047;
               arg1.field9381 = 5;
               arg1.field9281 = field8397;
               arg1.field9302 = class488.method3548((byte)103, class278.field3709.field5662);
               arg1.field9370 = 0;
               arg1.field9238 = class278.field3709.field7759;
               arg1.field9343 = class278.field3709.field7833;
               arg1.field9304 = class278.field3709.field7822;
               class61 var2 = ~arg1.field9304 != 0 ? class392.field5479.method1477(1, arg1.field9304) : null;
               if (var2 != null) {
                  class745.method5385(arg1.field9343, 3, var2);
               }

            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8403[1] + arg0 + ',' + (arg1 != null ? field8403[2] : field8403[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4395(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4396(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
