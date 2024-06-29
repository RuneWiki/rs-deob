import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class52 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Llc;")
    public static class143 field1021 = class66.method374("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", -1);

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Llc;")
    public static class143 field1024 = class66.method374("Spieler kann nicht gefunden werden: ", -1);

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method316(int arg0) {
        field1025++;
        int var1 = class161.field2902.method798(8, 8);
        if (var1 < class107.field1889) {
            for (int var2 = var1; var2 < class107.field1889; var2++) {
                class155.field2800[class8.field158++] = class30.field467[var2];
            }
        }
        if (class107.field1889 < var1) {
            throw new RuntimeException("gppov1");
        }
        class107.field1889 = 0;
        if (arg0 <= 112) {
            method317((byte) 119);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class30.field467[var3];
            class32 var5 = class6.field97[var4];
            int var6 = class161.field2902.method798(1, 8);
            if (var6 == 0) {
                class30.field467[class107.field1889++] = var4;
                var5.field4146 = class146.field2635;
            } else {
                int var7 = class161.field2902.method798(2, 8);
                if (var7 == 0) {
                    class30.field467[class107.field1889++] = var4;
                    var5.field4146 = class146.field2635;
                    class135.field2379[class268.field4809++] = var4;
                } else if (var7 == 1) {
                    class30.field467[class107.field1889++] = var4;
                    var5.field4146 = class146.field2635;
                    int var8 = class161.field2902.method798(3, 8);
                    var5.method1561(false, var8, 9);
                    int var9 = class161.field2902.method798(1, 8);
                    if (var9 == 1) {
                        class135.field2379[class268.field4809++] = var4;
                    }
                } else if (var7 == 2) {
                    class30.field467[class107.field1889++] = var4;
                    var5.field4146 = class146.field2635;
                    int var10 = class161.field2902.method798(3, 8);
                    var5.method1561(true, var10, 9);
                    int var11 = class161.field2902.method798(3, 8);
                    var5.method1561(true, var11, 9);
                    int var12 = class161.field2902.method798(1, 8);
                    if (var12 == 1) {
                        class135.field2379[class268.field4809++] = var4;
                    }
                } else if (var7 == 3) {
                    class155.field2800[class8.field158++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method317(byte arg0) {
        field1024 = null;
        field1021 = null;
        if (arg0 != -28) {
            field1021 = null;
        }
    }
}
