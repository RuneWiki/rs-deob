import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class67 extends class68 {

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "Z")
    public boolean field860 = false;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public int field867 = 0;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Z")
    private boolean field861 = false;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Lum;")
    private class365 field866 = new class365();

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    private int field869 = 0;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "Lub;")
    public class18 field868 = new class18();

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    private int field871 = 0;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "Z")
    private boolean field873 = false;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "Lfm;")
    public class517 field872 = new class517();

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "[Lbs;")
    public class485[] field865 = new class485[8192];

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "J")
    private long field864;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "J")
    private long field863;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "[Z")
    private static boolean[] field859 = new boolean[8];

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[Z")
    private static boolean[] field862 = new boolean[8];

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public int field870;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
    public int field876;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public int field877;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()V", line = 3)
    public final void method589() {
        this.field860 = true;
        for (class93 var1 = (class93) this.field868.method153(0); var1 != null; var1 = (class93) this.field868.method161(-69)) {
            if (var1.field1133.field2252 == 1) {
                var1.method701(96);
            }
        }
        this.field865 = new class485[8192];
        this.field867 = 0;
        this.field866 = new class365();
        this.field869 = 0;
        this.field868 = new class18();
        this.field871 = 0;
        this.method603(0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lya;J[Lew;[Lfs;Z)V", line = 28)
    public final void method590(class38 arg0, long arg1, class342[] arg2, class390[] arg3, boolean arg4) {
        if (!this.field860) {
            this.method599(arg0, arg2, arg4);
            this.method598(arg3, arg4);
            this.field864 = arg1;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()V", line = 36)
    public final void method591() {
        this.field872.field7487.method1829(19386);
        for (class308 var1 = (class308) this.field866.method2097((byte) 86); var1 != null; var1 = (class308) this.field866.method2091(-1)) {
            var1.method1796(this.field863, (byte) 28);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()V", line = 48)
    public final void method592() {
        this.field861 = true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(J)V", line = 51)
    public final void method593(long arg0) {
        this.field864 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()Lfm;", line = 54)
    public final class517 method594() {
        return this.field872;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lya;J)Z", line = 58)
    public final boolean method595(class38 arg0, long arg1) {
        if (this.field864 == this.field863) {
            this.method600();
        } else {
            this.method592();
        }
        if (arg1 - this.field864 > 750L) {
            this.method589();
            return false;
        }
        int var4 = (int) (arg1 - this.field863);
        if (this.field873) {
            for (class308 var5 = (class308) this.field866.method2097((byte) 86); var5 != null; var5 = (class308) this.field866.method2091(-1)) {
                for (int var6 = 0; var6 < var5.field3925.field4346; var6++) {
                    var5.method1798(!this.field861, 1, arg1, true, arg0);
                }
            }
            this.field873 = false;
        }
        for (class308 var7 = (class308) this.field866.method2097((byte) 86); var7 != null; var7 = (class308) this.field866.method2091(-1)) {
            var7.method1798(!this.field861, var4, arg1, true, arg0);
        }
        this.field863 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "()V", line = 106)
    public final void method596() {
        this.field873 = true;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "()V", line = 111)
    public static void method597() {
        field859 = null;
        field862 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([Lfs;Z)V", line = 117)
    private final void method598(class390[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field862[var3] = false;
        }
        label73: for (class93 var4 = (class93) this.field868.method153(0); var4 != null; var4 = (class93) this.field868.method161(-69)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field1129 || arg0[var7].field5238 == var4.field1129) {
                        field862[var7] = true;
                        var4.method720(-12698);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method2165(16225);
                this.field871--;
                if (var4.method702(true)) {
                    var4.method701(66);
                    class321.field4078--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field871 != 8; var5++) {
            if (!field862[var5]) {
                class93 var6 = null;
                if (arg0[var5].method2214(true).field2252 == 1 && class321.field4078 < 32) {
                    var6 = new class93(arg0[var5], this);
                    class491.field7152.method2795((long) arg0[var5].field5239, var6, (byte) -107);
                    class321.field4078++;
                }
                if (var6 == null) {
                    var6 = new class93(arg0[var5], this);
                }
                this.field868.method163(var6, 0);
                this.field871++;
                field862[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lya;[Lew;Z)V", line = 205)
    private final void method599(class38 arg0, class342[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field859[var4] = false;
        }
        label64: for (class308 var5 = (class308) this.field866.method2097((byte) 86); var5 != null; var5 = (class308) this.field866.method2091(-1)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field3941 || arg1[var8].field4317 == var5.field3941) {
                        field859[var8] = true;
                        var5.method1797(849482625);
                        var5.field3923 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field3912 == 0) {
                    var5.method603(0);
                    this.field869--;
                } else {
                    var5.field3923 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field869 != 8; var6++) {
            if (!field859[var6]) {
                class308 var7 = new class308(arg0, arg1[var6], this, this.field864);
                this.field866.method2099(var7, 70);
                this.field869++;
                field859[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(I)V", line = 331)
    public class67(int arg0) {
        class46.field563.method2099(this, 91);
        this.field864 = arg0;
        this.field863 = arg0;
        this.field873 = true;
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "()V", line = 284)
    private final void method600() {
        this.field861 = false;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIII)V", line = 290)
    public final void method601(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field876 = arg0;
        this.field870 = arg1;
        this.field874 = arg2;
        this.field875 = arg3;
        this.field877 = arg4;
    }
}
