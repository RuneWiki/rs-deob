import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class6 extends class102 {

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Z")
    public boolean field73 = false;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public int field72 = 0;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "Z")
    private boolean field78 = false;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "Lke;")
    private class162 field74 = new class162();

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    private int field79 = 0;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "Lar;")
    public class47 field80 = new class47();

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "Z")
    private boolean field81 = false;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    private int field86 = 0;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "Lop;")
    public class352 field84 = new class352();

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "[Lch;")
    public class443[] field70 = new class443[8192];

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "J")
    private long field76;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "J")
    private long field71;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "[Z")
    private static boolean[] field75 = new boolean[8];

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "[Z")
    private static boolean[] field77 = new boolean[8];

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public int field82;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public int field83;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public int field87;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "()V")
    public static void method34() {
        field75 = null;
        field77 = null;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "()Lop;")
    public final class352 method35() {
        return this.field84;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lii;J[Lho;[Lkg;Z)V")
    public final void method36(class405 arg0, long arg1, class359[] arg2, class215[] arg3, boolean arg4) {
        if (!this.field73) {
            this.method38(arg0, arg2, arg4);
            this.method39(arg3, arg4);
            this.field76 = arg1;
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "()V")
    public final void method37() {
        this.field81 = true;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lii;[Lho;Z)V")
    private final void method38(class405 arg0, class359[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 8; var4++) {
            field75[var4] = false;
        }
        label64: for (class201 var5 = (class201) this.field74.method1005(-115); var5 != null; var5 = (class201) this.field74.method1009(false)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field2681 || arg1[var8].field5188 == var5.field2681) {
                        field75[var8] = true;
                        var5.method1189(-65);
                        var5.field2682 = false;
                        continue label64;
                    }
                }
            }
            if (!arg2) {
                if (var5.field2684 == 0) {
                    var5.method686(-22);
                    this.field79--;
                } else {
                    var5.field2682 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && this.field79 != 8; var6++) {
            if (!field75[var6]) {
                class201 var7 = new class201(arg0, arg1[var6], this, this.field76);
                this.field74.method1003(2166, var7);
                this.field79++;
                field75[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([Lkg;Z)V")
    private final void method39(class215[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field77[var3] = false;
        }
        label73: for (class27 var4 = (class27) this.field80.method332(-2130841184); var4 != null; var4 = (class27) this.field80.method343((byte) -122)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field391 || arg0[var7].field2867 == var4.field391) {
                        field77[var7] = true;
                        var4.method192(-113);
                        continue label73;
                    }
                }
            }
            if (!arg1) {
                var4.method322(11);
                this.field86--;
                if (var4.method1301(0)) {
                    var4.method1302(true);
                    class134.field1868--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && this.field86 != 8; var5++) {
            if (!field77[var5]) {
                class27 var6 = null;
                if (class68.method457(arg0[var5].field2860, 0).field1260 == 1 && class134.field1868 < 32) {
                    var6 = new class27(arg0[var5], this);
                    class87.field1228.method1895(var6, (long) arg0[var5].field2860, -11387);
                    class134.field1868++;
                }
                if (var6 == null) {
                    var6 = new class27(arg0[var5], this);
                }
                this.field80.method330(var6, -2130841184);
                this.field86++;
                field77[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "()V")
    public final void method40() {
        this.field78 = true;
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "()V")
    public final void method41() {
        this.field84.field5092.method2374(125);
        for (class201 var1 = (class201) this.field74.method1005(97); var1 != null; var1 = (class201) this.field74.method1009(false)) {
            var1.method1193(1, this.field71);
        }
    }

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "()V")
    public final void method42() {
        this.field73 = true;
        for (class27 var1 = (class27) this.field80.method332(-2130841184); var1 != null; var1 = (class27) this.field80.method343((byte) -109)) {
            if (var1.field385.field1260 == 1) {
                var1.method1302(true);
            }
        }
        this.field70 = new class443[8192];
        this.field72 = 0;
        this.field74 = new class162();
        this.field79 = 0;
        this.field80 = new class47();
        this.field86 = 0;
        this.method686(121);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lii;J)Z")
    public final boolean method43(class405 arg0, long arg1) {
        if (this.field76 == this.field71) {
            this.method45();
        } else {
            this.method40();
        }
        if (arg1 - this.field76 > 750L) {
            this.method42();
            return false;
        }
        int var4 = (int) (arg1 - this.field71);
        if (this.field81) {
            for (class201 var5 = (class201) this.field74.method1005(68); var5 != null; var5 = (class201) this.field74.method1009(false)) {
                for (int var6 = 0; var6 < var5.field2685.field2451; var6++) {
                    var5.method1194(arg0, arg1, 1, !this.field78, 16383);
                }
            }
            this.field81 = false;
        }
        for (class201 var7 = (class201) this.field74.method1005(51); var7 != null; var7 = (class201) this.field74.method1009(false)) {
            var7.method1194(arg0, arg1, var4, !this.field78, 16383);
        }
        this.field71 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIII)V")
    public final void method44(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field82 = arg0;
        this.field83 = arg1;
        this.field85 = arg3;
        this.field87 = arg4;
    }

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "()V")
    private final void method45() {
        this.field78 = false;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(J)V")
    public final void method46(long arg0) {
        this.field76 = arg0;
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(I)V")
    public class6(int arg0) {
        class106.field1530.method1003(2166, this);
        this.field76 = (long) arg0;
        this.field71 = (long) arg0;
        this.field81 = true;
    }
}
