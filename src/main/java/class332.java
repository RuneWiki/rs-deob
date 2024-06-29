import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class332 {
   @OriginalMember(
      owner = "client!rr",
      name = "g",
      descriptor = "Liw;"
   )
   private class107 field4935 = new class107(64);
   @OriginalMember(
      owner = "client!rr",
      name = "e",
      descriptor = "Lsa;"
   )
   private class39 field4936;
   @OriginalMember(
      owner = "client!rr",
      name = "f",
      descriptor = "I"
   )
   public int field4937;
   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4941 = new String[]{method2664(method2663("g\fE*8")), method2664(method2663("g\fE)8")), method2664(method2663("g\fE,8")), method2664(method2663("g\fETy{\u0017\u001fV8")), method2664(method2663("nPEFm")), method2664(method2663("{\u000b\u0007\u0004")), method2664(method2663("g\fE+8")), method2664(method2663("g\fE-8"))};
   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "Lfm;"
   )
   public static class164 field4939 = new class164(80, 3);
   @OriginalMember(
      owner = "client!rr",
      name = "d",
      descriptor = "I"
   )
   public static int field4933;
   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "I"
   )
   public static int field4934;
   @OriginalMember(
      owner = "client!rr",
      name = "h",
      descriptor = "I"
   )
   public static int field4938;
   @OriginalMember(
      owner = "client!rr",
      name = "c",
      descriptor = "I"
   )
   public static int field4940;

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2658(byte arg0) {
      try {
         ++field4934;
         int var2 = 58 % ((arg0 - 82) / 44);
         class107 var3 = this.field4935;
         synchronized(this.field4935) {
            this.field4935.method1045(3);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4941[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2659(int arg0) {
      try {
         class107 var2 = this.field4935;
         synchronized(this.field4935) {
            this.field4935.method1052(true);
         }

         ++field4940;
         if (arg0 <= 113) {
            this.field4935 = null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4941[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2660(int arg0) {
      try {
         field4939 = null;
         if (arg0 != 25071) {
            method2660(112);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4941[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(ZI)Lkga;"
   )
   public final class582 method2661(boolean arg0, int arg1) {
      try {
         ++field4933;
         class107 var3 = this.field4935;
         class582 var4;
         synchronized(this.field4935) {
            var4 = (class582)this.field4935.method1041((long)arg1, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field4936;
            byte[] var6;
            synchronized(this.field4936) {
               var6 = this.field4936.method460((byte)-11, arg1, 47);
            }

            if (!arg0) {
               return null;
            } else {
               class582 var7 = new class582();
               if (var6 != null) {
                  var7.method4280(4, new class65(var6));
               }

               class107 var8 = this.field4935;
               synchronized(this.field4935) {
                  this.field4935.method1050(-105, var7, (long)arg1);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field4941[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2662(int arg0, byte arg1) {
      try {
         class107 var3 = this.field4935;
         synchronized(this.field4935) {
            this.field4935.method1048(arg0, -8543);
         }

         if (arg1 > -5) {
            this.method2662(-15, (byte)-95);
         }

         ++field4938;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field4941[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class332(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field4936 = arg2;
         if (this.field4936 != null) {
            this.field4937 = this.field4936.method434((byte)-106, 47);
         } else {
            this.field4937 = 0;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field4941[3] + (arg0 != null ? field4941[4] : field4941[5]) + ',' + arg1 + ',' + (arg2 != null ? field4941[4] : field4941[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2663(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2664(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
