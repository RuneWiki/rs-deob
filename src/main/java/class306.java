import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class306 extends class310 {
   @OriginalMember(
      owner = "client!gga",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4432 = new String[]{method2399(method2398("\u0016\u0010/\u0005wY")), method2399(method2398("\u0016\u0010/\u0005sY")), method2399(method2398("\u0016\u0010/\u0005}Y")), method2399(method2398("\u0016\u0010/\u0005|Y")), method2399(method2398("\u0016\u0010/\u0005\u007fY")), method2399(method2398("\u0016\u0010/\u0005xY"))};
   @OriginalMember(
      owner = "client!gga",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field4423 = new int[]{1, -1, -1, 1};
   @OriginalMember(
      owner = "client!gga",
      name = "u",
      descriptor = "I"
   )
   public static int field4424 = 16777215;
   @OriginalMember(
      owner = "client!gga",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field4427 = false;
   @OriginalMember(
      owner = "client!gga",
      name = "r",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4428 = new String[100];
   @OriginalMember(
      owner = "client!gga",
      name = "v",
      descriptor = "F"
   )
   public static float field4425;
   @OriginalMember(
      owner = "client!gga",
      name = "y",
      descriptor = "I"
   )
   public static int field4421;
   @OriginalMember(
      owner = "client!gga",
      name = "x",
      descriptor = "I"
   )
   public static int field4422;
   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "I"
   )
   public static int field4426;
   @OriginalMember(
      owner = "client!gga",
      name = "w",
      descriptor = "I"
   )
   public static int field4429;
   @OriginalMember(
      owner = "client!gga",
      name = "B",
      descriptor = "I"
   )
   public static int field4431;
   @OriginalMember(
      owner = "client!gga",
      name = "t",
      descriptor = "Ltd;"
   )
   private class476 field4430;

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2394(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         label28: {
            ++field4421;
            class82.field1382 = arg2;
            class634.field9251 = arg1;
            if (class402.field5939 != 0) {
               if (~class402.field5939 == -2) {
                  class547.field7911 = class82.field1382 / class438.field6324 + 2 + class692.field10142;
                  class124.field2039 = class634.field9251 / class335.field4788 - (-2 - class164.field2603);
                  class220.field3311 = class547.field7911 * class438.field6324;
                  class31.field473 = class335.field4788 * class124.field2039;
                  class493.field7174 = -class634.field9251 + class31.field473 >> 1;
                  class567.field8231 = -class82.field1382 + class220.field3311 >> 1;
                  if (!var3) {
                     break label28;
                  }
               }

               if (~class402.field5939 != -3) {
                  break label28;
               }

               class220.field3311 = class82.field1382;
               class31.field473 = class634.field9251;
               if (!var3) {
                  break label28;
               }
            }

            class220.field3311 = class82.field1382 - -(class567.field8231 * 2);
            class31.field473 = class634.field9251 - -(class493.field7174 * 2);
         }

         int var4 = 70 / ((arg0 - 21) / 37);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4432[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method59(byte arg0) {
      try {
         ++field4429;
         int var2 = 72 / ((arg0 - 62) / 51);
         return !super.method59((byte)-102) ? false : super.field4479.method1335((byte)115, ((class71)super.field4464).field1262);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4432[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(IIZB)V"
   )
   public final void method2395(int arg0, int arg1, boolean arg2, byte arg3) {
      try {
         ++field4431;
         class444.field6473.method403(arg1 + -2, arg0, super.field4464.field6555 + 4, super.field4464.field6566 + 2, ((class71)super.field4464).field1264, 0);
         class444.field6473.method403(arg1 + -1, arg0 + 1, super.field4464.field6555 - -2, super.field4464.field6566, 0, 0);
         if (arg3 != 36) {
            this.field4430 = null;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field4432[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "<init>",
      descriptor = "(Lhw;Lhw;Lqr;)V"
   )
   public class306(class141 arg0, class141 arg1, class71 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!gga",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2396(byte arg0) {
      try {
         int var1 = -54 % ((arg0 - 22) / 56);
         field4428 = null;
         field4423 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4432[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method61(int arg0) {
      try {
         super.method61(arg0);
         ++field4422;
         this.field4430 = class208.method1771(((class71)super.field4464).field1262, super.field4479, -72);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4432[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "a",
      descriptor = "(IZIZ)V"
   )
   public final void method2397(int arg0, boolean arg1, int arg2, boolean arg3) {
      try {
         ++field4426;
         int var5 = this.method2417(-55) * super.field4464.field6555 / 10000;
         int[] var6 = new int[4];
         class444.field6473.method254(var6);
         class444.field6473.method333(arg2, arg0 + 2, arg2 + var5, arg0 - -super.field4464.field6566);
         if (!arg1) {
            this.field4430.method3607(arg2, arg0 + 2, super.field4464.field6555, super.field4464.field6566);
            class444.field6473.method333(var6[0], var6[1], var6[2], var6[3]);
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field4432[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2398(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2399(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 113;
            break;
         case 1:
            var10005 = 119;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
