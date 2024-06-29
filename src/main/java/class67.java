import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class67 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lrh;")
    private class87 field1033 = new class87();

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    private int field1044;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    private int field1036;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Lvh;")
    private class212 field1042;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Lck;")
    public static class119 field1034 = class298.method1987((byte) 85, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "[[I")
    public static int[][] field1040 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "[[Z")
    public static boolean[][] field1041 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Lck;")
    public static class119 field1047 = class298.method1987((byte) 40, "<col=40ff00>");

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!vk", name = "r", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!vk", name = "s", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "[I")
    public static int[] field1045;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 4)
    public final void method486(byte arg0) {
        this.field1033.method586((byte) 126);
        this.field1042.method1334((byte) -60);
        if (arg0 == 93) {
            field1050++;
            this.field1036 = this.field1044;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ZJ)Ljava/lang/Object;", line = 20)
    public final Object method487(boolean arg0, long arg1) {
        field1046++;
        class157 var4 = (class157) this.field1042.method1329((byte) 90, arg1);
        if (var4 == null) {
            return null;
        }
        if (arg0) {
            field1048 = -44;
        }
        Object var5 = var4.method447(1);
        if (var5 == null) {
            var4.method552((byte) -112);
            var4.method911((byte) 82);
            this.field1036++;
            return null;
        }
        if (var4.method448((byte) 104)) {
            class193 var6 = new class193(var5);
            this.field1042.method1326(var4.field1218, (byte) -115, var6);
            this.field1033.method582(3, var6);
            var6.field2212 = 0L;
            var4.method552((byte) -116);
            var4.method911((byte) 112);
        } else {
            this.field1033.method582(3, var4);
            var4.field2212 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/Object;BJ)V", line = 62)
    public final void method488(Object arg0, byte arg1, long arg2) {
        field1049++;
        if (arg1 < 32) {
            return;
        }
        if (this.field1036 == 0) {
            class157 var5 = (class157) this.field1033.method592(false);
            var5.method552((byte) -116);
            var5.method911((byte) 123);
        } else {
            this.field1036--;
        }
        class193 var6 = new class193(arg0);
        this.field1042.method1326(arg2, (byte) -101, var6);
        this.field1033.method582(3, var6);
        var6.field2212 = 0L;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BJ)V", line = 89)
    public final void method489(byte arg0, long arg1) {
        if (arg0 != -57) {
            this.method489((byte) 72, 53L);
        }
        field1051++;
        class157 var4 = (class157) this.field1042.method1329((byte) 90, arg1);
        if (var4 != null) {
            var4.method552((byte) -126);
            var4.method911((byte) 89);
            this.field1036++;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V", line = 116)
    public static final void method490(int arg0, boolean arg1) {
        class242.field3891 = arg0;
        if (!arg1) {
            field1048 = -75;
        }
        if (class214.field3407 == 40) {
            class204.method1289(-125, 8);
        } else {
            class204.method1289(-112, 10);
        }
        field1043++;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)V", line = 140)
    public final void method491(int arg0, int arg1) {
        if (class100.field1520 != null) {
            for (class157 var3 = (class157) this.field1033.method583((byte) 90); var3 != null; var3 = (class157) this.field1033.method588(3)) {
                if (var3.method448((byte) 104)) {
                    if (var3.method447(1) == null) {
                        var3.method552((byte) 55);
                        var3.method911((byte) 125);
                        this.field1036++;
                    }
                } else if ((++var3.field2212) > ((long) arg1)) {
                    class157 var4 = class100.field1520.method453(var3, -77);
                    this.field1042.method1326(var3.field1218, (byte) -102, var4);
                    this.field1033.method584(var3, (byte) 124, var4);
                    var3.method552((byte) -123);
                    var3.method911((byte) 127);
                }
            }
        }
        field1037++;
        int var5 = 123 % ((arg0 - 48) / 51);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIILml;I)V", line = 204)
    public static final void method492(int arg0, int arg1, int arg2, class134 arg3, int arg4) {
        field1038++;
        class121.method804(arg1, arg2, arg1 + arg3.field2180, arg2 - -arg3.field2057);
        if (class100.field1526 >= 3) {
            class88 var5 = arg3.method889(1897326632, false);
            if (var5 != null) {
                var5.method139(arg1, arg2);
            }
        } else {
            ((class160) class289.field4748).method1024(arg1, arg2, arg3.field2180, arg3.field2057, class289.field4748.field1347 / 2, class289.field4748.field1345 / 2, class140.field2253, 256, (class160) arg3.method889(1897326632, false));
        }
        int var6 = 4 % ((-arg0 - 63) / 49);
        class187.field2940[arg4] = true;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V", line = 236)
    public static void method493(byte arg0) {
        field1040 = (int[][]) null;
        int var1 = 71 % ((-arg0 - 68) / 53);
        field1034 = null;
        field1047 = null;
        field1041 = (boolean[][]) null;
        field1045 = null;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(I)V", line = 263)
    public class67(int arg0) {
        this.field1044 = arg0;
        this.field1036 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1042 = new class212(var2);
    }
}
