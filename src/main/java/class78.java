import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class78 extends class166 {

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "I")
    private int field1503 = 3216;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    private int field1495 = 3216;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "[I")
    private int[] field1505 = new int[3];

    @OriginalMember(owner = "client!oi", name = "ib", descriptor = "I")
    private int field1515 = 4096;

    @OriginalMember(owner = "client!oi", name = "db", descriptor = "Lhj;")
    private static class69 field1510 = class181.method1318("wishes to trade with you)3", (byte) -114);

    @OriginalMember(owner = "client!oi", name = "cb", descriptor = "Lhj;")
    public static class69 field1509 = class181.method1318("Standort", (byte) -110);

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "[Lij;")
    public static class189[] field1504 = new class189[50];

    @OriginalMember(owner = "client!oi", name = "gb", descriptor = "Lhj;")
    private static class69 field1513 = class181.method1318("Loading wordpack )2 ", (byte) -120);

    @OriginalMember(owner = "client!oi", name = "ab", descriptor = "Lhj;")
    public static class69 field1507 = class181.method1318("leuchten2:", (byte) -118);

    @OriginalMember(owner = "client!oi", name = "eb", descriptor = "Lhj;")
    public static class69 field1511 = field1513;

    @OriginalMember(owner = "client!oi", name = "bb", descriptor = "Lhj;")
    public static class69 field1508 = field1510;

    @OriginalMember(owner = "client!oi", name = "jb", descriptor = "Lhj;")
    private static class69 field1516 = class181.method1318("Discard", (byte) -121);

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "Lhj;")
    public static class69 field1497 = field1516;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!oi", name = "Z", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!oi", name = "fb", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!oi", name = "hb", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "Lnc;")
    public static class83 field1499;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "Lnc;")
    public static class83 field1502;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
    public static void method560(byte arg0) {
        field1504 = null;
        field1497 = null;
        field1511 = null;
        field1509 = null;
        field1507 = null;
        field1516 = null;
        field1499 = null;
        field1502 = null;
        field1513 = null;
        field1508 = null;
        field1510 = null;
        if (arg0 < 99) {
            method562(-122, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
    private final void method561(int arg0) {
        ++field1514;
        double var2 = Math.cos((double) ((float) this.field1495 / 4096.0F));
        this.field1505[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field1503 / 4096.0F)));
        this.field1505[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1503 / 4096.0F)) * var2);
        this.field1505[2] = (int) (Math.sin((double) ((float) this.field1495 / 4096.0F)) * 4096.0D);
        int var4 = this.field1505[2] * this.field1505[2] >> 12;
        int var5 = this.field1505[0] * this.field1505[0] >> 12;
        int var6 = this.field1505[arg0] * this.field1505[1] >> 12;
        int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 - -var4 >> 12)));
        if (~var7 != -1) {
            this.field1505[1] = (this.field1505[1] << 12) / var7;
            this.field1505[2] = (this.field1505[2] << 12) / var7;
            this.field1505[0] = (this.field1505[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        ++field1498;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field1495 = arg1.method912(arg0 ^ -60);
                }
            } else {
                this.field1503 = arg1.method912(arg0 + 3);
            }
        } else {
            this.field1515 = arg1.method912(81);
        }
        if (arg0 != 96) {
            this.method16(64);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg1 != 8388607) {
            return null;
        } else {
            ++field1500;
            int[] var3 = super.field3071.method1252(arg0, true);
            if (super.field3071.field3142) {
                int var4 = class19.field244 * this.field1515 >> 12;
                int[] var5 = this.method1231(-70, arg0 + -1 & class138.field2583, 0);
                int[] var6 = this.method1231(-56, arg0, 0);
                int[] var7 = this.method1231(-96, arg0 + 1 & class138.field2583, 0);
                for (int var8 = 0; ~var8 > ~class253.field4565; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class12.field183 & var8 + -1] + -var6[class12.field183 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    if (var11 > 255) {
                        var11 = 255;
                    }
                    int var12 = var9 >> 4;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class66.field1276[((var12 + 1) * var12 >> 1) + var11] & 255;
                    int var14 = var9 * var13 >> 8;
                    int var15 = var13 * 4096 >> 8;
                    int var16 = var10 * var13 >> 8;
                    int var17 = this.field1505[1] * var14 >> 12;
                    int var18 = this.field1505[2] * var15 >> 12;
                    int var19 = this.field1505[0] * var16 >> 12;
                    var3[var8] = var17 + var19 + var18;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class78() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        int var2 = -80 / ((arg0 - 58) / 50);
        this.method561(1);
        ++field1506;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)V")
    public static final void method562(int arg0, byte arg1) {
        ++field1501;
        class75.field1469.method1708(-1009973721, arg0);
        class11.field96.method1708(-1009973721, arg0);
        class76.field1490.method1708(-1009973721, arg0);
        class258.field4631.method1708(-1009973721, arg0);
        if (arg1 != -115) {
            method562(12, (byte) -64);
        }
    }
}
