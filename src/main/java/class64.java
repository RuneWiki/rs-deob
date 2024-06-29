import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class64 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lvc;")
    public static class137 field1348 = class45.method325("Ihre Nachricht an: ", -46);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Z")
    public static volatile boolean field1351 = false;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
    public static boolean field1354 = false;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "J")
    public static long field1357 = 0L;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "Z")
    public static boolean field1355;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BI)Lvc;")
    public static final class137 method465(int arg0, int arg1, byte[] arg2, int arg3) {
        field1356++;
        class137 var4 = new class137();
        var4.field3176 = new byte[arg3];
        var4.field3182 = 0;
        if (arg0 != -1) {
            return null;
        }
        for (int var5 = arg1; var5 < arg1 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field3176[var4.field3182++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
    public static final void method466(boolean arg0) {
        field1352++;
        if (!arg0) {
            method469(64);
        }
        for (class68 var1 = (class68) class73.field1540.method726(0); var1 != null; var1 = (class68) class73.field1540.method731((byte) -117)) {
            if (class28.field627 != var1.field1410 || var1.field1428 < class112.field2667) {
                var1.method776(0);
            } else if (var1.field1409 <= class112.field2667) {
                if (var1.field1422 > 0) {
                    class56 var2 = class125.field2914[var1.field1422 - 1];
                    if (var2 != null && var2.field1672 >= 0 && var2.field1672 < 13312 && var2.field1646 >= 0 && var2.field1646 < 13312) {
                        var1.method483(class112.field2667, var2.field1672, arg0, var2.field1646, class32.method241(var2.field1672, (byte) -121, var1.field1410, var2.field1646) - var1.field1426);
                    }
                }
                if (var1.field1422 < 0) {
                    int var3 = -var1.field1422 - 1;
                    class125 var4;
                    if (class8.field181 == var3) {
                        var4 = class104.field2412;
                    } else {
                        var4 = class102.field2358[var3];
                    }
                    if (var4 != null && var4.field1672 >= 0 && var4.field1672 < 13312 && var4.field1646 >= 0 && var4.field1646 < 13312) {
                        var1.method483(class112.field2667, var4.field1672, true, var4.field1646, class32.method241(var4.field1672, (byte) 75, var1.field1410, var4.field1646) - var1.field1426);
                    }
                }
                var1.method482(class69.field1438, (byte) -85);
                class10.field220.method546(class28.field627, (int) var1.field1417, (int) var1.field1424, (int) var1.field1393, 60, var1, var1.field1425, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method467(byte arg0) {
        if (arg0 == -45) {
            field1348 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
    public static final int method468(int arg0) {
        if (arg0 != -1) {
            method466(true);
        }
        field1353++;
        return class24.field582++;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
    public static final void method469(int arg0) {
        class12.field272 = null;
        class114.field2694 = null;
        class36.field787 = null;
        class75.field1683 = null;
        class127.field3000 = null;
        class98.field2300 = null;
        class134.field3108 = null;
        class84.field1896 = null;
        field1349++;
        if (arg0 == -4373) {
            class11.field239 = null;
            class37.field828 = null;
            class78.field1746 = null;
            class28.field615 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lnb;IIBI)[B")
    public static final byte[] method470(class88 arg0, int arg1, int arg2, byte arg3, int arg4) {
        long var5 = ((long) arg1 << 32) + (long) (arg2 << 16) + (long) (arg2 * 37 - -arg4 & 0xFFFF);
        field1350++;
        int var7 = -17 / ((arg3 - 5) / 50);
        if (class13.field294 != null) {
            class114 var8 = (class114) class13.field294.method758(var5, (byte) -116);
            if (var8 != null) {
                return var8.field2712;
            }
        }
        byte[] var9 = arg0.method668(arg2, -214, arg4);
        if (var9 == null) {
            return null;
        } else {
            if (class13.field294 != null) {
                class13.field294.method760(new class114(var9), 0, var5);
            }
            return var9;
        }
    }
}
