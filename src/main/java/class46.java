import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class46 extends class56 {

    @OriginalMember(owner = "client!cja", name = "G", descriptor = "I")
    public static int field612 = 1;

    @OriginalMember(owner = "client!cja", name = "H", descriptor = "I")
    public static int field613 = 0;

    @OriginalMember(owner = "client!cja", name = "D", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!cja", name = "E", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!cja", name = "J", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!cja", name = "K", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!cja", name = "L", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!cja", name = "N", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!cja", name = "M", descriptor = "[Lm;")
    private class205[] field617;

    @OriginalMember(owner = "client!cja", name = "F", descriptor = "[[I")
    public static int[][] field611;

    @OriginalMember(owner = "client!cja", name = "<init>", descriptor = "()V")
    public class46() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "([[II)V")
    private final void method412(int[][] arg0, int arg1) {
        ++field614;
        if (arg1 != -1) {
            method414(13);
        }
        int var3 = class642.field8759;
        int var4 = class784.field10832;
        class784.method4346((byte) 115, arg0);
        class54.method480((byte) -85, 0, 0, class75.field1037, class446.field5990);
        if (this.field617 != null) {
            for (int var5 = 0; ~var5 > ~this.field617.length; ++var5) {
                class205 var6 = this.field617[var5];
                int var7 = var6.field2449;
                int var8 = var6.field2450;
                if (var7 >= 0) {
                    if (~var8 <= -1) {
                        var6.method1222(var4, -10852, var3);
                    } else {
                        var6.method1223(1, var3, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method1225(var4, var3, (byte) -14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(BI)[[I")
    public final int[][] method187(byte arg0, int arg1) {
        ++field615;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (super.field759.field341) {
            int var4 = class642.field8759;
            int var5 = class784.field10832;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field759.method222(0);
            this.method412(var6, -1);
            for (int var8 = 0; ~var8 > ~class784.field10832; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class642.field8759; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class296.method1733(var15 << 4, 4080);
                    var12[var14] = class296.method1733(65280, var15) >> 4;
                    var11[var14] = class296.method1733(var15 >> 12, 4080);
                }
            }
        }
        if (arg0 <= 35) {
            field612 = 88;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "(I)V")
    public static void method413(int arg0) {
        if (arg0 != 2) {
            method414(5);
        }
        field611 = null;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field609;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field752.field2441) {
                this.method412(super.field752.method1304((byte) 94), -1);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cja", name = "d", descriptor = "(I)Z")
    public static final boolean method414(int arg0) {
        ++field610;
        if (arg0 != -22723) {
            method413(-89);
        }
        return ~class303.field3619 != -1;
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(BILes;)V")
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg0 > -44) {
            this.method145(-105, -122);
        }
        ++field618;
        if (~arg1 != -1) {
            if (~arg1 == -2) {
                super.field762 = ~arg2.method2396((byte) 33) == -2;
                return;
            }
        } else {
            this.field617 = new class205[arg2.method2396((byte) 119)];
            for (int var4 = 0; ~var4 > ~this.field617.length; ++var4) {
                int var5 = arg2.method2396((byte) 29);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field617[var4] = class418.method2499(-31064, arg2);
                            }
                        } else {
                            this.field617[var4] = class13.method191(arg2, (byte) 111);
                        }
                    } else {
                        this.field617[var4] = class105.method859(arg2, 0);
                    }
                } else {
                    this.field617[var4] = class748.method4178(-94, arg2);
                }
            }
        }
    }
}
