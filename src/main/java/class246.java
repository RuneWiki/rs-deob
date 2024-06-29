import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public abstract class class246 {

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "Lri;")
    public static class73 field3625 = new class73(46, -1);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "Ltl;")
    public static class436 field3628;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 5)
    public static void method1651(byte arg0) {
        if (arg0 <= 41) {
            method1654(12, null, (byte) 12, 117);
        }
        field3628 = null;
        field3625 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)I", line = 16)
    public static final int method1652(int arg0, int arg1, int arg2, int arg3) {
        field3621++;
        int var4 = ((arg3 & 0xFF00) * arg0 & 0xFF0000 | (arg3 & 0xFF00FF) * arg0 & 0xFF00FF00) >>> 8;
        if (arg1 != -14942) {
            field3625 = null;
        }
        int var5 = 255 - arg0;
        return (((arg2 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg2 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)V", line = 30)
    public static final void method1653(int arg0) {
        if (class90.field1361 != null) {
            class90.field1361.method2312(false);
            class90.field1361 = null;
        }
        field3626++;
        class426.method2554(-23);
        class261.method1734();
        for (int var1 = 0; var1 < 4; var1++) {
            class434.field6500[var1].method863(arg0 + 4465);
        }
        class307.method1935(false, -120);
        System.gc();
        class13.method84(false, 2);
        class386.field5852 = -1;
        class104.field1515 = false;
        class272.method1788(true, 22079);
        class116.field1744 = 0;
        class474.field6982 = 0;
        class24.field259 = 0;
        class210.field3062 = 0;
        class68.field1038 = 0;
        for (int var2 = 0; var2 < class409.field6169.length; var2++) {
            class409.field6169[var2] = null;
        }
        class272.method1786(25485);
        if (arg0 != -4548) {
            field3625 = null;
        }
        for (int var3 = 0; var3 < 2048; var3++) {
            class44.field707[var3] = null;
        }
        class402.field6044 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class193.field2821[var4] = null;
        }
        class176.field2591.method2601(arg0 - 17311);
        class375.method2302((byte) -98);
        class483.field7081 = 0;
        class49.field796.method1208(arg0 ^ 0x7575);
        class366.method2274((byte) -51);
        class49.method305(arg0 + 4603);
        class500.method2992(true, false);
        try {
            class501.method2995("loggedout", (byte) 85, class483.field7077.field6462);
        } catch (Throwable var5) {
        }
        class110.field1574 = 0L;
        client.field2857 = null;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ILvg;BI)V", line = 103)
    public static final void method1654(int arg0, class38 arg1, byte arg2, int arg3) {
        field3623++;
        if (arg2 <= 45) {
            field3628 = null;
        }
        class381 var4 = arg1.method225(-1, class348.field5015);
        if (var4 == null) {
            return;
        }
        class348.field5015.method1098(arg3, arg0, arg1.field553 + arg3, arg1.field472 + arg0);
        if (class425.field6375 >= 3) {
            class348.field5015.method1034(-16777216, var4, arg3, arg0);
        } else {
            class199.field2884.method3122((float) arg1.field553 / 2.0F + (float) arg3, (float) arg1.field472 / 2.0F + (float) arg0, 4096, (int) (-class382.field5792) & 0x3FFF << 2, var4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II[I[JI)V", line = 136)
    public static final void method1657(int arg0, int arg1, int[] arg2, long[] arg3, int arg4) {
        if (arg1 > arg4) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg1; var11++) {
                if (arg3[var11] < (var7 + ((long) (var11 & var10)))) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    int var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var9;
            method1657(-6474, var6 - 1, arg2, arg3, arg4);
            method1657(arg0, arg1, arg2, arg3, var6 + 1);
        }
        field3624++;
        if (arg0 != -6474) {
            field3628 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BJ)V", line = 192)
    public static final void method1659(byte arg0, long arg1) {
        field3622++;
        if (arg1 <= 0L || arg0 != 117) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class80.method466(arg1 - 1L, -26750);
            class80.method466(1L, -26750);
        } else {
            class80.method466(arg1, -26750);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Z")
    public abstract boolean method1650(int arg0);

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)I")
    public abstract int method1655(boolean arg0);

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)I")
    public abstract int method1656(byte arg0);

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)C")
    public abstract char method1658(int arg0);

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)J")
    public abstract long method1660(int arg0);
}
