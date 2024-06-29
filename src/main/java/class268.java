import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class268 extends OutputStream {

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Lpc;")
    public static class21 field4724 = null;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    public static int[] field4726 = new int[200];

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field4733 = 0;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Loh;")
    public static class263 field4735 = class253.method1681(-128, "b12_full");

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Ltf;")
    public static class104 field4721;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lkb;")
    public static class51 field4729;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "[Lbb;")
    public static class88[] field4725;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method1811(byte arg0) {
        field4729 = null;
        field4735 = null;
        field4721 = null;
        int var1 = 45 % ((arg0 + 46) / 43);
        field4726 = null;
        field4724 = null;
        field4725 = null;
    }

    @OriginalMember(owner = "client!kc", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4723++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lue;B)V")
    public static final void method1812(class86 arg0, byte arg1) {
        class222.field3930 = arg0;
        class112.field2101 = class222.field3930.method587((byte) 115, 16);
        if (arg1 != 81) {
            field4721 = null;
        }
        field4730++;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
    public static final void method1813(byte arg0) {
        field4732++;
        if (class186.field3353 != -1) {
            class51.method330(1334339848, class186.field3353);
        }
        int var1 = -115 % ((arg0 + 52) / 54);
        for (int var2 = 0; var2 < class257.field4471; var2++) {
            if (class21.field629[var2]) {
                class183.field3317[var2] = true;
            }
            class60.field1237[var2] = class21.field629[var2];
            class21.field629[var2] = false;
        }
        class53.field1120 = -1;
        class259.field4485 = null;
        class190.field3416 = -1;
        class7.field123 = class228.field4012;
        if (class186.field3353 != -1) {
            class257.field4471 = 0;
            class131.method846(0, class143.field2616, class186.field3353, (byte) 102, class138.field2558, 0, -1, 0, 0);
        }
        class133.method873();
        class187.field3369 = 0;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILfg;ZI)V")
    public static final void method1814(int arg0, int arg1, class12 arg2, boolean arg3, int arg4) {
        field4731++;
        if (!arg3) {
            method1813((byte) -75);
        }
        for (class255 var5 = (class255) class49.field1061.method1878(arg3); var5 != null; var5 = (class255) class49.field1061.method1881(86)) {
            if (var5.field4450 == arg4 && (arg1 * 128) == var5.field4452 && (arg0 * 128) == var5.field4447 && var5.field4433.field335 == arg2.field335) {
                if (var5.field4434 != null) {
                    class43.field933.method1136(var5.field4434);
                    var5.field4434 = null;
                }
                if (var5.field4432 != null) {
                    class43.field933.method1136(var5.field4432);
                    var5.field4432 = null;
                }
                var5.method1614(-1204826926);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)V")
    public static final void method1815(byte arg0, int arg1) {
        class64.field1289.method829(arg1, (byte) 116);
        if (arg0 < 61) {
            field4722 = -67;
        }
        field4734++;
        class163.field2964.method829(arg1, (byte) 104);
    }
}
