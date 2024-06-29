import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class89 extends class27 {

    @OriginalMember(owner = "client!om", name = "M", descriptor = "Lfd;")
    public static class130 field1371 = new class130(16);

    @OriginalMember(owner = "client!om", name = "N", descriptor = "[I")
    public static int[] field1372 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!om", name = "U", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!om", name = "V", descriptor = "I")
    public static int field1380 = 2301979;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public int field1370;

    @OriginalMember(owner = "client!om", name = "O", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!om", name = "P", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!om", name = "Q", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!om", name = "T", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!om", name = "R", descriptor = "Lnh;")
    public class55 field1376;

    @OriginalMember(owner = "client!om", name = "S", descriptor = "[B")
    public byte[] field1377;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([BII)I")
    public static final int method578(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return 36;
        } else {
            ++field1378;
            return class164.method1105(arg0, 4, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!om", name = "i", descriptor = "(I)[B")
    public final byte[] method164(int arg0) {
        ++field1374;
        if (arg0 != 25976) {
            return null;
        } else if (super.field338) {
            throw new RuntimeException();
        } else {
            return this.field1377;
        }
    }

    @OriginalMember(owner = "client!om", name = "l", descriptor = "(I)V")
    public static void method579(int arg0) {
        if (arg0 != 6443) {
            method578((byte[]) null, -56, 69);
        }
        field1371 = null;
        field1372 = null;
    }

    @OriginalMember(owner = "client!om", name = "h", descriptor = "(I)I")
    public final int method163(int arg0) {
        ++field1373;
        if (arg0 != 8) {
            this.field1370 = 114;
        }
        return super.field338 ? 0 : 100;
    }
}
