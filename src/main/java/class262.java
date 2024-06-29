import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class262 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "[I")
    public static int[] field4548 = new int[32];

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field4550 = -1;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "Lda;")
    public static class275 field4555 = class255.method1672(102, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "Lfd;")
    public static class229 field4558;

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "[Lrk;")
    public static class20[] field4554;

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "[[[I")
    public static int[][][] field4556;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILma;)V")
    public static final void method1713(int arg0, class105 arg1) {
        field4552++;
        field4553 = arg1.method767(524287, class18.field261);
        class87.field1470 = arg1.method767(524287, class55.field938);
        class227.field3838 = arg1.method767(524287, class11.field164);
        class269.field4659 = arg1.method767(524287, class25.field412);
        class229.field3928 = arg1.method767(524287, class56.field942);
        class155.field2696 = arg1.method767(524287, class145.field2533);
        class180.field3090 = arg1.method767(524287, class94.field1609);
        class258.field4519 = arg1.method767(524287, class80.field1309);
        class250.field4417 = arg1.method767(524287, class203.field3454);
        class276.field4820 = arg1.method767(524287, class107.field1863);
        class235.field4093 = arg1.method767(524287, class1.field10);
        class116.field2067 = arg1.method767(524287, class42.field715);
        class87.field1462 = arg1.method767(524287, class74.field1226);
        class108.field1881 = arg1.method767(524287, class226.field3828);
        if (arg0 > -52) {
            method1714(51);
        }
        class225.field3807 = arg1.method767(524287, class215.field3658);
        class153.field2680 = arg1.method767(524287, class159.field2787);
        class191.field3282 = arg1.method767(524287, class65.field1078);
        class56.field948 = arg1.method767(524287, class30.field461);
        class129.field2276 = arg1.method767(524287, class129.field2278);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Z")
    public static final boolean method1714(int arg0) {
        field4547++;
        if (arg0 != -1) {
            method1713(9, (class105) null);
        }
        return class48.field798;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
    public static void method1715(int arg0) {
        field4548 = null;
        field4558 = null;
        if (arg0 == 32) {
            field4555 = null;
            field4556 = null;
            field4554 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
    public abstract void method270(int arg0);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)I")
    public abstract int method276(int arg0, int arg1, int arg2);

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4548[var1] = var0 - 1;
            var0 += var0;
        }
        field4558 = null;
        field4557 = 0;
    }
}
