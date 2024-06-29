import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class93 extends class569 {

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Z")
    private boolean field1289 = false;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public int field1294 = 0;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "Z")
    public boolean field1293 = false;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Lfca;")
    private class139 field1297 = new class139();

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    private int field1299 = 0;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "Lae;")
    public class40 field1298 = new class40();

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "Z")
    private boolean field1300 = false;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "Z")
    public boolean field1301 = false;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    private int field1303 = 0;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "Lir;")
    public class27 field1302 = new class27();

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "[Lfe;")
    public class202[] field1296 = new class202[8192];

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "[Z")
    private static boolean[] field1291 = new boolean[8];

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "[Z")
    private static boolean[] field1295 = new boolean[32];

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "J")
    private long field1290;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "J")
    private long field1292;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lr;J)Z", line = 4)
    public final boolean method532(class566 arg0, long arg1) {
        if (this.field1292 == this.field1290) {
            this.method538();
        } else {
            this.method543();
        }
        if (arg1 - this.field1292 > 750L) {
            this.method539();
            return false;
        }
        int var4 = (int) (arg1 - this.field1290);
        if (this.field1300) {
            for (class575 var5 = (class575) this.field1297.method802((byte) 127); var5 != null; var5 = (class575) this.field1297.method800((byte) -106)) {
                for (int var6 = 0; var6 < var5.field8020.field5676; var6++) {
                    var5.method3170(!this.field1289, arg0, 1, arg1, -91);
                }
            }
            this.field1300 = false;
        }
        for (class575 var7 = (class575) this.field1297.method802((byte) 117); var7 != null; var7 = (class575) this.field1297.method800((byte) -106)) {
            var7.method3170(!this.field1289, arg0, var4, arg1, 50);
        }
        this.field1290 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lr;J[Lhi;[Lqg;Z)V", line = 52)
    public final void method533(class566 arg0, long arg1, class64[] arg2, class214[] arg3, boolean arg4) {
        if (!this.field1293) {
            this.method547(arg0, arg2, arg4);
            this.method546(arg3, arg4);
            this.field1292 = arg1;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(J)V", line = 60)
    public final void method534(long arg0) {
        this.field1292 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "()Lir;", line = 63)
    public final class27 method535() {
        this.field1302.field399.method848(0);
        for (int var1 = 0; var1 < this.field1296.length; var1++) {
            if (this.field1296[var1] != null && this.field1296[var1].field2553 != null) {
                this.field1302.field399.method850((byte) 126, this.field1296[var1]);
            }
        }
        return this.field1302;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "()V", line = 79)
    public final void method536() {
        this.field1300 = true;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IZ)V", line = 394)
    private class93(int arg0, boolean arg1) {
        this.method542(arg0, arg1);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lr;)V", line = 88)
    public final void method537(class566 arg0) {
        this.field1302.field399.method848(0);
        for (class575 var2 = (class575) this.field1297.method802((byte) 72); var2 != null; var2 = (class575) this.field1297.method800((byte) -106)) {
            var2.method3171(82, arg0, this.field1290);
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "()V", line = 100)
    private final void method538() {
        this.field1289 = false;
    }

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "()V", line = 104)
    public final void method539() {
        this.field1293 = true;
        for (class682 var1 = (class682) this.field1298.method237(116); var1 != null; var1 = (class682) this.field1298.method245((byte) 31)) {
            if (var1.field9586.field5290 == 1) {
                var1.method2744((byte) -114);
            }
        }
        for (int var2 = 0; var2 < this.field1296.length; var2++) {
            if (this.field1296[var2] != null) {
                this.field1296[var2].method1218();
                this.field1296[var2] = null;
            }
        }
        this.field1294 = 0;
        this.field1297 = new class139();
        this.field1299 = 0;
        this.field1298 = new class40();
        this.field1303 = 0;
        this.method3146(2);
        class474.field6012[class475.field6032] = this;
        class475.field6032 = class475.field6032 + 1 & class573.field7995[class608.field8541];
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZ)Ltq;", line = 140)
    public static final class93 method540(int arg0, boolean arg1) {
        if (class704.field9936 == class475.field6032) {
            return new class93(arg0, arg1);
        } else {
            class93 var2 = class474.field6012[class704.field9936];
            class704.field9936 = class704.field9936 + 1 & class573.field7995[class608.field8541];
            var2.method542(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "()V", line = 154)
    public static void method541() {
        field1295 = null;
        field1291 = null;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(IZ)V", line = 159)
    private final void method542(int arg0, boolean arg1) {
        class290.field3620.method801(this, 65);
        this.field1292 = arg0;
        this.field1290 = arg0;
        this.field1300 = true;
        this.field1301 = arg1;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "()V", line = 172)
    public final void method543() {
        this.field1289 = true;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIII)V", line = 175)
    public final void method544(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1304 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "()Lir;", line = 192)
    public final class27 method545() {
        return this.field1302;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "([Lqg;Z)V", line = 202)
    private final void method546(class214[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1291[var3] = false;
        }
        label76: for (class682 var4 = (class682) this.field1298.method237(120); var4 != null; var4 = (class682) this.field1298.method245((byte) 81)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field9588 || arg0[var7].field2665 == var4.field9588) {
                        field1291[var7] = true;
                        var4.method3841((byte) 127);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1871(-44);
                this.field1303--;
                if (var4.method2743(13)) {
                    var4.method2744((byte) -85);
                    class476.field6040--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field1303 != 8; var5++) {
            if (!field1291[var5]) {
                class682 var6 = null;
                if (arg0[var5].method1270(-17).field5290 == 1 && class476.field6040 < 32) {
                    var6 = new class682(arg0[var5], this);
                    class160.field2096.method1422((long) arg0[var5].field2658, 78, var6);
                    class476.field6040++;
                }
                if (var6 == null) {
                    var6 = new class682(arg0[var5], this);
                }
                this.field1298.method239(var6, (byte) 93);
                this.field1303++;
                field1291[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lr;[Lhi;Z)V", line = 292)
    private final void method547(class566 arg0, class64[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field1295[var4] = false;
        }
        label67: for (class575 var5 = (class575) this.field1297.method802((byte) 125); var5 != null; var5 = (class575) this.field1297.method800((byte) -106)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field8013 || arg1[var8].field864 == var5.field8013) {
                        field1295[var8] = true;
                        var5.method3172(-32768);
                        var5.field8023 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field8024 == 0) {
                    var5.method3146(2);
                    this.field1299--;
                } else {
                    var5.field8023 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field1299 != 32; var6++) {
            if (!field1295[var6]) {
                class575 var7 = new class575(arg0, arg1[var6], this, this.field1292);
                this.field1297.method801(var7, 54);
                this.field1299++;
                field1295[var6] = true;
            }
        }
    }
}
