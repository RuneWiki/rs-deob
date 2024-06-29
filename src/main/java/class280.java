import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class280 extends class56 {

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "J")
    public static long field3267 = 0L;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    private int field3260;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    private int field3264;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "I")
    private int field3266;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILes;)V", line = 4)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        ++field3261;
        if (arg0 >= -44) {
            this.field3260 = 95;
        }
        if (arg1 == 0) {
            this.method1621((byte) 110, arg2.method2358(80));
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(I)V", line = 32)
    private class280(int arg0) {
        super(0, false);
        this.method1621((byte) 52, arg0);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V", line = 41)
    public class280() {
        this(0);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)[[I", line = 45)
    public final int[][] method187(byte arg0, int arg1) {
        ++field3265;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (arg0 <= 35) {
            this.method144((byte) -115, 75, (class403) null);
        }
        if (super.field759.field341) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class642.field8759; ++var7) {
                var4[var7] = this.field3260;
                var5[var7] = this.field3266;
                var6[var7] = this.field3264;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(BI)V", line = 92)
    private final void method1621(byte arg0, int arg1) {
        this.field3260 = arg1 >> 12 & 4080;
        this.field3266 = (65280 & arg1) >> 4;
        int var3 = -84 % ((arg0 - -90) / 32);
        this.field3264 = (arg1 & 255) << 4;
        ++field3262;
    }
}
