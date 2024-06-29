import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class59 {

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Z")
    public boolean field969 = true;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public int field960;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "Lsb;")
    private static class98 field955 = class47.method368("Mar", 0);

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lsb;")
    private static class98 field957 = class47.method368("Jan", 0);

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lsb;")
    private static class98 field964 = class47.method368("Jul", 0);

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lsb;")
    private static class98 field958 = class47.method368("Feb", 0);

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lsb;")
    private static class98 field966 = class47.method368("Jun", 0);

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Lsb;")
    private static class98 field972 = class47.method368("Nov", 0);

    @OriginalMember(owner = "client!m", name = "h", descriptor = "Lsb;")
    private static class98 field962 = class47.method368("Aug", 0);

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Lsb;")
    private static class98 field970 = class47.method368("Sep", 0);

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lsb;")
    private static class98 field965 = class47.method368("Oct", 0);

    @OriginalMember(owner = "client!m", name = "u", descriptor = "Lsb;")
    private static class98 field975 = class47.method368("May", 0);

    @OriginalMember(owner = "client!m", name = "v", descriptor = "Lsb;")
    private static class98 field976 = class47.method368("Dec", 0);

    @OriginalMember(owner = "client!m", name = "w", descriptor = "Lsb;")
    private static class98 field977 = class47.method368("Apr", 0);

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[Lsb;")
    public static class98[] field963 = new class98[] { field957, field958, field955, field977, field975, field966, field964, field962, field970, field965, field972, field976 };

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lac;")
    public static class188 field967;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static final void method431(byte arg0) {
        if (class232.field3992 != -1) {
            class132.method995(class232.field3992, (byte) -126);
        }
        field956++;
        if (arg0 <= 77) {
            return;
        }
        for (int var1 = 0; var1 < class120.field2215; var1++) {
            if (class208.field3563[var1]) {
                class69.field1105[var1] = true;
            }
            class72.field1196[var1] = class208.field3563[var1];
            class208.field3563[var1] = false;
        }
        class139.field2467 = class236.field4071;
        class102.field1822 = -1;
        class151.field2784 = -1;
        class23.field470 = null;
        if (class232.field3992 != -1) {
            class120.field2215 = 0;
            class223.method1540(0, 0, (byte) 120, -1, class121.field2227, 0, 0, class232.field3992, class180.field3111);
        }
        class128.method954();
        class199.field3418 = 0;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
    public static void method432(byte arg0) {
        field955 = null;
        field962 = null;
        int var1 = -86 / ((arg0 + 63) / 38);
        field976 = null;
        field964 = null;
        field977 = null;
        field958 = null;
        field970 = null;
        field967 = null;
        field975 = null;
        field963 = null;
        field972 = null;
        field965 = null;
        field957 = null;
        field966 = null;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field960 = arg2;
        this.field968 = arg0;
        this.field974 = arg5;
        this.field971 = arg1;
        this.field973 = arg3;
        this.field969 = arg6;
        this.field959 = arg4;
    }
}
