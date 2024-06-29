import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class45 {

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    private int field817 = 0;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    private int field829 = -1;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lre;")
    private class266 field819 = new class266();

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Z")
    public boolean field833 = false;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    private int field815;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    private int field832;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "[[I")
    private int[][] field830;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "[Lmh;")
    private class59[] field827;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field814 = 1;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public static int field820 = 0;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field824 = 1;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Lsb;")
    public static class124 field816;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "[B")
    public static byte[] field825;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)[[I")
    public final int[][] method385(byte arg0) {
        field826++;
        if (this.field832 != this.field815) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -65 / ((19 - arg0) / 40);
        for (int var3 = 0; var3 < this.field815; var3++) {
            this.field827[var3] = class79.field1317;
        }
        return this.field830;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILig;)V")
    public static final void method386(int arg0, class136 arg1) {
        int var2 = arg1.method1004(122);
        class282.field4463 = new class43[var2];
        field818++;
        for (int var3 = arg0; var3 < var2; var3++) {
            class282.field4463[var3] = new class43();
            class282.field4463[var3].field788 = arg1.method1004(122);
            class282.field4463[var3].field789 = arg1.method1000((byte) -124);
        }
        class130.field2154 = arg1.method1004(122);
        class6.field74 = arg1.method1004(122);
        class35.field579 = arg1.method1004(122);
        class15.field235 = new class80[class6.field74 - (class130.field2154 - 1)];
        for (int var4 = 0; var4 < class35.field579; var4++) {
            int var5 = arg1.method1004(122);
            class80 var6 = class15.field235[var5] = new class80();
            var6.field4598 = arg1.method1012(4);
            var6.field4601 = arg1.method1022(arg0 ^ 0xFFFFFFA8);
            var6.field1322 = class130.field2154 + var5;
            var6.field1330 = arg1.method1000((byte) -126);
            var6.field1323 = arg1.method1000((byte) -111);
        }
        class150.field2456 = arg1.method1022(-36);
        class185.field3037 = true;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BI)[I")
    public final int[] method387(byte arg0, int arg1) {
        field813++;
        int var3 = -6 % ((39 - arg0) / 62);
        if (this.field832 == this.field815) {
            this.field833 = this.field827[arg1] == null;
            this.field827[arg1] = class79.field1317;
            return this.field830[arg1];
        } else if (this.field815 == 1) {
            this.field833 = this.field829 != arg1;
            this.field829 = arg1;
            return this.field830[0];
        } else {
            class59 var4 = this.field827[arg1];
            if (var4 == null) {
                this.field833 = true;
                if (this.field817 < this.field815) {
                    var4 = new class59(arg1, this.field817);
                    this.field817++;
                } else {
                    class59 var5 = (class59) this.field819.method1813(2);
                    var4 = new class59(arg1, var5.field1016);
                    this.field827[var5.field1014] = null;
                    var5.method1074((byte) 6);
                }
                this.field827[arg1] = var4;
            } else {
                this.field833 = false;
            }
            this.field819.method1810(var4, 7);
            return this.field830[var4.field1016];
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Lrb;")
    public static final class164 method388(boolean arg0) {
        field828++;
        if (!arg0) {
            return null;
        }
        try {
            return (class164) Class.forName("e").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class125();
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method389(int arg0) {
        int var2 = 43 % ((77 - arg0) / 32);
        for (int var3 = 0; var3 < this.field815; var3++) {
            this.field830[var3] = null;
        }
        this.field827 = null;
        field821++;
        this.field830 = null;
        this.field819.method1818(72);
        this.field819 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method390(String arg0, int arg1) {
        field822++;
        if (class143.field2358 == null || arg0.length() == 0) {
            return -1;
        } else if (arg1 == 30320) {
            for (int var2 = 0; var2 < class143.field2358.field4048; var2++) {
                if (class134.method962(-81, class189.method1303("<br>", " ", (byte) -100, class143.field2358.field4057[var2]), arg0)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return -118;
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Lqh;")
    public static final class134 method391(int arg0) {
        field811++;
        if (arg0 != 0) {
            method390((String) null, 51);
        }
        try {
            return (class134) Class.forName("wk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method392(long arg0, boolean arg1) {
        field812++;
        if (!arg1) {
            method392(62L, true);
        }
        return class296.method1985(arg0, 3026);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
    public static void method393(byte arg0) {
        if (arg0 != 26) {
            field824 = -70;
        }
        field816 = null;
        field825 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
    public static final void method394(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -1) {
            method390((String) null, 126);
        }
        class108.field1650 = arg4;
        class32.field540 = arg1;
        class61.field1034 = arg2;
        class154.field2509 = arg0;
        field823++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZIIZ)V")
    public static final void method395(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (!arg1) {
            method388(false);
        }
        field831++;
        if (class279.method1878(0, arg2)) {
            class36.method308(arg0, arg3, 0, arg4, -1, class128.field2119[arg2]);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(III)V")
    public class45(int arg0, int arg1, int arg2) {
        this.field815 = arg0;
        this.field832 = arg1;
        this.field830 = new int[this.field815][arg2];
        this.field827 = new class59[this.field832];
    }
}
