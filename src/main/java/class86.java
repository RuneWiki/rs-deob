import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class86 {

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Lpc;")
    private class21 field1416;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "Lsa;")
    private class257 field1417;

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Lre;")
    private class219 field1423;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lp;")
    public static class280 field1408 = class18.method140((byte) -122, "(Z");

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "I")
    public static int field1419 = -1;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "Lp;")
    public static class280 field1413 = class18.method140((byte) -121, "0(U");

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "Z")
    public static boolean field1422 = false;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lp;")
    public static class280 field1409 = class18.method140((byte) -128, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1406 = 0;

    @OriginalMember(owner = "client!ai", name = "y", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Ltg;")
    public static class180 field1410;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "Llj;")
    private class25 field1427;

    @OriginalMember(owner = "client!ai", name = "z", descriptor = "[Lgj;")
    private class230[] field1429;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILpa;ILpa;)Lgj;")
    public final class230 method612(int arg0, class211 arg1, int arg2, class211 arg3) {
        if (arg2 == 229) {
            field1415++;
            return this.method615(arg3, arg1, arg0, true, (byte) 15);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
    public static final void method613(int arg0, int arg1) {
        field1421++;
        if (arg0 != -27280) {
            field1422 = true;
        }
        if (class145.field2531 == null || class145.field2531.length < arg1) {
            class145.field2531 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)Z")
    public final boolean method614(int arg0) {
        field1404++;
        if (this.field1427 != null) {
            return true;
        } else if (arg0 == 5) {
            if (this.field1423 == null) {
                if (this.field1417.method1735(false)) {
                    return false;
                }
                this.field1423 = this.field1417.method1745(255, true, (byte) 0, 255, 127);
            }
            if (this.field1423.field721) {
                return false;
            } else {
                this.field1427 = new class25(this.field1423.method324(arg0 ^ 0xFFFFFF8F));
                this.field1429 = new class230[(this.field1427.field475.length - 5) / 8];
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lpa;Lpa;IZB)Lgj;")
    private final class230 method615(class211 arg0, class211 arg1, int arg2, boolean arg3, byte arg4) {
        field1418++;
        if (this.field1427 == null) {
            throw new RuntimeException();
        }
        this.field1427.field481 = arg2 * 8 + 5;
        if (this.field1427.field481 >= this.field1427.field475.length) {
            throw new RuntimeException();
        } else if (this.field1429[arg2] == null) {
            int var6 = this.field1427.method199((byte) -85);
            if (arg4 != 15) {
                this.field1416 = null;
            }
            int var7 = this.field1427.method199((byte) -85);
            class230 var8 = new class230(arg2, arg0, arg1, this.field1417, this.field1416, var6, var7, arg3);
            this.field1429[arg2] = var8;
            return var8;
        } else {
            return this.field1429[arg2];
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public final void method616(int arg0) {
        field1420++;
        if (this.field1429 == null) {
            return;
        }
        for (int var2 = arg0; var2 < this.field1429.length; var2++) {
            if (this.field1429[var2] != null) {
                this.field1429[var2].method1548((byte) -127);
            }
        }
        for (int var3 = 0; var3 < this.field1429.length; var3++) {
            if (this.field1429[var3] != null) {
                this.field1429[var3].method1543(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public static void method617(int arg0) {
        field1408 = null;
        field1413 = null;
        if (arg0 == 8) {
            field1410 = null;
            field1409 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBIII)V")
    public static final void method618(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class34.field627.field481 = 0;
        field1412++;
        class34.field627.method227(-20435, 229);
        class34.field627.method227(-20435, arg2);
        class34.field627.method227(-20435, arg0);
        class34.field627.method214(-3, arg4);
        if (arg1 > -116) {
            field1413 = null;
        }
        class34.field627.method214(-3, arg3);
        class120.field2128 = -3;
        class133.field2366 = 1;
        class235.field4096 = 0;
        class154.field2664 = 0;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Llj;I)Lb;")
    public static final class83 method619(class25 arg0, int arg1) {
        int var2 = -18 / ((-arg1 - 50) / 53);
        field1407++;
        return new class83(arg0.method191(-124), arg0.method191(-121), arg0.method191(-117), arg0.method191(-124), arg0.method230(15046), arg0.method230(15046), arg0.method189((byte) -103));
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lsa;Lpc;)V")
    public class86(class257 arg0, class21 arg1) {
        this.field1416 = arg1;
        this.field1417 = arg0;
        if (!this.field1417.method1735(false)) {
            this.field1423 = this.field1417.method1745(255, true, (byte) 0, 255, 121);
        }
    }
}
