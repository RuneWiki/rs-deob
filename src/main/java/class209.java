import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class209 extends class247 {
   @OriginalMember(
      owner = "client!bk",
      name = "j",
      descriptor = "I"
   )
   public int field2991;
   @OriginalMember(
      owner = "client!bk",
      name = "p",
      descriptor = "I"
   )
   private int field2986;
   @OriginalMember(
      owner = "client!bk",
      name = "l",
      descriptor = "I"
   )
   private int field2985;
   @OriginalMember(
      owner = "client!bk",
      name = "o",
      descriptor = "I"
   )
   public int field2977;
   @OriginalMember(
      owner = "client!bk",
      name = "k",
      descriptor = "I"
   )
   private int field2979;
   @OriginalMember(
      owner = "client!bk",
      name = "q",
      descriptor = "I"
   )
   private int field2973;
   @OriginalMember(
      owner = "client!bk",
      name = "u",
      descriptor = "I"
   )
   public int field2987;
   @OriginalMember(
      owner = "client!bk",
      name = "v",
      descriptor = "I"
   )
   private int field2974;
   @OriginalMember(
      owner = "client!bk",
      name = "m",
      descriptor = "I"
   )
   public int field2990;
   @OriginalMember(
      owner = "client!bk",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2992 = new String[]{method1811(method1810("*\u000fFHs")), method1811(method1810("*\u000fFMs")), method1811(method1810("*\u000fFNs")), method1811(method1810("*\u000fFIs")), method1811(method1810("*\u000fFOs")), method1811(method1810("3JF%&")), method1811(method1810("&\u0011\u0004g")), method1811(method1810("*\u000fFLs")), method1811(method1810("*\u000fFJs")), method1811(method1810("*\u000fF72&\r\u001c5s"))};
   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "[F"
   )
   public static float[] field2981 = new float[]{0.0F, -1.0F, 0.0F, 0.0F};
   @OriginalMember(
      owner = "client!bk",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field2980 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
   @OriginalMember(
      owner = "client!bk",
      name = "n",
      descriptor = "I"
   )
   public static int field2989 = 104;
   @OriginalMember(
      owner = "client!bk",
      name = "w",
      descriptor = "Ldb;"
   )
   public static class685 field2984 = new class685(4, 7);
   @OriginalMember(
      owner = "client!bk",
      name = "x",
      descriptor = "I"
   )
   public static int field2975;
   @OriginalMember(
      owner = "client!bk",
      name = "A",
      descriptor = "I"
   )
   public static int field2976;
   @OriginalMember(
      owner = "client!bk",
      name = "r",
      descriptor = "I"
   )
   public static int field2978;
   @OriginalMember(
      owner = "client!bk",
      name = "s",
      descriptor = "I"
   )
   public static int field2982;
   @OriginalMember(
      owner = "client!bk",
      name = "B",
      descriptor = "I"
   )
   public static int field2983;
   @OriginalMember(
      owner = "client!bk",
      name = "t",
      descriptor = "I"
   )
   public static int field2988;

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1803(int arg0) {
      try {
         field2980 = null;
         field2984 = null;
         field2981 = null;
         if (arg0 != 2) {
            field2981 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2992[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(III)Z"
   )
   public final boolean method1804(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 2) {
            this.field2974 = 112;
         }

         ++field2976;
         return ~this.field2986 >= ~arg1 && ~arg1 >= ~this.field2985 && ~this.field2979 >= ~arg0 && ~this.field2973 <= ~arg0;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2992[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(II[IZ)V"
   )
   public final void method1805(int arg0, int arg1, int[] arg2, boolean arg3) {
      try {
         ++field2983;
         if (!arg3) {
            field2984 = null;
         }

         arg2[1] = this.field2991 - (this.field2986 - arg1);
         arg2[2] = this.field2990 + arg0 - this.field2979;
         arg2[0] = 0;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2992[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2992[5] : field2992[6]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public final boolean method1806(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 <= 67) {
            return false;
         } else {
            ++field2978;
            return this.field2991 <= arg2 && ~this.field2987 <= ~arg2 && arg0 >= this.field2990 && ~this.field2977 <= ~arg0;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2992[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(ZZ)Z"
   )
   public static final boolean method1807(boolean arg0, boolean arg1) {
      try {
         if (arg1) {
            field2980 = null;
         }

         ++field2988;
         boolean var2 = class54.field794.method237();
         if (var2 != !arg0) {
            return true;
         } else {
            label37: {
               if (!arg0) {
                  class54.field794.method210();
                  if (!client.field10022) {
                     break label37;
                  }
               }

               if (!class54.field794.method205()) {
                  arg0 = false;
               }
            }

            if (arg0 == var2) {
               return false;
            } else {
               class476.field6870.method4707(!arg0 ? 0 : 1, false, class476.field6870.field9142);
               class737.method5332(0);
               return true;
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2992[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(III[I)V"
   )
   public final void method1808(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         if (arg0 > 76) {
            arg3[2] = arg1 - (-this.field2979 + this.field2990);
            arg3[1] = -this.field2991 + this.field2986 + arg2;
            arg3[0] = this.field2974;
            ++field2975;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2992[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2992[5] : field2992[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(IIIB)Z"
   )
   public final boolean method1809(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field2982;
         int var5 = -127 % ((-22 - arg3) / 43);
         return this.field2974 == arg0 && this.field2986 <= arg1 && ~arg1 >= ~this.field2985 && this.field2979 <= arg2 && ~arg2 >= ~this.field2973;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2992[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "<init>",
      descriptor = "(IIIIIIIII)V"
   )
   public class209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         this.field2991 = arg5;
         this.field2986 = arg1;
         this.field2985 = arg3;
         this.field2977 = arg8;
         this.field2979 = arg2;
         this.field2973 = arg4;
         this.field2987 = arg7;
         this.field2974 = arg0;
         this.field2990 = arg6;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field2992[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   static {
      new BitSet(65536);
   }

   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1810(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1811(char[] arg0) {
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
            var10005 = 100;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
