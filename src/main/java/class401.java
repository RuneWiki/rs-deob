import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class401 extends class119 {

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    private int field5528;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    private int field5527;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    private int field5524;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    private int field5533;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "[I")
    public static int[] field5531 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Lih;")
    public static class108 field5523 = new class108(16);

    @OriginalMember(owner = "client!b", name = "v", descriptor = "[S")
    public static short[] field5536 = new short[256];

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lnh;")
    public static class441 field5525;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)V")
    public static final void method2496(int arg0, int arg1) {
        class157.field1828.method2286(arg1, (byte) 36);
        if (arg0 != 1) {
            method2496(21, -71);
        }
        ++field5529;
        class373.field5051.method2286(arg1, (byte) 36);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method2497(byte arg0) {
        class365 var1 = class131.field1494;
        synchronized (class131.field1494) {
            class131.field1494.method2298(0);
        }
        int var2 = 80 % ((arg0 - -40) / 55);
        ++field5526;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public static void method2498(int arg0) {
        field5531 = null;
        field5525 = null;
        if (arg0 != 9722) {
            method2496(-128, -39);
        }
        field5523 = null;
        field5536 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)V")
    public final void method795(byte arg0, int arg1, int arg2) {
        if (arg0 == -33) {
            ++field5530;
            int var4 = this.field5533 * arg2 >> 12;
            int var5 = this.field5527 * arg2 >> 12;
            int var6 = this.field5524 * arg1 >> 12;
            int var7 = this.field5528 * arg1 >> 12;
            class334.method2140(super.field1378, var7, var5, var4, var6, arg0 ^ 32);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method2499(byte arg0, long arg1) {
        class364.field4945.setTime(new Date(arg1));
        ++field5532;
        int var3 = -54 % ((arg0 - 30) / 60);
        int var4 = class364.field4945.get(7);
        int var5 = class364.field4945.get(5);
        int var6 = class364.field4945.get(2);
        int var7 = class364.field4945.get(1);
        int var8 = class364.field4945.get(11);
        int var9 = class364.field4945.get(12);
        int var10 = class364.field4945.get(13);
        return class231.field3037[var4 + -1] + ", " + var5 / 10 + var5 % 10 + "-" + class22.field234[var6] + "-" + var7 + " " + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIII)V")
    public class401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5528 = arg3;
        this.field5527 = arg2;
        this.field5524 = arg1;
        this.field5533 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBI)V")
    public final void method796(int arg0, byte arg1, int arg2) {
        ++field5537;
        int var4 = this.field5533 * arg0 >> 12;
        int var5 = this.field5527 * arg0 >> 12;
        int var6 = this.field5524 * arg2 >> 12;
        if (arg1 != -74) {
            this.method793(120, -123, -85);
        }
        int var7 = this.field5528 * arg2 >> 12;
        client.method2700(super.field1375, var7, var5, 10, var6, var4, super.field1376, super.field1378);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)V")
    public final void method793(int arg0, int arg1, int arg2) {
        ++field5535;
        if (arg0 != -1) {
            this.field5533 = 29;
        }
    }
}
