import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class15 extends class297 {

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    private int field309 = 0;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    private int field310 = 1365;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    private int field314 = 0;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    private int field315 = 20;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "[[B")
    public static byte[][] field318;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ)[I", line = 4)
    public final int[] method173(int arg0, boolean arg1) {
        field313++;
        if (!arg1) {
            this.field309 = -87;
        }
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            for (int var4 = 0; var4 < class31.field491; var4++) {
                int var5 = (class251.field3705[var4] << 12) / this.field310 + this.field309;
                int var6 = (class264.field3901[arg0] << 12) / this.field310 + this.field314;
                int var7 = var5;
                int var8 = var6;
                int var9 = var6;
                int var10 = var5;
                int var11 = 0;
                int var12 = var6 * var6 >> 12;
                int var13 = var5 * var5 >> 12;
                while ((var13 + var12) < 16384 && this.field315 > var11) {
                    var11++;
                    var8 = (var7 * var8 >> 12) * 2 + var9;
                    var7 = var13 + var10 - var12;
                    var13 = var7 * var7 >> 12;
                    var12 = var8 * var8 >> 12;
                }
                var3[var4] = var11 < (this.field315 - 1) ? (var11 << 12) / this.field315 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "f", descriptor = "(I)V", line = 64)
    public static final void method187(int arg0) {
        class156.field2560 = null;
        field316++;
        class60.field882 = null;
        class66.field982 = null;
        class145.field2352 = null;
        class339.field5229 = null;
        class158.field2578 = null;
        class259.field3845 = null;
        class146.field2392 = null;
        class338.field5220 = null;
        class135.field2166 = null;
        class322.field5047 = null;
        class107.field1756 = null;
        int var1 = -87 / ((arg0) / 49);
        class64.field934 = null;
        class109.field1770 = null;
        class208.field3289 = null;
        class110.field1791 = null;
        class92.field1505 = null;
        class116.field1889 = null;
        class28.field445 = null;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 125)
    public class15() {
        super(0, true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)C", line = 98)
    public static final char method188(byte arg0, int arg1) {
        field317++;
        if (arg1 != 11546) {
            field318 = (byte[][]) ((byte[][]) null);
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class216.field3355[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILaj;)V", line = 145)
    public final void method169(int arg0, int arg1, class1 arg2) {
        if (arg0 == 0) {
            this.field310 = arg2.method56(19612);
        } else if (arg0 == 1) {
            this.field315 = arg2.method56(19612);
        } else if (arg0 == 2) {
            this.field309 = arg2.method56(arg1 + 19357);
        } else if (arg0 == 3) {
            this.field314 = arg2.method56(19612);
        }
        if (arg1 != 255) {
            field311 = 41;
        }
        field312++;
    }

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V", line = 197)
    public static void method189(int arg0) {
        field318 = (byte[][]) null;
        int var1 = 71 / ((52 - arg0) / 39);
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V", line = 214)
    public static final void method190(int arg0) {
        field319++;
        class151.field2485.method2283((byte) 77);
        class337.field5212.method2283((byte) 77);
        if (arg0 != 7271) {
            method188((byte) 98, -48);
        }
        class113.field1822.method2283((byte) 77);
    }
}
