import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class464 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public int field6526;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lkv;")
    public static class227 field6525 = new class227();

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBII)V", line = 4)
    public static final void method2793(int arg0, byte arg1, int arg2, int arg3) {
        field6523++;
        int var4 = class473.field6687 + arg2;
        if (arg1 != 27) {
            return;
        }
        int var5 = arg3 + class38.field463;
        if (class420.field5697 == null || arg2 < 0 || arg3 < 0 || arg2 >= class146.field2125 || arg3 >= class410.field5609) {
            return;
        }
        long var6 = (long) (var4 | var5 << 14 | arg0 << 28);
        class85 var8 = (class85) class45.field544.method2799(var6, true);
        if (var8 == null) {
            class525.method3098(arg0, arg2, arg3);
            return;
        }
        class515 var9 = (class515) var8.field1212.method124((byte) 42);
        if (var9 == null) {
            class525.method3098(arg0, arg2, arg3);
            return;
        }
        class441 var10 = (class441) class525.method3098(arg0, arg2, arg3);
        if (var10 == null) {
            var10 = new class441();
        } else {
            var10.field5890 = var10.field5882 = -1;
        }
        var10.field5887 = var9.field7347;
        var10.field5886 = var9.field7344;
        label50: while (true) {
            class515 var11 = (class515) var8.field1212.method120(101);
            if (var11 == null) {
                break;
            }
            if (var10.field5887 != var11.field7347) {
                var10.field5893 = var11.field7344;
                var10.field5890 = var11.field7347;
                while (true) {
                    class515 var12 = (class515) var8.field1212.method120(-118);
                    if (var12 == null) {
                        break label50;
                    }
                    if (var10.field5887 != var12.field7347 && var10.field5890 != var12.field7347) {
                        var10.field5882 = var12.field7347;
                        var10.field5891 = var12.field7344;
                    }
                }
            }
        }
        int var13 = class132.method919(arg0, (arg3 << 7) + 64, (arg2 << 7) + 64, (byte) -82);
        class526.method3099(arg0, arg2, arg3, var13, var10);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Z", line = 89)
    public static final boolean method2794(int arg0, int arg1) {
        if (arg1 != 1) {
            method2793(84, (byte) 11, 106, 42);
        }
        field6527++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 101)
    public static void method2795(int arg0) {
        if (arg0 != 13837) {
            field6525 = null;
        }
        field6525 = null;
    }

    @OriginalMember(owner = "client!j", name = "toString", descriptor = "()Ljava/lang/String;", line = 112)
    public final String toString() {
        field6524++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(II)V", line = 121)
    public class464(int arg0, int arg1) {
        this.field6526 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)Z", line = 133)
    public static final boolean method2796(int arg0, byte arg1, int arg2) {
        field6528++;
        return arg1 > -49 ? true : ((arg0 & 0x2000) != 0 | class560.method3375(arg2, (byte) -83, arg0) | class245.method1551(arg0, -1, arg2)) & class358.method2157(arg2, 116, arg0);
    }
}
