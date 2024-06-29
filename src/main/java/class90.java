import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class90 extends class443 {

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "[B")
    public byte[] field1224;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lgb;")
    public static class115 field1220 = new class115(0, 0);

    @OriginalMember(owner = "client!tb", name = "G", descriptor = "I")
    public static int field1228 = 0;

    @OriginalMember(owner = "client!tb", name = "E", descriptor = "Luc;")
    public static class51 field1227 = new class51(64);

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "Lir;")
    public static class185 field1222;

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Lir;")
    public static class185 field1225;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)I", line = 5)
    public static final int method716(int arg0, int arg1, int arg2) {
        field1226++;
        if (arg2 == -1) {
            return 12345678;
        } else if (arg0 < 52) {
            return 19;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)Lpa;", line = 41)
    public static final class237 method717(byte arg0, int arg1) {
        field1219++;
        class237 var2 = (class237) class30.field497.method378((byte) 28, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -60) {
            field1220 = null;
        }
        byte[] var3 = class247.field3480.method1235(34, false, arg1);
        class237 var4 = new class237();
        if (var3 != null) {
            var4.method1538(0, arg1, new class341(var3));
        }
        class30.field497.method367((long) arg1, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Ljava/awt/Frame;Lde;I)V", line = 67)
    public static final void method718(Frame arg0, class364 arg1, int arg2) {
        while (true) {
            class225 var3 = arg1.method2391(arg0, -31);
            while (var3.field3104 == 0) {
                class31.method245(10L, -82);
            }
            if (var3.field3104 == 1) {
                if (arg2 != -16783) {
                    field1222 = null;
                }
                field1218++;
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class31.method245(100L, -107);
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)I", line = 93)
    public static final int method719(byte arg0) {
        int var1 = 61 / ((arg0 + 41) / 61);
        field1221++;
        return 6;
    }

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(B)V", line = 103)
    public static void method720(byte arg0) {
        field1227 = null;
        field1222 = null;
        field1225 = null;
        if (arg0 != 11) {
            method719((byte) -104);
        }
        field1220 = null;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([B)V", line = 121)
    public class90(byte[] arg0) {
        this.field1224 = arg0;
    }
}
