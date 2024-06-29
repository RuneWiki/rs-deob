import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class274 extends class134 {

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field4531 = 0;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4528 = "Loaded input handler";

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public int field4520;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public int field4522;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public int field4524;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    public int field4530;

    @OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
    public int field4533;

    @OriginalMember(owner = "client!fj", name = "G", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!fj", name = "H", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public int field4539;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public int field4540;

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "I")
    public int field4541;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "Lwg;")
    public class185 field4542;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Llm;")
    public class236 field4515;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Lhc;")
    public class250 field4517;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Lfa;")
    public static class273 field4518;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "Luc;")
    public class39 field4529;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "[Lh;")
    public static class294[] field4519;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
    public static final void method1908(int arg0, int arg1, int arg2) {
        field4521++;
        class18.field254 = new class25(arg2);
        class284.field4745 = new class25(arg0);
        if (arg1 != -1) {
            method1913((class273) null, 46);
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)V")
    public static final void method1909(boolean arg0) {
        if (arg0) {
            class27.field346 = class114.field1727;
            class242.field3842 = class304.field4965;
        } else {
            class27.field346 = class280.field4638;
            class242.field3842 = class277.field4583;
        }
        class277.field4590 = class27.field346.length;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public final void method1910(int arg0) {
        this.field4542 = null;
        this.field4515 = null;
        this.field4517 = null;
        this.field4529 = null;
        field4535++;
        if (arg0 != 15) {
            method1913((class273) null, -67);
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    public static void method1911(int arg0) {
        field4528 = null;
        field4518 = null;
        field4519 = null;
        if (arg0 < 12) {
            field4543 = -74;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1912(int arg0, int arg1, int arg2, long arg3) {
        int var5 = ((int) arg3 & 0x7DB2F) >> 14;
        field4544++;
        int var6 = ((int) arg3 & 0x392F91) >> 20;
        if (arg1 != -1) {
            return false;
        }
        int var7 = (int) (arg3 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class74 var8 = class216.method1510(0, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field1169;
                var10 = var8.field1151;
            } else {
                var9 = var8.field1151;
                var10 = var8.field1169;
            }
            int var11 = var8.field1131;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class105.method678(class309.field5006.field849[0], var9, true, var10, 0, (byte) 127, var11, class309.field5006.field804[0], arg0, arg2, 0);
        } else {
            class105.method678(class309.field5006.field849[0], 0, true, 0, var6, (byte) 127, 0, class309.field5006.field804[0], arg0, arg2, var5 + 1);
        }
        return true;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lfa;I)V")
    public static final void method1913(class273 arg0, int arg1) {
        field4526++;
        if (arg1 != -1) {
            method1908(-107, -119, 41);
        }
        class226.field3590 = arg0;
    }
}
