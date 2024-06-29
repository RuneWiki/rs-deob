import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class229 extends class15 {

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public int field3862 = 12800;

    @OriginalMember(owner = "client!md", name = "X", descriptor = "I")
    public int field3866 = 0;

    @OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
    public int field3871 = 12800;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "Z")
    public boolean field3860 = true;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public int field3853 = 0;

    @OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
    public int field3874 = -1;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "I")
    public int field3864 = -1;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public int field3865;

    @OriginalMember(owner = "client!md", name = "Z", descriptor = "Lce;")
    public class126 field3868;

    @OriginalMember(owner = "client!md", name = "Y", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "Lce;")
    public class126 field3859;

    @OriginalMember(owner = "client!md", name = "eb", descriptor = "Lvc;")
    public class129 field3873;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Lce;")
    public static class126 field3856 = class206.method1445(-7923, "Ausw-=hlen");

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Z")
    public static boolean field3857 = false;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "[Lbb;")
    public static class134[] field3861 = new class134[2048];

    @OriginalMember(owner = "client!md", name = "U", descriptor = "Lce;")
    public static class126 field3863 = class206.method1445(-7923, ":");

    @OriginalMember(owner = "client!md", name = "K", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!md", name = "ab", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!md", name = "db", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!md", name = "gb", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(III)Z", line = 4)
    public final boolean method1555(int arg0, int arg1, int arg2) {
        field3854++;
        if (arg2 < this.field3871 || arg2 > this.field3853 || arg0 < this.field3862 || arg0 > this.field3866) {
            return false;
        }
        if (arg1 != 0) {
            this.field3862 = 108;
        }
        for (class244 var4 = (class244) this.field3873.method898((byte) -63); var4 != null; var4 = (class244) this.field3873.method893((byte) -72)) {
            if (var4.method1676(arg0, arg2, -95)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)Z", line = 36)
    public static final boolean method1556(byte arg0, int arg1) {
        if (arg0 != 42) {
            field3856 = (class126) null;
        }
        class23.field327 = true;
        field3870++;
        class63.field1035 = arg1 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BLce;)V", line = 68)
    public static final void method1557(byte arg0, class126 arg1) {
        field3855++;
        if (arg0 != 87) {
            return;
        }
        for (class229 var2 = (class229) class100.field1616.method898((byte) -70); var2 != null; var2 = (class229) class100.field1616.method893((byte) -101)) {
            if (var2.field3859.method872(arg1, 0)) {
                class134.field2320 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lce;Lce;IIIZI)V", line = 230)
    public class229(class126 arg0, class126 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3865 = arg3;
        this.field3868 = arg1;
        this.field3874 = arg6;
        this.field3864 = arg4;
        this.field3867 = arg2;
        if (this.field3874 == 255) {
            this.field3874 = 0;
        }
        this.field3860 = arg5;
        this.field3859 = arg0;
        this.field3873 = new class129();
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(B)V", line = 107)
    public static void method1558(byte arg0) {
        if (arg0 < 57) {
            method1561(-21, -117);
        }
        field3856 = null;
        field3863 = null;
        field3861 = null;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V", line = 120)
    public static final void method1559(int arg0, int arg1) {
        field3858++;
        if (!class13.method75(arg0, (byte) -94)) {
            return;
        }
        class112[] var2 = class291.field4825[arg0];
        int var3 = 56 % ((arg1 + 37) / 41);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class112 var5 = var2[var4];
            if (var5 != null) {
                var5.field1793 = 0;
                var5.field1764 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(B)V", line = 170)
    public final void method1560(byte arg0) {
        this.field3862 = 12800;
        field3869++;
        this.field3871 = 12800;
        if (arg0 > -79) {
            this.method1555(11, 54, -43);
        }
        this.field3866 = 0;
        this.field3853 = 0;
        for (class244 var2 = (class244) this.field3873.method898((byte) -126); var2 != null; var2 = (class244) this.field3873.method893((byte) -76)) {
            if (this.field3866 < var2.field4131) {
                this.field3866 = var2.field4131;
            }
            if (this.field3862 > var2.field4138) {
                this.field3862 = var2.field4138;
            }
            if (this.field3871 > var2.field4126) {
                this.field3871 = var2.field4126;
            }
            if (var2.field4129 > this.field3853) {
                this.field3853 = var2.field4129;
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(II)V", line = 211)
    public static final void method1561(int arg0, int arg1) {
        field3875++;
        class249.field4165 = arg0 / arg1;
    }
}
