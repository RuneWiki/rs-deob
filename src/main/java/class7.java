import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class7 extends class396 {

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "[I")
    public static int[] field90 = new int[14];

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "Ljava/lang/String;")
    public static String field95 = "Hidden";

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "Lha;")
    public static class36 field79;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "Ljava/lang/String;")
    public String field94;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "[C")
    public char[] field83;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "[C")
    public char[] field91;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "[I")
    public int[] field86;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "[I")
    public int[] field93;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLbk;)V", line = 4)
    public final void method64(byte arg0, class211 arg1) {
        if (arg0 > -28) {
            method67((byte) 107, 100, 29, 84, -108);
        }
        while (true) {
            int var3 = arg1.method1342((byte) -128);
            if (var3 == 0) {
                field87++;
                return;
            }
            this.method70(-32276, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IC)I", line = 25)
    public final int method65(int arg0, char arg1) {
        field88++;
        if (this.field93 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field93.length; var3++) {
            if (this.field91[var3] == arg1) {
                return this.field93[var3];
            }
        }
        if (arg0 != -15720) {
            method67((byte) 98, -18, -69, 99, -80);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZI)V", line = 57)
    public static final void method66(boolean arg0, int arg1) {
        field85++;
        if (arg0) {
            class348 var2 = class385.method2464(1, 1302, arg1);
            var2.method2214((byte) 121);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BIIII)V", line = 72)
    public static final void method67(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class351.field5129 != 0 && arg3 != 0 && class45.field544 < 50 && arg4 != -1) {
            class116.field1373[class45.field544] = arg4;
            class56.field632[class45.field544] = arg3;
            class119.field1560[class45.field544] = arg1;
            class236.field3210[class45.field544] = null;
            class268.field3768[class45.field544] = 0;
            class83.field932[class45.field544] = arg2;
            class45.field544++;
        }
        field80++;
        if (arg0 <= 98) {
            field90 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(IC)I", line = 104)
    public final int method68(int arg0, char arg1) {
        field81++;
        if (this.field86 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field86.length; var3++) {
            if (this.field83[var3] == arg1) {
                return this.field86[var3];
            }
        }
        if (arg0 <= 73) {
            this.method69(15);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V", line = 130)
    public final void method69(int arg0) {
        if (this.field86 != null) {
            for (int var2 = 0; var2 < this.field86.length; var2++) {
                this.field86[var2] = class164.method1059(this.field86[var2], 32768);
            }
        }
        field92++;
        if (arg0 != 32768) {
            this.method68(76, 'E');
        }
        if (this.field93 != null) {
            for (int var3 = 0; var3 < this.field93.length; var3++) {
                this.field93[var3] = class164.method1059(this.field93[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILbk;I)V", line = 169)
    private final void method70(int arg0, class211 arg1, int arg2) {
        if (arg2 == 1) {
            this.field94 = arg1.method1350(arg0 + 32378);
        } else if (arg2 == 2) {
            int var4 = arg1.method1342((byte) -127);
            this.field91 = new char[var4];
            this.field93 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field93[var5] = arg1.method1355(32136);
                byte var6 = arg1.method1373((byte) 30);
                this.field91[var5] = var6 == 0 ? 0 : class392.method2501(arg0 + 54078, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method1342((byte) -127);
            this.field83 = new char[var7];
            this.field86 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field86[var8] = arg1.method1355(32136);
                byte var9 = arg1.method1373((byte) 30);
                this.field83[var8] = var9 == 0 ? 0 : class392.method2501(arg0 + 54078, var9);
            }
        }
        if (arg0 != -32276) {
            this.method64((byte) 32, (class211) null);
        }
        field82++;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V", line = 237)
    public static void method71(byte arg0) {
        field79 = null;
        field90 = null;
        if (arg0 != -53) {
            method71((byte) -41);
        }
        field95 = null;
    }
}
