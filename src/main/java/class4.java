import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 implements Runnable {

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "[Ljca;")
    public volatile class637[] field25 = new class637[2];

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "Z")
    public volatile boolean field27 = false;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "Z")
    public volatile boolean field24 = false;

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Lfaa;")
    public static class139 field26 = new class139(8);

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field31 = 0;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Lma;")
    public static class12 field30 = new class12();

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Laba;")
    public static class159 field32 = new class159();

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "Llga;")
    public static class663 field33 = new class663(4);

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "Llaa;")
    public class105 field23;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "Lsea;")
    public static class648 field34;

    @OriginalMember(owner = "client!ft", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        this.field24 = true;
        field28++;
        try {
            while (!this.field27) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class637 var2 = this.field25[var1];
                    if (var2 != null) {
                        var2.method3557((byte) -101);
                    }
                }
                class519.method2960(102, 10L);
                class95.method697(false, null, this.field23);
            }
        } catch (Exception var9) {
            class413.method2400(null, var9, (byte) -18);
        } finally {
            Object var6 = null;
            this.field24 = false;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)I", line = 39)
    public static final int method8(int arg0) {
        if (arg0 != 16) {
            field26 = null;
        }
        field29++;
        return 16;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V", line = 51)
    public static void method9(int arg0) {
        field30 = null;
        field26 = null;
        field33 = null;
        field32 = null;
        if (arg0 == 3) {
            field34 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIZII[B)V", line = 70)
    public static final void method10(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte[] arg5) {
        if (arg2) {
            method10(23, -59, true, 2, -48, null);
        }
        field22++;
        if (arg0 <= arg3) {
            return;
        }
        int var6 = arg3 + arg4;
        int var7 = arg0 - arg3 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg0 - arg3 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }
}
