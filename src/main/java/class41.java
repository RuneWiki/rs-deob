import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!w")
public class class41 {

    @OriginalMember(owner = "mapview!w", name = "c", descriptor = "Lt;")
    public static class36 field538 = class3.method8(13631, "map");

    @OriginalMember(owner = "mapview!w", name = "d", descriptor = "I")
    private static int field539 = 0;

    @OriginalMember(owner = "mapview!w", name = "f", descriptor = "Lt;")
    public static class36 field541 = class3.method8(13631, "50(U");

    @OriginalMember(owner = "mapview!w", name = "g", descriptor = "I")
    public static int field542 = 0;

    @OriginalMember(owner = "mapview!w", name = "e", descriptor = "[J")
    public static long[] field540 = new long[32];

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "B")
    public byte field536;

    @OriginalMember(owner = "mapview!w", name = "h", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "mapview!w", name = "i", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field544;

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "[B")
    public byte[] field537;

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([BB)[B", line = 15)
    public static final byte[] method264(byte[] arg0, byte arg1) {
        class39 var2 = new class39(arg0);
        if (arg1 < 55) {
            field543 = 66;
        }
        int var3 = var2.method256(1795441960);
        int var4 = var2.method255(8080);
        if (var4 < 0 || field539 != 0 && var4 > field539) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method245(var5, (byte) -100, 0, var4);
            return var5;
        } else {
            int var6 = var2.method255(8080);
            if (var6 < 0 || field539 != 0 && var6 > field539) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class12.method75(var7, var6, arg0, var4, 9);
            } else {
                class17.field194.method5(var2, var7, (byte) 113);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(IIBLk;)Z", line = 82)
    public static final boolean method265(int arg0, int arg1, byte arg2, class19 arg3) {
        byte[] var4 = arg3.method103(arg0, arg1, (byte) -127);
        if (var4 == null) {
            return false;
        }
        if (arg2 != 75) {
            field538 = null;
        }
        class17.method91(-115, var4);
        return true;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(I)[Lt;", line = 116)
    public static final class36[] method266(int arg0) {
        return arg0 == 25451 ? new class36[] { class4.field42, class5.field49, class27.field407, class24.field284, class7.field72, mapview.field318, class26.field392, class28.field419, class24.field289, class8.field87, class22.field276, class4.field41, class19.field228, class3.field20, class1.field2, class29.field425, class36.field495, class26.field390, class39.field516, class33.field465, class9.field97, class34.field469, class39.field518, class4.field36, class29.field429, class15.field183, class28.field414, class5.field45, class8.field82, class40.field525, class29.field423, class8.field79, class15.field180, class36.field496, class19.field238, class17.field210, class17.field223, class7.field74, mapview.field373, class20.field249, class28.field415, class9.field90, class9.field98, class20.field255, class15.field176, class9.field92, class9.field96, class33.field466, class22.field277, class24.field279, class24.field286, class6.field64, class14.field170, class7.field73, class29.field431, class3.field21, class21.field263, class21.field268, class8.field81, class21.field266, class34.field478, class21.field269, class39.field515, class26.field402, class39.field515, class9.field101, class39.field515, class32.field455, class4.field31, class39.field515, class33.field463, class26.field396, class22.field273, class21.field261, class19.field237, class39.field515, class34.field473, class4.field37, class9.field100, class39.field515, class39.field515, class39.field515, class39.field515, class39.field515, class39.field515, class39.field515, class39.field515, class39.field515, class39.field515, class39.field515, class39.field515, class39.field515, class24.field285, class39.field515, class39.field515 } : (class36[]) null;
    }

    @OriginalMember(owner = "mapview!w", name = "b", descriptor = "(I)V", line = 142)
    public final void method267(int arg0) {
        boolean var2 = true;
        if (this.field537 != null) {
            this.field536 = this.field537[0];
            for (int var3 = 0; var3 < 4096; var3++) {
                if (this.field537[var3] != this.field536) {
                    var2 = false;
                    break;
                }
            }
            if (var2) {
                this.field537 = null;
            }
        }
        if (arg0 != 0) {
            this.method267(-121);
        }
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "([BBZ)Ljava/lang/Object;", line = 180)
    public static final Object method268(byte[] arg0, byte arg1, boolean arg2) {
        if (arg1 < 69) {
            field539 = 53;
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class28.field413) {
            try {
                class14 var3 = (class14) Class.forName("ga").getDeclaredConstructor().newInstance();
                var3.method85(-1, arg0);
                return var3;
            } catch (Throwable var5) {
                class28.field413 = true;
            }
        }
        return arg2 ? class39.method243(arg0, (byte) 98) : arg0;
    }

    @OriginalMember(owner = "mapview!w", name = "a", descriptor = "(B)V", line = 212)
    public static void method269(byte arg0) {
        field544 = null;
        field538 = null;
        if (arg0 != 113) {
            field539 = 90;
        }
        field540 = null;
        field541 = null;
    }
}
