import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ua")
public class class39 {

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "Lv;")
    public static class40 field498 = class24.method170("Requesting", (byte) 108);

    @OriginalMember(owner = "mapview!ua", name = "h", descriptor = "Lv;")
    public static class40 field505 = class24.method170("Fur Trader", (byte) -100);

    @OriginalMember(owner = "mapview!ua", name = "f", descriptor = "Lv;")
    public static class40 field503 = class24.method170("Amulet Shop", (byte) -120);

    @OriginalMember(owner = "mapview!ua", name = "j", descriptor = "Lv;")
    public static class40 field507 = class24.method170("Spinning Wheel", (byte) -119);

    @OriginalMember(owner = "mapview!ua", name = "g", descriptor = "I")
    public static int field504 = -1;

    @OriginalMember(owner = "mapview!ua", name = "c", descriptor = "Lv;")
    public static class40 field500 = class24.method170("Find", (byte) 26);

    @OriginalMember(owner = "mapview!ua", name = "e", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "mapview!ua", name = "k", descriptor = "J")
    public static long field508;

    @OriginalMember(owner = "mapview!ua", name = "i", descriptor = "Li;")
    public static class15 field506;

    @OriginalMember(owner = "mapview!ua", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field501;

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "[I")
    public static int[] field499;

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(B)Z", line = 21)
    public static final boolean method236(byte arg0) {
        class7 var1 = class1.field8;
        synchronized (class1.field8) {
            if (arg0 <= 72) {
                field507 = null;
            }
            if (class34.field453 == class25.field376) {
                return false;
            } else {
                class24.field364 = class5.field62[class34.field453];
                field502 = class29.field423[class34.field453];
                class34.field453 = class34.field453 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(I)V", line = 41)
    public static void method237(int arg0) {
        field500 = null;
        field507 = null;
        int var1 = -89 % ((arg0 - 72) / 37);
        field498 = null;
        field499 = null;
        field506 = null;
        field503 = null;
        field505 = null;
    }

    @OriginalMember(owner = "mapview!ua", name = "<init>", descriptor = "()V", line = 63)
    public class39() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(Z)I", line = 67)
    public static final int method238(boolean arg0) {
        if (arg0) {
            method236((byte) -94);
        }
        if (class32.field442 == null) {
            return 0;
        } else if (class32.field442.field264 == null) {
            return class8.field103[class32.field442.field263 & 0xFF];
        } else {
            return class8.field103[class32.field442.field264[class20.field213] & 0xFF];
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "b", descriptor = "(I)B", line = 97)
    public static final byte method239(int arg0) {
        if (arg0 == -8896) {
            return class15.field146 == null ? 0 : class15.field146[class20.field213];
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "([BILc;)V", line = 129)
    public final void method240(byte[] arg0, int arg1, class5 arg2) {
        if (arg2.field66[arg2.field64] != 31 || arg2.field66[arg2.field64 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg1 != -17345) {
            field503 = null;
        }
        if (this.field501 == null) {
            this.field501 = new Inflater(true);
        }
        try {
            this.field501.setInput(arg2.field66, arg2.field64 + 10, -arg2.field64 + -18 + arg2.field66.length);
            this.field501.inflate(arg0);
        } catch (Exception var5) {
            this.field501.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field501.reset();
    }

    @OriginalMember(owner = "mapview!ua", name = "a", descriptor = "(II)I", line = 157)
    public static int method241(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!ua", name = "<init>", descriptor = "(III)V", line = 163)
    private class39(int arg0, int arg1, int arg2) {
    }
}
