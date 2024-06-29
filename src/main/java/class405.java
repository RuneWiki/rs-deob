import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class405 extends class70 {
   @OriginalMember(
      owner = "client!sb",
      name = "O",
      descriptor = "I"
   )
   private int field5552 = -1;
   @OriginalMember(
      owner = "client!sb",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5564 = new String[]{method3177(method3176("\u000f\u001d8\u0012p")), method3177(method3176("\u000f\u001d8\u0011p")), method3177(method3176("\u000f\u001d8\u001bp")), method3177(method3176("\u000f\u001d8\u0014p")), method3177(method3176("\u0012\nz?")), method3177(method3176("\u0007Q8}%")), method3177(method3176("\u000f\u001d8\u0010p")), method3177(method3176("\u000f\u001d8\u0001p")), method3177(method3176("\u000f\u001d8\u0017p"))};
   @OriginalMember(
      owner = "client!sb",
      name = "P",
      descriptor = "I"
   )
   public int field5554;
   @OriginalMember(
      owner = "client!sb",
      name = "K",
      descriptor = "I"
   )
   public static int field5555;
   @OriginalMember(
      owner = "client!sb",
      name = "M",
      descriptor = "I"
   )
   public static int field5556;
   @OriginalMember(
      owner = "client!sb",
      name = "R",
      descriptor = "I"
   )
   public int field5557;
   @OriginalMember(
      owner = "client!sb",
      name = "S",
      descriptor = "I"
   )
   public static int field5559;
   @OriginalMember(
      owner = "client!sb",
      name = "L",
      descriptor = "I"
   )
   public static int field5560;
   @OriginalMember(
      owner = "client!sb",
      name = "I",
      descriptor = "I"
   )
   public static int field5561;
   @OriginalMember(
      owner = "client!sb",
      name = "N",
      descriptor = "I"
   )
   public static int field5562;
   @OriginalMember(
      owner = "client!sb",
      name = "J",
      descriptor = "I"
   )
   public static int field5563;
   @OriginalMember(
      owner = "client!sb",
      name = "T",
      descriptor = "Lww;"
   )
   public static class339 field5558;
   @OriginalMember(
      owner = "client!sb",
      name = "Q",
      descriptor = "[I"
   )
   public int[] field5553;

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method689(boolean arg0) {
      try {
         ++field5555;
         if (arg0) {
            this.field5553 = null;
         }

         return this.field5552;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5564[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method3172(boolean arg0) {
      try {
         if (arg0) {
            field5558 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5564[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "i",
      descriptor = "(I)Z"
   )
   public final boolean method3173(int arg0) {
      try {
         ++field5559;
         if (this.field5553 != null) {
            return true;
         } else {
            if (arg0 != 0) {
               this.field5557 = 25;
            }

            if (~this.field5552 <= -1) {
               class65 var2 = class602.field8871 >= 0 ? class65.method589(class14.field258, class602.field8871, this.field5552) : class65.method577(class14.field258, this.field5552);
               var2.method586();
               this.field5553 = var2.method590();
               this.field5554 = var2.field820;
               this.field5557 = var2.field819;
               return true;
            } else {
               return false;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5564[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "d",
      descriptor = "(Z)[Liba;"
   )
   public static final class237[] method3174(boolean arg0) {
      try {
         if (!arg0) {
            field5556 = 89;
         }

         ++field5561;
         return new class237[]{class103.field1329, class381.field5300, class658.field9805};
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5564[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "<init>",
      descriptor = "()V"
   )
   public class405() {
      super(0, false);
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         ++field5562;
         if (arg2 == 0) {
            this.field5552 = arg1.method603(-2);
         }

         if (arg0 >= -34) {
            this.field5557 = -40;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5564[6] + arg0 + ',' + (arg1 != null ? field5564[5] : field5564[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "d",
      descriptor = "(III)V"
   )
   public static final void method3175(int arg0, int arg1, int arg2) {
      class731 var3 = class548.field8080[arg0][arg1][arg2];
      if (var3 != null) {
         class676.method4946(var3.field10655);
         class676.method4946(var3.field10651);
         if (var3.field10655 != null) {
            var3.field10655 = null;
         }

         if (var3.field10651 != null) {
            var3.field10651 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!sb",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method688(boolean arg0) {
      try {
         ++field5563;
         super.method688(arg0);
         this.field5553 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5564[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(II)[[I"
   )
   public int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field5560;
         int[][] var4 = super.field926.method2860(0, arg1);
         if (arg0 != -6752) {
            this.field5554 = 20;
         }

         if (super.field926.field5048 && this.method3173(arg0 ^ -6752)) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = (class99.field1313 != this.field5554 ? this.field5554 * arg1 / class99.field1313 : arg1) * this.field5557;
            if (~class262.field3328 != ~this.field5557) {
               int var9 = 0;
               if (var3 || var9 < class262.field3328) {
                  do {
                     int var10 = this.field5557 * var9 / class262.field3328;
                     int var11 = this.field5553[var8 - -var10];
                     var7[var9] = class109.method974(var11 << 4, 4080);
                     var6[var9] = class109.method974(var11 >> 4, 4080);
                     var5[var9] = class109.method974(16711680, var11) >> 12;
                     ++var9;
                  } while(var9 < class262.field3328);
               }

               if (!var3) {
                  return var4;
               }
            }

            int var12 = 0;
            if (var3 || ~var12 > ~class262.field3328) {
               do {
                  int var13 = this.field5553[var8++];
                  var7[var12] = class109.method974(4080, var13 << 4);
                  var6[var12] = class109.method974(4080, var13 >> 4);
                  var5[var12] = class109.method974(var13 >> 12, 4080);
                  ++var12;
               } while(~var12 > ~class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field5564[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3176(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3177(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
