import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class420 extends class70 {
   @OriginalMember(
      owner = "client!qba",
      name = "J",
      descriptor = "I"
   )
   private int field6497;
   @OriginalMember(
      owner = "client!qba",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6498 = new String[]{method3345(method3344(" M8c1y")), method3345(method3344("?Z5!")), method3345(method3344(" M8c:y")), method3345(method3344("*\u0001wc\u000f")), method3345(method3344(" M8cN8A09Ly")), method3345(method3344(" M8c3y"))};
   @OriginalMember(
      owner = "client!qba",
      name = "F",
      descriptor = "I"
   )
   public static int field6493;
   @OriginalMember(
      owner = "client!qba",
      name = "I",
      descriptor = "I"
   )
   public static int field6494;
   @OriginalMember(
      owner = "client!qba",
      name = "G",
      descriptor = "I"
   )
   public static int field6495;
   @OriginalMember(
      owner = "client!qba",
      name = "H",
      descriptor = "I"
   )
   public static int field6496;

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(BI)[I",
      line = 3
   )
   public final int[] method8(byte arg0, int arg1) {
      try {
         ++field6495;
         if (arg0 != 87) {
            this.field6497 = -81;
         }

         int[] var3 = super.field923.method3718(arg0 + -89, arg1);
         if (super.field923.field7284) {
            class107.method1025(var3, 0, class678.field10127, this.field6497);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6498[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "<init>",
      descriptor = "(I)V",
      line = 28
   )
   public class420(int arg0) {
      super(0, true);
      this.field6497 = 4096;

      try {
         this.field6497 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6498[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "a",
      descriptor = "(IILica;)V",
      line = 36
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      try {
         if (~arg1 == -1) {
            this.field6497 = (arg2.method2855(-31007) << 12) / 255;
         }

         if (arg0 != -1) {
            field6494 = 96;
         }

         ++field6496;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6498[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6498[3] : field6498[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "b",
      descriptor = "(IIII)Lmq;",
      line = 66
   )
   public static final class577 method3343(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6493;
         class577 var4 = null;
         if (~arg2 == -1) {
            ++class560.field8334;
            var4 = class218.method1888(class475.field7222, 96, class510.field7801.field361);
         }

         if (~arg2 == -2) {
            ++class4.field19;
            var4 = class218.method1888(class22.field285, 124, class510.field7801.field361);
         }

         if (arg1 != 0) {
            return null;
         } else {
            var4.field8531.method2853(false, class120.field1694 + arg0);
            var4.field8531.method2870(-32768, class300.field4707.method219(82, (byte)-91) ? 1 : 0);
            var4.field8531.method2853(false, class119.field1606 + arg3);
            class581.field8579 = arg3;
            class227.field3443 = false;
            class745.field11066 = arg0;
            class218.method1882(true);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6498[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qba",
      name = "<init>",
      descriptor = "()V",
      line = 105
   )
   public class420() {
      this(4096);
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3344(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3345(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
