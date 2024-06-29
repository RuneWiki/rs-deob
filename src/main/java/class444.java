import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class444 {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Z")
    public boolean field6609 = false;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field6614 = -1;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6616 = "";

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public int field6605;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public int field6606;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field6607;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field6613;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Ldl;")
    public class87 field6608;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLfh;)V", line = 4)
    public final void method2738(byte arg0, class194 arg1) {
        int var3 = 14 % ((-arg0 - 58) / 40);
        while (true) {
            int var4 = arg1.method1337((byte) 65);
            if (var4 == 0) {
                field6610++;
                return;
            }
            this.method2744(arg1, var4, 127);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Z", line = 26)
    public final boolean method2739(boolean arg0) {
        if (arg0) {
            this.method2738((byte) -93, null);
        }
        field6613++;
        return this.field6608.field1417.method739((byte) -60, this.field6605);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lza;IIZ)Lo;", line = 37)
    public final class363 method2740(class299 arg0, int arg1, int arg2, boolean arg3) {
        field6615++;
        long var5 = (long) (this.field6605 | arg1 << 16 | (arg3 ? 262144 : 0) | arg0.field4590 << 19);
        class363 var7 = (class363) this.field6608.field1425.method1634(var5, 64);
        if (var7 != null) {
            return var7;
        } else if (this.field6608.field1417.method739((byte) -118, this.field6605)) {
            class309 var8 = class309.method2038(this.field6608.field1417, this.field6605, 0);
            if (var8 != null) {
                var8.field4710 = var8.field4716 = var8.field4714 = var8.field4712 = 0;
                if (arg3) {
                    var8.method2044();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method2037();
                }
            }
            if (arg2 >= -118) {
                method2742(null, -101, 35);
            }
            class363 var10 = arg0.method574(var8, true);
            if (var10 != null) {
                this.field6608.field1425.method1623(var5, 17621, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z", line = 82)
    public static final boolean method2741(int arg0) {
        if (arg0 == 2730) {
            field6612++;
            return class386.field5678 == 0 ? class192.field2954.method2365(2) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 97)
    public static final int method2742(String arg0, int arg1, int arg2) {
        if (arg2 != 4) {
            method2742(null, -15, -69);
        }
        field6607++;
        return class168.method1200(false, arg0, true, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 110)
    public static void method2743(int arg0) {
        field6616 = null;
        if (arg0 != -6828) {
            method2743(-82);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lfh;II)V", line = 125)
    private final void method2744(class194 arg0, int arg1, int arg2) {
        field6611++;
        if (arg1 == 1) {
            this.field6605 = arg0.method1396(11);
        } else if (arg1 == 2) {
            this.field6606 = arg0.method1339(-32768);
        } else if (arg1 == 3) {
            this.field6609 = true;
        } else if (arg1 == 4) {
            this.field6605 = -1;
        }
        int var4 = 22 / ((arg2 - 23) / 53);
    }
}
