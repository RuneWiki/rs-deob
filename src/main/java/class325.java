import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class325 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field5326 = -1;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5332 = "Started 3d Library";

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[I")
    public static int[] field5329 = new int[5];

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field5330 = 0;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field5325 = 0;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "F")
    public static float field5331;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field5338;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field5339;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[Lga;")
    public static class186[] field5327;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Luo;I)[Lnc;", line = 46)
    public static final class16[] method2323(class274 arg0, int arg1) {
        field5338++;
        if (!arg0.method1954((byte) 85)) {
            return new class16[0];
        }
        class158 var2 = arg0.method1946(20563);
        while (var2.field2542 == 0) {
            class177.method1246(10L, -32644);
        }
        if (var2.field2542 == 2) {
            return new class16[0];
        }
        if (arg1 != 578578818) {
            field5330 = -71;
        }
        int[] var3 = (int[]) ((int[]) var2.field2538);
        class16[] var4 = new class16[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class16 var6 = new class16();
            var4[var5] = var6;
            var6.field207 = var3[var5 << 2];
            var6.field210 = var3[(var5 << 2) + 1];
            var6.field209 = var3[(var5 << 2) + 2];
            var6.field205 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 90)
    public static void method2324(int arg0) {
        field5332 = null;
        field5329 = null;
        field5327 = null;
        if (arg0 != -1094468382) {
            method2326((String) null, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V", line = 112)
    public static final void method2325(int arg0, int arg1, int arg2, int arg3) {
        class50 var4 = class264.field4230[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class206 var5 = var4.field747;
        if (var5 != null) {
            var5.field3140 = var5.field3140 * arg3 / 16;
            var5.field3138 = var5.field3138 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 153)
    public static final int method2326(String arg0, byte arg1) {
        if (arg1 != -115) {
            field5326 = 74;
        }
        field5336++;
        for (int var2 = 0; var2 < class322.field5291.length; var2++) {
            if (class322.field5291[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V", line = 176)
    public static final void method2327(int arg0, int arg1) {
        field5339++;
        class143.field2302.method645(arg0, (byte) -41);
        class347.field5559.method645(arg0, (byte) -90);
        if (arg1 > -117) {
            field5325 = 6;
        }
    }
}
