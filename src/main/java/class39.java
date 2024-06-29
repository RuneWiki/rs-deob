import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class39 extends class226 {

    @OriginalMember(owner = "client!m", name = "q", descriptor = "Llc;")
    public static class143 field671 = class66.method374("Utiliser", -1);

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Llc;")
    public static class143 field673 = class66.method374("Benutzen", -1);

    @OriginalMember(owner = "client!m", name = "u", descriptor = "Llc;")
    private static class143 field675 = class66.method374("shake:", -1);

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Llc;")
    public static class143 field665 = field675;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Z")
    public static boolean field672 = false;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Llc;")
    public static class143 field669 = field675;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "Lng;")
    public static class139 field667 = new class139(64);

    @OriginalMember(owner = "client!m", name = "z", descriptor = "Lng;")
    public static class139 field680 = new class139(64);

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "[[[B")
    public static byte[][][] field678;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public static void method250(int arg0) {
        field665 = null;
        field675 = null;
        field673 = null;
        int var1 = -28 / ((23 - arg0) / 62);
        field667 = null;
        field669 = null;
        field680 = null;
        field671 = null;
        field678 = null;
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)Lkh;")
    public static final class12 method251(int arg0) {
        if (arg0 != 5601) {
            method253(-100, (class7) null, (byte) -80);
        }
        field668++;
        try {
            return (class12) Class.forName("f").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class251();
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static final void method252(byte arg0) {
        if (class17.field298 != null) {
            class17.field298.method1682(1);
            class17.field298 = null;
        }
        if (arg0 > -26) {
            method256(false);
        }
        class30.method202(256);
        field676++;
        class58.method339();
        for (int var1 = 0; var1 < 4; var1++) {
            class171.field3052[var1].method644((byte) -69);
        }
        class164.method1086(false, (byte) 82);
        System.gc();
        class133.method795(-119, 2);
        class221.field4001 = -1;
        class175.field3142 = false;
        class128.method776((byte) -45, true);
        class141.field2466 = 0;
        class43.field807 = false;
        class272.field4854 = 0;
        class148.field2733 = 0;
        class66.field1233 = 0;
        for (int var2 = 0; var2 < class250.field4510.length; var2++) {
            class250.field4510[var2] = null;
        }
        class107.field1889 = 0;
        class212.field3945 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class6.field97[var3] = null;
            class157.field2830[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class259.field4648[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class130.field2306[var5][var6][var7] = null;
                }
            }
        }
        class111.method669((byte) 67);
        class104.field1825 = 0;
        class242.method1613((byte) 63);
        class29.method196(true, 99);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILgf;B)Lwa;")
    public static final class67 method253(int arg0, class7 arg1, byte arg2) {
        byte[] var3 = arg1.method33(arg0, arg2 ^ 0x3);
        field670++;
        if (var3 == null) {
            return null;
        } else if (arg2 == -83) {
            return new class67(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public static final void method254(int arg0) {
        if (arg0 != 127) {
            method251(87);
        }
        field674++;
        class143.field2562.method823(true);
        class31.field507.method823(true);
        class162.field2915.method823(true);
        class64.field1205.method823(true);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)I")
    public static final int method255(int arg0, byte arg1) {
        field677++;
        return arg1 == -93 ? arg0 & 0x7F : 60;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
    public static final void method256(boolean arg0) {
        if (!arg0) {
            class190.field3442.method824(-121);
            class117.field2086.method824(-123);
            class184.field3331.method824(-122);
            field666++;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Llc;I)I")
    public static final int method257(class143 arg0, int arg1) {
        field679++;
        if (arg1 < 11) {
            field672 = true;
        }
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class25.field421; var2++) {
            if (arg0.method895((byte) -106, class237.field4305[var2])) {
                return var2;
            }
        }
        return -1;
    }
}
