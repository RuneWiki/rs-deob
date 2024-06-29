import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class22 extends class67 {
   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field288 = new String[]{method168(method167("#6kDI")), method168(method167("#6kCI")), method168(method167("(tk(\u001c")), method168(method167("#6k:\b=318I")), method168(method167("=/)j")), method168(method167("#6kLI")), method168(method167("#6kBI")), method168(method167("#6kOI")), method168(method167("#6kEI")), method168(method167("#6kNI")), method168(method167("#6k@I")), method168(method167("#6kAI")), method168(method167("#6kGI"))};
   @OriginalMember(
      owner = "client!pl",
      name = "u",
      descriptor = "Luk;"
   )
   public static class498 field281 = new class498(85, 0);
   @OriginalMember(
      owner = "client!pl",
      name = "q",
      descriptor = "Lnaa;"
   )
   public static class113 field285 = new class113(55, 18);
   @OriginalMember(
      owner = "client!pl",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field287 = false;
   @OriginalMember(
      owner = "client!pl",
      name = "p",
      descriptor = "I"
   )
   public static int field276;
   @OriginalMember(
      owner = "client!pl",
      name = "n",
      descriptor = "I"
   )
   public static int field277;
   @OriginalMember(
      owner = "client!pl",
      name = "m",
      descriptor = "I"
   )
   public static int field278;
   @OriginalMember(
      owner = "client!pl",
      name = "s",
      descriptor = "I"
   )
   public static int field279;
   @OriginalMember(
      owner = "client!pl",
      name = "k",
      descriptor = "I"
   )
   public static int field280;
   @OriginalMember(
      owner = "client!pl",
      name = "v",
      descriptor = "I"
   )
   public static int field282;
   @OriginalMember(
      owner = "client!pl",
      name = "l",
      descriptor = "I"
   )
   public static int field283;
   @OriginalMember(
      owner = "client!pl",
      name = "r",
      descriptor = "I"
   )
   public static int field284;
   @OriginalMember(
      owner = "client!pl",
      name = "t",
      descriptor = "I"
   )
   public static int field286;

   @OriginalMember(
      owner = "client!pl",
      name = "c",
      descriptor = "(I)I",
      line = 3
   )
   public final int method157(int arg0) {
      try {
         if (arg0 != 480102311) {
            field287 = false;
         }

         ++field276;
         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field288[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(B)V",
      line = 15
   )
   public final void method158(byte arg0) {
      try {
         if (arg0 != -69) {
            method164((byte)17);
         }

         if (~super.field881.method295(false).method2508(arg0 ^ 7826) > -97) {
            super.field877 = 0;
         }

         ++field284;
         if (super.field877 < 0 || super.field877 > 2) {
            super.field877 = this.method162(arg0 + 69);
         }

      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field288[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "d",
      descriptor = "(I)Z",
      line = 35
   )
   public final boolean method159(int arg0) {
      try {
         ++field286;
         if (~super.field881.method295(false).method2508(-7895) > -97) {
            return false;
         } else {
            if (arg0 != 3343) {
               field281 = null;
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field288[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(III)Z",
      line = 50
   )
   public static final boolean method160(int arg0, int arg1, int arg2) {
      try {
         ++field283;
         if (arg2 != 2048) {
            method166((byte)77);
         }

         return (2048 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field288[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(II)I",
      line = 61
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field278;
         if (arg1 >= -74) {
            return -57;
         } else {
            return ~super.field881.method295(false).method2508(-7895) > -97 ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field288[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 76
   )
   public class22(class41 arg0) {
      super(arg0);

      try {
         class797.method5745(super.field877, (byte)-10);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field288[3] + (arg0 != null ? field288[2] : field288[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "b",
      descriptor = "(I)I",
      line = 86
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            field281 = null;
         }

         ++field277;
         return super.field881.method295(false).method2508(-7895) < 96 ? 0 : 2;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field288[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "b",
      descriptor = "(II)V",
      line = 100
   )
   public static final void method163(int arg0, int arg1) {
      try {
         ++field280;
         class566 var2 = class146.method1321((long)arg0, arg1, -1428737160);
         var2.method4268(arg1 ^ 6);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field288[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "b",
      descriptor = "(B)V",
      line = 112
   )
   public static final void method164(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(IZ)V",
      line = 130
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field282;
         super.field877 = arg0;
         class797.method5745(super.field877, (byte)-10);
         if (!arg1) {
            field287 = true;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field288[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 143
   )
   public class22(int arg0, class41 arg1) {
      super(arg0, arg1);

      try {
         class797.method5745(super.field877, (byte)-10);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field288[3] + arg0 + ',' + (arg1 != null ? field288[2] : field288[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "c",
      descriptor = "(B)V",
      line = 151
   )
   public static void method166(byte arg0) {
      try {
         if (arg0 <= 86) {
            method164((byte)71);
         }

         field281 = null;
         field285 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field288[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method167(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 97);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method168(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 6;
            break;
         default:
            var10005 = 97;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
