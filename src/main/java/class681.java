import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class681 {
   @OriginalMember(
      owner = "client!pb",
      name = "k",
      descriptor = "Ldw;"
   )
   private class748 field10226 = new class748(256);
   @OriginalMember(
      owner = "client!pb",
      name = "c",
      descriptor = "Ld;"
   )
   private class160 field10233;
   @OriginalMember(
      owner = "client!pb",
      name = "e",
      descriptor = "Ldh;"
   )
   private class338 field10235;
   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10236 = new String[]{method4967(method4966("`*b9+")), method4967(method4966("`*b?+")), method4967(method4966("`*b>+")), method4967(method4966("`*b8+")), method4967(method4966("~= \u0010")), method4967(method4966("kfbR~")), method4967(method4966("`*b@j~!8B+")), method4967(method4966("`*b=+"))};
   @OriginalMember(
      owner = "client!pb",
      name = "j",
      descriptor = "Lum;"
   )
   public static class550 field10227 = new class550();
   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "I"
   )
   public static int field10225;
   @OriginalMember(
      owner = "client!pb",
      name = "d",
      descriptor = "I"
   )
   public static int field10228;
   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "I"
   )
   public static int field10229;
   @OriginalMember(
      owner = "client!pb",
      name = "i",
      descriptor = "I"
   )
   public static int field10230;
   @OriginalMember(
      owner = "client!pb",
      name = "f",
      descriptor = "I"
   )
   public static int field10234;
   @OriginalMember(
      owner = "client!pb",
      name = "h",
      descriptor = "Lgq;"
   )
   public static class540 field10231;
   @OriginalMember(
      owner = "client!pb",
      name = "g",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10232;

   @OriginalMember(
      owner = "client!pb",
      name = "c",
      descriptor = "(Z)V",
      line = 3
   )
   public static final void method4961(boolean arg0) {
      try {
         class459.field6944.method551(class175.field2171, class500.field7431, class382.field5864);
         ++field10234;
         if (arg0) {
            method4962(-64);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10236[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(I)V",
      line = 14
   )
   public static void method4962(int arg0) {
      try {
         field10232 = null;
         if (arg0 <= -117) {
            field10227 = null;
            field10231 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10236[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(II)Loia;",
      line = 26
   )
   public final class95 method4963(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field10225;
         Object var4 = this.field10226.method5454((long)arg1, 18261);
         if (var4 != null) {
            return (class95)var4;
         } else if (!this.field10233.method1165(arg1, -23239)) {
            return null;
         } else {
            class327 var5 = this.field10233.method1159(arg1, 122);
            if (arg0 != 64) {
               field10228 = -102;
            }

            class95 var8;
            label77: {
               int var6 = var5.field4646 ? 64 : this.field10235.field5086;
               if (!var5.field4640 || !this.field10235.method657()) {
                  int[] var7;
                  label78: {
                     if (~var5.field4636 == -3 || !class559.method4142(7, var5.field4655)) {
                        var7 = this.field10233.method1168(0.7F, false, var6, 24521, arg1, var6);
                        if (var3 == 0) {
                           break label78;
                        }
                     }

                     var7 = this.field10233.method1166((byte)89, 0.7F, var6, var6, true, arg1);
                  }

                  var8 = this.field10235.method2577(var5.field4634 != 0, var6, var7, var6, 2);
                  if (var3 == 0) {
                     break label77;
                  }
               }

               float[] var9 = this.field10233.method1164(arg1, 7795, false, var6, var6, 0.7F);
               var8 = this.field10235.method2596(var5.field4634 != 0, var6, class75.field963, var6, var9, (byte)-84);
            }

            var8.method502(108, var5.field4639, var5.field4631);
            this.field10226.method5455(-2049, var8, (long)arg1);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field10236[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "a",
      descriptor = "(Z)V",
      line = 75
   )
   public final void method4964(boolean arg0) {
      try {
         ++field10230;
         this.field10226.method5453(5, arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10236[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "b",
      descriptor = "(Z)V",
      line = 89
   )
   public final void method4965(boolean arg0) {
      try {
         this.field10226.method5451(110);
         if (!arg0) {
            this.method4964(false);
         }

         ++field10229;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10236[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "<init>",
      descriptor = "(Ldh;Ld;)V",
      line = 112
   )
   public class681(class338 arg0, class160 arg1) {
      try {
         this.field10233 = arg1;
         this.field10235 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10236[6] + (arg0 != null ? field10236[5] : field10236[4]) + ',' + (arg1 != null ? field10236[5] : field10236[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4966(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4967(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
