import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class237 implements Runnable {
   @OriginalMember(
      owner = "client!qb",
      name = "e",
      descriptor = "[Lefa;"
   )
   public volatile class197[] field3302 = new class197[2];
   @OriginalMember(
      owner = "client!qb",
      name = "d",
      descriptor = "Z"
   )
   public volatile boolean field3303 = false;
   @OriginalMember(
      owner = "client!qb",
      name = "i",
      descriptor = "Z"
   )
   public volatile boolean field3294 = false;
   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3311 = new String[]{method1828(method1827("\"rO;\u0012")), method1828(method1827("tq_5")), method1828(method1827("7)\ry")), method1828(method1827("(>OVG")), method1828(method1827("=5\u0013p\f-0\u000er\u00067|")), method1828(method1827("(>OTG")), method1828(method1827("(>Og\u001a7t")), method1828(method1827("(>OWG"))};
   @OriginalMember(
      owner = "client!qb",
      name = "f",
      descriptor = "Ljava/lang/String;"
   )
   public static String field3299 = null;
   @OriginalMember(
      owner = "client!qb",
      name = "q",
      descriptor = "I"
   )
   public static int field3298 = 0;
   @OriginalMember(
      owner = "client!qb",
      name = "j",
      descriptor = "Lek;"
   )
   public static class536 field3295 = new class536(89, 5);
   @OriginalMember(
      owner = "client!qb",
      name = "l",
      descriptor = "[Lbo;"
   )
   public static class762[] field3305 = new class762[5];
   @OriginalMember(
      owner = "client!qb",
      name = "p",
      descriptor = "I"
   )
   public static int field3309;
   @OriginalMember(
      owner = "client!qb",
      name = "g",
      descriptor = "Lek;"
   )
   public static class536 field3307;
   @OriginalMember(
      owner = "client!qb",
      name = "o",
      descriptor = "I"
   )
   public static int field3297;
   @OriginalMember(
      owner = "client!qb",
      name = "m",
      descriptor = "I"
   )
   public static int field3300;
   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "I"
   )
   public static int field3301;
   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "I"
   )
   public static int field3304;
   @OriginalMember(
      owner = "client!qb",
      name = "k",
      descriptor = "I"
   )
   public static int field3306;
   @OriginalMember(
      owner = "client!qb",
      name = "n",
      descriptor = "I"
   )
   public static int field3308;
   @OriginalMember(
      owner = "client!qb",
      name = "h",
      descriptor = "I"
   )
   public static int field3310;
   @OriginalMember(
      owner = "client!qb",
      name = "c",
      descriptor = "Lnu;"
   )
   public class619 field3296;

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lbi;"
   )
   public static final class509 method1823(Throwable arg0, String arg1) {
      ++field3301;
      class509 var2;
      if (!(arg0 instanceof class509)) {
         var2 = new class509(arg0, arg1);
      } else {
         var2 = (class509)arg0;
         var2.field7412 = var2.field7412 + ' ' + arg1;
      }

      return var2;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1824(int arg0) {
      try {
         field3307 = null;
         field3305 = null;
         field3295 = null;
         int var1 = -124 % ((arg0 - 22) / 36);
         field3299 = null;
      } catch (RuntimeException var3) {
         throw method1823(var3, field3311[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(I)[Lqca;"
   )
   public static final class127[] method1825(int arg0) {
      try {
         ++field3306;
         if (arg0 != -29407) {
            method1825(-3);
         }

         return new class127[]{class9.field85, class336.field4574, class102.field1305, class291.field4020, class245.field3376, class509.field7411, class116.field1445, class271.field3741, class592.field8711, class345.field4670};
      } catch (RuntimeException var2) {
         throw method1823(var2, field3311[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(ILjava/lang/String;)Ljava/lang/String;"
   )
   public static final String method1826(int arg0, String arg1) {
      boolean var2 = client.field4360;

      try {
         ++field3300;
         if (arg0 > -25) {
            method1823((Throwable)null, (String)null);
         }

         String var3 = null;
         int var4 = arg1.indexOf(field3311[1]);
         if (~var4 <= -1) {
            var3 = arg1.substring(0, var4 + 4);
            arg1 = arg1.substring(var4 + 4);
         }

         if (arg1.startsWith(field3311[4])) {
            int var5 = arg1.indexOf(" ", field3311[4].length());
            if (var5 >= 0) {
               int var6 = arg1.length();
               arg1 = arg1.substring(0, var5) + " ";
               int var7 = var5 + 1;
               if (var2 || var7 < var6) {
                  do {
                     arg1 = arg1 + "*";
                     ++var7;
                  } while(var7 < var6);
               }
            }
         }

         return var3 == null ? arg1 : var3 + arg1;
      } catch (RuntimeException var9) {
         throw method1823(var9, field3311[3] + arg0 + ',' + (arg1 != null ? field3311[0] : field3311[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      boolean var1 = client.field4360;

      try {
         this.field3294 = true;
         ++field3304;

         try {
            if (var1 || !this.field3303) {
               do {
                  int var2 = 0;
                  class197 var3;
                  if (var1) {
                     var3 = this.field3302[var2];
                     if (var3 != null) {
                        var3.method1541(false);
                     }

                     ++var2;
                  }

                  while(true) {
                     class237 var10000;
                     if (~var2 <= -3) {
                        class661.method4825(0, 10L);
                        var10000 = this;
                        if (!var1) {
                           class515.method3744(this.field3296, (Object)null, 0);
                           break;
                        }
                     } else {
                        var10000 = this;
                     }

                     var3 = var10000.field3302[var2];
                     if (var3 != null) {
                        var3.method1541(false);
                     }

                     ++var2;
                  }
               } while(!this.field3303);
            }
         } catch (Exception var12) {
            class668.method4876(-108, (String)null, var12);
         } finally {
            Object var8 = null;
            this.field3294 = false;
         }

      } catch (RuntimeException var14) {
         throw method1823(var14, field3311[6] + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < field3305.length; ++var0) {
         field3305[var0] = new class762();
      }

      field3309 = -1;
      field3307 = new class536(22, 1);
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1827(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1828(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
