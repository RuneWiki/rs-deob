import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class53 extends class89 {

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "Lha;")
    private static class46 field913 = class271.method1828("Loaded textures", -46);

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "Lha;")
    public static class46 field919 = class271.method1828("Schrifts-=tze geladen)3", -46);

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field916 = 0;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field917 = 0;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "Lha;")
    public static class46 field920 = field913;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "Lha;")
    public static class46 field918 = class271.method1828(")0", -46);

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "J")
    public static long field921 = 0L;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public static final void method381(int arg0) {
        class249.method1688((byte) -61);
        class96.method754(118);
        ++field914;
        class147.method1093((byte) -80);
        class12.method66(-68);
        class151.method1111((byte) -14);
        class219.method1524((byte) 64);
        class26.method188((byte) -100);
        class221.method1532(-25463);
        class236.method1602(109);
        class274.method1850((byte) -60);
        class163.method1183((byte) -7);
        int var1 = -61 % ((-26 - arg0) / 58);
        class275.method1859(108);
        class61.method414((byte) -52);
        class118.method944((byte) 77);
        class220.field3871.method83(25216);
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
    public static void method382(int arg0) {
        field920 = null;
        if (arg0 != 0) {
            method382(2);
        }
        field918 = null;
        field913 = null;
        field919 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class53() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(BI)V")
    public static final void method383(byte arg0, int arg1) {
        class23.field327.method81((byte) 30, arg1);
        if (arg0 <= 119) {
            method381(-65);
        }
        ++field915;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field922;
        int var3 = -25 / ((arg1 - 51) / 44);
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            class104.method787(var4, 0, class241.field4284, class87.field1652[arg0]);
        }
        return var4;
    }
}
