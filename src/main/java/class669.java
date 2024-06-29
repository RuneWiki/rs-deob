import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class669 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "[I")
    private int[] field9450 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Z")
    public static boolean field9451 = false;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field9449;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field9454;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "Ldh;")
    public class290 field9462;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "[I")
    private int[] field9453;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "[S")
    private short[] field9452;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "[S")
    private short[] field9455;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "[S")
    private short[] field9460;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "[S")
    private short[] field9461;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)Llm;")
    public final class461 method3704(byte arg0) {
        field9456++;
        class461[] var2 = new class461[5];
        int var3 = 0;
        class522 var4 = this.field9462.field4307;
        synchronized (this.field9462.field4307) {
            int var5 = 0;
            if (arg0 <= 111) {
                field9451 = true;
            }
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field9450[var5] != -1) {
                    var2[var3++] = class24.method284(this.field9450[var5], (byte) 26, 0, this.field9462.field4307);
                }
                var5++;
            }
        }
        for (int var6 = 0; var6 < 5; var6++) {
            if (var2[var6] != null && var2[var6].field6623 < 13) {
                var2[var6].method2712(24787, 2);
            }
        }
        class461 var7 = new class461(var2, var3);
        if (this.field9461 != null) {
            for (int var8 = 0; var8 < this.field9461.length; var8++) {
                var7.method2710(this.field9461[var8], this.field9452[var8], 0);
            }
        }
        if (this.field9455 != null) {
            for (int var9 = 0; var9 < this.field9455.length; var9++) {
                var7.method2708(this.field9455[var9], (byte) 123, this.field9460[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILmo;)V")
    private final void method3705(int arg0, int arg1, class695 arg2) {
        if (arg1 == 1) {
            arg2.method3826(false);
        } else if (arg1 == 2) {
            int var4 = arg2.method3826(false);
            this.field9453 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9453[var5] = arg2.method3847((byte) 118);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg2.method3826(false);
                this.field9461 = new short[var6];
                this.field9452 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field9461[var7] = (short) arg2.method3847((byte) 118);
                    this.field9452[var7] = (short) arg2.method3847((byte) 118);
                }
            } else if (arg1 == 41) {
                int var8 = arg2.method3826(false);
                this.field9460 = new short[var8];
                this.field9455 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field9455[var9] = (short) arg2.method3847((byte) 118);
                    this.field9460[var9] = (short) arg2.method3847((byte) 118);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field9450[arg1 - 60] = arg2.method3847((byte) 118);
            }
        }
        field9457++;
        if (arg0 < 107) {
            this.field9453 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILmo;)V")
    public final void method3706(int arg0, class695 arg1) {
        while (true) {
            int var3 = arg1.method3826(false);
            if (var3 == 0) {
                field9449++;
                if (arg0 != 10083) {
                    this.method3707(108);
                    return;
                }
                return;
            }
            this.method3705(108, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Llm;")
    public final class461 method3707(int arg0) {
        field9454++;
        if (this.field9453 == null) {
            return null;
        }
        class461[] var2 = new class461[this.field9453.length];
        class522 var3 = this.field9462.field4307;
        synchronized (this.field9462.field4307) {
            int var4 = arg0;
            while (true) {
                if (this.field9453.length <= var4) {
                    break;
                }
                var2[var4] = class24.method284(this.field9453[var4], (byte) 17, 0, this.field9462.field4307);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field9453.length; var5++) {
            if (var2[var5].field6623 < 13) {
                var2[var5].method2712(arg0 ^ 0x60D3, 2);
            }
        }
        class461 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class461(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field9461 != null) {
            for (int var7 = 0; var7 < this.field9461.length; var7++) {
                var6.method2710(this.field9461[var7], this.field9452[var7], 0);
            }
        }
        if (this.field9455 != null) {
            for (int var8 = 0; var8 < this.field9455.length; var8++) {
                var6.method2708(this.field9455[var8], (byte) -125, this.field9460[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)Z")
    public final boolean method3708(byte arg0) {
        field9463++;
        int var2 = -86 / ((34 - arg0) / 54);
        boolean var3 = true;
        class522 var4 = this.field9462.field4307;
        synchronized (this.field9462.field4307) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field9450[var5] != -1 && !this.field9462.field4307.method2991(this.field9450[var5], 0, (byte) -66)) {
                    var3 = false;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z")
    public final boolean method3709(int arg0) {
        field9458++;
        if (this.field9453 == null) {
            return true;
        }
        boolean var2 = true;
        class522 var3 = this.field9462.field4307;
        synchronized (this.field9462.field4307) {
            if (arg0 < 125) {
                this.method3705(58, -16, null);
            }
            for (int var4 = 0; var4 < this.field9453.length; var4++) {
                if (!this.field9462.field4307.method2991(this.field9453[var4], 0, (byte) 127)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BILjava/lang/String;)Z")
    public static final boolean method3710(byte arg0, int arg1, String arg2) {
        field9459++;
        if (arg0 != 112) {
            method3710((byte) -120, -34, null);
        }
        if (class368.field5267.field49) {
            class228.field3284 = new class333();
            class228.field3284.field4938 = arg1;
            class228.field3284.field4948 = arg2;
            if (class379.field5372 != class296.field4357) {
                class228.field3284.field4941 = class228.field3284.field4938 + 50000;
                class228.field3284.field4937 = class228.field3284.field4938 + 40000;
            }
            if (arg1 < class439.field6407.length && class439.field6407[arg1] != null) {
                class143.field2113 = class439.field6407[arg1].field2920;
            }
            return true;
        }
        String var3 = "";
        if (class379.field5372 != class296.field4357) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class31.field483 != null) {
            var4 = "/p=" + class31.field483;
        }
        String var5 = "http://" + arg2 + var3 + "/l=" + class512.field7203 + "/a=" + class40.field657 + var4 + "/j" + (class273.field4108 ? "1" : "0") + ",o" + (class161.field2312 ? "1" : "0") + ",a2";
        try {
            class565.field7967.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }
}
