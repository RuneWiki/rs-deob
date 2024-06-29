import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class class14 {

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public int field161;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method79(int arg0) {
        field155++;
        int var2 = -50 / ((arg0 + 31) / 49);
        return (this.field161 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Z", line = 15)
    public final boolean method80(boolean arg0) {
        if (arg0) {
            this.field161 = -7;
        }
        field159++;
        return (this.field161 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)Z", line = 26)
    public final boolean method81(int arg0) {
        field158++;
        int var2 = 37 / ((arg0 - 5) / 59);
        return (this.field161 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V", line = 37)
    public static final void method82(int arg0, int arg1) {
        if (arg1 != 11474) {
            return;
        }
        field156++;
        class451.field5886 = arg0;
        class668 var2 = class369.field4757;
        synchronized (class369.field4757) {
            class369.field4757.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III[BI[BBII)V", line = 57)
    public static final void method83(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, byte arg6, int arg7, int arg8) {
        if (arg6 <= 35) {
            return;
        }
        field152++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg5[var10001] += arg3[arg0++];
                int var14 = arg2++;
                arg5[var14] += arg3[arg0++];
                int var15 = arg2++;
                arg5[var15] += arg3[arg0++];
                int var16 = arg2++;
                arg5[var16] += arg3[arg0++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg5[var10001] += arg3[arg0++];
            }
            arg0 += arg8;
            arg2 += arg4;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZI)I", line = 104)
    public static final int method84(int arg0, int arg1, boolean arg2, int arg3) {
        field157++;
        if (arg2) {
            return 29;
        } else {
            int var4 = ((arg0 & 0xFF00) * arg1 & 0xFF0000 | (arg0 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
            int var5 = 255 - arg1;
            return (((arg3 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg3 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ICI)I", line = 121)
    public static final int method85(int arg0, char arg1, int arg2) {
        field153++;
        if (arg0 != -10066) {
            method84(126, 13, false, 13);
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            char var4 = Character.toLowerCase(arg1);
            var3 = (var4 << 4) + 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(Z)Z", line = 144)
    public final boolean method86(boolean arg0) {
        if (arg0) {
            this.method80(false);
        }
        field151++;
        return (this.field161 & 0x1) != 0;
    }
}
