import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class753 extends class67 {
   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11171 = new String[]{method5530(method5529("yB;`^")), method5530(method5529("yB;o^")), method5530(method5529("yB;n^")), method5530(method5529("yB;k^")), method5530(method5529("yB;b^")), method5530(method5529("yB;l^")), method5530(method5529("yB;c^")), method5530(method5529("yB;i^")), method5530(method5529("yB;m^")), method5530(method5529("yB;h^"))};
   @OriginalMember(
      owner = "client!cv",
      name = "o",
      descriptor = "Lnaa;"
   )
   public static class113 field11166 = new class113(74, 3);
   @OriginalMember(
      owner = "client!cv",
      name = "w",
      descriptor = "I"
   )
   public static int field11158;
   @OriginalMember(
      owner = "client!cv",
      name = "s",
      descriptor = "I"
   )
   public static int field11159;
   @OriginalMember(
      owner = "client!cv",
      name = "p",
      descriptor = "I"
   )
   public static int field11160;
   @OriginalMember(
      owner = "client!cv",
      name = "u",
      descriptor = "I"
   )
   public static int field11161;
   @OriginalMember(
      owner = "client!cv",
      name = "r",
      descriptor = "I"
   )
   public static int field11163;
   @OriginalMember(
      owner = "client!cv",
      name = "m",
      descriptor = "I"
   )
   public static int field11164;
   @OriginalMember(
      owner = "client!cv",
      name = "k",
      descriptor = "I"
   )
   public static int field11165;
   @OriginalMember(
      owner = "client!cv",
      name = "l",
      descriptor = "I"
   )
   public static int field11167;
   @OriginalMember(
      owner = "client!cv",
      name = "q",
      descriptor = "I"
   )
   public static int field11169;
   @OriginalMember(
      owner = "client!cv",
      name = "t",
      descriptor = "Lsu;"
   )
   public static class289 field11162;
   @OriginalMember(
      owner = "client!cv",
      name = "v",
      descriptor = "Ljq;"
   )
   public static class672 field11170;
   @OriginalMember(
      owner = "client!cv",
      name = "n",
      descriptor = "[J"
   )
   public static long[] field11168;

   @OriginalMember(
      owner = "client!cv",
      name = "d",
      descriptor = "(I)Z",
      line = 3
   )
   public static final boolean method5523(int arg0) {
      try {
         if (arg0 != 13356) {
            return true;
         } else {
            ++field11165;
            return ~class326.field4957 != -1;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11171[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "f",
      descriptor = "(I)I",
      line = 14
   )
   public final int method5524(int arg0) {
      try {
         if (arg0 != 480102311) {
            return -124;
         } else {
            ++field11163;
            return super.field877;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11171[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "(B)Z",
      line = 26
   )
   public final boolean method5525(byte arg0) {
      try {
         ++field11167;
         if (arg0 != 5) {
            field11166 = null;
         }

         return class480.method3730(-127, super.field877);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11171[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 38
   )
   public class753(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(II)I",
      line = 41
   )
   public final int method161(int arg0, int arg1) {
      try {
         ++field11160;
         if (class480.method3730(45, arg0)) {
            if (super.field881.field507.method3434(0) && !class471.method3663(0, super.field881.field507.method3440(480102311))) {
               return 3;
            }

            if (super.field881.field520.method3173(480102311) == 1) {
               return 3;
            }
         }

         if (~arg0 == -4) {
            return 3;
         } else {
            if (arg1 > -74) {
               field11168 = null;
            }

            return class480.method3730(28, arg0) ? 2 : 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11171[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "c",
      descriptor = "(I)V",
      line = 72
   )
   public static void method5526(int arg0) {
      try {
         field11170 = null;
         field11162 = null;
         if (arg0 == 1747) {
            field11168 = null;
            field11166 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11171[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 85
   )
   public class753(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(B)V",
      line = 91
   )
   public final void method158(byte arg0) {
      try {
         if (this.method5525((byte)5)) {
            if (super.field881.field507.method3434(arg0 + 69) && !class471.method3663(0, super.field881.field507.method3440(arg0 ^ -480102372))) {
               super.field877 = 1;
            }

            if (~super.field881.field520.method3173(arg0 ^ -480102372) == -2) {
               super.field877 = 1;
            }
         }

         ++field11161;
         if (super.field877 == 3) {
            super.field877 = 2;
         }

         if (arg0 == -69) {
            if (~super.field877 > -1 || ~super.field877 < -4) {
               super.field877 = this.method162(arg0 + 69);
            }

         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11171[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "e",
      descriptor = "(I)Z",
      line = 122
   )
   public final boolean method5527(int arg0) {
      try {
         if (arg0 != 3343) {
            field11170 = null;
         }

         ++field11164;
         return true;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11171[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "(IZ)V",
      line = 133
   )
   public static final void method5528(int arg0, boolean arg1) {
      try {
         ++field11169;
         if (arg0 != -26506) {
            method5528(37, false);
         }

         int var2 = class730.field10901;
         int var3 = class513.field7827;
         if (arg1 && class334.field5143) {
            var2 <<= 1;
            var3 = -var2;
         }

         class351.field5356.method670(var3, var2);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11171[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "b",
      descriptor = "(I)I",
      line = 160
   )
   public final int method162(int arg0) {
      try {
         ++field11158;
         if (arg0 != 0) {
            this.method5524(38);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11171[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "a",
      descriptor = "(IZ)V",
      line = 172
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         super.field877 = arg0;
         if (!arg1) {
            this.method158((byte)31);
         }

         ++field11159;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11171[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
