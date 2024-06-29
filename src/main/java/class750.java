import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class750 implements Runnable {
   @OriginalMember(
      owner = "client!dw",
      name = "h",
      descriptor = "Luda;"
   )
   private class478 field11101;
   @OriginalMember(
      owner = "client!dw",
      name = "c",
      descriptor = "Z"
   )
   private boolean field11108;
   @OriginalMember(
      owner = "client!dw",
      name = "k",
      descriptor = "I"
   )
   public int field11109;
   @OriginalMember(
      owner = "client!dw",
      name = "b",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field11110;
   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11112 = new String[]{method5449(method5448("\u001eIQYF")), method5449(method5448("\u0001\u0010Q6\u0013")), method5449(method5448("\u0014K\u0013t")), method5449(method5448("\u001eIQj\u001b\u0014\u0016")), method5449(method5448("\u001eIQ[F")), method5449(method5448("\u001eIQZF")), method5449(method5448("\u001eIQ^F")), method5449(method5448("\u001eIQ$\u0007\u0014W\u000b&F")), method5449(method5448("\u001eIQ\\F")), method5449(method5448("\u001eIQ]F"))};
   @OriginalMember(
      owner = "client!dw",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public static String field11103 = "";
   @OriginalMember(
      owner = "client!dw",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public static String field11100 = null;
   @OriginalMember(
      owner = "client!dw",
      name = "j",
      descriptor = "I"
   )
   public static int field11102;
   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "I"
   )
   public static int field11104;
   @OriginalMember(
      owner = "client!dw",
      name = "i",
      descriptor = "I"
   )
   public static int field11105;
   @OriginalMember(
      owner = "client!dw",
      name = "d",
      descriptor = "I"
   )
   public static int field11106;
   @OriginalMember(
      owner = "client!dw",
      name = "l",
      descriptor = "I"
   )
   public static int field11107;
   @OriginalMember(
      owner = "client!dw",
      name = "e",
      descriptor = "I"
   )
   public static int field11111;

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(BILnha;)Ljc;"
   )
   public final class466 method5442(byte param1, int param2, class342 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method5443(boolean arg0) {
      try {
         ++field11106;
         this.field11108 = arg0;
         class478 var2 = this.field11101;
         synchronized(this.field11101) {
            this.field11101.notifyAll();
         }

         try {
            this.field11110.join();
         } catch (InterruptedException var4) {
         }

         this.field11110 = null;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11112[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Lnha;[BII)Ljc;"
   )
   public final class466 method5444(class342 arg0, byte[] arg1, int arg2, int arg3) {
      try {
         ++field11102;
         class466 var5 = new class466();
         if (arg2 != -31936) {
            this.method5445(-50, (class342)null, true);
         }

         var5.field2588 = false;
         var5.field6717 = arg0;
         var5.field6716 = arg1;
         var5.field6720 = 2;
         var5.field947 = (long)arg3;
         this.method5447(var5, (byte)116);
         return var5;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11112[0] + (arg0 != null ? field11112[1] : field11112[2]) + ',' + (arg1 != null ? field11112[1] : field11112[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(ILnha;Z)Ljc;"
   )
   public final class466 method5445(int arg0, class342 arg1, boolean arg2) {
      try {
         if (!arg2) {
            field11103 = null;
         }

         ++field11111;
         class466 var4 = new class466();
         var4.field6720 = 3;
         var4.field6717 = arg1;
         var4.field947 = (long)arg0;
         var4.field2588 = false;
         this.method5447(var4, (byte)125);
         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11112[4] + arg0 + ',' + (arg1 != null ? field11112[1] : field11112[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5446(int arg0) {
      try {
         field11103 = null;
         if (arg0 < 16) {
            field11100 = null;
         }

         field11100 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11112[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "a",
      descriptor = "(Ljc;B)V"
   )
   private final void method5447(class466 arg0, byte arg1) {
      try {
         ++field11107;
         class478 var3 = this.field11101;
         synchronized(this.field11101) {
            this.field11101.method3486(arg0, 1779380172);
            ++this.field11109;
            this.field11101.notifyAll();
            if (arg1 < 114) {
               field11100 = null;
            }

         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11112[6] + (arg0 != null ? field11112[1] : field11112[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "<init>",
      descriptor = "(Lnu;)V"
   )
   public class750(class619 arg0) {
      boolean var2 = client.field4360;
      super();
      this.field11101 = new class478();
      this.field11108 = false;
      this.field11109 = 0;

      try {
         class296 var3 = arg0.method4504(this, 5, 0);
         if (var2) {
            class661.method4825(0, 10L);
         }

         while(true) {
            int var10000;
            if (~var3.field4078 != -1) {
               var10000 = ~var3.field4078;
               if (!var2) {
                  if (var10000 == -3) {
                     throw new RuntimeException();
                  }

                  this.field11110 = (Thread)var3.field4077;
                  return;
               }
            } else {
               var10000 = 0;
            }

            class661.method4825(var10000, 10L);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11112[7] + (arg0 != null ? field11112[1] : field11112[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5448(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5449(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
