import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!PACANLMY")
public class class42 {

    @OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "I")
    private int field1229 = 12;

    @OriginalMember(owner = "client!PACANLMY", name = "b", descriptor = "I")
    private int field1230 = -582;

    @OriginalMember(owner = "client!PACANLMY", name = "c", descriptor = "LPXORWIXO;")
    public class45 field1231 = new class45();

    @OriginalMember(owner = "client!PACANLMY", name = "d", descriptor = "LPXORWIXO;")
    private class45 field1232;

    @OriginalMember(owner = "client!PACANLMY", name = "<init>", descriptor = "(I)V")
    public class42(int arg0) {
        this.field1231.field1315 = this.field1231;
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        this.field1231.field1316 = this.field1231;
    }

    @OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "(LPXORWIXO;)V")
    public void method446(class45 arg0) {
        if (arg0.field1316 != null) {
            arg0.method464();
        }
        arg0.field1316 = this.field1231.field1316;
        arg0.field1315 = this.field1231;
        arg0.field1316.field1315 = arg0;
        arg0.field1315.field1316 = arg0;
    }

    @OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "(ILPXORWIXO;)V")
    public void method447(int arg0, class45 arg1) {
        if (arg1.field1316 != null) {
            arg1.method464();
        }
        arg1.field1316 = this.field1231;
        if (arg0 == 13081) {
            arg1.field1315 = this.field1231.field1315;
            arg1.field1316.field1315 = arg1;
            arg1.field1315.field1316 = arg1;
        }
    }

    @OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "()LPXORWIXO;")
    public class45 method448() {
        class45 var1 = this.field1231.field1315;
        if (this.field1231 == var1) {
            return null;
        } else {
            var1.method464();
            return var1;
        }
    }

    @OriginalMember(owner = "client!PACANLMY", name = "b", descriptor = "()LPXORWIXO;")
    public class45 method449() {
        class45 var1 = this.field1231.field1315;
        if (this.field1231 == var1) {
            this.field1232 = null;
            return null;
        } else {
            this.field1232 = var1.field1315;
            return var1;
        }
    }

    @OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "(B)LPXORWIXO;")
    public class45 method450(byte arg0) {
        class45 var2 = this.field1231.field1316;
        if (this.field1231 == var2) {
            this.field1232 = null;
            return null;
        }
        this.field1232 = var2.field1316;
        if (arg0 != -110) {
            this.field1229 = 486;
        }
        return var2;
    }

    @OriginalMember(owner = "client!PACANLMY", name = "a", descriptor = "(I)LPXORWIXO;")
    public class45 method451(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        class45 var2 = this.field1232;
        if (this.field1231 == var2) {
            this.field1232 = null;
            return null;
        } else {
            this.field1232 = var2.field1315;
            return var2;
        }
    }

    @OriginalMember(owner = "client!PACANLMY", name = "b", descriptor = "(I)LPXORWIXO;")
    public class45 method452(int arg0) {
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        class45 var2 = this.field1232;
        if (this.field1231 == var2) {
            this.field1232 = null;
            return null;
        } else {
            this.field1232 = var2.field1316;
            return var2;
        }
    }

    @OriginalMember(owner = "client!PACANLMY", name = "c", descriptor = "()V")
    public void method453() {
        if (this.field1231.field1315 == this.field1231) {
            return;
        }
        while (true) {
            class45 var1 = this.field1231.field1315;
            if (this.field1231 == var1) {
                return;
            }
            var1.method464();
        }
    }
}
