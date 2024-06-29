import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class313 extends class456 {
   @OriginalMember(
      owner = "client!nba",
      name = "C",
      descriptor = "I"
   )
   private int field4475;
   @OriginalMember(
      owner = "client!nba",
      name = "s",
      descriptor = "I"
   )
   private int field4483;
   @OriginalMember(
      owner = "client!nba",
      name = "y",
      descriptor = "I"
   )
   private int field4481;
   @OriginalMember(
      owner = "client!nba",
      name = "F",
      descriptor = "I"
   )
   private int field4479;
   @OriginalMember(
      owner = "client!nba",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4486 = new String[]{method2366(method2365("`N|%\u0003gBt\u007f\u0001&")), method2366(method2365("`N|%u&")), method2366(method2365("`N|%x&")), method2366(method2365("`N|%s&")), method2366(method2365("`N|%p&")), method2366(method2365("`N|%z&")), method2366(method2365("`N|%r&")), method2366(method2365("`N|%y&"))};
   @OriginalMember(
      owner = "client!nba",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field4482 = new int[]{2047, 16383, 65535};
   @OriginalMember(
      owner = "client!nba",
      name = "A",
      descriptor = "Lsda;"
   )
   public static class269 field4471 = new class269(58, -1);
   @OriginalMember(
      owner = "client!nba",
      name = "r",
      descriptor = "I"
   )
   public static int field4467;
   @OriginalMember(
      owner = "client!nba",
      name = "v",
      descriptor = "I"
   )
   private int field4470;
   @OriginalMember(
      owner = "client!nba",
      name = "o",
      descriptor = "I"
   )
   public static int field4472;
   @OriginalMember(
      owner = "client!nba",
      name = "D",
      descriptor = "I"
   )
   public static int field4473;
   @OriginalMember(
      owner = "client!nba",
      name = "t",
      descriptor = "I"
   )
   public static int field4474;
   @OriginalMember(
      owner = "client!nba",
      name = "B",
      descriptor = "I"
   )
   private int field4476;
   @OriginalMember(
      owner = "client!nba",
      name = "w",
      descriptor = "I"
   )
   public static int field4478;
   @OriginalMember(
      owner = "client!nba",
      name = "q",
      descriptor = "I"
   )
   private int field4480;
   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "I"
   )
   public static int field4484;
   @OriginalMember(
      owner = "client!nba",
      name = "G",
      descriptor = "I"
   )
   private int field4485;
   @OriginalMember(
      owner = "client!nba",
      name = "x",
      descriptor = "Lda;"
   )
   public static class67 field4468;
   @OriginalMember(
      owner = "client!nba",
      name = "p",
      descriptor = "[B"
   )
   private byte[] field4469;
   @OriginalMember(
      owner = "client!nba",
      name = "E",
      descriptor = "[[B"
   )
   public static byte[][] field4477;

   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "(B)V",
      line = 4
   )
   public static void method2358(byte arg0) {
      try {
         field4477 = null;
         field4468 = null;
         if (arg0 != 73) {
            method2361(-14, 57, -47, 87);
         }

         field4471 = null;
         field4482 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4486[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(BBI)V",
      line = 22
   )
   public void method2359(byte arg0, byte arg1, int arg2) {
      try {
         ++field4467;
         int var4 = -91 % ((arg1 - 34) / 41);
         this.field4469[arg2] = arg0;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4486[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "d",
      descriptor = "(I)V",
      line = 34
   )
   public static final void method2360(int arg0) {
      try {
         class604.field8885 = new class246[2000];
         class368.field5540 = new class246[1000];
         ++field4473;
         class227.field2907 = false;
         class57.field713 = 0;
         class437.field6663 = new class246[500];
         class724.field10784 = 0;
         if (arg0 > -95) {
            field4477 = null;
         }

         class566.field8432 = class768.field11264;
         class664.field9661 = new int[class424.field6437][class239.field3036 - -1][class220.field2796 + 1];
         class176.field2181 = class768.field11264;
         class601.field8821 = 0;
         class66.field819 = new class246[500];
         class486.field7191 = 0;
         if (!(class261.field3550 instanceof class722)) {
            class554.field8210 = true;
         } else {
            class554.field8210 = false;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4486[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "(IIII)I",
      line = 68
   )
   public static final int method2361(int arg0, int arg1, int arg2, int arg3) {
      try {
         int var6 = arg0 & 3;
         ++field4478;
         if (var6 == 0) {
            return arg1;
         } else if (var6 == 1) {
            return -arg3 + 7;
         } else if (var6 == 2) {
            return -arg1 + 7;
         } else {
            if (arg2 != -26231) {
               method2358((byte)14);
            }

            return arg3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4486[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(IIB)V",
      line = 98
   )
   public final void method2362(int arg0, int arg1, byte arg2) {
      try {
         ++field4472;
         if (arg2 >= -68) {
            method2360(77);
         }

         if (~arg1 != -1) {
            label35: {
               this.field4476 = this.field4480 * this.field4475 >> 12;
               this.field4480 = this.field4483 - (arg0 < 0 ? -arg0 : arg0);
               if (this.field4476 >= 0) {
                  if (this.field4476 <= 4096) {
                     break label35;
                  }

                  this.field4476 = 4096;
                  if (client.field4530 == 0) {
                     break label35;
                  }
               }

               this.field4476 = 0;
            }

            this.field4480 = this.field4480 * this.field4480 >> 12;
            this.field4480 = this.field4480 * this.field4476 >> 12;
            this.field4470 += this.field4480 * this.field4479 >> 12;
            this.field4479 = this.field4481 * this.field4479 >> 12;
         } else {
            this.field4480 = -(arg0 < 0 ? -arg0 : arg0) + this.field4483;
            this.field4480 = this.field4480 * this.field4480 >> 12;
            this.field4476 = 4096;
            this.field4470 = this.field4480;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4486[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "(I)V",
      line = 136
   )
   public final void method2363(int arg0) {
      try {
         ++field4484;
         this.field4485 = 0;
         if (arg0 != -15243) {
            this.field4470 = 78;
         }

         this.field4470 = 0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4486[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(I)V",
      line = 148
   )
   public final void method2364(int arg0) {
      try {
         ++field4474;
         this.field4470 >>= 4;
         if (arg0 > 41) {
            label23: {
               this.field4479 = this.field4481;
               if (this.field4470 >= 0) {
                  if (this.field4470 <= 255) {
                     break label23;
                  }

                  this.field4470 = 255;
                  if (client.field4530 == 0) {
                     break label23;
                  }
               }

               this.field4470 = 0;
            }

            this.method2359((byte)this.field4470, (byte)95, this.field4485++);
            this.field4470 = 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field4486[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "<init>",
      descriptor = "(IIIIIFFF)V",
      line = 171
   )
   public class313(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field4475 = (int)(arg7 * 4096.0F);
         this.field4483 = (int)(arg6 * 4096.0F);
         this.field4479 = this.field4481 = (int)(Math.pow(0.5D, (double)(-arg5)) * 4096.0D);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field4486[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2365(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2366(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
