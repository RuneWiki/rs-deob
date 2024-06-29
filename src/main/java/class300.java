import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class300 implements class719 {

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "Z")
    private boolean field4178 = false;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "Los;")
    private class253 field4179;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Z")
    private boolean field4180;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "B")
    private byte field4182;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    private int field4181;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    private int field4183;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field4177;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method2401(boolean arg0, boolean arg1) {
        if (this.field4177 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field4180;
        if (!this.field4178 && class402.method3156(this.field4177.Lock(0, this.field4181, var3 ? 8192 : 0, this.field4179.field3603), -1)) {
            this.field4178 = true;
            return this.field4179.field3603;
        } else if (arg1) {
            return null;
        } else {
            return (Buffer) null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)Z")
    public final boolean method2402(int arg0, int arg1, int arg2) {
        this.field4183 = arg1;
        if (arg0 != 13179) {
            this.field4177 = null;
        }
        this.field4182 = (byte) arg2;
        if (this.field4181 < this.field4183) {
            int var4 = 8;
            byte var5;
            if (this.field4180) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field4177 != null) {
                this.field4177.method3176(true);
            }
            this.field4177 = this.field4179.field3618.method3130(this.field4183, var4, 0, var5, this.field4177);
            this.field4181 = this.field4183;
        }
        return this.field4177 != null;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)I")
    public final int method2403(int arg0) {
        return arg0 == 26270 ? this.field4182 : 124;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLjaclib/memory/Source;II)Z")
    public final boolean method2404(byte arg0, Source arg1, int arg2, int arg3) {
        if (arg0 != 32) {
            this.method2403(39);
        }
        return this.method2402(arg0 ^ 0x335B, arg3, arg2) ? this.field4177.method3154(arg1, 0, 0, this.field4183, this.field4180 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)Z")
    public final boolean method2405(int arg0) {
        if (arg0 != -9200) {
            return true;
        } else if (this.field4178 && class402.method3156(this.field4177.Unlock(), -1)) {
            this.field4178 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Los;Z)V")
    public class300(class253 arg0, boolean arg1) {
        this.field4179 = arg0;
        this.field4180 = arg1;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
    public final void method2342(boolean arg0) {
        if (!arg0) {
            return;
        }
        if (this.field4177 != null) {
            this.field4177.method3176(true);
            this.field4177 = null;
        }
        this.field4183 = 0;
        this.field4181 = 0;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)I")
    public final int method2346(int arg0) {
        return arg0 == 34962 ? this.field4183 : -40;
    }
}
