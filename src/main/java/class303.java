import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class303 implements Runnable {
   @OriginalMember(
      owner = "client!ac",
      name = "e",
      descriptor = "Lsn;"
   )
   private class675 field4739 = new class675();
   @OriginalMember(
      owner = "client!ac",
      name = "g",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field4738;
   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4743 = new String[]{method2540(method2539("X\u0004w=_")), method2540(method2539("BIwV\n")), method2540(method2539("X\u0004w9_")), method2540(method2539("W\u00125\u0014")), method2540(method2539("X\u0004w>_")), method2540(method2539("X\u0004w\n\u0002WO")), method2540(method2539("X\u0004w<_")), method2540(method2539("X\u0004w:_")), method2540(method2539("X\u0004w?_")), method2540(method2539("X\u0004wD\u001eW\u000e-F_"))};
   @OriginalMember(
      owner = "client!ac",
      name = "b",
      descriptor = "I"
   )
   public static int field4734;
   @OriginalMember(
      owner = "client!ac",
      name = "c",
      descriptor = "I"
   )
   public static int field4735;
   @OriginalMember(
      owner = "client!ac",
      name = "i",
      descriptor = "I"
   )
   public static int field4737;
   @OriginalMember(
      owner = "client!ac",
      name = "d",
      descriptor = "I"
   )
   public static int field4740;
   @OriginalMember(
      owner = "client!ac",
      name = "h",
      descriptor = "I"
   )
   public static int field4741;
   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "I"
   )
   public static int field4742;
   @OriginalMember(
      owner = "client!ac",
      name = "f",
      descriptor = "[[[B"
   )
   public static byte[][][] field4736;

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static final void method2532(byte arg0) {
      try {
         int var1 = 12 % ((arg0 - -44) / 41);
         if (class11.method87(false)) {
            if (class168.field2568 == null) {
               class659.method4852((byte)31);
            }

            class445.field6832 = 0;
            class261.field4293 = true;
         }

         ++field4742;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4743[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "run",
      descriptor = "()V",
      line = 23
   )
   public final void run() {
      boolean var1 = client.field1786;

      try {
         ++field4741;

         while(true) {
            class675 var2 = this.field4739;
            class92 var4;
            synchronized(this.field4739) {
               class294 var3 = this.field4739.method4974(102);
               if (var1) {
                  try {
                     this.field4739.wait();
                  } catch (InterruptedException var12) {
                  }

                  var3 = this.field4739.method4974(87);
               }

               while(true) {
                  while(var3 == null) {
                     try {
                        this.field4739.wait();
                     } catch (InterruptedException var10) {
                     }

                     var3 = this.field4739.method4974(87);
                  }

                  if (!var1) {
                     if (!(var3 instanceof class92)) {
                        return;
                     }

                     var4 = (class92)var3;
                     break;
                  }

                  var3 = var3;
               }
            }

            int var6;
            try {
               byte[] var5 = InetAddress.getByName(var4.field1324).getAddress();
               var6 = jagmisc.ping(var5[0], var5[1], var5[2], var5[3], 1000L);
            } catch (Throwable var11) {
               var6 = 1000;
            }

            var4.field1326 = var6;
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field4743[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Liq;",
      line = 66
   )
   public final class92 method2533(String arg0, byte arg1) {
      try {
         ++field4735;
         if (this.field4738 == null) {
            throw new IllegalStateException("");
         } else if (arg0 == null) {
            throw new IllegalArgumentException("");
         } else {
            class92 var3 = new class92(arg0);
            if (arg1 != -41) {
               return null;
            } else {
               this.method2534(arg1 + 41, var3);
               return var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4743[7] + (arg0 != null ? field4743[1] : field4743[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(ILhe;)V",
      line = 87
   )
   private final void method2534(int arg0, class294 arg1) {
      try {
         ++field4740;
         class675 var3 = this.field4739;
         synchronized(this.field4739) {
            this.field4739.method4980(arg1, arg0);
            this.field4739.notify();
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4743[2] + arg0 + ',' + (arg1 != null ? field4743[1] : field4743[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(II)Z",
      line = 100
   )
   public static final boolean method2535(int arg0, int arg1) {
      try {
         ++field4737;
         int var2 = 113 / ((arg1 - -22) / 58);
         return arg0 == 7 || arg0 == 8 || ~arg0 == -10 || ~arg0 == -11;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4743[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(I)V",
      line = 111
   )
   public final void method2536(int arg0) {
      try {
         ++field4734;
         if (this.field4738 != null) {
            this.method2534(0, new class294());
            if (arg0 == 1) {
               try {
                  this.field4738.join();
               } catch (InterruptedException var3) {
               }

               this.field4738 = null;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4743[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "<init>",
      descriptor = "()V",
      line = 165
   )
   public class303() {
      try {
         this.field4738 = new Thread(this);
         this.field4738.setDaemon(true);
         this.field4738.start();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4743[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(Z)V",
      line = 133
   )
   public static void method2537(boolean arg0) {
      try {
         if (!arg0) {
            method2537(false);
         }

         field4736 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4743[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "b",
      descriptor = "(I)I",
      line = 145
   )
   public static final int method2538(int arg0) {
      int var1 = -1;

      for(int var2 = 0; var2 < class571.field8459 - 1; ++var2) {
         if (arg0 < class277.field4418[var2] + class222.field3346[var2]) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         var1 = class571.field8459 - 1;
      }

      return var1;
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2539(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2540(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
