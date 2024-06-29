import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class151 extends class28 {

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "[I")
    public static int[] field3546 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "Lja;")
    private static class62 field3551 = class30.method243(43, "glow2:");

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "Lja;")
    public static class62 field3552 = class30.method243(43, "leuchten2:");

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "Lja;")
    public static class62 field3541 = class30.method243(43, "sl_arrows");

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Lja;")
    public static class62 field3549 = field3551;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "I")
    public static int field3544 = 0;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
    public static int field3555 = 1;

    @OriginalMember(owner = "client!wb", name = "lb", descriptor = "[I")
    public static int[] field3557 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!wb", name = "mb", descriptor = "Lja;")
    public static class62 field3558 = field3551;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public int field3547;

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
    public int field3548;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
    public int field3559;

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "Lpd;")
    public static class108 field3543;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "[I")
    public static int[] field3550;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "[Lq;")
    public static class114[] field3553;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public static void method1186(int arg0) {
        field3553 = null;
        field3549 = null;
        field3552 = null;
        field3558 = null;
        if (arg0 != -113) {
            field3550 = null;
        }
        field3557 = null;
        field3546 = null;
        field3543 = null;
        field3541 = null;
        field3550 = null;
        field3551 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ls;I)V")
    public final void method1187(class128 arg0, int arg1) {
        if (arg1 != -1) {
            method1189((byte) -85);
        }
        field3556++;
        while (true) {
            int var3 = arg0.method1025(255);
            if (var3 == 0) {
                return;
            }
            this.method1188(-32, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILs;I)V")
    private final void method1188(int arg0, class128 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3547 = arg1.method1041(212464720);
            this.field3559 = arg1.method1025(255);
            this.field3548 = arg1.method1025(255);
        }
        int var4 = 4 % ((32 - arg0) / 40);
        field3545++;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(B)V")
    public static final void method1189(byte arg0) {
        class118 var1 = class13.field315;
        synchronized (class13.field315) {
            if (arg0 < 72) {
                method1186(-53);
            }
            class84.field2031 = class68.field1693;
            if (class153.field3570 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class113.field2603[var2] = false;
                }
                class153.field3570 = class10.field258;
            } else {
                while (class153.field3570 != class10.field258) {
                    int var3 = class1.field17[class10.field258];
                    class10.field258 = class10.field258 + 1 & 0x7F;
                    if (var3 < 0) {
                        class113.field2603[~var3] = false;
                    } else {
                        class113.field2603[var3] = true;
                    }
                }
            }
            class68.field1693 = class34.field815;
        }
        field3554++;
    }
}
