import jagex3.jagmisc.jagmisc;
import java.awt.Rectangle;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class662 implements Runnable {
   @OriginalMember(
      owner = "client!jk",
      name = "d",
      descriptor = "Lll;"
   )
   private class387 field9643 = new class387();
   @OriginalMember(
      owner = "client!jk",
      name = "b",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field9641;
   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9650 = new String[]{method4840(method4839("71d2")), method4840(method4839("3/&\u001fT")), method4840(method4839("\"j&p\u0001")), method4840(method4839("3/&\u0016T")), method4840(method4839("3/&b\u00157-|`T")), method4840(method4839("3/&\u0018T")), method4840(method4839("3/&,\t7l")), method4840(method4839("3/&\u001dT")), method4840(method4839("3/&\u001bT")), method4840(method4839("3/&\u0019T")), method4840(method4839("3/&\u001cT")), method4840(method4839("3/&\u0017T"))};
   @OriginalMember(
      owner = "client!jk",
      name = "m",
      descriptor = "Leg;"
   )
   public static class118 field9640 = new class118(25, 6);
   @OriginalMember(
      owner = "client!jk",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field9649 = false;
   @OriginalMember(
      owner = "client!jk",
      name = "j",
      descriptor = "I"
   )
   public static int field9636;
   @OriginalMember(
      owner = "client!jk",
      name = "c",
      descriptor = "I"
   )
   public static int field9638;
   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "I"
   )
   public static int field9639;
   @OriginalMember(
      owner = "client!jk",
      name = "i",
      descriptor = "I"
   )
   public static int field9642;
   @OriginalMember(
      owner = "client!jk",
      name = "l",
      descriptor = "I"
   )
   public static int field9644;
   @OriginalMember(
      owner = "client!jk",
      name = "n",
      descriptor = "I"
   )
   public static int field9645;
   @OriginalMember(
      owner = "client!jk",
      name = "e",
      descriptor = "I"
   )
   public static int field9646;
   @OriginalMember(
      owner = "client!jk",
      name = "f",
      descriptor = "I"
   )
   public static int field9647;
   @OriginalMember(
      owner = "client!jk",
      name = "h",
      descriptor = "I"
   )
   public static int field9648;
   @OriginalMember(
      owner = "client!jk",
      name = "k",
      descriptor = "[Lbl;"
   )
   public static class678[] field9637;

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4830(boolean arg0) {
      try {
         field9640 = null;
         field9637 = null;
         if (!arg0) {
            method4833(0);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9650[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(IZIB)I"
   )
   public static final int method4831(int arg0, boolean arg1, int arg2, byte arg3) {
      boolean var4 = client.field4360;

      try {
         ++field9639;
         class111 var5 = class616.method4475(arg2, arg1, (byte)106);
         if (var5 == null) {
            return 0;
         } else if (arg0 == -1) {
            return 0;
         } else {
            int var6 = 0;
            int var7 = 0;
            if (arg3 > -124) {
               return -66;
            } else {
               while(true) {
                  int var10000;
                  if (var7 >= var5.field1396.length) {
                     var10000 = var6;
                     if (!var4) {
                        return var6;
                     }
                  } else {
                     var10000 = arg0;
                  }

                  if (var10000 == var5.field1391[var7]) {
                     var6 += var5.field1396[var7];
                  }

                  ++var7;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field9650[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(Loh;I)V"
   )
   private final void method4832(class428 arg0, int arg1) {
      try {
         class387 var3 = this.field9643;
         synchronized(this.field9643) {
            this.field9643.method2930((byte)-80, arg0);
            this.field9643.notify();
         }

         if (arg1 != 17229) {
            this.field9643 = null;
         }

         ++field9646;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9650[9] + (arg0 != null ? field9650[2] : field9650[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method4833(int arg0) {
      int var1 = -1;

      for(int var2 = 0; var2 < class199.field2833 - 1; ++var2) {
         if (arg0 < class652.field9556[var2] + class493.field7039[var2]) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = class199.field2833 - 1;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4834(byte arg0) {
      try {
         ++field9636;
         if (this.field9641 != null) {
            this.method4832(new class428(), 17229);

            try {
               if (arg0 > -21) {
                  return;
               }

               this.field9641.join();
            } catch (InterruptedException var3) {
            }

            this.field9641 = null;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9650[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(IZI)V"
   )
   public static final void method4835(int arg0, boolean arg1, int arg2) {
      try {
         ++field9647;
         if (arg1) {
            field9648 = -121;
         }

         class755 var3 = class317.method2325((long)arg2, 118, 16);
         var3.method5479(1288);
         var3.field11184 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9650[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ler;"
   )
   public final class117 method4836(String arg0, int arg1) {
      try {
         if (arg1 != 1) {
            return null;
         } else {
            ++field9645;
            if (this.field9641 == null) {
               throw new IllegalStateException("");
            } else if (arg0 == null) {
               throw new IllegalArgumentException("");
            } else {
               class117 var3 = new class117(arg0);
               this.method4832(var3, arg1 ^ 17228);
               return var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9650[1] + (arg0 != null ? field9650[2] : field9650[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4360;

      try {
         ++field9642;

         while(true) {
            class387 var2 = this.field9643;
            class117 var4;
            synchronized(this.field9643) {
               class428 var3 = this.field9643.method2941(-14002);
               if (var1) {
                  try {
                     this.field9643.wait();
                  } catch (InterruptedException var12) {
                  }

                  var3 = this.field9643.method2941(-14002);
               }

               while(true) {
                  while(var3 == null) {
                     try {
                        this.field9643.wait();
                     } catch (InterruptedException var10) {
                     }

                     var3 = this.field9643.method2941(-14002);
                  }

                  if (!var1) {
                     if (!(var3 instanceof class117)) {
                        return;
                     }

                     var4 = (class117)var3;
                     break;
                  }

                  var3 = var3;
               }
            }

            int var6;
            try {
               byte[] var5 = InetAddress.getByName(var4.field1465).getAddress();
               var6 = jagmisc.ping(var5[0], var5[1], var5[2], var5[3], 1000L);
            } catch (Throwable var11) {
               var6 = 1000;
            }

            var4.field1463 = var6;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field9650[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "([FII[IIII[FII[III)V"
   )
   public static final void method4837(float[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12) {
      boolean var13 = client.field4360;

      try {
         ++field9638;
         int var14 = arg1 * arg5 + arg6;
         int var15 = arg8 * arg12 + arg9;
         if (arg11 != 21871) {
            field9649 = false;
         }

         int var16 = -arg2 + arg5;
         int var17 = -arg2 + arg12;
         if (arg10 != null) {
            if (arg7 != null) {
               int var20 = 0;
               if (var13 || ~arg4 < ~var20) {
                  do {
                     int var21 = arg2 + var14;
                     if (var13) {
                        arg3[var15] = arg10[var14];
                        arg0[var15++] = arg7[var14++];
                     }

                     while(true) {
                        if (~var21 >= ~var14) {
                           var15 += var17;
                           var14 += var16;
                           if (!var13) {
                              ++var20;
                              break;
                           }
                        } else {
                           arg3[var15] = arg10[var14];
                        }

                        arg0[var15++] = arg7[var14++];
                     }
                  } while(~arg4 < ~var20);

               }
            } else {
               int var18 = 0;
               if (var13 || ~var18 > ~arg4) {
                  do {
                     int var19 = var14 - -arg2;
                     if (var13) {
                        arg3[var15++] = arg10[var14++];
                     }

                     while(var14 < var19) {
                        arg3[var15++] = arg10[var14++];
                     }

                     var14 += var16;
                     var15 += var17;
                     ++var18;
                  } while(~var18 > ~arg4);

               }
            }
         } else {
            int var22 = 0;
            if (var13 || var22 < arg4) {
               do {
                  int var23 = var14 - -arg2;
                  if (var13 || ~var23 < ~var14) {
                     do {
                        arg0[var15++] = arg7[var14++];
                     } while(~var23 < ~var14);
                  }

                  var14 += var16;
                  var15 += var17;
                  ++var22;
               } while(var22 < arg4);

            }
         }
      } catch (RuntimeException var25) {
         throw class237.method1823(var25, field9650[5] + (arg0 != null ? field9650[2] : field9650[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9650[2] : field9650[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field9650[2] : field9650[0]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field9650[2] : field9650[0]) + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "<init>",
      descriptor = "()V"
   )
   public class662() {
      try {
         this.field9641 = new Thread(this);
         this.field9641.setDaemon(true);
         this.field9641.start();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9650[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "a",
      descriptor = "(II[Ljava/awt/Rectangle;)V"
   )
   public static final void method4838(int arg0, int arg1, Rectangle[] arg2) throws class525 {
      try {
         label27: {
            ++field9644;
            if (~class614.field9025 == -2) {
               class50.field660.method550(arg2, arg0, class136.field1735, class532.field7589);
               if (!client.field4360) {
                  break label27;
               }
            }

            class50.field660.method550(arg2, arg0, 0, 0);
         }

         if (arg1 != -1) {
            method4837((float[])null, 10, -90, (int[])null, 119, 8, 4, (float[])null, 23, -128, (int[])null, 115, -85);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9650[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9650[2] : field9650[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4839(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4840(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
