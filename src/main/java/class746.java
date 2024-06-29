import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class746 implements Runnable {
   @OriginalMember(
      owner = "client!nk",
      name = "h",
      descriptor = "Liw;"
   )
   private class332 field10766 = new class332();
   @OriginalMember(
      owner = "client!nk",
      name = "d",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field10773;
   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10774 = new String[]{method5421(method5420("\"<\u0014@")), method5421(method5420("7gV\u0002w")), method5421(method5420("\"\"Vn\"")), method5421(method5420("\"\"V\u0010c\" \f\u0012\"")), method5421(method5420("\"\"V^\u007f\"a")), method5421(method5420("\"\"Vm\"")), method5421(method5420("\"\"Vh\"")), method5421(method5420("\"\"Vi\"")), method5421(method5420("\"\"Vo\""))};
   @OriginalMember(
      owner = "client!nk",
      name = "i",
      descriptor = "Lgh;"
   )
   public static class572 field10764 = new class572(78, -2);
   @OriginalMember(
      owner = "client!nk",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10770 = null;
   @OriginalMember(
      owner = "client!nk",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field10772 = false;
   @OriginalMember(
      owner = "client!nk",
      name = "e",
      descriptor = "I"
   )
   public static int field10763;
   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "I"
   )
   public static int field10765;
   @OriginalMember(
      owner = "client!nk",
      name = "k",
      descriptor = "I"
   )
   public static int field10767;
   @OriginalMember(
      owner = "client!nk",
      name = "g",
      descriptor = "I"
   )
   public static int field10768;
   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "I"
   )
   public static int field10769;
   @OriginalMember(
      owner = "client!nk",
      name = "f",
      descriptor = "I"
   )
   public static int field10771;

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)Lrf;",
      line = 10
   )
   public final class91 method5415(String arg0, boolean arg1) {
      try {
         ++field10763;
         if (this.field10773 == null) {
            throw new IllegalStateException("");
         } else if (arg0 == null) {
            throw new IllegalArgumentException("");
         } else {
            if (arg1) {
               this.method5418((byte)-113);
            }

            class91 var3 = new class91(arg0);
            this.method5419(var3, -256);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10774[8] + (arg0 != null ? field10774[1] : field10774[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(Z)V",
      line = 32
   )
   public static void method5416(boolean arg0) {
      try {
         field10764 = null;
         field10770 = null;
         if (arg0) {
            method5416(true);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10774[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "run",
      descriptor = "()V",
      line = 44
   )
   public final void run() {
      boolean var1 = client.field4564;

      try {
         ++field10768;

         while(true) {
            class332 var2 = this.field10766;
            class91 var4;
            synchronized(this.field10766) {
               class22 var3 = this.field10766.method2577(true);
               if (var1) {
                  try {
                     this.field10766.wait();
                  } catch (InterruptedException var12) {
                  }

                  var3 = this.field10766.method2577(true);
               }

               while(true) {
                  while(var3 == null) {
                     try {
                        this.field10766.wait();
                     } catch (InterruptedException var10) {
                     }

                     var3 = this.field10766.method2577(true);
                  }

                  if (!var1) {
                     if (!(var3 instanceof class91)) {
                        return;
                     }

                     var4 = (class91)var3;
                     break;
                  }

                  var3 = var3;
               }
            }

            int var6;
            try {
               byte[] var5 = InetAddress.getByName(var4.field1488).getAddress();
               var6 = jagmisc.ping(var5[0], var5[1], var5[2], var5[3], 1000L);
            } catch (Throwable var11) {
               var6 = 1000;
            }

            var4.field1487 = var6;
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field10774[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(IIZIIII)V",
      line = 90
   )
   public static final void method5417(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         class39.field931 = arg0;
         class66.field1221 = arg1;
         ++field10767;
         class417.field6103 = arg4;
         if (arg5 <= -56) {
            class505.field7354 = arg6;
            class687.field10098 = arg3;
            if (arg2 && class687.field10098 >= 100) {
               class583.field8442 = class417.field6103 * 512 - -256;
               class677.field9932 = class39.field931 * 512 + 256;
               class494.field7193 = class663.method4851(class677.field9932, class583.field8442, class731.field10504, 119) - class66.field1221;
            }

            class590.field8514 = 2;
            class234.field3408 = -1;
            class501.field7296 = -1;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10774[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(B)V",
      line = 119
   )
   public final void method5418(byte arg0) {
      try {
         ++field10769;
         if (this.field10773 != null) {
            this.method5419(new class22(), -256);

            try {
               this.field10773.join();
               int var2 = 84 / ((-53 - arg0) / 34);
            } catch (InterruptedException var4) {
            }

            this.field10773 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field10774[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(Lub;I)V",
      line = 138
   )
   private final void method5419(class22 arg0, int arg1) {
      try {
         ++field10765;
         if (arg1 != -256) {
            method5416(true);
         }

         class332 var3 = this.field10766;
         synchronized(this.field10766) {
            this.field10766.method2585(arg0, 97);
            this.field10766.notify();
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10774[2] + (arg0 != null ? field10774[1] : field10774[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "<init>",
      descriptor = "()V",
      line = 159
   )
   public class746() {
      try {
         this.field10773 = new Thread(this);
         this.field10773.setDaemon(true);
         this.field10773.start();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10774[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5420(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5421(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
