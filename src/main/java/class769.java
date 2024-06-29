import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class769 implements class517 {

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "Z")
    private boolean field10978 = false;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Los;")
    private class253 field10981;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Z")
    private boolean field10982;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Lon;")
    private class496 field10983;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    private int field10977;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    private int field10979;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field10980;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method2343(byte arg0, boolean arg1) {
        if (this.field10980 == null) {
            return null;
        } else if (arg0 == 54) {
            boolean var3 = arg1 & this.field10982;
            if (!this.field10978 && class402.method3156(this.field10980.Lock(0, this.field10979, var3 ? 8192 : 0, this.field10981.field3603), -1)) {
                this.field10978 = true;
                return this.field10981.field3603;
            } else {
                return null;
            }
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public final void method2344(int arg0, int arg1) {
        if (arg1 <= 23) {
            this.method2345(73);
        }
        this.field10977 = this.field10983.field7279 * arg0;
        if (this.field10979 >= this.field10977) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field10982) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field10980 != null) {
            this.field10980.method3176(true);
        }
        this.field10980 = this.field10981.field3618.method3138(this.field10977, var3, class496.field7282 == this.field10983 ? 101 : 102, var4, this.field10980);
        this.field10979 = this.field10977;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public final void method2342(boolean arg0) {
        if (this.field10980 != null) {
            this.field10980.method3176(true);
            this.field10980 = null;
        }
        this.field10979 = 0;
        if (!arg0) {
            this.field10979 = 63;
        }
        this.field10977 = 0;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)Lon;")
    public final class496 method2345(int arg0) {
        int var2 = -35 / ((58 - arg0) / 47);
        return this.field10983;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)Z")
    public final boolean method2339(boolean arg0) {
        if (!arg0) {
            this.method2339(true);
        }
        if (this.field10978 && class402.method3156(this.field10980.Unlock(), -1)) {
            this.field10978 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)I")
    public final int method2346(int arg0) {
        return arg0 == 34962 ? this.field10977 : 56;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Los;Lon;Z)V")
    public class769(class253 arg0, class496 arg1, boolean arg2) {
        this.field10981 = arg0;
        this.field10982 = arg2;
        this.field10983 = arg1;
    }
}
