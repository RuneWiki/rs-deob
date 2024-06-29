import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class302 extends class271 {

    @OriginalMember(owner = "client!oi", name = "W", descriptor = "Lwa;")
    private class75 field5177 = class200.field3389;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "Lwa;")
    private static class75 field5162 = class66.method560("scroll:", false);

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "Lwa;")
    public static class75 field5166 = field5162;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field5163 = 0;

    @OriginalMember(owner = "client!oi", name = "X", descriptor = "Lwa;")
    public static class75 field5178 = field5162;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!oi", name = "B", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "I")
    private int field5158;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public static int field5169;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!oi", name = "V", descriptor = "I")
    public int field5176;

    @OriginalMember(owner = "client!oi", name = "Y", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "Lvd;")
    public class126 field5159;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "Lvd;")
    private class126 field5160;

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "Lre;")
    public static class262 field5175;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "Lcb;")
    public static class267 field5172;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "[Lmm;")
    public static class243[] field5164;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILwa;)Z", line = 6)
    public final boolean method2074(int arg0, class75 arg1) {
        if (arg0 != 5) {
            this.method2077(-119);
        }
        field5170++;
        if (this.field5159 == null) {
            return false;
        }
        if (this.field5160 == null) {
            this.method2080((byte) 124);
        }
        for (class10 var3 = (class10) this.field5160.method1007(arg1.method648(false), -17004); var3 != null; var3 = (class10) this.field5160.method1010(0)) {
            if (var3.field130.method660(arg1, arg0 - 129)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V", line = 44)
    public static final void method2075(int arg0, int arg1) {
        class126.field2188--;
        field5156++;
        if (class126.field2188 == arg1) {
            return;
        }
        class231.method1688(class272.field4692, arg1 + 1, class272.field4692, arg1, class126.field2188 - arg1);
        class231.method1688(class94.field1521, arg1 + 1, class94.field1521, arg1, class126.field2188 - arg1);
        class231.method1692(class99.field1646, arg1 + 1, class99.field1646, arg1, class126.field2188 - arg1);
        class231.method1685(class86.field1417, arg1 + 1, class86.field1417, arg1, class126.field2188 - arg1);
        class231.method1689(class171.field2884, arg0 + arg1, class171.field2884, arg1, class126.field2188 - arg1);
        class231.method1689(class16.field216, arg1 + 1, class16.field216, arg1, class126.field2188 - arg1);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZ)Lwa;", line = 67)
    public final class75 method2076(int arg0, boolean arg1) {
        field5171++;
        if (this.field5159 == null) {
            return this.field5177;
        } else if (arg1) {
            return (class75) null;
        } else {
            class111 var3 = (class111) this.field5159.method1007((long) arg0, -17004);
            return var3 == null ? this.field5177 : var3.field1893;
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V", line = 87)
    private final void method2077(int arg0) {
        this.field5160 = new class126(this.field5159.method1002((byte) -100));
        if (arg0 != -23166) {
            field5166 = (class75) null;
        }
        for (class8 var2 = (class8) this.field5159.method1001((byte) 33); var2 != null; var2 = (class8) this.field5159.method1009(arg0 + 23038)) {
            class8 var3 = new class8((int) var2.field3488);
            this.field5160.method1004((byte) 73, (long) var2.field109, var3);
        }
        field5174++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILwa;Z)V", line = 112)
    public static final void method2078(int arg0, class75 arg1, boolean arg2) {
        if (arg0 > -74) {
            method2078(-64, (class75) null, true);
        }
        field5157++;
        if (!arg2) {
            try {
                class212.field3613.getAppletContext().showDocument(arg1.method658(class212.field3613.getCodeBase(), 0), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class136.field2327) {
            try {
                class1.method2(class210.field3585.field2072, "openjs", new Object[] { arg1.method658(class212.field3613.getCodeBase(), 0).toString() }, 100);
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class212.field3613.getAppletContext().showDocument(arg1.method658(class212.field3613.getCodeBase(), 0), "_blank");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "(I)V", line = 154)
    public static void method2079(int arg0) {
        field5166 = null;
        field5175 = null;
        if (arg0 != -2) {
            method2082(31, -64);
        }
        field5162 = null;
        field5172 = null;
        field5164 = null;
        field5178 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 174)
    private final void method2080(byte arg0) {
        this.field5160 = new class126(this.field5159.method1002((byte) 84));
        for (class111 var2 = (class111) this.field5159.method1001((byte) 33); var2 != null; var2 = (class111) this.field5159.method1009(-128)) {
            class10 var3 = new class10(var2.field1893, (int) var2.field3488);
            this.field5160.method1004((byte) 73, var2.field1893.method648(false), var3);
        }
        int var4 = -74 / ((49 - arg0) / 55);
        field5169++;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)Z", line = 197)
    public final boolean method2081(int arg0, int arg1) {
        field5167++;
        if (this.field5159 == null) {
            return false;
        }
        if (this.field5160 == null) {
            this.method2077(-23166);
        }
        class8 var3 = (class8) this.field5160.method1007((long) arg1, -17004);
        if (var3 == null) {
            return false;
        } else {
            return arg0 == -5;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)Lhj;", line = 221)
    public static final class28 method2082(int arg0, int arg1) {
        field5179++;
        class28 var2 = (class28) class67.field1168.method1193((long) arg0, 112);
        if (var2 != null) {
            return var2;
        }
        if (arg1 < 1) {
            method2079(-85);
        }
        byte[] var3 = class233.field3949.method1911(class235.method1712(-1004767097, arg0), class152.method1167(-76, arg0), -65);
        class28 var4 = new class28();
        if (var3 != null) {
            var4.method184(new class60(var3), (byte) 58);
        }
        var4.method186((byte) 94);
        class67.field1168.method1194(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(IZ)I", line = 249)
    public final int method2083(int arg0, boolean arg1) {
        field5161++;
        if (this.field5159 == null) {
            return this.field5158;
        }
        if (!arg1) {
            field5178 = (class75) null;
        }
        class8 var3 = (class8) this.field5159.method1007((long) arg0, -17004);
        return var3 == null ? this.field5158 : var3.field109;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILja;)V", line = 279)
    public final void method2084(int arg0, class60 arg1) {
        field5173++;
        while (true) {
            int var3 = arg1.method501(0);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.method2084(52, (class60) null);
                }
                return;
            }
            this.method2085(arg1, 124, var3);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lja;II)V", line = 318)
    private final void method2085(class60 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field5165 = arg0.method501(0);
        } else if (arg2 == 2) {
            this.field5176 = arg0.method501(0);
        } else if (arg2 == 3) {
            this.field5177 = arg0.method532(-1);
        } else if (arg2 == 4) {
            this.field5158 = arg0.method505(255);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method485((byte) -2);
            this.field5159 = new class126(class118.method904(1440830960, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method505(255);
                class206 var7;
                if (arg2 == 5) {
                    var7 = new class111(arg0.method532(-1));
                } else {
                    var7 = new class8(arg0.method505(255));
                }
                this.field5159.method1004((byte) 73, (long) var6, var7);
            }
        }
        field5168++;
        if (arg1 < 111) {
            this.field5177 = (class75) null;
        }
    }
}
