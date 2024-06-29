import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class268 extends class525 {

    @OriginalMember(owner = "client!bp", name = "D", descriptor = "Z")
    public boolean field4024 = true;

    @OriginalMember(owner = "client!bp", name = "C", descriptor = "I")
    public static int field4023 = 0;

    @OriginalMember(owner = "client!bp", name = "A", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!bp", name = "B", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!bp", name = "E", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!bp", name = "F", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!bp", name = "H", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!bp", name = "I", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!bp", name = "J", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!bp", name = "K", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!bp", name = "M", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!bp", name = "O", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!bp", name = "R", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!bp", name = "P", descriptor = "Lfm;")
    public class526 field4036;

    @OriginalMember(owner = "client!bp", name = "L", descriptor = "[I")
    public int[] field4032;

    @OriginalMember(owner = "client!bp", name = "N", descriptor = "[I")
    private int[] field4034;

    @OriginalMember(owner = "client!bp", name = "Q", descriptor = "[Ljava/lang/String;")
    private String[] field4037;

    @OriginalMember(owner = "client!bp", name = "S", descriptor = "[[I")
    private int[][] field4039;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(ILwn;)Ljava/lang/String;", line = 3)
    public final String method1721(int arg0, class519 arg1) {
        field4038++;
        StringBuffer var3 = new StringBuffer(80);
        if (arg0 != 0) {
            this.method1726(69);
        }
        if (this.field4034 != null) {
            for (int var4 = 0; var4 < this.field4034.length; var4++) {
                var3.append(this.field4037[var4]);
                var3.append(this.field4036.method3118(this.method1729(var4, arg0 ^ 0xFFFFFF19), this.field4039[var4], arg1.method3042(true, class358.method2219(0, this.field4034[var4]).field1479), 1));
            }
        }
        var3.append(this.field4037[this.field4037.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Lwn;I[I)V", line = 32)
    public final void method1722(class519 arg0, int arg1, int[] arg2) {
        field4030++;
        if (this.field4034 == null) {
            return;
        }
        for (int var4 = arg1; var4 < this.field4034.length; var4++) {
            if (arg2.length <= var4) {
                return;
            }
            int var5 = this.method1729(var4, -231).field1471;
            if (var5 > 0) {
                arg0.method3035(false, (long) arg2[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)I", line = 58)
    public final int method1723(int arg0, int arg1, int arg2) {
        field4028++;
        if (arg2 <= 17) {
            this.method1726(124);
        }
        if (this.field4034 == null || arg1 < 0 || arg1 > this.field4034.length) {
            return -1;
        } else if (this.field4039[arg1] == null || arg0 < 0 || arg0 > this.field4039[arg1].length) {
            return -1;
        } else {
            return this.field4039[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(ILwn;)V", line = 77)
    public final void method1724(int arg0, class519 arg1) {
        if (arg0 != -1) {
            field4023 = 11;
        }
        field4021++;
        while (true) {
            int var3 = arg1.method3072((byte) -121);
            if (var3 == 0) {
                return;
            }
            this.method1730(0, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BII)Z", line = 103)
    public static final boolean method1725(byte arg0, int arg1, int arg2) {
        field4027++;
        int var3 = 74 % ((arg0 - 35) / 56);
        return class221.method1504(arg1, arg2, (byte) -82) | (arg2 & 0x800) != 0 || class437.method2573(arg1, (byte) 110, arg2);
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V", line = 116)
    public final void method1726(int arg0) {
        if (this.field4032 != null) {
            for (int var2 = 0; var2 < this.field4032.length; var2++) {
                this.field4032[var2] = class442.method2600(this.field4032[var2], 32768);
            }
        }
        if (arg0 != 32768) {
            this.field4034 = null;
        }
        field4031++;
    }

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "(I)I", line = 140)
    public final int method1727(int arg0) {
        field4029++;
        if (this.field4034 == null) {
            return 0;
        } else {
            int var2 = 95 / ((57 - arg0) / 44);
            return this.field4034.length;
        }
    }

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "(I)Ljava/lang/String;", line = 157)
    public final String method1728(int arg0) {
        if (arg0 != -1) {
            this.method1726(58);
        }
        field4025++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4037 == null) {
            return "";
        }
        var2.append(this.field4037[0]);
        for (int var3 = 1; var3 < this.field4037.length; var3++) {
            var2.append("...");
            var2.append(this.field4037[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Lvr;", line = 192)
    public final class92 method1729(int arg0, int arg1) {
        field4022++;
        if (arg1 != -231) {
            this.method1721(102, null);
        }
        return this.field4034 == null || arg0 < 0 || this.field4034.length < arg0 ? null : class358.method2219(0, this.field4034[arg0]);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILwn;)V", line = 206)
    private final void method1730(int arg0, int arg1, class519 arg2) {
        if (arg0 != 0) {
            return;
        }
        if (arg1 == 1) {
            this.field4037 = class446.method2630(~arg0, arg2.method3082((byte) 60), '<');
        } else if (arg1 == 2) {
            int var4 = arg2.method3072((byte) -124);
            this.field4032 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4032[var5] = arg2.method3018(566990904);
            }
        } else if (arg1 == 3) {
            int var6 = arg2.method3072((byte) -126);
            this.field4039 = new int[var6][];
            this.field4034 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method3018(566990904);
                class92 var9 = class358.method2219(0, var8);
                if (var9 != null) {
                    this.field4034[var7] = var8;
                    this.field4039[var7] = new int[var9.field1474];
                    for (int var10 = 0; var10 < var9.field1474; var10++) {
                        this.field4039[var7][var10] = arg2.method3018(class288.method1845(arg0, 566990904));
                    }
                }
            }
        } else if (arg1 == 4) {
            this.field4024 = false;
        }
        field4035++;
    }
}
