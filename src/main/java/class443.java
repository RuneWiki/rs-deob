import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class443 extends class70 {
   @OriginalMember(
      owner = "client!ij",
      name = "x",
      descriptor = "[[S"
   )
   public short[][] field6749;
   @OriginalMember(
      owner = "client!ij",
      name = "A",
      descriptor = "D"
   )
   public double field6748;
   @OriginalMember(
      owner = "client!ij",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6753 = new String[]{method3355(method3354("!NXW$")), method3355(method3354("3\nX3q")), method3355(method3354("&Q\u001aq")), method3355(method3354("!NX!e&M\u0002#$")), method3355(method3354("!NXT$")), method3355(method3354("!NXV$")), method3355(method3354("!NXQ$")), method3355(method3354("!NXP$"))};
   @OriginalMember(
      owner = "client!ij",
      name = "D",
      descriptor = "Lsd;"
   )
   public static class101 field6747 = new class101(72, 3);
   @OriginalMember(
      owner = "client!ij",
      name = "B",
      descriptor = "I"
   )
   public static int field6746;
   @OriginalMember(
      owner = "client!ij",
      name = "C",
      descriptor = "I"
   )
   public static int field6750;
   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "I"
   )
   public static int field6751;
   @OriginalMember(
      owner = "client!ij",
      name = "y",
      descriptor = "I"
   )
   public static int field6752;

   @OriginalMember(
      owner = "client!ij",
      name = "b",
      descriptor = "(IC)Z"
   )
   public static final boolean method3349(int arg0, char arg1) {
      try {
         ++field6752;
         int var2 = -24 % ((-51 - arg0) / 49);
         return arg1 >= '0' && ~arg1 >= -58 || arg1 >= 'A' && arg1 <= 'Z' || ~arg1 <= -98 && arg1 <= 'z';
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6753[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "g",
      descriptor = "(I)J"
   )
   public final long method3350(int arg0) {
      try {
         ++field6746;
         if (arg0 != -20385) {
            method3352((byte)-4, true);
         }

         return (long)(this.field6749[0].length | this.field6749.length << 0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6753[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3351(int arg0) {
      try {
         field6747 = null;
         if (arg0 != 8) {
            method3349(-9, 'V');
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6753[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method3352(byte arg0, boolean arg1) {
      try {
         ++field6751;
         if (class623.field9082 == null) {
            class18.method126((byte)-100);
         }

         if (arg1) {
            class623.field9082.method3021((byte)126);
         }

         if (arg0 <= 66) {
            field6747 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6753[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "<init>",
      descriptor = "([[SD)V"
   )
   public class443(short[][] arg0, double arg1) {
      try {
         this.field6749 = arg0;
         this.field6748 = arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6753[3] + (arg0 != null ? field6753[1] : field6753[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "c",
      descriptor = "(III)V"
   )
   public static final void method3353(int arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         int var4;
         int var7;
         label114: {
            ++field6750;
            var4 = class173.field2160.method5532(class204.field2588.method1562((byte)-63, class728.field10827), -90);
            int var10000;
            if (class16.field194) {
               label106: {
                  class488 var5 = (class488)class744.field11034.method5158(0);
                  if (var3 != 0) {
                     var10000 = ~var5.field7211;
                  } else if (var5 == null) {
                     var7 = class554.field8214 * 16 + 21;
                     var4 += 8;
                     var10000 = class382.field5859;
                     if (var3 == 0) {
                        break label106;
                     }
                  } else {
                     var10000 = ~var5.field7211;
                  }

                  while(true) {
                     int var6;
                     if (var10000 != -2) {
                        var6 = class767.method5554((byte)108, var5);
                        if (var3 != 0) {
                           var6 = class570.method4226((class303)var5.field7218.field10622.field881, true);
                        }
                     } else {
                        var6 = class570.method4226((class303)var5.field7218.field10622.field881, true);
                     }

                     if (var6 > var4) {
                        var4 = var6;
                     }

                     var5 = (class488)class744.field11034.method5163((byte)111);
                     if (var5 == null) {
                        var7 = class554.field8214 * 16 + 21;
                        var4 += 8;
                        var10000 = class382.field5859;
                        if (var3 == 0) {
                           break;
                        }
                     } else {
                        var10000 = ~var5.field7211;
                     }
                  }
               }

               class386.field5907 = (var10000 == 0 ? 22 : 26) + class554.field8214 * 16;
               if (var3 == 0) {
                  break label114;
               }
            }

            class303 var8 = (class303)class459.field6947.method4071((byte)126);
            int var9;
            if (var3 != 0) {
               var9 = class570.method4226(var8, true);
               if (var9 > var4) {
                  var4 = var9;
               }

               var8 = (class303)class459.field6947.method4059((byte)122);
            }

            while(true) {
               if (var8 == null) {
                  var7 = class354.field5375 * 16 + 21;
                  var4 += 8;
                  var10000 = class382.field5859;
                  if (var3 == 0) {
                     class386.field5907 = (var10000 == 0 ? 22 : 26) + class354.field5375 * 16;
                     break;
                  }
               } else {
                  var10000 = class570.method4226(var8, true);
               }

               var9 = var10000;
               if (var9 > var4) {
                  var4 = var9;
               }

               var8 = (class303)class459.field6947.method4059((byte)122);
            }
         }

         if (arg2 != 22) {
            field6747 = null;
         }

         int var10 = -(var4 / 2) + arg1;
         if (~class207.field2647 > ~(var4 + var10)) {
            var10 = -var4 + class207.field2647;
         }

         if (~var10 > -1) {
            var10 = 0;
         }

         int var11 = arg0;
         if (~(arg0 - -var7) < ~class411.field6305) {
            var11 = -var7 + class411.field6305;
         }

         if (var11 < 0) {
            var11 = 0;
         }

         class319.field4561 = var10;
         class10.field147 = var11;
         class750.field11111 = true;
         class712.field10630 = var4;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6753[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3354(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3355(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
