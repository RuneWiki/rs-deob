import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public abstract class class188 implements class122 {

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Z")
    private boolean field2605 = false;

    @OriginalMember(owner = "client!ao", name = "q", descriptor = "Lht;")
    public class410 field2615;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    private int field2599;

    @OriginalMember(owner = "client!ao", name = "o", descriptor = "I")
    public int field2613;

    @OriginalMember(owner = "client!ao", name = "u", descriptor = "Z")
    private boolean field2619;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public int field2601;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field2609 = 0;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2606 = new String[100];

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field2604 = 500;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ao", name = "n", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ao", name = "p", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ao", name = "r", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ao", name = "s", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ao", name = "t", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!ao", name = "v", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)[Lhp;")
    public static final class214[] method1125(int arg0) {
        if (arg0 != 0) {
            field2609 = 16;
        }
        field2607++;
        return new class214[] { class255.field3539, class255.field3540, class255.field3541, class255.field3542, class255.field3543, class255.field3544, class255.field3545, class255.field3546, class255.field3547, class255.field3548 };
    }

    @OriginalMember(owner = "client!ao", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2614++;
        this.method1131(100);
        super.finalize();
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)V")
    public static final void method1126(int arg0, int arg1) {
        field2610++;
        if (!class478.method2809(arg1, false)) {
            return;
        }
        class295[] var2 = class522.field7701[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class295 var4 = var2[var3];
            if (var4 != null) {
                var4.field4018 = 0;
                var4.field4070 = 1;
                var4.field4078 = 0;
            }
        }
        if (arg0 != 10241) {
            method1128(-73);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)Z")
    public final boolean method1127(byte arg0) {
        if (arg0 != -63) {
            this.field2605 = false;
        }
        field2603++;
        if (!this.field2615.field5897) {
            return false;
        }
        int var2 = this.method1135((byte) 124);
        this.field2615.method2412((byte) 4, this);
        OpenGL.glGenerateMipmapEXT(this.field2613);
        this.field2619 = true;
        this.method1130(arg0 + 10304);
        this.method1136((byte) 105, var2);
        return true;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
    public static void method1128(int arg0) {
        if (arg0 <= -112) {
            field2606 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(B)Ljava/lang/String;")
    public static final String method1129(byte arg0) {
        field2611++;
        String var1 = "www";
        if (class330.field4500 == class175.field2498) {
            var1 = "www-wtrc";
        } else if (class190.field2645 == class175.field2498) {
            var1 = "www-wtqa";
        } else if (class54.field749 == class175.field2498) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (arg0 < 15) {
            method1125(23);
        }
        if (class41.field561 != null) {
            var2 = "/p=" + class41.field561;
        }
        return "http://" + var1 + "." + class341.field4700.field2235 + ".com/l=" + class105.field1434 + "/a=" + class246.field3426 + var2 + "/";
    }

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)V")
    private final void method1130(int arg0) {
        if (arg0 != 10241) {
            method1128(-27);
        }
        field2602++;
        this.field2615.method2412((byte) 4, this);
        if (this.field2605) {
            OpenGL.glTexParameteri(this.field2613, 10241, this.field2619 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2613, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2613, 10241, this.field2619 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2613, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V")
    public final void method1131(int arg0) {
        if (arg0 != 100) {
            this.field2605 = true;
        }
        if (this.field2608 > 0) {
            this.field2615.method2373(arg0 ^ 0x33, this.method1135((byte) 111), this.field2608);
            this.field2608 = 0;
        }
        field2616++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZB)V")
    public final void method1132(boolean arg0, byte arg1) {
        if (arg1 != 62) {
            field2606 = null;
        }
        field2617++;
        if (this.field2605 != arg0) {
            this.field2605 = arg0;
            this.method1130(10241);
        }
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)I")
    public final int method1133(int arg0) {
        int var2 = 99 % ((18 - arg0) / 46);
        field2620++;
        return this.field2608;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BZ)V")
    public final void method1134(byte arg0, boolean arg1) {
        if (this.field2619 != arg1) {
            int var3 = this.method1135((byte) 123);
            this.field2619 = true;
            this.method1130(10241);
            this.method1136((byte) 124, var3);
        }
        field2612++;
        if (arg0 != 24) {
            this.field2599 = -102;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lht;IIIZ)V")
    public class188(class410 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2615 = arg0;
        this.field2599 = arg3;
        this.field2613 = arg1;
        this.field2619 = arg4;
        this.field2601 = arg2;
        OpenGL.glGenTextures(1, class77.field1119, 0);
        this.field2608 = class77.field1119[0];
        this.method1136((byte) -3, 0);
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)I")
    private final int method1135(byte arg0) {
        if (arg0 < 89) {
            return 8;
        } else {
            field2600++;
            int var2 = this.field2615.method2419(-17837, this.field2601) * this.field2599;
            return this.field2619 ? var2 * 4 / 3 : var2;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)V")
    private final void method1136(byte arg0, int arg1) {
        this.field2615.field5878 -= arg1;
        field2618++;
        int var3 = 127 / ((arg0 - 60) / 39);
        this.field2615.field5878 += this.method1135((byte) 125);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)V")
    public abstract void method43(int arg0);
}
