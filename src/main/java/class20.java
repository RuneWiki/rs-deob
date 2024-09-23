import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ISUBRNPG")
public class class20 {

    @OriginalMember(owner = "ISUBRNPG", name = "h", descriptor = "I")
    public int field880 = -1;

    @OriginalMember(owner = "ISUBRNPG", name = "j", descriptor = "Z")
    public boolean field882 = false;

    @OriginalMember(owner = "ISUBRNPG", name = "k", descriptor = "I")
    public int field883 = 5;

    @OriginalMember(owner = "ISUBRNPG", name = "l", descriptor = "I")
    public int field884 = -1;

    @OriginalMember(owner = "ISUBRNPG", name = "m", descriptor = "I")
    public int field885 = -1;

    @OriginalMember(owner = "ISUBRNPG", name = "n", descriptor = "I")
    public int field886 = 99;

    @OriginalMember(owner = "ISUBRNPG", name = "o", descriptor = "I")
    public int field887 = -1;

    @OriginalMember(owner = "ISUBRNPG", name = "p", descriptor = "I")
    public int field888 = -1;

    @OriginalMember(owner = "ISUBRNPG", name = "q", descriptor = "I")
    public int field889 = 2;

    @OriginalMember(owner = "ISUBRNPG", name = "a", descriptor = "I")
    private static int field873 = -302;

    @OriginalMember(owner = "ISUBRNPG", name = "b", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "ISUBRNPG", name = "d", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "ISUBRNPG", name = "r", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "ISUBRNPG", name = "s", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "ISUBRNPG", name = "e", descriptor = "[I")
    public int[] field877;

    @OriginalMember(owner = "ISUBRNPG", name = "f", descriptor = "[I")
    public int[] field878;

    @OriginalMember(owner = "ISUBRNPG", name = "g", descriptor = "[I")
    private int[] field879;

    @OriginalMember(owner = "ISUBRNPG", name = "i", descriptor = "[I")
    public int[] field881;

    @OriginalMember(owner = "ISUBRNPG", name = "c", descriptor = "[LISUBRNPG;")
    public static class20[] field875;

    @OriginalMember(owner = "ISUBRNPG", name = "a", descriptor = "(LLYZBHNJP;I)V")
    public static void method225(class31 arg0, int arg1) {
        class69 var2 = new class69(arg0.method290("seq.dat", null), field873);
        if (arg1 != 0) {
            return;
        }
        field874 = var2.method549();
        if (field875 == null) {
            field875 = new class20[field874];
        }
        for (int var3 = 0; var3 < field874; var3++) {
            if (field875[var3] == null) {
                field875[var3] = new class20();
            }
            field875[var3].method227(var2, (byte) 5);
        }
    }

    @OriginalMember(owner = "ISUBRNPG", name = "a", descriptor = "(BI)I")
    public int method226(byte arg0, int arg1) {
        int var3 = this.field879[arg1];
        if (arg0 != 6) {
            return 1;
        }
        if (var3 == 0) {
            class41 var4 = class41.method382(this.field877[arg1], -142);
            if (var4 != null) {
                var3 = this.field879[arg1] = var4.field1298;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "ISUBRNPG", name = "a", descriptor = "(LZOMNSJJM;B)V")
    public void method227(class69 arg0, byte arg1) {
        if (arg1 != 5) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method547();
                if (var3 == 0) {
                    if (this.field876 == 0) {
                        this.field876 = 1;
                        this.field877 = new int[1];
                        this.field877[0] = -1;
                        this.field878 = new int[1];
                        this.field878[0] = -1;
                        this.field879 = new int[1];
                        this.field879[0] = -1;
                    }
                    if (this.field887 == -1) {
                        if (this.field881 == null) {
                            this.field887 = 0;
                        } else {
                            this.field887 = 2;
                        }
                    }
                    if (this.field888 == -1) {
                        if (this.field881 != null) {
                            this.field888 = 2;
                            return;
                        }
                        this.field888 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field876 = arg0.method547();
                    this.field877 = new int[this.field876];
                    this.field878 = new int[this.field876];
                    this.field879 = new int[this.field876];
                    for (int var4 = 0; var4 < this.field876; var4++) {
                        this.field877[var4] = arg0.method549();
                        this.field878[var4] = arg0.method549();
                        if (this.field878[var4] == 65535) {
                            this.field878[var4] = -1;
                        }
                        this.field879[var4] = arg0.method549();
                    }
                } else if (var3 == 2) {
                    this.field880 = arg0.method549();
                } else if (var3 == 3) {
                    int var5 = arg0.method547();
                    this.field881 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field881[var6] = arg0.method547();
                    }
                    this.field881[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field882 = true;
                } else if (var3 == 5) {
                    this.field883 = arg0.method547();
                } else if (var3 == 6) {
                    this.field884 = arg0.method549();
                } else if (var3 == 7) {
                    this.field885 = arg0.method549();
                } else if (var3 == 8) {
                    this.field886 = arg0.method547();
                } else if (var3 == 9) {
                    this.field887 = arg0.method547();
                } else if (var3 == 10) {
                    this.field888 = arg0.method547();
                } else if (var3 == 11) {
                    this.field889 = arg0.method547();
                } else if (var3 == 12) {
                    this.field890 = arg0.method552();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
