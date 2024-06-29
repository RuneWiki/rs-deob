import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class670 extends class141 {
   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9730 = new String[]{method4885(method4884("^\\<5~")), method4885(method4884("^\\<<~")), method4885(method4884("^\\<:~")), method4885(method4884("SB~\u0013")), method4885(method4884("F\u0019<Q+")), method4885(method4884("^\\<=~")), method4885(method4884("^\\<;~")), method4885(method4884("^\\<7~")), method4885(method4884("^\\<6~")), method4885(method4884("^\\<>~")), method4885(method4884("^\\<9~")), method4885(method4884("^\\<8~"))};
   @OriginalMember(
      owner = "client!ck",
      name = "v",
      descriptor = "Leg;"
   )
   public static class118 field9727 = new class118(5, 3);
   @OriginalMember(
      owner = "client!ck",
      name = "m",
      descriptor = "I"
   )
   public static int field9720;
   @OriginalMember(
      owner = "client!ck",
      name = "s",
      descriptor = "I"
   )
   public static int field9721;
   @OriginalMember(
      owner = "client!ck",
      name = "u",
      descriptor = "I"
   )
   public static int field9722;
   @OriginalMember(
      owner = "client!ck",
      name = "p",
      descriptor = "I"
   )
   public static int field9723;
   @OriginalMember(
      owner = "client!ck",
      name = "t",
      descriptor = "I"
   )
   public static int field9724;
   @OriginalMember(
      owner = "client!ck",
      name = "q",
      descriptor = "I"
   )
   public static int field9725;
   @OriginalMember(
      owner = "client!ck",
      name = "o",
      descriptor = "I"
   )
   public static int field9726;
   @OriginalMember(
      owner = "client!ck",
      name = "n",
      descriptor = "I"
   )
   public static int field9728;
   @OriginalMember(
      owner = "client!ck",
      name = "r",
      descriptor = "I"
   )
   public static int field9729;

   @OriginalMember(
      owner = "client!ck",
      name = "h",
      descriptor = "(B)V"
   )
   public static final void method4880(byte arg0) {
      try {
         class23.method140(arg0 ^ 10);
         ++field9721;
         if (arg0 != -99) {
            method4880((byte)6);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9730[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "f",
      descriptor = "(B)V"
   )
   public final void method307(byte arg0) {
      try {
         ++field9728;
         if (arg0 <= 102) {
            field9727 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9730[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(ZZ)V"
   )
   public final void method309(boolean arg0, boolean arg1) {
      try {
         ++field9724;
         if (arg0) {
            field9727 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9730[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4881(int arg0) {
      try {
         ++field9723;
         class270.field3737.method4215(false);
         class672.field9747 = null;
         if (arg0 != -29068) {
            method4883((byte)17);
         }

         class4.field38 = 1;
         class80.field1029 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9730[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method311(boolean arg0, boolean arg1) {
      try {
         ++field9729;
         if (arg0) {
            field9727 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9730[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method317(int arg0, int arg1, int arg2) {
      try {
         ++field9720;
         if (arg0 != 0) {
            field9727 = null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9730[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method4882(boolean arg0, int arg1) {
      try {
         ++field9725;
         class603.field8876.method1230(class50.field660.method600());
         int[] var2 = class50.field660.method558();
         class138.field1759 = var2[1];
         if (arg1 > -125) {
            method4881(-45);
         }

         class679.field9998 = var2[3];
         class285.field3950 = var2[0];
         class159.field2267 = var2[2];
         if (!arg0) {
            class50.field660.method492(class788.field11566, class237.field3308, class223.field3172, class71.field867);
            class350.method2551(11059, class475.field6833);
         } else {
            class50.field660.method492(class720.field10515, class225.field3200, class586.field8666, class342.field4645);
            class350.method2551(11059, class379.field5461);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9730[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lm;II)V"
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      try {
         super.field1801.method2804(arg0, -2);
         ++field9726;
         if (arg2 != 0) {
            field9727 = null;
         }

         super.field1801.method2747((byte)-95, arg1);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9730[5] + (arg0 != null ? field9730[4] : field9730[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method313(boolean arg0) {
      try {
         if (!arg0) {
            field9727 = null;
         }

         ++field9722;
         return false;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9730[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "<init>",
      descriptor = "(Lsc;)V"
   )
   public class670(class369 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ck",
      name = "i",
      descriptor = "(B)V"
   )
   public static void method4883(byte arg0) {
      try {
         field9727 = null;
         if (arg0 >= -65) {
            field9727 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9730[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4884(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4885(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
