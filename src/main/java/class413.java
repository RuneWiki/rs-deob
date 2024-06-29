import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class413 {
   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6324 = new String[]{method3159(method3158(">(I+\u0014")), method3159(method3158(">(I(\u0014")), method3159(method3158(">(I)\u0014")), method3159(method3158("2/\u000b\u0006")), method3159(method3158(">(I/\u0014")), method3159(method3158("'tIDA")), method3159(method3158(">(I.\u0014")), method3159(method3158(">(I,\u0014"))};
   @OriginalMember(
      owner = "client!br",
      name = "e",
      descriptor = "Ldw;"
   )
   public static class748 field6322 = new class748(32);
   @OriginalMember(
      owner = "client!br",
      name = "d",
      descriptor = "I"
   )
   public static int field6319;
   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "I"
   )
   public static int field6320;
   @OriginalMember(
      owner = "client!br",
      name = "b",
      descriptor = "I"
   )
   public static int field6321;
   @OriginalMember(
      owner = "client!br",
      name = "c",
      descriptor = "I"
   )
   public static int field6323;

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method3151(int arg0) {
      try {
         field6322 = null;
         if (arg0 != Integer.MIN_VALUE) {
            field6322 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6324[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(B)V",
      line = 19
   )
   public static final void method3152(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(JJ)J",
      line = 35
   )
   public static long method3153(long arg0, long arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6324[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(Leaa;Leaa;Leaa;Leaa;Z)V",
      line = 42
   )
   public static final void method3154(class526 arg0, class526 arg1, class526 arg2, class526 arg3, boolean arg4) {
      try {
         class384.field5877 = arg0;
         if (!arg4) {
            class241.field3064 = arg2;
            ++field6320;
            class288.field4047 = arg3;
            class136.field1744 = new class544[class241.field3064.method3903((byte)-83)][];
            class685.field10272 = new boolean[class241.field3064.method3903((byte)86)];
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6324[7] + (arg0 != null ? field6324[5] : field6324[3]) + ',' + (arg1 != null ? field6324[5] : field6324[3]) + ',' + (arg2 != null ? field6324[5] : field6324[3]) + ',' + (arg3 != null ? field6324[5] : field6324[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "()V",
      line = 61
   )
   public static final void method3155() {
      for(int var0 = 0; var0 < class102.field1244.length; ++var0) {
         class102.field1244[var0].method1731();
      }

      class102.field1244 = null;
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(Z)V",
      line = 71
   )
   public static final void method3156(boolean arg0) {
      int var1 = client.field4530;

      try {
         if (!arg0) {
            field6322 = null;
         }

         int var2 = 0;
         if (var1 == 0 && var2 >= class130.field1612) {
            ++field6319;
         } else {
            do {
               class581 var3 = class321.field4575[var2];
               if (var3.field8609 == 3) {
                  if (var3.field8603 == null) {
                     var3.field8595 = Integer.MIN_VALUE;
                     if (var1 != 0) {
                        class149.field1871.method5585(var3.field8603);
                        ++var2;
                     } else {
                        ++var2;
                     }
                  } else {
                     class149.field1871.method5585(var3.field8603);
                     ++var2;
                  }
               } else {
                  ++var2;
               }
            } while(var2 < class130.field1612);

            ++field6319;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6324[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(Ljava/util/Random;IB)I",
      line = 102
   )
   public static final int method3157(Random arg0, int arg1, byte arg2) {
      int var3 = client.field4530;

      try {
         ++field6321;
         if (~arg1 >= -1) {
            throw new IllegalArgumentException();
         } else if (class766.method5547(1008, arg1)) {
            return (int)((long)arg1 * (4294967295L & (long)arg0.nextInt()) >> 32);
         } else {
            int var4 = -((int)(4294967296L % (long)arg1)) + Integer.MIN_VALUE;

            while(true) {
               int var5 = arg0.nextInt();

               while(var5 < var4) {
                  if (var3 == 0) {
                     if (arg2 != 54) {
                        method3151(-61);
                     }

                     return class677.method4945(arg1, (byte)87, var5);
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6324[4] + (arg0 != null ? field6324[5] : field6324[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3158(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3159(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
