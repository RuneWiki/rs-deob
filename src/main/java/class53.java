import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class53 {

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    private int field732 = 0;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "Ljw;")
    private class520 field733;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "[[Z")
    public static boolean[][] field731 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "Lrc;")
    private class504 field736;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)Lrc;", line = 5)
    public final class504 method357(int arg0) {
        if (arg0 != -1337) {
            method361(21);
        }
        this.field732 = 0;
        field730++;
        return this.method358(-1);
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V", line = 56)
    public class53() {
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Ljw;)V", line = 162)
    public class53(class520 arg0) {
        this.field733 = arg0;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)Lrc;", line = 26)
    public final class504 method358(int arg0) {
        field734++;
        if (arg0 > ~this.field732 && this.field733.field6941[this.field732 - 1] != this.field736) {
            class504 var2 = this.field736;
            this.field736 = var2.field6722;
            return var2;
        }
        while (this.field732 < this.field733.field6952) {
            class504 var3 = this.field733.field6941[this.field732++].field6722;
            if (this.field733.field6941[this.field732 - 1] != var3) {
                this.field736 = var3.field6722;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Leh;Z)V", line = 59)
    public static final void method359(class335 arg0, boolean arg1) {
        field737++;
        int var2 = arg0.method1997(-129);
        class6.field184 = new class427[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class6.field184[var3] = new class427();
            class6.field184[var3].field5863 = arg0.method1997(-129);
            class6.field184[var3].field5865 = arg0.method1987(-1);
        }
        class340.field4699 = arg0.method1997(-129);
        class442.field6060 = arg0.method1997(-129);
        class708.field9929 = arg0.method1997(-129);
        class18.field294 = new class233[class442.field6060 + 1 - class340.field4699];
        for (int var4 = 0; var4 < class708.field9929; var4++) {
            int var5 = arg0.method1997(-129);
            class233 var6 = class18.field294[var5] = new class233();
            var6.field706 = arg0.method2034(255);
            var6.field700 = arg0.method2045(-98);
            var6.field3262 = class340.field4699 + var5;
            var6.field3264 = arg0.method1987(-1);
            var6.field3268 = arg0.method1987(-1);
        }
        class444.field6080 = arg0.method2045(-98);
        class400.field5302 = arg1;
    }

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V", line = 103)
    public static final void method360(int arg0) {
        class673.method3765(100);
        field735++;
        class147.field2353 = null;
        class17.field272 = null;
        class108.field1587 = 0;
        class102.field1525 = null;
        class403.field5396 = null;
        class396.field5263 = 0;
        class439.field6039.field4619 = 0;
        class269.field3754 = 0;
        class42.method304(-66);
        class585.method3219(arg0 - 31530);
        for (int var1 = 0; var1 < 2048; var1++) {
            class572.field7601[var1] = null;
        }
        class199.field2897 = null;
        for (int var2 = 0; var2 < class176.field2705; var2++) {
            class287 var4 = class51.field718[var2].field3983;
            if (var4 != null) {
                var4.field5551 = -1;
            }
        }
        class653.method3578(false);
        class140.field2254 = 1;
        class173.field2668 = -1;
        class376.field5068 = -1;
        class472.method2658(19093, 10);
        for (int var3 = 0; var3 < 100; var3++) {
            class511.field6834[var3] = true;
        }
        if (arg0 != 31528) {
            method361(-28);
        }
        class620.method3394((byte) 37);
        class388.field5140 = null;
        class657.field8965 = 0L;
    }

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)V", line = 172)
    public static void method361(int arg0) {
        if (arg0 == 0) {
            field731 = null;
        }
    }
}
