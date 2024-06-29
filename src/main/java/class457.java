import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class457 extends class191 {
   @OriginalMember(
      owner = "client!td",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   private String field6677 = null;
   @OriginalMember(
      owner = "client!td",
      name = "l",
      descriptor = "J"
   )
   private long field6676 = -1L;
   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6680 = new String[]{method3542(method3541("|4-}")), method3542(method3541("f%oR0")), method3542(method3541("ioo?e")), method3542(method3541("f%oT0")), method3542(method3541("f%oS0")), method3542(method3541("f%oU0"))};
   @OriginalMember(
      owner = "client!td",
      name = "r",
      descriptor = "J"
   )
   public static long field6673 = -1L;
   @OriginalMember(
      owner = "client!td",
      name = "p",
      descriptor = "I"
   )
   public static int field6674;
   @OriginalMember(
      owner = "client!td",
      name = "m",
      descriptor = "I"
   )
   public static int field6675;
   @OriginalMember(
      owner = "client!td",
      name = "o",
      descriptor = "I"
   )
   public static int field6678;
   @OriginalMember(
      owner = "client!td",
      name = "n",
      descriptor = "I"
   )
   public static int field6679;

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public final void method346(class65 arg0, int arg1) {
      try {
         ++field6679;
         if (arg0.method665(false) != 255) {
            --arg0.field945;
            this.field6676 = arg0.method680(-129);
         }

         this.field6677 = arg0.method641((byte)95);
         if (arg1 >= -97) {
            field6673 = -101L;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6680[1] + (arg0 != null ? field6680[2] : field6680[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method3539(int arg0, String arg1) {
      boolean var2 = client.field10022;

      try {
         int var3 = -7 / ((-47 - arg0) / 55);
         ++field6678;
         if (arg1 != null) {
            String var4 = class197.method1724(true, arg1);
            if (var4 != null) {
               int var5 = 0;
               if (var2 || ~class265.field4046 < ~var5) {
                  do {
                     String var6 = class321.field4793[var5];
                     String var7 = class197.method1724(true, var6);
                     if (class542.method4040(var4, (byte)-119, var7, var6, arg1)) {
                        --class265.field4046;
                        int var8 = var5;
                        if (var2) {
                           class321.field4793[var5] = class321.field4793[var5 - -1];
                           class517.field7314[var5] = class517.field7314[var5 + 1];
                           class169.field2533[var5] = class169.field2533[var5 + 1];
                           class162.field2467[var5] = class162.field2467[var5 + 1];
                           class266.field4058[var5] = class266.field4058[var5 + 1];
                           var8 = var5 + 1;
                        }

                        while(true) {
                           while(var8 < class265.field4046) {
                              class321.field4793[var8] = class321.field4793[var8 - -1];
                              class517.field7314[var8] = class517.field7314[var8 + 1];
                              class169.field2533[var8] = class169.field2533[var8 + 1];
                              class162.field2467[var8] = class162.field2467[var8 + 1];
                              class266.field4058[var8] = class266.field4058[var8 + 1];
                              ++var8;
                           }

                           class709.field10182 = class742.field10569;
                           ++class638.field9014;
                           class242 var9 = class735.method5318(-122);
                           class381 var10 = class801.method5775(class574.field8116, 0, var9.field3718);
                           var10.field5570.method656((byte)-98, class519.method3880(false, arg1));
                           var10.field5570.method658(arg1, -79);
                           var9.method2111(14024, var10);
                           if (!var2) {
                              return;
                           }

                           ++var8;
                        }
                     }

                     ++var5;
                  } while(~class265.field4046 < ~var5);

               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field6680[5] + arg0 + ',' + (arg1 != null ? field6680[2] : field6680[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public final void method342(byte arg0, class456 arg1) {
      try {
         arg1.method3523(this.field6677, true, this.field6676);
         if (arg0 >= -106) {
            this.field6677 = null;
         }

         ++field6674;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6680[4] + arg0 + ',' + (arg1 != null ? field6680[2] : field6680[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3540(int arg0) {
      try {
         class172.method1594(-29908);
         ++field6675;
         if (arg0 <= -94) {
            class606.field8652 = null;
            class201.field2881 = null;
            class701.field10096 = null;
            class513.field7285 = null;
            class341.field5025 = null;
            class413.field6064 = null;
            class138.field2215 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6680[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3541(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!td",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3542(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
