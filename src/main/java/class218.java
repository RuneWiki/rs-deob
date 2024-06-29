import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class218 extends class101 {

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field3324 = -1;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public int field3316 = 0;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "[S")
    public static short[] field3313 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "[S")
    public static short[] field3314 = new short[256];

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field3318;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public int field3330;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public int field3331;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "Llm;")
    public static class210 field3319;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1497(int arg0, int arg1) {
        class73.field957.method2174(-12634, arg1);
        field3325++;
        if (arg0 != -10304) {
            field3312 = -6;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lre;I)V", line = 41)
    public static final void method1498(class263 arg0, int arg1) {
        byte[] var2 = new byte[arg1];
        field3321++;
        if (class224.field3418 != null) {
            try {
                class224.field3418.method1266((byte) 32, 0L);
                class224.field3418.method1259((byte) -75, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method1814(24, arg1 ^ 0xBB052DDD, var2, 0);
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)Lmg;", line = 82)
    public static final class61 method1499(int arg0) {
        if (arg0 != 6982) {
            method1500(-81);
        }
        field3328++;
        return class9.field71;
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V", line = 109)
    public static void method1500(int arg0) {
        field3319 = null;
        field3314 = null;
        field3313 = null;
        if (arg0 < 82) {
            field3313 = (short[]) null;
        }
    }
}
