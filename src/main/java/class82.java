import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class82 {

    @OriginalMember(owner = "client!ut", name = "e", descriptor = "[[F")
    public static float[][] field1722 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ut", name = "f", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
    public static final void method770(int arg0) {
        field1718++;
        if (arg0 != 24026) {
            field1722 = null;
        }
        class274.method1738((byte) 39, false);
        if (class42.field585 >= 0 && class42.field585 != 0) {
            class304.method1944(false, class42.field585);
            class42.field585 = -1;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "()V")
    public static final void method771() {
        class456.method2720(1, class138.field2320);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIII)I")
    public static final int method772(int arg0, int arg1, int arg2, int arg3) {
        field1719++;
        int var4 = arg2 & 0x3;
        if (~var4 == arg3) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
    public static void method773(byte arg0) {
        if (arg0 != -80) {
            method773((byte) 3);
        }
        field1722 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(BB)V")
    public static final void method774(byte arg0, byte arg1) {
        if (class249.field3848 == null) {
            class249.field3848 = new byte[4][class339.field5099][class484.field7129];
        }
        field1720++;
        int var2 = -49 / ((-arg1 - 38) / 53);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < class339.field5099; var4++) {
                for (int var5 = 0; var5 < class484.field7129; var5++) {
                    class249.field3848[var3][var4][var5] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(IIII)I")
    public static final int method775(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -103) {
            method770(-41);
        }
        field1721++;
        if ((class22.field333[arg3][arg0][arg2] & 0x8) == 0) {
            return arg3 <= 0 || (class22.field333[1][arg0][arg2] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }
}
