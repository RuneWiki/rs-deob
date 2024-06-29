import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class723;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class259 implements class246 {

    @OriginalMember(owner = "client!es", name = "c", descriptor = "Z")
    private boolean field3291 = false;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "Lew;")
    private class240 field3292;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Z")
    private boolean field3293;

    @OriginalMember(owner = "client!es", name = "g", descriptor = "Lcu;")
    private class287 field3295;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    private int field3289;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field3290;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(B)Lew;", line = 4)
    public final class240 method1516(byte arg0) {
        if (arg0 <= 99) {
            this.field3291 = false;
        }
        return this.field3292;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)I", line = 15)
    public final int method819(byte arg0) {
        return arg0 >= -108 ? -119 : this.field3289;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IB)V", line = 29)
    public final void method818(int arg0, byte arg1) {
        this.field3289 = this.field3292.field3090 * arg0;
        int var3 = 125 / ((49 - arg1) / 34);
        if (this.field3294 >= this.field3289) {
            return;
        }
        int var4 = 8;
        byte var5;
        if (this.field3293) {
            var5 = 0;
            var4 |= 0x200;
        } else {
            var5 = 1;
        }
        if (this.field3290 != null) {
            this.field3290.method2211(127);
        }
        this.field3290 = this.field3295.field3643.method4018(this.field3289, var4, class240.field3094 == this.field3292 ? 101 : 102, var5, this.field3290);
        this.field3294 = this.field3289;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 59)
    public final Buffer method1518(byte arg0, boolean arg1) {
        if (this.field3290 == null) {
            return null;
        }
        boolean var3 = arg1 & this.field3293;
        if (!this.field3291 && class723.method3998(false, this.field3290.Lock(0, this.field3294, var3 ? 8192 : 0, this.field3295.field3636))) {
            this.field3291 = true;
            return this.field3295.field3636;
        } else {
            if (arg0 <= 49) {
                this.field3295 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(B)Z", line = 82)
    public final boolean method1517(byte arg0) {
        if (this.field3291 && class723.method3998(false, this.field3290.Unlock())) {
            this.field3291 = false;
            return true;
        } else {
            return arg0 <= 115;
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lcu;Lew;Z)V", line = 124)
    public class259(class287 arg0, class240 arg1, boolean arg2) {
        this.field3292 = arg1;
        this.field3293 = arg2;
        this.field3295 = arg0;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 107)
    public final void method474(int arg0) {
        if (arg0 >= -74) {
            this.field3293 = true;
        }
        if (this.field3290 != null) {
            this.field3290.method2211(127);
            this.field3290 = null;
        }
        this.field3289 = 0;
        this.field3294 = 0;
    }
}
