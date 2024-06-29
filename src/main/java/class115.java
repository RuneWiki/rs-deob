import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class115 extends class59 {

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "Lsd;")
    public static class166 field2234 = class135.method935("oberen Rand der Webseite ausw-=hlen)3", 0);

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "Lb;")
    public static class11 field2227 = new class11(50);

    @OriginalMember(owner = "client!mg", name = "fb", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
    private int field2229;

    @OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!mg", name = "eb", descriptor = "I")
    private int field2239;

    @OriginalMember(owner = "client!mg", name = "gb", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!mg", name = "hb", descriptor = "Lrf;")
    public static class159 field2242;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "[S")
    public static short[] field2228;

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(I)V")
    private class115(int arg0) {
        super(0, false);
        this.method833(arg0, (byte) -100);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(IB)V")
    private final void method833(int arg0, byte arg1) {
        ++field2238;
        this.field2239 = 4080 & arg0 >> 4;
        this.field2231 = arg0 << 4 & 4080;
        int var3 = -72 / ((-40 - arg1) / 34);
        this.field2229 = arg0 >> 12 & 4080;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lf;Lf;I)V")
    public static final void method834(class47 arg0, class47 arg1, int arg2) {
        class85.field1698 = arg0;
        class102.field1961 = arg1;
        ++field2236;
        class42.field745 = class102.field1961.method358(3, arg2 + -24445);
        if (arg2 != 24444) {
            method834((class47) null, (class47) null, -97);
        }
    }

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)V")
    public static void method835(int arg0) {
        field2228 = null;
        field2242 = null;
        field2234 = null;
        int var1 = 10 / ((arg0 - -37) / 49);
        field2227 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        ++field2233;
        if (arg1 <= 18) {
            field2234 = null;
        }
        if (arg2 == 0) {
            this.method833(arg0.method422((byte) -78), (byte) 78);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIILgg;I)V")
    public static final void method836(int arg0, boolean arg1, int arg2, int arg3, class62 arg4, int arg5) {
        ++field2232;
        if (class38.field691 < 50) {
            if (arg4.field1290 != null && ~arg2 > ~arg4.field1290.length) {
                int var6 = arg4.field1290[arg2];
                if (~var6 != -1) {
                    int var7 = var6 >> 8;
                    int var8 = (124 & var6) >> 4;
                    int var9 = var6 & 15;
                    if (~var9 == -1) {
                        if (arg1) {
                            class100.method746(0, var7, var8, -51);
                        }
                    } else if (class57.field1115 != 0) {
                        int var10 = (arg5 + -64) / 128;
                        class200.field3974[class38.field691] = var7;
                        int var11 = (arg3 + -64) / 128;
                        class154.field2970[class38.field691] = var8;
                        class46.field833[class38.field691] = 0;
                        class129.field2536[class38.field691] = null;
                        class189.field3584[class38.field691] = (var10 << 16) + (var11 << 8) + var9;
                        int var12 = 37 % ((30 - arg0) / 33);
                        ++class38.field691;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        ++field2230;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field1207.method528(123, arg1);
            if (super.field1207.field1320) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~class98.field1879 < ~var7; ++var7) {
                    var4[var7] = this.field2229;
                    var5[var7] = this.field2239;
                    var6[var7] = this.field2231;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V")
    public class115() {
        this(0);
    }
}
