import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class307 {

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Z")
    public boolean field4517 = true;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field4516 = new String[100];

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lpn;")
    public static class72 field4521 = new class72(20, 6);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "C")
    private char field4518;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public int field4519;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lrg;")
    public static class395 field4514;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Ljava/lang/String;")
    public String field4520;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILvt;)V")
    public final void method1909(int arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method895((byte) -110);
            if (var3 == 0) {
                field4524++;
                if (arg0 != -1) {
                    this.field4519 = -106;
                    return;
                }
                return;
            }
            this.method1914(arg1, -21076, var3);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)B")
    public static final byte method1910(int arg0, int arg1, int arg2) {
        field4522++;
        if (arg0 == 9) {
            if (arg2 > -69) {
                method1913(false);
            }
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)V")
    public static final void method1911(int arg0, int arg1, int arg2, int arg3) {
        class263 var4 = class293.field4356[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class183 var5 = var4.field3784;
        class183 var6 = var4.field3782;
        if (var5 != null) {
            var5.field2354 = var5.field2354 * arg3 / 16;
            var5.field2359 = var5.field2359 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field2354 = var6.field2354 * arg3 / 16;
            var6.field2359 = var6.field2359 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method1912(int arg0) {
        field4514 = null;
        field4516 = null;
        field4521 = null;
        int var1 = -126 % ((48 - arg0) / 46);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public static final void method1913(boolean arg0) {
        if (arg0) {
            return;
        }
        for (int var1 = 0; var1 < class356.field5112; var1++) {
            int var2 = class25.field353[var1];
            class137 var3 = class448.field6366[var2];
            if (var3 != null) {
                class58.method299((byte) -112, var3, var3.field1643.field6695);
            }
        }
        field4512++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lvt;II)V")
    private final void method1914(class179 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field4518 = class437.method2598(arg0.method922(32429), (byte) -49);
        } else if (arg2 == 2) {
            this.field4519 = arg0.method939((byte) 79);
        } else if (arg2 == 4) {
            this.field4517 = false;
        } else if (arg2 == 5) {
            this.field4520 = arg0.method907(-27652);
        }
        field4523++;
        if (arg1 != -21076) {
            this.field4518 = '\u0007';
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
    public final boolean method1915(int arg0) {
        field4515++;
        if (arg0 == 115) {
            return this.field4518 == 's';
        } else {
            return true;
        }
    }
}
