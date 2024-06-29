import java.awt.FontMetrics;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class36 {

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "Lna;")
    public static class26 field466 = class30.method205((byte) 43, "Key");

    @OriginalMember(owner = "mapview!t", name = "f", descriptor = "Lna;")
    public static class26 field470 = class30.method205((byte) 69, "loc)3dat");

    @OriginalMember(owner = "mapview!t", name = "c", descriptor = "Lna;")
    public static class26 field467 = class30.method205((byte) 92, "floorcol)3dat");

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "I")
    public static volatile int field465 = 0;

    @OriginalMember(owner = "mapview!t", name = "d", descriptor = "Lna;")
    public static class26 field468 = class30.method205((byte) 36, "null");

    @OriginalMember(owner = "mapview!t", name = "g", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field471;

    @OriginalMember(owner = "mapview!t", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field469;

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(II)I", line = 5)
    public static int method227(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)V", line = 14)
    public static final void method228(byte arg0) {
        if (class15.field204 != null) {
            class5 var1 = class15.field204;
            synchronized (class15.field204) {
                class15.field204 = null;
            }
        }
        int var3 = -82 / ((arg0 + 27) / 59);
    }

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(B)V", line = 51)
    public static void method229(byte arg0) {
        field466 = null;
        field471 = null;
        field467 = null;
        field470 = null;
        if (arg0 != -65) {
            field468 = null;
        }
        field468 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BLb;II)Z", line = 65)
    public static final boolean method230(byte arg0, class3 arg1, int arg2, int arg3) {
        if (arg0 <= 122) {
            return false;
        }
        byte[] var4 = arg1.method33(true, arg3, arg2);
        if (var4 == null) {
            return false;
        } else {
            class30.method204(var4, -86);
            return true;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BLc;[B)V", line = 93)
    public final void method231(byte arg0, class4 arg1, byte[] arg2) {
        if (arg1.field138[arg1.field132] != 31 || arg1.field138[arg1.field132 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field469 == null) {
            this.field469 = new Inflater(true);
        }
        try {
            this.field469.setInput(arg1.field138, arg1.field132 + 10, -10 - arg1.field132 - (8 - arg1.field138.length));
            this.field469.inflate(arg2);
        } catch (Exception var5) {
            this.field469.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 > -94) {
            this.method231((byte) -13, null, null);
        }
        this.field469.reset();
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(BILb;ILb;)Laa;", line = 120)
    public static final class2 method232(byte arg0, int arg1, class3 arg2, int arg3, class3 arg4) {
        if (arg0 < 67) {
            field470 = null;
        }
        return method230((byte) 123, arg2, arg1, arg3) ? class18.method115(arg4.method33(true, arg3, arg1), 99) : null;
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "()V", line = 135)
    public class36() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(IB)Lna;", line = 157)
    public static final class26 method233(int arg0, byte arg1) {
        if (arg1 < 13) {
            field467 = null;
        }
        return class4.method44(arg0, 10, (byte) 43, false);
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "(III)V", line = 165)
    private class36(int arg0, int arg1, int arg2) {
    }
}
