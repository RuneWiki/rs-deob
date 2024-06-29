import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class49 extends class5 {

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public int field706 = -1;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public int field704 = 12800;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public int field709 = 0;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public int field713 = 0;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public int field715 = 12800;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Z")
    public boolean field707 = true;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Lhj;")
    public class69 field719;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public int field711;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "Lhj;")
    public class69 field712;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "Lka;")
    public class243 field716;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Z")
    public static boolean field705 = false;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Lta;")
    public static class241 field718 = new class241(64);

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "Lhj;")
    public static class69 field720 = class181.method1318("", (byte) -113);

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Lnb;")
    public static class199 field721 = new class199(16);

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "[Z")
    public static boolean[] field723 = new boolean[100];

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "Lhj;")
    public static class69 field725 = class181.method1318("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) -117);

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "Lhj;")
    public static class69 field722 = class181.method1318("Ausw-=hlen", (byte) -125);

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lhj;")
    public static class69 field726 = class181.method1318("p12_full", (byte) -124);

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Ljf;")
    public static class62 field724;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Z")
    public final boolean method275(int arg0, int arg1, int arg2) {
        field714++;
        if (arg2 < this.field704 || this.field713 < arg2 || arg0 < this.field715 || arg0 > this.field709) {
            return false;
        }
        class208 var4 = (class208) this.field716.method1724(255);
        if (arg1 != 12800) {
            field724 = null;
        }
        while (var4 != null) {
            if (var4.method1505(arg0, arg2, (byte) 68)) {
                return true;
            }
            var4 = (class208) this.field716.method1726(97);
        }
        return false;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method276(byte arg0) {
        field722 = null;
        field723 = null;
        field720 = null;
        if (arg0 <= 37) {
            method276((byte) -22);
        }
        field726 = null;
        field725 = null;
        field724 = null;
        field718 = null;
        field721 = null;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
    public final void method277(int arg0) {
        this.field709 = 0;
        this.field704 = 12800;
        this.field713 = 0;
        this.field715 = 12800;
        field708++;
        int var2 = -59 % ((arg0 + 3) / 44);
        for (class208 var3 = (class208) this.field716.method1724(255); var3 != null; var3 = (class208) this.field716.method1726(94)) {
            if (var3.field3790 < this.field704) {
                this.field704 = var3.field3790;
            }
            if (var3.field3793 > this.field709) {
                this.field709 = var3.field3793;
            }
            if (var3.field3781 < this.field715) {
                this.field715 = var3.field3781;
            }
            if (var3.field3797 > this.field713) {
                this.field713 = var3.field3797;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lhj;Lhj;IIIZ)V")
    public class49(class69 arg0, class69 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field719 = arg1;
        this.field711 = arg3;
        this.field710 = arg2;
        this.field712 = arg0;
        this.field707 = arg5;
        this.field706 = arg4;
        this.field716 = new class243();
    }
}
