import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class385 {

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public int field5364;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lph;")
    private class442 field5363;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lvt;")
    public static class344 field5362 = new class344("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I")
    public static final int method2330(int arg0, int arg1) {
        int var2 = -6 / ((arg1 + 5) / 44);
        field5367++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method2331(int arg0) {
        field5362 = null;
        if (arg0 != 255) {
            method2332(26, -2, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2332(int arg0, int arg1, byte arg2) {
        field5365++;
        int var3 = 10 % ((-arg2 - 33) / 53);
        return (arg1 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I")
    public static final int method2333(byte arg0) {
        field5360++;
        if (arg0 != -42) {
            method2332(15, -44, (byte) -19);
        }
        if (class264.field3373) {
            return 6;
        } else if (class84.field1136 == null) {
            return 0;
        } else {
            int var1 = class84.field1136.field3094;
            if (class49.method270((byte) -127, var1)) {
                return 1;
            } else if (class630.method3645(true, var1)) {
                return 2;
            } else if (class318.method1981(15, var1)) {
                return 3;
            } else if (class17.method77(-30195, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5361++;
        this.field5363.method2566(this.field5364, 62);
        super.finalize();
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lph;II)V")
    public class385(class442 arg0, int arg1, int arg2) {
        this.field5364 = arg2;
        this.field5363 = arg0;
    }
}
