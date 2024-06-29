import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class183 extends class270 {

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    private int field2917 = 4096;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "Lmh;")
    public static class62 field2922 = class201.method1405(true, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field2924 = 0;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "Lmh;")
    public static class62 field2925 = class201.method1405(true, "::errortest");

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "Lsk;")
    public static class199 field2916 = new class199(500);

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "[I")
    public static int[] field2930 = new int[32];

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "[[[I")
    public static int[][][] field2927 = new int[4][13][13];

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "Lmh;")
    public static class62 field2928 = class201.method1405(true, "Welt");

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lmh;")
    public static class62 field2934 = class201.method1405(true, "<col=00ffff>");

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "Lmh;")
    public static class62 field2933 = class201.method1405(true, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "[I")
    public static int[] field2935 = new int[100];

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lmh;")
    private static class62 field2932 = class201.method1405(true, "Prepared sound engine");

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "Lmh;")
    public static class62 field2936 = field2932;

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "Led;")
    public static class49 field2929 = new class49(512);

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "[I")
    public static int[] field2931;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "[[[I")
    public static int[][][] field2926;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 12)
    public class183() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "(B)V", line = 21)
    public static void method1286(byte arg0) {
        field2925 = null;
        field2929 = null;
        field2935 = null;
        field2926 = (int[][][]) null;
        field2922 = null;
        int var1 = -66 / ((arg0 + 76) / 46);
        field2931 = null;
        field2934 = null;
        field2932 = null;
        field2916 = null;
        field2927 = (int[][][]) null;
        field2933 = null;
        field2930 = null;
        field2936 = null;
        field2928 = null;
    }

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "(B)V", line = 43)
    public static final void method1287(byte arg0) {
        field2920++;
        if (class265.field4466 == 0) {
            return;
        }
        try {
            if (++class176.field2817 > 2000) {
                if (class200.field3381 != null) {
                    class200.field3381.method1193(-1);
                    class200.field3381 = null;
                }
                if (class80.field1340 >= 1) {
                    class265.field4466 = 0;
                    class243.field4131 = -5;
                    return;
                }
                class265.field4466 = 1;
                class80.field1340++;
                if (class78.field1315 == class20.field202) {
                    class78.field1315 = class243.field4136;
                } else {
                    class78.field1315 = class20.field202;
                }
                class176.field2817 = 0;
            }
            if (class265.field4466 == 1) {
                class124.field2049 = class193.field3246.method1947(false, class78.field1315, class36.field474);
                class265.field4466 = 2;
            }
            if (class265.field4466 == 2) {
                if (class124.field2049.field2322 == 2) {
                    throw new IOException();
                }
                if (class124.field2049.field2322 != 1) {
                    return;
                }
                class200.field3381 = new class165((Socket) class124.field2049.field2323, class193.field3246);
                class124.field2049 = null;
                class200.field3381.method1187(0, class170.field2772.field1476, -123, class170.field2772.field1495);
                if (class221.field3800 != null) {
                    class221.field3800.method852(true);
                }
                if (class158.field2537 != null) {
                    class158.field2537.method852(true);
                }
                int var1 = class200.field3381.method1191((byte) 105);
                if (class221.field3800 != null) {
                    class221.field3800.method852(true);
                }
                if (class158.field2537 != null) {
                    class158.field2537.method852(true);
                }
                if (var1 != 21) {
                    class243.field4131 = var1;
                    class265.field4466 = 0;
                    class200.field3381.method1193(-1);
                    class200.field3381 = null;
                    return;
                }
                class265.field4466 = 3;
            }
            if (class265.field4466 == 3) {
                if (class200.field3381.method1185((byte) 42) < 1) {
                    return;
                }
                class238.field4070 = new class62[class200.field3381.method1191((byte) 122)];
                class265.field4466 = 4;
            }
            if (class265.field4466 == 4) {
                if (class200.field3381.method1185((byte) 53) < (class238.field4070.length * 8)) {
                    return;
                }
                class75.field1223.field1476 = 0;
                class200.field3381.method1192((byte) 125, 0, class238.field4070.length * 8, class75.field1223.field1495);
                for (int var2 = 0; var2 < class238.field4070.length; var2++) {
                    class238.field4070[var2] = class170.method1227(0, class75.field1223.method690(106));
                }
                class265.field4466 = 0;
                class243.field4131 = 21;
                class200.field3381.method1193(-1);
                class200.field3381 = null;
                return;
            }
            if (arg0 > -50) {
                method1286((byte) 23);
            }
        } catch (IOException var4) {
            if (class200.field3381 != null) {
                class200.field3381.method1193(-1);
                class200.field3381 = null;
            }
            if (class80.field1340 >= 1) {
                class265.field4466 = 0;
                class243.field4131 = -4;
            } else {
                class176.field2817 = 0;
                class80.field1340++;
                class265.field4466 = 1;
                if (class78.field1315 == class20.field202) {
                    class78.field1315 = class243.field4136;
                } else {
                    class78.field1315 = class20.field202;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)[I", line = 196)
    public final int[] method6(int arg0, int arg1) {
        if (arg0 != 18693) {
            field2933 = (class62) null;
        }
        int[] var3 = this.field4573.method919(arg1, arg0 + 7379);
        field2919++;
        if (this.field4573.field1984) {
            int[] var4 = this.method1850(0, 0, class307.field5268 & arg1 - 1);
            int[] var5 = this.method1850(0, 0, arg1);
            int[] var6 = this.method1850(0, arg0 - 18693, class307.field5268 & arg1 + 1);
            for (int var7 = 0; var7 < class109.field1770; var7++) {
                int var8 = (var5[var7 + 1 & class49.field717] - var5[var7 - 1 & class49.field717]) * this.field2917;
                int var9 = var8 >> 12;
                int var10 = (var6[var7] - var4[var7]) * this.field2917;
                int var11 = var10 >> 12;
                int var12 = var9 * var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lmi;II)V", line = 264)
    public final void method8(class92 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2917 = arg0.method721(127);
        }
        field2921++;
        int var4 = 126 / ((arg2 + 8) / 53);
    }
}
