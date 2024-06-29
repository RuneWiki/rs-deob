import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class193 {
   @OriginalMember(
      owner = "client!wp",
      name = "d",
      descriptor = "I"
   )
   public int field2737 = 0;
   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2740 = new String[]{method1524(method1523("i\t6K")), method1524(method1523("p\ftdY")), method1524(method1523("|Rt\t\f")), method1524(method1523("p\fteY")), method1524(method1523("p\ftfY")), method1524(method1523("p\ftcY"))};
   @OriginalMember(
      owner = "client!wp",
      name = "c",
      descriptor = "Lek;"
   )
   public static class536 field2735 = new class536(90, 6);
   @OriginalMember(
      owner = "client!wp",
      name = "b",
      descriptor = "I"
   )
   public static int field2736;
   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "I"
   )
   public static int field2738;
   @OriginalMember(
      owner = "client!wp",
      name = "e",
      descriptor = "I"
   )
   public static int field2739;

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(I)V",
      line = 3
   )
   public static void method1519(int arg0) {
      try {
         int var1 = 73 / ((4 - arg0) / 61);
         field2735 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2740[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(IIIII)V",
      line = 13
   )
   public static final void method1520(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4360;

      try {
         ++field2738;
         if (class614.field9025 == 1) {
            int var6 = arg4 / class347.field4686;
            int var7 = arg3 / class347.field4686;
            int var8 = arg0 / class88.field1146;
            int var9 = arg2 / class88.field1146;
            if (~var6 > ~class50.field658 && ~var7 <= -1 && ~class131.field1670 < ~var8 && ~var9 <= -1) {
               if (~class50.field658 >= ~var7) {
                  var7 = class50.field658 + -1;
               }

               if (arg1 <= -66) {
                  if (class131.field1670 <= var9) {
                     var9 = class131.field1670 + -1;
                  }

                  if (~var8 > -1) {
                     var8 = 0;
                  }

                  if (var6 < 0) {
                     var6 = 0;
                  }

                  int var10 = var8;
                  if (var5 || ~var8 >= ~var9) {
                     do {
                        int var11 = class700.method5086(class503.field7302 + var10, (byte)-46, class131.field1670) * class50.field658;
                        int var12 = var6;
                        if (var5 || var7 >= var6) {
                           do {
                              int var13 = var11 - -class700.method5086(class360.field4901 + var12, (byte)-56, class50.field658);
                              class287.field3964[var13] = class489.field7006;
                              ++var12;
                           } while(var7 >= var12);
                        }

                        ++var10;
                     } while(~var10 >= ~var9);

                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field2740[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(BLwf;I)V",
      line = 73
   )
   private final void method1521(byte arg0, class147 arg1, int arg2) {
      try {
         int var4 = 113 % ((arg0 - -30) / 39);
         ++field2739;
         if (arg2 == 5) {
            this.field2737 = arg1.method1211(-26166);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2740[5] + arg0 + ',' + (arg1 != null ? field2740[2] : field2740[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(BLwf;)V",
      line = 96
   )
   public final void method1522(byte arg0, class147 arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 >= -105) {
            this.field2737 = -73;
         }

         while(true) {
            int var4 = arg1.method1143(-15465);
            if (~var4 != -1) {
               this.method1521((byte)82, arg1, var4);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field2736;
            break;
         }

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2740[1] + arg0 + ',' + (arg1 != null ? field2740[2] : field2740[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1523(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1524(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
