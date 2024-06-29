import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class267 {

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "Lfc;")
    public static class235 field3791 = new class235(48, -2);

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "Z")
    public static boolean field3792 = false;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "Lpj;")
    public static class132 field3790;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)[B", line = 11)
    public static final synchronized byte[] method1627(int arg0, int arg1) {
        field3789++;
        if (arg0 != -1) {
            field3791 = null;
        }
        if (arg1 == 100 && class313.field4654 > 0) {
            byte[] var2 = class322.field4760[--class313.field4654];
            class322.field4760[class313.field4654] = null;
            return var2;
        } else if (arg1 == 5000 && class182.field2683 > 0) {
            byte[] var3 = class274.field3870[--class182.field2683];
            class274.field3870[class182.field2683] = null;
            return var3;
        } else if (arg1 == 30000 && class170.field2553 > 0) {
            byte[] var4 = class186.field2763[--class170.field2553];
            class186.field2763[class170.field2553] = null;
            return var4;
        } else {
            if (class76.field1049 != null) {
                for (int var5 = 0; var5 < class125.field1745.length; var5++) {
                    if (class125.field1745[var5] == arg1 && class80.field1112[var5] > 0) {
                        byte[] var6 = class76.field1049[var5][--class80.field1112[var5]];
                        class76.field1049[var5][class80.field1112[var5]] = null;
                        return var6;
                    }
                }
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V", line = 70)
    public static void method1628(byte arg0) {
        field3791 = null;
        field3790 = null;
        if (arg0 > -121) {
            method1628((byte) 46);
        }
    }
}
