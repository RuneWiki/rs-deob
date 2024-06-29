import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class56 extends class137 {

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "[J")
    private long[] field880 = new long[10];

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    private int field878 = 1;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    private int field875 = 0;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    private int field892 = 256;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "J")
    private long field893 = class25.method197(-3418);

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Loh;")
    public static class258 field873 = class153.method1046("leuchten1:", 115);

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "Loh;")
    public static class258 field884 = class153.method1046("overlay", 103);

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "Loh;")
    public static class258 field881 = class153.method1046("welle2:", 109);

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "Loh;")
    public static class258 field890 = class153.method1046("Verbindung zum Update)2Server hergestellt)3", 101);

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "Loh;")
    public static class258 field883 = class153.method1046("welle2:", 88);

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    private int field891;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "Lrm;")
    public static class113 field879;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "Lgb;")
    public static class213 field877;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "Lgb;")
    public static class213 field882;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "Lkl;")
    public static class65 field887;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "[Lvi;")
    public static class129[] field876;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "[[[B")
    public static byte[][][] field885;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)I", line = 6)
    public final int method432(byte arg0, int arg1, int arg2) {
        field874++;
        int var4 = this.field878;
        this.field878 = 1;
        int var5 = this.field892;
        this.field892 = 300;
        this.field893 = class25.method197(arg0 ^ 0xD25);
        if (this.field880[this.field891] == 0L) {
            this.field878 = var4;
            this.field892 = var5;
        } else if (this.field893 > this.field880[this.field891]) {
            this.field892 = (int) ((long) (arg2 * 2560) / (this.field893 - this.field880[this.field891]));
        }
        if (this.field892 < 25) {
            this.field892 = 25;
        }
        if (this.field892 > 256) {
            this.field892 = 256;
            this.field878 = (int) ((long) arg2 - ((this.field893 - this.field880[this.field891]) / 10L));
        }
        if (arg0 != -125) {
            this.method432((byte) -50, -122, 56);
        }
        if (arg2 < this.field878) {
            this.field878 = arg2;
        }
        this.field880[this.field891] = this.field893;
        this.field891 = (this.field891 + 1) % 10;
        if (this.field878 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field880[var6] != 0L) {
                    this.field880[var6] += (long) this.field878;
                }
            }
        }
        int var7 = 0;
        if (this.field878 < arg1) {
            this.field878 = arg1;
        }
        class237.method1628((byte) -88, (long) this.field878);
        while (this.field875 < 256) {
            var7++;
            this.field875 += this.field892;
        }
        this.field875 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLs;)V", line = 85)
    public static final void method433(boolean arg0, class171 arg1) {
        field888++;
        int var2 = arg1.field2924;
        if (var2 == 324) {
            if (class4.field58 == -1) {
                class240.field4178 = arg1.field2995;
                class4.field58 = arg1.field3070;
            }
            if (class8.field100.field2894) {
                arg1.field3070 = class4.field58;
            } else {
                arg1.field3070 = class240.field4178;
            }
        } else if (var2 == 325) {
            if (class4.field58 == -1) {
                class240.field4178 = arg1.field2995;
                class4.field58 = arg1.field3070;
            }
            if (class8.field100.field2894) {
                arg1.field3070 = class240.field4178;
            } else {
                arg1.field3070 = class4.field58;
            }
        } else if (var2 == 327) {
            arg1.field2954 = 150;
            arg1.field2944 = (int) (Math.sin((double) class202.field3498 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2940 = 5;
            arg1.field3059 = -1;
        } else if (var2 == 328) {
            if (class152.field2606.field4007 == null) {
                arg1.field3059 = 0;
            } else {
                arg1.field2954 = 150;
                arg1.field2944 = (int) (Math.sin((double) class202.field3498 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2940 = 5;
                arg1.field3059 = ((int) class152.field2606.field4007.method1769(16) << 11) + 2047;
                arg1.field3077 = class152.field2606.field909;
                arg1.field2965 = class152.field2606.field933;
            }
        } else if (arg0) {
            field879 = (class113) null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 165)
    public static void method434(byte arg0) {
        if (arg0 > -114) {
            method434((byte) 45);
        }
        field885 = (byte[][][]) null;
        field873 = null;
        field879 = null;
        field876 = null;
        field882 = null;
        field883 = null;
        field881 = null;
        field887 = null;
        field884 = null;
        field890 = null;
        field877 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 186)
    public final void method435(int arg0) {
        field886++;
        if (arg0 != -14047) {
            method434((byte) -88);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field880[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 290)
    public class56() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field880[var1] = this.field893;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILoh;)Z", line = 233)
    public static final boolean method436(int arg0, class258 arg1) {
        field889++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        int var3 = -56 / ((-arg0 - 38) / 58);
        while (class138.field2355 > var2) {
            if (arg1.method1778(-11925, class279.field4779[var2])) {
                return true;
            }
            var2++;
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)Llk;", line = 273)
    public static final class250 method437(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        return var3 == null || var3.field3931 == null ? null : var3.field3931;
    }
}
