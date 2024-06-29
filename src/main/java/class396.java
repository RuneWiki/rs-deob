import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class396 implements class411 {

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "Z")
    private boolean field5512 = false;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public int field5509;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Z")
    private boolean field5501;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public int field5510;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    private int field5502;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "Lep;")
    public class371 field5514;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public int field5507;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lon;")
    public static class504 field5505;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Lsv;")
    public static class59 field5504;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Z", line = 4)
    public final boolean method2408(byte arg0) {
        if (arg0 > -86) {
            return true;
        }
        field5506++;
        if (!this.field5514.field5028) {
            return false;
        }
        int var2 = this.method2415((byte) 125);
        this.field5514.method2154(this, -2);
        OpenGL.glGenerateMipmapEXT(this.field5510);
        this.field5501 = true;
        this.method2418((byte) -1);
        this.method2409(var2, false);
        return true;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZ)V", line = 28)
    private final void method2409(int arg0, boolean arg1) {
        this.field5514.field4964 -= arg0;
        field5511++;
        if (arg1) {
            method2413(-95, (byte) -111);
        }
        this.field5514.field4964 += this.method2415((byte) -116);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BZ)V", line = 41)
    public final void method2410(byte arg0, boolean arg1) {
        field5500++;
        if (arg0 > -25) {
            this.method2411(-2);
        }
        if (arg1 != this.field5501) {
            int var3 = this.method2415((byte) 109);
            this.field5501 = true;
            this.method2418((byte) -1);
            this.method2409(var3, false);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 68)
    public final void method2411(int arg0) {
        field5499++;
        if (arg0 != 0) {
            this.method2418((byte) -47);
        }
        if (this.field5507 > 0) {
            this.field5514.method2187(this.field5507, this.method2415((byte) -95), 0);
            this.field5507 = 0;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V", line = 89)
    public static final void method2412(int arg0) {
        field5494++;
        if (arg0 != 40960) {
            return;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class400.field5549[var1] = false;
        }
        class651.field9209 = class245.field3409;
        class590.field8466 = 0;
        class705.field9812 = class57.field798;
        class665.field9377 = 5;
        class599.field8597 = -1;
        class641.field9111 = 0;
        class593.field8554 = class403.field5594;
        class382.field5359 = class24.field266;
        class223.field3130 = class235.field3250;
        class741.field10330 = class645.field9148;
        class374.field5167 = -1;
        class13.field180 = -1;
        class99.field1429 = -1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)I", line = 120)
    public static final int method2413(int arg0, byte arg1) {
        field5496++;
        int var2 = -75 / (arg1 / 61);
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var4 = arg0 * 6 - 61440;
        int var5 = (arg0 * var4 >> 12) + 40960;
        return var3 * var5 >> 12;
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V", line = 136)
    public static void method2414(int arg0) {
        if (arg0 != 36) {
            method2414(-81);
        }
        field5505 = null;
        field5504 = null;
    }

    @OriginalMember(owner = "client!hl", name = "finalize", descriptor = "()V", line = 147)
    protected final void finalize() throws Throwable {
        this.method2411(0);
        field5508++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)I", line = 158)
    private final int method2415(byte arg0) {
        field5498++;
        int var2 = -89 / ((arg0 - 37) / 50);
        int var3 = this.field5514.method2219(true, this.field5509) * this.field5502;
        return this.field5501 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)I", line = 172)
    public final int method2416(int arg0) {
        int var2 = -36 % ((arg0 - 49) / 55);
        field5513++;
        return this.field5507;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILha;)V", line = 183)
    public static final void method2417(int arg0, class545 arg1) {
        field5495++;
        if (class16.field206.method3113((byte) -102) == 0) {
            return;
        }
        int var2 = -110 / ((-arg0 - 55) / 38);
        if (class674.field9500.field5158.method1006(0) == 0) {
            for (class491 var3 = (class491) class16.field206.method3118((byte) 73); var3 != null; var3 = (class491) class16.field206.method3111(127)) {
                class487.field6572.method3047(false, var3.field6600, var3.field6595, var3.field6606, var3.field6596 ? class473.field6483.field9257 : null, false, class140.field1926, arg1, var3.field6603, arg1, var3.field6601, false);
                var3.method3065(-17363);
            }
            class330.method1918(7);
            return;
        }
        if (class294.field3836 == null) {
            Canvas var4 = new Canvas();
            var4.setSize(36, 32);
            class294.field3836 = class524.method3130(0, 0, class746.field10393, 25632, var4, class387.field5400);
            class539.field7547 = class294.field3836.method2085(class378.method2286(class448.field6168, -121, 0, class661.field9333), class320.method1860(class323.field4156, class661.field9333, 0), true);
        }
        for (class491 var5 = (class491) class16.field206.method3118((byte) 73); var5 != null; var5 = (class491) class16.field206.method3111(125)) {
            class487.field6572.method3047(false, var5.field6600, var5.field6595, var5.field6606, var5.field6596 ? class473.field6483.field9257 : null, false, class539.field7547, arg1, var5.field6603, class294.field3836, var5.field6601, false);
            var5.method3065(-17363);
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)V", line = 233)
    private final void method2418(byte arg0) {
        field5497++;
        this.field5514.method2154(this, -2);
        if (arg0 != -1) {
            return;
        }
        if (this.field5512) {
            OpenGL.glTexParameteri(this.field5510, 10241, this.field5501 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5510, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5510, 10241, this.field5501 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5510, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZZ)V", line = 256)
    public final void method2419(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field5501 = true;
        }
        if (this.field5512 != arg0) {
            this.field5512 = arg0;
            this.method2418((byte) -1);
        }
        field5503++;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lep;IIIZ)V", line = 278)
    public class396(class371 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5509 = arg2;
        this.field5501 = arg4;
        this.field5510 = arg1;
        this.field5502 = arg3;
        this.field5514 = arg0;
        OpenGL.glGenTextures(1, class379.field5321, 0);
        this.field5507 = class379.field5321[0];
        this.method2409(0, false);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public abstract void method527(int arg0);
}
