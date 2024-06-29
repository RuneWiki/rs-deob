import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class209 {
   @OriginalMember(
      owner = "client!o",
      name = "j",
      descriptor = "I"
   )
   public int field2648 = 0;
   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2659 = new String[]{method1726(method1725("5'\u0018\u001f\u0000")), method1726(method1725("!'t\u0019")), method1726(method1725(" |Z]")), method1726(method1725("!'s\u0019")), method1726(method1725("!'w\u0019")), method1726(method1725("!'u\u0019")), method1726(method1725("!'r\u0019"))};
   @OriginalMember(
      owner = "client!o",
      name = "k",
      descriptor = "I"
   )
   public static int field2652 = 0;
   @OriginalMember(
      owner = "client!o",
      name = "e",
      descriptor = "Laka;"
   )
   public static class418 field2650 = new class418(121, -1);
   @OriginalMember(
      owner = "client!o",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field2656 = new int[]{99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120};
   @OriginalMember(
      owner = "client!o",
      name = "d",
      descriptor = "I"
   )
   public static int field2658 = 0;
   @OriginalMember(
      owner = "client!o",
      name = "f",
      descriptor = "I"
   )
   public static int field2649;
   @OriginalMember(
      owner = "client!o",
      name = "g",
      descriptor = "I"
   )
   public static int field2651;
   @OriginalMember(
      owner = "client!o",
      name = "b",
      descriptor = "I"
   )
   public static int field2653;
   @OriginalMember(
      owner = "client!o",
      name = "c",
      descriptor = "I"
   )
   public static int field2654;
   @OriginalMember(
      owner = "client!o",
      name = "i",
      descriptor = "I"
   )
   public static int field2655;
   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "Lda;"
   )
   public static class447 field2657;

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method1720(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field2654;
         class479 var2 = class629.field9294;
         boolean var3 = false;
         if (class757.field11093.field11012.method27(-18033) != 0) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var2 = class655.method4807(0, (class102)null, (byte)-51, var4, 0, (class339)null);
            var3 = true;
         }

         long var5 = class163.method1353(-123);
         int var7 = 0;
         if (var1) {
            var2.method467(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
            ++var7;
         }

         while(true) {
            while(var7 < 10000) {
               var2.method467(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
               ++var7;
            }

            int var8 = (int)(-var5 + class163.method1353(-127));
            var2.method3643(false, 0, -16777216, 0, 100, 100);
            if (!var1) {
               if (arg0 > -27) {
                  field2650 = null;
               }

               if (var3) {
                  var2.method3649(false);
               }

               return var8;
            }

            ++var7;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field2659[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(IBLgea;)V"
   )
   private final void method1721(int arg0, byte arg1, class66 arg2) {
      try {
         if (arg1 != 50) {
            this.field2648 = -114;
         }

         if (arg0 == 5) {
            this.field2648 = arg2.method603(-2);
         }

         ++field2653;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2659[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2659[0] : field2659[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method1722(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1723(byte arg0) {
      try {
         if (arg0 == 19) {
            field2657 = null;
            field2656 = null;
            field2650 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2659[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method1724(int arg0, class66 arg1) {
      boolean var3 = client.field1481;

      try {
         while(true) {
            int var4 = arg1.method640(arg0 + 2472);
            if (var4 != 0) {
               this.method1721(var4, (byte)50, arg1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field2651;
            break;
         }

         if (arg0 != -2217) {
            field2656 = null;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2659[1] + arg0 + ',' + (arg1 != null ? field2659[0] : field2659[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1725(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!o",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1726(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
