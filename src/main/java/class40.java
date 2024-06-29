import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class40 {
   @OriginalMember(
      owner = "client!bh",
      name = "d",
      descriptor = "Z"
   )
   private boolean field946 = true;
   @OriginalMember(
      owner = "client!bh",
      name = "h",
      descriptor = "I"
   )
   private int field952 = -1;
   @OriginalMember(
      owner = "client!bh",
      name = "o",
      descriptor = "I"
   )
   private int field942;
   @OriginalMember(
      owner = "client!bh",
      name = "k",
      descriptor = "I"
   )
   private int field950;
   @OriginalMember(
      owner = "client!bh",
      name = "n",
      descriptor = "I"
   )
   private int field940;
   @OriginalMember(
      owner = "client!bh",
      name = "b",
      descriptor = "I"
   )
   private int field951;
   @OriginalMember(
      owner = "client!bh",
      name = "j",
      descriptor = "[Lrr;"
   )
   private class378[] field955;
   @OriginalMember(
      owner = "client!bh",
      name = "c",
      descriptor = "[Lrr;"
   )
   private class378[] field944;
   @OriginalMember(
      owner = "client!bh",
      name = "e",
      descriptor = "Lrr;"
   )
   private class378 field948;
   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field957 = new String[]{method482(method481("LU9;b@Tc9#")), method482(method481("U\u00139)v")), method482(method481("@H{k")), method482(method481("LU9F#")), method482(method481("LU9D#")), method482(method481("LU9E#"))};
   @OriginalMember(
      owner = "client!bh",
      name = "q",
      descriptor = "F"
   )
   public static float field954;
   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "I"
   )
   private int field941;
   @OriginalMember(
      owner = "client!bh",
      name = "l",
      descriptor = "I"
   )
   public static int field943;
   @OriginalMember(
      owner = "client!bh",
      name = "p",
      descriptor = "I"
   )
   public static int field945;
   @OriginalMember(
      owner = "client!bh",
      name = "f",
      descriptor = "I"
   )
   private int field949;
   @OriginalMember(
      owner = "client!bh",
      name = "i",
      descriptor = "I"
   )
   public static int field953;
   @OriginalMember(
      owner = "client!bh",
      name = "m",
      descriptor = "I"
   )
   public static int field956;
   @OriginalMember(
      owner = "client!bh",
      name = "g",
      descriptor = "Ltd;"
   )
   private class476 field947;

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(IILha;)Z",
      line = 12
   )
   public final boolean method478(int arg0, int arg1, class65 arg2) {
      boolean var4 = client.field4564;

      try {
         ++field945;
         if (~this.field952 != ~arg0) {
            this.field952 = arg0;
            int var5 = class223.method1872(arg0, 969328545);
            if (var5 > 512) {
               var5 = 512;
            }

            if (~var5 >= -1) {
               var5 = 1;
            }

            if (this.field941 != var5) {
               this.field941 = var5;
               this.field947 = null;
            }

            if (this.field955 != null) {
               label98: {
                  this.field949 = 0;
                  int[] var6 = new int[this.field955.length];
                  int var7 = 0;
                  class40 var10000;
                  if (var4) {
                     var10000 = this;
                  } else if (~var7 <= ~this.field955.length) {
                     var10000 = this;
                     if (!var4) {
                        class234.method1924(this.field949 + -1, 0, var6, this.field944, 5944);
                        break label98;
                     }
                  } else {
                     var10000 = this;
                  }

                  while(true) {
                     class378 var8 = var10000.field955[var7];
                     if (var8.method2952(this.field940, this.field951, this.field942, this.field952)) {
                        var6[this.field949] = var8.field5624;
                        this.field944[this.field949++] = var8;
                     }

                     ++var7;
                     if (~var7 <= ~this.field955.length) {
                        var10000 = this;
                        if (!var4) {
                           class234.method1924(this.field949 + -1, 0, var6, this.field944, 5944);
                           break;
                        }
                     } else {
                        var10000 = this;
                     }
                  }
               }
            }

            this.field946 = true;
         }

         if (arg1 != -20184) {
            this.method479(-59);
         }

         boolean var9 = false;
         if (this.field946) {
            this.field946 = false;
            int var10 = this.field949 - 1;
            if (var4 || ~var10 <= -1) {
               do {
                  boolean var11 = this.field944[var10].method2956(arg2, this.field948);
                  var9 |= var11;
                  this.field946 |= !var11;
                  --var10;
               } while(~var10 <= -1);
            }
         }

         return var9;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field957[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field957[1] : field957[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(I)V",
      line = 95
   )
   public final void method479(int arg0) {
      boolean var2 = client.field4564;

      try {
         if (arg0 != 0) {
            this.field944 = null;
         }

         ++field943;
         if (this.field955 != null) {
            int var3 = 0;
            if (var2) {
               this.field955[var3].method2957();
               ++var3;
            }

            while(~var3 > ~this.field955.length) {
               this.field955[var3].method2957();
               ++var3;
            }
         }

         this.field947 = null;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field957[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "a",
      descriptor = "(IIIIIIIIILha;)V",
      line = 119
   )
   public final void method480(int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, class65 param10) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bh",
      name = "<init>",
      descriptor = "(I[Lrr;IIII)V",
      line = 200
   )
   public class40(int arg0, class378[] arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         this.field942 = arg5;
         this.field950 = arg0;
         this.field940 = arg3;
         this.field951 = arg4;
         this.field955 = arg1;
         if (arg1 != null) {
            this.field944 = new class378[arg1.length];
            this.field948 = ~arg2 > -1 ? null : arg1[arg2];
         } else {
            this.field944 = null;
            this.field948 = null;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field957[0] + arg0 + ',' + (arg1 != null ? field957[1] : field957[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method481(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method482(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
