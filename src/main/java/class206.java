import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class206 extends class594 {
   @OriginalMember(
      owner = "client!me",
      name = "Xb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2540 = new String[]{method1568(method1567("nni\u0005\u0010")), method1568(method1567("nni\t\u0010")), method1568(method1567("nni\b\u0010")), method1568(method1567("nni\u000b\u0010")), method1568(method1567("m~+-")), method1568(method1567("nni\u0004\u0010")), method1568(method1567("x%ioE")), method1568(method1567("nni\f\u0010")), method1568(method1567("nni\r\u0010")), method1568(method1567("nni\u0000\u0010")), method1568(method1567("nni\u0006\u0010")), method1568(method1567("nni\u0007\u0010")), method1568(method1567("nni\u0002\u0010")), method1568(method1567("nni\n\u0010")), method1568(method1567("nni\u0003\u0010"))};
   @OriginalMember(
      owner = "client!me",
      name = "Mb",
      descriptor = "I"
   )
   public static int field2535 = 0;
   @OriginalMember(
      owner = "client!me",
      name = "Nb",
      descriptor = "Lol;"
   )
   public static class300 field2525 = new class300();
   @OriginalMember(
      owner = "client!me",
      name = "Ob",
      descriptor = "I"
   )
   public static int field2523;
   @OriginalMember(
      owner = "client!me",
      name = "Qb",
      descriptor = "I"
   )
   public static int field2524;
   @OriginalMember(
      owner = "client!me",
      name = "Pb",
      descriptor = "I"
   )
   public static int field2526;
   @OriginalMember(
      owner = "client!me",
      name = "Ub",
      descriptor = "I"
   )
   public static int field2527;
   @OriginalMember(
      owner = "client!me",
      name = "Lb",
      descriptor = "I"
   )
   public static int field2528;
   @OriginalMember(
      owner = "client!me",
      name = "Sb",
      descriptor = "I"
   )
   public static int field2529;
   @OriginalMember(
      owner = "client!me",
      name = "Ib",
      descriptor = "I"
   )
   public static int field2530;
   @OriginalMember(
      owner = "client!me",
      name = "Rb",
      descriptor = "I"
   )
   public static int field2531;
   @OriginalMember(
      owner = "client!me",
      name = "Kb",
      descriptor = "I"
   )
   public static int field2532;
   @OriginalMember(
      owner = "client!me",
      name = "Tb",
      descriptor = "I"
   )
   public static int field2533;
   @OriginalMember(
      owner = "client!me",
      name = "Jb",
      descriptor = "I"
   )
   public static int field2534;
   @OriginalMember(
      owner = "client!me",
      name = "Gb",
      descriptor = "I"
   )
   private int field2536;
   @OriginalMember(
      owner = "client!me",
      name = "Hb",
      descriptor = "I"
   )
   public static int field2538;
   @OriginalMember(
      owner = "client!me",
      name = "Vb",
      descriptor = "Laj;"
   )
   private class333 field2537;
   @OriginalMember(
      owner = "client!me",
      name = "Wb",
      descriptor = "[Lbo;"
   )
   public static class763[] field2539;

   @OriginalMember(
      owner = "client!me",
      name = "x",
      descriptor = "(I)V"
   )
   public final void method1554(int arg0) {
      try {
         super.field8243 = (this.field2536 + arg0) / 8;
         ++field2528;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2540[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "y",
      descriptor = "(I)Z"
   )
   public final boolean method1555(int arg0) {
      try {
         ++field2532;
         int var2 = super.field8227[super.field8243] + -this.field2537.method2648(7) & 255;
         if (~var2 > -129) {
            return false;
         } else {
            if (arg0 != 7537) {
               field2525 = null;
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2540[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(I[BII)V"
   )
   public final void method1556(int param1, byte[] param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(BLaj;)V"
   )
   public final void method1557(byte arg0, class333 arg1) {
      try {
         ++field2538;
         this.field2537 = arg1;
         if (arg0 != -118) {
            this.field2537 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2540[7] + arg0 + ',' + (arg1 != null ? field2540[6] : field2540[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "([II)V"
   )
   public final void method1558(int[] arg0, int arg1) {
      try {
         ++field2531;
         this.field2537 = new class333(arg0);
         if (arg1 > -124) {
            this.method1561(36, (byte)-96);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2540[12] + (arg0 != null ? field2540[6] : field2540[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "a",
      descriptor = "(IIIIBI)V"
   )
   public static final void method1559(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
      try {
         if (~class674.field9907.field8453.method5190((byte)-116) != -1 && arg1 != 0 && ~class56.field610 > -51 && arg3 != -1) {
            class701.field10206[class56.field610++] = new class693((byte)1, arg3, arg1, arg5, arg2, 0, arg0, (class80)null);
         }

         ++field2533;
         if (arg4 != 1) {
            method1562((byte)69);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field2540[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "(I)V"
   )
   public static final void method1560(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!me",
      name = "d",
      descriptor = "(IB)I"
   )
   public final int method1561(int arg0, byte arg1) {
      try {
         if (arg1 <= 43) {
            return 23;
         } else {
            ++field2534;
            return arg0 * 8 + -this.field2536;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2540[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class206(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!me",
      name = "l",
      descriptor = "(B)V"
   )
   public static void method1562(byte arg0) {
      try {
         field2539 = null;
         field2525 = null;
         if (arg0 != 48) {
            field2535 = 64;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2540[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "A",
      descriptor = "(I)V"
   )
   public final void method1563(int arg0) {
      try {
         if (arg0 != 11798) {
            this.method1558((int[])null, -18);
         }

         ++field2527;
         this.field2536 = super.field8243 * 8;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2540[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "b",
      descriptor = "(BI)V"
   )
   public final void method1564(byte arg0, int arg1) {
      try {
         ++field2529;
         if (arg0 != 106) {
            this.method1555(-54);
         }

         super.field8227[super.field8243++] = (byte)(arg1 + this.field2537.method2650((byte)30));
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2540[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "w",
      descriptor = "(I)I"
   )
   public final int method1565(int arg0) {
      try {
         ++field2524;
         int var2 = -99 / ((-61 - arg0) / 54);
         int var3 = super.field8227[super.field8243++] + -this.field2537.method2650((byte)30) & 255;
         return var3 < 128 ? var3 : (super.field8227[super.field8243++] + -this.field2537.method2650((byte)30) & 255) + (var3 + -128 << 8);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2540[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "r",
      descriptor = "(II)I"
   )
   public final int method1566(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2523;
         int var4 = this.field2536 >> 3;
         int var5 = -(7 & this.field2536) + 8;
         this.field2536 += arg0;
         int var6 = 0;
         if (var3) {
            var6 += (class500.field6869[var5] & super.field8227[var4++]) << -var5 + arg0;
            arg0 -= var5;
            var5 = 8;
         }

         while(true) {
            while(arg0 > var5) {
               var6 += (class500.field6869[var5] & super.field8227[var4++]) << -var5 + arg0;
               arg0 -= var5;
               var5 = 8;
            }

            if (!var3) {
               label25: {
                  if (var5 != arg0) {
                     var6 += super.field8227[var4] >> -arg0 + var5 & class500.field6869[arg0];
                     if (!var3) {
                        break label25;
                     }
                  }

                  var6 += super.field8227[var4] & class500.field6869[var5];
               }

               if (arg1 != -12869) {
                  return 94;
               }

               return var6;
            }

            arg0 = var5 - arg0;
            var5 = 8;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2540[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1567(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!me",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1568(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
