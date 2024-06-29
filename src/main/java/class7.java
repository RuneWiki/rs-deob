import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class7 extends class98 {

    @OriginalMember(owner = "client!bc", name = "M", descriptor = "Ltl;")
    public static class59 field82 = class85.method639("hint_mapedge", 9588);

    @OriginalMember(owner = "client!bc", name = "P", descriptor = "Z")
    public static boolean field85 = true;

    @OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
    public static int field83 = 0;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "D")
    public static double field89 = -1.0D;

    @OriginalMember(owner = "client!bc", name = "R", descriptor = "B")
    public byte field87;

    @OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!bc", name = "J", descriptor = "Ls;")
    public class170 field81;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLtl;)V", line = 15)
    public static final void method52(byte arg0, class59 arg1) {
        field80++;
        if (class96.field1524 == null) {
            return;
        }
        long var2 = arg1.method488((byte) -34);
        int var4 = 0;
        if (var2 == 0L) {
            return;
        }
        while (var4 < class96.field1524.length && class96.field1524[var4].field4932 != var2) {
            var4++;
        }
        int var5 = -73 % ((arg0 - 40) / 62);
        if (var4 < class96.field1524.length && class96.field1524[var4] != null) {
            class234.field3888.method1768(true, 124);
            class39.field584++;
            class234.field3888.method1206(class96.field1524[var4].field4932, false);
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)[B", line = 49)
    public final byte[] method53(int arg0) {
        field88++;
        if (this.field1577 || this.field81.field2787 < this.field81.field2758.length - this.field87) {
            throw new RuntimeException();
        }
        int var2 = 71 / ((73 - arg0) / 32);
        return this.field81.field2758;
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V", line = 72)
    public static void method54(int arg0) {
        field82 = null;
        int var1 = -20 % ((arg0 + 15) / 36);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)V", line = 83)
    public static final void method55(int arg0, int arg1, byte arg2) {
        class308.field5244[arg0] = arg1;
        field86++;
        if (arg2 != -120) {
            method57(112, -28, 30, -10, (class260) null, (class263) null, 29);
        }
        class19 var3 = (class19) class33.field474.method685((long) arg0, 128);
        if (var3 == null) {
            class19 var4 = new class19(4611686018427387905L);
            class33.field474.method694(var4, (byte) -90, (long) arg0);
        } else if (var3.field255 != 4611686018427387905L) {
            var3.field255 = class205.method1451(arg2 + 23) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)I", line = 115)
    public final int method56(byte arg0) {
        if (arg0 < 23) {
            field82 = (class59) null;
        }
        field93++;
        return this.field81 == null ? 0 : this.field81.field2787 * 100 / (this.field81.field2758.length - this.field87);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIILoj;Lma;I)V", line = 138)
    public static final void method57(int arg0, int arg1, int arg2, int arg3, class260 arg4, class263 arg5, int arg6) {
        field90++;
        if (arg4 == null) {
            return;
        }
        int var7 = class64.field983 + class213.field3489 & 0x7FF;
        int var8 = arg2 * arg2 + arg3 * arg3;
        int var9 = Math.max(arg5.field4420 / arg0, arg5.field4467 / 2) + 10;
        if (var8 > var9 * var9) {
            return;
        }
        int var10 = class298.field5095[var7];
        int var11 = var10 * 256 / (class45.field731 + 256);
        int var12 = class298.field5094[var7];
        int var13 = var12 * 256 / (class45.field731 + 256);
        int var14 = arg2 * var13 - (arg3 * var11) >> 16;
        int var15 = arg2 * var11 + arg3 * var13 >> 16;
        if (class55.field815) {
            ((class122) arg4).method908(arg5.field4420 / 2 + arg1 - (-var15 - -(arg4.field4336 / 2)), arg5.field4467 / 2 + arg6 + -(arg4.field4335 / 2) + -var14, (class122) arg5.method1816(0, false));
        } else {
            ((class47) arg4).method342(arg5.field4420 / 2 + arg1 + var15 - (arg4.field4336 / 2), arg5.field4467 / 2 + arg6 + -var14 + -(arg4.field4335 / 2), arg5.field4418, arg5.field4447);
        }
    }
}
