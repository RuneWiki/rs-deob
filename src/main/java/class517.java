import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class517 {

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lgd;")
    private class196 field7582;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "Lep;")
    private class310 field7584;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Lop;")
    private class296 field7589;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Lkc;")
    public static class157 field7591 = new class157("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field7583;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lsv;")
    private class319 field7588;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Ldk;")
    public static class421 field7593;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "[Lkd;")
    private class410[] field7592;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 7)
    public static void method3077(int arg0) {
        field7593 = null;
        if (arg0 != 0) {
            method3078(-98);
        }
        field7591 = null;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 20)
    public static final void method3078(int arg0) {
        field7585++;
        if (arg0 != 255) {
            method3077(81);
        }
        try {
            if (class87.field1418 == 1) {
                int var1 = class443.field6380.method1039((byte) 125);
                if (var1 > 0 && class443.field6380.method1040(86)) {
                    int var2 = var1 - class100.field1594;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class443.field6380.method1014(arg0 - 384, var2);
                } else {
                    class443.field6380.method1012((byte) 93);
                    class443.field6380.method1045(arg0 ^ 0x10FF);
                    class54.field777 = null;
                    if (class135.field2056 == null) {
                        class87.field1418 = 0;
                    } else {
                        class87.field1418 = 2;
                    }
                    class387.field5572 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class443.field6380.method1012((byte) 126);
            class135.field2056 = null;
            class54.field777 = null;
            class87.field1418 = 0;
            class387.field5572 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILro;ZLro;)Lkd;", line = 66)
    private final class410 method3079(int arg0, int arg1, class126 arg2, boolean arg3, class126 arg4) {
        field7594++;
        if (this.field7588 == null) {
            throw new RuntimeException();
        }
        this.field7588.field4360 = arg0 * arg1 + 5;
        if (this.field7588.field4360 >= this.field7588.field4336.length) {
            throw new RuntimeException();
        } else if (this.field7592[arg1] == null) {
            int var6 = this.field7588.method1863(arg0 - 9);
            int var7 = this.field7588.method1863(-1);
            class410 var8 = new class410(arg1, arg2, arg4, this.field7582, this.field7584, var6, var7, arg3);
            this.field7592[arg1] = var8;
            return var8;
        } else {
            return this.field7592[arg1];
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Z", line = 104)
    public final boolean method3080(byte arg0) {
        field7587++;
        if (this.field7588 != null) {
            return true;
        }
        if (this.field7589 == null) {
            if (this.field7582.method1292(true)) {
                return false;
            }
            this.field7589 = this.field7582.method1291((byte) 0, 255, 255, true, 84);
        }
        if (this.field7589.field4123) {
            return false;
        } else {
            int var2 = 109 % ((-arg0 - 22) / 53);
            this.field7588 = new class319(this.field7589.method1716(255));
            this.field7592 = new class410[(this.field7588.field4336.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 137)
    public final void method3081(int arg0) {
        field7590++;
        if (this.field7592 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field7592.length; var2++) {
            if (this.field7592[var2] != null) {
                this.field7592[var2].method2411((byte) 119);
            }
        }
        for (int var3 = 0; var3 < this.field7592.length; var3++) {
            if (this.field7592[var3] != null) {
                this.field7592[var3].method2407(90);
            }
        }
        if (arg0 != 2254) {
            this.method3081(75);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)Z", line = 175)
    public static final boolean method3082(int arg0, byte arg1) {
        field7583++;
        int var2 = 28 / ((arg1 - 41) / 60);
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZLro;ILro;)Lkd;", line = 185)
    public final class410 method3083(boolean arg0, class126 arg1, int arg2, class126 arg3) {
        if (arg0) {
            return null;
        } else {
            field7586++;
            return this.method3079(8, arg2, arg1, true, arg3);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lgd;Lep;)V", line = 201)
    public class517(class196 arg0, class310 arg1) {
        this.field7582 = arg0;
        this.field7584 = arg1;
        if (!this.field7582.method1292(true)) {
            this.field7589 = this.field7582.method1291((byte) 0, 255, 255, true, -117);
        }
    }
}
