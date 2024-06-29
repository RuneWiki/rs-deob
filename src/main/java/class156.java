import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class156 {
   @OriginalMember(
      owner = "client!qm",
      name = "h",
      descriptor = "Loi;"
   )
   private class80 field2216 = new class80(256);
   @OriginalMember(
      owner = "client!qm",
      name = "i",
      descriptor = "Lea;"
   )
   private class573 field2222;
   @OriginalMember(
      owner = "client!qm",
      name = "f",
      descriptor = "Ld;"
   )
   private class162 field2221;
   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2227 = new String[]{method1314(method1313("\u0002$f\u001fz")), method1314(method1313("\u0002$f\u001dz")), method1314(method1313("\u0002$f`;\u001d <bz")), method1314(method1313("\bgfr/")), method1314(method1313("\u001d<$0")), method1314(method1313("\u0002$f\u0018z")), method1314(method1313("\u0002$f\u001ez")), method1314(method1313("\u0002$f\u0019z"))};
   @OriginalMember(
      owner = "client!qm",
      name = "g",
      descriptor = "Lek;"
   )
   public static class536 field2220 = new class536(58, 8);
   @OriginalMember(
      owner = "client!qm",
      name = "b",
      descriptor = "[J"
   )
   public static long[] field2225 = new long[100];
   @OriginalMember(
      owner = "client!qm",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field2226 = new int[6];
   @OriginalMember(
      owner = "client!qm",
      name = "d",
      descriptor = "I"
   )
   public static int field2217;
   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "I"
   )
   public static int field2218;
   @OriginalMember(
      owner = "client!qm",
      name = "k",
      descriptor = "I"
   )
   public static int field2219;
   @OriginalMember(
      owner = "client!qm",
      name = "c",
      descriptor = "I"
   )
   public static int field2223;
   @OriginalMember(
      owner = "client!qm",
      name = "j",
      descriptor = "I"
   )
   public static int field2224;

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1308(byte arg0) {
      try {
         field2226 = null;
         field2225 = null;
         if (arg0 != -50) {
            method1311((byte)117, -82, -63, -98, -38, 9);
         }

         field2220 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2227[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1309(boolean arg0) {
      try {
         this.field2216.method731(0);
         ++field2219;
         if (arg0) {
            this.method1310((byte)-109, 15);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2227[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(BI)Lbha;"
   )
   public final class601 method1310(byte arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field2217;
         if (arg0 <= 6) {
            method1308((byte)-58);
         }

         Object var4 = this.field2216.method725(0, (long)arg1);
         if (var4 != null) {
            return (class601)var4;
         } else if (!this.field2221.method1353(arg1, (byte)127)) {
            return null;
         } else {
            class317 var5;
            class601 var8;
            label64: {
               var5 = this.field2221.method1354(arg1, (byte)-109);
               int var6 = !var5.field4318 ? this.field2222.field8338 : 64;
               if (var5.field4312 && this.field2222.method528()) {
                  float[] var7 = this.field2221.method1355(var6, 0.7F, var6, arg1, (byte)112, false);
                  var8 = new class601(this.field2222, 3553, 34842, var6, var6, ~var5.field4322 != -1, var7, 6408);
                  if (!var3) {
                     break label64;
                  }
               }

               int[] var9;
               label73: {
                  if (~var5.field4319 == -3 || !class369.method2754(-8, var5.field4308)) {
                     var9 = this.field2221.method1351(var6, 0.7F, false, arg1, 12356, var6);
                     if (!var3) {
                        break label73;
                     }
                  }

                  var9 = this.field2221.method1350(0.7F, arg1, var6, var6, (byte)101, true);
               }

               var8 = new class601(this.field2222, 3553, 6408, var6, var6, ~var5.field4322 != -1, var9, 0, 0, false);
            }

            var8.method4372(var5.field4309, var5.field4313, (byte)88);
            this.field2216.method723(0, (long)arg1, var8);
            return var8;
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field2227[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(BIIIII)V"
   )
   public static final void method1311(byte param0, int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1312(int arg0) {
      try {
         ++field2218;
         this.field2216.method726(5, 25324);
         if (arg0 != 58) {
            field2224 = 22;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2227[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "<init>",
      descriptor = "(Lea;Ld;)V"
   )
   public class156(class573 arg0, class162 arg1) {
      try {
         this.field2222 = arg0;
         this.field2221 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2227[2] + (arg0 != null ? field2227[3] : field2227[4]) + ',' + (arg1 != null ? field2227[3] : field2227[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1313(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1314(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
