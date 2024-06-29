import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class682 implements class505 {
   @OriginalMember(
      owner = "client!fj",
      name = "e",
      descriptor = "Lwg;"
   )
   private class448 field10243;
   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "Leaa;"
   )
   private class526 field10237;
   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10248 = new String[]{method4971(method4970("\u0016\u0004\u0005\u0003N")), method4971(method4970("\u0016\u0004\u0005\u0007N")), method4971(method4970("\u0016\u0004\u0005\u000fN")), method4971(method4970("\u000b@\u0005h\u001b")), method4971(method4970("\u0016\u0004\u0005z\u000f\u001e\u0007_xN")), method4971(method4970("\u001e\u001bG*")), method4971(method4970("\u0016\u0004\u0005\u0005N"))};
   @OriginalMember(
      owner = "client!fj",
      name = "k",
      descriptor = "Lsd;"
   )
   public static class101 field10239 = new class101(49, 3);
   @OriginalMember(
      owner = "client!fj",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field10242 = false;
   @OriginalMember(
      owner = "client!fj",
      name = "f",
      descriptor = "Lhn;"
   )
   public static class751 field10245 = new class751(9, 2);
   @OriginalMember(
      owner = "client!fj",
      name = "c",
      descriptor = "I"
   )
   public static int field10244;
   @OriginalMember(
      owner = "client!fj",
      name = "j",
      descriptor = "I"
   )
   public static int field10246;
   @OriginalMember(
      owner = "client!fj",
      name = "h",
      descriptor = "I"
   )
   public static int field10247;
   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "Ldaa;"
   )
   public static class12 field10238;
   @OriginalMember(
      owner = "client!fj",
      name = "g",
      descriptor = "Lat;"
   )
   private class396 field10240;
   @OriginalMember(
      owner = "client!fj",
      name = "d",
      descriptor = "Leaa;"
   )
   public static class526 field10241;

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(ZI)V",
      line = 6
   )
   public final void method90(boolean arg0, int arg1) {
      try {
         int var3 = -24 / ((arg1 - -91) / 35);
         if (arg0) {
            int var4 = ~class207.field2647 >= ~class189.field2365 ? class189.field2365 : class207.field2647;
            int var5 = ~class663.field9630 <= ~class411.field6305 ? class663.field9630 : class411.field6305;
            int var6 = this.field10240.method1971();
            int var7 = this.field10240.method1975();
            int var8 = 0;
            int var9 = var4;
            int var10 = var4 * var7 / var6;
            int var11 = (-var10 + var5) / 2;
            if (var10 > var5) {
               var10 = var5;
               var11 = 0;
               var9 = var5 * var6 / var7;
               var8 = (var4 - var9) / 2;
            }

            this.field10240.method3037(var8, var11, var9, var10);
         }

         ++field10246;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field10248[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(I)V",
      line = 46
   )
   public final void method165(int arg0) {
      try {
         if (arg0 != 25668) {
            field10239 = null;
         }

         ++field10247;
         this.field10240 = class256.method1940(this.field10243.field6809, this.field10237, arg0 + -25563);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10248[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "()V",
      line = 60
   )
   public static final void method4968() {
      while(true) {
         boolean var0 = true;

         for(int var1 = 0; var1 < class102.field1244.length; ++var1) {
            if (!class102.field1244[var1].method1733()) {
               synchronized(class102.field1244[var1]) {
                  class102.field1244[var1].notify();
               }

               var0 = false;
            } else {
               class231.field2939[var1] = class102.field1244[var1].method1729();
            }
         }

         if (var0) {
            class102.field1244[class102.field1244.length - 1].method1734();
            class226.method1709(1);

            while(true) {
               boolean var3 = true;

               for(int var4 = 0; var4 < class102.field1244.length - 1; ++var4) {
                  if (!class102.field1244[var4].method1733()) {
                     synchronized(class102.field1244[var4]) {
                        class102.field1244[var4].notify();
                     }

                     var3 = false;
                  }
               }

               if (var3) {
                  for(int var6 = 1; var6 < class102.field1244.length - 2; ++var6) {
                     class102.field1244[var6].method1734();
                  }

                  class226.method1709(2);

                  while(!class102.field1244[0].method1733()) {
                     synchronized(class102.field1244[0]) {
                        class102.field1244[0].notify();
                     }

                     try {
                        class89.method817(1L, 2535);
                     } catch (Exception var9) {
                     }
                  }

                  class102.field1244[0].method1734();
                  return;
               }

               try {
                  class89.method817(1L, 2535);
               } catch (Exception var12) {
               }
            }
         }

         try {
            class89.method817(1L, 2535);
         } catch (Exception var8) {
         }
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "(I)V",
      line = 154
   )
   public static void method4969(int arg0) {
      try {
         if (arg0 != 2852) {
            method4968();
         }

         field10241 = null;
         field10245 = null;
         field10238 = null;
         field10239 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10248[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(Z)Z",
      line = 177
   )
   public final boolean method168(boolean arg0) {
      try {
         ++field10244;
         if (arg0) {
            this.method90(false, -10);
         }

         return this.field10237.method3884((byte)-99, this.field10243.field6809);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10248[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "<init>",
      descriptor = "(Leaa;Lwg;)V",
      line = 187
   )
   public class682(class526 arg0, class448 arg1) {
      try {
         this.field10243 = arg1;
         this.field10237 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10248[4] + (arg0 != null ? field10248[3] : field10248[5]) + ',' + (arg1 != null ? field10248[3] : field10248[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 102);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4971(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 102;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
