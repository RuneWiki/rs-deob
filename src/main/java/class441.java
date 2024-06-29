import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class441 extends class644 {
   @OriginalMember(
      owner = "client!fg",
      name = "w",
      descriptor = "I"
   )
   private int field5995 = -1;
   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5996 = new String[]{method3401(method3400("\u000e\u000fCW6")), method3401(method3400("\u0013FC=c")), method3401(method3400("\u0006\u001d\u0001\u007f")), method3401(method3400("\u000e\u000fCR6")), method3401(method3400("\u000e\u000fCQ6")), method3401(method3400("\u000e\u000fCV6"))};
   @OriginalMember(
      owner = "client!fg",
      name = "s",
      descriptor = "Lse;"
   )
   public static class6 field5993 = new class6(20, 8);
   @OriginalMember(
      owner = "client!fg",
      name = "t",
      descriptor = "B"
   )
   private byte field5994;
   @OriginalMember(
      owner = "client!fg",
      name = "v",
      descriptor = "I"
   )
   public static int field5990;
   @OriginalMember(
      owner = "client!fg",
      name = "u",
      descriptor = "I"
   )
   public static int field5991;
   @OriginalMember(
      owner = "client!fg",
      name = "x",
      descriptor = "I"
   )
   public static int field5992;

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(IILha;)Lkv;"
   )
   public static final class19 method3397(int arg0, int arg1, class479 arg2) {
      try {
         if (arg0 != 16) {
            method3398((byte)93);
         }

         ++field5991;
         class553 var3 = class375.method2961(arg1, true, -28218, arg2);
         return var3 == null ? null : var3.field8134;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5996[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5996[1] : field5996[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(ILgea;)V"
   )
   public final void method111(int arg0, class66 arg1) {
      try {
         ++field5992;
         this.field5995 = arg1.method603(-2);
         this.field5994 = arg1.method628((byte)-12);
         if (arg0 != 11) {
            method3398((byte)-74);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5996[5] + arg0 + ',' + (arg1 != null ? field5996[1] : field5996[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(ILkd;)V"
   )
   public final void method114(int arg0, class790 arg1) {
      try {
         if (arg0 == 19163) {
            arg1.method5707(this.field5995, arg0 + -19086, this.field5994);
            ++field5990;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5996[4] + arg0 + ',' + (arg1 != null ? field5996[1] : field5996[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3398(byte arg0) {
      try {
         field5993 = null;
         if (arg0 < 77) {
            field5993 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5996[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(Lnl;Z[[[BIB)Z"
   )
   public static final boolean method3399(class713 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
      if (!class739.field10826) {
         return false;
      } else {
         int var5 = arg0.field10467 >> class783.field11447;
         int var6 = var5;
         int var7 = arg0.field10468 >> class783.field11447;
         int var8 = var7;
         if (arg0 instanceof class680) {
            var6 = ((class680)arg0).field10015;
            var8 = ((class680)arg0).field10020;
            var5 = ((class680)arg0).field10010;
            var7 = ((class680)arg0).field10011;
         }

         for(int var9 = var5; var9 <= var6; ++var9) {
            for(int var10 = var7; var10 <= var8; ++var10) {
               if (arg0.field10459 < class174.field2251 && var9 >= class16.field283 && var9 < class689.field10136 && var10 >= class274.field3507 && var10 < class213.field2707) {
                  if ((arg2 == null || arg0.field10457 < arg3 || arg2[arg0.field10457][var9][var10] != arg4) && arg0.method244(false) && !arg0.method242(-5, class158.field2032)) {
                     return false;
                  }

                  if (!arg1 && var9 >= class699.field10231 - 16 && var9 <= class699.field10231 + 16 && var10 >= class664.field9833 - 16 && var10 <= class664.field9833 + 16) {
                     if (class203.field2588) {
                        class700.field10259[class294.field4127++].method1690(arg0, (byte)-128);
                        class294.field4127 %= class385.field5335;
                     } else {
                        arg0.method174(true, class158.field2032);
                     }
                  }
               }
            }
         }

         return true;
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3400(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3401(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
