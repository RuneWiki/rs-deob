import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class375 {

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Lem;")
    public class239 field5078 = new class239();

    @OriginalMember(owner = "client!km", name = "k", descriptor = "Z")
    public boolean field5086 = false;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Lfja;")
    public static class783 field5084 = new class783(13, -2);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V", line = 3)
    public static final void method2271(int arg0, int arg1, int arg2) {
        field5085++;
        int var3 = 37 % ((-arg1 - 93) / 33);
        class281 var4 = class54.method395((byte) -53, (long) arg0, 13);
        var4.method1821((byte) -23);
        var4.field3910 = arg2;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V", line = 17)
    public final void method2272(int arg0) {
        while (true) {
            class186 var2 = (class186) this.field5078.method1591((byte) 121);
            if (var2 == null) {
                if (arg0 < 2) {
                    return;
                }
                field5082++;
                return;
            }
            var2.method731((byte) 39);
            class287.method1839(var2, 8792);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)Z", line = 39)
    public static final boolean method2273(byte arg0, int arg1) {
        if (arg0 >= -60) {
            return false;
        }
        field5081++;
        if (arg1 == 11 || arg1 == 19 || arg1 == 47 || arg1 == 30 || arg1 == 48) {
            return true;
        } else {
            return arg1 == 13 || arg1 == 1002;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILhga;)V", line = 59)
    public final void method2274(int arg0, class186 arg1) {
        field5076++;
        class543 var3 = arg1.field2878;
        boolean var4 = true;
        class144[] var5 = arg1.field2877;
        for (int var6 = 0; var6 < var5.length; var6++) {
            if (var5[var6].field2428) {
                var4 = false;
                break;
            }
        }
        if (var4) {
            return;
        }
        if (this.field5086) {
            for (class186 var7 = (class186) this.field5078.method1597((byte) -92); var7 != null; var7 = (class186) this.field5078.method1601(102)) {
                if (var7.field2878 == var3) {
                    var7.method731((byte) 39);
                    class287.method1839(var7, 8792);
                }
            }
        }
        class186 var8 = (class186) this.field5078.method1597((byte) 124);
        int var9 = -9 / ((arg0 - 73) / 44);
        while (var8 != null) {
            if (var3.field7393 >= var8.field2878.field7393) {
                class101.method874(var8, (byte) 121, arg1);
                return;
            }
            var8 = (class186) this.field5078.method1601(74);
        }
        this.field5078.method1600(arg1, -3);
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 131)
    public static void method2275(int arg0) {
        field5084 = null;
        if (arg0 != 13) {
            field5084 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(III)Z", line = 141)
    public static final boolean method2276(int arg0, int arg1, int arg2) {
        field5080++;
        if (arg1 < 58) {
            return true;
        } else {
            return class402.method2405(arg0, arg2, 77) | (arg0 & 0x70000) != 0 || class35.method206(0, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Z)V", line = 165)
    public class375(boolean arg0) {
        this.field5086 = arg0;
    }
}
