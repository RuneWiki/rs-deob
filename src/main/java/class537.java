import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class537 {
   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7823 = new String[]{method4029(method4028("d)&}8\"")), method4029(method4028("d)&}:\"")), method4029(method4028("d)&};\"")), method4029(method4028("d)&}=\"")), method4029(method4028("d)&}<\""))};
   @OriginalMember(
      owner = "client!nga",
      name = "h",
      descriptor = "Lgh;"
   )
   public static class572 field7816 = new class572(10, -1);
   @OriginalMember(
      owner = "client!nga",
      name = "c",
      descriptor = "Luw;"
   )
   public static class435 field7820 = new class435(6, -1);
   @OriginalMember(
      owner = "client!nga",
      name = "b",
      descriptor = "I"
   )
   public static int field7815;
   @OriginalMember(
      owner = "client!nga",
      name = "d",
      descriptor = "I"
   )
   public static int field7817;
   @OriginalMember(
      owner = "client!nga",
      name = "f",
      descriptor = "I"
   )
   public static int field7818;
   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "I"
   )
   public static int field7819;
   @OriginalMember(
      owner = "client!nga",
      name = "e",
      descriptor = "I"
   )
   public static int field7821;
   @OriginalMember(
      owner = "client!nga",
      name = "g",
      descriptor = "I"
   )
   public static int field7822;

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(III)V",
      line = 5
   )
   public static final void method4023(int arg0, int arg1, int arg2) {
      try {
         ++field7819;
         class536 var3 = class108.method1038((long)arg2, 122, 14);
         var3.method4017(24076);
         var3.field7800 = arg0;
         if (arg1 != -1) {
            method4026(97);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7823[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static final void method4024(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field7815;
         class59 var2 = (class59)class26.field398.method5680(false);
         if (var1) {
            if (~var2.field1133 < -2) {
               var2.field1133 = 0;
               class310.field4478.method1581(((class587)var2.field1134.field11533.field4412).field8492, arg0 ^ -2143584048, var2);
               var2.field1134.method5675((byte)83);
            }

            var2 = (class59)class26.field398.method5676(-13612);
         }

         while(true) {
            int var10000;
            int var10001;
            if (var2 == null) {
               var10000 = arg0;
               var10001 = -2143584048;
               if (!var1) {
                  if (arg0 != -2143584048) {
                     field7816 = null;
                  }

                  class255.field3622 = 0;
                  class103.field1686 = 0;
                  class685.field10080.method2580((byte)-4);
                  class471.field6845.method1570((byte)15);
                  class26.field398.method5675((byte)125);
                  class442.field6452 = false;
                  return;
               }
            } else {
               var10000 = ~var2.field1133;
               var10001 = -2;
            }

            if (var10000 < var10001) {
               var2.field1133 = 0;
               class310.field4478.method1581(((class587)var2.field1134.field11533.field4412).field8492, arg0 ^ -2143584048, var2);
               var2.field1134.method5675((byte)83);
            }

            var2 = (class59)class26.field398.method5676(-13612);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7823[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(II)V",
      line = 55
   )
   public static final void method4025(int arg0, int arg1) {
      try {
         ++field7817;
         class359.field5369 = 1000000000L / (long)arg1;
         if (arg0 != 0) {
            method4023(-112, 64, 53);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7823[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "b",
      descriptor = "(I)V",
      line = 66
   )
   public static void method4026(int arg0) {
      try {
         field7816 = null;
         field7820 = null;
         int var1 = 27 % ((-59 - arg0) / 37);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7823[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(IIIBI)I",
      line = 79
   )
   public static final int method4027(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         int var5 = -68 / ((6 - arg3) / 45);
         ++field7821;
         int var6 = -class593.field8548[arg2 * 8192 / arg4] + 65536 >> 1;
         return ((-var6 + 65536) * arg1 >> 16) - -(arg0 * var6 >> 16);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field7823[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4028(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4029(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
