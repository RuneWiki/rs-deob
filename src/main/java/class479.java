import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class479 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "Z")
    public boolean field7066 = true;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public int field7071 = 128;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public int field7064 = -1;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    private int field7075 = 0;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field7063;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public int field7065;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public int field7069;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public int field7070;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 3)
    public static final void method2821() {
        class430.method2619(1, class76.field1315);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lia;I)V", line = 8)
    public final void method2822(class23 arg0, int arg1) {
        int var3 = -9 % ((arg1 + 69) / 52);
        field7073++;
        while (true) {
            int var4 = arg0.method126((byte) -74);
            if (var4 == 0) {
                return;
            }
            this.method2825(arg0, (byte) -115, var4);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Z", line = 27)
    public static final boolean method2823(int arg0, int arg1) {
        field7074++;
        if (arg1 != -30256) {
            method2823(-87, -58);
        }
        if (arg0 == 17 || arg0 == 20 || arg0 == 48 || arg0 == 45 || arg0 == 1002) {
            return true;
        } else {
            return arg0 == 22 || arg0 == 1011;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V", line = 47)
    private final void method2824(int arg0, boolean arg1) {
        field7068++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF83) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        if (!arg1) {
            this.method2825(null, (byte) -27, -26);
        }
        this.field7063 = (int) (var15 * 256.0D);
        this.field7070 = (int) (var17 * 256.0D);
        if (this.field7063 < 0) {
            this.field7063 = 0;
        } else if (this.field7063 > 255) {
            this.field7063 = 255;
        }
        if (this.field7070 < 0) {
            this.field7070 = 0;
        } else if (this.field7070 > 255) {
            this.field7070 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field7069 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field7069 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field7069 < 1) {
            this.field7069 = 1;
        }
        this.field7065 = (int) ((double) this.field7069 * var19);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lia;BI)V", line = 137)
    private final void method2825(class23 arg0, byte arg1, int arg2) {
        if (arg1 > -87) {
            this.field7063 = 120;
        }
        field7072++;
        if (arg2 == 1) {
            this.field7075 = arg0.method181(102);
            this.method2824(this.field7075, true);
        } else if (arg2 == 2) {
            this.field7064 = arg0.method132(109);
            if (this.field7064 == 65535) {
                this.field7064 = -1;
                return;
            }
        } else if (arg2 == 3) {
            this.field7071 = arg0.method132(33) << 0;
            return;
        } else if (arg2 == 4) {
            this.field7066 = false;
        } else {
            return;
        }
    }
}
