import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class149 {

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Z")
    public boolean field2068 = true;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field2062;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public int field2063;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[Z")
    public static boolean[] field2067 = new boolean[112];

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2065 = 0;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIZ)V", line = 6)
    public static final void method1078(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class63.field819[0].method8(arg0, arg3);
        field2060++;
        int var6 = (arg4 - 32) * arg4 / arg2;
        class63.field819[1].method8(arg0, arg3 + arg4 - 16);
        if (arg5) {
            return;
        }
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg1 / (arg2 - arg4);
        if (!class67.field908) {
            class38.method224(arg0, arg3 + 16, 16, arg4 - 32, class17.field235);
            class38.method224(arg0, arg3 + var7 + 16, 16, var6, class250.field3588);
            class38.method223(arg0, arg3 + var7 + 16, var6, class26.field332);
            class38.method223(arg0 + 1, arg3 - -16 + var7, var6, class26.field332);
            class38.method213(arg0, arg3 + var7 + 16, 16, class26.field332);
            class38.method213(arg0, arg3 + var7 + 17, 16, class26.field332);
            class38.method223(arg0 + 15, arg3 - (-var7 + -16), var6, class4.field33);
            class38.method223(arg0 + 14, arg3 + var7 + 17, var6 - 1, class4.field33);
            class38.method213(arg0, arg3 + var6 + var7 + 15, 16, class4.field33);
            class38.method213(arg0 + 1, arg3 + 14 - -var7 - -var6, 15, class4.field33);
            return;
        }
        class102.method738(arg0, arg3 + 16, 16, arg4 - 32, class17.field235);
        class102.method738(arg0, arg3 + var7 + 16, 16, var6, class250.field3588);
        class102.method743(arg0, arg3 + var7 + 16, var6, class26.field332);
        class102.method743(arg0 + 1, arg3 + var7 - -16, var6, class26.field332);
        class102.method754(arg0, arg3 + var7 + 16, 16, class26.field332);
        class102.method754(arg0, arg3 + var7 + 17, 16, class26.field332);
        class102.method743(arg0 + 15, arg3 - (-var7 + -16), var6, class4.field33);
        class102.method743(arg0 + 14, arg3 - (-17 - var7), var6 - 1, class4.field33);
        class102.method754(arg0, arg3 + var7 + var6 + 15, 16, class4.field33);
        class102.method754(arg0 + 1, arg3 - -var7 + var6 + 14, 15, class4.field33);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 57)
    public static void method1079(byte arg0) {
        if (arg0 != -79) {
            field2065 = 94;
        }
        field2067 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBI)V", line = 83)
    public static final void method1080(int arg0, byte arg1, int arg2) {
        field2059++;
        int var3 = -95 / ((-arg1 - 70) / 42);
        class89.field1257 = (float) arg0;
        if (class343.field5168 == 2) {
            class236.field3347 = arg0;
            class204.field2944 = arg2;
        }
        class124.field1674 = (float) arg2;
        class64.method428(114);
        class125.field1711 = true;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIIZ)V", line = 104)
    public class149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2057 = arg2;
        this.field2068 = arg6;
        this.field2062 = arg0;
        this.field2064 = arg3;
        this.field2066 = arg5;
        this.field2063 = arg4;
        this.field2058 = arg1;
    }
}
