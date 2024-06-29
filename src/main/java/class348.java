import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class348 implements Runnable {
   @OriginalMember(
      owner = "client!lr",
      name = "i",
      descriptor = "Lrca;"
   )
   private class37 field4768 = new class37();
   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field4770;
   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4776 = new String[]{method2756(method2755(",:_QP.!\u0005S\u0011")), method2756(method2755(",:_.\u0011")), method2756(method2755(",:_+\u0011")), method2756(method2755(",:_\u001fL.`")), method2756(method2755(",:_(\u0011")), method2756(method2755(".=\u001d\u0001")), method2756(method2755(";f_CD")), method2756(method2755(",:_/\u0011")), method2756(method2755(",:_)\u0011"))};
   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "I"
   )
   public static int field4773 = -1;
   @OriginalMember(
      owner = "client!lr",
      name = "h",
      descriptor = "I"
   )
   public static int field4769;
   @OriginalMember(
      owner = "client!lr",
      name = "d",
      descriptor = "I"
   )
   public static int field4771;
   @OriginalMember(
      owner = "client!lr",
      name = "c",
      descriptor = "I"
   )
   public static int field4772;
   @OriginalMember(
      owner = "client!lr",
      name = "f",
      descriptor = "I"
   )
   public static int field4774;
   @OriginalMember(
      owner = "client!lr",
      name = "g",
      descriptor = "I"
   )
   public static int field4775;
   @OriginalMember(
      owner = "client!lr",
      name = "e",
      descriptor = "Lmr;"
   )
   public static class239 field4767;

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2749(int arg0) {
      try {
         field4767 = null;
         if (arg0 != -1) {
            field4767 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4776[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(Lcm;I)V"
   )
   private final void method2750(class673 arg0, int arg1) {
      try {
         class37 var3 = this.field4768;
         synchronized(this.field4768) {
            this.field4768.method279(false, arg0);
            this.field4768.notify();
            if (arg1 != 0) {
               method2749(-111);
            }
         }

         ++field4772;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4776[7] + (arg0 != null ? field4776[6] : field4776[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field1481;

      try {
         ++field4774;

         while(true) {
            class37 var2 = this.field4768;
            class669 var4;
            synchronized(this.field4768) {
               class673 var3 = this.field4768.method281(true);
               if (var1) {
                  try {
                     this.field4768.wait();
                  } catch (InterruptedException var12) {
                  }

                  var3 = this.field4768.method281(true);
               }

               while(true) {
                  while(var3 == null) {
                     try {
                        this.field4768.wait();
                     } catch (InterruptedException var10) {
                     }

                     var3 = this.field4768.method281(true);
                  }

                  if (!var1) {
                     if (!(var3 instanceof class669)) {
                        return;
                     }

                     var4 = (class669)var3;
                     break;
                  }

                  var3 = var3;
               }
            }

            int var6;
            try {
               byte[] var5 = InetAddress.getByName(var4.field9916).getAddress();
               var6 = jagmisc.ping(var5[0], var5[1], var5[2], var5[3], 1000L);
            } catch (Throwable var11) {
               var6 = 1000;
            }

            var4.field9915 = var6;
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field4776[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method2751(int arg0, boolean arg1) {
      boolean var2 = client.field1481;

      try {
         ++class429.field5832;
         ++field4771;
         class702 var3 = class19.method142(class387.field5365.field8765, class533.field7827, (byte)-86);
         class387.field5365.method4423(var3, (byte)125);
         class710 var4 = (class710)class397.field5473.method1817(-52);
         if (var2) {
            if (!var4.method4926(0)) {
               var4 = (class710)class397.field5473.method1817(-70);
               if (var4 == null && !var2 && !var2) {
                  if (class201.field2554 != null) {
                     class49.method372(class201.field2554, 0);
                     class201.field2554 = null;
                  }

                  if (arg0 != 1000) {
                     method2751(77, false);
                     return;
                  }

                  return;
               }
            }

            if (~var4.field10417 == -1) {
               class456.method3489(3, var4, arg1, true);
            }

            var4 = (class710)class397.field5473.method1812(353);
         }

         while(true) {
            while(var4 != null) {
               if (!var4.method4926(0)) {
                  var4 = (class710)class397.field5473.method1817(-70);
                  if (var4 == null && !var2 && !var2) {
                     if (class201.field2554 != null) {
                        class49.method372(class201.field2554, 0);
                        class201.field2554 = null;
                     }

                     if (arg0 != 1000) {
                        method2751(77, false);
                        return;
                     }

                     return;
                  }
               }

               if (~var4.field10417 == -1) {
                  class456.method3489(3, var4, arg1, true);
               }

               var4 = (class710)class397.field5473.method1812(353);
            }

            if (!var2) {
               if (class201.field2554 != null) {
                  class49.method372(class201.field2554, 0);
                  class201.field2554 = null;
               }

               if (arg0 != 1000) {
                  method2751(77, false);
                  return;
               }

               return;
            }

            if (~var4.field10417 == -1) {
               class456.method3489(3, var4, arg1, true);
            }

            var4 = (class710)class397.field5473.method1812(353);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field4776[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2752(int arg0) {
      try {
         if (arg0 != 8716) {
            this.run();
         }

         ++field4775;
         if (this.field4770 != null) {
            this.method2750(new class673(), 0);

            try {
               this.field4770.join();
            } catch (InterruptedException var3) {
            }

            this.field4770 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4776[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(BLjava/lang/String;)Lgka;"
   )
   public final class669 method2753(byte arg0, String arg1) {
      try {
         ++field4769;
         if (arg0 != 118) {
            return null;
         } else if (this.field4770 == null) {
            throw new IllegalStateException("");
         } else if (arg1 == null) {
            throw new IllegalArgumentException("");
         } else {
            class669 var3 = new class669(arg1);
            this.method2750(var3, 0);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4776[8] + arg0 + ',' + (arg1 != null ? field4776[6] : field4776[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "a",
      descriptor = "(Lr;III[Z)Z"
   )
   public static final boolean method2754(class114 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      boolean var5 = false;
      if (class659.field9815 != class569.field8364) {
         int var6 = class373.field5223[arg1].method3288(arg2, (byte)121, arg3);

         for(int var7 = 0; var7 <= arg1; ++var7) {
            class423 var8 = class373.field5223[var7];
            if (var8 != null) {
               int var9 = var6 - var8.method3288(arg2, (byte)121, arg3);
               if (arg4 != null) {
                  arg4[var7] = var8.method947(arg0, arg2, var9, arg3, 0, false);
                  if (!arg4[var7]) {
                     continue;
                  }
               }

               var8.method952(arg0, arg2, var9, arg3, 0, false);
               var5 = true;
            }
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!lr",
      name = "<init>",
      descriptor = "()V"
   )
   public class348() {
      try {
         this.field4770 = new Thread(this);
         this.field4770.setDaemon(true);
         this.field4770.start();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4776[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2755(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2756(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
