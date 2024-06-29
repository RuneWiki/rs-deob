import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class650 {

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    private int field9021 = 0;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    private int field9019 = -1;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lgca;")
    private class227 field9024 = new class227();

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Z")
    public boolean field9032 = false;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    private int field9026;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    private int field9017;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "[[I")
    private int[][] field9022;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "[Leca;")
    private class704[] field9027;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lem;")
    public static class206 field9020 = new class206(54, 2);

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Llh;")
    public static class487 field9023 = new class487(74, 11);

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Ljava/lang/String;")
    public static String field9030 = null;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Llh;")
    public static class487 field9031 = new class487(32, 8);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field9015;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field9016;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field9018;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field9028;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field9029;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field9033;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3666(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)Z", line = 5)
    public static final boolean method3660(int arg0, int arg1, int arg2, int arg3) {
        field9029++;
        boolean var4 = true;
        class526 var5 = (class526) class119.method848(arg1, arg3, arg0);
        if (var5 != null) {
            var4 &= class89.method654(-1, var5);
        }
        class526 var6 = (class526) class610.method3421(arg1, arg3, arg0, field9033 == null ? (field9033 = method3666("kj")) : field9033);
        if (var6 != null) {
            var4 &= class89.method654(-1, var6);
        }
        class526 var7 = (class526) class423.method2445(arg1, arg3, arg0);
        if (arg2 >= -23) {
            field9020 = null;
        }
        if (var7 != null) {
            var4 &= class89.method654(-1, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V", line = 34)
    public final void method3661(byte arg0) {
        field9018++;
        if (arg0 <= 74) {
            this.field9024 = null;
        }
        for (int var2 = 0; var2 < this.field9017; var2++) {
            this.field9022[var2] = null;
        }
        this.field9022 = null;
        this.field9027 = null;
        this.field9024.method1444(-27547);
        this.field9024 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V", line = 57)
    public static final void method3662(boolean arg0, int arg1) {
        class466.method2634(5);
        if (arg1 >= -120) {
            method3662(true, 103);
        }
        field9028++;
        if (!class689.method3882(class285.field3921, -12)) {
            return;
        }
        class43.field515++;
        if (class43.field515 < 50 && !arg0) {
            return;
        }
        class43.field515 = 0;
        if (!class700.field9933 && class589.field8272 != null) {
            class28.field349++;
            class352 var2 = class290.method1786(98, class199.field2836, class355.field4718);
            class602.method3388(var2, (byte) 28);
            try {
                class224.method1413((byte) 6);
            } catch (IOException var3) {
                class700.field9933 = true;
            }
        }
        class466.method2634(5);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)[[I", line = 96)
    public final int[][] method3663(int arg0) {
        field9016++;
        if (this.field9026 != this.field9017) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field9017; var2++) {
            this.field9027[var2] = class267.field3613;
        }
        return this.field9022;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)[I", line = 119)
    public final int[] method3664(int arg0, byte arg1) {
        if (arg1 != 8) {
            this.method3664(-106, (byte) 35);
        }
        field9025++;
        if (this.field9026 == this.field9017) {
            this.field9032 = this.field9027[arg0] == null;
            this.field9027[arg0] = class267.field3613;
            return this.field9022[arg0];
        } else if (this.field9017 == 1) {
            this.field9032 = this.field9019 != arg0;
            this.field9019 = arg0;
            return this.field9022[0];
        } else {
            class704 var3 = this.field9027[arg0];
            if (var3 == null) {
                this.field9032 = true;
                if (this.field9021 < this.field9017) {
                    var3 = new class704(arg0, this.field9021);
                    this.field9021++;
                } else {
                    class704 var4 = (class704) this.field9024.method1433(true);
                    var3 = new class704(arg0, var4.field9956);
                    this.field9027[var4.field9957] = null;
                    var4.method2340(arg1 ^ 0xFFFFFFC7);
                }
                this.field9027[arg0] = var3;
            } else {
                this.field9032 = false;
            }
            this.field9024.method1438(var3, -32762);
            return this.field9022[var3.field9956];
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(III)V", line = 230)
    public class650(int arg0, int arg1, int arg2) {
        this.field9026 = arg1;
        this.field9017 = arg0;
        this.field9022 = new int[this.field9017][arg2];
        this.field9027 = new class704[this.field9026];
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 192)
    public static void method3665(int arg0) {
        field9023 = null;
        if (arg0 < -116) {
            field9020 = null;
            field9030 = null;
            field9031 = null;
        }
    }
}
