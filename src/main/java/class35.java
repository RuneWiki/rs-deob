import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public class class35 extends class31 {

    @OriginalMember(owner = "mapview!sa", name = "x", descriptor = "[J")
    private long[] field464 = new long[10];

    @OriginalMember(owner = "mapview!sa", name = "s", descriptor = "I")
    private int field459 = 1;

    @OriginalMember(owner = "mapview!sa", name = "l", descriptor = "I")
    private int field452 = 256;

    @OriginalMember(owner = "mapview!sa", name = "r", descriptor = "I")
    private int field458 = 0;

    @OriginalMember(owner = "mapview!sa", name = "t", descriptor = "J")
    private long field460 = class13.method85(-9);

    @OriginalMember(owner = "mapview!sa", name = "p", descriptor = "I")
    public static int field456 = -1;

    @OriginalMember(owner = "mapview!sa", name = "w", descriptor = "Lna;")
    public static class26 field463 = class30.method205((byte) 115, "75(U");

    @OriginalMember(owner = "mapview!sa", name = "q", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "mapview!sa", name = "v", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "mapview!sa", name = "n", descriptor = "J")
    public static long field454;

    @OriginalMember(owner = "mapview!sa", name = "o", descriptor = "Lq;")
    public static class31 field455;

    @OriginalMember(owner = "mapview!sa", name = "m", descriptor = "Ljava/awt/Frame;")
    public static Frame field453;

    @OriginalMember(owner = "mapview!sa", name = "u", descriptor = "[B")
    public static byte[] field461;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I)V", line = 6)
    public static final void method224(int arg0) {
        if (class25.field353[0][class1.field102][class27.field373] == null) {
            class25.field350 = null;
        } else {
            class25.field350 = class25.field353[0][class1.field102][class27.field373];
        }
        if (class25.field353[1][class1.field102][class27.field373] == null) {
            class4.field139 = null;
        } else {
            class4.field139 = class25.field353[1][class1.field102][class27.field373];
        }
        if (class25.field353[2][class1.field102][class27.field373] == null) {
            class37.field480 = null;
        } else {
            class37.field480 = class25.field353[2][class1.field102][class27.field373];
        }
        if (class25.field353[3][class1.field102][class27.field373] == null) {
            class16.field219 = null;
        } else {
            class16.field219 = class25.field353[3][class1.field102][class27.field373];
        }
        if (arg0 != 300) {
            field461 = null;
        }
        if (class25.field353[4][class1.field102][class27.field373] == null) {
            field461 = null;
        } else {
            field461 = class25.field353[4][class1.field102][class27.field373];
        }
        if (mapview.field5[class1.field102][class27.field373] == null) {
            class26.field362 = null;
        } else {
            class26.field362 = mapview.field5[class1.field102][class27.field373];
        }
        if (class39.field496[class1.field102][class27.field373] == null) {
            class29.field393 = null;
        } else {
            class29.field393 = class39.field496[class1.field102][class27.field373];
        }
        if (class41.field520[class1.field102][class27.field373] == null) {
            class19.field244 = null;
        } else {
            class19.field244 = class41.field520[class1.field102][class27.field373];
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(III)I", line = 64)
    public final int method209(int arg0, int arg1, int arg2) {
        int var4 = this.field452;
        int var5 = this.field459;
        this.field459 = 1;
        this.field452 = 300;
        this.field460 = class13.method85(125);
        if (this.field464[this.field457] == 0L) {
            this.field459 = var5;
            this.field452 = var4;
        } else if (this.field460 > this.field464[this.field457]) {
            this.field452 = (int) ((long) (arg0 * 2560) / (this.field460 - this.field464[this.field457]));
        }
        if (this.field452 < 25) {
            this.field452 = 25;
        }
        if (this.field452 > 256) {
            this.field452 = 256;
            this.field459 = (int) ((long) arg0 - (this.field460 - this.field464[this.field457]) / 10L);
        }
        if (arg0 < this.field459) {
            this.field459 = arg0;
        }
        this.field464[this.field457] = this.field460;
        this.field457 = (this.field457 + 1) % 10;
        if (this.field459 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field464[var6] != 0L) {
                    this.field464[var6] += this.field459;
                }
            }
        }
        if (arg2 > this.field459) {
            this.field459 = arg2;
        }
        int var7 = arg1;
        class33.method218((long) this.field459, 10);
        while (this.field458 < 256) {
            var7++;
            this.field458 += this.field452;
        }
        this.field458 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "(I)V", line = 136)
    public static void method225(int arg0) {
        field453 = null;
        field455 = null;
        if (arg0 != -19487) {
            method225(50);
        }
        field463 = null;
        field461 = null;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 181)
    public static final Object method226(boolean arg0, byte[] arg1, int arg2) {
        if (arg1 == null) {
            return null;
        }
        if (arg2 < arg1.length && !class3.field116) {
            try {
                class7 var3 = (class7) Class.forName("ba").getDeclaredConstructor().newInstance();
                var3.method68(arg1, false);
                return var3;
            } catch (Throwable var5) {
                class3.field116 = true;
            }
        }
        return arg0 ? class34.method223(0, arg1) : arg1;
    }

    @OriginalMember(owner = "mapview!sa", name = "<init>", descriptor = "()V", line = 222)
    public class35() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field464[var1] = this.field460;
        }
    }
}
