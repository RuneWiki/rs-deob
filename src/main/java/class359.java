import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class359 {

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field5146 = class430.method2664(95);

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Ljava/lang/String;")
    public String field5135;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Ljava/lang/String;")
    public String field5144;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/lang/String;")
    public String field5147;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Ljava/lang/String;")
    public String field5139;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public int field5141;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public int field5142;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "Ljava/lang/String;")
    public String field5143;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field5136;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public int field5137;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lhb;")
    public static class588 field5138;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB[BI[BIII)V", line = 7)
    public static final void method2289(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field5134++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg2 != -91) {
            field5138 = null;
        }
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg3[var10001] += arg5[arg1++];
                int var14 = arg6++;
                arg3[var14] += arg5[arg1++];
                int var15 = arg6++;
                arg3[var15] += arg5[arg1++];
                int var16 = arg6++;
                arg3[var16] += arg5[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg3[var10001] += arg5[arg1++];
            }
            arg6 += arg0;
            arg1 += arg8;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 52)
    public static void method2290(int arg0) {
        int var1 = 65 % ((3 - arg0) / 50);
        field5138 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", line = 65)
    public final void method2291(String arg0, byte arg1, int arg2, String arg3, String arg4, String arg5, String arg6, int arg7, int arg8) {
        this.field5146 = class430.method2664(arg1 + 198);
        field5140++;
        if (arg1 != -95) {
            method2289(50, 80, (byte) -94, null, 62, null, 9, -10, -18);
        }
        this.field5136 = arg2;
        this.field5139 = arg3;
        this.field5142 = arg7;
        this.field5143 = arg4;
        this.field5144 = arg0;
        this.field5141 = class483.field6741;
        this.field5147 = arg5;
        this.field5137 = arg8;
        this.field5135 = arg6;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 85)
    public static final void method2292(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class704.method3966((byte) 84)) {
            if (class297.field4232 == null) {
                class625.method3523(18);
            }
            class720.field10024 = true;
            class140.field1995 = 0;
        }
        field5145++;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 109)
    public class359(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field5135 = arg2;
        this.field5144 = arg5;
        this.field5147 = arg3;
        this.field5139 = arg7;
        this.field5141 = class483.field6741;
        this.field5142 = arg0;
        this.field5143 = arg4;
        this.field5136 = arg1;
        this.field5137 = arg6;
    }
}
