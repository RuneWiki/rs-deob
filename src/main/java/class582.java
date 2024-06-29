import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class582 extends class758 {
   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7995 = new String[]{method4186(method4185("`\\Q\u000b1")), method4186(method4185("w\u0003Qad")), method4186(method4185("bX\u0013#")), method4186(method4185("`\\Q\r1")), method4186(method4185("`\\Q\n1")), method4186(method4185("`\\Q\u000e1"))};
   @OriginalMember(
      owner = "client!lq",
      name = "u",
      descriptor = "I"
   )
   public static int field7987 = 0;
   @OriginalMember(
      owner = "client!lq",
      name = "r",
      descriptor = "S"
   )
   public static short field7991 = 256;
   @OriginalMember(
      owner = "client!lq",
      name = "v",
      descriptor = "B"
   )
   private byte field7992;
   @OriginalMember(
      owner = "client!lq",
      name = "s",
      descriptor = "B"
   )
   private byte field7993;
   @OriginalMember(
      owner = "client!lq",
      name = "o",
      descriptor = "I"
   )
   public static int field7988;
   @OriginalMember(
      owner = "client!lq",
      name = "p",
      descriptor = "I"
   )
   public static int field7989;
   @OriginalMember(
      owner = "client!lq",
      name = "q",
      descriptor = "I"
   )
   public static int field7990;
   @OriginalMember(
      owner = "client!lq",
      name = "n",
      descriptor = "I"
   )
   public static int field7994;
   @OriginalMember(
      owner = "client!lq",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private String field7986;

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(Lwm;B)V"
   )
   public final void method1313(class594 arg0, byte arg1) {
      try {
         if (arg1 <= -18) {
            ++field7989;
            this.field7986 = arg0.method4334(4794);
            if (this.field7986 != null) {
               arg0.method4288((byte)121);
               this.field7993 = arg0.method4340(409855200);
               this.field7992 = arg0.method4340(409855200);
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7995[5] + (arg0 != null ? field7995[1] : field7995[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method4183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         class484.field6672 = arg4;
         class510.field7064 = arg5;
         class708.field10287 = arg0;
         class706.field10251 = arg3;
         if (arg1 == 16383) {
            class612.field8550 = arg2;
            ++field7994;
            if (~class708.field10287 <= -101) {
               int var6 = class484.field6672 * 512 - -256;
               int var7 = class612.field8550 * 512 + 256;
               int var8 = class687.method5016(var6, class239.field2981, var7, arg1 ^ 16381) - class510.field7064;
               int var9 = -class737.field10747 + var6;
               int var10 = -class331.field4733 + var8;
               int var11 = -class532.field7284 + var7;
               int var12 = (int)Math.sqrt((double)(var9 * var9 + var11 * var11));
               class171.field2144 = (int)(Math.atan2((double)var10, (double)var12) * 2607.5945876176133D) & 16383;
               class749.field10899 = 16383 & (int)(Math.atan2((double)var9, (double)var11) * -2607.5945876176133D);
               class191.field2317 = 0;
               if (class171.field2144 < 1024) {
                  class171.field2144 = 1024;
               }

               if (class171.field2144 > 3072) {
                  class171.field2144 = 3072;
               }
            }

            class635.field8977 = 2;
            class552.field7597 = -1;
            class721.field10567 = -1;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field7995[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(Lob;B)V"
   )
   public final void method1311(class772 arg0, byte arg1) {
      try {
         ++field7990;
         int var3 = -55 / ((54 - arg1) / 57);
         if (this.field7986 != null) {
            arg0.field11144 = this.field7993;
            arg0.field11140 = this.field7992;
         }

         arg0.field11145 = this.field7986;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7995[3] + (arg0 != null ? field7995[1] : field7995[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4184(int arg0, int arg1) {
      try {
         ++field7988;
         class270.field3517.method4234(2, arg1);
         class663.field9447.method4234(arg0, arg1);
         class276.field3680.method4234(arg0, arg1);
         class56.field603.method4234(2, arg1);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7995[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4185(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4186(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
