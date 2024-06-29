import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class263 extends class222 {

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    private int field4614 = 0;

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
    private int field4620 = 4096;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "Lsb;")
    public static class98 field4612 = class47.method368("http:)4)4", 0);

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "Lsb;")
    private static class98 field4610 = class47.method368("white:", 0);

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "Lsb;")
    public static class98 field4613 = field4610;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "Lsb;")
    public static class98 field4619 = class47.method368("Bitte warten Sie)3)3)3", 0);

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "Lsb;")
    public static class98 field4616 = field4610;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "Lsb;")
    public static class98 field4615 = class47.method368("Spielwelt erstellt)3", 0);

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!qc", name = "kb", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class263() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(DB)V")
    public static final void method1793(double arg0, byte arg1) {
        if (class54.field870 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class119.field2133[var3] = var4 > 255 ? 255 : var4;
            }
            class54.field870 = arg0;
        }
        ++field4617;
        if (arg1 <= 85) {
            method1794(81L, (byte) 25);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 <= 35) {
            this.field4614 = 18;
        }
        ++field4623;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int[] var4 = this.method1537((byte) 46, 0, arg1);
            for (int var5 = 0; class13.field253 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field4614 && ~this.field4620 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JB)V")
    public static final void method1794(long arg0, byte arg1) {
        if (arg1 != -68) {
            method1793(-1.0273974239495063D, (byte) -64);
        }
        ++field4621;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)V")
    public static void method1795(byte arg0) {
        field4619 = null;
        field4615 = null;
        field4612 = null;
        field4616 = null;
        field4610 = null;
        if (arg0 < 95) {
            method1796(5, (class148) null);
        }
        field4613 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILq;)Z")
    public static final boolean method1796(int arg0, class148 arg1) {
        ++field4609;
        if (arg1.field2695 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~arg1.field2695.length; ++var2) {
                int var3 = class206.method1392(var2, arg1, 31546);
                int var4 = arg1.field2605[var2];
                if (~arg1.field2695[var2] != -3) {
                    if (arg1.field2695[var2] != 3) {
                        if (arg1.field2695[var2] != 4) {
                            if (~var3 != ~var4) {
                                return false;
                            }
                        } else if (var3 == var4) {
                            return false;
                        }
                    } else if (var4 >= var3) {
                        return false;
                    }
                } else if (~var4 >= ~var3) {
                    return false;
                }
            }
            if (arg0 <= 58) {
                field4619 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        ++field4611;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field4620 = arg0.method1487(123);
            }
        } else {
            this.field4614 = arg0.method1487(109);
        }
        if (arg1) {
            method1794(-6L, (byte) 121);
        }
    }
}
