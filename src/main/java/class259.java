import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class259 extends class588 {
   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3675 = new String[]{method2083(method2082("\u001bN\u0006y*")), method2083(method2082("\u0011\u0001\u0006\u001f\u007f")), method2083(method2082("\u000e\u0015D;")), method2083(method2082("\u0011\u0001\u0006\u0016\u007f")), method2083(method2082("\u0011\u0001\u0006\u0013\u007f")), method2083(method2082("\u0011\u0001\u0006\u0014\u007f")), method2083(method2082("\u0011\u0001\u0006\u0015\u007f"))};
   @OriginalMember(
      owner = "client!qa",
      name = "s",
      descriptor = "I"
   )
   public static int field3669;
   @OriginalMember(
      owner = "client!qa",
      name = "q",
      descriptor = "I"
   )
   public static int field3670;
   @OriginalMember(
      owner = "client!qa",
      name = "p",
      descriptor = "I"
   )
   public static int field3673;
   @OriginalMember(
      owner = "client!qa",
      name = "r",
      descriptor = "I"
   )
   public static int field3674;
   @OriginalMember(
      owner = "client!qa",
      name = "u",
      descriptor = "Ljava/lang/String;"
   )
   private String field3672;
   @OriginalMember(
      owner = "client!qa",
      name = "t",
      descriptor = "[Ltd;"
   )
   public static class476[] field3671;

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(Lrk;IIIII)Lpe;"
   )
   public static final class633 method2079(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3674;
         if (arg2 != -24381) {
            field3671 = null;
         }

         if (arg0.field831 || class756.method5476((byte)-63, arg1) && class756.method5476((byte)-63, arg4)) {
            return new class633(arg0, 3553, arg5, arg3, arg1, arg4, true);
         } else {
            return arg0.field802 ? new class633(arg0, 34037, arg5, arg3, arg1, arg4, true) : new class633(arg0, arg5, arg3, arg1, arg4, class71.method752(arg1, true), class71.method752(arg4, true), true);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3675[5] + (arg0 != null ? field3675[0] : field3675[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(ILha;)V"
   )
   public static final void method2080(int arg0, class65 arg1) {
      try {
         ++field3669;
         class193.field2920 = class348.method2685(true, (byte)-70, class550.field7946, arg1);
         class4.field45 = class683.method4985(class550.field7946, false, arg1);
         class678.field9949 = class348.method2685(true, (byte)-98, class422.field6146, arg1);
         class141.field2309 = class683.method4985(class422.field6146, false, arg1);
         class296.field4151 = class348.method2685(true, (byte)-72, class247.field3558, arg1);
         class511.field7461 = class683.method4985(class247.field3558, false, arg1);
         if (arg0 != 12) {
            field3671 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3675[3] + arg0 + ',' + (arg1 != null ? field3675[0] : field3675[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(BLuda;)V"
   )
   public final void method133(byte arg0, class473 arg1) {
      try {
         this.field3672 = arg1.method3566(-16496688);
         ++field3670;
         int var3 = -16 / ((-26 - arg0) / 33);
         arg1.method3567(31871);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3675[1] + arg0 + ',' + (arg1 != null ? field3675[0] : field3675[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2081(byte arg0) {
      try {
         field3671 = null;
         if (arg0 > -114) {
            method2079((class35)null, 66, -128, 91, -61, -60);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3675[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "a",
      descriptor = "(Lwga;I)V"
   )
   public final void method135(class778 arg0, int arg1) {
      try {
         arg0.field11416 = this.field3672;
         ++field3673;
         if (arg1 > -120) {
            field3671 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3675[6] + (arg0 != null ? field3675[0] : field3675[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2082(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2083(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
