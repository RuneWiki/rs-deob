import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class385 extends class238 {

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "I")
    public int field5469;

    @OriginalMember(owner = "client!vs", name = "q", descriptor = "I")
    public int field5472;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public static int field5477 = 1;

    @OriginalMember(owner = "client!vs", name = "s", descriptor = "Z")
    public static boolean field5474 = false;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!vs", name = "p", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!vs", name = "r", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!vs", name = "x", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(B)Z")
    public final boolean method2316(byte arg0) {
        if (arg0 == -93) {
            field5470++;
            return (this.field5472 & 0x554482) >> 22 != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method2317(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5475++;
        if (class168.field2449 <= arg7 && class94.field1209 >= arg6 && class345.field5011 <= arg4 && arg2 <= class485.field6827) {
            class50.method324(true, arg7, arg6, arg0, arg3, arg4, arg2, arg5);
        } else {
            class212.method1374(arg2, arg4, arg7, arg5, false, arg6, arg0, arg3);
        }
        if (arg1 != 87) {
            field5474 = true;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z")
    public final boolean method2318(int arg0, int arg1) {
        if (arg0 != -1) {
            field5474 = false;
        }
        field5473++;
        return (this.field5472 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)I")
    public final int method2319(int arg0) {
        field5471++;
        if (arg0 != -2829) {
            this.method2320(7);
        }
        return class310.method1922(63, this.field5472);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)Z")
    public final boolean method2320(int arg0) {
        field5476++;
        int var2 = 90 % ((41 - arg0) / 62);
        return ((this.field5472 & 0x2F307D) >> 21) != 0;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILb;)V")
    public static final void method2321(int arg0, class201 arg1) {
        field5478++;
        class405.field5699 = arg1.method1234(false, "titlebg");
        class29.field389 = arg1.method1234(false, "logo");
        if (arg0 != 127) {
            method2321(-125, (class201) null);
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(Z)Z")
    public final boolean method2322(boolean arg0) {
        field5467++;
        if (arg0) {
            method2321(58, (class201) null);
        }
        return (this.field5472 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)I")
    public final int method2323(int arg0) {
        field5479++;
        if (arg0 != 1366541377) {
            this.method2316((byte) -94);
        }
        return this.field5472 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(II)V")
    public class385(int arg0, int arg1) {
        this.field5469 = arg1;
        this.field5472 = arg0;
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(II)S")
    public static final short method2324(int arg0, int arg1) {
        field5468++;
        if (arg0 != -1888289119) {
            field5477 = -49;
        }
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x385) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var6 | var2 << 10 | var7 >> 4 << 7);
    }
}
