import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class193 {
   @OriginalMember(
      owner = "client!cka",
      name = "g",
      descriptor = "Lsia;"
   )
   private class407 field2450 = new class407(64);
   @OriginalMember(
      owner = "client!cka",
      name = "n",
      descriptor = "Lsia;"
   )
   public class407 field2454 = new class407(64);
   @OriginalMember(
      owner = "client!cka",
      name = "k",
      descriptor = "Lww;"
   )
   public class339 field2444;
   @OriginalMember(
      owner = "client!cka",
      name = "j",
      descriptor = "Lww;"
   )
   private class339 field2449;
   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2457 = new String[]{method1607(method1606("O6k^>\u0004")), method1607(method1606("O6k^;\u0004")), method1607(method1606("O6k^9\u0004")), method1607(method1606("O6k^:\u0004")), method1607(method1606("O6k^=\u0004")), method1607(method1606("O6k^<\u0004")), method1607(method1606("Ws$^\u0002")), method1607(method1606("B(f\u001c")), method1607(method1606("O6k^CE3c\u0004A\u0004"))};
   @OriginalMember(
      owner = "client!cka",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field2447 = true;
   @OriginalMember(
      owner = "client!cka",
      name = "e",
      descriptor = "Lse;"
   )
   public static class6 field2442 = new class6(6, -1);
   @OriginalMember(
      owner = "client!cka",
      name = "o",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2456 = new String[200];
   @OriginalMember(
      owner = "client!cka",
      name = "h",
      descriptor = "I"
   )
   public static int field2443;
   @OriginalMember(
      owner = "client!cka",
      name = "m",
      descriptor = "I"
   )
   public static int field2446;
   @OriginalMember(
      owner = "client!cka",
      name = "f",
      descriptor = "I"
   )
   public static int field2448;
   @OriginalMember(
      owner = "client!cka",
      name = "d",
      descriptor = "I"
   )
   public static int field2451;
   @OriginalMember(
      owner = "client!cka",
      name = "l",
      descriptor = "I"
   )
   public static int field2452;
   @OriginalMember(
      owner = "client!cka",
      name = "c",
      descriptor = "I"
   )
   public static int field2453;
   @OriginalMember(
      owner = "client!cka",
      name = "b",
      descriptor = "I"
   )
   public static int field2455;
   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2445;

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(II)Lrw;"
   )
   public final class544 method1600(int arg0, int arg1) {
      try {
         ++field2453;
         class407 var3 = this.field2450;
         class544 var4;
         synchronized(this.field2450) {
            var4 = (class544)this.field2450.method3192((long)arg0, (byte)-127);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field2449;
            byte[] var6;
            synchronized(this.field2449) {
               var6 = this.field2449.method2697(arg0, 34, false);
            }

            class544 var7 = new class544();
            var7.field7952 = this;
            if (var6 != null) {
               var7.method4113((byte)122, new class66(var6));
            }

            class407 var8 = this.field2450;
            synchronized(this.field2450) {
               this.field2450.method3190(var7, (long)arg0, 8);
               if (arg1 != 200) {
                  this.field2454 = null;
               }

               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field2457[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1601(int arg0, int arg1, int arg2) {
      try {
         ++field2443;
         if (arg2 != 34) {
            field2442 = null;
         }

         this.field2450 = new class407(arg1);
         this.field2454 = new class407(arg0);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2457[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1602(int arg0) {
      try {
         ++field2448;
         class407 var2 = this.field2450;
         synchronized(this.field2450) {
            this.field2450.method3187(-23825);
         }

         class407 var3 = this.field2454;
         synchronized(this.field2454) {
            this.field2454.method3187(-23825);
            if (arg0 != 64) {
               this.method1605(96);
            }

         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2457[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method1603(boolean arg0, int arg1) {
      try {
         ++field2452;
         class407 var3 = this.field2450;
         synchronized(this.field2450) {
            this.field2450.method3197(5, arg1);
         }

         class407 var4 = this.field2454;
         synchronized(this.field2454) {
            this.field2454.method3197(5, arg1);
            if (arg0) {
               this.method1605(-29);
            }

         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2457[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1604(int arg0) {
      try {
         field2456 = null;
         if (arg0 == -22312) {
            field2442 = null;
            field2445 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2457[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1605(int arg0) {
      try {
         class407 var2 = this.field2450;
         synchronized(this.field2450) {
            this.field2450.method3201((byte)122);
         }

         ++field2451;
         if (arg0 < 116) {
            field2447 = true;
         }

         class407 var3 = this.field2454;
         synchronized(this.field2454) {
            this.field2454.method3201((byte)104);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2457[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "<init>",
      descriptor = "(Lkb;ILww;Lww;)V"
   )
   public class193(class500 arg0, int arg1, class339 arg2, class339 arg3) {
      try {
         this.field2444 = arg3;
         this.field2449 = arg2;
         this.field2449.method2691(34, -65);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2457[8] + (arg0 != null ? field2457[6] : field2457[7]) + ',' + arg1 + ',' + (arg2 != null ? field2457[6] : field2457[7]) + ',' + (arg3 != null ? field2457[6] : field2457[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1606(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1607(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 44;
            break;
         case 1:
            var10005 = 93;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
