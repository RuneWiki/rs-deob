import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class class35 extends class282 {

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "Ljf;")
    public static class229 field659 = class212.method1457((byte) 108, "Liste des serveurs charg-Be");

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "Ljf;")
    public static class229 field666 = class212.method1457((byte) 106, "Impossible de trouver ");

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Z")
    public static volatile boolean field660 = true;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "Ljf;")
    public static class229 field665 = class212.method1457((byte) 106, "OK");

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "Ljf;")
    public static class229 field668 = class212.method1457((byte) 63, "violet:");

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public int field667;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V", line = 4)
    public static void method308(byte arg0) {
        field659 = null;
        int var1 = -67 / ((arg0 + 17) / 61);
        field668 = null;
        field666 = null;
        field665 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIII)V", line = 17)
    public final void method309(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field670 << 3;
        if (arg3 != 32244) {
            field660 = false;
        }
        field663++;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        int var8 = this.field662 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method315(var6, var8, var7, var9, arg0, arg4);
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V", line = 56)
    public static final void method311(int arg0) {
        field664++;
        int var1 = class171.field2972.method1396(8, 90);
        if (class132.field2323 > var1) {
            for (int var2 = var1; var2 < class132.field2323; var2++) {
                class274.field4698[class267.field4575++] = class90.field1652[var2];
            }
        }
        if (var1 > class132.field2323) {
            throw new RuntimeException("gppov1");
        }
        int var3 = -31 % ((27 - arg0) / 32);
        class132.field2323 = 0;
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class90.field1652[var4];
            class33 var6 = class192.field3334[var5];
            int var7 = class171.field2972.method1396(1, 9);
            if (var7 == 0) {
                class90.field1652[class132.field2323++] = var5;
                var6.field1962 = class199.field3475;
            } else {
                int var8 = class171.field2972.method1396(2, -127);
                if (var8 == 0) {
                    class90.field1652[class132.field2323++] = var5;
                    var6.field1962 = class199.field3475;
                    class201.field3529[class100.field1762++] = var5;
                } else if (var8 == 1) {
                    class90.field1652[class132.field2323++] = var5;
                    var6.field1962 = class199.field3475;
                    int var9 = class171.field2972.method1396(3, 32);
                    var6.method791(false, (byte) -103, var9);
                    int var10 = class171.field2972.method1396(1, -128);
                    if (var10 == 1) {
                        class201.field3529[class100.field1762++] = var5;
                    }
                } else if (var8 == 2) {
                    class90.field1652[class132.field2323++] = var5;
                    var6.field1962 = class199.field3475;
                    int var11 = class171.field2972.method1396(3, 96);
                    var6.method791(true, (byte) -103, var11);
                    int var12 = class171.field2972.method1396(3, -127);
                    var6.method791(true, (byte) -103, var12);
                    int var13 = class171.field2972.method1396(1, 125);
                    if (var13 == 1) {
                        class201.field3529[class100.field1762++] = var5;
                    }
                } else if (var8 == 3) {
                    class274.field4698[class267.field4575++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILhg;Lhg;IIJ)V", line = 166)
    public static final void method312(int arg0, int arg1, int arg2, int arg3, class174 arg4, class174 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class167 var10 = new class167();
        var10.field2860 = arg8;
        var10.field2868 = arg1 * 128 + 64;
        var10.field2870 = arg2 * 128 + 64;
        var10.field2857 = arg3;
        var10.field2865 = arg4;
        var10.field2874 = arg5;
        var10.field2873 = arg6;
        var10.field2866 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class312.field5246[var11][arg1][arg2] == null) {
                class312.field5246[var11][arg1][arg2] = new class125(var11, arg1, arg2);
            }
        }
        class312.field5246[arg0][arg1][arg2].field2198 = var10;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
    public abstract void method310(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)V")
    public abstract void method313(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
    public abstract void method314(int arg0, int arg1);

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
    public abstract void method316(int arg0, int arg1);

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIIII)V")
    public abstract void method317(int arg0, int arg1, int arg2, int arg3, int arg4);
}
