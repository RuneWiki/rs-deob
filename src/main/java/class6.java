import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public int field70 = 8;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field67 = 16777215;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public static int field74 = 0;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Lh;")
    public static class434 field78 = new class434(38, 14);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public int field72;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public int field73;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public int field80;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient;")
    public static client field81;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Z")
    public boolean field76;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lbt;II)V")
    private final void method38(class32 arg0, int arg1, int arg2) {
        int var4 = -108 / ((86 - arg1) / 40);
        if (arg2 == 1) {
            this.field70 = arg0.method215((byte) 115);
        } else if (arg2 == 2) {
            this.field76 = true;
        } else if (arg2 == 3) {
            this.field75 = arg0.method209((byte) 35);
            this.field80 = arg0.method209((byte) 35);
            this.field73 = arg0.method209((byte) 35);
        } else if (arg2 == 4) {
            this.field72 = arg0.method201((byte) -118);
        } else if (arg2 == 5) {
            this.field66 = arg0.method215((byte) 113);
        } else if (arg2 == 6) {
            this.field67 = arg0.method219(-120);
        }
        field71++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    public static final void method39(boolean arg0) {
        field65++;
        if (arg0) {
            return;
        }
        for (class363 var1 = (class363) class78.field1054.method652((byte) 37); var1 != null; var1 = (class363) class78.field1054.method653(120)) {
            if (var1.field4977 == -1) {
                var1.field4980 = 0;
                class192.method1098(2, var1);
            } else {
                var1.method2614((byte) -81);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([Ljd;I)V")
    public static final void method40(class139[] arg0, int arg1) {
        class190.field2585 = arg0.length;
        field77++;
        if (arg1 >= -125) {
            field81 = null;
        }
        class467.field6465 = new class139[class190.field2585 + 10];
        class143.field2061 = new int[class190.field2585 + 10];
        class380.method2336(arg0, 0, class467.field6465, 0, class190.field2585);
        for (int var2 = 0; var2 < class190.field2585; var2++) {
            class143.field2061[var2] = class467.field6465[var2].method774();
        }
        for (int var3 = class190.field2585; var3 < class467.field6465.length; var3++) {
            class143.field2061[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
    public static final int method41(byte arg0) {
        if (arg0 != -121) {
            return 106;
        }
        field69++;
        if (class94.field1398 == null) {
            return class94.field1388 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static void method42(byte arg0) {
        field78 = null;
        field81 = null;
        if (arg0 != -105) {
            method39(false);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILbt;)V")
    public final void method43(int arg0, class32 arg1) {
        int var3 = -46 % ((33 - arg0) / 58);
        field79++;
        while (true) {
            int var4 = arg1.method201((byte) -118);
            if (var4 == 0) {
                return;
            }
            this.method38(arg1, 126, var4);
        }
    }
}
