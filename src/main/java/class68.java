import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class68 extends class128 {

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    private int field888 = 204;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    private int field891 = 1;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    private int field896 = 1;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field894 = 0;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "Lan;")
    public static class337 field895 = new class337();

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field898 = 0;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(BI)[I", line = 7)
    public final int[] method126(byte arg0, int arg1) {
        field887++;
        int[] var3 = this.field1748.method902(arg1, true);
        if (arg0 <= 100) {
            field898 = 117;
        }
        if (this.field1748.field1878) {
            for (int var4 = 0; var4 < class10.field141; var4++) {
                int var5 = class334.field5157[var4];
                int var6 = class49.field600[arg1];
                int var7 = this.field891 * var6 >> 12;
                int var8 = this.field896 * var5 >> 12;
                int var9 = var5 % (4096 / this.field896) * this.field896;
                int var10 = var6 % (4096 / this.field891) * this.field891;
                if (var10 < this.field888) {
                    for (var8 -= var7; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field888 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var9 < this.field888) {
                    int var11;
                    for (var11 = var8 - var7; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V", line = 94)
    public static final void method424(int arg0) {
        if (class146.field2031 != -1) {
            class54.method327(-31356, class146.field2031);
        }
        field885++;
        for (int var1 = 0; var1 < class247.field3751; var1++) {
            if (class285.field4483[var1]) {
                class211.field2985[var1] = true;
            }
            class76.field969[var1] = class285.field4483[var1];
            class285.field4483[var1] = false;
        }
        if (arg0 != -2112214548) {
            method426(false);
        }
        class67.field882 = -1;
        class17.field232 = -1;
        class36.field421 = class38.field463;
        class80.field1037 = null;
        if (class250.field3787) {
            class100.field1319 = true;
        }
        if (class146.field2031 != -1) {
            class247.field3751 = 0;
            class30.method183(21385);
        }
        if (class250.field3787) {
            class306.method2143();
        } else {
            class144.method979();
        }
        class322.field4939 = 0;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V", line = 252)
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 157)
    public static final void method425(byte arg0) {
        class322.field4945 = -1;
        class255.field3876 = -3;
        if (arg0 <= 65) {
            return;
        }
        class60.field739 = 1;
        class157.field2173 = 0;
        field890++;
        class113.field1612 = false;
        class145.field2014 = 0;
        class336.field5179 = 0;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(Z)V", line = 174)
    public static final void method426(boolean arg0) {
        class140.field1954.method573(122, 59);
        for (class343 var1 = (class343) class292.field4585.method1540(29); var1 != null; var1 = (class343) class292.field4585.method1544(127)) {
            if (var1.field5324 == 0) {
                class84.method500(var1, true, 23139);
            }
        }
        if (!arg0) {
            field894 = -94;
        }
        if (class262.field3960 != null) {
            class239.method1712(0, class262.field3960);
            class262.field3960 = null;
        }
        field893++;
        class188.field2716++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lp;II)V", line = 208)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 >= -85) {
            return;
        }
        if (arg1 == 0) {
            this.field896 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field891 = arg0.method661(-1);
        } else if (arg1 == 2) {
            this.field888 = arg0.method624(14612);
        }
        field886++;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(Z)V", line = 272)
    public static void method427(boolean arg0) {
        field895 = null;
        if (!arg0) {
            field894 = -3;
        }
    }
}
