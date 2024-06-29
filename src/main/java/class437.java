import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class437 extends class301 {
   @OriginalMember(
      owner = "client!mf",
      name = "n",
      descriptor = "[I"
   )
   private int[] field6313;
   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6314 = new String[]{method3283(method3282("]\u000b$\rQ")), method3283(method3282("]\u000b$\u0006Q")), method3283(method3282("]\u000b$v\u0010^\u0004~tQ")), method3283(method3282("]\u000b$\u000fQ")), method3283(method3282("]\u000b$\bQ")), method3283(method3282("^\u0018f&")), method3283(method3282("KC$d\u0004")), method3283(method3282("]\u000b$\u0001Q")), method3283(method3282("]\u000b$\u000eQ"))};
   @OriginalMember(
      owner = "client!mf",
      name = "p",
      descriptor = "Lgh;"
   )
   public static class572 field6306 = new class572(53, -2);
   @OriginalMember(
      owner = "client!mf",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field6311 = new int[2];
   @OriginalMember(
      owner = "client!mf",
      name = "q",
      descriptor = "Lgh;"
   )
   public static class572 field6308 = new class572(33, 7);
   @OriginalMember(
      owner = "client!mf",
      name = "x",
      descriptor = "I"
   )
   public static int field6302;
   @OriginalMember(
      owner = "client!mf",
      name = "r",
      descriptor = "I"
   )
   private int field6303;
   @OriginalMember(
      owner = "client!mf",
      name = "v",
      descriptor = "I"
   )
   public static int field6304;
   @OriginalMember(
      owner = "client!mf",
      name = "u",
      descriptor = "I"
   )
   public static int field6305;
   @OriginalMember(
      owner = "client!mf",
      name = "o",
      descriptor = "I"
   )
   private int field6307;
   @OriginalMember(
      owner = "client!mf",
      name = "m",
      descriptor = "I"
   )
   public static int field6309;
   @OriginalMember(
      owner = "client!mf",
      name = "t",
      descriptor = "I"
   )
   public static int field6310;
   @OriginalMember(
      owner = "client!mf",
      name = "s",
      descriptor = "[B"
   )
   private byte[] field6312;

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(BBI)V",
      line = 5
   )
   public void method2571(byte arg0, byte arg1, int arg2) {
      try {
         ++field6305;
         if (arg1 >= 85) {
            this.field6312[this.field6303++] = (byte)((class66.method706(255, arg0) >> 1) + 127);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6314[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(ILoha;)V",
      line = 22
   )
   public static final void method3280(int arg0, class771 arg1) {
      try {
         ++field6304;
         int var2 = -class29.field458 + arg1.field11239;
         int var3 = arg1.field11309 * 512 + 256 * arg1.method3438(false);
         int var4 = arg1.field11244 * 512 - -(arg1.method3438(false) * 256);
         if (arg0 == -6838) {
            arg1.field4096 += (var4 - arg1.field4096) / var2;
            arg1.field4101 += (-arg1.field4101 + var3) / var2;
            arg1.field11315 = 0;
            if (arg1.field11256 == 0) {
               arg1.method5578(-16384, 8192);
            }

            if (arg1.field11256 == 1) {
               arg1.method5578(-16384, 12288);
            }

            if (~arg1.field11256 == -3) {
               arg1.method5578(-16384, 0);
            }

            if (~arg1.field11256 == -4) {
               arg1.method5578(-16384, 4096);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6314[7] + arg0 + ',' + (arg1 != null ? field6314[6] : field6314[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(B)V",
      line = 54
   )
   public final void method2343(byte arg0) {
      try {
         ++field6302;
         this.field6307 = Math.abs(this.field6307);
         if (this.field6307 >= 4096) {
            this.field6307 = 4095;
         }

         if (arg0 != 19) {
            this.field6312 = null;
         }

         this.method2571((byte)(this.field6307 >> 4), (byte)109, this.field6303++);
         this.field6307 = 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6314[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "b",
      descriptor = "(B)V",
      line = 70
   )
   public static void method3281(byte arg0) {
      try {
         field6308 = null;
         field6311 = null;
         field6306 = null;
         if (arg0 != 24) {
            method3280(-102, (class771)null);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6314[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(IBI)V",
      line = 85
   )
   public final void method2350(int arg0, byte arg1, int arg2) {
      try {
         this.field6307 += this.field6313[arg2] * arg0 >> 12;
         int var4 = -32 / ((-44 - arg1) / 50);
         ++field6310;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field6314[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "<init>",
      descriptor = "(IIIIIF)V",
      line = 107
   )
   public class437(int param1, int param2, int param3, int param4, int param5, float param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mf",
      name = "a",
      descriptor = "(I)V",
      line = 127
   )
   public final void method2346(int arg0) {
      try {
         this.field6307 = 0;
         if (arg0 != -31077) {
            this.field6313 = null;
         }

         this.field6303 = 0;
         ++field6309;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6314[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3282(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3283(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
