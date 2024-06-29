import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class409 {
   @OriginalMember(
      owner = "client!bp",
      name = "n",
      descriptor = "I"
   )
   private int field5914 = -1;
   @OriginalMember(
      owner = "client!bp",
      name = "c",
      descriptor = "I"
   )
   private int field5910 = 0;
   @OriginalMember(
      owner = "client!bp",
      name = "i",
      descriptor = "Lll;"
   )
   private class387 field5921 = new class387();
   @OriginalMember(
      owner = "client!bp",
      name = "l",
      descriptor = "Z"
   )
   public boolean field5922 = false;
   @OriginalMember(
      owner = "client!bp",
      name = "h",
      descriptor = "I"
   )
   private int field5913;
   @OriginalMember(
      owner = "client!bp",
      name = "m",
      descriptor = "I"
   )
   private int field5916;
   @OriginalMember(
      owner = "client!bp",
      name = "k",
      descriptor = "[[I"
   )
   private int[][] field5918;
   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "[Lht;"
   )
   private class608[] field5912;
   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5923 = new String[]{method3081(method3080("\bV\u000bmV\u0004OQo\u0017")), method3081(method3080("\bV\u000b\u0013\u0017")), method3081(method3080("\bV\u000b\u0015\u0017")), method3081(method3080("\bV\u000b\u0012\u0017")), method3081(method3080(")GKqP\u0004J\\qM\u000fRW8Z\u001cC\u00050\u001f\fSI=\u001f\u0003KD6ZJED2W\u000f")), method3081(method3080("\bV\u000b\u0010\u0017"))};
   @OriginalMember(
      owner = "client!bp",
      name = "j",
      descriptor = "I"
   )
   public static int field5915 = 64;
   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "Loi;"
   )
   public static class80 field5909 = new class80(50);
   @OriginalMember(
      owner = "client!bp",
      name = "g",
      descriptor = "I"
   )
   public static int field5911;
   @OriginalMember(
      owner = "client!bp",
      name = "d",
      descriptor = "I"
   )
   public static int field5917;
   @OriginalMember(
      owner = "client!bp",
      name = "f",
      descriptor = "I"
   )
   public static int field5920;
   @OriginalMember(
      owner = "client!bp",
      name = "e",
      descriptor = "[[[J"
   )
   public static long[][][] field5919;

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(Z)V",
      line = 8
   )
   public final void method3076(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         ++field5917;
         int var3 = 0;
         if (var2) {
            this.field5918[var3] = null;
            ++var3;
         }

         while(true) {
            while(~this.field5913 < ~var3) {
               this.field5918[var3] = null;
               ++var3;
            }

            this.field5912 = null;
            if (!var2) {
               if (arg0) {
                  this.field5916 = 100;
               }

               this.field5918 = null;
               this.field5921.method2934(0);
               this.field5921 = null;
               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5923[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(I)V",
      line = 31
   )
   public static void method3077(int arg0) {
      try {
         field5909 = null;
         if (arg0 == -1) {
            field5919 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5923[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "b",
      descriptor = "(Z)[[I",
      line = 47
   )
   public final int[][] method3078(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0) {
            this.method3079(-118, -123);
         }

         ++field5920;
         if (~this.field5916 != ~this.field5913) {
            throw new RuntimeException(field5923[4]);
         } else {
            int var3 = 0;
            if (var2) {
               this.field5912[var3] = class234.field3268;
               ++var3;
            }

            while(true) {
               class409 var10000;
               if (var3 >= this.field5913) {
                  var10000 = this;
                  if (!var2) {
                     return this.field5918;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field5912[var3] = class234.field3268;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5923[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "a",
      descriptor = "(II)[I",
      line = 70
   )
   public final int[] method3079(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg0 != -14361) {
            this.field5914 = 38;
         }

         ++field5911;
         if (this.field5916 == this.field5913) {
            this.field5922 = this.field5912[arg1] == null;
            this.field5912[arg1] = class234.field3268;
            return this.field5918[arg1];
         } else if (this.field5913 == 1) {
            this.field5922 = ~this.field5914 != ~arg1;
            this.field5914 = arg1;
            return this.field5918[0];
         } else {
            class608 var4;
            label53: {
               var4 = this.field5912[arg1];
               if (var4 != null) {
                  this.field5922 = false;
                  if (!var3) {
                     break label53;
                  }
               }

               label39: {
                  this.field5922 = true;
                  if (~this.field5913 >= ~this.field5910) {
                     class608 var5 = (class608)this.field5921.method2936(false);
                     var4 = new class608(arg1, var5.field8913);
                     this.field5912[var5.field8916] = null;
                     var5.method3165(122);
                     if (!var3) {
                        break label39;
                     }
                  }

                  var4 = new class608(arg1, this.field5910);
                  ++this.field5910;
               }

               this.field5912[arg1] = var4;
            }

            this.field5921.method2932(-17488, var4);
            return this.field5918[var4.field8913];
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5923[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "<init>",
      descriptor = "(III)V",
      line = 160
   )
   public class409(int arg0, int arg1, int arg2) {
      try {
         this.field5913 = arg0;
         this.field5916 = arg1;
         this.field5918 = new int[this.field5913][arg2];
         this.field5912 = new class608[this.field5916];
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5923[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3080(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3081(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
