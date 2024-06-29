import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class262 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Z")
    public static boolean field4210 = true;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Ljava/lang/String;")
    public static String field4212 = "level: ";

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[[[I")
    public static int[][][] field4217 = new int[2][][];

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Z")
    public static boolean field4214;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)V")
    public static final void method1758(long arg0, int arg1) {
        field4211++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class293.method1950(-95, arg0 - 1L);
            class293.method1950(-24, 1L);
        } else {
            class293.method1950(arg1 - 29496, arg0);
        }
        if (arg1 != 29552) {
            method1761((byte) 65);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method1759(byte arg0) {
        field4215++;
        int var1 = 9 / ((arg0 - 33) / 32);
        for (int var2 = -1; var2 < class13.field145; var2++) {
            int var6;
            if (var2 == -1) {
                var6 = 2047;
            } else {
                var6 = class259.field4176[var2];
            }
            class299 var7 = class270.field4355[var6];
            if (var7 != null && var7.field631 > 0) {
                var7.field631--;
                if (var7.field631 == 0) {
                    var7.field684 = null;
                }
            }
        }
        for (int var3 = 0; var3 < class246.field3912; var3++) {
            int var4 = class184.field3020[var3];
            class131 var5 = class12.field127[var4];
            if (var5 != null && var5.field631 > 0) {
                var5.field631--;
                if (var5.field631 == 0) {
                    var5.field684 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
    public static final void method1760(int arg0, int arg1) {
        field4213++;
        if (class153.field2385 == arg0) {
            return;
        }
        if (class153.field2385 == 0) {
            class4.method21(-125);
        }
        if (arg0 == 40) {
            class48.method340(true);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 != 40 && class133.field2120 != null) {
            class133.field2120.method974((byte) 122);
            class133.field2120 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class150.field2337 = 0;
            class165.field2667 = 0;
            class12.field126 = 1;
            class170.field2763 = 1;
            class214.field3535 = 0;
            class185.method1329(false, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class139.method976(-11901);
        }
        if (arg0 == 5) {
            class165.method1182(20634, class160.field2541);
        } else {
            class72.method492(-1);
        }
        if (arg1 > -30) {
            return;
        }
        boolean var3 = class153.field2385 == 5 || class153.field2385 == 10 || class153.field2385 == 28;
        if (var3 != var2) {
            if (var2) {
                class281.field4498 = class272.field4376;
                if (class214.field3548 == 0) {
                    class94.method652(25999, 2);
                } else {
                    class116.method830(class272.field4376, 255, class50.field852, 2, false, 270, 0);
                }
                class90.field1472.method444(false, (byte) -111);
            } else {
                class94.method652(25999, 2);
                class90.field1472.method444(true, (byte) 50);
            }
        }
        class153.field2385 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static final void method1761(byte arg0) {
        field4216++;
        class124.field1967++;
        if (arg0 > -47) {
            method1761((byte) 92);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1762(int arg0) {
        field4217 = null;
        field4212 = null;
        if (arg0 != -22033) {
            field4217 = null;
        }
    }
}
