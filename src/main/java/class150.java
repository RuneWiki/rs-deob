import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class150 extends class142 {

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "Lhi;")
    public static class82 field2551 = class95.method664((byte) -104, "");

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "Lhi;")
    public static class82 field2554 = class95.method664((byte) -94, "cross");

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "Lhi;")
    public static class82 field2558 = class95.method664((byte) -99, ")3");

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "Lhn;")
    public static class317 field2553 = new class317(4);

    @OriginalMember(owner = "client!vh", name = "gb", descriptor = "Lhi;")
    public static class82 field2563 = class95.method664((byte) -69, "scrollen:");

    @OriginalMember(owner = "client!vh", name = "fb", descriptor = "Lhi;")
    public static class82 field2562 = class95.method664((byte) -80, "www)2wtqa");

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "F")
    public static float field2555;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "Lph;")
    public class282 field2549;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "[B")
    public byte[] field2547;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "[I")
    public static int[] field2548;

    @OriginalMember(owner = "client!vh", name = "eb", descriptor = "[I")
    public static int[] field2561;

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "[[[I")
    public static int[][][] field2560;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "(I)V", line = 12)
    public static void method1033(int arg0) {
        field2560 = (int[][][]) null;
        field2554 = null;
        if (arg0 != 128) {
            method1034(63, 18);
        }
        field2558 = null;
        field2551 = null;
        field2553 = null;
        field2561 = null;
        field2548 = null;
        field2563 = null;
        field2562 = null;
    }

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)[B", line = 31)
    public final byte[] method964(int arg0) {
        field2556++;
        if (arg0 != -1) {
            method1034(-56, -96);
        }
        if (this.field2433) {
            throw new RuntimeException();
        }
        return this.field2547;
    }

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "(I)I", line = 54)
    public final int method967(int arg0) {
        field2557++;
        if (arg0 > -33) {
            field2553 = (class317) null;
        }
        return this.field2433 ? 0 : 100;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(II)V", line = 74)
    public static final void method1034(int arg0, int arg1) {
        if (arg0 == 16294) {
            field2550++;
            if (class113.method777((byte) 80, arg1)) {
                class5.method33(class277.field4660[arg1], -1, -123);
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZIII)V", line = 95)
    public static final void method1035(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field2552++;
        class87.field1549 = arg1;
        class24.field326 = arg5;
        if (arg0 > -47) {
            method1033(85);
        }
        class262.field4480 = arg2;
        class217.field3772 = arg6;
        class9.field73 = arg4;
        if (arg3 && class9.field73 >= 100) {
            class4.field32 = class24.field326 * 128 + 64;
            class219.field3792 = class87.field1549 * 128 + 64;
            class134.field2322 = class21.method145(class219.field3792, class4.field32, class297.field5058, (byte) 111) - class262.field4480;
        }
        class273.field4602 = 2;
    }
}
