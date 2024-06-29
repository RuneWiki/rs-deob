import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class85 implements Runnable {

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[Lff;")
    public volatile class83[] field1657 = new class83[2];

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "Z")
    public volatile boolean field1667 = false;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Z")
    public volatile boolean field1656 = false;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lia;")
    public static class257 field1655 = class28.method234(88, "mem=");

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Luh;")
    public static class146 field1658 = new class146();

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "[I")
    public static int[] field1666 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public static int field1669 = 0;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "Lmi;")
    public class100 field1665;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLmb;)V")
    public static final void method638(byte arg0, class178 arg1) {
        field1660++;
        class259.field4495 = class200.method1343(23093, class164.field2871, arg1);
        class139.field2480 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var5 = (float) (class230.field3870[var2] >> 16 & 0xFF);
            int var6 = (class230.field3870[var2 + 1] & 0xFF0000) >> 16;
            float var7 = (float) ((class230.field3870[var2] & 0xFF00) >> 8);
            float var8 = ((float) var6 - var5) / 64.0F;
            int var9 = (class230.field3870[var2 + 1] & 0xFF00) >> 8;
            float var10 = (float) (class230.field3870[var2] & 0xFF);
            int var11 = class230.field3870[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            float var13 = ((float) var9 - var7) / 64.0F;
            for (int var14 = 0; var14 < 64; var14++) {
                class139.field2480[var2 * 64 + var14] = class198.method1332(class198.method1332((int) var7 << 8, (int) var5 << 16), (int) var10);
                var10 += var12;
                var5 += var8;
                var7 += var13;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class139.field2480[var3] = class230.field3870[3];
        }
        class227.field3816 = new int[32768];
        class158.field2782 = new int[32768];
        class222.method1467(false, (class155) null);
        int var4 = 89 / ((arg0 + 71) / 54);
        class68.field1364 = new int[32768];
        class217.field3673 = new int[32768];
        class92.field1754 = new class190(128, 254);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIZII)V")
    public static final void method639(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field1662++;
        if (arg0 == arg2) {
            class32.method270(2, arg5, arg0, arg1, arg4);
            return;
        }
        if (class123.field2211 <= (arg1 - arg0) && class145.field2540 >= (arg0 + arg1) && (arg4 - arg2) >= class40.field834 && class255.field4371 >= arg2 + arg4) {
            class250.method1637(arg4, arg5, 25911, arg1, arg0, arg2);
        } else {
            class158.method1104(arg5, arg4, 0, arg1, arg0, arg2);
        }
        if (!arg3) {
            field1655 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "run", descriptor = "()V")
    public final void run() {
        this.field1656 = true;
        field1663++;
        try {
            while (!this.field1667) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class83 var2 = this.field1657[var1];
                    if (var2 != null) {
                        var2.method634(-119);
                    }
                }
                class33.method283(-50, 10L);
                class210.method1410((Object) null, this.field1665, (byte) 15);
            }
        } catch (Exception var9) {
            class198.method1325((String) null, var9, -90);
        } finally {
            Object var6 = null;
            this.field1656 = false;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ[BI)I")
    public static final int method640(int arg0, boolean arg1, byte[] arg2, int arg3) {
        field1661++;
        int var4 = -1;
        if (!arg1) {
            method638((byte) -122, (class178) null);
        }
        for (int var5 = arg3; var5 < arg0; var5++) {
            var4 = class104.field1941[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method641(int arg0) {
        if (arg0 > 77) {
            field1666 = null;
            field1655 = null;
            field1658 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)I")
    public static final int method642(int arg0) {
        if (arg0 == 926530096) {
            field1668++;
            return class211.field3607;
        } else {
            return 75;
        }
    }
}
