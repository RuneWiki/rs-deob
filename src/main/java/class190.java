import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class190 {

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "Lcd;")
    public static class64 field3261 = class44.method335((byte) 71, "<col=ff9040>");

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)Lqd;", line = 10)
    public static final class40 method1341(int arg0) {
        int var1 = class310.field5263[0] * class223.field3811[0];
        byte[] var2 = class58.field969[arg0];
        field3265++;
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class236.field3985[class224.method1614(var2[var4], 255)];
        }
        class40 var5;
        if (class123.field2216) {
            var5 = new class136(class24.field400, class46.field755, class234.field3959[0], class251.field4365[0], class223.field3811[0], class310.field5263[0], var3);
        } else {
            var5 = new class127(class24.field400, class46.field755, class234.field3959[0], class251.field4365[0], class223.field3811[0], class310.field5263[0], var3);
        }
        class251.method1803(-1);
        return var5;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lja;I)V", line = 49)
    public static final void method1342(class60 arg0, int arg1) {
        field3264++;
        if (arg1 != 0) {
            field3269 = 4;
        }
        if (class66.field1308 == arg0.field1143) {
            class249.field4328[arg0.field1097] = true;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([Lnm;[Lvd;Lqm;[Lnm;[Lnm;B[Lnm;)V", line = 64)
    public static final void method1343(class176[] arg0, class127[] arg1, class222 arg2, class176[] arg3, class176[] arg4, byte arg5, class176[] arg6) {
        field3266++;
        class40.field628 = arg6;
        class313.field5317 = arg1;
        client.field4172 = arg2;
        class147.field2597 = arg3;
        class10.field207 = arg4;
        class75.field1413 = arg0;
        class267.field4603.method776((byte) 119);
        int var7 = client.field4172.method1606(52, class222.field3794);
        int[] var8 = client.field4172.method1592(-55, var7);
        int var9 = -122 / ((arg5 - 30) / 41);
        for (int var10 = 0; var10 < var8.length; var10++) {
            class267.field4603.method781(class205.method1432(new class13(client.field4172.method1580(0, var8[var10], var7)), -128), 10751);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 105)
    public static final void method1344(byte arg0) {
        class12.field234 = class58.method447(4, 8, 2048, 0.4F, false, 35, true, 8);
        field3268++;
        if (arg0 != 46) {
            field3262 = 83;
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V", line = 126)
    public static void method1345(byte arg0) {
        if (arg0 >= -100) {
            field3269 = -60;
        }
        field3261 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)Z", line = 140)
    public static final boolean method1346(int arg0, byte arg1) {
        field3267++;
        int var2 = 33 / ((arg1 - 51) / 62);
        return (arg0 & 0x4F9812F5) >> 30 != 0;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)V", line = 154)
    public static final void method1347(int arg0, int arg1, int arg2) {
        field3260++;
        class299 var3 = class158.method1135(arg1, 39, 13);
        var3.method2091(arg0 ^ 0xE193C83D);
        var3.field5153 = arg2;
        if (arg0 != -510408578) {
            field3262 = -66;
        }
    }
}
