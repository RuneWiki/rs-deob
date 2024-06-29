import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class87 extends class212 {

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public int field1347 = 0;

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "Ll;")
    public static class101 field1348 = new class101(5000);

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "Lqe;")
    public static class168 field1354 = class66.method448("b12_full", 124);

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "Lwd;")
    public static class67 field1355;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "[Lgd;")
    public static class65[] field1356;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIILqf;JLqf;Lqf;)V")
    public static final void method573(int arg0, int arg1, int arg2, int arg3, class13 arg4, long arg5, class13 arg6, class13 arg7) {
        class36 var9 = new class36();
        var9.field446 = arg4;
        var9.field451 = arg1 * 128 + 64;
        var9.field454 = arg2 * 128 + 64;
        var9.field457 = arg3;
        var9.field455 = arg5;
        var9.field441 = arg6;
        var9.field447 = arg7;
        int var10 = 0;
        class177 var11 = class254.field4395[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3115; var12++) {
                class169 var13 = var11.field3090[var12];
                if ((var13.field2937 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2934.method43();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field448 = -var10;
        if (class254.field4395[arg0][arg1][arg2] == null) {
            class254.field4395[arg0][arg1][arg2] = new class177(arg0, arg1, arg2);
        }
        class254.field4395[arg0][arg1][arg2].field3114 = var9;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZI)Lqe;")
    public static final class168 method574(int arg0, boolean arg1, int arg2) {
        if (arg0 != 26207) {
            field1354 = null;
        }
        field1350++;
        return class135.method912(arg2, (byte) 45, 10, arg1);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BII)V")
    public static final void method575(byte arg0, int arg1, int arg2) {
        if (arg0 != -23) {
            method580(true);
        }
        field1353++;
        if (class97.method636(arg1, -127)) {
            class151.method1003(class108.field1741[arg1], arg2, 0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(JB)V")
    public static final void method576(long arg0, byte arg1) {
        class180.method1191(arg1 ^ 0xFFFFA163);
        field1345++;
        field1348.field1821 = 0;
        if (arg1 == 28) {
            field1348.method768(218, 7295);
            field1348.method739(arg0, arg1 ^ 0xFFFFA589);
            class189.field3297 = 1;
            class2.field20 = 2;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLnh;)V")
    public final void method577(boolean arg0, class112 arg1) {
        field1358++;
        while (true) {
            int var3 = arg1.method758(true);
            if (var3 == 0) {
                if (arg0) {
                    field1355 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method579(-29765, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)J")
    public static final long method578(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        return var3 == null || var3.field3103 == null ? 0L : var3.field3103.field3443;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILnh;)V")
    private final void method579(int arg0, int arg1, class112 arg2) {
        if (arg0 != -29765) {
            field1354 = null;
        }
        field1351++;
        if (arg1 == 2) {
            this.field1347 = arg2.method731(false);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Z)V")
    public static void method580(boolean arg0) {
        field1356 = null;
        if (arg0) {
            field1354 = null;
        }
        field1348 = null;
        field1354 = null;
        field1355 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZBLoe;Loe;)V")
    public static final void method581(boolean arg0, byte arg1, class256 arg2, class256 arg3) {
        class45.field583 = arg0;
        class60.field818 = arg3;
        class145.field2533 = arg2;
        class145.field2536 = new class2(30);
        int var4 = 125 / ((arg1 + 26) / 35);
        field1346++;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V")
    public static final void method582(int arg0) {
        class46.field592.method849((byte) -92);
        if (arg0 < -83) {
            field1352++;
        }
    }
}
