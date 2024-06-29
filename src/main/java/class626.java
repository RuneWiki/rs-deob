import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class626 {

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    private int field8734 = -1;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    private int field8737 = 0;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Lsu;")
    private class192 field8730 = new class192();

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Z")
    public boolean field8738 = false;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    private int field8728;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    private int field8733;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[Lwt;")
    private class280[] field8732;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[[[I")
    private int[][][] field8729;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "Lfc;")
    public static class235 field8736 = new class235(35, 7);

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field8726;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field8727;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field8731;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field8735;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public final void method3481(int arg0) {
        for (int var2 = arg0; var2 < this.field8728; var2++) {
            this.field8729[var2][0] = null;
            this.field8729[var2][1] = null;
            this.field8729[var2][2] = null;
            this.field8729[var2] = null;
        }
        field8727++;
        this.field8732 = null;
        this.field8729 = null;
        this.field8730.method1269((byte) 125);
        this.field8730 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method3482(byte arg0) {
        field8731++;
        if (this.field8733 != this.field8728) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field8728; var2++) {
            this.field8732[var2] = class577.field7753;
        }
        if (arg0 > -92) {
            field8736 = null;
        }
        return this.field8729;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3483(int arg0, boolean arg1) {
        if (!arg1) {
            this.field8738 = false;
        }
        field8726++;
        if (this.field8733 == this.field8728) {
            this.field8738 = this.field8732[arg0] == null;
            this.field8732[arg0] = class577.field7753;
            return this.field8729[arg0];
        } else if (this.field8728 == 1) {
            this.field8738 = this.field8734 != arg0;
            this.field8734 = arg0;
            return this.field8729[0];
        } else {
            class280 var3 = this.field8732[arg0];
            if (var3 == null) {
                this.field8738 = true;
                if (this.field8737 >= this.field8728) {
                    class280 var4 = (class280) this.field8730.method1284(0);
                    var3 = new class280(arg0, var4.field3918);
                    this.field8732[var4.field3922] = null;
                    var4.method2971(1);
                } else {
                    var3 = new class280(arg0, this.field8737);
                    this.field8737++;
                }
                this.field8732[arg0] = var3;
            } else {
                this.field8738 = false;
            }
            this.field8730.method1280(var3, (byte) -62);
            return this.field8729[var3.field3918];
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
    public static void method3484(int arg0) {
        field8736 = null;
        if (arg0 != 0) {
            field8736 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public static final void method3485(byte arg0) {
        class480.method2724(true);
        field8735++;
        class292.field4399 = null;
        class627.field8745 = null;
        class421.field5949 = null;
        if (arg0 < -118) {
            class514.field7025 = null;
            class568.field7648 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(III)V")
    public class626(int arg0, int arg1, int arg2) {
        this.field8728 = arg0;
        this.field8733 = arg1;
        this.field8732 = new class280[this.field8733];
        this.field8729 = new int[this.field8728][3][arg2];
    }
}
