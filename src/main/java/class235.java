import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class235 {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    private int field3530 = -1;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    private int field3543 = 0;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "Lok;")
    private class266 field3539 = new class266();

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "Z")
    public boolean field3546 = false;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "[[[I")
    private int[][][] field3542;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[Lol;")
    private class299[] field3531;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Luh;")
    public static class176 field3529 = new class176(12, 0, 1, 0);

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "[I")
    public static int[] field3540 = new int[14];

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field3545 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[I")
    public static int[] field3538;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1573(int arg0) {
        field3535++;
        if (arg0 != -7) {
            return null;
        } else if (this.field3537 == this.field3534) {
            for (int var2 = 0; var2 < this.field3537; var2++) {
                this.field3531[var2] = class125.field1941;
            }
            return this.field3542;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
    public static final void method1574(int arg0) {
        class561.field7977.method2240(-103);
        field3532++;
        class173.field2687.method2240(arg0 + 124);
        if (arg0 != 0) {
            field3545 = -53;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public final void method1575(int arg0) {
        field3544++;
        for (int var2 = arg0; var2 < this.field3537; var2++) {
            this.field3542[var2][0] = null;
            this.field3542[var2][1] = null;
            this.field3542[var2][2] = null;
            this.field3542[var2] = null;
        }
        this.field3531 = null;
        this.field3542 = null;
        this.field3539.method1729((byte) 126);
        this.field3539 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method1576(byte arg0, int arg1) {
        int var3 = -107 / ((5 - arg0) / 51);
        field3541++;
        if (this.field3537 == this.field3534) {
            this.field3546 = this.field3531[arg1] == null;
            this.field3531[arg1] = class125.field1941;
            return this.field3542[arg1];
        } else if (this.field3537 == 1) {
            this.field3546 = this.field3530 != arg1;
            this.field3530 = arg1;
            return this.field3542[0];
        } else {
            class299 var4 = this.field3531[arg1];
            if (var4 == null) {
                this.field3546 = true;
                if (this.field3537 > this.field3543) {
                    var4 = new class299(arg1, this.field3543);
                    this.field3543++;
                } else {
                    class299 var5 = (class299) this.field3539.method1733((byte) 87);
                    var4 = new class299(arg1, var5.field4325);
                    this.field3531[var5.field4323] = null;
                    var5.method3387((byte) 106);
                }
                this.field3531[arg1] = var4;
            } else {
                this.field3546 = false;
            }
            this.field3539.method1728(-121, var4);
            return this.field3542[var4.field4325];
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1577(byte arg0, int arg1) {
        field3533++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class620.field8694.method3580(class140.field2081, 12) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class620.field8696.method3580(class140.field2081, 12) + " (" + var2 + ")</col>";
        } else {
            int var4 = -23 % ((30 - arg0) / 61);
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILwia;ZJII)V")
    public static final void method1578(int arg0, int arg1, class791 arg2, boolean arg3, long arg4, int arg5, int arg6) {
        if (arg0 < -118) {
            field3536++;
            class58.method396(arg2, arg4, 0, 0, arg1, arg6, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public static void method1579(int arg0) {
        field3540 = null;
        field3538 = null;
        if (arg0 != 14) {
            method1574(-81);
        }
        field3529 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(III)V")
    public class235(int arg0, int arg1, int arg2) {
        this.field3534 = arg1;
        this.field3537 = arg0;
        this.field3542 = new int[this.field3537][3][arg2];
        this.field3531 = new class299[this.field3534];
    }
}
