import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class713 extends class67 {
   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10710 = new String[]{method5290(method5289("0\u0011f\u000f<")), method5290(method5289("0\u0011f\t<")), method5290(method5289("0\u0011f\b<")), method5290(method5289("0\u0011f\u0003<")), method5290(method5289("0\u0011f\u0002<")), method5290(method5289("0\u0011f\r<")), method5290(method5289("0\u0011f\u000e<")), method5290(method5289("&Vfdi")), method5290(method5289("3\r$&")), method5290(method5289("0\u0011f\f<")), method5290(method5289("0\u0011f\u0000<"))};
   @OriginalMember(
      owner = "client!mi",
      name = "s",
      descriptor = "I"
   )
   public static int field10700;
   @OriginalMember(
      owner = "client!mi",
      name = "o",
      descriptor = "I"
   )
   public static int field10701;
   @OriginalMember(
      owner = "client!mi",
      name = "q",
      descriptor = "I"
   )
   public static int field10702;
   @OriginalMember(
      owner = "client!mi",
      name = "p",
      descriptor = "I"
   )
   public static int field10703;
   @OriginalMember(
      owner = "client!mi",
      name = "l",
      descriptor = "I"
   )
   public static int field10704;
   @OriginalMember(
      owner = "client!mi",
      name = "t",
      descriptor = "I"
   )
   public static int field10705;
   @OriginalMember(
      owner = "client!mi",
      name = "r",
      descriptor = "I"
   )
   public static int field10706;
   @OriginalMember(
      owner = "client!mi",
      name = "m",
      descriptor = "I"
   )
   public static int field10707;
   @OriginalMember(
      owner = "client!mi",
      name = "n",
      descriptor = "I"
   )
   public static int field10708;
   @OriginalMember(
      owner = "client!mi",
      name = "k",
      descriptor = "I"
   )
   public static int field10709;

   @OriginalMember(
      owner = "client!mi",
      name = "d",
      descriptor = "(I)I",
      line = 4
   )
   public final int method5283(int arg0) {
      try {
         if (arg0 != 480102311) {
            return 94;
         } else {
            ++field10701;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10710[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 15
   )
   public class713(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(II)I",
      line = 19
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field10704;
         if (super.field881.method298(96)) {
            return 3;
         } else if (super.field881.method292((byte)112) == class619.field9004) {
            return 1;
         } else {
            if (arg1 >= -74) {
               this.method165(-76, false);
            }

            return 3;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10710[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(B)V",
      line = 37
   )
   public final void method158(byte arg0) {
      try {
         if (arg0 != -69) {
            method5286(false, -73, -87);
         }

         label29: {
            if (super.field881.method292((byte)126) != class619.field9004) {
               super.field877 = 1;
               if (!client.field1786) {
                  break label29;
               }
            }

            if (super.field881.method298(96)) {
               super.field877 = 0;
            }
         }

         ++field10702;
         if (~super.field877 != -1 && super.field877 != 1) {
            super.field877 = this.method162(0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10710[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "([Ljava/lang/String;II[SI)V",
      line = 59
   )
   public static final void method5284(String[] param0, int param1, int param2, short[] param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mi",
      name = "b",
      descriptor = "(B)V",
      line = 115
   )
   public static final void method5285(byte arg0) {
      try {
         ++field10700;
         class687.field10213.method299(-17, 1, class687.field10213.field546);
         class687.field10213.method299(-17, 1, class687.field10213.field536);
         class687.field10213.method299(-17, 1, class687.field10213.field516);
         class687.field10213.method299(-17, 1, class687.field10213.field501);
         class687.field10213.method299(-17, 1, class687.field10213.field534);
         class687.field10213.method299(-17, 1, class687.field10213.field529);
         class687.field10213.method299(-17, 0, class687.field10213.field497);
         if (arg0 >= -39) {
            method5288(-80, 85, 54, 3, (class667)null);
         }

         class687.field10213.method299(-17, 0, class687.field10213.field519);
         class687.field10213.method299(-17, 0, class687.field10213.field528);
         class687.field10213.method299(-17, 0, class687.field10213.field498);
         class687.field10213.method299(-17, 0, class687.field10213.field547);
         class687.field10213.method299(-17, 0, class687.field10213.field513);
         class687.field10213.method299(-17, 0, class687.field10213.field525);
         class687.field10213.method299(-17, 0, class687.field10213.field495);
         class687.field10213.method299(-17, 0, class687.field10213.field496);
         class687.field10213.method299(-17, 0, class687.field10213.field533);
         class687.field10213.method299(-17, 0, class687.field10213.field503);
         class687.field10213.method299(-17, 0, class687.field10213.field527);
         class687.field10213.method299(-17, 0, class687.field10213.field535);
         class687.field10213.method299(-17, 0, class687.field10213.field515);
         class176.method1609(-118);
         class687.field10213.method299(-17, 2, class687.field10213.field530);
         class687.field10213.method299(-17, 2, class687.field10213.field531);
         class698.method5133(-117);
         class410.method3287(false);
         class741.field11026 = true;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10710[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(ZII)Z",
      line = 154
   )
   public static final boolean method5286(boolean arg0, int arg1, int arg2) {
      try {
         ++field10708;
         if (arg0) {
            field10706 = 93;
         }

         return (1024 & arg1) != 0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10710[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 168
   )
   public class713(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mi",
      name = "b",
      descriptor = "(I)I",
      line = 173
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            return -20;
         } else {
            ++field10707;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10710[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "c",
      descriptor = "(I)Z",
      line = 184
   )
   public final boolean method5287(int arg0) {
      try {
         ++field10709;
         if (arg0 != 3343) {
            method5288(-67, -95, -53, -93, (class667)null);
         }

         if (super.field881.method298(arg0 ^ 3439)) {
            return false;
         } else {
            return super.field881.method292((byte)124) == class619.field9004;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10710[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IZ)V",
      line = 202
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field10703;
         if (!arg1) {
            method5286(true, 47, -57);
         }

         super.field877 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10710[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mi",
      name = "a",
      descriptor = "(IIIILcu;)V",
      line = 214
   )
   public static final void method5288(int arg0, int arg1, int arg2, int arg3, class667 arg4) {
      class190 var5 = class739.method5427(arg0, arg1, arg2);
      if (var5 != null) {
         arg4.field1505 = (arg1 << class394.field6180) + class42.field564;
         arg4.field1495 = arg3;
         arg4.field1494 = (arg2 << class394.field6180) + class42.field564;
         var5.field2961 = arg4;
         int var6 = class385.field6076 == class190.field2949 ? 1 : 0;
         if (arg4.method233(false)) {
            if (arg4.method228(0)) {
               arg4.field1503 = class777.field11406[var6];
               class777.field11406[var6] = arg4;
               return;
            }

            arg4.field1503 = class6.field36[var6];
            class6.field36[var6] = arg4;
            class67.field884 = true;
            return;
         }

         arg4.field1503 = class651.field9383[var6];
         class651.field9383[var6] = arg4;
      }

   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5289(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5290(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
