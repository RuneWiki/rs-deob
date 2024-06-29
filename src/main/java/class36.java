import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class class36 extends class626 {

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "F")
    public float field538;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Liga;")
    public static class454 field537 = new class454(0);

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "[[I")
    public static int[][] field542;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I", line = 11)
    public final int method290(byte arg0) {
        int var2 = -11 % ((arg0 + 61) / 43);
        field540++;
        return this.field535;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I", line = 22)
    public final int method291(int arg0) {
        field532++;
        if (arg0 != 0) {
            this.field533 = -64;
        }
        return this.field533;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)I", line = 34)
    public final int method292(int arg0) {
        if (arg0 != 6865) {
            this.method292(-2);
        }
        field530++;
        return this.field544;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JZ)V", line = 46)
    public static final void method293(long arg0, boolean arg1) {
        field543++;
        try {
            if (!arg1) {
                field539 = 16;
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)I", line = 68)
    public final int method294(int arg0) {
        field536++;
        if (arg0 <= 22) {
            this.method296((byte) -41);
        }
        return this.field545;
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V", line = 82)
    public static void method295(int arg0) {
        field542 = null;
        field537 = null;
        if (arg0 != 21006) {
            method297(65, -115, -81, 103);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)F", line = 99)
    public final float method296(byte arg0) {
        if (arg0 == 3) {
            field541++;
            return this.field538;
        } else {
            return -1.0284032F;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIIF)V", line = 109)
    public class36(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field533 = arg2;
        this.field545 = arg3;
        this.field531 = arg1;
        this.field535 = arg0;
        this.field538 = arg5;
        this.field544 = arg4;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIII)I", line = 125)
    public static final int method297(int arg0, int arg1, int arg2, int arg3) {
        field534++;
        if (class442.field6163 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        if (arg0 != 0) {
            return 61;
        }
        int var6 = arg2 - class542.field7632;
        int var7 = arg1 - class542.field7644;
        for (class541 var8 = (class541) class542.field7626.method1522(true); var8 != null; var8 = (class541) class542.field7626.method1527((byte) 100)) {
            if (var8.field7608 == arg3) {
                int var9 = var8.field7597;
                int var10 = var8.field7601;
                int var11 = class542.field7644 + var10 | class542.field7632 + var9 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + ((var7 - var10) * (var7 - var10));
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I", line = 176)
    public final int method298(boolean arg0) {
        if (arg0) {
            this.field544 = -23;
        }
        field529++;
        return this.field531;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIII)V")
    public abstract void method141(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(FI)V")
    public abstract void method138(float arg0, int arg1);
}
