import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class267 extends class128 {

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    public static int field4287 = 0;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "[Lpd;")
    public static class193[] field4286 = new class193[8];

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "C")
    private char field4289;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "Lbf;")
    public static class108 field4296;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "Lre;")
    public static class282 field4291;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "Lkk;")
    public static class67 field4290;

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "Ljava/lang/String;")
    public String field4293;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "[I")
    public static int[] field4285;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "[[Z")
    public static boolean[][] field4284;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Z")
    public final boolean method1751(boolean arg0) {
        field4295++;
        if (!arg0) {
            method1753(83);
        }
        return this.field4289 == 's';
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V")
    public static void method1752(int arg0) {
        field4284 = null;
        field4286 = null;
        field4285 = null;
        field4290 = null;
        int var1 = -80 % ((arg0 + 45) / 33);
        field4296 = null;
        field4291 = null;
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V")
    public static final void method1753(int arg0) {
        if (arg0 != -3) {
            field4286 = null;
        }
        field4288++;
        try {
            if (class159.field2208 == 1) {
                int var1 = class138.field1903.method1858(35);
                if (var1 > 0 && class138.field1903.method1851(arg0 + 76)) {
                    int var2 = var1 - class251.field3915;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class138.field1903.method1861((byte) -70, var2);
                } else {
                    class138.field1903.method1830(true);
                    class138.field1903.method1832(-16257);
                    class243.field3823 = null;
                    class215.field3304 = null;
                    if (class145.field2006 == null) {
                        class159.field2208 = 0;
                    } else {
                        class159.field2208 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class138.field1903.method1830(true);
            class243.field3823 = null;
            class145.field2006 = null;
            class159.field2208 = 0;
            class215.field3304 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)V")
    public static final void method1754(int arg0, byte arg1) {
        if (arg1 < 0) {
            field4287 = 97;
        }
        field4283++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class142.method895(0);
        } else if (arg0 == 2) {
            class102.method651((byte) 111);
        } else if (arg0 == 3) {
            class38.method258((byte) 120);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILbj;I)V")
    private final void method1755(int arg0, class215 arg1, int arg2) {
        field4292++;
        if (arg0 == arg2) {
            this.field4289 = class126.method814(-404579261, arg1.method1350((byte) -126));
        } else if (arg0 == 2) {
            this.field4294 = arg1.method1383((byte) 53);
        } else if (arg0 == 5) {
            this.field4293 = arg1.method1376(-102);
            return;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILbj;)V")
    public final void method1756(int arg0, class215 arg1) {
        if (arg0 != 1) {
            this.method1755(-17, (class215) null, -110);
        }
        field4297++;
        while (true) {
            int var3 = arg1.method1374((byte) -60);
            if (var3 == 0) {
                return;
            }
            this.method1755(var3, arg1, 1);
        }
    }
}
