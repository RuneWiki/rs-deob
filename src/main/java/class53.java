import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class53 extends class222 {

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public int field863 = -1;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public int field864 = 0;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field869 = 1;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Lcf;")
    private static class93 field866 = class147.method1066("Loaded wordpack", -48);

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field875 = 0;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[I")
    public static int[] field860 = new int[50];

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field882 = 0;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Lcf;")
    public static class93 field884 = field866;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field861;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public int field865;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public int field871;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field872;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public int field883;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Lgk;")
    public static class157 field873;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
    public static final void method289(byte arg0) {
        int var1 = 83 % ((arg0 + 48) / 61);
        field868++;
        class9.field119.method294(0);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JZ)V")
    public static final void method290(long arg0, boolean arg1) {
        field880++;
        if (!arg1) {
            method291(23);
        }
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class97.method709(arg0 - 1L, 2);
            class97.method709(1L, 2);
        } else {
            class97.method709(arg0, 2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static void method291(int arg0) {
        field884 = null;
        field873 = null;
        field860 = null;
        if (arg0 <= 93) {
            field882 = 87;
        }
        field866 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    public static final void method292(int arg0, int arg1) {
        class16.method76(-118);
        if (arg1 <= 2) {
            return;
        }
        class190.method1371((byte) 68);
        int var2 = class4.method16(-18960, arg0).field531;
        field862++;
        if (var2 == 0) {
            return;
        }
        int var3 = class176.field3061[arg0];
        if (var2 == 5) {
            class67.field1227 = var3;
        }
        if (var2 == 9) {
            class207.field3711 = var3;
        }
        if (var2 == 6) {
            class128.field2256 = var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIZLbk;I)Lbk;")
    public static final class20 method293(int arg0, int arg1, int arg2, int arg3, boolean arg4, class20 arg5, int arg6) {
        field874++;
        long var7 = (long) arg3;
        class20 var9 = (class20) class9.field119.method302(var7, 0);
        if (var9 == null) {
            class64 var10 = class64.method443(class185.field3399, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method436(64, 768, -50, -10, -50);
            class9.field119.method297(var7, var9, 10414);
        }
        if (arg4) {
            field869 = 92;
        }
        int var11 = arg5.method103();
        int var12 = arg5.method113();
        int var13 = arg5.method90();
        int var14 = arg5.method105();
        class20 var15 = var9.method104(true, true, true);
        if (arg0 != 0) {
            var15.method101(arg0);
        }
        class62 var16 = (class62) var15;
        if (class13.method56(arg6 + var13, arg1 + var11, (byte) 39, class138.field2405) != arg2 || arg2 != class13.method56(arg6 + var14, arg1 + var12, (byte) 61, class138.field2405)) {
            for (int var17 = 0; var17 < var16.field1074; var17++) {
                var16.field1065[var17] += class13.method56(var16.field1070[var17] + arg6, var16.field1067[var17] + arg1, (byte) 53, class138.field2405) - arg2;
            }
            var16.field1054 = false;
        }
        return var15;
    }
}
