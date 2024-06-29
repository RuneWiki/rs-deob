import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class151 extends class363 {

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public int field1910;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "[B")
    public byte[] field1907;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public int field1909;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Z")
    public boolean field1906;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lme;)Lhh;")
    public final class151 method1032(class277 arg0) {
        this.field1907 = arg0.method1822(1109803458, this.field1907);
        this.field1910 = arg0.method1823(0, this.field1910);
        if (this.field1909 == this.field1908) {
            this.field1908 = this.field1909 = arg0.method1819(false, this.field1908);
        } else {
            this.field1908 = arg0.method1819(false, this.field1908);
            this.field1909 = arg0.method1819(false, this.field1909);
            if (this.field1909 == this.field1908) {
                this.field1908--;
            }
        }
        return this;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BII)V")
    public class151(int arg0, byte[] arg1, int arg2, int arg3) {
        this.field1910 = arg0;
        this.field1907 = arg1;
        this.field1908 = arg2;
        this.field1909 = arg3;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(I[BIIZ)V")
    public class151(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4) {
        this.field1910 = arg0;
        this.field1907 = arg1;
        this.field1908 = arg2;
        this.field1909 = arg3;
        this.field1906 = arg4;
    }
}
