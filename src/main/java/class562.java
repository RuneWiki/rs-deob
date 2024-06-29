import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class562 {
   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8403 = new String[]{method4165(method4164("\u0006\u001d;\u001ci")), method4165(method4164("\n\u000ey4")), method4165(method4164("\u0006\u001d;\u001bi")), method4165(method4164("\u001fU;v<")), method4165(method4164("\u0006\u001d;\u0019i")), method4165(method4164("\u0006\u001d;\u001ai"))};
   @OriginalMember(
      owner = "client!bf",
      name = "e",
      descriptor = "I"
   )
   public static int field8401 = 0;
   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "I"
   )
   public static int field8397;
   @OriginalMember(
      owner = "client!bf",
      name = "c",
      descriptor = "I"
   )
   public static int field8398;
   @OriginalMember(
      owner = "client!bf",
      name = "f",
      descriptor = "I"
   )
   public static int field8399;
   @OriginalMember(
      owner = "client!bf",
      name = "d",
      descriptor = "I"
   )
   public static int field8400;
   @OriginalMember(
      owner = "client!bf",
      name = "b",
      descriptor = "I"
   )
   public static int field8402;

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(IIILlw;)V",
      line = 3
   )
   public static final void method4160(int arg0, int arg1, int arg2, class687 arg3) {
      try {
         ++field8400;
         int[] var4 = new int[4];
         if (arg0 != 15917) {
            field8401 = 125;
         }

         class195.method1494(var4, 0, var4.length, arg2);
         class450.method3395(arg1, arg3, -123, var4);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field8403[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8403[3] : field8403[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(III)V",
      line = 18
   )
   public static final void method4161(int arg0, int arg1, int arg2) {
      try {
         ++field8398;
         class403 var3 = class453.method3410((long)arg1, true, 1);
         if (arg0 < 3) {
            method4162(52, 52, -69, 37, 83, -35);
         }

         var3.method3093(22144);
         var3.field6185 = arg2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field8403[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(IIIIII)V",
      line = 33
   )
   public static final void method4162(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         class580.field8589 = arg2;
         class547.field8114 = arg4;
         class29.field320 = arg1;
         ++field8397;
         if (arg3 != 16383) {
            method4161(65, 21, -62);
         }

         class42.field453 = arg0;
         class310.field4418 = arg5;
         if (~class547.field8114 <= -101) {
            int var6 = class29.field320 * 512 - -256;
            int var7 = class310.field4418 * 512 + 256;
            int var8 = class368.method2858(var7, (byte)-11, var6, class551.field8158) + -class42.field453;
            int var9 = -class731.field10844 + var6;
            int var10 = var8 - class733.field10871;
            int var11 = -class232.field2947 + var7;
            int var12 = (int)Math.sqrt((double)(var9 * var9 + var11 * var11));
            class713.field10637 = 16383 & (int)(2607.5945876176133D * Math.atan2((double)var10, (double)var12));
            class292.field4078 = (int)(-2607.5945876176133D * Math.atan2((double)var9, (double)var11)) & 16383;
            if (class713.field10637 < 1024) {
               class713.field10637 = 1024;
            }

            class503.field7464 = 0;
            if (class713.field10637 > 3072) {
               class713.field10637 = 3072;
            }
         }

         class675.field10142 = 2;
         class387.field5919 = -1;
         class57.field717 = -1;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field8403[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "a",
      descriptor = "(II)S",
      line = 85
   )
   public static final short method4163(int arg0, int arg1) {
      try {
         ++field8402;
         int var2 = (arg1 & 64730) >> 10;
         if (arg0 >= -120) {
            method4163(-114, 26);
         }

         int var3 = 112 & arg1 >> 3;
         int var4 = 127 & arg1;
         int var5 = var4 <= 64 ? var3 * var4 >> 7 : (-var4 + 127) * var3 >> 7;
         int var6 = var4 + var5;
         int var7;
         if (~var6 == -1) {
            var7 = var5 << 1;
            if (client.field4530 == 0) {
               return (short)(var6 | var2 << 10 | var7 >> 4 << 7);
            }
         }

         var7 = (var5 << 8) / var6;
         return (short)(var6 | var2 << 10 | var7 >> 4 << 7);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field8403[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4164(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4165(char[] arg0) {
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
            var10005 = 123;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 88;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
