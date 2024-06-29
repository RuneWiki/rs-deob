import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ea")
public class class10 extends class30 {

    @OriginalMember(owner = "mapview!ea", name = "q", descriptor = "[J")
    private long[] field158 = new long[10];

    @OriginalMember(owner = "mapview!ea", name = "o", descriptor = "Z")
    public static volatile boolean field156 = true;

    @OriginalMember(owner = "mapview!ea", name = "n", descriptor = "Lk;")
    public static class21 field155 = class14.method92((byte) 57, "Fur Trader");

    @OriginalMember(owner = "mapview!ea", name = "w", descriptor = "I")
    public static int field164 = 0;

    @OriginalMember(owner = "mapview!ea", name = "t", descriptor = "Lk;")
    public static class21 field161 = class14.method92((byte) 57, "Fishing Spot");

    @OriginalMember(owner = "mapview!ea", name = "p", descriptor = "I")
    private int field157;

    @OriginalMember(owner = "mapview!ea", name = "s", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "mapview!ea", name = "u", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "mapview!ea", name = "v", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "mapview!ea", name = "r", descriptor = "J")
    private long field159;

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(I[BB)I", line = 8)
    public static final int method64(int arg0, byte[] arg1, byte arg2) {
        if (arg2 != 61) {
            method65((byte) 95);
        }
        return mapview.method17(arg0, arg1, 0, -119);
    }

    @OriginalMember(owner = "mapview!ea", name = "c", descriptor = "(B)V", line = 19)
    public static void method65(byte arg0) {
        int var1 = -47 % ((arg0 + 34) / 61);
        field155 = null;
        field161 = null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IILm;Z)[Le;", line = 32)
    public static final class9[] method66(int arg0, int arg1, class25 arg2, boolean arg3) {
        if (!arg3) {
            field164 = 72;
        }
        return class23.method153(arg1, arg0, 5000, arg2) ? mapview.method5(0) : null;
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(IJ)V", line = 67)
    public static final void method67(int arg0, long arg1) {
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class22.method150(arg1 - 1L, (byte) 115);
            class22.method150(1L, (byte) 115);
        } else {
            class22.method150(arg1, (byte) 115);
        }
        if (arg0 != 1) {
            method66(82, -100, null, false);
        }
    }

    @OriginalMember(owner = "mapview!ea", name = "<init>", descriptor = "()V", line = 219)
    public class10() {
        this.method69((byte) -3);
    }

    @OriginalMember(owner = "mapview!ea", name = "a", descriptor = "(III)I", line = 108)
    public final int method68(int arg0, int arg1, int arg2) {
        int var4 = this.field157;
        this.field157 = 1;
        int var5 = this.field163;
        if (arg2 != 3) {
            this.method69((byte) 84);
        }
        this.field163 = 300;
        this.field159 = System.currentTimeMillis();
        if (this.field158[this.field160] == 0L) {
            this.field157 = var4;
            this.field163 = var5;
        } else if (this.field159 > this.field158[this.field160]) {
            this.field163 = (int) ((long) (arg1 * 2560) / (this.field159 - this.field158[this.field160]));
        }
        if (this.field163 < 25) {
            this.field163 = 25;
        }
        if (this.field163 > 256) {
            this.field163 = 256;
            this.field157 = (int) ((long) arg1 - (this.field159 - this.field158[this.field160]) / 10L);
        }
        if (this.field157 > arg1) {
            this.field157 = arg1;
        }
        this.field158[this.field160] = this.field159;
        this.field160 = (this.field160 + 1) % 10;
        if (this.field157 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field158[var6] != 0L) {
                    this.field158[var6] += this.field157;
                }
            }
        }
        if (arg0 > this.field157) {
            this.field157 = arg0;
        }
        method67(arg2 ^ 0x2, (long) this.field157);
        int var7 = 0;
        while (this.field162 < 256) {
            var7++;
            this.field162 += this.field163;
        }
        this.field162 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!ea", name = "b", descriptor = "(B)V", line = 186)
    public final void method69(byte arg0) {
        this.field162 = 0;
        if (arg0 != -3) {
            return;
        }
        this.field163 = 256;
        this.field157 = 1;
        this.field159 = System.currentTimeMillis();
        for (int var2 = 0; var2 < 10; var2++) {
            this.field158[var2] = this.field159;
        }
    }
}
