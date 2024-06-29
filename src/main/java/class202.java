import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class202 extends class238 {

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public int field2468 = 0;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "Z")
    public boolean field2467 = false;

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "Z")
    private boolean field2471 = false;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "Lqo;")
    private class21 field2475 = new class21();

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    private int field2476 = 0;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "Lmfa;")
    public class562 field2477 = new class562();

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    private int field2478 = 0;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "Z")
    private boolean field2483 = false;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "Z")
    public boolean field2486 = false;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "Ltg;")
    public class211 field2482 = new class211();

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "[Lmea;")
    public class391[] field2474 = new class391[8192];

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "[Z")
    private static boolean[] field2470 = new boolean[8];

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "[Z")
    private static boolean[] field2473 = new boolean[32];

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public int field2481;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public int field2484;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "J")
    private long field2469;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "J")
    private long field2472;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)Lhm;")
    public static final class202 method1229(int arg0, boolean arg1) {
        if (class577.field8240 == class480.field7042) {
            return new class202(arg0, arg1);
        } else {
            class202 var2 = class650.field9310[class577.field8240];
            class577.field8240 = class577.field8240 + 1 & class406.field5416[class533.field7631];
            var2.method1237(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Loa;[Ldg;Z)V")
    private final void method1230(class635 arg0, class375[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field2473[var4] = false;
        }
        label67: for (class176 var5 = (class176) this.field2475.method93((byte) 113); var5 != null; var5 = (class176) this.field2475.method92(0)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field2118 || arg1[var8].field4866 == var5.field2118) {
                        field2473[var8] = true;
                        var5.method1028(-383);
                        var5.field2108 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field2123 == 0) {
                    var5.method1374((byte) -119);
                    this.field2476--;
                } else {
                    var5.field2108 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field2476 != 32; var6++) {
            if (!field2473[var6]) {
                class176 var7 = new class176(arg0, arg1[var6], this, this.field2472);
                this.field2475.method87(92, var7);
                this.field2476++;
                field2473[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "()V")
    public final void method1231() {
        this.field2467 = true;
        for (class636 var1 = (class636) this.field2477.method3174((byte) 49); var1 != null; var1 = (class636) this.field2477.method3168(false)) {
            if (var1.field8996.field1583 == 1) {
                var1.method1968((byte) -109);
            }
        }
        for (int var2 = 0; var2 < this.field2474.length; var2++) {
            if (this.field2474[var2] != null) {
                this.field2474[var2].method2137();
                this.field2474[var2] = null;
            }
        }
        this.field2468 = 0;
        this.field2475 = new class21();
        this.field2476 = 0;
        this.field2477 = new class562();
        this.field2478 = 0;
        this.method1374((byte) -63);
        class650.field9310[class480.field7042] = this;
        class480.field7042 = class480.field7042 + 1 & class406.field5416[class533.field7631];
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "()V")
    public final void method1232() {
        this.field2483 = true;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Loa;)V")
    public final void method1233(class635 arg0) {
        this.field2482.field2558.method3125(0);
        for (class176 var2 = (class176) this.field2475.method93((byte) 77); var2 != null; var2 = (class176) this.field2475.method92(0)) {
            var2.method1030(arg0, this.field2469, (byte) 25);
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "()Ltg;")
    public final class211 method1234() {
        this.field2482.field2558.method3125(0);
        for (int var1 = 0; var1 < this.field2474.length; var1++) {
            if (this.field2474[var1] != null && this.field2474[var1].field5218 != null) {
                this.field2482.field2558.method3126(116, this.field2474[var1]);
            }
        }
        return this.field2482;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "()V")
    public static void method1235() {
        field2473 = null;
        field2470 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Loa;J[Ldg;[Lhaa;Z)V")
    public final void method1236(class635 arg0, long arg1, class375[] arg2, class73[] arg3, boolean arg4) {
        if (!this.field2467) {
            this.method1230(arg0, arg2, arg4);
            this.method1244(arg3, arg4);
            this.field2472 = arg1;
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IZ)V")
    private final void method1237(int arg0, boolean arg1) {
        class515.field7362.method87(84, this);
        this.field2472 = arg0;
        this.field2469 = arg0;
        this.field2483 = true;
        this.field2486 = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(J)V")
    public final void method1238(long arg0) {
        this.field2472 = arg0;
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "()V")
    private final void method1239() {
        this.field2471 = false;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Loa;J)Z")
    public final boolean method1240(class635 arg0, long arg1) {
        if (this.field2472 == this.field2469) {
            this.method1239();
        } else {
            this.method1243();
        }
        if (arg1 - this.field2472 > 750L) {
            this.method1231();
            return false;
        }
        int var4 = (int) (arg1 - this.field2469);
        if (this.field2483) {
            for (class176 var5 = (class176) this.field2475.method93((byte) 54); var5 != null; var5 = (class176) this.field2475.method92(0)) {
                for (int var6 = 0; var6 < var5.field2125.field7001; var6++) {
                    var5.method1029(1, (byte) -125, arg0, arg1, !this.field2471);
                }
            }
            this.field2483 = false;
        }
        for (class176 var7 = (class176) this.field2475.method93((byte) 58); var7 != null; var7 = (class176) this.field2475.method92(0)) {
            var7.method1029(var4, (byte) -125, arg0, arg1, !this.field2471);
        }
        this.field2469 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "()Ltg;")
    public final class211 method1241() {
        return this.field2482;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V")
    public final void method1242(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2480 = arg0;
        this.field2479 = arg1;
        this.field2485 = arg2;
        this.field2481 = arg3;
        this.field2484 = arg4;
    }

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "()V")
    public final void method1243() {
        this.field2471 = true;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([Lhaa;Z)V")
    private final void method1244(class73[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field2470[var3] = false;
        }
        label76: for (class636 var4 = (class636) this.field2477.method3174((byte) 49); var4 != null; var4 = (class636) this.field2477.method3168(false)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field9003 || arg0[var7].field777 == var4.field9003) {
                        field2470[var7] = true;
                        var4.method3560((byte) -97);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1519((byte) 121);
                this.field2478--;
                if (var4.method1966(0)) {
                    var4.method1968((byte) -82);
                    class19.field174--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field2478 != 8; var5++) {
            if (!field2470[var5]) {
                class636 var6 = null;
                if (arg0[var5].method465(false).field1583 == 1 && class19.field174 < 32) {
                    var6 = new class636(arg0[var5], this);
                    class592.field8416.method1487((long) arg0[var5].field774, var6, 1);
                    class19.field174++;
                }
                if (var6 == null) {
                    var6 = new class636(arg0[var5], this);
                }
                this.field2477.method3164(var6, 256);
                this.field2478++;
                field2470[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(IZ)V")
    private class202(int arg0, boolean arg1) {
        this.method1237(arg0, arg1);
    }
}
