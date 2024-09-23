import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GRLQOIQT")
public class class15 extends class2 {

    @OriginalMember(owner = "GRLQOIQT", name = "o", descriptor = "Z")
    public boolean field731 = false;

    @OriginalMember(owner = "GRLQOIQT", name = "v", descriptor = "I")
    private int field738 = 5;

    @OriginalMember(owner = "GRLQOIQT", name = "w", descriptor = "Z")
    private boolean field739 = false;

    @OriginalMember(owner = "GRLQOIQT", name = "n", descriptor = "LMKJLFPRH;")
    private class35 field730;

    @OriginalMember(owner = "GRLQOIQT", name = "p", descriptor = "I")
    public int field732;

    @OriginalMember(owner = "GRLQOIQT", name = "q", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "GRLQOIQT", name = "r", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "GRLQOIQT", name = "s", descriptor = "I")
    public int field735;

    @OriginalMember(owner = "GRLQOIQT", name = "m", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "GRLQOIQT", name = "t", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "GRLQOIQT", name = "u", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "GRLQOIQT", name = "<init>", descriptor = "(IIIBIIII)V")
    public class15(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 == 2) {
            boolean var9 = false;
        } else {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        this.field730 = class35.field1198[arg0];
        this.field732 = arg2;
        this.field733 = arg4;
        this.field734 = arg1;
        this.field735 = arg5;
        this.field729 = arg6 + arg7;
        this.field731 = false;
    }

    @OriginalMember(owner = "GRLQOIQT", name = "a", descriptor = "(I)LJLNSJQDR;")
    public final class26 method2(int arg0) {
        if (arg0 < this.field738 || arg0 > this.field738) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class26 var3 = this.field730.method423();
        if (var3 == null) {
            return null;
        }
        int var4 = this.field730.field1202.field1316[this.field736];
        class26 var5 = new class26(class59.method524((byte) 8, var4), false, true, true, var3);
        if (!this.field731) {
            var5.method335(19035);
            var5.method336((byte) 46, var4);
            var5.field980 = null;
            var5.field979 = null;
        }
        if (this.field730.field1205 != 128 || this.field730.field1206 != 128) {
            var5.method344(this.field730.field1205, -190, this.field730.field1206, this.field730.field1205);
        }
        if (this.field730.field1207 != 0) {
            if (this.field730.field1207 == 90) {
                var5.method339((byte) 1);
            }
            if (this.field730.field1207 == 180) {
                var5.method339((byte) 1);
                var5.method339((byte) 1);
            }
            if (this.field730.field1207 == 270) {
                var5.method339((byte) 1);
                var5.method339((byte) 1);
                var5.method339((byte) 1);
            }
        }
        var5.method345(this.field730.field1208 + 64, this.field730.field1209 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "GRLQOIQT", name = "a", descriptor = "(BI)V")
    public final void method241(byte arg0, int arg1) {
        if (arg0 != 9) {
            return;
        }
        this.field737 += arg1;
        while (true) {
            do {
                do {
                    if (this.field737 <= this.field730.field1202.method457(this.field736, this.field739)) {
                        return;
                    }
                    this.field737 -= this.field730.field1202.method457(this.field736, this.field739) + 1;
                    this.field736++;
                } while (this.field736 < this.field730.field1202.field1315);
            } while (this.field736 >= 0 && this.field736 < this.field730.field1202.field1315);
            this.field736 = 0;
            this.field731 = true;
        }
    }
}
