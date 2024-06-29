import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class117 extends class382 {
   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1850 = new String[]{method1144(method1143("\u0012Aw\u0010i")), method1144(method1143("\u0012Aw\u0013i")), method1144(method1143("U\u0018i")), method1144(method1143("VZhg")), method1144(method1143("U\u001ej")), method1144(method1143("VId")), method1144(method1143("VYd")), method1144(method1143("U\u001eo")), method1144(method1143("\u0013@0?/\u0004I+(.\u0002\u0002.)~\u0013\u0011")), method1144(method1143("U\u001f8")), method1144(method1143("VZkg")), method1144(method1143("PPy")), method1144(method1143("\u0012Aw\u001di")), method1144(method1143("\u0012Aw\u0012i")), method1144(method1143("\u0012Aw\u0011i"))};
   @OriginalMember(
      owner = "client!bm",
      name = "h",
      descriptor = "I"
   )
   public static int field1844 = -1;
   @OriginalMember(
      owner = "client!bm",
      name = "j",
      descriptor = "Lgq;"
   )
   public static class200 field1846 = new class200();
   @OriginalMember(
      owner = "client!bm",
      name = "e",
      descriptor = "I"
   )
   public static int field1842;
   @OriginalMember(
      owner = "client!bm",
      name = "f",
      descriptor = "I"
   )
   public static int field1843;
   @OriginalMember(
      owner = "client!bm",
      name = "k",
      descriptor = "I"
   )
   public static int field1845;
   @OriginalMember(
      owner = "client!bm",
      name = "i",
      descriptor = "I"
   )
   public static int field1847;
   @OriginalMember(
      owner = "client!bm",
      name = "g",
      descriptor = "I"
   )
   public static int field1848;
   @OriginalMember(
      owner = "client!bm",
      name = "d",
      descriptor = "Lkaa;"
   )
   public static class158 field1849;

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1136(int arg0, int arg1) {
      try {
         ++field1848;
         class452 var2 = (class452)class704.field10127.method3101(-1, (long)arg0);
         if (arg1 != 40960) {
            field1849 = null;
         }

         if (var2 != null) {
            var2.field6590.method4111(69);
            class456.method3533(71, var2.field6586, var2.field6587);
            var2.method2140((byte)-82);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1850[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1137(byte arg0) {
      try {
         int var1 = 64 / ((84 - arg0) / 40);
         field1849 = null;
         field1846 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1850[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V"
   )
   public static final void method1138(int arg0, String arg1, Throwable arg2) {
      boolean var3 = client.field10022;
      ++field1843;

      try {
         String var4 = "";
         if (arg2 != null) {
            var4 = class391.method3035(-33, arg2);
         }

         if (arg1 != null) {
            if (arg2 != null) {
               var4 = var4 + field1850[11];
            }

            var4 = var4 + arg1;
         }

         class570.method4226((byte)-77, var4);
         String var5 = class311.method2541(":", true, var4, field1850[9]);
         String var6 = class311.method2541("@", true, var5, field1850[2]);
         String var7 = class311.method2541("&", true, var6, field1850[7]);
         String var8 = class311.method2541("#", true, var7, field1850[4]);
         if (class6.field91 != null) {
            class92 var9 = class578.field8153.method865(0, new URL(class6.field91.getCodeBase(), field1850[8] + class730.field10393 + field1850[6] + (class701.field10100 != null ? class701.field10100 : String.valueOf(class426.field6229)) + field1850[3] + class82.field1284 + field1850[10] + class82.field1266 + field1850[5] + var8));
            int var10 = -95 / ((arg0 - 31) / 45);
            if (var3) {
               class97.method968(32353, 1L);
            }

            while(true) {
               int var10000;
               if (var9.field1526 != 0) {
                  var10000 = ~var9.field1526;
                  if (!var3) {
                     if (var10000 == -2) {
                        DataInputStream var11 = (DataInputStream)var9.field1525;
                        var11.read();
                        var11.close();
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = 32353;
               }

               class97.method968(var10000, 1L);
            }
         }
      } catch (Exception var12) {
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1139(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bm",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method1140(byte arg0) {
      try {
         int var1 = -89 % ((71 - arg0) / 41);
         if (class135.field2188 != null) {
            class135.field2188.method181(true);
            class135.field2188 = null;
            class685.field9891 = null;
         }

         ++field1845;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1850[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method1141(int arg0, int arg1) {
      try {
         ++field1847;
         int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
         if (arg0 != 1125517004) {
            method1137((byte)27);
         }

         int var3 = arg1 * 6 + -61440;
         int var4 = 40960 - -(arg1 * var3 >> 12);
         return var2 * var4 >> 12;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1850[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(I)Lcfa;"
   )
   public abstract class763 method1142(int arg0);

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1143(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1144(char[] arg0) {
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
            var10005 = 44;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
