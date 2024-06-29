import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class46 extends class130 {

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field555 = 0;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "[I")
    public int[] field548;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "[I")
    public int[] field552;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "[I")
    public static int[] field553;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "[I")
    public int[] field558;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "[Lh;")
    public class139[] field546;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "[Lh;")
    public class139[] field549;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "[[[B")
    public byte[][][] field556;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method244(int arg0) {
        field559++;
        if (arg0 != 0) {
            field555 = 117;
        }
        class246.field4381.method135(arg0 + 55);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V")
    public static final void method245(byte arg0) {
        if (arg0 != 46) {
            method245((byte) -41);
        }
        class187.field3284.method1545(0);
        field551++;
        class116.field1675.method36((byte) 5);
        class87.field1283.method36((byte) 5);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static void method246(int arg0) {
        if (arg0 <= -95) {
            field553 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIB)V")
    public static final void method247(int arg0, int arg1, int arg2, byte arg3) {
        field547++;
        if (arg3 != 74 || (class189.field3315 == 0 || arg1 == 0 || class219.field3933 >= 50 || arg0 == -1)) {
            return;
        }
        class82.field1182[class219.field3933] = arg0;
        class129.field1835[class219.field3933] = arg1;
        class146.field2300[class219.field3933] = arg2;
        class11.field130[class219.field3933] = null;
        class210.field3785[class219.field3933] = 0;
        class219.field3933++;
    }
}
