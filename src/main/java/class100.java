import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class100 {

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public int field1310;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Ldj;")
    public static class143 field1306 = new class143(64);

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "Lqk;")
    public static class125 field1307 = new class125();

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "Lwf;")
    public static class333 field1311 = null;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field1312 = 0;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Ljk;")
    public static class82 field1315;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILfh;)Luj;", line = 5)
    public static final class158 method712(int arg0, int arg1, class140 arg2) {
        field1305++;
        if (class362.method2524(arg2, -5, arg1)) {
            if (arg0 != -1) {
                method712(-124, -123, (class140) null);
            }
            return class290.method1990((byte) 104);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILvc;IJIIII)Z", line = 18)
    public static final boolean method713(int arg0, int arg1, int arg2, int arg3, class260 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class283.method1925(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 25)
    public static void method714(byte arg0) {
        field1306 = null;
        int var1 = 26 / ((arg0 - 15) / 51);
        field1311 = null;
        field1315 = null;
        field1307 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V", line = 47)
    public static final void method715(byte arg0, int arg1) {
        field1313++;
        class172.field2376.method2264((byte) -63, arg1);
        class72.field963.method2264((byte) 39, arg1);
        int var2 = -100 % ((-arg0 - 61) / 51);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V", line = 69)
    public static final void method716(int arg0) {
        class307 var1 = class226.field3250;
        synchronized (class226.field3250) {
            class193.field2671++;
            class42.field521 = class290.field4192;
            class105.field1361 = class64.field799;
            class80.field1028 = class30.field355;
            class215.field3039 = class248.field3607;
            class140.field1950 = class99.field1299;
            if (arg0 != -1) {
                method716(-127);
            }
            class305.field4465 = class149.field2093;
            class224.field3234 = class66.field844;
            class248.field3607 = 0;
        }
        field1314++;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V", line = 96)
    public class100() {
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 103)
    public static final void method717(byte arg0, Component arg1) {
        arg1.removeKeyListener(class35.field427);
        field1308++;
        arg1.removeFocusListener(class35.field427);
        class291.field4234 = -1;
        if (arg0 > -104) {
            method717((byte) -118, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)V", line = 117)
    public static final void method718(boolean arg0) {
        field1309++;
        if (arg0) {
            field1306 = (class143) null;
        }
        if (class35.field427 != null) {
            class312 var1 = class35.field427;
            synchronized (class35.field427) {
                class35.field427 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lci;)V", line = 133)
    public class100(class100 arg0) {
        this.field1310 = arg0.field1310;
        this.field1303 = arg0.field1303;
        this.field1304 = arg0.field1304;
        this.field1302 = arg0.field1302;
    }
}
