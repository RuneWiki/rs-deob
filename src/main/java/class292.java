import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class292 {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lk;")
    public class519 field4390 = null;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[Lhr;")
    public class483[] field4393 = null;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[Lhr;")
    private class483[] field4395 = null;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Z")
    public boolean field4397;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lcc;")
    public static class670 field4392 = new class670("WTRC", 1);

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field4398 = -1;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Loa;")
    public static class638 field4399;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)I")
    public static final int method1830(int arg0, int arg1, int arg2) {
        if (arg2 != 126) {
            method1831((byte) 25);
        }
        field4396++;
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static void method1831(byte arg0) {
        field4392 = null;
        field4399 = null;
        if (arg0 <= 110) {
            field4399 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)Z")
    public final boolean method1832(int arg0) {
        int var2 = -125 % (-arg0 / 45);
        field4394++;
        if (this.field4397) {
            return this.field4390 != null;
        } else {
            return this.field4393 != null;
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static final void method1833(int arg0) {
        class45.field669 = null;
        field4391++;
        if (arg0 != 128) {
            method1830(-109, 34, 115);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lgj;)V")
    public class292(class580 arg0) {
        this.field4397 = arg0.field8013;
        if (this.field4397 && !arg0.method315((byte) 103, class82.field1147, class312.field4637)) {
            this.field4397 = false;
        }
        if (this.field4397 || arg0.method345(class312.field4637, (byte) 40, class82.field1147)) {
            class622.method3463(16);
            if (this.field4397) {
                byte[] var6 = class116.method852(class635.field8929, false, false);
                this.field4390 = arg0.method343(128, -64, var6, 128, class312.field4637, 16);
                byte[] var7 = class116.method852(class186.field2752, false, false);
                arg0.method343(128, -63, var7, 128, class312.field4637, 16);
            } else {
                this.field4393 = new class483[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class547.method3007(32768, class635.field8929, (byte) 125, var2 * 256 * 128);
                    this.field4393[var2] = arg0.method3231(var5, 30569, 128, true, class312.field4637, 128);
                }
                this.field4395 = new class483[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class547.method3007(32768, class186.field2752, (byte) -8, var3 * 256 * 128);
                    this.field4395[var3] = arg0.method3231(var4, 30569, 128, true, class312.field4637, 128);
                }
            }
        }
    }
}
