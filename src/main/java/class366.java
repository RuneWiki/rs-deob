import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class366 extends class446 {

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "Lte;")
    public class367 field5162;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "Lbj;")
    public static class131 field5155 = new class131(64);

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "Lfc;")
    public static class141 field5154;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "Lnq;")
    public static class268 field5160;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "Ljava/lang/String;")
    public static String field5163;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "[Lsg;")
    public static class226[] field5158;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "[Lsg;")
    public static class226[] field5159;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
    public static final void method2358(byte arg0) {
        if (arg0 != 101) {
            field5159 = null;
        }
        if (class47.field656 != -1) {
            class195.method1259(false, -1, class47.field656, -1, false);
            class47.field656 = -1;
        }
        field5157++;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)I")
    public static final int method2359(boolean arg0, int arg1) {
        if (!arg0) {
            method2360(-88);
        }
        field5161++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
    public static void method2360(int arg0) {
        field5154 = null;
        field5155 = null;
        field5159 = null;
        field5163 = null;
        field5158 = null;
        if (arg0 != 0) {
            field5158 = null;
        }
        field5160 = null;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lte;)V")
    public class366(class367 arg0) {
        this.field5162 = arg0;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLnq;)V")
    public static final void method2361(byte arg0, class268 arg1) {
        class260.field3645 = 0;
        field5156++;
        if (arg0 <= 118) {
            method2360(119);
        }
        class446.field6256 = 0;
        class21.field380 = new class149();
        class106.field1440 = new class443[1024];
        class65.method505(arg1, (byte) 89);
        class318.method2063(70, arg1);
    }
}
