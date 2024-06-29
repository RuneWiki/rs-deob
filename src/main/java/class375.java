import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class375 extends class324 {

    @OriginalMember(owner = "client!td", name = "q", descriptor = "[I")
    private int[] field4870 = new int[this.field4155];

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public static int field4875 = -1;

    @OriginalMember(owner = "client!td", name = "B", descriptor = "[F")
    public static float[] field4881 = new float[4];

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    private int field4869;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    private int field4871;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!td", name = "C", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "[B")
    private byte[] field4874;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLdn;)I", line = 4)
    public static final int method2190(byte arg0, class201 arg1) {
        ++field4876;
        if (arg0 <= 107) {
            method2190((byte) -38, (class201) null);
        }
        int var2 = 0;
        if (arg1.method1294(class352.field4499, (byte) -119)) {
            ++var2;
        }
        if (arg1.method1294(class333.field4262, (byte) -114)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIIIF)V", line = 25)
    public class375(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field4155 > var7; ++var7) {
            this.field4870[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)V", line = 44)
    public final void method1928(int arg0, int arg1, int arg2) {
        int var4 = 35 % ((-20 - arg1) / 44);
        this.field4869 += this.field4870[arg0] * arg2 >> 12;
        ++field4878;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V", line = 58)
    public static void method2191(byte arg0) {
        if (arg0 >= -55) {
            field4875 = 108;
        }
        field4881 = null;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V", line = 68)
    public final void method1930(int arg0) {
        ++field4872;
        if (arg0 != -666423860) {
            this.method1924(9);
        }
        this.field4869 = Math.abs(this.field4869);
        if (~this.field4869 <= -4097) {
            this.field4869 = 4095;
        }
        this.method942((byte) 91, this.field4871++, (byte) (this.field4869 >> 4));
        this.field4869 = 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V", line = 86)
    public static final void method2192(byte arg0, Throwable arg1, String arg2) {
        ++field4880;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class35.method226(40, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class95.method647(var3, (byte) -110);
            String var4 = class522.method3106("%3a", 1856881676, var3, ":");
            String var5 = class522.method3106("%40", 1856881676, var4, "@");
            String var6 = class522.method3106("%26", 1856881676, var5, "&");
            String var7 = class522.method3106("%23", 1856881676, var6, "#");
            if (class449.field6252.field6139 != null) {
                int var8 = 62 / ((arg0 - 81) / 32);
                class277 var9 = class449.field6252.method2607(92, new URL(class449.field6252.field6139.getCodeBase(), "clienterror.ws?c=" + class284.field3628 + "&u=" + class192.field2491 + "&v1=" + class441.field6146 + "&v2=" + class441.field6142 + "&e=" + var7));
                while (var9.field3542 == 0) {
                    class463.method2773(1L, -109);
                }
                if (var9.field3542 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field3541;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BIB)V", line = 140)
    public void method942(byte arg0, int arg1, byte arg2) {
        ++field4877;
        this.field4874[this.field4871++] = (byte) (class60.method339(arg2 >> 1, 127) + 127);
        if (arg0 <= 55) {
            this.method942((byte) 95, 90, (byte) -36);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 151)
    public final void method1924(int arg0) {
        this.field4871 = arg0;
        ++field4882;
        this.field4869 = 0;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V", line = 168)
    public static final void method2193(int arg0) {
        class78.field994.method90((byte) -27);
        if (arg0 != 0) {
            method2193(-108);
        }
        ++field4879;
    }
}
