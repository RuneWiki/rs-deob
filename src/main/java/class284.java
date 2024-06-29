import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class284 {

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "[B")
    public byte[] field3619;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "[S")
    public short[] field3615;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "[S")
    public short[] field3620;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "[S")
    public short[] field3621;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
    public static final void method1707(boolean arg0) {
        field3616++;
        class518.field7289.method163(class192.field2514, class156.field1977, class200.field2563);
        if (!arg0) {
            method1709(null, -55, 120, 112, 13);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lha;IIIIB)V")
    public static final void method1708(class454 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3618++;
        class422.field5998 = arg0;
        class351.field4604 = class422.field5998.method125();
        class593.field8260 = class422.field5998.method125();
        class128.field1554 = class422.field5998.method125();
        class687.field9708 = arg2;
        class115.field1420 = arg3;
        class641.field8860 = null;
        class87.field1109 = null;
        class709.field9973 = 0;
        int var6 = -14 / ((arg5 + 64) / 35);
        class181.method1165(arg1, arg4, 60);
        class41.field583 = -1;
        class718.field10118 = -1;
        class580.field8062 = -1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([IIIII)V")
    public static final void method1709(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field3622++;
        arg3--;
        if (arg2 != -8251) {
            field3617 = -57;
        }
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (arg3 < var5) {
            int var7 = arg3 + 1;
            arg0[var7] = arg4;
            int var8 = var7 + 1;
            arg0[var8] = arg4;
            int var9 = var8 + 1;
            arg0[var9] = arg4;
            int var10 = var9 + 1;
            arg0[var10] = arg4;
            int var11 = var10 + 1;
            arg0[var11] = arg4;
            int var12 = var11 + 1;
            arg0[var12] = arg4;
            int var13 = var12 + 1;
            arg0[var13] = arg4;
            arg3 = var13 + 1;
            arg0[arg3] = arg4;
        }
        while (var6 > arg3) {
            arg3++;
            arg0[arg3] = arg4;
        }
    }
}
