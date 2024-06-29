import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class561 extends class428 {
   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8022 = new String[]{method4015(method4014("N|5w7")), method4015(method4014("N|5t7"))};
   @OriginalMember(
      owner = "client!tp",
      name = "n",
      descriptor = "I"
   )
   public static int field8017;
   @OriginalMember(
      owner = "client!tp",
      name = "o",
      descriptor = "I"
   )
   public static int field8018;
   @OriginalMember(
      owner = "client!tp",
      name = "p",
      descriptor = "I"
   )
   public static int field8019;
   @OriginalMember(
      owner = "client!tp",
      name = "m",
      descriptor = "I"
   )
   public int field8020;
   @OriginalMember(
      owner = "client!tp",
      name = "q",
      descriptor = "I"
   )
   public int field8021;

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(IIIIII)I",
      line = 11
   )
   public static final int method4012(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field8017;
         if (class731.field10698 == null) {
            return 0;
         } else {
            if (~arg0 > -4) {
               int var6 = arg2 >> 9;
               int var7 = arg5 >> 9;
               if (arg4 < 0 || ~arg1 > -1 || arg4 > class644.field9403 - 1 || arg1 > class337.field4594 + -1) {
                  return 0;
               }

               if (var6 < 1 || ~var7 > -2 || var6 > class644.field9403 + -1 || ~var7 < ~(class337.field4594 + -1)) {
                  return 0;
               }

               boolean var8 = (class613.field9016[1][arg2 >> 9][arg5 >> 9] & 2) != 0;
               if (~(511 & arg2) == -1) {
                  boolean var9 = ~(class613.field9016[1][var6 - 1][arg5 >> 9] & 2) != -1;
                  boolean var10 = ~(2 & class613.field9016[1][var6][arg5 >> 9]) != -1;
                  if (!var10 != !var9) {
                     var8 = ~(2 & class613.field9016[1][arg4][arg1]) != -1;
                  }
               }

               if ((arg5 & 511) == 0) {
                  boolean var11 = (2 & class613.field9016[1][arg2 >> 9][var7 + -1]) != 0;
                  boolean var12 = ~(2 & class613.field9016[1][arg2 >> 9][var7]) != -1;
                  if (var11 == !var12) {
                     var8 = (2 & class613.field9016[1][arg4][arg1]) != 0;
                  }
               }

               if (var8) {
                  ++arg0;
               }
            }

            if (arg3 != -13434) {
               field8019 = 111;
            }

            return class731.field10698[arg0].method2220(arg5, arg2, arg3 + 13357);
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field8022[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "a",
      descriptor = "(I)V",
      line = 76
   )
   public static final void method4013(int arg0) {
      try {
         if (arg0 == -14954) {
            ++field8018;
            class755 var1 = class317.method2325(0L, arg0 + 15049, 15);
            var1.method5481(-112);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8022[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4014(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4015(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
