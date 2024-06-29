import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class613 implements Runnable {
   @OriginalMember(
      owner = "client!tca",
      name = "f",
      descriptor = "Llja;"
   )
   private class728 field9028;
   @OriginalMember(
      owner = "client!tca",
      name = "n",
      descriptor = "Z"
   )
   private boolean field9031;
   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "I"
   )
   public int field9029;
   @OriginalMember(
      owner = "client!tca",
      name = "p",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field9030;
   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9033 = new String[]{method4523(method4522("Rx\u0001\u0015\f")), method4523(method4522("G#CW")), method4523(method4522("]5N\u00157\u0001")), method4523(method4522("]5N\u00150\u0001")), method4523(method4522("]5N\u00154\u0001")), method4523(method4522("]5N\u00155\u0001")), method4523(method4522("]5N\u00156\u0001")), method4523(method4522("]5N\u00152\u0001")), method4523(method4522("]5N\u00153\u0001")), method4523(method4522("]5N\u0015\u0003\\8\u0007")), method4523(method4522("]5N\u0015M@8FOO\u0001"))};
   @OriginalMember(
      owner = "client!tca",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field9018 = true;
   @OriginalMember(
      owner = "client!tca",
      name = "e",
      descriptor = "Laka;"
   )
   public static class418 field9019 = new class418(107, 6);
   @OriginalMember(
      owner = "client!tca",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field9025 = false;
   @OriginalMember(
      owner = "client!tca",
      name = "j",
      descriptor = "Lfea;"
   )
   public static class681 field9023 = new class681(1, 2, 2, 0);
   @OriginalMember(
      owner = "client!tca",
      name = "k",
      descriptor = "I"
   )
   public static int field9017;
   @OriginalMember(
      owner = "client!tca",
      name = "l",
      descriptor = "I"
   )
   public static int field9020;
   @OriginalMember(
      owner = "client!tca",
      name = "o",
      descriptor = "I"
   )
   public static int field9021;
   @OriginalMember(
      owner = "client!tca",
      name = "c",
      descriptor = "I"
   )
   public static int field9022;
   @OriginalMember(
      owner = "client!tca",
      name = "i",
      descriptor = "I"
   )
   public static int field9024;
   @OriginalMember(
      owner = "client!tca",
      name = "d",
      descriptor = "I"
   )
   public static int field9026;
   @OriginalMember(
      owner = "client!tca",
      name = "h",
      descriptor = "I"
   )
   public static int field9027;
   @OriginalMember(
      owner = "client!tca",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field9032;

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4515(byte arg0) {
      try {
         field9019 = null;
         field9023 = null;
         if (arg0 != -2) {
            method4515((byte)-46);
         }

         field9032 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9033[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(BLhd;I)Lkga;"
   )
   public final class583 method4516(byte arg0, class347 arg1, int arg2) {
      try {
         ++field9022;
         class583 var4 = new class583();
         var4.field8605 = 3;
         var4.field11624 = false;
         var4.field275 = (long)arg2;
         var4.field8606 = arg1;
         if (arg0 != -103) {
            method4517(-68, -92, 14, 4, 115, -16, -71);
         }

         this.method4518(false, var4);
         return var4;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9033[2] + arg0 + ',' + (arg1 != null ? field9033[0] : field9033[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(IIIIIII)Lkc;"
   )
   public static final class72 method4517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg3 != -4) {
            method4517(107, -25, 59, -53, -120, -116, 13);
         }

         ++field9020;
         long var7 = (long)arg2 * 76724863L ^ (long)arg4 * 986053L ^ (long)arg0 * 475427L ^ (long)arg5 * 67481L ^ (long)arg1 * 97549L ^ (long)arg6 * 32147369L;
         class72 var9 = (class72)class502.field6981.method3192(var7, (byte)-123);
         if (var9 != null) {
            return var9;
         } else {
            class72 var10 = class577.field8555.method423(arg5, arg1, arg0, arg4, arg6, arg2);
            class502.field6981.method3190(var10, var7, 8);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field9033[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(ZLkga;)V"
   )
   private final void method4518(boolean arg0, class583 arg1) {
      try {
         ++field9017;
         class728 var3 = this.field9028;
         synchronized(this.field9028) {
            this.field9028.method5267((byte)111, arg1);
            if (!arg0) {
               ++this.field9029;
               this.field9028.notifyAll();
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field9033[4] + arg0 + ',' + (arg1 != null ? field9033[0] : field9033[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(IZLhd;)Lkga;"
   )
   public final class583 method4519(int param1, boolean param2, class347 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4520(int arg0) {
      try {
         ++field9026;
         this.field9031 = true;
         class728 var2 = this.field9028;
         synchronized(this.field9028) {
            this.field9028.notifyAll();
         }

         if (arg0 <= 73) {
            field9023 = null;
         }

         try {
            this.field9030.join();
         } catch (InterruptedException var4) {
         }

         this.field9030 = null;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9033[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "a",
      descriptor = "([BIILhd;)Lkga;"
   )
   public final class583 method4521(byte[] arg0, int arg1, int arg2, class347 arg3) {
      try {
         ++field9027;
         class583 var5 = new class583();
         var5.field8604 = arg0;
         if (arg2 >= -72) {
            field9019 = null;
         }

         var5.field8606 = arg3;
         var5.field11624 = false;
         var5.field8605 = 2;
         var5.field275 = (long)arg1;
         this.method4518(false, var5);
         return var5;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field9033[5] + (arg0 != null ? field9033[0] : field9033[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9033[0] : field9033[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "<init>",
      descriptor = "(Lgj;)V"
   )
   public class613(class736 arg0) {
      boolean var2 = client.field1481;
      super();
      this.field9028 = new class728();
      this.field9031 = false;
      this.field9029 = 0;

      try {
         class769 var3 = arg0.method5338(0, 5, this);
         if (var2) {
            class340.method2717(10L, (byte)-119);
         }

         while(var3.field11210 == 0) {
            class340.method2717(10L, (byte)-119);
         }

         if (~var3.field11210 == -3) {
            throw new RuntimeException();
         } else {
            this.field9030 = (Thread)var3.field11212;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9033[10] + (arg0 != null ? field9033[0] : field9033[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4522(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4523(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
