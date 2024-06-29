import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class97 extends class308 implements class21 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    private int field1050;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([BIII)V")
    public final void method97(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method1769(arg0, arg1);
        if (arg3 < 31) {
            this.field1050 = 37;
        }
        ++field1055;
        this.field1050 = arg2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public static final void method532(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        ++field1049;
        class397 var8 = new class397();
        var8.field5360 = arg0;
        var8.field5368 = class678.field9539 + arg2;
        var8.field5358 = arg5;
        var8.field5369 = arg7;
        var8.field5363 = arg1;
        var8.field5362 = arg6;
        var8.field5364 = arg3;
        class473.field6810.method1670((byte) -121, var8);
        if (arg4 != 2968) {
            method533((byte) 7, (byte[]) null, -21, -114);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B[BII)[B")
    public static final byte[] method533(byte arg0, byte[] arg1, int arg2, int arg3) {
        ++field1052;
        byte[] var4;
        if (arg3 > 0) {
            var4 = new byte[arg2];
            for (int var5 = 0; var5 < arg2; ++var5) {
                var4[var5] = arg1[arg3 + var5];
            }
        } else {
            var4 = arg1;
        }
        class188 var6 = new class188();
        var6.method1143((byte) -45);
        var6.method1142(var4, false, (long) (arg2 * 8));
        byte[] var7 = new byte[64];
        var6.method1145(0, -4900, var7);
        if (arg0 >= -47) {
            method532(31, 83, -103, 61, 71, (String) null, 37, 65);
        }
        return var7;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)I")
    public final int method96(int arg0) {
        ++field1054;
        int var2 = -19 % ((-16 - arg0) / 48);
        return this.field1050;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)I")
    public final int method98(int arg0) {
        ++field1053;
        return arg0 != 14463 ? 68 : 0;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lvj;I[BI)V")
    public class97(class422 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1050 = arg1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)J")
    public final long method95(boolean arg0) {
        ++field1051;
        if (!arg0) {
            this.method98(-90);
        }
        return super.field3798.getAddress();
    }
}
