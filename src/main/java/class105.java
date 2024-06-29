import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class105 {

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Lob;")
    public static class141 field2020 = class175.method1195(40, "");

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Lob;")
    public static class141 field2025 = field2020;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "Lob;")
    public static class141 field2024 = field2020;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lob;")
    public static class141 field2021 = field2020;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "Lob;")
    public static class141 field2019 = field2020;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "Lob;")
    private static class141 field2017 = class175.method1195(40, "Too many connections from your address)3");

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lob;")
    public static class141 field2023 = field2017;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "Lob;")
    public static class141 field2026 = class175.method1195(40, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "Lob;")
    public static class141 field2022 = class175.method1195(40, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lob;")
    public static class141 field2018 = field2020;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "Lob;")
    public static class141 field2027 = field2020;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method697(byte arg0) {
        field2019 = null;
        field2023 = null;
        field2018 = null;
        field2021 = null;
        field2020 = null;
        field2026 = null;
        int var1 = -32 / ((-arg0 - 47) / 40);
        field2024 = null;
        field2017 = null;
        field2025 = null;
        field2022 = null;
        field2027 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
    public static final void method698(int arg0, int arg1) {
        field2016++;
        class136 var2 = (class136) class96.field1894.method792((long) arg1, 22346);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != -25714) {
            return;
        }
        while (var2.field2586.length > var3) {
            var2.field2586[var3] = -1;
            var2.field2594[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILaa;Laa;IIJ)V")
    public static final void method699(int arg0, int arg1, int arg2, int arg3, class2 arg4, class2 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class172 var10 = new class172();
        var10.field3417 = arg8;
        var10.field3414 = arg1 * 128 + 64;
        var10.field3423 = arg2 * 128 + 64;
        var10.field3416 = arg3;
        var10.field3418 = arg4;
        var10.field3409 = arg5;
        var10.field3421 = arg6;
        var10.field3422 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class131.field2506[var11][arg1][arg2] == null) {
                class131.field2506[var11][arg1][arg2] = new class153(var11, arg1, arg2);
            }
        }
        class131.field2506[arg0][arg1][arg2].field2929 = var10;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIILog;I)V")
    public static final void method700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class146 arg6, int arg7) {
        if (arg2 >= 0 && arg2 < 104 && arg3 >= 0 && arg3 < 104) {
            class164.field3177[arg4][arg2][arg3] = 0;
            while (true) {
                int var8 = arg6.method991(255);
                if (var8 == 0) {
                    if (arg4 == 0) {
                        class31.field617[0][arg2][arg3] = -class10.method69(arg3 + arg5 + 556238, arg0 + 932731 - -arg2, (byte) -124) * 8;
                    } else {
                        class31.field617[arg4][arg2][arg3] = class31.field617[arg4 - 1][arg2][arg3] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg6.method991(255);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg4 == 0) {
                        class31.field617[0][arg2][arg3] = -var9 * 8;
                    } else {
                        class31.field617[arg4][arg2][arg3] = class31.field617[arg4 - 1][arg2][arg3] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class191.field3694[arg4][arg2][arg3] = arg6.method1000(1064893128);
                    class176.field3497[arg4][arg2][arg3] = (byte) ((var8 - 2) / 4);
                    class132.field2519[arg4][arg2][arg3] = (byte) class15.method94(arg7 + var8 - 2, 3);
                } else if (var8 <= 81) {
                    class164.field3177[arg4][arg2][arg3] = (byte) (var8 - 49);
                } else {
                    class118.field2295[arg4][arg2][arg3] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg6.method991(255);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg6.method991(255);
                    break;
                }
                if (var10 <= 49) {
                    arg6.method991(255);
                }
            }
        }
        if (arg1 <= 43) {
            method698(29, 124);
        }
        field2028++;
    }
}
