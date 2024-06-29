import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class565 {
   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8325 = new String[]{method4249(method4248("\u0007OHv\u0016")), method4249(method4248("\u0010N\u0014SQ\u0007\u0000")), method4249(method4248("\u0007OHu\u0016")), method4249(method4248("\u0006R\t\\W\u0000U\tDJ")), method4249(method4248("\u0001R\u0005BS\u0000S\u0012\u0019]\nR\r^[X\u001f")), method4249(method4248("^\u001d\u0010RL\u0016T\tY\u0003T\u0006FG_\u0011U[\u0018\u0005EY\tZ_\fS[")), method4249(method4248("\u0007OHs\u0016")), method4249(method4248("\u0007OHr\u0016")), method4249(method4248("\u0007OHt\u0016"))};
   @OriginalMember(
      owner = "client!br",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field8318 = false;
   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "I"
   )
   public static int field8319;
   @OriginalMember(
      owner = "client!br",
      name = "g",
      descriptor = "I"
   )
   public static int field8320;
   @OriginalMember(
      owner = "client!br",
      name = "f",
      descriptor = "I"
   )
   public static int field8321;
   @OriginalMember(
      owner = "client!br",
      name = "c",
      descriptor = "I"
   )
   public static int field8322;
   @OriginalMember(
      owner = "client!br",
      name = "e",
      descriptor = "I"
   )
   public static int field8323;
   @OriginalMember(
      owner = "client!br",
      name = "d",
      descriptor = "I"
   )
   public static int field8324;

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4243(byte arg0) {
      try {
         ++field8319;
         if (arg0 != 123) {
            method4243((byte)53);
         }

         if (!class7.field97) {
            class7.field97 = true;
            class419.field5734 += (-12.0F - class419.field5734) / 2.0F;
            class193.field2447 = true;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8325[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(BI)I"
   )
   public static final int method4244(byte arg0, int arg1) {
      try {
         if (arg0 != -23) {
            method4245(-57);
         }

         ++field8321;
         return 255 & arg1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8325[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4245(int arg0) {
      try {
         ++field8320;
         if (class152.field1893 != null) {
            try {
               if (arg0 != -12121) {
                  method4244((byte)-48, -52);
               }

               String var1 = class152.field1893.getParameter(field8325[3]);
               int var2 = (int)(class163.method1353(-120) / 86400000L) + -11745;
               String var3 = field8325[1] + var2 + field8325[5] + var1;
               class537.method4075(field8325[4] + var3 + "\"", class152.field1893, arg0 ^ -29296);
            } catch (Throwable var5) {
            }
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field8325[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method4246(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg3 != 17182) {
            field8318 = false;
         }

         int var6 = arg0 & 3;
         ++field8323;
         if (~var6 == -1) {
            return arg2;
         } else if (~var6 == -2) {
            return arg1;
         } else {
            return var6 == 2 ? 7 - arg2 : 7 - arg1;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field8325[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(ZJII)Ljava/lang/String;"
   )
   public static final String method4247(boolean arg0, long arg1, int arg2, int arg3) {
      try {
         if (arg2 != 10) {
            field8322 = -3;
         }

         Calendar var5;
         label21: {
            ++field8324;
            if (arg0) {
               class693.method5055((byte)-65, arg1);
               var5 = class585.field8632;
               if (!client.field1481) {
                  break label21;
               }
            }

            class30.method243(arg2 + -82, arg1);
            var5 = class585.field8631;
         }

         int var6 = var5.get(5);
         int var7 = var5.get(2);
         int var8 = var5.get(1);
         int var9 = var5.get(11);
         int var10 = var5.get(12);
         return arg3 == 3 ? class620.method4580(arg0, -15393, arg3, arg1) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class440.field5983[arg3][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field8325[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4248(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4249(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
