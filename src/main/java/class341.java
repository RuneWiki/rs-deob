import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class341 {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
    public static int[] field5322 = new int[1000];

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[[B")
    public static byte[][] field5320 = new byte[50][];

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Z")
    public static boolean field5318 = false;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Lcc;")
    public static class327 field5323 = new class327(260);

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field5326;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V", line = 10)
    public static final void method2367(int arg0, int arg1, int arg2) {
        class268.field3861 = new class327(arg0);
        class357.field5586 = new class327(arg1);
        field5324++;
        if (arg2 > -35) {
            method2373((byte) -118);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)Lcm;", line = 27)
    public static final class78 method2368(int arg0, int arg1) {
        field5328++;
        class78 var2 = (class78) class321.field4713.method2265((long) arg0, (byte) -89);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -9609) {
            method2372(73, 82, 7, (byte) 75, 41, 6, 111, 24, -14);
        }
        byte[] var3 = class291.field4210.method1089(class264.method1818(arg1 ^ 0xFFFFDA54, arg0), (byte) 125, class156.method1197(arg0, arg1 ^ 0x25CA));
        class78 var4 = new class78();
        if (var3 != null) {
            var4.method556(new class299(var3), (byte) 58);
        }
        class321.field4713.method2257(-126, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 62)
    public static final void method2369(int arg0) {
        if (arg0 < -57) {
            class255.field3729.method2262(false);
            field5319++;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V", line = 73)
    public static final void method2370(int arg0, int arg1) {
        if (arg1 != -1) {
            method2369(-128);
        }
        class210.field2973.method2264((byte) 63, arg0);
        field5326++;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 84)
    public static final void method2371(int arg0) {
        if (arg0 == -6086) {
            class26.field308 = new class333[class284.field4050.method1068(-34)][];
            field5325++;
            class44.field548 = new boolean[class284.field4050.method1068(arg0 ^ 0x17FA)];
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIBIIIII)V", line = 99)
    public static final void method2372(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 > -72) {
            field5318 = false;
        }
        field5329++;
        if (class140.method1081(-48, arg0)) {
            class23.method155(arg4, -1, (byte) -119, arg8, class26.field308[arg0], arg5, arg7, arg1, arg2, arg6);
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class229.field3276[var9] = true;
            }
        } else {
            class229.field3276[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 136)
    public static void method2373(byte arg0) {
        field5323 = null;
        field5320 = (byte[][]) null;
        if (arg0 == 93) {
            field5322 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/lang/String;)V", line = 149)
    public static final void method2374(int arg0, String arg1) {
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        if (arg0 == 50) {
            System.exit(1);
            field5327++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILfd;)V", line = 166)
    public static final void method2375(int arg0, class299 arg1) {
        field5321++;
        int var2 = arg1.method2046((byte) 98);
        class257.field3748 = new class126[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class257.field3748[var3] = new class126();
            class257.field3748[var3].field1682 = arg1.method2046((byte) 98);
            class257.field3748[var3].field1690 = arg1.method2100(6072);
        }
        class74.field974 = arg1.method2046((byte) 98);
        if (arg0 != -31081) {
            return;
        }
        class249.field3621 = arg1.method2046((byte) 98);
        class44.field546 = arg1.method2046((byte) 98);
        class49.field651 = new class196[class249.field3621 + 1 - class74.field974];
        for (int var4 = 0; var4 < class44.field546; var4++) {
            int var5 = arg1.method2046((byte) 98);
            class196 var6 = class49.field651[var5] = new class196();
            var6.field1332 = arg1.method2096((byte) -122);
            var6.field1331 = arg1.method2062(-25795);
            var6.field2712 = class74.field974 + var5;
            var6.field2706 = arg1.method2100(6072);
            var6.field2709 = arg1.method2100(arg0 + 37153);
        }
        class308.field4523 = arg1.method2062(-25795);
        class17.field209 = true;
    }
}
