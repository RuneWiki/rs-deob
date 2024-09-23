import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YHTUMUXE")
public class class69 extends class66 {

    @OriginalMember(owner = "YHTUMUXE", name = "o", descriptor = "Z")
    public boolean field1620 = false;

    @OriginalMember(owner = "YHTUMUXE", name = "s", descriptor = "I")
    private int field1624 = 8;

    @OriginalMember(owner = "YHTUMUXE", name = "t", descriptor = "B")
    private byte field1625 = 29;

    @OriginalMember(owner = "YHTUMUXE", name = "u", descriptor = "I")
    private int field1626 = -503;

    @OriginalMember(owner = "YHTUMUXE", name = "r", descriptor = "LTGIKVGNH;")
    private class55 field1623;

    @OriginalMember(owner = "YHTUMUXE", name = "k", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "YHTUMUXE", name = "l", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "YHTUMUXE", name = "m", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "YHTUMUXE", name = "n", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "YHTUMUXE", name = "v", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "YHTUMUXE", name = "p", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "YHTUMUXE", name = "q", descriptor = "I")
    private int field1622;

    @OriginalMember(owner = "YHTUMUXE", name = "a", descriptor = "(I)LKBEXSZSN;")
    public final class31 method28(int arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        class31 var2 = this.field1623.method461();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field1623.field1371.field1186[this.field1621];
        class31 var4 = new class31(false, 777, class25.method309(var3, false), var2, true);
        if (!this.field1620) {
            var4.method346(311);
            var4.method347(-486, var3);
            var4.field1032 = null;
            var4.field1031 = null;
        }
        if (this.field1623.field1374 != 128 || this.field1623.field1375 != 128) {
            var4.method355(this.field1625, this.field1623.field1374, this.field1623.field1375, this.field1623.field1374);
        }
        if (this.field1623.field1376 != 0) {
            if (this.field1623.field1376 == 90) {
                var4.method350(25816);
            }
            if (this.field1623.field1376 == 180) {
                var4.method350(25816);
                var4.method350(25816);
            }
            if (this.field1623.field1376 == 270) {
                var4.method350(25816);
                var4.method350(25816);
                var4.method350(25816);
            }
        }
        var4.method356(this.field1623.field1377 + 64, this.field1623.field1378 + 850, -30, -50, -30, true);
        return var4;
    }

    @OriginalMember(owner = "YHTUMUXE", name = "a", descriptor = "(II)V")
    public final void method579(int arg0, int arg1) {
        this.field1622 += arg0;
        if (arg1 < this.field1624 || arg1 > this.field1624) {
            this.field1626 = 397;
        }
        while (true) {
            do {
                do {
                    if (this.field1622 <= this.field1623.field1371.method413(this.field1621, false)) {
                        return;
                    }
                    this.field1622 -= this.field1623.field1371.method413(this.field1621, false) + 1;
                    this.field1621++;
                } while (this.field1621 < this.field1623.field1371.field1185);
            } while (this.field1621 >= 0 && this.field1621 < this.field1623.field1371.field1185);
            this.field1621 = 0;
            this.field1620 = true;
        }
    }

    @OriginalMember(owner = "YHTUMUXE", name = "<init>", descriptor = "(IIIZIIII)V")
    public class69(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!arg3) {
            this.field1626 = -13;
        }
        this.field1623 = class55.field1367[arg2];
        this.field1616 = arg5;
        this.field1617 = arg7;
        this.field1618 = arg0;
        this.field1619 = arg1;
        this.field1627 = arg4 + arg6;
        this.field1620 = false;
    }
}
