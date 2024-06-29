import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class24 {

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    private int field446 = 128;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    private int field445 = 0;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    private int field452 = 0;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    private int field450 = 128;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "Z")
    public boolean field457 = false;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    private int field458 = 0;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public int field460 = -1;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "Lsg;")
    public static class30 field454 = class167.method1221((byte) 33, "welle:");

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "Lub;")
    public static class17 field462 = new class17(128);

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public static int field465 = 20;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "Lsg;")
    public static class30 field466 = class167.method1221((byte) 33, ":assist:");

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field451;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lmc;")
    public static class151 field464;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "[S")
    private short[] field449;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "[S")
    private short[] field459;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "[S")
    private short[] field461;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "[S")
    private short[] field463;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method213(int arg0) {
        field462 = null;
        field466 = null;
        field454 = null;
        field464 = null;
        if (arg0 != 951717127) {
            method218((byte) 42, 4);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
    public static final int method214(int arg0, int arg1, int arg2) {
        field444++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (arg0 != 19643) {
                method213(40);
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BILaa;)V")
    private final void method215(byte arg0, int arg1, class8 arg2) {
        if (arg0 != -117) {
            field465 = -66;
        }
        field448++;
        if (arg1 == 1) {
            this.field443 = arg2.method65((byte) 113);
        } else if (arg1 == 2) {
            this.field460 = arg2.method65((byte) 113);
        } else if (arg1 == 4) {
            this.field446 = arg2.method65((byte) 118);
        } else if (arg1 == 5) {
            this.field450 = arg2.method65((byte) 120);
        } else if (arg1 == 6) {
            this.field445 = arg2.method65((byte) 111);
        } else if (arg1 == 7) {
            this.field458 = arg2.method63((byte) 120);
        } else if (arg1 == 8) {
            this.field452 = arg2.method63((byte) 54);
        } else if (arg1 == 9) {
            this.field457 = true;
        } else if (arg1 == 40) {
            int var6 = arg2.method63((byte) 106);
            this.field449 = new short[var6];
            this.field459 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field449[var7] = (short) arg2.method65((byte) 125);
                this.field459[var7] = (short) arg2.method65((byte) 109);
            }
        } else if (arg1 == 41) {
            int var4 = arg2.method63((byte) 125);
            this.field463 = new short[var4];
            this.field461 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field463[var5] = (short) arg2.method65((byte) 107);
                this.field461[var5] = (short) arg2.method65((byte) 125);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLaa;)V")
    public final void method216(byte arg0, class8 arg1) {
        field447++;
        while (true) {
            int var3 = arg1.method63((byte) 107);
            if (var3 == 0) {
                if (arg0 == 110) {
                    return;
                } else {
                    method214(118, -16, 68);
                    return;
                }
            }
            this.method215((byte) -117, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lfi;")
    public final class217 method217(int arg0, int arg1) {
        field453++;
        class217 var3 = (class217) class233.field4147.method1644((byte) -55, (long) this.field451);
        if (var3 == null) {
            class128 var4 = class128.method969(class174.field3246, this.field443, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field449 != null) {
                for (int var5 = 0; var5 < this.field449.length; var5++) {
                    var4.method961(this.field449[var5], this.field459[var5]);
                }
            }
            if (this.field463 != null) {
                for (int var6 = 0; var6 < this.field463.length; var6++) {
                    var4.method966(this.field463[var6], this.field461[var6]);
                }
            }
            var3 = var4.method965(this.field458 + 64, this.field452 + 850, -30, -50, -30);
            class233.field4147.method1646((long) this.field451, var3, -119);
        }
        class217 var7;
        if (this.field460 == -1 || arg1 == -1) {
            var7 = var3.method1558(true, true);
        } else {
            var7 = class193.method1396(-30590, this.field460).method1038(var3, arg1, 127);
        }
        if (this.field446 != 128 || this.field450 != 128) {
            var7.method1564(this.field446, this.field450, this.field446);
        }
        if (this.field445 != arg0) {
            if (this.field445 == 90) {
                var7.method1548();
            }
            if (this.field445 == 180) {
                var7.method1567();
            }
            if (this.field445 == 270) {
                var7.method1551();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V")
    public static final void method218(byte arg0, int arg1) {
        field455++;
        if (class81.field1747 == null) {
            class81.field1747 = new byte[4][104][104];
        }
        if (arg1 != -30) {
            field462 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class81.field1747[var2][var3][var4] = arg0;
                }
            }
        }
    }
}
