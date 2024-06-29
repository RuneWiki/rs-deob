import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class488 extends class713 {
   @OriginalMember(
      owner = "client!di",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6810 = new String[]{method3706(method3705("R2g\u001a+\u001e")), method3706(method3705("R2g\u0019+\u001e")), method3706(method3705("R2gb\u0003X2=`B")), method3706(method3705("Mugp\u0017")), method3706(method3705("R2g\u001d+\u001e")), method3706(method3705("X.%2")), method3706(method3705("R2g\u0018+\u001e")), method3706(method3705("R2g\u0017+\u001e")), method3706(method3705("R2g\bB")), method3706(method3705("R2g\u001cB"))};
   @OriginalMember(
      owner = "client!di",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field6803 = new int[4];
   @OriginalMember(
      owner = "client!di",
      name = "v",
      descriptor = "I"
   )
   public static int field6804;
   @OriginalMember(
      owner = "client!di",
      name = "A",
      descriptor = "I"
   )
   public static int field6805;
   @OriginalMember(
      owner = "client!di",
      name = "x",
      descriptor = "I"
   )
   public static int field6806;
   @OriginalMember(
      owner = "client!di",
      name = "w",
      descriptor = "I"
   )
   public static int field6807;
   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "I"
   )
   public static int field6808;
   @OriginalMember(
      owner = "client!di",
      name = "u",
      descriptor = "I"
   )
   public static int field6809;

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(I[Lue;)I"
   )
   public final int method240(int arg0, class243[] arg1) {
      try {
         ++field6809;
         if (arg0 != 1) {
            field6803 = null;
         }

         return this.method5206(super.field10467 >> class783.field11447, super.field10468 >> class783.field11447, arg1, (byte)56);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6810[6] + arg0 + ',' + (arg1 != null ? field6810[3] : field6810[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method178(int arg0) {
      try {
         ++field6807;
         if (arg0 != -1) {
            this.method240(-93, (class243[])null);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6810[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method190(int arg0) {
      try {
         ++field6805;
         if (arg0 == 0) {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6810[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class488(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         super.field10459 = (byte)arg4;
         super.field10468 = arg2;
         super.field10457 = (byte)arg3;
         super.field10467 = arg0;
         super.field10466 = arg1;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6810[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(Lnl;III)V"
   )
   public static final void method3703(class713 arg0, int arg1, int arg2, int arg3) {
      if (arg2 < class137.field1743) {
         class731 var4 = class548.field8080[arg1][arg2 + 1][arg3];
         if (var4 != null && var4.field10649 != null && var4.field10649.method178(-1)) {
            arg0.method183(class158.field2032, false, true, var4.field10649, 0, class15.field276, 0);
         }
      }

      if (arg3 < class137.field1743) {
         class731 var5 = class548.field8080[arg1][arg2][arg3 + 1];
         if (var5 != null && var5.field10649 != null && var5.field10649.method178(-1)) {
            arg0.method183(class158.field2032, false, true, var5.field10649, 0, 0, class15.field276);
         }
      }

      if (arg2 < class137.field1743 && arg3 < class181.field2297) {
         class731 var6 = class548.field8080[arg1][arg2 + 1][arg3 + 1];
         if (var6 != null && var6.field10649 != null && var6.field10649.method178(-1)) {
            arg0.method183(class158.field2032, false, true, var6.field10649, 0, class15.field276, class15.field276);
         }
      }

      if (arg2 < class137.field1743 && arg3 > 0) {
         class731 var7 = class548.field8080[arg1][arg2 + 1][arg3 - 1];
         if (var7 != null && var7.field10649 != null && var7.field10649.method178(-1)) {
            arg0.method183(class158.field2032, false, true, var7.field10649, 0, class15.field276, -class15.field276);
         }
      }

   }

   @OriginalMember(
      owner = "client!di",
      name = "b",
      descriptor = "(ILha;)Z"
   )
   public final boolean method242(int arg0, class479 arg1) {
      try {
         ++field6808;
         if (arg0 != -5) {
            return true;
         } else {
            class131 var3 = class539.method4086(super.field10457, super.field10467 >> class783.field11447, super.field10468 >> class783.field11447);
            return var3 != null && var3.field1676.field10021 ? class73.method709((byte)41, super.field10457, var3.field1676.method76((byte)21) - -this.method76((byte)21), super.field10468 >> class783.field11447, super.field10467 >> class783.field11447) : class725.method5252(super.field10468 >> class783.field11447, super.field10457, super.field10467 >> class783.field11447, -1);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6810[7] + arg0 + ',' + (arg1 != null ? field6810[3] : field6810[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "d",
      descriptor = "(Z)Z"
   )
   public final boolean method244(boolean arg0) {
      try {
         if (arg0) {
            this.method178(-106);
         }

         ++field6806;
         return class276.field3516[(super.field10467 >> class783.field11447) - -class106.field1403 + -class699.field10231][(super.field10468 >> class783.field11447) - (-class106.field1403 + class664.field9833)];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6810[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3704(int arg0) {
      try {
         if (arg0 != 1) {
            field6803 = null;
         }

         field6803 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6810[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "a",
      descriptor = "(Lha;ZZLnl;III)V"
   )
   public final void method183(class479 arg0, boolean arg1, boolean arg2, class713 arg3, int arg4, int arg5, int arg6) {
      try {
         ++field6804;
         if (arg1) {
            this.method240(97, (class243[])null);
         }

         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field6810[4] + (arg0 != null ? field6810[3] : field6810[5]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6810[3] : field6810[5]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3705(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!di",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3706(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
