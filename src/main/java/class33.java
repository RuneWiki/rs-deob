import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class33 {
   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field488 = new String[]{method298(method297("|2\\7?9")), method298(method297("\u007f$Qu")), method298(method297("j\u007f\u00137\u0003")), method298(method297("|2\\7=9")), method298(method297("|2\\7<9")), method298(method297("|2\\7:9"))};
   @OriginalMember(
      owner = "client!mca",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field474 = false;
   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field477 = new int[]{32, 39, 44, 47};
   @OriginalMember(
      owner = "client!mca",
      name = "m",
      descriptor = "I"
   )
   public static int field473;
   @OriginalMember(
      owner = "client!mca",
      name = "b",
      descriptor = "I"
   )
   public int field475;
   @OriginalMember(
      owner = "client!mca",
      name = "i",
      descriptor = "I"
   )
   public int field476;
   @OriginalMember(
      owner = "client!mca",
      name = "g",
      descriptor = "I"
   )
   public static int field478;
   @OriginalMember(
      owner = "client!mca",
      name = "h",
      descriptor = "I"
   )
   public int field480;
   @OriginalMember(
      owner = "client!mca",
      name = "e",
      descriptor = "I"
   )
   public static int field481;
   @OriginalMember(
      owner = "client!mca",
      name = "n",
      descriptor = "I"
   )
   public int field482;
   @OriginalMember(
      owner = "client!mca",
      name = "d",
      descriptor = "I"
   )
   public int field484;
   @OriginalMember(
      owner = "client!mca",
      name = "k",
      descriptor = "I"
   )
   public int field485;
   @OriginalMember(
      owner = "client!mca",
      name = "j",
      descriptor = "I"
   )
   public static int field486;
   @OriginalMember(
      owner = "client!mca",
      name = "l",
      descriptor = "I"
   )
   public int field487;
   @OriginalMember(
      owner = "client!mca",
      name = "c",
      descriptor = "[B"
   )
   public byte[] field479;
   @OriginalMember(
      owner = "client!mca",
      name = "f",
      descriptor = "[B"
   )
   public byte[] field483;

   @OriginalMember(
      owner = "client!mca",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method293(int arg0) {
      try {
         if (class354.method2645(1)) {
            if (class65.field793 == null) {
               class510.method3702(true);
            }

            class715.field10401 = 0;
            class95.field1227 = true;
         }

         ++field473;
         if (arg0 != 0) {
            method296(-27);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field488[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method294(int arg0) {
      boolean var1 = client.field4360;

      try {
         class743.method5384(class182.field2549, (byte)-58);
         ++field486;
         ++class590.field8699;
         if (arg0 > -57) {
            method295((byte)98, (String[])null, (short[])null);
         }

         if (class218.field3126 && class418.field6000) {
            int var2 = 0;
            int var3 = 0;
            if (class681.field10034) {
               var2 = class85.method755((byte)-96);
               var3 = class592.method4305((byte)80);
            }

            int var4 = var2 + class611.field8968.method1660(false);
            int var5 = class611.field8968.method1659((byte)-102) - -var3;
            int var6 = var4 - class252.field3439;
            int var7 = var5 - class741.field10809;
            if (var6 < class286.field3958) {
               var6 = class286.field3958;
            }

            if (class286.field3958 + class368.field5038.field9904 < class182.field2549.field9904 + var6) {
               var6 = -class182.field2549.field9904 + class368.field5038.field9904 + class286.field3958;
            }

            if (~class283.field3921 < ~var7) {
               var7 = class283.field3921;
            }

            if (~(var7 - -class182.field2549.field9980) < ~(class283.field3921 + class368.field5038.field9980)) {
               var7 = class283.field3921 + class368.field5038.field9980 - class182.field2549.field9980;
            }

            int var8 = var6 - (class286.field3958 - class368.field5038.field9864);
            int var9 = -class283.field3921 + class368.field5038.field9991 + var7;
            if (class611.field8968.method2549(true)) {
               if (class182.field2549.field9906 < class590.field8699) {
                  int var10 = -class418.field6007 + var6;
                  int var11 = var7 - class605.field8880;
                  if (~class182.field2549.field9898 > ~var10 || var10 < -class182.field2549.field9898 || ~class182.field2549.field9898 > ~var11 || -class182.field2549.field9898 > var11) {
                     class73.field905 = true;
                  }
               }

               if (class182.field2549.field9822 != null && class73.field905) {
                  class421 var12 = new class421();
                  var12.field6020 = var8;
                  var12.field6018 = var9;
                  var12.field6014 = class182.field2549;
                  var12.field6010 = class182.field2549.field9822;
                  class200.method1583(var12);
                  return;
               }
            } else {
               label123: {
                  if (class73.field905) {
                     class763.method5535(-1);
                     if (class182.field2549.field9889 != null) {
                        class421 var13 = new class421();
                        var13.field6017 = class209.field2976;
                        var13.field6014 = class182.field2549;
                        var13.field6010 = class182.field2549.field9889;
                        var13.field6020 = var8;
                        var13.field6018 = var9;
                        class200.method1583(var13);
                     }

                     if (class209.field2976 == null || client.method2347(class182.field2549) == null) {
                        break label123;
                     }

                     class161.method1342(class182.field2549, false, class209.field2976);
                     if (!var1) {
                        break label123;
                     }
                  }

                  if ((class501.field7267 == 1 || class787.method5679(2000)) && ~class278.field3784 < -3) {
                     class110.method890(class418.field6007 + class252.field3439, class741.field10809 - -class605.field8880, 0);
                     if (!var1) {
                        break label123;
                     }
                  }

                  if (class687.method5017(1274)) {
                     class110.method890(class418.field6007 + class252.field3439, class741.field10809 + class605.field8880, 0);
                  }
               }

               class182.field2549 = null;
            }

         } else {
            if (~class590.field8699 < -2) {
               class182.field2549 = null;
            }

         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field488[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(B[Ljava/lang/String;[S)V"
   )
   public static final void method295(byte arg0, String[] arg1, short[] arg2) {
      try {
         class515.method3746(arg1.length + -1, (byte)36, arg2, 0, arg1);
         if (arg0 > -39) {
            method294(-106);
         }

         ++field481;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field488[0] + arg0 + ',' + (arg1 != null ? field488[2] : field488[1]) + ',' + (arg2 != null ? field488[2] : field488[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method296(int arg0) {
      try {
         if (arg0 != -1) {
            method293(-85);
         }

         field477 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field488[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method297(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method298(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
