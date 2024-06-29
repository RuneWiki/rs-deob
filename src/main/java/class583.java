import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class583 extends class555 {
   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8006 = new String[]{method4192(method4191("x\u0014wE\u000f")), method4192(method4191("x\u0014wF\u000f")), method4192(method4191("jSw/Z")), method4192(method4191("\u007f\b5m")), method4192(method4191("x\u0014wD\u000f")), method4192(method4191("x\u0014wC\u000f")), method4192(method4191("x\u0014wB\u000f")), method4192(method4191("x\u0014w@\u000f")), method4192(method4191("x\u0014wI\u000f")), method4192(method4191("x\u0014wG\u000f"))};
   @OriginalMember(
      owner = "client!ii",
      name = "g",
      descriptor = "J"
   )
   public static long field8001 = 0L;
   @OriginalMember(
      owner = "client!ii",
      name = "o",
      descriptor = "I"
   )
   public static int field7996;
   @OriginalMember(
      owner = "client!ii",
      name = "k",
      descriptor = "I"
   )
   public static int field7997;
   @OriginalMember(
      owner = "client!ii",
      name = "i",
      descriptor = "I"
   )
   public static int field7998;
   @OriginalMember(
      owner = "client!ii",
      name = "h",
      descriptor = "I"
   )
   public static int field8000;
   @OriginalMember(
      owner = "client!ii",
      name = "j",
      descriptor = "I"
   )
   public static int field8002;
   @OriginalMember(
      owner = "client!ii",
      name = "m",
      descriptor = "I"
   )
   public static int field8003;
   @OriginalMember(
      owner = "client!ii",
      name = "f",
      descriptor = "I"
   )
   public static int field8004;
   @OriginalMember(
      owner = "client!ii",
      name = "l",
      descriptor = "I"
   )
   public static int field8005;
   @OriginalMember(
      owner = "client!ii",
      name = "n",
      descriptor = "J"
   )
   public static long field7999;

   @OriginalMember(
      owner = "client!ii",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class583(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field8003;
         if (super.field7633.field8451.method2771(3) && !class288.method2180(super.field7633.field8451.method2770((byte)-77), -6)) {
            super.field7632 = 0;
         }

         if (super.field7632 < 0 || super.field7632 > 1) {
            super.field7632 = this.method635(arg0 + 13839);
         }

         if (arg0 != -13712) {
            field8001 = -59L;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8006[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field7996;
         if (arg1 <= 36) {
            return 37;
         } else {
            return !class288.method2180(super.field7633.field8451.method2770((byte)-72), -6) ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8006[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(Lqh;II)Lbo;"
   )
   public static final class763 method4187(class74 arg0, int arg1, int arg2) {
      try {
         int var3 = 88 % ((1 - arg2) / 61);
         ++field7998;
         class763 var4 = (class763)class347.field4975.method4239((long)arg1, 0);
         if (var4 == null) {
            label24: {
               if (class369.field5204) {
                  var4 = class338.field4832.method549(class267.method2048(arg0, arg1), true);
                  if (!client.field4273) {
                     break label24;
                  }
               }

               var4 = class585.method4199((byte)-93, arg0.method733(arg1, (byte)-71));
            }

            class347.field4975.method4238(31, var4, (long)arg1);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field8006[1] + (arg0 != null ? field8006[2] : field8006[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 <= 124) {
            this.method638(3, (byte)3);
         }

         ++field8004;
         return 0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8006[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class583(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ii",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method4188(byte arg0) {
      try {
         if (arg0 != -107) {
            field8001 = 104L;
         }

         ++field8005;
         return class288.method2180(super.field7633.field8451.method2770((byte)-109), -6);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8006[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         super.field7632 = arg0;
         ++field8002;
         int var3 = 70 % ((arg1 - 12) / 47);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8006[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method4189(byte arg0) {
      try {
         if (arg0 > -61) {
            return 56;
         } else {
            ++field8000;
            return super.field7632;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8006[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(I[IIIILfg;ZIIII[IBII)I"
   )
   public static final int method4190(int param0, int[] param1, int param2, int param3, int param4, class138 param5, boolean param6, int param7, int param8, int param9, int param10, int[] param11, byte param12, int param13, int param14) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4191(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4192(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
