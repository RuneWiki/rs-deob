import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JQLDEMYI")
public class class25 extends class39 {

    @OriginalMember(owner = "JQLDEMYI", name = "n", descriptor = "I")
    private int field874 = -17619;

    @OriginalMember(owner = "JQLDEMYI", name = "q", descriptor = "I")
    private int field877 = -39282;

    @OriginalMember(owner = "JQLDEMYI", name = "w", descriptor = "Z")
    public boolean field883 = false;

    @OriginalMember(owner = "JQLDEMYI", name = "r", descriptor = "LVSBOWDVL;")
    private class66 field878;

    @OriginalMember(owner = "JQLDEMYI", name = "s", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "JQLDEMYI", name = "t", descriptor = "I")
    public int field880;

    @OriginalMember(owner = "JQLDEMYI", name = "u", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "JQLDEMYI", name = "v", descriptor = "I")
    public int field882;

    @OriginalMember(owner = "JQLDEMYI", name = "m", descriptor = "I")
    public int field873;

    @OriginalMember(owner = "JQLDEMYI", name = "o", descriptor = "I")
    private int field875;

    @OriginalMember(owner = "JQLDEMYI", name = "p", descriptor = "I")
    private int field876;

    @OriginalMember(owner = "JQLDEMYI", name = "<init>", descriptor = "(IIIIIIII)V")
    public class25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 0) {
            throw new NullPointerException();
        }
        this.field878 = class66.field1605[arg4];
        this.field879 = arg5;
        this.field880 = arg6;
        this.field881 = arg7;
        this.field882 = arg0;
        this.field873 = arg1 + arg3;
        this.field883 = false;
    }

    @OriginalMember(owner = "JQLDEMYI", name = "a", descriptor = "(II)V")
    public final void method300(int arg0, int arg1) {
        if (this.field874 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        this.field876 += arg0;
        while (true) {
            do {
                do {
                    if (this.field876 <= this.field878.field1609.method277((byte) 110, this.field875)) {
                        return;
                    }
                    this.field876 -= this.field878.field1609.method277((byte) 110, this.field875) + 1;
                    this.field875++;
                } while (this.field875 < this.field878.field1609.field818);
            } while (this.field875 >= 0 && this.field875 < this.field878.field1609.field818);
            this.field875 = 0;
            this.field883 = true;
        }
    }

    @OriginalMember(owner = "JQLDEMYI", name = "a", descriptor = "(I)LFUTAQMCE;")
    public final class19 method2(int arg0) {
        class19 var2 = this.field878.method519();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field878.field1609.field819[this.field875];
        if (this.field877 != arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        class19 var5 = new class19(var2, false, (byte) 2, true, class55.method428(4, var3));
        if (!this.field883) {
            var5.method257(284);
            var5.method258(var3, 4);
            var5.field765 = null;
            var5.field764 = null;
        }
        if (this.field878.field1612 != 128 || this.field878.field1613 != 128) {
            var5.method266(this.field878.field1612, this.field878.field1613, this.field878.field1612, -9317);
        }
        if (this.field878.field1614 != 0) {
            if (this.field878.field1614 == 90) {
                var5.method261(false);
            }
            if (this.field878.field1614 == 180) {
                var5.method261(false);
                var5.method261(false);
            }
            if (this.field878.field1614 == 270) {
                var5.method261(false);
                var5.method261(false);
                var5.method261(false);
            }
        }
        var5.method267(this.field878.field1615 + 64, this.field878.field1616 + 850, -30, -50, -30, true);
        return var5;
    }
}
