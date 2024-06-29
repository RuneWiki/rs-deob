import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class259 {

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "S")
    public short field4187;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Leb;")
    public class371 field4188;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "B")
    public byte field4186;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lsq;")
    private class96 field4185;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "B")
    public byte field4184;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V", line = 5)
    public final void method1788(int arg0) {
        if (arg0 != 3187) {
            this.method1791(93);
        }
        this.field4185.method627(this.field4188);
        this.field4188.method86(this);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V", line = 17)
    public final void method1789(int arg0) {
        if (arg0 != -18430) {
            this.field4187 = -119;
        }
        this.field4185.method627(this.field4188);
        this.field4188.method81(this);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V", line = 32)
    public final void method1790(int arg0) {
        this.field4185.method627(this.field4188);
        this.field4188.method84(this);
        if (arg0 != -30208) {
            this.method1790(37);
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V", line = 43)
    public final void method1791(int arg0) {
        this.field4185.method627(this.field4188);
        this.field4188.method82(this);
        if (arg0 != 11864) {
            this.method1788(-75);
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lsq;Leb;III)V", line = 52)
    public class259(class96 arg0, class371 arg1, int arg2, int arg3, int arg4) {
        this.field4187 = (short) arg2;
        this.field4188 = arg1;
        this.field4186 = (byte) arg3;
        this.field4185 = arg0;
        this.field4184 = (byte) arg4;
    }
}
