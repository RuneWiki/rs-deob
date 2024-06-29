import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class269 extends class22 {
   @OriginalMember(
      owner = "client!sda",
      name = "o",
      descriptor = "Z"
   )
   public boolean field3802 = false;
   @OriginalMember(
      owner = "client!sda",
      name = "n",
      descriptor = "I"
   )
   public int field3806 = -1;
   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3811 = new String[]{method2135(method2134("-~\u0005\u0002>7t\rX<v")), method2135(method2134("-~\u0005\u0002@v")), method2135(method2134("-~\u0005\u0002Cv"))};
   @OriginalMember(
      owner = "client!sda",
      name = "u",
      descriptor = "Lgh;"
   )
   public static class572 field3800 = new class572(117, 1);
   @OriginalMember(
      owner = "client!sda",
      name = "m",
      descriptor = "Liw;"
   )
   public static class332 field3807 = new class332();
   @OriginalMember(
      owner = "client!sda",
      name = "q",
      descriptor = "Lgh;"
   )
   public static class572 field3808 = new class572(107, 8);
   @OriginalMember(
      owner = "client!sda",
      name = "p",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field3809 = new String[200];
   @OriginalMember(
      owner = "client!sda",
      name = "j",
      descriptor = "I"
   )
   public int field3798;
   @OriginalMember(
      owner = "client!sda",
      name = "r",
      descriptor = "I"
   )
   public static int field3799;
   @OriginalMember(
      owner = "client!sda",
      name = "k",
      descriptor = "I"
   )
   public int field3801;
   @OriginalMember(
      owner = "client!sda",
      name = "v",
      descriptor = "I"
   )
   public int field3803;
   @OriginalMember(
      owner = "client!sda",
      name = "l",
      descriptor = "I"
   )
   public int field3804;
   @OriginalMember(
      owner = "client!sda",
      name = "t",
      descriptor = "I"
   )
   public int field3805;
   @OriginalMember(
      owner = "client!sda",
      name = "s",
      descriptor = "[Ls;"
   )
   public static class293[] field3810;

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2131(int arg0) {
      try {
         field3807 = null;
         field3809 = null;
         field3810 = null;
         if (arg0 <= 27) {
            field3800 = null;
         }

         field3800 = null;
         field3808 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3811[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "()V"
   )
   public static final void method2132() {
      while(true) {
         boolean var0 = true;

         for(int var1 = 0; var1 < class786.field11513.length; ++var1) {
            if (!class786.field11513[var1].method2141()) {
               synchronized(class786.field11513[var1]) {
                  class786.field11513[var1].notify();
               }

               var0 = false;
            } else {
               class567.field8232[var1] = class786.field11513[var1].method2143();
            }
         }

         if (var0) {
            class786.field11513[class786.field11513.length - 1].method2145();
            class397.method3060(1);

            while(true) {
               boolean var3 = true;

               for(int var4 = 0; var4 < class786.field11513.length - 1; ++var4) {
                  if (!class786.field11513[var4].method2141()) {
                     synchronized(class786.field11513[var4]) {
                        class786.field11513[var4].notify();
                     }

                     var3 = false;
                  }
               }

               if (var3) {
                  for(int var6 = 1; var6 < class786.field11513.length - 2; ++var6) {
                     class786.field11513[var6].method2145();
                  }

                  class397.method3060(2);

                  while(!class786.field11513[0].method2141()) {
                     synchronized(class786.field11513[0]) {
                        class786.field11513[0].notify();
                     }

                     try {
                        class624.method4569((byte)98, 1L);
                     } catch (Exception var9) {
                     }
                  }

                  class786.field11513[0].method2145();
                  return;
               }

               try {
                  class624.method4569((byte)98, 1L);
               } catch (Exception var12) {
               }
            }
         }

         try {
            class624.method4569((byte)98, 1L);
         } catch (Exception var8) {
         }
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2133(int arg0, int arg1, int arg2) {
      try {
         if (arg1 >= -39) {
            method2132();
         }

         ++field3799;
         return ~(52 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3811[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class269(int arg0) {
      try {
         this.field3806 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3811[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2134(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2135(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
