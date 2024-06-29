import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class63 {

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public int field799;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "Leba;")
    public static class550 field800 = new class550(14, 8);

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "[I")
    public static int[] field802 = new int[14];

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "F")
    public static float field803;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!nv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field801++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public static final void method367(byte arg0) {
        class380 var1 = class162.field2320;
        synchronized (class162.field2320) {
            class162.field2320.method2172(-15112);
            int var2 = 98 / ((-arg0 - 6) / 59);
        }
        field798++;
        class380 var3 = class83.field970;
        synchronized (class83.field970) {
            class83.field970.method2172(-15112);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(BC)B")
    public static final byte method368(byte arg0, char arg1) {
        field797++;
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (arg0 != -118) {
            field803 = -0.93527883F;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public static void method369(int arg0) {
        if (arg0 != 15423) {
            field800 = null;
        }
        field802 = null;
        field800 = null;
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(II)V")
    public class63(int arg0, int arg1) {
        this.field799 = arg0;
    }
}
