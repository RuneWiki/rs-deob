import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class82 implements Runnable {
   @OriginalMember(
      owner = "client!aw",
      name = "k",
      descriptor = "Ljca;"
   )
   private class712 field1004;
   @OriginalMember(
      owner = "client!aw",
      name = "d",
      descriptor = "I"
   )
   public int field1007;
   @OriginalMember(
      owner = "client!aw",
      name = "e",
      descriptor = "Z"
   )
   private boolean field1008;
   @OriginalMember(
      owner = "client!aw",
      name = "l",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field1005;
   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1009 = new String[]{method769(method768("=\u000ec\u000e")), method769(method768("(U!L]")), method769(method768("2\f! \b")), method769(method768("2\f!&\b")), method769(method768("2\f!%\b")), method769(method768("2\f!^I=\u0012{\\\b")), method769(method768("2\f!\u0010U=S")), method769(method768("2\f!#\b")), method769(method768("2\f!!\b")), method769(method768("2\f!$\b")), method769(method768("2\f!'\b"))};
   @OriginalMember(
      owner = "client!aw",
      name = "h",
      descriptor = "I"
   )
   public static int field999 = -1;
   @OriginalMember(
      owner = "client!aw",
      name = "m",
      descriptor = "I"
   )
   public static int field1000;
   @OriginalMember(
      owner = "client!aw",
      name = "f",
      descriptor = "I"
   )
   public static int field1001;
   @OriginalMember(
      owner = "client!aw",
      name = "b",
      descriptor = "I"
   )
   public static int field1002;
   @OriginalMember(
      owner = "client!aw",
      name = "j",
      descriptor = "I"
   )
   public static int field1003;
   @OriginalMember(
      owner = "client!aw",
      name = "c",
      descriptor = "I"
   )
   public static int field1006;
   @OriginalMember(
      owner = "client!aw",
      name = "g",
      descriptor = "I"
   )
   public static int field996;
   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "I"
   )
   public static int field997;
   @OriginalMember(
      owner = "client!aw",
      name = "i",
      descriptor = "I"
   )
   public static int field998;

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(Liw;II)Lwja;",
      line = 3
   )
   public final class279 method761(class332 arg0, int arg1, int arg2) {
      try {
         ++field997;
         class279 var4 = new class279();
         var4.field882 = (long)arg2;
         var4.field3889 = arg0;
         var4.field3888 = 3;
         var4.field340 = false;
         this.method763(var4, 117);
         int var5 = -79 % ((-35 - arg1) / 55);
         return var4;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1009[8] + (arg0 != null ? field1009[1] : field1009[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(I[BLiw;I)Lwja;",
      line = 20
   )
   public final class279 method762(int arg0, byte[] arg1, class332 arg2, int arg3) {
      try {
         ++field996;
         class279 var5 = new class279();
         var5.field3888 = 2;
         if (arg3 != -13528) {
            this.method761((class332)null, -3, 57);
         }

         var5.field340 = false;
         var5.field3889 = arg2;
         var5.field882 = (long)arg0;
         var5.field3886 = arg1;
         this.method763(var5, 116);
         return var5;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1009[10] + arg0 + ',' + (arg1 != null ? field1009[1] : field1009[0]) + ',' + (arg2 != null ? field1009[1] : field1009[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(Lwja;I)V",
      line = 48
   )
   private final void method763(class279 arg0, int arg1) {
      try {
         ++field998;
         class712 var3 = this.field1004;
         synchronized(this.field1004) {
            this.field1004.method5164(arg0, (byte)-105);
            ++this.field1007;
            if (arg1 <= 113) {
               method764((int[])null, (byte)-39, (Object[])null);
            }

            this.field1004.notifyAll();
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1009[9] + (arg0 != null ? field1009[1] : field1009[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "([IB[Ljava/lang/Object;)V",
      line = 64
   )
   public static final void method764(int[] arg0, byte arg1, Object[] arg2) {
      try {
         class31.method219(arg2, arg0, -35, 0, arg0.length - 1);
         if (arg1 != -74) {
            method764((int[])null, (byte)9, (Object[])null);
         }

         ++field1001;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1009[4] + (arg0 != null ? field1009[1] : field1009[0]) + ',' + arg1 + ',' + (arg2 != null ? field1009[1] : field1009[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(ILiw;I)Lwja;",
      line = 76
   )
   public final class279 method765(int param1, class332 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aw",
      name = "<init>",
      descriptor = "(Lhg;)V",
      line = 195
   )
   public class82(class719 arg0) {
      int var2 = client.field4530;
      super();
      this.field1004 = new class712();
      this.field1007 = 0;
      this.field1008 = false;

      try {
         class12 var3 = arg0.method5214(this, -110, 5);
         if (var2 != 0) {
            class89.method817(10L, 2535);
         }

         while(~var3.field159 == -1) {
            class89.method817(10L, 2535);
         }

         if (~var3.field159 == -3) {
            throw new RuntimeException();
         } else {
            this.field1005 = (Thread)var3.field160;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1009[5] + (arg0 != null ? field1009[1] : field1009[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(II)I",
      line = 113
   )
   public static final int method766(int arg0, int arg1) {
      try {
         if (arg0 != 1894444328) {
            return -63;
         } else {
            ++field1006;
            return arg1 >>> 8;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1009[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "a",
      descriptor = "(I)V",
      line = 130
   )
   public final void method767(int arg0) {
      try {
         int var2 = -24 / ((arg0 - -30) / 42);
         this.field1008 = true;
         ++field1000;
         class712 var3 = this.field1004;
         synchronized(this.field1004) {
            this.field1004.notifyAll();
         }

         try {
            this.field1005.join();
         } catch (InterruptedException var5) {
         }

         this.field1005 = null;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1009[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aw",
      name = "run",
      descriptor = "()V",
      line = 149
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method768(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method769(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
