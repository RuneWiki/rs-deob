import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class490 {
   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7010 = new String[]{method3728(method3727("T\u0005Mm\u001c\u001f")), method3728(method3727("T\u0005Mm\u001f\u001f")), method3728(method3727("Y\u0017@/")), method3728(method3727("LL\u0002m ")), method3728(method3727("T\u0005Mm\u001e\u001f"))};
   @OriginalMember(
      owner = "client!cga",
      name = "c",
      descriptor = "I"
   )
   public static int field7005 = 0;
   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field7009 = new int[1];
   @OriginalMember(
      owner = "client!cga",
      name = "d",
      descriptor = "D"
   )
   public static double field7008;
   @OriginalMember(
      owner = "client!cga",
      name = "e",
      descriptor = "I"
   )
   public static int field7006;
   @OriginalMember(
      owner = "client!cga",
      name = "b",
      descriptor = "I"
   )
   public static int field7007;

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3724(byte arg0) {
      try {
         if (arg0 != 94) {
            field7009 = null;
         }

         field7009 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7010[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(BIIIILha;II)V"
   )
   public static final void method3725(byte arg0, int arg1, int arg2, int arg3, int arg4, class17 arg5, int arg6, int arg7) {
      try {
         class712.field10231 = arg5;
         ++field7007;
         class292.field4377 = class712.field10231.method183();
         class162.field2469 = class712.field10231.method183();
         class110.field1710 = class712.field10231.method183();
         class697.field10061 = null;
         class106.field1656 = arg7;
         class249.field3818 = 0;
         class252.field3833 = arg1;
         class502.field7168 = arg4;
         class466.field6765 = arg2;
         class19.field257 = 0;
         class217.field3113 = 1;
         class235.method2081(arg3, (byte)119, arg6);
         if (arg0 < 79) {
            method3724((byte)62);
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field7010[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7010[3] : field7010[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(IILcn;BII)V"
   )
   public static final void method3726(int arg0, int arg1, class468 arg2, byte arg3, int arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         if (arg3 != 125) {
            field7008 = 0.244427199161611D;
         }

         ++field7006;
         class523 var7 = null;
         class523 var8 = (class523)class460.field6702.method2245((byte)-94);
         if (var6 || var8 != null) {
            do {
               if (var8.field7397 == arg4 && var8.field7398 == arg5 && var8.field7399 == arg0 && var8.field7401 == arg1) {
                  var7 = var8;
                  break;
               }

               var8 = (class523)class460.field6702.method2239((byte)89);
            } while(var8 != null);
         }

         while(var6) {
         }

         if (var7 == null) {
            var7 = new class523();
            var7.field7398 = arg5;
            var7.field7397 = arg4;
            var7.field7399 = arg0;
            var7.field7401 = arg1;
            class460.field6702.method2238(var7, 13);
         }

         var7.field7402 = true;
         var7.field7406 = arg2;
         var7.field7405 = false;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field7010[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7010[3] : field7010[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3727(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3728(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
