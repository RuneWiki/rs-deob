import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class32 {

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Lpa;")
    private class140 field471 = new class140(256);

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "Lpa;")
    private class140 field477 = new class140(256);

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "Ljl;")
    private class101 field473;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Ljl;")
    private class101 field470;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "[I")
    public static int[] field469 = new int[256];

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field465 = 0;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([IIII)Lbk;")
    private final class142 method185(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -572764220) {
            this.method185((int[]) null, 122, -11, 126);
        }
        field476++;
        int var5 = arg2 ^ (arg3 << 4 & 0xFFFC | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class142 var9 = (class142) this.field477.method992((byte) 125, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class220 var10 = (class220) this.field471.method992((byte) 125, var7);
            if (var10 == null) {
                var10 = class220.method1539(this.field470, arg3, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field471.method986(var10, var7, arg1 ^ 0x2223B03B);
            }
            class142 var11 = var10.method1538(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method441(16773377);
                this.field477.method986(var11, var7, -1);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[IBI)Lbk;")
    private final class142 method186(int arg0, int[] arg1, byte arg2, int arg3) {
        int var5 = (arg0 << 4 & 0xFFFA | arg0 >>> 12) ^ arg3;
        int var6 = var5 | arg0 << 16;
        field472++;
        long var7 = (long) var6;
        class142 var9 = (class142) this.field477.method992((byte) 125, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class103 var10 = class103.method693(this.field473, arg0, arg3);
            if (arg2 != -32) {
                return null;
            } else if (var10 == null) {
                return null;
            } else {
                class142 var11 = var10.method692();
                this.field477.method986(var11, var7, -1);
                if (arg1 != null) {
                    arg1[0] -= var11.field2426.length;
                }
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([III)Lbk;")
    public final class142 method187(int[] arg0, int arg1, int arg2) {
        field463++;
        if (arg1 < 61) {
            field465 = -43;
        }
        if (this.field473.method676(false) == 1) {
            return this.method186(0, arg0, (byte) -32, arg2);
        } else if (this.field473.method672(arg2, (byte) 118) == 1) {
            return this.method186(arg2, arg0, (byte) -32, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method188(int arg0) {
        if (arg0 >= -91) {
            method190((class109) null, -101);
        }
        field469 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[I)Lbk;")
    public final class142 method189(int arg0, int arg1, int[] arg2) {
        field474++;
        if (arg1 == ~this.field470.method676(false)) {
            return this.method185(arg2, arg1 - 572764218, arg0, 0);
        } else if (this.field470.method672(arg0, (byte) 124) == 1) {
            return this.method185(arg2, -572764220, 0, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lsb;I)V")
    public static final void method190(class109 arg0, int arg1) {
        int var2 = arg0.field1763 - class72.field1146;
        int var3 = arg0.field1788 * 128 + arg0.method763(arg1 + 18830) * 64;
        field466++;
        if (arg1 != -18831) {
            return;
        }
        int var4 = arg0.field1794 * 128 + arg0.method763(arg1 ^ 0x498E) * 64;
        if (arg0.field1781 == 0) {
            arg0.field1816 = 1024;
        }
        arg0.field1765 = 0;
        arg0.field1793 += (var4 - arg0.field1793) / var2;
        if (arg0.field1781 == 1) {
            arg0.field1816 = 1536;
        }
        arg0.field1799 += (var3 - arg0.field1799) / var2;
        if (arg0.field1781 == 2) {
            arg0.field1816 = 0;
        }
        if (arg0.field1781 == 3) {
            arg0.field1816 = 512;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)Lga;")
    public static final class154 method191(int arg0, byte arg1) {
        field467++;
        if (arg0 == 0) {
            return new class49();
        } else if (arg0 == 1) {
            return new class55();
        } else if (arg0 == 2) {
            return new class286();
        } else if (arg0 == 3) {
            return new class41();
        } else if (arg0 == 4) {
            return new class214();
        } else if (arg0 == 5) {
            return new class137();
        } else if (arg0 == 6) {
            return new class248();
        } else if (arg0 == 7) {
            return new class156();
        } else if (arg0 == 8) {
            return new class191();
        } else if (arg0 == 9) {
            return new class233();
        } else if (arg0 == 10) {
            return new class166();
        } else if (arg0 == 11) {
            return new class124();
        } else if (arg0 == 12) {
            return new class174();
        } else if (arg0 == 13) {
            return new class150();
        } else if (arg0 == 14) {
            return new class84();
        } else if (arg0 == 15) {
            return new class23();
        } else if (arg0 == 16) {
            return new class267();
        } else if (arg0 == 17) {
            return new class144();
        } else if (arg0 == 18) {
            return new class263();
        } else if (arg0 == 19) {
            return new class143();
        } else if (arg0 == 20) {
            return new class277();
        } else if (arg0 == 21) {
            return new class246();
        } else if (arg0 == 22) {
            return new class86();
        } else if (arg0 == 23) {
            return new class119();
        } else if (arg0 == 24) {
            return new class29();
        } else if (arg0 == 25) {
            return new class249();
        } else if (arg0 == 26) {
            return new class48();
        } else if (arg0 == 27) {
            return new class126();
        } else if (arg0 == 28) {
            return new class257();
        } else if (arg0 == 29) {
            return new class289();
        } else if (arg0 == 30) {
            return new class269();
        } else if (arg0 == 31) {
            return new class26();
        } else if (arg0 == 32) {
            return new class82();
        } else if (arg0 == 33) {
            return new class33();
        } else if (arg0 == 34) {
            return new class158();
        } else if (arg0 == 35) {
            return new class227();
        } else if (arg0 == 36) {
            return new class199();
        } else if (arg0 == 37) {
            return new class151();
        } else if (arg0 == 38) {
            return new class132();
        } else if (arg0 == 39) {
            return new class80();
        } else {
            if (arg1 != -22) {
                method191(0, (byte) 82);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljl;Ljl;)V")
    public class32(class101 arg0, class101 arg1) {
        this.field473 = arg0;
        this.field470 = arg1;
    }
}
