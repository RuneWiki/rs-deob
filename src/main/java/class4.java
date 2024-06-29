import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 {

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "I")
    public static int field27 = 0;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "I")
    public static int field29 = 1;

    @OriginalMember(owner = "mapview!ba", name = "e", descriptor = "Lv;")
    private static JagString field31 = class1.method2(255, "Overview");

    @OriginalMember(owner = "mapview!ba", name = "d", descriptor = "Lv;")
    public static JagString field30 = class1.method2(255, " )2 ");

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "[[[I")
    public static int[][][] field28;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)V", line = 11)
    public static void method13(byte arg0) {
        field30 = null;
        int var1 = -45 / ((59 - arg0) / 59);
        field28 = null;
        field31 = null;
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "(B)V", line = 33)
    public static final void method14(byte arg0) {
        JavaMouse var1 = Worldmap.field347;
        synchronized (Worldmap.field347) {
            DoublyLinkable.field44 = Worldmap.field363;
            if (arg0 < -36) {
                MillisTimer.field152 = IntHashTable.field49;
                Timer.field402 = GZip.field114;
                MillisTimer.field155 = Js5.field134;
                class18.field163 = Worldmap.field362;
                GameCanvas.field38 = DoublyLinkable.field47;
                Js5.field134 = 0;
            }
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(BZII)Lv;", line = 78)
    public static final JagString method15(byte arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        int var4 = 1;
        for (int var5 = arg3 / arg2; var5 != 0; var5 /= arg2) {
            var4++;
        }
        int var6 = var4;
        if (arg3 < 0 || arg1) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg3 < 0) {
            var7[0] = 45;
        } else if (arg1) {
            var7[0] = 43;
        }
        if (arg0 != 118) {
            field28 = null;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg3 % arg2;
            arg3 /= arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        JagString var10 = new JagString();
        var10.field468 = var6;
        var10.field474 = var7;
        return var10;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I)[Lv;", line = 138)
    public static final JagString[] method16(int arg0) {
        if (arg0 != 13628) {
            field29 = 105;
        }
        return new JagString[] { field31, Linkable.field97, PreciseSleep.field439, MillisTimer.field143, WorldmapOverlay.field374, HashTable.field70, Js5.field133, JagException.field111, class18.field166, WorldmapOverlay.field371, IntHashTable.field51, class18.field157, mapview.field209 };
    }
}
