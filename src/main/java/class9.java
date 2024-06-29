import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class9 extends class134 {

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lpf;")
    public static class17 field171 = new class17(128);

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field182 = 0;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public int field169;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field172;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public int field174;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public int field175;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
    public int field176;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public int field179;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "I")
    public int field180;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lab;Z)V")
    public static final void method58(class249 arg0, boolean arg1) {
        field177++;
        int var2 = arg0.method1819(-1741461848);
        class248.field4150 = new class301[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class248.field4150[var3] = new class301();
            class248.field4150[var3].field4914 = arg0.method1819(-1741461848);
            class248.field4150[var3].field4916 = arg0.method1765(-1);
        }
        class280.field4647 = arg0.method1819(-1741461848);
        class130.field2146 = arg0.method1819(-1741461848);
        class42.field636 = arg0.method1819(-1741461848);
        class187.field2992 = new class208[class130.field2146 + 1 - class280.field4647];
        for (int var4 = 0; var4 < class42.field636; var4++) {
            int var5 = arg0.method1819(-1741461848);
            class208 var6 = class187.field2992[var5] = new class208();
            var6.field1949 = arg0.method1802((byte) 102);
            var6.field1945 = arg0.method1800(-50);
            var6.field3523 = class280.field4647 + var5;
            var6.field3524 = arg0.method1765(-1);
            var6.field3525 = arg0.method1765(-1);
        }
        class236.field3978 = arg0.method1800(83);
        class258.field4339 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
    public static void method59(int arg0) {
        if (arg0 != -15711) {
            field182 = 26;
        }
        field171 = null;
    }
}
