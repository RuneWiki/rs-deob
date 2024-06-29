import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Z")
    public boolean field121 = false;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lvg;")
    private class49 field114 = new class49(64);

    @OriginalMember(owner = "client!il", name = "r", descriptor = "Lvg;")
    public class49 field126 = new class49(500);

    @OriginalMember(owner = "client!il", name = "s", descriptor = "Lvg;")
    public class49 field127 = new class49(30);

    @OriginalMember(owner = "client!il", name = "t", descriptor = "Lvg;")
    public class49 field128 = new class49(50);

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Z")
    public boolean field119;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Lri;")
    public class97 field109;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Lri;")
    private class97 field124;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field112;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Lvi;")
    public static class500 field113;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lf;")
    public static class702 field116;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V", line = 4)
    public final void method92(int arg0, int arg1) {
        field123++;
        class49 var3 = this.field114;
        synchronized (this.field114) {
            this.field114.method573((byte) 117, arg1);
        }
        class49 var4 = this.field126;
        synchronized (this.field126) {
            this.field126.method573((byte) 121, arg1);
        }
        if (arg0 != -26139) {
            this.method98(116, -16);
        }
        class49 var5 = this.field127;
        synchronized (this.field127) {
            this.field127.method573((byte) 120, arg1);
        }
        class49 var6 = this.field128;
        synchronized (this.field128) {
            this.field128.method573((byte) 122, arg1);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)Lcca;", line = 26)
    public static final class226 method93(boolean arg0) {
        field120++;
        if (arg0) {
            method93(true);
        }
        class508.field7437 = 0;
        return class598.method3494((byte) 81);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)Llr;", line = 41)
    public final class698 method94(int arg0, byte arg1) {
        field118++;
        class49 var3 = this.field114;
        class698 var4;
        synchronized (this.field114) {
            var4 = (class698) this.field114.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field124;
        byte[] var6;
        synchronized (this.field124) {
            var6 = this.field124.method926(class636.method3699(6976, arg0), arg1 - 84, class158.method1301(arg1 ^ 0xFFFFFF8C, arg0));
        }
        class698 var7 = new class698();
        var7.field9825 = arg0;
        var7.field9760 = this;
        if (var6 != null) {
            var7.method3943((byte) -54, new class6(var6));
        }
        var7.method3939((byte) -90);
        if (!this.field119 && var7.field9770) {
            var7.field9811 = null;
            var7.field9782 = null;
        }
        if (arg1 != -42) {
            return null;
        }
        if (var7.field9767) {
            var7.field9834 = false;
            var7.field9842 = 0;
        }
        class49 var8 = this.field114;
        synchronized (this.field114) {
            this.field114.method559(var7, (long) arg0, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZB)V", line = 88)
    public final void method95(boolean arg0, byte arg1) {
        if (arg1 != 113) {
            this.method100(-22);
        }
        field122++;
        if (this.field121 != arg0) {
            this.field121 = arg0;
            this.method101(arg1 ^ 0xFFFF8B9C);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)V", line = 110)
    public final void method96(int arg0, boolean arg1) {
        field117++;
        if (this.field119 == arg1) {
            return;
        }
        this.field119 = arg1;
        if (arg0 != 30) {
            field113 = null;
        }
        this.method101(arg0 - 29745);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(IB)V", line = 126)
    public final void method97(int arg0, byte arg1) {
        if (arg1 != 107) {
            this.method98(105, -74);
        }
        this.field114 = new class49(arg0);
        field115++;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lei;IZLri;Lri;)V", line = 240)
    public class7(class162 arg0, int arg1, boolean arg2, class97 arg3, class97 arg4) {
        this.field119 = arg2;
        this.field109 = arg4;
        this.field124 = arg3;
        if (this.field124 != null) {
            int var6 = this.field124.method917(true) - 1;
            this.field124.method949(var6, 0);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V", line = 148)
    public final void method98(int arg0, int arg1) {
        this.field129 = arg1;
        field111++;
        class49 var3 = this.field126;
        synchronized (this.field126) {
            this.field126.method569(arg0 ^ arg0);
        }
        class49 var4 = this.field127;
        synchronized (this.field127) {
            this.field127.method569(0);
        }
        class49 var5 = this.field128;
        synchronized (this.field128) {
            this.field128.method569(arg0 + 2587);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 169)
    public static void method99(int arg0) {
        if (arg0 < 47) {
            field112 = 97;
        }
        field116 = null;
        field113 = null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 180)
    public final void method100(int arg0) {
        field125++;
        class49 var2 = this.field114;
        synchronized (this.field114) {
            if (arg0 >= -121) {
                return;
            }
            this.field114.method563(0);
        }
        class49 var3 = this.field126;
        synchronized (this.field126) {
            this.field126.method563(0);
        }
        class49 var4 = this.field127;
        synchronized (this.field127) {
            this.field127.method563(0);
        }
        class49 var5 = this.field128;
        synchronized (this.field128) {
            this.field128.method563(0);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V", line = 202)
    public final void method101(int arg0) {
        class49 var2 = this.field114;
        synchronized (this.field114) {
            this.field114.method569(0);
        }
        if (arg0 != -29715) {
            this.field109 = null;
        }
        field110++;
        class49 var3 = this.field126;
        synchronized (this.field126) {
            this.field126.method569(0);
        }
        class49 var4 = this.field127;
        synchronized (this.field127) {
            this.field127.method569(0);
        }
        class49 var5 = this.field128;
        synchronized (this.field128) {
            this.field128.method569(0);
        }
    }
}
