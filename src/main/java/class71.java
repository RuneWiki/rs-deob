import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class71 {

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Lmq;")
    private class104 field1043 = new class104(64);

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Lfc;")
    private class343 field1042;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BI)Lam;", line = 3)
    public final class393 method494(byte arg0, int arg1) {
        field1048++;
        class104 var3 = this.field1043;
        class393 var4;
        synchronized (this.field1043) {
            var4 = (class393) this.field1043.method659((long) arg1, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1042.method2029(19, arg1, 0);
        class393 var6 = new class393();
        if (var5 != null) {
            var6.method2347(new class425(var5), false);
        }
        if (arg0 != -27) {
            return null;
        }
        class104 var7 = this.field1043;
        synchronized (this.field1043) {
            this.field1043.method653(116, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 38)
    public static final void method495(int arg0) {
        class104 var1 = class267.field3716;
        synchronized (class267.field3716) {
            class267.field3716.method654(false);
        }
        if (arg0 != 10765) {
            field1041 = -6;
        }
        field1044++;
        class104 var2 = class21.field367;
        synchronized (class21.field367) {
            class21.field367.method654(false);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 55)
    public static final void method496(byte arg0) {
        class366.field5214.field5830 = 0;
        field1046++;
        class472.field6619 = null;
        class7.field136 = 0;
        class388.field5458.field5830 = 0;
        class7.field129 = null;
        class147.field2083 = 0;
        class121.field1698 = null;
        class310.field4245 = 0;
        class255.field3570 = null;
        if (arg0 != -46) {
            method497(28, 54, -61);
        }
        class58.method433(114);
        class346.method2068(-1);
        for (int var1 = 0; var1 < 2048; var1++) {
            class310.field4235[var1] = null;
        }
        class2.field21 = null;
        for (int var2 = 0; var2 < class256.field3581.length; var2++) {
            class196 var4 = class256.field3581[var2];
            if (var4 != null) {
                var4.field1096 = -1;
            }
        }
        class310.method1877((byte) 29);
        class375.field5312 = 1;
        class8.method94(30, arg0 + 167);
        for (int var3 = 0; var3 < 100; var3++) {
            class127.field1809[var3] = true;
        }
        class233.method1470(1);
        class473.field6627 = null;
        class343.field4705 = 0L;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III)V", line = 113)
    public static final void method497(int arg0, int arg1, int arg2) {
        field1047++;
        if (arg2 != -23351) {
            method496((byte) 83);
        }
        class265 var3 = class440.method2554(arg1, arg2 + 23353, 14);
        var3.method1675(false);
        var3.field3698 = arg0;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Ldk;ILfc;)V", line = 132)
    public class71(class328 arg0, int arg1, class343 arg2) {
        this.field1042 = arg2;
        this.field1049 = this.field1042.method2054(0, 19);
    }
}
