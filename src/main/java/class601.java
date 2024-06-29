import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class601 {

    @OriginalMember(owner = "client!no", name = "k", descriptor = "B")
    private byte field8666;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "I")
    public int field8660;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "I")
    public int field8663;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "I")
    public int field8661;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public int field8664;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public int field8659;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)I")
    public static final int method3543(int arg0, int arg1, int arg2) {
        field8656++;
        if (arg0 == 4 || arg0 == 5) {
            return class566.field7826[arg1 & 0x3];
        } else {
            if (arg2 != -10550) {
                method3544(null, (byte) -107, 91);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lan;BI)Lil;")
    public static final class7 method3544(class21 arg0, byte arg1, int arg2) {
        field8665++;
        int var3 = -119 / ((arg1 + 7) / 48);
        byte[] var4 = arg0.method242(arg2, (byte) -123);
        return var4 == null ? null : new class7(var4);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
    public final int method3545(byte arg0) {
        field8658++;
        return arg0 >= -33 ? 60 : this.field8666 & 0x7;
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)I")
    public final int method3546(byte arg0) {
        if (arg0 != -33) {
            method3543(-50, 40, 21);
        }
        field8662++;
        return (this.field8666 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I[[[Lbo;)V")
    public static final void method3547(int arg0, class622[][][] arg1) {
        if (arg0 != 12453) {
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class622[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class622 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field8979 instanceof class115) {
                            ((class115) var6.field8979).method750(111);
                        }
                        if (var6.field8981 instanceof class115) {
                            ((class115) var6.field8981).method750(arg0 - 12340);
                        }
                        if (var6.field8977 instanceof class115) {
                            ((class115) var6.field8977).method750(106);
                        }
                        if (var6.field8985 instanceof class115) {
                            ((class115) var6.field8985).method750(arg0 - 12337);
                        }
                        if (var6.field8982 instanceof class115) {
                            ((class115) var6.field8982).method750(120);
                        }
                        for (class559 var7 = var6.field8973; var7 != null; var7 = var7.field7736) {
                            class425 var8 = var7.field7742;
                            if (var8 instanceof class115) {
                                ((class115) var8).method750(arg0 ^ 0x30C8);
                            }
                        }
                    }
                }
            }
        }
        field8657++;
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
    public class601() {
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Ldaa;)V")
    public class601(class11 arg0) {
        this.field8666 = arg0.method67(65280);
        this.field8660 = arg0.method93((byte) 123);
        this.field8663 = arg0.method119(-75);
        this.field8661 = arg0.method119(-60);
        this.field8664 = arg0.method119(-70);
        this.field8659 = arg0.method119(-110);
    }
}
