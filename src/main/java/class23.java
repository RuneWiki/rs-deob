import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class75 {

    @OriginalMember(owner = "client!da", name = "L", descriptor = "Lod;")
    public class101 field535 = class149.field3394;

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public int field553 = 0;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "Lod;")
    public static class101 field532 = class46.method335(-104, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!da", name = "P", descriptor = "Lod;")
    public static class101 field539 = class46.method335(-104, " loggt sich aus)3");

    @OriginalMember(owner = "client!da", name = "T", descriptor = "I")
    public static int field542 = 2301979;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "Lod;")
    private static class101 field545 = class46.method335(-101, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!da", name = "X", descriptor = "Lod;")
    public static class101 field546 = class46.method335(85, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!da", name = "M", descriptor = "Lod;")
    public static class101 field536 = field545;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "Lod;")
    public static class101 field552 = class46.method335(125, "Weiter");

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "Lod;")
    private static class101 field549 = class46.method335(112, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!da", name = "V", descriptor = "Lod;")
    public static class101 field544 = class46.method335(79, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!da", name = "O", descriptor = "Lod;")
    public static class101 field538 = field549;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field543 = 0;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lod;")
    public static class101 field533 = class46.method335(-122, "<col=ffff00>");

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "Lod;")
    private static class101 field555 = class46.method335(69, "Walk here");

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public static int field541 = 0;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "Lod;")
    public static class101 field559 = field555;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "Lod;")
    private static class101 field537 = class46.method335(99, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "Lod;")
    public static class101 field550 = field537;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "I")
    public int field556;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "Ljava/awt/Frame;")
    public static Frame field547;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[I")
    public static int[] field530;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "[I")
    public int[] field551;

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "[I")
    public int[] field558;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "[Lod;")
    public class101[] field554;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BJ)V")
    public static final void method181(byte arg0, long arg1) {
        field540++;
        if (arg1 == 0L) {
            return;
        }
        if (class101.field2205 >= 100 && field541 != 1 || class101.field2205 >= 200) {
            class111.method818(0, class26.field672, 28960, class64.field1456);
            return;
        }
        class101 var3 = class67.method452(arg0 + 91, arg1).method714(-128);
        if (arg0 != 22) {
            field543 = 20;
        }
        for (int var4 = 0; var4 < class101.field2205; var4++) {
            if (class39.field929[var4] == arg1) {
                class111.method818(0, class26.field672, arg0 ^ 0x7136, class15.method101(97, new class101[] { var3, class53.field1208 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class73.field1579; var5++) {
            if (class29.field768[var5] == arg1) {
                class111.method818(0, class26.field672, arg0 ^ 0x7136, class15.method101(-115, new class101[] { class102.field2253, var3, class64.field1435 }));
                return;
            }
        }
        if (var3.method703(0, class82.field1778.field276)) {
            class111.method818(0, class26.field672, arg0 ^ 0x7136, class2.field28);
            return;
        }
        class31.field796++;
        class35.field899[class101.field2205] = var3;
        class39.field929[class101.field2205] = arg1;
        class78.field1623[class101.field2205] = 0;
        class52.field1179[class101.field2205] = 0;
        class10.field148 = class108.field2306;
        class101.field2205++;
        class17.field364.method419(82, (byte) 0);
        class17.field364.method1087(arg1, -67);
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
    public static void method182(int arg0) {
        field532 = null;
        field546 = null;
        field533 = null;
        field555 = null;
        field539 = null;
        field538 = null;
        if (arg0 != -3) {
            return;
        }
        field544 = null;
        field530 = null;
        field537 = null;
        field552 = null;
        field536 = null;
        field547 = null;
        field549 = null;
        field550 = null;
        field545 = null;
        field559 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILtf;)V")
    public final void method183(int arg0, class138 arg1) {
        if (arg0 != -16191) {
            return;
        }
        field557++;
        while (true) {
            int var3 = arg1.method1055(arg0 + 16302);
            if (var3 == 0) {
                return;
            }
            this.method184(arg1, var3, -4);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ltf;II)V")
    private final void method184(class138 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field556 = arg0.method1055(115);
        } else if (arg1 == 2) {
            this.field531 = arg0.method1055(117);
        } else if (arg1 == 3) {
            this.field535 = arg0.method1058((byte) -115);
        } else if (arg1 == 4) {
            this.field548 = arg0.method1062(1809568712);
        } else if (arg1 == 5) {
            this.field553 = arg0.method1098(true);
            this.field558 = new int[this.field553];
            this.field554 = new class101[this.field553];
            for (int var4 = 0; var4 < this.field553; var4++) {
                this.field558[var4] = arg0.method1062(class39.method295(arg2, -1809568716));
                this.field554[var4] = arg0.method1058((byte) -109);
            }
        } else if (arg1 == 6) {
            this.field553 = arg0.method1098(true);
            this.field551 = new int[this.field553];
            this.field558 = new int[this.field553];
            for (int var5 = 0; var5 < this.field553; var5++) {
                this.field558[var5] = arg0.method1062(1809568712);
                this.field551[var5] = arg0.method1062(arg2 + 1809568716);
            }
        }
        field534++;
        if (arg2 != -4) {
            field533 = null;
        }
    }
}
