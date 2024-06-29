import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class632 extends class345 {
   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9228 = new String[]{method4647(method4646("9z]\u00077")), method4647(method4646("9z]\b7")), method4647(method4646(";e\u001f,")), method4647(method4646(".>]nb")), method4647(method4646("9z]\u000b7")), method4647(method4646("9z]\u00017")), method4647(method4646("9z]\u00067")), method4647(method4646("9z]\u00027")), method4647(method4646("9z]\u00057")), method4647(method4646("9z]\u00037")), method4647(method4646("9z]\u00047"))};
   @OriginalMember(
      owner = "client!lj",
      name = "t",
      descriptor = "I"
   )
   public static int field9221 = -1;
   @OriginalMember(
      owner = "client!lj",
      name = "m",
      descriptor = "I"
   )
   public static int field9217 = 0;
   @OriginalMember(
      owner = "client!lj",
      name = "k",
      descriptor = "F"
   )
   public static float field9220;
   @OriginalMember(
      owner = "client!lj",
      name = "i",
      descriptor = "I"
   )
   public static int field9216;
   @OriginalMember(
      owner = "client!lj",
      name = "n",
      descriptor = "I"
   )
   public static int field9218;
   @OriginalMember(
      owner = "client!lj",
      name = "o",
      descriptor = "I"
   )
   public static int field9219;
   @OriginalMember(
      owner = "client!lj",
      name = "j",
      descriptor = "I"
   )
   public static int field9222;
   @OriginalMember(
      owner = "client!lj",
      name = "q",
      descriptor = "I"
   )
   public static int field9223;
   @OriginalMember(
      owner = "client!lj",
      name = "l",
      descriptor = "I"
   )
   public static int field9224;
   @OriginalMember(
      owner = "client!lj",
      name = "r",
      descriptor = "I"
   )
   public static int field9225;
   @OriginalMember(
      owner = "client!lj",
      name = "p",
      descriptor = "I"
   )
   public static int field9226;
   @OriginalMember(
      owner = "client!lj",
      name = "s",
      descriptor = "I"
   )
   public static int field9227;

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method4641(byte arg0) {
      try {
         ++field9226;
         if (arg0 > -127) {
            return false;
         } else {
            return class696.method5063((byte)-35, super.field4914.field11145.method2098(false));
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9228[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(Lpo;I)Lpo;"
   )
   public static final class582 method4642(class582 arg0, int arg1) {
      try {
         int var2 = -75 % ((-4 - arg1) / 51);
         ++field9225;
         class582 var3 = arg0 != null ? new class582(arg0) : new class582();
         var3.method4307(128, 9, -116);
         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9228[1] + (arg0 != null ? field9228[3] : field9228[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(ILpq;ILpq;ZZI)I"
   )
   public static final int method4643(int arg0, class203 arg1, int arg2, class203 arg3, boolean arg4, boolean arg5, int arg6) {
      try {
         ++field9219;
         int var7 = class662.method4845(arg1, arg3, arg5, (byte)-59, arg2);
         if (var7 != 0) {
            return arg5 ? -var7 : var7;
         } else if (arg0 == -1) {
            return 0;
         } else {
            int var8 = class662.method4845(arg1, arg3, arg4, (byte)-35, arg0);
            if (arg6 != -27786) {
               method4642((class582)null, -34);
            }

            return !arg4 ? var8 : -var8;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field9228[8] + arg0 + ',' + (arg1 != null ? field9228[3] : field9228[2]) + ',' + arg2 + ',' + (arg3 != null ? field9228[3] : field9228[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method53(boolean arg0) {
      try {
         if (arg0) {
            return 3;
         } else {
            ++field9227;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9228[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "<init>",
      descriptor = "(ILob;)V"
   )
   public class632(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method54(int arg0, byte arg1) {
      try {
         if (arg1 >= 99) {
            super.field4913 = arg0;
            ++field9216;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9228[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "a",
      descriptor = "(BI)I"
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 >= -45) {
            field9221 = -73;
         }

         ++field9223;
         return !class696.method5063((byte)-35, super.field4914.field11145.method2098(false)) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9228[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "<init>",
      descriptor = "(Lob;)V"
   )
   public class632(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method4644(boolean arg0) {
      try {
         ++field9224;
         if (arg0) {
            field9220 = 0.010985641F;
         }

         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9228[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method4645(int arg0) {
      try {
         ++field9222;
         if (class755.field10968 < 0) {
            class755.field10968 = 0;
            class493.field7185 = -1;
            class3.field22 = -1;
         }

         if (class370.field5496 < class755.field10968) {
            class755.field10968 = class370.field5496;
            class3.field22 = -1;
            class493.field7185 = -1;
         }

         int var1 = 66 / ((-68 - arg0) / 57);
         if (~class48.field1043 > -1) {
            class3.field22 = -1;
            class48.field1043 = 0;
            class493.field7185 = -1;
         }

         if (~class48.field1043 < ~class370.field5506) {
            class493.field7185 = -1;
            class48.field1043 = class370.field5506;
            class3.field22 = -1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9228[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method51(int arg0) {
      try {
         if (super.field4914.field11145.method2093((byte)-127) && !class696.method5063((byte)-35, super.field4914.field11145.method2098(false))) {
            super.field4913 = 0;
         }

         ++field9218;
         if (arg0 > super.field4913 || ~super.field4913 < -3) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9228[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4646(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4647(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
