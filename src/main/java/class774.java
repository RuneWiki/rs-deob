import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class774 extends class143 {
   @OriginalMember(
      owner = "client!wo",
      name = "n",
      descriptor = "I"
   )
   private int field11332 = -1;
   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11343 = new String[]{method5600(method5599("*5&d")), method5600(method5599("3/dI\u0001")), method5600(method5599("?nd&T")), method5600(method5599("3/dJ\u0001")), method5600(method5599("3/dK\u0001")), method5600(method5599("3/dL\u0001"))};
   @OriginalMember(
      owner = "client!wo",
      name = "r",
      descriptor = "Lgw;"
   )
   public static class179 field11334 = new class179(32);
   @OriginalMember(
      owner = "client!wo",
      name = "v",
      descriptor = "[Luda;"
   )
   public static class473[] field11341 = new class473[2048];
   @OriginalMember(
      owner = "client!wo",
      name = "q",
      descriptor = "Lgh;"
   )
   public static class572 field11339 = new class572(60, 3);
   @OriginalMember(
      owner = "client!wo",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field11342 = new int[32];
   @OriginalMember(
      owner = "client!wo",
      name = "p",
      descriptor = "B"
   )
   private byte field11337;
   @OriginalMember(
      owner = "client!wo",
      name = "u",
      descriptor = "I"
   )
   public static int field11333;
   @OriginalMember(
      owner = "client!wo",
      name = "l",
      descriptor = "I"
   )
   public static int field11335;
   @OriginalMember(
      owner = "client!wo",
      name = "o",
      descriptor = "I"
   )
   public static int field11338;
   @OriginalMember(
      owner = "client!wo",
      name = "m",
      descriptor = "I"
   )
   private int field11340;
   @OriginalMember(
      owner = "client!wo",
      name = "t",
      descriptor = "Ljava/lang/String;"
   )
   private String field11336;

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5597(byte arg0) {
      try {
         field11334 = null;
         if (arg0 <= 63) {
            field11339 = null;
         }

         field11339 = null;
         field11342 = null;
         field11341 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11343[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(Luda;B)V"
   )
   public final void method457(class473 arg0, byte arg1) {
      try {
         ++field11335;
         this.field11332 = arg0.method3565(true);
         if (arg1 >= -81) {
            this.field11340 = -37;
         }

         this.field11337 = arg0.method3543(-1132613840);
         this.field11340 = arg0.method3565(true);
         arg0.method3523(-106);
         this.field11336 = arg0.method3566(-16496688);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field11343[5] + (arg0 != null ? field11343[2] : field11343[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(Lan;I)V"
   )
   public final void method456(class25 arg0, int arg1) {
      try {
         if (arg1 != 117) {
            field11339 = null;
         }

         ++field11338;
         class444 var3 = arg0.field380[this.field11332];
         var3.field6471 = this.field11340;
         var3.field6470 = this.field11336;
         var3.field6472 = this.field11337;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field11343[3] + (arg0 != null ? field11343[2] : field11343[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "a",
      descriptor = "(BILd;ILjava/awt/Canvas;)Lha;"
   )
   public static final class65 method5598(byte arg0, int arg1, class160 arg2, int arg3, Canvas arg4) {
      try {
         if (arg0 < 11) {
            method5597((byte)-125);
         }

         ++field11333;
         return new class739(arg4, arg2, arg1, arg3);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11343[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11343[2] : field11343[0]) + ',' + arg3 + ',' + (arg4 != null ? field11343[2] : field11343[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5599(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5600(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
