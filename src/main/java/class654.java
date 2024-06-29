import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class654 extends class381 {

    @OriginalMember(owner = "client!oda", name = "q", descriptor = "[F")
    public static float[] field9363 = new float[4];

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "Lcw;")
    public static class127 field9359 = new class127(0);

    @OriginalMember(owner = "client!oda", name = "t", descriptor = "Lvg;")
    public static class622 field9366 = new class622(9, 2);

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
    public static int field9356;

    @OriginalMember(owner = "client!oda", name = "n", descriptor = "I")
    public int field9360;

    @OriginalMember(owner = "client!oda", name = "o", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!oda", name = "p", descriptor = "I")
    public int field9362;

    @OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "Liba;")
    public class211 field9355;

    @OriginalMember(owner = "client!oda", name = "s", descriptor = "Lmv;")
    public static class295 field9365;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "Llr;")
    public class311 field9358;

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field9357;

    @OriginalMember(owner = "client!oda", name = "u", descriptor = "[[I")
    public static int[][] field9367;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ILew;)[Lsg;", line = 8)
    public static final class432[] method3697(int arg0, class226 arg1) {
        field9356++;
        if (!arg1.method1403((byte) 113)) {
            return new class432[0];
        }
        class254 var2 = arg1.method1412(1152);
        if (arg0 != -2) {
            return null;
        }
        while (var2.field3311 == 0) {
            class687.method3846(10L, arg0 + 79);
        }
        if (var2.field3311 == 2) {
            return new class432[0];
        }
        int[] var3 = (int[]) var2.field3307;
        class432[] var4 = new class432[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class432 var6 = new class432();
            var4[var5] = var6;
            var6.field6273 = var3[var5 << 2];
            var6.field6274 = var3[(var5 << 2) + 1];
            var6.field6272 = var3[(var5 << 2) + 2];
            var6.field6268 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLwo;)Ljp;", line = 51)
    public static final class361 method3698(byte arg0, class293 arg1) {
        field9364++;
        if (arg0 != 92) {
            method3698((byte) -68, null);
        }
        class361 var2;
        if (class117.field1748 == null) {
            var2 = new class361();
        } else {
            var2 = class117.field1748;
            class117.field1748 = class117.field1748.field5299;
            class420.field6186--;
            var2.field5299 = null;
        }
        var2.field5301 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 74)
    public static void method3699(int arg0) {
        if (arg0 <= 92) {
            field9367 = null;
        }
        field9359 = null;
        field9365 = null;
        field9357 = null;
        field9367 = null;
        field9363 = null;
        field9366 = null;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V", line = 89)
    public static final void method3700(int arg0) {
        field9361++;
        if (arg0 != -1681322014) {
            return;
        }
        if (class264.field3451 == 3) {
            class322.method2003(0, 4);
        } else if (class264.field3451 == 7) {
            class322.method2003(0, 8);
        } else if (class264.field3451 == 10) {
            class322.method2003(0, 11);
        }
    }

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)V", line = 110)
    public final void method3701(int arg0) {
        field9354++;
        if (class57.field930.length > class14.field319) {
            if (arg0 < 17) {
                field9363 = null;
            }
            class57.field930[class14.field319++] = this;
        }
    }
}
