import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class157 {

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lcf;")
    private class28 field2849 = new class28();

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Ls;")
    public static class194 field2842 = new class194(64);

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lqe;")
    public static class179 field2851 = class206.method1380("sich mit einer anderen Welt zu verbinden)3", (byte) 54);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lee;")
    public static class49 field2850;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILcf;)V")
    public final void method1019(int arg0, class28 arg1) {
        field2845++;
        if (arg1.field615 != null) {
            arg1.method187((byte) 57);
        }
        arg1.field622 = this.field2849.field622;
        if (arg0 < 86) {
            field2848 = 104;
        }
        arg1.field615 = this.field2849;
        arg1.field615.field622 = arg1;
        arg1.field622.field615 = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lcf;")
    public final class28 method1020(int arg0) {
        class28 var2 = this.field2849.field622;
        field2846++;
        if (this.field2849 == var2) {
            return null;
        } else if (arg0 == 1) {
            var2.method187((byte) -112);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(ILcf;)V")
    public final void method1021(int arg0, class28 arg1) {
        field2843++;
        if (arg1.field615 != null) {
            arg1.method187((byte) -111);
        }
        arg1.field622 = this.field2849;
        arg1.field615 = this.field2849.field615;
        if (arg0 != -1) {
            this.method1023(true);
        }
        arg1.field615.field622 = arg1;
        arg1.field622.field615 = arg1;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public static final void method1022(int arg0) {
        field2844++;
        if (arg0 != -1001) {
            method1022(82);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class113.field2118 - 1; var2++) {
                if (class23.field552[var2] < 1000 && class23.field552[var2 + 1] > 1000) {
                    var1 = false;
                    class179 var3 = class23.field567[var2];
                    class23.field567[var2] = class23.field567[var2 + 1];
                    class23.field567[var2 + 1] = var3;
                    class179 var4 = class215.field3993[var2];
                    class215.field3993[var2] = class215.field3993[var2 + 1];
                    class215.field3993[var2 + 1] = var4;
                    int var5 = class2.field21[var2];
                    class2.field21[var2] = class2.field21[var2 + 1];
                    class2.field21[var2 + 1] = var5;
                    int var6 = class109.field2038[var2];
                    class109.field2038[var2] = class109.field2038[var2 + 1];
                    class109.field2038[var2 + 1] = var6;
                    short var7 = class23.field552[var2];
                    class23.field552[var2] = class23.field552[var2 + 1];
                    class23.field552[var2 + 1] = var7;
                    long var8 = class238.field4389[var2];
                    class238.field4389[var2] = class238.field4389[var2 + 1];
                    class238.field4389[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)Lcf;")
    public final class28 method1023(boolean arg0) {
        field2847++;
        class28 var2 = this.field2849.field622;
        if (this.field2849 == var2) {
            return null;
        } else {
            if (arg0) {
                this.field2849 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method1024(byte arg0) {
        field2850 = null;
        field2851 = null;
        int var1 = 104 / ((arg0 + 34) / 47);
        field2842 = null;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class157() {
        this.field2849.field622 = this.field2849;
        this.field2849.field615 = this.field2849;
    }
}
