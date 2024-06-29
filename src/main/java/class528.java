import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class528 implements class241 {

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Z")
    private boolean field7084 = false;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
    private boolean field7081;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "Lbea;")
    private class225 field7083;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "B")
    private byte field7079;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    private int field7080;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    private int field7082;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field7078;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I", line = 5)
    public final int method2927(byte arg0) {
        if (arg0 != -22) {
            this.method2927((byte) -72);
        }
        return this.field7079;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIILjaclib/memory/Source;)Z", line = 15)
    public final boolean method1449(byte arg0, int arg1, int arg2, Source arg3) {
        if (this.method1450(-20279, arg2, arg1)) {
            return this.field7078.method2743(arg3, 0, 0, this.field7080, this.field7081 ? 8192 : 0);
        } else if (arg0 >= -79) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Z", line = 31)
    public final boolean method1450(int arg0, int arg1, int arg2) {
        this.field7080 = arg2;
        if (arg0 != -20279) {
            this.method1449((byte) 73, 31, -108, null);
        }
        this.field7079 = (byte) arg1;
        if (this.field7082 < this.field7080) {
            int var4 = 8;
            byte var5;
            if (this.field7081) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field7078 != null) {
                this.field7078.method3801(119);
            }
            this.field7078 = this.field7083.field2918.method2728(this.field7080, var4, 0, var5, this.field7078);
            this.field7082 = this.field7080;
        }
        return this.field7078 != null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 71)
    public final Buffer method1451(boolean arg0, byte arg1) {
        if (this.field7078 == null) {
            return null;
        }
        if (arg1 != 27) {
            this.method1450(118, -74, 74);
        }
        boolean var3 = arg0 & this.field7081;
        if (!this.field7084 && class483.method2718(-21593, this.field7078.Lock(0, this.field7082, var3 ? 8192 : 0, this.field7083.field2906))) {
            this.field7084 = true;
            return this.field7083.field2906;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I", line = 93)
    public final int method177(int arg0) {
        if (arg0 != 200) {
            this.method177(44);
        }
        return this.field7080;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z", line = 104)
    public final boolean method1448(int arg0) {
        if (this.field7084 && class483.method2718(-21593, this.field7078.Unlock())) {
            this.field7084 = false;
            return true;
        } else {
            if (arg0 != 13623) {
                this.field7083 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V", line = 126)
    public final void method176(boolean arg0) {
        if (arg0) {
            this.method1450(-75, -93, 67);
        }
        if (this.field7078 != null) {
            this.field7078.method3801(112);
            this.field7078 = null;
        }
        this.field7080 = 0;
        this.field7082 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lbea;Z)V", line = 146)
    public class528(class225 arg0, boolean arg1) {
        this.field7081 = arg1;
        this.field7083 = arg0;
    }
}
