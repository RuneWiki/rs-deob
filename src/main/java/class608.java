import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class608 implements class415 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
    private boolean field8449 = false;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lega;")
    private class662 field8451;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
    private boolean field8454;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Ljg;")
    private class309 field8455;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    private int field8452;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    private int field8453;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field8450;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Z", line = 4)
    public final boolean method1121(boolean arg0) {
        if (this.field8449 && class446.method2528((byte) -114, this.field8450.Unlock())) {
            this.field8449 = false;
            return true;
        } else if (arg0) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)I", line = 25)
    public final int method905(boolean arg0) {
        if (!arg0) {
            this.field8452 = -53;
        }
        return this.field8453;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 36)
    public final Buffer method1119(int arg0, boolean arg1) {
        if (this.field8450 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field8454;
        if (!this.field8449 && class446.method2528((byte) 118, this.field8450.Lock(0, this.field8452, var3 ? 8192 : 0, this.field8451.field9292))) {
            this.field8449 = true;
            return this.field8451.field9292;
        } else {
            if (arg0 < 36) {
                this.field8455 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V", line = 62)
    public final void method1116(int arg0, int arg1) {
        int var3 = -128 / ((arg1 + 84) / 39);
        this.field8453 = this.field8455.field4267 * arg0;
        if (this.field8452 >= this.field8453) {
            return;
        }
        int var4 = 8;
        byte var5;
        if (this.field8454) {
            var5 = 0;
            var4 |= 0x200;
        } else {
            var5 = 1;
        }
        if (this.field8450 != null) {
            this.field8450.method3495(125);
        }
        this.field8450 = this.field8451.field9273.method2530(this.field8453, var4, class309.field4272 == this.field8455 ? 101 : 102, var5, this.field8450);
        this.field8452 = this.field8453;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Lega;Ljg;Z)V", line = 109)
    public class608(class662 arg0, class309 arg1, boolean arg2) {
        this.field8451 = arg0;
        this.field8454 = arg2;
        this.field8455 = arg1;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Ljg;", line = 99)
    public final class309 method1124(int arg0) {
        if (arg0 <= 113) {
            this.field8453 = 102;
        }
        return this.field8455;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V", line = 120)
    public final void method1122(int arg0) {
        if (this.field8450 != null) {
            this.field8450.method3495(111);
            this.field8450 = null;
        }
        if (arg0 != -1620) {
            this.field8451 = null;
        }
        this.field8452 = 0;
        this.field8453 = 0;
    }
}
