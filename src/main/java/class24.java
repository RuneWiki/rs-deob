import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class24 {

    @OriginalMember(owner = "mapview!m", name = "c", descriptor = "Lr;")
    public static class33 field258 = class29.method192("Potters Wheel", (byte) 126);

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "Lr;")
    public static class33 field256 = class29.method192("Mace Shop", (byte) 126);

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "Lr;")
    public static class33 field257 = class29.method192("50(U", (byte) 126);

    @OriginalMember(owner = "mapview!m", name = "d", descriptor = "Lr;")
    public static class33 field259 = class29.method192("POH Portal", (byte) 126);

    @OriginalMember(owner = "mapview!m", name = "h", descriptor = "Lr;")
    public static class33 field263 = class29.method192(" )2 ", (byte) 126);

    @OriginalMember(owner = "mapview!m", name = "f", descriptor = "I")
    public static int field261 = -1;

    @OriginalMember(owner = "mapview!m", name = "i", descriptor = "I")
    public static volatile int field264 = 0;

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "Z")
    public static boolean field260 = true;

    @OriginalMember(owner = "mapview!m", name = "g", descriptor = "[[Ls;")
    public static class35[][] field262;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(B)V", line = 20)
    public static void method158(byte arg0) {
        field263 = null;
        field262 = null;
        field256 = null;
        field258 = null;
        if (arg0 == 64) {
            field257 = null;
            field259 = null;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(I)I", line = 35)
    public static final int method159(int arg0) {
        if (arg0 == 0) {
            return class30.field430 == null ? 0 : class30.field430[class26.field396];
        } else {
            return 70;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(IB)[B", line = 51)
    public static final synchronized byte[] method160(int arg0, byte arg1) {
        if (arg1 < 43) {
            field260 = false;
        }
        if (arg0 == 100 && class36.field499 > 0) {
            byte[] var2 = mapview.field294[--class36.field499];
            mapview.field294[class36.field499] = null;
            return var2;
        } else if (arg0 == 5000 && class20.field207 > 0) {
            byte[] var3 = mapview.field320[--class20.field207];
            mapview.field320[class20.field207] = null;
            return var3;
        } else if (arg0 == 30000 && class10.field125 > 0) {
            byte[] var4 = class8.field113[--class10.field125];
            class8.field113[class10.field125] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "mapview!m", name = "b", descriptor = "(B)Z", line = 87)
    public static final boolean method161(byte arg0) {
        class25 var1 = class35.field483;
        synchronized (class35.field483) {
            if (arg0 < 73) {
                return false;
            } else if (class35.field476 == class33.field472) {
                return false;
            } else {
                class8.field118 = class17.field186[class35.field476];
                class30.field434 = class33.field466[class35.field476];
                class35.field476 = class35.field476 + 1 & 0x7F;
                return true;
            }
        }
    }
}
