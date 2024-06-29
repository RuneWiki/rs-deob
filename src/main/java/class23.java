import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 {
   @OriginalMember(
      owner = "client!qia",
      name = "j",
      descriptor = "Lsb;"
   )
   private class305 field356 = new class305();
   @OriginalMember(
      owner = "client!qia",
      name = "d",
      descriptor = "Lrw;"
   )
   private class788 field361 = new class788();
   @OriginalMember(
      owner = "client!qia",
      name = "b",
      descriptor = "I"
   )
   private int field360;
   @OriginalMember(
      owner = "client!qia",
      name = "g",
      descriptor = "I"
   )
   private int field362;
   @OriginalMember(
      owner = "client!qia",
      name = "e",
      descriptor = "Lld;"
   )
   private class178 field363;
   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field364 = new String[]{method167(method166("\u001dlS4=\u0005k[n?D")), method167(method166("\u001dlS4@D")), method167(method166("\u001dlS4GD")), method167(method166("\u001dlS4BD")), method167(method166("\u001dlS4DD")), method167(method166("\u001dlS4CD")), method167(method166("\u001dlS4ED")), method167(method166("\u0002p^v")), method167(method166("\u0017+\u001c4|"))};
   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "Lgw;"
   )
   public static class179 field355 = new class179(4);
   @OriginalMember(
      owner = "client!qia",
      name = "i",
      descriptor = "I"
   )
   public static int field353;
   @OriginalMember(
      owner = "client!qia",
      name = "k",
      descriptor = "I"
   )
   public static int field354;
   @OriginalMember(
      owner = "client!qia",
      name = "f",
      descriptor = "I"
   )
   public static int field357;
   @OriginalMember(
      owner = "client!qia",
      name = "h",
      descriptor = "I"
   )
   public static int field358;
   @OriginalMember(
      owner = "client!qia",
      name = "c",
      descriptor = "I"
   )
   public static int field359;

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method160(boolean arg0) {
      try {
         this.field361.method5675((byte)88);
         ++field357;
         if (!arg0) {
            this.method164(112L, (class305)null, (byte)104);
         }

         this.field363.method1570((byte)15);
         this.field356 = new class305();
         this.field362 = this.field360;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field364[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(JZ)V"
   )
   public final void method161(long arg0, boolean arg1) {
      try {
         ++field358;
         class305 var4 = (class305)this.field363.method1572(arg0, -16289);
         if (!arg1) {
            if (var4 != null) {
               var4.method154(12);
               var4.method2385(117);
               ++this.field362;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field364[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(JI)Lsb;"
   )
   public final class305 method162(long arg0, int arg1) {
      try {
         ++field359;
         if (arg1 < 100) {
            return null;
         } else {
            class305 var4 = (class305)this.field363.method1572(arg0, -16289);
            if (var4 != null) {
               this.field361.method5681(var4, (byte)-51);
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field364[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method163(int arg0) {
      try {
         ++field353;
         ++class415.field6077;
         class542 var1 = class549.method4093((byte)-113, class537.field7820, class126.field2108);
         var1.field7859.method3571(255, arg0);
         class740.method5332(var1, (byte)77);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field364[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(JLsb;B)V"
   )
   public final void method164(long arg0, class305 arg1, byte arg2) {
      try {
         label25: {
            ++field354;
            if (~this.field362 == -1) {
               class305 var5 = this.field361.method5679((byte)63);
               var5.method154(-118);
               var5.method2385(117);
               if (this.field356 != var5) {
                  break label25;
               }

               class305 var6 = this.field361.method5679((byte)98);
               var6.method154(81);
               var6.method2385(117);
               if (!client.field4564) {
                  break label25;
               }
            }

            --this.field362;
         }

         this.field363.method1566(arg1, 24742, arg0);
         int var7 = -88 % ((-42 - arg2) / 60);
         this.field361.method5681(arg1, (byte)-39);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field364[6] + arg0 + ',' + (arg1 != null ? field364[8] : field364[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method165(byte arg0) {
      try {
         if (arg0 != -101) {
            field355 = null;
         }

         field355 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field364[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class23(int arg0) {
      try {
         this.field360 = arg0;
         this.field362 = arg0;

         int var2;
         for(var2 = 1; ~arg0 < ~(var2 + var2); var2 += var2) {
         }

         this.field363 = new class178(var2);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field364[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method166(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method167(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
