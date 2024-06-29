import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class243 extends class141 {

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "Lhi;")
    public static class82 field4228 = class95.method664((byte) -77, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field4229 = 0;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "Lum;")
    public static class222 field4219;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIBIII)V", line = 13)
    public static final void method1743(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class84[] var7 = class101.field1804;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class84 var9 = var7[var8];
            if (var9 != null && var9.field1506 == 2) {
                class194.method1346((var9.field1518 - class230.field3976 << 7) + var9.field1493, arg1, var9.field1510 * 2, -112, (var9.field1495 - class226.field3916 << 7) + var9.field1517, arg5 >> 1, arg2, arg6 >> 1);
                if (class34.field523 > -1 && (class212.field3708 % 20) < 10) {
                    class290.field4872[var9.field1516].method600(arg4 + class34.field523 - 12, class291.field4893 + arg0 + -28);
                }
            }
        }
        if (arg3 < 61) {
            method1746((byte) 21);
        }
        field4223++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)V", line = 43)
    public static final void method1744(byte arg0, int arg1) {
        field4221++;
        if (arg0 != 46) {
            field4227 = 38;
        }
        for (class141 var2 = class68.field1057.method502((byte) -104); var2 != null; var2 = class68.field1057.method494(true)) {
            if (((long) arg1) == (var2.field2418 >> 48 & 0xFFFFL)) {
                var2.method961((byte) 90);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)V", line = 65)
    public static final void method1745(int arg0, int arg1) {
        class309.field5262--;
        field4224++;
        if (class309.field5262 == arg0) {
            return;
        }
        class190.method1324(class327.field5589, arg0 + 1, class327.field5589, arg0, class309.field5262 - arg0);
        class190.method1324(class157.field2727, arg0 + arg1, class157.field2727, arg0, class309.field5262 - arg0);
        class190.method1326(class135.field2333, arg0 + 1, class135.field2333, arg0, class309.field5262 - arg0);
        class190.method1322(class40.field694, arg0 + 1, class40.field694, arg0, class309.field5262 - arg0);
        class190.method1319(class262.field4486, arg0 + 1, class262.field4486, arg0, class309.field5262 - arg0);
        class190.method1319(class28.field375, arg0 + 1, class28.field375, arg0, class309.field5262 - arg0);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V", line = 83)
    public static void method1746(byte arg0) {
        if (arg0 <= -96) {
            field4228 = null;
            field4219 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IJ)V", line = 94)
    public static final void method1747(int arg0, long arg1) {
        if (arg0 > -80) {
            field4229 = -23;
        }
        field4220++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class171.field2964; var3++) {
            if (class144.field2458[var3] == arg1) {
                class171.field2964--;
                for (int var4 = var3; var4 < class171.field2964; var4++) {
                    class144.field2458[var4] = class144.field2458[var4 + 1];
                    class157.field2736[var4] = class157.field2736[var4 + 1];
                }
                class257.field4424++;
                class232.field4012 = class157.field2726;
                class61.field957.method1504(46, -1);
                class61.field957.method1057((byte) 43, arg1);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIII)V", line = 149)
    public static final void method1748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4226++;
        int var7 = arg1 + arg2;
        int var8 = arg0 - arg2;
        int var9 = arg5 + arg2;
        int var10 = arg3 - arg2;
        if (arg6 <= 93) {
            method1743(-60, 10, -48, (byte) -112, 12, 10, 117);
        }
        for (int var11 = arg5; var11 < var9; var11++) {
            class114.method780(90, arg1, arg3, arg4, class73.field1117[var11]);
        }
        for (int var12 = arg0; var12 > var8; var12--) {
            class114.method780(84, arg1, arg3, arg4, class73.field1117[var12]);
        }
        for (int var13 = var9; var13 <= var8; var13++) {
            int[] var14 = class73.field1117[var13];
            class114.method780(-46, arg1, var7, arg4, var14);
            class114.method780(99, var10, arg3, arg4, var14);
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(II)V", line = 198)
    public class243(int arg0, int arg1) {
        this.field4222 = arg0;
        this.field4225 = arg1;
    }
}
