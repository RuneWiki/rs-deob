import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class151 {

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2265 = "skill: ";

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "Z")
    public static boolean field2274 = true;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "[F")
    public static float[] field2275 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public int field2262;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public int field2267;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public int field2271;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public int field2273;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    public int field2277;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[B")
    public byte[] field2269;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "[B")
    public byte[] field2272;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Llm;Z)V", line = 8)
    public static final void method1087(class210 arg0, boolean arg1) {
        field2263++;
        class61.field819 = arg0;
        class205.field3096 = class61.field819.method1464((byte) 24, 4);
        if (!arg1) {
            method1088((byte) -101);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 26)
    public static final void method1088(byte arg0) {
        if (arg0 == -109) {
            class132.field2031.method2176((byte) -37);
            class84.field1244.method2176((byte) -41);
            field2270++;
            class314.field4749.method2176((byte) -64);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(B)V", line = 39)
    public static final void method1089(byte arg0) {
        class234.field3507.method28(184, false);
        class234.field3507.method1823(class125.field1967, (byte) -120);
        field2268++;
        if (arg0 <= -94) {
            class134.field2051++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lre;Ljava/lang/String;I)I", line = 63)
    public static final int method1090(class263 arg0, String arg1, int arg2) {
        field2276++;
        int var3 = arg0.field4025;
        if (arg2 >= -10) {
            field2275 = (float[]) null;
        }
        byte[] var4 = class8.method33((byte) 102, arg1);
        arg0.method1840(var4.length, (byte) 1);
        arg0.field4025 += class296.field4529.method2052(0, arg0.field4025, var4, var4.length, arg0.field3986, (byte) 120);
        return arg0.field4025 - var3;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 80)
    public static void method1091(int arg0) {
        if (arg0 == 4) {
            field2265 = null;
            field2275 = null;
        }
    }
}
