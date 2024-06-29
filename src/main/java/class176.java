import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class176 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lnj;")
    public static class317 field2580 = new class317();

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJ)V")
    public static final void method1116(int arg0, long arg1) {
        class170.field2488.field3162 = 0;
        field2582++;
        class170.field2488.method1479((byte) -97, class432.field6526.field4683);
        class170.field2488.method1439(arg1, 88);
        class170.field2488.method1479((byte) -98, class12.field131);
        class457.field7048 = 1;
        class360.field5582 = 0;
        class76.field1141 = arg0;
        class271.field4327 = -3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILwq;I)V")
    public static final void method1117(int arg0, int arg1, class378 arg2, int arg3) {
        field2581++;
        if (arg2.field840 == arg1 && arg1 != -1) {
            class363 var4 = class388.field5915.method1703(arg1, -12536);
            int var5 = var4.field5621;
            if (var5 == 1) {
                arg2.field804 = 0;
                arg2.field836 = arg0;
                arg2.field875 = 0;
                arg2.field826 = 0;
                arg2.field886 = 1;
                class35.method217((byte) -44, false, arg2.field875, var4, arg2.field6417, arg2.field6410, arg2.field6419);
            }
            if (var5 == 2) {
                arg2.field804 = 0;
            }
        } else if (arg1 == -1 || arg2.field840 == -1 || class388.field5915.method1703(arg1, -12536).field5608 >= class388.field5915.method1703(arg2.field840, -12536).field5608) {
            arg2.field826 = 0;
            arg2.field875 = 0;
            arg2.field836 = arg0;
            arg2.field886 = 1;
            arg2.field893 = arg2.field898;
            arg2.field840 = arg1;
            arg2.field804 = 0;
            if (arg2.field840 != -1) {
                class35.method217((byte) -44, false, arg2.field875, class388.field5915.method1703(arg2.field840, -12536), arg2.field6417, arg2.field6410, arg2.field6419);
            }
        }
        if (arg3 > -71) {
            method1116(-57, 70L);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method1118(int arg0) {
        int var1 = -56 / ((-arg0 - 44) / 53);
        field2580 = null;
    }
}
