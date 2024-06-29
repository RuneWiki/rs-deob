import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public abstract class class707 extends class616 {
   @OriginalMember(
      owner = "client!nfa",
      name = "I",
      descriptor = "S"
   )
   public short field10573;
   @OriginalMember(
      owner = "client!nfa",
      name = "E",
      descriptor = "S"
   )
   public short field10583;
   @OriginalMember(
      owner = "client!nfa",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10585 = new String[]{method5137(method5136("+\u001eK\b'm")), method5137(method5136(">V\u0004\b\u0018")), method5137(method5136("+\u001eK\b$m")), method5137(method5136("+\rFJ")), method5137(method5136("+\u001eK\b&m")), method5137(method5136("+\u001eK\b m")), method5137(method5136("+\u001eK\b#m")), method5137(method5136("+\u001eK\bY,\u0016CR[m")), method5137(method5136("+\u001eK\b\"m")), method5137(method5136("+\u001eK\b2m")), method5137(method5136("+\u001eK\b0m"))};
   @OriginalMember(
      owner = "client!nfa",
      name = "C",
      descriptor = "Lhn;"
   )
   public static class751 field10576 = new class751(4, 4);
   @OriginalMember(
      owner = "client!nfa",
      name = "B",
      descriptor = "D"
   )
   public static double field10581;
   @OriginalMember(
      owner = "client!nfa",
      name = "F",
      descriptor = "I"
   )
   public static int field10572;
   @OriginalMember(
      owner = "client!nfa",
      name = "G",
      descriptor = "I"
   )
   public static int field10574;
   @OriginalMember(
      owner = "client!nfa",
      name = "A",
      descriptor = "I"
   )
   public static int field10575;
   @OriginalMember(
      owner = "client!nfa",
      name = "K",
      descriptor = "I"
   )
   public static int field10577;
   @OriginalMember(
      owner = "client!nfa",
      name = "D",
      descriptor = "I"
   )
   public static int field10578;
   @OriginalMember(
      owner = "client!nfa",
      name = "J",
      descriptor = "I"
   )
   public static int field10579;
   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "I"
   )
   public static int field10580;
   @OriginalMember(
      owner = "client!nfa",
      name = "y",
      descriptor = "I"
   )
   public static int field10582;
   @OriginalMember(
      owner = "client!nfa",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field10584;

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(IILln;)V",
      line = 3
   )
   public static final void method5134(int arg0, int arg1, class397 arg2) {
      int var3 = client.field4530;

      try {
         int var4;
         int var5;
         label90: {
            ++field10574;
            var4 = -1;
            var5 = 0;
            if (~arg2.field6086 >= ~class314.field4488) {
               if (arg2.field6028 >= class314.field4488) {
                  class408.method3119(arg2, -125);
                  if (var3 == 0) {
                     break label90;
                  }
               }

               class780.method5614(false, arg2, (byte)-1);
               var4 = class453.field6879;
               var5 = class149.field1869;
               if (var3 == 0) {
                  break label90;
               }
            }

            class132.method1130((byte)98, arg2);
         }

         if (~arg2.field9003 > -513 || arg2.field9007 < 512 || arg2.field9003 >= (class323.field4603 + -1) * 512 || ~arg2.field9007 <= ~((class178.field2197 - 1) * 512)) {
            arg2.field6086 = 0;
            var4 = -1;
            var5 = 0;
            arg2.field6028 = 0;
            arg2.field6101 = null;
            arg2.field6072 = -1;
            arg2.field9003 = arg2.field6114[0] * 512 - -(256 * arg2.method3046(-100));
            arg2.field9007 = arg2.field6116[0] * 512 - -(arg2.method3046(-12) * 256);
            arg2.method3055(~arg0);
            int var6 = 0;
            if (var3 != 0 || arg2.field6066.length > var6) {
               do {
                  arg2.field6066[var6].field10190 = -1;
                  ++var6;
               } while(arg2.field6066.length > var6);
            }
         }

         if (class693.field10418 == arg2 && (arg2.field9003 < 6144 || ~arg2.field9007 > -6145 || ~(class323.field4603 * 512 + -6144) >= ~arg2.field9003 || ~arg2.field9007 <= ~(class178.field2197 * 512 + -6144))) {
            var4 = -1;
            arg2.field6086 = 0;
            arg2.field6101 = null;
            arg2.field6072 = -1;
            var5 = 0;
            arg2.field6028 = 0;
            arg2.field9003 = arg2.field6114[0] * 512 - -(256 * arg2.method3046(104));
            arg2.field9007 = arg2.field6116[0] * 512 + arg2.method3046(arg0 ^ -109) * 256;
            arg2.method3055(0);
            int var7 = 0;
            if (var3 != 0) {
               arg2.field6066[var7].field10190 = -1;
               ++var7;
            }

            while(~arg2.field6066.length < ~var7) {
               arg2.field6066[var7].field10190 = -1;
               ++var7;
            }
         }

         if (arg0 == -1) {
            int var8 = class604.method4414(arg2, arg0 + 8);
            class286.method2181(arg2, (byte)-2);
            class770.method5567(true, var4, arg2, var5, var8);
            class175.method1389(var4, arg2, -120);
            class496.method3691(22, arg2);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10585[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10585[1] : field10585[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "d",
      descriptor = "(B)Z",
      line = 88
   )
   public final boolean method19(byte arg0) {
      try {
         ++field10580;
         return arg0 != 70;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10585[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(BLha;)Z",
      line = 100
   )
   public final boolean method1880(byte arg0, class66 arg1) {
      try {
         if (arg0 < 63) {
            field10584 = null;
         }

         ++field10579;
         return class488.method3620(this.method11(0), super.field9007 >> class459.field6950, (byte)126, super.field9005, super.field9003 >> class459.field6950);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10585[2] + arg0 + ',' + (arg1 != null ? field10585[1] : field10585[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(ILha;IZIBLvs;)V",
      line = 111
   )
   public final void method18(int arg0, class66 arg1, int arg2, boolean arg3, int arg4, byte arg5, class616 arg6) {
      try {
         if (arg5 <= 91) {
            field10584 = null;
         }

         ++field10577;
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10585[8] + arg0 + ',' + (arg1 != null ? field10585[1] : field10585[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10585[1] : field10585[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(Z)Z",
      line = 127
   )
   public final boolean method1883(boolean arg0) {
      try {
         ++field10572;
         return arg0 ? true : class569.field8487[(super.field9003 >> class459.field6950) - class681.field10228 - -class488.field7212][(super.field9007 >> class459.field6950) + -class518.field7555 + class488.field7212];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10585[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "m",
      descriptor = "(I)V",
      line = 139
   )
   public static void method5135(int arg0) {
      try {
         if (arg0 > -28) {
            field10584 = null;
         }

         field10584 = null;
         field10576 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10585[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "([Llja;I)I",
      line = 150
   )
   public final int method1881(class744[] arg0, int arg1) {
      try {
         if (arg1 != -52) {
            field10584 = null;
         }

         ++field10578;
         return this.method4469(super.field9003 >> class459.field6950, arg0, super.field9007 >> class459.field6950, (byte)-5);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10585[5] + (arg0 != null ? field10585[1] : field10585[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "g",
      descriptor = "(I)V",
      line = 164
   )
   public final void method3(int arg0) {
      try {
         if (arg0 != 1) {
            this.field10573 = -94;
         }

         ++field10575;
         throw new IllegalStateException();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10585[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "<init>",
      descriptor = "(IIIIIII)V",
      line = 181
   )
   public class707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         super.field9003 = arg0;
         this.field10573 = (short)arg6;
         super.field9005 = (byte)arg4;
         super.field8998 = arg1;
         super.field9007 = arg2;
         this.field10583 = (short)arg5;
         super.field9010 = (byte)arg3;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10585[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5136(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5137(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
