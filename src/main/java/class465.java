import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class465 extends class40 {
   @OriginalMember(
      owner = "client!kd",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7071 = new String[]{method3612(method3611("\u0015\u001f-H\f")), method3612(method3611("\u0015\u001f-K\f")), method3612(method3611("\u0015\u001f-D\f")), method3612(method3611("\u0010\bm<")), method3612(method3611("\u0005U-\"Y")), method3612(method3611("\u0010\bm=")), method3612(method3611("\u0010\u000eo`")), method3612(method3611("\u0010\bm?")), method3612(method3611("\u0010\bm>")), method3612(method3611("\u0015\u001f-M\f")), method3612(method3611("\u0015\u001f-J\f")), method3612(method3611("\u0015\u001f-I\f")), method3612(method3611("\u0015\u001f-N\f"))};
   @OriginalMember(
      owner = "client!kd",
      name = "y",
      descriptor = "Luk;"
   )
   public static class498 field7058 = new class498(21, -2);
   @OriginalMember(
      owner = "client!kd",
      name = "A",
      descriptor = "I"
   )
   public static int field7069 = 0;
   @OriginalMember(
      owner = "client!kd",
      name = "s",
      descriptor = "[[I"
   )
   public static int[][] field7068 = new int[6][];
   @OriginalMember(
      owner = "client!kd",
      name = "t",
      descriptor = "I"
   )
   public static int field7057;
   @OriginalMember(
      owner = "client!kd",
      name = "u",
      descriptor = "I"
   )
   public static int field7059;
   @OriginalMember(
      owner = "client!kd",
      name = "C",
      descriptor = "I"
   )
   public static int field7060;
   @OriginalMember(
      owner = "client!kd",
      name = "o",
      descriptor = "I"
   )
   public static int field7061;
   @OriginalMember(
      owner = "client!kd",
      name = "r",
      descriptor = "I"
   )
   public static int field7064;
   @OriginalMember(
      owner = "client!kd",
      name = "B",
      descriptor = "I"
   )
   public static int field7066;
   @OriginalMember(
      owner = "client!kd",
      name = "v",
      descriptor = "Ljq;"
   )
   private class672 field7056;
   @OriginalMember(
      owner = "client!kd",
      name = "x",
      descriptor = "Ljq;"
   )
   private class672 field7062;
   @OriginalMember(
      owner = "client!kd",
      name = "w",
      descriptor = "Ljq;"
   )
   private class672 field7063;
   @OriginalMember(
      owner = "client!kd",
      name = "p",
      descriptor = "Ljq;"
   )
   private class672 field7065;
   @OriginalMember(
      owner = "client!kd",
      name = "z",
      descriptor = "Ljq;"
   )
   public class672 field7067;
   @OriginalMember(
      owner = "client!kd",
      name = "q",
      descriptor = "Ljq;"
   )
   private class672 field7070;

   @OriginalMember(
      owner = "client!kd",
      name = "b",
      descriptor = "(B)V",
      line = 5
   )
   public final void method282(byte arg0) {
      try {
         ++field7064;
         super.method282((byte)102);
         class598 var2 = (class598)super.field485;
         this.field7067 = class85.method828(121, super.field487, var2.field8771);
         this.field7070 = class85.method828(118, super.field487, var2.field8769);
         this.field7056 = class85.method828(107, super.field487, var2.field8776);
         if (arg0 <= 98) {
            this.method2822(109, 17, 63, (byte)98, 22);
         }

         this.field7062 = class85.method828(110, super.field487, var2.field8767);
         this.field7065 = class85.method828(103, super.field487, var2.field8770);
         this.field7063 = class85.method828(121, super.field487, var2.field8774);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7071[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(B)Z",
      line = 24
   )
   public final boolean method285(byte arg0) {
      try {
         ++field7057;
         if (!super.method285(arg0)) {
            return false;
         } else {
            class598 var2 = (class598)super.field485;
            if (!super.field487.method5002(var2.field8771, (byte)100)) {
               return false;
            } else if (!super.field487.method5002(var2.field8769, (byte)101)) {
               return false;
            } else if (!super.field487.method5002(var2.field8776, (byte)113)) {
               return false;
            } else if (!super.field487.method5002(var2.field8767, (byte)87)) {
               return false;
            } else if (!super.field487.method5002(var2.field8770, (byte)123)) {
               return false;
            } else {
               return super.field487.method5002(var2.field8774, (byte)98);
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7071[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(IIIZ)V",
      line = 64
   )
   public final void method278(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field7059;
         if (arg3) {
            int[] var5 = new int[4];
            class351.field5356.method626(var5);
            class351.field5356.method629(arg1, arg2, super.field485.field8820 + arg1, super.field485.field8811 + arg2);
            int var6 = this.field7056.method2106();
            int var7 = this.field7056.method2108();
            int var8 = this.field7062.method2106();
            int var9 = this.field7062.method2108();
            this.field7056.method4959(arg1, (-var7 + super.field485.field8811) / 2 + arg2);
            this.field7062.method4959(super.field485.field8820 + arg1 - var8, (-var9 + super.field485.field8811) / 2 + arg2);
            class351.field5356.method629(arg1, arg2, super.field485.field8820 + arg1, this.field7065.method2108() + arg2);
            this.field7065.method4949(arg1 - -var6, arg2, -var6 + -var8 + super.field485.field8820, super.field485.field8811);
            int var10 = this.field7063.method2108();
            class351.field5356.method629(arg1, super.field485.field8811 + arg2 + -var10, super.field485.field8820 + arg1, super.field485.field8811 + arg2);
            this.field7063.method4949(arg1 + var6, -var10 + arg2 - -super.field485.field8811, -var8 + super.field485.field8820 - var6, super.field485.field8811);
            class351.field5356.method629(var5[0], var5[1], var5[2], var5[3]);
         }

         if (arg0 != -24843) {
            this.method2822(90, 46, 3, (byte)8, 101);
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field7071[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "d",
      descriptor = "(B)V",
      line = 100
   )
   public static void method3609(byte arg0) {
      try {
         if (arg0 < -4) {
            field7068 = null;
            field7058 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7071[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "<init>",
      descriptor = "(Lrr;Lrr;Lhj;)V",
      line = 112
   )
   public class465(class678 arg0, class678 arg1, class598 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(IIIBI)V",
      line = 117
   )
   public void method2822(int arg0, int arg1, int arg2, byte arg3, int arg4) {
      try {
         ++field7066;
         if (arg3 < 110) {
            field7058 = null;
         }

         this.field7067.method4949(arg2, arg4, arg1, arg0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field7071[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(ILpfa;)V",
      line = 136
   )
   public static final void method3610(int param0, class102 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kd",
      name = "a",
      descriptor = "(ZIIB)V",
      line = 342
   )
   public final void method279(boolean arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field7060;
         int var5 = this.field7056.method2106() + arg2;
         int var6 = arg2 - -super.field485.field8820 - this.field7062.method2106();
         int var7 = this.field7065.method2108() + arg1;
         if (arg3 > -125) {
            this.field7062 = null;
         }

         int var8 = arg1 - (-super.field485.field8811 - -this.field7063.method2108());
         int var9 = var6 - var5;
         int var10 = -var7 + var8;
         int var11 = var9 * this.method286((byte)-86) / 10000;
         int[] var12 = new int[4];
         class351.field5356.method626(var12);
         class351.field5356.method629(var5, var7, var5 + var11, var8);
         this.method2822(var10, var9, var5, (byte)115, var7);
         class351.field5356.method629(var5 - -var11, var7, var6, var8);
         this.field7070.method4949(var5, var7, var9, var10);
         class351.field5356.method629(var12[0], var12[1], var12[2], var12[3]);
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field7071[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3611(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3612(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
