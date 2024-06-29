import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class30 extends class713 {
   @OriginalMember(
      owner = "client!pf",
      name = "v",
      descriptor = "S"
   )
   public short field436;
   @OriginalMember(
      owner = "client!pf",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field437 = new String[]{method246(method245("\u0016-A%&N")), method246(method245("\u0016-A*&N")), method246(method245("\u0016-A'&N")), method246(method245("\u001deAL\u001a")), method246(method245("\u0016-A$&N")), method246(method245("\b>\u0003\u000e")), method246(method245("\u0016-A^\u000e\b\"\u001b\\O")), method246(method245("\u0016-A+&N")), method246(method245("\u0016-A(&N"))};
   @OriginalMember(
      owner = "client!pf",
      name = "x",
      descriptor = "Lcba;"
   )
   public static class95 field432 = new class95();
   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "F"
   )
   public static float field435;
   @OriginalMember(
      owner = "client!pf",
      name = "A",
      descriptor = "I"
   )
   public static int field429;
   @OriginalMember(
      owner = "client!pf",
      name = "u",
      descriptor = "I"
   )
   public static int field430;
   @OriginalMember(
      owner = "client!pf",
      name = "y",
      descriptor = "I"
   )
   public static int field431;
   @OriginalMember(
      owner = "client!pf",
      name = "w",
      descriptor = "I"
   )
   public static int field433;
   @OriginalMember(
      owner = "client!pf",
      name = "B",
      descriptor = "I"
   )
   public static int field434;

   @OriginalMember(
      owner = "client!pf",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method239(int arg0) {
      boolean var1 = client.field1481;

      try {
         class756.method5475(arg0 + 24641);
         ++field431;
         if (arg0 != -16530) {
            method243(-115, -72L);
         }

         label42: {
            label41: {
               int var2 = class757.field11093.field10977.method1764(-18033);
               if (~var2 != -3) {
                  if (~var2 != -4) {
                     break label42;
                  }

                  if (!var1) {
                     break label41;
                  }
               }

               class746.method5405(100, 100, class91.field1242, 262144, class204.field2605, class629.field9294);
               if (!var1) {
                  break label42;
               }
            }

            class202.method1675(2, class204.field2605, class91.field1242, class690.field10142, class187.field2380, 0, class629.field9294, 2);
         }

         if (class757.field11093.field10977.method1765(arg0 + 16531)) {
            class13.method113(11026, class590.field8691);
         }

         if (class629.field9294 != null) {
            class482.method3664(2);
         }

         class400.field5500 = ~class757.field11093.field10977.method1764(-18033) != -1;
         class28.field416 = class757.field11093.field10977.method1765(1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field437[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(I[Lue;)I"
   )
   public final int method240(int arg0, class243[] arg1) {
      boolean var3 = client.field1481;

      try {
         int var4;
         int var5;
         int var6;
         label111: {
            ++field434;
            var4 = super.field10467 >> class783.field11447;
            var5 = super.field10468 >> class783.field11447;
            var6 = 0;
            if (class699.field10231 != var4) {
               if (~class699.field10231 <= ~var4) {
                  break label111;
               }

               var6 += 2;
               if (!var3) {
                  break label111;
               }
            }

            ++var6;
         }

         label104: {
            if (~class664.field9833 == ~var5) {
               var6 += 3;
               if (!var3) {
                  break label104;
               }
            }

            if (class664.field9833 > var5) {
               var6 += 6;
            }
         }

         int var7 = class48.field675[var6];
         if ((this.field436 & var7) != 0) {
            return this.method5206(var4, var5, arg1, (byte)56);
         } else if (this.field436 == arg0 && var4 > 0) {
            return this.method5206(var4 + -1, var5, arg1, (byte)56);
         } else if (~this.field436 == -5 && ~class137.field1743 <= ~var4) {
            return this.method5206(var4 + 1, var5, arg1, (byte)56);
         } else if (~this.field436 == -9 && var5 > 0) {
            return this.method5206(var4, var5 + -1, arg1, (byte)56);
         } else if (~this.field436 == -3 && ~class181.field2297 <= ~var5) {
            return this.method5206(var4, var5 + 1, arg1, (byte)56);
         } else if (~this.field436 == -17 && ~var4 < -1 && class181.field2297 >= var5) {
            return this.method5206(var4 + -1, var5 + 1, arg1, (byte)56);
         } else if (this.field436 == 32 && ~class137.field1743 <= ~var4 && ~class181.field2297 <= ~var5) {
            return this.method5206(var4 + 1, var5 + 1, arg1, (byte)56);
         } else if (this.field436 == 128 && ~var4 < -1 && ~var5 < -1) {
            return this.method5206(var4 + -1, var5 + -1, arg1, (byte)56);
         } else if (~this.field436 == -65 && var4 <= class137.field1743 && ~var5 < -1) {
            return this.method5206(var4 + 1, var5 - 1, arg1, (byte)56);
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field437[4] + arg0 + ',' + (arg1 != null ? field437[3] : field437[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method241(byte arg0) {
      try {
         int var1 = 126 % ((78 - arg0) / 36);
         field432 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field437[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "b",
      descriptor = "(ILha;)Z"
   )
   public final boolean method242(int arg0, class479 arg1) {
      try {
         if (arg0 != -5) {
            this.field436 = -36;
         }

         ++field430;
         return class21.method163(super.field10468 >> class783.field11447, super.field10459, super.field10467 >> class783.field11447, this, (byte)125);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field437[7] + arg0 + ',' + (arg1 != null ? field437[3] : field437[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "a",
      descriptor = "(IJ)V"
   )
   public static final void method243(int arg0, long arg1) {
      try {
         if (arg0 >= -26) {
            field435 = -0.97483146F;
         }

         class585.field8631.setTime(new Date(arg1));
         ++field429;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field437[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field10466 = arg1;
         super.field10468 = arg2;
         super.field10459 = (byte)arg4;
         super.field10457 = (byte)arg3;
         this.field436 = (short)arg5;
         super.field10467 = arg0;
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field437[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "d",
      descriptor = "(Z)Z"
   )
   public final boolean method244(boolean arg0) {
      try {
         ++field433;
         if (arg0) {
            this.field436 = -18;
         }

         return class276.field3516[(super.field10467 >> class783.field11447) + -class699.field10231 - -class106.field1403][(super.field10468 >> class783.field11447) + class106.field1403 - class664.field9833];
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field437[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method245(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method246(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
