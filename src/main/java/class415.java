import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class415 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    private int field5855 = 0;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    private int field5857 = 0;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    private int field5866 = 0;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lkv;")
    private class280 field5854;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lb;")
    private class350 field5860;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[Lpl;")
    private class675[] field5853;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Lkk;")
    public class200 field5862;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lsi;")
    public static class583 field5856 = new class583();

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "J")
    public static long field5869 = 0L;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Ljava/lang/Object;")
    public static volatile Object field5870 = null;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field5864;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lfia;II)Z")
    public final boolean method2483(class599 arg0, int arg1, int arg2) {
        field5867++;
        if (this.field5857 == 0) {
            return false;
        }
        if (arg1 >= -13) {
            field5870 = null;
        }
        this.field5853[this.field5857 & Integer.MAX_VALUE].method1348(arg0, arg2, true);
        return true;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILrv;)Lvia;")
    public static final class587 method2484(int arg0, class120 arg1) {
        field5863++;
        return arg0 == 7 ? new class587(arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method838(true), arg1.method833(-3), arg1.method842(2384)) : null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method2485(int arg0) {
        if (arg0 != 0) {
            method2485(116);
        }
        field5870 = null;
        field5856 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)Z")
    public static final boolean method2486(int arg0, int arg1, int arg2) {
        field5859++;
        return arg2 == 8192 ? class75.method584(arg1, -120, arg0) & (class714.method4041(arg0, (byte) 35, arg1) | (arg1 & 0x2000) != 0 | class271.method1764((byte) 95, arg1, arg0)) : false;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIIZII)V")
    public final void method2487(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        boolean var7 = arg0 & this.field5854.method426();
        field5864++;
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg1 = arg4;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg3) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field5857 != arg5) {
            if (this.field5857 != 0) {
                this.field5853[this.field5857 & Integer.MAX_VALUE].method1353((byte) 52);
            }
            if (arg5 != 0) {
                this.field5853[Integer.MAX_VALUE & arg5].method1354(arg3, arg2 ^ 0x7882);
                this.field5853[Integer.MAX_VALUE & arg5].method1350(arg3, false);
                this.field5853[Integer.MAX_VALUE & arg5].method1351(arg4, 8865, arg1);
            }
            this.field5855 = arg1;
            this.field5857 = arg5;
            this.field5866 = arg4;
        } else if (this.field5857 != 0) {
            this.field5853[this.field5857 & Integer.MAX_VALUE].method1350(arg3, false);
            if (this.field5866 != arg4 || this.field5855 != arg1) {
                this.field5853[this.field5857 & Integer.MAX_VALUE].method1351(arg4, arg2 + 15072, arg1);
                this.field5866 = arg4;
                this.field5855 = arg1;
            }
        }
        if (arg2 != -6207) {
            method2490(-75, null);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
    public final boolean method2488(int arg0, int arg1) {
        field5868++;
        if (arg0 < 45) {
            this.method2483(null, -15, 14);
        }
        return this.field5853[arg1].method1347((byte) 126);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lnba;B)V")
    public static final void method2489(class312 arg0, byte arg1) {
        field5865++;
        if (class422.field5962) {
            return;
        }
        arg0.method3117((byte) -20);
        class543.field7608--;
        if (arg0.field4642) {
            for (class4 var5 = (class4) class174.field2456.method2480(381); var5 != null; var5 = (class4) class174.field2456.method2476((byte) 18)) {
                if (var5.field48.equals(arg0.field4633)) {
                    boolean var6 = false;
                    for (class312 var7 = (class312) var5.field46.method2480(381); var7 != null; var7 = (class312) var5.field46.method2476((byte) 18)) {
                        if (arg0 == var7) {
                            if (var5.method26(arg0, -11680)) {
                                class28.method206(var5, (byte) -72);
                            }
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        break;
                    }
                }
            }
        } else {
            long var2 = arg0.field4635;
            class4 var4;
            for (var4 = (class4) class634.field8942.method380((byte) -3, var2); var4 != null && !var4.field48.equals(arg0.field4633); var4 = (class4) class634.field8942.method383(-1)) {
            }
            if (var4 != null && var4.method26(arg0, -11680)) {
                class28.method206(var4, (byte) -72);
            }
        }
        if (arg1 != -128) {
            field5870 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILiw;)V")
    public static final void method2490(int arg0, class331 arg1) {
        arg1.method879((byte) -69, class235.field3408.method3157(3));
        field5858++;
        arg1.method879((byte) -82, class524.field7476.method3157(3));
        arg1.method879((byte) 95, class518.field7400.method3157(3));
        arg1.method879((byte) -50, class471.field6715.method3157(3));
        if (arg0 <= 88) {
            field5869 = -67L;
        }
        arg1.method879((byte) 63, class346.field5086.method3157(3));
        arg1.method879((byte) 116, class277.field3850.method3157(3));
        arg1.method879((byte) 72, class606.field8526.method3157(3));
        arg1.method879((byte) 67, class358.field5213.method3157(3));
        arg1.method879((byte) -67, class491.field6972.method3157(3));
        arg1.method879((byte) -127, class77.field1029.method3157(3));
        arg1.method879((byte) -69, class397.field5630.method3157(3));
        arg1.method879((byte) -63, class76.field1026.method3157(3));
        arg1.method879((byte) -110, class264.field3732.method3157(3));
        arg1.method879((byte) 100, class7.field79.method3157(3));
        arg1.method879((byte) 98, class641.field9035.method3157(3));
        arg1.method879((byte) -65, class84.field1103.method3157(3));
        arg1.method879((byte) 89, class179.field2712.method3157(3));
        arg1.method879((byte) 92, class490.field6965.method3157(3));
        arg1.method879((byte) -52, class439.field6284.method3157(3));
        arg1.method879((byte) -72, class145.field1851.method3157(3));
        arg1.method879((byte) 96, class703.field9906.method3157(3));
        arg1.method879((byte) -67, class171.field2443.method3157(3));
        arg1.method879((byte) 65, client.field4674.method3157(3));
        arg1.method879((byte) -91, class621.field8752.method3157(3));
        arg1.method879((byte) 94, class136.field1780.method3157(3));
        arg1.method879((byte) 60, class739.field10311.method3157(3));
        arg1.method879((byte) -120, class214.field3087.method3157(3));
        arg1.method879((byte) -104, class657.field9270.method3157(3));
        arg1.method879((byte) 68, class134.field1740.method3157(3));
        arg1.method879((byte) 118, class587.field8308.method3157(3));
        arg1.method879((byte) 123, class469.field6703.method3157(3));
        arg1.method879((byte) -57, class689.field9756.method3157(3));
        arg1.method879((byte) -70, class164.method1285(12));
        arg1.method879((byte) -102, class243.method1650(11));
        arg1.method879((byte) 103, class71.field967.method3157(3));
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(III)I")
    public static final int method2491(int arg0, int arg1, int arg2) {
        if (arg2 != -1030892513) {
            method2485(126);
        }
        field5861++;
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lkv;)V")
    public class415(class280 arg0) {
        this.field5854 = arg0;
        this.field5860 = new class350(arg0);
        this.field5853 = new class675[10];
        this.field5853[1] = new class384(arg0);
        this.field5853[2] = new class653(arg0, this.field5860);
        this.field5853[4] = new class300(arg0, this.field5860);
        this.field5853[5] = new class431(arg0, this.field5860);
        this.field5853[6] = new class226(arg0);
        this.field5853[7] = new class256(arg0);
        this.field5853[3] = this.field5862 = new class200(arg0);
        this.field5853[8] = new class179(arg0, this.field5860);
        this.field5853[9] = new class363(arg0, this.field5860);
        if (!this.field5853[8].method1347((byte) 115)) {
            this.field5853[8] = this.field5853[4];
        }
        if (!this.field5853[9].method1347((byte) 120)) {
            this.field5853[9] = this.field5853[8];
        }
    }
}
