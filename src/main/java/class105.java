import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 extends class134 {

    @OriginalMember(owner = "client!pa", name = "Z", descriptor = "I")
    public int field2377 = 0;

    @OriginalMember(owner = "client!pa", name = "V", descriptor = "Lwd;")
    public static class150 field2373 = class2.method9(true, "l");

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field2369 = 0;

    @OriginalMember(owner = "client!pa", name = "eb", descriptor = "I")
    public static int field2382 = 1;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "[Lwd;")
    public static class150[] field2367 = new class150[100];

    @OriginalMember(owner = "client!pa", name = "fb", descriptor = "Lwd;")
    private static class150 field2383 = class2.method9(true, "Login");

    @OriginalMember(owner = "client!pa", name = "bb", descriptor = "Lwd;")
    public static class150 field2379 = class2.method9(true, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!pa", name = "X", descriptor = "Lwd;")
    public static class150 field2375 = field2383;

    @OriginalMember(owner = "client!pa", name = "gb", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!pa", name = "U", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!pa", name = "Y", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!pa", name = "ab", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!pa", name = "cb", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!pa", name = "db", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!pa", name = "W", descriptor = "Lv;")
    public static class140 field2374;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
    public static final void method722(int arg0, int arg1, int arg2) {
        if (arg1 > -52) {
            field2373 = null;
        }
        if (class104.field2346 != 0 && arg2 != -1) {
            class63.method501((byte) -107, class104.field2346, 0, class40.field1068, arg2, false);
            class82.field1974 = true;
        }
        field2380++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILwb;)V")
    public final void method723(int arg0, class148 arg1) {
        if (arg0 != 7813) {
            method726(57, (byte) -99);
        }
        while (true) {
            int var3 = arg1.method1137(255);
            if (var3 == 0) {
                field2378++;
                return;
            }
            this.method727(arg1, -110, var3);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lff;Z)V")
    public static final void method724(class42 arg0, boolean arg1) {
        field2381++;
        if (arg1) {
            class4.field83 = arg0;
            class141.field3356 = class4.field83.method319((byte) 65, 16);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V")
    public static final void method725(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 125 % ((11 - arg1) / 60);
        field2368++;
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                class121.field2789[arg0][arg3 + var5][arg2 + var8] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class121.field2789[arg0][arg3][arg2 + var6] = class121.field2789[arg0][arg3 - 1][arg2 + var6];
            }
        }
        if (arg2 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                class121.field2789[arg0][arg3 + var7][arg2] = class121.field2789[arg0][arg3 + var7][arg2 - 1];
            }
        }
        if (arg3 > 0 && class121.field2789[arg0][arg3 - 1][arg2] != 0) {
            class121.field2789[arg0][arg3][arg2] = class121.field2789[arg0][arg3 - 1][arg2];
        } else if (arg2 > 0 && class121.field2789[arg0][arg3][arg2 - 1] != 0) {
            class121.field2789[arg0][arg3][arg2] = class121.field2789[arg0][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && class121.field2789[arg0][arg3 - 1][arg2 - 1] != 0) {
            class121.field2789[arg0][arg3][arg2] = class121.field2789[arg0][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)Lwd;")
    public static final class150 method726(int arg0, byte arg1) {
        field2376++;
        if (arg1 != -23) {
            return null;
        } else if (arg0 < 100000) {
            return class29.method239(1000, arg0);
        } else if (arg0 < 10000000) {
            return class111.method786((byte) -126, new class150[] { class29.method239(1000, arg0 / 1000), class125.field2896 });
        } else {
            return class111.method786((byte) 88, new class150[] { class29.method239(1000, arg0 / 1000000), class134.field3147 });
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lwb;II)V")
    private final void method727(class148 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field2377 = arg0.method1140(-1);
        }
        if (arg1 > -70) {
            method724(null, true);
        }
        field2371++;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static void method728(int arg0) {
        field2373 = null;
        field2375 = null;
        if (arg0 != -1) {
            method728(-45);
        }
        field2383 = null;
        field2379 = null;
        field2374 = null;
        field2367 = null;
    }
}
