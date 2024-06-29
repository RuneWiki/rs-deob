import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class39 extends class488 {

    @OriginalMember(owner = "client!aea", name = "B", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "I")
    private int field436;

    @OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "[C")
    private static char[] field434 = new char[64];

    @OriginalMember(owner = "client!aea", name = "C", descriptor = "[Laba;")
    public static class224[] field439;

    @OriginalMember(owner = "client!aea", name = "A", descriptor = "Lqp;")
    public static class586 field437;

    @OriginalMember(owner = "client!aea", name = "F", descriptor = "Lqp;")
    public static class586 field442;

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!aea", name = "D", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!aea", name = "E", descriptor = "Ln;")
    public static class472 field441;

    @OriginalMember(owner = "client!aea", name = "y", descriptor = "[B")
    private byte[] field435;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field434[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field434[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field434[var2] = (char) (var2 - 4);
        }
        field434[62] = '*';
        field434[63] = '-';
        field439 = new class224[14];
        field437 = new class586(36, 0);
        field442 = new class586(16, -1);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BII)V", line = 3)
    public void method199(byte arg0, int arg1, int arg2) {
        field429++;
        this.field435[arg1] = arg0;
        if (arg2 <= 26) {
            method200(49, -101, null);
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(IIIIIFFF)V", line = 16)
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field438 = (int) (arg7 * 4096.0F);
        this.field436 = (int) (arg6 * 4096.0F);
        this.field430 = this.field432 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(II[F)[F", line = 27)
    public static final float[] method200(int arg0, int arg1, float[] arg2) {
        field427++;
        float[] var3 = new float[arg0];
        class473.method2884(arg2, 0, var3, 0, arg0);
        if (arg1 < 113) {
            method201(-56);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)V", line = 44)
    public static void method201(int arg0) {
        field439 = null;
        if (arg0 == 27599) {
            field441 = null;
            field442 = null;
            field434 = null;
            field437 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)V", line = 59)
    public final void method202(int arg0) {
        this.field424 >>= 0x4;
        this.field430 = this.field432;
        if (arg0 <= 10) {
            this.method202(-102);
        }
        field425++;
        if (this.field424 < 0) {
            this.field424 = 0;
        } else if (this.field424 > 255) {
            this.field424 = 255;
        }
        this.method199((byte) this.field424, this.field433++, 49);
        this.field424 = 0;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V", line = 82)
    public final void method203(int arg0, int arg1, int arg2) {
        field440++;
        if (arg0 == 0) {
            this.field431 = this.field436 - (arg2 >= 0 ? arg2 : -arg2);
            this.field428 = 4096;
            this.field431 = this.field431 * this.field431 >> 12;
            this.field424 = this.field431;
        } else {
            this.field428 = this.field438 * this.field431 >> 12;
            if (this.field428 < 0) {
                this.field428 = 0;
            } else if (this.field428 > 4096) {
                this.field428 = 4096;
            }
            this.field431 = this.field436 - (arg2 < 0 ? -arg2 : arg2);
            this.field431 = this.field431 * this.field431 >> 12;
            this.field431 = this.field431 * this.field428 >> 12;
            this.field424 += this.field431 * this.field430 >> 12;
            this.field430 = this.field432 * this.field430 >> 12;
        }
        int var4 = 78 / ((arg1 + 46) / 57);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIZZ)V", line = 118)
    public static final void method204(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class179.field2726 = arg0;
        class177.field2692 = 0x1 << class179.field2726;
        class605.field8913 = class177.field2692 >> 1;
        class639.field9295 = (int) Math.sqrt((double) (class605.field8913 * class605.field8913 + class605.field8913 * class605.field8913));
        class437.field6432 = class177.field2692 >> 2;
        class177.field2693 = class177.field2692;
        class331.field4909 = arg2;
        class366.field5271 = arg3;
        class67.field763 = arg4;
        class387.field5663 = new class415[arg1][class331.field4909][class366.field5271];
        class562.field8337 = new class543[arg1];
        if (arg5) {
            class206.field3077 = new int[class331.field4909][class366.field5271];
            class642.field9324 = new byte[class331.field4909][class366.field5271];
            class143.field1861 = new short[class331.field4909][class366.field5271];
            class32.field330 = new class415[1][class331.field4909][class366.field5271];
            class287.field4219 = new class543[1];
        } else {
            class206.field3077 = null;
            class642.field9324 = null;
            class143.field1861 = null;
            class32.field330 = null;
            class287.field4219 = null;
        }
        if (arg6) {
            class22.field199 = new long[arg1][arg2][arg3];
            class29.field260 = new class323[65535];
            class490.field7416 = new boolean[65535];
            class318.field4753 = 0;
        } else {
            class22.field199 = null;
            class29.field260 = null;
            class490.field7416 = null;
            class318.field4753 = 0;
        }
        class296.method1836(false);
        class595.field8777 = new class272[1000];
        class382.field5585 = 0;
        class295.field4326 = new class272[1000];
        class147.field1905 = 0;
        class273.field4040 = new int[arg1][class331.field4909 + 1][class366.field5271 + 1];
        class135.field1788 = new class237[5000];
        class516.field7651 = 0;
        class181.field2786 = new boolean[class67.field763 + class67.field763 + 1][class67.field763 + class67.field763 + 1];
        class268.field3982 = new boolean[class67.field763 + class67.field763 + 2][class67.field763 + class67.field763 + 2];
        class298.field4354 = null;
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V", line = 175)
    public final void method205(byte arg0) {
        if (arg0 != 2) {
            this.field435 = null;
        }
        field426++;
        this.field424 = 0;
        this.field433 = 0;
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(III)V", line = 219)
    public static final void method206(int arg0, int arg1, int arg2) {
        boolean var3 = class526.field7777[0][arg1][arg2] != null && class526.field7777[0][arg1][arg2].field5979 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class526.field7777[var4][arg1][arg2] == null) {
                class415 var5 = class526.field7777[var4][arg1][arg2] = new class415(var4, arg1, arg2);
                if (var3) {
                    var5.field5984++;
                }
            }
        }
    }
}
