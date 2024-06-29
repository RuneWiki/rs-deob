import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class554 extends class305 {
   @OriginalMember(
      owner = "client!pt",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8038 = new String[]{method4142(method4141("8\"Bz\u0015")), method4142(method4141("8\"B~\u0015")), method4142(method4141("8\"Bx\u0015")), method4142(method4141("3xB\u0015@")), method4142(method4141("8\"B}\u0015")), method4142(method4141("&#\u0000W")), method4142(method4141("8\"By\u0015")), method4142(method4141("8\"B\u007f\u0015")), method4142(method4141("8\"B|\u0015"))};
   @OriginalMember(
      owner = "client!pt",
      name = "G",
      descriptor = "Luw;"
   )
   public static class435 field8032 = new class435(10, 4);
   @OriginalMember(
      owner = "client!pt",
      name = "D",
      descriptor = "Leb;"
   )
   public static class650 field8034 = new class650(3, 7);
   @OriginalMember(
      owner = "client!pt",
      name = "B",
      descriptor = "Lgh;"
   )
   public static class572 field8036 = new class572(36, 12);
   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "I"
   )
   public static int field8028;
   @OriginalMember(
      owner = "client!pt",
      name = "y",
      descriptor = "I"
   )
   public static int field8029;
   @OriginalMember(
      owner = "client!pt",
      name = "C",
      descriptor = "I"
   )
   public static int field8030;
   @OriginalMember(
      owner = "client!pt",
      name = "x",
      descriptor = "I"
   )
   public static int field8031;
   @OriginalMember(
      owner = "client!pt",
      name = "w",
      descriptor = "I"
   )
   public static int field8033;
   @OriginalMember(
      owner = "client!pt",
      name = "A",
      descriptor = "I"
   )
   public static int field8035;
   @OriginalMember(
      owner = "client!pt",
      name = "F",
      descriptor = "I"
   )
   public static int field8037;
   @OriginalMember(
      owner = "client!pt",
      name = "E",
      descriptor = "Lld;"
   )
   private class178 field8027;
   @OriginalMember(
      owner = "client!pt",
      name = "v",
      descriptor = "[[[B"
   )
   public static byte[][][] field8026;

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static void method4134(int arg0) {
      try {
         field8034 = null;
         field8032 = null;
         if (arg0 == 0) {
            field8026 = null;
            field8036 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8038[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(III)I",
      line = 22
   )
   public final int method4135(int arg0, int arg1, int arg2) {
      try {
         ++field8028;
         if (this.field8027 == null) {
            return arg1;
         } else {
            if (arg2 != 0) {
               field8037 = -13;
            }

            class459 var4 = (class459)this.field8027.method1572((long)arg0, -16289);
            return var4 == null ? arg1 : var4.field6727;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8038[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(IILuda;)V",
      line = 45
   )
   private final void method4136(int param1, int param2, class473 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(BLjava/lang/String;I)Ljava/lang/String;",
      line = 93
   )
   public final String method4137(byte arg0, String arg1, int arg2) {
      try {
         if (arg0 >= -60) {
            method4139(-98, 74, (byte)50, 25, -64);
         }

         ++field8035;
         if (this.field8027 == null) {
            return arg1;
         } else {
            class266 var4 = (class266)this.field8027.method1572((long)arg2, -16289);
            return var4 == null ? arg1 : var4.field3782;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8038[4] + arg0 + ',' + (arg1 != null ? field8038[3] : field8038[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(ILuda;)V",
      line = 114
   )
   public final void method4138(int arg0, class473 arg1) {
      boolean var3 = client.field4564;

      try {
         int var4 = -10 / ((arg0 - 61) / 61);

         while(true) {
            int var5 = arg1.method3564((byte)-94);
            if (var5 != 0) {
               this.method4136(-112, var5, arg1);
               if (var3) {
                  break;
               }

               if (!var3) {
                  continue;
               }
            }

            ++field8030;
            break;
         }

      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8038[7] + arg0 + ',' + (arg1 != null ? field8038[3] : field8038[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "a",
      descriptor = "(IIBII)Z",
      line = 138
   )
   public static final boolean method4139(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field8033;
         if ((2 & class608.field8732[0][arg4][arg0]) != 0) {
            return true;
         } else if ((class608.field8732[arg3][arg4][arg0] & 16) != 0) {
            return false;
         } else if (arg2 < 38) {
            return false;
         } else {
            return ~class692.method5035(arg3, arg0, 0, arg4) == ~arg1;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8038[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "h",
      descriptor = "(I)V",
      line = 160
   )
   public static final void method4140(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field8031;
         int var2 = 0;
         if (arg0 != 7) {
            method4134(114);
            if (!var1 && ~class621.field9054 >= ~var2) {
               return;
            }
         } else if (~class621.field9054 >= ~var2) {
            return;
         }

         do {
            class377 var3 = class123.field1969[var2];
            if (var3.field5610 == 3) {
               if (var3.field5595 == null) {
                  var3.field5593 = Integer.MIN_VALUE;
                  if (var1) {
                     class749.field10795.method1606(var3.field5595);
                     ++var2;
                  } else {
                     ++var2;
                  }
               } else {
                  class749.field10795.method1606(var3.field5595);
                  ++var2;
               }
            } else {
               ++var2;
            }
         } while(~class621.field9054 < ~var2);

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8038[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4141(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4142(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
