import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class194 implements class162 {
   @OriginalMember(
      owner = "client!cw",
      name = "k",
      descriptor = "Laga;"
   )
   private class696 field2753;
   @OriginalMember(
      owner = "client!cw",
      name = "m",
      descriptor = "Lkf;"
   )
   private class266 field2742;
   @OriginalMember(
      owner = "client!cw",
      name = "o",
      descriptor = "Lkf;"
   )
   private class266 field2746;
   @OriginalMember(
      owner = "client!cw",
      name = "j",
      descriptor = "I"
   )
   private int field2750;
   @OriginalMember(
      owner = "client!cw",
      name = "e",
      descriptor = "[Lw;"
   )
   private class317[] field2749;
   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2757 = new String[]{method1528(method1527("8\u001ay..")), method1528(method1527("8\u001ay(.")), method1528(method1527("8\u001ay-.")), method1528(method1527("8\u001ay$.")), method1528(method1527("5\u0018;\u0000")), method1528(method1527(" CyB{")), method1528(method1527("8\u001ayPo5\u0004#R.")), method1528(method1527("8\u001ay/.")), method1528(method1527("8\u001ay).")), method1528(method1527("8\u001ay+.")), method1528(method1527("8\u001ay*."))};
   @OriginalMember(
      owner = "client!cw",
      name = "g",
      descriptor = "Leg;"
   )
   public static class118 field2751 = new class118(122, -2);
   @OriginalMember(
      owner = "client!cw",
      name = "f",
      descriptor = "Lek;"
   )
   public static class536 field2755 = new class536(34, 7);
   @OriginalMember(
      owner = "client!cw",
      name = "p",
      descriptor = "I"
   )
   public static int field2741;
   @OriginalMember(
      owner = "client!cw",
      name = "c",
      descriptor = "I"
   )
   public static int field2743;
   @OriginalMember(
      owner = "client!cw",
      name = "b",
      descriptor = "I"
   )
   public static int field2744;
   @OriginalMember(
      owner = "client!cw",
      name = "l",
      descriptor = "I"
   )
   public static int field2745;
   @OriginalMember(
      owner = "client!cw",
      name = "n",
      descriptor = "I"
   )
   public static int field2747;
   @OriginalMember(
      owner = "client!cw",
      name = "h",
      descriptor = "I"
   )
   public static int field2748;
   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "I"
   )
   public static int field2752;
   @OriginalMember(
      owner = "client!cw",
      name = "i",
      descriptor = "I"
   )
   public static int field2754;
   @OriginalMember(
      owner = "client!cw",
      name = "d",
      descriptor = "Liha;"
   )
   public static class32 field2756;

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(FIIIBZ)[I"
   )
   public final int[] method1350(float arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
      try {
         if (arg4 <= 3) {
            return null;
         } else {
            ++field2743;
            return this.method1526((byte)-17, arg1).method2870(this, (byte)59, arg5, arg2, (double)arg0, this.field2749[arg1].field4315, this.field2742, arg3);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2757[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method1352(int arg0) {
      try {
         if (arg0 != -11629) {
            return 20;
         } else {
            ++field2754;
            return this.field2750;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2757[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IFIIBZ)[F"
   )
   public final float[] method1355(int arg0, float arg1, int arg2, int arg3, byte arg4, boolean arg5) {
      try {
         ++field2752;
         if (arg4 <= 104) {
            this.field2742 = null;
         }

         return this.method1526((byte)-17, arg3).method2874(this, -100, this.field2749[arg3].field4315, this.field2742, arg2, arg0);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2757[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1525(byte arg0) {
      try {
         field2756 = null;
         if (arg0 < -78) {
            field2751 = null;
            field2755 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2757[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(BI)Loq;"
   )
   private final class380 method1526(byte arg0, int arg1) {
      try {
         ++field2744;
         class76 var3 = this.field2753.method5069((byte)-94, (long)arg1);
         if (var3 != null) {
            return (class380)var3;
         } else {
            byte[] var4 = this.field2746.method2061((byte)80, arg1);
            if (var4 == null) {
               return null;
            } else {
               class380 var5 = new class380(new class147(var4));
               this.field2753.method5068((long)arg1, var5, -68);
               if (arg0 != -17) {
                  this.method1355(58, -0.078757584F, 68, -19, (byte)-50, true);
               }

               return var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2757[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IB)Lw;"
   )
   public final class317 method1354(int arg0, byte arg1) {
      try {
         if (arg1 != -109) {
            return null;
         } else {
            ++field2747;
            return this.field2749[arg0];
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2757[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "a",
      descriptor = "(IFZIII)[I"
   )
   public final int[] method1351(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
      try {
         ++field2748;
         return arg4 != 12356 ? null : this.method1526((byte)-17, arg3).method2873(this.field2749[arg3].field4315, this, this.field2742, (double)arg1, arg5, arg0, (byte)-105);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2757[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "b",
      descriptor = "(IB)Z"
   )
   public final boolean method1353(int arg0, byte arg1) {
      try {
         ++field2741;
         if (arg1 < 121) {
            this.method1350(-1.4006985F, -19, 17, 43, (byte)2, false);
         }

         class380 var3 = this.method1526((byte)-17, arg0);
         return var3 != null && var3.method2875(this, this.field2742, -81);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2757[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cw",
      name = "<init>",
      descriptor = "(Lkf;Lkf;Lkf;)V"
   )
   public class194(class266 param1, class266 param2, class266 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1527(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1528(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
