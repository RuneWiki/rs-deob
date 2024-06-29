import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class601 extends class199 {

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "[[Z")
    public static boolean[][] field8360 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field8361;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "([SII)[S")
    public static final short[] method3404(short[] arg0, int arg1, int arg2) {
        field8361++;
        if (arg1 == 4387) {
            short[] var3 = new short[arg2];
            class135.method996(arg0, 0, var3, 0, arg2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static final void method3405(int arg0) {
        field8364++;
        if (class623.field8573) {
            return;
        }
        class366.field4718 = true;
        class749.field10471 += (-24.0F - class749.field10471) / 2.0F;
        if (arg0 != 1024) {
            field8362 = 87;
        }
        class623.field8573 = true;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLei;)V")
    public static final void method3406(boolean arg0, class180 arg1) {
        field8363++;
        for (int var2 = 0; var2 < class322.field4152; var2++) {
            int var3 = class85.field1165[var2];
            class724 var4 = class5.field49[var3];
            int var5 = arg1.method2600((byte) -124);
            if ((var5 & 0x10) != 0) {
                var5 += arg1.method2600((byte) -125) << 8;
            }
            if ((var5 & 0x400) != 0) {
                var5 += arg1.method2600((byte) -125) << 16;
            }
            class72.method642(arg1, -95, var4, var5, var3);
        }
        if (arg0) {
            method3405(89);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static void method3407(byte arg0) {
        field8360 = null;
        if (arg0 >= -119) {
            method3405(79);
        }
    }
}
