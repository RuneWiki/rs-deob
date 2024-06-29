import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class275 extends class213 {
   @OriginalMember(
      owner = "client!mb",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3672 = new String[]{method2097(method2096(")wMR0")), method2097(method2096(")wMS0")), method2097(method2096(")wMT0")), method2097(method2096(")wMU0")), method2097(method2096(")wMQ0"))};
   @OriginalMember(
      owner = "client!mb",
      name = "G",
      descriptor = "I"
   )
   public static int field3669 = 2;
   @OriginalMember(
      owner = "client!mb",
      name = "D",
      descriptor = "I"
   )
   public static int field3665;
   @OriginalMember(
      owner = "client!mb",
      name = "I",
      descriptor = "I"
   )
   public static int field3666;
   @OriginalMember(
      owner = "client!mb",
      name = "E",
      descriptor = "I"
   )
   public static int field3667;
   @OriginalMember(
      owner = "client!mb",
      name = "J",
      descriptor = "I"
   )
   public static int field3668;
   @OriginalMember(
      owner = "client!mb",
      name = "F",
      descriptor = "I"
   )
   public static int field3670;
   @OriginalMember(
      owner = "client!mb",
      name = "H",
      descriptor = "I"
   )
   public static int field3671;

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(IBIJ)V"
   )
   public static final void method2092(int arg0, byte arg1, int arg2, long arg3) {
      try {
         ++field3670;
         int var5 = 31 & (int)arg3 >> 14;
         int var6 = (3295514 & (int)arg3) >> 20;
         int var7 = (int)(arg3 >>> 32) & Integer.MAX_VALUE;
         int var8 = 69 % ((arg1 - 39) / 41);
         if (var5 != 10 && ~var5 != -12 && ~var5 != -23) {
            class280.method2134(true, arg0, 0, 0, 119, 0, var6, arg2, var5);
         } else {
            class774 var9;
            int var10;
            int var11;
            label31: {
               var9 = class472.field6533.method3586(64, var7);
               if (var6 != 0 && var6 != 2) {
                  var10 = var9.field11251;
                  var11 = var9.field11168;
                  if (!client.field4273) {
                     break label31;
                  }
               }

               var11 = var9.field11251;
               var10 = var9.field11168;
            }

            int var12 = var9.field11208;
            if (var6 != 0) {
               var12 = (15 & var12 << var6) - -(var12 >> -var6 + 4);
            }

            class280.method2134(true, arg0, var12, var10, 59, var11, 0, arg2, 0);
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field3672[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(IBI)B"
   )
   public static final byte method2093(int arg0, byte arg1, int arg2) {
      try {
         ++field3665;
         if (arg2 != 9) {
            return 0;
         } else {
            if (arg1 < 107) {
               field3671 = -104;
            }

            return (byte)((arg0 & 1) == 0 ? 1 : 2);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3672[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "(BII)I"
   )
   private final int method2094(byte arg0, int arg1, int arg2) {
      try {
         ++field3667;
         int var4 = arg2 * 57 + arg1;
         int var5 = var4 << 1 ^ var4;
         return arg0 >= -69 ? 124 : 4096 - ((var5 * var5 * 15731 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field3672[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 != 2064866508) {
            field3669 = -102;
         }

         ++field3666;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int var5 = class551.field7586[arg0];
            int var6 = 0;
            if (var3 || ~var6 > ~class576.field7916) {
               do {
                  var4[var6] = this.method2094((byte)-115, class534.field7301[var6], var5) % 4096;
                  ++var6;
               } while(~var6 > ~class576.field7916);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field3672[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method2095(int arg0, int arg1, int arg2) {
      try {
         ++field3668;
         int var3 = 86 % ((arg0 - 47) / 38);
         class446 var4 = class635.method4607(127, (long)arg2, 13);
         var4.method3311(true);
         var4.field6167 = arg1;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3672[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "<init>",
      descriptor = "()V"
   )
   public class275() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2096(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2097(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
