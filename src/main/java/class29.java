import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!oa")
public class class29 {

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "Lba;")
    public static class4 field358 = class14.method105((byte) -67, " map");

    @OriginalMember(owner = "mapview!oa", name = "d", descriptor = "Lba;")
    public static class4 field361 = class14.method105((byte) -89, "Farming patch");

    @OriginalMember(owner = "mapview!oa", name = "f", descriptor = "I")
    public static int field363 = -1;

    @OriginalMember(owner = "mapview!oa", name = "h", descriptor = "Z")
    public static volatile boolean field365 = true;

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "I")
    public static int field359 = 1;

    @OriginalMember(owner = "mapview!oa", name = "g", descriptor = "Lba;")
    public static class4 field364 = class14.method105((byte) -122, "Herbalist");

    @OriginalMember(owner = "mapview!oa", name = "l", descriptor = "Z")
    public static boolean field369 = true;

    @OriginalMember(owner = "mapview!oa", name = "k", descriptor = "Lba;")
    public static class4 field368 = class14.method105((byte) -108, "null");

    @OriginalMember(owner = "mapview!oa", name = "i", descriptor = "Lba;")
    public static class4 field366 = class14.method105((byte) -125, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!oa", name = "p", descriptor = "Lba;")
    public static class4 field373 = class14.method105((byte) -68, "Bank");

    @OriginalMember(owner = "mapview!oa", name = "j", descriptor = "B")
    public byte field367;

    @OriginalMember(owner = "mapview!oa", name = "o", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "mapview!oa", name = "c", descriptor = "J")
    public static long field360;

    @OriginalMember(owner = "mapview!oa", name = "n", descriptor = "Lu;")
    public static class36 field371;

    @OriginalMember(owner = "mapview!oa", name = "e", descriptor = "[B")
    public byte[] field362;

    @OriginalMember(owner = "mapview!oa", name = "m", descriptor = "[I")
    public static int[] field370;

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Z)I", line = 7)
    public static final int method179(boolean arg0) {
        if (arg0) {
            return class34.field430 == null ? 0 : class34.field430[class12.field172];
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(IJ)V", line = 30)
    public static final void method180(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 != 11580) {
                method184(null, -121);
            }
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(I)V", line = 43)
    public static void method181(int arg0) {
        field358 = null;
        field366 = null;
        field368 = null;
        field371 = null;
        field364 = null;
        field361 = null;
        field370 = null;
        field373 = null;
        if (arg0 != 0) {
            field372 = 51;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Lc;IBI)[Lj;", line = 105)
    public static final class6[] method182(class5 arg0, int arg1, byte arg2, int arg3) {
        if (class14.method106((byte) 33, arg3, arg0, arg1)) {
            if (arg2 <= 51) {
                method182(null, -106, (byte) 109, 89);
            }
            return class26.method169(99);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "b", descriptor = "(I)V", line = 125)
    public final void method183(int arg0) {
        if (arg0 != 16497) {
            method182(null, -102, (byte) 0, 81);
        }
        boolean var2 = true;
        if (this.field362 == null) {
            return;
        }
        this.field367 = this.field362[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field362[var3] != this.field367) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field362 = null;
        }
    }

    @OriginalMember(owner = "mapview!oa", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 164)
    public static final void method184(Component arg0, int arg1) {
        if (arg1 != 0) {
            field363 = 64;
        }
        Method var2 = class8.field144;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class17.field212);
        arg0.addFocusListener(class17.field212);
    }
}
