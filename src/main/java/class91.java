import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class91 implements class110 {
   @OriginalMember(
      owner = "client!iga",
      name = "p",
      descriptor = "I"
   )
   public int field1226;
   @OriginalMember(
      owner = "client!iga",
      name = "e",
      descriptor = "Lbu;"
   )
   public class596 field1232;
   @OriginalMember(
      owner = "client!iga",
      name = "o",
      descriptor = "I"
   )
   public int field1225;
   @OriginalMember(
      owner = "client!iga",
      name = "c",
      descriptor = "I"
   )
   public int field1245;
   @OriginalMember(
      owner = "client!iga",
      name = "t",
      descriptor = "I"
   )
   public int field1241;
   @OriginalMember(
      owner = "client!iga",
      name = "i",
      descriptor = "Liba;"
   )
   public class237 field1240;
   @OriginalMember(
      owner = "client!iga",
      name = "f",
      descriptor = "I"
   )
   public int field1235;
   @OriginalMember(
      owner = "client!iga",
      name = "u",
      descriptor = "I"
   )
   public int field1230;
   @OriginalMember(
      owner = "client!iga",
      name = "w",
      descriptor = "Ljava/lang/String;"
   )
   public String field1224;
   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "I"
   )
   public int field1239;
   @OriginalMember(
      owner = "client!iga",
      name = "l",
      descriptor = "I"
   )
   public int field1243;
   @OriginalMember(
      owner = "client!iga",
      name = "r",
      descriptor = "I"
   )
   public int field1237;
   @OriginalMember(
      owner = "client!iga",
      name = "g",
      descriptor = "I"
   )
   public int field1227;
   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1246 = new String[]{method848(method847("gzOM")), method848(method847("r!\r\u000f{")), method848(method847("`hB\u000fE!")), method848(method847("`hB\u000f:`aJU8!")), method848(method847("`hB\u000fB!")), method848(method847("`hB\u000fC!")), method848(method847("`hB\u000fD!")), method848(method847("`hB\u000fG!"))};
   @OriginalMember(
      owner = "client!iga",
      name = "n",
      descriptor = "[I"
   )
   public static int[] field1234 = new int[1];
   @OriginalMember(
      owner = "client!iga",
      name = "s",
      descriptor = "I"
   )
   public static int field1223 = -50;
   @OriginalMember(
      owner = "client!iga",
      name = "b",
      descriptor = "[Lor;"
   )
   public static class450[] field1231 = new class450[2048];
   @OriginalMember(
      owner = "client!iga",
      name = "k",
      descriptor = "[Lrfa;"
   )
   public static class553[] field1238 = null;
   @OriginalMember(
      owner = "client!iga",
      name = "m",
      descriptor = "I"
   )
   public static int field1228;
   @OriginalMember(
      owner = "client!iga",
      name = "h",
      descriptor = "I"
   )
   public static int field1229;
   @OriginalMember(
      owner = "client!iga",
      name = "j",
      descriptor = "I"
   )
   public static int field1233;
   @OriginalMember(
      owner = "client!iga",
      name = "q",
      descriptor = "I"
   )
   public static int field1236;
   @OriginalMember(
      owner = "client!iga",
      name = "d",
      descriptor = "I"
   )
   public static int field1242;
   @OriginalMember(
      owner = "client!iga",
      name = "v",
      descriptor = "I"
   )
   public static int field1244;

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public final class499 method842(byte arg0) {
      try {
         ++field1228;
         int var2 = 80 / ((arg0 - 4) / 37);
         return class447.field6053;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1246[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(Ljava/lang/String;I)I"
   )
   public static final int method843(String arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field1236;
         int var3 = 0;
         if (var2) {
            if (class271.field3473[var3].equalsIgnoreCase(arg0)) {
               return var3;
            }

            ++var3;
         }

         while(true) {
            while(~class271.field3473.length < ~var3) {
               if (class271.field3473[var3].equalsIgnoreCase(arg0)) {
                  return var3;
               }

               ++var3;
            }

            if (!var2) {
               if (arg1 >= -23) {
                  return 48;
               }

               return -1;
            }

            if (arg1 != 0) {
               return var3;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1246[4] + (arg0 != null ? field1246[1] : field1246[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method844(int arg0) {
      try {
         field1231 = null;
         field1234 = null;
         field1238 = null;
         if (arg0 <= 118) {
            method846((class479)null, (class339)null, 47);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1246[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(IIIZIIIFI)[[I"
   )
   public static final int[][] method845(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, float arg7, int arg8) {
      boolean var9 = client.field1481;

      try {
         ++field1233;
         int[][] var10 = new int[arg6][arg0];
         class210 var11 = new class210();
         var11.field2660 = arg2;
         var11.field2665 = arg8;
         if (arg1 != 10544) {
            method846((class479)null, (class339)null, 42);
         }

         var11.field2675 = (int)(arg7 * 4096.0F);
         var11.field2671 = arg3;
         var11.field2670 = arg4;
         var11.method552(-83);
         class670.method4888(arg1 ^ 10580, arg0, arg6);
         int var12 = 0;
         if (var9) {
            var11.method1728(true, var10[var12], var12);
            ++var12;
         }

         while(true) {
            while(~arg6 < ~var12) {
               var11.method1728(true, var10[var12], var12);
               ++var12;
            }

            if (!var9) {
               return var10;
            }

            ++var12;
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field1246[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "a",
      descriptor = "(Lha;Lww;I)V"
   )
   public static final void method846(class479 param0, class339 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iga",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Liba;Lbu;IIIIIIIIII)V"
   )
   public class91(String arg0, class237 arg1, class596 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         this.field1226 = arg3;
         this.field1232 = arg2;
         this.field1225 = arg7;
         this.field1245 = arg5;
         this.field1241 = arg6;
         this.field1240 = arg1;
         this.field1235 = arg12;
         this.field1230 = arg9;
         this.field1224 = arg0;
         this.field1239 = arg11;
         this.field1243 = arg4;
         this.field1237 = arg10;
         this.field1227 = arg8;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field1246[3] + (arg0 != null ? field1246[1] : field1246[0]) + ',' + (arg1 != null ? field1246[1] : field1246[0]) + ',' + (arg2 != null ? field1246[1] : field1246[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method847(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method848(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
