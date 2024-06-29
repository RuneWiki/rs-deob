import jaggl.OpenGL;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public abstract class class599 implements class670 {

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "Z")
    private boolean field8434 = false;

    @OriginalMember(owner = "client!fia", name = "v", descriptor = "I")
    private int field8455;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "Z")
    private boolean field8442;

    @OriginalMember(owner = "client!fia", name = "s", descriptor = "I")
    public int field8452;

    @OriginalMember(owner = "client!fia", name = "p", descriptor = "Lkv;")
    public class280 field8449;

    @OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
    public int field8444;

    @OriginalMember(owner = "client!fia", name = "l", descriptor = "I")
    public int field8445;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "Z")
    public static boolean field8440 = false;

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "I")
    public static int field8448 = 0;

    @OriginalMember(owner = "client!fia", name = "j", descriptor = "Lke;")
    public static class622 field8443 = new class622(13, 0);

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "D")
    public static double field8441;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    public static int field8435;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
    public static int field8437;

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
    public static int field8438;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "I")
    public static int field8439;

    @OriginalMember(owner = "client!fia", name = "m", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!fia", name = "n", descriptor = "I")
    public static int field8447;

    @OriginalMember(owner = "client!fia", name = "q", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!fia", name = "r", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!fia", name = "u", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!fia", name = "w", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!fia", name = "x", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!fia", name = "y", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!fia", name = "t", descriptor = "Leh;")
    public static class378 field8453;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field8436;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V", line = 3)
    public static void method3458(int arg0) {
        field8436 = null;
        field8443 = null;
        field8453 = null;
        if (arg0 != 0) {
            field8441 = 0.16082578755984722D;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IB)V", line = 18)
    private final void method3459(int arg0, byte arg1) {
        if (arg1 <= 2) {
            field8443 = null;
        }
        field8451++;
        this.field8449.field4181 -= arg0;
        this.field8449.field4181 += this.method3464(107);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(ZZ)V", line = 30)
    public static final void method3460(boolean arg0, boolean arg1) {
        if (class76.field1025 != null) {
            class76.field1025.method201(-74);
            class76.field1025 = null;
        }
        field8458++;
        class237.field3423 = 0;
        class497.method2902((byte) 94);
        class1.method8();
        for (int var2 = 0; var2 < 4; var2++) {
            class234.field3394[var2].method2651(!arg0);
        }
        class272.method1769(-374497842, false);
        System.gc();
        class427.method2543(2, false);
        class709.field9995 = false;
        class433.field6161 = -1;
        class368.method2288(122);
        class256.method1687((byte) 60, arg0);
        class388.field5531 = 0;
        class175.field2496 = 0;
        class481.field6839 = 0;
        class64.field867 = 0;
        class313.field4650 = 0;
        class103.field1295 = 0;
        for (int var3 = 0; var3 < class443.field6310.length; var3++) {
            class443.field6310[var3] = null;
        }
        class405.method2440((byte) 118);
        for (int var4 = 0; var4 < 2048; var4++) {
            class581.field8250[var4] = null;
        }
        class26.field379 = 0;
        class543.field7606.method387(-21125);
        class662.field9292 = 0;
        class70.field959.method387(-21125);
        class14.method130((byte) -15);
        class92.field1197 = 0;
        class271.field3796.method1787(-55);
        class229.method1588((byte) -119);
        class562.method3262(74);
        class48.field689 = null;
        class584.field8265 = null;
        class668.field9399 = 0L;
        class212.field3072 = null;
        class492.field6992 = null;
        class777.field10725 = null;
        if (arg1) {
            class374.method2323(12, (byte) -125);
            return;
        }
        class374.method2323(3, (byte) -125);
        try {
            class150.method1035(-19253, "loggedout", class535.field7544);
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lkv;IIIZ)V", line = 235)
    public class599(class280 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field8455 = arg3;
        this.field8442 = arg4;
        this.field8452 = arg1;
        this.field8449 = arg0;
        this.field8444 = arg2;
        OpenGL.glGenTextures(1, class593.field8367, 0);
        this.field8445 = class593.field8367[0];
        this.method3459(0, (byte) 34);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)I", line = 118)
    public final int method3461(boolean arg0) {
        field8439++;
        if (!arg0) {
            this.field8434 = false;
        }
        return this.field8445;
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)Z", line = 132)
    public final boolean method3462(int arg0) {
        field8446++;
        if (arg0 != -31064) {
            this.field8442 = true;
        }
        if (!this.field8449.field4285) {
            return false;
        }
        int var2 = this.method3464(93);
        this.field8449.method1840(this, arg0 ^ 0xFFFF8E35);
        OpenGL.glGenerateMipmapEXT(this.field8452);
        this.field8442 = true;
        this.method3463(9729);
        this.method3459(var2, (byte) 84);
        return true;
    }

    @OriginalMember(owner = "client!fia", name = "finalize", descriptor = "()V", line = 155)
    protected final void finalize() throws Throwable {
        field8438++;
        this.method3465(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)V", line = 179)
    private final void method3463(int arg0) {
        field8437++;
        this.field8449.method1840(this, arg0 ^ 0x2E9C);
        if (this.field8434) {
            OpenGL.glTexParameteri(this.field8452, 10241, this.field8442 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field8452, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field8452, 10241, this.field8442 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field8452, 10240, 9728);
        }
        if (arg0 != 9729) {
            this.method3468(106, true);
        }
    }

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "(I)I", line = 202)
    private final int method3464(int arg0) {
        field8457++;
        int var2 = this.field8449.method1843((byte) 91, this.field8444) * this.field8455;
        if (arg0 < 64) {
            return 16;
        } else if (this.field8442) {
            return var2 * 4 / 3;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(Z)V", line = 215)
    public final void method3465(boolean arg0) {
        if (arg0) {
            this.method3464(-4);
        }
        field8454++;
        if (this.field8445 > 0) {
            this.field8449.method1839(24138, this.field8445, this.method3464(98));
            this.field8445 = 0;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILjava/lang/String;)V", line = 255)
    public static final void method3466(int arg0, String arg1) {
        field8450++;
        if (!class26.field382 || (class641.field9043 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class147.field1873;
        if (arg0 != -1) {
            field8436 = null;
        }
        int[] var4 = class568.field8045;
        for (int var5 = 0; var5 < var3; var5++) {
            class559 var6 = class581.field8250[var4[var5]];
            if (var6.field7955 != null && var6.field7955.equalsIgnoreCase(arg1) && (class251.field3549 == var6 && (class641.field9043 & 0x10) != 0 || var6 != null && (class641.field9043 & 0x8) != 0)) {
                class647.field9112++;
                class731 var7 = class155.method1222(260, class180.field2724, class237.field3417);
                var7.field10211.method860(var4[var5], (byte) 127);
                var7.field10211.method836(-30411, 0);
                var7.field10211.method860(class189.field2820, (byte) 127);
                var7.field10211.method860(class76.field1018, (byte) 121);
                var7.field10211.method879((byte) 66, class483.field6863);
                class533.method3088(var7, 0);
                var2 = true;
                class553.method3214(var6.method2692((byte) 3), var6.field6448[0], 14, 0, true, -2, 0, var6.method2692((byte) -125), var6.field6445[0]);
                break;
            }
        }
        if (!var2) {
            class64.method386(class674.field9572.method3825((byte) -10, class526.field7494) + arg1, 4, false);
        }
        if (class26.field382) {
            class272.method1770(-1);
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(BZ)V", line = 311)
    public final void method3467(byte arg0, boolean arg1) {
        if (arg0 != 87) {
            return;
        }
        if (arg1 != this.field8442) {
            int var3 = this.method3464(119);
            this.field8442 = true;
            this.method3463(9729);
            this.method3459(var3, (byte) 126);
        }
        field8435++;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IZ)V", line = 332)
    public final void method3468(int arg0, boolean arg1) {
        field8456++;
        if (this.field8434 != arg1) {
            this.field8434 = arg1;
            this.method3463(9729);
        }
        if (arg0 != 0) {
            method3460(false, false);
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(II)I", line = 349)
    public static final int method3469(int arg0, int arg1) {
        if (arg1 == 255) {
            field8447++;
            return arg0 & 0xFF;
        } else {
            return 97;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V")
    public abstract void method1255(byte arg0);
}
