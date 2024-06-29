import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public abstract class class309 extends class137 {

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "[I")
    public static int[] field4939 = new int[128];

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4937 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public static int field4941 = 0;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Lod;")
    public static class276 field4932;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "[Lbl;")
    public static class146[] field4940;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BB)C")
    public static final char method2061(byte arg0, byte arg1) {
        if (arg1 > -2) {
            method2063(-99, true, -63, -50, -4, -93);
        }
        field4942++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class209.field3319[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(Z)[Lbl;")
    public static final class146[] method2062(boolean arg0) {
        field4936++;
        if (arg0) {
            method2066((class128) null, 94, (class128) null);
        }
        class146[] var1 = new class146[class183.field3014];
        for (int var2 = 0; var2 < class183.field3014; var2++) {
            int var3 = class60.field976[var2] * class246.field3916[var2];
            byte[] var4 = class70.field1192[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class243.field3870[class51.method359(var4[var6], 255)];
            }
            var1[var2] = new class232(class255.field4128, class111.field1749, class273.field4380[var2], class314.field5058[var2], class246.field3916[var2], class60.field976[var2], var5);
        }
        class28.method156(-27424);
        return var1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZIIII)V")
    public static final void method2063(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field4943++;
        int var7 = arg3 * arg3;
        int var8 = arg3;
        int var9 = var7 << 1;
        int var10 = arg4 * arg4;
        int var11 = var10 << 1;
        int var12 = arg3 << 1;
        int var13 = var7 - ((var12 - 1) * var11);
        int var14 = (1 - var12) * var10 + var9;
        int var15 = var10 << 2;
        int var16 = var7 << 2;
        int var17 = ((var6 << 1) + 3) * var9;
        int var18 = (var6 + 1) * var16;
        if (arg0 >= class85.field1409 && arg0 <= class234.field3774) {
            int var19 = class123.method866(class82.field1374, arg4 + arg5, (byte) 98, class259.field4188);
            int var20 = class123.method866(class82.field1374, arg5 - arg4, (byte) -104, class259.field4188);
            class73.method494(arg2, class204.field3253[arg0], 4028, var19, var20);
        }
        int var21 = ((arg3 << 1) - 3) * var11;
        if (!arg1) {
            field4937 = null;
        }
        int var22 = (arg3 - 1) * var15;
        while (var8 > 0) {
            var8--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var6++;
                    var13 += var18;
                    var18 += var16;
                    var14 += var17;
                    var17 += var16;
                }
            }
            if (var13 < 0) {
                var14 += var17;
                var17 += var16;
                var6++;
                var13 += var18;
                var18 += var16;
            }
            var14 += -var22;
            var22 -= var15;
            int var23 = arg0 - var8;
            int var24 = arg0 + var8;
            if (class85.field1409 <= var24 && class234.field3774 >= var23) {
                int var25 = class123.method866(class82.field1374, arg5 + var6, (byte) 72, class259.field4188);
                int var26 = class123.method866(class82.field1374, arg5 - var6, (byte) -84, class259.field4188);
                if (var23 >= class85.field1409) {
                    class73.method494(arg2, class204.field3253[var23], 4028, var25, var26);
                }
                if (class234.field3774 >= var24) {
                    class73.method494(arg2, class204.field3253[var24], 4028, var25, var26);
                }
            }
            var13 += -var21;
            var21 -= var15;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)Z")
    public abstract boolean method133(boolean arg0);

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method134(int arg0);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static final void method2064(byte arg0) {
        class34.field519 = new class211[class126.field1988.method1671((byte) -23)][];
        if (arg0 == -29) {
            class251.field3983 = new boolean[class126.field1988.method1671((byte) -23)];
            field4935++;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)Lii;")
    public static final class234 method2065(int arg0, int arg1) {
        field4934++;
        class234 var2 = (class234) class70.field1163.method694((long) arg0, false);
        if (arg1 != 27029) {
            field4940 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class105.field1667.method1680(class68.method475(arg0, true), class48.method339(arg0, 0), -94);
        class234 var4 = new class234();
        if (var3 != null) {
            var4.method1588(new class162(var3), false);
        }
        class70.field1163.method693((long) arg0, -114, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lhd;ILhd;)V")
    public static final void method2066(class128 arg0, int arg1, class128 arg2) {
        int var3 = -95 % ((arg1 + 67) / 47);
        field4933++;
        if (arg0.field2015 != null) {
            arg0.method913(-3542);
        }
        arg0.field2022 = arg2;
        arg0.field2015 = arg2.field2015;
        arg0.field2015.field2022 = arg0;
        arg0.field2022.field2015 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "(I)V")
    public static void method2067(int arg0) {
        field4939 = null;
        field4932 = null;
        field4940 = null;
        field4937 = null;
        if (arg0 != 1) {
            method2067(-99);
        }
    }
}
