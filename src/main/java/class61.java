import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class61 extends class264 {
   @OriginalMember(
      owner = "client!gda",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field749 = new String[]{method471(method470("wr+M`8")), method471(method470("wr+Ma8")), method471(method470("wr+Mf8")), method471(method470("wr+Mg8"))};
   @OriginalMember(
      owner = "client!gda",
      name = "F",
      descriptor = "I"
   )
   public static int field745;
   @OriginalMember(
      owner = "client!gda",
      name = "G",
      descriptor = "I"
   )
   public static int field746;
   @OriginalMember(
      owner = "client!gda",
      name = "I",
      descriptor = "I"
   )
   public static int field748;
   @OriginalMember(
      owner = "client!gda",
      name = "H",
      descriptor = "Llr;"
   )
   public static class786 field747;

   @OriginalMember(
      owner = "client!gda",
      name = "g",
      descriptor = "(I)V",
      line = 3
   )
   public static final void method467(int arg0) {
      boolean var1 = client.field4360;

      try {
         label32: {
            ++field746;
            int var2 = class300.field4107.field6413.method3360(114);
            if (~var2 != -1) {
               if (~var2 != -2) {
                  class70.method653(true, (byte)(255 & class154.field2197 - 4));
                  class741.method5371(2, (byte)106);
                  if (!var1) {
                     break label32;
                  }
               }

               class70.method653(true, (byte)0);
               class741.method5371(512, (byte)109);
               if (class613.field9016 == null) {
                  break label32;
               }

               class153.method1282(0);
               if (!var1) {
                  break label32;
               }
            }

            class706.field10315 = null;
            class741.method5371(0, (byte)-21);
         }

         if (arg0 >= -126) {
            method468(-115, -1.7200704F, -71, -64, false, 74, 31, -122);
         }

         class14.field156 = class561.field8019;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field749[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(IFIIZIII)[I",
      line = 38
   )
   public static final int[] method468(int arg0, float arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
      try {
         ++field748;
         int[] var8 = new int[arg2];
         class641 var9 = new class641();
         var9.field9362 = arg4;
         var9.field9375 = arg0;
         var9.field9373 = (int)(arg1 * 4096.0F);
         var9.field9371 = arg5;
         var9.field9378 = arg7;
         var9.field9364 = arg6;
         var9.method413(52);
         class109.method884((byte)-22, 1, arg2);
         var9.method4631(true, var8, arg3);
         return var8;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field749[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "d",
      descriptor = "(I)V",
      line = 60
   )
   public static void method469(int arg0) {
      try {
         field747 = null;
         int var1 = -120 % ((-27 - arg0) / 46);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field749[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "a",
      descriptor = "(II)[I",
      line = 69
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = -59 % ((arg1 - 24) / 44);
         ++field745;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int[][] var6 = this.method2015(0, (byte)76, arg0);
            int[] var7 = var6[0];
            int[] var8 = var6[1];
            int[] var9 = var6[2];
            int var10 = 0;
            if (var3 || ~var10 > ~class430.field6152) {
               do {
                  var5[var10] = (var7[var10] - -var8[var10] - -var9[var10]) / 3;
                  ++var10;
               } while(~var10 > ~class430.field6152);
            }
         }

         return var5;
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field749[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gda",
      name = "<init>",
      descriptor = "()V",
      line = 111
   )
   public class61() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method470(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method471(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
