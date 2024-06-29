import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class790 {
   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11562 = new String[]{method5724(method5723("2\u0011\u001emBw")), method5724(method5723("1\u0000\u0013/")), method5724(method5723("2\u0011\u001emAw")), method5724(method5723("$[Qm~"))};
   @OriginalMember(
      owner = "client!mda",
      name = "b",
      descriptor = "Llj;"
   )
   public static class304 field11558 = new class304(8);
   @OriginalMember(
      owner = "client!mda",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field11560 = new class498(90, 3);
   @OriginalMember(
      owner = "client!mda",
      name = "f",
      descriptor = "Lnaa;"
   )
   public static class113 field11561 = new class113(78, 8);
   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "I"
   )
   public static int field11557;
   @OriginalMember(
      owner = "client!mda",
      name = "e",
      descriptor = "I"
   )
   public static int field11559;
   @OriginalMember(
      owner = "client!mda",
      name = "d",
      descriptor = "Lria;"
   )
   public static class185 field11556;

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method5721(byte arg0) {
      try {
         field11558 = null;
         field11561 = null;
         if (arg0 == 95) {
            field11556 = null;
            field11560 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11562[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "a",
      descriptor = "(ILvg;Lbaa;I)V",
      line = 16
   )
   public static final void method5722(int arg0, class82 arg1, class109 arg2, int arg3) {
      try {
         ++field11559;
         if (class465.field7069 < arg3) {
            if (arg1 != null && arg1.field1176 != null && ~arg0 > ~arg1.field1176.length && arg1.field1176[arg0] != null) {
               int var4 = arg1.field1176[arg0][0];
               int var5 = var4 >> 8;
               int var6 = var4 >> 5 & 7;
               if (arg1.field1176[arg0].length > 1) {
                  int var7 = (int)(Math.random() * (double)arg1.field1176[arg0].length);
                  if (var7 > 0) {
                     var5 = arg1.field1176[arg0][var7];
                  }
               }

               int var8 = 31 & var4;
               int var9 = 256;
               if (arg1.field1163 != null && arg1.field1184 != null) {
                  var9 = (int)((double)(arg1.field1184[arg0] + -arg1.field1163[arg0]) * Math.random()) - -arg1.field1163[arg0];
               }

               int var10 = arg1.field1160 == null ? 255 : arg1.field1160[arg0];
               if (~var8 == -1) {
                  if (class476.field7251 == arg2) {
                     if (!arg1.field1162) {
                        class396.method3193(var10, var6, 0, var9, (byte)-55, var5);
                        return;
                     }

                     class411.method3291(var5, true, var6, var10, 0, var9, false);
                  }

               } else if (~class687.field10213.field514.method1774(arg3 + 480102261) != -1) {
                  int var11 = arg2.field1505 + -256 >> 9;
                  int var12 = arg2.field1494 + -256 >> 9;
                  int var13 = class476.field7251 == arg2 ? 0 : (arg2.field1506 << 24) + var8 - -(var11 << 16) - -(var12 << 8);
                  class207.field3159[class465.field7069++] = new class760((byte)(arg1.field1162 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field11562[2] + arg0 + ',' + (arg1 != null ? field11562[3] : field11562[1]) + ',' + (arg2 != null ? field11562[3] : field11562[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5723(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5724(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
