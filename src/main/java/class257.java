import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class257 {

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "I")
    private int field3723 = -1;

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "I")
    private int field3725 = 0;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "Lnt;")
    private class220 field3721 = new class220();

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "Z")
    public boolean field3728 = false;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    private int field3717;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    private int field3724;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "[Ltw;")
    private class200[] field3719;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "[[I")
    private int[][] field3727;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "Z")
    public static boolean field3726 = false;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public static int field3718;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V")
    public final void method1743(int arg0) {
        field3718++;
        for (int var2 = arg0; var2 < this.field3717; var2++) {
            this.field3727[var2] = null;
        }
        this.field3727 = null;
        this.field3719 = null;
        this.field3721.method1530((byte) 81);
        this.field3721 = null;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)[I")
    public final int[] method1744(int arg0, int arg1) {
        field3720++;
        if (arg1 != -2) {
            this.field3725 = -11;
        }
        if (this.field3724 == this.field3717) {
            this.field3728 = this.field3719[arg0] == null;
            this.field3719[arg0] = class186.field2653;
            return this.field3727[arg0];
        } else if (this.field3717 == 1) {
            this.field3728 = this.field3723 != arg0;
            this.field3723 = arg0;
            return this.field3727[0];
        } else {
            class200 var3 = this.field3719[arg0];
            if (var3 == null) {
                this.field3728 = true;
                if (this.field3717 <= this.field3725) {
                    class200 var4 = (class200) this.field3721.method1523((byte) 81);
                    var3 = new class200(arg0, var4.field2873);
                    this.field3719[var4.field2870] = null;
                    var4.method3617(arg1 + 3);
                } else {
                    var3 = new class200(arg0, this.field3725);
                    this.field3725++;
                }
                this.field3719[arg0] = var3;
            } else {
                this.field3728 = false;
            }
            this.field3721.method1524(43, var3);
            return this.field3727[var3.field2873];
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
    public static final void method1745(int arg0) {
        field3722++;
        class354 var1 = class501.method3012(0, 15, 2145997216);
        var1.method2216(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)[[I")
    public final int[][] method1746(byte arg0) {
        field3716++;
        if (this.field3724 != this.field3717) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != 118) {
            this.method1746((byte) 78);
        }
        while (var2 < this.field3717) {
            this.field3719[var2] = class186.field2653;
            var2++;
        }
        return this.field3727;
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(III)V")
    public class257(int arg0, int arg1, int arg2) {
        this.field3717 = arg0;
        this.field3724 = arg1;
        this.field3719 = new class200[this.field3724];
        this.field3727 = new int[this.field3717][arg2];
    }
}
