import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class56 extends class166 {

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public int field1311;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "[[S")
    public static short[][] field1308 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lsa;")
    public static class162 field1306 = new class162(50);

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "[I")
    public static int[] field1310 = new int[1000];

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "Lcd;")
    public static class23 field1313 = class54.method414(":chalreq:", -1);

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Lcd;")
    public static class23 field1312 = class54.method414("Ihr Spielkonto wurde deaktiviert)3", -1);

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field1315 = 0;

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Loe;")
    public static class130 field1314;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[Lfa;")
    public static class47[] field1309;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static void method435(int arg0) {
        field1314 = null;
        field1306 = null;
        field1313 = null;
        int var1 = 110 % ((arg0 - 12) / 49);
        field1308 = null;
        field1312 = null;
        field1309 = null;
        field1310 = null;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public static final void method436(int arg0) {
        for (int var1 = 0; var1 < class108.field2307; var1++) {
            int var2 = class160.field3202[var1];
            class57 var3 = class95.field2007[var2];
            int var4 = class81.field1769.method1202(-93);
            if ((var4 & 0x10) != 0) {
                var4 += class81.field1769.method1202(-16) << 8;
            }
            class50.method392(-1, var3, var2, var4);
        }
        if (arg0 < 38) {
            field1308 = null;
        }
        field1307++;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class56() {
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
    public class56(int arg0) {
        this.field1311 = arg0;
    }
}
