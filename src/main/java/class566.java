import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class566 {
   @OriginalMember(
      owner = "client!mp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8339 = new String[]{method4259(method4258("Q7\u0013*3")), method4259(method4258("Q7\u0013(3")), method4259(method4258("Q7\u0013'3")), method4259(method4258("Q7\u0013$3")), method4259(method4258("Q7\u0013-3")), method4259(method4258("Q7\u0013)3")), method4259(method4258("Q7\u0013&3")), method4259(method4258("Q7\u0013+3"))};
   @OriginalMember(
      owner = "client!mp",
      name = "c",
      descriptor = "I"
   )
   public static int field8338 = 0;
   @OriginalMember(
      owner = "client!mp",
      name = "k",
      descriptor = "I"
   )
   public static int field8326;
   @OriginalMember(
      owner = "client!mp",
      name = "d",
      descriptor = "I"
   )
   public static int field8327;
   @OriginalMember(
      owner = "client!mp",
      name = "b",
      descriptor = "I"
   )
   public static int field8328;
   @OriginalMember(
      owner = "client!mp",
      name = "g",
      descriptor = "I"
   )
   public static int field8329;
   @OriginalMember(
      owner = "client!mp",
      name = "j",
      descriptor = "I"
   )
   public int field8331;
   @OriginalMember(
      owner = "client!mp",
      name = "h",
      descriptor = "I"
   )
   public int field8332;
   @OriginalMember(
      owner = "client!mp",
      name = "e",
      descriptor = "I"
   )
   public static int field8333;
   @OriginalMember(
      owner = "client!mp",
      name = "m",
      descriptor = "I"
   )
   public static int field8334;
   @OriginalMember(
      owner = "client!mp",
      name = "f",
      descriptor = "I"
   )
   public static int field8335;
   @OriginalMember(
      owner = "client!mp",
      name = "a",
      descriptor = "I"
   )
   public int field8337;
   @OriginalMember(
      owner = "client!mp",
      name = "i",
      descriptor = "Lkl;"
   )
   public static class151 field8336;
   @OriginalMember(
      owner = "client!mp",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field8330;

   @OriginalMember(
      owner = "client!mp",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method4250(byte arg0) {
      try {
         ++field8334;
         if (arg0 <= 74) {
            this.field8332 = -101;
         }

         return (1 & this.field8332) != 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8339[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method4251(int arg0) {
      try {
         ++field8329;
         if (arg0 != 9004) {
            return true;
         } else {
            return ~(this.field8332 & 8) != -1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8339[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4252(byte arg0) {
      try {
         class467.field6418 = class15.field276;
         if (arg0 >= -114) {
            field8336 = null;
         }

         class422.field5761 = 0;
         class207.field2630 = new class529[500];
         class283.field3931 = false;
         class379.field5274 = new class529[500];
         class541.field7917 = new class529[2000];
         ++field8328;
         class347.field4763 = class15.field276;
         class484.field6739 = 0;
         class347.field4754 = 0;
         class46.field586 = new int[class174.field2251][class137.field1743 + 1][class181.field2297 + 1];
         class367.field5120 = 0;
         class37.field532 = new class529[1000];
         if (class158.field2032 instanceof class53) {
            class613.field9018 = false;
         } else {
            class613.field9018 = true;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8339[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "c",
      descriptor = "(I)[Lifa;"
   )
   public static final class75[] method4253(int arg0) {
      try {
         if (arg0 != -1) {
            method4253(-83);
         }

         ++field8326;
         return new class75[]{class509.field7100, class469.field6461, class582.field8596, class543.field7928, class280.field3571, client.field1465, class794.field11616, class518.field7251, class13.field252, class698.field10225, class373.field5224, class576.field8547, class190.field2414, class684.field10075, class226.field2823};
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8339[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4254(int arg0) {
      try {
         if (arg0 != 17973) {
            method4254(-45);
         }

         field8330 = null;
         field8336 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8339[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method4255(int arg0) {
      try {
         ++field8333;
         int var2 = 1 / ((-7 - arg0) / 52);
         return ~(this.field8332 & 4) != -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8339[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method4256(int arg0) {
      try {
         ++field8335;
         if (arg0 != 0) {
            return false;
         } else {
            return (2 & this.field8332) != 0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8339[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method4257(int arg0, byte arg1) {
      try {
         if (!class483.field6722 || class689.field10132.length < arg0) {
            class654.field9768 = new int[arg0];
            class315.field4364 = new int[arg0];
            class753.field11030 = new class238[arg0];
            class246.field3101 = new int[arg0];
            class109.field1457 = new int[arg0];
            class689.field10132 = new class670[arg0];
            class92.field1254 = new class670[arg0];
         }

         ++field8327;
         if (arg1 >= -68) {
            field8336 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field8339[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4258(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4259(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 71;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
