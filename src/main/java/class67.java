import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XYSJIYWF")
public class class67 {

    @OriginalMember(owner = "client!XYSJIYWF", name = "a", descriptor = "Z")
    private boolean field1689 = true;

    @OriginalMember(owner = "client!XYSJIYWF", name = "f", descriptor = "I")
    public int field1694 = -1;

    @OriginalMember(owner = "client!XYSJIYWF", name = "h", descriptor = "[I")
    public int[] field1696 = new int[6];

    @OriginalMember(owner = "client!XYSJIYWF", name = "i", descriptor = "[I")
    public int[] field1697 = new int[6];

    @OriginalMember(owner = "client!XYSJIYWF", name = "j", descriptor = "I")
    public int field1698 = 128;

    @OriginalMember(owner = "client!XYSJIYWF", name = "k", descriptor = "I")
    public int field1699 = 128;

    @OriginalMember(owner = "client!XYSJIYWF", name = "o", descriptor = "LUNPPHFRC;")
    public static class60 field1703 = new class60(true, 30);

    @OriginalMember(owner = "client!XYSJIYWF", name = "b", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!XYSJIYWF", name = "d", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!XYSJIYWF", name = "e", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!XYSJIYWF", name = "l", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!XYSJIYWF", name = "m", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "client!XYSJIYWF", name = "n", descriptor = "I")
    public int field1702;

    @OriginalMember(owner = "client!XYSJIYWF", name = "g", descriptor = "LDVIZXFSW;")
    public class14 field1695;

    @OriginalMember(owner = "client!XYSJIYWF", name = "c", descriptor = "[LXYSJIYWF;")
    public static class67[] field1691;

    @OriginalMember(owner = "client!XYSJIYWF", name = "a", descriptor = "(LHBJEXSJX;Z)V")
    public static void method580(class24 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        class18 var2 = new class18(arg0.method348("spotanim.dat", null), 0);
        field1690 = var2.method241();
        if (field1691 == null) {
            field1691 = new class67[field1690];
        }
        for (int var3 = 0; var3 < field1690; var3++) {
            if (field1691[var3] == null) {
                field1691[var3] = new class67();
            }
            field1691[var3].field1692 = var3;
            field1691[var3].method581((byte) 5, var2);
        }
    }

    @OriginalMember(owner = "client!XYSJIYWF", name = "a", descriptor = "(BLEYMNCFMK;)V")
    public void method581(byte arg0, class18 arg1) {
        if (arg0 != 5) {
            this.field1689 = !this.field1689;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1693 = arg1.method241();
                } else if (var3 == 2) {
                    this.field1694 = arg1.method241();
                    if (class14.field717 != null) {
                        this.field1695 = class14.field717[this.field1694];
                    }
                } else if (var3 == 4) {
                    this.field1698 = arg1.method241();
                } else if (var3 == 5) {
                    this.field1699 = arg1.method241();
                } else if (var3 == 6) {
                    this.field1700 = arg1.method241();
                } else if (var3 == 7) {
                    this.field1701 = arg1.method239();
                } else if (var3 == 8) {
                    this.field1702 = arg1.method239();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1696[var3 - 40] = arg1.method241();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1697[var3 - 50] = arg1.method241();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!XYSJIYWF", name = "a", descriptor = "()LOJGAHFXC;")
    public class41 method582() {
        class41 var1 = (class41) field1703.method531((long) this.field1692);
        if (var1 != null) {
            return var1;
        }
        class41 var2 = class41.method413(this.field1693);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1696[0] != 0) {
                var2.method427(this.field1696[var3], this.field1697[var3]);
            }
        }
        field1703.method532(false, (long) this.field1692, var2);
        return var2;
    }
}
