import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class18 {

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lh;")
    private class571 field219 = new class571(64);

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "Lh;")
    private class571 field228 = new class571(100);

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "Lan;")
    private class21 field217;

    @OriginalMember(owner = "client!bu", name = "i", descriptor = "F")
    public static float field224 = 1024.0F;

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "Ldv;")
    public static class566 field222 = new class566(22, 7);

    @OriginalMember(owner = "client!bu", name = "k", descriptor = "[Z")
    public static boolean[] field226 = new boolean[100];

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!bu", name = "h", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bu", name = "j", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "Ljd;")
    public static class194 field227;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
    public static final void method191(int arg0) {
        class264.field3689 = null;
        class142.field2202 = null;
        field221++;
        if (arg0 <= 82) {
            field227 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IZ)V")
    public final void method192(int arg0, boolean arg1) {
        class571 var3 = this.field219;
        synchronized (this.field219) {
            this.field219.method3253(arg0, -126);
        }
        field218++;
        class571 var4 = this.field228;
        synchronized (this.field228) {
            this.field228.method3253(arg0, -119);
            if (!arg1) {
                this.field228 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(B)V")
    public static void method193(byte arg0) {
        field226 = null;
        field227 = null;
        if (arg0 != -17) {
            method191(-35);
        }
        field222 = null;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(IZ)Lnv;")
    public final class353 method194(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field225++;
        class571 var3 = this.field228;
        class353 var4;
        synchronized (this.field228) {
            var4 = (class353) this.field228.method3252((long) arg0, (byte) -66);
            if (var4 == null) {
                var4 = new class353(arg0);
                this.field228.method3243(var4, (long) arg0, 110);
            }
        }
        synchronized (var4) {
            return var4.method2119(127) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)Ldba;")
    public final class78 method195(int arg0, byte arg1) {
        field223++;
        class571 var3 = this.field219;
        class78 var4;
        synchronized (this.field219) {
            var4 = (class78) this.field219.method3252((long) arg0, (byte) 64);
        }
        if (arg1 != 13) {
            this.method194(-51, false);
        }
        if (var4 != null) {
            return var4;
        }
        class21 var5 = this.field217;
        byte[] var6;
        synchronized (this.field217) {
            var6 = this.field217.method240(class435.method2583((byte) -50, arg0), class239.method1491(arg0, arg1 ^ 0x7A), (byte) -124);
        }
        class78 var7 = new class78();
        var7.field1286 = this;
        var7.field1281 = arg0;
        if (var6 != null) {
            var7.method601(new class11(var6), arg1 - 13);
        }
        var7.method606((byte) -108);
        class571 var8 = this.field219;
        synchronized (this.field219) {
            this.field219.method3243(var7, (long) arg0, -112);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V")
    public final void method196(byte arg0) {
        class571 var2 = this.field219;
        synchronized (this.field219) {
            this.field219.method3248(0);
        }
        if (arg0 != 29) {
            return;
        }
        field216++;
        class571 var3 = this.field228;
        synchronized (this.field228) {
            this.field228.method3248(0);
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V")
    public final void method197(int arg0) {
        class571 var2 = this.field219;
        synchronized (this.field219) {
            if (arg0 > -109) {
                this.field217 = null;
            }
            this.field219.method3246(false);
        }
        field220++;
        class571 var3 = this.field228;
        synchronized (this.field228) {
            this.field228.method3246(false);
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lhu;ILan;Lan;Lan;)V")
    public class18(class111 arg0, int arg1, class21 arg2, class21 arg3, class21 arg4) {
        this.field217 = arg2;
        if (this.field217 != null) {
            int var6 = this.field217.method239(-33) - 1;
            this.field217.method231(var6, -118);
        }
        class341.method2072(arg3, arg4, (byte) -82);
    }
}
