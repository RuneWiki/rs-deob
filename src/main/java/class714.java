import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class714 implements Runnable {
   @OriginalMember(
      owner = "client!vm",
      name = "b",
      descriptor = "Lum;"
   )
   private class550 field10642 = new class550();
   @OriginalMember(
      owner = "client!vm",
      name = "f",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field10646;
   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10649 = new String[]{method5176(method5175(",\u001f[%\u00014\u001b\u0001'@")), method5176(method5175("!\\[7\u0015")), method5176(method5175(",\u001f[X@")), method5176(method5175("4\u0007\u0019u")), method5176(method5175(",\u001f[Z@")), method5176(method5175(",\u001f[[@")), method5176(method5175(",\u001f[]@")), method5176(method5175(",\u001f[k\u001d4Z"))};
   @OriginalMember(
      owner = "client!vm",
      name = "d",
      descriptor = "I"
   )
   public static int field10643;
   @OriginalMember(
      owner = "client!vm",
      name = "e",
      descriptor = "I"
   )
   public static int field10644;
   @OriginalMember(
      owner = "client!vm",
      name = "g",
      descriptor = "I"
   )
   public static int field10645;
   @OriginalMember(
      owner = "client!vm",
      name = "c",
      descriptor = "I"
   )
   public static int field10647;
   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "I"
   )
   public static int field10648;

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method5171(boolean arg0) {
      try {
         ++field10647;
         if (this.field10646 != null) {
            this.method5172(17, new class347());

            try {
               if (arg0) {
                  return;
               }

               this.field10646.join();
            } catch (InterruptedException var3) {
            }

            this.field10646 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10649[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(ILwb;)V"
   )
   private final void method5172(int arg0, class347 arg1) {
      try {
         class550 var3 = this.field10642;
         synchronized(this.field10642) {
            this.field10642.method4060(23, arg1);
            this.field10642.notify();
         }

         if (arg0 == 17) {
            ++field10643;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10649[2] + arg0 + ',' + (arg1 != null ? field10649[1] : field10649[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method5173(byte arg0, int arg1) {
      try {
         if (arg0 <= 69) {
            method5173((byte)-108, 55);
         }

         ++field10644;
         return ~arg1 == -58 || arg1 == 49 || ~arg1 == -11 || ~arg1 == -46 || ~arg1 == -54 || ~arg1 == -7 || arg1 == 17;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10649[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      int var1 = client.field4530;

      try {
         ++field10645;

         while(true) {
            class550 var2 = this.field10642;
            class399 var4;
            synchronized(this.field10642) {
               class347 var3 = this.field10642.method4063(-5);
               if (var1 != 0) {
                  try {
                     this.field10642.wait();
                  } catch (InterruptedException var12) {
                  }

                  var3 = this.field10642.method4063(-5);
               }

               while(true) {
                  while(var3 == null) {
                     try {
                        this.field10642.wait();
                     } catch (InterruptedException var10) {
                     }

                     var3 = this.field10642.method4063(-5);
                  }

                  if (var1 == 0) {
                     if (!(var3 instanceof class399)) {
                        return;
                     }

                     var4 = (class399)var3;
                     break;
                  }

                  var3 = var3;
               }
            }

            int var6;
            try {
               byte[] var5 = InetAddress.getByName(var4.field6135).getAddress();
               var6 = jagmisc.ping(var5[0], var5[1], var5[2], var5[3], 1000L);
            } catch (Throwable var11) {
               var6 = 1000;
            }

            var4.field6133 = var6;
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field10649[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "<init>",
      descriptor = "()V"
   )
   public class714() {
      try {
         this.field10646 = new Thread(this);
         this.field10646.setDaemon(true);
         this.field10646.start();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10649[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Loj;"
   )
   public final class399 method5174(String arg0, int arg1) {
      try {
         ++field10648;
         if (this.field10646 == null) {
            throw new IllegalStateException("");
         } else if (arg0 == null) {
            throw new IllegalArgumentException("");
         } else {
            if (arg1 != -46) {
               this.field10646 = null;
            }

            class399 var3 = new class399(arg0);
            this.method5172(17, var3);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10649[6] + (arg0 != null ? field10649[1] : field10649[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5175(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5176(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
