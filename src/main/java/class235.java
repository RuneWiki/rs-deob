import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class235 extends class147 {

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!jm", name = "x", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!jm", name = "v", descriptor = "[[I")
    public int[][] field3727;

    @OriginalMember(owner = "client!jm", name = "B", descriptor = "[I")
    public int[] field3733;

    @OriginalMember(owner = "client!jm", name = "y", descriptor = "[Z")
    public boolean[] field3730;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "[I")
    public int[] field3722;

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "Lna;")
    public static class26 field3725 = class69.method505("Module texte charg-B", (byte) -124);

    @OriginalMember(owner = "client!jm", name = "A", descriptor = "Lna;")
    private static class26 field3732 = class69.method505("", (byte) -121);

    @OriginalMember(owner = "client!jm", name = "z", descriptor = "Lna;")
    public static class26 field3731 = field3732;

    @OriginalMember(owner = "client!jm", name = "w", descriptor = "Lna;")
    public static class26 field3728 = class69.method505("3D)2Softwarebibliothek gestartet)3", (byte) -125);

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "F")
    public static float field3724;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
    public static int field3734;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V", line = 4)
    public static void method1578(int arg0) {
        field3731 = null;
        if (arg0 != -29113) {
            method1579(false);
        }
        field3725 = null;
        field3732 = null;
        field3728 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 33)
    public static final void method1579(boolean arg0) {
        if (class250.field4095 != -1) {
            class209.method1398(-120, class250.field4095);
        }
        field3734++;
        for (int var1 = 0; var1 < class66.field1041; var1++) {
            if (class2.field21[var1]) {
                class139.field2123[var1] = true;
            }
            class259.field4239[var1] = class2.field21[var1];
            class2.field21[var1] = false;
        }
        class291.field4842 = -1;
        class67.field1058 = null;
        class323.field5553 = class229.field3626;
        if (class255.field4184) {
            class262.field4282 = true;
        }
        class96.field1561 = -1;
        if (!arg0) {
            method1578(-78);
        }
        if (class250.field4095 != -1) {
            class66.field1041 = 0;
            class321.method2234(true);
        }
        if (class255.field4184) {
            class326.method2269();
        } else {
            class34.method294();
        }
        class25.field366 = 0;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I[B)V", line = 95)
    public class235(int arg0, byte[] arg1) {
        this.field3721 = arg0;
        class82 var3 = new class82(arg1);
        this.field3729 = var3.method642((byte) -64);
        this.field3727 = new int[this.field3729][];
        this.field3733 = new int[this.field3729];
        this.field3730 = new boolean[this.field3729];
        this.field3722 = new int[this.field3729];
        for (int var4 = 0; var4 < this.field3729; var4++) {
            this.field3733[var4] = var3.method642((byte) -70);
        }
        for (int var5 = 0; var5 < this.field3729; var5++) {
            this.field3730[var5] = var3.method642((byte) -35) == 1;
        }
        for (int var6 = 0; var6 < this.field3729; var6++) {
            this.field3722[var6] = var3.method576(1);
        }
        for (int var7 = 0; var7 < this.field3729; var7++) {
            this.field3727[var7] = new int[var3.method642((byte) -99)];
        }
        for (int var8 = 0; var8 < this.field3729; var8++) {
            for (int var9 = 0; var9 < this.field3727[var8].length; var9++) {
                this.field3727[var8][var9] = var3.method642((byte) -70);
            }
        }
    }
}
