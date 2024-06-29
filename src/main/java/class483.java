import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class483 {

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "I")
    private int field6888 = -1;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    private int field6886 = 0;

    @OriginalMember(owner = "client!pu", name = "i", descriptor = "Lbu;")
    private class19 field6893 = new class19();

    @OriginalMember(owner = "client!pu", name = "o", descriptor = "Z")
    public boolean field6899 = false;

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    private int field6892;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    private int field6889;

    @OriginalMember(owner = "client!pu", name = "m", descriptor = "[[[I")
    private int[][][] field6897;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "[Lbw;")
    private class591[] field6891;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public static int field6885 = 0;

    @OriginalMember(owner = "client!pu", name = "j", descriptor = "F")
    public static float field6894;

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!pu", name = "k", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!pu", name = "l", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!pu", name = "n", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)[[I")
    public final int[][] method2906(int arg0, int arg1) {
        field6898++;
        if (arg0 != 8) {
            this.field6888 = 20;
        }
        if (this.field6892 == this.field6889) {
            this.field6899 = this.field6891[arg1] == null;
            this.field6891[arg1] = class201.field2983;
            return this.field6897[arg1];
        } else if (this.field6889 == 1) {
            this.field6899 = this.field6888 != arg1;
            this.field6888 = arg1;
            return this.field6897[0];
        } else {
            class591 var3 = this.field6891[arg1];
            if (var3 == null) {
                this.field6899 = true;
                if (this.field6889 > this.field6886) {
                    var3 = new class591(arg1, this.field6886);
                    this.field6886++;
                } else {
                    class591 var4 = (class591) this.field6893.method125(-1);
                    var3 = new class591(arg1, var4.field8748);
                    this.field6891[var4.field8747] = null;
                    var4.method2457(arg0 - 8430);
                }
                this.field6891[arg1] = var3;
            } else {
                this.field6899 = false;
            }
            this.field6893.method123(-1, var3);
            return this.field6897[var3.field8748];
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(II)I")
    public static final int method2907(int arg0, int arg1) {
        field6887++;
        int var2 = arg0 & 0x3F;
        if (arg1 != 18701) {
            method2907(-16, 12);
        }
        int var3 = (arg0 & 0xE7) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)[[[I")
    public final int[][][] method2908(byte arg0) {
        field6895++;
        if (arg0 != 27) {
            return null;
        } else if (this.field6892 == this.field6889) {
            for (int var2 = 0; var2 < this.field6889; var2++) {
                this.field6891[var2] = class201.field2983;
            }
            return this.field6897;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
    public final void method2909(byte arg0) {
        for (int var2 = 0; var2 < this.field6889; var2++) {
            this.field6897[var2][0] = null;
            this.field6897[var2][1] = null;
            this.field6897[var2][2] = null;
            this.field6897[var2] = null;
        }
        field6890++;
        this.field6897 = null;
        this.field6891 = null;
        this.field6893.method122((byte) 14);
        if (arg0 < 79) {
            this.field6888 = -112;
        }
        this.field6893 = null;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(III)V")
    public class483(int arg0, int arg1, int arg2) {
        this.field6892 = arg1;
        this.field6889 = arg0;
        this.field6897 = new int[this.field6889][3][arg2];
        this.field6891 = new class591[this.field6892];
    }
}
