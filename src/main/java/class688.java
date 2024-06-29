import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class688 extends class70 {
   @OriginalMember(
      owner = "client!pe",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10128 = new String[]{method5032(method5031("P|\u0000eX")), method5032(method5031("P|\u0000oX")), method5032(method5031("NlBK")), method5032(method5031("P|\u0000`X")), method5032(method5031("[7\u0000\t\r")), method5032(method5031("P|\u0000bX")), method5032(method5031("P|\u0000hX")), method5032(method5031("P|\u0000dX"))};
   @OriginalMember(
      owner = "client!pe",
      name = "I",
      descriptor = "I"
   )
   public static int field10121 = 0;
   @OriginalMember(
      owner = "client!pe",
      name = "M",
      descriptor = "Lkb;"
   )
   public static class500 field10127 = null;
   @OriginalMember(
      owner = "client!pe",
      name = "J",
      descriptor = "I"
   )
   public static int field10122;
   @OriginalMember(
      owner = "client!pe",
      name = "N",
      descriptor = "I"
   )
   public static int field10123;
   @OriginalMember(
      owner = "client!pe",
      name = "L",
      descriptor = "I"
   )
   public static int field10124;
   @OriginalMember(
      owner = "client!pe",
      name = "O",
      descriptor = "I"
   )
   public static int field10125;
   @OriginalMember(
      owner = "client!pe",
      name = "K",
      descriptor = "I"
   )
   public static int field10126;

   @OriginalMember(
      owner = "client!pe",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method5027(int arg0) {
      try {
         field10127 = null;
         if (arg0 != 21152) {
            method5027(95);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10128[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "d",
      descriptor = "(III)Llka;"
   )
   public static final class403 method5028(int arg0, int arg1, int arg2) {
      class731 var3 = class548.field8080[arg0][arg1][arg2];
      return var3 != null && var3.field10649 != null ? var3.field10649 : null;
   }

   @OriginalMember(
      owner = "client!pe",
      name = "<init>",
      descriptor = "()V"
   )
   public class688() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         if (arg2 == 0) {
            super.field930 = ~arg1.method640(255) == -2;
         }

         if (arg0 <= -34) {
            ++field10123;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10128[7] + arg0 + ',' + (arg1 != null ? field10128[4] : field10128[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field10125;
         if (arg0 != -6752) {
            this.method550(-62, (class66)null, -117);
         }

         int[][] var4 = super.field926.method2860(0, arg1);
         if (super.field926.field5048) {
            int[][] var5 = this.method696(arg1, 0, 32767);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 || ~class262.field3328 < ~var12) {
               do {
                  var9[var12] = -var6[var12] + 4096;
                  var10[var12] = 4096 - var7[var12];
                  var11[var12] = 4096 - var8[var12];
                  ++var12;
               } while(~class262.field3328 < ~var12);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field10128[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(B)[Llia;"
   )
   public static final class633[] method5029(byte arg0) {
      try {
         if (arg0 >= -15) {
            method5027(15);
         }

         ++field10126;
         return new class633[]{class781.field11380, class625.field9242, class776.field11304, class267.field3376, class585.field8634, class588.field8670, class93.field1259};
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10128[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         if (arg0 != -63) {
            this.method550(-68, (class66)null, 65);
         }

         ++field10124;
         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int[] var5 = this.method690(119, 0, arg1);
            int var6 = 0;
            if (var3 || class262.field3328 > var6) {
               do {
                  var4[var6] = -var5[var6] + 4096;
                  ++var6;
               } while(class262.field3328 > var6);
            }
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10128[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "a",
      descriptor = "(ILoca;)Loca;"
   )
   public static final class642 method5030(int arg0, class642 arg1) {
      boolean var2 = client.field1481;

      try {
         ++field10122;
         if (~arg1.field9589 != 0) {
            return class82.method795(arg1.field9589, -26545);
         } else {
            int var3 = arg1.field9482 >>> 16;
            class173 var4 = new class173(class397.field5473);
            class710 var5 = (class710)var4.method1485(arg0);
            if (var2) {
               if (~var5.field10422 == ~var3) {
                  return class82.method795((int)var5.field9965, -26545);
               }

               var5 = (class710)var4.method1483((byte)-53);
            }

            while(true) {
               while(var5 != null) {
                  if (~var5.field10422 == ~var3) {
                     return class82.method795((int)var5.field9965, -26545);
                  }

                  var5 = (class710)var4.method1483((byte)-53);
               }

               if (!var2) {
                  return null;
               }

               var5 = (class710)var4.method1483((byte)-53);
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10128[3] + arg0 + ',' + (arg1 != null ? field10128[4] : field10128[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5031(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pe",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5032(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
