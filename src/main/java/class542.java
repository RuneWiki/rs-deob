import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class542 implements Runnable {
   @OriginalMember(
      owner = "client!vaa",
      name = "h",
      descriptor = "Lsb;"
   )
   private class261 field7644 = new class261();
   @OriginalMember(
      owner = "client!vaa",
      name = "c",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field7643;
   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7648 = new String[]{method4046(method4045(">[0sE")), method4046(method4045("3\u0014\u007fsym")), method4046(method4045("+\u0000r1")), method4046(method4045("3\u0014\u007fs}m")), method4046(method4045("3\u0014\u007fs|m")), method4046(method4045("3\u0014\u007fs\u0004,\u001bw)\u0006m")), method4046(method4045("3\u0014\u007fsJ0\u001b6")), method4046(method4045("3\u0014\u007fs~m")), method4046(method4045("3\u0014\u007fs{m")), method4046(method4045("\u0003\u0005mg")), method4046(method4045("3\u0014\u007fszm")), method4046(method4045("\b\u0010sg")), method4046(method4045("3\u0014\u007fs\u007fm")), method4046(method4045("3\u0014\u007fspm"))};
   @OriginalMember(
      owner = "client!vaa",
      name = "e",
      descriptor = "I"
   )
   public static int field7636;
   @OriginalMember(
      owner = "client!vaa",
      name = "g",
      descriptor = "I"
   )
   public static int field7637;
   @OriginalMember(
      owner = "client!vaa",
      name = "l",
      descriptor = "I"
   )
   public static int field7638;
   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "I"
   )
   public static int field7640;
   @OriginalMember(
      owner = "client!vaa",
      name = "k",
      descriptor = "I"
   )
   public static int field7641;
   @OriginalMember(
      owner = "client!vaa",
      name = "b",
      descriptor = "I"
   )
   public static int field7642;
   @OriginalMember(
      owner = "client!vaa",
      name = "i",
      descriptor = "I"
   )
   public static int field7645;
   @OriginalMember(
      owner = "client!vaa",
      name = "j",
      descriptor = "I"
   )
   public static int field7646;
   @OriginalMember(
      owner = "client!vaa",
      name = "d",
      descriptor = "I"
   )
   public static int field7647;
   @OriginalMember(
      owner = "client!vaa",
      name = "f",
      descriptor = "Lag;"
   )
   public static class583 field7639;

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4037(int arg0) {
      try {
         if (arg0 > -63) {
            field7639 = null;
         }

         field7639 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7648[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4038(int arg0) {
      try {
         ++field7647;
         if (this.field7643 != null) {
            if (arg0 <= 125) {
               field7639 = null;
            }

            this.method4044(new class247(), true);

            try {
               this.field7643.join();
            } catch (InterruptedException var3) {
            }

            this.field7643 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7648[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field10022;

      try {
         ++field7640;

         while(true) {
            class261 var2 = this.field7644;
            class393 var4;
            synchronized(this.field7644) {
               class247 var3 = this.field7644.method2235(9);
               if (var1) {
                  try {
                     this.field7644.wait();
                  } catch (InterruptedException var12) {
                  }

                  var3 = this.field7644.method2235(-111);
               }

               while(true) {
                  while(var3 == null) {
                     try {
                        this.field7644.wait();
                     } catch (InterruptedException var10) {
                     }

                     var3 = this.field7644.method2235(-111);
                  }

                  if (!var1) {
                     if (!(var3 instanceof class393)) {
                        return;
                     }

                     var4 = (class393)var3;
                     break;
                  }

                  var3 = var3;
               }
            }

            int var6;
            try {
               byte[] var5 = InetAddress.getByName(var4.field5706).getAddress();
               var6 = jagmisc.ping(var5[0], var5[1], var5[2], var5[3], 1000L);
            } catch (Throwable var11) {
               var6 = 1000;
            }

            var4.field5708 = var6;
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field7648[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Laaa;"
   )
   public final class393 method4039(String arg0, byte arg1) {
      try {
         ++field7642;
         int var3 = -37 / ((-36 - arg1) / 43);
         if (this.field7643 == null) {
            throw new IllegalStateException("");
         } else if (arg0 == null) {
            throw new IllegalArgumentException("");
         } else {
            class393 var4 = new class393(arg0);
            this.method4044(var4, true);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7648[4] + (arg0 != null ? field7648[0] : field7648[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z"
   )
   public static final boolean method4040(String arg0, byte arg1, String arg2, String arg3, String arg4) {
      try {
         ++field7646;
         if (arg4 != null && arg3 != null) {
            if (arg1 != -119) {
               method4043((class17)null, 100);
            }

            return !arg4.startsWith("#") && !arg3.startsWith("#") ? arg0.equals(arg2) : arg4.equals(arg3);
         } else {
            return false;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7648[1] + (arg0 != null ? field7648[0] : field7648[2]) + ',' + arg1 + ',' + (arg2 != null ? field7648[0] : field7648[2]) + ',' + (arg3 != null ? field7648[0] : field7648[2]) + ',' + (arg4 != null ? field7648[0] : field7648[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(IIIILha;Ld;I)V"
   )
   public static final void method4041(int arg0, int arg1, int arg2, int arg3, class17 arg4, class672 arg5, int arg6) {
      try {
         if (class484.field6932 < 100) {
            class296.method2472(-13022, arg5, arg4);
         }

         ++field7637;
         arg4.method150(arg2, arg1, arg2 + arg6, arg0 + arg1);
         if (class484.field6932 < 100) {
            byte var7 = 20;
            int var8 = arg6 / 2 + arg2;
            int var9 = arg0 / 2 + (arg1 - (18 - -var7));
            arg4.method226(arg2, arg1, arg6, arg0, -16777216, 0);
            arg4.method257(var8 + -152, var9, 304, 34, class129.field2065[class490.field7005].getRGB(), 0);
            arg4.method226(var8 + -150, var9 + 2, class484.field6932 * 3, 30, class53.field784[class490.field7005].getRGB(), 0);
            class437.field6409.method1861(class765.field10921.method5512(-2, class777.field11340), var9 - -var7, -1, class558.field7923[class490.field7005].getRGB(), var8, false);
         } else {
            int var10 = -((int)((float)arg6 / class651.field9216)) + class784.field11423;
            int var11 = (int)((float)arg0 / class651.field9216) + class535.field7521;
            int var12 = (int)((float)arg6 / class651.field9216) + class784.field11423;
            class566.field8043 = -((int)((float)arg6 / class651.field9216)) + class784.field11423;
            class313.field4708 = -((int)((float)arg0 / class651.field9216)) + class535.field7521;
            class140.field2241 = (int)((float)(arg0 * arg3) / class651.field9216);
            int var13 = class535.field7521 - (int)((float)arg0 / class651.field9216);
            class200.field2878 = (int)((float)(arg6 * 2) / class651.field9216);
            class651.method4747(class651.field9220 + var10, class651.field9223 + var11, class651.field9220 + var12, var13 - -class651.field9223, arg2, arg1, arg2 - -arg6, arg0 + arg1 + 1);
            class651.method4748(arg4);
            class261 var14 = class651.method4746(arg4);
            class48.method535(arg4, arg3 ^ -9299, 0, var14, 0);
            if (class287.field4295 > 0) {
               --class746.field10608;
               if (~class746.field10608 == -1) {
                  class746.field10608 = 20;
                  --class287.field4295;
               }
            }

            if (class434.field6364) {
               int var15 = arg2 + -5 + arg6;
               int var16 = arg1 + -8 - -arg0;
               class510.field7243.method1868(-1, 16776960, arg3 ^ 2, var15, field7648[9] + class368.field5433, var16);
               int var22 = var16 - 15;
               Runtime var17 = Runtime.getRuntime();
               int var18 = (int)((var17.totalMemory() - var17.freeMemory()) / 1024L);
               int var19 = 16776960;
               if (~var18 < -65537) {
                  var19 = 16711680;
               }

               class510.field7243.method1868(-1, var19, 0, var15, field7648[11] + var18 + "k", var22);
               var16 = var22 - 15;
            }
         }
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field7648[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field7648[0] : field7648[2]) + ',' + (arg5 != null ? field7648[0] : field7648[2]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method4042(int arg0) {
      try {
         ++field7638;
         class476.field6870.method4707(1, false, class476.field6870.field9127);
         class476.field6870.method4707(1, false, class476.field6870.field9133);
         class476.field6870.method4707(1, false, class476.field6870.field9110);
         class476.field6870.method4707(1, false, class476.field6870.field9145);
         class476.field6870.method4707(1, false, class476.field6870.field9151);
         class476.field6870.method4707(1, false, class476.field6870.field9119);
         class476.field6870.method4707(0, false, class476.field6870.field9104);
         class476.field6870.method4707(0, false, class476.field6870.field9126);
         class476.field6870.method4707(0, false, class476.field6870.field9148);
         class476.field6870.method4707(0, false, class476.field6870.field9118);
         class476.field6870.method4707(0, false, class476.field6870.field9138);
         class476.field6870.method4707(0, false, class476.field6870.field9128);
         class476.field6870.method4707(0, false, class476.field6870.field9149);
         class476.field6870.method4707(0, false, class476.field6870.field9117);
         class476.field6870.method4707(0, false, class476.field6870.field9147);
         class476.field6870.method4707(0, false, class476.field6870.field9146);
         class476.field6870.method4707(0, false, class476.field6870.field9140);
         class476.field6870.method4707(arg0, false, class476.field6870.field9150);
         class476.field6870.method4707(0, false, class476.field6870.field9142);
         class476.field6870.method4707(0, false, class476.field6870.field9141);
         class267.method2281(2);
         class476.field6870.method4707(2, false, class476.field6870.field9108);
         class476.field6870.method4707(2, false, class476.field6870.field9105);
         class345.method2741(arg0);
         class215.method1854((byte)-126);
         class350.field5131 = true;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7648[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method4043(class17 arg0, int arg1) {
      try {
         ++field7645;
         if (arg1 > -47) {
            field7636 = -85;
         }

         if (class317.field4742) {
            class272.method2310(arg0, -118);
         } else {
            class449.method3483(arg0, -124);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7648[13] + (arg0 != null ? field7648[0] : field7648[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "a",
      descriptor = "(Llba;Z)V"
   )
   private final void method4044(class247 arg0, boolean arg1) {
      try {
         class261 var3 = this.field7644;
         synchronized(this.field7644) {
            this.field7644.method2238(arg0, 13);
            this.field7644.notify();
         }

         if (!arg1) {
            method4043((class17)null, 48);
         }

         ++field7641;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7648[3] + (arg0 != null ? field7648[0] : field7648[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "<init>",
      descriptor = "()V"
   )
   public class542() {
      try {
         this.field7643 = new Thread(this);
         this.field7643.setDaemon(true);
         this.field7643.start();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7648[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4045(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4046(char[] arg0) {
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
            var10005 = 117;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
