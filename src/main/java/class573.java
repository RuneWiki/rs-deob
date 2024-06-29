import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class573 extends class302 {
   @OriginalMember(
      owner = "client!el",
      name = "J",
      descriptor = "I"
   )
   private int field8526 = 1;
   @OriginalMember(
      owner = "client!el",
      name = "M",
      descriptor = "I"
   )
   private int field8524 = 1;
   @OriginalMember(
      owner = "client!el",
      name = "S",
      descriptor = "I"
   )
   private int field8528 = 204;
   @OriginalMember(
      owner = "client!el",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8536 = new String[]{method4244(method4243("\u0001<7\u0010")), method4244(method4243("\n%u:D")), method4244(method4243("\u0014guR\u0011")), method4244(method4243("\n%u9D")), method4244(method4243("\n%u=D")), method4244(method4243("\n%u?D"))};
   @OriginalMember(
      owner = "client!el",
      name = "O",
      descriptor = "Lwia;"
   )
   public static class791 field8525 = new class791(8);
   @OriginalMember(
      owner = "client!el",
      name = "T",
      descriptor = "I"
   )
   public static int field8529 = 0;
   @OriginalMember(
      owner = "client!el",
      name = "K",
      descriptor = "Lsd;"
   )
   public static class101 field8530 = new class101(103, 10);
   @OriginalMember(
      owner = "client!el",
      name = "P",
      descriptor = "Lsd;"
   )
   public static class101 field8534 = new class101(68, 1);
   @OriginalMember(
      owner = "client!el",
      name = "H",
      descriptor = "I"
   )
   public static int field8527;
   @OriginalMember(
      owner = "client!el",
      name = "N",
      descriptor = "I"
   )
   public static int field8532;
   @OriginalMember(
      owner = "client!el",
      name = "L",
      descriptor = "I"
   )
   public static int field8533;
   @OriginalMember(
      owner = "client!el",
      name = "R",
      descriptor = "I"
   )
   public static int field8535;
   @OriginalMember(
      owner = "client!el",
      name = "Q",
      descriptor = "Lti;"
   )
   public static class464 field8531;

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label46: {
            label45: {
               label44: {
                  ++field8532;
                  if (~arg0 != -1) {
                     if (arg0 == 1) {
                        break label44;
                     }

                     if (~arg0 != -3) {
                        break label46;
                     }

                     if (var4 == 0) {
                        break label45;
                     }
                  }

                  this.field8526 = arg2.method1104(255);
                  if (var4 == 0) {
                     break label46;
                  }
               }

               this.field8524 = arg2.method1104(255);
               if (var4 == 0) {
                  break label46;
               }
            }

            this.field8528 = arg2.method1038((byte)-111);
         }

         if (arg1 != 0) {
            this.field8528 = -111;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8536[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8536[2] : field8536[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "c",
      descriptor = "(III)Z"
   )
   public static final boolean method4241(int arg0, int arg1, int arg2) {
      try {
         ++field8535;
         if (arg2 != 2048) {
            return true;
         } else {
            return ~(arg1 & 2048) != -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8536[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field8533;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (arg1 >= -37) {
            field8530 = null;
         }

         if (super.field4298.field6356) {
            int var5 = 0;
            if (var3 != 0 || var5 < class344.field5238) {
               do {
                  int var6 = class757.field11167[var5];
                  int var7 = class23.field241[arg0];
                  int var8 = this.field8526 * var6 >> 12;
                  int var9 = this.field8524 * var7 >> 12;
                  int var10 = var6 % (4096 / this.field8526) * this.field8526;
                  int var11 = var7 % (4096 / this.field8524) * this.field8524;
                  if (~this.field8528 < ~var11) {
                     var8 -= var9;
                     if (var3 != 0) {
                        var8 += 4;
                     }

                     while(var8 < 0) {
                        var8 += 4;
                     }

                     if (var3 != 0) {
                        var8 -= 4;
                     }

                     while(var8 > 3) {
                        var8 -= 4;
                     }

                     if (var8 != 1) {
                        var4[var5] = 0;
                        if (var3 == 0) {
                           ++var5;
                           continue;
                        }
                     }

                     if (~var10 > ~this.field8528) {
                        var4[var5] = 0;
                        if (var3 == 0) {
                           ++var5;
                           continue;
                        }
                     }
                  }

                  if (~var10 <= ~this.field8528) {
                     var4[var5] = 4096;
                     ++var5;
                  } else {
                     int var12 = var8 - var9;
                     if (var3 != 0) {
                        var12 += 4;
                     }

                     while(~var12 > -1) {
                        var12 += 4;
                     }

                     if (var3 != 0) {
                        var12 -= 4;
                     }

                     while(~var12 < -4) {
                        var12 -= 4;
                     }

                     if (~var12 < -1) {
                        var4[var5] = 0;
                        if (var3 != 0) {
                           var4[var5] = 4096;
                           ++var5;
                        } else {
                           ++var5;
                        }
                     } else {
                        var4[var5] = 4096;
                        ++var5;
                     }
                  }
               } while(var5 < class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field8536[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "<init>",
      descriptor = "()V"
   )
   public class573() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!el",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4242(int arg0) {
      try {
         field8525 = null;
         field8530 = null;
         if (arg0 == 4096) {
            field8534 = null;
            field8531 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8536[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4243(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4244(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
