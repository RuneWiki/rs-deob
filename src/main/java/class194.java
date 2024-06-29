import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class194 extends class119 {
   @OriginalMember(
      owner = "client!qga",
      name = "o",
      descriptor = "I"
   )
   private int field2939;
   @OriginalMember(
      owner = "client!qga",
      name = "n",
      descriptor = "Lrk;"
   )
   private class35 field2935;
   @OriginalMember(
      owner = "client!qga",
      name = "p",
      descriptor = "I"
   )
   private int field2931;
   @OriginalMember(
      owner = "client!qga",
      name = "t",
      descriptor = "I"
   )
   private int field2942;
   @OriginalMember(
      owner = "client!qga",
      name = "u",
      descriptor = "I"
   )
   private int field2933;
   @OriginalMember(
      owner = "client!qga",
      name = "v",
      descriptor = "I"
   )
   private int field2934;
   @OriginalMember(
      owner = "client!qga",
      name = "q",
      descriptor = "I"
   )
   private int field2938;
   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2943 = new String[]{method1689(method1688("mTAg{4")), method1689(method1688("mTAg|4")), method1689(method1688("mTAg\u0006u]I=\u00044")), method1689(method1688("g\u001d\u000egG")), method1689(method1688("rFL%")), method1689(method1688("iU")), method1689(method1688("mTAg\u007f4"))};
   @OriginalMember(
      owner = "client!qga",
      name = "r",
      descriptor = "I"
   )
   public static int field2936;
   @OriginalMember(
      owner = "client!qga",
      name = "l",
      descriptor = "I"
   )
   public static int field2937;
   @OriginalMember(
      owner = "client!qga",
      name = "m",
      descriptor = "I"
   )
   public static int field2940;
   @OriginalMember(
      owner = "client!qga",
      name = "s",
      descriptor = "I"
   )
   public static int field2941;
   @OriginalMember(
      owner = "client!qga",
      name = "k",
      descriptor = "Lma;"
   )
   private class14 field2932;

   @OriginalMember(
      owner = "client!qga",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1686(int arg0) {
      try {
         class154.field2452 = "";
         class749.field10797 = 0L;
         ++field2941;
         if (arg0 != -20370) {
            field2936 = 121;
         }

         class733.field10535 = -1;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2943[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(I)Lma;"
   )
   public final class14 method1128(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field2940;
         if (arg0 != -24197) {
            this.field2931 = -89;
         }

         if (this.field2932 == null) {
            class160 var3;
            boolean var4;
            int var5;
            int var9;
            label88: {
               var3 = this.field2935.field1192;
               class530.field7716[4] = this.field2938;
               class530.field7716[2] = this.field2931;
               class530.field7716[0] = this.field2942;
               class530.field7716[3] = this.field2933;
               class530.field7716[5] = this.field2934;
               class530.field7716[1] = this.field2939;
               var4 = false;
               var5 = 0;
               int var6 = 0;
               if (var2) {
                  if (!var3.method1455(class530.field7716[var6], 9777)) {
                     return null;
                  }
               } else if (var6 >= 6) {
                  var9 = 0;
                  if (!var2) {
                     break label88;
                  }
               } else if (!var3.method1455(class530.field7716[var6], 9777)) {
                  return null;
               }

               while(true) {
                  class693 var7 = var3.method1456(arg0 + 15209, class530.field7716[var6]);
                  int var8 = var7.field10153 ? 64 : 128;
                  if (~var8 < ~var5) {
                     var5 = var8;
                  }

                  if (~var7.field10161 < -1) {
                     var4 = true;
                  }

                  ++var6;
                  if (var6 >= 6) {
                     var9 = 0;
                     if (!var2) {
                        break;
                     }
                  } else if (!var3.method1455(class530.field7716[var6], 9777)) {
                     return null;
                  }
               }
            }

            if (var2) {
               class150.field2406[var9] = var3.method1459(1.0F, false, var5, class530.field7716[var9], 121, var5);
               ++var9;
            }

            while(true) {
               while(~var9 > -7) {
                  class150.field2406[var9] = var3.method1459(1.0F, false, var5, class530.field7716[var9], 121, var5);
                  ++var9;
               }

               if (!var2) {
                  this.field2932 = new class14(this.field2935, 6407, var5, var4, class150.field2406);
                  break;
               }

               ++var9;
            }
         }

         return this.field2932;
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field2943[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "a",
      descriptor = "(ZI[B)Ljava/lang/Object;"
   )
   public static final Object method1687(boolean arg0, int arg1, byte[] arg2) {
      try {
         ++field2937;
         if (arg2 == null) {
            return null;
         } else {
            if (~arg2.length < arg1 && !class744.field10729) {
               try {
                  class277 var3 = (class277)Class.forName(field2943[5]).newInstance();
                  var3.method2173(10159, arg2);
                  return var3;
               } catch (Throwable var5) {
                  class744.field10729 = true;
               }
            }

            return !arg0 ? arg2 : class443.method3334(arg2, (byte)58);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2943[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2943[3] : field2943[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "<init>",
      descriptor = "(Lrk;IIIIII)V"
   )
   public class194(class35 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field2939 = arg2;
         this.field2935 = arg0;
         this.field2931 = arg3;
         this.field2942 = arg1;
         this.field2933 = arg4;
         this.field2934 = arg6;
         this.field2938 = arg5;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field2943[2] + (arg0 != null ? field2943[3] : field2943[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1688(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1689(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
