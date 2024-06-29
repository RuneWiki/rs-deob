import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!d", name = "k", descriptor = "[Lta;")
    public volatile class176[] field627 = new class176[2];

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Z")
    public volatile boolean field619 = false;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Z")
    public volatile boolean field629 = false;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field626 = 0;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lrf;")
    public static class163 field624 = class53.method392(91, "::fpson");

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Loh;")
    public static class138 field622;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lgg;")
    public class67 field623;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "[[[I")
    public static int[][][] field620;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method204(int arg0) {
        field624 = null;
        if (arg0 < 50) {
            field620 = null;
        }
        field622 = null;
        field620 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Lb;")
    public static final class11 method205(int arg0, int arg1) {
        field617++;
        class11 var2 = (class11) class194.field3810.method401((long) arg0, (byte) -79);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class49.field950.method1235(arg0, (byte) -64, 4);
        if (arg1 != 4081) {
            return null;
        }
        class11 var4 = new class11();
        if (var3 != null) {
            var4.method86(arg0, new class52(var3), -26591);
        }
        class194.field3810.method398(var4, (long) arg0, (byte) 122);
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILrf;)Z")
    public static final boolean method206(int arg0, class163 arg1) {
        field628++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class186.field3717; var2++) {
            if (arg1.method1038(class87.field1891[var2], 0)) {
                return true;
            }
        }
        return arg1.method1038(class56.field1136.field758, 0);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIILs;Ls;IIIIJ)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3, class166 arg4, class166 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class122 var12 = new class122();
        var12.field2573 = arg10;
        var12.field2567 = arg1 * 128 + 64;
        var12.field2577 = arg2 * 128 + 64;
        var12.field2559 = arg3;
        var12.field2579 = arg4;
        var12.field2570 = arg5;
        var12.field2571 = arg6;
        var12.field2564 = arg7;
        var12.field2569 = arg8;
        var12.field2568 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class97.field2054[var13][arg1][arg2] == null) {
                class97.field2054[var13][arg1][arg2] = new class111(var13, arg1, arg2);
            }
        }
        class97.field2054[arg0][arg1][arg2].field2346 = var12;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)V")
    public static final void method208(int arg0, int arg1, byte arg2) {
        field618++;
        if (arg2 >= -115) {
            method206(34, null);
        }
        if (class114.method781(arg1, (byte) -120)) {
            class68.method485(true, arg0, class84.field1798[arg1]);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)V")
    public static final void method209(int arg0, boolean arg1) {
        client.method198((byte) -115);
        field630++;
        class80.field1615++;
        if (class80.field1615 < 50 && !arg1) {
            return;
        }
        class80.field1615 = 0;
        if (!class117.field2474 && class92.field2004 != null) {
            class17.field294++;
            class141.field2896.method326(104, 52);
            try {
                class92.field2004.method697(class141.field2896.field1054, class141.field2896.field1033, (byte) -117, 0);
                class141.field2896.field1033 = 0;
            } catch (IOException var2) {
                class117.field2474 = true;
            }
        }
        if (arg0 != 1927) {
            field626 = -83;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZLfa;)Lrf;")
    public static final class163 method210(boolean arg0, class52 arg1) {
        field625++;
        if (arg0) {
            method205(81, -109);
        }
        return class137.method900(-1, arg1, 32767);
    }

    @OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
    public final void run() {
        field621++;
        this.field629 = true;
        try {
            while (!this.field619) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class176 var2 = this.field627[var1];
                    if (var2 != null) {
                        var2.method1196(false);
                    }
                }
                class25.method151(10L, (byte) 0);
                class89.method621(this.field623, 1001, null);
            }
        } catch (Exception var9) {
            class152.method980(var9, null, true);
        } finally {
            Object var6 = null;
            this.field629 = false;
        }
    }
}
