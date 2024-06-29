import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class520 extends class128 {
   @OriginalMember(
      owner = "client!iaa",
      name = "Sb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7577 = new String[]{method3842(method3841("OxO8 e1")), method3842(method3841("OxO8/e1")), method3842(method3841("OxO8#e1")), method3842(method3841("]7\u00008\u0019")), method3842(method3841("OxO8,e1")), method3842(method3841("HlBz")), method3842(method3841("OxO8&e1")), method3842(method3841("OxO8\"e1")), method3842(method3841("OxO8%e1")), method3842(method3841("OxO8'e1")), method3842(method3841("OxO83d1")), method3842(method3841("OxO8!e1")), method3842(method3841("OxO8.e1")), method3842(method3841("OxO8-e1"))};
   @OriginalMember(
      owner = "client!iaa",
      name = "Hb",
      descriptor = "Z"
   )
   public static boolean field7563 = false;
   @OriginalMember(
      owner = "client!iaa",
      name = "Fb",
      descriptor = "Lsd;"
   )
   public static class101 field7566 = new class101(80, 0);
   @OriginalMember(
      owner = "client!iaa",
      name = "Rb",
      descriptor = "I"
   )
   public static int field7562;
   @OriginalMember(
      owner = "client!iaa",
      name = "Pb",
      descriptor = "I"
   )
   public static int field7564;
   @OriginalMember(
      owner = "client!iaa",
      name = "Ob",
      descriptor = "I"
   )
   public static int field7565;
   @OriginalMember(
      owner = "client!iaa",
      name = "Gb",
      descriptor = "I"
   )
   public static int field7567;
   @OriginalMember(
      owner = "client!iaa",
      name = "Eb",
      descriptor = "I"
   )
   public static int field7568;
   @OriginalMember(
      owner = "client!iaa",
      name = "Qb",
      descriptor = "I"
   )
   public static int field7569;
   @OriginalMember(
      owner = "client!iaa",
      name = "F",
      descriptor = "I"
   )
   public static int field7570;
   @OriginalMember(
      owner = "client!iaa",
      name = "Ib",
      descriptor = "I"
   )
   public static int field7571;
   @OriginalMember(
      owner = "client!iaa",
      name = "Kb",
      descriptor = "I"
   )
   public static int field7572;
   @OriginalMember(
      owner = "client!iaa",
      name = "Jb",
      descriptor = "I"
   )
   public static int field7573;
   @OriginalMember(
      owner = "client!iaa",
      name = "Mb",
      descriptor = "I"
   )
   public static int field7575;
   @OriginalMember(
      owner = "client!iaa",
      name = "Nb",
      descriptor = "I"
   )
   private int field7576;
   @OriginalMember(
      owner = "client!iaa",
      name = "Lb",
      descriptor = "Lpe;"
   )
   private class634 field7574;

   @OriginalMember(
      owner = "client!iaa",
      name = "l",
      descriptor = "(II)I"
   )
   public final int method3829(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field7565;
         int var4 = this.field7576 >> 3;
         if (arg0 > -19) {
            return 64;
         } else {
            int var5 = -(7 & this.field7576) + 8;
            int var6 = 0;
            this.field7576 += arg1;
            if (var3 != 0) {
               var6 += (class774.field11324[var5] & super.field1552[var4++]) << arg1 - var5;
               arg1 -= var5;
               var5 = 8;
            }

            while(true) {
               while(var5 < arg1) {
                  var6 += (class774.field11324[var5] & super.field1552[var4++]) << arg1 - var5;
                  arg1 -= var5;
                  var5 = 8;
               }

               int var10000 = ~arg1;
               int var10001 = ~var5;
               if (var3 == 0) {
                  if (var10000 != var10001) {
                     var6 += super.field1552[var4] >> var5 - arg1 & class774.field11324[arg1];
                     if (var3 == 0) {
                        return var6;
                     }
                  }

                  var6 += super.field1552[var4] & class774.field11324[var5];
                  return var6;
               }

               arg1 = var10000 - var10001;
               var5 = 8;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7577[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "r",
      descriptor = "(B)I"
   )
   public final int method3830(byte arg0) {
      try {
         if (arg0 >= -27) {
            return -40;
         } else {
            ++field7573;
            int var2 = 255 & super.field1552[super.field1590++] + -this.field7574.method4568((byte)-14);
            return var2 < 128 ? var2 : (super.field1552[super.field1590++] + -this.field7574.method4568((byte)-14) & 255) + (var2 - 128 << 8);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7577[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "p",
      descriptor = "(B)V"
   )
   public static void method3831(byte arg0) {
      try {
         field7566 = null;
         if (arg0 <= 36) {
            method3833(false, (byte)-81);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7577[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(II[BB)V"
   )
   public final void method3832(int param1, int param2, byte[] param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(ZB)V"
   )
   public static final void method3833(boolean arg0, byte arg1) {
      try {
         class266.method2033(arg0, class198.field2452, class411.field6305, class207.field2647, -117);
         ++field7564;
         if (arg1 != -79) {
            field7566 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7577[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "m",
      descriptor = "(II)I"
   )
   public final int method3834(int arg0, int arg1) {
      try {
         if (arg1 != 8) {
            this.method3840((byte)61);
         }

         ++field7575;
         return arg0 * 8 + -this.field7576;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7577[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "t",
      descriptor = "(I)V"
   )
   public final void method3835(int arg0) {
      try {
         int var2 = -51 / ((arg0 - -40) / 39);
         this.field7576 = super.field1590 * 8;
         ++field7571;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7577[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "(ILpe;)V"
   )
   public final void method3836(int arg0, class634 arg1) {
      try {
         this.field7574 = arg1;
         if (arg0 != -1) {
            this.field7574 = null;
         }

         ++field7562;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7577[12] + arg0 + ',' + (arg1 != null ? field7577[3] : field7577[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "u",
      descriptor = "(I)Z"
   )
   public final boolean method3837(int arg0) {
      try {
         if (arg0 <= 114) {
            return true;
         } else {
            ++field7568;
            int var2 = super.field1552[super.field1590] - this.field7574.method4570(false) & 255;
            return var2 >= 128;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7577[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "k",
      descriptor = "(II)V"
   )
   public final void method3838(int arg0, int arg1) {
      try {
         ++field7569;
         if (arg0 == 23928) {
            super.field1552[super.field1590++] = (byte)(this.field7574.method4568((byte)-14) + arg1);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7577[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "a",
      descriptor = "([II)V"
   )
   public final void method3839(int[] arg0, int arg1) {
      try {
         if (arg1 == 255) {
            ++field7567;
            this.field7574 = new class634(arg0);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7577[4] + (arg0 != null ? field7577[3] : field7577[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class520(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "q",
      descriptor = "(B)V"
   )
   public final void method3840(byte arg0) {
      try {
         if (arg0 > -62) {
            this.method3836(29, (class634)null);
         }

         super.field1590 = (this.field7576 + 7) / 8;
         ++field7572;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7577[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3841(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3842(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
