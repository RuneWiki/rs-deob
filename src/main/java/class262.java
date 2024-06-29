import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class262 extends class345 {
   @OriginalMember(
      owner = "client!ae",
      name = "k",
      descriptor = "Z"
   )
   public boolean field3718 = false;
   @OriginalMember(
      owner = "client!ae",
      name = "y",
      descriptor = "Z"
   )
   private boolean field3732 = true;
   @OriginalMember(
      owner = "client!ae",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3736 = new String[]{method2102(method2101("/N[\u0018O")), method2102(method2101("/N[\u001aO")), method2102(method2101("/N[\u0015O")), method2102(method2101("/N[\u0014O")), method2102(method2101("$J\u00126\u001f")), method2102(method2101("/N[\u0010O")), method2102(method2101("/N[\u0011O")), method2102(method2101("/N[\u0013O")), method2102(method2101("/N[\u0017O")), method2102(method2101("9Y")), method2102(method2101("/N[\u0019O")), method2102(method2101("/N[\u001eO")), method2102(method2101("/N[\u0016O"))};
   @OriginalMember(
      owner = "client!ae",
      name = "o",
      descriptor = "[Luu;"
   )
   public static class300[] field3722 = null;
   @OriginalMember(
      owner = "client!ae",
      name = "m",
      descriptor = "Lgh;"
   )
   public static class572 field3729 = new class572(99, 20);
   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "Z"
   )
   public static boolean field3734 = false;
   @OriginalMember(
      owner = "client!ae",
      name = "n",
      descriptor = "I"
   )
   public static int field3719;
   @OriginalMember(
      owner = "client!ae",
      name = "l",
      descriptor = "I"
   )
   public static int field3720;
   @OriginalMember(
      owner = "client!ae",
      name = "u",
      descriptor = "I"
   )
   public static int field3721;
   @OriginalMember(
      owner = "client!ae",
      name = "r",
      descriptor = "I"
   )
   public static int field3723;
   @OriginalMember(
      owner = "client!ae",
      name = "j",
      descriptor = "I"
   )
   public static int field3724;
   @OriginalMember(
      owner = "client!ae",
      name = "p",
      descriptor = "I"
   )
   public static int field3725;
   @OriginalMember(
      owner = "client!ae",
      name = "q",
      descriptor = "I"
   )
   public static int field3726;
   @OriginalMember(
      owner = "client!ae",
      name = "i",
      descriptor = "I"
   )
   public static int field3727;
   @OriginalMember(
      owner = "client!ae",
      name = "w",
      descriptor = "I"
   )
   public static int field3728;
   @OriginalMember(
      owner = "client!ae",
      name = "t",
      descriptor = "I"
   )
   public static int field3730;
   @OriginalMember(
      owner = "client!ae",
      name = "x",
      descriptor = "I"
   )
   public static int field3731;
   @OriginalMember(
      owner = "client!ae",
      name = "v",
      descriptor = "I"
   )
   public static int field3733;
   @OriginalMember(
      owner = "client!ae",
      name = "s",
      descriptor = "[Llg;"
   )
   public static class431[] field3735;

   @OriginalMember(
      owner = "client!ae",
      name = "<init>",
      descriptor = "(ILob;)V",
      line = 4
   )
   public class262(int arg0, class768 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!ae",
      name = "b",
      descriptor = "(B)Z",
      line = 7
   )
   public final boolean method2093(byte arg0) {
      try {
         if (arg0 != -127) {
            this.method51(-45);
         }

         ++field3724;
         return this.field3732;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3736[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "b",
      descriptor = "(I)V",
      line = 18
   )
   public final void method51(int arg0) {
      try {
         if (!super.field4914.method5554(-1).method1929(arg0 + -63)) {
            super.field4913 = 0;
         }

         ++field3725;
         if (super.field4913 < arg0 || ~super.field4913 < -6) {
            super.field4913 = this.method53(false);
         }

      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3736[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "c",
      descriptor = "(Z)V",
      line = 36
   )
   public static final void method2094(boolean arg0) {
      try {
         ++field3726;
         if (!class746.field10772) {
            class201.method1724(class31.field474, -113);
            if (arg0) {
               field3723 = -104;
            }

            if (class748.field10792 != null) {
               class201.method1724(class748.field10792, -121);
            }

            class746.field10772 = true;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3736[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(ZZ)V",
      line = 65
   )
   public final void method2095(boolean arg0, boolean arg1) {
      try {
         if (arg1) {
            method2094(false);
         }

         ++field3721;
         this.field3732 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3736[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "<init>",
      descriptor = "(Lob;)V",
      line = 276
   )
   public class262(class768 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(B)Z",
      line = 83
   )
   public final boolean method2096(byte arg0) {
      try {
         ++field3730;
         if (arg0 > -127) {
            return false;
         } else {
            return super.field4914.method5554(-1).method1929(-101);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3736[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(Lha;IIIIIIZZ)V",
      line = 98
   )
   public static final void method2097(class65 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
      class49.field1047 = arg0;
      class491.field7154 = arg1;
      class593.field8538 = class491.field7154 > 1 && class49.field1047.method274();
      class76.field1336 = arg2;
      class57.field1124 = 1 << class76.field1336;
      class760.field11026 = class57.field1124 >> 1;
      Math.sqrt((double)(class760.field11026 * class760.field11026 + class760.field11026 * class760.field11026));
      class323.field4655 = arg3;
      class479.field6989 = arg4;
      class357.field5100 = arg5;
      class54.field1102 = arg6;
      class56.field1116 = class767.method5549(256);
      class64.method685((byte)-49);
      class31.field474 = new class600[arg3][class479.field6989][class357.field5100];
      class530.field7721 = new class293[arg3];
      if (arg7) {
         class544.field7886 = new int[class479.field6989][class357.field5100];
         class634.field9246 = new byte[class479.field6989][class357.field5100];
         class569.field8236 = new short[class479.field6989][class357.field5100];
         class748.field10792 = new class600[1][class479.field6989][class357.field5100];
         class455.field6647 = new class293[1];
      } else {
         class544.field7886 = null;
         class634.field9246 = null;
         class569.field8236 = null;
         class748.field10792 = null;
         class455.field6647 = null;
      }

      if (arg8) {
         class236.field3434 = new long[arg3][arg4][arg5];
         class234.field3419 = new class538[65535];
         class764.field11079 = new boolean[65535];
         class696.field10208 = 0;
      } else {
         class236.field3434 = null;
         class234.field3419 = null;
         class764.field11079 = null;
         class696.field10208 = 0;
      }

      class230.method1908(false);
      class529.field7698 = new class294[2];
      class559.field8137 = new class294[2];
      class389.field5744 = new class294[2];
      class100.field1665 = new class294[10000];
      class353.field4993 = 0;
      class171.field2652 = new class294[5000];
      class302.field4216 = 0;
      class649.field9413 = new class144[5000];
      class103.field1682 = 0;
      class750.field10812 = new boolean[class54.field1102 + class54.field1102 + 1][class54.field1102 + class54.field1102 + 1];
      class696.field10195 = new boolean[class54.field1102 + class54.field1102 + 2][class54.field1102 + class54.field1102 + 2];
      class486.field7073 = new int[class54.field1102 + class54.field1102 + 2];
      class458.field6722 = class458.field6721;
      if (class593.field8538) {
         class295.field4141 = new boolean[arg3][class54.field1102 + class54.field1102 + 1][class54.field1102 + class54.field1102 + 1];
         class324.field4663 = new boolean[arg3][][];
         if (class786.field11513 != null) {
            class124.method1201();
         }

         class786.field11513 = new class271[class491.field7154];
         class49.field1047.method312(class786.field11513.length + 1);
         class49.field1047.method391(0);

         for(int var9 = 0; var9 < class786.field11513.length; ++var9) {
            class786.field11513[var9] = new class271(var9 + 1, class49.field1047);
            (new Thread(class786.field11513[var9], field3736[9] + var9)).start();
         }

         byte var10;
         if (class491.field7154 == 2) {
            var10 = 4;
            class85.field1409 = 2;
         } else if (class491.field7154 == 3) {
            var10 = 6;
            class85.field1409 = 3;
         } else {
            var10 = 8;
            class85.field1409 = 4;
         }

         class224.field3333 = new class344[var10];

         for(int var11 = 0; var11 < var10; ++var11) {
            class224.field3333[var11] = new class344(class559.field8136[class491.field7154 - 2][var11]);
         }
      } else {
         class85.field1409 = 1;
      }

      class474.field6930 = new int[class85.field1409 - 1];
      class172.field2660 = new int[class85.field1409 - 1];
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(IB)V",
      line = 216
   )
   public final void method54(int arg0, byte arg1) {
      try {
         super.field4913 = arg0;
         ++field3719;
         if (arg1 < 99) {
            this.method51(13);
         }

         this.field3718 = false;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3736[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(Z)I",
      line = 229
   )
   public final int method53(boolean arg0) {
      try {
         ++field3731;
         this.field3718 = true;
         if (arg0) {
            method2097((class65)null, -75, -90, 101, 97, 2, 65, true, true);
         }

         return !super.field4914.method5554(-1).method1929(-106) ? 0 : 2;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3736[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(BI)I",
      line = 248
   )
   public final int method52(byte arg0, int arg1) {
      try {
         if (arg0 > -45) {
            return -25;
         } else {
            ++field3720;
            if (!super.field4914.method5554(-1).method1929(-45)) {
               return 3;
            } else {
               return arg1 == 3 && !class423.method3213(13, field3736[4]) ? 3 : 2;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3736[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "b",
      descriptor = "(Z)I",
      line = 265
   )
   public final int method2098(boolean arg0) {
      try {
         if (arg0) {
            this.method2096((byte)40);
         }

         ++field3727;
         return super.field4913;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3736[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "c",
      descriptor = "(I)V",
      line = 279
   )
   public static void method2099(int arg0) {
      try {
         field3729 = null;
         field3722 = null;
         field3735 = null;
         if (arg0 != 0) {
            field3733 = -65;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3736[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "a",
      descriptor = "(IIIIIBI)V",
      line = 303
   )
   public static final void method2100(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
      try {
         label35: {
            if (~(-arg4 + arg3) > ~class515.field7502 || ~class130.field2163 > ~(arg3 - -arg4) || ~(-arg4 + arg0) > ~class3.field16 || ~class581.field8354 > ~(arg0 + arg4)) {
               class74.method777(arg1, arg4, (byte)115, arg2, arg6, arg0, arg3);
               if (!client.field4564) {
                  break label35;
               }
            }

            class188.method1643(arg2, arg4, arg1, arg0, arg3, arg6, (byte)68);
         }

         if (arg5 == 94) {
            ++field3728;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3736[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2101(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ae",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2102(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 43;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
