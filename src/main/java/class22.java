import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GJMFUMBP")
public class class22 extends class20 {

    @OriginalMember(owner = "client!GJMFUMBP", name = "m", descriptor = "Z")
    public boolean field884 = false;

    @OriginalMember(owner = "client!GJMFUMBP", name = "q", descriptor = "B")
    private byte field888 = 2;

    @OriginalMember(owner = "client!GJMFUMBP", name = "v", descriptor = "I")
    private int field893 = -80;

    @OriginalMember(owner = "client!GJMFUMBP", name = "w", descriptor = "LOKJTNJLE;")
    private class38 field894;

    @OriginalMember(owner = "client!GJMFUMBP", name = "r", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!GJMFUMBP", name = "s", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "client!GJMFUMBP", name = "t", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!GJMFUMBP", name = "u", descriptor = "I")
    public int field892;

    @OriginalMember(owner = "client!GJMFUMBP", name = "n", descriptor = "I")
    public int field885;

    @OriginalMember(owner = "client!GJMFUMBP", name = "o", descriptor = "I")
    private int field886;

    @OriginalMember(owner = "client!GJMFUMBP", name = "p", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "client!GJMFUMBP", name = "a", descriptor = "(B)LFLXAIVEA;")
    public final class16 method190(byte arg0) {
        class16 var2 = this.field894.method305();
        if (var2 == null) {
            return null;
        }
        int var3 = this.field894.field1175.field79[this.field886];
        if (this.field888 == arg0) {
            boolean var4 = false;
        } else {
            this.field893 = 460;
        }
        class16 var5 = new class16(var2, class37.method302(true, var3), true, (byte) 8, false);
        if (!this.field884) {
            var5.method225((byte) -116);
            var5.method226((byte) 8, var3);
            var5.field807 = null;
            var5.field806 = null;
        }
        if (this.field894.field1178 != 128 || this.field894.field1179 != 128) {
            var5.method234(this.field894.field1178, this.field894.field1178, (byte) 73, this.field894.field1179);
        }
        if (this.field894.field1180 != 0) {
            if (this.field894.field1180 == 90) {
                var5.method229((byte) 0);
            }
            if (this.field894.field1180 == 180) {
                var5.method229((byte) 0);
                var5.method229((byte) 0);
            }
            if (this.field894.field1180 == 270) {
                var5.method229((byte) 0);
                var5.method229((byte) 0);
                var5.method229((byte) 0);
            }
        }
        var5.method235(this.field894.field1181 + 64, this.field894.field1182 + 850, -30, -50, -30, true);
        return var5;
    }

    @OriginalMember(owner = "client!GJMFUMBP", name = "<init>", descriptor = "(IIIIIBII)V")
    public class22(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        this.field894 = class38.field1171[arg1];
        this.field889 = arg3;
        this.field890 = arg2;
        if (arg5 != 3) {
            throw new NullPointerException();
        }
        boolean var9 = false;
        this.field891 = arg7;
        this.field892 = arg6;
        this.field885 = arg0 + arg4;
        this.field884 = false;
    }

    @OriginalMember(owner = "client!GJMFUMBP", name = "a", descriptor = "(II)V")
    public final void method256(int arg0, int arg1) {
        this.field887 += arg0;
        if (arg1 != -10939) {
            return;
        }
        while (true) {
            do {
                do {
                    if (this.field887 <= this.field894.field1175.method12(this.field886, 214)) {
                        return;
                    }
                    this.field887 -= this.field894.field1175.method12(this.field886, 214);
                    this.field886++;
                } while (this.field886 < this.field894.field1175.field78);
            } while (this.field886 >= 0 && this.field886 < this.field894.field1175.field78);
            this.field886 = 0;
            this.field884 = true;
        }
    }
}
