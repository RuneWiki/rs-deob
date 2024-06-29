import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class632 extends class454 {
   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9326 = new String[]{method4667(method4666("G\u0016W\"M")), method4667(method4666("J\u0007\u0015\n")), method4667(method4666("_\\WH\u0018")), method4667(method4666("G\u0016W!M")), method4667(method4666("G\u0016W'M")), method4667(method4666("G\u0016W M")), method4667(method4666("G\u0016W.M")), method4667(method4666("G\u0016W%M")), method4667(method4666("G\u0016W$M")), method4667(method4666("G\u0016W#M"))};
   @OriginalMember(
      owner = "client!cd",
      name = "j",
      descriptor = "Z"
   )
   public static boolean field9320 = false;
   @OriginalMember(
      owner = "client!cd",
      name = "l",
      descriptor = "Laka;"
   )
   public static class418 field9323 = new class418(31, 4);
   @OriginalMember(
      owner = "client!cd",
      name = "o",
      descriptor = "Lrj;"
   )
   public static class782 field9325 = new class782();
   @OriginalMember(
      owner = "client!cd",
      name = "i",
      descriptor = "I"
   )
   public static int field9315;
   @OriginalMember(
      owner = "client!cd",
      name = "q",
      descriptor = "I"
   )
   public static int field9316;
   @OriginalMember(
      owner = "client!cd",
      name = "r",
      descriptor = "I"
   )
   public static int field9317;
   @OriginalMember(
      owner = "client!cd",
      name = "s",
      descriptor = "I"
   )
   public static int field9318;
   @OriginalMember(
      owner = "client!cd",
      name = "m",
      descriptor = "I"
   )
   public static int field9321;
   @OriginalMember(
      owner = "client!cd",
      name = "n",
      descriptor = "I"
   )
   public static int field9322;
   @OriginalMember(
      owner = "client!cd",
      name = "p",
      descriptor = "I"
   )
   public static int field9324;
   @OriginalMember(
      owner = "client!cd",
      name = "k",
      descriptor = "Lpd;"
   )
   public static class648 field9319;

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method4662(boolean arg0) {
      try {
         ++field9321;
         if (super.field6259.method5434((byte)-113)) {
            return false;
         } else if (super.field6259.method5439(28852) == class450.field6103) {
            return true;
         } else {
            return arg0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9326[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(Ljava/lang/String;II)V"
   )
   public static final void method4663(String arg0, int arg1, int arg2) {
      try {
         class702.method5107(arg1, 0, arg0, "", -18224, "", "");
         if (arg2 < -104) {
            ++field9315;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9326[0] + (arg0 != null ? field9326[2] : field9326[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            this.method28(false);
         }

         ++field9316;
         return 1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9326[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field9324;
         super.field6263 = arg1;
         if (arg0 > -46) {
            this.method4662(true);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9326[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (arg0) {
            label30: {
               ++field9317;
               if (super.field6259.method5439(28852) == class450.field6103) {
                  if (!super.field6259.method5434((byte)-111)) {
                     break label30;
                  }

                  super.field6263 = 0;
                  if (!client.field1481) {
                     break label30;
                  }
               }

               super.field6263 = 1;
            }

            if (~super.field6263 != -1 && super.field6263 != 1) {
               super.field6263 = this.method23(1);
            }
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9326[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class632(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4664(byte arg0) {
      try {
         if (arg0 != -20) {
            method4663((String)null, 84, 81);
         }

         field9323 = null;
         field9319 = null;
         field9325 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9326[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method4665(int arg0) {
      try {
         ++field9322;
         if (arg0 != -18033) {
            field9323 = null;
         }

         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9326[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class632(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            field9323 = null;
         }

         ++field9318;
         if (super.field6259.method5434((byte)-122)) {
            return 3;
         } else {
            return super.field6259.method5439(28852) == class450.field6103 ? 1 : 3;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9326[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4666(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4667(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
