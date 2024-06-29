import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class750 extends class34 implements class133 {
   @OriginalMember(
      owner = "client!ot",
      name = "l",
      descriptor = "I"
   )
   private int field10947;
   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10956 = new String[]{method5430(method5429("z\f-\u00142")), method5430(method5429("z\f-\u00162")), method5430(method5429("nV-~g")), method5430(method5429("z\f-ls{\u0011wn2")), method5430(method5429("{\ro<")), method5430(method5429("z\f-\u00182")), method5430(method5429("z\f-\u00122")), method5430(method5429("z\f-\u00132")), method5430(method5429("z\f-\u00192")), method5430(method5429("z\f-\u00112")), method5430(method5429("z\f-\u00172"))};
   @OriginalMember(
      owner = "client!ot",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field10951 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
   @OriginalMember(
      owner = "client!ot",
      name = "i",
      descriptor = "I"
   )
   public static int field10946;
   @OriginalMember(
      owner = "client!ot",
      name = "k",
      descriptor = "I"
   )
   public static int field10948;
   @OriginalMember(
      owner = "client!ot",
      name = "c",
      descriptor = "I"
   )
   public static int field10949;
   @OriginalMember(
      owner = "client!ot",
      name = "f",
      descriptor = "I"
   )
   public static int field10950;
   @OriginalMember(
      owner = "client!ot",
      name = "j",
      descriptor = "I"
   )
   public static int field10952;
   @OriginalMember(
      owner = "client!ot",
      name = "g",
      descriptor = "I"
   )
   public static int field10953;
   @OriginalMember(
      owner = "client!ot",
      name = "h",
      descriptor = "I"
   )
   public static int field10954;
   @OriginalMember(
      owner = "client!ot",
      name = "d",
      descriptor = "Ljt;"
   )
   public static class665 field10955;

   @OriginalMember(
      owner = "client!ot",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5425(int arg0) {
      try {
         field10955 = null;
         field10951 = null;
         if (arg0 != -22032) {
            method5425(-20);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10956[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "([BII)[B"
   )
   public static final byte[] method5426(byte[] arg0, int arg1, int arg2) {
      try {
         ++field10948;
         byte[] var3 = new byte[arg1];
         class349.method2762(arg0, 0, var3, arg2, arg1);
         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10956[8] + (arg0 != null ? field10956[2] : field10956[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(IZI[B)V"
   )
   public final void method1122(int arg0, boolean arg1, int arg2, byte[] arg3) {
      try {
         this.method271(arg3, arg0);
         ++field10952;
         this.field10947 = arg2;
         if (!arg1) {
            this.method1122(111, true, -116, (byte[])null);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10956[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10956[2] : field10956[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method1120(byte arg0) {
      try {
         if (arg0 <= 59) {
            this.method1121(114);
         }

         ++field10954;
         return 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10956[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(I[BIIII)V"
   )
   public static final void method5427(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field10950;
         if (arg0 > arg4) {
            arg2 += arg4;
            arg3 = -arg4 + arg0 >> 2;
            int var9;
            if (var6) {
               var9 = arg2 + 1;
               arg1[arg2] = 1;
               int var10 = var9 + 1;
               arg1[var9] = 1;
               int var11 = var10 + 1;
               arg1[var10] = 1;
               arg2 = var11 + 1;
               arg1[var11] = 1;
            }

            while(true) {
               while(true) {
                  --arg3;
                  if (arg3 < 0) {
                     arg3 = arg0 - arg4 & 3;
                     if (!var6) {
                        if (arg5 != 6) {
                           return;
                        }

                        while(true) {
                           --arg3;
                           if (arg3 < 0) {
                              return;
                           }

                           arg1[arg2++] = 1;
                        }
                     }

                     arg1[arg2++] = 1;
                  } else {
                     var9 = arg2 + 1;
                     arg1[arg2] = 1;
                     arg1[var9++] = 1;
                     arg1[var9++] = 1;
                     arg2 = var9 + 1;
                     arg1[var9] = 1;
                  }
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10956[5] + arg0 + ',' + (arg1 != null ? field10956[2] : field10956[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1119(int arg0) {
      try {
         if (arg0 > -2) {
            this.method1119(-101);
         }

         ++field10946;
         return this.field10947;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10956[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "<init>",
      descriptor = "(Liu;I[BI)V"
   )
   public class750(class530 arg0, int arg1, byte[] arg2, int arg3) {
      super(arg0, arg2, arg3);

      try {
         this.field10947 = arg1;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10956[3] + (arg0 != null ? field10956[2] : field10956[4]) + ',' + arg1 + ',' + (arg2 != null ? field10956[2] : field10956[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "a",
      descriptor = "(BIIII)V"
   )
   public static final void method5428(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field10953;
         class487 var5 = class2.method12((long)arg4 << 32 | (long)arg3, 18, (byte)43);
         var5.method3694(-21792);
         int var6 = 89 / ((-75 - arg0) / 48);
         var5.field6794 = arg1;
         var5.field6791 = arg2;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10956[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method1121(int arg0) {
      try {
         ++field10949;
         if (arg0 != -26023) {
            this.field10947 = 12;
         }

         return super.field489.getAddress();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10956[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5429(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ot",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5430(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
