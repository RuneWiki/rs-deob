import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class284 {

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public int field4255 = 128;

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
    public int field4259 = 128;

    @OriginalMember(owner = "client!iw", name = "j", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!iw", name = "i", descriptor = "I")
    public int field4262;

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public int field4257;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)Liw;", line = 4)
    public final class284 method1832(int arg0) {
        if (arg0 != 128) {
            this.field4262 = -12;
        }
        field4258++;
        return new class284(this.field4263, this.field4259, this.field4255, this.field4262, this.field4254, this.field4257);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Liw;I)V", line = 15)
    public final void method1833(class284 arg0, int arg1) {
        this.field4257 = arg0.field4257;
        this.field4259 = arg0.field4259;
        this.field4254 = arg0.field4254;
        this.field4255 = arg0.field4255;
        field4261++;
        this.field4262 = arg0.field4262;
        this.field4263 = arg0.field4263;
        if (arg1 != 3) {
            this.field4262 = 10;
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(I)V", line = 78)
    public class284(int arg0) {
        this.field4263 = arg0;
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(IIIIII)V", line = 85)
    private class284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4259 = arg1;
        this.field4263 = arg0;
        this.field4262 = arg3;
        this.field4255 = arg2;
        this.field4257 = arg5;
        this.field4254 = arg4;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(BIZ)V", line = 48)
    public static final void method1834(byte arg0, int arg1, boolean arg2) {
        field4260++;
        int var3 = -45 % ((arg0 + 84) / 34);
        class689.field9707 = arg1;
        class460.field6579 = 3;
        class669.method3710((byte) 112, class136.field1994.field4938, class136.field1994.field4948);
        if (arg2) {
            class296.method1912(false, "", "", false);
        } else {
            class7.method40((byte) -22);
            class296.method1912(false, class103.field1615, class645.field9063, false);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(II)Z", line = 68)
    public static final boolean method1835(int arg0, int arg1) {
        if (arg1 < 12) {
            method1835(-9, 32);
        }
        field4256++;
        return (-arg0 & arg0) == arg0;
    }
}
