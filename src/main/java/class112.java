import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class112 extends class145 {

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public int field2607 = 1000;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "Ltd;")
    public static class136 field2606 = class145.method1172("_", 45);

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "Ltd;")
    private static class136 field2605 = class145.method1172(" is already on your friend list", 45);

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Ltd;")
    public static class136 field2611 = field2605;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!qa", name = "eb", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "Lmd;")
    public static class87 field2604;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Lnb;")
    public static class92 field2609;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public static final void method878(int arg0) {
        field2610++;
        int var1 = class49.field1125;
        int var2 = class65.field1394;
        int var3 = class38.field892;
        int var4 = class128.field3088;
        class114.method902(var1, var2, var1 + var3, var2 + var4);
        int var5 = 6116423;
        class114.method891(var1, var2, var3, var4, var5);
        class114.method891(var1 + 1, var2 - -1, var3 - 2, 16, 0);
        class114.method897(var1 + 1, var2 - -18, var3 - 2, var4 + -19, 0);
        class81.field1943.method702(class145.field3352, var1 + 3, var2 + 14, var5, -1);
        int var6 = class18.field360;
        int var7 = class142.field3292;
        int var8 = 0;
        if (arg0 <= 42) {
            field2606 = null;
        }
        while (class14.field274 > var8) {
            int var9 = (class14.field274 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var6 < var1 + var3 && var9 - 13 < var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class81.field1943.method702(class69.method508(var8, (byte) -120), var1 + 3, var9, var10, 0);
            var8++;
        }
        class47.method407(class38.field892, class65.field1394, 100, class128.field3088, class49.field1125);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)Lda;")
    public class23 method93(int arg0) {
        field2613++;
        int var2 = -67 % ((arg0 - 18) / 63);
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public static void method879(int arg0) {
        field2604 = null;
        field2606 = null;
        if (arg0 > 93) {
            field2605 = null;
            field2611 = null;
            field2609 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)I")
    public static final int method880(int arg0, byte arg1) {
        if (arg1 <= 87) {
            method880(81, (byte) -66);
        }
        int var2 = 0;
        field2614++;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public static final void method881(int arg0) {
        field2612++;
        if (class90.field2132 != null) {
            class61 var1 = class90.field2132;
            synchronized (class90.field2132) {
                class90.field2132 = null;
            }
        }
        if (arg0 > -15) {
            field2605 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIII)V")
    public void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class23 var10 = this.method93(97);
        field2608++;
        if (var10 != null) {
            this.field2607 = var10.field2607;
            var10.method188(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }
}
