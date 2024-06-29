import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class478 {
   @OriginalMember(
      owner = "client!gt",
      name = "i",
      descriptor = "S"
   )
   public short field6961;
   @OriginalMember(
      owner = "client!gt",
      name = "d",
      descriptor = "I"
   )
   public int field6965;
   @OriginalMember(
      owner = "client!gt",
      name = "n",
      descriptor = "I"
   )
   public int field6967;
   @OriginalMember(
      owner = "client!gt",
      name = "e",
      descriptor = "B"
   )
   public byte field6968;
   @OriginalMember(
      owner = "client!gt",
      name = "f",
      descriptor = "I"
   )
   public int field6969;
   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "I"
   )
   public int field6959;
   @OriginalMember(
      owner = "client!gt",
      name = "l",
      descriptor = "I"
   )
   public int field6962;
   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "Z"
   )
   public boolean field6966;
   @OriginalMember(
      owner = "client!gt",
      name = "h",
      descriptor = "S"
   )
   public short field6972;
   @OriginalMember(
      owner = "client!gt",
      name = "o",
      descriptor = "S"
   )
   public short field6973;
   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6974 = new String[]{method3621(method3620("t m\u0013N}=7\u0011\u000f")), method3621(method3620("t ml\u000f")), method3621(method3620("t mm\u000f")), method3621(method3620("}!/C")), method3621(method3620("hzm\u0001Z")), method3621(method3620("t mn\u000f"))};
   @OriginalMember(
      owner = "client!gt",
      name = "g",
      descriptor = "I"
   )
   public static int field6963 = 0;
   @OriginalMember(
      owner = "client!gt",
      name = "k",
      descriptor = "[Lhia;"
   )
   public static class72[] field6964 = new class72[37];
   @OriginalMember(
      owner = "client!gt",
      name = "j",
      descriptor = "I"
   )
   public static int field6960;
   @OriginalMember(
      owner = "client!gt",
      name = "c",
      descriptor = "I"
   )
   public static int field6971;
   @OriginalMember(
      owner = "client!gt",
      name = "m",
      descriptor = "J"
   )
   public static long field6970;

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;"
   )
   public static final String method3617(String arg0, int arg1) {
      try {
         if (arg1 < 42) {
            field6964 = null;
         }

         ++field6960;
         String var2 = class429.method3238(class35.method344(arg0, 24485), 0);
         if (var2 == null) {
            var2 = "";
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6974[5] + (arg0 != null ? field6974[4] : field6974[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3618(int arg0) {
      boolean var1 = client.field4564;

      try {
         if (class444.field6473 != null) {
            if (class262.field3734) {
               class135.method1283(21850);
            }

            class458.field6722.method1647(0);
            class488.method3692();
            class216.method1840(65460);
            class368.method2871((byte)123);
            class634.method4651(0);
            class26.method184(82);
            if (class360.field5396 != null) {
               class360.field5396.method479(0);
            }

            class649.method4759(-1);
            class377.method2948((byte)-102);
            class454.method3416(78);
            class206.method1754(false);
            class104.method991(4440, false);
            int var2 = 0;
            if (var1 || var2 < 2048) {
               do {
                  class457 var3 = class458.field6723[var2];
                  if (var3 == null) {
                     ++var2;
                  } else {
                     int var4 = 0;
                     if (var1) {
                        var3.field11320[var4] = null;
                        ++var4;
                     }

                     while(~var3.field11320.length < ~var4) {
                        var3.field11320[var4] = null;
                        ++var4;
                     }

                     ++var2;
                  }
               } while(var2 < 2048);
            }

            int var5 = 0;
            if (var1 || ~var5 > ~class492.field7163) {
               do {
                  class451 var6 = class334.field4782[var5].field3851;
                  if (var6 == null) {
                     ++var5;
                  } else {
                     int var7 = 0;
                     if (var1) {
                        var6.field11320[var7] = null;
                        ++var7;
                     }

                     while(var7 < var6.field11320.length) {
                        var6.field11320[var7] = null;
                        ++var7;
                     }

                     ++var5;
                  }
               } while(~var5 > ~class492.field7163);
            }

            class252.field3603 = null;
            class734.field10566 = null;
            class444.field6473.method697(true);
            class444.field6473 = null;
         }

         ++field6971;
         if (arg0 >= -71) {
            method3617((String)null, 122);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field6974[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3619(int arg0) {
      try {
         if (arg0 > -3) {
            method3617((String)null, -123);
         }

         field6964 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6974[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field6961 = (short)arg6;
         this.field6965 = arg0;
         this.field6967 = arg1;
         this.field6968 = (byte)arg8;
         this.field6969 = arg11;
         this.field6959 = arg2;
         this.field6962 = arg3;
         this.field6966 = arg10;
         this.field6972 = (short)arg4;
         this.field6973 = (short)arg5;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field6974[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3620(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3621(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
