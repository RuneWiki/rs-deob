import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class241 extends class141 {

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public int field4173 = 0;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Lam;")
    public static class277 field4174 = new class277();

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "Lhi;")
    public static class82 field4188 = class95.method664((byte) -80, "Titelbild geladen)3");

    @OriginalMember(owner = "client!fi", name = "N", descriptor = "Lhi;")
    private static class82 field4194 = class95.method664((byte) -116, "Loading sprites )2 ");

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
    public static int field4186 = 0;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "Lhi;")
    public static class82 field4182 = field4194;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!fi", name = "M", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!fi", name = "O", descriptor = "I")
    public int field4195;

    @OriginalMember(owner = "client!fi", name = "P", descriptor = "I")
    public int field4196;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "Lom;")
    public class157 field4183;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "Lnl;")
    public class239 field4181;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "Lnl;")
    public class239 field4187;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "Leb;")
    public class275 field4191;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Lsa;")
    public class81 field4177;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "Z")
    public boolean field4170;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "[I")
    public int[] field4168;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V", line = 31)
    public static final void method1727(boolean arg0) {
        field4189++;
        if (!class123.method841(arg0) && class297.field5058 != class287.field4826) {
            class192.method1336(class168.field2932.field1723[0], -125, class260.field4465, class297.field5058, false, class168.field2932.field1720[0], class126.field2215);
        } else if (class297.field5058 != class138.field2377) {
            class138.field2377 = class297.field5058;
            class198.method1383(class297.field5058, (byte) 115);
            class43.method325(18916);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)Z", line = 54)
    public static final boolean method1728(int arg0, int arg1) {
        field4190++;
        if (arg1 != -18195) {
            field4182 = (class82) null;
        }
        return (arg0 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IJ)V", line = 66)
    public static final void method1729(int arg0, long arg1) {
        field4169++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class90.field1632 < 100 || class86.field1534) || class90.field1632 >= 200) {
            class200.method1406(class129.field2247, 0, class259.field4435, 4);
            return;
        }
        int var3 = 8 % ((arg0 - 33) / 58);
        class82 var4 = class56.method388(arg1, 0).method553((byte) -81);
        for (int var5 = 0; var5 < class90.field1632; var5++) {
            if (class107.field1903[var5] == arg1) {
                class200.method1406(class129.field2247, 0, class29.method182(-6039, new class82[] { var4, class133.field2292 }), 4);
                return;
            }
        }
        for (int var6 = 0; var6 < class171.field2964; var6++) {
            if (class144.field2458[var6] == arg1) {
                class200.method1406(class129.field2247, 0, class29.method182(-6039, new class82[] { class308.field5256, var4, class209.field3675 }), 4);
                return;
            }
        }
        if (var4.method534(-80, class168.field2932.field1409)) {
            class200.method1406(class129.field2247, 0, class92.field1644, 4);
            return;
        }
        class142.field2436++;
        class222.field3882[class90.field1632] = var4;
        class107.field1903[class90.field1632] = arg1;
        class139.field2386[class90.field1632] = 0;
        class198.field3390[class90.field1632] = class129.field2247;
        class317.field5436[class90.field1632] = 0;
        class160.field2780[class90.field1632] = false;
        class232.field4012 = class157.field2726;
        class90.field1632++;
        class61.field957.method1504(198, -1);
        class61.field957.method1057((byte) 43, arg1);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BIILum;)Ljf;", line = 140)
    public static final class86 method1730(byte arg0, int arg1, int arg2, class222 arg3) {
        field4171++;
        if (client.method866(arg2, arg1, (byte) 49, arg3)) {
            return arg0 >= -55 ? (class86) null : class171.method1209(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 161)
    public static final void method1731(int arg0) {
        class86.field1537.method1431(arg0 ^ 0xFFFFFF7E);
        class315.field5422 = null;
        if (arg0 != 128) {
            method1730((byte) -10, -50, -24, (class222) null);
        }
        class77.field1324 = 1;
        field4179++;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V", line = 177)
    public final void method1732(byte arg0) {
        int var2 = this.field4178;
        field4176++;
        if (this.field4183 != null) {
            class157 var5 = this.field4183.method1119((byte) 122);
            if (var5 == null) {
                this.field4172 = 0;
                this.field4195 = 0;
                this.field4178 = -1;
                this.field4168 = null;
                this.field4185 = 0;
            } else {
                this.field4168 = var5.field2733;
                this.field4172 = var5.field2685 * 128;
                this.field4195 = var5.field2720;
                this.field4178 = var5.field2738;
                this.field4185 = var5.field2671;
            }
        } else if (this.field4191 != null) {
            int var3 = class195.method1360(this.field4191, -1308789364);
            if (var2 != var3) {
                this.field4178 = var3;
                class233 var4 = this.field4191.field4628;
                if (var4.field4063 != null) {
                    var4 = var4.method1652(false);
                }
                if (var4 == null) {
                    this.field4172 = 0;
                } else {
                    this.field4172 = var4.field4032 * 128;
                }
            }
        } else if (this.field4177 != null) {
            this.field4178 = class23.method155(this.field4177, false);
            this.field4172 = this.field4177.field1370 * 128;
        }
        int var6 = -48 / ((-arg0 - 49) / 41);
        if (this.field4178 != var2 && this.field4181 != null) {
            class219.field3803.method882(this.field4181);
            this.field4181 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V", line = 251)
    public static void method1733(int arg0) {
        field4182 = null;
        field4188 = null;
        field4194 = null;
        if (arg0 <= 16) {
            field4186 = 21;
        }
        field4174 = null;
    }
}
