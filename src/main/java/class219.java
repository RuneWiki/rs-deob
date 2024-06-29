import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class219 extends class422 {

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "B")
    public byte field3079 = 5;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lka;")
    public static class408 field3072 = new class408(64);

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "[I")
    public static int[] field3080 = new int[2];

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field3082 = 2;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public int field3076;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public static final void method1454(byte arg0) {
        class88.field1232.method1151(227, (byte) 100);
        field3074++;
        class227.field3148++;
        if (arg0 != 78) {
            method1457(100, -16, -47, (class403) null, (class403) null);
        }
        class88.field1232.method2275(arg0 + 44, class230.field3244);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZII)I")
    public static final int method1455(boolean arg0, int arg1, int arg2) {
        field3078++;
        int var3 = arg2 >>> 24;
        int var4 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        if (arg0) {
            method1456(78);
        }
        return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static void method1456(int arg0) {
        if (arg0 != 1620080728) {
            field3082 = -111;
        }
        field3080 = null;
        field3072 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIILjk;Ljk;)V")
    public static final void method1457(int arg0, int arg1, int arg2, class403 arg3, class403 arg4) {
        if (class341.field4617[arg0][arg1][arg2] == null) {
            class72.method567(arg0, arg1, arg2);
        }
        class341.field4617[arg0][arg1][arg2].field867 = arg3;
        class341.field4617[arg0][arg1][arg2].field863 = arg4;
    }
}
