import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class342 {

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "Z")
    public static boolean field4576 = false;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Lmk;")
    public static class154 field4577 = new class154();

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "[I")
    public static int[] field4580 = new int[25];

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "Llg;")
    public static class20 field4581;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "[[Z")
    public static boolean[][] field4573;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V", line = 3)
    public static void method1999(int arg0) {
        field4573 = null;
        field4581 = null;
        if (arg0 == 25) {
            field4580 = null;
            field4577 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 17)
    public static final void method2000(String arg0, byte arg1) {
        int var2 = 66 % ((arg1 + 46) / 54);
        field4572++;
        System.out.println("Error: " + class365.method2215("%0a", "\n", arg0, -11));
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V", line = 36)
    public static final void method2001(int arg0) {
        if (arg0 >= -67) {
            method2003(-59, (class322) null);
        }
        field4578++;
        class106.field1305.method307((byte) 115);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIILnk;)V", line = 51)
    public static final void method2002(int arg0, int arg1, int arg2, class206 arg3) {
        if (class176.field2209[arg0][arg1][arg2] == null) {
            class307.method1807(arg0, arg1, arg2);
        }
        class176.field2209[arg0][arg1][arg2].field1135 = arg3;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILvm;)V", line = 59)
    public static final void method2003(int arg0, class322 arg1) {
        field4579++;
        if (class452.field6586) {
            class279.method1546(arg1, false);
        } else {
            class159.method864(-4, arg1);
        }
        if (arg0 != -9013) {
            method2000((String) null, (byte) -78);
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)Lir;", line = 75)
    public static final class216 method2004(int arg0) {
        field4574++;
        if (arg0 <= 43) {
            return null;
        } else if (class443.field6455 == null || class61.field626 == null) {
            return null;
        } else {
            for (class216 var1 = (class216) class61.field626.method862((byte) -123); var1 != null; var1 = (class216) class61.field626.method862((byte) -92)) {
                class228 var2 = class283.method1668(-111, var1.field2903);
                if (var2 != null && var2.field3126 && var2.method1239((byte) -96)) {
                    return var1;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lnj;Z)Z", line = 102)
    public static final boolean method2005(class228 arg0, boolean arg1) {
        field4575++;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field3117) {
            return false;
        } else if (!arg0.method1239((byte) -113)) {
            return false;
        } else if (!arg1) {
            return true;
        } else if (class189.field2393.method308((long) arg0.field3135, (byte) 119) == null) {
            return class254.field3480.method308((long) arg0.field3133, (byte) -109) == null;
        } else {
            return false;
        }
    }
}
