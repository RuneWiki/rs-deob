import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class493 extends class108 {

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public int field6885;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "I")
    public int field6884;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Lpaa;")
    public static class317 field6883 = new class317(9, 7);

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field6878;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field6880;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field6881;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field6882;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
    public final int method2765(byte arg0) {
        field6878++;
        int var2 = 10 / ((60 - arg0) / 63);
        return this.field6885 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
    public final boolean method2766(int arg0) {
        if (arg0 == 1204238977) {
            field6880++;
            return (this.field6885 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Z")
    public final boolean method2767(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            field6882++;
            return (this.field6885 >> 22 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)I")
    public final int method2768(int arg0) {
        field6886++;
        if (arg0 != 19270) {
            this.method2769((byte) -33);
        }
        return class579.method3256(1725753323, this.field6885);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)Z")
    public final boolean method2769(byte arg0) {
        if (arg0 <= 40) {
            field6883 = null;
        }
        field6879++;
        return (this.field6885 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static void method2770(int arg0) {
        if (arg0 <= 50) {
            method2770(-6);
        }
        field6883 = null;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(II)V")
    public class493(int arg0, int arg1) {
        this.field6885 = arg0;
        this.field6884 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Z")
    public final boolean method2771(int arg0, int arg1) {
        field6881++;
        if (arg0 == 0) {
            return (this.field6885 >> arg1 + 1 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
    public static final void method2772(boolean arg0, int arg1) {
        if (class96.field1294 != null) {
            class96.field1294.method3271((byte) 110);
            class96.field1294 = null;
        }
        field6887++;
        class294.field3824 = 0;
        class485.method2738(14);
        class555.method3110();
        if (arg1 != 18747) {
            field6883 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            class15.field154[var2].method785(2097152);
        }
        class207.method1319(64, false);
        System.gc();
        client.method3573(2, 70);
        class325.field4460 = -1;
        class54.field726 = false;
        class646.method3716(true, (byte) -50);
        class58.field786 = 0;
        class460.field6561 = 0;
        class190.field2449 = 0;
        class525.field7310 = 0;
        class403.field5520 = 0;
        class61.field845 = 0;
        for (int var3 = 0; var3 < class610.field8771.length; var3++) {
            class610.field8771[var3] = null;
        }
        class369.method2262(0);
        for (int var4 = 0; var4 < 2048; var4++) {
            class364.field5092[var4] = null;
        }
        class551.field7652 = 0;
        class131.field1619.method3472((byte) -128);
        class604.field8710 = 0;
        class241.field3066.method3472((byte) -128);
        class529.method2951(0);
        class53.field706 = 0;
        class257.field3191.method2359(-19839);
        class269.method1645(false);
        class214.method1391(-18053);
        class151.field1993 = 0L;
        class341.field4741 = null;
        if (arg0) {
            class597.method3438((byte) 124, 11);
            return;
        }
        class597.method3438((byte) 124, 2);
        try {
            class499.method2793("loggedout", (byte) -115, class31.field488.field3644);
        } catch (Throwable var5) {
        }
    }
}
