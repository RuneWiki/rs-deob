import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class511 {
   @OriginalMember(
      owner = "client!lda",
      name = "e",
      descriptor = "Ldw;"
   )
   private class748 field7500 = new class748(64);
   @OriginalMember(
      owner = "client!lda",
      name = "f",
      descriptor = "Leaa;"
   )
   private class526 field7502;
   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7508 = new String[]{method3804(method3803("Li}IL\b")), method3804(method3803("Li}I6Icu\u00134\b")), method3804(method3803("[#2Iw")), method3804(method3803("Nxp\u000b")), method3804(method3803("Li}II\b")), method3804(method3803("Li}IH\b")), method3804(method3803("Li}IN\b")), method3804(method3803("Li}IK\b")), method3804(method3803("Li}IO\b"))};
   @OriginalMember(
      owner = "client!lda",
      name = "b",
      descriptor = "I"
   )
   public static int field7501 = 0;
   @OriginalMember(
      owner = "client!lda",
      name = "i",
      descriptor = "I"
   )
   public static int field7499;
   @OriginalMember(
      owner = "client!lda",
      name = "h",
      descriptor = "I"
   )
   public static int field7503;
   @OriginalMember(
      owner = "client!lda",
      name = "g",
      descriptor = "I"
   )
   public static int field7504;
   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "I"
   )
   public static int field7505;
   @OriginalMember(
      owner = "client!lda",
      name = "c",
      descriptor = "I"
   )
   public static int field7506;
   @OriginalMember(
      owner = "client!lda",
      name = "d",
      descriptor = "I"
   )
   public static int field7507;

   @OriginalMember(
      owner = "client!lda",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3797(int arg0) {
      try {
         ++field7499;
         class748 var2 = this.field7500;
         synchronized(this.field7500) {
            this.field7500.method5451(arg0 ^ 12390);
            if (arg0 != -12320) {
               this.field7502 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7508[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3798(int arg0) {
      try {
         ++field7506;
         class459.field6944.method654((0.7F + (float)class261.field3566.field9457.method1008(119) * 0.1F) * class442.field6743);
         if (arg0 != -1019394622) {
            method3801(-82);
         }

         class459.field6944.method660(class155.field1969, class4.field76, class748.field11090, (float)(class412.field6315 << 2), (float)(class9.field138 << 2), (float)(class131.field1628 << 2));
         class459.field6944.method583(class55.field648);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7508[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(II)Lst;"
   )
   public final class457 method3799(int arg0, int arg1) {
      try {
         ++field7505;
         if (arg0 >= -120) {
            this.method3799(-34, 124);
         }

         class748 var3 = this.field7500;
         class457 var4;
         synchronized(this.field7500) {
            var4 = (class457)this.field7500.method5454((long)arg1, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field7502;
            byte[] var6;
            synchronized(this.field7502) {
               var6 = this.field7502.method3899(-49, arg1, 11);
            }

            class457 var7 = new class457();
            if (var6 != null) {
               var7.method3438(4, new class128(var6));
            }

            class748 var8 = this.field7500;
            synchronized(this.field7500) {
               this.field7500.method5455(-2049, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field7508[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3800(byte arg0) {
      try {
         if (arg0 != 102) {
            this.field7500 = null;
         }

         ++field7504;
         class748 var2 = this.field7500;
         synchronized(this.field7500) {
            this.field7500.method5445(697465426);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7508[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3801(int arg0) {
      int var1 = client.field4530;

      try {
         label39: {
            ++field7503;
            if (!class766.method5543((byte)-50, class672.field10112) && !class677.method4944(class672.field10112, 0)) {
               int var2 = class693.field10418.field6114[0] >> 3;
               int var3 = class693.field10418.field6116[0] >> 3;
               if (~var2 <= -1 && ~(class323.field4603 >> 3) < ~var2 && var3 >= 0 && ~var3 > ~(class178.field2197 >> 3)) {
                  class635.method4577(5000, var2, (byte)108, var3);
                  if (var1 == 0) {
                     break label39;
                  }
               }

               class635.method4577(0, class323.field4603 >> 4, (byte)110, class178.field2197 >> 4);
               if (var1 == 0) {
                  break label39;
               }
            }

            class635.method4577(5000, class731.field10844 >> 12, (byte)110, class232.field2947 >> 12);
         }

         class684.method4974(1);
         method3798(arg0 ^ -1116183967);
         class681.method4961(false);
         class416.method3179(-17110);
         if (arg0 != 2118461347) {
            field7501 = 10;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7508[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3802(int arg0, byte arg1) {
      try {
         class748 var3 = this.field7500;
         synchronized(this.field7500) {
            this.field7500.method5453(arg0, false);
         }

         ++field7507;
         if (arg1 >= -117) {
            field7501 = 65;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7508[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;)V"
   )
   public class511(class24 arg0, int arg1, class526 arg2) {
      try {
         this.field7502 = arg2;
         if (this.field7502 != null) {
            this.field7502.method3875(0, 11);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7508[1] + (arg0 != null ? field7508[2] : field7508[3]) + ',' + arg1 + ',' + (arg2 != null ? field7508[2] : field7508[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3803(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3804(char[] arg0) {
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
            var10005 = 13;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
