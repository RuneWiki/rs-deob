import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class355 extends RuntimeException {
   @OriginalMember(
      owner = "client!mc",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field4958;
   @OriginalMember(
      owner = "client!mc",
      name = "h",
      descriptor = "Ljava/lang/Throwable;"
   )
   public Throwable field4953;
   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4960 = new String[]{method2819(method2818("XeFo1")), method2819(method2818("XeFl1")), method2819(method2818("XeFn1")), method2819(method2818("XeFi1")), method2819(method2818("[d"))};
   @OriginalMember(
      owner = "client!mc",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field4955 = false;
   @OriginalMember(
      owner = "client!mc",
      name = "d",
      descriptor = "D"
   )
   public static double field4954;
   @OriginalMember(
      owner = "client!mc",
      name = "i",
      descriptor = "I"
   )
   public static int field4951;
   @OriginalMember(
      owner = "client!mc",
      name = "c",
      descriptor = "I"
   )
   public static int field4952;
   @OriginalMember(
      owner = "client!mc",
      name = "g",
      descriptor = "I"
   )
   public static int field4956;
   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "I"
   )
   public static int field4957;
   @OriginalMember(
      owner = "client!mc",
      name = "f",
      descriptor = "I"
   )
   public static int field4959;

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(I)Lwfa;"
   )
   public static final class174 method2814(int arg0) {
      try {
         ++field4952;
         int var1 = -127 % ((arg0 - -6) / 38);

         try {
            return new class29();
         } catch (Throwable var4) {
            try {
               return (class174)Class.forName(field4960[4]).newInstance();
            } catch (Throwable var3) {
               return new class252();
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field4960[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method2815(int arg0, int arg1, int arg2) {
      try {
         arg2 = (127 & arg0) * arg2 >> 7;
         ++field4956;
         if (arg2 < 2) {
            arg2 = 2;
            if (!client.field1481) {
               return arg1 != 126 ? 31 : (arg0 & 65408) + arg2;
            }
         }

         if (~arg2 < -127) {
            arg2 = 126;
         }

         return arg1 != 126 ? 31 : (arg0 & 65408) + arg2;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4960[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(DB)V"
   )
   public static final void method2816(double arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         if (class156.field2016 != arg0) {
            int var4 = 0;
            int var5;
            if (var3) {
               var5 = (int)(255.0D * Math.pow((double)var4 / 255.0D, arg0));
               class268.field3431[var4] = ~var5 >= -256 ? var5 : 255;
               ++var4;
            }

            while(true) {
               double var10000;
               if (~var4 <= -257) {
                  var10000 = arg0;
                  if (!var3) {
                     class156.field2016 = arg0;
                     break;
                  }
               } else {
                  var10000 = 255.0D * Math.pow((double)var4 / 255.0D, arg0);
               }

               var5 = (int)var10000;
               class268.field3431[var4] = ~var5 >= -256 ? var5 : 255;
               ++var4;
            }
         }

         if (arg1 >= 90) {
            ++field4951;
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4960[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method2817(int arg0, byte arg1) {
      try {
         ++field4959;
         class487 var2 = class2.method12((long)arg0, 3, (byte)43);
         var2.method3696(-11118);
         if (arg1 > -11) {
            field4955 = true;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field4960[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "<init>",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V"
   )
   public class355(Throwable arg0, String arg1) {
      this.field4958 = arg1;
      this.field4953 = arg0;
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2818(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2819(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
