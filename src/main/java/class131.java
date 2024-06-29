import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class131 {

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lff;")
    private class9 field1809 = new class9(128);

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lff;")
    public class9 field1811 = new class9(64);

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "Lvh;")
    private class240 field1808;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Lvh;")
    public class240 field1800;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1805 = 1406;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Lff;")
    public static class9 field1810 = new class9(4);

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field1812 = new String[5];

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "F")
    public static float field1802;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "[I")
    public static int[] field1813;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)Ltr;", line = 7)
    public final class191 method850(byte arg0, int arg1) {
        field1806++;
        class9 var3 = this.field1809;
        class191 var4;
        synchronized (this.field1809) {
            var4 = (class191) this.field1809.method56((long) arg1, 50);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1808.method1411(true, arg1, 36);
        if (arg0 != 78) {
            return null;
        }
        class191 var6 = new class191();
        var6.field2661 = arg1;
        var6.field2647 = this;
        if (var5 != null) {
            var6.method1147(new class365(var5), arg0 ^ 0xFFFFFFCF);
        }
        var6.method1154(-11);
        class9 var7 = this.field1809;
        synchronized (this.field1809) {
            this.field1809.method73((long) arg1, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 46)
    public static final void method851(int arg0, int arg1) {
        class61 var2 = class385.field5410[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class61 var4 = class385.field5410[var3][arg0][arg1] = class385.field5410[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field826--;
                for (class302 var5 = var4.field819; var5 != null; var5 = var5.field4140) {
                    class33 var6 = var5.field4136;
                    if (var6.field463 == arg0 && var6.field468 == arg1) {
                        var6.field464--;
                    }
                }
            }
        }
        if (class385.field5410[0][arg0][arg1] == null) {
            class385.field5410[0][arg0][arg1] = new class61(0, arg0, arg1);
            class385.field5410[0][arg0][arg1].field836 = 1;
        }
        class385.field5410[0][arg0][arg1].field834 = var2;
        class385.field5410[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V", line = 86)
    public final void method852(int arg0, int arg1, int arg2) {
        this.field1809 = new class9(arg1);
        field1803++;
        this.field1811 = new class9(arg0);
        int var4 = 57 % ((19 - arg2) / 36);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 97)
    public final void method853(int arg0) {
        class9 var2 = this.field1809;
        synchronized (this.field1809) {
            if (arg0 != -13103) {
                this.method853(-94);
            }
            this.field1809.method65(false);
        }
        field1807++;
        class9 var3 = this.field1811;
        synchronized (this.field1811) {
            this.field1811.method65(false);
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V", line = 114)
    public final void method854(int arg0, int arg1) {
        field1799++;
        if (arg1 != -26523) {
            field1812 = null;
        }
        class9 var3 = this.field1809;
        synchronized (this.field1809) {
            this.field1809.method61((byte) -67, arg0);
        }
        class9 var4 = this.field1811;
        synchronized (this.field1811) {
            this.field1811.method61((byte) -67, arg0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 134)
    public final void method855(byte arg0) {
        class9 var2 = this.field1809;
        synchronized (this.field1809) {
            this.field1809.method67(71);
        }
        field1804++;
        class9 var3 = this.field1811;
        synchronized (this.field1811) {
            this.field1811.method67(121);
        }
        if (arg0 >= -4) {
            field1805 = -91;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 151)
    public static void method856(int arg0) {
        field1810 = null;
        field1813 = null;
        if (arg0 != 0) {
            method851(-119, 4);
        }
        field1812 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Llf;ILvh;Lvh;)V", line = 179)
    public class131(class157 arg0, int arg1, class240 arg2, class240 arg3) {
        this.field1808 = arg2;
        this.field1800 = arg3;
        this.field1808.method1397((byte) 48, 36);
    }
}
