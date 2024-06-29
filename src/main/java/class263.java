import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class263 {

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!kw", name = "k", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "[I")
    public static int[] field3899 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public int field3902;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public int field3903;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!kw", name = "j", descriptor = "I")
    public int field3907;

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "Lkw;")
    public class263 field3906;

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "Luu;")
    public class303 field3900;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)I")
    public static final int method1734(int arg0, int arg1) {
        if (arg0 != 17356) {
            field3899 = null;
        }
        field3905++;
        return (arg1 & 0x3FA49) >> 11;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
    public static void method1735(byte arg0) {
        field3899 = null;
        if (arg0 != -80) {
            field3899 = null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IB)Lkw;")
    public final class263 method1736(int arg0, byte arg1) {
        field3898++;
        int var3 = 59 % ((arg1 + 5) / 56);
        return new class263(this.field3904, arg0);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Lcha;")
    public final class230 method1737(int arg0) {
        field3901++;
        return arg0 == 1 ? class40.method277(this.field3904, true) : null;
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(II)V")
    public class263(int arg0, int arg1) {
        this.field3904 = arg0;
        this.field3908 = arg1;
    }
}
