import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class384 {

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "[I")
    private int[] field5659 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field5654 = -1;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "Liv;")
    public class292 field5658;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "Ldl;")
    public static class87 field5647;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "[I")
    private int[] field5645;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "[S")
    private short[] field5650;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "[S")
    private short[] field5652;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "[S")
    private short[] field5655;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "[S")
    private short[] field5657;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)Lfe;", line = 5)
    public final class153 method2443(byte arg0) {
        field5660++;
        if (this.field5645 == null) {
            return null;
        }
        class153[] var2 = new class153[this.field5645.length];
        class83 var3 = this.field5658.field4520;
        synchronized (this.field5658.field4520) {
            int var4 = 0;
            while (true) {
                if (this.field5645.length <= var4) {
                    break;
                }
                var2[var4] = class404.method2541(this.field5645[var4], 0, (byte) 98, this.field5658.field4520);
                var4++;
            }
        }
        int var5 = 0;
        if (arg0 < 32) {
            return null;
        }
        while (this.field5645.length > var5) {
            if (var2[var5].field2348 < 13) {
                var2[var5].method1118(0, -102);
            }
            var5++;
        }
        class153 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class153(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field5657 != null) {
            for (int var7 = 0; var7 < this.field5657.length; var7++) {
                var6.method1116(this.field5650[var7], this.field5657[var7], 59);
            }
        }
        if (this.field5652 != null) {
            for (int var8 = 0; var8 < this.field5652.length; var8++) {
                var6.method1112(this.field5652[var8], this.field5655[var8], (byte) 82);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lfh;I)V", line = 78)
    public final void method2444(class194 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1337((byte) -123);
            if (var3 == 0) {
                field5646++;
                if (arg1 != 0) {
                    this.method2443((byte) 82);
                    return;
                }
                return;
            }
            this.method2447(var3, (byte) -41, arg0);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Z", line = 99)
    public final boolean method2445(int arg0) {
        field5651++;
        if (this.field5645 == null) {
            return true;
        }
        int var2 = 26 / ((arg0 - 64) / 45);
        boolean var3 = true;
        class83 var4 = this.field5658.field4520;
        synchronized (this.field5658.field4520) {
            for (int var5 = 0; var5 < this.field5645.length; var5++) {
                if (!this.field5658.field4520.method758((byte) -102, this.field5645[var5], 0)) {
                    var3 = false;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V", line = 128)
    public static void method2446(boolean arg0) {
        if (!arg0) {
            field5654 = -119;
        }
        field5647 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IBLfh;)V", line = 143)
    private final void method2447(int arg0, byte arg1, class194 arg2) {
        if (arg1 >= -24) {
            method2448(-5);
        }
        if (arg0 == 1) {
            arg2.method1337((byte) -119);
        } else if (arg0 == 2) {
            int var4 = arg2.method1337((byte) -114);
            this.field5645 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5645[var5] = arg2.method1396(118);
            }
        } else if (arg0 != 3) {
            if (arg0 == 40) {
                int var6 = arg2.method1337((byte) 56);
                this.field5650 = new short[var6];
                this.field5657 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5657[var7] = (short) arg2.method1396(22);
                    this.field5650[var7] = (short) arg2.method1396(126);
                }
            } else if (arg0 == 41) {
                int var8 = arg2.method1337((byte) -115);
                this.field5652 = new short[var8];
                this.field5655 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5652[var9] = (short) arg2.method1396(-96);
                    this.field5655[var9] = (short) arg2.method1396(-16);
                }
            } else if (arg0 >= 60 && arg0 < 70) {
                this.field5659[arg0 - 60] = arg2.method1396(-102);
            }
        }
        field5649++;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V", line = 227)
    public static final void method2448(int arg0) {
        field5653++;
        class20.method126(false, -125);
        int var1 = 112 % ((35 - arg0) / 36);
        if (class12.field134 >= 0 && class12.field134 != 0) {
            class155.method1127(class12.field134, -68);
            class12.field134 = -1;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(B)Lfe;", line = 255)
    public final class153 method2449(byte arg0) {
        field5656++;
        class153[] var2 = new class153[5];
        int var3 = 0;
        class83 var4 = this.field5658.field4520;
        synchronized (this.field5658.field4520) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    if (arg0 >= -7) {
                        this.field5655 = null;
                    }
                    break;
                }
                if (this.field5659[var5] != -1) {
                    var2[var3++] = class404.method2541(this.field5659[var5], 0, (byte) 111, this.field5658.field4520);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field2348 < 13) {
                var2[var6].method1118(0, -54);
            }
        }
        class153 var7 = new class153(var2, var3);
        if (this.field5657 != null) {
            for (int var8 = 0; var8 < this.field5657.length; var8++) {
                var7.method1116(this.field5650[var8], this.field5657[var8], -97);
            }
        }
        if (this.field5652 != null) {
            for (int var9 = 0; var9 < this.field5652.length; var9++) {
                var7.method1112(this.field5652[var9], this.field5655[var9], (byte) -122);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)Z", line = 331)
    public final boolean method2450(int arg0) {
        field5648++;
        boolean var2 = true;
        class83 var3 = this.field5658.field4520;
        synchronized (this.field5658.field4520) {
            for (int var4 = arg0; var4 < 5; var4++) {
                if (this.field5659[var4] != -1 && !this.field5658.field4520.method758((byte) -102, this.field5659[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }
}
