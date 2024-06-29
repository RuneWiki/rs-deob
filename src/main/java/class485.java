import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class485 extends class502 {

    @OriginalMember(owner = "client!hv", name = "r", descriptor = "Z")
    private boolean field6556 = false;

    @OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
    public int field6551 = 0;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "Z")
    public boolean field6558 = false;

    @OriginalMember(owner = "client!hv", name = "o", descriptor = "Laea;")
    private class47 field6553 = new class47();

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "I")
    private int field6560 = 0;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "Lgj;")
    public class593 field6559 = new class593();

    @OriginalMember(owner = "client!hv", name = "B", descriptor = "Z")
    public boolean field6566 = false;

    @OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
    private int field6562 = 0;

    @OriginalMember(owner = "client!hv", name = "E", descriptor = "Z")
    private boolean field6569 = false;

    @OriginalMember(owner = "client!hv", name = "D", descriptor = "Lc;")
    public class174 field6568 = new class174();

    @OriginalMember(owner = "client!hv", name = "p", descriptor = "[Lvb;")
    public class183[] field6554 = new class183[8192];

    @OriginalMember(owner = "client!hv", name = "l", descriptor = "[Z")
    private static boolean[] field6550 = new boolean[32];

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "[Z")
    private static boolean[] field6557 = new boolean[8];

    @OriginalMember(owner = "client!hv", name = "w", descriptor = "I")
    public int field6561;

    @OriginalMember(owner = "client!hv", name = "y", descriptor = "I")
    public int field6563;

    @OriginalMember(owner = "client!hv", name = "z", descriptor = "I")
    public int field6564;

    @OriginalMember(owner = "client!hv", name = "A", descriptor = "I")
    public int field6565;

    @OriginalMember(owner = "client!hv", name = "C", descriptor = "I")
    public int field6567;

    @OriginalMember(owner = "client!hv", name = "n", descriptor = "J")
    private long field6552;

    @OriginalMember(owner = "client!hv", name = "q", descriptor = "J")
    private long field6555;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "()Lc;")
    public final class174 method2705() {
        this.field6568.field2679.method2096(-109);
        for (int var1 = 0; var1 < this.field6554.length; var1++) {
            if (this.field6554[var1] != null && this.field6554[var1].field2764 != null) {
                this.field6568.field2679.method2097(this.field6554[var1], false);
            }
        }
        return this.field6568;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
    public final void method2706(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6561 = arg0;
        this.field6565 = arg1;
        this.field6564 = arg2;
        this.field6563 = arg3;
        this.field6567 = arg4;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "()V")
    public final void method2707() {
        this.field6569 = true;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([Lefa;Z)V")
    private final void method2708(class171[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field6557[var3] = false;
        }
        label76: for (class457 var4 = (class457) this.field6559.method3257(-27); var4 != null; var4 = (class457) this.field6559.method3263((byte) -104)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field6205 || arg0[var7].field2646 == var4.field6205) {
                        field6557[var7] = true;
                        var4.method2607(-25112);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method2797(-118);
                this.field6562--;
                if (var4.method128((byte) -69)) {
                    var4.method131(121);
                    class666.field9456--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field6562 != 8; var5++) {
            if (!field6557[var5]) {
                class457 var6 = null;
                if (arg0[var5].method1163(true).field1306 == 1 && class666.field9456 < 32) {
                    var6 = new class457(arg0[var5], this);
                    class247.field3441.method1630((long) arg0[var5].field2638, var6, (byte) 101);
                    class666.field9456++;
                }
                if (var6 == null) {
                    var6 = new class457(arg0[var5], this);
                }
                this.field6559.method3265(var6, (byte) -91);
                this.field6562++;
                field6557[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "()V")
    private final void method2709() {
        this.field6556 = false;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Loa;)V")
    public final void method2710(class651 arg0) {
        this.field6568.field2679.method2096(-117);
        for (class602 var2 = (class602) this.field6553.method328(0); var2 != null; var2 = (class602) this.field6553.method331((byte) -27)) {
            var2.method3320(arg0, this.field6552, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "()Lc;")
    public final class174 method2711() {
        return this.field6568;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Loa;J[Ljt;[Lefa;Z)V")
    public final void method2712(class651 arg0, long arg1, class93[] arg2, class171[] arg3, boolean arg4) {
        if (!this.field6558) {
            this.method2720(arg0, arg2, arg4);
            this.method2708(arg3, arg4);
            this.field6555 = arg1;
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)Lhv;")
    public static final class485 method2713(int arg0, boolean arg1) {
        if (client.field3892 == class84.field1293) {
            return new class485(arg0, arg1);
        } else {
            class485 var2 = class158.field2495[client.field3892];
            client.field3892 = client.field3892 + 1 & class416.field5684[class671.field9506];
            var2.method2719(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "()V")
    public final void method2714() {
        this.field6556 = true;
    }

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "()V")
    public static void method2715() {
        field6550 = null;
        field6557 = null;
    }

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "()V")
    public final void method2716() {
        this.field6558 = true;
        for (class457 var1 = (class457) this.field6559.method3257(-72); var1 != null; var1 = (class457) this.field6559.method3263((byte) -122)) {
            if (var1.field6207.field1306 == 1) {
                var1.method131(126);
            }
        }
        for (int var2 = 0; var2 < this.field6554.length; var2++) {
            if (this.field6554[var2] != null) {
                this.field6554[var2].method1213();
                this.field6554[var2] = null;
            }
        }
        this.field6551 = 0;
        this.field6553 = new class47();
        this.field6560 = 0;
        this.field6559 = new class593();
        this.field6562 = 0;
        this.method2787(false);
        class158.field2495[class84.field1293] = this;
        class84.field1293 = class84.field1293 + 1 & class416.field5684[class671.field9506];
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Loa;J)Z")
    public final boolean method2717(class651 arg0, long arg1) {
        if (this.field6555 == this.field6552) {
            this.method2709();
        } else {
            this.method2714();
        }
        if (arg1 - this.field6555 > 750L) {
            this.method2716();
            return false;
        }
        int var4 = (int) (arg1 - this.field6552);
        if (this.field6569) {
            for (class602 var5 = (class602) this.field6553.method328(0); var5 != null; var5 = (class602) this.field6553.method331((byte) 125)) {
                for (int var6 = 0; var6 < var5.field7996.field8932; var6++) {
                    var5.method3321(arg1, 1, 0, !this.field6556, arg0);
                }
            }
            this.field6569 = false;
        }
        for (class602 var7 = (class602) this.field6553.method328(0); var7 != null; var7 = (class602) this.field6553.method331((byte) 115)) {
            var7.method3321(arg1, var4, 0, !this.field6556, arg0);
        }
        this.field6552 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(J)V")
    public final void method2718(long arg0) {
        this.field6555 = arg0;
    }

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "(IZ)V")
    private final void method2719(int arg0, boolean arg1) {
        class98.field1476.method327(this, true);
        this.field6555 = arg0;
        this.field6552 = arg0;
        this.field6569 = true;
        this.field6566 = arg1;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Loa;[Ljt;Z)V")
    private final void method2720(class651 arg0, class93[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field6550[var4] = false;
        }
        label67: for (class602 var5 = (class602) this.field6553.method328(0); var5 != null; var5 = (class602) this.field6553.method331((byte) -113)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field7990 || arg1[var8].field1412 == var5.field7990) {
                        field6550[var8] = true;
                        var5.method3319(false);
                        var5.field7998 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field7995 == 0) {
                    var5.method2787(false);
                    this.field6560--;
                } else {
                    var5.field7998 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field6560 != 32; var6++) {
            if (!field6550[var6]) {
                class602 var7 = new class602(arg0, arg1[var6], this, this.field6555);
                this.field6553.method327(var7, true);
                this.field6560++;
                field6550[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(IZ)V")
    private class485(int arg0, boolean arg1) {
        this.method2719(arg0, arg1);
    }
}
