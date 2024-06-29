import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class97 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public int field1323 = 2;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public int field1320 = 64;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Z")
    public boolean field1329 = false;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public int field1324 = 1;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public int field1330 = 64;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public int field1331 = -1;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Z")
    public boolean field1328 = false;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Lfc;")
    public static class235 field1321 = new class235(76, 17);

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lvw;I)V")
    public static final void method759(class276 arg0, int arg1) {
        arg0.field3877 = false;
        if (arg0.field3875 != null) {
            arg0.field3875.field3700 = 0;
        }
        field1326++;
        int var2 = -8 / ((46 - arg1) / 50);
        for (class276 var3 = arg0.method1673(); var3 != null; var3 = arg0.method1676()) {
            method759(var3, 116);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjr;B)V")
    public final void method760(int arg0, class96 arg1, byte arg2) {
        while (true) {
            int var4 = arg1.method718(-88);
            if (var4 == 0) {
                field1327++;
                if (arg2 != -84) {
                    method762(39);
                    return;
                }
                return;
            }
            this.method761(28955, arg1, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILjr;II)V")
    private final void method761(int arg0, class96 arg1, int arg2, int arg3) {
        if (arg0 != 28955) {
            this.field1331 = -14;
        }
        field1325++;
        if (arg2 == 1) {
            this.field1331 = arg1.method743((byte) -40);
            if (this.field1331 == 65535) {
                this.field1331 = -1;
            }
        } else if (arg2 == 2) {
            this.field1330 = arg1.method743((byte) -46) + 1;
            this.field1320 = arg1.method743((byte) -7) + 1;
        } else if (arg2 == 3) {
            arg1.method748(arg0 - 814005643);
        } else if (arg2 == 4) {
            this.field1323 = arg1.method718(75);
        } else if (arg2 == 5) {
            this.field1324 = arg1.method718(89);
        } else if (arg2 == 6) {
            this.field1329 = true;
        } else if (arg2 == 7) {
            this.field1328 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method762(int arg0) {
        field1321 = null;
        if (arg0 <= 15) {
            method759(null, -17);
        }
    }
}
