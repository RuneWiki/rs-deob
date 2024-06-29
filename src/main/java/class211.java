import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class211 extends class171 {

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field3490 = 128;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "[I")
    public static int[] field3487 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[I")
    public static int[] field3491 = new int[25];

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "Lok;")
    public static class146 field3496 = class235.method1724(-12908, "m");

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "Lok;")
    public static class146 field3500 = class235.method1724(-12908, "<)4col> x");

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "B")
    public byte field3495;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public int field3497;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Lok;")
    public class146 field3489;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Lok;")
    public class146 field3494;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V", line = 18)
    public static final void method1582(int arg0, int arg1) {
        if (arg0 != -8264) {
            method1582(96, 33);
        }
        class45.field763--;
        field3488++;
        if (class45.field763 == arg1) {
            return;
        }
        class244.method1766(class227.field3782, arg1 + 1, class227.field3782, arg1, class45.field763 - arg1);
        class244.method1766(class214.field3525, arg1 + 1, class214.field3525, arg1, class45.field763 - arg1);
        class244.method1765(class21.field405, arg1 + 1, class21.field405, arg1, class45.field763 - arg1);
        class244.method1763(class224.field3739, arg1 + 1, class224.field3739, arg1, class45.field763 - arg1);
        class244.method1764(class37.field675, arg1 + 1, class37.field675, arg1, class45.field763 - arg1);
        class244.method1765(class93.field1493, arg1 + 1, class93.field1493, arg1, class45.field763 - arg1);
        class244.method1765(class259.field4308, arg1 + 1, class259.field4308, arg1, class45.field763 - arg1);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V", line = 41)
    public static void method1583(byte arg0) {
        field3491 = null;
        field3496 = null;
        int var1 = 126 / ((arg0 - 16) / 57);
        field3487 = null;
        field3500 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)[B", line = 73)
    public static final byte[] method1584(int arg0, byte arg1) {
        field3502++;
        class180 var2 = (class180) class4.field45.method1511((long) arg0, 87);
        if (var2 == null) {
            Random var3 = new Random((long) arg0);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class9.method66(-482656096, var7, var3);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class180(var4);
            class4.field45.method1509((long) arg0, arg1 ^ 0x1E, var2);
        }
        if (arg1 != 93) {
            field3487 = (int[]) null;
        }
        return var2.field3022;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Loh;ILoh;BI)Lih;", line = 122)
    public static final class30 method1585(class15 arg0, int arg1, class15 arg2, byte arg3, int arg4) {
        field3493++;
        if (arg3 != 106) {
            field3487 = (int[]) null;
        }
        return class230.method1688(arg1, arg4, arg3 ^ 0x4AF, arg0) ? class288.method2076((byte) 57, arg2.method92(arg1, arg3 ^ 0x6A, arg4)) : null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V", line = 143)
    public static final void method1586() {
        for (int var0 = 0; var0 < class120.field1953; var0++) {
            class311 var1 = class206.field3433[var0];
            class9.method61(var1);
            class206.field3433[var0] = null;
        }
        class120.field1953 = 0;
    }
}
