import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class242 extends class12 {

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public int field4216 = 0;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field4210 = 0;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "Lvf;")
    public static class265 field4226 = class87.method582(-46, ")2");

    @OriginalMember(owner = "client!n", name = "N", descriptor = "Lvf;")
    public static class265 field4228 = class87.method582(-46, " weitere Optionen");

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lfd;")
    public static class207 field4204 = new class207(128);

    @OriginalMember(owner = "client!n", name = "P", descriptor = "Lvf;")
    public static class265 field4230 = class87.method582(-46, ")1o");

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field4231 = 0;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public int field4207;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public int field4209;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "Lnc;")
    public class122 field4218;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "Lwb;")
    public class130 field4222;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lii;")
    public class180 field4203;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "Lii;")
    public class180 field4217;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Lsd;")
    public class23 field4205;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "Z")
    public boolean field4227;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
    public int[] field4212;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "[I")
    public static int[] field4224;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public static final void method1612(int arg0, int arg1, int arg2) {
        class193.field3478 = true;
        class134.field2411 = arg0;
        class262.field4573 = arg1;
        class7.field264 = arg2;
        class127.field2267 = -1;
        class179.field3183 = -1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(III)Lvk;")
    public static final class144 method1613(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2518;
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public final void method1614(int arg0) {
        field4215++;
        int var2 = this.field4208;
        if (this.field4222 != null) {
            class130 var5 = this.field4222.method861(-25233);
            if (var5 == null) {
                this.field4214 = 0;
                this.field4207 = 0;
                this.field4212 = null;
                this.field4225 = 0;
                this.field4208 = -1;
            } else {
                this.field4225 = var5.field2348;
                this.field4207 = var5.field2293 * 128;
                this.field4214 = var5.field2288;
                this.field4208 = var5.field2352;
                this.field4212 = var5.field2298;
            }
        } else if (this.field4205 != null) {
            int var3 = class166.method1091(95, this.field4205);
            if (var2 != var3) {
                this.field4208 = var3;
                class268 var4 = this.field4205.field681;
                if (var4.field4755 != null) {
                    var4 = var4.method1825(20656);
                }
                if (var4 == null) {
                    this.field4207 = 0;
                } else {
                    this.field4207 = var4.field4760 * 128;
                }
            }
        } else if (this.field4218 != null) {
            this.field4208 = class267.method1819(this.field4218, (byte) 127);
            this.field4207 = this.field4218.field2166 * 128;
        }
        if (this.field4208 != var2 && this.field4203 != null) {
            class49.field1039.method1660(this.field4203);
            this.field4203 = null;
        }
        if (arg0 > -94) {
            field4226 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
    public static final boolean method1615(int arg0, int arg1) {
        int var2 = -84 % ((66 - arg1) / 41);
        field4213++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)V")
    public static void method1616(int arg0) {
        if (arg0 > -105) {
            field4228 = null;
        }
        field4204 = null;
        field4226 = null;
        field4224 = null;
        field4228 = null;
        field4230 = null;
    }
}
