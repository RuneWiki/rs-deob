import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class101 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    public static int[] field1803 = new int[128];

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[Lta;")
    public static class84[] field1804 = new class84[4];

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 4)
    public static void method686(int arg0) {
        field1803 = null;
        if (arg0 != 3494) {
            method686(102);
        }
        field1804 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lti;[Lti;[Lti;[Ljm;[Lti;BLum;)V", line = 24)
    public static final void method687(class186[] arg0, class186[] arg1, class186[] arg2, class303[] arg3, class186[] arg4, byte arg5, class222 arg6) {
        class309.field5271 = arg1;
        class181.field3100 = arg3;
        class50.field815 = arg4;
        class307.field5226 = arg0;
        class180.field3076 = arg2;
        class256.field4411 = arg6;
        class42.field741.method1938(71);
        field1802++;
        if (arg5 < 59) {
            method686(-81);
        }
        int var7 = class256.field4411.method1594(class280.field4707, -21);
        int[] var8 = class256.field4411.method1585(false, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class42.field741.method1940((byte) 71, class216.method1541(new class153(class256.field4411.method1577(var7, var8[var9], -29569)), -12666));
        }
    }
}
