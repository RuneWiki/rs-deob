import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class165 extends class271 {

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "I")
    private final int field2921;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    private final int field2922;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    private final int field2914;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "I")
    private final int field2920;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    private final int field2924;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "I")
    private final int field2927;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    private final int field2911;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    private final int field2916;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Lmb;")
    public static class96 field2925 = class243.method1708("welle2:", (byte) 124);

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field2928 = 0;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Lmb;")
    public static class96 field2923 = class243.method1708("Gegenstand f-Ur Mitglieder", (byte) 96);

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Ljk;")
    public static class236 field2913;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "Lff;")
    public static class3 field2929;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "[Lrf;")
    public static class30[] field2918;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILck;)V")
    public static final void method1186(int arg0, class238 arg1) {
        if (arg1.field4087 != null) {
            arg1.field4087.field238 = 0;
        }
        arg1.field4085 = false;
        if (arg0 != 0) {
            field2923 = null;
        }
        for (class238 var2 = arg1.method237(); var2 != null; var2 = arg1.method225()) {
            method1186(arg0, var2);
        }
        ++field2912;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2921 = arg2;
        this.field2922 = arg6;
        this.field2914 = arg5;
        this.field2920 = arg0;
        this.field2924 = arg7;
        this.field2927 = arg1;
        this.field2911 = arg3;
        this.field2916 = arg4;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IBI)V")
    public final void method766(int arg0, byte arg1, int arg2) {
        ++field2930;
        int var4 = 117 % ((54 - arg1) / 59);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BZ)V")
    public static final void method1187(byte arg0, boolean arg1) {
        int var2 = -6 / ((12 - arg0) / 43);
        ++field2915;
        if (arg1 == !class116.field2168) {
            class116.field2168 = arg1;
            class77.method554(2047);
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(III)V")
    public final void method769(int arg0, int arg1, int arg2) {
        ++field2926;
        int var4 = this.field2927 * arg2 >> 12;
        int var5 = this.field2920 * arg0 >> 12;
        int var6 = this.field2911 * arg2 >> 12;
        int var7 = this.field2921 * arg0 >> 12;
        int var8 = this.field2922 * arg0 >> 12;
        int var9 = this.field2914 * arg2 >> 12;
        int var10 = this.field2916 * arg0 >> 12;
        int var11 = this.field2924 * arg2 >> 12;
        if (arg1 == 100) {
            class201.method1407(var6, var11, super.field4714, var10, var4, var5, var7, var9, (byte) 113, var8);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)V")
    public static void method1188(int arg0) {
        field2913 = null;
        field2925 = null;
        if (arg0 != 733712108) {
            method1188(-124);
        }
        field2918 = null;
        field2929 = null;
        field2923 = null;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(III)V")
    public final void method768(int arg0, int arg1, int arg2) {
        if (arg0 != 3298) {
            method1187((byte) -78, true);
        }
        ++field2917;
    }
}
