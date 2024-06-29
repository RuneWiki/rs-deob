import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class115 extends class409 {

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Z")
    private boolean field1704 = false;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public int field1707 = 0;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Z")
    public boolean field1706 = false;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Lwp;")
    private class122 field1710 = new class122();

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    private int field1712 = 0;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lgw;")
    public class118 field1711 = new class118();

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "Z")
    private boolean field1716 = false;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    private int field1720 = 0;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Lwg;")
    public class300 field1714 = new class300();

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[Lio;")
    public class308[] field1708 = new class308[8192];

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "[Z")
    private static boolean[] field1703 = new boolean[8];

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "[Z")
    private static boolean[] field1705 = new boolean[8];

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public int field1717;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "I")
    public int field1718;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "J")
    private long field1702;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "J")
    private long field1709;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lqa;[Leh;Z)V", line = 5)
    private final void method808(class167 arg0, class248[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field1703[var4] = false;
        }
        label64: for (class402 var5 = (class402) this.field1710.method904(false); var5 != null; var5 = (class402) this.field1710.method907(-1)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5721 || arg1[var8].field3695 == var5.field5721) {
                        field1703[var8] = true;
                        var5.method2403(3);
                        var5.field5713 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5703 == 0) {
                    var5.method2429(124);
                    this.field1712--;
                } else {
                    var5.field5713 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field1712 != 8; var6++) {
            if (!field1703[var6]) {
                class402 var7 = new class402(arg0, arg1[var6], this, this.field1702);
                this.field1710.method905(var7, 0);
                this.field1712++;
                field1703[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 77)
    private final void method809(int arg0) {
        class235.field3503.method905(this, 0);
        this.field1702 = arg0;
        this.field1709 = arg0;
        this.field1716 = true;
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Luh;", line = 83)
    public static final class115 method810(int arg0) {
        if (class519.field7522 == class465.field6753) {
            return new class115(arg0);
        } else {
            class115 var1 = class193.field2810[class519.field7522];
            class519.field7522 = class519.field7522 + 1 & class457.field6638[class248.field3711];
            var1.method809(arg0);
            return var1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lqa;J)Z", line = 97)
    public final boolean method811(class167 arg0, long arg1) {
        if (this.field1709 == this.field1702) {
            this.method816();
        } else {
            this.method813();
        }
        if (arg1 - this.field1702 > 750L) {
            this.method820();
            return false;
        }
        int var4 = (int) (arg1 - this.field1709);
        if (this.field1716) {
            for (class402 var5 = (class402) this.field1710.method904(false); var5 != null; var5 = (class402) this.field1710.method907(-1)) {
                for (int var6 = 0; var6 < var5.field5720.field7774; var6++) {
                    var5.method2404(arg1, !this.field1704, 1, arg0, 126);
                }
            }
            this.field1716 = false;
        }
        for (class402 var7 = (class402) this.field1710.method904(false); var7 != null; var7 = (class402) this.field1710.method907(-1)) {
            var7.method2404(arg1, !this.field1704, var4, arg0, -32);
        }
        this.field1709 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()V", line = 145)
    public static void method812() {
        field1703 = null;
        field1705 = null;
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()V", line = 149)
    public final void method813() {
        this.field1704 = true;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIII)V", line = 152)
    public final void method814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1719 = arg0;
        this.field1717 = arg1;
        this.field1718 = arg2;
        this.field1715 = arg3;
        this.field1713 = arg4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([Ltb;Z)V", line = 162)
    private final void method815(class280[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field1705[var3] = false;
        }
        label73: for (class142 var4 = (class142) this.field1711.method863(-1); var4 != null; var4 = (class142) this.field1711.method865(-1)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field2192 || arg0[var7].field4177 == var4.field2192) {
                        field1705[var7] = true;
                        var4.method1026((byte) 77);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method421(22071);
                this.field1720--;
                if (var4.method3112(20416)) {
                    var4.method3115((byte) 103);
                    class55.field1003--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field1720 != 8; var5++) {
            if (!field1705[var5]) {
                class142 var6 = null;
                if (arg0[var5].method1801((byte) 75).field7921 == 1 && class55.field1003 < 32) {
                    var6 = new class142(arg0[var5], this);
                    class455.field6612.method2764(var6, -1, (long) arg0[var5].field4169);
                    class55.field1003++;
                }
                if (var6 == null) {
                    var6 = new class142(arg0[var5], this);
                }
                this.field1711.method866((byte) 10, var6);
                this.field1720++;
                field1705[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()V", line = 249)
    private final void method816() {
        this.field1704 = false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lqa;J[Leh;[Ltb;Z)V", line = 252)
    public final void method817(class167 arg0, long arg1, class248[] arg2, class280[] arg3, boolean arg4) {
        if (!this.field1706) {
            this.method808(arg0, arg2, arg4);
            this.method815(arg3, arg4);
            this.field1702 = arg1;
        }
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "()V", line = 264)
    public final void method818() {
        this.field1716 = true;
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "()Lwg;", line = 267)
    public final class300 method819() {
        return this.field1714;
    }

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "()V", line = 270)
    public final void method820() {
        this.field1706 = true;
        for (class142 var1 = (class142) this.field1711.method863(-1); var1 != null; var1 = (class142) this.field1711.method865(-1)) {
            if (var1.field2191.field7921 == 1) {
                var1.method3115((byte) 103);
            }
        }
        for (int var2 = 0; var2 < this.field1708.length; var2++) {
            if (this.field1708[var2] != null) {
                this.field1708[var2].method1964();
                this.field1708[var2] = null;
            }
        }
        this.field1707 = 0;
        this.field1710 = new class122();
        this.field1712 = 0;
        this.field1711 = new class118();
        this.field1720 = 0;
        this.method2429(119);
        class193.field2810[class465.field6753] = this;
        class465.field6753 = class465.field6753 + 1 & class457.field6638[class248.field3711];
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(I)V", line = 365)
    private class115(int arg0) {
        this.method809(arg0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(J)V", line = 323)
    public final void method821(long arg0) {
        this.field1702 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lqa;)V", line = 326)
    public final void method822(class167 arg0) {
        this.field1714.field4470.method24((byte) -96);
        for (class402 var2 = (class402) this.field1710.method904(false); var2 != null; var2 = (class402) this.field1710.method907(-1)) {
            var2.method2402((byte) -111, arg0, this.field1709);
        }
    }
}
