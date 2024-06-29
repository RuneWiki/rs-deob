import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class258 implements class1 {
   @OriginalMember(
      owner = "client!ig",
      name = "h",
      descriptor = "Lsfa;"
   )
   private class726 field3503;
   @OriginalMember(
      owner = "client!ig",
      name = "j",
      descriptor = "I"
   )
   public int field3500;
   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "[I"
   )
   public int[] field3504;
   @OriginalMember(
      owner = "client!ig",
      name = "f",
      descriptor = "I"
   )
   public int field3494;
   @OriginalMember(
      owner = "client!ig",
      name = "g",
      descriptor = "Lwg;"
   )
   private class452 field3499;
   @OriginalMember(
      owner = "client!ig",
      name = "d",
      descriptor = "[F"
   )
   public float[] field3498;
   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3506 = new String[]{method1971(method1970("\u0013\u001da.Z")), method1971(method1970("\u0013\u001da,Z")), method1971(method1970("\u0014\u000f#\u0003")), method1971(method1970("\u0001TaA\u000f")), method1971(method1970("\u0013\u001daS\u001b\u0014\u0013;QZ")), method1971(method1970("\u0013\u001da-Z")), method1971(method1970("\u0013\u001da+Z")), method1971(method1970("\u0013\u001da*Z")), method1971(method1970("\u0013\u001da)Z"))};
   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "I"
   )
   public static int field3495;
   @OriginalMember(
      owner = "client!ig",
      name = "c",
      descriptor = "I"
   )
   public static int field3497;
   @OriginalMember(
      owner = "client!ig",
      name = "i",
      descriptor = "I"
   )
   public static int field3501;
   @OriginalMember(
      owner = "client!ig",
      name = "e",
      descriptor = "I"
   )
   public static int field3502;
   @OriginalMember(
      owner = "client!ig",
      name = "k",
      descriptor = "I"
   )
   public static int field3505;
   @OriginalMember(
      owner = "client!ig",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field3496;

   @OriginalMember(
      owner = "client!ig",
      name = "b",
      descriptor = "(IIIIIIZZ)V",
      line = 9
   )
   public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         class662.method4837(!arg7 ? null : this.field3498, arg1, arg2, this.field3504, arg3, this.field3503.field10593.field3197, arg0, !arg7 ? null : this.field3503.field10596, arg5, arg4, arg6 ? this.field3503.field10593.field3196 : null, 21871, this.field3500);
         ++field3497;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field3506[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(BLnu;Ljava/awt/Frame;)V",
      line = 21
   )
   public static final void method1966(byte arg0, class619 arg1, Frame arg2) {
      boolean var3 = client.field4360;

      try {
         label48:
         do {
            class296 var4 = arg1.method4501(arg2, 31302);
            if (var3) {
               class661.method4825(0, 10L);
            }

            while(true) {
               int var10000;
               if (var4.field4078 != 0) {
                  var10000 = var4.field4078;
                  if (!var3) {
                     if (var10000 == 1) {
                        break label48;
                     }

                     class661.method4825(0, 100L);
                     break;
                  }
               } else {
                  var10000 = 0;
               }

               class661.method4825(var10000, 10L);
            }
         } while(!var3);

         int var5 = -85 % ((-79 - arg0) / 45);
         ++field3501;
         arg2.setVisible(false);
         arg2.dispose();
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3506[1] + arg0 + ',' + (arg1 != null ? field3506[3] : field3506[2]) + ',' + (arg2 != null ? field3506[3] : field3506[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(B)V",
      line = 48
   )
   public static void method1967(byte arg0) {
      try {
         field3496 = null;
         if (arg0 > -121) {
            field3496 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3506[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(BLjava/util/Random;I)I",
      line = 59
   )
   public static final int method1968(byte arg0, Random arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field3505;
         if (~arg2 >= -1) {
            throw new IllegalArgumentException();
         } else if (class471.method3415(arg2, true)) {
            return (int)((long)arg2 * (4294967295L & (long)arg1.nextInt()) >> 32);
         } else if (arg0 > -13) {
            return 121;
         } else {
            int var4 = Integer.MIN_VALUE - (int)(4294967296L % (long)arg2);

            while(true) {
               int var5 = arg1.nextInt();

               while(var4 > var5) {
                  if (!var3) {
                     return class700.method5086(var5, (byte)-36, arg2);
                  }
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3506[7] + arg0 + ',' + (arg1 != null ? field3506[3] : field3506[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(IIIIIIZZ)V",
      line = 89
   )
   public final void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
      try {
         ++field3502;
         class662.method4837(!arg7 ? null : this.field3503.field10596, arg1, arg2, this.field3503.field10593.field3196, arg3, this.field3500, arg0, !arg7 ? null : this.field3498, arg5, arg4, arg6 ? this.field3504 : null, 21871, this.field3503.field10593.field3197);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field3506[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "a",
      descriptor = "(Z)V",
      line = 97
   )
   public static final void method1969(boolean arg0) {
      try {
         ++field3495;
         if (!arg0) {
            if (class2.field5 != null) {
               class2.field5.method567((byte)-126);
               class2.field5 = null;
               class327.field4466 = null;
            }
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3506[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "<init>",
      descriptor = "(Lsfa;Lbg;Lwg;)V",
      line = 116
   )
   public class258(class726 arg0, class492 arg1, class452 arg2) {
      boolean var4 = client.field4360;
      super();

      try {
         label59: {
            this.field3503 = arg0;
            if (arg1 instanceof class585) {
               class585 var5 = (class585)arg1;
               this.field3500 = var5.field1493;
               this.field3504 = var5.field8655;
               this.field3494 = var5.field1515;
               if (!var4) {
                  break label59;
               }
            }

            if (!(arg1 instanceof class54)) {
               throw new RuntimeException();
            }

            class54 var6 = (class54)arg1;
            this.field3500 = var6.field1493;
            this.field3494 = var6.field1515;
            this.field3504 = var6.field679;
            if (var4) {
               throw new RuntimeException();
            }
         }

         if (arg2 != null) {
            this.field3499 = arg2;
            if (this.field3499.field6401 == this.field3500 && ~this.field3499.field6399 == ~this.field3494) {
               this.field3498 = this.field3499.field6398;
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3506[4] + (arg0 != null ? field3506[3] : field3506[2]) + ',' + (arg1 != null ? field3506[3] : field3506[2]) + ',' + (arg2 != null ? field3506[3] : field3506[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ig",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1971(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
