import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class380 implements Runnable {
   @OriginalMember(
      owner = "client!oq",
      name = "i",
      descriptor = "Lod;"
   )
   private class536 field5323 = new class536();
   @OriginalMember(
      owner = "client!oq",
      name = "j",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field5324;
   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5326 = new String[]{method2929(method2928("\u001a\u0019Ar*")), method2929(method2928("\u001a\u0019A\nk\u001b\u0001\u001b\b*")), method2929(method2928("\u000eFA\u0018\u007f")), method2929(method2928("\u001b\u001d\u0003Z")), method2929(method2928("\u001a\u0019At*")), method2929(method2928("\u001a\u0019Aw*")), method2929(method2928("\u001a\u0019Au*")), method2929(method2928("\u001a\u0019As*")), method2929(method2928("\u001a\u0019ADw\u001b@"))};
   @OriginalMember(
      owner = "client!oq",
      name = "h",
      descriptor = "Lbga;"
   )
   public static class378 field5321 = new class378(14, 6);
   @OriginalMember(
      owner = "client!oq",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field5325 = new int[1];
   @OriginalMember(
      owner = "client!oq",
      name = "c",
      descriptor = "I"
   )
   public static int field5316;
   @OriginalMember(
      owner = "client!oq",
      name = "f",
      descriptor = "I"
   )
   public static int field5317;
   @OriginalMember(
      owner = "client!oq",
      name = "b",
      descriptor = "I"
   )
   public static int field5318;
   @OriginalMember(
      owner = "client!oq",
      name = "d",
      descriptor = "I"
   )
   public static int field5319;
   @OriginalMember(
      owner = "client!oq",
      name = "g",
      descriptor = "I"
   )
   public static int field5320;
   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "I"
   )
   public static int field5322;

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(ILmaa;)V"
   )
   private final void method2923(int arg0, class500 arg1) {
      try {
         class536 var3 = this.field5323;
         synchronized(this.field5323) {
            this.field5323.method3859(arg0 + arg0, arg1);
            this.field5323.notify();
         }

         ++field5317;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5326[7] + arg0 + ',' + (arg1 != null ? field5326[2] : field5326[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2924(int arg0) {
      try {
         class325.field4368 = null;
         class163.field2095 = null;
         class621.field8674 = null;
         class719.field10537 = null;
         class261.field3333 = null;
         class471.field6528 = null;
         class447.field6181 = null;
         class10.field120 = null;
         class101.field1310 = null;
         class528.field7216 = null;
         if (arg0 == 1) {
            class462.field6333 = null;
            class150.field1961 = null;
            class206.field2539 = null;
            class413.field5816 = null;
            class568.field7740 = null;
            class764.field11030 = null;
            class488.field6723 = null;
            ++field5320;
            class183.field2263 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5326[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4273;

      try {
         ++field5322;

         while(true) {
            class536 var2 = this.field5323;
            class10 var4;
            synchronized(this.field5323) {
               class500 var3 = this.field5323.method3869((byte)78);
               if (var1) {
                  try {
                     this.field5323.wait();
                  } catch (InterruptedException var12) {
                  }

                  var3 = this.field5323.method3869((byte)115);
               }

               while(true) {
                  while(var3 == null) {
                     try {
                        this.field5323.wait();
                     } catch (InterruptedException var10) {
                     }

                     var3 = this.field5323.method3869((byte)115);
                  }

                  if (!var1) {
                     if (!(var3 instanceof class10)) {
                        return;
                     }

                     var4 = (class10)var3;
                     break;
                  }

                  var3 = var3;
               }
            }

            int var6;
            try {
               byte[] var5 = InetAddress.getByName(var4.field123).getAddress();
               var6 = jagmisc.ping(var5[0], var5[1], var5[2], var5[3], 1000L);
            } catch (Throwable var11) {
               var6 = 1000;
            }

            var4.field122 = var6;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field5326[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Lhba;"
   )
   public final class10 method2925(String arg0, int arg1) {
      try {
         ++field5316;
         if (arg1 >= -38) {
            this.field5323 = null;
         }

         if (this.field5324 == null) {
            throw new IllegalStateException("");
         } else if (arg0 == null) {
            throw new IllegalArgumentException("");
         } else {
            class10 var3 = new class10(arg0);
            this.method2923(1, var3);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5326[4] + (arg0 != null ? field5326[2] : field5326[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2926(byte arg0) {
      try {
         ++field5318;
         if (this.field5324 != null) {
            this.method2923(1, new class500());

            try {
               if (arg0 != -34) {
                  return;
               }

               this.field5324.join();
            } catch (InterruptedException var3) {
            }

            this.field5324 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5326[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2927(int arg0) {
      try {
         field5321 = null;
         if (arg0 != 7363) {
            method2927(33);
         }

         field5325 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5326[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "<init>",
      descriptor = "()V"
   )
   public class380() {
      try {
         this.field5324 = new Thread(this);
         this.field5324.setDaemon(true);
         this.field5324.start();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5326[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2928(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2929(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
