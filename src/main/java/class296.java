import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class296 {
   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "Ltv;"
   )
   private class590 field3880 = new class590(64);
   @OriginalMember(
      owner = "client!vca",
      name = "d",
      descriptor = "Lqh;"
   )
   private class74 field3882;
   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3888 = new String[]{method2233(method2232("IFT\u0011")), method2233(method2232("\\\u001d\u0016S\u0017")), method2233(method2232("QPYSVN]Q\tT\u000f")), method2233(method2232("QPYS,\u000f")), method2233(method2232("QPYS)\u000f")), method2233(method2232("QPYS-\u000f")), method2233(method2232("QPYS(\u000f")), method2233(method2232("QPYS/\u000f")), method2233(method2232("QPYS+\u000f")), method2233(method2232("QPYS\"\u000f")), method2233(method2232("QPYS.\u000f"))};
   @OriginalMember(
      owner = "client!vca",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field3885 = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
   @OriginalMember(
      owner = "client!vca",
      name = "i",
      descriptor = "Lnw;"
   )
   public static class616 field3886 = new class616(32, -1);
   @OriginalMember(
      owner = "client!vca",
      name = "l",
      descriptor = "I"
   )
   public static int field3876;
   @OriginalMember(
      owner = "client!vca",
      name = "g",
      descriptor = "I"
   )
   public static int field3877;
   @OriginalMember(
      owner = "client!vca",
      name = "e",
      descriptor = "I"
   )
   public static int field3879;
   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "I"
   )
   public static int field3881;
   @OriginalMember(
      owner = "client!vca",
      name = "j",
      descriptor = "I"
   )
   public static int field3883;
   @OriginalMember(
      owner = "client!vca",
      name = "c",
      descriptor = "I"
   )
   public static int field3884;
   @OriginalMember(
      owner = "client!vca",
      name = "f",
      descriptor = "I"
   )
   public static int field3887;
   @OriginalMember(
      owner = "client!vca",
      name = "h",
      descriptor = "Lvea;"
   )
   public static class289 field3878;

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(II)Lfo;"
   )
   public final class547 method2224(int arg0, int arg1) {
      try {
         ++field3881;
         class590 var3 = this.field3880;
         class547 var4;
         synchronized(this.field3880) {
            var4 = (class547)this.field3880.method4239((long)arg0, arg1 + -22200);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field3882;
            byte[] var6;
            synchronized(this.field3882) {
               var6 = this.field3882.method732(arg0, 35, (byte)91);
            }

            class547 var7 = new class547();
            if (var6 != null) {
               var7.method3954(new class594(var6), -99);
            }

            var7.method3953(true);
            class590 var8 = this.field3880;
            synchronized(this.field3880) {
               this.field3880.method4238(40, var7, (long)arg0);
            }

            if (arg1 != 22200) {
               this.field3882 = null;
            }

            return var7;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field3888[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2225(byte arg0) {
      try {
         field3886 = null;
         if (arg0 != 47) {
            method2229(-45, 98, 69, -30, -50, false);
         }

         field3885 = null;
         field3878 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3888[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method2226(int arg0, int arg1) {
      try {
         ++field3884;
         class590 var3 = this.field3880;
         synchronized(this.field3880) {
            int var4 = 2 % ((arg1 - 61) / 36);
            this.field3880.method4234(2, arg0);
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field3888[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method2227(byte arg0) {
      try {
         class196.field2380 = -1;
         class639.field9015 = -1;
         ++field3877;
         class666.field9474 = 0;
         int var1 = -114 / ((arg0 - -63) / 63);
         class529.field7262 = -1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3888[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "([BI)Z"
   )
   public static final boolean method2228(byte[] arg0, int arg1) {
      try {
         ++field3887;
         class594 var2 = new class594(arg0);
         int var3 = var2.method4288((byte)106);
         if (~var3 != arg1) {
            return false;
         } else {
            boolean var4 = ~var2.method4288((byte)69) == -2;
            if (var4) {
               class622.method4526(var2, -3);
            }

            class2.method14(var2, false);
            return true;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3888[3] + (arg0 != null ? field3888[1] : field3888[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(IIIIIZ)V"
   )
   public static final void method2229(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var6 = client.field4273;

      try {
         ++field3879;
         if (arg3 < 13) {
            method2225((byte)-112);
         }

         if (arg0 < 1) {
            arg0 = 1;
         }

         if (arg4 < 1) {
            arg4 = 1;
         }

         int var7;
         label62: {
            var7 = arg4 - 334;
            if (var7 < 0) {
               var7 = 0;
               if (!var6) {
                  break label62;
               }
            }

            if (var7 > 100) {
               var7 = 100;
            }
         }

         int var8;
         label57: {
            var8 = (-class582.field7991 + class742.field10816) * var7 / 100 + class582.field7991;
            if (var8 < class487.field6716) {
               var8 = class487.field6716;
               if (!var6) {
                  break label57;
               }
            }

            if (var8 > class304.field4030) {
               var8 = class304.field4030;
            }
         }

         label52: {
            int var9 = arg4 * var8 * 512 / (arg0 * 334);
            if (var9 < class500.field6865) {
               var9 = class500.field6865;
               var8 = arg0 * var9 * 334 / (arg4 * 512);
               if (class304.field4030 >= var8) {
                  break label52;
               }

               var8 = class304.field4030;
               int var10 = arg4 * 512 * var8 / (var9 * 334);
               int var11 = (arg0 - var10) / 2;
               if (arg5) {
                  class338.field4832.method593();
                  class338.field4832.method510(3966, arg1, arg2, -16777216, var11, arg4);
                  class338.field4832.method510(3966, arg1, -var11 + arg0 + arg2, -16777216, var11, arg4);
               }

               arg0 -= var11 * 2;
               arg2 += var11;
               if (!var6) {
                  break label52;
               }
            }

            if (class66.field758 < var9) {
               short var12 = class66.field758;
               var8 = arg0 * var12 * 334 / (arg4 * 512);
               if (class487.field6716 > var8) {
                  var8 = class487.field6716;
                  int var13 = arg0 * var12 * 334 / (var8 * 512);
                  int var14 = (-var13 + arg4) / 2;
                  if (arg5) {
                     class338.field4832.method593();
                     class338.field4832.method510(3966, arg1, arg2, -16777216, arg0, var14);
                     class338.field4832.method510(3966, -var14 + arg1 + arg4, arg2, -16777216, arg0, var14);
                  }

                  arg4 -= var14 * 2;
                  arg1 += var14;
               }
            }
         }

         class119.field1451 = arg2;
         class111.field1400 = arg1;
         class479.field6610 = (short)arg0;
         class56.field606 = arg4 * var8 / 334;
         class414.field5819 = (short)arg4;
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field3888[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2230(int arg0) {
      try {
         class590 var2 = this.field3880;
         synchronized(this.field3880) {
            if (arg0 != 1) {
               return;
            }

            this.field3880.method4245(true);
         }

         ++field3876;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field3888[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2231(int arg0) {
      try {
         ++field3883;
         if (arg0 != -16777216) {
            method2225((byte)-53);
         }

         class590 var2 = this.field3880;
         synchronized(this.field3880) {
            this.field3880.method4244(true);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3888[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class296(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field3882 = arg2;
         if (this.field3882 != null) {
            this.field3882.method727(35, -32767);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3888[2] + (arg0 != null ? field3888[1] : field3888[0]) + ',' + arg1 + ',' + (arg2 != null ? field3888[1] : field3888[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2232(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2233(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
