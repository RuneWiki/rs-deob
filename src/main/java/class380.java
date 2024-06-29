import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class380 {

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    private int field5326;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public int field5324;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static final void method2288(int arg0) {
        field5322++;
        class622.field8781++;
        class302 var1 = class582.method3419(class427.field5929, (byte) 127, class626.field8901);
        var1.field4341.method2524(false, 0);
        if (arg0 < 47) {
            field5329 = -19;
        }
        class501.method2928(0, var1);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method2289(int arg0, int arg1, int arg2, Class arg3) {
        class172 var4 = class514.field7096[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class11 var5 = var4.field2594; var5 != null; var5 = var5.field145) {
            class208 var6 = var5.field143;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3027 == arg1 && var6.field3035 == arg2) {
                class600.method3496(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)J")
    public static final long method2290(int arg0) {
        if (arg0 == -10179) {
            field5325++;
            return class56.field876.method1285((byte) -9);
        } else {
            return 111L;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)I")
    public final int method2291(byte arg0) {
        if (arg0 >= -82) {
            this.field5324 = 110;
        }
        field5330++;
        return this.field5326;
    }

    @OriginalMember(owner = "client!in", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5327++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method2292(int arg0, String arg1, byte arg2) {
        if (arg2 >= -16) {
            field5329 = 127;
        }
        field5328++;
        class371 var3 = class490.method2867((byte) -41, 3, (long) arg0);
        var3.method2212(-126);
        var3.field5227 = arg1;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(II)V")
    public class380(int arg0, int arg1) {
        this.field5326 = arg0;
        this.field5324 = arg1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method2293(boolean arg0, String arg1) {
        field5323++;
        String var2 = class472.method2759(class342.method2102(-106, arg1), true);
        if (arg0) {
            field5329 = -78;
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }
}
