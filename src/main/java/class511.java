import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class511 {

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "Llh;")
    private class364 field7546 = new class364(256);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lhh;")
    private class84 field7537;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field7539 = -1;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
    public static boolean field7548 = true;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field7538;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field7549;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lhh;")
    public static class84 field7543;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public final void method3029(int arg0) {
        field7550++;
        if (arg0 != -29996) {
            method3035(true);
        }
        class364 var2 = this.field7546;
        synchronized (this.field7546) {
            this.field7546.method2349(0);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lsn;")
    public final class442 method3030(int arg0, int arg1) {
        field7540++;
        if (arg0 != -12345) {
            return null;
        }
        class364 var3 = this.field7546;
        class442 var4;
        synchronized (this.field7546) {
            var4 = (class442) this.field7546.method2339(-105, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7537.method683(26, arg1, 5);
        class442 var6 = new class442();
        if (var5 != null) {
            var6.method2683((byte) 79, new class303(var5));
        }
        class364 var7 = this.field7546;
        synchronized (this.field7546) {
            this.field7546.method2342((long) arg1, var6, -99);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static final void method3031(int arg0) {
        field7541++;
        if (arg0 != 0) {
            field7539 = 91;
        }
        if (class394.field5821 == null) {
            return;
        }
        class263.field3780.method1641(3);
        class231.method1508();
        class74.method620(~arg0);
        class442.method2684(-1);
        class480.method2869(7);
        class322.method2092((byte) 109);
        if (class118.field1861 != null) {
            class118.field1861.method1513(-123);
        }
        class177.method1262(arg0);
        class24.method204((byte) -102);
        class54.method393(false);
        class438.method2660(106, false);
        class314.method1987(false);
        for (int var1 = 0; var1 < 2048; var1++) {
            class62 var5 = class390.field5783[var1];
            if (var5 != null) {
                var5.field415 = null;
                for (int var6 = 0; var6 < var5.field406.length; var6++) {
                    var5.field406[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class132.field2030.length; var2++) {
            class13 var3 = class132.field2030[var2];
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field406.length; var4++) {
                    var3.field406[var4] = null;
                }
            }
        }
        class394.field5821.method1174(-1);
        class394.field5821 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public final void method3032(boolean arg0) {
        class364 var2 = this.field7546;
        synchronized (this.field7546) {
            this.field7546.method2350((byte) 112);
        }
        field7538++;
        if (arg0) {
            method3031(42);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
    public final void method3033(byte arg0, int arg1) {
        class364 var3 = this.field7546;
        synchronized (this.field7546) {
            this.field7546.method2348(arg1, -128);
            if (arg0 != 6) {
                this.field7546 = null;
            }
        }
        field7544++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Z")
    public static final boolean method3034(int arg0, int arg1, int arg2) {
        field7549++;
        if (arg0 != 32768) {
            method3036(37);
        }
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
    public static void method3035(boolean arg0) {
        field7543 = null;
        if (arg0) {
            method3035(true);
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)[Lck;")
    public static final class451[] method3036(int arg0) {
        field7545++;
        if (arg0 <= 95) {
            method3034(-84, -75, -83);
        }
        return new class451[] { class224.field3248, class224.field3249, class224.field3250, class224.field3251, class224.field3252, class224.field3253, class224.field3254, class224.field3255, class224.field3256, class224.field3257 };
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lmt;ILhh;)V")
    public class511(class271 arg0, int arg1, class84 arg2) {
        this.field7537 = arg2;
        this.field7537.method656((byte) 122, 26);
    }
}
