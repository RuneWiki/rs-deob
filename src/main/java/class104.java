import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class104 {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2192 = Calendar.getInstance();

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lpe;")
    public static class109 field2197 = class141.method1120("Benutzen", 0);

    @OriginalMember(owner = "client!p", name = "i", descriptor = "[Lha;")
    public static class50[] field2194 = new class50[2048];

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lpe;")
    private static class109 field2196 = class141.method1120("Error connecting to server)3", 0);

    @OriginalMember(owner = "client!p", name = "p", descriptor = "Lpe;")
    private static class109 field2201 = class141.method1120("Existing User", 0);

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lpe;")
    private static class109 field2193 = class141.method1120("Loaded wordpack", 0);

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lpe;")
    private static class109 field2200 = class141.method1120("Loaded title screen", 0);

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field2199 = 0;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "Lpe;")
    public static class109 field2198 = class141.method1120("Bitte geben Sie Ihren Benutzenamen ein)3", 0);

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Lpe;")
    public static class109 field2206 = class141.method1120("headicons_pk", 0);

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lpe;")
    public static class109 field2205 = field2201;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Lpe;")
    public static class109 field2204 = field2200;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "[Lpe;")
    public static class109[] field2202 = new class109[1000];

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lpe;")
    public static class109 field2203 = field2196;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lpe;")
    public static class109 field2195 = field2193;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!p", name = "w", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "Lre;")
    public static class123 field2207;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method835(byte arg0) {
        field2196 = null;
        field2195 = null;
        field2198 = null;
        field2204 = null;
        if (arg0 <= 124) {
            method838(null, -1, -47, null, null, 70);
        }
        field2206 = null;
        field2201 = null;
        field2192 = null;
        field2193 = null;
        field2203 = null;
        field2197 = null;
        field2194 = null;
        field2200 = null;
        field2207 = null;
        field2202 = null;
        field2205 = null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public static final void method836(byte arg0) {
        field2191++;
        class3.field71.method92((byte) 117);
        if (arg0 != 28) {
            method838(null, -74, -43, null, null, 64);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lfb;IILre;)V")
    public static final void method837(class38 arg0, int arg1, int arg2, class123 arg3) {
        class134 var4 = new class134();
        var4.field2925 = arg0;
        var4.field267 = arg1;
        var4.field2915 = 1;
        var4.field2926 = arg3;
        if (arg2 != -129) {
            method837(null, 116, -84, null);
        }
        class19 var5 = class11.field244;
        synchronized (class11.field244) {
            class11.field244.method188(arg2 ^ 0x81, var4);
        }
        field2187++;
        class44.method401(1);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([III[I[Lue;I)V")
    public static final void method838(int[] arg0, int arg1, int arg2, int[] arg3, class144[] arg4, int arg5) {
        if (arg1 > arg5) {
            int var6 = arg1 + 1;
            int var7 = arg5 - 1;
            int var8 = (arg5 + arg1) / 2;
            class144 var9 = arg4[var8];
            arg4[var8] = arg4[arg5];
            arg4[arg5] = var9;
            while (var6 > var7) {
                boolean var10 = true;
                do {
                    var6--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg3[var11] == 2) {
                            var12 = arg4[var6].field3165;
                            var13 = var9.field3165;
                        } else if (arg3[var11] == 1) {
                            var13 = var9.field3167;
                            if (var13 == -1 && arg0[var11] == 1) {
                                var13 = 2001;
                            }
                            var12 = arg4[var6].field3167;
                            if (var12 == -1 && arg0[var11] == 1) {
                                var12 = 2001;
                            }
                        } else if (arg3[var11] == 3) {
                            var13 = var9.field3157 ? 1 : 0;
                            var12 = arg4[var6].field3157 ? 1 : 0;
                        } else {
                            var12 = arg4[var6].field3161;
                            var13 = var9.field3161;
                        }
                        if (var12 != var13) {
                            if ((arg0[var11] != 1 || var12 <= var13) && (arg0[var11] != 0 || var12 >= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var7++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg3[var15] == 2) {
                            var16 = var9.field3165;
                            var17 = arg4[var7].field3165;
                        } else if (arg3[var15] == 1) {
                            var16 = var9.field3167;
                            if (var16 == -1 && arg0[var15] == 1) {
                                var16 = 2001;
                            }
                            var17 = arg4[var7].field3167;
                            if (var17 == -1 && arg0[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg3[var15] == 3) {
                            var17 = arg4[var7].field3157 ? 1 : 0;
                            var16 = var9.field3157 ? 1 : 0;
                        } else {
                            var16 = var9.field3161;
                            var17 = arg4[var7].field3161;
                        }
                        if (var16 != var17) {
                            if ((arg0[var15] != 1 || var17 >= var16) && (arg0[var15] != 0 || var16 >= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var7 < var6) {
                    class144 var18 = arg4[var7];
                    arg4[var7] = arg4[var6];
                    arg4[var6] = var18;
                }
            }
            method838(arg0, var6, -122, arg3, arg4, arg5);
            method838(arg0, arg1, -103, arg3, arg4, var6 + 1);
        }
        field2190++;
        if (arg2 >= -81) {
            method837(null, -6, -49, null);
        }
    }
}
