import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class212 {

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    private int field3779 = 0;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lge;")
    private class235 field3781;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field3774 = 10;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Z")
    public static boolean field3771 = false;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Lha;")
    private static class46 field3778 = class271.method1828("Loaded update list", -46);

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field3785 = 0;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field3776 = 0;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lha;")
    public static class46 field3775 = class271.method1828("(U(Y", -46);

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "I")
    public static int field3784 = 0;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lha;")
    public static class46 field3773 = field3778;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "J")
    public static long field3777 = 0L;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lcj;")
    private class69 field3769;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "[Lhh;")
    public static class263[] field3786;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[[[Lmk;")
    public static class201[][][] field3772;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Lcj;")
    public final class69 method1495(byte arg0) {
        if (arg0 != 93) {
            field3776 = -45;
        }
        field3783++;
        if (this.field3779 > 0 && this.field3781.field4086[this.field3779 - 1] != this.field3769) {
            class69 var2 = this.field3769;
            this.field3769 = var2.field1200;
            return var2;
        }
        while (this.field3781.field4081 > this.field3779) {
            class69 var3 = this.field3781.field4086[this.field3779++].field1200;
            if (this.field3781.field4086[this.field3779 - 1] != var3) {
                this.field3769 = var3.field1200;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(B)V")
    public static void method1496(byte arg0) {
        field3775 = null;
        field3772 = null;
        if (arg0 >= 45) {
            field3778 = null;
            field3786 = null;
            field3773 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILwe;)V")
    public static final void method1497(int arg0, class75 arg1) {
        field3770++;
        if ((arg1.field1368.length - arg1.field1380) < 1) {
            return;
        }
        int var2 = arg1.method558(1);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        int var3 = -70 % ((arg0 - 66) / 42);
        byte var4;
        if (var2 == 7) {
            var4 = 29;
        } else if (var2 == 6) {
            var4 = 28;
        } else if (var2 == 5) {
            var4 = 28;
        } else if (var2 == 4) {
            var4 = 24;
        } else if (var2 == 3) {
            var4 = 23;
        } else if (var2 == 2) {
            var4 = 22;
        } else if (var2 == 1) {
            var4 = 23;
        } else {
            var4 = 19;
        }
        if (arg1.field1368.length - arg1.field1380 < var4) {
            return;
        }
        class65.field1111 = arg1.method558(1);
        if (class65.field1111 < 1) {
            class65.field1111 = 1;
        } else if (class65.field1111 > 4) {
            class65.field1111 = 4;
        }
        class66.method457(arg1.method558(1) == 1, 128);
        class217.field3840 = arg1.method558(1) == 1;
        class268.field4631 = arg1.method558(1) == 1;
        class46.field809 = arg1.method558(1) == 1;
        class264.field4596 = arg1.method558(1) == 1;
        class68.field1177 = arg1.method558(1) == 1;
        class111.field2103 = arg1.method558(1) == 1;
        class250.field4416 = arg1.method558(1) == 1;
        class186.field3326 = arg1.method558(1);
        if (class186.field3326 > 2) {
            class186.field3326 = 2;
        }
        if (var2 >= 2) {
            class70.field1206 = arg1.method558(1) == 1;
        } else {
            class70.field1206 = arg1.method558(1) == 1;
            arg1.method558(1);
        }
        class65.field1102 = arg1.method558(1) == 1;
        class31.field588 = arg1.method558(1) == 1;
        class24.field396 = arg1.method558(1);
        if (class24.field396 > 2) {
            class24.field396 = 2;
        }
        class42.field715 = arg1.method558(1) == 1;
        class38.field668 = arg1.method558(1);
        if (class38.field668 > 127) {
            class38.field668 = 127;
        }
        class205.field3685 = arg1.method558(1);
        class135.field2452 = arg1.method558(1);
        if (class135.field2452 > 127) {
            class135.field2452 = 127;
        }
        if (var2 >= 1) {
            class140.field2504 = arg1.method545((byte) -57);
            class112.field2119 = arg1.method545((byte) 113);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method558(1);
        }
        if (var2 >= 4) {
            arg1.method558(1);
        }
        if (var2 >= 5) {
            class170.field3030 = arg1.method562((byte) -71);
        }
        if (var2 >= 6) {
            class138.field2484 = arg1.method558(1);
        }
        if (var2 >= 7) {
            class149.field2672 = arg1.method558(1) == 1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method1498(int arg0) {
        if (arg0 >= -21) {
            field3774 = 25;
        }
        if (class57.field950 < 0) {
            class146.field2644 = -1;
            class57.field950 = 0;
            class26.field521 = -1;
        }
        field3780++;
        if (class57.field950 > class137.field2474) {
            class26.field521 = -1;
            class57.field950 = class137.field2474;
            class146.field2644 = -1;
        }
        if (class194.field3490 < 0) {
            class146.field2644 = -1;
            class194.field3490 = 0;
            class26.field521 = -1;
        }
        if (class49.field836 < class194.field3490) {
            class26.field521 = -1;
            class146.field2644 = -1;
            class194.field3490 = class49.field836;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lge;)V")
    public class212(class235 arg0) {
        this.field3781 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)Lcj;")
    public final class69 method1499(byte arg0) {
        this.field3779 = 0;
        if (arg0 != -3) {
            this.method1499((byte) 115);
        }
        field3782++;
        return this.method1495((byte) 93);
    }
}
