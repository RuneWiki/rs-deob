import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class316 extends class287 {

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Ltl;")
    public class59 field5330;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Ltl;")
    public static class59 field5332 = class85.method639(": ", 9588);

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[I")
    public static int[] field5329;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V", line = 6)
    public static final void method2173(int arg0) {
        class43.method294();
        class84.field1317 = -1;
        class199.field3307 = null;
        class161.method1145((byte) 86);
        field5334++;
        class42.field616.method1005(97);
        class29.field374 = new class78();
        ((class280) class298.field5107).method1972((byte) 14);
        class135.field2230 = new class211[255];
        class135.field2229 = 0;
        class267.method1876();
        class158.method1136();
        class159.method1137(false);
        class245.method1733(arg0 + 2049);
        class233.method1621(true);
        if (arg0 != -2049) {
            field5332 = (class59) null;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class102 var2 = class211.field3438[var1];
            if (var2 != null) {
                var2.field1662 = null;
            }
        }
        if (class55.field815) {
            class158.method1134(104, 104);
        }
        class62.method509((byte) 115, class171.field2824, class34.field502);
        class69.method568(class34.field502, 24840);
        if (class238.field3978 == 5) {
            class64.method531(21924, class34.field502);
        }
        if (class238.field3978 == 10) {
            class20.method136(false, (byte) 110);
        }
        if (class238.field3978 == 30) {
            class286.method1996(30143, 25);
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V", line = 62)
    public static final void method2174(int arg0) {
        field5335++;
        if (!class219.field3556 || arg0 > -23) {
            return;
        }
        class263 var1 = class297.method2067(class27.field362, 114, class39.field588);
        if (var1 != null && var1.field4543 != null) {
            class128 var2 = new class128();
            var2.field2110 = var1;
            var2.field2103 = var1.field4543;
            class299.method2093((byte) 106, var2);
        }
        class219.field3556 = false;
        class140.method1019(var1, (byte) -94);
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V", line = 88)
    public class316() {
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)[Lgg;", line = 92)
    public static final class47[] method2175(byte arg0) {
        field5336++;
        if (arg0 != 5) {
            return (class47[]) null;
        }
        class47[] var1 = new class47[class306.field5183];
        for (int var2 = 0; var2 < class306.field5183; var2++) {
            int var3 = class41.field615[var2] * class236.field3925[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class53.field794[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class284.field4879[class93.method680(255, var5[var6])];
            }
            var1[var2] = new class47(class300.field5123, class165.field2680, class243.field4061[var2], class311.field5274[var2], class41.field615[var2], class236.field3925[var2], var4);
        }
        class133.method974((byte) 125);
        return var1;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ltl;I)V", line = 126)
    public class316(class59 arg0, int arg1) {
        this.field5330 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZ[B)Ltl;", line = 137)
    public static final class59 method2176(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (!arg2) {
            field5332 = (class59) null;
        }
        field5331++;
        class59 var4 = new class59();
        var4.field863 = 0;
        var4.field889 = new byte[arg1];
        for (int var5 = arg0; var5 < (arg0 + arg1); var5++) {
            if (arg3[var5] != 0) {
                var4.field889[var4.field863++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V", line = 183)
    public static final void method2177(int arg0) {
        field5333++;
        class239.field3986 = new class263[class219.field3560.method2048(arg0 ^ 0xFFFFF8FD)][];
        class314.field5317 = new boolean[class219.field3560.method2048(-23643)];
        if (arg0 != 23384) {
            field5329 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(I)V", line = 202)
    public static void method2178(int arg0) {
        field5332 = null;
        if (arg0 != 0) {
            method2175((byte) -102);
        }
        field5329 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)J", line = 213)
    public static final long method2179(int arg0, int arg1, int arg2) {
        class245 var3 = class120.field2010[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4092; var4++) {
            class165 var5 = var3.field4107[var4];
            if ((var5.field2673 >> 29 & 0x3L) == 2L && var5.field2682 == arg1 && var5.field2670 == arg2) {
                return var5.field2673;
            }
        }
        return 0L;
    }
}
