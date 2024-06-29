import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class437 extends class67 {
   @OriginalMember(
      owner = "client!hh",
      name = "r",
      descriptor = "Z"
   )
   private boolean field6692 = true;
   @OriginalMember(
      owner = "client!hh",
      name = "p",
      descriptor = "Z"
   )
   public boolean field6696 = false;
   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6702 = new String[]{method3442(method3441("4\u007ftn>")), method3442(method3441("4\u007fto>")), method3442(method3441("4\u007ftm>")), method3442(method3441("2b6J")), method3442(method3441("'9t\bk")), method3442(method3441("4\u007ft`>")), method3442(method3441("4\u007ftc>")), method3442(method3441("4\u007ftl>")), method3442(method3441("4\u007ftd>")), method3442(method3441("6v=Bn")), method3442(method3441("4\u007fte>")), method3442(method3441("4\u007ftg>")), method3442(method3441("4\u007ftb>")), method3442(method3441("4\u007fta>"))};
   @OriginalMember(
      owner = "client!hh",
      name = "l",
      descriptor = "[C"
   )
   public static char[] field6697 = new char[]{'[', ']', '#'};
   @OriginalMember(
      owner = "client!hh",
      name = "k",
      descriptor = "I"
   )
   public static int field6688;
   @OriginalMember(
      owner = "client!hh",
      name = "v",
      descriptor = "I"
   )
   public static int field6689;
   @OriginalMember(
      owner = "client!hh",
      name = "m",
      descriptor = "I"
   )
   public static int field6690;
   @OriginalMember(
      owner = "client!hh",
      name = "t",
      descriptor = "I"
   )
   public static int field6691;
   @OriginalMember(
      owner = "client!hh",
      name = "o",
      descriptor = "I"
   )
   public static int field6693;
   @OriginalMember(
      owner = "client!hh",
      name = "s",
      descriptor = "I"
   )
   public static int field6694;
   @OriginalMember(
      owner = "client!hh",
      name = "x",
      descriptor = "I"
   )
   public static int field6695;
   @OriginalMember(
      owner = "client!hh",
      name = "q",
      descriptor = "I"
   )
   public static int field6699;
   @OriginalMember(
      owner = "client!hh",
      name = "u",
      descriptor = "I"
   )
   public static int field6700;
   @OriginalMember(
      owner = "client!hh",
      name = "w",
      descriptor = "I"
   )
   public static int field6701;
   @OriginalMember(
      owner = "client!hh",
      name = "y",
      descriptor = "Ld;"
   )
   public static class150 field6698;
   @OriginalMember(
      owner = "client!hh",
      name = "n",
      descriptor = "Lfn;"
   )
   public static class616 field6687;

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public final void method158(byte arg0) {
      try {
         ++field6693;
         if (!super.field881.method295(false).method2510(-104)) {
            super.field877 = 0;
         }

         if (arg0 != -69) {
            this.method161(108, 0);
         }

         if (super.field877 < 0 || ~super.field877 < -6) {
            super.field877 = this.method162(0);
         }

      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6702[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "d",
      descriptor = "(I)Z",
      line = 19
   )
   public final boolean method3434(int arg0) {
      try {
         ++field6695;
         if (arg0 != 0) {
            this.method3440(60);
         }

         return this.field6692;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6702[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(Lhe;Lhe;B)V",
      line = 35
   )
   public static final void method3435(class294 arg0, class294 arg1, byte arg2) {
      try {
         if (arg1.field4653 != null) {
            arg1.method2477(1976);
         }

         ++field6689;
         arg1.field4653 = arg0.field4653;
         arg1.field4656 = arg0;
         arg1.field4653.field4656 = arg1;
         int var3 = 88 / ((arg2 - -10) / 63);
         arg1.field4656.field4653 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6702[12] + (arg0 != null ? field6702[4] : field6702[3]) + ',' + (arg1 != null ? field6702[4] : field6702[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 57
   )
   public class437(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!hh",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 60
   )
   public class437(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(II)I",
      line = 63
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field6690;
         if (!super.field881.method295(false).method2510(-58)) {
            return 3;
         } else if (arg1 > -74) {
            return 83;
         } else {
            return ~arg0 == -4 && !class423.method3353(field6702[9], 66) ? 3 : 2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6702[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "b",
      descriptor = "(B)V",
      line = 84
   )
   public static void method3436(byte arg0) {
      try {
         field6697 = null;
         field6698 = null;
         int var1 = -27 / ((-32 - arg0) / 53);
         field6687 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6702[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "b",
      descriptor = "(I)I",
      line = 95
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            field6687 = null;
         }

         this.field6696 = true;
         ++field6700;
         return !super.field881.method295(false).method2510(-18) ? 0 : 2;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6702[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(IZ)V",
      line = 111
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         if (arg1) {
            this.field6696 = false;
            ++field6691;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6702[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "e",
      descriptor = "(I)Z",
      line = 123
   )
   public final boolean method3437(int arg0) {
      try {
         if (arg0 != 3343) {
            return true;
         } else {
            ++field6701;
            return super.field881.method295(false).method2510(-110);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6702[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(ZI)V",
      line = 138
   )
   public final void method3438(boolean arg0, int arg1) {
      try {
         ++field6699;
         if (arg1 > -44) {
            field6687 = null;
         }

         this.field6692 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6702[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "a",
      descriptor = "(Lwo;I)I",
      line = 157
   )
   public static final int method3439(class9 arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field6694;
         int var3 = arg0.field71;
         class228 var4 = arg0.method1089(true);
         int var5 = arg0.field1616.method2995((byte)104);
         if (arg1 == var5 || arg0.field1656) {
            var3 = arg0.field91;
            if (!var2) {
               return var3;
            }
         }

         if (~var4.field3515 != ~var5 && ~var4.field3495 != ~var5 && var4.field3509 != var5 && ~var4.field3488 != ~var5) {
            if (~var4.field3505 != ~var5 && var4.field3481 != var5 && var4.field3460 != var5 && ~var4.field3478 != ~var5) {
               return var3;
            }

            var3 = arg0.field79;
            if (!var2) {
               return var3;
            }
         }

         var3 = arg0.field76;
         return var3;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6702[2] + (arg0 != null ? field6702[4] : field6702[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "c",
      descriptor = "(I)I",
      line = 187
   )
   public final int method3440(int arg0) {
      try {
         ++field6688;
         return arg0 != 480102311 ? -90 : super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6702[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3441(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3442(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 23;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
