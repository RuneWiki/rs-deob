import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class215 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    private int field3721 = -1;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    private int field3731 = 0;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lvh;")
    private class252 field3722 = new class252();

    @OriginalMember(owner = "client!kk", name = "u", descriptor = "Z")
    public boolean field3741 = false;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    private int field3733;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "[[I")
    private int[][] field3727;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    private int field3734;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "[Lgh;")
    private class24[] field3740;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[I")
    public static int[] field3726 = new int[32];

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Ldf;")
    private static class51 field3724 = class46.method233("Connecting to update server", 100);

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "[I")
    public static int[] field3732 = new int[2048];

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field3736 = 0;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "[Lja;")
    public static class55[] field3735 = new class55[256];

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "Ldf;")
    public static class51 field3738 = class46.method233("http:)4)4", 100);

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Ldf;")
    public static class51 field3737 = field3724;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V")
    public static final void method1475(int arg0, int arg1) {
        field3729++;
        if (class207.method1426((byte) 102, arg0)) {
            class230.method1588(-1, class10.field106[arg0], arg1);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)[I")
    public final int[] method1476(boolean arg0, int arg1) {
        field3725++;
        if (!arg0) {
            return null;
        } else if (this.field3734 == this.field3733) {
            this.field3741 = this.field3740[arg1] == null;
            this.field3740[arg1] = class60.field968;
            return this.field3727[arg1];
        } else if (this.field3733 == 1) {
            this.field3741 = this.field3721 != arg1;
            this.field3721 = arg1;
            return this.field3727[0];
        } else {
            class24 var3 = this.field3740[arg1];
            if (var3 == null) {
                this.field3741 = true;
                if (this.field3733 <= this.field3731) {
                    class24 var4 = (class24) this.field3722.method1713(2);
                    var3 = new class24(arg1, var4.field368);
                    this.field3740[var4.field362] = null;
                    var4.method764((byte) -44);
                } else {
                    var3 = new class24(arg1, this.field3731);
                    this.field3731++;
                }
                this.field3740[arg1] = var3;
            } else {
                this.field3741 = false;
            }
            this.field3722.method1711((byte) 79, var3);
            return this.field3727[var3.field368];
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BZ)V")
    public static final void method1477(byte arg0, boolean arg1) {
        if (arg0 == -22) {
            field3739++;
            class21.method106(class76.field1230, class243.field4206, arg1, class95.field1578, -1);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILja;I)V")
    public static final void method1478(int arg0, class55 arg1, int arg2) {
        if (arg2 != 256) {
            field3737 = null;
        }
        field3728++;
        if (class36.field561 == null) {
            class140.method1017(0, true, arg2 - 205, (class55) null, 255, 255, (byte) 0);
            field3735[arg0] = arg1;
        } else {
            class36.field561.field2026 = arg0 * 8 + 5;
            int var3 = class36.field561.method865((byte) 8);
            int var4 = class36.field561.method865((byte) 8);
            arg1.method359(-1751, var3, var4);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V")
    public final void method1479(int arg0) {
        for (int var2 = arg0; var2 < this.field3733; var2++) {
            this.field3727[var2] = null;
        }
        field3730++;
        this.field3740 = null;
        this.field3727 = null;
        this.field3722.method1708(2);
        this.field3722 = null;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
    public static void method1480(int arg0) {
        field3737 = null;
        field3726 = null;
        if (arg0 != 32) {
            field3737 = null;
        }
        field3724 = null;
        field3735 = null;
        field3732 = null;
        field3738 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)[[I")
    public final int[][] method1481(boolean arg0) {
        field3723++;
        if (this.field3734 != this.field3733) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0) {
            this.method1481(false);
        }
        for (int var2 = 0; var2 < this.field3733; var2++) {
            this.field3740[var2] = class60.field968;
        }
        return this.field3727;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(III)V")
    public class215(int arg0, int arg1, int arg2) {
        this.field3733 = arg0;
        this.field3727 = new int[this.field3733][arg2];
        this.field3734 = arg1;
        this.field3740 = new class24[this.field3734];
    }
}
