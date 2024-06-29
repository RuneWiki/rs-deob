import java.awt.Rectangle;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class40 extends class70 {
   @OriginalMember(
      owner = "client!bh",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field436 = new String[]{method281(method280("*0\u00022E")), method281(method280("*0\u00025E")), method281(method280("*0\u00026E")), method281(method280("*0\u00021E")), method281(method280("*0\u00027E")), method281(method280("*0\u00020E"))};
   @OriginalMember(
      owner = "client!bh",
      name = "G",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field425 = new Hashtable();
   @OriginalMember(
      owner = "client!bh",
      name = "D",
      descriptor = "I"
   )
   public static int field433 = -1;
   @OriginalMember(
      owner = "client!bh",
      name = "E",
      descriptor = "I"
   )
   public int field415;
   @OriginalMember(
      owner = "client!bh",
      name = "L",
      descriptor = "I"
   )
   public static int field417;
   @OriginalMember(
      owner = "client!bh",
      name = "H",
      descriptor = "I"
   )
   public static int field418;
   @OriginalMember(
      owner = "client!bh",
      name = "x",
      descriptor = "I"
   )
   public static int field420;
   @OriginalMember(
      owner = "client!bh",
      name = "A",
      descriptor = "I"
   )
   public static int field421;
   @OriginalMember(
      owner = "client!bh",
      name = "Q",
      descriptor = "I"
   )
   public int field422;
   @OriginalMember(
      owner = "client!bh",
      name = "N",
      descriptor = "I"
   )
   public static int field423;
   @OriginalMember(
      owner = "client!bh",
      name = "J",
      descriptor = "I"
   )
   public int field427;
   @OriginalMember(
      owner = "client!bh",
      name = "R",
      descriptor = "I"
   )
   public int field428;
   @OriginalMember(
      owner = "client!bh",
      name = "K",
      descriptor = "I"
   )
   public static int field429;
   @OriginalMember(
      owner = "client!bh",
      name = "I",
      descriptor = "I"
   )
   public int field430;
   @OriginalMember(
      owner = "client!bh",
      name = "P",
      descriptor = "I"
   )
   public int field431;
   @OriginalMember(
      owner = "client!bh",
      name = "F",
      descriptor = "Lpia;"
   )
   public class102 field416;
   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   public String field434;
   @OriginalMember(
      owner = "client!bh",
      name = "O",
      descriptor = "[I"
   )
   public int[] field419;
   @OriginalMember(
      owner = "client!bh",
      name = "M",
      descriptor = "[I"
   )
   public int[] field424;
   @OriginalMember(
      owner = "client!bh",
      name = "y",
      descriptor = "[J"
   )
   public long[] field432;
   @OriginalMember(
      owner = "client!bh",
      name = "C",
      descriptor = "[Lwia;"
   )
   public class791[] field426;
   @OriginalMember(
      owner = "client!bh",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field435;

   @OriginalMember(
      owner = "client!bh",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public static final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg5 != -19594) {
            method277(100, (byte)-105, -2);
         }

         ++field420;
         if (class197.field2442 <= arg4 && ~arg2 >= ~class100.field1232 && arg1 >= class506.field7472 && ~class22.field234 <= ~arg0) {
            if (~arg6 != -2) {
               class347.method2715(arg1, arg4, arg6, arg2, -15115, arg3, arg0);
            } else {
               class451.method3399(1, arg0, arg3, arg2, arg4, arg1);
            }
         } else if (arg6 != 1) {
            class348.method2723(arg0, arg4, true, arg3, arg2, arg1, arg6);
         } else {
            class583.method4299(arg0, arg4, arg2, arg1, arg3, (byte)116);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field436[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "f",
      descriptor = "(I)I"
   )
   public static final int method275(int arg0) {
      try {
         if (arg0 <= 41) {
            return 56;
         } else {
            ++field429;
            return class753.field11133;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field436[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method276(int arg0) {
      try {
         if (arg0 != 0) {
            field433 = 28;
         }

         field425 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field436[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method277(int arg0, byte arg1, int arg2) {
      try {
         ++field423;
         int var3 = 34 % ((1 - arg1) / 34);
         return (55 & arg0) != 0;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field436[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "c",
      descriptor = "(III)V"
   )
   public static final void method278(int arg0, int arg1, int arg2) {
      try {
         ++field418;
         class403 var3 = class453.method3410((long)arg1, true, 12);
         var3.method3093(22144);
         var3.field6185 = arg2;
         if (arg0 != 0) {
            field425 = null;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field436[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(IIBII)V"
   )
   public static final void method279(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field421;
         int var6 = 123 / ((arg2 - -2) / 44);
         int var7 = 0;
         if (var5 == 0 && class117.field1428 <= var7) {
            class458.method3442(arg3 + arg4, 26306, arg4, arg1, arg0 + arg1);
         } else {
            do {
               Rectangle var8 = class521.field7579[var7];
               if (~arg1 > ~(var8.x + var8.width) && ~(arg0 + arg1) < ~var8.x && ~arg4 > ~(var8.y + var8.height) && var8.y < arg3 + arg4) {
                  class446.field6781[var7] = true;
               }

               ++var7;
            } while(class117.field1428 > var7);

            class458.method3442(arg3 + arg4, 26306, arg4, arg1, arg0 + arg1);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field436[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method280(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method281(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
