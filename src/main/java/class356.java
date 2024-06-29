import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class356 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public int field4567 = 128;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public int field4577 = 128;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public int field4574;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field4568;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Ljava/lang/Object;")
    public static Object field4572;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)Lke;")
    public final class356 method2011(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field4575++;
            return new class356(this.field4569, this.field4567, this.field4577, this.field4574, this.field4568, this.field4578);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method2012(byte arg0) {
        int var1 = 94 % ((-arg0 - 53) / 40);
        field4572 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILha;III)V")
    public static final void method2013(int arg0, int arg1, class545 arg2, int arg3, int arg4, int arg5) {
        field4576++;
        class410.field5731 = arg2;
        class19.field237 = class410.field5731.method2141();
        class76.field1051 = class410.field5731.method2141();
        class430.field5926 = class410.field5731.method2141();
        class264.field3599 = null;
        class589.field8461 = arg3;
        class481.field6530 = arg1;
        class38.field530 = null;
        class608.field8659 = arg5;
        class259.method1613((byte) -21, arg4, arg0);
        class485.field6557 = -1;
        class675.field9510 = -1;
        class679.field9565 = -1;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method2014(String arg0, byte arg1) {
        field4570++;
        if (arg1 > -13) {
            return null;
        }
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lke;B)V")
    public final void method2015(class356 arg0, byte arg1) {
        this.field4574 = arg0.field4574;
        this.field4567 = arg0.field4567;
        this.field4577 = arg0.field4577;
        if (arg1 > -34) {
            this.field4569 = -17;
        }
        field4571++;
        this.field4568 = arg0.field4568;
        this.field4569 = arg0.field4569;
        this.field4578 = arg0.field4578;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
    public static final boolean method2016(int arg0, int arg1, int arg2) {
        if (arg1 >= -99) {
            field4572 = null;
        }
        field4573++;
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
    public class356(int arg0) {
        this.field4569 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIII)V")
    private class356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4574 = arg3;
        this.field4569 = arg0;
        this.field4568 = arg4;
        this.field4567 = arg1;
        this.field4577 = arg2;
        this.field4578 = arg5;
    }
}
