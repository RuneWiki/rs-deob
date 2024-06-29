import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class723;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class226 implements class60 {

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "Z")
    private boolean field2978 = false;

    @OriginalMember(owner = "client!mr", name = "g", descriptor = "Z")
    private boolean field2981;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "Lcu;")
    private class287 field2975;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "B")
    private byte field2980;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "I")
    private int field2977;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
    private int field2979;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field2976;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)I", line = 5)
    public final int method819(byte arg0) {
        if (arg0 > -108) {
            this.field2977 = 127;
        }
        return this.field2979;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z", line = 15)
    public final boolean method473(int arg0, int arg1, int arg2, Source arg3) {
        if (this.method472(arg2, arg1, -2898)) {
            return this.field2976.method4002(arg3, 0, 0, this.field2979, this.field2981 ? 8192 : 0);
        } else {
            if (arg0 != 8660) {
                this.field2980 = 106;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Z", line = 30)
    public final boolean method472(int arg0, int arg1, int arg2) {
        this.field2979 = arg1;
        if (arg2 != -2898) {
            this.field2977 = -61;
        }
        this.field2980 = (byte) arg0;
        if (this.field2979 > this.field2977) {
            int var4 = 8;
            byte var5;
            if (this.field2981) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field2976 != null) {
                this.field2976.method2211(arg2 + 2913);
            }
            this.field2976 = this.field2975.field3643.method4016(this.field2979, var4, 0, var5, this.field2976);
            this.field2977 = this.field2979;
        }
        return this.field2976 != null;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lcu;Z)V", line = 144)
    public class226(class287 arg0, boolean arg1) {
        this.field2981 = arg1;
        this.field2975 = arg0;
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)I", line = 74)
    public final int method1456(int arg0) {
        if (arg0 != -2407) {
            this.method1456(-60);
        }
        return this.field2980;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 85)
    public final Buffer method471(byte arg0, boolean arg1) {
        if (this.field2976 == null) {
            return null;
        }
        if (arg0 != 28) {
            this.field2980 = 18;
        }
        boolean var3 = arg1 & this.field2981;
        if (!this.field2978 && class723.method3998(false, this.field2976.Lock(0, this.field2977, var3 ? 8192 : 0, this.field2975.field3636))) {
            this.field2978 = true;
            return this.field2975.field3636;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)Z", line = 106)
    public final boolean method475(byte arg0) {
        if (this.field2978 && class723.method3998(false, this.field2976.Unlock())) {
            this.field2978 = false;
            return true;
        } else {
            int var2 = -59 % ((arg0 - 3) / 53);
            return false;
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V", line = 126)
    public final void method474(int arg0) {
        if (this.field2976 != null) {
            this.field2976.method2211(126);
            this.field2976 = null;
        }
        this.field2979 = 0;
        this.field2977 = 0;
        if (arg0 > -74) {
            this.field2980 = 55;
        }
    }
}
