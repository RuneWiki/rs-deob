import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class528 extends class665 {

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "[B")
    public byte[] field7226;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[I")
    public static int[] field7227 = new int[1];

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "[I")
    public static int[] field7228 = new int[4096];

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "Lvh;")
    public static class328 field7230;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "Lvh;")
    public static class328 field7233;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field7229;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field7231;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field7232;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field7228[var0] = class82.method644(96, var0);
        }
        field7230 = new class328(8);
        field7233 = new class328(4);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 3)
    public static void method2929(int arg0) {
        field7230 = null;
        field7228 = null;
        field7227 = null;
        if (arg0 != 8) {
            field7230 = null;
        }
        field7233 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V", line = 17)
    public static final void method2930(boolean arg0, int arg1) {
        field7225++;
        if (class53.field758 != null) {
            class53.field758.method3127(108);
            class53.field758 = null;
        }
        class471.field6576 = 0;
        class658.method3646(14344);
        class223.method1427();
        for (int var2 = 0; var2 < 4; var2++) {
            class480.field6696[var2].method2612((byte) -111);
        }
        class212.method1390(arg1 + 62, false);
        System.gc();
        class394.method2247(-203790036, arg1);
        class267.field3792 = false;
        class623.field8670 = -1;
        class211.method1386(true, (byte) -62);
        class357.field5117 = 0;
        class161.field2465 = 0;
        class590.field8219 = 0;
        class511.field6989 = 0;
        class326.field4813 = 0;
        class124.field1726 = 0;
        for (int var3 = 0; var3 < class652.field9219.length; var3++) {
            class652.field9219[var3] = null;
        }
        class355.method2106((byte) 79);
        for (int var4 = 0; var4 < 2048; var4++) {
            class495.field6821[var4] = null;
        }
        class602.field8365 = 0;
        class323.field4762.method2060(0);
        class679.field9578 = 0;
        class179.field2656.method2060(0);
        class539.method2968(113);
        class384.field5379 = 0;
        class195.field2888.method869((byte) -109);
        class573.method3153((byte) -87);
        class511.method2838((byte) 8);
        class622.field8659 = null;
        class161.field2404 = 0L;
        if (arg0) {
            class94.method690(12, (byte) 125);
            return;
        }
        class94.method690(3, (byte) 125);
        try {
            class2.method11("loggedout", class188.field2779, 21190);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V", line = 92)
    public class528(byte[] arg0) {
        this.field7226 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI[B)I", line = 100)
    public static final int method2931(byte arg0, int arg1, byte[] arg2) {
        field7229++;
        int var3 = -3 / ((arg0 + 10) / 39);
        return class595.method3299(arg2, 0, (byte) 109, arg1);
    }
}
