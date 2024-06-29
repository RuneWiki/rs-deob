import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class401 extends class683 implements class576 {
   @OriginalMember(
      owner = "client!ln",
      name = "D",
      descriptor = "Lria;"
   )
   private class301 field5809;
   @OriginalMember(
      owner = "client!ln",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5813 = new String[]{method3032(method3031("Vj[f_")), method3032(method3031("Vj[g_")), method3032(method3031("Vj[k_")), method3032(method3031("Vj[j_")), method3032(method3031("Vj[e_")), method3032(method3031("Vj[d_")), method3032(method3031("Vj[a_")), method3032(method3031("Vj[\u0011\u001eTm\u0001\u0013_")), method3032(method3031("A*[\u0003\n")), method3032(method3031("Tq\u0019A")), method3032(method3031("Vj[l_"))};
   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "[J"
   )
   public static long[] field5811 = new long[32];
   @OriginalMember(
      owner = "client!ln",
      name = "F",
      descriptor = "Z"
   )
   public static boolean field5812 = false;
   @OriginalMember(
      owner = "client!ln",
      name = "E",
      descriptor = "I"
   )
   public static int field5803;
   @OriginalMember(
      owner = "client!ln",
      name = "y",
      descriptor = "I"
   )
   public static int field5804;
   @OriginalMember(
      owner = "client!ln",
      name = "w",
      descriptor = "I"
   )
   public static int field5805;
   @OriginalMember(
      owner = "client!ln",
      name = "A",
      descriptor = "I"
   )
   public static int field5806;
   @OriginalMember(
      owner = "client!ln",
      name = "x",
      descriptor = "I"
   )
   public static int field5807;
   @OriginalMember(
      owner = "client!ln",
      name = "C",
      descriptor = "I"
   )
   public static int field5808;
   @OriginalMember(
      owner = "client!ln",
      name = "B",
      descriptor = "I"
   )
   public static int field5810;

   @OriginalMember(
      owner = "client!ln",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method2282(int arg0) {
      try {
         ++field5804;
         int var2 = 8 / ((arg0 - -9) / 36);
         return super.method4982(true, super.field10047.field7144);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5813[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(ZB)Ljaclib/memory/Buffer;"
   )
   public final Buffer method2283(boolean arg0, byte arg1) {
      try {
         ++field5808;
         return arg1 < 105 ? null : super.method4984(arg0, (byte)-41, super.field10047.field7144);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5813[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1412(int arg0) {
      try {
         ++field5805;
         if (arg0 < 6) {
            field5811 = null;
         }

         super.method1412(76);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5813[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2281(int arg0, int arg1) {
      try {
         super.method2281(arg0, this.field5809.field4112 * arg1);
         ++field5806;
         if (arg0 != -4657) {
            this.method2283(false, (byte)-10);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5813[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "i",
      descriptor = "(I)V"
   )
   public static final void method3029(int arg0) {
      try {
         class274.field3758.method590(class342.field4647, class300.field4107.field6455.method5490(-126) != 1 ? -1 : class273.field3755 - -256 << 2, 0);
         ++field5810;
         if (arg0 >= -96) {
            method3029(62);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5813[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "b",
      descriptor = "(I)Lria;"
   )
   public final class301 method2284(int arg0) {
      try {
         if (arg0 != 10739) {
            return null;
         } else {
            ++field5807;
            return this.field5809;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5813[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method1408(boolean arg0) {
      try {
         if (!arg0) {
            field5811 = null;
         }

         ++field5803;
         return super.method1408(true);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5813[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "<init>",
      descriptor = "(Lwi;Lria;Z)V"
   )
   public class401(class494 arg0, class301 arg1, boolean arg2) {
      super(arg0, 34963, arg2);

      try {
         this.field5809 = arg1;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5813[7] + (arg0 != null ? field5813[8] : field5813[9]) + ',' + (arg1 != null ? field5813[8] : field5813[9]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method3030(int arg0) {
      try {
         if (arg0 == 14594) {
            field5811 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5813[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3031(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ln",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3032(char[] arg0) {
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
            var10005 = 4;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
