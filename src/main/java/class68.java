import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class68 {

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Lud;")
    private class2 field709;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Lho;")
    private class359 field705;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lr;")
    private class62 field704;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "I")
    public static int field715 = -1;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field706 = 0;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lar;")
    public static class47 field708 = new class47(64);

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static volatile int field718 = -1;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "F")
    public static float field702;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Ltq;")
    private class250 field703;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "[Lwd;")
    private class36[] field711;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 10)
    public final void method383(int arg0) {
        if (arg0 != -16487) {
            return;
        }
        field707++;
        if (this.field711 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field711.length; var2++) {
            if (this.field711[var2] != null) {
                this.field711[var2].method167(127);
            }
        }
        for (int var3 = 0; var3 < this.field711.length; var3++) {
            if (this.field711[var3] != null) {
                this.field711[var3].method176(arg0 + 16486);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIII)V", line = 46)
    public static final void method384(int arg0, int arg1, int arg2, int arg3) {
        field717++;
        if (arg3 != -1) {
            field715 = 71;
        }
        class89 var4 = class21.field197[arg0][arg2];
        class229.method1247(var4 == null ? class129.field1665 : var4, arg1, true);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IC)Z", line = 61)
    public static final boolean method385(int arg0, char arg1) {
        field716++;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            return true;
        } else if (arg0 < 24) {
            return false;
        } else {
            if (arg1 != '\u0000') {
                char[] var2 = class429.field6299;
                for (int var3 = 0; var3 < var2.length; var3++) {
                    char var4 = var2[var3];
                    if (arg1 == var4) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 95)
    public static void method386(byte arg0) {
        if (arg0 > 86) {
            field708 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lho;Lud;)V", line = 114)
    public class68(class359 arg0, class2 arg1) {
        this.field709 = arg1;
        this.field705 = arg0;
        if (!this.field705.method2192(6)) {
            this.field704 = this.field705.method2186(255, 255, true, (byte) 0, false);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBZLqk;Lqk;)Lwd;", line = 127)
    private final class36 method387(int arg0, byte arg1, boolean arg2, class334 arg3, class334 arg4) {
        field710++;
        if (this.field703 == null) {
            throw new RuntimeException();
        }
        this.field703.field3389 = arg0 * 8 + 5;
        if (this.field703.field3406.length <= this.field703.field3389) {
            throw new RuntimeException();
        } else if (this.field711[arg0] == null) {
            int var6 = this.field703.method1359(255);
            int var7 = this.field703.method1359(255);
            if (arg1 != -67) {
                this.field704 = null;
            }
            class36 var8 = new class36(arg0, arg3, arg4, this.field705, this.field709, var6, var7, arg2);
            this.field711[arg0] = var8;
            return var8;
        } else {
            return this.field711[arg0];
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lqk;Lqk;II)Lwd;", line = 171)
    public final class36 method388(class334 arg0, class334 arg1, int arg2, int arg3) {
        field712++;
        if (arg3 > -36) {
            field706 = -73;
        }
        return this.method387(arg2, (byte) -67, true, arg0, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)Z", line = 182)
    public final boolean method389(int arg0) {
        field714++;
        if (this.field703 != null) {
            return true;
        }
        if (this.field704 == null) {
            if (this.field705.method2192(6)) {
                return false;
            }
            this.field704 = this.field705.method2186(255, 255, true, (byte) 0, false);
        }
        if (this.field704.field1708) {
            return false;
        }
        this.field703 = new class250(this.field704.method337(-3695));
        if (arg0 == 8) {
            this.field711 = new class36[(this.field703.field3406.length - 5) / 8];
            return true;
        } else {
            return false;
        }
    }
}
