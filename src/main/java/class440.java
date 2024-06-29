import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class440 {

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Lph;")
    private class358 field6130;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Lau;")
    private class391 field6132;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Lbc;")
    private class503 field6126;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "Lpi;")
    public static class340 field6133 = new class340(96, 8);

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field6124;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field6125;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Lbt;")
    private class88 field6134;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[Lfa;")
    private class396[] field6121;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method2598(int arg0) {
        if (arg0 != -1) {
            method2599(null, (byte) 45);
        }
        field6133 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lsj;B)Ljava/lang/String;")
    public static final String method2599(class502 arg0, byte arg1) {
        field6129++;
        if (arg1 <= 76) {
            method2598(-82);
        }
        return arg0.field7375 == null || arg0.field7375.length() <= 0 ? arg0.field7391 : arg0.field7391 + class221.field2826.method1127(class379.field4920, false) + arg0.field7375;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljb;IBLjb;)Lfa;")
    public final class396 method2600(class374 arg0, int arg1, byte arg2, class374 arg3) {
        field6123++;
        if (arg2 != -67) {
            field6133 = null;
        }
        return this.method2603(arg3, (byte) -126, true, arg0, arg1);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)Z")
    public final boolean method2601(byte arg0) {
        field6128++;
        if (this.field6134 != null) {
            return true;
        }
        if (arg0 <= 27) {
            method2599(null, (byte) -34);
        }
        if (this.field6126 == null) {
            if (this.field6130.method2111(76)) {
                return false;
            }
            this.field6126 = this.field6130.method2106(255, 255, (byte) 0, 100, true);
        }
        if (this.field6126.field5569) {
            return false;
        } else {
            this.field6134 = new class88(this.field6126.method2370((byte) -32));
            this.field6121 = new class396[(this.field6134.field1223.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method2602(int arg0) {
        field6125++;
        if (this.field6121 == null) {
            return;
        }
        int var2 = 0;
        if (arg0 != 255) {
            return;
        }
        while (this.field6121.length > var2) {
            if (this.field6121[var2] != null) {
                this.field6121[var2].method2357((byte) 0);
            }
            var2++;
        }
        for (int var3 = 0; var3 < this.field6121.length; var3++) {
            if (this.field6121[var3] != null) {
                this.field6121[var3].method2360((byte) -46);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljb;BZLjb;I)Lfa;")
    private final class396 method2603(class374 arg0, byte arg1, boolean arg2, class374 arg3, int arg4) {
        if (arg1 > -118) {
            this.method2600(null, -87, (byte) -55, null);
        }
        field6124++;
        if (this.field6134 == null) {
            throw new RuntimeException();
        }
        this.field6134.field1176 = arg4 * 8 + 5;
        if (this.field6134.field1223.length <= this.field6134.field1176) {
            throw new RuntimeException();
        } else if (this.field6121[arg4] == null) {
            int var6 = this.field6134.method578(118);
            int var7 = this.field6134.method578(116);
            class396 var8 = new class396(arg4, arg0, arg3, this.field6130, this.field6132, var6, var7, arg2);
            this.field6121[arg4] = var8;
            return var8;
        } else {
            return this.field6121[arg4];
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lph;Lau;)V")
    public class440(class358 arg0, class391 arg1) {
        this.field6130 = arg0;
        this.field6132 = arg1;
        if (!this.field6130.method2111(-123)) {
            this.field6126 = this.field6130.method2106(255, 255, (byte) 0, 100, true);
        }
    }
}
