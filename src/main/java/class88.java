import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class88 {
   @OriginalMember(
      owner = "client!fj",
      name = "b",
      descriptor = "Lsia;"
   )
   private class407 field1198 = new class407(64);
   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "Lww;"
   )
   private class339 field1201;
   @OriginalMember(
      owner = "client!fj",
      name = "h",
      descriptor = "Lww;"
   )
   private class339 field1195;
   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1203 = new String[]{method829(method828("G\u001f6Vz")), method829(method828("G\u001f6Wz")), method829(method828("G\u001f6Tz")), method829(method828("G\u001f6);O\u001cl+z")), method829(method828("O\u0000ty")), method829(method828("Z[6;/"))};
   @OriginalMember(
      owner = "client!fj",
      name = "c",
      descriptor = "Lsia;"
   )
   public static class407 field1196 = new class407(5);
   @OriginalMember(
      owner = "client!fj",
      name = "d",
      descriptor = "I"
   )
   public static int field1200 = 0;
   @OriginalMember(
      owner = "client!fj",
      name = "g",
      descriptor = "F"
   )
   public static float field1199;
   @OriginalMember(
      owner = "client!fj",
      name = "f",
      descriptor = "I"
   )
   public static int field1197;
   @OriginalMember(
      owner = "client!fj",
      name = "e",
      descriptor = "I"
   )
   public static int field1202;

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method825(int arg0) {
      try {
         field1196 = null;
         if (arg0 != 5) {
            field1199 = -0.111527935F;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1203[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(II)Lvs;"
   )
   public final class535 method826(int arg0, int arg1) {
      try {
         ++field1197;
         class535 var3 = (class535)this.field1198.method3192((long)arg1, (byte)-125);
         if (var3 != null) {
            return var3;
         } else {
            byte[] var4;
            label29: {
               if (arg1 < 32768) {
                  var4 = this.field1195.method2697(arg1, 0, false);
                  if (!client.field1481) {
                     break label29;
                  }
               }

               var4 = this.field1201.method2697(32767 & arg1, 0, false);
            }

            if (arg0 != 20009) {
               return null;
            } else {
               class535 var5 = new class535();
               if (var4 != null) {
                  var5.method4067(0, new class66(var4));
               }

               if (~arg1 <= -32769) {
                  var5.method4063(false);
               }

               this.field1198.method3190(var5, (long)arg1, 8);
               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1203[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "<init>",
      descriptor = "(ILww;Lww;)V"
   )
   public class88(int arg0, class339 arg1, class339 arg2) {
      try {
         this.field1201 = arg2;
         this.field1195 = arg1;
         if (this.field1195 != null) {
            this.field1195.method2691(0, 121);
         }

         if (this.field1201 != null) {
            this.field1201.method2691(0, 121);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1203[3] + arg0 + ',' + (arg1 != null ? field1203[5] : field1203[4]) + ',' + (arg2 != null ? field1203[5] : field1203[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method827(boolean arg0) {
      try {
         ++field1202;
         class704.field10289 = arg0;
         class406.method3178((byte)117);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1203[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method828(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method829(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
