import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jagdx.IDirect3DVertexBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class137 implements class613 {

    @OriginalMember(owner = "client!as", name = "a", descriptor = "Z")
    private boolean field1998 = false;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Ltb;")
    private class364 field2004;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Z")
    private boolean field2002;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "B")
    private byte field1999;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    private int field2003;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "Ljagdx/IDirect3DVertexBuffer;")
    public IDirect3DVertexBuffer field2001;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(B)I", line = 5)
    public final int method991(byte arg0) {
        return arg0 == 47 ? this.field1999 : -24;
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Ltb;Z)V", line = 106)
    public class137(class364 arg0, boolean arg1) {
        this.field2004 = arg0;
        this.field2002 = arg1;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 22)
    public final void method7(int arg0) {
        if (this.field2001 != null) {
            this.field2001.method3496((byte) -80);
            this.field2001 = null;
        }
        if (arg0 <= -98) {
            this.field2003 = 0;
            this.field2000 = 0;
        }
    }

    @OriginalMember(owner = "client!as", name = "b", descriptor = "(B)Z", line = 40)
    public final boolean method992(byte arg0) {
        if (arg0 >= -15) {
            this.method994(-27, -60, -124, null);
        }
        if (this.field1998 && class446.method2640(108, this.field2001.Unlock())) {
            this.field1998 = false;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(III)Z", line = 63)
    public final boolean method993(int arg0, int arg1, int arg2) {
        if (arg1 != -6696) {
            return true;
        }
        this.field1999 = (byte) arg2;
        this.field2003 = arg0;
        if (this.field2003 > this.field2000) {
            int var4 = 8;
            byte var5;
            if (this.field2002) {
                var4 |= 0x200;
                var5 = 0;
            } else {
                var5 = 1;
            }
            if (this.field2001 != null) {
                this.field2001.method3496((byte) -80);
            }
            this.field2001 = this.field2004.field5204.method2657(this.field2003, var4, 0, var5, this.field2001);
            this.field2000 = this.field2003;
        }
        return this.field2001 != null;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I", line = 98)
    public final int method4(byte arg0) {
        if (arg0 != 1) {
            this.field2004 = null;
        }
        return this.field2003;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z", line = 116)
    public final boolean method994(int arg0, int arg1, int arg2, Source arg3) {
        if (this.method993(arg1, -6696, arg2)) {
            return this.field2001.method2665(arg3, 0, 0, this.field2003, this.field2002 ? 8192 : 0);
        } else {
            if (arg0 != 27774) {
                this.field2004 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 133)
    public final Buffer method995(boolean arg0, int arg1) {
        if (arg1 != 1614) {
            return (Buffer) null;
        } else if (this.field2001 == null) {
            return null;
        } else {
            boolean var3 = arg0 & this.field2002;
            if (!this.field1998 && class446.method2640(104, this.field2001.Lock(0, this.field2000, var3 ? 8192 : 0, this.field2004.field5205))) {
                this.field1998 = true;
                return this.field2004.field5205;
            } else {
                return null;
            }
        }
    }
}
