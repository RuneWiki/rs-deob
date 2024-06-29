import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class62 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[I")
    public static int[] field1052 = new int[1000];

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[Lri;")
    public static class36[] field1053 = new class36[0];

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1054 = 0;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lmb;")
    private static class96 field1058 = class243.method1708("Connection lost)3", (byte) 119);

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lmb;")
    public static class96 field1056 = class243.method1708("gr-Un:", (byte) 125);

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Lmb;")
    public static class96 field1055 = field1058;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "I")
    public static int field1063 = 0;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Lmb;")
    public static class96 field1062 = class243.method1708("Liste der Welten geladen", (byte) 92);

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "Lmb;")
    public static class96 field1061 = class243.method1708("", (byte) 127);

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "[Lsi;")
    public static class207[] field1064 = new class207[4];

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "Ljk;")
    public static class236 field1057;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BI)I")
    public abstract int method440(byte arg0, int arg1);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)I")
    public static final int method441(int arg0, int arg1) {
        field1059++;
        if (arg1 != 255) {
            method441(81, 92);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Lea;")
    public abstract class203 method442(int arg0);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(BI)V")
    public abstract void method443(byte arg0, int arg1);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lsa;)V")
    public static final void method444(class70 arg0) {
        for (int var1 = arg0.field1208; var1 <= arg0.field1205; var1++) {
            for (int var2 = arg0.field1204; var2 <= arg0.field1211; var2++) {
                class187 var3 = class259.field4487[arg0.field1198][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3282; var4++) {
                        if (var3.field3274[var4] == arg0) {
                            var3.field3282--;
                            for (int var5 = var4; var5 < var3.field3282; var5++) {
                                var3.field3274[var5] = var3.field3274[var5 + 1];
                                var3.field3268[var5] = var3.field3268[var5 + 1];
                            }
                            var3.field3274[var3.field3282] = null;
                            break;
                        }
                    }
                    var3.field3276 = 0;
                    for (int var6 = 0; var6 < var3.field3282; var6++) {
                        var3.field3276 |= var3.field3268[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(BI)[B")
    public abstract byte[] method445(byte arg0, int arg1);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V")
    public static void method446(boolean arg0) {
        field1058 = null;
        field1052 = null;
        field1057 = null;
        field1061 = null;
        field1055 = null;
        field1053 = null;
        field1064 = null;
        field1062 = null;
        if (arg0) {
            field1055 = null;
        }
        field1056 = null;
    }
}
