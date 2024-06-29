import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class16 {

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "B")
    private byte field328;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public int field327;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public int field330;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field329 = 0;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lok;")
    public static class160 field322 = new class160(64);

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "Lgd;")
    public static class325 field331 = new class325(64);

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field334 = 0;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Lpd;")
    public static class3 field332 = new class3(16);

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "F")
    public static float field333;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I", line = 6)
    public final int method191(boolean arg0) {
        field324++;
        return arg0 ? this.field328 & 0x7 : 73;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method192(int arg0, byte arg1) {
        field321++;
        class32.field496 = -1;
        if (arg0 == 37) {
            field333 = 3.0F;
        } else if (arg0 == 50) {
            field333 = 4.0F;
        } else if (arg0 == 75) {
            field333 = 6.0F;
        } else if (arg0 == 100) {
            field333 = 8.0F;
        } else if (arg0 == 200) {
            field333 = 16.0F;
        }
        class32.field496 = -1;
        if (arg1 < 92) {
            method193((byte) -112);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 62)
    public static void method193(byte arg0) {
        int var1 = 85 / ((arg0 - 45) / 42);
        field332 = null;
        field331 = null;
        field322 = null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)I", line = 84)
    public final int method194(byte arg0) {
        field326++;
        int var2 = -113 / ((arg0 - 41) / 62);
        return (this.field328 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V", line = 99)
    public class16() {
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Laj;)V", line = 107)
    public class16(class1 arg0) {
        this.field328 = arg0.method55(4);
        this.field320 = arg0.method56(19612);
        this.field327 = arg0.method33(false);
        this.field330 = arg0.method33(false);
        this.field325 = arg0.method33(false);
        this.field323 = arg0.method33(false);
    }
}
