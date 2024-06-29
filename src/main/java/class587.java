import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class587 extends class315 {
   @OriginalMember(
      owner = "client!fa",
      name = "v",
      descriptor = "I"
   )
   private int field8246;
   @OriginalMember(
      owner = "client!fa",
      name = "j",
      descriptor = "I"
   )
   private int field8238;
   @OriginalMember(
      owner = "client!fa",
      name = "u",
      descriptor = "I"
   )
   private int field8230;
   @OriginalMember(
      owner = "client!fa",
      name = "l",
      descriptor = "I"
   )
   private int field8242;
   @OriginalMember(
      owner = "client!fa",
      name = "n",
      descriptor = "I"
   )
   private int field8245;
   @OriginalMember(
      owner = "client!fa",
      name = "x",
      descriptor = "I"
   )
   private int field8243;
   @OriginalMember(
      owner = "client!fa",
      name = "q",
      descriptor = "I"
   )
   private int field8235;
   @OriginalMember(
      owner = "client!fa",
      name = "o",
      descriptor = "I"
   )
   private int field8229;
   @OriginalMember(
      owner = "client!fa",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8251 = new String[]{method4313(method4312("B(`9>")), method4313(method4312("B(`>>")), method4313(method4312("B(`;>")), method4313(method4312("B(`<>")), method4313(method4312("B(`?>")), method4313(method4312("J<\"\u0016")), method4313(method4312("_g`Tk")), method4313(method4312("M(")), method4313(method4312("B(`F\u007fJ :D>")), method4313(method4312("B(`8>"))};
   @OriginalMember(
      owner = "client!fa",
      name = "i",
      descriptor = "Lfm;"
   )
   public static class164 field8231 = new class164(7, 8);
   @OriginalMember(
      owner = "client!fa",
      name = "C",
      descriptor = "I"
   )
   public static int field8236 = 5000;
   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "J"
   )
   public static long field8241 = 0L;
   @OriginalMember(
      owner = "client!fa",
      name = "w",
      descriptor = "I"
   )
   public static int field8239 = 0;
   @OriginalMember(
      owner = "client!fa",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field8248 = false;
   @OriginalMember(
      owner = "client!fa",
      name = "m",
      descriptor = "Lsb;"
   )
   public static class261 field8237 = new class261();
   @OriginalMember(
      owner = "client!fa",
      name = "h",
      descriptor = "I"
   )
   public static int field8232;
   @OriginalMember(
      owner = "client!fa",
      name = "A",
      descriptor = "I"
   )
   public static int field8233;
   @OriginalMember(
      owner = "client!fa",
      name = "B",
      descriptor = "I"
   )
   public static int field8234;
   @OriginalMember(
      owner = "client!fa",
      name = "p",
      descriptor = "I"
   )
   public static int field8240;
   @OriginalMember(
      owner = "client!fa",
      name = "r",
      descriptor = "I"
   )
   public static int field8247;
   @OriginalMember(
      owner = "client!fa",
      name = "s",
      descriptor = "I"
   )
   public static int field8249;
   @OriginalMember(
      owner = "client!fa",
      name = "t",
      descriptor = "Liaa;"
   )
   public static class433 field8244;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!fa",
      name = "y",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8250;

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(BLtf;)V"
   )
   public static final void method4308(byte arg0, class523 arg1) {
      try {
         ++field8234;
         if (class324.field4826 != null) {
            class338 var2 = null;
            if (arg0 == 30) {
               if (~arg1.field7401 == -1) {
                  var2 = (class338)class421.method3284(arg1.field7397, arg1.field7398, arg1.field7399);
               }

               if (arg1.field7401 == 1) {
                  var2 = (class338)class336.method2692(arg1.field7397, arg1.field7398, arg1.field7399);
               }

               if (arg1.field7401 == 2) {
                  var2 = (class338)class331.method2653(arg1.field7397, arg1.field7398, arg1.field7399, field8250 != null ? field8250 : (field8250 = method4311(field8251[7])));
               }

               if (arg1.field7401 == 3) {
                  var2 = (class338)class495.method3755(arg1.field7397, arg1.field7398, arg1.field7399);
               }

               if (var2 != null) {
                  arg1.field7396 = var2.method724(23976);
                  arg1.field7407 = var2.method733(28344);
                  arg1.field7395 = var2.method734(-5723);
               } else {
                  arg1.field7396 = -1;
                  arg1.field7395 = 0;
                  arg1.field7407 = 0;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8251[4] + arg0 + ',' + (arg1 != null ? field8251[6] : field8251[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(IIZ)V"
   )
   public final void method1883(int arg0, int arg1, boolean arg2) {
      try {
         ++field8240;
         if (arg2) {
            this.field8246 = 34;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8251[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "d",
      descriptor = "(I)I"
   )
   public static final int method4309(int arg0) {
      try {
         ++field8247;
         class107 var1 = class545.field7775;
         synchronized(class545.field7775) {
            if (arg0 < 125) {
               method4310(67);
            }

            return class545.field7775.method1054(-108);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8251[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1887(int arg0, int arg1, int arg2) {
      try {
         ++field8233;
         int var4 = this.field8230 * arg2 >> 12;
         if (arg0 == -1) {
            int var5 = this.field8238 * arg1 >> 12;
            int var6 = this.field8245 * arg2 >> 12;
            int var7 = this.field8243 * arg1 >> 12;
            int var8 = this.field8242 * arg2 >> 12;
            int var9 = this.field8246 * arg1 >> 12;
            int var10 = this.field8229 * arg2 >> 12;
            int var11 = this.field8235 * arg1 >> 12;
            class547.method4098(var8, var5, var9, arg0 + 1, var11, super.field4717, var6, var7, var10, var4);
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field8251[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method1886(byte arg0, int arg1, int arg2) {
      try {
         if (arg0 < -114) {
            ++field8232;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8251[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4310(int arg0) {
      try {
         if (arg0 == -18351) {
            field8237 = null;
            field8231 = null;
            field8244 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8251[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class587(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      super(-1, arg8, arg9);

      try {
         this.field8246 = arg5;
         this.field8238 = arg1;
         this.field8230 = arg0;
         this.field8242 = arg4;
         this.field8245 = arg2;
         this.field8243 = arg3;
         this.field8235 = arg7;
         this.field8229 = arg6;
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field8251[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!fa",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4311(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4312(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4313(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
