import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class85 {

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "Lp;")
    private class284 field1552;

    @OriginalMember(owner = "client!ai", name = "x", descriptor = "Lgb;")
    private class147 field1561;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Ls;")
    private class237 field1553;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "[I")
    public static int[] field1543 = new int[2500];

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "Lqk;")
    public static class207 field1544 = class24.method212(255, " ");

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field1539 = 1;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "[I")
    public static int[] field1551 = new int[500];

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Lqk;")
    public static class207 field1554 = class24.method212(255, "comp-Btence ");

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
    public static int field1557 = 0;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "Z")
    public static boolean field1545 = true;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ai", name = "u", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ai", name = "w", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lv;")
    private class149 field1555;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Lpk;")
    public static class99 field1541;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "Lpk;")
    public static class99 field1542;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Lpk;")
    public static class99 field1549;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "[Lae;")
    private class169[] field1546;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public final void method625(boolean arg0) {
        field1548++;
        if (this.field1546 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field1546.length; var2++) {
            if (this.field1546[var2] != null) {
                this.field1546[var2].method1211((byte) -124);
            }
        }
        for (int var3 = 0; var3 < this.field1546.length; var3++) {
            if (this.field1546[var3] != null) {
                this.field1546[var3].method1214(76);
            }
        }
        if (!arg0) {
            this.field1561 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lpk;ILpk;)V")
    public static final void method626(class99 arg0, int arg1, class99 arg2) {
        class280.field4919 = arg0;
        if (arg1 <= 13) {
            field1545 = true;
        }
        field1556++;
        class88.field1592 = arg2;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILlk;Llk;I)Lae;")
    public final class169 method627(int arg0, class81 arg1, class81 arg2, int arg3) {
        if (arg3 != 2500) {
            this.method631(false, (class81) null, 98, 122, (class81) null);
        }
        field1550++;
        return this.method631(true, arg1, arg0, 8, arg2);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method628(byte arg0) {
        field1554 = null;
        field1542 = null;
        field1543 = null;
        if (arg0 != 14) {
            field1543 = null;
        }
        field1541 = null;
        field1544 = null;
        field1549 = null;
        field1551 = null;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lqk;I)I")
    public static final int method629(class207 arg0, int arg1) {
        field1559++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = arg1; var2 < class25.field534; var2++) {
            if (arg0.method1462(class129.field2240[var2], true)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)Z")
    public final boolean method630(boolean arg0) {
        field1558++;
        if (this.field1555 != null) {
            return true;
        }
        if (this.field1553 == null) {
            if (this.field1561.method1029(8512)) {
                return false;
            }
            this.field1553 = this.field1561.method1021(true, 255, 255, 31039, (byte) 0);
        }
        if (this.field1553.field4084) {
            return false;
        } else {
            this.field1555 = new class149(this.field1553.method1180((byte) 39));
            this.field1546 = new class169[(this.field1555.field2568.length - 5) / 8];
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLlk;IILlk;)Lae;")
    private final class169 method631(boolean arg0, class81 arg1, int arg2, int arg3, class81 arg4) {
        field1547++;
        if (this.field1555 == null) {
            throw new RuntimeException();
        }
        this.field1555.field2593 = arg2 * arg3 + 5;
        if (this.field1555.field2593 >= this.field1555.field2568.length) {
            throw new RuntimeException();
        } else if (this.field1546[arg2] == null) {
            int var6 = this.field1555.method1076(65280);
            int var7 = this.field1555.method1076(65280);
            class169 var8 = new class169(arg2, arg1, arg4, this.field1561, this.field1552, var6, var7, arg0);
            this.field1546[arg2] = var8;
            return var8;
        } else {
            return this.field1546[arg2];
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILv;)V")
    public static final void method632(int arg0, class149 arg1) {
        field1560++;
        if (arg0 < 61) {
            return;
        }
        byte[] var2 = new byte[24];
        if (class261.field4649 != null) {
            try {
                class261.field4649.method879(0, 0L);
                class261.field4649.method871(0, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1039((byte) 117, 0, 24, var2);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lgb;Lp;)V")
    public class85(class147 arg0, class284 arg1) {
        this.field1552 = arg1;
        this.field1561 = arg0;
        if (!this.field1561.method1029(8512)) {
            this.field1553 = this.field1561.method1021(true, 255, 255, 31039, (byte) 0);
        }
    }
}
