import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class45 {

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Ljava/lang/String;")
    public static String field705 = "flash1:";

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field704 = 127;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Ljava/lang/String;")
    public static String field700 = "red:";

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
    public long field698;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Lec;")
    public class45 field699;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Lec;")
    public class45 field708;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lth;")
    public static class57 field703;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 4)
    public final void method330(int arg0) {
        field701++;
        if (this.field699 == null) {
            return;
        }
        this.field699.field708 = this.field708;
        if (arg0 != 15) {
            field702 = -91;
        }
        this.field708.field699 = this.field699;
        this.field708 = null;
        this.field699 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z", line = 23)
    public final boolean method331(byte arg0) {
        field697++;
        if (this.field699 == null) {
            return false;
        } else {
            int var2 = 88 / ((-arg0 - 26) / 44);
            return true;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIILwf;II)V", line = 40)
    public static final void method332(int arg0, int arg1, int arg2, int arg3, int arg4, class250 arg5, int arg6, int arg7) {
        int var8 = arg2 * arg2 + (arg3 * arg3);
        field696++;
        if (var8 > arg7) {
            return;
        }
        if (arg0 != 16) {
            method333((byte) 105, (class57) null, 41);
        }
        int var9 = Math.min(arg5.field4081 / 2, arg5.field4157 / 2);
        if (var8 <= (var9 * var9)) {
            class344.method2423(arg5, (byte) -124, arg6, arg2, arg3, arg4, class104.field1678[arg1]);
            return;
        }
        int var10;
        if (class112.field1827 == 4) {
            var10 = (int) class261.field4396 & 0x7FF;
        } else {
            var10 = (int) class261.field4396 + class79.field1372 & 0x7FF;
        }
        var9 -= 10;
        int var11 = class153.field2445[var10];
        int var12 = class153.field2438[var10];
        if (class112.field1827 != 4) {
            var11 = var11 * 256 / (class4.field41 + 256);
            var12 = var12 * 256 / (class4.field41 + 256);
        }
        int var13 = arg2 * var11 + arg3 * var12 >> 16;
        int var14 = arg3 * var11 - (arg2 * var12) >> 16;
        double var15 = Math.atan2((double) var13, (double) var14);
        int var17 = (int) ((double) var9 * Math.sin(var15));
        int var18 = (int) (Math.cos(var15) * (double) var9);
        if (class42.field607) {
            ((class58) class240.field3961[arg1]).method494(240, 240, (arg5.field4081 / 2 + arg4 + var17) * 16, (arg6 + (arg5.field4157 / 2) - var18) * 16, (int) (var15 * 10430.378D), 4096);
        } else {
            ((class351) class240.field3961[arg1]).method942(arg5.field4081 / 2 + var17 + arg4 - 10, arg6 + -10 - (-(arg5.field4157 / 2) - -var18), 20, 20, 15, 15, var15, 256);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLth;I)Z", line = 107)
    public static final boolean method333(byte arg0, class57 arg1, int arg2) {
        int var3 = 83 / ((arg0 + 12) / 52);
        field706++;
        byte[] var4 = arg1.method476((byte) -7, arg2);
        if (var4 == null) {
            return false;
        } else {
            class20.method117(var4, (byte) 79);
            return true;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 126)
    public static void method334(byte arg0) {
        field703 = null;
        field700 = null;
        int var1 = -15 / ((arg0 - 5) / 55);
        field705 = null;
    }
}
