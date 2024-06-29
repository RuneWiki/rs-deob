import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class72 extends class606 {
   @OriginalMember(
      owner = "client!jfa",
      name = "G",
      descriptor = "I"
   )
   private int field1165;
   @OriginalMember(
      owner = "client!jfa",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1171 = new String[]{method819(method818("x['T")), method819(method818("m\u0000e\u0016@")), method819(method818("|H*\u0016|>")), method819(method818("|H*\u0016\u0001\u007f@\"L\u0003>")), method819(method818("|H*\u0016x>")), method819(method818("|H*\u0016u>")), method819(method818("|H*\u0016z>")), method819(method818("|H*\u0016~>"))};
   @OriginalMember(
      owner = "client!jfa",
      name = "L",
      descriptor = "Lbu;"
   )
   public static class234 field1163 = new class234(12, 0, 1, 0);
   @OriginalMember(
      owner = "client!jfa",
      name = "E",
      descriptor = "I"
   )
   public static int field1170 = 16777215;
   @OriginalMember(
      owner = "client!jfa",
      name = "K",
      descriptor = "I"
   )
   public static int field1161;
   @OriginalMember(
      owner = "client!jfa",
      name = "M",
      descriptor = "I"
   )
   public static int field1162;
   @OriginalMember(
      owner = "client!jfa",
      name = "F",
      descriptor = "I"
   )
   public static int field1164;
   @OriginalMember(
      owner = "client!jfa",
      name = "D",
      descriptor = "I"
   )
   public static int field1166;
   @OriginalMember(
      owner = "client!jfa",
      name = "H",
      descriptor = "I"
   )
   public static int field1168;
   @OriginalMember(
      owner = "client!jfa",
      name = "J",
      descriptor = "Lsa;"
   )
   public static class39 field1167;
   @OriginalMember(
      owner = "client!jfa",
      name = "I",
      descriptor = "[I"
   )
   public static int[] field1169;

   @OriginalMember(
      owner = "client!jfa",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class72(int arg0) {
      super(0, true);
      this.field1165 = 4096;

      try {
         this.field1165 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1171[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "f",
      descriptor = "(I)Z"
   )
   public static final boolean method815(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field1162;
         boolean var2 = true;
         if (class325.field4833 == null) {
            label67: {
               if (!class790.field11506.method450(arg0 ^ 1, class411.field6045)) {
                  var2 = false;
                  if (!var1) {
                     break label67;
                  }
               }

               class325.field4833 = class433.method3371(class790.field11506, class411.field6045);
            }
         }

         if (arg0 != 1) {
            return true;
         } else {
            if (class587.field8244 == null) {
               label60: {
                  if (class790.field11506.method450(arg0 ^ 1, class467.field6772)) {
                     class587.field8244 = class433.method3371(class790.field11506, class467.field6772);
                     if (!var1) {
                        break label60;
                     }
                  }

                  var2 = false;
               }
            }

            if (class319.field4769 == null) {
               label54: {
                  if (!class790.field11506.method450(0, class633.field8982)) {
                     var2 = false;
                     if (!var1) {
                        break label54;
                     }
                  }

                  class319.field4769 = class433.method3371(class790.field11506, class633.field8982);
               }
            }

            if (class563.field8018 == null) {
               label48: {
                  if (!class1.field5.method450(0, class536.field7531)) {
                     var2 = false;
                     if (!var1) {
                        break label48;
                     }
                  }

                  class563.field8018 = class604.method4453(class536.field7531, 29306, class1.field5);
               }
            }

            if (class374.field5464 == null) {
               if (class790.field11506.method450(0, class536.field7531)) {
                  class374.field5464 = class433.method3381(class790.field11506, class536.field7531);
                  if (!var1) {
                     return var2;
                  }
               }

               var2 = false;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1171[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         ++field1161;
         if (~arg1 == -1) {
            this.field1165 = (arg0.method665(false) << 12) / 255;
         }

         if (arg2 > -6) {
            field1168 = 123;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1171[2] + (arg0 != null ? field1171[1] : field1171[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method816(byte arg0) {
      try {
         if (arg0 == 70) {
            field1163 = null;
            field1169 = null;
            field1167 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1171[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "<init>",
      descriptor = "()V"
   )
   public class72() {
      this(4096);
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      try {
         ++field1166;
         if (arg0 != 0) {
            this.method8((class65)null, -54, 35);
         }

         int[] var3 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            class474.method3643(var3, 0, class563.field8014, this.field1165);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1171[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "a",
      descriptor = "(Lbt;IIIIIBILbt;I)V"
   )
   public static final void method817(class395 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class395 arg8, int arg9) {
      try {
         ++field1164;
         int var10 = arg0.method1503((byte)65);
         if (~var10 != 0) {
            if (arg6 <= 120) {
               field1167 = null;
            }

            Object var11 = null;
            class148 var12 = (class148)class588.field8263.method1041((long)var10, 8);
            if (var12 == null) {
               class433[] var13 = class433.method3384(class790.field11506, var10, 0);
               if (var13 == null) {
                  return;
               }

               var12 = class54.field794.method187(var13[0], true);
               class588.field8263.method1050(-77, var12, (long)var10);
            }

            class776.method5602(0, 256 * arg8.method1507(-68), arg9, arg1, arg2 >> 1, (byte)96, arg8.field6824, arg8.field6833, arg8.field6832, arg3 >> 1);
            int var14 = arg7 - 18 + class674.field9452[0];
            int var15 = class674.field9452[1] + arg5 + -70;
            int var16 = arg4 / 4 * 18 + var14;
            int var17 = arg4 % 4 * 18 + var15;
            var12.method1451(var16, var17);
            if (arg0 == arg8) {
               class54.field794.method186(18, 18, (byte)-11, -256, var17 + -1, var16 + -1);
            }

            class515.method3870(var17 + -1, var16 + 18, (byte)-50, var17 + 18, var16 - 1);
            class215 var18 = class232.method2062((byte)-123);
            var18.field3077 = var17 + 16;
            var18.field3067 = arg0;
            var18.field3075 = var16;
            var18.field3078 = var17;
            var18.field3074 = var16 - -16;
            class398.field5892.method3310(0, var18);
         }
      } catch (RuntimeException var20) {
         throw class612.method4503(var20, field1171[7] + (arg0 != null ? field1171[1] : field1171[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field1171[1] : field1171[0]) + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method818(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method819(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
