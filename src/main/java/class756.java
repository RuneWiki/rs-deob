import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class756 extends class22 {
   @OriginalMember(
      owner = "client!aca",
      name = "m",
      descriptor = "I"
   )
   public int field10977;
   @OriginalMember(
      owner = "client!aca",
      name = "n",
      descriptor = "I"
   )
   public int field10973;
   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10979 = new String[]{method5478(method5477("$5\u0017\n\"")), method5478(method5477(">xX\n\u001dw")), method5478(method5477("1nUH")), method5478(method5477(">xX\nc6uPPaw")), method5478(method5477(">xX\n\u001cw")), method5478(method5477(">xX\n\u001ew"))};
   @OriginalMember(
      owner = "client!aca",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field10971 = new int[2];
   @OriginalMember(
      owner = "client!aca",
      name = "o",
      descriptor = "F"
   )
   public static float field10975 = 0.0F;
   @OriginalMember(
      owner = "client!aca",
      name = "q",
      descriptor = "I"
   )
   public static int field10972;
   @OriginalMember(
      owner = "client!aca",
      name = "p",
      descriptor = "I"
   )
   public static int field10974;
   @OriginalMember(
      owner = "client!aca",
      name = "j",
      descriptor = "I"
   )
   public static int field10976;
   @OriginalMember(
      owner = "client!aca",
      name = "r",
      descriptor = "[Ltd;"
   )
   public static class476[] field10970;
   @OriginalMember(
      owner = "client!aca",
      name = "k",
      descriptor = "[[B"
   )
   public static byte[][] field10978;

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(BIIILha;II)V",
      line = 3
   )
   public static final void method5474(byte arg0, int arg1, int arg2, int arg3, class65 arg4, int arg5, int arg6) {
      boolean var7 = client.field4564;

      try {
         if ((class375.field5578 == null || class515.field7505 == null || class270.field3814 == null) && class392.field5782.method1335((byte)115, class432.field6253) && class392.field5782.method1335((byte)115, class497.field7275) && class392.field5782.method1335((byte)115, class657.field9594)) {
            class94 var8 = class94.method913(class392.field5782, class497.field7275, 0);
            class515.field7505 = arg4.method307(var8, true);
            var8.method918();
            class377.field5597 = arg4.method307(var8, true);
            class375.field5578 = arg4.method307(class94.method913(class392.field5782, class432.field6253, 0), true);
            class94 var9 = class94.method913(class392.field5782, class657.field9594, 0);
            class270.field3814 = arg4.method307(var9, true);
            var9.method918();
            class15.field288 = arg4.method307(var9, true);
         }

         ++field10972;
         if (class375.field5578 != null && class515.field7505 != null && class270.field3814 != null) {
            int var10 = (arg6 + -(2 * class270.field3814.method3002())) / class375.field5578.method3002();
            int var11 = 0;
            if (var7) {
               class375.field5578.method3609(class270.field3814.method3002() + arg5 + var11 * class375.field5578.method3002(), arg1 + arg3 + -class375.field5578.method3005());
               ++var11;
            }

            label90:
            while(true) {
               while(~var10 < ~var11) {
                  class375.field5578.method3609(class270.field3814.method3002() + arg5 + var11 * class375.field5578.method3002(), arg1 + arg3 + -class375.field5578.method3005());
                  ++var11;
               }

               int var12 = (-class270.field3814.method3005() + arg3 + -arg2) / class515.field7505.method3005();
               int var13 = 0;
               if (!var7) {
                  if (var7) {
                     class515.field7505.method3609(arg5, arg1 + (arg2 - -(class515.field7505.method3005() * var13)));
                     class377.field5597.method3609(-class377.field5597.method3002() + arg5 + arg6, arg1 - (-arg2 - class515.field7505.method3005() * var13));
                     ++var13;
                  }

                  while(true) {
                     while(~var12 < ~var13) {
                        class515.field7505.method3609(arg5, arg1 + (arg2 - -(class515.field7505.method3005() * var13)));
                        class377.field5597.method3609(-class377.field5597.method3002() + arg5 + arg6, arg1 - (-arg2 - class515.field7505.method3005() * var13));
                        ++var13;
                     }

                     class270.field3814.method3609(arg5, -class270.field3814.method3005() + arg3 + arg1);
                     class476 var10000 = class15.field288;
                     int var10001 = -class270.field3814.method3002() + arg6 + arg5;
                     int var10002 = arg3 + arg1 + -class270.field3814.method3005();
                     if (!var7) {
                        var10000.method3609(var10001, var10002);
                        break label90;
                     }

                     var10000.method3609(var10001, var10002);
                     ++var13;
                  }
               }

               ++var11;
            }
         }

         if (arg0 >= -94) {
            field10978 = null;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field10979[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10979[0] : field10979[2]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(B)V",
      line = 73
   )
   public static void method5475(byte arg0) {
      try {
         if (arg0 > -112) {
            method5476((byte)-116, -118);
         }

         field10978 = null;
         field10970 = null;
         field10971 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10979[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "b",
      descriptor = "(BI)Z",
      line = 85
   )
   public static final boolean method5476(byte arg0, int arg1) {
      try {
         if (arg0 != -63) {
            field10971 = null;
         }

         ++field10974;
         return (arg1 & -arg1) == arg1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10979[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "<init>",
      descriptor = "(II)V",
      line = 102
   )
   public class756(int arg0, int arg1) {
      try {
         this.field10977 = arg0;
         this.field10973 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10979[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
