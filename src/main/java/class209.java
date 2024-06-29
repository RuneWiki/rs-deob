import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class209 {
   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2667 = new String[]{method1595(method1594("B\u001cK#j\u001d")), method1595(method1594("B\u001cK#m\u001d")), method1595(method1594("[\u000fFa")), method1595(method1594("NT\u0004#S")), method1595(method1594("B\u001cK#l\u001d")), method1595(method1594("B\u001cK#k\u001d")), method1595(method1594("B\u001cK#o\u001d"))};
   @OriginalMember(
      owner = "client!wfa",
      name = "g",
      descriptor = "I"
   )
   public static int field2658 = -1;
   @OriginalMember(
      owner = "client!wfa",
      name = "i",
      descriptor = "I"
   )
   public static int field2663 = 0;
   @OriginalMember(
      owner = "client!wfa",
      name = "k",
      descriptor = "I"
   )
   public static int field2656;
   @OriginalMember(
      owner = "client!wfa",
      name = "d",
      descriptor = "I"
   )
   public static int field2657;
   @OriginalMember(
      owner = "client!wfa",
      name = "c",
      descriptor = "I"
   )
   public static int field2659;
   @OriginalMember(
      owner = "client!wfa",
      name = "b",
      descriptor = "I"
   )
   public int field2660;
   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "I"
   )
   public int field2661;
   @OriginalMember(
      owner = "client!wfa",
      name = "h",
      descriptor = "I"
   )
   public int field2662;
   @OriginalMember(
      owner = "client!wfa",
      name = "j",
      descriptor = "I"
   )
   public int field2664;
   @OriginalMember(
      owner = "client!wfa",
      name = "f",
      descriptor = "I"
   )
   public static int field2665;
   @OriginalMember(
      owner = "client!wfa",
      name = "e",
      descriptor = "I"
   )
   public static int field2666;

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(Lhg;Ljava/awt/Frame;I)V"
   )
   public static final void method1589(class719 arg0, Frame arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field2657;

         do {
            class12 var4 = arg0.method5215(-20734, arg1);
            if (var3 != 0) {
               class89.method817(10L, 2535);
            }

            while(var4.field159 == 0) {
               class89.method817(10L, 2535);
            }

            if (var4.field159 == 1) {
               break;
            }

            class89.method817(100L, 2535);
         } while(var3 == 0);

         arg1.setVisible(false);
         arg1.dispose();
         if (arg2 <= 48) {
            field2663 = -35;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2667[4] + (arg0 != null ? field2667[3] : field2667[2]) + ',' + (arg1 != null ? field2667[3] : field2667[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method1590(String arg0, int arg1) {
      try {
         if (arg1 > -115) {
            method1592(103, 119, (byte)-122);
         }

         ++field2656;
         if (!arg0.equals("")) {
            ++class394.field5979;
            class180 var2 = class486.method3603(class32.field352, (byte)-103, class48.field583);
            var2.field2211.method1085(class543.method4009(true, arg0), (byte)-11);
            var2.field2211.method1101(arg0, -122);
            class763.method5527(false, var2);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2667[6] + (arg0 != null ? field2667[3] : field2667[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public static final void method1591(int arg0, int arg1, boolean arg2) {
      try {
         ++field2659;
         class736 var3 = !arg2 ? class740.field10986 : class437.field6674;
         if (var3 != null && ~arg0 <= -1 && ~arg0 > ~var3.field10928) {
            if (arg1 != 1) {
               field2658 = 19;
            }

            class135 var4 = var3.field10932[arg0];
            if (~var4.field1722 == 0) {
               String var5 = var4.field1724;
               class180 var6 = class486.method3603(class257.field3484, (byte)-64, class48.field583);
               var6.field2211.method1085(3 + class543.method4009(true, var5), (byte)-11);
               var6.field2211.method1085(arg2 ? 1 : 0, (byte)-11);
               var6.field2211.method1103(arg0, -50);
               var6.field2211.method1101(var5, -100);
               class763.method5527(false, var6);
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2667[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method1592(int arg0, int arg1, byte arg2) {
      try {
         ++field2666;
         if (arg2 <= 71) {
            return false;
         } else {
            return (52 & arg0) != 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2667[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(IIIBIII)Luaa;"
   )
   public static final class126 method1593(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
      try {
         ++field2665;
         long var7 = (long)arg2 * 76724863L ^ (long)arg5 * 32147369L ^ (long)arg1 * 986053L ^ (long)arg4 * 67481L ^ (long)arg6 * 97549L ^ (long)arg0 * 475427L;
         class126 var9 = (class126)class32.field349.method5454(var7, 18261);
         if (arg3 >= -60) {
            method1592(-108, -48, (byte)22);
         }

         if (var9 != null) {
            return var9;
         } else {
            class126 var10 = class459.field6944.method594(arg4, arg6, arg0, arg1, arg5, arg2);
            class32.field349.method5455(-2049, var10, var7);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field2667[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1594(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1595(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
