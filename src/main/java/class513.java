import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class513 extends class618 {

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "Z")
    public boolean field6534 = false;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
    public int field6535 = 0;

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "Z")
    private boolean field6540 = false;

    @OriginalMember(owner = "client!nia", name = "o", descriptor = "Lhv;")
    private class151 field6542 = new class151();

    @OriginalMember(owner = "client!nia", name = "p", descriptor = "I")
    private int field6543 = 0;

    @OriginalMember(owner = "client!nia", name = "q", descriptor = "Lfca;")
    public class661 field6544 = new class661();

    @OriginalMember(owner = "client!nia", name = "u", descriptor = "Z")
    public boolean field6548 = false;

    @OriginalMember(owner = "client!nia", name = "t", descriptor = "Z")
    private boolean field6547 = false;

    @OriginalMember(owner = "client!nia", name = "r", descriptor = "I")
    private int field6545 = 0;

    @OriginalMember(owner = "client!nia", name = "v", descriptor = "Lwq;")
    public class705 field6549 = new class705();

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "[Ljia;")
    public class355[] field6536 = new class355[8192];

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "[Z")
    private static boolean[] field6539 = new boolean[32];

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "[Z")
    private static boolean[] field6538 = new boolean[8];

    @OriginalMember(owner = "client!nia", name = "s", descriptor = "I")
    public int field6546;

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "J")
    private long field6537;

    @OriginalMember(owner = "client!nia", name = "n", descriptor = "J")
    private long field6541;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "()V")
    public final void method2832() {
        this.field6547 = true;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIII)V")
    public final void method2833(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6546 = arg0;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method2834(class570 arg0, long arg1) {
        if (this.field6541 == this.field6537) {
            this.method2839();
        } else {
            this.method2846();
        }
        if (arg1 - this.field6537 > 750L) {
            this.method2841();
            return false;
        }
        int var4 = (int) (arg1 - this.field6541);
        if (this.field6547) {
            for (class470 var5 = (class470) this.field6542.method857(-92); var5 != null; var5 = (class470) this.field6542.method864(true)) {
                for (int var6 = 0; var6 < var5.field6115.field8503; var6++) {
                    var5.method2657(!this.field6540, 1, 21375, arg1, arg0);
                }
            }
            this.field6547 = false;
        }
        for (class470 var7 = (class470) this.field6542.method857(-119); var7 != null; var7 = (class470) this.field6542.method864(true)) {
            var7.method2657(!this.field6540, var4, 21375, arg1, arg0);
        }
        this.field6541 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "()V")
    public static void method2835() {
        field6539 = null;
        field6538 = null;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(J)V")
    public final void method2836(long arg0) {
        this.field6537 = arg0;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "([Lld;Z)V")
    private final void method2837(class49[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field6538[var3] = false;
        }
        label76: for (class61 var4 = (class61) this.field6544.method3591(0); var4 != null; var4 = (class61) this.field6544.method3600((byte) 65)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field799 || arg0[var7].field641 == var4.field799) {
                        field6538[var7] = true;
                        var4.method358((byte) 93);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method1946(-10364);
                this.field6545--;
                if (var4.method1086((byte) -120)) {
                    var4.method1084((byte) -121);
                    class353.field4307--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field6545 != 8; var5++) {
            if (!field6538[var5]) {
                class61 var6 = null;
                if (arg0[var5].method316(false).field2956 == 1 && class353.field4307 < 32) {
                    var6 = new class61(arg0[var5], this);
                    class572.field7243.method4008((long) arg0[var5].field647, var6, -54);
                    class353.field4307++;
                }
                if (var6 == null) {
                    var6 = new class61(arg0[var5], this);
                }
                this.field6544.method3593(var6, 15);
                this.field6545++;
                field6538[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "()Lwq;")
    public final class705 method2838() {
        this.field6549.field9317.method1141(-99);
        for (int var1 = 0; var1 < this.field6536.length; var1++) {
            if (this.field6536[var1] != null && this.field6536[var1].field4327 != null) {
                this.field6549.field9317.method1147(this.field6536[var1], (byte) -111);
            }
        }
        return this.field6549;
    }

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "()V")
    private final void method2839() {
        this.field6540 = false;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lha;J[Lsba;[Lld;Z)V")
    public final void method2840(class570 arg0, long arg1, class581[] arg2, class49[] arg3, boolean arg4) {
        if (!this.field6534) {
            this.method2847(arg0, arg2, arg4);
            this.method2837(arg3, arg4);
            this.field6537 = arg1;
        }
    }

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "()V")
    public final void method2841() {
        this.field6534 = true;
        for (class61 var1 = (class61) this.field6544.method3591(0); var1 != null; var1 = (class61) this.field6544.method3600((byte) 101)) {
            if (var1.field800.field2956 == 1) {
                var1.method1084((byte) 59);
            }
        }
        for (int var2 = 0; var2 < this.field6536.length; var2++) {
            if (this.field6536[var2] != null) {
                this.field6536[var2].method2043();
                this.field6536[var2] = null;
            }
        }
        this.field6535 = 0;
        this.field6542 = new class151();
        this.field6543 = 0;
        this.field6544 = new class661();
        this.field6545 = 0;
        this.method3306(false);
        class358.field4375[class43.field490] = this;
        class43.field490 = class43.field490 + 1 & class251.field3424[class298.field3765];
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IZ)V")
    private final void method2842(int arg0, boolean arg1) {
        class196.field2717.method855(0, this);
        this.field6537 = arg0;
        this.field6541 = arg0;
        this.field6547 = true;
        this.field6548 = arg1;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(IZ)Lnia;")
    public static final class513 method2843(int arg0, boolean arg1) {
        if (class43.field490 == class246.field3375) {
            return new class513(arg0, arg1);
        } else {
            class513 var2 = class358.field4375[class246.field3375];
            class246.field3375 = class246.field3375 + 1 & class251.field3424[class298.field3765];
            var2.method2842(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "()Lwq;")
    public final class705 method2844() {
        return this.field6549;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lha;)V")
    public final void method2845(class570 arg0) {
        this.field6549.field9317.method1141(-112);
        for (class470 var2 = (class470) this.field6542.method857(-75); var2 != null; var2 = (class470) this.field6542.method864(true)) {
            var2.method2659(-22305, arg0, this.field6541);
        }
    }

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "()V")
    public final void method2846() {
        this.field6540 = true;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lha;[Lsba;Z)V")
    private final void method2847(class570 arg0, class581[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field6539[var4] = false;
        }
        label67: for (class470 var5 = (class470) this.field6542.method857(-71); var5 != null; var5 = (class470) this.field6542.method864(true)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field6118 || arg1[var8].field7348 == var5.field6118) {
                        field6539[var8] = true;
                        var5.method2655((byte) 47);
                        var5.field6126 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field6124 == 0) {
                    var5.method3306(false);
                    this.field6543--;
                } else {
                    var5.field6126 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field6543 != 32; var6++) {
            if (!field6539[var6]) {
                class470 var7 = new class470(arg0, arg1[var6], this, this.field6537);
                this.field6542.method855(0, var7);
                this.field6543++;
                field6539[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(IZ)V")
    private class513(int arg0, boolean arg1) {
        this.method2842(arg0, arg1);
    }
}
