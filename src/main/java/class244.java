import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class244 extends class259 {

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    private int field4351 = 0;

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "I")
    private int field4357 = 20;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    private int field4354 = 0;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    private int field4362 = 1365;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "Lsg;")
    public static class30 field4360 = class167.method1221((byte) 33, "Weiter");

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Lof;")
    public static class197 field4352 = class245.method1724(26440);

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "[Lrd;")
    public static class142[] field4369 = new class142[50];

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "Lsg;")
    public static class30 field4368 = class167.method1221((byte) 33, " <col=00ff80>");

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "Lsg;")
    public static class30 field4364 = class167.method1221((byte) 33, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "Lmc;")
    public static class151 field4370;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "Lkb;")
    public static class27 field4356;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "[Loe;")
    public static class105[] field4366;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "[Ldl;")
    public static class31[] field4363;

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "[[[B")
    public static byte[][][] field4367;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "[[[Lne;")
    public static class195[][][] field4365;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lmc;B)V")
    public static final void method1719(class151 arg0, byte arg1) {
        class227.field4055 = arg0;
        ++field4355;
        if (arg1 < 28) {
            field4366 = null;
        }
        class200.field3574 = class227.field4055.method1124(4, -19);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    public class244() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(BI)Z")
    public static final boolean method1720(byte arg0, int arg1) {
        ++field4358;
        class205 var2 = class103.method831(-17028, arg1);
        if (var2 == null) {
            return false;
        } else if (~class66.field1459 != -2 && class66.field1459 != 2 && class148.field2832 != 2) {
            class30 var4 = class148.field2827;
            if (class148.field2832 != 0) {
                var4 = class160.method1188(new class30[] { class1.field15, class73.method675(-12, var2.field3673 + 7000) }, 0);
            }
            class30 var5 = class148.field2827;
            if (class219.field3963 != null) {
                var5 = class160.method1188(new class30[] { class98.field1982, class219.field3963 }, 0);
            }
            class30 var6 = class160.method1188(new class30[] { class259.field4576, var2.field3669, var4, class145.field2781, class73.method675(-124, class220.field3971), class32.field816, class73.method675(112, class197.field3563), var5, class182.field3344, !class40.field991 ? class159.field2997 : class236.field4228, class202.field3598, !class257.field4532 ? class159.field2997 : class236.field4228, class151.field2899, !class197.field3566 ? class159.field2997 : class236.field4228 }, 0);
            try {
                if (arg0 <= 63) {
                    return true;
                } else {
                    class224.field4013.getAppletContext().showDocument(var6.method277((byte) 44), "_self");
                    return true;
                }
            } catch (Exception var7) {
                return false;
            }
        } else {
            byte[] var3 = var2.field3669.method261(-1);
            class197.field3564 = new String(var3, 0, var3.length);
            class200.field3579 = var2.field3673;
            if (class148.field2832 != 0) {
                class241.field4309 = class200.field3579 + 40000;
                class101.field2056 = class241.field4309;
                class135.field2637 = class200.field3579 + 50000;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field4361;
        if (arg1) {
            method1720((byte) -7, 116);
        }
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            for (int var4 = 0; class223.field3999 > var4; ++var4) {
                int var5 = (class29.field558[var4] << 12) / this.field4362 + this.field4351;
                int var6 = (class154.field2910[arg0] << 12) / this.field4362 + this.field4354;
                int var7 = var5;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 - -var12 < 16384 && var13 < this.field4357) {
                    ++var13;
                    var9 = (var8 * var9 >> 12) * 2 - -var10;
                    var8 = var11 - (-var7 + var12);
                    var11 = var8 * var8 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = var13 < this.field4357 + -1 ? (var13 << 12) / this.field4357 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        ++field4353;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field4354 = arg2.method65((byte) 122);
                    }
                } else {
                    this.field4351 = arg2.method65((byte) 123);
                }
            } else {
                this.field4357 = arg2.method65((byte) 119);
            }
        } else {
            this.field4362 = arg2.method65((byte) 112);
        }
        if (arg1 != -1586849108) {
            this.method4(66, -75, (class8) null);
        }
    }

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "(I)V")
    public static final void method1721(int arg0) {
        if (arg0 > 35) {
            ++field4359;
            if (!class81.method703(-15861) && ~class159.field2998 != ~class109.field2191) {
                class266.method1825(class100.field2054, class159.field2998, false, class247.field4394.field1372[0], class247.field4394.field1349[0], 0, class202.field3611);
            } else if (class86.field1769 != class159.field2998) {
                class86.field1769 = class159.field2998;
                class29.method244(-109, class159.field2998);
                class168.method1230((byte) 41);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "(I)V")
    public static void method1722(int arg0) {
        field4360 = null;
        field4366 = null;
        field4363 = null;
        int var1 = 123 / ((-1 - arg0) / 47);
        field4364 = null;
        field4352 = null;
        field4370 = null;
        field4367 = null;
        field4365 = null;
        field4369 = null;
        field4368 = null;
        field4356 = null;
    }
}
