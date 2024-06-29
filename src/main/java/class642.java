import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class642 {

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "[B")
    public static byte[] field9323 = new byte[32896];

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lvt;")
    public static class344 field9325;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lgi;")
    public static class590 field9326;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method3704(int arg0) {
        field9326 = null;
        field9323 = null;
        if (arg0 != 12766) {
            field9327 = 28;
        }
        field9325 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILdg;IBI)V")
    public static final void method3705(int arg0, class20 arg1, int arg2, byte arg3, int arg4) {
        field9320++;
        int var5 = arg1.field419[0];
        int var6 = arg1.field417[0];
        if (var5 < 0 || var5 >= class139.field1760 || var6 < 0 || var6 >= class369.field5135 || arg2 < 0 || class139.field1760 <= arg2 || arg4 < 0 || arg4 >= class369.field5135) {
            return;
        }
        int var7 = class543.method3009(0, arg1.method104((byte) -92), var6, 0, -4, class588.field8511, true, arg4, 0, -1, 0, class15.field154[arg1.field6358], var5, class307.field3934, arg2);
        if (var7 < 1) {
            return;
        }
        if (arg0 != 6410) {
            field9323 = null;
        }
        if (var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg1.method107(-32610, arg3, class588.field8511[var8], class307.field3934[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static final void method3706(int arg0) {
        class272.field3457.method3071(-52, class293.field3813.method2066((byte) -121));
        field9321++;
        class272.field3457.method3071(-106, class260.field3215.method2066((byte) -112));
        class272.field3457.method3071(-27, class544.field7588.method2066((byte) -121));
        class272.field3457.method3071(-86, class135.field1650.method2066((byte) -113));
        if (arg0 <= 91) {
            return;
        }
        class272.field3457.method3071(-29, class35.field547.method2066((byte) -128));
        class272.field3457.method3071(-110, class277.field3612.method2066((byte) -121));
        class272.field3457.method3071(-38, class251.field3143.method2066((byte) -114));
        class272.field3457.method3071(-104, class245.field3104.method2066((byte) -113));
        class272.field3457.method3071(-122, class24.field433.method2066((byte) -126));
        class272.field3457.method3071(-56, class426.field5766.method2066((byte) -119));
        class272.field3457.method3071(-80, class34.field517.method2066((byte) -97));
        class272.field3457.method3071(-112, class130.field1602.method2066((byte) -97));
        class272.field3457.method3071(-38, class29.field466.method2066((byte) -107));
        class272.field3457.method3071(-83, class532.field7434.method2066((byte) -98));
        class272.field3457.method3071(-41, class592.field8546.method2066((byte) -97));
        class272.field3457.method3071(-117, class546.field7612.method2066((byte) -107));
        class272.field3457.method3071(-29, class193.field2508.method2066((byte) -101));
        class272.field3457.method3071(-128, class136.field1666.method2066((byte) -116));
        class272.field3457.method3071(-31, class239.field3056.method2066((byte) -117));
        class272.field3457.method3071(-105, class98.field1317.method2066((byte) -125));
        class272.field3457.method3071(-37, class558.field7809.method2066((byte) -112));
        class272.field3457.method3071(-107, class431.field5876.method2066((byte) -111));
        class272.field3457.method3071(-125, class20.field294.method2066((byte) -127));
        class272.field3457.method3071(-44, class154.field2007.method2066((byte) -102));
        class272.field3457.method3071(-103, class540.field7558.method2066((byte) -113));
        class272.field3457.method3071(-42, class480.field6727.method2066((byte) -115));
        class272.field3457.method3071(-106, class107.field1383.method2066((byte) -103));
        class272.field3457.method3071(-81, class580.field8084.method2066((byte) -125));
        class272.field3457.method3071(-92, class468.field6640.method2066((byte) -114));
        class272.field3457.method3071(-95, class558.field7807.method2066((byte) -105));
        class272.field3457.method3071(-101, class628.field9176.method2066((byte) -122));
        class272.field3457.method3071(-125, class615.field8870.method2066((byte) -122));
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
    public static final int method3707(int arg0, int arg1) {
        field9322++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        }
        if (arg0 != 19512) {
            field9323 = null;
        }
        if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static final void method3708(int arg0) {
        if (arg0 != -24507) {
            method3708(-8);
        }
        field9324++;
        if (class595.field8584 < 0) {
            return;
        }
        long var1 = class348.method2175(arg0 + 24379);
        class595.field8584 = (int) ((long) class595.field8584 - (var1 - class249.field3129));
        if (class595.field8584 <= 0) {
            class100.field1336 = class436.field5933.field3396;
            class483.field6759 = class436.field5933.field3397;
            class251.field3142 = class436.field5933.field3403;
            class9.field80 = class436.field5933.field3398;
            class595.field8584 = -1;
            class510.field7108 = class436.field5933.field3411;
            class343.field4764 = class436.field5933.field3412;
            class21.field302 = class436.field5933.field3409;
            class435.field5911 = class436.field5933.field3410;
            class536.field7480 = class436.field5933.field3407;
            class250.field3137 = class436.field5933.field3402;
        } else {
            int var3 = (class595.field8584 << 8) / class57.field751;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class21.field302 = ((class268.field3417 & 0xFF00) * var3 + (class436.field5933.field3409 & 0xFF00) * var4 & 0xFF0000) + ((class268.field3417 & 0xFF00FF) * var3 + (class436.field5933.field3409 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class251.field3142 = (class436.field5933.field3403 - class247.field3113) * var6 + class247.field3113;
            class536.field7480 = ((class513.field7137 & 0xFF00FF) * var3 + ((class436.field5933.field3407 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class513.field7137 & 0xFF00) * var3 + (class436.field5933.field3407 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class483.field6759 = (class436.field5933.field3397 - class463.field6596) * var6 + class463.field6596;
            class100.field1336 = (class436.field5933.field3396 - class96.field1291) * var6 + class96.field1291;
            class250.field3137 = class553.field7738 * var3 + class436.field5933.field3402 * var4 >> 8;
            class343.field4764 = (class436.field5933.field3412 - class380.field5316) * var6 + class380.field5316;
            class9.field80 = (class436.field5933.field3398 - class463.field6587) * var6 + class463.field6587;
            class435.field5911 = (class436.field5933.field3410 - class135.field1656) * var6 + class135.field1656;
            if (class224.field2868 != class436.field5933.field3411) {
                class510.field7108 = class453.field6425.method931(class224.field2868, class436.field5933.field3411, var6, class510.field7108);
            }
        }
        class249.field3129 = var1;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field9323[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + (var2 * var2 + 65535)) / 65535.0F))));
            }
        }
        field9325 = new class344(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");
    }
}
