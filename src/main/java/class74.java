import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class74 extends class53 {

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    private int field1242 = 3072;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    private int field1237 = 2048;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    private int field1240 = 1024;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "Lwa;")
    public static class75 field1238 = class66.method560("Angreifen", false);

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "Z")
    public static boolean field1239 = true;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "Lwa;")
    private static class75 field1245 = class66.method560("", false);

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lwa;")
    public static class75 field1246 = class66.method560("Spieler kann nicht gefunden werden: ", false);

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "Lwa;")
    public static class75 field1234 = field1245;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lwa;")
    public static class75 field1248 = class66.method560("", false);

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V", line = 5)
    public final void method56(byte arg0) {
        this.field1237 = this.field1242 - this.field1240;
        field1241++;
        if (arg0 != -79) {
            method606(-18);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[I", line = 23)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            method606(-20);
        }
        field1247++;
        int[] var3 = this.field878.method1603(arg1, (byte) 127);
        if (this.field878.field3749) {
            int[] var4 = this.method391(0, 0, arg1);
            for (int var5 = 0; var5 < class269.field4644; var5++) {
                var3[var5] = (var4[var5] * this.field1237 >> 12) + this.field1240;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[[I", line = 56)
    public final int[][] method66(int arg0, int arg1) {
        int var3 = -65 / ((76 - arg1) / 42);
        field1235++;
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[][] var5 = this.method388(115, 0, arg0);
            int[] var6 = var5[2];
            int[] var7 = var5[0];
            int[] var8 = var5[1];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class269.field4644; var12++) {
                var9[var12] = (var7[var12] * this.field1237 >> 12) + this.field1240;
                var10[var12] = (var8[var12] * this.field1237 >> 12) + this.field1240;
                var11[var12] = this.field1240 + (var6[var12] * this.field1237 >> 12);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lcb;BI)Lqj;", line = 104)
    public static final class238 method605(class267 arg0, byte arg1, int arg2) {
        field1233++;
        if (class275.method1958(arg2, arg0, 0)) {
            if (arg1 > -41) {
                method605((class267) null, (byte) -77, 112);
            }
            return class113.method871((byte) -110);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V", line = 143)
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V", line = 149)
    public static void method606(int arg0) {
        field1248 = null;
        int var1 = -124 / ((12 - arg0) / 50);
        field1246 = null;
        field1245 = null;
        field1234 = null;
        field1238 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lre;B)Z", line = 167)
    public static final boolean method607(class262 arg0, byte arg1) {
        if (arg1 != -126) {
            method605((class267) null, (byte) 43, 53);
        }
        field1249++;
        if (arg0.field4462 == 205) {
            class26.field346 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(JZ)V", line = 188)
    public static final void method608(long arg0, boolean arg1) {
        field1244++;
        if (!arg1) {
            method608(85L, true);
        }
        if (arg0 != 0L) {
            class89.field1470.method87(65280, 103);
            class89.field1470.method514(30009, arg0);
            class255.field4279++;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILja;Z)V", line = 210)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field1236++;
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            this.field1240 = arg1.method485((byte) -2);
        } else if (arg0 == 1) {
            this.field1242 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field880 = arg1.method501(0) == 1;
        }
    }
}
