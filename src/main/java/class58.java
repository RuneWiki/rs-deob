import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class58 implements Runnable {

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[Lgb;")
    public volatile class74[] field1017 = new class74[2];

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Z")
    public volatile boolean field1022 = false;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Z")
    public volatile boolean field1019 = false;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Lmb;")
    public static class96 field1021 = class243.method1708("Gegenstand f-Ur Mitglieder", (byte) 100);

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1023 = 0;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "Lgd;")
    public class123 field1014;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIB)Z")
    public static final boolean method423(int arg0, int arg1, byte arg2) {
        if (arg2 <= 62) {
            method426((byte) -109);
        }
        field1016++;
        return (arg1 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method424(int arg0) {
        field1021 = null;
        if (arg0 >= -85) {
            method426((byte) -30);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static final void method425(int arg0) {
        if (arg0 != 31975) {
            field1021 = null;
        }
        field1015++;
        class210 var1 = class194.field3345;
        synchronized (class194.field3345) {
            class40.field692 = class159.field2819;
            class17.field244 = class221.field3782;
            class214.field3684 = class241.field4189;
            class272.field4734 = class105.field1769;
            class55.field949++;
            class167.field2950 = class133.field2384;
            class272.field4722 = class133.field2397;
            class121.field2241 = class273.field4746;
            class105.field1769 = 0;
        }
    }

    @OriginalMember(owner = "client!gg", name = "run", descriptor = "()V")
    public final void run() {
        field1018++;
        this.field1019 = true;
        try {
            while (!this.field1022) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class74 var2 = this.field1017[var1];
                    if (var2 != null) {
                        var2.method538(500000);
                    }
                }
                class226.method1543(10L, -738);
                class207.method1430((Object) null, 116, this.field1014);
            }
        } catch (Exception var9) {
            client.method815((String) null, (byte) -78, var9);
        } finally {
            Object var6 = null;
            this.field1019 = false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public static final void method426(byte arg0) {
        field1013++;
        int var1 = class1.field4.method1017((byte) 125, 8);
        if (var1 < class145.field2577) {
            for (int var2 = var1; var2 < class145.field2577; var2++) {
                class41.field693[class105.field1764++] = class103.field1734[var2];
            }
        }
        if (arg0 < 60) {
            field1023 = 52;
        }
        if (var1 > class145.field2577) {
            throw new RuntimeException("gppov1");
        }
        class145.field2577 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class103.field1734[var3];
            class47 var5 = class22.field371[var4];
            int var6 = class1.field4.method1017((byte) 126, 1);
            if (var6 == 0) {
                class103.field1734[class145.field2577++] = var4;
                var5.field4510 = class236.field4053;
            } else {
                int var7 = class1.field4.method1017((byte) 124, 2);
                if (var7 == 0) {
                    class103.field1734[class145.field2577++] = var4;
                    var5.field4510 = class236.field4053;
                    class78.field1335[class157.field2745++] = var4;
                } else if (var7 == 1) {
                    class103.field1734[class145.field2577++] = var4;
                    var5.field4510 = class236.field4053;
                    int var8 = class1.field4.method1017((byte) 124, 3);
                    var5.method1794(-27, var8, false);
                    int var9 = class1.field4.method1017((byte) 126, 1);
                    if (var9 == 1) {
                        class78.field1335[class157.field2745++] = var4;
                    }
                } else if (var7 == 2) {
                    class103.field1734[class145.field2577++] = var4;
                    var5.field4510 = class236.field4053;
                    int var10 = class1.field4.method1017((byte) 124, 3);
                    var5.method1794(-77, var10, true);
                    int var11 = class1.field4.method1017((byte) 125, 3);
                    var5.method1794(71, var11, true);
                    int var12 = class1.field4.method1017((byte) 125, 1);
                    if (var12 == 1) {
                        class78.field1335[class157.field2745++] = var4;
                    }
                } else if (var7 == 3) {
                    class41.field693[class105.field1764++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Lmb;")
    public static final class96 method427(byte arg0, int arg1) {
        field1020++;
        if (arg0 > -87) {
            method427((byte) 13, 117);
        }
        return class36.method289(-5615, new class96[] { class31.method205(arg1 >> 24 & 0xFF, (byte) -78), class153.field2699, class31.method205(arg1 >> 16 & 0xFF, (byte) -78), class153.field2699, class31.method205(arg1 >> 8 & 0xFF, (byte) -78), class153.field2699, class31.method205(arg1 & 0xFF, (byte) -78) });
    }
}
