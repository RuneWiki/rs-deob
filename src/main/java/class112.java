import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class112 {
   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1501 = new String[]{method1014(method1013("l-??)")), method1014(method1013("q5}\u0015")), method1014(method1013("dn?W|")), method1014(method1013("l-?;)")), method1014(method1013("l-?8)")), method1014(method1013("l-?=)")), method1014(method1013("l-?<)"))};
   @OriginalMember(
      owner = "client!sm",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field1495 = new int[32];
   @OriginalMember(
      owner = "client!sm",
      name = "f",
      descriptor = "I"
   )
   public static int field1494;
   @OriginalMember(
      owner = "client!sm",
      name = "g",
      descriptor = "I"
   )
   public static int field1496;
   @OriginalMember(
      owner = "client!sm",
      name = "d",
      descriptor = "I"
   )
   public static int field1498;
   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "I"
   )
   public static int field1499;
   @OriginalMember(
      owner = "client!sm",
      name = "c",
      descriptor = "I"
   )
   public static int field1500;
   @OriginalMember(
      owner = "client!sm",
      name = "e",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1497;

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(Liu;IZII)Lik;"
   )
   public static final class124 method1007(class530 arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         ++field1498;
         if (arg2) {
            field1495 = null;
         }

         if (arg0.field7760 || class181.method1525((byte)-17, arg4) && class181.method1525((byte)-23, arg3)) {
            return new class124(arg0, 3553, arg1, arg4, arg3);
         } else {
            return arg0.field7695 ? new class124(arg0, 34037, arg1, arg4, arg3) : new class124(arg0, arg1, arg4, arg3, class109.method978(-1, arg4), class109.method978(-1, arg3));
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field1501[6] + (arg0 != null ? field1501[2] : field1501[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(II)[B"
   )
   public static final synchronized byte[] method1008(int arg0, int arg1) {
      try {
         ++field1496;
         if (arg1 == 100 && class105.field1371 > 0) {
            byte[] var2 = class653.field9753[--class105.field1371];
            class653.field9753[class105.field1371] = null;
            return var2;
         } else if (~arg1 == -5001 && ~class733.field10694 < -1) {
            byte[] var3 = class182.field2313[--class733.field10694];
            class182.field2313[class733.field10694] = null;
            return var3;
         } else if (arg0 != 600) {
            return null;
         } else if (~arg1 == -30001 && class307.field4307 > 0) {
            byte[] var4 = class92.field1250[--class307.field4307];
            class92.field1250[class307.field4307] = null;
            return var4;
         } else {
            if (class77.field1022 != null) {
               for(int var5 = 0; ~class508.field7069.length < ~var5; ++var5) {
                  if (class508.field7069[var5] == arg1 && ~class242.field3047[var5] < -1) {
                     byte[] var6 = class77.field1022[var5][--class242.field3047[var5]];
                     class77.field1022[var5][class242.field3047[var5]] = null;
                     return var6;
                  }
               }
            }

            return new byte[arg1];
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1501[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1009(byte arg0) {
      try {
         if (arg0 < -81) {
            field1495 = null;
            field1497 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1501[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1010(int arg0) {
      try {
         ++field1494;
         int var1 = 0;
         if (class757.field11093 != null) {
            var1 = class757.field11093.field11010.method3209(-18033);
         }

         if (arg0 != 24242) {
            field1497 = null;
         }

         if (~var1 == -3) {
            int var2 = ~class282.field3917 >= -801 ? class282.field3917 : 800;
            class543.field7943 = (-var2 + class282.field3917) / 2;
            class204.field2605 = var2;
            int var3 = ~class315.field4358 >= -601 ? class315.field4358 : 600;
            class91.field1242 = var3;
            class549.field8088 = 0;
         } else if (~var1 == -2) {
            int var4 = class282.field3917 > 1024 ? 1024 : class282.field3917;
            int var5 = ~class315.field4358 >= -769 ? class315.field4358 : 768;
            class543.field7943 = (-var4 + class282.field3917) / 2;
            class204.field2605 = var4;
            class91.field1242 = var5;
            class549.field8088 = 0;
         } else {
            class549.field8088 = 0;
            class91.field1242 = class315.field4358;
            class543.field7943 = 0;
            class204.field2605 = class282.field3917;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1501[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(B[B)V"
   )
   public static final synchronized void method1011(byte param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(III)Lpf;"
   )
   public static final class30 method1012(int arg0, int arg1, int arg2) {
      class731 var3 = class548.field8080[arg0][arg1][arg2];
      return var3 == null ? null : var3.field10642;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1013(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1014(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
