import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class704 {
   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10294 = new String[]{method5122(method5121("Tu\u0014\u0004Z\u0018")), method5122(method5121("Tu\u0014\u0004X\u0018")), method5122(method5121("Tu\u0014\u0004]\u0018")), method5122(method5121("Tu\u0014\u0004Y\u0018")), method5122(method5121("Tu\u0014\u0004\\\u0018")), method5122(method5121("Tu\u0014\u0004^\u0018"))};
   @OriginalMember(
      owner = "client!dia",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field10289 = false;
   @OriginalMember(
      owner = "client!dia",
      name = "e",
      descriptor = "I"
   )
   public static int field10287;
   @OriginalMember(
      owner = "client!dia",
      name = "c",
      descriptor = "I"
   )
   public static int field10288;
   @OriginalMember(
      owner = "client!dia",
      name = "g",
      descriptor = "I"
   )
   public static int field10290;
   @OriginalMember(
      owner = "client!dia",
      name = "b",
      descriptor = "I"
   )
   public static int field10292;
   @OriginalMember(
      owner = "client!dia",
      name = "f",
      descriptor = "I"
   )
   public static int field10293;
   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "Lkd;"
   )
   public static class790 field10291;

   @OriginalMember(
      owner = "client!dia",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5114(int arg0) {
      try {
         if (arg0 != 0) {
            method5117(29);
         }

         field10291 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10294[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Lda;)V"
   )
   public static final void method5115(class447 arg0) {
      class519.field7302 = arg0;
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(JJ)J"
   )
   public static long method5116(long arg0, long arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10294[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5117(int arg0) {
      try {
         class436.field5944.method1809(true);
         ++field10287;
         class746.field10878.method1809(true);
         if (arg0 != -1) {
            method5117(36);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10294[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(BJ)I"
   )
   public static final int method5118(byte arg0, long arg1) {
      try {
         class30.method243(-94, arg1);
         if (arg0 != -57) {
            return -69;
         } else {
            ++field10293;
            return class585.field8631.get(1);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10294[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5119(boolean arg0) {
      boolean var1 = client.field1481;

      try {
         if (!arg0) {
            field10289 = false;
         }

         if (class794.field11620 == null || class123.field1612 == null) {
            class123.field1612 = new int[256];
            class794.field11620 = new int[256];
            int var2 = 0;
            if (var1 || ~var2 > -257) {
               do {
                  double var3 = (double)var2 / 255.0D * 6.283185307179586D;
                  class794.field11620[var2] = (int)(4096.0D * Math.sin(var3));
                  class123.field1612[var2] = (int)(4096.0D * Math.cos(var3));
                  ++var2;
               } while(~var2 > -257);
            }
         }

         ++field10288;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10294[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5120(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -12565) {
            return false;
         } else {
            ++field10290;
            return class286.method2326(arg2, arg0, (byte)57) | ~(458752 & arg2) != -1 || class529.method3952(arg2, -76, arg0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10294[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5121(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5122(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
