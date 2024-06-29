import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public abstract class class142 {
   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2026 = new String[]{method1298(method1297("\b\u0013h?\u001a")), method1298(method1297("\u0013\u0012*\u0002")), method1298(method1297("\u0006Ih@O")), method1298(method1297("\b\u0013h!\u001a")), method1298(method1297("\b\u0013h>\u001a"))};
   @OriginalMember(
      owner = "client!ut",
      name = "d",
      descriptor = "I"
   )
   public static int field2023;
   @OriginalMember(
      owner = "client!ut",
      name = "c",
      descriptor = "I"
   )
   public static int field2024;
   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "I"
   )
   public static int field2025;
   @OriginalMember(
      owner = "client!ut",
      name = "b",
      descriptor = "Lsl;"
   )
   public static class242 field2022;

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(Lpga;I)V",
      line = 4
   )
   public static final void method1291(class788 arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         arg0.field11544 = null;
         ++field2024;
         int var3 = arg0.field11545.length;
         int var4 = 0;
         if (var2) {
            arg0.field11545[var4].field632 = false;
            ++var4;
         }

         while(true) {
            while(var4 < var3) {
               arg0.field11545[var4].field632 = false;
               ++var4;
            }

            class208[] var5 = class516.field7846;
            synchronized(class516.field7846) {
               if (!var2) {
                  if (~class516.field7846.length < ~var3 && ~class694.field10317[var3] > -201) {
                     class516.field7846[var3].method1813(arg0, 0);
                     int var10002 = class694.field10317[var3]++;
                  }

                  int var6 = -63 / ((arg1 - 24) / 35);
                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field2026[3] + (arg0 != null ? field2026[2] : field2026[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(I)V",
      line = 41
   )
   public static void method1292(int arg0) {
      try {
         field2022 = null;
         int var1 = 122 % ((-24 - arg0) / 51);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2026[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(CB)Z",
      line = 51
   )
   public static final boolean method1294(char arg0, byte arg1) {
      try {
         if (arg1 != -51) {
            return false;
         } else {
            ++field2025;
            return arg0 >= 'A' && ~arg0 >= -91 || arg0 >= 'a' && ~arg0 >= -123;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2026[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "b",
      descriptor = "(II)I"
   )
   public abstract int method1290(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(IB)[B"
   )
   public abstract byte[] method1293(int arg0, byte arg1);

   @OriginalMember(
      owner = "client!ut",
      name = "b",
      descriptor = "(I)Lwc;"
   )
   public abstract class751 method1295(int arg0);

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method1296(int arg0, int arg1);

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1297(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1298(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
