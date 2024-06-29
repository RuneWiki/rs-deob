import jaclib.memory.Buffer;
import jagdx.IDirect3DIndexBuffer;
import jagdx.class410;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class527 implements class321 {

    @OriginalMember(owner = "client!te", name = "d", descriptor = "Z")
    private boolean field7400 = false;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lbv;")
    private class256 field7401;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "Z")
    private boolean field7397;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lge;")
    private class608 field7403;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    private int field7398;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    private int field7399;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Ljagdx/IDirect3DIndexBuffer;")
    public IDirect3DIndexBuffer field7402;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)Z")
    public final boolean method616(byte arg0) {
        if (this.field7400 && class410.method2428(this.field7402.Unlock(), (byte) -103)) {
            this.field7400 = false;
            return true;
        } else {
            if (arg0 > -65) {
                this.field7400 = false;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
    public final void method1477(int arg0, int arg1) {
        this.field7399 = this.field7403.field8755 * arg1;
        if (arg0 != -18855) {
            this.method620(101);
        }
        if (this.field7399 <= this.field7398) {
            return;
        }
        int var3 = 8;
        byte var4;
        if (this.field7397) {
            var4 = 0;
            var3 |= 0x200;
        } else {
            var4 = 1;
        }
        if (this.field7402 != null) {
            this.field7402.method3306((byte) 123);
        }
        this.field7402 = this.field7401.field3527.method2429(this.field7399, var3, class608.field8760 == this.field7403 ? 101 : 102, var4, this.field7402);
        this.field7398 = this.field7399;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method613(boolean arg0, int arg1) {
        boolean var3 = arg0 & this.field7397;
        if (arg1 != -25838) {
            this.method1478(-87);
        }
        if (!this.field7400 && class410.method2428(this.field7402.Lock(0, this.field7398, var3 ? 8192 : 0, this.field7401.field3540), (byte) 21)) {
            this.field7400 = true;
            return this.field7401.field3540;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(I)Lge;")
    public final class608 method1478(int arg0) {
        if (arg0 != -13339) {
            this.method616((byte) 43);
        }
        return this.field7403;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)I")
    public final int method620(int arg0) {
        if (arg0 > -120) {
            this.field7401 = null;
        }
        return this.field7399;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public final void method618(byte arg0) {
        if (this.field7402 != null) {
            this.field7402.method3306((byte) -44);
            this.field7402 = null;
        }
        this.field7398 = 0;
        this.field7399 = 0;
        if (arg0 <= 11) {
            this.field7401 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lbv;Lge;Z)V")
    public class527(class256 arg0, class608 arg1, boolean arg2) {
        this.field7401 = arg0;
        this.field7397 = arg2;
        this.field7403 = arg1;
    }
}
