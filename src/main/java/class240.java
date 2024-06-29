import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class240 {

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    private int field3840 = 0;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    private int field3848 = 128;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    private int field3850 = 0;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Z")
    public boolean field3839 = false;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    private int field3849 = 0;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    private int field3842 = 128;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public int field3863 = -1;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lck;")
    public static class119 field3838 = class298.method1987((byte) 105, "gtx");

    @OriginalMember(owner = "client!o", name = "o", descriptor = "Lck;")
    public static class119 field3851 = class298.method1987((byte) 102, "details)3dat");

    @OriginalMember(owner = "client!o", name = "x", descriptor = "Lck;")
    public static class119 field3860 = class298.method1987((byte) 102, ":trade:");

    @OriginalMember(owner = "client!o", name = "q", descriptor = "S")
    public static short field3853 = 1;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Lck;")
    public static class119 field3859 = class298.method1987((byte) 31, "Schlie-8en");

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[[[Luj;")
    public static class156[][][] field3841 = new class156[4][104][104];

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Lck;")
    private static class119 field3865 = class298.method1987((byte) 101, "Loaded textures");

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lck;")
    public static class119 field3856 = field3865;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "[I")
    public static int[] field3864 = new int[2];

    @OriginalMember(owner = "client!o", name = "D", descriptor = "F")
    public static float field3866;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    private int field3861;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "Lth;")
    public static class275 field3858;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Ltb;")
    public static class290 field3846;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "[S")
    private short[] field3843;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "[S")
    private short[] field3852;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "[S")
    private short[] field3854;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "[S")
    private short[] field3855;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILfj;)V", line = 6)
    private final void method1563(int arg0, int arg1, class3 arg2) {
        if (arg1 != -28877) {
            this.field3839 = true;
        }
        field3857++;
        if (arg0 == 1) {
            this.field3861 = arg2.method63((byte) 1);
        } else if (arg0 == 2) {
            this.field3863 = arg2.method63((byte) 1);
        } else if (arg0 == 4) {
            this.field3848 = arg2.method63((byte) 1);
        } else if (arg0 == 5) {
            this.field3842 = arg2.method63((byte) 1);
        } else if (arg0 == 6) {
            this.field3850 = arg2.method63((byte) 1);
        } else if (arg0 == 7) {
            this.field3840 = arg2.method64((byte) 75);
        } else if (arg0 == 8) {
            this.field3849 = arg2.method64((byte) 95);
        } else if (arg0 == 9) {
            this.field3839 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method64((byte) -101);
            this.field3852 = new short[var4];
            this.field3855 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3852[var5] = (short) arg2.method63((byte) 1);
                this.field3855[var5] = (short) arg2.method63((byte) 1);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method64((byte) -121);
            this.field3843 = new short[var6];
            this.field3854 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3854[var7] = (short) arg2.method63((byte) 1);
                this.field3843[var7] = (short) arg2.method63((byte) 1);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)Lec;", line = 115)
    public final class28 method1564(int arg0, byte arg1) {
        field3837++;
        class28 var3 = (class28) class174.field2787.method487(false, (long) this.field3862);
        if (var3 == null) {
            class267 var4 = class267.method1773(class25.field379, this.field3861, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3852 != null) {
                for (int var5 = 0; var5 < this.field3852.length; var5++) {
                    var4.method1777(this.field3852[var5], this.field3855[var5]);
                }
            }
            if (this.field3854 != null) {
                for (int var6 = 0; var6 < this.field3854.length; var6++) {
                    var4.method1771(this.field3854[var6], this.field3843[var6]);
                }
            }
            var3 = var4.method1775(this.field3840 + 64, this.field3849 + 850, -30, -50, -30);
            class174.field2787.method488(var3, (byte) 63, (long) this.field3862);
        }
        int var7 = 76 % ((79 - arg1) / 46);
        class28 var8;
        if (this.field3863 == -1 || arg0 == -1) {
            var8 = var3.method218(true, true);
        } else {
            var8 = class276.method1818(-20682, this.field3863).method425(var3, arg0, 65535);
        }
        if (this.field3848 != 128 || this.field3842 != 128) {
            var8.method206(this.field3848, this.field3842, this.field3848);
        }
        if (this.field3850 != 0) {
            if (this.field3850 == 90) {
                var8.method216();
            }
            if (this.field3850 == 180) {
                var8.method207();
            }
            if (this.field3850 == 270) {
                var8.method220();
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 214)
    public static void method1565(int arg0) {
        field3838 = null;
        field3858 = null;
        field3856 = null;
        field3841 = (class156[][][]) null;
        field3851 = null;
        field3865 = null;
        field3860 = null;
        if (arg0 <= 73) {
            method1565(-60);
        }
        field3859 = null;
        field3846 = null;
        field3864 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lfj;B)V", line = 267)
    public final void method1566(class3 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method64((byte) -110);
            if (var3 == 0) {
                field3847++;
                if (arg1 != -59) {
                    method1565(-39);
                }
                return;
            }
            this.method1563(var3, -28877, arg0);
        }
    }
}
