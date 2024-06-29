import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class266 {

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    private int field4499 = 0;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    private int field4501 = -1;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lvc;")
    private class129 field4508 = new class129();

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Z")
    public boolean field4516 = false;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    private int field4502;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "[Loa;")
    private class302[] field4514;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "[[I")
    private int[][] field4503;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lce;")
    public static class126 field4506 = class206.method1445(-7923, "blinken3:");

    @OriginalMember(owner = "client!a", name = "d", descriptor = "[I")
    public static int[] field4498 = new int[32];

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Lce;")
    public static class126 field4515;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Lcc;")
    public static class313 field4510;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZI)V", line = 9)
    public static final void method1793(int arg0, boolean arg1, int arg2) {
        field4513++;
        if (class13.method75(arg2, (byte) -87) && !arg1) {
            class267.method1803(0, class291.field4825[arg2], arg0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZII)V", line = 24)
    public static final void method1794(boolean arg0, int arg1, int arg2) {
        field4509++;
        class245 var3 = class139.method1022(13, (byte) -89, arg2);
        if (arg0) {
            method1793(-110, true, 11);
        }
        var3.method1683(0);
        var3.field4154 = arg1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 37)
    public static void method1795(int arg0) {
        field4515 = null;
        field4506 = null;
        if (arg0 != -1) {
            field4510 = (class313) null;
        }
        field4498 = null;
        field4510 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)[[I", line = 50)
    public final int[][] method1796(byte arg0) {
        field4495++;
        if (this.field4502 != this.field4500) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 <= 45) {
            return (int[][]) ((int[][]) null);
        } else {
            for (int var2 = 0; var2 < this.field4502; var2++) {
                this.field4514[var2] = class267.field4519;
            }
            return this.field4503;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([S[Lce;Z)V", line = 72)
    public static final void method1797(short[] arg0, class126[] arg1, boolean arg2) {
        field4511++;
        class227.method1547(arg1, arg1.length - 1, 0, arg0, arg2);
        if (!arg2) {
            field4498 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 92)
    public final void method1798(boolean arg0) {
        field4505++;
        for (int var2 = 0; var2 < this.field4502; var2++) {
            this.field4503[var2] = null;
        }
        this.field4514 = null;
        this.field4503 = (int[][]) null;
        if (!arg0) {
            this.field4508.method905((byte) 62);
            this.field4508 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)[I", line = 129)
    public final int[] method1799(byte arg0, int arg1) {
        if (arg0 != 107) {
            method1802(-45);
        }
        field4496++;
        if (this.field4502 == this.field4500) {
            this.field4516 = this.field4514[arg1] == null;
            this.field4514[arg1] = class267.field4519;
            return this.field4503[arg1];
        } else if (this.field4502 == 1) {
            this.field4516 = this.field4501 != arg1;
            this.field4501 = arg1;
            return this.field4503[0];
        } else {
            class302 var3 = this.field4514[arg1];
            if (var3 == null) {
                this.field4516 = true;
                if (this.field4499 < this.field4502) {
                    var3 = new class302(arg1, this.field4499);
                    this.field4499++;
                } else {
                    class302 var4 = (class302) this.field4508.method904(-74);
                    var3 = new class302(arg1, var4.field5028);
                    this.field4514[var4.field5034] = null;
                    var4.method499((byte) 64);
                }
                this.field4514[arg1] = var3;
            } else {
                this.field4516 = false;
            }
            this.field4508.method897(0, var3);
            return this.field4503[var3.field5028];
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Lca;", line = 198)
    public static final class124 method1800(int arg0) {
        field4507++;
        if (arg0 < 28) {
            return (class124) null;
        }
        try {
            return (class124) Class.forName("ph").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIIZ)V", line = 216)
    public static final void method1801(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (!arg9) {
            method1801(64, -113, -27, -30, -103, -47, -119, 101, -102, true);
        }
        if (class321.field5489 <= arg2 && arg2 <= class52.field795 && class321.field5489 <= arg7 && class52.field795 >= arg7 && arg4 >= class321.field5489 && class52.field795 >= arg4 && arg5 >= class321.field5489 && class52.field795 >= arg5 && class197.field3372 <= arg1 && arg1 <= class194.field3302 && arg0 >= class197.field3372 && class194.field3302 >= arg0 && class197.field3372 <= arg3 && arg3 <= class194.field3302 && class197.field3372 <= arg8 && arg8 <= class194.field3302) {
            class37.method202(arg3, arg4, arg0, arg7, arg1, arg5, arg8, 29470, arg6, arg2);
        } else {
            class259.method1755(arg6, arg2, arg1, arg0, arg8, arg7, arg5, arg3, arg4, (byte) 126);
        }
        field4497++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4498[var1] = var0 - 1;
            var0 += var0;
        }
        field4515 = class206.method1445(-7923, " ");
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(III)V", line = 289)
    public class266(int arg0, int arg1, int arg2) {
        this.field4502 = arg0;
        this.field4500 = arg1;
        this.field4514 = new class302[this.field4500];
        this.field4503 = new int[this.field4502][arg2];
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V", line = 250)
    public static final void method1802(int arg0) {
        if (arg0 != -1) {
            method1802(76);
        }
        field4504++;
        class76.field1223.method1178(-89);
        class81.field1305.method1178(-70);
    }
}
