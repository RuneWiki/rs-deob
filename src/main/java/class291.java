import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class291 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lsj;")
    private class177 field4619;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "Lae;")
    private class92 field4625;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Lvh;")
    private class136 field4630;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "J")
    public static long field4620 = 0L;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Lpd;")
    private class96 field4622;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[Lk;")
    private class221[] field4623;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Z")
    public final boolean method1955(byte arg0) {
        field4626++;
        if (arg0 >= -59) {
            this.method1958(13);
        }
        if (this.field4622 != null) {
            return true;
        }
        if (this.field4630 == null) {
            if (this.field4625.method503(3)) {
                return false;
            }
            this.field4630 = this.field4625.method501(true, (byte) 0, (byte) 41, 255, 255);
        }
        if (this.field4630.field3610) {
            return false;
        } else {
            this.field4622 = new class96(this.field4630.method917(100));
            this.field4623 = new class221[(this.field4622.field1218.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)I")
    public static final int method1956(int arg0, int arg1) {
        field4627++;
        return arg1 == 127 ? arg0 >> 11 & 0x7F : 42;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)V")
    public static final void method1957(int arg0, int arg1) {
        field4624++;
        if (!class210.method1477((byte) 88, arg1)) {
            return;
        }
        class123[] var2 = class75.field937[arg1];
        if (arg0 != 20470) {
            method1956(63, 53);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class123 var4 = var2[var3];
            if (var4 != null) {
                var4.field1780 = 1;
                var4.field1894 = 0;
                var4.field1900 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public final void method1958(int arg0) {
        field4629++;
        if (this.field4623 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4623.length; var2++) {
            if (this.field4623[var2] != null) {
                this.field4623[var2].method1564((byte) 50);
            }
        }
        for (int var3 = arg0; var3 < this.field4623.length; var3++) {
            if (this.field4623[var3] != null) {
                this.field4623[var3].method1559((byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILs;Ls;I)Lk;")
    public final class221 method1959(int arg0, class107 arg1, class107 arg2, int arg3) {
        field4631++;
        if (arg0 < 76) {
            this.field4619 = null;
        }
        return this.method1961(arg3, true, arg1, true, arg2);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(III)J")
    public static final long method1960(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        return var3 == null || var3.field4056 == null ? 0L : var3.field4056.field118;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IZLs;ZLs;)Lk;")
    private final class221 method1961(int arg0, boolean arg1, class107 arg2, boolean arg3, class107 arg4) {
        field4621++;
        if (this.field4622 == null) {
            throw new RuntimeException();
        }
        this.field4622.field1228 = arg0 * 8 + 5;
        if (this.field4622.field1228 >= this.field4622.field1218.length) {
            throw new RuntimeException();
        } else if (this.field4623[arg0] == null) {
            int var6 = this.field4622.method597(-1197332568);
            if (!arg1) {
                this.field4630 = null;
            }
            int var7 = this.field4622.method597(-1197332568);
            class221 var8 = new class221(arg0, arg4, arg2, this.field4625, this.field4619, var6, var7, arg3);
            this.field4623[arg0] = var8;
            return var8;
        } else {
            return this.field4623[arg0];
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lae;Lsj;)V")
    public class291(class92 arg0, class177 arg1) {
        this.field4619 = arg1;
        this.field4625 = arg0;
        if (!this.field4625.method503(3)) {
            this.field4630 = this.field4625.method501(true, (byte) 0, (byte) 41, 255, 255);
        }
    }
}
