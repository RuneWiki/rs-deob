import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class257 extends class141 {

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    private final int field4450;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    private final int field4456;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    private final int field4444;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    private final int field4457;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    private final int field4449;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    private final int field4442;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    private final int field4448;

    @OriginalMember(owner = "client!ai", name = "A", descriptor = "I")
    private final int field4454;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "Lke;")
    public static class256 field4453 = class316.method2202("mapfunction", 27626);

    @OriginalMember(owner = "client!ai", name = "B", descriptor = "Z")
    public static boolean field4455 = true;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field4441;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "[[[B")
    public static byte[][][] field4452;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V", line = 8)
    public final void method630(int arg0, int arg1, int arg2) {
        if (arg1 == 15015) {
            field4443++;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(III)V", line = 24)
    public final void method634(int arg0, int arg1, int arg2) {
        field4446++;
        if (arg1 != -1) {
            field4445 = 80;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V", line = 48)
    public static void method1812(byte arg0) {
        field4452 = (byte[][][]) null;
        if (arg0 == 15) {
            field4453 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 60)
    public class257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4450 = arg0;
        this.field4456 = arg5;
        this.field4444 = arg3;
        this.field4457 = arg6;
        this.field4449 = arg1;
        this.field4442 = arg2;
        this.field4448 = arg4;
        this.field4454 = arg7;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V", line = 85)
    public final void method629(int arg0, int arg1, int arg2) {
        field4447++;
        int var4 = this.field4450 * arg0 >> 12;
        int var5 = this.field4442 * arg0 >> 12;
        if (arg2 != 0) {
            return;
        }
        int var6 = this.field4449 * arg1 >> 12;
        int var7 = this.field4456 * arg1 >> 12;
        int var8 = this.field4444 * arg1 >> 12;
        int var9 = this.field4448 * arg0 >> 12;
        int var10 = this.field4457 * arg0 >> 12;
        int var11 = this.field4454 * arg1 >> 12;
        class102.method740(var4, var9, var10, var7, (byte) 87, this.field2482, var6, var5, var8, var11);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)I", line = 112)
    public static final int method1813(boolean arg0, int arg1) {
        field4441++;
        return arg0 ? -6 : (arg1 & 0x3F94F) >> 11;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 123)
    public static final void method1814(int arg0) {
        field4451++;
        class183.field3236 = 0;
        class132.field2303 = 0;
        class216.method1509((byte) 83);
        class183.method1339(true);
        class144.method1051(-97);
        for (int var1 = 0; var1 < class183.field3236; var1++) {
            int var2 = class164.field2906[var1];
            if (class45.field840 != class187.field3281[var2].field1199) {
                if (class187.field3281[var2].field4860.method567(-1)) {
                    class207.method1464(-123, class187.field3281[var2]);
                }
                class187.field3281[var2].method1960(-1403, (class74) null);
                class187.field3281[var2] = null;
            }
        }
        if (class290.field5027 != class23.field302.field738) {
            throw new RuntimeException("gnp1 pos:" + class23.field302.field738 + " psize:" + class290.field5027);
        }
        for (int var3 = 0; var3 < class311.field5357; var3++) {
            if (class187.field3281[class141.field2480[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class311.field5357);
            }
        }
        if (arg0 != 8460) {
            method1812((byte) -13);
        }
    }
}
