import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class731 extends class686 {
   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10403 = new String[]{method5297(method5296("e02K")), method5297(method5296("pkp\t?")), method5297(method5296("|'?\t\u0003#")), method5297(method5296("|'?\t\u0000#"))};
   @OriginalMember(
      owner = "client!wba",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field10398 = new int[]{4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1};
   @OriginalMember(
      owner = "client!wba",
      name = "n",
      descriptor = "D"
   )
   public static double field10401;
   @OriginalMember(
      owner = "client!wba",
      name = "l",
      descriptor = "I"
   )
   public static int field10402;
   @OriginalMember(
      owner = "client!wba",
      name = "o",
      descriptor = "Ldea;"
   )
   public class471 field10399;
   @OriginalMember(
      owner = "client!wba",
      name = "p",
      descriptor = "Z"
   )
   public boolean field10400;
   @OriginalMember(
      owner = "client!wba",
      name = "q",
      descriptor = "[Lrh;"
   )
   public class213[] field10397;

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(BILha;I)Z"
   )
   public final boolean method5294(byte arg0, int arg1, class17 arg2, int arg3) {
      boolean var5 = client.field10022;

      try {
         ++field10402;
         int var6 = this.field10399.method2747(0);
         boolean var10000;
         int var7;
         if (this.field10397 != null) {
            var7 = 0;
            if (var5) {
               this.field10397[var7].field3052 <<= var6;
               var10000 = this.field10397[var7].method1844(arg1, arg3);
            } else if (~this.field10397.length >= ~var7) {
               var7 = 123 % ((arg0 - -41) / 63);
               var10000 = false;
               if (!var5) {
                  return false;
               }
            } else {
               this.field10397[var7].field3052 <<= var6;
               var10000 = this.field10397[var7].method1844(arg1, arg3);
            }
         } else {
            var7 = 123 % ((arg0 - -41) / 63);
            var10000 = false;
            if (!var5) {
               return false;
            }
         }

         while(!var10000 || !this.field10399.method718(arg1, arg3, 0, arg2)) {
            this.field10397[var7].field3052 >>= var6;
            ++var7;
            if (~this.field10397.length >= ~var7) {
               var7 = 123 % ((arg0 - -41) / 63);
               var10000 = false;
               if (!var5) {
                  return false;
               }
            } else {
               this.field10397[var7].field3052 <<= var6;
               var10000 = this.field10397[var7].method1844(arg1, arg3);
            }
         }

         this.field10397[var7].field3052 >>= var6;
         return true;
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field10403[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10403[1] : field10403[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5295(int arg0) {
      try {
         field10398 = null;
         if (arg0 != 4) {
            field10398 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10403[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5296(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5297(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
