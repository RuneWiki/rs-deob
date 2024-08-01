import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("de")
public class class36 extends class71 {

    @OriginalMember(owner = "de", name = "t", descriptor = "[B")
    public byte[] field795;

    @OriginalMember(owner = "de", name = "r", descriptor = "Llf;")
    public static class109 field793 = class35.method275("VOLL", 2);

    @OriginalMember(owner = "de", name = "p", descriptor = "Llf;")
    public static class109 field791 = class35.method275("mapedge", 2);

    @OriginalMember(owner = "de", name = "q", descriptor = "Z")
    public static boolean field792 = false;

    @OriginalMember(owner = "de", name = "u", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "de", name = "y", descriptor = "Llf;")
    private static class109 field800 = class35.method275("Error loading your profile)3", 2);

    @OriginalMember(owner = "de", name = "s", descriptor = "Llf;")
    public static class109 field794 = field800;

    @OriginalMember(owner = "de", name = "n", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "de", name = "o", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "de", name = "v", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "de", name = "x", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "de", name = "w", descriptor = "[Z")
    public static boolean[] field798;

    @OriginalMember(owner = "de", name = "a", descriptor = "(I)V")
    public static void method276(int arg0) {
        field798 = null;
        field800 = null;
        field794 = null;
        if (arg0 != 5685) {
            method277(122, -83, 58, 76, null, null, -70, 77, -45, -83, 79L);
        }
        field791 = null;
        field793 = null;
    }

    @OriginalMember(owner = "de", name = "a", descriptor = "(IIIILka;Lka;IIIIJ)V")
    public static final void method277(int arg0, int arg1, int arg2, int arg3, class95 arg4, class95 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class104 var12 = new class104();
        var12.field2054 = arg10;
        var12.field2062 = arg1 * 128 + 64;
        var12.field2047 = arg2 * 128 + 64;
        var12.field2046 = arg3;
        var12.field2048 = arg4;
        var12.field2049 = arg5;
        var12.field2055 = arg6;
        var12.field2056 = arg7;
        var12.field2057 = arg8;
        var12.field2058 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class78.field1550[var13][arg1][arg2] == null) {
                class78.field1550[var13][arg1][arg2] = new class3(var13, arg1, arg2);
            }
        }
        class78.field1550[arg0][arg1][arg2].field34 = var12;
    }

    @OriginalMember(owner = "de", name = "a", descriptor = "(IB)V")
    public static final void method278(int arg0, byte arg1) {
        field799++;
        if (class107.field2123 == arg0) {
            return;
        }
        if (class107.field2123 == 0) {
            class88.method657(-67);
        }
        if (arg0 == 20 || arg0 == 40) {
            class46.field960 = 0;
            class31.field745 = 0;
            class31.field732 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class45.field952 != null) {
            class45.field952.method915((byte) -52);
            class45.field952 = null;
        }
        if (class107.field2123 == 25) {
            class98.field1983 = 1;
            class141.field2736 = 0;
            class49.field1008 = 0;
            class172.field3226 = 0;
            class138.field2678 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class57.method380(class73.field1410, -117, class39.field835, class6.field88);
        } else {
            class18.method165(24831);
        }
        class107.field2123 = arg0;
        if (arg1 != -64) {
            method277(-59, 23, 66, 16, null, null, -117, -36, -93, 58, 123L);
        }
    }

    @OriginalMember(owner = "de", name = "<init>", descriptor = "([B)V")
    public class36(byte[] arg0) {
        this.field795 = arg0;
    }

    @OriginalMember(owner = "de", name = "a", descriptor = "([Llf;I)Llf;")
    public static final class109 method279(class109[] arg0, int arg1) {
        field790++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        int var2 = -98 % ((59 - arg1) / 56);
        return class29.method235(arg0.length, (byte) 53, arg0, 0);
    }
}
