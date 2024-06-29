import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class680 {
   @OriginalMember(
      owner = "client!il",
      name = "n",
      descriptor = "I"
   )
   private int field10142;
   @OriginalMember(
      owner = "client!il",
      name = "d",
      descriptor = "I"
   )
   private int field10141;
   @OriginalMember(
      owner = "client!il",
      name = "m",
      descriptor = "I"
   )
   private int field10138;
   @OriginalMember(
      owner = "client!il",
      name = "h",
      descriptor = "I"
   )
   private int field10139;
   @OriginalMember(
      owner = "client!il",
      name = "f",
      descriptor = "I"
   )
   public int field10143;
   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "I"
   )
   public int field10149;
   @OriginalMember(
      owner = "client!il",
      name = "k",
      descriptor = "I"
   )
   public int field10148;
   @OriginalMember(
      owner = "client!il",
      name = "g",
      descriptor = "I"
   )
   public int field10137;
   @OriginalMember(
      owner = "client!il",
      name = "c",
      descriptor = "I"
   )
   public int field10140;
   @OriginalMember(
      owner = "client!il",
      name = "i",
      descriptor = "I"
   )
   public int field10146;
   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10152 = new String[]{method5040(method5039("!C`\"\u0016")), method5040(method5039("!C`#\u0016")), method5040(method5039("!C`%\u0016")), method5040(method5039("3\u0001`OC")), method5040(method5039("&Z\"\r")), method5040(method5039("!C` \u0016")), method5040(method5039("!C`]W&F:_\u0016"))};
   @OriginalMember(
      owner = "client!il",
      name = "j",
      descriptor = "Ljava/lang/Object;"
   )
   public static volatile Object field10145 = null;
   @OriginalMember(
      owner = "client!il",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field10144 = new int[4];
   @OriginalMember(
      owner = "client!il",
      name = "o",
      descriptor = "I"
   )
   public static int field10136;
   @OriginalMember(
      owner = "client!il",
      name = "b",
      descriptor = "I"
   )
   public static int field10147;
   @OriginalMember(
      owner = "client!il",
      name = "e",
      descriptor = "I"
   )
   public static int field10150;
   @OriginalMember(
      owner = "client!il",
      name = "p",
      descriptor = "I"
   )
   public static int field10151;

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Lds;I)V"
   )
   public static final void method5035(class525 arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field10136;
         arg0.method2495(-24134);
         boolean var3 = false;
         class525 var4 = (class525)class681.field10158.method3688(true);
         boolean var10000;
         if (arg1 != 4) {
            field10147 = -32;
            if (var2) {
               var10000 = class31.method220(1000, var4.method4052(arg1 ^ 11108), arg0.method4052(arg1 ^ 11108));
            } else if (var4 == null) {
               var10000 = var3;
               if (!var2) {
                  if (!var3) {
                     class681.field10158.method3693(arg0, true);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = class31.method220(1000, var4.method4052(arg1 ^ 11108), arg0.method4052(arg1 ^ 11108));
            }
         } else if (var4 == null) {
            var10000 = var3;
            if (!var2) {
               if (!var3) {
                  class681.field10158.method3693(arg0, true);
                  return;
               }

               return;
            }
         } else {
            var10000 = class31.method220(1000, var4.method4052(arg1 ^ 11108), arg0.method4052(arg1 ^ 11108));
         }

         do {
            while(true) {
               if (var10000) {
                  var3 = true;
                  class324.method2652(var4, arg0, arg1 + -4);
                  if (!var2) {
                     var10000 = var3;
                     break;
                  }

                  var4 = (class525)class681.field10158.method3691(20);
               } else {
                  var4 = (class525)class681.field10158.method3691(20);
               }

               if (var4 == null) {
                  var10000 = var3;
                  if (!var2) {
                     if (!var3) {
                        class681.field10158.method3693(arg0, true);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = class31.method220(1000, var4.method4052(arg1 ^ 11108), arg0.method4052(arg1 ^ 11108));
               }
            }
         } while(var2);

         if (!var3) {
            class681.field10158.method3693(arg0, true);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10152[2] + (arg0 != null ? field10152[3] : field10152[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5036(boolean arg0) {
      try {
         if (arg0) {
            field10144 = null;
         }

         field10145 = null;
         field10144 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10152[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(IIIIIIIIIII)V"
   )
   public final void method5037(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      try {
         this.field10141 = arg3;
         this.field10138 = arg10;
         this.field10142 = arg6;
         ++field10151;
         this.field10139 = arg8 * arg8;
         this.field10146 = this.field10141 + arg7;
         this.field10137 = this.field10142 + arg1;
         if (arg9 < 44) {
            this.field10149 = 59;
         }

         this.field10148 = this.field10138 + arg5;
         this.field10143 = this.field10142 + arg4;
         this.field10149 = this.field10141 - -arg0;
         this.field10140 = this.field10138 + arg2;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10152[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "a",
      descriptor = "(ZIII)Z"
   )
   public final boolean method5038(boolean arg0, int arg1, int arg2, int arg3) {
      try {
         ++field10150;
         if (~arg2 <= ~this.field10149 && this.field10146 >= arg2) {
            if (this.field10143 <= arg3 && this.field10137 >= arg3) {
               if (~this.field10140 >= ~arg1 && arg1 <= this.field10148) {
                  if (arg0) {
                     method5035((class525)null, -12);
                  }

                  int var5 = -this.field10141 + arg2;
                  int var6 = -this.field10138 + arg1;
                  return var5 * var5 + var6 * var6 < this.field10139;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field10152[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "<init>",
      descriptor = "(IIIIIIIIII)V"
   )
   public class680(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         this.field10142 = arg1;
         this.field10141 = arg0;
         this.field10138 = arg2;
         this.field10139 = arg3 * arg3;
         this.field10143 = this.field10142 + arg6;
         this.field10149 = this.field10141 + arg4;
         this.field10148 = this.field10138 + arg9;
         this.field10137 = this.field10142 + arg7;
         this.field10140 = this.field10138 + arg8;
         this.field10146 = this.field10141 + arg5;
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field10152[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5039(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!il",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5040(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
