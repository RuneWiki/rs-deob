import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class448;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class98 implements class508 {

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "Z")
    private boolean field1318 = false;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "Z")
    private boolean field1320;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "Lkaa;")
    private class44 field1323;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "B")
    private byte field1321;

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    private int field1322;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
    private int field1324;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field1319;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(B)V", line = 6)
    public final void method11(byte arg0) {
        if (this.field1319 != null) {
            this.field1319.method3597(100);
            this.field1319 = null;
        }
        this.field1324 = 0;
        this.field1322 = 0;
        int var2 = 13 % ((-arg0 - 86) / 37);
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z", line = 22)
    public final boolean method739(int arg0, int arg1, int arg2, Source arg3) {
        if (arg1 != -16501) {
            this.method743((byte) -28);
        }
        return this.method742(arg2, arg0, true) ? this.field1319.method2672(arg3, 0, 0, this.field1324, this.field1320 ? 8192 : 0) : false;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)Z", line = 38)
    public final boolean method740(int arg0) {
        if (this.field1318 && class448.method2666((byte) -94, this.field1319.Unlock())) {
            this.field1318 = false;
            return true;
        } else {
            if (arg0 < 82) {
                this.method16(76);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Lkaa;Z)V", line = 143)
    public class98(class44 arg0, boolean arg1) {
        this.field1320 = arg1;
        this.field1323 = arg0;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 61)
    public final Buffer method741(boolean arg0, boolean arg1) {
        if (this.field1319 == null) {
            return null;
        }
        boolean var3 = arg0 & this.field1320;
        if (!this.field1318 && class448.method2666((byte) 112, this.field1319.Lock(0, this.field1322, var3 ? 8192 : 0, this.field1323.field793))) {
            this.field1318 = true;
            return this.field1323.field793;
        } else if (arg1) {
            return (Buffer) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)I", line = 83)
    public final int method16(int arg0) {
        if (arg0 != 34962) {
            this.field1321 = -96;
        }
        return this.field1324;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IIZ)Z", line = 97)
    public final boolean method742(int arg0, int arg1, boolean arg2) {
        this.field1324 = arg1;
        if (!arg2) {
            this.method16(67);
        }
        this.field1321 = (byte) arg0;
        if (this.field1322 < this.field1324) {
            int var4 = 8;
            byte var5;
            if (this.field1320) {
                var5 = 0;
                var4 |= 0x200;
            } else {
                var5 = 1;
            }
            if (this.field1319 != null) {
                this.field1319.method3597(100);
            }
            this.field1319 = this.field1323.field797.method2657(this.field1324, var4, 0, var5, this.field1319);
            this.field1322 = this.field1324;
        }
        return this.field1319 != null;
    }

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "(B)I", line = 129)
    public final int method743(byte arg0) {
        if (arg0 != -86) {
            this.method739(-55, 120, 57, null);
        }
        return this.field1321;
    }
}
