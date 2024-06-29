import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class145 {

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "Lgd;")
    public static class325 field2348 = new class325(64);

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Leg;")
    public static class317 field2347;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "[Lwd;")
    public static class88[] field2352;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V", line = 8)
    public static void method1106(byte arg0) {
        int var1 = -95 % ((arg0 + 55) / 55);
        field2352 = null;
        field2348 = null;
        field2347 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V", line = 33)
    public static final void method1107(int arg0, int arg1) {
        field2350++;
        if (arg1 > 35) {
            class322.field5049 = (class91) class243.field3641.method79((long) arg0, (byte) 0);
        }
    }
}
