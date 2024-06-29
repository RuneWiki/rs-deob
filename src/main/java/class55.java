import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public abstract class class55 extends class172 {

    @OriginalMember(owner = "client!df", name = "D", descriptor = "Z")
    public volatile boolean field987 = true;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    public static int field985 = 0;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "Lid;")
    public static class149 field984 = class60.method382("(R", (byte) 71);

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    public static int field993 = 0;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "Lid;")
    public static class149 field986 = class60.method382(" est d-Bj-9 dans votre liste noire)3", (byte) 118);

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "Z")
    public boolean field988;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "Z")
    public boolean field992;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[I")
    public static int[] field991;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(B)I")
    public abstract int method348(byte arg0);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method349(int arg0) {
        if (arg0 > 29) {
            field989++;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public static void method350(int arg0) {
        field986 = null;
        if (arg0 != 21482) {
            field985 = -21;
        }
        field991 = null;
        field984 = null;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(B)Lrh;")
    public static final class46 method351(byte arg0) {
        field994++;
        byte[] var1 = class73.field1276[0];
        int var2 = field991[0] * class283.field5005[0];
        int[] var3 = new int[var2];
        if (arg0 < 9) {
            field991 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class108.field1865[class136.method953(255, var1[var4])];
        }
        class46 var5 = new class46(class251.field4406, class286.field5082, class147.field2651[0], class18.field259[0], class283.field5005[0], field991[0], var3);
        class103.method731(false);
        return var5;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)[B")
    public abstract byte[] method352(int arg0);
}
