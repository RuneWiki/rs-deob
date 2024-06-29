import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class221 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public int field3498;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "J")
    public static long field3504;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Lna;")
    public static class22 field3508;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lug;")
    public static class253 field3495;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[Luj;")
    public static class169[] field3500;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1614(int arg0, int arg1) {
        if (arg0 < -13) {
            field3509++;
            class34 var2 = class91.method656(arg1, -2, 6);
            var2.method306(13);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 18)
    public static void method1615(int arg0) {
        field3508 = null;
        if (arg0 == 33) {
            field3500 = null;
            field3495 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)[Lci;", line = 41)
    public static final class201[] method1616(int arg0) {
        field3505++;
        class201[] var1 = new class201[class230.field3599];
        if (arg0 <= 88) {
            field3495 = (class253) null;
        }
        for (int var2 = 0; var2 < class230.field3599; var2++) {
            var1[var2] = new class201(class243.field3796, class126.field1825, class119.field1659[var2], class206.field3261[var2], class213.field3355[var2], class81.field1103[var2], class207.field3298[var2], class81.field1101);
        }
        class207.method1526(0);
        return var1;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)Lfi;", line = 67)
    public static final class251 method1617(int arg0, int arg1) {
        class251 var2 = (class251) class37.field541.method1351((long) arg1, 63);
        field3501++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class277.field4287.method1813(arg1, arg0, true);
        class251 var4 = new class251();
        if (var3 != null) {
            var4.method1804(arg1, new class6(var3), (byte) 112);
        }
        class37.field541.method1347(var4, (long) arg1, (byte) -99);
        return var4;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lvl;B)V", line = 96)
    public final void method1618(class6 arg0, byte arg1) {
        field3502++;
        while (true) {
            int var3 = arg0.method58(-288140008);
            if (var3 == 0) {
                if (arg1 != -40) {
                    field3503 = 0;
                }
                return;
            }
            this.method1620(var3, arg0, 6);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIIII)V", line = 118)
    public static final void method1619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != 22121) {
            return;
        }
        if (arg0 <= class334.field5205 && arg4 >= class42.field579) {
            boolean var6;
            if (class291.field4490 > arg1) {
                var6 = false;
                arg1 = class291.field4490;
            } else if (arg1 > class210.field3309) {
                arg1 = class210.field3309;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class291.field4490 > arg3) {
                arg3 = class291.field4490;
                var7 = false;
            } else if (class210.field3309 >= arg3) {
                var7 = true;
            } else {
                arg3 = class210.field3309;
                var7 = false;
            }
            if (arg0 >= class42.field579) {
                class256.method1853(class284.field4402[arg0++], arg1, arg2, arg3, 0);
            } else {
                arg0 = class42.field579;
            }
            if (class334.field5205 < arg4) {
                arg4 = class334.field5205;
            } else {
                class256.method1853(class284.field4402[arg4--], arg1, arg2, arg3, arg5 ^ 0x5669);
            }
            if (var6 && var7) {
                for (int var8 = arg0; var8 <= arg4; var8++) {
                    int[] var9 = class284.field4402[var8];
                    var9[arg1] = var9[arg3] = arg2;
                }
            } else if (var6) {
                for (int var10 = arg0; var10 <= arg4; var10++) {
                    class284.field4402[var10][arg1] = arg2;
                }
            } else if (var7) {
                for (int var11 = arg0; var11 <= arg4; var11++) {
                    class284.field4402[var11][arg3] = arg2;
                }
            }
        }
        field3496++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILvl;I)V", line = 222)
    private final void method1620(int arg0, class6 arg1, int arg2) {
        if (arg0 == 1) {
            this.field3507 = arg1.method39((byte) 74);
            this.field3498 = arg1.method58(-288140008);
            this.field3499 = arg1.method58(-288140008);
        }
        field3494++;
        if (arg2 != 6) {
            field3503 = 105;
        }
    }

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V", line = 243)
    public static final void method1621(int arg0) {
        field3506++;
        if (arg0 != -12931) {
            field3503 = 96;
        }
        class81.field1115.method1359(arg0 + 13023);
    }
}
