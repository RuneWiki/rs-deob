import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class64 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    private int field989 = 128;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    private int field990 = 0;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    private int field1002 = 128;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public int field999 = -1;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "Z")
    public boolean field1008 = false;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    private int field998 = 0;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    private int field1009 = 0;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field997 = 0;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Lhi;")
    public static class82 field1005 = class95.method664((byte) -26, "Moteur son pr-Bpar-B");

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Lhi;")
    public static class82 field996 = class95.method664((byte) -49, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "[[I")
    public static int[][] field1006 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "[I")
    public static int[] field1011 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    private int field1007;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Ldj;")
    public static class143 field992;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "[S")
    private short[] field1000;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "[S")
    private short[] field1004;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "[S")
    private short[] field994;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "[S")
    private short[] field995;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILbc;)V", line = 10)
    public final void method408(int arg0, class153 arg1) {
        while (true) {
            int var3 = arg1.method1082(-46);
            if (var3 == 0) {
                if (arg0 != 15991) {
                    method413((byte) 51);
                }
                field993++;
                return;
            }
            this.method414(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lgg;)V", line = 29)
    public static final void method409(class69 arg0) {
        for (int var1 = arg0.field1076; var1 <= arg0.field1068; var1++) {
            for (int var2 = arg0.field1080; var2 <= arg0.field1083; var2++) {
                class16 var3 = class15.field120[arg0.field1071][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field165; var4++) {
                        if (var3.field158[var4] == arg0) {
                            var3.field165--;
                            for (int var5 = var4; var5 < var3.field165; var5++) {
                                var3.field158[var5] = var3.field158[var5 + 1];
                                var3.field174[var5] = var3.field174[var5 + 1];
                            }
                            var3.field158[var3.field165] = null;
                            break;
                        }
                    }
                    var3.field155 = 0;
                    for (int var6 = 0; var6 < var3.field165; var6++) {
                        var3.field155 |= var3.field174[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I", line = 85)
    public static final int method410(int arg0, int arg1) {
        field991++;
        return arg0 == 144 ? arg1 & 0xFF : 111;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Lvj;", line = 136)
    public static final class187 method411(int arg0, int arg1) {
        field986++;
        class187 var2 = (class187) class75.field1258.method2250((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 3) {
            byte[] var3 = class105.field1859.method1577(26, arg0, arg1 ^ 0xFFFF8C7C);
            class187 var4 = new class187();
            if (var3 != null) {
                var4.method1288(true, new class153(var3));
            }
            class75.field1258.method2255(var4, (long) arg0, false);
            return var4;
        } else {
            return (class187) null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)Lpa;", line = 166)
    public final class155 method412(byte arg0, int arg1) {
        class155 var3 = (class155) class28.field383.method2175((long) this.field1001, 3008);
        field1010++;
        if (var3 == null) {
            class174 var4 = class174.method1243(class267.field4534, this.field1007, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field995 != null) {
                for (int var5 = 0; var5 < this.field995.length; var5++) {
                    var4.method1229(this.field995[var5], this.field1004[var5]);
                }
            }
            if (this.field1000 != null) {
                for (int var6 = 0; var6 < this.field1000.length; var6++) {
                    var4.method1238(this.field1000[var6], this.field994[var6]);
                }
            }
            var3 = var4.method1242(this.field990 + 64, 850 - -this.field998, -30, -50, -30);
            class28.field383.method2169(var3, (long) this.field1001, (byte) 94);
        }
        if (arg0 <= 0) {
            method410(21, 73);
        }
        class155 var7;
        if (this.field999 == -1 || arg1 == -1) {
            var7 = var3.method196(true, true);
        } else {
            var7 = class284.method1973(this.field999, false).method266(arg1, var3, 9193);
        }
        if (this.field1002 != 128 || this.field989 != 128) {
            var7.method204(this.field1002, this.field989, this.field1002);
        }
        if (this.field1009 != 0) {
            if (this.field1009 == 90) {
                var7.method210();
            }
            if (this.field1009 == 180) {
                var7.method201();
            }
            if (this.field1009 == 270) {
                var7.method230();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 244)
    public static void method413(byte arg0) {
        field1005 = null;
        int var1 = -122 / ((-arg0 - 76) / 42);
        field1011 = null;
        field1006 = (int[][]) null;
        field996 = null;
        field992 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZLbc;)V", line = 272)
    private final void method414(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            return;
        }
        field1003++;
        if (arg0 == 1) {
            this.field1007 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field999 = arg2.method1090(false);
        } else if (arg0 == 4) {
            this.field1002 = arg2.method1090(arg1);
        } else if (arg0 == 5) {
            this.field989 = arg2.method1090(arg1);
        } else if (arg0 == 6) {
            this.field1009 = arg2.method1090(false);
        } else if (arg0 == 7) {
            this.field990 = arg2.method1082(-119);
        } else if (arg0 == 8) {
            this.field998 = arg2.method1082(-122);
        } else if (arg0 == 9) {
            this.field1008 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method1082(-60);
            this.field1004 = new short[var6];
            this.field995 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field995[var7] = (short) arg2.method1090(false);
                this.field1004[var7] = (short) arg2.method1090(arg1);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method1082(-108);
            this.field1000 = new short[var4];
            this.field994 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1000[var5] = (short) arg2.method1090(false);
                this.field994[var5] = (short) arg2.method1090(arg1);
            }
        }
    }
}
