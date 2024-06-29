import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZGOJZVHR")
public class IdkType {

    @OriginalMember(owner = "client!ZGOJZVHR", name = "b", descriptor = "I")
    private int field1696 = -766;

    @OriginalMember(owner = "client!ZGOJZVHR", name = "c", descriptor = "I")
    private int field1697 = 256;

    @OriginalMember(owner = "client!ZGOJZVHR", name = "f", descriptor = "I")
    public int field1700 = -1;

    @OriginalMember(owner = "client!ZGOJZVHR", name = "h", descriptor = "[I")
    public int[] field1702 = new int[6];

    @OriginalMember(owner = "client!ZGOJZVHR", name = "i", descriptor = "[I")
    public int[] field1703 = new int[6];

    @OriginalMember(owner = "client!ZGOJZVHR", name = "j", descriptor = "[I")
    public int[] field1704 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ZGOJZVHR", name = "k", descriptor = "Z")
    public boolean field1705 = false;

    @OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "B")
    private static byte field1695 = 6;

    @OriginalMember(owner = "client!ZGOJZVHR", name = "d", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ZGOJZVHR", name = "g", descriptor = "[I")
    public int[] field1701;

    @OriginalMember(owner = "client!ZGOJZVHR", name = "e", descriptor = "[LZGOJZVHR;")
    public static IdkType[] field1699;

    @OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(LATJMVOZR;I)V")
    public static void method575(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(true, arg0.method2("idk.dat", null));
        field1698 = var2.g2();
        if (field1699 == null) {
            field1699 = new IdkType[field1698];
        }
        for (int var3 = 0; var3 < field1698; var3++) {
            if (field1699[var3] == null) {
                field1699[var3] = new IdkType();
            }
            field1699[var3].method576(field1695, var2);
        }
        if (arg1 == 36135) {
            ;
        }
    }

    @OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(BLMFMVIYHT;)V")
    public void method576(byte arg0, Packet arg1) {
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = arg1.g1();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1700 = arg1.g1();
                } else if (var4 == 2) {
                    int var5 = arg1.g1();
                    this.field1701 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1701[var6] = arg1.g2();
                    }
                } else if (var4 == 3) {
                    this.field1705 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1702[var4 - 40] = arg1.g2();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1703[var4 - 50] = arg1.g2();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1704[var4 - 60] = arg1.g2();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(I)Z")
    public boolean method577(int arg0) {
        if (this.field1701 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 89 / arg0;
        for (int var4 = 0; var4 < this.field1701.length; var4++) {
            if (!Model.method360(this.field1701[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(B)LLZYQDKJV;")
    public Model method578(byte arg0) {
        if (this.field1701 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1701.length];
        for (int var3 = 0; var3 < this.field1701.length; var3++) {
            var2[var3] = Model.method359(this.field1701[var3]);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(var2.length, var2, (byte) -89);
        }
        for (int var5 = 0; var5 < 6 && this.field1702[var5] != 0; var5++) {
            var4.method373(this.field1702[var5], this.field1703[var5]);
        }
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "client!ZGOJZVHR", name = "b", descriptor = "(I)Z")
    public boolean method579(int arg0) {
        if (arg0 != -10584) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1704[var3] != -1 && !Model.method360(this.field1704[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ZGOJZVHR", name = "a", descriptor = "(Z)LLZYQDKJV;")
    public Model method580(boolean arg0) {
        Model[] var2 = new Model[5];
        if (arg0) {
            this.field1696 = -298;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1704[var4] != -1) {
                var2[var3++] = Model.method359(this.field1704[var4]);
            }
        }
        Model var5 = new Model(var3, var2, (byte) -89);
        for (int var6 = 0; var6 < 6 && this.field1702[var6] != 0; var6++) {
            var5.method373(this.field1702[var6], this.field1703[var6]);
        }
        return var5;
    }
}
