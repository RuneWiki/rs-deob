import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class54 extends class166 {

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "[[B")
    private byte[][] field750 = new byte[10][];

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Lrg;")
    private class645 field751 = new class645(null);

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "Lrg;")
    private class645 field760 = new class645(null);

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    private int field749;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "Lvd;")
    private class39 field758;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "Lqe;")
    public static class469 field747 = new class469(113, 5);

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "Z")
    public static boolean field759 = false;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "[I")
    private int[] field752;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(B)V", line = 5)
    public static final void method379(byte arg0) {
        field753++;
        class520.field7449.method2150((byte) -41);
        class2.field18 = null;
        if (arg0 == -90) {
            class354.field5152 = null;
            class152.field2350 = 1;
        }
    }

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "(I)V", line = 22)
    public static final void method380(int arg0) {
        if (class176.field2719 != null) {
            class176.field2719.method1987(-93);
        }
        field756++;
        if (class578.field8220 != null) {
            class578.field8220.method1987(arg0 - 77);
        }
        if (arg0 != 0) {
            method383(16);
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(B)Lho;", line = 40)
    public static final class150 method381(byte arg0) {
        field754++;
        int var1 = 120 / ((arg0 + 33) / 48);
        class150 var2 = (class150) class132.field1781.method3508(-2);
        if (var2 != null) {
            var2.method1304((byte) 7);
            var2.method2597(127);
            return var2;
        }
        class150 var3;
        do {
            var3 = (class150) class132.field1776.method3508(-2);
            if (var3 == null) {
                return null;
            }
            if (var3.method1117(255) > class524.method3075(18)) {
                return null;
            }
            var3.method1304((byte) 7);
            var3.method2597(109);
        } while ((var3.field6154 & Long.MIN_VALUE) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BB)I", line = 78)
    public final int method382(byte[] arg0, byte arg1) throws IOException {
        field755++;
        if (this.field752 == null) {
            if (!this.field758.method214(0, this.field749, 0)) {
                return 0;
            }
            byte[] var3 = this.field758.method211(true, this.field749, 0);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field760.field9084 = 0;
            this.field760.field9068 = var3;
            int var4 = var3.length >> 1;
            this.field752 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field752[var5] = this.field760.method3712((byte) -116);
            }
        }
        if (arg1 != -14) {
            this.field752 = null;
        }
        if (this.field752.length <= this.field748) {
            return -1;
        }
        this.method384(arg1 + 14);
        this.field760.field9084 = 0;
        this.field760.field9068 = arg0;
        do {
            if (this.field760.field9068.length <= this.field760.field9084) {
                this.field760.field9068 = null;
                return arg0.length;
            }
            if (this.field751.field9068 == null) {
                if (this.field750[0] == null) {
                    this.field760.field9068 = null;
                    return this.field760.field9084;
                }
                this.field751.field9068 = this.field750[0];
            }
            int var6 = this.field760.field9068.length - this.field760.field9084;
            int var7 = this.field751.field9068.length - this.field751.field9084;
            if (var6 < var7) {
                this.field751.method3736(arg1 ^ 0x6B, this.field760.field9068, var6, this.field760.field9084);
                this.field760.field9068 = null;
                return arg0.length;
            }
            this.field760.method3703(this.field751.field9084, this.field751.field9068, var7, 128);
            this.field748++;
            this.field751.field9084 = 0;
            this.field751.field9068 = null;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field750[var8] = this.field750[var8 + 1];
            }
            this.field750[9] = null;
        } while (this.field748 < this.field752.length);
        this.field760.field9068 = null;
        return this.field760.field9084;
    }

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "(I)V", line = 182)
    public static void method383(int arg0) {
        if (arg0 != 0) {
            field759 = true;
        }
        field747 = null;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(ILvd;I)V", line = 192)
    public class54(int arg0, class39 arg1, int arg2) {
        super(arg0);
        this.field749 = arg2;
        this.field758 = arg1;
    }

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "(I)V", line = 205)
    public final void method384(int arg0) {
        field757++;
        if (this.field752 == null) {
            return;
        }
        for (int var2 = arg0; var2 < 10; var2++) {
            if (this.field752.length <= (this.field748 + var2)) {
                return;
            }
            if (this.field750[var2] == null && this.field758.method214(0, this.field752[this.field748 + var2], arg0)) {
                this.field750[var2] = this.field758.method211(true, this.field752[this.field748 + var2], 0);
            }
        }
    }
}
