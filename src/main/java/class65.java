import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class65 extends class212 {

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "Lqe;")
    public static class168 field922 = class66.method448("(U", 11);

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "Ljh;")
    public static class2 field910 = new class2(32);

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public int field920;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "Lgd;")
    public static class65 field919;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIII)V")
    public abstract void method71(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V")
    public abstract void method77(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Loe;I)V")
    public static final void method441(class256 arg0, int arg1) {
        field916++;
        class196.field3403 = arg0;
        class3.field30 = class196.field3403.method1694(arg1, 28851);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public abstract void method61(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)V")
    public abstract void method76(int arg0, int arg1);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIII)V")
    public abstract void method80(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIIII)V")
    public final void method442(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field911 << 3;
        field915++;
        int var7 = this.field917 << 3;
        int var8 = (arg3 << 4) + (var6 & 0xF);
        int var9 = (arg4 << 4) + (var7 & 0xF);
        this.method71(var7, var6, var9, var8, arg0, arg2);
        if (arg1 != 0) {
            this.field917 = 94;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lmj;I)V")
    public static final void method443(class129 arg0, int arg1) {
        if (class115.field1880 == arg0.field2219) {
            class194.field3372[arg0.field2140] = true;
        }
        field918++;
        if (arg1 != 0) {
            method444(-126, 58);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
    public static final void method444(int arg0, int arg1) {
        field913++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class228.field3876[arg1];
        int var3 = class35.field436[arg1];
        int var4 = (int) class3.field40[arg1];
        long var5 = class3.field40[arg1];
        int var7 = class51.field701[arg1];
        if (var7 >= 2000) {
            var7 -= 2000;
        }
        if (var7 == 33) {
            class185.field3249++;
            boolean var8 = class88.method585(2, 0, var2, 0, 0, 0, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 0);
            if (!var8) {
                class88.method585(2, 0, var2, 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 1);
            }
            class163.field2792 = 2;
            class57.field782 = class198.field3422;
            class147.field2555 = 0;
            class214.field3703 = class9.field97;
            class87.field1348.method672(164, 238);
            class87.field1348.method735((byte) 33, var4);
            class87.field1348.method753(class246.field4261 + var2, -242005080);
            class87.field1348.method735((byte) 33, class125.field2060 + var3);
        }
        if (var7 == 11 && class211.field3644 == null) {
            class190.method1226(var2, (byte) -70, var3);
            class211.field3644 = class58.method404(var2, false, var3);
            method443(class211.field3644, 0);
        }
        if (var7 == 13) {
            class222 var10 = class229.field3898[var4];
            if (var10 != null) {
                class139.field2453++;
                class88.method585(2, 0, var10.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var10.field219[0], (byte) 26, 1);
                class147.field2555 = 0;
                class57.field782 = class198.field3422;
                class163.field2792 = 2;
                class214.field3703 = class9.field97;
                class87.field1348.method672(182, 238);
                class87.field1348.method726(var4, (byte) 45);
            }
        }
        if (var7 == 41) {
            class222 var11 = class229.field3898[var4];
            if (var11 != null) {
                class193.field3368++;
                class88.method585(2, 0, var11.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var11.field219[0], (byte) 26, 1);
                class147.field2555 = 0;
                class214.field3703 = class9.field97;
                class163.field2792 = 2;
                class57.field782 = class198.field3422;
                class87.field1348.method672(45, 238);
                class87.field1348.method755(6, class129.field2228);
                class87.field1348.method738(class222.field3806, true);
                class87.field1348.method735((byte) 33, var4);
                class87.field1348.method755(-124, class104.field1676);
            }
        }
        if (var7 == 50) {
            class87.field1348.method672(189, 238);
            class186.field3276++;
            class87.field1348.method735((byte) 33, var2);
            class87.field1348.method726(var4, (byte) 85);
            class87.field1348.method738(var3, true);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 127);
            class19.field232 = var2;
        }
        if (var7 == 38) {
            class18.field205++;
            class115.method793(var2, var3, 8371, var5);
            class87.field1348.method672(191, 238);
            class87.field1348.method755(51, class246.field4261 + var2);
            class87.field1348.method735((byte) 33, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class87.field1348.method755(-120, var3 + class125.field2060);
        }
        if (var7 == 2) {
            class34.field424++;
            boolean var12 = class88.method585(2, 0, var2, 0, 0, 0, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 0);
            if (!var12) {
                class88.method585(2, 0, var2, 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 1);
            }
            class147.field2555 = 0;
            class163.field2792 = 2;
            class214.field3703 = class9.field97;
            class57.field782 = class198.field3422;
            class87.field1348.method672(108, 238);
            class87.field1348.method753(class246.field4261 + var2, -242005080);
            class87.field1348.method726(var3 + class125.field2060, (byte) 109);
            class87.field1348.method735((byte) 33, var4);
        }
        if (var7 == 1) {
            class197.field3411++;
            class87.field1348.method672(52, 238);
            class87.field1348.method770(var3, (byte) -10);
            class87.field1348.method755(89, var4);
            class87.field1348.method753(var2, -242005080);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 126);
            class19.field232 = var2;
        }
        if (var7 == 7 || var7 == 1007) {
            class42.method283(var4, var3, class125.field2052[arg1], var2, true);
        }
        if (var7 == 47) {
            class222 var14 = class229.field3898[var4];
            if (var14 != null) {
                class1.field4++;
                class88.method585(2, 0, var14.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var14.field219[0], (byte) 26, 1);
                class163.field2792 = 2;
                class214.field3703 = class9.field97;
                class147.field2555 = 0;
                class57.field782 = class198.field3422;
                class87.field1348.method672(62, 238);
                class87.field1348.method726(var4, (byte) 79);
            }
        }
        if (var7 == 9) {
            class120.field1961++;
            boolean var15 = class88.method585(2, 0, var2, 0, 0, 0, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 0);
            if (!var15) {
                class88.method585(2, 0, var2, 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 1);
            }
            class147.field2555 = 0;
            class214.field3703 = class9.field97;
            class57.field782 = class198.field3422;
            class163.field2792 = 2;
            class87.field1348.method672(5, 238);
            class87.field1348.method738(class116.field1901, true);
            class87.field1348.method755(-120, var4);
            class87.field1348.method735((byte) 33, class125.field2060 + var3);
            class87.field1348.method726(class96.field1520, (byte) 91);
            class87.field1348.method735((byte) 33, class246.field4261 + var2);
        }
        if (var7 == 42) {
            class209.field3633++;
            class87.field1348.method672(212, 238);
            class87.field1348.method735((byte) 33, var4);
            class87.field1348.method735((byte) 33, var2);
            class87.field1348.method770(var3, (byte) -10);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 127);
            class19.field232 = var2;
        }
        if (var7 == 46) {
            class252.method1658((byte) 86);
            class129 var17 = class257.method1713(var3, 126);
            class222.field3806 = var3;
            class190.field3311 = 1;
            class104.field1676 = var2;
            class129.field2228 = var4;
            method443(var17, 0);
            class117.field1911 = class50.method347(2, new class168[] { class85.field1328, class151.method1005(520, var4).field4167, class143.field2514 });
            if (class117.field1911 == null) {
                class117.field1911 = class150.field2617;
            }
            return;
        }
        if (var7 == 22) {
            class199.field3442++;
            class115.method793(var2, var3, 8371, var5);
            class87.field1348.method672(36, 238);
            class87.field1348.method753(Integer.MAX_VALUE & (int) (var5 >>> 32), -242005080);
            class87.field1348.method755(-125, class125.field2060 + var3);
            class87.field1348.method735((byte) 33, var2 + class246.field4261);
        }
        if (var7 == 16) {
            class222 var18 = class229.field3898[var4];
            if (var18 != null) {
                class3.field26++;
                class88.method585(2, 0, var18.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var18.field219[0], (byte) 26, 1);
                class163.field2792 = 2;
                class147.field2555 = 0;
                class57.field782 = class198.field3422;
                class214.field3703 = class9.field97;
                class87.field1348.method672(173, 238);
                class87.field1348.method755(-3, var4);
            }
        }
        if (var7 == 51) {
            class115.method794(class196.field3401, var2, var3);
        }
        if (var7 == 48) {
            class222 var19 = class229.field3898[var4];
            if (var19 != null) {
                class21.field246++;
                class88.method585(2, 0, var19.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var19.field219[0], (byte) 26, 1);
                class147.field2555 = 0;
                class57.field782 = class198.field3422;
                class163.field2792 = 2;
                class214.field3703 = class9.field97;
                class87.field1348.method672(131, 238);
                class87.field1348.method735((byte) 33, class96.field1520);
                class87.field1348.method775(-124, class116.field1901);
                class87.field1348.method726(var4, (byte) 76);
            }
        }
        if (var7 == 25) {
            class222 var20 = class229.field3898[var4];
            if (var20 != null) {
                class88.method585(2, 0, var20.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var20.field219[0], (byte) 26, 1);
                class57.field782 = class198.field3422;
                class163.field2792 = 2;
                class147.field2555 = 0;
                class214.field3703 = class9.field97;
                class153.field2665++;
                class87.field1348.method672(172, 238);
                class87.field1348.method726(var4, (byte) 127);
            }
        }
        if (var7 == 12) {
            class121 var21 = class104.field1677[var4];
            if (var21 != null) {
                class88.method585(2, 0, var21.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var21.field219[0], (byte) 26, 1);
                class57.field782 = class198.field3422;
                class163.field2792 = 2;
                class214.field3703 = class9.field97;
                class128.field2120++;
                class147.field2555 = 0;
                class87.field1348.method672(206, 238);
                class87.field1348.method726(var4, (byte) 125);
            }
        }
        if (var7 == 32) {
            class121 var22 = class104.field1677[var4];
            if (var22 != null) {
                class88.method585(2, 0, var22.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var22.field219[0], (byte) 26, 1);
                class214.field3703 = class9.field97;
                class163.field2792 = 2;
                class147.field2555 = 0;
                class16.field143++;
                class57.field782 = class198.field3422;
                class87.field1348.method672(19, 238);
                class87.field1348.method770(class116.field1901, (byte) -10);
                class87.field1348.method726(var4, (byte) 80);
                class87.field1348.method735((byte) 33, class96.field1520);
            }
        }
        if (var7 == 28) {
            class87.field1348.method672(133, 238);
            class87.field1348.method753(var2, -242005080);
            class55.field760++;
            class87.field1348.method753(var4, -242005080);
            class87.field1348.method770(var3, (byte) -10);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 127);
            class19.field232 = var2;
        }
        if (var7 == 37) {
            class244.field4234++;
            boolean var23 = class88.method585(2, 0, var2, 0, 0, 0, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 0);
            if (!var23) {
                class88.method585(2, 0, var2, 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 1);
            }
            class163.field2792 = 2;
            class214.field3703 = class9.field97;
            class147.field2555 = 0;
            class57.field782 = class198.field3422;
            class87.field1348.method672(143, 238);
            class87.field1348.method735((byte) 33, class125.field2060 + var3);
            class87.field1348.method735((byte) 33, class246.field4261 + var2);
            class87.field1348.method726(var4, (byte) 97);
        }
        if (var7 == 26) {
            class121 var25 = class104.field1677[var4];
            if (var25 != null) {
                class137.field2419++;
                class88.method585(2, 0, var25.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var25.field219[0], (byte) 26, 1);
                class147.field2555 = 0;
                class57.field782 = class198.field3422;
                class163.field2792 = 2;
                class214.field3703 = class9.field97;
                class87.field1348.method672(127, 238);
                class87.field1348.method755(88, var4);
            }
        }
        if (var7 == 3) {
            class104.field1670++;
            boolean var26 = class88.method585(2, 0, var2, 0, 0, 0, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 0);
            if (!var26) {
                class88.method585(2, 0, var2, 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 1);
            }
            class214.field3703 = class9.field97;
            class57.field782 = class198.field3422;
            class163.field2792 = 2;
            class147.field2555 = 0;
            class87.field1348.method672(56, 238);
            class87.field1348.method755(-120, class129.field2228);
            class87.field1348.method753(class104.field1676, -242005080);
            class87.field1348.method755(48, class125.field2060 + var3);
            class87.field1348.method726(var2 + class246.field4261, (byte) 100);
            class87.field1348.method753(var4, -242005080);
            class87.field1348.method770(class222.field3806, (byte) -10);
        }
        if (var7 == 58) {
            class87.field1348.method672(250, 238);
            class99.field1575++;
            class87.field1348.method775(26, class116.field1901);
            class87.field1348.method738(var3, true);
            class87.field1348.method753(var2, -242005080);
            class87.field1348.method755(99, class96.field1520);
        }
        if (var7 == 17) {
            class176.method1164(97);
        }
        if (var7 == 21 && class115.method793(var2, var3, 8371, var5)) {
            class193.field3369++;
            class87.field1348.method672(111, 238);
            class87.field1348.method745(-1529536968, class116.field1901);
            class87.field1348.method753(var3 + class125.field2060, -242005080);
            class87.field1348.method735((byte) 33, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class87.field1348.method755(-122, class96.field1520);
            class87.field1348.method755(55, var2 + class246.field4261);
        }
        if (var7 == 15) {
            class222 var28 = class229.field3898[var4];
            if (var28 != null) {
                class230.field3916++;
                class88.method585(2, 0, var28.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var28.field219[0], (byte) 26, 1);
                class163.field2792 = 2;
                class57.field782 = class198.field3422;
                class147.field2555 = 0;
                class214.field3703 = class9.field97;
                class87.field1348.method672(28, 238);
                class87.field1348.method753(var4, -242005080);
            }
        }
        if (var7 == 40) {
            class115.method793(var2, var3, 8371, var5);
            class87.field1348.method672(35, 238);
            class182.field3226++;
            class87.field1348.method755(95, class246.field4261 + var2);
            class87.field1348.method726(class125.field2060 + var3, (byte) 48);
            class87.field1348.method753(Integer.MAX_VALUE & (int) (var5 >>> 32), -242005080);
        }
        if (var7 == 20) {
            class87.field1348.method672(174, 238);
            class87.field1348.method770(var3, (byte) -10);
            class129 var29 = class257.method1713(var3, 127);
            class255.field4417++;
            if (var29.field2248 != null && var29.field2248[0][0] == 5) {
                int var30 = var29.field2248[0][1];
                class92.field1441[var30] = 1 - class92.field1441[var30];
                class19.method100(var30, 121);
            }
        }
        if (var7 == 24) {
            class87.field1348.method672(98, 238);
            class87.field1348.method726(var2, (byte) 57);
            class87.field1348.method775(12, var3);
            class143.field2520++;
            class87.field1348.method726(var4, (byte) 75);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 127);
            class19.field232 = var2;
        }
        if (var7 == 6 && class115.method793(var2, var3, 8371, var5)) {
            class87.field1348.method672(204, 238);
            class87.field1348.method755(-125, class246.field4261 + var2);
            class87.field1348.method735((byte) 33, class104.field1676);
            class119.field1948++;
            class87.field1348.method745(-1529536968, class222.field3806);
            class87.field1348.method726(class129.field2228, (byte) 99);
            class87.field1348.method753(class125.field2060 + var3, -242005080);
            class87.field1348.method726(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) 51);
        }
        if (var7 == 35) {
            class115.method793(var2, var3, 8371, var5);
            class13.field115++;
            class87.field1348.method672(193, 238);
            class87.field1348.method753(class246.field4261 + var2, -242005080);
            class87.field1348.method753(class125.field2060 + var3, -242005080);
            class87.field1348.method755(114, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var7 == 44) {
            class121 var31 = class104.field1677[var4];
            if (var31 != null) {
                class88.method585(2, 0, var31.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var31.field219[0], (byte) 26, 1);
                class120.field1959++;
                class147.field2555 = 0;
                class57.field782 = class198.field3422;
                class163.field2792 = 2;
                class214.field3703 = class9.field97;
                class87.field1348.method672(148, 238);
                class87.field1348.method726(var4, (byte) 44);
            }
        }
        if (var7 == 5) {
            class121 var32 = class104.field1677[var4];
            if (var32 != null) {
                class88.method585(2, 0, var32.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var32.field219[0], (byte) 26, 1);
                class163.field2792 = 2;
                class214.field3703 = class9.field97;
                class147.field2555 = 0;
                class57.field782 = class198.field3422;
                class87.field1348.method672(125, 238);
                class87.field1348.method755(-128, var4);
                class233.field3967++;
                class87.field1348.method738(class222.field3806, true);
                class87.field1348.method755(53, class104.field1676);
                class87.field1348.method755(-122, class129.field2228);
            }
        }
        if (var7 == 4) {
            class121 var33 = class104.field1677[var4];
            if (var33 != null) {
                class38.field516++;
                class88.method585(2, 0, var33.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var33.field219[0], (byte) 26, 1);
                class214.field3703 = class9.field97;
                class147.field2555 = 0;
                class57.field782 = class198.field3422;
                class163.field2792 = 2;
                class87.field1348.method672(21, 238);
                class87.field1348.method735((byte) 33, var4);
            }
        }
        if (var7 == 23) {
            class186.field3281++;
            class87.field1348.method672(94, 238);
            class87.field1348.method726(class96.field1520, (byte) 122);
            class87.field1348.method753(var2, -242005080);
            class87.field1348.method775(-94, var3);
            class87.field1348.method770(class116.field1901, (byte) -10);
            class87.field1348.method735((byte) 33, var4);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 126);
            class19.field232 = var2;
        }
        if (var7 == 45) {
            class167.field2848++;
            class87.field1348.method672(81, 238);
            class87.field1348.method755(104, var2);
            class87.field1348.method770(var3, (byte) -10);
            class87.field1348.method726(var4, (byte) 101);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 127);
            class19.field232 = var2;
        }
        if (var7 == 34) {
            class121 var34 = class104.field1677[var4];
            if (var34 != null) {
                class59.field808++;
                class88.method585(2, 0, var34.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var34.field219[0], (byte) 26, 1);
                class163.field2792 = 2;
                class57.field782 = class198.field3422;
                class214.field3703 = class9.field97;
                class147.field2555 = 0;
                class87.field1348.method672(239, 238);
                class87.field1348.method753(var4, -242005080);
            }
        }
        if (var7 == 19) {
            class148.field2577++;
            class87.field1348.method672(42, 238);
            class87.field1348.method770(var3, (byte) -10);
            class87.field1348.method755(-122, var2);
            class87.field1348.method755(40, var4);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 127);
            class19.field232 = var2;
        }
        if (var7 == 8) {
            class8.field94++;
            class87.field1348.method672(29, 238);
            class87.field1348.method753(var4, -242005080);
            class87.field1348.method745(-1529536968, class222.field3806);
            class87.field1348.method735((byte) 33, class129.field2228);
            class87.field1348.method753(class104.field1676, -242005080);
            class87.field1348.method753(var2, -242005080);
            class87.field1348.method738(var3, true);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 127);
            class19.field232 = var2;
        }
        if (var7 == 1005) {
            class115.method793(var2, var3, 8371, var5);
            class131.field2302++;
            class87.field1348.method672(75, 238);
            class87.field1348.method755(-128, class246.field4261 + var2);
            class87.field1348.method726(class125.field2060 + var3, (byte) 67);
            class87.field1348.method755(6, (int) (var5 >>> 32) & Integer.MAX_VALUE);
        }
        if (var7 == 36) {
            class121 var35 = class104.field1677[var4];
            if (var35 != null) {
                class125.field2057++;
                class88.method585(2, 0, var35.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var35.field219[0], (byte) 26, 1);
                class163.field2792 = 2;
                class57.field782 = class198.field3422;
                class214.field3703 = class9.field97;
                class147.field2555 = 0;
                class87.field1348.method672(130, 238);
                class87.field1348.method726(var4, (byte) 66);
            }
        }
        if (var7 == 18) {
            class87.field1348.method672(158, 238);
            class63.field866++;
            class87.field1348.method753(var2, -242005080);
            class87.field1348.method775(-114, var3);
            class87.field1348.method755(-119, var4);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 126);
            class19.field232 = var2;
        }
        if (var7 == 1001) {
            class163.field2792 = 2;
            class214.field3703 = class9.field97;
            class147.field2555 = 0;
            class57.field782 = class198.field3422;
            class222 var36 = class229.field3898[var4];
            if (var36 != null) {
                class180 var37 = var36.field3814;
                if (var37.field3206 != null) {
                    var37 = var37.method1192(-1);
                }
                if (var37 != null) {
                    class87.field1348.method672(90, 238);
                    class83.field1263++;
                    class87.field1348.method753(var37.field3177, -242005080);
                }
            }
        }
        if (var7 == 57) {
            class129 var38 = class58.method404(var2, false, var3);
            if (var38 != null) {
                class252.method1658((byte) 86);
                class162.method1052(class1.method4(client.method266(var38), -701), 20864, var3, var2);
                class190.field3311 = 0;
                class19.field236 = class221.method1453(var38, -117);
                if (class19.field236 == null) {
                    class19.field236 = class191.field3335;
                }
                if (var38.field2258) {
                    class128.field2118 = class50.method347(2, new class168[] { var38.field2148, class143.field2514 });
                    return;
                }
                class128.field2118 = class50.method347(2, new class168[] { class167.field2850, var38.field2292, class143.field2514 });
            }
            return;
        }
        if (var7 == 29) {
            class58.field796++;
            boolean var39 = class88.method585(2, 0, var2, 0, 0, 0, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 0);
            if (!var39) {
                class88.method585(2, 0, var2, 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 1);
            }
            class163.field2792 = 2;
            class147.field2555 = 0;
            class214.field3703 = class9.field97;
            class57.field782 = class198.field3422;
            class87.field1348.method672(138, 238);
            class87.field1348.method753(var4, -242005080);
            class87.field1348.method753(class125.field2060 + var3, -242005080);
            class87.field1348.method753(class246.field4261 + var2, -242005080);
        }
        if (var7 == 39) {
            class87.field1348.method672(245, 238);
            class87.field1348.method745(-1529536968, var3);
            class87.field1348.method753(var2, -242005080);
            class87.field1349++;
            class87.field1348.method735((byte) 33, var4);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 127);
            class19.field232 = var2;
        }
        if (var7 == 1004) {
            class147.field2555 = 0;
            class63.field864++;
            class163.field2792 = 2;
            class57.field782 = class198.field3422;
            class214.field3703 = class9.field97;
            class87.field1348.method672(225, 238);
            class87.field1348.method735((byte) 33, var4);
        }
        if (var7 == 43) {
            class87.field1348.method672(214, 238);
            class2.field19++;
            class87.field1348.method775(26, var3);
            class87.field1348.method755(-122, var2);
            class87.field1348.method753(var4, -242005080);
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 126);
            class19.field232 = var2;
        }
        if (var7 == 31) {
            boolean var41 = class88.method585(2, 0, var2, 0, 0, 0, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 0);
            client.field547++;
            if (!var41) {
                class88.method585(2, 0, var2, 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var3, (byte) 26, 1);
            }
            class147.field2555 = 0;
            class57.field782 = class198.field3422;
            class214.field3703 = class9.field97;
            class163.field2792 = 2;
            class87.field1348.method672(93, 238);
            class87.field1348.method753(class125.field2060 + var3, -242005080);
            class87.field1348.method753(var4, -242005080);
            class87.field1348.method753(var2 + class246.field4261, -242005080);
        }
        if (var7 == 1002) {
            class43.field560++;
            class147.field2555 = 0;
            class57.field782 = class198.field3422;
            class163.field2792 = 2;
            class214.field3703 = class9.field97;
            class87.field1348.method672(82, 238);
            class87.field1348.method726(var4, (byte) 117);
        }
        if (var7 == 1003) {
            class129 var43 = class257.method1713(var3, 127);
            if (var43 == null || var43.field2221[var2] < 100000) {
                class87.field1348.method672(82, 238);
                class43.field560++;
                class87.field1348.method726(var4, (byte) 88);
            } else {
                class229.method1475(class222.field3816, class50.method347(2, new class168[] { class128.method867((byte) 112, var43.field2221[var2]), class79.field1190, class151.method1005(520, var4).field4167 }), -1, 0);
            }
            class133.field2331 = 0;
            class8.field93 = class257.method1713(var3, 126);
            class19.field232 = var2;
        }
        if (var7 == 30) {
            class121 var44 = class104.field1677[var4];
            if (var44 != null) {
                class88.method585(2, 0, var44.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var44.field219[0], (byte) 26, 1);
                class214.field3703 = class9.field97;
                class213.field3677++;
                class147.field2555 = 0;
                class163.field2792 = 2;
                class57.field782 = class198.field3422;
                class87.field1348.method672(6, 238);
                class87.field1348.method755(21, var4);
            }
        }
        if (var7 == 49) {
            class129 var45 = class257.method1713(var3, 126);
            boolean var46 = true;
            if (var45.field2136 > 0) {
                var46 = class60.method412(var45, -206);
            }
            if (var46) {
                class87.field1348.method672(174, 238);
                class87.field1348.method770(var3, (byte) -10);
                class255.field4417++;
            }
        }
        if (var7 == 14) {
            class121 var47 = class104.field1677[var4];
            if (var47 != null) {
                class88.method585(2, 0, var47.field206[0], 0, 0, 1, class7.field85.field206[0], false, class7.field85.field219[0], var47.field219[0], (byte) 26, 1);
                class57.field782 = class198.field3422;
                class214.field3703 = class9.field97;
                class163.field2792 = 2;
                class98.field1542++;
                class147.field2555 = 0;
                class87.field1348.method672(10, 238);
                class87.field1348.method755(48, var4);
            }
        }
        int var48 = 11 % ((68 - arg0) / 50);
        if (var7 == 10) {
            class87.field1348.method672(174, 238);
            class87.field1348.method770(var3, (byte) -10);
            class129 var49 = class257.method1713(var3, 126);
            class255.field4417++;
            if (var49.field2248 != null && var49.field2248[0][0] == 5) {
                int var50 = var49.field2248[0][1];
                if (class92.field1441[var50] != var49.field2280[0]) {
                    class92.field1441[var50] = var49.field2280[0];
                    class19.method100(var50, 123);
                }
            }
        }
        if (class190.field3311 != 0) {
            class190.field3311 = 0;
            method443(class257.method1713(class222.field3806, 127), 0);
        }
        if (class84.field1277) {
            class252.method1658((byte) 86);
        }
        if (class8.field93 != null && class133.field2331 == 0) {
            method443(class8.field93, 0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public static void method445(int arg0) {
        field919 = null;
        field922 = null;
        if (arg0 != 0) {
            method443(null, -85);
        }
        field910 = null;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(II)V")
    public abstract void method73(int arg0, int arg1);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIII)V")
    public abstract void method60(int arg0, int arg1, int arg2, int arg3);
}
