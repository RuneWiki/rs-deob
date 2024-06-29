import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class686;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class152 implements class467 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Z")
    private boolean field1905 = false;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lui;")
    private class130 field1903;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "Z")
    private boolean field1906;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "B")
    private byte field1904;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    private int field1908;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    private int field1909;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field1907;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Z", line = 8)
    public final boolean method1019(int arg0, int arg1, int arg2) {
        this.field1904 = (byte) arg0;
        this.field1908 = arg1;
        if (arg2 != -26802) {
            return true;
        }
        if (this.field1909 < this.field1908) {
            int var4 = 8;
            byte var5;
            if (this.field1906) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field1907 != null) {
                this.field1907.method1547((byte) -40);
            }
            this.field1907 = this.field1903.field1657.method3781(this.field1908, var4, 0, var5, this.field1907);
            this.field1909 = this.field1908;
        }
        return this.field1907 != null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I", line = 41)
    public final int method1020(int arg0) {
        if (arg0 > -13) {
            this.field1906 = false;
        }
        return this.field1904;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)Z", line = 55)
    public final boolean method1021(boolean arg0) {
        if (this.field1905 && class686.method3804(2005530599, this.field1907.Unlock())) {
            this.field1905 = false;
            return true;
        } else {
            return !arg0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V", line = 78)
    public final void method1022(byte arg0) {
        if (this.field1907 != null) {
            this.field1907.method1547((byte) -21);
            this.field1907 = null;
        }
        if (arg0 == 33) {
            this.field1908 = 0;
            this.field1909 = 0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljaclib/memory/Source;III)Z", line = 97)
    public final boolean method1023(Source arg0, int arg1, int arg2, int arg3) {
        if (this.method1019(arg1, arg2, -26802)) {
            return this.field1907.method3797(arg0, 0, 0, this.field1908, this.field1906 ? 8192 : 0);
        } else if (arg3 <= 7) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)I", line = 112)
    public final int method1024(byte arg0) {
        return arg0 == 54 ? this.field1908 : -7;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 123)
    public final Buffer method1025(boolean arg0, byte arg1) {
        if (this.field1907 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field1906;
        if (!this.field1905 && class686.method3804(arg1 + 2005530532, this.field1907.Lock(0, this.field1909, var3 ? 8192 : 0, this.field1903.field1646))) {
            this.field1905 = true;
            return this.field1903.field1646;
        } else {
            if (arg1 != 67) {
                this.field1906 = true;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lui;Z)V", line = 146)
    public class152(class130 arg0, boolean arg1) {
        this.field1903 = arg0;
        this.field1906 = arg1;
    }
}
