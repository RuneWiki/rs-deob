import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class425 extends class261 implements class631 {
   @OriginalMember(
      owner = "client!wi",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6577 = new String[]{method3376(method3375("@:M)G")), method3376(method3375("Ua\u000fk")), method3376(method3375("L}MI\u0012")), method3376(method3375("L}MU\u0012")), method3376(method3375("L}MK\u0012")), method3376(method3375("L}MS\u0012")), method3376(method3375("L}MW\u0012")), method3376(method3375("L}MF{\u0013")), method3376(method3375("_r")), method3376(method3375("L}MR\u0012")), method3376(method3375("L}MV\u0012")), method3376(method3375("L}MQ\u0012")), method3376(method3375("L}MH\u0012")), method3376(method3375("L}MJ\u0012")), method3376(method3375("L}MN\u0012")), method3376(method3375("L}MP\u0012")), method3376(method3375("L}MT\u0012")), method3376(method3375("L}ML\u0012"))};
   @OriginalMember(
      owner = "client!wi",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field6565 = false;
   @OriginalMember(
      owner = "client!wi",
      name = "D",
      descriptor = "Lsn;"
   )
   public static class675 field6557 = new class675();
   @OriginalMember(
      owner = "client!wi",
      name = "L",
      descriptor = "Lsn;"
   )
   public static class675 field6570 = new class675();
   @OriginalMember(
      owner = "client!wi",
      name = "C",
      descriptor = "Luk;"
   )
   public static class498 field6573 = new class498(129, 2);
   @OriginalMember(
      owner = "client!wi",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field6574 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "[F"
   )
   public static float[] field6576 = new float[16];
   @OriginalMember(
      owner = "client!wi",
      name = "Q",
      descriptor = "I"
   )
   public static int field6575 = 0;
   @OriginalMember(
      owner = "client!wi",
      name = "I",
      descriptor = "B"
   )
   private byte field6564;
   @OriginalMember(
      owner = "client!wi",
      name = "N",
      descriptor = "I"
   )
   public static int field6553;
   @OriginalMember(
      owner = "client!wi",
      name = "O",
      descriptor = "I"
   )
   public static int field6554;
   @OriginalMember(
      owner = "client!wi",
      name = "v",
      descriptor = "I"
   )
   public static int field6555;
   @OriginalMember(
      owner = "client!wi",
      name = "P",
      descriptor = "I"
   )
   public static int field6556;
   @OriginalMember(
      owner = "client!wi",
      name = "J",
      descriptor = "I"
   )
   public static int field6558;
   @OriginalMember(
      owner = "client!wi",
      name = "A",
      descriptor = "I"
   )
   public static int field6559;
   @OriginalMember(
      owner = "client!wi",
      name = "x",
      descriptor = "I"
   )
   public static int field6560;
   @OriginalMember(
      owner = "client!wi",
      name = "w",
      descriptor = "I"
   )
   public static int field6561;
   @OriginalMember(
      owner = "client!wi",
      name = "K",
      descriptor = "I"
   )
   public static int field6562;
   @OriginalMember(
      owner = "client!wi",
      name = "B",
      descriptor = "I"
   )
   public static int field6563;
   @OriginalMember(
      owner = "client!wi",
      name = "H",
      descriptor = "I"
   )
   public static int field6566;
   @OriginalMember(
      owner = "client!wi",
      name = "S",
      descriptor = "I"
   )
   public static int field6567;
   @OriginalMember(
      owner = "client!wi",
      name = "R",
      descriptor = "I"
   )
   public static int field6569;
   @OriginalMember(
      owner = "client!wi",
      name = "F",
      descriptor = "I"
   )
   public static int field6571;
   @OriginalMember(
      owner = "client!wi",
      name = "E",
      descriptor = "Lrr;"
   )
   public static class678 field6568;
   @OriginalMember(
      owner = "client!wi",
      name = "M",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field6572;

   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "(II)V",
      line = 4
   )
   public static final void method3366(int arg0, int arg1) {
      try {
         ++field6569;
         class566 var2 = class146.method1321((long)arg1, 6, -1428737160);
         if (arg0 != 255) {
            field6576 = null;
         }

         var2.method4268(4);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6577[16] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(IZ)Ljava/lang/String;",
      line = 17
   )
   public static final String method3367(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            method3366(105, -13);
         }

         ++field6567;
         return (255 & arg0 >> 24) + "." + (255 & arg0 >> 16) + "." + ((65497 & arg0) >> 8) + "." + (arg0 & 255);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6577[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "e",
      descriptor = "(I)V",
      line = 33
   )
   public static void method3368(int arg0) {
      try {
         field6568 = null;
         field6576 = null;
         field6574 = null;
         field6570 = null;
         field6557 = null;
         field6572 = null;
         if (arg0 > -123) {
            method3368(-5);
         }

         field6573 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6577[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(ILc;[BBIIIZ)Lqk;",
      line = 52
   )
   public static final class419 method3369(int arg0, class652 arg1, byte[] arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7) {
      try {
         if (arg3 <= 43) {
            field6568 = null;
         }

         ++field6554;
         if (!arg1.field9652 && (!class140.method1285(arg0, -11925) || !class140.method1285(arg5, -11925))) {
            return !arg1.field9700 ? new class419(arg1, arg6, arg0, arg5, class510.method3964(arg0, (byte)98), class510.method3964(arg5, (byte)98), arg2, arg4) : new class419(arg1, 34037, arg6, arg0, arg5, arg7, arg2, arg4);
         } else {
            return new class419(arg1, 3553, arg6, arg0, arg5, arg7, arg2, arg4);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field6577[5] + arg0 + ',' + (arg1 != null ? field6577[0] : field6577[1]) + ',' + (arg2 != null ? field6577[0] : field6577[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "c",
      descriptor = "(I)V",
      line = 73
   )
   public static final void method3370(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(I)V",
      line = 130
   )
   public final void method1533(int arg0) {
      try {
         if (arg0 != 16966) {
            this.method1537(-87, 32, 93);
         }

         super.method1533(arg0);
         ++field6561;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6577[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(ZI)Ljaclib/memory/Buffer;",
      line = 141
   )
   public final Buffer method1535(boolean arg0, int arg1) {
      try {
         int var3 = -84 % ((43 - arg1) / 39);
         ++field6556;
         return super.method2264(super.field4280.field2727, arg0, 35001);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6577[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "e",
      descriptor = "(B)V",
      line = 152
   )
   public static final void method3371(byte arg0) {
      try {
         class67.field883 = -1;
         class35.field423 = null;
         class450.field6888 = null;
         class640.field9279 = null;
         class412.field6408 = null;
         class200.field3072 = -1;
         class595.field8748 = null;
         if (arg0 < 27) {
            method3370(113);
         }

         class276.field4410 = null;
         ++field6555;
         class662.field9929 = -1;
         class560.field8328 = -1;
         class691.field10264 = null;
         class609.field8867.method2090(0);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6577[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "d",
      descriptor = "(B)V",
      line = 174
   )
   public static final void method3372(byte arg0) {
      try {
         class12.field156 = 1;
         if (arg0 < 82) {
            method3372((byte)7);
         }

         class444.field6812 = -1;
         ++field6566;
         class37.field448 = class510.field7800;
         class766.method5600(class654.field9782, true, (byte)95, "", class654.field9782.equals(""));
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6577[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "f",
      descriptor = "(I)I",
      line = 188
   )
   public final int method3373(int arg0) {
      try {
         if (arg0 < 97) {
            return 76;
         } else {
            ++field6558;
            return this.field6564;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6577[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "(I)Z",
      line = 200
   )
   public final boolean method1534(int arg0) {
      try {
         int var2 = 43 % ((-81 - arg0) / 36);
         ++field6571;
         return super.method2270(127, super.field4280.field2727);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6577[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "d",
      descriptor = "(I)I",
      line = 213
   )
   public final int method1538(int arg0) {
      try {
         if (arg0 < 13) {
            method3374(7);
         }

         ++field6563;
         return super.method1538(76);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6577[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "g",
      descriptor = "(I)Lsd;",
      line = 224
   )
   public static final class387 method3374(int arg0) {
      try {
         ++field6562;
         if (arg0 != -9) {
            field6573 = null;
         }

         try {
            return new class279();
         } catch (Throwable var3) {
            try {
               return (class387)Class.forName(field6577[8]).newInstance();
            } catch (Throwable var2) {
               return new class267();
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6577[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(III)Z",
      line = 247
   )
   public final boolean method1537(int arg0, int arg1, int arg2) {
      try {
         ++field6553;
         if (arg2 != 22251) {
            return false;
         } else {
            this.field6564 = (byte)arg0;
            super.method2269(arg1, 32198);
            return true;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6577[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(Ljaclib/memory/Source;III)Z",
      line = 263
   )
   public final boolean method1536(Source arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6560;
         this.field6564 = (byte)arg3;
         super.method2271(arg2, -38, arg0);
         if (arg1 != 6701) {
            field6572 = null;
         }

         return true;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6577[2] + (arg0 != null ? field6577[0] : field6577[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "<init>",
      descriptor = "(Lcka;Z)V",
      line = 279
   )
   public class425(class174 arg0, boolean arg1) {
      super(arg0, 34962, arg1);
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3375(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3376(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
