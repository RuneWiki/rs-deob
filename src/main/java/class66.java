import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XETSOHUA")
public class class66 {

    @OriginalMember(owner = "client!XETSOHUA", name = "h", descriptor = "I")
    public int field1698 = -1;

    @OriginalMember(owner = "client!XETSOHUA", name = "j", descriptor = "Z")
    public boolean field1700 = false;

    @OriginalMember(owner = "client!XETSOHUA", name = "k", descriptor = "I")
    public int field1701 = 5;

    @OriginalMember(owner = "client!XETSOHUA", name = "l", descriptor = "I")
    public int field1702 = -1;

    @OriginalMember(owner = "client!XETSOHUA", name = "m", descriptor = "I")
    public int field1703 = -1;

    @OriginalMember(owner = "client!XETSOHUA", name = "n", descriptor = "I")
    public int field1704 = 99;

    @OriginalMember(owner = "client!XETSOHUA", name = "o", descriptor = "I")
    public int field1705 = -1;

    @OriginalMember(owner = "client!XETSOHUA", name = "p", descriptor = "I")
    public int field1706 = -1;

    @OriginalMember(owner = "client!XETSOHUA", name = "q", descriptor = "I")
    public int field1707 = 2;

    @OriginalMember(owner = "client!XETSOHUA", name = "a", descriptor = "I")
    private int field1691;

    @OriginalMember(owner = "client!XETSOHUA", name = "b", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!XETSOHUA", name = "d", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!XETSOHUA", name = "r", descriptor = "I")
    public int field1708;

    @OriginalMember(owner = "client!XETSOHUA", name = "s", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!XETSOHUA", name = "e", descriptor = "[I")
    public int[] field1695;

    @OriginalMember(owner = "client!XETSOHUA", name = "f", descriptor = "[I")
    public int[] field1696;

    @OriginalMember(owner = "client!XETSOHUA", name = "g", descriptor = "[I")
    private int[] field1697;

    @OriginalMember(owner = "client!XETSOHUA", name = "i", descriptor = "[I")
    public int[] field1699;

    @OriginalMember(owner = "client!XETSOHUA", name = "c", descriptor = "[LXETSOHUA;")
    public static class66[] field1693;

    @OriginalMember(owner = "client!XETSOHUA", name = "a", descriptor = "(LLKPVZAQN;I)V")
    public static void method566(class33 arg0, int arg1) {
        class58 var2 = new class58((byte) -115, arg0.method323("seq.dat", null));
        int var3 = 10 / arg1;
        field1692 = var2.method517();
        if (field1693 == null) {
            field1693 = new class66[field1692];
        }
        for (int var4 = 0; var4 < field1692; var4++) {
            if (field1693[var4] == null) {
                field1693[var4] = new class66();
            }
            field1693[var4].method568(var2, 767);
        }
    }

    @OriginalMember(owner = "client!XETSOHUA", name = "a", descriptor = "(II)I")
    public int method567(int arg0, int arg1) {
        int var3 = this.field1697[arg1];
        if (arg0 != 0) {
            this.field1691 = -138;
        }
        if (var3 == 0) {
            class21 var4 = class21.method234(this.field1695[arg1]);
            if (var4 != null) {
                var3 = this.field1697[arg1] = var4.field847;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!XETSOHUA", name = "a", descriptor = "(LWBEWPIXO;I)V")
    public void method568(class58 arg0, int arg1) {
        int var3 = 6 / arg1;
        while (true) {
            while (true) {
                int var4 = arg0.method515();
                if (var4 == 0) {
                    if (this.field1694 == 0) {
                        this.field1694 = 1;
                        this.field1695 = new int[1];
                        this.field1695[0] = -1;
                        this.field1696 = new int[1];
                        this.field1696[0] = -1;
                        this.field1697 = new int[1];
                        this.field1697[0] = -1;
                    }
                    if (this.field1705 == -1) {
                        if (this.field1699 == null) {
                            this.field1705 = 0;
                        } else {
                            this.field1705 = 2;
                        }
                    }
                    if (this.field1706 == -1) {
                        if (this.field1699 != null) {
                            this.field1706 = 2;
                            return;
                        }
                        this.field1706 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field1694 = arg0.method515();
                    this.field1695 = new int[this.field1694];
                    this.field1696 = new int[this.field1694];
                    this.field1697 = new int[this.field1694];
                    for (int var5 = 0; var5 < this.field1694; var5++) {
                        this.field1695[var5] = arg0.method517();
                        this.field1696[var5] = arg0.method517();
                        if (this.field1696[var5] == 65535) {
                            this.field1696[var5] = -1;
                        }
                        this.field1697[var5] = arg0.method517();
                    }
                } else if (var4 == 2) {
                    this.field1698 = arg0.method517();
                } else if (var4 == 3) {
                    int var6 = arg0.method515();
                    this.field1699 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1699[var7] = arg0.method515();
                    }
                    this.field1699[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field1700 = true;
                } else if (var4 == 5) {
                    this.field1701 = arg0.method515();
                } else if (var4 == 6) {
                    this.field1702 = arg0.method517();
                } else if (var4 == 7) {
                    this.field1703 = arg0.method517();
                } else if (var4 == 8) {
                    this.field1704 = arg0.method515();
                } else if (var4 == 9) {
                    this.field1705 = arg0.method515();
                } else if (var4 == 10) {
                    this.field1706 = arg0.method515();
                } else if (var4 == 11) {
                    this.field1707 = arg0.method515();
                } else if (var4 == 12) {
                    this.field1708 = arg0.method520();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
