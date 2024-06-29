import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class64 {

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "Ljava/lang/String;")
    private String field760 = "null";

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field761 = -1;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field753 = 0;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "C")
    public char field756;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "C")
    public char field759;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "Lib;")
    public class106 field763;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "Lib;")
    private class106 field765;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    private final void method568(byte arg0) {
        this.field765 = new class106(this.field763.method881(-14891));
        field768++;
        if (arg0 != -107) {
            this.field759 = (char) 65464;
        }
        for (class75 var2 = (class75) this.field763.method880((byte) -23); var2 != null; var2 = (class75) this.field763.method879((byte) -20)) {
            class428 var3 = new class428(var2.field1020, (int) var2.field3271);
            this.field765.method878(class10.method68(0, var2.field1020), -2301, var3);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(II)I")
    public final int method569(int arg0, int arg1) {
        field767++;
        if (arg1 != -6) {
            this.method572(false, -7);
        }
        if (this.field763 == null) {
            return this.field762;
        } else {
            class389 var3 = (class389) this.field763.method875((long) arg0, 125);
            return var3 == null ? this.field762 : var3.field5750;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILiv;)V")
    public final void method570(int arg0, class65 arg1) {
        while (true) {
            int var3 = arg1.method577(255);
            if (var3 == 0) {
                if (arg0 != 19207) {
                    this.method575(-22);
                }
                field758++;
                return;
            }
            this.method573(arg1, var3, 22409);
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method571(int arg0, String arg1) {
        field754++;
        if (this.field763 == null) {
            return false;
        } else if (arg0 == 2) {
            if (this.field765 == null) {
                this.method568((byte) -107);
            }
            for (class428 var3 = (class428) this.field765.method875(class10.method68(0, arg1), 127); var3 != null; var3 = (class428) this.field765.method872(-1)) {
                if (var3.field6308.equals(arg1)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZI)Z")
    public final boolean method572(boolean arg0, int arg1) {
        field755++;
        if (this.field763 == null) {
            return false;
        }
        if (this.field765 == null) {
            this.method575(25131);
        }
        class389 var3 = (class389) this.field765.method875((long) arg1, 125);
        if (!arg0) {
            field761 = -72;
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Liv;II)V")
    private final void method573(class65 arg0, int arg1, int arg2) {
        field766++;
        if (arg1 == 1) {
            this.field756 = class208.method1445(32404, arg0.method629(false));
        } else if (arg1 == 2) {
            this.field759 = class208.method1445(32404, arg0.method629(false));
        } else if (arg1 == 3) {
            this.field760 = arg0.method624((byte) -40);
        } else if (arg1 == 4) {
            this.field762 = arg0.method616((byte) 94);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method623((byte) 96);
            this.field763 = new class106(class118.method934(var4, arg2 + 269150648));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method616((byte) 125);
                class223 var7;
                if (arg1 == 5) {
                    var7 = new class75(arg0.method624((byte) -40));
                } else {
                    var7 = new class389(arg0.method616((byte) 77));
                }
                this.field763.method878((long) var6, -2301, var7);
            }
        }
        if (arg2 != 22409) {
            this.method570(70, null);
        }
    }

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method574(int arg0, int arg1) {
        field764++;
        if (this.field763 == null) {
            return this.field760;
        }
        class75 var3 = (class75) this.field763.method875((long) arg1, 127);
        if (arg0 <= 100) {
            return null;
        } else if (var3 == null) {
            return this.field760;
        } else {
            return var3.field1020;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V")
    private final void method575(int arg0) {
        this.field765 = new class106(this.field763.method881(-14891));
        field757++;
        if (arg0 == 25131) {
            for (class389 var2 = (class389) this.field763.method880((byte) -23); var2 != null; var2 = (class389) this.field763.method879((byte) -20)) {
                class389 var3 = new class389((int) var2.field3271);
                this.field765.method878((long) var2.field5750, -2301, var3);
            }
        }
    }
}
