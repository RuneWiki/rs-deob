import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class337 {

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Ljr;")
    private class112 field4752 = new class112(128);

    @OriginalMember(owner = "client!on", name = "k", descriptor = "Ljr;")
    public class112 field4758 = new class112(64);

    @OriginalMember(owner = "client!on", name = "f", descriptor = "Lin;")
    private class91 field4753;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Lin;")
    public class91 field4756;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 3)
    public final void method2130(int arg0) {
        field4749++;
        class112 var2 = this.field4752;
        synchronized (this.field4752) {
            this.field4752.method999(0);
        }
        class112 var3 = this.field4758;
        synchronized (this.field4758) {
            if (arg0 == 7851) {
                this.field4758.method999(arg0 - 7851);
            }
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BII)V", line = 25)
    public final void method2131(byte arg0, int arg1, int arg2) {
        field4750++;
        this.field4752 = new class112(arg2);
        this.field4758 = new class112(arg1);
        int var4 = 11 / ((arg0 + 46) / 43);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)Z", line = 36)
    public static final boolean method2132(int arg0, int arg1, int arg2) {
        if (arg0 == -3157) {
            field4757++;
            return class3.method12(0, arg2, arg1) | (arg1 & 0x70000) != 0 || class138.method1119(arg1, -79, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V", line = 50)
    public final void method2133(boolean arg0) {
        if (!arg0) {
            this.method2133(false);
        }
        class112 var2 = this.field4752;
        synchronized (this.field4752) {
            this.field4752.method996(-99);
        }
        field4751++;
        class112 var3 = this.field4758;
        synchronized (this.field4758) {
            this.field4758.method996(-78);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IIILuw;)Ljk;", line = 68)
    public static final class634 method2134(int arg0, int arg1, int arg2, class418 arg3) {
        field4755++;
        int var4 = arg3.field6053 | arg0 << 10;
        class634 var5 = (class634) class346.field4850.method2364((long) var4 << 16, (byte) -91);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class536.field7417.method868((byte) 73, class536.field7417.method876(var4, (byte) -90));
        if (var6 == null) {
            int var9 = arg3.field6053 | arg1 + 65536 << 10;
            class634 var10 = (class634) class346.field4850.method2364((long) var9 << 16, (byte) -31);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class536.field7417.method868((byte) 73, class536.field7417.method876(var9, (byte) -107));
            if (var11 == null) {
                int var14 = arg3.field6053 | 0x3FFFC00;
                class634 var15 = (class634) class346.field4850.method2364((long) var14 << 16, (byte) -107);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class536.field7417.method868((byte) 73, class536.field7417.method876(var14, (byte) 104));
                if (var16 == null) {
                    return arg2 == 96837648 ? null : null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class634 var17;
                    try {
                        var17 = class228.method1601(var16, -110);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field8711 = arg3;
                    class346.field4850.method2367((long) var14 << 16, var17, -1);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class634 var12;
                try {
                    var12 = class228.method1601(var11, -101);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field8711 = arg3;
                class346.field4850.method2367((long) var9 << 16, var12, -1);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class634 var7;
            try {
                var7 = class228.method1601(var6, -85);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field8711 = arg3;
            class346.field4850.method2367((long) var4 << 16, var7, -1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lsj;ILin;Lin;)V", line = 209)
    public class337(class460 arg0, int arg1, class91 arg2, class91 arg3) {
        this.field4753 = arg2;
        this.field4756 = arg3;
        this.field4753.method860(0, 36);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IB)V", line = 157)
    public final void method2135(int arg0, byte arg1) {
        class112 var3 = this.field4752;
        synchronized (this.field4752) {
            if (arg1 > -95) {
                this.method2136(-75, (byte) -61);
            }
            this.field4752.method987(2, arg0);
        }
        field4748++;
        class112 var4 = this.field4758;
        synchronized (this.field4758) {
            this.field4758.method987(2, arg0);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(IB)Lii;", line = 173)
    public final class553 method2136(int arg0, byte arg1) {
        field4754++;
        class112 var3 = this.field4752;
        class553 var4;
        synchronized (this.field4752) {
            var4 = (class553) this.field4752.method992((long) arg0, 91);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 < 36) {
            return null;
        } else {
            class91 var5 = this.field4753;
            byte[] var6;
            synchronized (this.field4753) {
                var6 = this.field4753.method863(-1860, 36, arg0);
            }
            class553 var7 = new class553();
            var7.field7638 = this;
            var7.field7626 = arg0;
            if (var6 != null) {
                var7.method3186(new class215(var6), 109);
            }
            var7.method3179(-25359);
            class112 var8 = this.field4752;
            synchronized (this.field4752) {
                this.field4752.method991(var7, (long) arg0, (byte) -106);
                return var7;
            }
        }
    }
}
