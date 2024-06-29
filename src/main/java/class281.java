import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gia")
public class class281 {

    @OriginalMember(owner = "client!gia", name = "e", descriptor = "I")
    public int field4322 = 128;

    @OriginalMember(owner = "client!gia", name = "n", descriptor = "I")
    public int field4331 = 128;

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!gia", name = "h", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!gia", name = "m", descriptor = "I")
    public int field4330;

    @OriginalMember(owner = "client!gia", name = "l", descriptor = "I")
    public static int field4329 = 0;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!gia", name = "d", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!gia", name = "f", descriptor = "I")
    public int field4323;

    @OriginalMember(owner = "client!gia", name = "g", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!gia", name = "i", descriptor = "I")
    public int field4326;

    @OriginalMember(owner = "client!gia", name = "j", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!gia", name = "k", descriptor = "I")
    public int field4328;

    @OriginalMember(owner = "client!gia", name = "o", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!gia", name = "p", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lgia;B)V")
    public final void method1901(class281 arg0, byte arg1) {
        this.field4330 = arg0.field4330;
        this.field4320 = arg0.field4320;
        if (arg1 != -103) {
            return;
        }
        this.field4325 = arg0.field4325;
        this.field4322 = arg0.field4322;
        field4324++;
        this.field4319 = arg0.field4319;
        this.field4331 = arg0.field4331;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)Lgia;")
    public final class281 method1902(byte arg0) {
        field4321++;
        if (arg0 != 91) {
            this.field4320 = 36;
        }
        return new class281(this.field4319, this.field4322, this.field4331, this.field4325, this.field4320, this.field4330);
    }

    @OriginalMember(owner = "client!gia", name = "b", descriptor = "(B)V")
    public static final void method1903(byte arg0) {
        class76.field1020.method759(110);
        field4318++;
        if (arg0 <= 69) {
            field4329 = -66;
        }
        class733.field10242 = null;
        class368.field5295 = null;
        class420.field5909 = 1;
    }

    @OriginalMember(owner = "client!gia", name = "a", descriptor = "(II)I")
    public static int method1904(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!gia", name = "c", descriptor = "(B)V")
    public static final void method1905(byte arg0) {
        class546.field7706 = -1;
        field4333++;
        class609.field8591 = null;
        if (arg0 <= 65) {
            field4329 = -45;
        }
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(I)V")
    public class281(int arg0) {
        this.field4319 = arg0;
    }

    @OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(IIIIII)V")
    private class281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4325 = arg3;
        this.field4319 = arg0;
        this.field4320 = arg4;
        this.field4322 = arg1;
        this.field4330 = arg5;
        this.field4331 = arg2;
    }
}
