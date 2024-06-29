import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class6 extends class222 {

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public int field80;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Lcf;")
    public static class93 field81 = class147.method1066(" est d-Bj-9 dans votre liste d(Wamis)3", -48);

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lcf;")
    public static class93 field78 = class147.method1066("Ladevorgang )2 bitte warten Sie)3", -48);

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "Lcf;")
    public static class93 field84 = null;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Lhg;")
    public static class177 field77;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Lhg;")
    public static class177 field88;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[[Ltg;")
    public static class181[][] field82;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)I")
    public static final int method23(boolean arg0) {
        field86++;
        if (arg0) {
            field82 = null;
        }
        return 15;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)[Luf;")
    public static final class173[] method24(byte arg0) {
        class173[] var1 = new class173[class245.field4415];
        if (arg0 != -40) {
            field77 = null;
        }
        for (int var2 = 0; var2 < class245.field4415; var2++) {
            var1[var2] = new class173(class153.field2693, class226.field4044, class169.field2974[var2], class67.field1230[var2], class246.field4435[var2], class42.field663[var2], class255.field4614[var2], class248.field4475);
        }
        field83++;
        class50.method276((byte) 120);
        return var1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILee;)Lgk;")
    public static final class157 method25(int arg0, class280 arg1) {
        int var2 = -80 / ((arg0 - 46) / 46);
        field89++;
        class157 var3 = new class157(arg1.method1889((byte) -67), arg1.method1889((byte) -67), arg1.method1891(-121), arg1.method1891(-117), arg1.method1872(120), arg1.method1907(16832) == 1, arg1.method1907(16832));
        int var4 = arg1.method1907(16832);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field2775.method1152((byte) -5, new class9(arg1.method1891(-116), arg1.method1891(-128), arg1.method1891(-118), arg1.method1891(-126)));
        }
        var3.method1129(0);
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public static void method26(int arg0) {
        field82 = null;
        if (arg0 != 1) {
            method24((byte) 35);
        }
        field81 = null;
        field84 = null;
        field78 = null;
        field77 = null;
        field88 = null;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBI)V")
    public static final void method27(int arg0, byte arg1, int arg2) {
        int var3 = -58 / ((arg1 + 68) / 33);
        field87++;
        class212 var4 = class123.method905(-1205364448, 13, arg2);
        var4.method1493(13);
        var4.field3883 = arg0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lee;I)V")
    public static final void method28(class280 arg0, int arg1) {
        field79++;
        int var2 = arg0.method1924(8100);
        class121.field2162 = new class49[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class121.field2162[var3] = new class49();
            class121.field2162[var3].field787 = arg0.method1924(arg1 + 8072);
            class121.field2162[var3].field783 = arg0.method1878((byte) 99);
        }
        class152.field2676 = arg0.method1924(8100);
        class58.field997 = arg0.method1924(8100);
        class117.field2090 = arg0.method1924(8100);
        class242.field4367 = new class288[class58.field997 + 1 - class152.field2676];
        if (arg1 != 28) {
            field88 = null;
        }
        for (int var4 = 0; var4 < class117.field2090; var4++) {
            int var5 = arg0.method1924(8100);
            class288 var6 = class242.field4367[var5] = new class288();
            var6.field925 = arg0.method1907(16832);
            var6.field914 = arg0.method1872(120);
            var6.field5140 = class152.field2676 + var5;
            var6.field5152 = arg0.method1878((byte) 57);
            var6.field5147 = arg0.method1878((byte) 75);
        }
        class8.field113 = arg0.method1872(124);
        class48.field775 = true;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II)V")
    public class6(int arg0, int arg1) {
        this.field80 = arg0;
        this.field85 = arg1;
    }
}
