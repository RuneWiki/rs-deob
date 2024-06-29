import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class133 {

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    private int field2577 = 0;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    private int field2583 = -1;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "Lmi;")
    private class128 field2585 = new class128();

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Z")
    public boolean field2587 = false;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    private int field2579;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[Ldk;")
    private class147[] field2581;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[[I")
    private int[][] field2570;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Z")
    public static boolean field2586 = false;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lpa;")
    public static class123 field2574;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "[Lhh;")
    public static class163[] field2571;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[I")
    public final int[] method1044(int arg0, int arg1) {
        field2575++;
        if (arg1 != 0) {
            method1050(false);
        }
        if (this.field2579 == this.field2572) {
            this.field2587 = this.field2581[arg0] == null;
            this.field2581[arg0] = class103.field1973;
            return this.field2570[arg0];
        } else if (this.field2572 == 1) {
            this.field2587 = this.field2583 != arg0;
            this.field2583 = arg0;
            return this.field2570[0];
        } else {
            class147 var3 = this.field2581[arg0];
            if (var3 == null) {
                this.field2587 = true;
                if (this.field2572 > this.field2577) {
                    var3 = new class147(arg0, this.field2577);
                    this.field2577++;
                } else {
                    class147 var4 = (class147) this.field2585.method1022(false);
                    var3 = new class147(arg0, var4.field2793);
                    this.field2581[var4.field2790] = null;
                    var4.method1063(arg1 + 106);
                }
                this.field2581[arg0] = var3;
            } else {
                this.field2587 = false;
            }
            this.field2585.method1014(false, var3);
            return this.field2570[var3.field2793];
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lpa;Lpa;Lpa;Lok;Z)Z")
    public static final boolean method1045(class123 arg0, class123 arg1, class123 arg2, class92 arg3, boolean arg4) {
        class113.field2126 = arg2;
        class115.field2193 = arg1;
        field2582++;
        class90.field1647 = arg0;
        if (arg4) {
            method1047(3);
        }
        class115.field2191 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)[[I")
    public final int[][] method1046(boolean arg0) {
        field2580++;
        if (this.field2579 != this.field2572) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (!arg0) {
            method1051((byte) 108);
        }
        while (var2 < this.field2572) {
            this.field2581[var2] = class103.field1973;
            var2++;
        }
        return this.field2570;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method1047(int arg0) {
        field2573++;
        Object var1 = class169.field3098;
        synchronized (class169.field3098) {
            if (arg0 <= -2) {
                if (class218.field3970 == 0) {
                    class169.field3090.method1253(new class82(), 5, 2244);
                }
                class218.field3970 = 600;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILge;)V")
    public static final void method1048(int arg0, class148 arg1) {
        field2569++;
        arg1.field2798 = false;
        if (arg1.field2797 != null) {
            arg1.field2797.field881 = 0;
        }
        for (class148 var2 = arg1.method212(); var2 != null; var2 = arg1.method229()) {
            method1048(0, var2);
        }
        if (arg0 != 0) {
            method1051((byte) 4);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lpa;II)Lhk;")
    public static final class105 method1049(class123 arg0, int arg1, int arg2) {
        field2576++;
        if (arg2 != -31550) {
            method1045((class123) null, (class123) null, (class123) null, (class92) null, false);
        }
        return class131.method1038(5825, arg1, arg0) ? class262.method1778(true) : null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
    public static final void method1050(boolean arg0) {
        field2584++;
        int[] var1 = new int[class75.field1407];
        int var2 = 0;
        for (int var3 = 0; var3 < class75.field1407; var3++) {
            class99 var5 = class120.method939(22952, var3);
            if (var5.field1863 >= 0 || var5.field1864 >= 0) {
                var1[var2++] = var3;
            }
        }
        class216.field3933 = new int[var2];
        if (arg0) {
            for (int var4 = 0; var4 < var2; var4++) {
                class216.field3933[var4] = var1[var4];
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method1051(byte arg0) {
        field2571 = null;
        field2574 = null;
        if (arg0 != -95) {
            method1051((byte) -115);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public final void method1052(int arg0) {
        field2578++;
        for (int var2 = 0; var2 < this.field2572; var2++) {
            this.field2570[var2] = null;
        }
        this.field2570 = null;
        this.field2581 = null;
        if (arg0 != 28039) {
            this.field2587 = true;
        }
        this.field2585.method1021((byte) -123);
        this.field2585 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(III)V")
    public class133(int arg0, int arg1, int arg2) {
        this.field2572 = arg0;
        this.field2579 = arg1;
        this.field2581 = new class147[this.field2579];
        this.field2570 = new int[this.field2572][arg2];
    }
}
