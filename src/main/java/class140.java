import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class class140 extends class507 {

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "Z")
    public volatile boolean field1861 = true;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "Lao;")
    public static class191 field1865 = new class191(14, 6);

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "Z")
    public boolean field1863;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "Z")
    public boolean field1864;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 11)
    public static final void method865(int arg0, int arg1) {
        field1867++;
        if (arg1 == 6 && class372.method2199(-67, arg0)) {
            class355.method2090(-1, class339.field4491[arg0], 0);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZZ)V", line = 31)
    public static final void method866(int arg0, int arg1, boolean arg2, boolean arg3) {
        field1866++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        } else if (arg2) {
            class286.field3762 = arg0;
            class124.field1610 = arg1;
            class495.field7227 = arg3;
        }
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)V", line = 47)
    public static void method867(int arg0) {
        if (arg0 != 48000) {
            method867(-6);
        }
        field1865 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I")
    public abstract int method864(byte arg0);

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)[B")
    public abstract byte[] method868(int arg0);
}
