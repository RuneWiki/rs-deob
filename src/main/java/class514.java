import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class514 {
   @OriginalMember(
      owner = "client!uha",
      name = "e",
      descriptor = "Llj;"
   )
   private class304 field7834 = new class304(64);
   @OriginalMember(
      owner = "client!uha",
      name = "d",
      descriptor = "Lrr;"
   )
   private class678 field7835;
   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7838 = new String[]{method3986(method3985(">\u0013\u0010>Rc")), method3986(method3985(">\u0013\u0010>Sc")), method3986(method3985("0U_>l")), method3986(method3985("%\u000e\u001d|")), method3986(method3985(">\u0013\u0010>-\"\u0015\u0018d/c")), method3986(method3985(">\u0013\u0010>Pc"))};
   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "[Z"
   )
   public static boolean[] field7831 = new boolean[5];
   @OriginalMember(
      owner = "client!uha",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field7832 = new class113(18, 7);
   @OriginalMember(
      owner = "client!uha",
      name = "c",
      descriptor = "I"
   )
   public static int field7833;
   @OriginalMember(
      owner = "client!uha",
      name = "f",
      descriptor = "I"
   )
   public static int field7836;
   @OriginalMember(
      owner = "client!uha",
      name = "g",
      descriptor = "I"
   )
   public static int field7837;

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(II)Ldea;",
      line = 3
   )
   public final class250 method3982(int arg0, int arg1) {
      try {
         ++field7833;
         class304 var3 = this.field7834;
         class250 var5;
         synchronized(this.field7834) {
            if (arg0 <= 87) {
               return null;
            }

            var5 = (class250)this.field7834.method2544(false, (long)arg1);
         }

         if (var5 != null) {
            return var5;
         } else {
            class678 var6 = this.field7835;
            byte[] var7;
            synchronized(this.field7835) {
               var7 = this.field7835.method5017(5, arg1, (byte)71);
            }

            class250 var8 = new class250();
            if (var7 != null) {
               var8.method2122((byte)55, new class354(var7));
            }

            class304 var9 = this.field7834;
            synchronized(this.field7834) {
               this.field7834.method2545((long)arg1, 112, var8);
               return var8;
            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field7838[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "([BI)[B",
      line = 35
   )
   public static final byte[] method3983(byte[] arg0, int arg1) {
      try {
         ++field7836;
         class354 var2 = new class354(arg0);
         int var3 = var2.method2855(-31007);
         int var4 = var2.method2894(arg1 + 108);
         if (arg1 != 7) {
            method3984((byte)53);
         }

         if (var4 < 0 || class212.field3222 != 0 && var4 > class212.field3222) {
            throw new RuntimeException();
         } else if (~var3 == -1) {
            byte[] var5 = new byte[var4];
            var2.method2859(var5, 0, false, var4);
            return var5;
         } else {
            int var6 = var2.method2894(112);
            if (var6 >= 0 && (class212.field3222 == 0 || ~class212.field3222 <= ~var6)) {
               byte[] var7 = new byte[var6];
               if (~var3 != -2) {
                  class746 var8 = class256.field3864;
                  synchronized(class256.field3864) {
                     class256.field3864.method5482(var7, -1593955902, var2);
                  }
               } else {
                  class220.method1907(var7, var6, arg0, var4, 9);
               }

               return var7;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field7838[5] + (arg0 != null ? field7838[2] : field7838[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(B)V",
      line = 104
   )
   public static void method3984(byte arg0) {
      try {
         field7831 = null;
         field7832 = null;
         if (arg0 != 22) {
            field7832 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7838[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 124
   )
   public class514(class311 arg0, int arg1, class678 arg2) {
      try {
         this.field7835 = arg2;
         this.field7835.method4998((byte)-82, 5);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7838[4] + (arg0 != null ? field7838[2] : field7838[3]) + ',' + arg1 + ',' + (arg2 != null ? field7838[2] : field7838[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3985(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3986(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
