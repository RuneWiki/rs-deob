import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Lpe;")
    public static class109 field174 = class141.method1120(":trade:", 0);

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field167 = 0;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Lpe;")
    public static class109 field173 = class141.method1120("<br>", 0);

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field172 = 0;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lpe;")
    public static class109 field170 = class141.method1120("rot:", 0);

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Lpe;")
    public static class109 field177 = class141.method1120("sl_stars", 0);

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lbc;")
    public static class11 field180 = new class11(64);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZLba;)V")
    public static final void method67(int arg0, boolean arg1, class9 arg2) {
        int var3 = 28 % ((41 - arg0) / 49);
        if (class15.field381 != null) {
            try {
                class15.field381.method83((byte) -114);
            } catch (Exception var9) {
            }
            class15.field381 = null;
        }
        field168++;
        class15.field381 = arg2;
        class122.method988((byte) 68, arg1);
        class3.field65 = null;
        class15.field390.field309 = 0;
        field167 = 0;
        class46.field968 = null;
        while (true) {
            class152 var4 = (class152) class43.field918.method508(-101);
            if (var4 == null) {
                while (true) {
                    class152 var5 = (class152) class99.field2067.method508(-66);
                    if (var5 == null) {
                        if (class158.field3644 != 0) {
                            try {
                                class13 var6 = new class13(4);
                                var6.method135(4, (byte) -50);
                                var6.method135(class158.field3644, (byte) -50);
                                var6.method134(0, (byte) -98);
                                class15.field381.method87(-102, var6.field279, 4, 0);
                            } catch (IOException var8) {
                                try {
                                    class15.field381.method83((byte) -114);
                                } catch (Exception var7) {
                                }
                                class92.field1992++;
                                class15.field381 = null;
                            }
                        }
                        class101.field2110 = 0;
                        class151.field3317 = class94.method779(-114);
                        return;
                    }
                    class48.field997.method1075(var5, true);
                    class8.field193.method503(-1, var5, var5.field267);
                    class23.field541--;
                    class43.field908++;
                }
            }
            class84.field1779.method503(-1, var4, var4.field267);
            class8.field205++;
            class61.field1248--;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BIII)I")
    public static final int method68(byte arg0, int arg1, int arg2, int arg3) {
        field166++;
        int var4 = arg3 & arg2 - 1;
        int var5 = arg3 / arg2;
        int var6 = -115 / ((arg0 + 5) / 32);
        int var7 = arg1 & arg2 - 1;
        int var8 = arg1 / arg2;
        int var9 = class62.method495(var8, 87, var5);
        int var10 = class62.method495(var8, 87, var5 + 1);
        int var11 = class62.method495(var8 + 1, 87, var5);
        int var12 = class62.method495(var8 + 1, 87, var5 + 1);
        int var13 = class66.method514((byte) -78, var10, var4, var9, arg2);
        int var14 = class66.method514((byte) -78, var12, var4, var11, arg2);
        return class66.method514((byte) -78, var14, var7, var13, arg2);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public static void method69(byte arg0) {
        field180 = null;
        field170 = null;
        field174 = null;
        field173 = null;
        field177 = null;
        if (arg0 != -84) {
            method70(-2);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static final void method70(int arg0) {
        class121.field2673.method173(true);
        field176++;
        for (int var1 = 0; var1 < 32; var1++) {
            class62.field1264[var1] = 0L;
        }
        int var2 = 0;
        int var3 = 65 / ((70 - arg0) / 45);
        while (var2 < 32) {
            class139.field3034[var2] = 0L;
            var2++;
        }
        class64.field1321 = 0;
    }
}
