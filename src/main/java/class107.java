import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public abstract class class107 extends class337 {

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public int field1537;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public int field1542;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "F")
    public float field1534;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    private int field1545;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    private int field1536;

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public int field1541;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)I")
    public final int method654(byte arg0) {
        field1531++;
        if (arg0 != 31) {
            field1544 = -17;
        }
        return this.field1541;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static final void method655(int arg0) {
        if (arg0 >= -49) {
            method664(63);
        }
        field1532++;
        for (class102 var1 = (class102) class405.field6119.method816(101); var1 != null; var1 = (class102) class405.field6119.method812(106)) {
            class354 var2 = var1.field1475;
            if (class79.field1192 != var2.field1768 || var2.field5422 < class317.field4559) {
                var1.method2049(-73);
                var2.method2212(-20095);
            } else if (class317.field4559 >= var2.field5425) {
                if (var2.field5435 > 0) {
                    class167 var3 = class193.field2821[var2.field5435 - 1];
                    if (var3 != null && var3.field1763 >= 0 && var3.field1763 < class30.field323 * 128 && var3.field1769 >= 0 && class182.field2661 * 128 > var3.field1769) {
                        var2.method2219(var3.field1763, var3.field1769, class377.method2316(var3.field1769, false, var3.field1763, var2.field1768) - var2.field5446, class317.field4559, 1);
                    }
                }
                if (var2.field5435 < 0) {
                    int var4 = -var2.field5435 - 1;
                    class239 var5;
                    if (class172.field2546 == var4) {
                        var5 = class500.field7365;
                    } else {
                        var5 = class44.field707[var4];
                    }
                    if (var5 != null && var5.field1763 >= 0 && var5.field1763 < class30.field323 * 128 && var5.field1769 >= 0 && class182.field2661 * 128 > var5.field1769) {
                        var2.method2219(var5.field1763, var5.field1769, class377.method2316(var5.field1769, false, var5.field1763, var2.field1768) - var2.field5446, class317.field4559, 1);
                    }
                }
                var2.method2215(1, class500.field7364);
                class114.method758(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)I")
    public final int method656(int arg0) {
        field1535++;
        if (arg0 != 128) {
            field1548 = -3;
        }
        return this.field1537;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIII)V")
    public abstract void method657(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)F")
    public final float method658(int arg0) {
        if (arg0 != 0) {
            this.field1534 = -1.1279235F;
        }
        field1543++;
        return this.field1534;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(FB)V")
    public abstract void method659(float arg0, byte arg1);

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "(I)I")
    public final int method660(int arg0) {
        if (arg0 == 28825) {
            field1533++;
            return this.field1545;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)I")
    public final int method661(byte arg0) {
        field1539++;
        int var2 = -11 / ((3 - arg0) / 52);
        return this.field1536;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)I")
    public static final int method662(byte arg0) {
        if (arg0 > -85) {
            method664(-49);
        }
        field1530++;
        return class142.field2119;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIIF)V")
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field1537 = arg2;
        this.field1542 = arg1;
        this.field1534 = arg5;
        this.field1545 = arg4;
        this.field1536 = arg3;
        this.field1541 = arg0;
    }

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "(I)I")
    public final int method663(int arg0) {
        if (arg0 != 0) {
            this.method659(-0.43364945F, (byte) -24);
        }
        field1538++;
        return this.field1542;
    }

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "(I)V")
    public static final void method664(int arg0) {
        if (class35.field368 != null) {
            class35.field368.method2412(true);
        }
        field1547++;
        if (arg0 == 128 && class374.field5695 != null) {
            class374.field5695.method2412(true);
        }
    }
}
