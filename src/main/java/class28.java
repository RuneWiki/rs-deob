import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JZFUUSFN")
public class class28 {

    @OriginalMember(owner = "client!JZFUUSFN", name = "h", descriptor = "I")
    public int field957 = -1;

    @OriginalMember(owner = "client!JZFUUSFN", name = "j", descriptor = "Z")
    public boolean field959 = false;

    @OriginalMember(owner = "client!JZFUUSFN", name = "k", descriptor = "I")
    public int field960 = 5;

    @OriginalMember(owner = "client!JZFUUSFN", name = "l", descriptor = "I")
    public int field961 = -1;

    @OriginalMember(owner = "client!JZFUUSFN", name = "m", descriptor = "I")
    public int field962 = -1;

    @OriginalMember(owner = "client!JZFUUSFN", name = "n", descriptor = "I")
    public int field963 = 99;

    @OriginalMember(owner = "client!JZFUUSFN", name = "o", descriptor = "I")
    public int field964 = -1;

    @OriginalMember(owner = "client!JZFUUSFN", name = "p", descriptor = "I")
    public int field965 = -1;

    @OriginalMember(owner = "client!JZFUUSFN", name = "q", descriptor = "I")
    public int field966 = 2;

    @OriginalMember(owner = "client!JZFUUSFN", name = "b", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!JZFUUSFN", name = "d", descriptor = "I")
    public int field953;

    @OriginalMember(owner = "client!JZFUUSFN", name = "r", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!JZFUUSFN", name = "s", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!JZFUUSFN", name = "a", descriptor = "Z")
    private static boolean field950;

    @OriginalMember(owner = "client!JZFUUSFN", name = "e", descriptor = "[I")
    public int[] field954;

    @OriginalMember(owner = "client!JZFUUSFN", name = "f", descriptor = "[I")
    public int[] field955;

    @OriginalMember(owner = "client!JZFUUSFN", name = "g", descriptor = "[I")
    private int[] field956;

    @OriginalMember(owner = "client!JZFUUSFN", name = "i", descriptor = "[I")
    public int[] field958;

    @OriginalMember(owner = "client!JZFUUSFN", name = "c", descriptor = "[LJZFUUSFN;")
    public static class28[] field952;

    @OriginalMember(owner = "client!JZFUUSFN", name = "a", descriptor = "(BLIEMHZJLX;)V")
    public static void method307(byte arg0, class23 arg1) {
        class38 var2 = new class38(0, arg1.method242("seq.dat", null));
        if (arg0 != 8) {
            field950 = !field950;
        }
        field951 = var2.method359();
        if (field952 == null) {
            field952 = new class28[field951];
        }
        for (int var3 = 0; var3 < field951; var3++) {
            if (field952[var3] == null) {
                field952[var3] = new class28();
            }
            field952[var3].method309(403, var2);
        }
    }

    @OriginalMember(owner = "client!JZFUUSFN", name = "a", descriptor = "(II)I")
    public int method308(int arg0, int arg1) {
        if (arg0 != 6) {
            return 3;
        }
        int var3 = this.field956[arg1];
        if (var3 == 0) {
            class71 var4 = class71.method601(this.field954[arg1]);
            if (var4 != null) {
                var3 = this.field956[arg1] = var4.field1718;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!JZFUUSFN", name = "a", descriptor = "(ILMVHXDWGI;)V")
    public void method309(int arg0, class38 arg1) {
        int var3 = 88 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method357();
                if (var4 == 0) {
                    if (this.field953 == 0) {
                        this.field953 = 1;
                        this.field954 = new int[1];
                        this.field954[0] = -1;
                        this.field955 = new int[1];
                        this.field955[0] = -1;
                        this.field956 = new int[1];
                        this.field956[0] = -1;
                    }
                    if (this.field964 == -1) {
                        if (this.field958 == null) {
                            this.field964 = 0;
                        } else {
                            this.field964 = 2;
                        }
                    }
                    if (this.field965 == -1) {
                        if (this.field958 != null) {
                            this.field965 = 2;
                            return;
                        }
                        this.field965 = 0;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    this.field953 = arg1.method357();
                    this.field954 = new int[this.field953];
                    this.field955 = new int[this.field953];
                    this.field956 = new int[this.field953];
                    for (int var5 = 0; var5 < this.field953; var5++) {
                        this.field954[var5] = arg1.method359();
                        this.field955[var5] = arg1.method359();
                        if (this.field955[var5] == 65535) {
                            this.field955[var5] = -1;
                        }
                        this.field956[var5] = arg1.method359();
                    }
                } else if (var4 == 2) {
                    this.field957 = arg1.method359();
                } else if (var4 == 3) {
                    int var6 = arg1.method357();
                    this.field958 = new int[var6 + 1];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field958[var7] = arg1.method357();
                    }
                    this.field958[var6] = 9999999;
                } else if (var4 == 4) {
                    this.field959 = true;
                } else if (var4 == 5) {
                    this.field960 = arg1.method357();
                } else if (var4 == 6) {
                    this.field961 = arg1.method359();
                } else if (var4 == 7) {
                    this.field962 = arg1.method359();
                } else if (var4 == 8) {
                    this.field963 = arg1.method357();
                } else if (var4 == 9) {
                    this.field964 = arg1.method357();
                } else if (var4 == 10) {
                    this.field965 = arg1.method357();
                } else if (var4 == 11) {
                    this.field966 = arg1.method357();
                } else if (var4 == 12) {
                    this.field967 = arg1.method362();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var4);
                }
            }
        }
    }
}
