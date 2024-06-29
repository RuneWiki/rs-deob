import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class234 extends OutputStream {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "[S")
    public static short[] field3185 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3184 = "Connected to update server";

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field3189 = 0;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field3188 = 0;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V", line = 5)
    public static void method1479(byte arg0) {
        if (arg0 <= 86) {
            field3185 = null;
        }
        field3185 = null;
        field3184 = null;
    }

    @OriginalMember(owner = "client!wl", name = "write", descriptor = "(I)V", line = 21)
    public final void write(int arg0) throws IOException {
        field3183++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 37)
    public static final void method1480(int arg0) {
        class354.method2296(28716);
        field3187++;
        class236.field3215 = null;
        class176.field2488 = null;
        class184.field2571 = null;
        if (arg0 > -70) {
            method1479((byte) 74);
        }
        class41.field612 = null;
        class308.field4230 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIII)V", line = 61)
    public static final void method1481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -10304) {
            return;
        }
        field3186++;
        if (arg4 > class398.field5827 || class300.field4164 > arg2) {
            return;
        }
        boolean var6;
        if (arg0 < class379.field5397) {
            var6 = false;
            arg0 = class379.field5397;
        } else if (arg0 > class43.field659) {
            arg0 = class43.field659;
            var6 = false;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg3 < class379.field5397) {
            var7 = false;
            arg3 = class379.field5397;
        } else if (arg3 > class43.field659) {
            arg3 = class43.field659;
            var7 = false;
        } else {
            var7 = true;
        }
        if (class300.field4164 <= arg4) {
            class73.method486(arg0, class84.field1286[arg4++], arg5, 26, arg3);
        } else {
            arg4 = class300.field4164;
        }
        if (arg2 <= class398.field5827) {
            class73.method486(arg0, class84.field1286[arg2--], arg5, 8, arg3);
        } else {
            arg2 = class398.field5827;
        }
        if (var6 && var7) {
            for (int var8 = arg4; var8 <= arg2; var8++) {
                int[] var9 = class84.field1286[var8];
                var9[arg0] = var9[arg3] = arg5;
            }
        } else if (var6) {
            for (int var11 = arg4; var11 <= arg2; var11++) {
                class84.field1286[var11][arg0] = arg5;
            }
        } else if (var7) {
            for (int var10 = arg4; var10 <= arg2; var10++) {
                class84.field1286[var10][arg3] = arg5;
            }
            return;
        }
    }
}
