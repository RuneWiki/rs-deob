import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class276 {
   @OriginalMember(
      owner = "client!rh",
      name = "m",
      descriptor = "Ldw;"
   )
   private class748 field3855 = new class748(128);
   @OriginalMember(
      owner = "client!rh",
      name = "c",
      descriptor = "Leaa;"
   )
   private class526 field3844;
   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3857 = new String[]{method2131(method2130("X\u000eNK~D\u000f\u0014I?")), method2131(method2130("D\u0013\f\u001b")), method2131(method2130("QHNYj")), method2131(method2130("X\u000eN5?")), method2131(method2130("X\u000eN6?")), method2131(method2130("X\u000eN3?")), method2131(method2130("X\u000eN1?")), method2131(method2130("b\u000f\u0004\u0013rDK")), method2131(method2130("X\u000eN2?")), method2131(method2130("X\u000eN4?"))};
   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "I"
   )
   public static int field3852 = 0;
   @OriginalMember(
      owner = "client!rh",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field3846 = new int[256];
   @OriginalMember(
      owner = "client!rh",
      name = "g",
      descriptor = "I"
   )
   public static int field3845;
   @OriginalMember(
      owner = "client!rh",
      name = "k",
      descriptor = "I"
   )
   public static int field3847;
   @OriginalMember(
      owner = "client!rh",
      name = "f",
      descriptor = "I"
   )
   public static int field3848;
   @OriginalMember(
      owner = "client!rh",
      name = "d",
      descriptor = "I"
   )
   public static int field3849;
   @OriginalMember(
      owner = "client!rh",
      name = "e",
      descriptor = "I"
   )
   public static int field3851;
   @OriginalMember(
      owner = "client!rh",
      name = "h",
      descriptor = "I"
   )
   public static int field3853;
   @OriginalMember(
      owner = "client!rh",
      name = "j",
      descriptor = "I"
   )
   public static int field3854;
   @OriginalMember(
      owner = "client!rh",
      name = "b",
      descriptor = "I"
   )
   public static int field3856;
   @OriginalMember(
      owner = "client!rh",
      name = "i",
      descriptor = "Leaa;"
   )
   public static class526 field3850;

   @OriginalMember(
      owner = "client!rh",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2124(int arg0) {
      try {
         field3846 = null;
         field3850 = null;
         if (arg0 <= 80) {
            method2126((class544)null, 46, 113);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3857[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2125(int arg0) {
      try {
         if (arg0 != -21063) {
            this.method2129(-126, false);
         }

         ++field3849;
         class748 var2 = this.field3855;
         synchronized(this.field3855) {
            this.field3855.method5445(697465426);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3857[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(Lhv;II)Ljava/lang/String;"
   )
   public static final String method2126(class544 arg0, int arg1, int arg2) {
      try {
         if (arg1 != -2) {
            field3856 = 19;
         }

         ++field3854;
         if (!client.method2388(arg0).method3549(arg2, -119) && arg0.field7937 == null) {
            return null;
         } else if (arg0.field7921 != null && arg0.field7921.length > arg2 && arg0.field7921[arg2] != null && arg0.field7921[arg2].trim().length() != 0) {
            return arg0.field7921[arg2];
         } else {
            return class384.field5876 ? field3857[7] + arg2 : null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3857[6] + (arg0 != null ? field3857[2] : field3857[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2127(int arg0) {
      try {
         ++field3851;
         if (arg0 < 49) {
            field3848 = -31;
         }

         class748 var2 = this.field3855;
         synchronized(this.field3855) {
            this.field3855.method5451(107);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3857[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(ZI)Loca;"
   )
   public final class274 method2128(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            return null;
         } else {
            ++field3853;
            class748 var3 = this.field3855;
            class274 var4;
            synchronized(this.field3855) {
               var4 = (class274)this.field3855.method5454((long)arg1, 18261);
            }

            if (var4 != null) {
               return var4;
            } else {
               class526 var5 = this.field3844;
               byte[] var6;
               synchronized(this.field3844) {
                  var6 = this.field3844.method3899(-71, arg1, 1);
               }

               class274 var7 = new class274();
               if (var6 != null) {
                  var7.method2109(new class128(var6), (byte)-127);
               }

               class748 var8 = this.field3855;
               synchronized(this.field3855) {
                  this.field3855.method5455(-2049, var7, (long)arg1);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field3857[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method2129(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method2129(-48, false);
         }

         class748 var3 = this.field3855;
         synchronized(this.field3855) {
            this.field3855.method5453(arg0, false);
         }

         ++field3845;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3857[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rh",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V"
   )
   public class276(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field3844 = arg2;
         this.field3844.method3875(0, 1);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field3857[0] + (arg0 != null ? field3857[2] : field3857[1]) + ',' + arg1 + ',' + (arg2 != null ? field3857[2] : field3857[1]) + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -257; ++var0) {
         int var1 = var0;

         for(int var2 = 0; ~var2 > -9; ++var2) {
            if (~(1 & var1) == -2) {
               var1 = -306674912 ^ var1 >>> 1;
            } else {
               var1 >>>= 1;
            }
         }

         field3846[var0] = var1;
      }

   }

   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2130(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2131(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
