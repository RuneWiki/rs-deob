import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class619 extends class640 {

    @OriginalMember(owner = "client!kq", name = "s", descriptor = "Z")
    public boolean field9095 = false;

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "Z")
    private boolean field9094 = false;

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "I")
    public int field9100 = 0;

    @OriginalMember(owner = "client!kq", name = "y", descriptor = "Leba;")
    private class614 field9092 = new class614();

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    private int field9102 = 0;

    @OriginalMember(owner = "client!kq", name = "z", descriptor = "Lef;")
    public class513 field9101 = new class513();

    @OriginalMember(owner = "client!kq", name = "w", descriptor = "Z")
    private boolean field9106 = false;

    @OriginalMember(owner = "client!kq", name = "v", descriptor = "Z")
    public boolean field9105 = false;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    private int field9107 = 0;

    @OriginalMember(owner = "client!kq", name = "A", descriptor = "Ljw;")
    public class580 field9103 = new class580();

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "[Lom;")
    public class392[] field9098 = new class392[8192];

    @OriginalMember(owner = "client!kq", name = "x", descriptor = "[Z")
    private static boolean[] field9093 = new boolean[32];

    @OriginalMember(owner = "client!kq", name = "t", descriptor = "[Z")
    private static boolean[] field9097 = new boolean[8];

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public int field9104;

    @OriginalMember(owner = "client!kq", name = "u", descriptor = "J")
    private long field9096;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "J")
    private long field9099;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lha;J[Ljk;[Lhja;Z)V", line = 3)
    public final void method4612(class66 arg0, long arg1, class659[] arg2, class426[] arg3, boolean arg4) {
        if (!this.field9095) {
            this.method4624(arg0, arg2, arg4);
            this.method4625(arg3, arg4);
            this.field9096 = arg1;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()V", line = 11)
    public final void method4613() {
        this.field9106 = true;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "()V", line = 15)
    public final void method4614() {
        this.field9095 = true;
        for (class554 var1 = (class554) this.field9101.method3863((byte) 64); var1 != null; var1 = (class554) this.field9101.method3862(-353)) {
            if (var1.field8254.field8113 == 1) {
                var1.method362((byte) 72);
            }
        }
        for (int var2 = 0; var2 < this.field9098.length; var2++) {
            if (this.field9098[var2] != null) {
                this.field9098[var2].method3112();
                this.field9098[var2] = null;
            }
        }
        this.field9100 = 0;
        this.field9092 = new class614();
        this.field9102 = 0;
        this.field9101 = new class513();
        this.field9107 = 0;
        this.method4696(-113);
        class784.field11420[class648.field9382] = this;
        class648.field9382 = class648.field9382 + 1 & class211.field3243[class222.field3408];
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()V", line = 51)
    private final void method4615() {
        this.field9094 = false;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lha;)V", line = 54)
    public final void method4616(class66 arg0) {
        this.field9103.field8599.method3908((byte) 5);
        for (class255 var2 = (class255) this.field9092.method4538(false); var2 != null; var2 = (class255) this.field9092.method4543(0)) {
            var2.method2161(arg0, this.field9099, (byte) 116);
        }
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "()Ljw;", line = 66)
    public final class580 method4617() {
        this.field9103.field8599.method3908((byte) 5);
        for (int var1 = 0; var1 < this.field9098.length; var1++) {
            if (this.field9098[var1] != null && this.field9098[var1].field5897 != null) {
                this.field9103.field8599.method3907((byte) -22, this.field9098[var1]);
            }
        }
        return this.field9103;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)V", line = 81)
    private final void method4618(int arg0, boolean arg1) {
        class253.field3926.method4541((byte) 115, this);
        this.field9096 = arg0;
        this.field9099 = arg0;
        this.field9106 = true;
        this.field9105 = arg1;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lha;J)Z", line = 88)
    public final boolean method4619(class66 arg0, long arg1) {
        if (this.field9099 == this.field9096) {
            this.method4615();
        } else {
            this.method4622();
        }
        if (arg1 - this.field9096 > 750L) {
            this.method4614();
            return false;
        }
        int var4 = (int) (arg1 - this.field9099);
        if (this.field9106) {
            for (class255 var5 = (class255) this.field9092.method4538(false); var5 != null; var5 = (class255) this.field9092.method4543(0)) {
                for (int var6 = 0; var6 < var5.field3955.field3652; var6++) {
                    var5.method2162(!this.field9094, arg0, -84, 1, arg1);
                }
            }
            this.field9106 = false;
        }
        for (class255 var7 = (class255) this.field9092.method4538(false); var7 != null; var7 = (class255) this.field9092.method4543(0)) {
            var7.method2162(!this.field9094, arg0, -106, var4, arg1);
        }
        this.field9099 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(IZ)Lkq;", line = 136)
    public static final class619 method4620(int arg0, boolean arg1) {
        if (class648.field9382 == class139.field1657) {
            return new class619(arg0, arg1);
        } else {
            class619 var2 = class784.field11420[class139.field1657];
            class139.field1657 = class139.field1657 + 1 & class211.field3243[class222.field3408];
            var2.method4618(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "()Ljw;", line = 150)
    public final class580 method4621() {
        return this.field9103;
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "()V", line = 153)
    public final void method4622() {
        this.field9094 = true;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "()V", line = 161)
    public static void method4623() {
        field9093 = null;
        field9097 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lha;[Ljk;Z)V", line = 167)
    private final void method4624(class66 arg0, class659[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field9093[var4] = false;
        }
        label67: for (class255 var5 = (class255) this.field9092.method4538(false); var5 != null; var5 = (class255) this.field9092.method4543(0)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3960 || arg1[var8].field9503 == var5.field3960) {
                        field9093[var8] = true;
                        var5.method2159(0);
                        var5.field3963 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3956 == 0) {
                    var5.method4696(96);
                    this.field9102--;
                } else {
                    var5.field3963 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field9102 != 32; var6++) {
            if (!field9093[var6]) {
                class255 var7 = new class255(arg0, arg1[var6], this, this.field9096);
                this.field9092.method4541((byte) -118, var7);
                this.field9102++;
                field9093[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class619(int arg0, boolean arg1) {
        this.method4618(arg0, arg1);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([Lhja;Z)V", line = 248)
    private final void method4625(class426[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field9097[var3] = false;
        }
        label76: for (class554 var4 = (class554) this.field9101.method3863((byte) 64); var4 != null; var4 = (class554) this.field9101.method3862(-353)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field8257 || arg0[var7].field6284 == var4.field8257) {
                        field9097[var7] = true;
                        var4.method4168(-121);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1824(1);
                this.field9107--;
                if (var4.method363((byte) -81)) {
                    var4.method362((byte) 72);
                    class223.field3422--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field9107 != 8; var5++) {
            if (!field9097[var5]) {
                class554 var6 = null;
                if (arg0[var5].method3283((byte) 53).field8113 == 1 && class223.field3422 < 32) {
                    var6 = new class554(arg0[var5], this);
                    class411.field6071.method1015(-123, (long) arg0[var5].field6271, var6);
                    class223.field3422++;
                }
                if (var6 == null) {
                    var6 = new class554(arg0[var5], this);
                }
                this.field9101.method3868(84, var6);
                this.field9107++;
                field9097[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIII)V", line = 344)
    public final void method4626(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9104 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(J)V", line = 355)
    public final void method4627(long arg0) {
        this.field9096 = arg0;
    }
}
